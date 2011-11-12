// $ANTLR 3.4 org/ruleml/api/presentation_syntax_parser/RuleMLPresentationASTGrammar.g 2011-11-12 14:16:04

package org.ruleml.api.presentation_syntax_parser;

import org.ruleml.api.*;



import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class RuleMLPresentationASTGrammar extends TreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ALPHA", "AND", "BASE", "DIGIT", "DOCUMENT", "ECHAR", "EOL", "EQUAL", "EXISTS", "FORALL", "GREATER", "GROUP", "GROUP_ELEM_LIST", "ID", "ID_CHAR", "ID_START_CHAR", "IMPLICATION", "IMPORT", "IMPORTS", "INSTANCE", "IRI_CHAR", "IRI_REF", "IRI_START_CHAR", "LESS", "LITERAL", "LPAR", "LSQBR", "MULTI_LINE_COMMENT", "PREFIX", "PREFIXES", "PSOA", "RPAR", "RSQBR", "SLOT", "SLOTS", "SLOT_ARROW", "STRING", "SUBCLASS", "SYMSPACE_OPER", "TUPLE", "TUPLES", "VAR", "VAR_ID", "VAR_LIST", "WHITESPACE"
    };

    public static final int EOF=-1;
    public static final int ALPHA=4;
    public static final int AND=5;
    public static final int BASE=6;
    public static final int DIGIT=7;
    public static final int DOCUMENT=8;
    public static final int ECHAR=9;
    public static final int EOL=10;
    public static final int EQUAL=11;
    public static final int EXISTS=12;
    public static final int FORALL=13;
    public static final int GREATER=14;
    public static final int GROUP=15;
    public static final int GROUP_ELEM_LIST=16;
    public static final int ID=17;
    public static final int ID_CHAR=18;
    public static final int ID_START_CHAR=19;
    public static final int IMPLICATION=20;
    public static final int IMPORT=21;
    public static final int IMPORTS=22;
    public static final int INSTANCE=23;
    public static final int IRI_CHAR=24;
    public static final int IRI_REF=25;
    public static final int IRI_START_CHAR=26;
    public static final int LESS=27;
    public static final int LITERAL=28;
    public static final int LPAR=29;
    public static final int LSQBR=30;
    public static final int MULTI_LINE_COMMENT=31;
    public static final int PREFIX=32;
    public static final int PREFIXES=33;
    public static final int PSOA=34;
    public static final int RPAR=35;
    public static final int RSQBR=36;
    public static final int SLOT=37;
    public static final int SLOTS=38;
    public static final int SLOT_ARROW=39;
    public static final int STRING=40;
    public static final int SUBCLASS=41;
    public static final int SYMSPACE_OPER=42;
    public static final int TUPLE=43;
    public static final int TUPLES=44;
    public static final int VAR=45;
    public static final int VAR_ID=46;
    public static final int VAR_LIST=47;
    public static final int WHITESPACE=48;

    // delegates
    public TreeParser[] getDelegates() {
        return new TreeParser[] {};
    }

    // delegators


    public RuleMLPresentationASTGrammar(TreeNodeStream input) {
        this(input, new RecognizerSharedState());
    }
    public RuleMLPresentationASTGrammar(TreeNodeStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return RuleMLPresentationASTGrammar.tokenNames; }
    public String getGrammarFileName() { return "org/ruleml/api/presentation_syntax_parser/RuleMLPresentationASTGrammar.g"; }



    // $ANTLR start "document"
    // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationASTGrammar.g:20:1: document[AbstractSyntax factory] returns [AbstractSyntax.Document result] : ^( DOCUMENT ( base[factory] )? ^( PREFIXES ( prefix[factory] )* ) ^( IMPORTS ( importDecl[factory] )* ) ( group[factory] )? ) ;
    public final AbstractSyntax.Document document(AbstractSyntax factory) throws RecognitionException {
        AbstractSyntax.Document result = null;


        try {
            // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationASTGrammar.g:22:5: ( ^( DOCUMENT ( base[factory] )? ^( PREFIXES ( prefix[factory] )* ) ^( IMPORTS ( importDecl[factory] )* ) ( group[factory] )? ) )
            // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationASTGrammar.g:22:7: ^( DOCUMENT ( base[factory] )? ^( PREFIXES ( prefix[factory] )* ) ^( IMPORTS ( importDecl[factory] )* ) ( group[factory] )? )
            {
            match(input,DOCUMENT,FOLLOW_DOCUMENT_in_document59); 

            match(input, Token.DOWN, null); 
            // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationASTGrammar.g:22:18: ( base[factory] )?
            int alt1=2;
            switch ( input.LA(1) ) {
                case BASE:
                    {
                    alt1=1;
                    }
                    break;
            }

            switch (alt1) {
                case 1 :
                    // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationASTGrammar.g:22:18: base[factory]
                    {
                    pushFollow(FOLLOW_base_in_document61);
                    base(factory);

                    state._fsp--;


                    }
                    break;

            }


            match(input,PREFIXES,FOLLOW_PREFIXES_in_document66); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationASTGrammar.g:22:44: ( prefix[factory] )*
                loop2:
                do {
                    int alt2=2;
                    switch ( input.LA(1) ) {
                    case PREFIX:
                        {
                        alt2=1;
                        }
                        break;

                    }

                    switch (alt2) {
                	case 1 :
                	    // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationASTGrammar.g:22:44: prefix[factory]
                	    {
                	    pushFollow(FOLLOW_prefix_in_document68);
                	    prefix(factory);

                	    state._fsp--;


                	    }
                	    break;

                	default :
                	    break loop2;
                    }
                } while (true);


                match(input, Token.UP, null); 
            }


            match(input,IMPORTS,FOLLOW_IMPORTS_in_document74); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationASTGrammar.g:22:72: ( importDecl[factory] )*
                loop3:
                do {
                    int alt3=2;
                    switch ( input.LA(1) ) {
                    case IMPORT:
                        {
                        alt3=1;
                        }
                        break;

                    }

                    switch (alt3) {
                	case 1 :
                	    // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationASTGrammar.g:22:72: importDecl[factory]
                	    {
                	    pushFollow(FOLLOW_importDecl_in_document76);
                	    importDecl(factory);

                	    state._fsp--;


                	    }
                	    break;

                	default :
                	    break loop3;
                    }
                } while (true);


                match(input, Token.UP, null); 
            }


            // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationASTGrammar.g:22:94: ( group[factory] )?
            int alt4=2;
            switch ( input.LA(1) ) {
                case GROUP:
                    {
                    alt4=1;
                    }
                    break;
            }

            switch (alt4) {
                case 1 :
                    // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationASTGrammar.g:22:94: group[factory]
                    {
                    pushFollow(FOLLOW_group_in_document81);
                    group(factory);

                    state._fsp--;


                    }
                    break;

            }


            match(input, Token.UP, null); 



                        System.out.println("AAAAAAAAAAGGGGGAAA");
                        result = null;
                    

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return result;
    }
    // $ANTLR end "document"



    // $ANTLR start "base"
    // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationASTGrammar.g:29:1: base[AbstractSyntax factory] returns [AbstractSyntax.Base result] : ^( BASE IRI_REF ) ;
    public final AbstractSyntax.Base base(AbstractSyntax factory) throws RecognitionException {
        AbstractSyntax.Base result = null;


        try {
            // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationASTGrammar.g:31:5: ( ^( BASE IRI_REF ) )
            // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationASTGrammar.g:31:7: ^( BASE IRI_REF )
            {
            match(input,BASE,FOLLOW_BASE_in_base119); 

            match(input, Token.DOWN, null); 
            match(input,IRI_REF,FOLLOW_IRI_REF_in_base121); 

            match(input, Token.UP, null); 



                        System.out.println("UUUUUUUUUUUUUUUUU");
                        result = null;
                    

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return result;
    }
    // $ANTLR end "base"



    // $ANTLR start "prefix"
    // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationASTGrammar.g:38:1: prefix[AbstractSyntax factory] returns [AbstractSyntax.Prefix result] : ^( PREFIX ID IRI_REF ) ;
    public final AbstractSyntax.Prefix prefix(AbstractSyntax factory) throws RecognitionException {
        AbstractSyntax.Prefix result = null;


        try {
            // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationASTGrammar.g:40:5: ( ^( PREFIX ID IRI_REF ) )
            // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationASTGrammar.g:40:7: ^( PREFIX ID IRI_REF )
            {
            match(input,PREFIX,FOLLOW_PREFIX_in_prefix157); 

            match(input, Token.DOWN, null); 
            match(input,ID,FOLLOW_ID_in_prefix159); 

            match(input,IRI_REF,FOLLOW_IRI_REF_in_prefix161); 

            match(input, Token.UP, null); 



                        System.out.println("eeeeeeeeeeeeee");
                        result = null;
                    

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return result;
    }
    // $ANTLR end "prefix"



    // $ANTLR start "importDecl"
    // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationASTGrammar.g:49:1: importDecl[AbstractSyntax factory] returns [AbstractSyntax.Import result] : ^( IMPORT IRI_REF ( IRI_REF )? ) ;
    public final AbstractSyntax.Import importDecl(AbstractSyntax factory) throws RecognitionException {
        AbstractSyntax.Import result = null;


        try {
            // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationASTGrammar.g:51:5: ( ^( IMPORT IRI_REF ( IRI_REF )? ) )
            // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationASTGrammar.g:51:7: ^( IMPORT IRI_REF ( IRI_REF )? )
            {
            match(input,IMPORT,FOLLOW_IMPORT_in_importDecl199); 

            match(input, Token.DOWN, null); 
            match(input,IRI_REF,FOLLOW_IRI_REF_in_importDecl201); 

            // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationASTGrammar.g:51:24: ( IRI_REF )?
            int alt5=2;
            switch ( input.LA(1) ) {
                case IRI_REF:
                    {
                    alt5=1;
                    }
                    break;
            }

            switch (alt5) {
                case 1 :
                    // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationASTGrammar.g:51:24: IRI_REF
                    {
                    match(input,IRI_REF,FOLLOW_IRI_REF_in_importDecl203); 

                    }
                    break;

            }


            match(input, Token.UP, null); 



                        System.out.println("ttttttttttttttttt");
                        result = null;
                    

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return result;
    }
    // $ANTLR end "importDecl"



    // $ANTLR start "group"
    // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationASTGrammar.g:58:1: group[AbstractSyntax factory] returns [AbstractSyntax.Group result] : ^( GROUP ^( GROUP_ELEM_LIST ( group_element[factory] )* ) ) ;
    public final AbstractSyntax.Group group(AbstractSyntax factory) throws RecognitionException {
        AbstractSyntax.Group result = null;


        try {
            // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationASTGrammar.g:60:5: ( ^( GROUP ^( GROUP_ELEM_LIST ( group_element[factory] )* ) ) )
            // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationASTGrammar.g:60:7: ^( GROUP ^( GROUP_ELEM_LIST ( group_element[factory] )* ) )
            {
            match(input,GROUP,FOLLOW_GROUP_in_group241); 

            match(input, Token.DOWN, null); 
            match(input,GROUP_ELEM_LIST,FOLLOW_GROUP_ELEM_LIST_in_group244); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationASTGrammar.g:60:33: ( group_element[factory] )*
                loop6:
                do {
                    int alt6=2;
                    switch ( input.LA(1) ) {
                    case FORALL:
                    case GROUP:
                        {
                        alt6=1;
                        }
                        break;

                    }

                    switch (alt6) {
                	case 1 :
                	    // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationASTGrammar.g:60:33: group_element[factory]
                	    {
                	    pushFollow(FOLLOW_group_element_in_group246);
                	    group_element(factory);

                	    state._fsp--;


                	    }
                	    break;

                	default :
                	    break loop6;
                    }
                } while (true);


                match(input, Token.UP, null); 
            }


            match(input, Token.UP, null); 



                        System.out.println("zzzzzzzzzzzzzzzz");
                        result = null;
                    

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return result;
    }
    // $ANTLR end "group"



    // $ANTLR start "group_element"
    // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationASTGrammar.g:68:1: group_element[AbstractSyntax factory] returns [AbstractSyntax.GroupElement result] : ( rule[factory] | group[factory] );
    public final AbstractSyntax.GroupElement group_element(AbstractSyntax factory) throws RecognitionException {
        AbstractSyntax.GroupElement result = null;


        AbstractSyntax.Rule rule1 =null;

        AbstractSyntax.Group group2 =null;


        try {
            // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationASTGrammar.g:70:5: ( rule[factory] | group[factory] )
            int alt7=2;
            switch ( input.LA(1) ) {
            case FORALL:
                {
                alt7=1;
                }
                break;
            case GROUP:
                {
                alt7=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;

            }

            switch (alt7) {
                case 1 :
                    // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationASTGrammar.g:71:9: rule[factory]
                    {
                    pushFollow(FOLLOW_rule_in_group_element293);
                    rule1=rule(factory);

                    state._fsp--;


                     result = rule1; 

                    }
                    break;
                case 2 :
                    // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationASTGrammar.g:73:9: group[factory]
                    {
                    pushFollow(FOLLOW_group_in_group_element312);
                    group2=group(factory);

                    state._fsp--;


                     result = group2; 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return result;
    }
    // $ANTLR end "group_element"



    // $ANTLR start "rule"
    // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationASTGrammar.g:77:1: rule[AbstractSyntax factory] returns [AbstractSyntax.Rule result] : FORALL ;
    public final AbstractSyntax.Rule rule(AbstractSyntax factory) throws RecognitionException {
        AbstractSyntax.Rule result = null;


        try {
            // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationASTGrammar.g:79:5: ( FORALL )
            // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationASTGrammar.g:79:7: FORALL
            {
            match(input,FORALL,FOLLOW_FORALL_in_rule340); 


                        System.out.println("RRRRRRRRRRRRRR");
                        result = null;
                    

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return result;
    }
    // $ANTLR end "rule"

    // Delegated rules


 

    public static final BitSet FOLLOW_DOCUMENT_in_document59 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_base_in_document61 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_PREFIXES_in_document66 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_prefix_in_document68 = new BitSet(new long[]{0x0000000100000008L});
    public static final BitSet FOLLOW_IMPORTS_in_document74 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_importDecl_in_document76 = new BitSet(new long[]{0x0000000000200008L});
    public static final BitSet FOLLOW_group_in_document81 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BASE_in_base119 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IRI_REF_in_base121 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PREFIX_in_prefix157 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_prefix159 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_IRI_REF_in_prefix161 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IMPORT_in_importDecl199 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IRI_REF_in_importDecl201 = new BitSet(new long[]{0x0000000002000008L});
    public static final BitSet FOLLOW_IRI_REF_in_importDecl203 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GROUP_in_group241 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_GROUP_ELEM_LIST_in_group244 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_group_element_in_group246 = new BitSet(new long[]{0x000000000000A008L});
    public static final BitSet FOLLOW_rule_in_group_element293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_group_in_group_element312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FORALL_in_rule340 = new BitSet(new long[]{0x0000000000000002L});

}