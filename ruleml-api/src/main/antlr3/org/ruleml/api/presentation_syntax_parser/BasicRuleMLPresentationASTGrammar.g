tree grammar BasicRuleMLPresentationASTGrammar;

options 
{
	ASTLabelType = CommonTree;
	tokenVocab = RuleMLPresentationSyntax;
	k = 1;
} 

@header
{
	package org.ruleml.api.presentation_syntax_parser;
	
	import static cs6795.group2.PSOATranslatorUtil.*;
}

@members
{

}
document
    : ^(DOCUMENT base? prefix* importDecl* group?)
    ;

base
    :   ^(BASE IRI_REF)
    ;

prefix 
    :   ^(PREFIX ID IRI_REF)
    ;

importDecl 
    :   ^(IMPORT IRI_REF IRI_REF?)
    ;

group
    :   ^(GROUP group_element*)
    ;

group_element
    :   rule
    |   group
    ;

rule
    :   ^(FORALL ^(VAR_LIST VAR_ID+) clause)
	|   clause
    ;

clause
    :   ^(IMPLICATION head formula)
    |   atomic
    ;
    
head
    :   atomic
    |   ^(EXISTS ^(VAR_LIST VAR_ID+) atomic)
    ;

formula
    :   ^(AND formula+)
    |   ^(OR formula+)
    |   ^(EXISTS ^(VAR_LIST VAR_ID+) formula)
    |   atomic
    |   external
    ;

atomic
    :   atom
    |   equal
    |   subclass
    ;

atom
    :   psoa
    ;

equal
    :   ^(EQUAL term term)
    ;

subclass
    :   ^(SUBCLASS term term)
    ;
    
term returns [String result]
    :   c=constant {$result = c; }  
    |   VAR_ID {$result = $VAR_ID.text; }
    |   p=psoa {$result = p;}
    |   external
    ;

external
    :   ^(EXTERNAL psoa)
    ;
    
psoa returns [String result]
@init {
  List<String> tuples = list();
  List<String> slots = list();
}
    :   ^(PSOA oid=term? ^(INSTANCE type=term) (t=tuple {tuples.add(t); })* (s=slot {slots.add(s); })*) {
      $result = psoaTerm(oid, type, tuples, slots);
      System.out.println($result);
    }
    ;

tuple returns [String result]
@init {
  StringBuilder b = builder();
}
    :   ^(TUPLE (t=term { collectTerm(b, t); })+) {
      $result = b.toString(); 
    }
    ;
    
slot returns [String result]
@init {
  StringBuilder b = builder();
}
    :   ^(SLOT s=term t=term) {
      collectTerms(b, s, t);
      $result = b.toString(); 
    }
    ;

constant returns [String result]
    :   ^(LITERAL IRI)
    |   ^(SHORTCONST c=constshort) {$result = c; }
    ;
    
constshort returns [String result]
    :   IRI
    |   LITERAL
    |   NUMBER
    |   LOCAL {$result = $LOCAL.text;}
    ;