package org.xtext.example.mydsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslLexer extends Lexer {
    public static final int RULE_ID=12;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=18;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_INTEGERLITERAL=5;
    public static final int RULE_IDENTIFIER=4;
    public static final int EOF=-1;
    public static final int RULE_SL_COMMENT=16;
    public static final int RULE_ML_COMMENT=15;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int RULE_BOOLEANLITERAL=6;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_STRING=14;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int RULE_POINTERLITERAL=7;
    public static final int RULE_KEYWORD=10;
    public static final int RULE_INT=13;
    public static final int RULE_PPOPORPUNC=11;
    public static final int RULE_PPNUMBER=8;
    public static final int RULE_WS=17;
    public static final int RULE_LITERAL=9;

    // delegates
    // delegators

    public InternalMyDslLexer() {;} 
    public InternalMyDslLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalMyDslLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g"; }

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:11:7: ( '\\n' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:11:9: '\\n'
            {
            match('\n'); 

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
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:12:7: ( '#if' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:12:9: '#if'
            {
            match("#if"); 


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
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:13:7: ( '#ifdef' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:13:9: '#ifdef'
            {
            match("#ifdef"); 


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
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:14:7: ( '#ifndef' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:14:9: '#ifndef'
            {
            match("#ifndef"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:15:7: ( '#elif' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:15:9: '#elif'
            {
            match("#elif"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:16:7: ( '==' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:16:9: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:17:7: ( '!=' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:17:9: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:18:7: ( '#else' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:18:9: '#else'
            {
            match("#else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:19:7: ( '#endif' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:19:9: '#endif'
            {
            match("#endif"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:20:7: ( '#include' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:20:9: '#include'
            {
            match("#include"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:21:7: ( '#define' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:21:9: '#define'
            {
            match("#define"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:22:7: ( ')' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:22:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:23:7: ( '#undef' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:23:9: '#undef'
            {
            match("#undef"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:24:7: ( '#line' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:24:9: '#line'
            {
            match("#line"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:25:7: ( '#error' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:25:9: '#error'
            {
            match("#error"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:26:7: ( '#pragma' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:26:9: '#pragma'
            {
            match("#pragma"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:27:7: ( '#' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:27:9: '#'
            {
            match('#'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:28:7: ( '(' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:28:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "RULE_INTEGERLITERAL"
    public final void mRULE_INTEGERLITERAL() throws RecognitionException {
        try {
            int _type = RULE_INTEGERLITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1065:21: ( ( '1' .. '9' ( '0' .. '9' )* ( ( 'u' | 'U' ) ( 'l' | 'L' | 'll' | 'LL' )? | ( 'l' | 'L' | 'll' | 'LL' ) ( 'u' | 'U' )? )? | '0' ( '0' .. '7' )* ( ( 'u' | 'U' ) ( 'l' | 'L' | 'll' | 'LL' )? | ( 'l' | 'L' | 'll' | 'LL' ) ( 'u' | 'U' )? )? | ( '0x' | '0X' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+ ( ( 'u' | 'U' ) ( 'l' | 'L' | 'll' | 'LL' )? | ( 'l' | 'L' | 'll' | 'LL' ) ( 'u' | 'U' )? )? ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1065:23: ( '1' .. '9' ( '0' .. '9' )* ( ( 'u' | 'U' ) ( 'l' | 'L' | 'll' | 'LL' )? | ( 'l' | 'L' | 'll' | 'LL' ) ( 'u' | 'U' )? )? | '0' ( '0' .. '7' )* ( ( 'u' | 'U' ) ( 'l' | 'L' | 'll' | 'LL' )? | ( 'l' | 'L' | 'll' | 'LL' ) ( 'u' | 'U' )? )? | ( '0x' | '0X' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+ ( ( 'u' | 'U' ) ( 'l' | 'L' | 'll' | 'LL' )? | ( 'l' | 'L' | 'll' | 'LL' ) ( 'u' | 'U' )? )? )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1065:23: ( '1' .. '9' ( '0' .. '9' )* ( ( 'u' | 'U' ) ( 'l' | 'L' | 'll' | 'LL' )? | ( 'l' | 'L' | 'll' | 'LL' ) ( 'u' | 'U' )? )? | '0' ( '0' .. '7' )* ( ( 'u' | 'U' ) ( 'l' | 'L' | 'll' | 'LL' )? | ( 'l' | 'L' | 'll' | 'LL' ) ( 'u' | 'U' )? )? | ( '0x' | '0X' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+ ( ( 'u' | 'U' ) ( 'l' | 'L' | 'll' | 'LL' )? | ( 'l' | 'L' | 'll' | 'LL' ) ( 'u' | 'U' )? )? )
            int alt17=3;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>='1' && LA17_0<='9')) ) {
                alt17=1;
            }
            else if ( (LA17_0=='0') ) {
                int LA17_2 = input.LA(2);

                if ( (LA17_2=='X'||LA17_2=='x') ) {
                    alt17=3;
                }
                else {
                    alt17=2;}
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1065:24: '1' .. '9' ( '0' .. '9' )* ( ( 'u' | 'U' ) ( 'l' | 'L' | 'll' | 'LL' )? | ( 'l' | 'L' | 'll' | 'LL' ) ( 'u' | 'U' )? )?
                    {
                    matchRange('1','9'); 
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1065:33: ( '0' .. '9' )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1065:34: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1065:45: ( ( 'u' | 'U' ) ( 'l' | 'L' | 'll' | 'LL' )? | ( 'l' | 'L' | 'll' | 'LL' ) ( 'u' | 'U' )? )?
                    int alt5=3;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0=='U'||LA5_0=='u') ) {
                        alt5=1;
                    }
                    else if ( (LA5_0=='L'||LA5_0=='l') ) {
                        alt5=2;
                    }
                    switch (alt5) {
                        case 1 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1065:46: ( 'u' | 'U' ) ( 'l' | 'L' | 'll' | 'LL' )?
                            {
                            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}

                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1065:56: ( 'l' | 'L' | 'll' | 'LL' )?
                            int alt2=5;
                            int LA2_0 = input.LA(1);

                            if ( (LA2_0=='l') ) {
                                int LA2_1 = input.LA(2);

                                if ( (LA2_1=='l') ) {
                                    alt2=3;
                                }
                            }
                            else if ( (LA2_0=='L') ) {
                                int LA2_2 = input.LA(2);

                                if ( (LA2_2=='L') ) {
                                    alt2=4;
                                }
                            }
                            switch (alt2) {
                                case 1 :
                                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1065:57: 'l'
                                    {
                                    match('l'); 

                                    }
                                    break;
                                case 2 :
                                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1065:61: 'L'
                                    {
                                    match('L'); 

                                    }
                                    break;
                                case 3 :
                                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1065:65: 'll'
                                    {
                                    match("ll"); 


                                    }
                                    break;
                                case 4 :
                                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1065:70: 'LL'
                                    {
                                    match("LL"); 


                                    }
                                    break;

                            }


                            }
                            break;
                        case 2 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1065:77: ( 'l' | 'L' | 'll' | 'LL' ) ( 'u' | 'U' )?
                            {
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1065:77: ( 'l' | 'L' | 'll' | 'LL' )
                            int alt3=4;
                            int LA3_0 = input.LA(1);

                            if ( (LA3_0=='l') ) {
                                int LA3_1 = input.LA(2);

                                if ( (LA3_1=='l') ) {
                                    alt3=3;
                                }
                                else {
                                    alt3=1;}
                            }
                            else if ( (LA3_0=='L') ) {
                                int LA3_2 = input.LA(2);

                                if ( (LA3_2=='L') ) {
                                    alt3=4;
                                }
                                else {
                                    alt3=2;}
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 3, 0, input);

                                throw nvae;
                            }
                            switch (alt3) {
                                case 1 :
                                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1065:78: 'l'
                                    {
                                    match('l'); 

                                    }
                                    break;
                                case 2 :
                                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1065:82: 'L'
                                    {
                                    match('L'); 

                                    }
                                    break;
                                case 3 :
                                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1065:86: 'll'
                                    {
                                    match("ll"); 


                                    }
                                    break;
                                case 4 :
                                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1065:91: 'LL'
                                    {
                                    match("LL"); 


                                    }
                                    break;

                            }

                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1065:97: ( 'u' | 'U' )?
                            int alt4=2;
                            int LA4_0 = input.LA(1);

                            if ( (LA4_0=='U'||LA4_0=='u') ) {
                                alt4=1;
                            }
                            switch (alt4) {
                                case 1 :
                                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:
                                    {
                                    if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
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
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1065:110: '0' ( '0' .. '7' )* ( ( 'u' | 'U' ) ( 'l' | 'L' | 'll' | 'LL' )? | ( 'l' | 'L' | 'll' | 'LL' ) ( 'u' | 'U' )? )?
                    {
                    match('0'); 
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1065:114: ( '0' .. '7' )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( ((LA6_0>='0' && LA6_0<='7')) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1065:115: '0' .. '7'
                    	    {
                    	    matchRange('0','7'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1065:126: ( ( 'u' | 'U' ) ( 'l' | 'L' | 'll' | 'LL' )? | ( 'l' | 'L' | 'll' | 'LL' ) ( 'u' | 'U' )? )?
                    int alt10=3;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='U'||LA10_0=='u') ) {
                        alt10=1;
                    }
                    else if ( (LA10_0=='L'||LA10_0=='l') ) {
                        alt10=2;
                    }
                    switch (alt10) {
                        case 1 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1065:127: ( 'u' | 'U' ) ( 'l' | 'L' | 'll' | 'LL' )?
                            {
                            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}

                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1065:137: ( 'l' | 'L' | 'll' | 'LL' )?
                            int alt7=5;
                            int LA7_0 = input.LA(1);

                            if ( (LA7_0=='l') ) {
                                int LA7_1 = input.LA(2);

                                if ( (LA7_1=='l') ) {
                                    alt7=3;
                                }
                            }
                            else if ( (LA7_0=='L') ) {
                                int LA7_2 = input.LA(2);

                                if ( (LA7_2=='L') ) {
                                    alt7=4;
                                }
                            }
                            switch (alt7) {
                                case 1 :
                                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1065:138: 'l'
                                    {
                                    match('l'); 

                                    }
                                    break;
                                case 2 :
                                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1065:142: 'L'
                                    {
                                    match('L'); 

                                    }
                                    break;
                                case 3 :
                                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1065:146: 'll'
                                    {
                                    match("ll"); 


                                    }
                                    break;
                                case 4 :
                                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1065:151: 'LL'
                                    {
                                    match("LL"); 


                                    }
                                    break;

                            }


                            }
                            break;
                        case 2 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1065:158: ( 'l' | 'L' | 'll' | 'LL' ) ( 'u' | 'U' )?
                            {
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1065:158: ( 'l' | 'L' | 'll' | 'LL' )
                            int alt8=4;
                            int LA8_0 = input.LA(1);

                            if ( (LA8_0=='l') ) {
                                int LA8_1 = input.LA(2);

                                if ( (LA8_1=='l') ) {
                                    alt8=3;
                                }
                                else {
                                    alt8=1;}
                            }
                            else if ( (LA8_0=='L') ) {
                                int LA8_2 = input.LA(2);

                                if ( (LA8_2=='L') ) {
                                    alt8=4;
                                }
                                else {
                                    alt8=2;}
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 8, 0, input);

                                throw nvae;
                            }
                            switch (alt8) {
                                case 1 :
                                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1065:159: 'l'
                                    {
                                    match('l'); 

                                    }
                                    break;
                                case 2 :
                                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1065:163: 'L'
                                    {
                                    match('L'); 

                                    }
                                    break;
                                case 3 :
                                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1065:167: 'll'
                                    {
                                    match("ll"); 


                                    }
                                    break;
                                case 4 :
                                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1065:172: 'LL'
                                    {
                                    match("LL"); 


                                    }
                                    break;

                            }

                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1065:178: ( 'u' | 'U' )?
                            int alt9=2;
                            int LA9_0 = input.LA(1);

                            if ( (LA9_0=='U'||LA9_0=='u') ) {
                                alt9=1;
                            }
                            switch (alt9) {
                                case 1 :
                                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:
                                    {
                                    if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
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
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1065:191: ( '0x' | '0X' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+ ( ( 'u' | 'U' ) ( 'l' | 'L' | 'll' | 'LL' )? | ( 'l' | 'L' | 'll' | 'LL' ) ( 'u' | 'U' )? )?
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1065:191: ( '0x' | '0X' )
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='0') ) {
                        int LA11_1 = input.LA(2);

                        if ( (LA11_1=='x') ) {
                            alt11=1;
                        }
                        else if ( (LA11_1=='X') ) {
                            alt11=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 11, 1, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 11, 0, input);

                        throw nvae;
                    }
                    switch (alt11) {
                        case 1 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1065:192: '0x'
                            {
                            match("0x"); 


                            }
                            break;
                        case 2 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1065:197: '0X'
                            {
                            match("0X"); 


                            }
                            break;

                    }

                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1065:203: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+
                    int cnt12=0;
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( ((LA12_0>='0' && LA12_0<='9')||(LA12_0>='A' && LA12_0<='F')||(LA12_0>='a' && LA12_0<='f')) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:
                    	    {
                    	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt12 >= 1 ) break loop12;
                                EarlyExitException eee =
                                    new EarlyExitException(12, input);
                                throw eee;
                        }
                        cnt12++;
                    } while (true);

                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1065:233: ( ( 'u' | 'U' ) ( 'l' | 'L' | 'll' | 'LL' )? | ( 'l' | 'L' | 'll' | 'LL' ) ( 'u' | 'U' )? )?
                    int alt16=3;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0=='U'||LA16_0=='u') ) {
                        alt16=1;
                    }
                    else if ( (LA16_0=='L'||LA16_0=='l') ) {
                        alt16=2;
                    }
                    switch (alt16) {
                        case 1 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1065:234: ( 'u' | 'U' ) ( 'l' | 'L' | 'll' | 'LL' )?
                            {
                            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}

                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1065:244: ( 'l' | 'L' | 'll' | 'LL' )?
                            int alt13=5;
                            int LA13_0 = input.LA(1);

                            if ( (LA13_0=='l') ) {
                                int LA13_1 = input.LA(2);

                                if ( (LA13_1=='l') ) {
                                    alt13=3;
                                }
                            }
                            else if ( (LA13_0=='L') ) {
                                int LA13_2 = input.LA(2);

                                if ( (LA13_2=='L') ) {
                                    alt13=4;
                                }
                            }
                            switch (alt13) {
                                case 1 :
                                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1065:245: 'l'
                                    {
                                    match('l'); 

                                    }
                                    break;
                                case 2 :
                                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1065:249: 'L'
                                    {
                                    match('L'); 

                                    }
                                    break;
                                case 3 :
                                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1065:253: 'll'
                                    {
                                    match("ll"); 


                                    }
                                    break;
                                case 4 :
                                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1065:258: 'LL'
                                    {
                                    match("LL"); 


                                    }
                                    break;

                            }


                            }
                            break;
                        case 2 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1065:265: ( 'l' | 'L' | 'll' | 'LL' ) ( 'u' | 'U' )?
                            {
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1065:265: ( 'l' | 'L' | 'll' | 'LL' )
                            int alt14=4;
                            int LA14_0 = input.LA(1);

                            if ( (LA14_0=='l') ) {
                                int LA14_1 = input.LA(2);

                                if ( (LA14_1=='l') ) {
                                    alt14=3;
                                }
                                else {
                                    alt14=1;}
                            }
                            else if ( (LA14_0=='L') ) {
                                int LA14_2 = input.LA(2);

                                if ( (LA14_2=='L') ) {
                                    alt14=4;
                                }
                                else {
                                    alt14=2;}
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 14, 0, input);

                                throw nvae;
                            }
                            switch (alt14) {
                                case 1 :
                                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1065:266: 'l'
                                    {
                                    match('l'); 

                                    }
                                    break;
                                case 2 :
                                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1065:270: 'L'
                                    {
                                    match('L'); 

                                    }
                                    break;
                                case 3 :
                                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1065:274: 'll'
                                    {
                                    match("ll"); 


                                    }
                                    break;
                                case 4 :
                                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1065:279: 'LL'
                                    {
                                    match("LL"); 


                                    }
                                    break;

                            }

                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1065:285: ( 'u' | 'U' )?
                            int alt15=2;
                            int LA15_0 = input.LA(1);

                            if ( (LA15_0=='U'||LA15_0=='u') ) {
                                alt15=1;
                            }
                            switch (alt15) {
                                case 1 :
                                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:
                                    {
                                    if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
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
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INTEGERLITERAL"

    // $ANTLR start "RULE_BOOLEANLITERAL"
    public final void mRULE_BOOLEANLITERAL() throws RecognitionException {
        try {
            int _type = RULE_BOOLEANLITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1067:21: ( ( 'false' | 'true' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1067:23: ( 'false' | 'true' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1067:23: ( 'false' | 'true' )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0=='f') ) {
                alt18=1;
            }
            else if ( (LA18_0=='t') ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1067:24: 'false'
                    {
                    match("false"); 


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1067:32: 'true'
                    {
                    match("true"); 


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
    // $ANTLR end "RULE_BOOLEANLITERAL"

    // $ANTLR start "RULE_POINTERLITERAL"
    public final void mRULE_POINTERLITERAL() throws RecognitionException {
        try {
            int _type = RULE_POINTERLITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1069:21: ( 'nullptr' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1069:23: 'nullptr'
            {
            match("nullptr"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_POINTERLITERAL"

    // $ANTLR start "RULE_PPNUMBER"
    public final void mRULE_PPNUMBER() throws RecognitionException {
        try {
            int _type = RULE_PPNUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1071:15: ( ( '0' .. '9' | '.' '0' .. '9' ) ( '0' .. '9' | ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) | 'e' ( '+' | '-' ) | 'E' ( '+' | '-' ) | '.' )* )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1071:17: ( '0' .. '9' | '.' '0' .. '9' ) ( '0' .. '9' | ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) | 'e' ( '+' | '-' ) | 'E' ( '+' | '-' ) | '.' )*
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1071:17: ( '0' .. '9' | '.' '0' .. '9' )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>='0' && LA19_0<='9')) ) {
                alt19=1;
            }
            else if ( (LA19_0=='.') ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1071:18: '0' .. '9'
                    {
                    matchRange('0','9'); 

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1071:27: '.' '0' .. '9'
                    {
                    match('.'); 
                    matchRange('0','9'); 

                    }
                    break;

            }

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1071:41: ( '0' .. '9' | ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) | 'e' ( '+' | '-' ) | 'E' ( '+' | '-' ) | '.' )*
            loop20:
            do {
                int alt20=6;
                switch ( input.LA(1) ) {
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
                    {
                    alt20=1;
                    }
                    break;
                case 'e':
                    {
                    int LA20_3 = input.LA(2);

                    if ( (LA20_3=='+'||LA20_3=='-') ) {
                        alt20=3;
                    }

                    else {
                        alt20=2;
                    }

                    }
                    break;
                case 'E':
                    {
                    int LA20_4 = input.LA(2);

                    if ( (LA20_4=='+'||LA20_4=='-') ) {
                        alt20=4;
                    }

                    else {
                        alt20=2;
                    }

                    }
                    break;
                case 'A':
                case 'B':
                case 'C':
                case 'D':
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
                    {
                    alt20=2;
                    }
                    break;
                case '.':
                    {
                    alt20=5;
                    }
                    break;

                }

                switch (alt20) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1071:42: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;
            	case 2 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1071:51: ( 'a' .. 'z' | 'A' .. 'Z' | '_' )
            	    {
            	    if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;
            	case 3 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1071:75: 'e' ( '+' | '-' )
            	    {
            	    match('e'); 
            	    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;
            	case 4 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1071:89: 'E' ( '+' | '-' )
            	    {
            	    match('E'); 
            	    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;
            	case 5 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1071:103: '.'
            	    {
            	    match('.'); 

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PPNUMBER"

    // $ANTLR start "RULE_LITERAL"
    public final void mRULE_LITERAL() throws RecognitionException {
        try {
            int _type = RULE_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1073:14: ( ( RULE_INTEGERLITERAL | RULE_BOOLEANLITERAL | RULE_POINTERLITERAL ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1073:16: ( RULE_INTEGERLITERAL | RULE_BOOLEANLITERAL | RULE_POINTERLITERAL )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1073:16: ( RULE_INTEGERLITERAL | RULE_BOOLEANLITERAL | RULE_POINTERLITERAL )
            int alt21=3;
            switch ( input.LA(1) ) {
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
                {
                alt21=1;
                }
                break;
            case 'f':
            case 't':
                {
                alt21=2;
                }
                break;
            case 'n':
                {
                alt21=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1073:17: RULE_INTEGERLITERAL
                    {
                    mRULE_INTEGERLITERAL(); 

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1073:37: RULE_BOOLEANLITERAL
                    {
                    mRULE_BOOLEANLITERAL(); 

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1073:57: RULE_POINTERLITERAL
                    {
                    mRULE_POINTERLITERAL(); 

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
    // $ANTLR end "RULE_LITERAL"

    // $ANTLR start "RULE_KEYWORD"
    public final void mRULE_KEYWORD() throws RecognitionException {
        try {
            int _type = RULE_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1075:14: ( ( 'alignas' | 'alignof' | 'asm' | 'auto' | 'bool' | 'break' | 'case' | 'catch' | 'char' | 'char16_t' | 'char32_t' | 'class' | 'const' | 'constexpr' | 'const_cast' | 'continue' | 'decltype' | 'default' | 'delete' | 'do' | 'double' | 'dynamic_cast' | 'else' | 'enum' | 'explicit' | 'export' | 'extern' | 'false' | 'float' | 'for' | 'friend' | 'goto' | 'if' | 'inline' | 'int' | 'long' | 'mutable' | 'namespace' | 'new' | 'noexcept' | 'nullptr' | 'operator' | 'private' | 'protected' | 'public' | 'register' | 'reinterpret_cast' | 'return' | 'short' | 'signed' | 'sizeof' | 'static' | 'static_assert' | 'static_cast' | 'struct' | 'switch' | 'template' | 'this' | 'thread_local' | 'throw' | 'true' | 'try' | 'typedef' | 'typeid' | 'typename' | 'union' | 'unsigned' | 'using' | 'virtual' | 'void' | 'volatile' | 'wchar_t' | 'while' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1075:16: ( 'alignas' | 'alignof' | 'asm' | 'auto' | 'bool' | 'break' | 'case' | 'catch' | 'char' | 'char16_t' | 'char32_t' | 'class' | 'const' | 'constexpr' | 'const_cast' | 'continue' | 'decltype' | 'default' | 'delete' | 'do' | 'double' | 'dynamic_cast' | 'else' | 'enum' | 'explicit' | 'export' | 'extern' | 'false' | 'float' | 'for' | 'friend' | 'goto' | 'if' | 'inline' | 'int' | 'long' | 'mutable' | 'namespace' | 'new' | 'noexcept' | 'nullptr' | 'operator' | 'private' | 'protected' | 'public' | 'register' | 'reinterpret_cast' | 'return' | 'short' | 'signed' | 'sizeof' | 'static' | 'static_assert' | 'static_cast' | 'struct' | 'switch' | 'template' | 'this' | 'thread_local' | 'throw' | 'true' | 'try' | 'typedef' | 'typeid' | 'typename' | 'union' | 'unsigned' | 'using' | 'virtual' | 'void' | 'volatile' | 'wchar_t' | 'while' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1075:16: ( 'alignas' | 'alignof' | 'asm' | 'auto' | 'bool' | 'break' | 'case' | 'catch' | 'char' | 'char16_t' | 'char32_t' | 'class' | 'const' | 'constexpr' | 'const_cast' | 'continue' | 'decltype' | 'default' | 'delete' | 'do' | 'double' | 'dynamic_cast' | 'else' | 'enum' | 'explicit' | 'export' | 'extern' | 'false' | 'float' | 'for' | 'friend' | 'goto' | 'if' | 'inline' | 'int' | 'long' | 'mutable' | 'namespace' | 'new' | 'noexcept' | 'nullptr' | 'operator' | 'private' | 'protected' | 'public' | 'register' | 'reinterpret_cast' | 'return' | 'short' | 'signed' | 'sizeof' | 'static' | 'static_assert' | 'static_cast' | 'struct' | 'switch' | 'template' | 'this' | 'thread_local' | 'throw' | 'true' | 'try' | 'typedef' | 'typeid' | 'typename' | 'union' | 'unsigned' | 'using' | 'virtual' | 'void' | 'volatile' | 'wchar_t' | 'while' )
            int alt22=73;
            alt22 = dfa22.predict(input);
            switch (alt22) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1075:17: 'alignas'
                    {
                    match("alignas"); 


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1075:27: 'alignof'
                    {
                    match("alignof"); 


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1075:37: 'asm'
                    {
                    match("asm"); 


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1075:43: 'auto'
                    {
                    match("auto"); 


                    }
                    break;
                case 5 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1075:50: 'bool'
                    {
                    match("bool"); 


                    }
                    break;
                case 6 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1075:57: 'break'
                    {
                    match("break"); 


                    }
                    break;
                case 7 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1075:65: 'case'
                    {
                    match("case"); 


                    }
                    break;
                case 8 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1075:72: 'catch'
                    {
                    match("catch"); 


                    }
                    break;
                case 9 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1075:80: 'char'
                    {
                    match("char"); 


                    }
                    break;
                case 10 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1075:87: 'char16_t'
                    {
                    match("char16_t"); 


                    }
                    break;
                case 11 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1075:98: 'char32_t'
                    {
                    match("char32_t"); 


                    }
                    break;
                case 12 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1075:109: 'class'
                    {
                    match("class"); 


                    }
                    break;
                case 13 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1075:117: 'const'
                    {
                    match("const"); 


                    }
                    break;
                case 14 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1075:125: 'constexpr'
                    {
                    match("constexpr"); 


                    }
                    break;
                case 15 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1075:137: 'const_cast'
                    {
                    match("const_cast"); 


                    }
                    break;
                case 16 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1075:150: 'continue'
                    {
                    match("continue"); 


                    }
                    break;
                case 17 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1075:161: 'decltype'
                    {
                    match("decltype"); 


                    }
                    break;
                case 18 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1075:172: 'default'
                    {
                    match("default"); 


                    }
                    break;
                case 19 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1075:182: 'delete'
                    {
                    match("delete"); 


                    }
                    break;
                case 20 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1075:191: 'do'
                    {
                    match("do"); 


                    }
                    break;
                case 21 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1075:196: 'double'
                    {
                    match("double"); 


                    }
                    break;
                case 22 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1075:205: 'dynamic_cast'
                    {
                    match("dynamic_cast"); 


                    }
                    break;
                case 23 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1075:220: 'else'
                    {
                    match("else"); 


                    }
                    break;
                case 24 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1075:227: 'enum'
                    {
                    match("enum"); 


                    }
                    break;
                case 25 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1075:234: 'explicit'
                    {
                    match("explicit"); 


                    }
                    break;
                case 26 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1075:245: 'export'
                    {
                    match("export"); 


                    }
                    break;
                case 27 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1075:254: 'extern'
                    {
                    match("extern"); 


                    }
                    break;
                case 28 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1075:263: 'false'
                    {
                    match("false"); 


                    }
                    break;
                case 29 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1075:271: 'float'
                    {
                    match("float"); 


                    }
                    break;
                case 30 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1075:279: 'for'
                    {
                    match("for"); 


                    }
                    break;
                case 31 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1075:285: 'friend'
                    {
                    match("friend"); 


                    }
                    break;
                case 32 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1075:294: 'goto'
                    {
                    match("goto"); 


                    }
                    break;
                case 33 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1075:301: 'if'
                    {
                    match("if"); 


                    }
                    break;
                case 34 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1075:306: 'inline'
                    {
                    match("inline"); 


                    }
                    break;
                case 35 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1075:315: 'int'
                    {
                    match("int"); 


                    }
                    break;
                case 36 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1075:321: 'long'
                    {
                    match("long"); 


                    }
                    break;
                case 37 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1075:328: 'mutable'
                    {
                    match("mutable"); 


                    }
                    break;
                case 38 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1075:338: 'namespace'
                    {
                    match("namespace"); 


                    }
                    break;
                case 39 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1075:350: 'new'
                    {
                    match("new"); 


                    }
                    break;
                case 40 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1075:356: 'noexcept'
                    {
                    match("noexcept"); 


                    }
                    break;
                case 41 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1075:367: 'nullptr'
                    {
                    match("nullptr"); 


                    }
                    break;
                case 42 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1075:377: 'operator'
                    {
                    match("operator"); 


                    }
                    break;
                case 43 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1075:388: 'private'
                    {
                    match("private"); 


                    }
                    break;
                case 44 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1075:398: 'protected'
                    {
                    match("protected"); 


                    }
                    break;
                case 45 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1075:410: 'public'
                    {
                    match("public"); 


                    }
                    break;
                case 46 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1075:419: 'register'
                    {
                    match("register"); 


                    }
                    break;
                case 47 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1075:430: 'reinterpret_cast'
                    {
                    match("reinterpret_cast"); 


                    }
                    break;
                case 48 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1075:449: 'return'
                    {
                    match("return"); 


                    }
                    break;
                case 49 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1075:458: 'short'
                    {
                    match("short"); 


                    }
                    break;
                case 50 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1075:466: 'signed'
                    {
                    match("signed"); 


                    }
                    break;
                case 51 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1075:475: 'sizeof'
                    {
                    match("sizeof"); 


                    }
                    break;
                case 52 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1075:484: 'static'
                    {
                    match("static"); 


                    }
                    break;
                case 53 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1075:493: 'static_assert'
                    {
                    match("static_assert"); 


                    }
                    break;
                case 54 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1075:509: 'static_cast'
                    {
                    match("static_cast"); 


                    }
                    break;
                case 55 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1075:523: 'struct'
                    {
                    match("struct"); 


                    }
                    break;
                case 56 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1075:532: 'switch'
                    {
                    match("switch"); 


                    }
                    break;
                case 57 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1075:541: 'template'
                    {
                    match("template"); 


                    }
                    break;
                case 58 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1075:552: 'this'
                    {
                    match("this"); 


                    }
                    break;
                case 59 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1075:559: 'thread_local'
                    {
                    match("thread_local"); 


                    }
                    break;
                case 60 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1075:574: 'throw'
                    {
                    match("throw"); 


                    }
                    break;
                case 61 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1075:582: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 62 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1075:589: 'try'
                    {
                    match("try"); 


                    }
                    break;
                case 63 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1075:595: 'typedef'
                    {
                    match("typedef"); 


                    }
                    break;
                case 64 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1075:605: 'typeid'
                    {
                    match("typeid"); 


                    }
                    break;
                case 65 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1075:614: 'typename'
                    {
                    match("typename"); 


                    }
                    break;
                case 66 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1075:625: 'union'
                    {
                    match("union"); 


                    }
                    break;
                case 67 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1075:633: 'unsigned'
                    {
                    match("unsigned"); 


                    }
                    break;
                case 68 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1075:644: 'using'
                    {
                    match("using"); 


                    }
                    break;
                case 69 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1075:652: 'virtual'
                    {
                    match("virtual"); 


                    }
                    break;
                case 70 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1075:662: 'void'
                    {
                    match("void"); 


                    }
                    break;
                case 71 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1075:669: 'volatile'
                    {
                    match("volatile"); 


                    }
                    break;
                case 72 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1075:680: 'wchar_t'
                    {
                    match("wchar_t"); 


                    }
                    break;
                case 73 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1075:690: 'while'
                    {
                    match("while"); 


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
    // $ANTLR end "RULE_KEYWORD"

    // $ANTLR start "RULE_PPOPORPUNC"
    public final void mRULE_PPOPORPUNC() throws RecognitionException {
        try {
            int _type = RULE_PPOPORPUNC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1077:17: ( ( '{' | '}' | '[' | ']' | '#' | '##' | '(' | ')' | '<:' | ':>' | '<%' | '%>' | '%:' | '%:%:' | ';' | ':' | '...' | 'new' | 'delete' | '?' | '::' | '.' | '.*' | '+' | '-' | '*' | '/' | '%' | '^' | '&' | '|' | '~' | '!' | '=' | '<' | '>' | '+=' | '-=' | '*=' | '/=' | '%=' | '^=' | '&=' | '|=' | '<<' | '>>' | '<<=' | '>>=' | '==' | '!=' | '<=' | '>=' | '&&' | '||' | '++' | '--' | ',' | '->*' | '->' | 'and' | 'and_eq' | 'bitand' | 'bitor' | 'compl' | 'not' | 'not_eq' | 'or' | 'or_eq' | 'xor' | 'xor_eq' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1077:19: ( '{' | '}' | '[' | ']' | '#' | '##' | '(' | ')' | '<:' | ':>' | '<%' | '%>' | '%:' | '%:%:' | ';' | ':' | '...' | 'new' | 'delete' | '?' | '::' | '.' | '.*' | '+' | '-' | '*' | '/' | '%' | '^' | '&' | '|' | '~' | '!' | '=' | '<' | '>' | '+=' | '-=' | '*=' | '/=' | '%=' | '^=' | '&=' | '|=' | '<<' | '>>' | '<<=' | '>>=' | '==' | '!=' | '<=' | '>=' | '&&' | '||' | '++' | '--' | ',' | '->*' | '->' | 'and' | 'and_eq' | 'bitand' | 'bitor' | 'compl' | 'not' | 'not_eq' | 'or' | 'or_eq' | 'xor' | 'xor_eq' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1077:19: ( '{' | '}' | '[' | ']' | '#' | '##' | '(' | ')' | '<:' | ':>' | '<%' | '%>' | '%:' | '%:%:' | ';' | ':' | '...' | 'new' | 'delete' | '?' | '::' | '.' | '.*' | '+' | '-' | '*' | '/' | '%' | '^' | '&' | '|' | '~' | '!' | '=' | '<' | '>' | '+=' | '-=' | '*=' | '/=' | '%=' | '^=' | '&=' | '|=' | '<<' | '>>' | '<<=' | '>>=' | '==' | '!=' | '<=' | '>=' | '&&' | '||' | '++' | '--' | ',' | '->*' | '->' | 'and' | 'and_eq' | 'bitand' | 'bitor' | 'compl' | 'not' | 'not_eq' | 'or' | 'or_eq' | 'xor' | 'xor_eq' )
            int alt23=70;
            alt23 = dfa23.predict(input);
            switch (alt23) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1077:20: '{'
                    {
                    match('{'); 

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1077:24: '}'
                    {
                    match('}'); 

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1077:28: '['
                    {
                    match('['); 

                    }
                    break;
                case 4 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1077:32: ']'
                    {
                    match(']'); 

                    }
                    break;
                case 5 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1077:36: '#'
                    {
                    match('#'); 

                    }
                    break;
                case 6 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1077:40: '##'
                    {
                    match("##"); 


                    }
                    break;
                case 7 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1077:45: '('
                    {
                    match('('); 

                    }
                    break;
                case 8 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1077:49: ')'
                    {
                    match(')'); 

                    }
                    break;
                case 9 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1077:53: '<:'
                    {
                    match("<:"); 


                    }
                    break;
                case 10 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1077:58: ':>'
                    {
                    match(":>"); 


                    }
                    break;
                case 11 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1077:63: '<%'
                    {
                    match("<%"); 


                    }
                    break;
                case 12 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1077:68: '%>'
                    {
                    match("%>"); 


                    }
                    break;
                case 13 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1077:73: '%:'
                    {
                    match("%:"); 


                    }
                    break;
                case 14 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1077:78: '%:%:'
                    {
                    match("%:%:"); 


                    }
                    break;
                case 15 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1077:85: ';'
                    {
                    match(';'); 

                    }
                    break;
                case 16 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1077:89: ':'
                    {
                    match(':'); 

                    }
                    break;
                case 17 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1077:93: '...'
                    {
                    match("..."); 


                    }
                    break;
                case 18 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1077:99: 'new'
                    {
                    match("new"); 


                    }
                    break;
                case 19 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1077:105: 'delete'
                    {
                    match("delete"); 


                    }
                    break;
                case 20 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1077:114: '?'
                    {
                    match('?'); 

                    }
                    break;
                case 21 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1077:118: '::'
                    {
                    match("::"); 


                    }
                    break;
                case 22 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1077:123: '.'
                    {
                    match('.'); 

                    }
                    break;
                case 23 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1077:127: '.*'
                    {
                    match(".*"); 


                    }
                    break;
                case 24 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1077:132: '+'
                    {
                    match('+'); 

                    }
                    break;
                case 25 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1077:136: '-'
                    {
                    match('-'); 

                    }
                    break;
                case 26 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1077:140: '*'
                    {
                    match('*'); 

                    }
                    break;
                case 27 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1077:144: '/'
                    {
                    match('/'); 

                    }
                    break;
                case 28 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1077:148: '%'
                    {
                    match('%'); 

                    }
                    break;
                case 29 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1077:152: '^'
                    {
                    match('^'); 

                    }
                    break;
                case 30 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1077:156: '&'
                    {
                    match('&'); 

                    }
                    break;
                case 31 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1077:160: '|'
                    {
                    match('|'); 

                    }
                    break;
                case 32 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1077:164: '~'
                    {
                    match('~'); 

                    }
                    break;
                case 33 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1077:168: '!'
                    {
                    match('!'); 

                    }
                    break;
                case 34 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1077:172: '='
                    {
                    match('='); 

                    }
                    break;
                case 35 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1077:176: '<'
                    {
                    match('<'); 

                    }
                    break;
                case 36 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1077:180: '>'
                    {
                    match('>'); 

                    }
                    break;
                case 37 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1077:184: '+='
                    {
                    match("+="); 


                    }
                    break;
                case 38 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1077:189: '-='
                    {
                    match("-="); 


                    }
                    break;
                case 39 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1077:194: '*='
                    {
                    match("*="); 


                    }
                    break;
                case 40 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1077:199: '/='
                    {
                    match("/="); 


                    }
                    break;
                case 41 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1077:204: '%='
                    {
                    match("%="); 


                    }
                    break;
                case 42 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1077:209: '^='
                    {
                    match("^="); 


                    }
                    break;
                case 43 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1077:214: '&='
                    {
                    match("&="); 


                    }
                    break;
                case 44 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1077:219: '|='
                    {
                    match("|="); 


                    }
                    break;
                case 45 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1077:224: '<<'
                    {
                    match("<<"); 


                    }
                    break;
                case 46 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1077:229: '>>'
                    {
                    match(">>"); 


                    }
                    break;
                case 47 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1077:234: '<<='
                    {
                    match("<<="); 


                    }
                    break;
                case 48 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1077:240: '>>='
                    {
                    match(">>="); 


                    }
                    break;
                case 49 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1077:246: '=='
                    {
                    match("=="); 


                    }
                    break;
                case 50 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1077:251: '!='
                    {
                    match("!="); 


                    }
                    break;
                case 51 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1077:256: '<='
                    {
                    match("<="); 


                    }
                    break;
                case 52 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1077:261: '>='
                    {
                    match(">="); 


                    }
                    break;
                case 53 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1077:266: '&&'
                    {
                    match("&&"); 


                    }
                    break;
                case 54 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1077:271: '||'
                    {
                    match("||"); 


                    }
                    break;
                case 55 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1077:276: '++'
                    {
                    match("++"); 


                    }
                    break;
                case 56 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1077:281: '--'
                    {
                    match("--"); 


                    }
                    break;
                case 57 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1077:286: ','
                    {
                    match(','); 

                    }
                    break;
                case 58 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1077:290: '->*'
                    {
                    match("->*"); 


                    }
                    break;
                case 59 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1077:296: '->'
                    {
                    match("->"); 


                    }
                    break;
                case 60 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1077:301: 'and'
                    {
                    match("and"); 


                    }
                    break;
                case 61 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1077:307: 'and_eq'
                    {
                    match("and_eq"); 


                    }
                    break;
                case 62 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1077:316: 'bitand'
                    {
                    match("bitand"); 


                    }
                    break;
                case 63 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1077:325: 'bitor'
                    {
                    match("bitor"); 


                    }
                    break;
                case 64 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1077:333: 'compl'
                    {
                    match("compl"); 


                    }
                    break;
                case 65 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1077:341: 'not'
                    {
                    match("not"); 


                    }
                    break;
                case 66 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1077:347: 'not_eq'
                    {
                    match("not_eq"); 


                    }
                    break;
                case 67 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1077:356: 'or'
                    {
                    match("or"); 


                    }
                    break;
                case 68 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1077:361: 'or_eq'
                    {
                    match("or_eq"); 


                    }
                    break;
                case 69 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1077:369: 'xor'
                    {
                    match("xor"); 


                    }
                    break;
                case 70 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1077:375: 'xor_eq'
                    {
                    match("xor_eq"); 


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
    // $ANTLR end "RULE_PPOPORPUNC"

    // $ANTLR start "RULE_IDENTIFIER"
    public final void mRULE_IDENTIFIER() throws RecognitionException {
        try {
            int _type = RULE_IDENTIFIER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1079:17: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( '0' .. '9' | 'A' .. 'Z' | 'a' .. 'z' | '_' )* )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1079:19: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( '0' .. '9' | 'A' .. 'Z' | 'a' .. 'z' | '_' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1079:43: ( '0' .. '9' | 'A' .. 'Z' | 'a' .. 'z' | '_' )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>='0' && LA24_0<='9')||(LA24_0>='A' && LA24_0<='Z')||LA24_0=='_'||(LA24_0>='a' && LA24_0<='z')) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:
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
            	    break loop24;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_IDENTIFIER"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1081:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1081:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1081:11: ( '^' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0=='^') ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1081:11: '^'
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

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1081:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>='0' && LA26_0<='9')||(LA26_0>='A' && LA26_0<='Z')||LA26_0=='_'||(LA26_0>='a' && LA26_0<='z')) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:
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
            	    break loop26;
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
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1083:10: ( ( '0' .. '9' )+ )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1083:12: ( '0' .. '9' )+
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1083:12: ( '0' .. '9' )+
            int cnt27=0;
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>='0' && LA27_0<='9')) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1083:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt27 >= 1 ) break loop27;
                        EarlyExitException eee =
                            new EarlyExitException(27, input);
                        throw eee;
                }
                cnt27++;
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
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1085:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1085:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1085:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0=='\"') ) {
                alt30=1;
            }
            else if ( (LA30_0=='\'') ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1085:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1085:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop28:
                    do {
                        int alt28=3;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0=='\\') ) {
                            alt28=1;
                        }
                        else if ( ((LA28_0>='\u0000' && LA28_0<='!')||(LA28_0>='#' && LA28_0<='[')||(LA28_0>=']' && LA28_0<='\uFFFF')) ) {
                            alt28=2;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1085:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1085:66: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop28;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1085:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1085:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop29:
                    do {
                        int alt29=3;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0=='\\') ) {
                            alt29=1;
                        }
                        else if ( ((LA29_0>='\u0000' && LA29_0<='&')||(LA29_0>='(' && LA29_0<='[')||(LA29_0>=']' && LA29_0<='\uFFFF')) ) {
                            alt29=2;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1085:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1085:137: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop29;
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
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1087:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1087:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1087:24: ( options {greedy=false; } : . )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0=='*') ) {
                    int LA31_1 = input.LA(2);

                    if ( (LA31_1=='/') ) {
                        alt31=2;
                    }
                    else if ( ((LA31_1>='\u0000' && LA31_1<='.')||(LA31_1>='0' && LA31_1<='\uFFFF')) ) {
                        alt31=1;
                    }


                }
                else if ( ((LA31_0>='\u0000' && LA31_0<=')')||(LA31_0>='+' && LA31_0<='\uFFFF')) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1087:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop31;
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
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1089:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1089:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1089:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( ((LA32_0>='\u0000' && LA32_0<='\t')||(LA32_0>='\u000B' && LA32_0<='\f')||(LA32_0>='\u000E' && LA32_0<='\uFFFF')) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1089:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop32;
                }
            } while (true);

            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1089:40: ( ( '\\r' )? '\\n' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0=='\n'||LA34_0=='\r') ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1089:41: ( '\\r' )? '\\n'
                    {
                    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1089:41: ( '\\r' )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0=='\r') ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1089:41: '\\r'
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
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1091:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1091:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1091:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt35=0;
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( ((LA35_0>='\t' && LA35_0<='\n')||LA35_0=='\r'||LA35_0==' ') ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:
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
            	    if ( cnt35 >= 1 ) break loop35;
                        EarlyExitException eee =
                            new EarlyExitException(35, input);
                        throw eee;
                }
                cnt35++;
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
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1093:16: ( . )
            // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1093:18: .
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
        // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1:8: ( T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | RULE_INTEGERLITERAL | RULE_BOOLEANLITERAL | RULE_POINTERLITERAL | RULE_PPNUMBER | RULE_LITERAL | RULE_KEYWORD | RULE_PPOPORPUNC | RULE_IDENTIFIER | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt36=33;
        alt36 = dfa36.predict(input);
        switch (alt36) {
            case 1 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1:10: T__19
                {
                mT__19(); 

                }
                break;
            case 2 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1:16: T__20
                {
                mT__20(); 

                }
                break;
            case 3 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1:22: T__21
                {
                mT__21(); 

                }
                break;
            case 4 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1:28: T__22
                {
                mT__22(); 

                }
                break;
            case 5 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1:34: T__23
                {
                mT__23(); 

                }
                break;
            case 6 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1:40: T__24
                {
                mT__24(); 

                }
                break;
            case 7 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1:46: T__25
                {
                mT__25(); 

                }
                break;
            case 8 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1:52: T__26
                {
                mT__26(); 

                }
                break;
            case 9 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1:58: T__27
                {
                mT__27(); 

                }
                break;
            case 10 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1:64: T__28
                {
                mT__28(); 

                }
                break;
            case 11 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1:70: T__29
                {
                mT__29(); 

                }
                break;
            case 12 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1:76: T__30
                {
                mT__30(); 

                }
                break;
            case 13 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1:82: T__31
                {
                mT__31(); 

                }
                break;
            case 14 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1:88: T__32
                {
                mT__32(); 

                }
                break;
            case 15 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1:94: T__33
                {
                mT__33(); 

                }
                break;
            case 16 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1:100: T__34
                {
                mT__34(); 

                }
                break;
            case 17 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1:106: T__35
                {
                mT__35(); 

                }
                break;
            case 18 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1:112: T__36
                {
                mT__36(); 

                }
                break;
            case 19 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1:118: RULE_INTEGERLITERAL
                {
                mRULE_INTEGERLITERAL(); 

                }
                break;
            case 20 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1:138: RULE_BOOLEANLITERAL
                {
                mRULE_BOOLEANLITERAL(); 

                }
                break;
            case 21 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1:158: RULE_POINTERLITERAL
                {
                mRULE_POINTERLITERAL(); 

                }
                break;
            case 22 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1:178: RULE_PPNUMBER
                {
                mRULE_PPNUMBER(); 

                }
                break;
            case 23 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1:192: RULE_LITERAL
                {
                mRULE_LITERAL(); 

                }
                break;
            case 24 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1:205: RULE_KEYWORD
                {
                mRULE_KEYWORD(); 

                }
                break;
            case 25 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1:218: RULE_PPOPORPUNC
                {
                mRULE_PPOPORPUNC(); 

                }
                break;
            case 26 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1:234: RULE_IDENTIFIER
                {
                mRULE_IDENTIFIER(); 

                }
                break;
            case 27 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1:250: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 28 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1:258: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 29 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1:267: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 30 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1:279: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 31 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1:295: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 32 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1:311: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 33 :
                // ../org.xtext.example.mydsl/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:1:319: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA22 dfa22 = new DFA22(this);
    protected DFA23 dfa23 = new DFA23(this);
    protected DFA36 dfa36 = new DFA36(this);
    static final String DFA22_eotS =
        "\36\uffff\1\107\100\uffff\1\153\14\uffff\1\165\11\uffff\1\170\4"+
        "\uffff";
    static final String DFA22_eofS =
        "\173\uffff";
    static final String DFA22_minS =
        "\1\141\1\154\1\157\1\141\1\145\1\154\1\141\1\uffff\1\146\2\uffff"+
        "\1\141\1\uffff\1\162\1\145\1\150\1\145\1\156\1\151\1\143\1\151\4"+
        "\uffff\1\163\1\141\1\uffff\1\156\1\143\1\165\3\uffff\1\160\5\uffff"+
        "\1\154\4\uffff\1\151\1\uffff\1\147\1\uffff\1\147\1\141\2\uffff\1"+
        "\151\1\165\1\160\1\151\2\uffff\1\151\2\uffff\1\147\2\uffff\1\162"+
        "\1\163\5\uffff\1\154\12\uffff\1\164\2\uffff\1\145\2\uffff\1\145"+
        "\4\uffff\1\156\1\61\1\164\3\uffff\1\151\2\uffff\1\144\1\141\3\uffff"+
        "\1\137\1\143\10\uffff\1\137\1\141\3\uffff";
    static final String DFA22_maxS =
        "\1\167\1\165\1\162\1\157\1\171\1\170\1\162\1\uffff\1\156\2\uffff"+
        "\1\165\1\uffff\1\165\1\145\1\167\1\171\1\163\1\157\1\150\1\151\4"+
        "\uffff\1\164\1\141\1\uffff\1\156\1\154\1\165\3\uffff\1\164\5\uffff"+
        "\1\164\4\uffff\1\157\1\uffff\1\164\1\uffff\1\172\1\162\2\uffff\1"+
        "\162\1\171\1\160\1\163\2\uffff\1\154\2\uffff\1\147\2\uffff\1\162"+
        "\1\164\5\uffff\1\157\12\uffff\1\164\2\uffff\1\157\2\uffff\1\145"+
        "\4\uffff\1\156\1\63\1\164\3\uffff\1\151\2\uffff\1\156\1\157\3\uffff"+
        "\1\145\1\143\10\uffff\1\137\1\143\3\uffff";
    static final String DFA22_acceptS =
        "\7\uffff\1\40\1\uffff\1\44\1\45\1\uffff\1\52\10\uffff\1\3\1\4\1"+
        "\5\1\6\2\uffff\1\14\3\uffff\1\26\1\27\1\30\1\uffff\1\34\1\35\1\36"+
        "\1\37\1\41\1\uffff\1\46\1\47\1\50\1\51\1\uffff\1\55\1\uffff\1\61"+
        "\2\uffff\1\70\1\71\4\uffff\1\104\1\105\1\uffff\1\110\1\111\1\uffff"+
        "\1\7\1\10\2\uffff\1\21\1\22\1\23\1\25\1\24\1\uffff\1\33\1\42\1\43"+
        "\1\53\1\54\1\56\1\57\1\60\1\62\1\63\1\uffff\1\67\1\72\1\uffff\1"+
        "\75\1\76\1\uffff\1\102\1\103\1\106\1\107\3\uffff\1\20\1\31\1\32"+
        "\1\uffff\1\73\1\74\2\uffff\1\12\1\13\1\11\2\uffff\1\77\1\100\1\101"+
        "\1\1\1\2\1\16\1\17\1\15\2\uffff\1\64\1\65\1\66";
    static final String DFA22_specialS =
        "\173\uffff}>";
    static final String[] DFA22_transitionS = {
            "\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\uffff\1\10\2\uffff\1\11\1\12"+
            "\1\13\1\14\1\15\1\uffff\1\16\1\17\1\20\1\21\1\22\1\23",
            "\1\24\6\uffff\1\25\1\uffff\1\26",
            "\1\27\2\uffff\1\30",
            "\1\31\6\uffff\1\32\3\uffff\1\33\2\uffff\1\34",
            "\1\35\11\uffff\1\36\11\uffff\1\37",
            "\1\40\1\uffff\1\41\11\uffff\1\42",
            "\1\43\12\uffff\1\44\2\uffff\1\45\2\uffff\1\46",
            "",
            "\1\47\7\uffff\1\50",
            "",
            "",
            "\1\51\3\uffff\1\52\11\uffff\1\53\5\uffff\1\54",
            "",
            "\1\55\2\uffff\1\56",
            "\1\57",
            "\1\60\1\61\12\uffff\1\62\2\uffff\1\63",
            "\1\64\2\uffff\1\65\11\uffff\1\66\6\uffff\1\67",
            "\1\70\4\uffff\1\71",
            "\1\72\5\uffff\1\73",
            "\1\74\4\uffff\1\75",
            "\1\76",
            "",
            "",
            "",
            "",
            "\1\77\1\100",
            "\1\101",
            "",
            "\1\102",
            "\1\103\2\uffff\1\104\5\uffff\1\105",
            "\1\106",
            "",
            "",
            "",
            "\1\110\3\uffff\1\111",
            "",
            "",
            "",
            "",
            "",
            "\1\112\7\uffff\1\113",
            "",
            "",
            "",
            "",
            "\1\114\5\uffff\1\115",
            "",
            "\1\116\1\uffff\1\117\12\uffff\1\120",
            "",
            "\1\121\22\uffff\1\122",
            "\1\123\20\uffff\1\124",
            "",
            "",
            "\1\125\10\uffff\1\126",
            "\1\127\3\uffff\1\130",
            "\1\131",
            "\1\132\11\uffff\1\133",
            "",
            "",
            "\1\134\2\uffff\1\135",
            "",
            "",
            "\1\136",
            "",
            "",
            "\1\137",
            "\1\140\1\141",
            "",
            "",
            "",
            "",
            "",
            "\1\142\2\uffff\1\143",
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
            "\1\144",
            "",
            "",
            "\1\145\11\uffff\1\146",
            "",
            "",
            "\1\147",
            "",
            "",
            "",
            "",
            "\1\150",
            "\1\151\1\uffff\1\152",
            "\1\154",
            "",
            "",
            "",
            "\1\155",
            "",
            "",
            "\1\156\4\uffff\1\157\4\uffff\1\160",
            "\1\161\15\uffff\1\162",
            "",
            "",
            "",
            "\1\164\5\uffff\1\163",
            "\1\166",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\167",
            "\1\171\1\uffff\1\172",
            "",
            "",
            ""
    };

    static final short[] DFA22_eot = DFA.unpackEncodedString(DFA22_eotS);
    static final short[] DFA22_eof = DFA.unpackEncodedString(DFA22_eofS);
    static final char[] DFA22_min = DFA.unpackEncodedStringToUnsignedChars(DFA22_minS);
    static final char[] DFA22_max = DFA.unpackEncodedStringToUnsignedChars(DFA22_maxS);
    static final short[] DFA22_accept = DFA.unpackEncodedString(DFA22_acceptS);
    static final short[] DFA22_special = DFA.unpackEncodedString(DFA22_specialS);
    static final short[][] DFA22_transition;

    static {
        int numStates = DFA22_transitionS.length;
        DFA22_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA22_transition[i] = DFA.unpackEncodedString(DFA22_transitionS[i]);
        }
    }

    class DFA22 extends DFA {

        public DFA22(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 22;
            this.eot = DFA22_eot;
            this.eof = DFA22_eof;
            this.min = DFA22_min;
            this.max = DFA22_max;
            this.accept = DFA22_accept;
            this.special = DFA22_special;
            this.transition = DFA22_transition;
        }
        public String getDescription() {
            return "1075:16: ( 'alignas' | 'alignof' | 'asm' | 'auto' | 'bool' | 'break' | 'case' | 'catch' | 'char' | 'char16_t' | 'char32_t' | 'class' | 'const' | 'constexpr' | 'const_cast' | 'continue' | 'decltype' | 'default' | 'delete' | 'do' | 'double' | 'dynamic_cast' | 'else' | 'enum' | 'explicit' | 'export' | 'extern' | 'false' | 'float' | 'for' | 'friend' | 'goto' | 'if' | 'inline' | 'int' | 'long' | 'mutable' | 'namespace' | 'new' | 'noexcept' | 'nullptr' | 'operator' | 'private' | 'protected' | 'public' | 'register' | 'reinterpret_cast' | 'return' | 'short' | 'signed' | 'sizeof' | 'static' | 'static_assert' | 'static_cast' | 'struct' | 'switch' | 'template' | 'this' | 'thread_local' | 'throw' | 'true' | 'try' | 'typedef' | 'typeid' | 'typename' | 'union' | 'unsigned' | 'using' | 'virtual' | 'void' | 'volatile' | 'wchar_t' | 'while' )";
        }
    }
    static final String DFA23_eotS =
        "\5\uffff\1\42\2\uffff\1\47\1\52\1\56\1\uffff\1\61\3\uffff\1\66\1"+
        "\72\1\74\1\76\1\100\1\103\1\106\1\uffff\1\110\1\112\1\115\12\uffff"+
        "\1\123\6\uffff\1\125\14\uffff\1\130\21\uffff\1\132\4\uffff\1\136"+
        "\5\uffff\1\141\4\uffff\1\143\3\uffff\1\147\10\uffff";
    static final String DFA23_eofS =
        "\150\uffff";
    static final String DFA23_minS =
        "\1\41\4\uffff\1\43\2\uffff\1\45\2\72\1\uffff\1\52\1\145\2\uffff"+
        "\1\53\1\55\3\75\1\46\1\75\1\uffff\3\75\1\uffff\1\156\1\151\1\uffff"+
        "\1\162\1\157\4\uffff\1\75\6\uffff\1\45\6\uffff\1\164\5\uffff\1\52"+
        "\21\uffff\1\75\2\uffff\1\144\1\164\1\137\1\162\4\uffff\1\137\4\uffff"+
        "\1\137\1\141\2\uffff\1\137\10\uffff";
    static final String DFA23_maxS =
        "\1\176\4\uffff\1\43\2\uffff\1\75\2\76\1\uffff\1\56\1\157\2\uffff"+
        "\1\75\1\76\4\75\1\174\1\uffff\2\75\1\76\1\uffff\1\156\1\151\1\uffff"+
        "\1\162\1\157\4\uffff\1\75\6\uffff\1\45\6\uffff\1\164\5\uffff\1\52"+
        "\21\uffff\1\75\2\uffff\1\144\1\164\1\137\1\162\4\uffff\1\137\4\uffff"+
        "\1\137\1\157\2\uffff\1\137\10\uffff";
    static final String DFA23_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\uffff\1\7\1\10\3\uffff\1\17\2\uffff\1"+
        "\23\1\24\7\uffff\1\40\3\uffff\1\71\2\uffff\1\100\2\uffff\1\6\1\5"+
        "\1\11\1\13\1\uffff\1\63\1\43\1\12\1\25\1\20\1\14\1\uffff\1\51\1"+
        "\34\1\21\1\27\1\26\1\22\1\uffff\1\45\1\67\1\30\1\46\1\70\1\uffff"+
        "\1\31\1\47\1\32\1\50\1\33\1\52\1\35\1\53\1\65\1\36\1\54\1\66\1\37"+
        "\1\62\1\41\1\61\1\42\1\uffff\1\64\1\44\4\uffff\1\57\1\55\1\16\1"+
        "\15\1\uffff\1\72\1\73\1\60\1\56\2\uffff\1\104\1\103\1\uffff\1\102"+
        "\1\101\1\75\1\74\1\76\1\77\1\106\1\105";
    static final String DFA23_specialS =
        "\150\uffff}>";
    static final String[] DFA23_transitionS = {
            "\1\30\1\uffff\1\5\1\uffff\1\12\1\25\1\uffff\1\6\1\7\1\22\1\20"+
            "\1\33\1\21\1\14\1\23\12\uffff\1\11\1\13\1\10\1\31\1\32\1\17"+
            "\33\uffff\1\3\1\uffff\1\4\1\24\2\uffff\1\34\1\35\1\36\1\16\11"+
            "\uffff\1\15\1\37\10\uffff\1\40\2\uffff\1\1\1\26\1\2\1\27",
            "",
            "",
            "",
            "",
            "\1\41",
            "",
            "",
            "\1\44\24\uffff\1\43\1\uffff\1\45\1\46",
            "\1\51\3\uffff\1\50",
            "\1\54\2\uffff\1\55\1\53",
            "",
            "\1\60\3\uffff\1\57",
            "\1\62\11\uffff\1\63",
            "",
            "",
            "\1\65\21\uffff\1\64",
            "\1\70\17\uffff\1\67\1\71",
            "\1\73",
            "\1\75",
            "\1\77",
            "\1\102\26\uffff\1\101",
            "\1\104\76\uffff\1\105",
            "",
            "\1\107",
            "\1\111",
            "\1\114\1\113",
            "",
            "\1\116",
            "\1\117",
            "",
            "\1\120",
            "\1\121",
            "",
            "",
            "",
            "",
            "\1\122",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\124",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\126",
            "",
            "",
            "",
            "",
            "",
            "\1\127",
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
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\131",
            "",
            "",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\137",
            "",
            "",
            "",
            "",
            "\1\140",
            "",
            "",
            "",
            "",
            "\1\142",
            "\1\144\15\uffff\1\145",
            "",
            "",
            "\1\146",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA23_eot = DFA.unpackEncodedString(DFA23_eotS);
    static final short[] DFA23_eof = DFA.unpackEncodedString(DFA23_eofS);
    static final char[] DFA23_min = DFA.unpackEncodedStringToUnsignedChars(DFA23_minS);
    static final char[] DFA23_max = DFA.unpackEncodedStringToUnsignedChars(DFA23_maxS);
    static final short[] DFA23_accept = DFA.unpackEncodedString(DFA23_acceptS);
    static final short[] DFA23_special = DFA.unpackEncodedString(DFA23_specialS);
    static final short[][] DFA23_transition;

    static {
        int numStates = DFA23_transitionS.length;
        DFA23_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA23_transition[i] = DFA.unpackEncodedString(DFA23_transitionS[i]);
        }
    }

    class DFA23 extends DFA {

        public DFA23(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 23;
            this.eot = DFA23_eot;
            this.eof = DFA23_eof;
            this.min = DFA23_min;
            this.max = DFA23_max;
            this.accept = DFA23_accept;
            this.special = DFA23_special;
            this.transition = DFA23_transition;
        }
        public String getDescription() {
            return "1077:19: ( '{' | '}' | '[' | ']' | '#' | '##' | '(' | ')' | '<:' | ':>' | '<%' | '%>' | '%:' | '%:%:' | ';' | ':' | '...' | 'new' | 'delete' | '?' | '::' | '.' | '.*' | '+' | '-' | '*' | '/' | '%' | '^' | '&' | '|' | '~' | '!' | '=' | '<' | '>' | '+=' | '-=' | '*=' | '/=' | '%=' | '^=' | '&=' | '|=' | '<<' | '>>' | '<<=' | '>>=' | '==' | '!=' | '<=' | '>=' | '&&' | '||' | '++' | '--' | ',' | '->*' | '->' | 'and' | 'and_eq' | 'bitand' | 'bitor' | 'compl' | 'not' | 'not_eq' | 'or' | 'or_eq' | 'xor' | 'xor_eq' )";
        }
    }
    static final String DFA36_eotS =
        "\1\uffff\1\66\1\77\2\76\2\uffff\2\107\3\126\1\76\20\126\14\uffff"+
        "\2\76\5\uffff\2\126\2\65\20\uffff\1\107\1\uffff\1\107\1\uffff\2"+
        "\107\2\105\2\107\1\105\2\107\5\126\1\uffff\24\126\1\u00be\5\126"+
        "\1\u00be\4\126\1\76\15\126\3\uffff\1\126\1\uffff\1\u00e2\6\uffff"+
        "\16\107\2\126\1\u00be\2\126\1\u00be\6\126\1\u00be\1\126\1\76\1\126"+
        "\1\u00be\1\126\1\76\15\126\1\uffff\7\126\1\u00be\30\126\1\76\5\uffff"+
        "\7\107\3\126\1\u0134\1\126\1\u00be\10\126\1\u00be\1\126\1\u00be"+
        "\3\126\1\u00be\1\126\1\u00be\11\126\2\u00be\3\126\1\u00be\1\126"+
        "\1\u00be\23\126\1\u00be\4\126\5\107\1\u0134\1\u00be\1\126\1\uffff"+
        "\2\126\1\u00be\11\126\1\u00be\1\126\1\76\1\u00be\2\126\2\u00be\1"+
        "\126\1\76\13\126\1\76\6\126\1\u00be\5\126\1\u00be\1\126\1\u00be"+
        "\3\126\1\u00be\1\126\2\107\1\u00be\3\126\1\u00be\4\126\1\76\2\126"+
        "\2\76\7\126\2\u00be\2\126\3\u00be\4\126\1\u00be\2\126\6\u00be\4"+
        "\126\1\76\2\126\1\u00be\1\126\1\u01bb\2\126\2\u00be\6\126\1\u00be"+
        "\2\126\1\u00be\1\126\1\u00be\5\126\1\u00be\1\126\2\u00be\1\126\1"+
        "\u00be\1\uffff\1\126\3\u00be\2\126\2\u00be\1\126\2\u00be\1\126\1"+
        "\u00be\3\126\2\u00be\1\126\2\u00be\2\126\1\u00be\4\126\1\u00be\10"+
        "\126\3\u00be\3\126\1\u00be\2\126\1\u00be";
    static final String DFA36_eofS =
        "\u01eb\uffff";
    static final String DFA36_minS =
        "\1\0\1\11\1\43\2\75\2\uffff\2\56\24\60\14\uffff\1\52\1\101\5\uffff"+
        "\2\60\2\0\4\uffff\1\146\1\154\12\uffff\1\56\1\uffff\1\56\1\uffff"+
        "\2\56\2\60\2\56\1\60\2\56\5\60\1\uffff\55\60\3\uffff\1\60\1\uffff"+
        "\1\144\1\uffff\1\151\4\uffff\6\56\2\53\6\56\40\60\1\uffff\41\60"+
        "\5\uffff\7\56\100\60\5\56\3\60\1\uffff\66\60\2\56\116\60\1\uffff"+
        "\57\60";
    static final String DFA36_maxS =
        "\1\uffff\1\40\1\165\2\75\2\uffff\5\172\1\71\20\172\14\uffff\1\57"+
        "\1\172\5\uffff\2\172\2\uffff\4\uffff\1\156\1\162\12\uffff\1\172"+
        "\1\uffff\1\172\1\uffff\2\172\2\146\2\172\1\71\7\172\1\uffff\55\172"+
        "\3\uffff\1\172\1\uffff\1\156\1\uffff\1\163\4\uffff\56\172\1\uffff"+
        "\41\172\5\uffff\117\172\1\uffff\u0086\172\1\uffff\57\172";
    static final String DFA36_acceptS =
        "\5\uffff\1\14\1\22\26\uffff\14\31\2\uffff\5\31\4\uffff\1\40\1\41"+
        "\1\1\1\40\2\uffff\1\13\1\15\1\16\1\20\1\31\1\21\1\6\1\7\1\14\1\22"+
        "\1\uffff\1\26\1\uffff\1\23\16\uffff\1\32\55\uffff\1\36\1\37\1\33"+
        "\1\uffff\1\35\1\uffff\1\12\1\uffff\1\11\1\17\1\6\1\7\56\uffff\1"+
        "\30\41\uffff\1\3\1\4\1\2\1\5\1\10\117\uffff\1\24\u0086\uffff\1\25"+
        "\57\uffff";
    static final String DFA36_specialS =
        "\1\2\61\uffff\1\1\1\0\u01b7\uffff}>";
    static final String[] DFA36_transitionS = {
            "\11\65\1\64\1\1\2\65\1\64\22\65\1\64\1\4\1\62\1\2\1\65\1\43"+
            "\1\53\1\63\1\6\1\5\1\50\1\46\1\57\1\47\1\14\1\51\1\10\11\7\1"+
            "\42\1\44\1\41\1\3\1\56\1\45\1\65\32\61\1\37\1\65\1\40\1\52\1"+
            "\61\1\65\1\15\1\16\1\17\1\20\1\21\1\11\1\22\1\61\1\23\2\61\1"+
            "\24\1\25\1\13\1\26\1\27\1\61\1\30\1\31\1\12\1\32\1\33\1\34\1"+
            "\60\2\61\1\35\1\54\1\36\1\55\uff81\65",
            "\2\67\2\uffff\1\67\22\uffff\1\67",
            "\1\76\100\uffff\1\72\1\71\3\uffff\1\70\2\uffff\1\74\3\uffff"+
            "\1\75\4\uffff\1\73",
            "\1\100",
            "\1\101",
            "",
            "",
            "\1\105\1\uffff\12\104\7\uffff\13\105\1\111\10\105\1\106\5\105"+
            "\4\uffff\1\105\1\uffff\13\105\1\110\10\105\1\106\5\105",
            "\1\105\1\uffff\10\114\2\116\7\uffff\13\105\1\120\10\105\1\115"+
            "\2\105\1\113\2\105\4\uffff\1\105\1\uffff\13\105\1\117\10\105"+
            "\1\115\2\105\1\112\2\105",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\1\121\12\125\1"+
            "\122\2\125\1\123\2\125\1\124\10\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\4\125\1\130\2"+
            "\125\1\131\11\125\1\127\6\125\1\132\1\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\1\134\3\125\1"+
            "\135\11\125\1\136\5\125\1\133\5\125",
            "\12\105",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\13\125\1\137\1"+
            "\125\1\142\4\125\1\140\1\125\1\141\5\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\10\125\1\145\5"+
            "\125\1\143\2\125\1\144\10\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\1\146\6\125\1"+
            "\147\3\125\1\150\2\125\1\151\13\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\4\125\1\152\11"+
            "\125\1\153\11\125\1\154\1\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\13\125\1\155\1"+
            "\125\1\156\11\125\1\157\2\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\16\125\1\160\13"+
            "\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\5\125\1\161\7"+
            "\125\1\162\14\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\16\125\1\163\13"+
            "\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\24\125\1\164\5"+
            "\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\17\125\1\165\1"+
            "\125\1\166\10\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\21\125\1\167\2"+
            "\125\1\170\5\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\4\125\1\171\25"+
            "\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\7\125\1\172\1"+
            "\173\12\125\1\174\2\125\1\175\3\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\15\125\1\176\4"+
            "\125\1\177\7\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\10\125\1\u0080"+
            "\5\125\1\u0081\13\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\2\125\1\u0082"+
            "\4\125\1\u0083\22\125",
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
            "",
            "",
            "\1\u0084\4\uffff\1\u0085",
            "\32\u0086\4\uffff\1\u0086\1\uffff\32\u0086",
            "",
            "",
            "",
            "",
            "",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\16\125\1\u0087"+
            "\13\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\32\125",
            "\0\u0088",
            "\0\u0088",
            "",
            "",
            "",
            "",
            "\1\u0089\7\uffff\1\u008a",
            "\1\u008b\1\uffff\1\u008c\3\uffff\1\u008d",
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
            "\1\105\1\uffff\12\104\7\uffff\13\105\1\111\10\105\1\106\5\105"+
            "\4\uffff\1\105\1\uffff\13\105\1\110\10\105\1\106\5\105",
            "",
            "\1\105\1\uffff\12\105\7\uffff\13\105\1\u0091\16\105\4\uffff"+
            "\1\105\1\uffff\13\105\1\u0090\16\105",
            "",
            "\1\105\1\uffff\12\105\7\uffff\24\105\1\u0093\5\105\4\uffff"+
            "\1\105\1\uffff\13\105\1\u0092\10\105\1\u0093\5\105",
            "\1\105\1\uffff\12\105\7\uffff\13\105\1\u0094\10\105\1\u0093"+
            "\5\105\4\uffff\1\105\1\uffff\24\105\1\u0093\5\105",
            "\12\u0095\7\uffff\4\u0098\1\u0097\1\u0098\32\uffff\4\u0098"+
            "\1\u0096\1\u0098",
            "\12\u0095\7\uffff\4\u0098\1\u0097\1\u0098\32\uffff\4\u0098"+
            "\1\u0096\1\u0098",
            "\1\105\1\uffff\10\114\2\116\7\uffff\13\105\1\120\10\105\1\115"+
            "\5\105\4\uffff\1\105\1\uffff\13\105\1\117\10\105\1\115\5\105",
            "\1\105\1\uffff\12\105\7\uffff\13\105\1\u009a\16\105\4\uffff"+
            "\1\105\1\uffff\13\105\1\u0099\16\105",
            "\12\116",
            "\1\105\1\uffff\12\105\7\uffff\24\105\1\u009c\5\105\4\uffff"+
            "\1\105\1\uffff\13\105\1\u009b\10\105\1\u009c\5\105",
            "\1\105\1\uffff\12\105\7\uffff\13\105\1\u009d\10\105\1\u009c"+
            "\5\105\4\uffff\1\105\1\uffff\24\105\1\u009c\5\105",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\13\125\1\u009e"+
            "\16\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\16\125\1\u009f"+
            "\13\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\21\125\1\u00a0"+
            "\10\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\10\125\1\u00a1"+
            "\21\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\32\125",
            "",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\24\125\1\u00a2"+
            "\3\125\1\u00a3\1\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\14\125\1\u00a4"+
            "\15\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\10\125\1\u00a5"+
            "\10\125\1\u00a6\10\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\17\125\1\u00a7"+
            "\12\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\13\125\1\u00a8"+
            "\16\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\14\125\1\u00a9"+
            "\15\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\26\125\1\u00aa"+
            "\3\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\4\125\1\u00ab"+
            "\16\125\1\u00ac\6\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\10\125\1\u00ad"+
            "\21\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\14\125\1\u00ae"+
            "\15\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\23\125\1\u00af"+
            "\6\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\3\125\1\u00b0"+
            "\26\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\16\125\1\u00b1"+
            "\13\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\4\125\1\u00b2"+
            "\25\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\23\125\1\u00b3"+
            "\6\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\22\125\1\u00b4"+
            "\1\u00b5\6\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\1\u00b6\31\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\1\u00b7\31\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\14\125\1\u00b9"+
            "\1\u00b8\14\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\2\125\1\u00ba"+
            "\2\125\1\u00bb\5\125\1\u00bc\16\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\24\125\1\u00bd"+
            "\5\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\15\125\1\u00bf"+
            "\14\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\22\125\1\u00c0"+
            "\7\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\24\125\1\u00c1"+
            "\5\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\17\125\1\u00c2"+
            "\3\125\1\u00c3\6\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\23\125\1\u00c4"+
            "\6\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\32\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\13\125\1\u00c5"+
            "\7\125\1\u00c6\6\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\15\125\1\u00c7"+
            "\14\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\23\125\1\u00c8"+
            "\6\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\4\125\1\u00c9"+
            "\25\125",
            "\12\125\7\uffff\32\125\4\uffff\1\u00ca\1\uffff\32\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\10\125\1\u00cb"+
            "\5\125\1\u00cc\13\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\1\125\1\u00cd"+
            "\30\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\6\125\1\u00ce"+
            "\1\125\1\u00cf\12\125\1\u00d0\6\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\16\125\1\u00d1"+
            "\13\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\6\125\1\u00d2"+
            "\22\125\1\u00d3",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\1\u00d4\20\125"+
            "\1\u00d5\10\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\10\125\1\u00d6"+
            "\21\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\10\125\1\u00d7"+
            "\11\125\1\u00d8\7\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\10\125\1\u00d9"+
            "\21\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\21\125\1\u00da"+
            "\10\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\10\125\1\u00db"+
            "\2\125\1\u00dc\16\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\7\125\1\u00dd"+
            "\22\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\10\125\1\u00de"+
            "\21\125",
            "",
            "",
            "",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\21\125\1\u00df"+
            "\10\125",
            "",
            "\1\u00e0\11\uffff\1\u00e1",
            "",
            "\1\u00e3\11\uffff\1\u00e4",
            "",
            "",
            "",
            "",
            "\1\105\1\uffff\12\105\7\uffff\32\105\4\uffff\1\105\1\uffff"+
            "\13\105\1\u00e5\16\105",
            "\1\105\1\uffff\12\105\7\uffff\13\105\1\u00e6\16\105\4\uffff"+
            "\1\105\1\uffff\32\105",
            "\1\105\1\uffff\12\105\7\uffff\24\105\1\u0093\5\105\4\uffff"+
            "\1\105\1\uffff\24\105\1\u0093\5\105",
            "\1\105\1\uffff\12\105\7\uffff\32\105\4\uffff\1\105\1\uffff"+
            "\32\105",
            "\1\105\1\uffff\12\105\7\uffff\24\105\1\u0093\5\105\4\uffff"+
            "\1\105\1\uffff\24\105\1\u0093\5\105",
            "\1\105\1\uffff\12\u0095\7\uffff\4\u0098\1\u0097\1\u0098\5\105"+
            "\1\u00e9\10\105\1\u00e7\5\105\4\uffff\1\105\1\uffff\4\u0098"+
            "\1\u0096\1\u0098\5\105\1\u00e8\10\105\1\u00e7\5\105",
            "\1\105\1\uffff\2\105\1\uffff\12\u0095\7\uffff\4\u0098\1\u0097"+
            "\1\u0098\5\105\1\u00e9\10\105\1\u00e7\5\105\4\uffff\1\105\1"+
            "\uffff\4\u0098\1\u0096\1\u0098\5\105\1\u00e8\10\105\1\u00e7"+
            "\5\105",
            "\1\105\1\uffff\2\105\1\uffff\12\u0095\7\uffff\4\u0098\1\u0097"+
            "\1\u0098\5\105\1\u00e9\10\105\1\u00e7\5\105\4\uffff\1\105\1"+
            "\uffff\4\u0098\1\u0096\1\u0098\5\105\1\u00e8\10\105\1\u00e7"+
            "\5\105",
            "\1\105\1\uffff\12\u0095\7\uffff\4\u0098\1\u0097\1\u0098\5\105"+
            "\1\u00e9\10\105\1\u00e7\5\105\4\uffff\1\105\1\uffff\4\u0098"+
            "\1\u0096\1\u0098\5\105\1\u00e8\10\105\1\u00e7\5\105",
            "\1\105\1\uffff\12\105\7\uffff\32\105\4\uffff\1\105\1\uffff"+
            "\13\105\1\u00ea\16\105",
            "\1\105\1\uffff\12\105\7\uffff\13\105\1\u00eb\16\105\4\uffff"+
            "\1\105\1\uffff\32\105",
            "\1\105\1\uffff\12\105\7\uffff\24\105\1\u009c\5\105\4\uffff"+
            "\1\105\1\uffff\24\105\1\u009c\5\105",
            "\1\105\1\uffff\12\105\7\uffff\32\105\4\uffff\1\105\1\uffff"+
            "\32\105",
            "\1\105\1\uffff\12\105\7\uffff\24\105\1\u009c\5\105\4\uffff"+
            "\1\105\1\uffff\24\105\1\u009c\5\105",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\22\125\1\u00ec"+
            "\7\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\1\u00ed\31\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\32\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\4\125\1\u00ee"+
            "\25\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\4\125\1\u00ef"+
            "\25\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\32\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\17\125\1\u00f0"+
            "\12\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\22\125\1\u00f1"+
            "\7\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\4\125\1\u00f2"+
            "\11\125\1\u00f3\13\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\4\125\1\u00f4"+
            "\25\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\13\125\1\u00f5"+
            "\16\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\4\125\1\u00f6"+
            "\25\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\32\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\27\125\1\u00f7"+
            "\2\125",
            "\12\125\7\uffff\32\125\4\uffff\1\u00f8\1\uffff\32\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\6\125\1\u00f9"+
            "\23\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\32\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\16\125\1\u00fa"+
            "\13\125",
            "\12\125\7\uffff\32\125\4\uffff\1\u00fb\1\uffff\32\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\13\125\1\u00fc"+
            "\16\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\1\u00fd\31\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\1\u00fe\15\125"+
            "\1\u00ff\13\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\4\125\1\u0100"+
            "\25\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\2\125\1\u0101"+
            "\27\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\21\125\1\u0102"+
            "\10\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\22\125\1\u0103"+
            "\7\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\22\125\1\u0104"+
            "\1\u0105\6\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\17\125\1\u0106"+
            "\12\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\13\125\1\u0107"+
            "\16\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\1\u0108\31\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\4\125\1\u0109"+
            "\25\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\1\125\1\u010a"+
            "\30\125",
            "",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\1\u010b\31\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\4\125\1\u010c"+
            "\25\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\14\125\1\u010d"+
            "\15\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\13\125\1\u010e"+
            "\2\125\1\u010f\13\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\4\125\1\u0110"+
            "\25\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\16\125\1\u0111"+
            "\13\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\10\125\1\u0112"+
            "\21\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\32\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\6\125\1\u0113"+
            "\23\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\1\u0114\31\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\21\125\1\u0115"+
            "\10\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\4\125\1\u0116"+
            "\25\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\25\125\1\u0117"+
            "\4\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\23\125\1\u0118"+
            "\6\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\13\125\1\u0119"+
            "\16\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\10\125\1\u011a"+
            "\21\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\15\125\1\u011b"+
            "\14\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\24\125\1\u011c"+
            "\5\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\21\125\1\u011d"+
            "\10\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\15\125\1\u011e"+
            "\14\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\4\125\1\u011f"+
            "\25\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\23\125\1\u0120"+
            "\6\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\24\125\1\u0121"+
            "\5\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\23\125\1\u0122"+
            "\6\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\16\125\1\u0123"+
            "\13\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\10\125\1\u0124"+
            "\21\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\15\125\1\u0125"+
            "\14\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\23\125\1\u0126"+
            "\6\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\3\125\1\u0127"+
            "\26\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\1\u0128\31\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\1\u0129\31\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\13\125\1\u012a"+
            "\16\125",
            "\12\125\7\uffff\32\125\4\uffff\1\u012b\1\uffff\32\125",
            "",
            "",
            "",
            "",
            "",
            "\1\105\1\uffff\12\105\7\uffff\32\105\4\uffff\1\105\1\uffff"+
            "\32\105",
            "\1\105\1\uffff\12\105\7\uffff\32\105\4\uffff\1\105\1\uffff"+
            "\32\105",
            "\1\105\1\uffff\12\105\7\uffff\13\105\1\u012d\16\105\4\uffff"+
            "\1\105\1\uffff\13\105\1\u012c\16\105",
            "\1\105\1\uffff\12\105\7\uffff\24\105\1\u012f\5\105\4\uffff"+
            "\1\105\1\uffff\13\105\1\u012e\10\105\1\u012f\5\105",
            "\1\105\1\uffff\12\105\7\uffff\13\105\1\u0130\10\105\1\u012f"+
            "\5\105\4\uffff\1\105\1\uffff\24\105\1\u012f\5\105",
            "\1\105\1\uffff\12\105\7\uffff\32\105\4\uffff\1\105\1\uffff"+
            "\32\105",
            "\1\105\1\uffff\12\105\7\uffff\32\105\4\uffff\1\105\1\uffff"+
            "\32\105",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\4\125\1\u0131"+
            "\25\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\23\125\1\u0132"+
            "\6\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\15\125\1\u0133"+
            "\14\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\32\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\13\125\1\u0135"+
            "\16\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\32\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\1\u0136\31\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\26\125\1\u0137"+
            "\3\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\3\125\1\u0138"+
            "\4\125\1\u0139\4\125\1\u013a\14\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\17\125\1\u013b"+
            "\12\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\22\125\1\u013c"+
            "\7\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\2\125\1\u013d"+
            "\27\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\4\125\1\u013e"+
            "\25\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\15\125\1\u013f"+
            "\14\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\32\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\4\125\1\u0140"+
            "\25\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\32\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\12\125\1\u0141"+
            "\17\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\15\125\1\u0142"+
            "\14\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\21\125\1\u0143"+
            "\10\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\32\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\7\125\1\u0144"+
            "\22\125",
            "\1\125\1\u0145\1\125\1\u0146\6\125\7\uffff\32\125\4\uffff\1"+
            "\125\1\uffff\32\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\22\125\1\u0147"+
            "\7\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\23\125\1\u0148"+
            "\6\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\10\125\1\u0149"+
            "\21\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\13\125\1\u014a"+
            "\16\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\23\125\1\u014b"+
            "\6\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\24\125\1\u014c"+
            "\5\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\23\125\1\u014d"+
            "\6\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\13\125\1\u014e"+
            "\16\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\14\125\1\u014f"+
            "\15\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\32\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\32\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\10\125\1\u0150"+
            "\21\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\21\125\1\u0151"+
            "\10\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\21\125\1\u0152"+
            "\10\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\32\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\15\125\1\u0153"+
            "\14\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\32\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\1\125\1\u0154"+
            "\30\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\1\u0155\31\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\20\125\1\u0156"+
            "\11\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\1\u0157\31\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\4\125\1\u0158"+
            "\25\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\10\125\1\u0159"+
            "\21\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\22\125\1\u015a"+
            "\7\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\23\125\1\u015b"+
            "\6\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\21\125\1\u015c"+
            "\10\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\23\125\1\u015d"+
            "\6\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\4\125\1\u015e"+
            "\25\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\16\125\1\u015f"+
            "\13\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\10\125\1\u0160"+
            "\21\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\2\125\1\u0161"+
            "\27\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\2\125\1\u0162"+
            "\27\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\15\125\1\u0163"+
            "\14\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\6\125\1\u0164"+
            "\23\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\6\125\1\u0165"+
            "\23\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\24\125\1\u0166"+
            "\5\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\32\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\23\125\1\u0167"+
            "\6\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\21\125\1\u0168"+
            "\10\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\4\125\1\u0169"+
            "\25\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\4\125\1\u016a"+
            "\25\125",
            "\1\105\1\uffff\12\105\7\uffff\32\105\4\uffff\1\105\1\uffff"+
            "\13\105\1\u016b\16\105",
            "\1\105\1\uffff\12\105\7\uffff\13\105\1\u016c\16\105\4\uffff"+
            "\1\105\1\uffff\32\105",
            "\1\105\1\uffff\12\105\7\uffff\24\105\1\u012f\5\105\4\uffff"+
            "\1\105\1\uffff\24\105\1\u012f\5\105",
            "\1\105\1\uffff\12\105\7\uffff\32\105\4\uffff\1\105\1\uffff"+
            "\32\105",
            "\1\105\1\uffff\12\105\7\uffff\24\105\1\u012f\5\105\4\uffff"+
            "\1\105\1\uffff\24\105\1\u012f\5\105",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\32\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\32\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\3\125\1\u016d"+
            "\26\125",
            "",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\1\u016e\31\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\3\125\1\u016f"+
            "\26\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\32\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\4\125\1\u0170"+
            "\25\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\3\125\1\u0171"+
            "\26\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\1\u0172\31\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\23\125\1\u0173"+
            "\6\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\17\125\1\u0174"+
            "\12\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\4\125\1\u0175"+
            "\25\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\20\125\1\u0176"+
            "\11\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\1\u0177\15\125"+
            "\1\u0178\13\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\20\125\1\u0179"+
            "\11\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\32\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\3\125\1\u017a"+
            "\26\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\32\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\32\125",
            "\6\125\1\u017b\3\125\7\uffff\32\125\4\uffff\1\125\1\uffff\32"+
            "\125",
            "\2\125\1\u017c\7\125\7\uffff\32\125\4\uffff\1\125\1\uffff\32"+
            "\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\32\125",
            "\12\125\7\uffff\32\125\4\uffff\1\u017e\1\uffff\4\125\1\u017d"+
            "\25\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\15\125\1\u017f"+
            "\14\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\32\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\30\125\1\u0180"+
            "\1\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\13\125\1\u0181"+
            "\16\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\4\125\1\u0182"+
            "\25\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\4\125\1\u0183"+
            "\25\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\10\125\1\u0184"+
            "\21\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\2\125\1\u0185"+
            "\27\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\23\125\1\u0186"+
            "\6\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\15\125\1\u0187"+
            "\14\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\4\125\1\u0188"+
            "\25\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\13\125\1\u0189"+
            "\16\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\23\125\1\u018a"+
            "\6\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\32\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\23\125\1\u018b"+
            "\6\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\2\125\1\u018c"+
            "\27\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\2\125\1\u018d"+
            "\27\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\23\125\1\u018e"+
            "\6\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\4\125\1\u018f"+
            "\25\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\15\125\1\u0190"+
            "\14\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\32\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\3\125\1\u0191"+
            "\26\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\5\125\1\u0192"+
            "\24\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\2\125\1\u0193"+
            "\27\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\23\125\1\u0194"+
            "\6\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\7\125\1\u0195"+
            "\22\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\32\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\15\125\1\u0196"+
            "\14\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\32\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\1\u0197\31\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\10\125\1\u0198"+
            "\21\125",
            "\12\125\7\uffff\32\125\4\uffff\1\u0199\1\uffff\32\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\32\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\20\125\1\u019a"+
            "\11\125",
            "\1\105\1\uffff\12\105\7\uffff\32\105\4\uffff\1\105\1\uffff"+
            "\32\105",
            "\1\105\1\uffff\12\105\7\uffff\32\105\4\uffff\1\105\1\uffff"+
            "\32\105",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\32\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\23\125\1\u019b"+
            "\6\125",
            "\12\125\7\uffff\32\125\4\uffff\1\u019c\1\uffff\32\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\5\125\1\u019d"+
            "\24\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\32\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\14\125\1\u019e"+
            "\15\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\21\125\1\u019f"+
            "\10\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\1\u01a0\31\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\17\125\1\u01a1"+
            "\12\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\32\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\22\125\1\u01a2"+
            "\7\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\5\125\1\u01a3"+
            "\24\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\32\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\32\125",
            "\12\125\7\uffff\32\125\4\uffff\1\u01a4\1\uffff\32\125",
            "\12\125\7\uffff\32\125\4\uffff\1\u01a5\1\uffff\32\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\27\125\1\u01a6"+
            "\2\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\2\125\1\u01a7"+
            "\27\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\24\125\1\u01a8"+
            "\5\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\17\125\1\u01a9"+
            "\12\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\23\125\1\u01aa"+
            "\6\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\32\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\32\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\2\125\1\u01ab"+
            "\27\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\10\125\1\u01ac"+
            "\21\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\32\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\32\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\32\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\4\125\1\u01ad"+
            "\25\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\16\125\1\u01ae"+
            "\13\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\4\125\1\u01af"+
            "\25\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\23\125\1\u01b0"+
            "\6\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\32\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\4\125\1\u01b1"+
            "\25\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\21\125\1\u01b2"+
            "\10\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\32\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\32\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\32\125",
            "\12\125\7\uffff\32\125\4\uffff\1\u01b3\1\uffff\32\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\32\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\32\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\4\125\1\u01b4"+
            "\25\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\13\125\1\u01b5"+
            "\16\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\13\125\1\u01b6"+
            "\16\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\23\125\1\u01b7"+
            "\6\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\32\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\4\125\1\u01b8"+
            "\25\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\13\125\1\u01b9"+
            "\16\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\32\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\4\125\1\u01ba"+
            "\25\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\32\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\2\125\1\u01bc"+
            "\27\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\23\125\1\u01bd"+
            "\6\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\32\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\32\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\23\125\1\u01be"+
            "\6\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\23\125\1\u01bf"+
            "\6\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\17\125\1\u01c0"+
            "\12\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\1\u01c1\31\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\4\125\1\u01c2"+
            "\25\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\4\125\1\u01c3"+
            "\25\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\32\125",
            "\12\125\7\uffff\32\125\4\uffff\1\u01c4\1\uffff\32\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\23\125\1\u01c5"+
            "\6\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\32\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\21\125\1\u01c6"+
            "\10\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\32\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\4\125\1\u01c7"+
            "\25\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\21\125\1\u01c8"+
            "\10\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\17\125\1\u01c9"+
            "\12\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\1\u01ca\1\125"+
            "\1\u01cb\27\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\3\125\1\u01cc"+
            "\26\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\32\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\4\125\1\u01cd"+
            "\25\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\32\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\32\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\16\125\1\u01ce"+
            "\13\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\32\125",
            "",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\4\125\1\u01cf"+
            "\25\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\32\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\32\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\32\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\21\125\1\u01d0"+
            "\10\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\22\125\1\u01d1"+
            "\7\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\32\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\32\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\2\125\1\u01d2"+
            "\27\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\32\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\32\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\3\125\1\u01d3"+
            "\26\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\32\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\21\125\1\u01d4"+
            "\10\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\22\125\1\u01d5"+
            "\7\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\1\u01d6\31\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\32\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\32\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\2\125\1\u01d7"+
            "\27\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\32\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\32\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\23\125\1\u01d8"+
            "\6\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\1\u01d9\31\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\32\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\4\125\1\u01da"+
            "\25\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\22\125\1\u01db"+
            "\7\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\22\125\1\u01dc"+
            "\7\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\1\u01dd\31\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\32\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\22\125\1\u01de"+
            "\7\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\23\125\1\u01df"+
            "\6\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\4\125\1\u01e0"+
            "\25\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\23\125\1\u01e1"+
            "\6\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\13\125\1\u01e2"+
            "\16\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\23\125\1\u01e3"+
            "\6\125",
            "\12\125\7\uffff\32\125\4\uffff\1\u01e4\1\uffff\32\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\21\125\1\u01e5"+
            "\10\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\32\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\32\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\32\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\2\125\1\u01e6"+
            "\27\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\23\125\1\u01e7"+
            "\6\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\1\u01e8\31\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\32\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\22\125\1\u01e9"+
            "\7\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\23\125\1\u01ea"+
            "\6\125",
            "\12\125\7\uffff\32\125\4\uffff\1\125\1\uffff\32\125"
    };

    static final short[] DFA36_eot = DFA.unpackEncodedString(DFA36_eotS);
    static final short[] DFA36_eof = DFA.unpackEncodedString(DFA36_eofS);
    static final char[] DFA36_min = DFA.unpackEncodedStringToUnsignedChars(DFA36_minS);
    static final char[] DFA36_max = DFA.unpackEncodedStringToUnsignedChars(DFA36_maxS);
    static final short[] DFA36_accept = DFA.unpackEncodedString(DFA36_acceptS);
    static final short[] DFA36_special = DFA.unpackEncodedString(DFA36_specialS);
    static final short[][] DFA36_transition;

    static {
        int numStates = DFA36_transitionS.length;
        DFA36_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA36_transition[i] = DFA.unpackEncodedString(DFA36_transitionS[i]);
        }
    }

    class DFA36 extends DFA {

        public DFA36(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 36;
            this.eot = DFA36_eot;
            this.eof = DFA36_eof;
            this.min = DFA36_min;
            this.max = DFA36_max;
            this.accept = DFA36_accept;
            this.special = DFA36_special;
            this.transition = DFA36_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | RULE_INTEGERLITERAL | RULE_BOOLEANLITERAL | RULE_POINTERLITERAL | RULE_PPNUMBER | RULE_LITERAL | RULE_KEYWORD | RULE_PPOPORPUNC | RULE_IDENTIFIER | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA36_51 = input.LA(1);

                        s = -1;
                        if ( ((LA36_51>='\u0000' && LA36_51<='\uFFFF')) ) {s = 136;}

                        else s = 53;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA36_50 = input.LA(1);

                        s = -1;
                        if ( ((LA36_50>='\u0000' && LA36_50<='\uFFFF')) ) {s = 136;}

                        else s = 53;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA36_0 = input.LA(1);

                        s = -1;
                        if ( (LA36_0=='\n') ) {s = 1;}

                        else if ( (LA36_0=='#') ) {s = 2;}

                        else if ( (LA36_0=='=') ) {s = 3;}

                        else if ( (LA36_0=='!') ) {s = 4;}

                        else if ( (LA36_0==')') ) {s = 5;}

                        else if ( (LA36_0=='(') ) {s = 6;}

                        else if ( ((LA36_0>='1' && LA36_0<='9')) ) {s = 7;}

                        else if ( (LA36_0=='0') ) {s = 8;}

                        else if ( (LA36_0=='f') ) {s = 9;}

                        else if ( (LA36_0=='t') ) {s = 10;}

                        else if ( (LA36_0=='n') ) {s = 11;}

                        else if ( (LA36_0=='.') ) {s = 12;}

                        else if ( (LA36_0=='a') ) {s = 13;}

                        else if ( (LA36_0=='b') ) {s = 14;}

                        else if ( (LA36_0=='c') ) {s = 15;}

                        else if ( (LA36_0=='d') ) {s = 16;}

                        else if ( (LA36_0=='e') ) {s = 17;}

                        else if ( (LA36_0=='g') ) {s = 18;}

                        else if ( (LA36_0=='i') ) {s = 19;}

                        else if ( (LA36_0=='l') ) {s = 20;}

                        else if ( (LA36_0=='m') ) {s = 21;}

                        else if ( (LA36_0=='o') ) {s = 22;}

                        else if ( (LA36_0=='p') ) {s = 23;}

                        else if ( (LA36_0=='r') ) {s = 24;}

                        else if ( (LA36_0=='s') ) {s = 25;}

                        else if ( (LA36_0=='u') ) {s = 26;}

                        else if ( (LA36_0=='v') ) {s = 27;}

                        else if ( (LA36_0=='w') ) {s = 28;}

                        else if ( (LA36_0=='{') ) {s = 29;}

                        else if ( (LA36_0=='}') ) {s = 30;}

                        else if ( (LA36_0=='[') ) {s = 31;}

                        else if ( (LA36_0==']') ) {s = 32;}

                        else if ( (LA36_0=='<') ) {s = 33;}

                        else if ( (LA36_0==':') ) {s = 34;}

                        else if ( (LA36_0=='%') ) {s = 35;}

                        else if ( (LA36_0==';') ) {s = 36;}

                        else if ( (LA36_0=='?') ) {s = 37;}

                        else if ( (LA36_0=='+') ) {s = 38;}

                        else if ( (LA36_0=='-') ) {s = 39;}

                        else if ( (LA36_0=='*') ) {s = 40;}

                        else if ( (LA36_0=='/') ) {s = 41;}

                        else if ( (LA36_0=='^') ) {s = 42;}

                        else if ( (LA36_0=='&') ) {s = 43;}

                        else if ( (LA36_0=='|') ) {s = 44;}

                        else if ( (LA36_0=='~') ) {s = 45;}

                        else if ( (LA36_0=='>') ) {s = 46;}

                        else if ( (LA36_0==',') ) {s = 47;}

                        else if ( (LA36_0=='x') ) {s = 48;}

                        else if ( ((LA36_0>='A' && LA36_0<='Z')||LA36_0=='_'||LA36_0=='h'||(LA36_0>='j' && LA36_0<='k')||LA36_0=='q'||(LA36_0>='y' && LA36_0<='z')) ) {s = 49;}

                        else if ( (LA36_0=='\"') ) {s = 50;}

                        else if ( (LA36_0=='\'') ) {s = 51;}

                        else if ( (LA36_0=='\t'||LA36_0=='\r'||LA36_0==' ') ) {s = 52;}

                        else if ( ((LA36_0>='\u0000' && LA36_0<='\b')||(LA36_0>='\u000B' && LA36_0<='\f')||(LA36_0>='\u000E' && LA36_0<='\u001F')||LA36_0=='$'||LA36_0=='@'||LA36_0=='\\'||LA36_0=='`'||(LA36_0>='\u007F' && LA36_0<='\uFFFF')) ) {s = 53;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 36, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}