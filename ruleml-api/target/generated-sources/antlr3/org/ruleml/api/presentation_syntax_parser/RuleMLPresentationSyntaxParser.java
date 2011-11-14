// $ANTLR 3.4 org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g 2011-11-14 16:49:54

package org.ruleml.api.presentation_syntax_parser;

import org.ruleml.api.*;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class RuleMLPresentationSyntaxParser extends Parser {
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
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public RuleMLPresentationSyntaxParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public RuleMLPresentationSyntaxParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return RuleMLPresentationSyntaxParser.tokenNames; }
    public String getGrammarFileName() { return "org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g"; }


    public static class top_level_item_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "top_level_item"
    // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:45:1: top_level_item : ( document | EOF );
    public final RuleMLPresentationSyntaxParser.top_level_item_return top_level_item() throws RecognitionException {
        RuleMLPresentationSyntaxParser.top_level_item_return retval = new RuleMLPresentationSyntaxParser.top_level_item_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token EOF2=null;
        RuleMLPresentationSyntaxParser.document_return document1 =null;


        Object EOF2_tree=null;

        try {
            // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:46:5: ( document | EOF )
            int alt1=2;
            switch ( input.LA(1) ) {
            case DOCUMENT:
                {
                alt1=1;
                }
                break;
            case EOF:
                {
                alt1=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }

            switch (alt1) {
                case 1 :
                    // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:46:7: document
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_document_in_top_level_item150);
                    document1=document();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, document1.getTree());

                    }
                    break;
                case 2 :
                    // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:47:7: EOF
                    {
                    root_0 = (Object)adaptor.nil();


                    EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_top_level_item158); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    EOF2_tree = 
                    (Object)adaptor.create(EOF2)
                    ;
                    adaptor.addChild(root_0, EOF2_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "top_level_item"


    public static class base_return extends ParserRuleReturnScope {
        public AbstractSyntax.Base result;
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "base"
    // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:51:1: base returns [AbstractSyntax.Base result] : BASE LPAR IRI_REF RPAR -> ^( BASE IRI_REF ) ;
    public final RuleMLPresentationSyntaxParser.base_return base() throws RecognitionException {
        RuleMLPresentationSyntaxParser.base_return retval = new RuleMLPresentationSyntaxParser.base_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token BASE3=null;
        Token LPAR4=null;
        Token IRI_REF5=null;
        Token RPAR6=null;

        Object BASE3_tree=null;
        Object LPAR4_tree=null;
        Object IRI_REF5_tree=null;
        Object RPAR6_tree=null;
        RewriteRuleTokenStream stream_BASE=new RewriteRuleTokenStream(adaptor,"token BASE");
        RewriteRuleTokenStream stream_IRI_REF=new RewriteRuleTokenStream(adaptor,"token IRI_REF");
        RewriteRuleTokenStream stream_RPAR=new RewriteRuleTokenStream(adaptor,"token RPAR");
        RewriteRuleTokenStream stream_LPAR=new RewriteRuleTokenStream(adaptor,"token LPAR");

        try {
            // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:53:5: ( BASE LPAR IRI_REF RPAR -> ^( BASE IRI_REF ) )
            // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:54:9: BASE LPAR IRI_REF RPAR
            {
            BASE3=(Token)match(input,BASE,FOLLOW_BASE_in_base190); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_BASE.add(BASE3);


            LPAR4=(Token)match(input,LPAR,FOLLOW_LPAR_in_base192); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAR.add(LPAR4);


            IRI_REF5=(Token)match(input,IRI_REF,FOLLOW_IRI_REF_in_base194); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IRI_REF.add(IRI_REF5);


            RPAR6=(Token)match(input,RPAR,FOLLOW_RPAR_in_base196); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAR.add(RPAR6);


            // AST REWRITE
            // elements: BASE, IRI_REF
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 55:9: -> ^( BASE IRI_REF )
            {
                // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:55:12: ^( BASE IRI_REF )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_BASE.nextNode()
                , root_1);

                adaptor.addChild(root_1, 
                stream_IRI_REF.nextNode()
                );

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "base"


    public static class prefix_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "prefix"
    // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:59:1: prefix : PREFIX LPAR ID IRI_REF RPAR -> ^( PREFIX ID IRI_REF ) ;
    public final RuleMLPresentationSyntaxParser.prefix_return prefix() throws RecognitionException {
        RuleMLPresentationSyntaxParser.prefix_return retval = new RuleMLPresentationSyntaxParser.prefix_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token PREFIX7=null;
        Token LPAR8=null;
        Token ID9=null;
        Token IRI_REF10=null;
        Token RPAR11=null;

        Object PREFIX7_tree=null;
        Object LPAR8_tree=null;
        Object ID9_tree=null;
        Object IRI_REF10_tree=null;
        Object RPAR11_tree=null;
        RewriteRuleTokenStream stream_PREFIX=new RewriteRuleTokenStream(adaptor,"token PREFIX");
        RewriteRuleTokenStream stream_IRI_REF=new RewriteRuleTokenStream(adaptor,"token IRI_REF");
        RewriteRuleTokenStream stream_RPAR=new RewriteRuleTokenStream(adaptor,"token RPAR");
        RewriteRuleTokenStream stream_LPAR=new RewriteRuleTokenStream(adaptor,"token LPAR");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:60:5: ( PREFIX LPAR ID IRI_REF RPAR -> ^( PREFIX ID IRI_REF ) )
            // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:61:9: PREFIX LPAR ID IRI_REF RPAR
            {
            PREFIX7=(Token)match(input,PREFIX,FOLLOW_PREFIX_in_prefix238); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_PREFIX.add(PREFIX7);


            LPAR8=(Token)match(input,LPAR,FOLLOW_LPAR_in_prefix240); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAR.add(LPAR8);


            ID9=(Token)match(input,ID,FOLLOW_ID_in_prefix242); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID9);


            IRI_REF10=(Token)match(input,IRI_REF,FOLLOW_IRI_REF_in_prefix244); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IRI_REF.add(IRI_REF10);


            RPAR11=(Token)match(input,RPAR,FOLLOW_RPAR_in_prefix246); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAR.add(RPAR11);


            // AST REWRITE
            // elements: ID, IRI_REF, PREFIX
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 61:37: -> ^( PREFIX ID IRI_REF )
            {
                // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:61:40: ^( PREFIX ID IRI_REF )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_PREFIX.nextNode()
                , root_1);

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_IRI_REF.nextNode()
                );

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "prefix"


    public static class importDecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "importDecl"
    // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:66:1: importDecl : IMPORT LPAR kb= IRI_REF (profile= IRI_REF )? RPAR -> ^( IMPORT $kb ( $profile)? ) ;
    public final RuleMLPresentationSyntaxParser.importDecl_return importDecl() throws RecognitionException {
        RuleMLPresentationSyntaxParser.importDecl_return retval = new RuleMLPresentationSyntaxParser.importDecl_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token kb=null;
        Token profile=null;
        Token IMPORT12=null;
        Token LPAR13=null;
        Token RPAR14=null;

        Object kb_tree=null;
        Object profile_tree=null;
        Object IMPORT12_tree=null;
        Object LPAR13_tree=null;
        Object RPAR14_tree=null;
        RewriteRuleTokenStream stream_IRI_REF=new RewriteRuleTokenStream(adaptor,"token IRI_REF");
        RewriteRuleTokenStream stream_IMPORT=new RewriteRuleTokenStream(adaptor,"token IMPORT");
        RewriteRuleTokenStream stream_RPAR=new RewriteRuleTokenStream(adaptor,"token RPAR");
        RewriteRuleTokenStream stream_LPAR=new RewriteRuleTokenStream(adaptor,"token LPAR");

        try {
            // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:67:5: ( IMPORT LPAR kb= IRI_REF (profile= IRI_REF )? RPAR -> ^( IMPORT $kb ( $profile)? ) )
            // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:68:9: IMPORT LPAR kb= IRI_REF (profile= IRI_REF )? RPAR
            {
            IMPORT12=(Token)match(input,IMPORT,FOLLOW_IMPORT_in_importDecl284); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IMPORT.add(IMPORT12);


            LPAR13=(Token)match(input,LPAR,FOLLOW_LPAR_in_importDecl286); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAR.add(LPAR13);


            kb=(Token)match(input,IRI_REF,FOLLOW_IRI_REF_in_importDecl290); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IRI_REF.add(kb);


            // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:68:32: (profile= IRI_REF )?
            int alt2=2;
            switch ( input.LA(1) ) {
                case IRI_REF:
                    {
                    alt2=1;
                    }
                    break;
            }

            switch (alt2) {
                case 1 :
                    // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:68:33: profile= IRI_REF
                    {
                    profile=(Token)match(input,IRI_REF,FOLLOW_IRI_REF_in_importDecl295); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IRI_REF.add(profile);


                    }
                    break;

            }


            RPAR14=(Token)match(input,RPAR,FOLLOW_RPAR_in_importDecl299); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAR.add(RPAR14);


            // AST REWRITE
            // elements: kb, profile, IMPORT
            // token labels: kb, profile
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleTokenStream stream_kb=new RewriteRuleTokenStream(adaptor,"token kb",kb);
            RewriteRuleTokenStream stream_profile=new RewriteRuleTokenStream(adaptor,"token profile",profile);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 69:9: -> ^( IMPORT $kb ( $profile)? )
            {
                // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:69:12: ^( IMPORT $kb ( $profile)? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_IMPORT.nextNode()
                , root_1);

                adaptor.addChild(root_1, stream_kb.nextNode());

                // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:69:26: ( $profile)?
                if ( stream_profile.hasNext() ) {
                    adaptor.addChild(root_1, stream_profile.nextNode());

                }
                stream_profile.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "importDecl"


    public static class document_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "document"
    // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:74:1: document : DOCUMENT LPAR ( base )? ( prefix )* ( importDecl )* ( group )? RPAR -> ^( DOCUMENT ( base )? ^( PREFIXES ( prefix )* ) ^( IMPORTS ( importDecl )* ) ( group )? ) ;
    public final RuleMLPresentationSyntaxParser.document_return document() throws RecognitionException {
        RuleMLPresentationSyntaxParser.document_return retval = new RuleMLPresentationSyntaxParser.document_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token DOCUMENT15=null;
        Token LPAR16=null;
        Token RPAR21=null;
        RuleMLPresentationSyntaxParser.base_return base17 =null;

        RuleMLPresentationSyntaxParser.prefix_return prefix18 =null;

        RuleMLPresentationSyntaxParser.importDecl_return importDecl19 =null;

        RuleMLPresentationSyntaxParser.group_return group20 =null;


        Object DOCUMENT15_tree=null;
        Object LPAR16_tree=null;
        Object RPAR21_tree=null;
        RewriteRuleTokenStream stream_RPAR=new RewriteRuleTokenStream(adaptor,"token RPAR");
        RewriteRuleTokenStream stream_LPAR=new RewriteRuleTokenStream(adaptor,"token LPAR");
        RewriteRuleTokenStream stream_DOCUMENT=new RewriteRuleTokenStream(adaptor,"token DOCUMENT");
        RewriteRuleSubtreeStream stream_importDecl=new RewriteRuleSubtreeStream(adaptor,"rule importDecl");
        RewriteRuleSubtreeStream stream_prefix=new RewriteRuleSubtreeStream(adaptor,"rule prefix");
        RewriteRuleSubtreeStream stream_base=new RewriteRuleSubtreeStream(adaptor,"rule base");
        RewriteRuleSubtreeStream stream_group=new RewriteRuleSubtreeStream(adaptor,"rule group");
        try {
            // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:75:5: ( DOCUMENT LPAR ( base )? ( prefix )* ( importDecl )* ( group )? RPAR -> ^( DOCUMENT ( base )? ^( PREFIXES ( prefix )* ) ^( IMPORTS ( importDecl )* ) ( group )? ) )
            // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:76:9: DOCUMENT LPAR ( base )? ( prefix )* ( importDecl )* ( group )? RPAR
            {
            DOCUMENT15=(Token)match(input,DOCUMENT,FOLLOW_DOCUMENT_in_document350); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DOCUMENT.add(DOCUMENT15);


            LPAR16=(Token)match(input,LPAR,FOLLOW_LPAR_in_document361); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAR.add(LPAR16);


            // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:78:9: ( base )?
            int alt3=2;
            switch ( input.LA(1) ) {
                case BASE:
                    {
                    alt3=1;
                    }
                    break;
            }

            switch (alt3) {
                case 1 :
                    // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:78:9: base
                    {
                    pushFollow(FOLLOW_base_in_document371);
                    base17=base();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_base.add(base17.getTree());

                    }
                    break;

            }


            // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:79:9: ( prefix )*
            loop4:
            do {
                int alt4=2;
                switch ( input.LA(1) ) {
                case PREFIX:
                    {
                    alt4=1;
                    }
                    break;

                }

                switch (alt4) {
            	case 1 :
            	    // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:79:9: prefix
            	    {
            	    pushFollow(FOLLOW_prefix_in_document382);
            	    prefix18=prefix();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_prefix.add(prefix18.getTree());

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:80:9: ( importDecl )*
            loop5:
            do {
                int alt5=2;
                switch ( input.LA(1) ) {
                case IMPORT:
                    {
                    alt5=1;
                    }
                    break;

                }

                switch (alt5) {
            	case 1 :
            	    // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:80:9: importDecl
            	    {
            	    pushFollow(FOLLOW_importDecl_in_document393);
            	    importDecl19=importDecl();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_importDecl.add(importDecl19.getTree());

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:81:9: ( group )?
            int alt6=2;
            switch ( input.LA(1) ) {
                case GROUP:
                    {
                    alt6=1;
                    }
                    break;
            }

            switch (alt6) {
                case 1 :
                    // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:81:9: group
                    {
                    pushFollow(FOLLOW_group_in_document404);
                    group20=group();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_group.add(group20.getTree());

                    }
                    break;

            }


            RPAR21=(Token)match(input,RPAR,FOLLOW_RPAR_in_document415); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAR.add(RPAR21);


            // AST REWRITE
            // elements: base, importDecl, group, prefix, DOCUMENT
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 83:9: -> ^( DOCUMENT ( base )? ^( PREFIXES ( prefix )* ) ^( IMPORTS ( importDecl )* ) ( group )? )
            {
                // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:83:12: ^( DOCUMENT ( base )? ^( PREFIXES ( prefix )* ) ^( IMPORTS ( importDecl )* ) ( group )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_DOCUMENT.nextNode()
                , root_1);

                // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:83:23: ( base )?
                if ( stream_base.hasNext() ) {
                    adaptor.addChild(root_1, stream_base.nextTree());

                }
                stream_base.reset();

                // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:83:29: ^( PREFIXES ( prefix )* )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(PREFIXES, "PREFIXES")
                , root_2);

                // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:83:40: ( prefix )*
                while ( stream_prefix.hasNext() ) {
                    adaptor.addChild(root_2, stream_prefix.nextTree());

                }
                stream_prefix.reset();

                adaptor.addChild(root_1, root_2);
                }

                // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:83:49: ^( IMPORTS ( importDecl )* )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(IMPORTS, "IMPORTS")
                , root_2);

                // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:83:59: ( importDecl )*
                while ( stream_importDecl.hasNext() ) {
                    adaptor.addChild(root_2, stream_importDecl.nextTree());

                }
                stream_importDecl.reset();

                adaptor.addChild(root_1, root_2);
                }

                // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:83:72: ( group )?
                if ( stream_group.hasNext() ) {
                    adaptor.addChild(root_1, stream_group.nextTree());

                }
                stream_group.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "document"


    public static class group_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "group"
    // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:88:1: group : GROUP LPAR ( group_element )* RPAR -> ^( GROUP ^( GROUP_ELEM_LIST ( group_element )* ) ) ;
    public final RuleMLPresentationSyntaxParser.group_return group() throws RecognitionException {
        RuleMLPresentationSyntaxParser.group_return retval = new RuleMLPresentationSyntaxParser.group_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token GROUP22=null;
        Token LPAR23=null;
        Token RPAR25=null;
        RuleMLPresentationSyntaxParser.group_element_return group_element24 =null;


        Object GROUP22_tree=null;
        Object LPAR23_tree=null;
        Object RPAR25_tree=null;
        RewriteRuleTokenStream stream_GROUP=new RewriteRuleTokenStream(adaptor,"token GROUP");
        RewriteRuleTokenStream stream_RPAR=new RewriteRuleTokenStream(adaptor,"token RPAR");
        RewriteRuleTokenStream stream_LPAR=new RewriteRuleTokenStream(adaptor,"token LPAR");
        RewriteRuleSubtreeStream stream_group_element=new RewriteRuleSubtreeStream(adaptor,"rule group_element");
        try {
            // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:89:5: ( GROUP LPAR ( group_element )* RPAR -> ^( GROUP ^( GROUP_ELEM_LIST ( group_element )* ) ) )
            // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:90:9: GROUP LPAR ( group_element )* RPAR
            {
            GROUP22=(Token)match(input,GROUP,FOLLOW_GROUP_in_group477); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_GROUP.add(GROUP22);


            LPAR23=(Token)match(input,LPAR,FOLLOW_LPAR_in_group488); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAR.add(LPAR23);


            // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:92:9: ( group_element )*
            loop7:
            do {
                int alt7=2;
                switch ( input.LA(1) ) {
                case AND:
                case EXISTS:
                case FORALL:
                case GROUP:
                case ID:
                case LPAR:
                case STRING:
                case VAR_ID:
                    {
                    alt7=1;
                    }
                    break;

                }

                switch (alt7) {
            	case 1 :
            	    // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:92:9: group_element
            	    {
            	    pushFollow(FOLLOW_group_element_in_group499);
            	    group_element24=group_element();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_group_element.add(group_element24.getTree());

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            RPAR25=(Token)match(input,RPAR,FOLLOW_RPAR_in_group510); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAR.add(RPAR25);


            // AST REWRITE
            // elements: group_element, GROUP
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 94:9: -> ^( GROUP ^( GROUP_ELEM_LIST ( group_element )* ) )
            {
                // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:94:12: ^( GROUP ^( GROUP_ELEM_LIST ( group_element )* ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_GROUP.nextNode()
                , root_1);

                // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:94:20: ^( GROUP_ELEM_LIST ( group_element )* )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(GROUP_ELEM_LIST, "GROUP_ELEM_LIST")
                , root_2);

                // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:94:38: ( group_element )*
                while ( stream_group_element.hasNext() ) {
                    adaptor.addChild(root_2, stream_group_element.nextTree());

                }
                stream_group_element.reset();

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "group"


    public static class group_element_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "group_element"
    // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:100:1: group_element : ( rule -> rule | group -> group );
    public final RuleMLPresentationSyntaxParser.group_element_return group_element() throws RecognitionException {
        RuleMLPresentationSyntaxParser.group_element_return retval = new RuleMLPresentationSyntaxParser.group_element_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        RuleMLPresentationSyntaxParser.rule_return rule26 =null;

        RuleMLPresentationSyntaxParser.group_return group27 =null;


        RewriteRuleSubtreeStream stream_rule=new RewriteRuleSubtreeStream(adaptor,"rule rule");
        RewriteRuleSubtreeStream stream_group=new RewriteRuleSubtreeStream(adaptor,"rule group");
        try {
            // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:101:5: ( rule -> rule | group -> group )
            int alt8=2;
            switch ( input.LA(1) ) {
            case AND:
            case EXISTS:
            case FORALL:
            case ID:
            case LPAR:
            case STRING:
            case VAR_ID:
                {
                alt8=1;
                }
                break;
            case GROUP:
                {
                alt8=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;

            }

            switch (alt8) {
                case 1 :
                    // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:102:9: rule
                    {
                    pushFollow(FOLLOW_rule_in_group_element560);
                    rule26=rule();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_rule.add(rule26.getTree());

                    // AST REWRITE
                    // elements: rule
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 102:14: -> rule
                    {
                        adaptor.addChild(root_0, stream_rule.nextTree());

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:104:9: group
                    {
                    pushFollow(FOLLOW_group_in_group_element580);
                    group27=group();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_group.add(group27.getTree());

                    // AST REWRITE
                    // elements: group
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 104:15: -> group
                    {
                        adaptor.addChild(root_0, stream_group.nextTree());

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "group_element"


    public static class rule_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "rule"
    // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:107:1: rule : ( FORALL ( VAR_ID )+ LPAR clause RPAR -> ^( FORALL ^( VAR_LIST ( VAR_ID )+ ) clause ) | clause -> clause );
    public final RuleMLPresentationSyntaxParser.rule_return rule() throws RecognitionException {
        RuleMLPresentationSyntaxParser.rule_return retval = new RuleMLPresentationSyntaxParser.rule_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token FORALL28=null;
        Token VAR_ID29=null;
        Token LPAR30=null;
        Token RPAR32=null;
        RuleMLPresentationSyntaxParser.clause_return clause31 =null;

        RuleMLPresentationSyntaxParser.clause_return clause33 =null;


        Object FORALL28_tree=null;
        Object VAR_ID29_tree=null;
        Object LPAR30_tree=null;
        Object RPAR32_tree=null;
        RewriteRuleTokenStream stream_FORALL=new RewriteRuleTokenStream(adaptor,"token FORALL");
        RewriteRuleTokenStream stream_RPAR=new RewriteRuleTokenStream(adaptor,"token RPAR");
        RewriteRuleTokenStream stream_VAR_ID=new RewriteRuleTokenStream(adaptor,"token VAR_ID");
        RewriteRuleTokenStream stream_LPAR=new RewriteRuleTokenStream(adaptor,"token LPAR");
        RewriteRuleSubtreeStream stream_clause=new RewriteRuleSubtreeStream(adaptor,"rule clause");
        try {
            // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:108:5: ( FORALL ( VAR_ID )+ LPAR clause RPAR -> ^( FORALL ^( VAR_LIST ( VAR_ID )+ ) clause ) | clause -> clause )
            int alt10=2;
            switch ( input.LA(1) ) {
            case FORALL:
                {
                alt10=1;
                }
                break;
            case AND:
            case EXISTS:
            case ID:
            case LPAR:
            case STRING:
            case VAR_ID:
                {
                alt10=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;

            }

            switch (alt10) {
                case 1 :
                    // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:109:9: FORALL ( VAR_ID )+ LPAR clause RPAR
                    {
                    FORALL28=(Token)match(input,FORALL,FOLLOW_FORALL_in_rule610); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FORALL.add(FORALL28);


                    // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:110:9: ( VAR_ID )+
                    int cnt9=0;
                    loop9:
                    do {
                        int alt9=2;
                        switch ( input.LA(1) ) {
                        case VAR_ID:
                            {
                            alt9=1;
                            }
                            break;

                        }

                        switch (alt9) {
                    	case 1 :
                    	    // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:110:9: VAR_ID
                    	    {
                    	    VAR_ID29=(Token)match(input,VAR_ID,FOLLOW_VAR_ID_in_rule621); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_VAR_ID.add(VAR_ID29);


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt9 >= 1 ) break loop9;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(9, input);
                                throw eee;
                        }
                        cnt9++;
                    } while (true);


                    LPAR30=(Token)match(input,LPAR,FOLLOW_LPAR_in_rule632); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAR.add(LPAR30);


                    pushFollow(FOLLOW_clause_in_rule642);
                    clause31=clause();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_clause.add(clause31.getTree());

                    RPAR32=(Token)match(input,RPAR,FOLLOW_RPAR_in_rule652); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAR.add(RPAR32);


                    // AST REWRITE
                    // elements: clause, VAR_ID, FORALL
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 114:9: -> ^( FORALL ^( VAR_LIST ( VAR_ID )+ ) clause )
                    {
                        // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:114:12: ^( FORALL ^( VAR_LIST ( VAR_ID )+ ) clause )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_FORALL.nextNode()
                        , root_1);

                        // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:114:21: ^( VAR_LIST ( VAR_ID )+ )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(VAR_LIST, "VAR_LIST")
                        , root_2);

                        if ( !(stream_VAR_ID.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_VAR_ID.hasNext() ) {
                            adaptor.addChild(root_2, 
                            stream_VAR_ID.nextNode()
                            );

                        }
                        stream_VAR_ID.reset();

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_1, stream_clause.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:116:9: clause
                    {
                    pushFollow(FOLLOW_clause_in_rule691);
                    clause33=clause();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_clause.add(clause33.getTree());

                    // AST REWRITE
                    // elements: clause
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 116:16: -> clause
                    {
                        adaptor.addChild(root_0, stream_clause.nextTree());

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "rule"


    public static class clause_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "clause"
    // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:121:1: clause : ( ( implies )=> implies -> implies | atomic -> atomic );
    public final RuleMLPresentationSyntaxParser.clause_return clause() throws RecognitionException {
        RuleMLPresentationSyntaxParser.clause_return retval = new RuleMLPresentationSyntaxParser.clause_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        RuleMLPresentationSyntaxParser.implies_return implies34 =null;

        RuleMLPresentationSyntaxParser.atomic_return atomic35 =null;


        RewriteRuleSubtreeStream stream_implies=new RewriteRuleSubtreeStream(adaptor,"rule implies");
        RewriteRuleSubtreeStream stream_atomic=new RewriteRuleSubtreeStream(adaptor,"rule atomic");
        try {
            // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:122:5: ( ( implies )=> implies -> implies | atomic -> atomic )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==EXISTS) && (synpred1_RuleMLPresentationSyntax())) {
                alt11=1;
            }
            else if ( (LA11_0==STRING) ) {
                int LA11_2 = input.LA(2);

                if ( (synpred1_RuleMLPresentationSyntax()) ) {
                    alt11=1;
                }
                else if ( (true) ) {
                    alt11=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 2, input);

                    throw nvae;

                }
            }
            else if ( (LA11_0==ID) ) {
                int LA11_3 = input.LA(2);

                if ( (synpred1_RuleMLPresentationSyntax()) ) {
                    alt11=1;
                }
                else if ( (true) ) {
                    alt11=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 3, input);

                    throw nvae;

                }
            }
            else if ( (LA11_0==VAR_ID) ) {
                int LA11_4 = input.LA(2);

                if ( (synpred1_RuleMLPresentationSyntax()) ) {
                    alt11=1;
                }
                else if ( (true) ) {
                    alt11=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 4, input);

                    throw nvae;

                }
            }
            else if ( (LA11_0==LPAR) ) {
                int LA11_5 = input.LA(2);

                if ( (synpred1_RuleMLPresentationSyntax()) ) {
                    alt11=1;
                }
                else if ( (true) ) {
                    alt11=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 5, input);

                    throw nvae;

                }
            }
            else if ( (LA11_0==AND) && (synpred1_RuleMLPresentationSyntax())) {
                alt11=1;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;

            }
            switch (alt11) {
                case 1 :
                    // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:123:8: ( implies )=> implies
                    {
                    pushFollow(FOLLOW_implies_in_clause728);
                    implies34=implies();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_implies.add(implies34.getTree());

                    // AST REWRITE
                    // elements: implies
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 123:29: -> implies
                    {
                        adaptor.addChild(root_0, stream_implies.nextTree());

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:125:9: atomic
                    {
                    pushFollow(FOLLOW_atomic_in_clause748);
                    atomic35=atomic();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_atomic.add(atomic35.getTree());

                    // AST REWRITE
                    // elements: atomic
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 125:16: -> atomic
                    {
                        adaptor.addChild(root_0, stream_atomic.nextTree());

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "clause"


    public static class implies_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "implies"
    // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:129:1: implies : head_conjunction IMPLICATION formula -> ^( IMPLICATION head_conjunction formula ) ;
    public final RuleMLPresentationSyntaxParser.implies_return implies() throws RecognitionException {
        RuleMLPresentationSyntaxParser.implies_return retval = new RuleMLPresentationSyntaxParser.implies_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IMPLICATION37=null;
        RuleMLPresentationSyntaxParser.head_conjunction_return head_conjunction36 =null;

        RuleMLPresentationSyntaxParser.formula_return formula38 =null;


        Object IMPLICATION37_tree=null;
        RewriteRuleTokenStream stream_IMPLICATION=new RewriteRuleTokenStream(adaptor,"token IMPLICATION");
        RewriteRuleSubtreeStream stream_head_conjunction=new RewriteRuleSubtreeStream(adaptor,"rule head_conjunction");
        RewriteRuleSubtreeStream stream_formula=new RewriteRuleSubtreeStream(adaptor,"rule formula");
        try {
            // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:130:5: ( head_conjunction IMPLICATION formula -> ^( IMPLICATION head_conjunction formula ) )
            // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:131:9: head_conjunction IMPLICATION formula
            {
            pushFollow(FOLLOW_head_conjunction_in_implies779);
            head_conjunction36=head_conjunction();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_head_conjunction.add(head_conjunction36.getTree());

            IMPLICATION37=(Token)match(input,IMPLICATION,FOLLOW_IMPLICATION_in_implies789); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IMPLICATION.add(IMPLICATION37);


            pushFollow(FOLLOW_formula_in_implies799);
            formula38=formula();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_formula.add(formula38.getTree());

            // AST REWRITE
            // elements: IMPLICATION, head_conjunction, formula
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 134:9: -> ^( IMPLICATION head_conjunction formula )
            {
                // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:134:12: ^( IMPLICATION head_conjunction formula )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_IMPLICATION.nextNode()
                , root_1);

                adaptor.addChild(root_1, stream_head_conjunction.nextTree());

                adaptor.addChild(root_1, stream_formula.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "implies"


    public static class head_conjunction_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "head_conjunction"
    // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:138:1: head_conjunction : ( head -> ^( AND head ) | AND LPAR ( head )* RPAR -> ^( AND ( head )* ) );
    public final RuleMLPresentationSyntaxParser.head_conjunction_return head_conjunction() throws RecognitionException {
        RuleMLPresentationSyntaxParser.head_conjunction_return retval = new RuleMLPresentationSyntaxParser.head_conjunction_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token AND40=null;
        Token LPAR41=null;
        Token RPAR43=null;
        RuleMLPresentationSyntaxParser.head_return head39 =null;

        RuleMLPresentationSyntaxParser.head_return head42 =null;


        Object AND40_tree=null;
        Object LPAR41_tree=null;
        Object RPAR43_tree=null;
        RewriteRuleTokenStream stream_RPAR=new RewriteRuleTokenStream(adaptor,"token RPAR");
        RewriteRuleTokenStream stream_LPAR=new RewriteRuleTokenStream(adaptor,"token LPAR");
        RewriteRuleTokenStream stream_AND=new RewriteRuleTokenStream(adaptor,"token AND");
        RewriteRuleSubtreeStream stream_head=new RewriteRuleSubtreeStream(adaptor,"rule head");
        try {
            // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:139:5: ( head -> ^( AND head ) | AND LPAR ( head )* RPAR -> ^( AND ( head )* ) )
            int alt13=2;
            switch ( input.LA(1) ) {
            case EXISTS:
            case ID:
            case LPAR:
            case STRING:
            case VAR_ID:
                {
                alt13=1;
                }
                break;
            case AND:
                {
                alt13=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;

            }

            switch (alt13) {
                case 1 :
                    // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:140:9: head
                    {
                    pushFollow(FOLLOW_head_in_head_conjunction845);
                    head39=head();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_head.add(head39.getTree());

                    // AST REWRITE
                    // elements: head
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 140:14: -> ^( AND head )
                    {
                        // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:140:17: ^( AND head )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(AND, "AND")
                        , root_1);

                        adaptor.addChild(root_1, stream_head.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:142:9: AND LPAR ( head )* RPAR
                    {
                    AND40=(Token)match(input,AND,FOLLOW_AND_in_head_conjunction869); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_AND.add(AND40);


                    LPAR41=(Token)match(input,LPAR,FOLLOW_LPAR_in_head_conjunction879); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAR.add(LPAR41);


                    // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:144:9: ( head )*
                    loop12:
                    do {
                        int alt12=2;
                        switch ( input.LA(1) ) {
                        case EXISTS:
                        case ID:
                        case LPAR:
                        case STRING:
                        case VAR_ID:
                            {
                            alt12=1;
                            }
                            break;

                        }

                        switch (alt12) {
                    	case 1 :
                    	    // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:144:9: head
                    	    {
                    	    pushFollow(FOLLOW_head_in_head_conjunction889);
                    	    head42=head();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_head.add(head42.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);


                    RPAR43=(Token)match(input,RPAR,FOLLOW_RPAR_in_head_conjunction900); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAR.add(RPAR43);


                    // AST REWRITE
                    // elements: head, AND
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 146:9: -> ^( AND ( head )* )
                    {
                        // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:146:12: ^( AND ( head )* )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_AND.nextNode()
                        , root_1);

                        // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:146:18: ( head )*
                        while ( stream_head.hasNext() ) {
                            adaptor.addChild(root_1, stream_head.nextTree());

                        }
                        stream_head.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "head_conjunction"


    public static class head_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "head"
    // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:150:1: head : ( EXISTS ( VAR_ID )+ LPAR atomic RPAR -> ^( EXISTS ^( VAR_LIST ( VAR_ID )+ ) atomic ) | atomic -> atomic );
    public final RuleMLPresentationSyntaxParser.head_return head() throws RecognitionException {
        RuleMLPresentationSyntaxParser.head_return retval = new RuleMLPresentationSyntaxParser.head_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token EXISTS44=null;
        Token VAR_ID45=null;
        Token LPAR46=null;
        Token RPAR48=null;
        RuleMLPresentationSyntaxParser.atomic_return atomic47 =null;

        RuleMLPresentationSyntaxParser.atomic_return atomic49 =null;


        Object EXISTS44_tree=null;
        Object VAR_ID45_tree=null;
        Object LPAR46_tree=null;
        Object RPAR48_tree=null;
        RewriteRuleTokenStream stream_RPAR=new RewriteRuleTokenStream(adaptor,"token RPAR");
        RewriteRuleTokenStream stream_VAR_ID=new RewriteRuleTokenStream(adaptor,"token VAR_ID");
        RewriteRuleTokenStream stream_EXISTS=new RewriteRuleTokenStream(adaptor,"token EXISTS");
        RewriteRuleTokenStream stream_LPAR=new RewriteRuleTokenStream(adaptor,"token LPAR");
        RewriteRuleSubtreeStream stream_atomic=new RewriteRuleSubtreeStream(adaptor,"rule atomic");
        try {
            // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:151:5: ( EXISTS ( VAR_ID )+ LPAR atomic RPAR -> ^( EXISTS ^( VAR_LIST ( VAR_ID )+ ) atomic ) | atomic -> atomic )
            int alt15=2;
            switch ( input.LA(1) ) {
            case EXISTS:
                {
                alt15=1;
                }
                break;
            case ID:
            case LPAR:
            case STRING:
            case VAR_ID:
                {
                alt15=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;

            }

            switch (alt15) {
                case 1 :
                    // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:152:9: EXISTS ( VAR_ID )+ LPAR atomic RPAR
                    {
                    EXISTS44=(Token)match(input,EXISTS,FOLLOW_EXISTS_in_head945); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EXISTS.add(EXISTS44);


                    // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:153:9: ( VAR_ID )+
                    int cnt14=0;
                    loop14:
                    do {
                        int alt14=2;
                        switch ( input.LA(1) ) {
                        case VAR_ID:
                            {
                            alt14=1;
                            }
                            break;

                        }

                        switch (alt14) {
                    	case 1 :
                    	    // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:153:9: VAR_ID
                    	    {
                    	    VAR_ID45=(Token)match(input,VAR_ID,FOLLOW_VAR_ID_in_head956); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_VAR_ID.add(VAR_ID45);


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt14 >= 1 ) break loop14;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(14, input);
                                throw eee;
                        }
                        cnt14++;
                    } while (true);


                    LPAR46=(Token)match(input,LPAR,FOLLOW_LPAR_in_head967); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAR.add(LPAR46);


                    pushFollow(FOLLOW_atomic_in_head977);
                    atomic47=atomic();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_atomic.add(atomic47.getTree());

                    RPAR48=(Token)match(input,RPAR,FOLLOW_RPAR_in_head987); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAR.add(RPAR48);


                    // AST REWRITE
                    // elements: VAR_ID, EXISTS, atomic
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 157:9: -> ^( EXISTS ^( VAR_LIST ( VAR_ID )+ ) atomic )
                    {
                        // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:157:12: ^( EXISTS ^( VAR_LIST ( VAR_ID )+ ) atomic )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        stream_EXISTS.nextNode()
                        , root_1);

                        // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:157:21: ^( VAR_LIST ( VAR_ID )+ )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(VAR_LIST, "VAR_LIST")
                        , root_2);

                        if ( !(stream_VAR_ID.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_VAR_ID.hasNext() ) {
                            adaptor.addChild(root_2, 
                            stream_VAR_ID.nextNode()
                            );

                        }
                        stream_VAR_ID.reset();

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_1, stream_atomic.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:159:9: atomic
                    {
                    pushFollow(FOLLOW_atomic_in_head1026);
                    atomic49=atomic();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_atomic.add(atomic49.getTree());

                    // AST REWRITE
                    // elements: atomic
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 159:16: -> atomic
                    {
                        adaptor.addChild(root_0, stream_atomic.nextTree());

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "head"


    public static class atomic_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "atomic"
    // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:164:1: atomic : ( ( equal )=> equal -> equal | ( subclass )=> subclass -> subclass | atom -> atom );
    public final RuleMLPresentationSyntaxParser.atomic_return atomic() throws RecognitionException {
        RuleMLPresentationSyntaxParser.atomic_return retval = new RuleMLPresentationSyntaxParser.atomic_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        RuleMLPresentationSyntaxParser.equal_return equal50 =null;

        RuleMLPresentationSyntaxParser.subclass_return subclass51 =null;

        RuleMLPresentationSyntaxParser.atom_return atom52 =null;


        RewriteRuleSubtreeStream stream_atom=new RewriteRuleSubtreeStream(adaptor,"rule atom");
        RewriteRuleSubtreeStream stream_subclass=new RewriteRuleSubtreeStream(adaptor,"rule subclass");
        RewriteRuleSubtreeStream stream_equal=new RewriteRuleSubtreeStream(adaptor,"rule equal");
        try {
            // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:165:5: ( ( equal )=> equal -> equal | ( subclass )=> subclass -> subclass | atom -> atom )
            int alt16=3;
            switch ( input.LA(1) ) {
            case STRING:
                {
                int LA16_1 = input.LA(2);

                if ( (synpred2_RuleMLPresentationSyntax()) ) {
                    alt16=1;
                }
                else if ( (synpred3_RuleMLPresentationSyntax()) ) {
                    alt16=2;
                }
                else if ( (true) ) {
                    alt16=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 1, input);

                    throw nvae;

                }
                }
                break;
            case ID:
                {
                int LA16_2 = input.LA(2);

                if ( (synpred2_RuleMLPresentationSyntax()) ) {
                    alt16=1;
                }
                else if ( (synpred3_RuleMLPresentationSyntax()) ) {
                    alt16=2;
                }
                else if ( (true) ) {
                    alt16=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 2, input);

                    throw nvae;

                }
                }
                break;
            case VAR_ID:
                {
                int LA16_3 = input.LA(2);

                if ( (synpred2_RuleMLPresentationSyntax()) ) {
                    alt16=1;
                }
                else if ( (synpred3_RuleMLPresentationSyntax()) ) {
                    alt16=2;
                }
                else if ( (true) ) {
                    alt16=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 3, input);

                    throw nvae;

                }
                }
                break;
            case LPAR:
                {
                int LA16_4 = input.LA(2);

                if ( (synpred2_RuleMLPresentationSyntax()) ) {
                    alt16=1;
                }
                else if ( (synpred3_RuleMLPresentationSyntax()) ) {
                    alt16=2;
                }
                else if ( (true) ) {
                    alt16=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 4, input);

                    throw nvae;

                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;

            }

            switch (alt16) {
                case 1 :
                    // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:166:9: ( equal )=> equal
                    {
                    pushFollow(FOLLOW_equal_in_atomic1064);
                    equal50=equal();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_equal.add(equal50.getTree());

                    // AST REWRITE
                    // elements: equal
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 166:26: -> equal
                    {
                        adaptor.addChild(root_0, stream_equal.nextTree());

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:168:9: ( subclass )=> subclass
                    {
                    pushFollow(FOLLOW_subclass_in_atomic1090);
                    subclass51=subclass();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_subclass.add(subclass51.getTree());

                    // AST REWRITE
                    // elements: subclass
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 168:32: -> subclass
                    {
                        adaptor.addChild(root_0, stream_subclass.nextTree());

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 3 :
                    // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:170:9: atom
                    {
                    pushFollow(FOLLOW_atom_in_atomic1110);
                    atom52=atom();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_atom.add(atom52.getTree());

                    // AST REWRITE
                    // elements: atom
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 170:14: -> atom
                    {
                        adaptor.addChild(root_0, stream_atom.nextTree());

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "atomic"


    public static class atom_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "atom"
    // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:174:1: atom : psoa -> psoa ;
    public final RuleMLPresentationSyntaxParser.atom_return atom() throws RecognitionException {
        RuleMLPresentationSyntaxParser.atom_return retval = new RuleMLPresentationSyntaxParser.atom_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        RuleMLPresentationSyntaxParser.psoa_return psoa53 =null;


        RewriteRuleSubtreeStream stream_psoa=new RewriteRuleSubtreeStream(adaptor,"rule psoa");
        try {
            // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:175:5: ( psoa -> psoa )
            // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:176:9: psoa
            {
            pushFollow(FOLLOW_psoa_in_atom1141);
            psoa53=psoa();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_psoa.add(psoa53.getTree());

            // AST REWRITE
            // elements: psoa
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 176:14: -> psoa
            {
                adaptor.addChild(root_0, stream_psoa.nextTree());

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "atom"


    public static class equal_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "equal"
    // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:183:1: equal : lhs= closed_term EQUAL rhs= closed_term -> ^( EQUAL $lhs $rhs) ;
    public final RuleMLPresentationSyntaxParser.equal_return equal() throws RecognitionException {
        RuleMLPresentationSyntaxParser.equal_return retval = new RuleMLPresentationSyntaxParser.equal_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token EQUAL54=null;
        RuleMLPresentationSyntaxParser.closed_term_return lhs =null;

        RuleMLPresentationSyntaxParser.closed_term_return rhs =null;


        Object EQUAL54_tree=null;
        RewriteRuleTokenStream stream_EQUAL=new RewriteRuleTokenStream(adaptor,"token EQUAL");
        RewriteRuleSubtreeStream stream_closed_term=new RewriteRuleSubtreeStream(adaptor,"rule closed_term");
        try {
            // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:184:5: (lhs= closed_term EQUAL rhs= closed_term -> ^( EQUAL $lhs $rhs) )
            // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:185:7: lhs= closed_term EQUAL rhs= closed_term
            {
            pushFollow(FOLLOW_closed_term_in_equal1175);
            lhs=closed_term();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_closed_term.add(lhs.getTree());

            EQUAL54=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_equal1183); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_EQUAL.add(EQUAL54);


            pushFollow(FOLLOW_closed_term_in_equal1196);
            rhs=closed_term();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_closed_term.add(rhs.getTree());

            // AST REWRITE
            // elements: EQUAL, rhs, lhs
            // token labels: 
            // rule labels: retval, rhs, lhs
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_rhs=new RewriteRuleSubtreeStream(adaptor,"rule rhs",rhs!=null?rhs.tree:null);
            RewriteRuleSubtreeStream stream_lhs=new RewriteRuleSubtreeStream(adaptor,"rule lhs",lhs!=null?lhs.tree:null);

            root_0 = (Object)adaptor.nil();
            // 188:7: -> ^( EQUAL $lhs $rhs)
            {
                // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:188:10: ^( EQUAL $lhs $rhs)
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_EQUAL.nextNode()
                , root_1);

                adaptor.addChild(root_1, stream_lhs.nextTree());

                adaptor.addChild(root_1, stream_rhs.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "equal"


    public static class subclass_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "subclass"
    // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:195:1: subclass : sub= closed_term SUBCLASS sup= closed_term -> ^( SUBCLASS $sub $sup) ;
    public final RuleMLPresentationSyntaxParser.subclass_return subclass() throws RecognitionException {
        RuleMLPresentationSyntaxParser.subclass_return retval = new RuleMLPresentationSyntaxParser.subclass_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token SUBCLASS55=null;
        RuleMLPresentationSyntaxParser.closed_term_return sub =null;

        RuleMLPresentationSyntaxParser.closed_term_return sup =null;


        Object SUBCLASS55_tree=null;
        RewriteRuleTokenStream stream_SUBCLASS=new RewriteRuleTokenStream(adaptor,"token SUBCLASS");
        RewriteRuleSubtreeStream stream_closed_term=new RewriteRuleSubtreeStream(adaptor,"rule closed_term");
        try {
            // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:196:5: (sub= closed_term SUBCLASS sup= closed_term -> ^( SUBCLASS $sub $sup) )
            // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:197:7: sub= closed_term SUBCLASS sup= closed_term
            {
            pushFollow(FOLLOW_closed_term_in_subclass1247);
            sub=closed_term();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_closed_term.add(sub.getTree());

            SUBCLASS55=(Token)match(input,SUBCLASS,FOLLOW_SUBCLASS_in_subclass1255); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SUBCLASS.add(SUBCLASS55);


            pushFollow(FOLLOW_closed_term_in_subclass1270);
            sup=closed_term();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_closed_term.add(sup.getTree());

            // AST REWRITE
            // elements: SUBCLASS, sub, sup
            // token labels: 
            // rule labels: retval, sub, sup
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_sub=new RewriteRuleSubtreeStream(adaptor,"rule sub",sub!=null?sub.tree:null);
            RewriteRuleSubtreeStream stream_sup=new RewriteRuleSubtreeStream(adaptor,"rule sup",sup!=null?sup.tree:null);

            root_0 = (Object)adaptor.nil();
            // 200:7: -> ^( SUBCLASS $sub $sup)
            {
                // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:200:10: ^( SUBCLASS $sub $sup)
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_SUBCLASS.nextNode()
                , root_1);

                adaptor.addChild(root_1, stream_sub.nextTree());

                adaptor.addChild(root_1, stream_sup.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "subclass"


    public static class tuple_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "tuple"
    // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:205:1: tuple : LSQBR ( term )* RSQBR -> ^( TUPLE ( term )* ) ;
    public final RuleMLPresentationSyntaxParser.tuple_return tuple() throws RecognitionException {
        RuleMLPresentationSyntaxParser.tuple_return retval = new RuleMLPresentationSyntaxParser.tuple_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token LSQBR56=null;
        Token RSQBR58=null;
        RuleMLPresentationSyntaxParser.term_return term57 =null;


        Object LSQBR56_tree=null;
        Object RSQBR58_tree=null;
        RewriteRuleTokenStream stream_LSQBR=new RewriteRuleTokenStream(adaptor,"token LSQBR");
        RewriteRuleTokenStream stream_RSQBR=new RewriteRuleTokenStream(adaptor,"token RSQBR");
        RewriteRuleSubtreeStream stream_term=new RewriteRuleSubtreeStream(adaptor,"rule term");
        try {
            // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:206:5: ( LSQBR ( term )* RSQBR -> ^( TUPLE ( term )* ) )
            // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:207:9: LSQBR ( term )* RSQBR
            {
            LSQBR56=(Token)match(input,LSQBR,FOLLOW_LSQBR_in_tuple1320); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LSQBR.add(LSQBR56);


            // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:208:9: ( term )*
            loop17:
            do {
                int alt17=2;
                switch ( input.LA(1) ) {
                case ID:
                case LPAR:
                case STRING:
                case VAR_ID:
                    {
                    alt17=1;
                    }
                    break;

                }

                switch (alt17) {
            	case 1 :
            	    // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:208:9: term
            	    {
            	    pushFollow(FOLLOW_term_in_tuple1331);
            	    term57=term();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_term.add(term57.getTree());

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            RSQBR58=(Token)match(input,RSQBR,FOLLOW_RSQBR_in_tuple1342); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RSQBR.add(RSQBR58);


            // AST REWRITE
            // elements: term
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 210:9: -> ^( TUPLE ( term )* )
            {
                // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:210:12: ^( TUPLE ( term )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(TUPLE, "TUPLE")
                , root_1);

                // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:210:20: ( term )*
                while ( stream_term.hasNext() ) {
                    adaptor.addChild(root_1, stream_term.nextTree());

                }
                stream_term.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "tuple"


    public static class slot_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "slot"
    // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:215:1: slot : name= term SLOT_ARROW value= term -> ^( SLOT $name $value) ;
    public final RuleMLPresentationSyntaxParser.slot_return slot() throws RecognitionException {
        RuleMLPresentationSyntaxParser.slot_return retval = new RuleMLPresentationSyntaxParser.slot_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token SLOT_ARROW59=null;
        RuleMLPresentationSyntaxParser.term_return name =null;

        RuleMLPresentationSyntaxParser.term_return value =null;


        Object SLOT_ARROW59_tree=null;
        RewriteRuleTokenStream stream_SLOT_ARROW=new RewriteRuleTokenStream(adaptor,"token SLOT_ARROW");
        RewriteRuleSubtreeStream stream_term=new RewriteRuleSubtreeStream(adaptor,"rule term");
        try {
            // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:216:5: (name= term SLOT_ARROW value= term -> ^( SLOT $name $value) )
            // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:217:7: name= term SLOT_ARROW value= term
            {
            pushFollow(FOLLOW_term_in_slot1389);
            name=term();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_term.add(name.getTree());

            SLOT_ARROW59=(Token)match(input,SLOT_ARROW,FOLLOW_SLOT_ARROW_in_slot1397); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SLOT_ARROW.add(SLOT_ARROW59);


            pushFollow(FOLLOW_term_in_slot1412);
            value=term();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_term.add(value.getTree());

            // AST REWRITE
            // elements: value, name
            // token labels: 
            // rule labels: retval, name, value
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_name=new RewriteRuleSubtreeStream(adaptor,"rule name",name!=null?name.tree:null);
            RewriteRuleSubtreeStream stream_value=new RewriteRuleSubtreeStream(adaptor,"rule value",value!=null?value.tree:null);

            root_0 = (Object)adaptor.nil();
            // 220:7: -> ^( SLOT $name $value)
            {
                // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:220:10: ^( SLOT $name $value)
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(SLOT, "SLOT")
                , root_1);

                adaptor.addChild(root_1, stream_name.nextTree());

                adaptor.addChild(root_1, stream_value.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "slot"


    public static class closed_term_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "closed_term"
    // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:225:1: closed_term : ( constant -> constant | VAR_ID -> ^( VAR VAR_ID ) | LPAR term RPAR -> term );
    public final RuleMLPresentationSyntaxParser.closed_term_return closed_term() throws RecognitionException {
        RuleMLPresentationSyntaxParser.closed_term_return retval = new RuleMLPresentationSyntaxParser.closed_term_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token VAR_ID61=null;
        Token LPAR62=null;
        Token RPAR64=null;
        RuleMLPresentationSyntaxParser.constant_return constant60 =null;

        RuleMLPresentationSyntaxParser.term_return term63 =null;


        Object VAR_ID61_tree=null;
        Object LPAR62_tree=null;
        Object RPAR64_tree=null;
        RewriteRuleTokenStream stream_RPAR=new RewriteRuleTokenStream(adaptor,"token RPAR");
        RewriteRuleTokenStream stream_VAR_ID=new RewriteRuleTokenStream(adaptor,"token VAR_ID");
        RewriteRuleTokenStream stream_LPAR=new RewriteRuleTokenStream(adaptor,"token LPAR");
        RewriteRuleSubtreeStream stream_constant=new RewriteRuleSubtreeStream(adaptor,"rule constant");
        RewriteRuleSubtreeStream stream_term=new RewriteRuleSubtreeStream(adaptor,"rule term");
        try {
            // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:226:5: ( constant -> constant | VAR_ID -> ^( VAR VAR_ID ) | LPAR term RPAR -> term )
            int alt18=3;
            switch ( input.LA(1) ) {
            case ID:
            case STRING:
                {
                alt18=1;
                }
                break;
            case VAR_ID:
                {
                alt18=2;
                }
                break;
            case LPAR:
                {
                alt18=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;

            }

            switch (alt18) {
                case 1 :
                    // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:227:8: constant
                    {
                    pushFollow(FOLLOW_constant_in_closed_term1459);
                    constant60=constant();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_constant.add(constant60.getTree());

                    // AST REWRITE
                    // elements: constant
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 227:17: -> constant
                    {
                        adaptor.addChild(root_0, stream_constant.nextTree());

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:229:9: VAR_ID
                    {
                    VAR_ID61=(Token)match(input,VAR_ID,FOLLOW_VAR_ID_in_closed_term1479); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_VAR_ID.add(VAR_ID61);


                    // AST REWRITE
                    // elements: VAR_ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 229:16: -> ^( VAR VAR_ID )
                    {
                        // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:229:19: ^( VAR VAR_ID )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(VAR, "VAR")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_VAR_ID.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 3 :
                    // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:231:9: LPAR term RPAR
                    {
                    LPAR62=(Token)match(input,LPAR,FOLLOW_LPAR_in_closed_term1503); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAR.add(LPAR62);


                    pushFollow(FOLLOW_term_in_closed_term1505);
                    term63=term();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_term.add(term63.getTree());

                    RPAR64=(Token)match(input,RPAR,FOLLOW_RPAR_in_closed_term1507); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAR.add(RPAR64);


                    // AST REWRITE
                    // elements: term
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 231:24: -> term
                    {
                        adaptor.addChild(root_0, stream_term.nextTree());

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "closed_term"


    public static class term_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "term"
    // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:238:1: term : ( ( psoa )=> psoa -> psoa | closed_term -> closed_term );
    public final RuleMLPresentationSyntaxParser.term_return term() throws RecognitionException {
        RuleMLPresentationSyntaxParser.term_return retval = new RuleMLPresentationSyntaxParser.term_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        RuleMLPresentationSyntaxParser.psoa_return psoa65 =null;

        RuleMLPresentationSyntaxParser.closed_term_return closed_term66 =null;


        RewriteRuleSubtreeStream stream_psoa=new RewriteRuleSubtreeStream(adaptor,"rule psoa");
        RewriteRuleSubtreeStream stream_closed_term=new RewriteRuleSubtreeStream(adaptor,"rule closed_term");
        try {
            // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:239:5: ( ( psoa )=> psoa -> psoa | closed_term -> closed_term )
            int alt19=2;
            switch ( input.LA(1) ) {
            case STRING:
                {
                int LA19_1 = input.LA(2);

                if ( (synpred4_RuleMLPresentationSyntax()) ) {
                    alt19=1;
                }
                else if ( (true) ) {
                    alt19=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 1, input);

                    throw nvae;

                }
                }
                break;
            case ID:
                {
                int LA19_2 = input.LA(2);

                if ( (synpred4_RuleMLPresentationSyntax()) ) {
                    alt19=1;
                }
                else if ( (true) ) {
                    alt19=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 2, input);

                    throw nvae;

                }
                }
                break;
            case VAR_ID:
                {
                int LA19_3 = input.LA(2);

                if ( (synpred4_RuleMLPresentationSyntax()) ) {
                    alt19=1;
                }
                else if ( (true) ) {
                    alt19=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 3, input);

                    throw nvae;

                }
                }
                break;
            case LPAR:
                {
                int LA19_4 = input.LA(2);

                if ( (synpred4_RuleMLPresentationSyntax()) ) {
                    alt19=1;
                }
                else if ( (true) ) {
                    alt19=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 4, input);

                    throw nvae;

                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;

            }

            switch (alt19) {
                case 1 :
                    // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:240:9: ( psoa )=> psoa
                    {
                    pushFollow(FOLLOW_psoa_in_term1545);
                    psoa65=psoa();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_psoa.add(psoa65.getTree());

                    // AST REWRITE
                    // elements: psoa
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 240:24: -> psoa
                    {
                        adaptor.addChild(root_0, stream_psoa.nextTree());

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:242:8: closed_term
                    {
                    pushFollow(FOLLOW_closed_term_in_term1564);
                    closed_term66=closed_term();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_closed_term.add(closed_term66.getTree());

                    // AST REWRITE
                    // elements: closed_term
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 242:20: -> closed_term
                    {
                        adaptor.addChild(root_0, stream_closed_term.nextTree());

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "term"


    public static class psoa_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "psoa"
    // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:246:1: psoa : obj= closed_term ( INSTANCE kl= closed_term )? LPAR ( tuple )* ( slot )* RPAR -> ^( PSOA $obj ( $kl)? ^( TUPLES ( tuple )* ) ^( SLOTS ( slot )* ) ) ;
    public final RuleMLPresentationSyntaxParser.psoa_return psoa() throws RecognitionException {
        RuleMLPresentationSyntaxParser.psoa_return retval = new RuleMLPresentationSyntaxParser.psoa_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token INSTANCE67=null;
        Token LPAR68=null;
        Token RPAR71=null;
        RuleMLPresentationSyntaxParser.closed_term_return obj =null;

        RuleMLPresentationSyntaxParser.closed_term_return kl =null;

        RuleMLPresentationSyntaxParser.tuple_return tuple69 =null;

        RuleMLPresentationSyntaxParser.slot_return slot70 =null;


        Object INSTANCE67_tree=null;
        Object LPAR68_tree=null;
        Object RPAR71_tree=null;
        RewriteRuleTokenStream stream_RPAR=new RewriteRuleTokenStream(adaptor,"token RPAR");
        RewriteRuleTokenStream stream_LPAR=new RewriteRuleTokenStream(adaptor,"token LPAR");
        RewriteRuleTokenStream stream_INSTANCE=new RewriteRuleTokenStream(adaptor,"token INSTANCE");
        RewriteRuleSubtreeStream stream_tuple=new RewriteRuleSubtreeStream(adaptor,"rule tuple");
        RewriteRuleSubtreeStream stream_closed_term=new RewriteRuleSubtreeStream(adaptor,"rule closed_term");
        RewriteRuleSubtreeStream stream_slot=new RewriteRuleSubtreeStream(adaptor,"rule slot");
        try {
            // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:247:5: (obj= closed_term ( INSTANCE kl= closed_term )? LPAR ( tuple )* ( slot )* RPAR -> ^( PSOA $obj ( $kl)? ^( TUPLES ( tuple )* ) ^( SLOTS ( slot )* ) ) )
            // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:248:9: obj= closed_term ( INSTANCE kl= closed_term )? LPAR ( tuple )* ( slot )* RPAR
            {
            pushFollow(FOLLOW_closed_term_in_psoa1597);
            obj=closed_term();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_closed_term.add(obj.getTree());

            // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:249:9: ( INSTANCE kl= closed_term )?
            int alt20=2;
            switch ( input.LA(1) ) {
                case INSTANCE:
                    {
                    alt20=1;
                    }
                    break;
            }

            switch (alt20) {
                case 1 :
                    // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:249:10: INSTANCE kl= closed_term
                    {
                    INSTANCE67=(Token)match(input,INSTANCE,FOLLOW_INSTANCE_in_psoa1608); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INSTANCE.add(INSTANCE67);


                    pushFollow(FOLLOW_closed_term_in_psoa1612);
                    kl=closed_term();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_closed_term.add(kl.getTree());

                    }
                    break;

            }


            LPAR68=(Token)match(input,LPAR,FOLLOW_LPAR_in_psoa1624); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAR.add(LPAR68);


            // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:251:9: ( tuple )*
            loop21:
            do {
                int alt21=2;
                switch ( input.LA(1) ) {
                case LSQBR:
                    {
                    alt21=1;
                    }
                    break;

                }

                switch (alt21) {
            	case 1 :
            	    // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:251:9: tuple
            	    {
            	    pushFollow(FOLLOW_tuple_in_psoa1634);
            	    tuple69=tuple();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_tuple.add(tuple69.getTree());

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);


            // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:252:9: ( slot )*
            loop22:
            do {
                int alt22=2;
                switch ( input.LA(1) ) {
                case ID:
                case LPAR:
                case STRING:
                case VAR_ID:
                    {
                    alt22=1;
                    }
                    break;

                }

                switch (alt22) {
            	case 1 :
            	    // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:252:9: slot
            	    {
            	    pushFollow(FOLLOW_slot_in_psoa1645);
            	    slot70=slot();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_slot.add(slot70.getTree());

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


            RPAR71=(Token)match(input,RPAR,FOLLOW_RPAR_in_psoa1656); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAR.add(RPAR71);


            // AST REWRITE
            // elements: tuple, kl, slot, obj
            // token labels: 
            // rule labels: retval, obj, kl
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_obj=new RewriteRuleSubtreeStream(adaptor,"rule obj",obj!=null?obj.tree:null);
            RewriteRuleSubtreeStream stream_kl=new RewriteRuleSubtreeStream(adaptor,"rule kl",kl!=null?kl.tree:null);

            root_0 = (Object)adaptor.nil();
            // 254:9: -> ^( PSOA $obj ( $kl)? ^( TUPLES ( tuple )* ) ^( SLOTS ( slot )* ) )
            {
                // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:255:9: ^( PSOA $obj ( $kl)? ^( TUPLES ( tuple )* ) ^( SLOTS ( slot )* ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(PSOA, "PSOA")
                , root_1);

                adaptor.addChild(root_1, stream_obj.nextTree());

                // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:255:22: ( $kl)?
                if ( stream_kl.hasNext() ) {
                    adaptor.addChild(root_1, stream_kl.nextTree());

                }
                stream_kl.reset();

                // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:255:26: ^( TUPLES ( tuple )* )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(TUPLES, "TUPLES")
                , root_2);

                // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:255:35: ( tuple )*
                while ( stream_tuple.hasNext() ) {
                    adaptor.addChild(root_2, stream_tuple.nextTree());

                }
                stream_tuple.reset();

                adaptor.addChild(root_1, root_2);
                }

                // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:255:43: ^( SLOTS ( slot )* )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(SLOTS, "SLOTS")
                , root_2);

                // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:255:51: ( slot )*
                while ( stream_slot.hasNext() ) {
                    adaptor.addChild(root_2, stream_slot.nextTree());

                }
                stream_slot.reset();

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "psoa"


    public static class constant_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "constant"
    // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:259:1: constant : ( const_literal -> const_literal | const_constshort -> const_constshort );
    public final RuleMLPresentationSyntaxParser.constant_return constant() throws RecognitionException {
        RuleMLPresentationSyntaxParser.constant_return retval = new RuleMLPresentationSyntaxParser.constant_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        RuleMLPresentationSyntaxParser.const_literal_return const_literal72 =null;

        RuleMLPresentationSyntaxParser.const_constshort_return const_constshort73 =null;


        RewriteRuleSubtreeStream stream_const_constshort=new RewriteRuleSubtreeStream(adaptor,"rule const_constshort");
        RewriteRuleSubtreeStream stream_const_literal=new RewriteRuleSubtreeStream(adaptor,"rule const_literal");
        try {
            // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:260:5: ( const_literal -> const_literal | const_constshort -> const_constshort )
            int alt23=2;
            switch ( input.LA(1) ) {
            case STRING:
                {
                alt23=1;
                }
                break;
            case ID:
                {
                alt23=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;

            }

            switch (alt23) {
                case 1 :
                    // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:261:9: const_literal
                    {
                    pushFollow(FOLLOW_const_literal_in_constant1729);
                    const_literal72=const_literal();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_const_literal.add(const_literal72.getTree());

                    // AST REWRITE
                    // elements: const_literal
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 261:23: -> const_literal
                    {
                        adaptor.addChild(root_0, stream_const_literal.nextTree());

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:263:9: const_constshort
                    {
                    pushFollow(FOLLOW_const_constshort_in_constant1749);
                    const_constshort73=const_constshort();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_const_constshort.add(const_constshort73.getTree());

                    // AST REWRITE
                    // elements: const_constshort
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 263:26: -> const_constshort
                    {
                        adaptor.addChild(root_0, stream_const_constshort.nextTree());

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "constant"


    public static class const_literal_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "const_literal"
    // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:268:1: const_literal : STRING SYMSPACE_OPER symspace -> ^( LITERAL STRING symspace ) ;
    public final RuleMLPresentationSyntaxParser.const_literal_return const_literal() throws RecognitionException {
        RuleMLPresentationSyntaxParser.const_literal_return retval = new RuleMLPresentationSyntaxParser.const_literal_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token STRING74=null;
        Token SYMSPACE_OPER75=null;
        RuleMLPresentationSyntaxParser.symspace_return symspace76 =null;


        Object STRING74_tree=null;
        Object SYMSPACE_OPER75_tree=null;
        RewriteRuleTokenStream stream_SYMSPACE_OPER=new RewriteRuleTokenStream(adaptor,"token SYMSPACE_OPER");
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");
        RewriteRuleSubtreeStream stream_symspace=new RewriteRuleSubtreeStream(adaptor,"rule symspace");
        try {
            // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:269:5: ( STRING SYMSPACE_OPER symspace -> ^( LITERAL STRING symspace ) )
            // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:270:9: STRING SYMSPACE_OPER symspace
            {
            STRING74=(Token)match(input,STRING,FOLLOW_STRING_in_const_literal1781); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_STRING.add(STRING74);


            SYMSPACE_OPER75=(Token)match(input,SYMSPACE_OPER,FOLLOW_SYMSPACE_OPER_in_const_literal1792); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SYMSPACE_OPER.add(SYMSPACE_OPER75);


            pushFollow(FOLLOW_symspace_in_const_literal1802);
            symspace76=symspace();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_symspace.add(symspace76.getTree());

            // AST REWRITE
            // elements: symspace, STRING
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 273:9: -> ^( LITERAL STRING symspace )
            {
                // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:273:12: ^( LITERAL STRING symspace )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(LITERAL, "LITERAL")
                , root_1);

                adaptor.addChild(root_1, 
                stream_STRING.nextNode()
                );

                adaptor.addChild(root_1, stream_symspace.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "const_literal"


    public static class const_constshort_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "const_constshort"
    // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:276:1: const_constshort : ID ;
    public final RuleMLPresentationSyntaxParser.const_constshort_return const_constshort() throws RecognitionException {
        RuleMLPresentationSyntaxParser.const_constshort_return retval = new RuleMLPresentationSyntaxParser.const_constshort_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID77=null;

        Object ID77_tree=null;

        try {
            // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:277:5: ( ID )
            // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:278:9: ID
            {
            root_0 = (Object)adaptor.nil();


            ID77=(Token)match(input,ID,FOLLOW_ID_in_const_constshort1851); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ID77_tree = 
            (Object)adaptor.create(ID77)
            ;
            adaptor.addChild(root_0, ID77_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "const_constshort"


    public static class symspace_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "symspace"
    // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:283:1: symspace : ( IRI_REF | ID );
    public final RuleMLPresentationSyntaxParser.symspace_return symspace() throws RecognitionException {
        RuleMLPresentationSyntaxParser.symspace_return retval = new RuleMLPresentationSyntaxParser.symspace_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set78=null;

        Object set78_tree=null;

        try {
            // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:284:4: ( IRI_REF | ID )
            // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:
            {
            root_0 = (Object)adaptor.nil();


            set78=(Token)input.LT(1);

            if ( input.LA(1)==ID||input.LA(1)==IRI_REF ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (Object)adaptor.create(set78)
                );
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "symspace"


    public static class formula_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "formula"
    // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:291:1: formula : ID ;
    public final RuleMLPresentationSyntaxParser.formula_return formula() throws RecognitionException {
        RuleMLPresentationSyntaxParser.formula_return retval = new RuleMLPresentationSyntaxParser.formula_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID79=null;

        Object ID79_tree=null;

        try {
            // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:292:5: ( ID )
            // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:292:7: ID
            {
            root_0 = (Object)adaptor.nil();


            ID79=(Token)match(input,ID,FOLLOW_ID_in_formula1902); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ID79_tree = 
            (Object)adaptor.create(ID79)
            ;
            adaptor.addChild(root_0, ID79_tree);
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "formula"

    // $ANTLR start synpred1_RuleMLPresentationSyntax
    public final void synpred1_RuleMLPresentationSyntax_fragment() throws RecognitionException {
        // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:123:8: ( implies )
        // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:123:9: implies
        {
        pushFollow(FOLLOW_implies_in_synpred1_RuleMLPresentationSyntax723);
        implies();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred1_RuleMLPresentationSyntax

    // $ANTLR start synpred2_RuleMLPresentationSyntax
    public final void synpred2_RuleMLPresentationSyntax_fragment() throws RecognitionException {
        // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:166:9: ( equal )
        // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:166:10: equal
        {
        pushFollow(FOLLOW_equal_in_synpred2_RuleMLPresentationSyntax1059);
        equal();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred2_RuleMLPresentationSyntax

    // $ANTLR start synpred3_RuleMLPresentationSyntax
    public final void synpred3_RuleMLPresentationSyntax_fragment() throws RecognitionException {
        // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:168:9: ( subclass )
        // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:168:10: subclass
        {
        pushFollow(FOLLOW_subclass_in_synpred3_RuleMLPresentationSyntax1085);
        subclass();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred3_RuleMLPresentationSyntax

    // $ANTLR start synpred4_RuleMLPresentationSyntax
    public final void synpred4_RuleMLPresentationSyntax_fragment() throws RecognitionException {
        // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:240:9: ( psoa )
        // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:240:10: psoa
        {
        pushFollow(FOLLOW_psoa_in_synpred4_RuleMLPresentationSyntax1540);
        psoa();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred4_RuleMLPresentationSyntax

    // Delegated rules

    public final boolean synpred1_RuleMLPresentationSyntax() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_RuleMLPresentationSyntax_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_RuleMLPresentationSyntax() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_RuleMLPresentationSyntax_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_RuleMLPresentationSyntax() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_RuleMLPresentationSyntax_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_RuleMLPresentationSyntax() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_RuleMLPresentationSyntax_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_document_in_top_level_item150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EOF_in_top_level_item158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BASE_in_base190 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_LPAR_in_base192 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_IRI_REF_in_base194 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_RPAR_in_base196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PREFIX_in_prefix238 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_LPAR_in_prefix240 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ID_in_prefix242 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_IRI_REF_in_prefix244 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_RPAR_in_prefix246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IMPORT_in_importDecl284 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_LPAR_in_importDecl286 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_IRI_REF_in_importDecl290 = new BitSet(new long[]{0x0000000802000000L});
    public static final BitSet FOLLOW_IRI_REF_in_importDecl295 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_RPAR_in_importDecl299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOCUMENT_in_document350 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_LPAR_in_document361 = new BitSet(new long[]{0x0000000900208040L});
    public static final BitSet FOLLOW_base_in_document371 = new BitSet(new long[]{0x0000000900208000L});
    public static final BitSet FOLLOW_prefix_in_document382 = new BitSet(new long[]{0x0000000900208000L});
    public static final BitSet FOLLOW_importDecl_in_document393 = new BitSet(new long[]{0x0000000800208000L});
    public static final BitSet FOLLOW_group_in_document404 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_RPAR_in_document415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GROUP_in_group477 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_LPAR_in_group488 = new BitSet(new long[]{0x000041082002B020L});
    public static final BitSet FOLLOW_group_element_in_group499 = new BitSet(new long[]{0x000041082002B020L});
    public static final BitSet FOLLOW_RPAR_in_group510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule_in_group_element560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_group_in_group_element580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FORALL_in_rule610 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_VAR_ID_in_rule621 = new BitSet(new long[]{0x0000400020000000L});
    public static final BitSet FOLLOW_LPAR_in_rule632 = new BitSet(new long[]{0x0000410020021020L});
    public static final BitSet FOLLOW_clause_in_rule642 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_RPAR_in_rule652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_clause_in_rule691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_implies_in_clause728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atomic_in_clause748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_head_conjunction_in_implies779 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_IMPLICATION_in_implies789 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_formula_in_implies799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_head_in_head_conjunction845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AND_in_head_conjunction869 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_LPAR_in_head_conjunction879 = new BitSet(new long[]{0x0000410820021000L});
    public static final BitSet FOLLOW_head_in_head_conjunction889 = new BitSet(new long[]{0x0000410820021000L});
    public static final BitSet FOLLOW_RPAR_in_head_conjunction900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXISTS_in_head945 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_VAR_ID_in_head956 = new BitSet(new long[]{0x0000400020000000L});
    public static final BitSet FOLLOW_LPAR_in_head967 = new BitSet(new long[]{0x0000410020020000L});
    public static final BitSet FOLLOW_atomic_in_head977 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_RPAR_in_head987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atomic_in_head1026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_equal_in_atomic1064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_subclass_in_atomic1090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_in_atomic1110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_psoa_in_atom1141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_closed_term_in_equal1175 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_EQUAL_in_equal1183 = new BitSet(new long[]{0x0000410020020000L});
    public static final BitSet FOLLOW_closed_term_in_equal1196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_closed_term_in_subclass1247 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_SUBCLASS_in_subclass1255 = new BitSet(new long[]{0x0000410020020000L});
    public static final BitSet FOLLOW_closed_term_in_subclass1270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LSQBR_in_tuple1320 = new BitSet(new long[]{0x0000411020020000L});
    public static final BitSet FOLLOW_term_in_tuple1331 = new BitSet(new long[]{0x0000411020020000L});
    public static final BitSet FOLLOW_RSQBR_in_tuple1342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_slot1389 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_SLOT_ARROW_in_slot1397 = new BitSet(new long[]{0x0000410020020000L});
    public static final BitSet FOLLOW_term_in_slot1412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constant_in_closed_term1459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_ID_in_closed_term1479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAR_in_closed_term1503 = new BitSet(new long[]{0x0000410020020000L});
    public static final BitSet FOLLOW_term_in_closed_term1505 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_RPAR_in_closed_term1507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_psoa_in_term1545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_closed_term_in_term1564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_closed_term_in_psoa1597 = new BitSet(new long[]{0x0000000020800000L});
    public static final BitSet FOLLOW_INSTANCE_in_psoa1608 = new BitSet(new long[]{0x0000410020020000L});
    public static final BitSet FOLLOW_closed_term_in_psoa1612 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_LPAR_in_psoa1624 = new BitSet(new long[]{0x0000410860020000L});
    public static final BitSet FOLLOW_tuple_in_psoa1634 = new BitSet(new long[]{0x0000410860020000L});
    public static final BitSet FOLLOW_slot_in_psoa1645 = new BitSet(new long[]{0x0000410820020000L});
    public static final BitSet FOLLOW_RPAR_in_psoa1656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_const_literal_in_constant1729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_const_constshort_in_constant1749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_const_literal1781 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_SYMSPACE_OPER_in_const_literal1792 = new BitSet(new long[]{0x0000000002020000L});
    public static final BitSet FOLLOW_symspace_in_const_literal1802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_const_constshort1851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_formula1902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_implies_in_synpred1_RuleMLPresentationSyntax723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_equal_in_synpred2_RuleMLPresentationSyntax1059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_subclass_in_synpred3_RuleMLPresentationSyntax1085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_psoa_in_synpred4_RuleMLPresentationSyntax1540 = new BitSet(new long[]{0x0000000000000002L});

}