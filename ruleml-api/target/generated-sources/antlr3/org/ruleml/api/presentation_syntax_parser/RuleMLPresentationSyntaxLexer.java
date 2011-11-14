// $ANTLR 3.4 org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g 2011-11-14 16:49:54

    package org.ruleml.api.presentation_syntax_parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class RuleMLPresentationSyntaxLexer extends Lexer {
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
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public RuleMLPresentationSyntaxLexer() {} 
    public RuleMLPresentationSyntaxLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public RuleMLPresentationSyntaxLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g"; }

    // $ANTLR start "WHITESPACE"
    public final void mWHITESPACE() throws RecognitionException {
        try {
            int _type = WHITESPACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:304:13: ( ( ' ' | '\\t' '\\n' | '\\r' )+ )
            // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:304:16: ( ' ' | '\\t' '\\n' | '\\r' )+
            {
            // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:304:16: ( ' ' | '\\t' '\\n' | '\\r' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=4;
                switch ( input.LA(1) ) {
                case ' ':
                    {
                    alt1=1;
                    }
                    break;
                case '\t':
                    {
                    alt1=2;
                    }
                    break;
                case '\r':
                    {
                    alt1=3;
                    }
                    break;

                }

                switch (alt1) {
            	case 1 :
            	    // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:304:17: ' '
            	    {
            	    match(' '); 

            	    }
            	    break;
            	case 2 :
            	    // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:304:21: '\\t' '\\n'
            	    {
            	    match('\t'); 

            	    match('\n'); 

            	    }
            	    break;
            	case 3 :
            	    // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:304:30: '\\r'
            	    {
            	    match('\r'); 

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            skip();

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WHITESPACE"

    // $ANTLR start "MULTI_LINE_COMMENT"
    public final void mMULTI_LINE_COMMENT() throws RecognitionException {
        try {
            int _type = MULTI_LINE_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:306:20: ( '<!--' ( options {greedy=false; } : ( . )* ) '-->' )
            // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:306:23: '<!--' ( options {greedy=false; } : ( . )* ) '-->'
            {
            match("<!--"); 



            // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:306:30: ( options {greedy=false; } : ( . )* )
            // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:306:57: ( . )*
            {
            // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:306:57: ( . )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='-') ) {
                    int LA2_1 = input.LA(2);

                    if ( (LA2_1=='-') ) {
                        int LA2_3 = input.LA(3);

                        if ( (LA2_3=='>') ) {
                            alt2=2;
                        }
                        else if ( ((LA2_3 >= '\u0000' && LA2_3 <= '=')||(LA2_3 >= '?' && LA2_3 <= '\uFFFF')) ) {
                            alt2=1;
                        }


                    }
                    else if ( ((LA2_1 >= '\u0000' && LA2_1 <= ',')||(LA2_1 >= '.' && LA2_1 <= '\uFFFF')) ) {
                        alt2=1;
                    }


                }
                else if ( ((LA2_0 >= '\u0000' && LA2_0 <= ',')||(LA2_0 >= '.' && LA2_0 <= '\uFFFF')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:306:57: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            match("-->"); 



            _channel=HIDDEN; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MULTI_LINE_COMMENT"

    // $ANTLR start "DOCUMENT"
    public final void mDOCUMENT() throws RecognitionException {
        try {
            int _type = DOCUMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:312:10: ( 'Document' )
            // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:312:12: 'Document'
            {
            match("Document"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DOCUMENT"

    // $ANTLR start "BASE"
    public final void mBASE() throws RecognitionException {
        try {
            int _type = BASE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:314:6: ( 'Base' )
            // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:314:8: 'Base'
            {
            match("Base"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BASE"

    // $ANTLR start "IMPORT"
    public final void mIMPORT() throws RecognitionException {
        try {
            int _type = IMPORT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:316:8: ( 'Import' )
            // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:316:10: 'Import'
            {
            match("Import"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IMPORT"

    // $ANTLR start "PREFIX"
    public final void mPREFIX() throws RecognitionException {
        try {
            int _type = PREFIX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:318:8: ( 'Prefix' )
            // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:318:10: 'Prefix'
            {
            match("Prefix"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PREFIX"

    // $ANTLR start "GROUP"
    public final void mGROUP() throws RecognitionException {
        try {
            int _type = GROUP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:320:7: ( 'Group' )
            // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:320:9: 'Group'
            {
            match("Group"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "GROUP"

    // $ANTLR start "FORALL"
    public final void mFORALL() throws RecognitionException {
        try {
            int _type = FORALL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:322:8: ( 'Forall' )
            // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:322:10: 'Forall'
            {
            match("Forall"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FORALL"

    // $ANTLR start "EXISTS"
    public final void mEXISTS() throws RecognitionException {
        try {
            int _type = EXISTS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:324:8: ( 'Exists' )
            // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:324:10: 'Exists'
            {
            match("Exists"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EXISTS"

    // $ANTLR start "AND"
    public final void mAND() throws RecognitionException {
        try {
            int _type = AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:326:5: ( 'And' )
            // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:326:7: 'And'
            {
            match("And"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "AND"

    // $ANTLR start "IRI_REF"
    public final void mIRI_REF() throws RecognitionException {
        try {
            int _type = IRI_REF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:332:9: ( '<' IRI_START_CHAR ( IRI_CHAR )+ '>' )
            // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:332:11: '<' IRI_START_CHAR ( IRI_CHAR )+ '>'
            {
            match('<'); 

            mIRI_START_CHAR(); 


            // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:332:30: ( IRI_CHAR )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                switch ( input.LA(1) ) {
                case '!':
                case '#':
                case '$':
                case '%':
                case '&':
                case '\'':
                case '(':
                case ')':
                case '*':
                case '+':
                case ',':
                case '-':
                case '.':
                case '/':
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                case ':':
                case ';':
                case '=':
                case '?':
                case '@':
                case 'A':
                case 'B':
                case 'C':
                case 'D':
                case 'E':
                case 'F':
                case 'G':
                case 'H':
                case 'I':
                case 'J':
                case 'K':
                case 'L':
                case 'M':
                case 'N':
                case 'O':
                case 'P':
                case 'Q':
                case 'R':
                case 'S':
                case 'T':
                case 'U':
                case 'V':
                case 'W':
                case 'X':
                case 'Y':
                case 'Z':
                case '_':
                case 'a':
                case 'b':
                case 'c':
                case 'd':
                case 'e':
                case 'f':
                case 'g':
                case 'h':
                case 'i':
                case 'j':
                case 'k':
                case 'l':
                case 'm':
                case 'n':
                case 'o':
                case 'p':
                case 'q':
                case 'r':
                case 's':
                case 't':
                case 'u':
                case 'v':
                case 'w':
                case 'x':
                case 'y':
                case 'z':
                case '~':
                    {
                    alt3=1;
                    }
                    break;

                }

                switch (alt3) {
            	case 1 :
            	    // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:
            	    {
            	    if ( input.LA(1)=='!'||(input.LA(1) >= '#' && input.LA(1) <= ';')||input.LA(1)=='='||(input.LA(1) >= '?' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z')||input.LA(1)=='~' ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IRI_REF"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:335:4: ( ID_START_CHAR ( ID_CHAR )* )
            // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:335:6: ID_START_CHAR ( ID_CHAR )*
            {
            mID_START_CHAR(); 


            // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:335:20: ( ID_CHAR )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0 >= '-' && LA4_0 <= '.')||(LA4_0 >= '0' && LA4_0 <= ':')||(LA4_0 >= 'A' && LA4_0 <= 'Z')||LA4_0=='_'||(LA4_0 >= 'a' && LA4_0 <= 'z')||LA4_0=='\u00B7'||(LA4_0 >= '\u00C0' && LA4_0 <= '\u00D6')||(LA4_0 >= '\u00D8' && LA4_0 <= '\u00F6')||(LA4_0 >= '\u00F8' && LA4_0 <= '\u02FF')||(LA4_0 >= '\u0370' && LA4_0 <= '\u037D')||(LA4_0 >= '\u037F' && LA4_0 <= '\u1FFF')||(LA4_0 >= '\u200C' && LA4_0 <= '\u200D')||(LA4_0 >= '\u203F' && LA4_0 <= '\u2040')||(LA4_0 >= '\u2070' && LA4_0 <= '\u218F')||(LA4_0 >= '\u2C00' && LA4_0 <= '\u2FEF')||(LA4_0 >= '\u3001' && LA4_0 <= '\uD7FF')||(LA4_0 >= '\uF900' && LA4_0 <= '\uFDCF')||(LA4_0 >= '\uFDF0' && LA4_0 <= '\uFFFD')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:
            	    {
            	    if ( (input.LA(1) >= '-' && input.LA(1) <= '.')||(input.LA(1) >= '0' && input.LA(1) <= ':')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z')||input.LA(1)=='\u00B7'||(input.LA(1) >= '\u00C0' && input.LA(1) <= '\u00D6')||(input.LA(1) >= '\u00D8' && input.LA(1) <= '\u00F6')||(input.LA(1) >= '\u00F8' && input.LA(1) <= '\u02FF')||(input.LA(1) >= '\u0370' && input.LA(1) <= '\u037D')||(input.LA(1) >= '\u037F' && input.LA(1) <= '\u1FFF')||(input.LA(1) >= '\u200C' && input.LA(1) <= '\u200D')||(input.LA(1) >= '\u203F' && input.LA(1) <= '\u2040')||(input.LA(1) >= '\u2070' && input.LA(1) <= '\u218F')||(input.LA(1) >= '\u2C00' && input.LA(1) <= '\u2FEF')||(input.LA(1) >= '\u3001' && input.LA(1) <= '\uD7FF')||(input.LA(1) >= '\uF900' && input.LA(1) <= '\uFDCF')||(input.LA(1) >= '\uFDF0' && input.LA(1) <= '\uFFFD') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "VAR_ID"
    public final void mVAR_ID() throws RecognitionException {
        try {
            int _type = VAR_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:337:8: ( '?' ( ID_CHAR )* )
            // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:337:10: '?' ( ID_CHAR )*
            {
            match('?'); 

            // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:337:14: ( ID_CHAR )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0 >= '-' && LA5_0 <= '.')||(LA5_0 >= '0' && LA5_0 <= ':')||(LA5_0 >= 'A' && LA5_0 <= 'Z')||LA5_0=='_'||(LA5_0 >= 'a' && LA5_0 <= 'z')||LA5_0=='\u00B7'||(LA5_0 >= '\u00C0' && LA5_0 <= '\u00D6')||(LA5_0 >= '\u00D8' && LA5_0 <= '\u00F6')||(LA5_0 >= '\u00F8' && LA5_0 <= '\u02FF')||(LA5_0 >= '\u0370' && LA5_0 <= '\u037D')||(LA5_0 >= '\u037F' && LA5_0 <= '\u1FFF')||(LA5_0 >= '\u200C' && LA5_0 <= '\u200D')||(LA5_0 >= '\u203F' && LA5_0 <= '\u2040')||(LA5_0 >= '\u2070' && LA5_0 <= '\u218F')||(LA5_0 >= '\u2C00' && LA5_0 <= '\u2FEF')||(LA5_0 >= '\u3001' && LA5_0 <= '\uD7FF')||(LA5_0 >= '\uF900' && LA5_0 <= '\uFDCF')||(LA5_0 >= '\uFDF0' && LA5_0 <= '\uFFFD')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:
            	    {
            	    if ( (input.LA(1) >= '-' && input.LA(1) <= '.')||(input.LA(1) >= '0' && input.LA(1) <= ':')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z')||input.LA(1)=='\u00B7'||(input.LA(1) >= '\u00C0' && input.LA(1) <= '\u00D6')||(input.LA(1) >= '\u00D8' && input.LA(1) <= '\u00F6')||(input.LA(1) >= '\u00F8' && input.LA(1) <= '\u02FF')||(input.LA(1) >= '\u0370' && input.LA(1) <= '\u037D')||(input.LA(1) >= '\u037F' && input.LA(1) <= '\u1FFF')||(input.LA(1) >= '\u200C' && input.LA(1) <= '\u200D')||(input.LA(1) >= '\u203F' && input.LA(1) <= '\u2040')||(input.LA(1) >= '\u2070' && input.LA(1) <= '\u218F')||(input.LA(1) >= '\u2C00' && input.LA(1) <= '\u2FEF')||(input.LA(1) >= '\u3001' && input.LA(1) <= '\uD7FF')||(input.LA(1) >= '\uF900' && input.LA(1) <= '\uFDCF')||(input.LA(1) >= '\uFDF0' && input.LA(1) <= '\uFFFD') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "VAR_ID"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:341:8: ( '\"' ( options {greedy=false; } :~ ( '\"' | '\\\\' | EOL ) | ECHAR )* '\"' )
            // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:341:10: '\"' ( options {greedy=false; } :~ ( '\"' | '\\\\' | EOL ) | ECHAR )* '\"'
            {
            match('\"'); 

            // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:341:14: ( options {greedy=false; } :~ ( '\"' | '\\\\' | EOL ) | ECHAR )*
            loop6:
            do {
                int alt6=3;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0 >= '\u0000' && LA6_0 <= '\t')||(LA6_0 >= '\u000B' && LA6_0 <= '\f')||(LA6_0 >= '\u000E' && LA6_0 <= '!')||(LA6_0 >= '#' && LA6_0 <= '[')||(LA6_0 >= ']' && LA6_0 <= '\uFFFF')) ) {
                    alt6=1;
                }
                else if ( (LA6_0=='\\') ) {
                    alt6=2;
                }
                else if ( (LA6_0=='\"') ) {
                    alt6=3;
                }


                switch (alt6) {
            	case 1 :
            	    // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:341:41: ~ ( '\"' | '\\\\' | EOL )
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;
            	case 2 :
            	    // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:341:63: ECHAR
            	    {
            	    mECHAR(); 


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STRING"

    // $ANTLR start "IMPLICATION"
    public final void mIMPLICATION() throws RecognitionException {
        try {
            int _type = IMPLICATION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:345:13: ( ':-' )
            // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:345:15: ':-'
            {
            match(":-"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IMPLICATION"

    // $ANTLR start "EQUAL"
    public final void mEQUAL() throws RecognitionException {
        try {
            int _type = EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:346:7: ( '=' )
            // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:346:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EQUAL"

    // $ANTLR start "SUBCLASS"
    public final void mSUBCLASS() throws RecognitionException {
        try {
            int _type = SUBCLASS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:347:10: ( '##' )
            // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:347:12: '##'
            {
            match("##"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SUBCLASS"

    // $ANTLR start "INSTANCE"
    public final void mINSTANCE() throws RecognitionException {
        try {
            int _type = INSTANCE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:348:10: ( '#' )
            // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:348:12: '#'
            {
            match('#'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INSTANCE"

    // $ANTLR start "SLOT_ARROW"
    public final void mSLOT_ARROW() throws RecognitionException {
        try {
            int _type = SLOT_ARROW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:349:12: ( '->' )
            // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:349:14: '->'
            {
            match("->"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SLOT_ARROW"

    // $ANTLR start "SYMSPACE_OPER"
    public final void mSYMSPACE_OPER() throws RecognitionException {
        try {
            int _type = SYMSPACE_OPER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:350:15: ( '^^' )
            // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:350:17: '^^'
            {
            match("^^"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SYMSPACE_OPER"

    // $ANTLR start "LPAR"
    public final void mLPAR() throws RecognitionException {
        try {
            int _type = LPAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:354:6: ( '(' )
            // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:354:8: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LPAR"

    // $ANTLR start "RPAR"
    public final void mRPAR() throws RecognitionException {
        try {
            int _type = RPAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:355:6: ( ')' )
            // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:355:8: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RPAR"

    // $ANTLR start "LESS"
    public final void mLESS() throws RecognitionException {
        try {
            int _type = LESS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:356:6: ( '<' )
            // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:356:8: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LESS"

    // $ANTLR start "GREATER"
    public final void mGREATER() throws RecognitionException {
        try {
            int _type = GREATER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:357:9: ( '>' )
            // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:357:11: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "GREATER"

    // $ANTLR start "LSQBR"
    public final void mLSQBR() throws RecognitionException {
        try {
            int _type = LSQBR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:358:7: ( '[' )
            // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:358:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LSQBR"

    // $ANTLR start "RSQBR"
    public final void mRSQBR() throws RecognitionException {
        try {
            int _type = RSQBR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:359:7: ( ']' )
            // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:359:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RSQBR"

    // $ANTLR start "ALPHA"
    public final void mALPHA() throws RecognitionException {
        try {
            // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:368:16: ( 'a' .. 'z' | 'A' .. 'Z' )
            // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ALPHA"

    // $ANTLR start "DIGIT"
    public final void mDIGIT() throws RecognitionException {
        try {
            // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:370:16: ( '0' .. '9' )
            // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:
            {
            if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DIGIT"

    // $ANTLR start "IRI_CHAR"
    public final void mIRI_CHAR() throws RecognitionException {
        try {
            // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:373:19: ( ALPHA | DIGIT | '+' | '-' | '.' | '@' | ':' | '_' | '~' | '%' | '!' | '$' | '&' | '\\'' | '(' | ')' | '*' | ',' | ';' | '=' | '?' | '#' | '/' )
            // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:
            {
            if ( input.LA(1)=='!'||(input.LA(1) >= '#' && input.LA(1) <= ';')||input.LA(1)=='='||(input.LA(1) >= '?' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z')||input.LA(1)=='~' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IRI_CHAR"

    // $ANTLR start "IRI_START_CHAR"
    public final void mIRI_START_CHAR() throws RecognitionException {
        try {
            // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:378:25: ( ALPHA )
            // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IRI_START_CHAR"

    // $ANTLR start "ID_CHAR"
    public final void mID_CHAR() throws RecognitionException {
        try {
            // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:382:5: ( ALPHA | '\\u00C0' .. '\\u00D6' | '\\u00D8' .. '\\u00F6' | '\\u00F8' .. '\\u02FF' | '\\u0370' .. '\\u037D' | '\\u037F' .. '\\u1FFF' | '\\u200C' .. '\\u200D' | '\\u2070' .. '\\u218F' | '\\u2C00' .. '\\u2FEF' | '\\u3001' .. '\\uD7FF' | '\\uF900' .. '\\uFDCF' | '\\uFDF0' .. '\\uFFFD' | DIGIT | '_' | '-' | '\\u00B7' | '\\u203F' .. '\\u2040' | ':' | '.' )
            // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:
            {
            if ( (input.LA(1) >= '-' && input.LA(1) <= '.')||(input.LA(1) >= '0' && input.LA(1) <= ':')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z')||input.LA(1)=='\u00B7'||(input.LA(1) >= '\u00C0' && input.LA(1) <= '\u00D6')||(input.LA(1) >= '\u00D8' && input.LA(1) <= '\u00F6')||(input.LA(1) >= '\u00F8' && input.LA(1) <= '\u02FF')||(input.LA(1) >= '\u0370' && input.LA(1) <= '\u037D')||(input.LA(1) >= '\u037F' && input.LA(1) <= '\u1FFF')||(input.LA(1) >= '\u200C' && input.LA(1) <= '\u200D')||(input.LA(1) >= '\u203F' && input.LA(1) <= '\u2040')||(input.LA(1) >= '\u2070' && input.LA(1) <= '\u218F')||(input.LA(1) >= '\u2C00' && input.LA(1) <= '\u2FEF')||(input.LA(1) >= '\u3001' && input.LA(1) <= '\uD7FF')||(input.LA(1) >= '\uF900' && input.LA(1) <= '\uFDCF')||(input.LA(1) >= '\uFDF0' && input.LA(1) <= '\uFFFD') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ID_CHAR"

    // $ANTLR start "ID_START_CHAR"
    public final void mID_START_CHAR() throws RecognitionException {
        try {
            // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:406:5: ( ALPHA | '\\u00C0' .. '\\u00D6' | '\\u00D8' .. '\\u00F6' | '\\u00F8' .. '\\u02FF' | '\\u0370' .. '\\u037D' | '\\u037F' .. '\\u1FFF' | '\\u200C' .. '\\u200D' | '\\u2070' .. '\\u218F' | '\\u2C00' .. '\\u2FEF' | '\\u3001' .. '\\uD7FF' | '\\uF900' .. '\\uFDCF' | '\\uFDF0' .. '\\uFFFD' | DIGIT | '_' )
            // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:
            {
            if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z')||(input.LA(1) >= '\u00C0' && input.LA(1) <= '\u00D6')||(input.LA(1) >= '\u00D8' && input.LA(1) <= '\u00F6')||(input.LA(1) >= '\u00F8' && input.LA(1) <= '\u02FF')||(input.LA(1) >= '\u0370' && input.LA(1) <= '\u037D')||(input.LA(1) >= '\u037F' && input.LA(1) <= '\u1FFF')||(input.LA(1) >= '\u200C' && input.LA(1) <= '\u200D')||(input.LA(1) >= '\u2070' && input.LA(1) <= '\u218F')||(input.LA(1) >= '\u2C00' && input.LA(1) <= '\u2FEF')||(input.LA(1) >= '\u3001' && input.LA(1) <= '\uD7FF')||(input.LA(1) >= '\uF900' && input.LA(1) <= '\uFDCF')||(input.LA(1) >= '\uFDF0' && input.LA(1) <= '\uFFFD') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ID_START_CHAR"

    // $ANTLR start "ECHAR"
    public final void mECHAR() throws RecognitionException {
        try {
            // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:422:16: ( '\\\\' ( 't' | 'b' | 'n' | 'r' | 'f' | '\\\\' | '\"' | '\\'' ) )
            // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:422:18: '\\\\' ( 't' | 'b' | 'n' | 'r' | 'f' | '\\\\' | '\"' | '\\'' )
            {
            match('\\'); 

            if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ECHAR"

    // $ANTLR start "EOL"
    public final void mEOL() throws RecognitionException {
        try {
            // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:424:14: ( '\\n' | '\\r' )
            // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:
            {
            if ( input.LA(1)=='\n'||input.LA(1)=='\r' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EOL"

    public void mTokens() throws RecognitionException {
        // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:1:8: ( WHITESPACE | MULTI_LINE_COMMENT | DOCUMENT | BASE | IMPORT | PREFIX | GROUP | FORALL | EXISTS | AND | IRI_REF | ID | VAR_ID | STRING | IMPLICATION | EQUAL | SUBCLASS | INSTANCE | SLOT_ARROW | SYMSPACE_OPER | LPAR | RPAR | LESS | GREATER | LSQBR | RSQBR )
        int alt7=26;
        alt7 = dfa7.predict(input);
        switch (alt7) {
            case 1 :
                // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:1:10: WHITESPACE
                {
                mWHITESPACE(); 


                }
                break;
            case 2 :
                // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:1:21: MULTI_LINE_COMMENT
                {
                mMULTI_LINE_COMMENT(); 


                }
                break;
            case 3 :
                // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:1:40: DOCUMENT
                {
                mDOCUMENT(); 


                }
                break;
            case 4 :
                // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:1:49: BASE
                {
                mBASE(); 


                }
                break;
            case 5 :
                // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:1:54: IMPORT
                {
                mIMPORT(); 


                }
                break;
            case 6 :
                // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:1:61: PREFIX
                {
                mPREFIX(); 


                }
                break;
            case 7 :
                // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:1:68: GROUP
                {
                mGROUP(); 


                }
                break;
            case 8 :
                // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:1:74: FORALL
                {
                mFORALL(); 


                }
                break;
            case 9 :
                // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:1:81: EXISTS
                {
                mEXISTS(); 


                }
                break;
            case 10 :
                // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:1:88: AND
                {
                mAND(); 


                }
                break;
            case 11 :
                // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:1:92: IRI_REF
                {
                mIRI_REF(); 


                }
                break;
            case 12 :
                // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:1:100: ID
                {
                mID(); 


                }
                break;
            case 13 :
                // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:1:103: VAR_ID
                {
                mVAR_ID(); 


                }
                break;
            case 14 :
                // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:1:110: STRING
                {
                mSTRING(); 


                }
                break;
            case 15 :
                // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:1:117: IMPLICATION
                {
                mIMPLICATION(); 


                }
                break;
            case 16 :
                // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:1:129: EQUAL
                {
                mEQUAL(); 


                }
                break;
            case 17 :
                // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:1:135: SUBCLASS
                {
                mSUBCLASS(); 


                }
                break;
            case 18 :
                // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:1:144: INSTANCE
                {
                mINSTANCE(); 


                }
                break;
            case 19 :
                // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:1:153: SLOT_ARROW
                {
                mSLOT_ARROW(); 


                }
                break;
            case 20 :
                // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:1:164: SYMSPACE_OPER
                {
                mSYMSPACE_OPER(); 


                }
                break;
            case 21 :
                // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:1:178: LPAR
                {
                mLPAR(); 


                }
                break;
            case 22 :
                // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:1:183: RPAR
                {
                mRPAR(); 


                }
                break;
            case 23 :
                // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:1:188: LESS
                {
                mLESS(); 


                }
                break;
            case 24 :
                // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:1:193: GREATER
                {
                mGREATER(); 


                }
                break;
            case 25 :
                // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:1:201: LSQBR
                {
                mLSQBR(); 


                }
                break;
            case 26 :
                // org/ruleml/api/presentation_syntax_parser/RuleMLPresentationSyntax.g:1:207: RSQBR
                {
                mRSQBR(); 


                }
                break;

        }

    }


    protected DFA7 dfa7 = new DFA7(this);
    static final String DFA7_eotS =
        "\2\uffff\1\32\10\13\5\uffff\1\44\12\uffff\10\13\2\uffff\7\13\1\64"+
        "\1\13\1\66\5\13\1\uffff\1\13\1\uffff\2\13\1\77\3\13\1\103\1\104"+
        "\1\uffff\1\105\1\106\1\13\4\uffff\1\110\1\uffff";
    static final String DFA7_eofS =
        "\111\uffff";
    static final String DFA7_minS =
        "\1\11\1\uffff\1\41\1\157\1\141\1\155\2\162\1\157\1\170\1\156\5\uffff"+
        "\1\43\12\uffff\1\143\1\163\1\160\1\145\1\157\1\162\1\151\1\144\2"+
        "\uffff\1\165\1\145\1\157\1\146\1\165\1\141\1\163\1\55\1\155\1\55"+
        "\1\162\1\151\1\160\1\154\1\164\1\uffff\1\145\1\uffff\1\164\1\170"+
        "\1\55\1\154\1\163\1\156\2\55\1\uffff\2\55\1\164\4\uffff\1\55\1\uffff";
    static final String DFA7_maxS =
        "\1\ufffd\1\uffff\1\172\1\157\1\141\1\155\2\162\1\157\1\170\1\156"+
        "\5\uffff\1\43\12\uffff\1\143\1\163\1\160\1\145\1\157\1\162\1\151"+
        "\1\144\2\uffff\1\165\1\145\1\157\1\146\1\165\1\141\1\163\1\ufffd"+
        "\1\155\1\ufffd\1\162\1\151\1\160\1\154\1\164\1\uffff\1\145\1\uffff"+
        "\1\164\1\170\1\ufffd\1\154\1\163\1\156\2\ufffd\1\uffff\2\ufffd\1"+
        "\164\4\uffff\1\ufffd\1\uffff";
    static final String DFA7_acceptS =
        "\1\uffff\1\1\11\uffff\1\14\1\15\1\16\1\17\1\20\1\uffff\1\23\1\24"+
        "\1\25\1\26\1\30\1\31\1\32\1\2\1\13\1\27\10\uffff\1\21\1\22\17\uffff"+
        "\1\12\1\uffff\1\4\10\uffff\1\7\3\uffff\1\5\1\6\1\10\1\11\1\uffff"+
        "\1\3";
    static final String DFA7_specialS =
        "\111\uffff}>";
    static final String[] DFA7_transitionS = {
            "\1\1\3\uffff\1\1\22\uffff\1\1\1\uffff\1\15\1\20\4\uffff\1\23"+
            "\1\24\3\uffff\1\21\2\uffff\12\13\1\16\1\uffff\1\2\1\17\1\25"+
            "\1\14\1\uffff\1\12\1\4\1\13\1\3\1\11\1\10\1\7\1\13\1\5\6\13"+
            "\1\6\12\13\1\26\1\uffff\1\27\1\22\1\13\1\uffff\32\13\105\uffff"+
            "\27\13\1\uffff\37\13\1\uffff\u0208\13\160\uffff\16\13\1\uffff"+
            "\u1c81\13\14\uffff\2\13\142\uffff\u0120\13\u0a70\uffff\u03f0"+
            "\13\21\uffff\ua7ff\13\u2100\uffff\u04d0\13\40\uffff\u020e\13",
            "",
            "\1\30\37\uffff\32\31\6\uffff\32\31",
            "\1\33",
            "\1\34",
            "\1\35",
            "\1\36",
            "\1\37",
            "\1\40",
            "\1\41",
            "\1\42",
            "",
            "",
            "",
            "",
            "",
            "\1\43",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\45",
            "\1\46",
            "\1\47",
            "\1\50",
            "\1\51",
            "\1\52",
            "\1\53",
            "\1\54",
            "",
            "",
            "\1\55",
            "\1\56",
            "\1\57",
            "\1\60",
            "\1\61",
            "\1\62",
            "\1\63",
            "\2\13\1\uffff\13\13\6\uffff\32\13\4\uffff\1\13\1\uffff\32\13"+
            "\74\uffff\1\13\10\uffff\27\13\1\uffff\37\13\1\uffff\u0208\13"+
            "\160\uffff\16\13\1\uffff\u1c81\13\14\uffff\2\13\61\uffff\2\13"+
            "\57\uffff\u0120\13\u0a70\uffff\u03f0\13\21\uffff\ua7ff\13\u2100"+
            "\uffff\u04d0\13\40\uffff\u020e\13",
            "\1\65",
            "\2\13\1\uffff\13\13\6\uffff\32\13\4\uffff\1\13\1\uffff\32\13"+
            "\74\uffff\1\13\10\uffff\27\13\1\uffff\37\13\1\uffff\u0208\13"+
            "\160\uffff\16\13\1\uffff\u1c81\13\14\uffff\2\13\61\uffff\2\13"+
            "\57\uffff\u0120\13\u0a70\uffff\u03f0\13\21\uffff\ua7ff\13\u2100"+
            "\uffff\u04d0\13\40\uffff\u020e\13",
            "\1\67",
            "\1\70",
            "\1\71",
            "\1\72",
            "\1\73",
            "",
            "\1\74",
            "",
            "\1\75",
            "\1\76",
            "\2\13\1\uffff\13\13\6\uffff\32\13\4\uffff\1\13\1\uffff\32\13"+
            "\74\uffff\1\13\10\uffff\27\13\1\uffff\37\13\1\uffff\u0208\13"+
            "\160\uffff\16\13\1\uffff\u1c81\13\14\uffff\2\13\61\uffff\2\13"+
            "\57\uffff\u0120\13\u0a70\uffff\u03f0\13\21\uffff\ua7ff\13\u2100"+
            "\uffff\u04d0\13\40\uffff\u020e\13",
            "\1\100",
            "\1\101",
            "\1\102",
            "\2\13\1\uffff\13\13\6\uffff\32\13\4\uffff\1\13\1\uffff\32\13"+
            "\74\uffff\1\13\10\uffff\27\13\1\uffff\37\13\1\uffff\u0208\13"+
            "\160\uffff\16\13\1\uffff\u1c81\13\14\uffff\2\13\61\uffff\2\13"+
            "\57\uffff\u0120\13\u0a70\uffff\u03f0\13\21\uffff\ua7ff\13\u2100"+
            "\uffff\u04d0\13\40\uffff\u020e\13",
            "\2\13\1\uffff\13\13\6\uffff\32\13\4\uffff\1\13\1\uffff\32\13"+
            "\74\uffff\1\13\10\uffff\27\13\1\uffff\37\13\1\uffff\u0208\13"+
            "\160\uffff\16\13\1\uffff\u1c81\13\14\uffff\2\13\61\uffff\2\13"+
            "\57\uffff\u0120\13\u0a70\uffff\u03f0\13\21\uffff\ua7ff\13\u2100"+
            "\uffff\u04d0\13\40\uffff\u020e\13",
            "",
            "\2\13\1\uffff\13\13\6\uffff\32\13\4\uffff\1\13\1\uffff\32\13"+
            "\74\uffff\1\13\10\uffff\27\13\1\uffff\37\13\1\uffff\u0208\13"+
            "\160\uffff\16\13\1\uffff\u1c81\13\14\uffff\2\13\61\uffff\2\13"+
            "\57\uffff\u0120\13\u0a70\uffff\u03f0\13\21\uffff\ua7ff\13\u2100"+
            "\uffff\u04d0\13\40\uffff\u020e\13",
            "\2\13\1\uffff\13\13\6\uffff\32\13\4\uffff\1\13\1\uffff\32\13"+
            "\74\uffff\1\13\10\uffff\27\13\1\uffff\37\13\1\uffff\u0208\13"+
            "\160\uffff\16\13\1\uffff\u1c81\13\14\uffff\2\13\61\uffff\2\13"+
            "\57\uffff\u0120\13\u0a70\uffff\u03f0\13\21\uffff\ua7ff\13\u2100"+
            "\uffff\u04d0\13\40\uffff\u020e\13",
            "\1\107",
            "",
            "",
            "",
            "",
            "\2\13\1\uffff\13\13\6\uffff\32\13\4\uffff\1\13\1\uffff\32\13"+
            "\74\uffff\1\13\10\uffff\27\13\1\uffff\37\13\1\uffff\u0208\13"+
            "\160\uffff\16\13\1\uffff\u1c81\13\14\uffff\2\13\61\uffff\2\13"+
            "\57\uffff\u0120\13\u0a70\uffff\u03f0\13\21\uffff\ua7ff\13\u2100"+
            "\uffff\u04d0\13\40\uffff\u020e\13",
            ""
    };

    static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
    static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
    static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
    static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
    static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
    static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
    static final short[][] DFA7_transition;

    static {
        int numStates = DFA7_transitionS.length;
        DFA7_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
        }
    }

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = DFA7_eot;
            this.eof = DFA7_eof;
            this.min = DFA7_min;
            this.max = DFA7_max;
            this.accept = DFA7_accept;
            this.special = DFA7_special;
            this.transition = DFA7_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( WHITESPACE | MULTI_LINE_COMMENT | DOCUMENT | BASE | IMPORT | PREFIX | GROUP | FORALL | EXISTS | AND | IRI_REF | ID | VAR_ID | STRING | IMPLICATION | EQUAL | SUBCLASS | INSTANCE | SLOT_ARROW | SYMSPACE_OPER | LPAR | RPAR | LESS | GREATER | LSQBR | RSQBR );";
        }
    }
 

}