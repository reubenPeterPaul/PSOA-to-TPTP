/* This is a grammar file for PSOA RuleML. Use ANTLR 2.7.x to generate 
 * the parser code.
 */

grammar RuleMLPresentationSyntax;

options
{
    output = AST;
    k = 1;
    ASTLabelType = CommonTree;
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

@members
{
    private DefaultAbstractSyntax syntax = new DefaultAbstractSyntax();
}

top_level_item : document? EOF;

document
    :   DOCUMENT LPAR base? prefix* importDecl* group? RPAR
        -> ^(DOCUMENT base? ^(PREFIXES prefix*) ^(IMPORTS importDecl*) group?)
        /*{
            
        }*/
    ;

base returns [AbstractSyntax.Base _base]
    :   BASE LPAR IRI_REF RPAR
        {
             $base._base = syntax.createBase($IRI_REF.text);
        }
    ;

prefix returns [AbstractSyntax.Prefix _prefix]
    :   PREFIX LPAR ID IRI_REF RPAR
        {
           AbstractSyntax.Name name = syntax.createName($ID.text);
           $prefix._prefix = syntax.createPrefix(name, $IRI_REF.text);
        }
    ;

importDecl 
    :   IMPORT LPAR kb=IRI_REF (profile=IRI_REF)? RPAR
        -> ^(IMPORT $kb $profile?)
    ;

group//returns [AbstractSyntax.Group group]
    :
        GROUP LPAR group_element* RPAR
        -> ^(GROUP ^(GROUP_ELEM_LIST group_element*))
        /*{
            
        }*/
    ;

group_element
    :   rule //{ return $result; }
    |   group //{ return $result; }
    ;

rule //returns AbstractSyntax.Rule
    :   FORALL VAR_ID+ LPAR clause RPAR
        -> ^(FORALL ^(VAR_LIST VAR_ID+) clause)
        /*{
          
        }*/
    |   clause //{  }
    ;

clause
    :   f1=formula (IMPLICATION f2=formula)?
    ;

formula
    :   AND LPAR formula* RPAR
    |   OR LPAR formula* RPAR
    |   EXISTS VAR_ID+ LPAR formula* RPAR
    |   atomic
    ;
    
atomic
    :   term atom_rest?
    ;

atom_rest
    :   '=' term
    |   '##' term
    ;

term
    :   non_psoa_term psoa_rest*
    ;

non_psoa_term
    :   simple_term
    |   external_term
    ;

simple_term
    :   constant
    |   VAR_ID
    ;

external_term
    :   EXTERNAL LPAR term RPAR
    ;

psoa
    :   non_psoa_term psoa_rest+
    ;

psoa_rest
    :   (INSTANCE non_psoa_term)? LPAR (tuples_and_slots?) RPAR
//    :   INSTANCE term LPAR (tuple* slot*) RPAR
    ;

tuples_and_slots
    :   tuple+ slot*
    |   term+ (SLOT_ARROW term slot*)? // Syntactic sugar for psoa terms which has only one tuple
    ;

tuple
    :   LSQBR term* RSQBR
//        -> ^(TUPLE term*)
    ;  

slot
    :
        name=term SLOT_ARROW value=term
//        -> ^(SLOT $name $value)
    ;

/*
**  The rule of constant strings can be rewrited to
**  Const ::= '"' UNICODESTRING '"' (^^ SYMSPACE))? | '"' UNICODESTRING '"@' langtag)? | CURIE | NumericLiteral | '_' NCName | IRI_REF
**  Symbol STRING_CONSTANT is introduced to capture the first branch.
*/
constant
    :   STRING_CONSTANT
    |   CURIE
    |   ID    // Number, _NCNAME
    |   IRI_REF
    ;

/*
clause
    :  (implies) => implies -> implies
    |   atomic -> atomic
    ;

implies
    :   head_conjunction
        IMPLICATION
        formula
        -> ^(IMPLICATION head_conjunction formula)
    ;

head_conjunction  
    :   head -> ^(AND head)
    |   AND LPAR head* RPAR 
        -> ^(AND head*)
    ;

head
    :   EXISTS VAR_ID+ LPAR atomic RPAR
        -> ^(EXISTS ^(VAR_LIST VAR_ID+) atomic)
    |   atomic -> atomic
    ;
    
atomic
    :   equal -> equal
    |   subclass -> subclass
    |   atom -> atom {  }
    ; 

atom
    :   psoa -> psoa {  }
    ;

equal 
    : lhs=term EQUAL rhs=term
      -> ^(EQUAL $lhs $rhs)
    ;

subclass
    : sub=term SUBCLASS sup=term
      -> ^(SUBCLASS $sub $sup)
    ;

psoa
    :   term INSTANCE term LPAR tuple* slot* RPAR
    ;
    
term
    :   constant -> constant
    |   VAR_ID -> ^(VAR VAR_ID)
    |   psoa -> psoa
    ;
    
closed_term
    :
       constant -> constant
    |
        VAR_ID -> ^(VAR VAR_ID)
    |
        LPAR term RPAR -> term

    |
        external

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
    :   const_literal -> const_literal
    |   const_constshort -> const_constshort
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
    ; */

//--------------------- LEXER: -----------------------
// Comments and whitespace:
WHITESPACE  :  (' '|'\t'|'\r'|'\n')+ { $channel = HIDDEN; } ;
MULTI_LINE_COMMENT :  '<!--' (options {greedy=false;} : .* ) '-->' { $channel=HIDDEN; } ;

// Keywords:
DOCUMENT : 'Document' ;
BASE : 'Base' ;
IMPORT : 'Import' ;
PREFIX : 'Prefix' ;
GROUP : 'Group' ;
FORALL : 'Forall' ;
EXISTS : 'Exists' ;
AND : 'And' ;
OR : 'Or' ;
EXTERNAL : 'External';

//  Constants:
//  Complete and abbreviated string constant
STRING_CONSTANT
    : STRING (SYMSPACE_OPER (IRI_REF | CURIE))?
    ;
    
CURIE : ID? ':' ID?;
fragment STRING : '"' (options {greedy=false;} : ~('"' | '\\' | EOL) | ECHAR)* '"';

//  Identifiers:
IRI_REF : '<' IRI_START_CHAR (IRI_CHAR)+ '>' ;
VAR_ID : '?' ID? ;
//  In the slots a hyphen may appear directly after a term, so we should not allow hyphen to be the end of a term
//  ID : ID_START_CHAR ((ID_CHAR | '-')* ID_CHAR)? ;
ID : ID_START_CHAR ID_CHAR* ;

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

//  Basics
fragment ALPHA : 'a'..'z' | 'A'..'Z' ;
fragment DIGIT : '0'..'9' ;
fragment IRI_CHAR : ALPHA | DIGIT | '+' | '-' | '.' | '@' | ':' | '_' | '~' | '%' | '!' |  '$' | '&' | '\'' | '(' | ')' | '*' | ',' | ';' | '=' | '?' | '#' | '/';

// Currently, these are only URI characters. The set has to be extended
// to include all IRI characters.
fragment IRI_START_CHAR : ALPHA ;

fragment ID_CHAR
    : ID_START_CHAR
    | '\u00B7'           // as in the SPARQL 1.1 grammar
    | '\u203F'..'\u2040' // as in the SPARQL 1.1 grammar
  //| '-'
  //| ':'
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