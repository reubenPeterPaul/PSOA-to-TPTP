/* This is a grammar file for PSOA RuleML. Use ANTLR 2.7.x to generate 
 * the parser code.
 */


grammar RuleMLPresentationSyntax;

options
{
    output = AST;
    //backtrack=true; 
    // Potential performance problem! 
    // See http://www.antlr.org/wiki/display/ANTLR3/How+to+remove+global+backtracking+from+your+grammar
 
}

tokens 
{
    PREFIXES;
    IMPORTS;
    GROUP_ELEM_LIST;
    VAR_LIST;
    TUPLE;
    SLOT;
    VAR;
    LITERAL;
    PSOA;
    TUPLES;
    SLOTS;
}

@header
{
package org.ruleml.api.presentation_syntax_parser;

import org.ruleml.api.*;

}

@lexer::header {
    package org.ruleml.api.presentation_syntax_parser;
}


top_level_item 
    : document
    | EOF 
    ;


base 
returns [AbstractSyntax.Base result]
    :
        BASE LPAR IRI_REF RPAR
        -> ^(BASE IRI_REF)
    ;


prefix
    :
        PREFIX LPAR ID IRI_REF RPAR -> ^(PREFIX ID IRI_REF)
    ;



importDecl 
    :
        IMPORT LPAR kb=IRI_REF (profile=IRI_REF)? RPAR
        -> ^(IMPORT $kb $profile?)
    ;



document  
    : 
        DOCUMENT 
        LPAR
        base?
        prefix*
        importDecl*
        group?
        RPAR
        -> ^(DOCUMENT base? ^(PREFIXES prefix*) ^(IMPORTS importDecl*) group?)
    ;



group 
    :
        GROUP 
        LPAR 
        group_element*
        RPAR
        -> ^(GROUP ^(GROUP_ELEM_LIST group_element*))
    ;




group_element 
    :
        rule -> rule
    |
        group -> group
    ;

rule 
    :
        FORALL 
        VAR_ID+
        LPAR
        clause
        RPAR
        -> ^(FORALL ^(VAR_LIST VAR_ID+) clause)
    |
        clause -> clause
    ;



clause 
    :
       (implies) => implies -> implies
    |
        atomic -> atomic
    ;


implies 
    :
        head_conjunction
        IMPLICATION
        formula
        -> ^(IMPLICATION head_conjunction formula)
    ;


head_conjunction  
    :
        head -> ^(AND head)
    |
        AND
        LPAR
        head*
        RPAR 
        -> ^(AND head*)
    ;


head 
    :
        EXISTS 
        VAR_ID+
        LPAR
        atomic
        RPAR
        -> ^(EXISTS ^(VAR_LIST VAR_ID+) atomic)
    |
        atomic -> atomic
    ;



atomic 
    :
        (equal) => equal -> equal
    |
        (subclass) => subclass -> subclass
    |
        atom -> atom
    ;


atom 
    :
        psoa -> psoa

    ;




equal 
    :
      lhs=closed_term
      EQUAL   
      rhs=closed_term
      -> ^(EQUAL $lhs $rhs) 
    ;  





subclass 
    :
      sub=closed_term
      SUBCLASS     
      sup=closed_term
      -> ^(SUBCLASS $sub $sup)
    ;  



tuple  
    : 
        LSQBR 
        term*
        RSQBR
        -> ^(TUPLE term*)
    ;  



slot 
    :
      name=term
      SLOT_ARROW     
      value=term
      -> ^(SLOT $name $value)
    ;  



closed_term 
    :
       constant -> constant
    |
        VAR_ID -> ^(VAR VAR_ID)
    |
        LPAR term RPAR -> term
/*
    |
        external
*/
    ;

term 
    :
        (psoa) => psoa -> psoa
    |
       closed_term -> closed_term
    ;


psoa 
    :
        obj=closed_term
        (INSTANCE kl=closed_term)?
        LPAR
        tuple*
        slot*
        RPAR
        -> 
        ^(PSOA $obj $kl? ^(TUPLES tuple*) ^(SLOTS slot*))
    ;  


