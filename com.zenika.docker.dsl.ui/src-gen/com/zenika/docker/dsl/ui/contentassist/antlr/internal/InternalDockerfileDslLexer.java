package com.zenika.docker.dsl.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDockerfileDslLexer extends Lexer {
    public static final int RULE_TAG_ID=6;
    public static final int RULE_ID=5;
    public static final int RULE_WS=10;
    public static final int RULE_STRING=4;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_SL_COMMENT=7;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int RULE_INT=8;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators

    public InternalDockerfileDslLexer() {;} 
    public InternalDockerfileDslLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalDockerfileDslLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g"; }

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:11:7: ( 'CMD' )
            // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:11:9: 'CMD'
            {
            match("CMD"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:12:7: ( '[' )
            // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:12:9: '['
            {
            match('['); 

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
            // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:13:7: ( ']' )
            // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:13:9: ']'
            {
            match(']'); 

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
            // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:14:7: ( ',' )
            // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:14:9: ','
            {
            match(','); 

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
            // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:15:7: ( 'FROM' )
            // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:15:9: 'FROM'
            {
            match("FROM"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:669:17: ( '#' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:669:19: '#' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match('#'); 
            // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:669:23: (~ ( ( '\\n' | '\\r' ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='\u0000' && LA1_0<='\t')||(LA1_0>='\u000B' && LA1_0<='\f')||(LA1_0>='\u000E' && LA1_0<='\uFFFF')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:669:23: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop1;
                }
            } while (true);

            // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:669:39: ( ( '\\r' )? '\\n' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='\n'||LA3_0=='\r') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:669:40: ( '\\r' )? '\\n'
                    {
                    // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:669:40: ( '\\r' )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0=='\r') ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:669:40: '\\r'
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

    // $ANTLR start "RULE_TAG_ID"
    public final void mRULE_TAG_ID() throws RecognitionException {
        try {
            int _type = RULE_TAG_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:671:13: ( ( '^' )? (~ ( ' ' ) )* ':' ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:671:15: ( '^' )? (~ ( ' ' ) )* ':' ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:671:15: ( '^' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='^') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:671:15: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:671:20: (~ ( ' ' ) )*
            loop5:
            do {
                int alt5=2;
                alt5 = dfa5.predict(input);
                switch (alt5) {
            	case 1 :
            	    // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:671:20: ~ ( ' ' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\u001F')||(input.LA(1)>='!' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            match(':'); 
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:671:65: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')||(LA6_0>='A' && LA6_0<='Z')||LA6_0=='_'||(LA6_0>='a' && LA6_0<='z')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:
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
            	    break loop6;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TAG_ID"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:673:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:673:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:673:11: ( '^' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='^') ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:673:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:673:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='0' && LA8_0<='9')||(LA8_0>='A' && LA8_0<='Z')||LA8_0=='_'||(LA8_0>='a' && LA8_0<='z')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:
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
            	    break loop8;
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

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:675:10: ( ( '0' .. '9' )+ )
            // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:675:12: ( '0' .. '9' )+
            {
            // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:675:12: ( '0' .. '9' )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='0' && LA9_0<='9')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:675:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:677:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:677:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:677:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\"') ) {
                alt12=1;
            }
            else if ( (LA12_0=='\'') ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:677:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:677:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop10:
                    do {
                        int alt10=3;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0=='\\') ) {
                            alt10=1;
                        }
                        else if ( ((LA10_0>='\u0000' && LA10_0<='!')||(LA10_0>='#' && LA10_0<='[')||(LA10_0>=']' && LA10_0<='\uFFFF')) ) {
                            alt10=2;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:677:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:677:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop10;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:677:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:677:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop11:
                    do {
                        int alt11=3;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0=='\\') ) {
                            alt11=1;
                        }
                        else if ( ((LA11_0>='\u0000' && LA11_0<='&')||(LA11_0>='(' && LA11_0<='[')||(LA11_0>=']' && LA11_0<='\uFFFF')) ) {
                            alt11=2;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:677:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:677:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop11;
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

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:679:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:679:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:679:24: ( options {greedy=false; } : . )*
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
            	    // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:679:52: .
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
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:681:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:681:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:681:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r'||LA14_0==' ') ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:
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
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:683:16: ( . )
            // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:683:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | RULE_SL_COMMENT | RULE_TAG_ID | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt15=13;
        alt15 = dfa15.predict(input);
        switch (alt15) {
            case 1 :
                // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:1:10: T__12
                {
                mT__12(); 

                }
                break;
            case 2 :
                // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:1:16: T__13
                {
                mT__13(); 

                }
                break;
            case 3 :
                // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:1:22: T__14
                {
                mT__14(); 

                }
                break;
            case 4 :
                // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:1:28: T__15
                {
                mT__15(); 

                }
                break;
            case 5 :
                // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:1:34: T__16
                {
                mT__16(); 

                }
                break;
            case 6 :
                // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:1:40: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 7 :
                // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:1:56: RULE_TAG_ID
                {
                mRULE_TAG_ID(); 

                }
                break;
            case 8 :
                // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:1:68: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 9 :
                // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:1:76: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 10 :
                // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:1:85: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 11 :
                // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:1:97: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 12 :
                // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:1:113: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 13 :
                // ../com.zenika.docker.dsl.ui/src-gen/com/zenika/docker/dsl/ui/contentassist/antlr/internal/InternalDockerfileDsl.g:1:121: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA5 dfa5 = new DFA5(this);
    protected DFA15 dfa15 = new DFA15(this);
    static final String DFA5_eotS =
        "\3\uffff\2\5\1\uffff";
    static final String DFA5_eofS =
        "\6\uffff";
    static final String DFA5_minS =
        "\2\0\1\uffff\2\0\1\uffff";
    static final String DFA5_maxS =
        "\2\uffff\1\uffff\2\uffff\1\uffff";
    static final String DFA5_acceptS =
        "\2\uffff\1\1\2\uffff\1\2";
    static final String DFA5_specialS =
        "\1\1\1\2\1\uffff\1\3\1\0\1\uffff}>";
    static final String[] DFA5_transitionS = {
            "\40\2\1\uffff\31\2\1\1\uffc5\2",
            "\40\2\1\uffff\17\2\12\3\7\2\32\3\4\2\1\3\1\2\32\3\uff85\2",
            "",
            "\40\2\1\uffff\17\2\12\4\7\2\32\4\4\2\1\4\1\2\32\4\uff85\2",
            "\40\2\1\uffff\17\2\12\4\7\2\32\4\4\2\1\4\1\2\32\4\uff85\2",
            ""
    };

    static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
    static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
    static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
    static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
    static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
    static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
    static final short[][] DFA5_transition;

    static {
        int numStates = DFA5_transitionS.length;
        DFA5_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
        }
    }

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = DFA5_eot;
            this.eof = DFA5_eof;
            this.min = DFA5_min;
            this.max = DFA5_max;
            this.accept = DFA5_accept;
            this.special = DFA5_special;
            this.transition = DFA5_transition;
        }
        public String getDescription() {
            return "()* loopback of 671:20: (~ ( ' ' ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA5_4 = input.LA(1);

                        s = -1;
                        if ( ((LA5_4>='\u0000' && LA5_4<='\u001F')||(LA5_4>='!' && LA5_4<='/')||(LA5_4>=':' && LA5_4<='@')||(LA5_4>='[' && LA5_4<='^')||LA5_4=='`'||(LA5_4>='{' && LA5_4<='\uFFFF')) ) {s = 2;}

                        else if ( ((LA5_4>='0' && LA5_4<='9')||(LA5_4>='A' && LA5_4<='Z')||LA5_4=='_'||(LA5_4>='a' && LA5_4<='z')) ) {s = 4;}

                        else s = 5;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA5_0 = input.LA(1);

                        s = -1;
                        if ( (LA5_0==':') ) {s = 1;}

                        else if ( ((LA5_0>='\u0000' && LA5_0<='\u001F')||(LA5_0>='!' && LA5_0<='9')||(LA5_0>=';' && LA5_0<='\uFFFF')) ) {s = 2;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA5_1 = input.LA(1);

                        s = -1;
                        if ( ((LA5_1>='0' && LA5_1<='9')||(LA5_1>='A' && LA5_1<='Z')||LA5_1=='_'||(LA5_1>='a' && LA5_1<='z')) ) {s = 3;}

                        else if ( ((LA5_1>='\u0000' && LA5_1<='\u001F')||(LA5_1>='!' && LA5_1<='/')||(LA5_1>=':' && LA5_1<='@')||(LA5_1>='[' && LA5_1<='^')||LA5_1=='`'||(LA5_1>='{' && LA5_1<='\uFFFF')) ) {s = 2;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA5_3 = input.LA(1);

                        s = -1;
                        if ( ((LA5_3>='\u0000' && LA5_3<='\u001F')||(LA5_3>='!' && LA5_3<='/')||(LA5_3>=':' && LA5_3<='@')||(LA5_3>='[' && LA5_3<='^')||LA5_3=='`'||(LA5_3>='{' && LA5_3<='\uFFFF')) ) {s = 2;}

                        else if ( ((LA5_3>='0' && LA5_3<='9')||(LA5_3>='A' && LA5_3<='Z')||LA5_3=='_'||(LA5_3>='a' && LA5_3<='z')) ) {s = 4;}

                        else s = 5;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 5, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA15_eotS =
        "\1\uffff\1\23\1\25\1\26\1\27\1\23\1\34\2\37\1\23\1\41\3\37\1\54\1\37\1\uffff\2\23\5\uffff\1\23\1\34\1\uffff\1\34\1\uffff\1\34\1\23\1\uffff\1\41\3\uffff\1\46\5\uffff\1\46\2\uffff\1\54\1\73\1\23\1\34\2\uffff\2\24\7\uffff\1\102\1\34\2\24\1\72\1\24\1\uffff\1\24";
    static final String DFA15_eofS =
        "\104\uffff";
    static final String DFA15_minS =
        "\20\0\1\uffff\2\0\5\uffff\4\0\1\uffff\2\0\1\uffff\1\0\1\uffff\4\0\1\uffff\5\0\1\uffff\15\0\2\uffff\6\0\1\uffff\1\0";
    static final String DFA15_maxS =
        "\20\uffff\1\uffff\2\uffff\5\uffff\4\uffff\1\uffff\2\uffff\1\uffff\1\uffff\1\uffff\4\uffff\1\uffff\5\uffff\1\uffff\15\uffff\2\uffff\6\uffff\1\uffff\1\uffff";
    static final String DFA15_acceptS =
        "\20\uffff\1\14\2\uffff\1\10\1\7\1\2\1\3\1\4\4\uffff\1\6\2\uffff\1\15\1\uffff\1\11\4\uffff\1\12\5\uffff\1\14\15\uffff\1\13\1\1\6\uffff\1\5\1\uffff";
    static final String DFA15_specialS =
        "\1\36\1\24\1\53\1\63\1\2\1\35\1\34\1\31\1\62\1\12\1\42\1\41\1\0\1\32\1\1\1\14\1\uffff\1\7\1\60\5\uffff\1\16\1\45\1\43\1\23\1\uffff\1\3\1\37\1\uffff\1\13\1\uffff\1\40\1\54\1\64\1\6\1\uffff\1\65\1\50\1\15\1\5\1\56\1\uffff\1\27\1\25\1\17\1\20\1\46\1\4\1\21\1\26\1\57\1\11\1\33\1\55\1\10\2\uffff\1\51\1\44\1\47\1\61\1\30\1\22\1\uffff\1\52}>";
    static final String[] DFA15_transitionS = {
            "\11\17\2\16\2\17\1\16\22\17\1\20\1\17\1\13\1\6\3\17\1\14\4\17\1\4\2\17\1\15\12\12\1\10\6\17\2\11\1\1\2\11\1\5\24\11\1\2\1\17\1\3\1\7\1\11\1\17\32\11\uff85\17",
            "\40\24\1\uffff\17\24\12\22\7\24\14\22\1\21\15\22\4\24\1\22\1\24\32\22\uff85\24",
            "\40\24\1\uffff\uffdf\24",
            "\40\24\1\uffff\uffdf\24",
            "\40\24\1\uffff\uffdf\24",
            "\40\24\1\uffff\17\24\12\22\7\24\21\22\1\30\10\22\4\24\1\22\1\24\32\22\uff85\24",
            "\12\35\1\33\2\35\1\32\22\35\1\uffff\31\35\1\31\uffc5\35",
            "\40\24\1\uffff\40\24\32\36\4\24\1\36\1\24\32\36\uff85\24",
            "\40\24\1\uffff\uffdf\24",
            "\40\24\1\uffff\17\24\12\22\7\24\32\22\4\24\1\22\1\24\32\22\uff85\24",
            "\40\24\1\uffff\17\24\12\40\uffc6\24",
            "\40\45\1\46\1\45\1\44\27\45\1\43\41\45\1\42\uffa3\45",
            "\40\51\1\46\6\51\1\52\22\51\1\47\41\51\1\50\uffa3\51",
            "\40\24\1\uffff\11\24\1\53\uffd5\24",
            "\11\24\2\55\2\24\1\55\22\24\1\uffff\uffdf\24",
            "\40\24\1\uffff\uffdf\24",
            "",
            "\40\24\1\uffff\17\24\12\22\7\24\3\22\1\56\26\22\4\24\1\22\1\24\32\22\uff85\24",
            "\40\24\1\uffff\17\24\12\22\7\24\32\22\4\24\1\22\1\24\32\22\uff85\24",
            "",
            "",
            "",
            "",
            "",
            "\40\24\1\uffff\17\24\12\22\7\24\16\22\1\57\13\22\4\24\1\22\1\24\32\22\uff85\24",
            "\12\35\1\33\2\35\1\32\22\35\1\uffff\17\35\12\60\1\31\6\35\32\60\4\35\1\60\1\35\32\60\uff85\35",
            "\12\24\1\33\25\24\1\uffff\uffdf\24",
            "\40\24\1\uffff\uffdf\24",
            "",
            "\12\35\1\33\2\35\1\32\22\35\1\uffff\31\35\1\31\uffc5\35",
            "\40\24\1\uffff\17\24\12\22\7\24\32\22\4\24\1\22\1\24\32\22\uff85\24",
            "",
            "\40\24\1\uffff\17\24\12\40\uffc6\24",
            "",
            "\40\62\1\46\31\62\1\61\uffc5\62",
            "\40\45\1\46\1\45\1\44\15\45\12\63\1\43\6\45\32\63\1\45\1\42\2\45\1\63\1\45\32\63\uff85\45",
            "\40\24\1\uffff\uffdf\24",
            "\40\45\1\46\1\45\1\44\27\45\1\43\41\45\1\42\uffa3\45",
            "",
            "\40\51\1\46\6\51\1\52\10\51\12\64\1\47\6\51\32\64\1\51\1\50\2\51\1\64\1\51\32\64\uff85\51",
            "\40\66\1\46\31\66\1\65\uffc5\66",
            "\40\51\1\46\6\51\1\52\22\51\1\47\41\51\1\50\uffa3\51",
            "\40\24\1\uffff\uffdf\24",
            "\40\71\1\72\11\71\1\67\17\71\1\70\uffc5\71",
            "",
            "\11\24\2\55\2\24\1\55\22\24\1\uffff\uffdf\24",
            "\40\24\1\uffff\17\24\12\22\7\24\32\22\4\24\1\22\1\24\32\22\uff85\24",
            "\40\24\1\uffff\17\24\12\22\7\24\14\22\1\74\15\22\4\24\1\22\1\24\32\22\uff85\24",
            "\12\35\1\33\2\35\1\32\22\35\1\uffff\17\35\12\75\1\31\6\35\32\75\4\35\1\75\1\35\32\75\uff85\35",
            "\40\45\1\46\1\45\1\44\15\45\12\63\1\43\6\45\32\63\1\45\1\42\2\45\1\63\1\45\32\63\uff85\45",
            "\40\45\1\46\1\45\1\44\27\45\1\43\41\45\1\42\uffa3\45",
            "\40\45\1\46\1\45\1\44\15\45\12\76\1\43\6\45\32\76\1\45\1\42\2\45\1\76\1\45\32\76\uff85\45",
            "\40\51\1\46\6\51\1\52\10\51\12\77\1\47\6\51\32\77\1\51\1\50\2\51\1\77\1\51\32\77\uff85\51",
            "\40\51\1\46\6\51\1\52\10\51\12\64\1\47\6\51\32\64\1\51\1\50\2\51\1\64\1\51\32\64\uff85\51",
            "\40\51\1\46\6\51\1\52\22\51\1\47\41\51\1\50\uffa3\51",
            "\40\71\1\72\11\71\1\67\4\71\1\100\12\71\1\70\uffc5\71",
            "\40\71\1\72\11\71\1\67\5\71\12\101\1\70\6\71\32\101\4\71\1\101\1\71\32\101\uff85\71",
            "\40\71\1\72\11\71\1\67\17\71\1\70\uffc5\71",
            "",
            "",
            "\40\24\1\uffff\17\24\12\22\7\24\32\22\4\24\1\22\1\24\32\22\uff85\24",
            "\12\35\1\33\2\35\1\32\22\35\1\uffff\17\35\12\75\1\31\6\35\32\75\4\35\1\75\1\35\32\75\uff85\35",
            "\40\45\1\46\1\45\1\44\15\45\12\76\1\43\6\45\32\76\1\45\1\42\2\45\1\76\1\45\32\76\uff85\45",
            "\40\51\1\46\6\51\1\52\10\51\12\77\1\47\6\51\32\77\1\51\1\50\2\51\1\77\1\51\32\77\uff85\51",
            "\40\71\1\uffff\11\71\1\67\17\71\1\70\uffc5\71",
            "\40\71\1\72\11\71\1\67\5\71\12\103\1\70\6\71\32\103\4\71\1\103\1\71\32\103\uff85\71",
            "",
            "\40\71\1\72\11\71\1\67\5\71\12\103\1\70\6\71\32\103\4\71\1\103\1\71\32\103\uff85\71"
    };

    static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
    static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
    static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
    static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
    static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
    static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
    static final short[][] DFA15_transition;

    static {
        int numStates = DFA15_transitionS.length;
        DFA15_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
        }
    }

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = DFA15_eot;
            this.eof = DFA15_eof;
            this.min = DFA15_min;
            this.max = DFA15_max;
            this.accept = DFA15_accept;
            this.special = DFA15_special;
            this.transition = DFA15_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | RULE_SL_COMMENT | RULE_TAG_ID | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA15_12 = input.LA(1);

                        s = -1;
                        if ( (LA15_12==':') ) {s = 39;}

                        else if ( (LA15_12=='\\') ) {s = 40;}

                        else if ( ((LA15_12>='\u0000' && LA15_12<='\u001F')||(LA15_12>='!' && LA15_12<='&')||(LA15_12>='(' && LA15_12<='9')||(LA15_12>=';' && LA15_12<='[')||(LA15_12>=']' && LA15_12<='\uFFFF')) ) {s = 41;}

                        else if ( (LA15_12=='\'') ) {s = 42;}

                        else if ( (LA15_12==' ') ) {s = 38;}

                        else s = 31;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA15_14 = input.LA(1);

                        s = -1;
                        if ( ((LA15_14>='\t' && LA15_14<='\n')||LA15_14=='\r') ) {s = 45;}

                        else if ( ((LA15_14>='\u0000' && LA15_14<='\b')||(LA15_14>='\u000B' && LA15_14<='\f')||(LA15_14>='\u000E' && LA15_14<='\u001F')||(LA15_14>='!' && LA15_14<='\uFFFF')) ) {s = 20;}

                        else s = 44;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA15_4 = input.LA(1);

                        s = -1;
                        if ( ((LA15_4>='\u0000' && LA15_4<='\u001F')||(LA15_4>='!' && LA15_4<='\uFFFF')) ) {s = 20;}

                        else s = 23;

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA15_29 = input.LA(1);

                        s = -1;
                        if ( (LA15_29==':') ) {s = 25;}

                        else if ( (LA15_29=='\r') ) {s = 26;}

                        else if ( (LA15_29=='\n') ) {s = 27;}

                        else if ( ((LA15_29>='\u0000' && LA15_29<='\t')||(LA15_29>='\u000B' && LA15_29<='\f')||(LA15_29>='\u000E' && LA15_29<='\u001F')||(LA15_29>='!' && LA15_29<='9')||(LA15_29>=';' && LA15_29<='\uFFFF')) ) {s = 29;}

                        else s = 28;

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA15_50 = input.LA(1);

                        s = -1;
                        if ( (LA15_50==':') ) {s = 35;}

                        else if ( (LA15_50=='\"') ) {s = 36;}

                        else if ( (LA15_50=='\\') ) {s = 34;}

                        else if ( ((LA15_50>='\u0000' && LA15_50<='\u001F')||LA15_50=='!'||(LA15_50>='#' && LA15_50<='9')||(LA15_50>=';' && LA15_50<='[')||(LA15_50>=']' && LA15_50<='\uFFFF')) ) {s = 37;}

                        else if ( (LA15_50==' ') ) {s = 38;}

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA15_42 = input.LA(1);

                        s = -1;
                        if ( ((LA15_42>='\u0000' && LA15_42<='\u001F')||(LA15_42>='!' && LA15_42<='\uFFFF')) ) {s = 20;}

                        else s = 38;

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA15_37 = input.LA(1);

                        s = -1;
                        if ( (LA15_37==':') ) {s = 35;}

                        else if ( (LA15_37=='\"') ) {s = 36;}

                        else if ( (LA15_37=='\\') ) {s = 34;}

                        else if ( ((LA15_37>='\u0000' && LA15_37<='\u001F')||LA15_37=='!'||(LA15_37>='#' && LA15_37<='9')||(LA15_37>=';' && LA15_37<='[')||(LA15_37>=']' && LA15_37<='\uFFFF')) ) {s = 37;}

                        else if ( (LA15_37==' ') ) {s = 38;}

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA15_17 = input.LA(1);

                        s = -1;
                        if ( (LA15_17=='D') ) {s = 46;}

                        else if ( ((LA15_17>='0' && LA15_17<='9')||(LA15_17>='A' && LA15_17<='C')||(LA15_17>='E' && LA15_17<='Z')||LA15_17=='_'||(LA15_17>='a' && LA15_17<='z')) ) {s = 18;}

                        else if ( ((LA15_17>='\u0000' && LA15_17<='\u001F')||(LA15_17>='!' && LA15_17<='/')||(LA15_17>=':' && LA15_17<='@')||(LA15_17>='[' && LA15_17<='^')||LA15_17=='`'||(LA15_17>='{' && LA15_17<='\uFFFF')) ) {s = 20;}

                        else s = 19;

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA15_57 = input.LA(1);

                        s = -1;
                        if ( (LA15_57=='*') ) {s = 55;}

                        else if ( (LA15_57==':') ) {s = 56;}

                        else if ( ((LA15_57>='\u0000' && LA15_57<='\u001F')||(LA15_57>='!' && LA15_57<=')')||(LA15_57>='+' && LA15_57<='9')||(LA15_57>=';' && LA15_57<='\uFFFF')) ) {s = 57;}

                        else if ( (LA15_57==' ') ) {s = 58;}

                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA15_54 = input.LA(1);

                        s = -1;
                        if ( (LA15_54==':') ) {s = 39;}

                        else if ( (LA15_54=='\'') ) {s = 42;}

                        else if ( (LA15_54=='\\') ) {s = 40;}

                        else if ( ((LA15_54>='\u0000' && LA15_54<='\u001F')||(LA15_54>='!' && LA15_54<='&')||(LA15_54>='(' && LA15_54<='9')||(LA15_54>=';' && LA15_54<='[')||(LA15_54>=']' && LA15_54<='\uFFFF')) ) {s = 41;}

                        else if ( (LA15_54==' ') ) {s = 38;}

                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA15_9 = input.LA(1);

                        s = -1;
                        if ( ((LA15_9>='0' && LA15_9<='9')||(LA15_9>='A' && LA15_9<='Z')||LA15_9=='_'||(LA15_9>='a' && LA15_9<='z')) ) {s = 18;}

                        else if ( ((LA15_9>='\u0000' && LA15_9<='\u001F')||(LA15_9>='!' && LA15_9<='/')||(LA15_9>=':' && LA15_9<='@')||(LA15_9>='[' && LA15_9<='^')||LA15_9=='`'||(LA15_9>='{' && LA15_9<='\uFFFF')) ) {s = 20;}

                        else s = 19;

                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA15_32 = input.LA(1);

                        s = -1;
                        if ( ((LA15_32>='\u0000' && LA15_32<='\u001F')||(LA15_32>='!' && LA15_32<='/')||(LA15_32>=':' && LA15_32<='\uFFFF')) ) {s = 20;}

                        else if ( ((LA15_32>='0' && LA15_32<='9')) ) {s = 32;}

                        else s = 33;

                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA15_15 = input.LA(1);

                        s = -1;
                        if ( ((LA15_15>='\u0000' && LA15_15<='\u001F')||(LA15_15>='!' && LA15_15<='\uFFFF')) ) {s = 20;}

                        else s = 31;

                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA15_41 = input.LA(1);

                        s = -1;
                        if ( (LA15_41=='\'') ) {s = 42;}

                        else if ( (LA15_41=='\\') ) {s = 40;}

                        else if ( (LA15_41==':') ) {s = 39;}

                        else if ( ((LA15_41>='\u0000' && LA15_41<='\u001F')||(LA15_41>='!' && LA15_41<='&')||(LA15_41>='(' && LA15_41<='9')||(LA15_41>=';' && LA15_41<='[')||(LA15_41>=']' && LA15_41<='\uFFFF')) ) {s = 41;}

                        else if ( (LA15_41==' ') ) {s = 38;}

                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA15_24 = input.LA(1);

                        s = -1;
                        if ( (LA15_24=='O') ) {s = 47;}

                        else if ( ((LA15_24>='0' && LA15_24<='9')||(LA15_24>='A' && LA15_24<='N')||(LA15_24>='P' && LA15_24<='Z')||LA15_24=='_'||(LA15_24>='a' && LA15_24<='z')) ) {s = 18;}

                        else if ( ((LA15_24>='\u0000' && LA15_24<='\u001F')||(LA15_24>='!' && LA15_24<='/')||(LA15_24>=':' && LA15_24<='@')||(LA15_24>='[' && LA15_24<='^')||LA15_24=='`'||(LA15_24>='{' && LA15_24<='\uFFFF')) ) {s = 20;}

                        else s = 19;

                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA15_47 = input.LA(1);

                        s = -1;
                        if ( (LA15_47=='M') ) {s = 60;}

                        else if ( ((LA15_47>='0' && LA15_47<='9')||(LA15_47>='A' && LA15_47<='L')||(LA15_47>='N' && LA15_47<='Z')||LA15_47=='_'||(LA15_47>='a' && LA15_47<='z')) ) {s = 18;}

                        else if ( ((LA15_47>='\u0000' && LA15_47<='\u001F')||(LA15_47>='!' && LA15_47<='/')||(LA15_47>=':' && LA15_47<='@')||(LA15_47>='[' && LA15_47<='^')||LA15_47=='`'||(LA15_47>='{' && LA15_47<='\uFFFF')) ) {s = 20;}

                        else s = 19;

                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA15_48 = input.LA(1);

                        s = -1;
                        if ( (LA15_48==':') ) {s = 25;}

                        else if ( (LA15_48=='\r') ) {s = 26;}

                        else if ( (LA15_48=='\n') ) {s = 27;}

                        else if ( ((LA15_48>='0' && LA15_48<='9')||(LA15_48>='A' && LA15_48<='Z')||LA15_48=='_'||(LA15_48>='a' && LA15_48<='z')) ) {s = 61;}

                        else if ( ((LA15_48>='\u0000' && LA15_48<='\t')||(LA15_48>='\u000B' && LA15_48<='\f')||(LA15_48>='\u000E' && LA15_48<='\u001F')||(LA15_48>='!' && LA15_48<='/')||(LA15_48>=';' && LA15_48<='@')||(LA15_48>='[' && LA15_48<='^')||LA15_48=='`'||(LA15_48>='{' && LA15_48<='\uFFFF')) ) {s = 29;}

                        else s = 28;

                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA15_51 = input.LA(1);

                        s = -1;
                        if ( (LA15_51==':') ) {s = 35;}

                        else if ( ((LA15_51>='0' && LA15_51<='9')||(LA15_51>='A' && LA15_51<='Z')||LA15_51=='_'||(LA15_51>='a' && LA15_51<='z')) ) {s = 62;}

                        else if ( (LA15_51=='\"') ) {s = 36;}

                        else if ( (LA15_51=='\\') ) {s = 34;}

                        else if ( ((LA15_51>='\u0000' && LA15_51<='\u001F')||LA15_51=='!'||(LA15_51>='#' && LA15_51<='/')||(LA15_51>=';' && LA15_51<='@')||LA15_51=='['||(LA15_51>=']' && LA15_51<='^')||LA15_51=='`'||(LA15_51>='{' && LA15_51<='\uFFFF')) ) {s = 37;}

                        else if ( (LA15_51==' ') ) {s = 38;}

                        else s = 20;

                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA15_65 = input.LA(1);

                        s = -1;
                        if ( (LA15_65=='*') ) {s = 55;}

                        else if ( (LA15_65==':') ) {s = 56;}

                        else if ( ((LA15_65>='0' && LA15_65<='9')||(LA15_65>='A' && LA15_65<='Z')||LA15_65=='_'||(LA15_65>='a' && LA15_65<='z')) ) {s = 67;}

                        else if ( (LA15_65==' ') ) {s = 58;}

                        else if ( ((LA15_65>='\u0000' && LA15_65<='\u001F')||(LA15_65>='!' && LA15_65<=')')||(LA15_65>='+' && LA15_65<='/')||(LA15_65>=';' && LA15_65<='@')||(LA15_65>='[' && LA15_65<='^')||LA15_65=='`'||(LA15_65>='{' && LA15_65<='\uFFFF')) ) {s = 57;}

                        else s = 20;

                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA15_27 = input.LA(1);

                        s = -1;
                        if ( ((LA15_27>='\u0000' && LA15_27<='\u001F')||(LA15_27>='!' && LA15_27<='\uFFFF')) ) {s = 20;}

                        else s = 28;

                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA15_1 = input.LA(1);

                        s = -1;
                        if ( (LA15_1=='M') ) {s = 17;}

                        else if ( ((LA15_1>='0' && LA15_1<='9')||(LA15_1>='A' && LA15_1<='L')||(LA15_1>='N' && LA15_1<='Z')||LA15_1=='_'||(LA15_1>='a' && LA15_1<='z')) ) {s = 18;}

                        else if ( ((LA15_1>='\u0000' && LA15_1<='\u001F')||(LA15_1>='!' && LA15_1<='/')||(LA15_1>=':' && LA15_1<='@')||(LA15_1>='[' && LA15_1<='^')||LA15_1=='`'||(LA15_1>='{' && LA15_1<='\uFFFF')) ) {s = 20;}

                        else s = 19;

                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA15_46 = input.LA(1);

                        s = -1;
                        if ( ((LA15_46>='0' && LA15_46<='9')||(LA15_46>='A' && LA15_46<='Z')||LA15_46=='_'||(LA15_46>='a' && LA15_46<='z')) ) {s = 18;}

                        else if ( ((LA15_46>='\u0000' && LA15_46<='\u001F')||(LA15_46>='!' && LA15_46<='/')||(LA15_46>=':' && LA15_46<='@')||(LA15_46>='[' && LA15_46<='^')||LA15_46=='`'||(LA15_46>='{' && LA15_46<='\uFFFF')) ) {s = 20;}

                        else s = 59;

                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA15_52 = input.LA(1);

                        s = -1;
                        if ( (LA15_52=='\'') ) {s = 42;}

                        else if ( (LA15_52=='\\') ) {s = 40;}

                        else if ( (LA15_52==':') ) {s = 39;}

                        else if ( ((LA15_52>='0' && LA15_52<='9')||(LA15_52>='A' && LA15_52<='Z')||LA15_52=='_'||(LA15_52>='a' && LA15_52<='z')) ) {s = 63;}

                        else if ( (LA15_52==' ') ) {s = 38;}

                        else if ( ((LA15_52>='\u0000' && LA15_52<='\u001F')||(LA15_52>='!' && LA15_52<='&')||(LA15_52>='(' && LA15_52<='/')||(LA15_52>=';' && LA15_52<='@')||LA15_52=='['||(LA15_52>=']' && LA15_52<='^')||LA15_52=='`'||(LA15_52>='{' && LA15_52<='\uFFFF')) ) {s = 41;}

                        else s = 20;

                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA15_45 = input.LA(1);

                        s = -1;
                        if ( ((LA15_45>='\t' && LA15_45<='\n')||LA15_45=='\r') ) {s = 45;}

                        else if ( ((LA15_45>='\u0000' && LA15_45<='\b')||(LA15_45>='\u000B' && LA15_45<='\f')||(LA15_45>='\u000E' && LA15_45<='\u001F')||(LA15_45>='!' && LA15_45<='\uFFFF')) ) {s = 20;}

                        else s = 44;

                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA15_64 = input.LA(1);

                        s = -1;
                        if ( (LA15_64=='*') ) {s = 55;}

                        else if ( (LA15_64==':') ) {s = 56;}

                        else if ( ((LA15_64>='\u0000' && LA15_64<='\u001F')||(LA15_64>='!' && LA15_64<=')')||(LA15_64>='+' && LA15_64<='9')||(LA15_64>=';' && LA15_64<='\uFFFF')) ) {s = 57;}

                        else s = 58;

                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA15_7 = input.LA(1);

                        s = -1;
                        if ( ((LA15_7>='\u0000' && LA15_7<='\u001F')||(LA15_7>='!' && LA15_7<='@')||(LA15_7>='[' && LA15_7<='^')||LA15_7=='`'||(LA15_7>='{' && LA15_7<='\uFFFF')) ) {s = 20;}

                        else if ( ((LA15_7>='A' && LA15_7<='Z')||LA15_7=='_'||(LA15_7>='a' && LA15_7<='z')) ) {s = 30;}

                        else s = 31;

                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA15_13 = input.LA(1);

                        s = -1;
                        if ( (LA15_13=='*') ) {s = 43;}

                        else if ( ((LA15_13>='\u0000' && LA15_13<='\u001F')||(LA15_13>='!' && LA15_13<=')')||(LA15_13>='+' && LA15_13<='\uFFFF')) ) {s = 20;}

                        else s = 31;

                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA15_55 = input.LA(1);

                        s = -1;
                        if ( (LA15_55=='/') ) {s = 64;}

                        else if ( (LA15_55=='*') ) {s = 55;}

                        else if ( (LA15_55==':') ) {s = 56;}

                        else if ( ((LA15_55>='\u0000' && LA15_55<='\u001F')||(LA15_55>='!' && LA15_55<=')')||(LA15_55>='+' && LA15_55<='.')||(LA15_55>='0' && LA15_55<='9')||(LA15_55>=';' && LA15_55<='\uFFFF')) ) {s = 57;}

                        else if ( (LA15_55==' ') ) {s = 58;}

                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA15_6 = input.LA(1);

                        s = -1;
                        if ( (LA15_6==':') ) {s = 25;}

                        else if ( (LA15_6=='\r') ) {s = 26;}

                        else if ( (LA15_6=='\n') ) {s = 27;}

                        else if ( ((LA15_6>='\u0000' && LA15_6<='\t')||(LA15_6>='\u000B' && LA15_6<='\f')||(LA15_6>='\u000E' && LA15_6<='\u001F')||(LA15_6>='!' && LA15_6<='9')||(LA15_6>=';' && LA15_6<='\uFFFF')) ) {s = 29;}

                        else s = 28;

                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA15_5 = input.LA(1);

                        s = -1;
                        if ( (LA15_5=='R') ) {s = 24;}

                        else if ( ((LA15_5>='0' && LA15_5<='9')||(LA15_5>='A' && LA15_5<='Q')||(LA15_5>='S' && LA15_5<='Z')||LA15_5=='_'||(LA15_5>='a' && LA15_5<='z')) ) {s = 18;}

                        else if ( ((LA15_5>='\u0000' && LA15_5<='\u001F')||(LA15_5>='!' && LA15_5<='/')||(LA15_5>=':' && LA15_5<='@')||(LA15_5>='[' && LA15_5<='^')||LA15_5=='`'||(LA15_5>='{' && LA15_5<='\uFFFF')) ) {s = 20;}

                        else s = 19;

                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA15_0 = input.LA(1);

                        s = -1;
                        if ( (LA15_0=='C') ) {s = 1;}

                        else if ( (LA15_0=='[') ) {s = 2;}

                        else if ( (LA15_0==']') ) {s = 3;}

                        else if ( (LA15_0==',') ) {s = 4;}

                        else if ( (LA15_0=='F') ) {s = 5;}

                        else if ( (LA15_0=='#') ) {s = 6;}

                        else if ( (LA15_0=='^') ) {s = 7;}

                        else if ( (LA15_0==':') ) {s = 8;}

                        else if ( ((LA15_0>='A' && LA15_0<='B')||(LA15_0>='D' && LA15_0<='E')||(LA15_0>='G' && LA15_0<='Z')||LA15_0=='_'||(LA15_0>='a' && LA15_0<='z')) ) {s = 9;}

                        else if ( ((LA15_0>='0' && LA15_0<='9')) ) {s = 10;}

                        else if ( (LA15_0=='\"') ) {s = 11;}

                        else if ( (LA15_0=='\'') ) {s = 12;}

                        else if ( (LA15_0=='/') ) {s = 13;}

                        else if ( ((LA15_0>='\t' && LA15_0<='\n')||LA15_0=='\r') ) {s = 14;}

                        else if ( ((LA15_0>='\u0000' && LA15_0<='\b')||(LA15_0>='\u000B' && LA15_0<='\f')||(LA15_0>='\u000E' && LA15_0<='\u001F')||LA15_0=='!'||(LA15_0>='$' && LA15_0<='&')||(LA15_0>='(' && LA15_0<='+')||(LA15_0>='-' && LA15_0<='.')||(LA15_0>=';' && LA15_0<='@')||LA15_0=='\\'||LA15_0=='`'||(LA15_0>='{' && LA15_0<='\uFFFF')) ) {s = 15;}

                        else if ( (LA15_0==' ') ) {s = 16;}

                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA15_30 = input.LA(1);

                        s = -1;
                        if ( ((LA15_30>='0' && LA15_30<='9')||(LA15_30>='A' && LA15_30<='Z')||LA15_30=='_'||(LA15_30>='a' && LA15_30<='z')) ) {s = 18;}

                        else if ( ((LA15_30>='\u0000' && LA15_30<='\u001F')||(LA15_30>='!' && LA15_30<='/')||(LA15_30>=':' && LA15_30<='@')||(LA15_30>='[' && LA15_30<='^')||LA15_30=='`'||(LA15_30>='{' && LA15_30<='\uFFFF')) ) {s = 20;}

                        else s = 19;

                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        int LA15_34 = input.LA(1);

                        s = -1;
                        if ( (LA15_34==':') ) {s = 49;}

                        else if ( ((LA15_34>='\u0000' && LA15_34<='\u001F')||(LA15_34>='!' && LA15_34<='9')||(LA15_34>=';' && LA15_34<='\uFFFF')) ) {s = 50;}

                        else if ( (LA15_34==' ') ) {s = 38;}

                        if ( s>=0 ) return s;
                        break;
                    case 33 : 
                        int LA15_11 = input.LA(1);

                        s = -1;
                        if ( (LA15_11=='\\') ) {s = 34;}

                        else if ( (LA15_11==':') ) {s = 35;}

                        else if ( (LA15_11=='\"') ) {s = 36;}

                        else if ( ((LA15_11>='\u0000' && LA15_11<='\u001F')||LA15_11=='!'||(LA15_11>='#' && LA15_11<='9')||(LA15_11>=';' && LA15_11<='[')||(LA15_11>=']' && LA15_11<='\uFFFF')) ) {s = 37;}

                        else if ( (LA15_11==' ') ) {s = 38;}

                        else s = 31;

                        if ( s>=0 ) return s;
                        break;
                    case 34 : 
                        int LA15_10 = input.LA(1);

                        s = -1;
                        if ( ((LA15_10>='\u0000' && LA15_10<='\u001F')||(LA15_10>='!' && LA15_10<='/')||(LA15_10>=':' && LA15_10<='\uFFFF')) ) {s = 20;}

                        else if ( ((LA15_10>='0' && LA15_10<='9')) ) {s = 32;}

                        else s = 33;

                        if ( s>=0 ) return s;
                        break;
                    case 35 : 
                        int LA15_26 = input.LA(1);

                        s = -1;
                        if ( (LA15_26=='\n') ) {s = 27;}

                        else if ( ((LA15_26>='\u0000' && LA15_26<='\t')||(LA15_26>='\u000B' && LA15_26<='\u001F')||(LA15_26>='!' && LA15_26<='\uFFFF')) ) {s = 20;}

                        if ( s>=0 ) return s;
                        break;
                    case 36 : 
                        int LA15_61 = input.LA(1);

                        s = -1;
                        if ( ((LA15_61>='0' && LA15_61<='9')||(LA15_61>='A' && LA15_61<='Z')||LA15_61=='_'||(LA15_61>='a' && LA15_61<='z')) ) {s = 61;}

                        else if ( (LA15_61==':') ) {s = 25;}

                        else if ( (LA15_61=='\r') ) {s = 26;}

                        else if ( (LA15_61=='\n') ) {s = 27;}

                        else if ( ((LA15_61>='\u0000' && LA15_61<='\t')||(LA15_61>='\u000B' && LA15_61<='\f')||(LA15_61>='\u000E' && LA15_61<='\u001F')||(LA15_61>='!' && LA15_61<='/')||(LA15_61>=';' && LA15_61<='@')||(LA15_61>='[' && LA15_61<='^')||LA15_61=='`'||(LA15_61>='{' && LA15_61<='\uFFFF')) ) {s = 29;}

                        else s = 28;

                        if ( s>=0 ) return s;
                        break;
                    case 37 : 
                        int LA15_25 = input.LA(1);

                        s = -1;
                        if ( ((LA15_25>='0' && LA15_25<='9')||(LA15_25>='A' && LA15_25<='Z')||LA15_25=='_'||(LA15_25>='a' && LA15_25<='z')) ) {s = 48;}

                        else if ( (LA15_25==':') ) {s = 25;}

                        else if ( (LA15_25=='\r') ) {s = 26;}

                        else if ( (LA15_25=='\n') ) {s = 27;}

                        else if ( ((LA15_25>='\u0000' && LA15_25<='\t')||(LA15_25>='\u000B' && LA15_25<='\f')||(LA15_25>='\u000E' && LA15_25<='\u001F')||(LA15_25>='!' && LA15_25<='/')||(LA15_25>=';' && LA15_25<='@')||(LA15_25>='[' && LA15_25<='^')||LA15_25=='`'||(LA15_25>='{' && LA15_25<='\uFFFF')) ) {s = 29;}

                        else s = 28;

                        if ( s>=0 ) return s;
                        break;
                    case 38 : 
                        int LA15_49 = input.LA(1);

                        s = -1;
                        if ( ((LA15_49>='0' && LA15_49<='9')||(LA15_49>='A' && LA15_49<='Z')||LA15_49=='_'||(LA15_49>='a' && LA15_49<='z')) ) {s = 51;}

                        else if ( (LA15_49==':') ) {s = 35;}

                        else if ( (LA15_49=='\"') ) {s = 36;}

                        else if ( (LA15_49=='\\') ) {s = 34;}

                        else if ( ((LA15_49>='\u0000' && LA15_49<='\u001F')||LA15_49=='!'||(LA15_49>='#' && LA15_49<='/')||(LA15_49>=';' && LA15_49<='@')||LA15_49=='['||(LA15_49>=']' && LA15_49<='^')||LA15_49=='`'||(LA15_49>='{' && LA15_49<='\uFFFF')) ) {s = 37;}

                        else if ( (LA15_49==' ') ) {s = 38;}

                        if ( s>=0 ) return s;
                        break;
                    case 39 : 
                        int LA15_62 = input.LA(1);

                        s = -1;
                        if ( ((LA15_62>='0' && LA15_62<='9')||(LA15_62>='A' && LA15_62<='Z')||LA15_62=='_'||(LA15_62>='a' && LA15_62<='z')) ) {s = 62;}

                        else if ( (LA15_62==':') ) {s = 35;}

                        else if ( (LA15_62=='\"') ) {s = 36;}

                        else if ( (LA15_62=='\\') ) {s = 34;}

                        else if ( ((LA15_62>='\u0000' && LA15_62<='\u001F')||LA15_62=='!'||(LA15_62>='#' && LA15_62<='/')||(LA15_62>=';' && LA15_62<='@')||LA15_62=='['||(LA15_62>=']' && LA15_62<='^')||LA15_62=='`'||(LA15_62>='{' && LA15_62<='\uFFFF')) ) {s = 37;}

                        else if ( (LA15_62==' ') ) {s = 38;}

                        else s = 20;

                        if ( s>=0 ) return s;
                        break;
                    case 40 : 
                        int LA15_40 = input.LA(1);

                        s = -1;
                        if ( (LA15_40==':') ) {s = 53;}

                        else if ( ((LA15_40>='\u0000' && LA15_40<='\u001F')||(LA15_40>='!' && LA15_40<='9')||(LA15_40>=';' && LA15_40<='\uFFFF')) ) {s = 54;}

                        else if ( (LA15_40==' ') ) {s = 38;}

                        if ( s>=0 ) return s;
                        break;
                    case 41 : 
                        int LA15_60 = input.LA(1);

                        s = -1;
                        if ( ((LA15_60>='0' && LA15_60<='9')||(LA15_60>='A' && LA15_60<='Z')||LA15_60=='_'||(LA15_60>='a' && LA15_60<='z')) ) {s = 18;}

                        else if ( ((LA15_60>='\u0000' && LA15_60<='\u001F')||(LA15_60>='!' && LA15_60<='/')||(LA15_60>=':' && LA15_60<='@')||(LA15_60>='[' && LA15_60<='^')||LA15_60=='`'||(LA15_60>='{' && LA15_60<='\uFFFF')) ) {s = 20;}

                        else s = 66;

                        if ( s>=0 ) return s;
                        break;
                    case 42 : 
                        int LA15_67 = input.LA(1);

                        s = -1;
                        if ( ((LA15_67>='0' && LA15_67<='9')||(LA15_67>='A' && LA15_67<='Z')||LA15_67=='_'||(LA15_67>='a' && LA15_67<='z')) ) {s = 67;}

                        else if ( (LA15_67=='*') ) {s = 55;}

                        else if ( (LA15_67==':') ) {s = 56;}

                        else if ( ((LA15_67>='\u0000' && LA15_67<='\u001F')||(LA15_67>='!' && LA15_67<=')')||(LA15_67>='+' && LA15_67<='/')||(LA15_67>=';' && LA15_67<='@')||(LA15_67>='[' && LA15_67<='^')||LA15_67=='`'||(LA15_67>='{' && LA15_67<='\uFFFF')) ) {s = 57;}

                        else if ( (LA15_67==' ') ) {s = 58;}

                        else s = 20;

                        if ( s>=0 ) return s;
                        break;
                    case 43 : 
                        int LA15_2 = input.LA(1);

                        s = -1;
                        if ( ((LA15_2>='\u0000' && LA15_2<='\u001F')||(LA15_2>='!' && LA15_2<='\uFFFF')) ) {s = 20;}

                        else s = 21;

                        if ( s>=0 ) return s;
                        break;
                    case 44 : 
                        int LA15_35 = input.LA(1);

                        s = -1;
                        if ( ((LA15_35>='0' && LA15_35<='9')||(LA15_35>='A' && LA15_35<='Z')||LA15_35=='_'||(LA15_35>='a' && LA15_35<='z')) ) {s = 51;}

                        else if ( (LA15_35==':') ) {s = 35;}

                        else if ( (LA15_35=='\"') ) {s = 36;}

                        else if ( (LA15_35=='\\') ) {s = 34;}

                        else if ( ((LA15_35>='\u0000' && LA15_35<='\u001F')||LA15_35=='!'||(LA15_35>='#' && LA15_35<='/')||(LA15_35>=';' && LA15_35<='@')||LA15_35=='['||(LA15_35>=']' && LA15_35<='^')||LA15_35=='`'||(LA15_35>='{' && LA15_35<='\uFFFF')) ) {s = 37;}

                        else if ( (LA15_35==' ') ) {s = 38;}

                        if ( s>=0 ) return s;
                        break;
                    case 45 : 
                        int LA15_56 = input.LA(1);

                        s = -1;
                        if ( ((LA15_56>='0' && LA15_56<='9')||(LA15_56>='A' && LA15_56<='Z')||LA15_56=='_'||(LA15_56>='a' && LA15_56<='z')) ) {s = 65;}

                        else if ( (LA15_56=='*') ) {s = 55;}

                        else if ( (LA15_56==':') ) {s = 56;}

                        else if ( ((LA15_56>='\u0000' && LA15_56<='\u001F')||(LA15_56>='!' && LA15_56<=')')||(LA15_56>='+' && LA15_56<='/')||(LA15_56>=';' && LA15_56<='@')||(LA15_56>='[' && LA15_56<='^')||LA15_56=='`'||(LA15_56>='{' && LA15_56<='\uFFFF')) ) {s = 57;}

                        else if ( (LA15_56==' ') ) {s = 58;}

                        if ( s>=0 ) return s;
                        break;
                    case 46 : 
                        int LA15_43 = input.LA(1);

                        s = -1;
                        if ( (LA15_43=='*') ) {s = 55;}

                        else if ( (LA15_43==':') ) {s = 56;}

                        else if ( ((LA15_43>='\u0000' && LA15_43<='\u001F')||(LA15_43>='!' && LA15_43<=')')||(LA15_43>='+' && LA15_43<='9')||(LA15_43>=';' && LA15_43<='\uFFFF')) ) {s = 57;}

                        else if ( (LA15_43==' ') ) {s = 58;}

                        if ( s>=0 ) return s;
                        break;
                    case 47 : 
                        int LA15_53 = input.LA(1);

                        s = -1;
                        if ( ((LA15_53>='0' && LA15_53<='9')||(LA15_53>='A' && LA15_53<='Z')||LA15_53=='_'||(LA15_53>='a' && LA15_53<='z')) ) {s = 52;}

                        else if ( (LA15_53==':') ) {s = 39;}

                        else if ( (LA15_53=='\'') ) {s = 42;}

                        else if ( (LA15_53=='\\') ) {s = 40;}

                        else if ( ((LA15_53>='\u0000' && LA15_53<='\u001F')||(LA15_53>='!' && LA15_53<='&')||(LA15_53>='(' && LA15_53<='/')||(LA15_53>=';' && LA15_53<='@')||LA15_53=='['||(LA15_53>=']' && LA15_53<='^')||LA15_53=='`'||(LA15_53>='{' && LA15_53<='\uFFFF')) ) {s = 41;}

                        else if ( (LA15_53==' ') ) {s = 38;}

                        if ( s>=0 ) return s;
                        break;
                    case 48 : 
                        int LA15_18 = input.LA(1);

                        s = -1;
                        if ( ((LA15_18>='0' && LA15_18<='9')||(LA15_18>='A' && LA15_18<='Z')||LA15_18=='_'||(LA15_18>='a' && LA15_18<='z')) ) {s = 18;}

                        else if ( ((LA15_18>='\u0000' && LA15_18<='\u001F')||(LA15_18>='!' && LA15_18<='/')||(LA15_18>=':' && LA15_18<='@')||(LA15_18>='[' && LA15_18<='^')||LA15_18=='`'||(LA15_18>='{' && LA15_18<='\uFFFF')) ) {s = 20;}

                        else s = 19;

                        if ( s>=0 ) return s;
                        break;
                    case 49 : 
                        int LA15_63 = input.LA(1);

                        s = -1;
                        if ( ((LA15_63>='0' && LA15_63<='9')||(LA15_63>='A' && LA15_63<='Z')||LA15_63=='_'||(LA15_63>='a' && LA15_63<='z')) ) {s = 63;}

                        else if ( (LA15_63=='\'') ) {s = 42;}

                        else if ( (LA15_63=='\\') ) {s = 40;}

                        else if ( (LA15_63==':') ) {s = 39;}

                        else if ( ((LA15_63>='\u0000' && LA15_63<='\u001F')||(LA15_63>='!' && LA15_63<='&')||(LA15_63>='(' && LA15_63<='/')||(LA15_63>=';' && LA15_63<='@')||LA15_63=='['||(LA15_63>=']' && LA15_63<='^')||LA15_63=='`'||(LA15_63>='{' && LA15_63<='\uFFFF')) ) {s = 41;}

                        else if ( (LA15_63==' ') ) {s = 38;}

                        else s = 20;

                        if ( s>=0 ) return s;
                        break;
                    case 50 : 
                        int LA15_8 = input.LA(1);

                        s = -1;
                        if ( ((LA15_8>='\u0000' && LA15_8<='\u001F')||(LA15_8>='!' && LA15_8<='\uFFFF')) ) {s = 20;}

                        else s = 31;

                        if ( s>=0 ) return s;
                        break;
                    case 51 : 
                        int LA15_3 = input.LA(1);

                        s = -1;
                        if ( ((LA15_3>='\u0000' && LA15_3<='\u001F')||(LA15_3>='!' && LA15_3<='\uFFFF')) ) {s = 20;}

                        else s = 22;

                        if ( s>=0 ) return s;
                        break;
                    case 52 : 
                        int LA15_36 = input.LA(1);

                        s = -1;
                        if ( ((LA15_36>='\u0000' && LA15_36<='\u001F')||(LA15_36>='!' && LA15_36<='\uFFFF')) ) {s = 20;}

                        else s = 38;

                        if ( s>=0 ) return s;
                        break;
                    case 53 : 
                        int LA15_39 = input.LA(1);

                        s = -1;
                        if ( ((LA15_39>='0' && LA15_39<='9')||(LA15_39>='A' && LA15_39<='Z')||LA15_39=='_'||(LA15_39>='a' && LA15_39<='z')) ) {s = 52;}

                        else if ( (LA15_39=='\'') ) {s = 42;}

                        else if ( (LA15_39=='\\') ) {s = 40;}

                        else if ( (LA15_39==':') ) {s = 39;}

                        else if ( ((LA15_39>='\u0000' && LA15_39<='\u001F')||(LA15_39>='!' && LA15_39<='&')||(LA15_39>='(' && LA15_39<='/')||(LA15_39>=';' && LA15_39<='@')||LA15_39=='['||(LA15_39>=']' && LA15_39<='^')||LA15_39=='`'||(LA15_39>='{' && LA15_39<='\uFFFF')) ) {s = 41;}

                        else if ( (LA15_39==' ') ) {s = 38;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 15, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}