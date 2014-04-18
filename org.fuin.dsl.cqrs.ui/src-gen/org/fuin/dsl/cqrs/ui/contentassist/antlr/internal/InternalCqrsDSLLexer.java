package org.fuin.dsl.cqrs.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCqrsDSLLexer extends Lexer {
    public static final int RULE_ID=7;
    public static final int T__22=22;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_DOC=9;
    public static final int EOF=-1;
    public static final int RULE_SL_COMMENT=11;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__19=19;
    public static final int RULE_HEX=4;
    public static final int RULE_STRING=8;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=5;
    public static final int RULE_DECIMAL=6;
    public static final int RULE_WS=12;

    // delegates
    // delegators

    public InternalCqrsDSLLexer() {;} 
    public InternalCqrsDSLLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalCqrsDSLLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g"; }

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:11:7: ( 'false' )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:11:9: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:12:7: ( 'true' )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:12:9: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:13:7: ( 'namespace' )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:13:9: 'namespace'
            {
            match("namespace"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:14:7: ( '{' )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:14:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:15:7: ( '}' )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:15:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:16:7: ( 'import' )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:16:9: 'import'
            {
            match("import"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:17:7: ( ';' )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:17:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:18:7: ( '.' )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:18:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:19:7: ( '*' )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:19:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:20:7: ( 'null' )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:20:9: 'null'
            {
            match("null"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1451:9: ( ( 'A' .. 'Z' | 'a' .. 'z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1451:11: ( 'A' .. 'Z' | 'a' .. 'z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1451:31: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1453:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1453:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1453:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='\"') ) {
                alt4=1;
            }
            else if ( (LA4_0=='\'') ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1453:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1453:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop2:
                    do {
                        int alt2=3;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0=='\\') ) {
                            alt2=1;
                        }
                        else if ( ((LA2_0>='\u0000' && LA2_0<='!')||(LA2_0>='#' && LA2_0<='[')||(LA2_0>=']' && LA2_0<='\uFFFF')) ) {
                            alt2=2;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1453:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1453:66: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1453:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1453:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop3:
                    do {
                        int alt3=3;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0=='\\') ) {
                            alt3=1;
                        }
                        else if ( ((LA3_0>='\u0000' && LA3_0<='&')||(LA3_0>='(' && LA3_0<='[')||(LA3_0>=']' && LA3_0<='\uFFFF')) ) {
                            alt3=2;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1453:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1453:137: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_HEX"
    public final void mRULE_HEX() throws RecognitionException {
        try {
            int _type = RULE_HEX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1455:10: ( ( '0x' | '0X' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' | '_' )+ ( '#' ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) ) )? )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1455:12: ( '0x' | '0X' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' | '_' )+ ( '#' ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) ) )?
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1455:12: ( '0x' | '0X' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='0') ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1=='x') ) {
                    alt5=1;
                }
                else if ( (LA5_1=='X') ) {
                    alt5=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1455:13: '0x'
                    {
                    match("0x"); 


                    }
                    break;
                case 2 :
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1455:18: '0X'
                    {
                    match("0X"); 


                    }
                    break;

            }

            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1455:24: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' | '_' )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')||(LA6_0>='A' && LA6_0<='F')||LA6_0=='_'||(LA6_0>='a' && LA6_0<='f')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='f') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);

            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1455:58: ( '#' ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='#') ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1455:59: '#' ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) )
                    {
                    match('#'); 
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1455:63: ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) )
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0=='B'||LA7_0=='b') ) {
                        alt7=1;
                    }
                    else if ( (LA7_0=='L'||LA7_0=='l') ) {
                        alt7=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 7, 0, input);

                        throw nvae;
                    }
                    switch (alt7) {
                        case 1 :
                            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1455:64: ( 'b' | 'B' ) ( 'i' | 'I' )
                            {
                            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}

                            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}


                            }
                            break;
                        case 2 :
                            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1455:84: ( 'l' | 'L' )
                            {
                            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}


                            }
                            break;

                    }


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_HEX"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1457:10: ( '0' .. '9' ( '0' .. '9' | '_' )* )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1457:12: '0' .. '9' ( '0' .. '9' | '_' )*
            {
            matchRange('0','9'); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1457:21: ( '0' .. '9' | '_' )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='0' && LA9_0<='9')||LA9_0=='_') ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||input.LA(1)=='_' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_DECIMAL"
    public final void mRULE_DECIMAL() throws RecognitionException {
        try {
            int _type = RULE_DECIMAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1459:14: ( RULE_INT ( ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT )? ( ( 'b' | 'B' ) ( 'i' | 'I' | 'd' | 'D' ) | ( 'l' | 'L' | 'd' | 'D' | 'f' | 'F' ) )? )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1459:16: RULE_INT ( ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT )? ( ( 'b' | 'B' ) ( 'i' | 'I' | 'd' | 'D' ) | ( 'l' | 'L' | 'd' | 'D' | 'f' | 'F' ) )?
            {
            mRULE_INT(); 
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1459:25: ( ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='E'||LA11_0=='e') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1459:26: ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT
                    {
                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1459:36: ( '+' | '-' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='+'||LA10_0=='-') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:
                            {
                            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}


                            }
                            break;

                    }

                    mRULE_INT(); 

                    }
                    break;

            }

            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1459:58: ( ( 'b' | 'B' ) ( 'i' | 'I' | 'd' | 'D' ) | ( 'l' | 'L' | 'd' | 'D' | 'f' | 'F' ) )?
            int alt12=3;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='B'||LA12_0=='b') ) {
                alt12=1;
            }
            else if ( (LA12_0=='D'||LA12_0=='F'||LA12_0=='L'||LA12_0=='d'||LA12_0=='f'||LA12_0=='l') ) {
                alt12=2;
            }
            switch (alt12) {
                case 1 :
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1459:59: ( 'b' | 'B' ) ( 'i' | 'I' | 'd' | 'D' )
                    {
                    if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='D'||input.LA(1)=='I'||input.LA(1)=='d'||input.LA(1)=='i' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;
                case 2 :
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1459:87: ( 'l' | 'L' | 'd' | 'D' | 'f' | 'F' )
                    {
                    if ( input.LA(1)=='D'||input.LA(1)=='F'||input.LA(1)=='L'||input.LA(1)=='d'||input.LA(1)=='f'||input.LA(1)=='l' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DECIMAL"

    // $ANTLR start "RULE_DOC"
    public final void mRULE_DOC() throws RecognitionException {
        try {
            int _type = RULE_DOC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1461:10: ( '/**' ( options {greedy=false; } : . )* '*/' )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1461:12: '/**' ( options {greedy=false; } : . )* '*/'
            {
            match("/**"); 

            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1461:18: ( options {greedy=false; } : . )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0=='*') ) {
                    int LA13_1 = input.LA(2);

                    if ( (LA13_1=='/') ) {
                        alt13=2;
                    }
                    else if ( ((LA13_1>='\u0000' && LA13_1<='.')||(LA13_1>='0' && LA13_1<='\uFFFF')) ) {
                        alt13=1;
                    }


                }
                else if ( ((LA13_0>='\u0000' && LA13_0<=')')||(LA13_0>='+' && LA13_0<='\uFFFF')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1461:46: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DOC"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1463:17: ( '/*' ~ ( '*' ) ( options {greedy=false; } : . )* '*/' )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1463:19: '/*' ~ ( '*' ) ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            if ( (input.LA(1)>='\u0000' && input.LA(1)<=')')||(input.LA(1)>='+' && input.LA(1)<='\uFFFF') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1463:31: ( options {greedy=false; } : . )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0=='*') ) {
                    int LA14_1 = input.LA(2);

                    if ( (LA14_1=='/') ) {
                        alt14=2;
                    }
                    else if ( ((LA14_1>='\u0000' && LA14_1<='.')||(LA14_1>='0' && LA14_1<='\uFFFF')) ) {
                        alt14=1;
                    }


                }
                else if ( ((LA14_0>='\u0000' && LA14_0<=')')||(LA14_0>='+' && LA14_0<='\uFFFF')) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1463:59: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1465:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1465:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1465:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>='\u0000' && LA15_0<='\t')||(LA15_0>='\u000B' && LA15_0<='\f')||(LA15_0>='\u000E' && LA15_0<='\uFFFF')) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1465:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1465:40: ( ( '\\r' )? '\\n' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0=='\n'||LA17_0=='\r') ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1465:41: ( '\\r' )? '\\n'
                    {
                    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1465:41: ( '\\r' )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0=='\r') ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1465:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1467:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1467:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1467:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt18=0;
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>='\t' && LA18_0<='\n')||LA18_0=='\r'||LA18_0==' ') ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt18 >= 1 ) break loop18;
                        EarlyExitException eee =
                            new EarlyExitException(18, input);
                        throw eee;
                }
                cnt18++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    public void mTokens() throws RecognitionException {
        // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1:8: ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | RULE_ID | RULE_STRING | RULE_HEX | RULE_INT | RULE_DECIMAL | RULE_DOC | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS )
        int alt19=19;
        alt19 = dfa19.predict(input);
        switch (alt19) {
            case 1 :
                // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1:10: T__13
                {
                mT__13(); 

                }
                break;
            case 2 :
                // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1:16: T__14
                {
                mT__14(); 

                }
                break;
            case 3 :
                // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1:22: T__15
                {
                mT__15(); 

                }
                break;
            case 4 :
                // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1:28: T__16
                {
                mT__16(); 

                }
                break;
            case 5 :
                // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1:34: T__17
                {
                mT__17(); 

                }
                break;
            case 6 :
                // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1:40: T__18
                {
                mT__18(); 

                }
                break;
            case 7 :
                // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1:46: T__19
                {
                mT__19(); 

                }
                break;
            case 8 :
                // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1:52: T__20
                {
                mT__20(); 

                }
                break;
            case 9 :
                // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1:58: T__21
                {
                mT__21(); 

                }
                break;
            case 10 :
                // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1:64: T__22
                {
                mT__22(); 

                }
                break;
            case 11 :
                // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1:70: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 12 :
                // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1:78: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 13 :
                // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1:90: RULE_HEX
                {
                mRULE_HEX(); 

                }
                break;
            case 14 :
                // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1:99: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 15 :
                // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1:108: RULE_DECIMAL
                {
                mRULE_DECIMAL(); 

                }
                break;
            case 16 :
                // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1:121: RULE_DOC
                {
                mRULE_DOC(); 

                }
                break;
            case 17 :
                // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1:130: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 18 :
                // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1:146: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 19 :
                // ../org.fuin.dsl.cqrs.ui/src-gen/org/fuin/dsl/cqrs/ui/contentassist/antlr/internal/InternalCqrsDSL.g:1:162: RULE_WS
                {
                mRULE_WS(); 

                }
                break;

        }

    }


    protected DFA19 dfa19 = new DFA19(this);
    static final String DFA19_eotS =
        "\1\uffff\3\12\2\uffff\1\12\5\uffff\2\27\2\uffff\5\12\1\uffff\1"+
        "\27\4\uffff\5\12\2\uffff\1\12\1\50\1\12\1\52\1\12\1\54\1\uffff\1"+
        "\12\1\uffff\1\12\1\uffff\1\12\1\60\1\12\1\uffff\1\12\1\63\1\uffff";
    static final String DFA19_eofS =
        "\64\uffff";
    static final String DFA19_minS =
        "\1\11\1\141\1\162\1\141\2\uffff\1\155\5\uffff\2\60\1\52\1\uffff"+
        "\1\154\1\165\1\155\1\154\1\160\1\uffff\1\60\2\uffff\1\0\1\uffff"+
        "\1\163\2\145\1\154\1\157\2\uffff\1\145\1\60\1\163\1\60\1\162\1\60"+
        "\1\uffff\1\160\1\uffff\1\164\1\uffff\1\141\1\60\1\143\1\uffff\1"+
        "\145\1\60\1\uffff";
    static final String DFA19_maxS =
        "\1\175\1\141\1\162\1\165\2\uffff\1\155\5\uffff\1\170\1\154\1\57"+
        "\1\uffff\1\154\1\165\1\155\1\154\1\160\1\uffff\1\154\2\uffff\1\uffff"+
        "\1\uffff\1\163\2\145\1\154\1\157\2\uffff\1\145\1\172\1\163\1\172"+
        "\1\162\1\172\1\uffff\1\160\1\uffff\1\164\1\uffff\1\141\1\172\1\143"+
        "\1\uffff\1\145\1\172\1\uffff";
    static final String DFA19_acceptS =
        "\4\uffff\1\4\1\5\1\uffff\1\7\1\10\1\11\1\13\1\14\3\uffff\1\23\5"+
        "\uffff\1\15\1\uffff\1\16\1\17\1\uffff\1\22\5\uffff\1\20\1\21\6\uffff"+
        "\1\2\1\uffff\1\12\1\uffff\1\1\3\uffff\1\6\2\uffff\1\3";
    static final String DFA19_specialS =
        "\31\uffff\1\0\32\uffff}>";
    static final String[] DFA19_transitionS = {
            "\2\17\2\uffff\1\17\22\uffff\1\17\1\uffff\1\13\4\uffff\1\13"+
            "\2\uffff\1\11\3\uffff\1\10\1\16\1\14\11\15\1\uffff\1\7\5\uffff"+
            "\32\12\6\uffff\5\12\1\1\2\12\1\6\4\12\1\3\5\12\1\2\6\12\1\4"+
            "\1\uffff\1\5",
            "\1\20",
            "\1\21",
            "\1\22\23\uffff\1\23",
            "",
            "",
            "\1\24",
            "",
            "",
            "",
            "",
            "",
            "\12\26\10\uffff\1\30\1\uffff\3\30\5\uffff\1\30\13\uffff\1"+
            "\25\6\uffff\1\26\2\uffff\1\30\1\uffff\3\30\5\uffff\1\30\13\uffff"+
            "\1\25",
            "\12\26\10\uffff\1\30\1\uffff\3\30\5\uffff\1\30\22\uffff\1"+
            "\26\2\uffff\1\30\1\uffff\3\30\5\uffff\1\30",
            "\1\31\4\uffff\1\32",
            "",
            "\1\33",
            "\1\34",
            "\1\35",
            "\1\36",
            "\1\37",
            "",
            "\12\26\10\uffff\1\30\1\uffff\3\30\5\uffff\1\30\22\uffff\1"+
            "\26\2\uffff\1\30\1\uffff\3\30\5\uffff\1\30",
            "",
            "",
            "\52\41\1\40\uffd5\41",
            "",
            "\1\42",
            "\1\43",
            "\1\44",
            "\1\45",
            "\1\46",
            "",
            "",
            "\1\47",
            "\12\12\7\uffff\32\12\4\uffff\1\12\1\uffff\32\12",
            "\1\51",
            "\12\12\7\uffff\32\12\4\uffff\1\12\1\uffff\32\12",
            "\1\53",
            "\12\12\7\uffff\32\12\4\uffff\1\12\1\uffff\32\12",
            "",
            "\1\55",
            "",
            "\1\56",
            "",
            "\1\57",
            "\12\12\7\uffff\32\12\4\uffff\1\12\1\uffff\32\12",
            "\1\61",
            "",
            "\1\62",
            "\12\12\7\uffff\32\12\4\uffff\1\12\1\uffff\32\12",
            ""
    };

    static final short[] DFA19_eot = DFA.unpackEncodedString(DFA19_eotS);
    static final short[] DFA19_eof = DFA.unpackEncodedString(DFA19_eofS);
    static final char[] DFA19_min = DFA.unpackEncodedStringToUnsignedChars(DFA19_minS);
    static final char[] DFA19_max = DFA.unpackEncodedStringToUnsignedChars(DFA19_maxS);
    static final short[] DFA19_accept = DFA.unpackEncodedString(DFA19_acceptS);
    static final short[] DFA19_special = DFA.unpackEncodedString(DFA19_specialS);
    static final short[][] DFA19_transition;

    static {
        int numStates = DFA19_transitionS.length;
        DFA19_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA19_transition[i] = DFA.unpackEncodedString(DFA19_transitionS[i]);
        }
    }

    class DFA19 extends DFA {

        public DFA19(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 19;
            this.eot = DFA19_eot;
            this.eof = DFA19_eof;
            this.min = DFA19_min;
            this.max = DFA19_max;
            this.accept = DFA19_accept;
            this.special = DFA19_special;
            this.transition = DFA19_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | RULE_ID | RULE_STRING | RULE_HEX | RULE_INT | RULE_DECIMAL | RULE_DOC | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA19_25 = input.LA(1);

                        s = -1;
                        if ( (LA19_25=='*') ) {s = 32;}

                        else if ( ((LA19_25>='\u0000' && LA19_25<=')')||(LA19_25>='+' && LA19_25<='\uFFFF')) ) {s = 33;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 19, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}