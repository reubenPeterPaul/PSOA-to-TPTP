

tree grammar RuleMLPresentationASTGrammar;

options 
{
   ASTLabelType = CommonTree;
   tokenVocab = RuleMLPresentationSyntax;
} 


@header
{
package org.ruleml.api.presentation_syntax_parser;

import org.ruleml.api.*;

}

document [AbstractSyntax factory]
returns [AbstractSyntax.Document result] 
    : ^(DOCUMENT base[factory]? ^(PREFIXES prefix[factory]*) ^(IMPORTS importDecl[factory]*) group[factory]?)
        {
            System.out.println("AAAAAAAAAAGGGGGAAA");
            $result = null;
        }
    ;

base [AbstractSyntax factory]
returns [AbstractSyntax.Base result] 
    : ^(BASE IRI_REF)
        {
            System.out.println("UUUUUUUUUUUUUUUUU");
            $result = null;
        }
    ;

prefix [AbstractSyntax factory]
returns [AbstractSyntax.Prefix result] 
    : ^(PREFIX ID IRI_REF)
        {
            System.out.println("eeeeeeeeeeeeee");
            $result = null;
        }
    ;



importDecl [AbstractSyntax factory]
returns [AbstractSyntax.Import result] 
    : ^(IMPORT IRI_REF IRI_REF?)
        {
            System.out.println("ttttttttttttttttt");
            $result = null;
        }
    ;

group  [AbstractSyntax factory]
returns [AbstractSyntax.Group result] 
    : ^(GROUP ^(GROUP_ELEM_LIST group_element[factory]*))
        {
            System.out.println("zzzzzzzzzzzzzzzz");
            $result = null;
        }
    ;


group_element  [AbstractSyntax factory]
returns [AbstractSyntax.GroupElement result]
    :
        rule[factory] { $result = $rule.result; }
    |
        group[factory] { $result = $group.result; }
    ;


rule  [AbstractSyntax factory]
returns [AbstractSyntax.Rule result]
    : ^(FORALL ^(VAR_LIST VAR_ID+) clause[factory])
        {
            System.out.println("RRRRRRRRRRRRRR");
            $result = null;
        }
    ;

clause [AbstractSyntax factory]
  returns [AbstractSyntax.Construct result]
    : 
      ^(IMPLICATION ^(AND head[factory]) ID) { $result = $head.result; }
    |
      atomic[factory] { $result = $atomic.result; }
    ;
    
head [AbstractSyntax factory]
  returns [AbstractSyntax.Construct result]
    :
      ^(EXISTS ^(VAR_LIST VAR_ID+) atomic[factory]) 
      {
        $result = $atomic.result;
      }
    | 
      atomic[factory] 
      {
        $result = $atomic.result;
      }
    ;

atomic [AbstractSyntax factory]
  returns [AbstractSyntax.Atomic result]
    :
      equal[factory] 
      {
        $result = $equal.result;
      }
      /*| subclass[factory] | atom[factory]*/ 
    ;      
    
equal [AbstractSyntax factory]
  returns [AbstractSyntax.Equal result]
    :
      ^(EQUAL ID ID) { $result = null; }
    ;