constant 
    :
        const_literal -> const_literal
    |
        const_constshort -> const_constshort
    ;



const_literal 
    :
        STRING 
        SYMSPACE_OPER
        symspace
        -> ^(LITERAL STRING symspace)
    ;
    
const_constshort  
    :
        ID // temporary, has to be refined
    ;



symspace 
   : IRI_REF
    | ID
    ;
 
 


formula 
    : ID 
    ;
        
//--------------------- LEXER: -----------------------
            



//   Comments and whitespace:



WHITESPACE  :  (' '|'\t''\n'|'\r')+ {skip();} ;

MULTI_LINE_COMMENT :  '<!--' (options {greedy=false;} : .* ) '-->' {$channel=HIDDEN; } ;


// Keywords:


DOCUMENT : 'Document' ; 

BASE : 'Base' ; 

IMPORT : 'Import' ; 

PREFIX : 'Prefix' ; 

GROUP : 'Group' ; 

FORALL : 'Forall' ; 

EXISTS : 'Exists' ; 

AND : 'And' ; 



//   Identifiers:

IRI_REF : '<' IRI_START_CHAR (IRI_CHAR)+ '>' ;


ID : ID_START_CHAR (ID_CHAR)* ; 

VAR_ID : '?' (ID_CHAR)* ; 

//   Constants:

STRING : '"' (options {greedy=false;} : ~('"' | '\\' | EOL) | ECHAR)* '"';


//   Operators:
IMPLICATION : ':-';
EQUAL : '=';
SUBCLASS : '##';
INSTANCE : '#';
SLOT_ARROW : '->';
SYMSPACE_OPER : '^^';


//   Punctuation:
LPAR : '(' ;
RPAR : ')' ;
LESS : '<' ;
GREATER : '>' ;
LSQBR : '[' ;
RSQBR : ']' ;
//QUESTION_MARK : '?' ;





//  Basics

fragment ALPHA : 'a'..'z' | 'A'..'Z' ;

fragment DIGIT : '0'..'9' ;


fragment IRI_CHAR : ALPHA | DIGIT | '+' | '-' | '.' | '@' | ':' | '_' | '~' | '%' | '!' |  '$' | '&' | '\'' | '(' | ')' | '*' | ',' | ';' | '=' | '?' | '#' | '/';
// Currently, these are only URI characters. The set has to be extended
// to include all IRI characters.


fragment IRI_START_CHAR : ALPHA ;


fragment ID_CHAR
    : ALPHA
    | '\u00C0'..'\u00D6'
    | '\u00D8'..'\u00F6'
    | '\u00F8'..'\u02FF'
    | '\u0370'..'\u037D'
    | '\u037F'..'\u1FFF'
    | '\u200C'..'\u200D'
    | '\u2070'..'\u218F'
    | '\u2C00'..'\u2FEF'
    | '\u3001'..'\uD7FF'
    | '\uF900'..'\uFDCF'
    | '\uFDF0'..'\uFFFD'
    | DIGIT
    | '_'
    | '-'
    | '\u00B7'           // as in the SPARQL 1.1 grammar
    | '\u203F'..'\u2040' // as in the SPARQL 1.1 grammar
    | ':'
    | '.' 
    ;



fragment ID_START_CHAR 
    : ALPHA
    | '\u00C0'..'\u00D6'
    | '\u00D8'..'\u00F6'
    | '\u00F8'..'\u02FF'
    | '\u0370'..'\u037D'
    | '\u037F'..'\u1FFF'
    | '\u200C'..'\u200D'
    | '\u2070'..'\u218F'
    | '\u2C00'..'\u2FEF'
    | '\u3001'..'\uD7FF'
    | '\uF900'..'\uFDCF'
    | '\uFDF0'..'\uFFFD'
    | DIGIT
    | '_'
    ;

fragment ECHAR : '\\' ('t' | 'b' | 'n' | 'r' | 'f' | '\\' | '"' | '\'');

fragment EOL : '\n' | '\r';


