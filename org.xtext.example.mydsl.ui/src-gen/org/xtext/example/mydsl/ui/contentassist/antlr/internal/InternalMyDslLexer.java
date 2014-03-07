package org.xtext.example.mydsl.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslLexer extends Lexer {
    public static final int RULE_ID=14;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=19;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_INTEGERLITERAL=9;
    public static final int RULE_IDENTIFIER=4;
    public static final int EOF=-1;
    public static final int RULE_SL_COMMENT=17;
    public static final int RULE_ML_COMMENT=16;
    public static final int T__30=30;
    public static final int RULE_BOOLEANLITERAL=10;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_STRING=8;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int RULE_HEADERNAME=5;
    public static final int RULE_POINTERLITERAL=11;
    public static final int RULE_KEYWORD=13;
    public static final int RULE_INT=15;
    public static final int RULE_PPOPORPUNC=7;
    public static final int RULE_PPNUMBER=6;
    public static final int RULE_WS=18;
    public static final int RULE_LITERAL=12;

    // delegates
    // delegators

    public InternalMyDslLexer() {;} 
    public InternalMyDslLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalMyDslLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g"; }

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:11:7: ( '==' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:11:9: '=='
            {
            match("=="); 


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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:12:7: ( '(' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:12:9: '('
            {
            match('('); 

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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:13:7: ( '\\n' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:13:9: '\\n'
            {
            match('\n'); 

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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:14:7: ( '\\r\\n' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:14:9: '\\r\\n'
            {
            match("\r\n"); 


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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:15:7: ( '#if' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:15:9: '#if'
            {
            match("#if"); 


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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:16:7: ( '#ifdef' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:16:9: '#ifdef'
            {
            match("#ifdef"); 


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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:17:7: ( '#ifndef' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:17:9: '#ifndef'
            {
            match("#ifndef"); 


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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:18:7: ( '#elif' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:18:9: '#elif'
            {
            match("#elif"); 


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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19:7: ( '#else' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19:9: '#else'
            {
            match("#else"); 


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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:20:7: ( '#endif' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:20:9: '#endif'
            {
            match("#endif"); 


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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:21:7: ( '#include' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:21:9: '#include'
            {
            match("#include"); 


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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:22:7: ( '#define' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:22:9: '#define'
            {
            match("#define"); 


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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:23:7: ( ')' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:23:9: ')'
            {
            match(')'); 

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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:24:7: ( '#undef' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:24:9: '#undef'
            {
            match("#undef"); 


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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:25:7: ( '#line' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:25:9: '#line'
            {
            match("#line"); 


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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:26:7: ( '#error' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:26:9: '#error'
            {
            match("#error"); 


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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:27:7: ( '#pragma' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:27:9: '#pragma'
            {
            match("#pragma"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:28:7: ( '#' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:28:9: '#'
            {
            match('#'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "RULE_HEADERNAME"
    public final void mRULE_HEADERNAME() throws RecognitionException {
        try {
            int _type = RULE_HEADERNAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2483:17: ( ( RULE_STRING | '<' ( 'a' .. 'z' | 'A' .. 'Z' | '.' )+ '>' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2483:19: ( RULE_STRING | '<' ( 'a' .. 'z' | 'A' .. 'Z' | '.' )+ '>' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2483:19: ( RULE_STRING | '<' ( 'a' .. 'z' | 'A' .. 'Z' | '.' )+ '>' )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='\"'||LA2_0=='\'') ) {
                alt2=1;
            }
            else if ( (LA2_0=='<') ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2483:20: RULE_STRING
                    {
                    mRULE_STRING(); 

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2483:32: '<' ( 'a' .. 'z' | 'A' .. 'Z' | '.' )+ '>'
                    {
                    match('<'); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2483:36: ( 'a' .. 'z' | 'A' .. 'Z' | '.' )+
                    int cnt1=0;
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0=='.'||(LA1_0>='A' && LA1_0<='Z')||(LA1_0>='a' && LA1_0<='z')) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:
                    	    {
                    	    if ( input.LA(1)=='.'||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


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

                    match('>'); 

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
    // $ANTLR end "RULE_HEADERNAME"

    // $ANTLR start "RULE_INTEGERLITERAL"
    public final void mRULE_INTEGERLITERAL() throws RecognitionException {
        try {
            int _type = RULE_INTEGERLITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2485:21: ( ( '1' .. '9' ( '0' .. '9' )* ( ( 'u' | 'U' ) ( 'l' | 'L' | 'll' | 'LL' )? | ( 'l' | 'L' | 'll' | 'LL' ) ( 'u' | 'U' )? )? | '0' ( '0' .. '7' )* ( ( 'u' | 'U' ) ( 'l' | 'L' | 'll' | 'LL' )? | ( 'l' | 'L' | 'll' | 'LL' ) ( 'u' | 'U' )? )? | ( '0x' | '0X' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+ ( ( 'u' | 'U' ) ( 'l' | 'L' | 'll' | 'LL' )? | ( 'l' | 'L' | 'll' | 'LL' ) ( 'u' | 'U' )? )? ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2485:23: ( '1' .. '9' ( '0' .. '9' )* ( ( 'u' | 'U' ) ( 'l' | 'L' | 'll' | 'LL' )? | ( 'l' | 'L' | 'll' | 'LL' ) ( 'u' | 'U' )? )? | '0' ( '0' .. '7' )* ( ( 'u' | 'U' ) ( 'l' | 'L' | 'll' | 'LL' )? | ( 'l' | 'L' | 'll' | 'LL' ) ( 'u' | 'U' )? )? | ( '0x' | '0X' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+ ( ( 'u' | 'U' ) ( 'l' | 'L' | 'll' | 'LL' )? | ( 'l' | 'L' | 'll' | 'LL' ) ( 'u' | 'U' )? )? )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2485:23: ( '1' .. '9' ( '0' .. '9' )* ( ( 'u' | 'U' ) ( 'l' | 'L' | 'll' | 'LL' )? | ( 'l' | 'L' | 'll' | 'LL' ) ( 'u' | 'U' )? )? | '0' ( '0' .. '7' )* ( ( 'u' | 'U' ) ( 'l' | 'L' | 'll' | 'LL' )? | ( 'l' | 'L' | 'll' | 'LL' ) ( 'u' | 'U' )? )? | ( '0x' | '0X' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+ ( ( 'u' | 'U' ) ( 'l' | 'L' | 'll' | 'LL' )? | ( 'l' | 'L' | 'll' | 'LL' ) ( 'u' | 'U' )? )? )
            int alt19=3;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>='1' && LA19_0<='9')) ) {
                alt19=1;
            }
            else if ( (LA19_0=='0') ) {
                int LA19_2 = input.LA(2);

                if ( (LA19_2=='X'||LA19_2=='x') ) {
                    alt19=3;
                }
                else {
                    alt19=2;}
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2485:24: '1' .. '9' ( '0' .. '9' )* ( ( 'u' | 'U' ) ( 'l' | 'L' | 'll' | 'LL' )? | ( 'l' | 'L' | 'll' | 'LL' ) ( 'u' | 'U' )? )?
                    {
                    matchRange('1','9'); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2485:33: ( '0' .. '9' )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2485:34: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2485:45: ( ( 'u' | 'U' ) ( 'l' | 'L' | 'll' | 'LL' )? | ( 'l' | 'L' | 'll' | 'LL' ) ( 'u' | 'U' )? )?
                    int alt7=3;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0=='U'||LA7_0=='u') ) {
                        alt7=1;
                    }
                    else if ( (LA7_0=='L'||LA7_0=='l') ) {
                        alt7=2;
                    }
                    switch (alt7) {
                        case 1 :
                            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2485:46: ( 'u' | 'U' ) ( 'l' | 'L' | 'll' | 'LL' )?
                            {
                            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}

                            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2485:56: ( 'l' | 'L' | 'll' | 'LL' )?
                            int alt4=5;
                            int LA4_0 = input.LA(1);

                            if ( (LA4_0=='l') ) {
                                int LA4_1 = input.LA(2);

                                if ( (LA4_1=='l') ) {
                                    alt4=3;
                                }
                            }
                            else if ( (LA4_0=='L') ) {
                                int LA4_2 = input.LA(2);

                                if ( (LA4_2=='L') ) {
                                    alt4=4;
                                }
                            }
                            switch (alt4) {
                                case 1 :
                                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2485:57: 'l'
                                    {
                                    match('l'); 

                                    }
                                    break;
                                case 2 :
                                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2485:61: 'L'
                                    {
                                    match('L'); 

                                    }
                                    break;
                                case 3 :
                                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2485:65: 'll'
                                    {
                                    match("ll"); 


                                    }
                                    break;
                                case 4 :
                                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2485:70: 'LL'
                                    {
                                    match("LL"); 


                                    }
                                    break;

                            }


                            }
                            break;
                        case 2 :
                            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2485:77: ( 'l' | 'L' | 'll' | 'LL' ) ( 'u' | 'U' )?
                            {
                            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2485:77: ( 'l' | 'L' | 'll' | 'LL' )
                            int alt5=4;
                            int LA5_0 = input.LA(1);

                            if ( (LA5_0=='l') ) {
                                int LA5_1 = input.LA(2);

                                if ( (LA5_1=='l') ) {
                                    alt5=3;
                                }
                                else {
                                    alt5=1;}
                            }
                            else if ( (LA5_0=='L') ) {
                                int LA5_2 = input.LA(2);

                                if ( (LA5_2=='L') ) {
                                    alt5=4;
                                }
                                else {
                                    alt5=2;}
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 5, 0, input);

                                throw nvae;
                            }
                            switch (alt5) {
                                case 1 :
                                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2485:78: 'l'
                                    {
                                    match('l'); 

                                    }
                                    break;
                                case 2 :
                                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2485:82: 'L'
                                    {
                                    match('L'); 

                                    }
                                    break;
                                case 3 :
                                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2485:86: 'll'
                                    {
                                    match("ll"); 


                                    }
                                    break;
                                case 4 :
                                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2485:91: 'LL'
                                    {
                                    match("LL"); 


                                    }
                                    break;

                            }

                            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2485:97: ( 'u' | 'U' )?
                            int alt6=2;
                            int LA6_0 = input.LA(1);

                            if ( (LA6_0=='U'||LA6_0=='u') ) {
                                alt6=1;
                            }
                            switch (alt6) {
                                case 1 :
                                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:
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
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2485:110: '0' ( '0' .. '7' )* ( ( 'u' | 'U' ) ( 'l' | 'L' | 'll' | 'LL' )? | ( 'l' | 'L' | 'll' | 'LL' ) ( 'u' | 'U' )? )?
                    {
                    match('0'); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2485:114: ( '0' .. '7' )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( ((LA8_0>='0' && LA8_0<='7')) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2485:115: '0' .. '7'
                    	    {
                    	    matchRange('0','7'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2485:126: ( ( 'u' | 'U' ) ( 'l' | 'L' | 'll' | 'LL' )? | ( 'l' | 'L' | 'll' | 'LL' ) ( 'u' | 'U' )? )?
                    int alt12=3;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0=='U'||LA12_0=='u') ) {
                        alt12=1;
                    }
                    else if ( (LA12_0=='L'||LA12_0=='l') ) {
                        alt12=2;
                    }
                    switch (alt12) {
                        case 1 :
                            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2485:127: ( 'u' | 'U' ) ( 'l' | 'L' | 'll' | 'LL' )?
                            {
                            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}

                            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2485:137: ( 'l' | 'L' | 'll' | 'LL' )?
                            int alt9=5;
                            int LA9_0 = input.LA(1);

                            if ( (LA9_0=='l') ) {
                                int LA9_1 = input.LA(2);

                                if ( (LA9_1=='l') ) {
                                    alt9=3;
                                }
                            }
                            else if ( (LA9_0=='L') ) {
                                int LA9_2 = input.LA(2);

                                if ( (LA9_2=='L') ) {
                                    alt9=4;
                                }
                            }
                            switch (alt9) {
                                case 1 :
                                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2485:138: 'l'
                                    {
                                    match('l'); 

                                    }
                                    break;
                                case 2 :
                                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2485:142: 'L'
                                    {
                                    match('L'); 

                                    }
                                    break;
                                case 3 :
                                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2485:146: 'll'
                                    {
                                    match("ll"); 


                                    }
                                    break;
                                case 4 :
                                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2485:151: 'LL'
                                    {
                                    match("LL"); 


                                    }
                                    break;

                            }


                            }
                            break;
                        case 2 :
                            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2485:158: ( 'l' | 'L' | 'll' | 'LL' ) ( 'u' | 'U' )?
                            {
                            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2485:158: ( 'l' | 'L' | 'll' | 'LL' )
                            int alt10=4;
                            int LA10_0 = input.LA(1);

                            if ( (LA10_0=='l') ) {
                                int LA10_1 = input.LA(2);

                                if ( (LA10_1=='l') ) {
                                    alt10=3;
                                }
                                else {
                                    alt10=1;}
                            }
                            else if ( (LA10_0=='L') ) {
                                int LA10_2 = input.LA(2);

                                if ( (LA10_2=='L') ) {
                                    alt10=4;
                                }
                                else {
                                    alt10=2;}
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 10, 0, input);

                                throw nvae;
                            }
                            switch (alt10) {
                                case 1 :
                                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2485:159: 'l'
                                    {
                                    match('l'); 

                                    }
                                    break;
                                case 2 :
                                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2485:163: 'L'
                                    {
                                    match('L'); 

                                    }
                                    break;
                                case 3 :
                                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2485:167: 'll'
                                    {
                                    match("ll"); 


                                    }
                                    break;
                                case 4 :
                                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2485:172: 'LL'
                                    {
                                    match("LL"); 


                                    }
                                    break;

                            }

                            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2485:178: ( 'u' | 'U' )?
                            int alt11=2;
                            int LA11_0 = input.LA(1);

                            if ( (LA11_0=='U'||LA11_0=='u') ) {
                                alt11=1;
                            }
                            switch (alt11) {
                                case 1 :
                                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:
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
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2485:191: ( '0x' | '0X' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+ ( ( 'u' | 'U' ) ( 'l' | 'L' | 'll' | 'LL' )? | ( 'l' | 'L' | 'll' | 'LL' ) ( 'u' | 'U' )? )?
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2485:191: ( '0x' | '0X' )
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0=='0') ) {
                        int LA13_1 = input.LA(2);

                        if ( (LA13_1=='x') ) {
                            alt13=1;
                        }
                        else if ( (LA13_1=='X') ) {
                            alt13=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 13, 1, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 0, input);

                        throw nvae;
                    }
                    switch (alt13) {
                        case 1 :
                            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2485:192: '0x'
                            {
                            match("0x"); 


                            }
                            break;
                        case 2 :
                            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2485:197: '0X'
                            {
                            match("0X"); 


                            }
                            break;

                    }

                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2485:203: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+
                    int cnt14=0;
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( ((LA14_0>='0' && LA14_0<='9')||(LA14_0>='A' && LA14_0<='F')||(LA14_0>='a' && LA14_0<='f')) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:
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
                    	    if ( cnt14 >= 1 ) break loop14;
                                EarlyExitException eee =
                                    new EarlyExitException(14, input);
                                throw eee;
                        }
                        cnt14++;
                    } while (true);

                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2485:233: ( ( 'u' | 'U' ) ( 'l' | 'L' | 'll' | 'LL' )? | ( 'l' | 'L' | 'll' | 'LL' ) ( 'u' | 'U' )? )?
                    int alt18=3;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0=='U'||LA18_0=='u') ) {
                        alt18=1;
                    }
                    else if ( (LA18_0=='L'||LA18_0=='l') ) {
                        alt18=2;
                    }
                    switch (alt18) {
                        case 1 :
                            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2485:234: ( 'u' | 'U' ) ( 'l' | 'L' | 'll' | 'LL' )?
                            {
                            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}

                            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2485:244: ( 'l' | 'L' | 'll' | 'LL' )?
                            int alt15=5;
                            int LA15_0 = input.LA(1);

                            if ( (LA15_0=='l') ) {
                                int LA15_1 = input.LA(2);

                                if ( (LA15_1=='l') ) {
                                    alt15=3;
                                }
                            }
                            else if ( (LA15_0=='L') ) {
                                int LA15_2 = input.LA(2);

                                if ( (LA15_2=='L') ) {
                                    alt15=4;
                                }
                            }
                            switch (alt15) {
                                case 1 :
                                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2485:245: 'l'
                                    {
                                    match('l'); 

                                    }
                                    break;
                                case 2 :
                                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2485:249: 'L'
                                    {
                                    match('L'); 

                                    }
                                    break;
                                case 3 :
                                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2485:253: 'll'
                                    {
                                    match("ll"); 


                                    }
                                    break;
                                case 4 :
                                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2485:258: 'LL'
                                    {
                                    match("LL"); 


                                    }
                                    break;

                            }


                            }
                            break;
                        case 2 :
                            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2485:265: ( 'l' | 'L' | 'll' | 'LL' ) ( 'u' | 'U' )?
                            {
                            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2485:265: ( 'l' | 'L' | 'll' | 'LL' )
                            int alt16=4;
                            int LA16_0 = input.LA(1);

                            if ( (LA16_0=='l') ) {
                                int LA16_1 = input.LA(2);

                                if ( (LA16_1=='l') ) {
                                    alt16=3;
                                }
                                else {
                                    alt16=1;}
                            }
                            else if ( (LA16_0=='L') ) {
                                int LA16_2 = input.LA(2);

                                if ( (LA16_2=='L') ) {
                                    alt16=4;
                                }
                                else {
                                    alt16=2;}
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 16, 0, input);

                                throw nvae;
                            }
                            switch (alt16) {
                                case 1 :
                                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2485:266: 'l'
                                    {
                                    match('l'); 

                                    }
                                    break;
                                case 2 :
                                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2485:270: 'L'
                                    {
                                    match('L'); 

                                    }
                                    break;
                                case 3 :
                                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2485:274: 'll'
                                    {
                                    match("ll"); 


                                    }
                                    break;
                                case 4 :
                                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2485:279: 'LL'
                                    {
                                    match("LL"); 


                                    }
                                    break;

                            }

                            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2485:285: ( 'u' | 'U' )?
                            int alt17=2;
                            int LA17_0 = input.LA(1);

                            if ( (LA17_0=='U'||LA17_0=='u') ) {
                                alt17=1;
                            }
                            switch (alt17) {
                                case 1 :
                                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:
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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2487:21: ( ( 'false' | 'true' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2487:23: ( 'false' | 'true' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2487:23: ( 'false' | 'true' )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0=='f') ) {
                alt20=1;
            }
            else if ( (LA20_0=='t') ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2487:24: 'false'
                    {
                    match("false"); 


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2487:32: 'true'
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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2489:21: ( 'nullptr' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2489:23: 'nullptr'
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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2491:15: ( ( '0' .. '9' | '.' '0' .. '9' ) ( '0' .. '9' | ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) | 'e' ( '+' | '-' ) | 'E' ( '+' | '-' ) | '.' )* )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2491:17: ( '0' .. '9' | '.' '0' .. '9' ) ( '0' .. '9' | ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) | 'e' ( '+' | '-' ) | 'E' ( '+' | '-' ) | '.' )*
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2491:17: ( '0' .. '9' | '.' '0' .. '9' )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>='0' && LA21_0<='9')) ) {
                alt21=1;
            }
            else if ( (LA21_0=='.') ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2491:18: '0' .. '9'
                    {
                    matchRange('0','9'); 

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2491:27: '.' '0' .. '9'
                    {
                    match('.'); 
                    matchRange('0','9'); 

                    }
                    break;

            }

            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2491:41: ( '0' .. '9' | ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) | 'e' ( '+' | '-' ) | 'E' ( '+' | '-' ) | '.' )*
            loop22:
            do {
                int alt22=6;
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
                    alt22=1;
                    }
                    break;
                case 'e':
                    {
                    int LA22_3 = input.LA(2);

                    if ( (LA22_3=='+'||LA22_3=='-') ) {
                        alt22=3;
                    }

                    else {
                        alt22=2;
                    }

                    }
                    break;
                case 'E':
                    {
                    int LA22_4 = input.LA(2);

                    if ( (LA22_4=='+'||LA22_4=='-') ) {
                        alt22=4;
                    }

                    else {
                        alt22=2;
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
                    alt22=2;
                    }
                    break;
                case '.':
                    {
                    alt22=5;
                    }
                    break;

                }

                switch (alt22) {
            	case 1 :
            	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2491:42: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;
            	case 2 :
            	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2491:51: ( 'a' .. 'z' | 'A' .. 'Z' | '_' )
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
            	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2491:75: 'e' ( '+' | '-' )
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
            	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2491:89: 'E' ( '+' | '-' )
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
            	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2491:103: '.'
            	    {
            	    match('.'); 

            	    }
            	    break;

            	default :
            	    break loop22;
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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2493:14: ( ( RULE_INTEGERLITERAL | RULE_BOOLEANLITERAL | RULE_POINTERLITERAL ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2493:16: ( RULE_INTEGERLITERAL | RULE_BOOLEANLITERAL | RULE_POINTERLITERAL )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2493:16: ( RULE_INTEGERLITERAL | RULE_BOOLEANLITERAL | RULE_POINTERLITERAL )
            int alt23=3;
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
                alt23=1;
                }
                break;
            case 'f':
            case 't':
                {
                alt23=2;
                }
                break;
            case 'n':
                {
                alt23=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2493:17: RULE_INTEGERLITERAL
                    {
                    mRULE_INTEGERLITERAL(); 

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2493:37: RULE_BOOLEANLITERAL
                    {
                    mRULE_BOOLEANLITERAL(); 

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2493:57: RULE_POINTERLITERAL
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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2495:14: ( ( 'alignas' | 'alignof' | 'asm' | 'auto' | 'bool' | 'break' | 'case' | 'catch' | 'char' | 'char16_t' | 'char32_t' | 'class' | 'const' | 'constexpr' | 'const_cast' | 'continue' | 'decltype' | 'default' | 'delete' | 'do' | 'double' | 'dynamic_cast' | 'else' | 'enum' | 'explicit' | 'export' | 'extern' | 'false' | 'float' | 'for' | 'friend' | 'goto' | 'if' | 'inline' | 'int' | 'long' | 'mutable' | 'namespace' | 'new' | 'noexcept' | 'nullptr' | 'operator' | 'private' | 'protected' | 'public' | 'register' | 'reinterpret_cast' | 'return' | 'short' | 'signed' | 'sizeof' | 'static' | 'static_assert' | 'static_cast' | 'struct' | 'switch' | 'template' | 'this' | 'thread_local' | 'throw' | 'true' | 'try' | 'typedef' | 'typeid' | 'typename' | 'union' | 'unsigned' | 'using' | 'virtual' | 'void' | 'volatile' | 'wchar_t' | 'while' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2495:16: ( 'alignas' | 'alignof' | 'asm' | 'auto' | 'bool' | 'break' | 'case' | 'catch' | 'char' | 'char16_t' | 'char32_t' | 'class' | 'const' | 'constexpr' | 'const_cast' | 'continue' | 'decltype' | 'default' | 'delete' | 'do' | 'double' | 'dynamic_cast' | 'else' | 'enum' | 'explicit' | 'export' | 'extern' | 'false' | 'float' | 'for' | 'friend' | 'goto' | 'if' | 'inline' | 'int' | 'long' | 'mutable' | 'namespace' | 'new' | 'noexcept' | 'nullptr' | 'operator' | 'private' | 'protected' | 'public' | 'register' | 'reinterpret_cast' | 'return' | 'short' | 'signed' | 'sizeof' | 'static' | 'static_assert' | 'static_cast' | 'struct' | 'switch' | 'template' | 'this' | 'thread_local' | 'throw' | 'true' | 'try' | 'typedef' | 'typeid' | 'typename' | 'union' | 'unsigned' | 'using' | 'virtual' | 'void' | 'volatile' | 'wchar_t' | 'while' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2495:16: ( 'alignas' | 'alignof' | 'asm' | 'auto' | 'bool' | 'break' | 'case' | 'catch' | 'char' | 'char16_t' | 'char32_t' | 'class' | 'const' | 'constexpr' | 'const_cast' | 'continue' | 'decltype' | 'default' | 'delete' | 'do' | 'double' | 'dynamic_cast' | 'else' | 'enum' | 'explicit' | 'export' | 'extern' | 'false' | 'float' | 'for' | 'friend' | 'goto' | 'if' | 'inline' | 'int' | 'long' | 'mutable' | 'namespace' | 'new' | 'noexcept' | 'nullptr' | 'operator' | 'private' | 'protected' | 'public' | 'register' | 'reinterpret_cast' | 'return' | 'short' | 'signed' | 'sizeof' | 'static' | 'static_assert' | 'static_cast' | 'struct' | 'switch' | 'template' | 'this' | 'thread_local' | 'throw' | 'true' | 'try' | 'typedef' | 'typeid' | 'typename' | 'union' | 'unsigned' | 'using' | 'virtual' | 'void' | 'volatile' | 'wchar_t' | 'while' )
            int alt24=73;
            alt24 = dfa24.predict(input);
            switch (alt24) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2495:17: 'alignas'
                    {
                    match("alignas"); 


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2495:27: 'alignof'
                    {
                    match("alignof"); 


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2495:37: 'asm'
                    {
                    match("asm"); 


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2495:43: 'auto'
                    {
                    match("auto"); 


                    }
                    break;
                case 5 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2495:50: 'bool'
                    {
                    match("bool"); 


                    }
                    break;
                case 6 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2495:57: 'break'
                    {
                    match("break"); 


                    }
                    break;
                case 7 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2495:65: 'case'
                    {
                    match("case"); 


                    }
                    break;
                case 8 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2495:72: 'catch'
                    {
                    match("catch"); 


                    }
                    break;
                case 9 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2495:80: 'char'
                    {
                    match("char"); 


                    }
                    break;
                case 10 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2495:87: 'char16_t'
                    {
                    match("char16_t"); 


                    }
                    break;
                case 11 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2495:98: 'char32_t'
                    {
                    match("char32_t"); 


                    }
                    break;
                case 12 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2495:109: 'class'
                    {
                    match("class"); 


                    }
                    break;
                case 13 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2495:117: 'const'
                    {
                    match("const"); 


                    }
                    break;
                case 14 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2495:125: 'constexpr'
                    {
                    match("constexpr"); 


                    }
                    break;
                case 15 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2495:137: 'const_cast'
                    {
                    match("const_cast"); 


                    }
                    break;
                case 16 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2495:150: 'continue'
                    {
                    match("continue"); 


                    }
                    break;
                case 17 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2495:161: 'decltype'
                    {
                    match("decltype"); 


                    }
                    break;
                case 18 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2495:172: 'default'
                    {
                    match("default"); 


                    }
                    break;
                case 19 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2495:182: 'delete'
                    {
                    match("delete"); 


                    }
                    break;
                case 20 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2495:191: 'do'
                    {
                    match("do"); 


                    }
                    break;
                case 21 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2495:196: 'double'
                    {
                    match("double"); 


                    }
                    break;
                case 22 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2495:205: 'dynamic_cast'
                    {
                    match("dynamic_cast"); 


                    }
                    break;
                case 23 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2495:220: 'else'
                    {
                    match("else"); 


                    }
                    break;
                case 24 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2495:227: 'enum'
                    {
                    match("enum"); 


                    }
                    break;
                case 25 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2495:234: 'explicit'
                    {
                    match("explicit"); 


                    }
                    break;
                case 26 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2495:245: 'export'
                    {
                    match("export"); 


                    }
                    break;
                case 27 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2495:254: 'extern'
                    {
                    match("extern"); 


                    }
                    break;
                case 28 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2495:263: 'false'
                    {
                    match("false"); 


                    }
                    break;
                case 29 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2495:271: 'float'
                    {
                    match("float"); 


                    }
                    break;
                case 30 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2495:279: 'for'
                    {
                    match("for"); 


                    }
                    break;
                case 31 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2495:285: 'friend'
                    {
                    match("friend"); 


                    }
                    break;
                case 32 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2495:294: 'goto'
                    {
                    match("goto"); 


                    }
                    break;
                case 33 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2495:301: 'if'
                    {
                    match("if"); 


                    }
                    break;
                case 34 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2495:306: 'inline'
                    {
                    match("inline"); 


                    }
                    break;
                case 35 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2495:315: 'int'
                    {
                    match("int"); 


                    }
                    break;
                case 36 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2495:321: 'long'
                    {
                    match("long"); 


                    }
                    break;
                case 37 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2495:328: 'mutable'
                    {
                    match("mutable"); 


                    }
                    break;
                case 38 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2495:338: 'namespace'
                    {
                    match("namespace"); 


                    }
                    break;
                case 39 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2495:350: 'new'
                    {
                    match("new"); 


                    }
                    break;
                case 40 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2495:356: 'noexcept'
                    {
                    match("noexcept"); 


                    }
                    break;
                case 41 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2495:367: 'nullptr'
                    {
                    match("nullptr"); 


                    }
                    break;
                case 42 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2495:377: 'operator'
                    {
                    match("operator"); 


                    }
                    break;
                case 43 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2495:388: 'private'
                    {
                    match("private"); 


                    }
                    break;
                case 44 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2495:398: 'protected'
                    {
                    match("protected"); 


                    }
                    break;
                case 45 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2495:410: 'public'
                    {
                    match("public"); 


                    }
                    break;
                case 46 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2495:419: 'register'
                    {
                    match("register"); 


                    }
                    break;
                case 47 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2495:430: 'reinterpret_cast'
                    {
                    match("reinterpret_cast"); 


                    }
                    break;
                case 48 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2495:449: 'return'
                    {
                    match("return"); 


                    }
                    break;
                case 49 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2495:458: 'short'
                    {
                    match("short"); 


                    }
                    break;
                case 50 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2495:466: 'signed'
                    {
                    match("signed"); 


                    }
                    break;
                case 51 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2495:475: 'sizeof'
                    {
                    match("sizeof"); 


                    }
                    break;
                case 52 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2495:484: 'static'
                    {
                    match("static"); 


                    }
                    break;
                case 53 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2495:493: 'static_assert'
                    {
                    match("static_assert"); 


                    }
                    break;
                case 54 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2495:509: 'static_cast'
                    {
                    match("static_cast"); 


                    }
                    break;
                case 55 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2495:523: 'struct'
                    {
                    match("struct"); 


                    }
                    break;
                case 56 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2495:532: 'switch'
                    {
                    match("switch"); 


                    }
                    break;
                case 57 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2495:541: 'template'
                    {
                    match("template"); 


                    }
                    break;
                case 58 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2495:552: 'this'
                    {
                    match("this"); 


                    }
                    break;
                case 59 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2495:559: 'thread_local'
                    {
                    match("thread_local"); 


                    }
                    break;
                case 60 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2495:574: 'throw'
                    {
                    match("throw"); 


                    }
                    break;
                case 61 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2495:582: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 62 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2495:589: 'try'
                    {
                    match("try"); 


                    }
                    break;
                case 63 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2495:595: 'typedef'
                    {
                    match("typedef"); 


                    }
                    break;
                case 64 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2495:605: 'typeid'
                    {
                    match("typeid"); 


                    }
                    break;
                case 65 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2495:614: 'typename'
                    {
                    match("typename"); 


                    }
                    break;
                case 66 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2495:625: 'union'
                    {
                    match("union"); 


                    }
                    break;
                case 67 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2495:633: 'unsigned'
                    {
                    match("unsigned"); 


                    }
                    break;
                case 68 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2495:644: 'using'
                    {
                    match("using"); 


                    }
                    break;
                case 69 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2495:652: 'virtual'
                    {
                    match("virtual"); 


                    }
                    break;
                case 70 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2495:662: 'void'
                    {
                    match("void"); 


                    }
                    break;
                case 71 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2495:669: 'volatile'
                    {
                    match("volatile"); 


                    }
                    break;
                case 72 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2495:680: 'wchar_t'
                    {
                    match("wchar_t"); 


                    }
                    break;
                case 73 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2495:690: 'while'
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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2497:17: ( ( '{' | '}' | '[' | ']' | '#' | '##' | '(' | ')' | '<:' | ':>' | '<%' | '%>' | '%:' | '%:%:' | ';' | ':' | '...' | 'new' | 'delete' | '?' | '::' | '.' | '.*' | '+' | '-' | '*' | '/' | '%' | '^' | '&' | '|' | '~' | '!' | '=' | '<' | '>' | '+=' | '-=' | '*=' | '/=' | '%=' | '^=' | '&=' | '|=' | '<<' | '>>' | '<<=' | '>>=' | '==' | '!=' | '<=' | '>=' | '&&' | '||' | '++' | '--' | ',' | '->*' | '->' | 'and' | 'and_eq' | 'bitand' | 'bitor' | 'compl' | 'not' | 'not_eq' | 'or' | 'or_eq' | 'xor' | 'xor_eq' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2497:19: ( '{' | '}' | '[' | ']' | '#' | '##' | '(' | ')' | '<:' | ':>' | '<%' | '%>' | '%:' | '%:%:' | ';' | ':' | '...' | 'new' | 'delete' | '?' | '::' | '.' | '.*' | '+' | '-' | '*' | '/' | '%' | '^' | '&' | '|' | '~' | '!' | '=' | '<' | '>' | '+=' | '-=' | '*=' | '/=' | '%=' | '^=' | '&=' | '|=' | '<<' | '>>' | '<<=' | '>>=' | '==' | '!=' | '<=' | '>=' | '&&' | '||' | '++' | '--' | ',' | '->*' | '->' | 'and' | 'and_eq' | 'bitand' | 'bitor' | 'compl' | 'not' | 'not_eq' | 'or' | 'or_eq' | 'xor' | 'xor_eq' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2497:19: ( '{' | '}' | '[' | ']' | '#' | '##' | '(' | ')' | '<:' | ':>' | '<%' | '%>' | '%:' | '%:%:' | ';' | ':' | '...' | 'new' | 'delete' | '?' | '::' | '.' | '.*' | '+' | '-' | '*' | '/' | '%' | '^' | '&' | '|' | '~' | '!' | '=' | '<' | '>' | '+=' | '-=' | '*=' | '/=' | '%=' | '^=' | '&=' | '|=' | '<<' | '>>' | '<<=' | '>>=' | '==' | '!=' | '<=' | '>=' | '&&' | '||' | '++' | '--' | ',' | '->*' | '->' | 'and' | 'and_eq' | 'bitand' | 'bitor' | 'compl' | 'not' | 'not_eq' | 'or' | 'or_eq' | 'xor' | 'xor_eq' )
            int alt25=70;
            alt25 = dfa25.predict(input);
            switch (alt25) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2497:20: '{'
                    {
                    match('{'); 

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2497:24: '}'
                    {
                    match('}'); 

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2497:28: '['
                    {
                    match('['); 

                    }
                    break;
                case 4 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2497:32: ']'
                    {
                    match(']'); 

                    }
                    break;
                case 5 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2497:36: '#'
                    {
                    match('#'); 

                    }
                    break;
                case 6 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2497:40: '##'
                    {
                    match("##"); 


                    }
                    break;
                case 7 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2497:45: '('
                    {
                    match('('); 

                    }
                    break;
                case 8 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2497:49: ')'
                    {
                    match(')'); 

                    }
                    break;
                case 9 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2497:53: '<:'
                    {
                    match("<:"); 


                    }
                    break;
                case 10 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2497:58: ':>'
                    {
                    match(":>"); 


                    }
                    break;
                case 11 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2497:63: '<%'
                    {
                    match("<%"); 


                    }
                    break;
                case 12 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2497:68: '%>'
                    {
                    match("%>"); 


                    }
                    break;
                case 13 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2497:73: '%:'
                    {
                    match("%:"); 


                    }
                    break;
                case 14 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2497:78: '%:%:'
                    {
                    match("%:%:"); 


                    }
                    break;
                case 15 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2497:85: ';'
                    {
                    match(';'); 

                    }
                    break;
                case 16 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2497:89: ':'
                    {
                    match(':'); 

                    }
                    break;
                case 17 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2497:93: '...'
                    {
                    match("..."); 


                    }
                    break;
                case 18 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2497:99: 'new'
                    {
                    match("new"); 


                    }
                    break;
                case 19 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2497:105: 'delete'
                    {
                    match("delete"); 


                    }
                    break;
                case 20 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2497:114: '?'
                    {
                    match('?'); 

                    }
                    break;
                case 21 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2497:118: '::'
                    {
                    match("::"); 


                    }
                    break;
                case 22 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2497:123: '.'
                    {
                    match('.'); 

                    }
                    break;
                case 23 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2497:127: '.*'
                    {
                    match(".*"); 


                    }
                    break;
                case 24 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2497:132: '+'
                    {
                    match('+'); 

                    }
                    break;
                case 25 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2497:136: '-'
                    {
                    match('-'); 

                    }
                    break;
                case 26 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2497:140: '*'
                    {
                    match('*'); 

                    }
                    break;
                case 27 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2497:144: '/'
                    {
                    match('/'); 

                    }
                    break;
                case 28 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2497:148: '%'
                    {
                    match('%'); 

                    }
                    break;
                case 29 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2497:152: '^'
                    {
                    match('^'); 

                    }
                    break;
                case 30 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2497:156: '&'
                    {
                    match('&'); 

                    }
                    break;
                case 31 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2497:160: '|'
                    {
                    match('|'); 

                    }
                    break;
                case 32 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2497:164: '~'
                    {
                    match('~'); 

                    }
                    break;
                case 33 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2497:168: '!'
                    {
                    match('!'); 

                    }
                    break;
                case 34 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2497:172: '='
                    {
                    match('='); 

                    }
                    break;
                case 35 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2497:176: '<'
                    {
                    match('<'); 

                    }
                    break;
                case 36 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2497:180: '>'
                    {
                    match('>'); 

                    }
                    break;
                case 37 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2497:184: '+='
                    {
                    match("+="); 


                    }
                    break;
                case 38 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2497:189: '-='
                    {
                    match("-="); 


                    }
                    break;
                case 39 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2497:194: '*='
                    {
                    match("*="); 


                    }
                    break;
                case 40 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2497:199: '/='
                    {
                    match("/="); 


                    }
                    break;
                case 41 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2497:204: '%='
                    {
                    match("%="); 


                    }
                    break;
                case 42 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2497:209: '^='
                    {
                    match("^="); 


                    }
                    break;
                case 43 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2497:214: '&='
                    {
                    match("&="); 


                    }
                    break;
                case 44 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2497:219: '|='
                    {
                    match("|="); 


                    }
                    break;
                case 45 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2497:224: '<<'
                    {
                    match("<<"); 


                    }
                    break;
                case 46 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2497:229: '>>'
                    {
                    match(">>"); 


                    }
                    break;
                case 47 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2497:234: '<<='
                    {
                    match("<<="); 


                    }
                    break;
                case 48 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2497:240: '>>='
                    {
                    match(">>="); 


                    }
                    break;
                case 49 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2497:246: '=='
                    {
                    match("=="); 


                    }
                    break;
                case 50 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2497:251: '!='
                    {
                    match("!="); 


                    }
                    break;
                case 51 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2497:256: '<='
                    {
                    match("<="); 


                    }
                    break;
                case 52 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2497:261: '>='
                    {
                    match(">="); 


                    }
                    break;
                case 53 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2497:266: '&&'
                    {
                    match("&&"); 


                    }
                    break;
                case 54 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2497:271: '||'
                    {
                    match("||"); 


                    }
                    break;
                case 55 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2497:276: '++'
                    {
                    match("++"); 


                    }
                    break;
                case 56 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2497:281: '--'
                    {
                    match("--"); 


                    }
                    break;
                case 57 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2497:286: ','
                    {
                    match(','); 

                    }
                    break;
                case 58 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2497:290: '->*'
                    {
                    match("->*"); 


                    }
                    break;
                case 59 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2497:296: '->'
                    {
                    match("->"); 


                    }
                    break;
                case 60 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2497:301: 'and'
                    {
                    match("and"); 


                    }
                    break;
                case 61 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2497:307: 'and_eq'
                    {
                    match("and_eq"); 


                    }
                    break;
                case 62 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2497:316: 'bitand'
                    {
                    match("bitand"); 


                    }
                    break;
                case 63 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2497:325: 'bitor'
                    {
                    match("bitor"); 


                    }
                    break;
                case 64 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2497:333: 'compl'
                    {
                    match("compl"); 


                    }
                    break;
                case 65 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2497:341: 'not'
                    {
                    match("not"); 


                    }
                    break;
                case 66 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2497:347: 'not_eq'
                    {
                    match("not_eq"); 


                    }
                    break;
                case 67 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2497:356: 'or'
                    {
                    match("or"); 


                    }
                    break;
                case 68 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2497:361: 'or_eq'
                    {
                    match("or_eq"); 


                    }
                    break;
                case 69 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2497:369: 'xor'
                    {
                    match("xor"); 


                    }
                    break;
                case 70 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2497:375: 'xor_eq'
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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2499:17: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( '0' .. '9' | 'A' .. 'Z' | 'a' .. 'z' | '_' )* )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2499:19: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( '0' .. '9' | 'A' .. 'Z' | 'a' .. 'z' | '_' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2499:43: ( '0' .. '9' | 'A' .. 'Z' | 'a' .. 'z' | '_' )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>='0' && LA26_0<='9')||(LA26_0>='A' && LA26_0<='Z')||LA26_0=='_'||(LA26_0>='a' && LA26_0<='z')) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:
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
    // $ANTLR end "RULE_IDENTIFIER"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2501:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2501:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2501:11: ( '^' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0=='^') ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2501:11: '^'
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

            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2501:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>='0' && LA28_0<='9')||(LA28_0>='A' && LA28_0<='Z')||LA28_0=='_'||(LA28_0>='a' && LA28_0<='z')) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:
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
            	    break loop28;
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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2503:10: ( ( '0' .. '9' )+ )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2503:12: ( '0' .. '9' )+
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2503:12: ( '0' .. '9' )+
            int cnt29=0;
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( ((LA29_0>='0' && LA29_0<='9')) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2503:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt29 >= 1 ) break loop29;
                        EarlyExitException eee =
                            new EarlyExitException(29, input);
                        throw eee;
                }
                cnt29++;
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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2505:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2505:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2505:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0=='\"') ) {
                alt32=1;
            }
            else if ( (LA32_0=='\'') ) {
                alt32=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2505:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2505:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop30:
                    do {
                        int alt30=3;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0=='\\') ) {
                            alt30=1;
                        }
                        else if ( ((LA30_0>='\u0000' && LA30_0<='!')||(LA30_0>='#' && LA30_0<='[')||(LA30_0>=']' && LA30_0<='\uFFFF')) ) {
                            alt30=2;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2505:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2505:66: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop30;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2505:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2505:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop31:
                    do {
                        int alt31=3;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0=='\\') ) {
                            alt31=1;
                        }
                        else if ( ((LA31_0>='\u0000' && LA31_0<='&')||(LA31_0>='(' && LA31_0<='[')||(LA31_0>=']' && LA31_0<='\uFFFF')) ) {
                            alt31=2;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2505:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2505:137: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop31;
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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2507:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2507:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2507:24: ( options {greedy=false; } : . )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0=='*') ) {
                    int LA33_1 = input.LA(2);

                    if ( (LA33_1=='/') ) {
                        alt33=2;
                    }
                    else if ( ((LA33_1>='\u0000' && LA33_1<='.')||(LA33_1>='0' && LA33_1<='\uFFFF')) ) {
                        alt33=1;
                    }


                }
                else if ( ((LA33_0>='\u0000' && LA33_0<=')')||(LA33_0>='+' && LA33_0<='\uFFFF')) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2507:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop33;
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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2509:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2509:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2509:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( ((LA34_0>='\u0000' && LA34_0<='\t')||(LA34_0>='\u000B' && LA34_0<='\f')||(LA34_0>='\u000E' && LA34_0<='\uFFFF')) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2509:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop34;
                }
            } while (true);

            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2509:40: ( ( '\\r' )? '\\n' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0=='\n'||LA36_0=='\r') ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2509:41: ( '\\r' )? '\\n'
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2509:41: ( '\\r' )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0=='\r') ) {
                        alt35=1;
                    }
                    switch (alt35) {
                        case 1 :
                            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2509:41: '\\r'
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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2511:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2511:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2511:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt37=0;
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( ((LA37_0>='\t' && LA37_0<='\n')||LA37_0=='\r'||LA37_0==' ') ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:
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
            	    if ( cnt37 >= 1 ) break loop37;
                        EarlyExitException eee =
                            new EarlyExitException(37, input);
                        throw eee;
                }
                cnt37++;
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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2513:16: ( . )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2513:18: .
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
        // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:8: ( T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | RULE_HEADERNAME | RULE_INTEGERLITERAL | RULE_BOOLEANLITERAL | RULE_POINTERLITERAL | RULE_PPNUMBER | RULE_LITERAL | RULE_KEYWORD | RULE_PPOPORPUNC | RULE_IDENTIFIER | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt38=34;
        alt38 = dfa38.predict(input);
        switch (alt38) {
            case 1 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:10: T__20
                {
                mT__20(); 

                }
                break;
            case 2 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:16: T__21
                {
                mT__21(); 

                }
                break;
            case 3 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:22: T__22
                {
                mT__22(); 

                }
                break;
            case 4 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:28: T__23
                {
                mT__23(); 

                }
                break;
            case 5 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:34: T__24
                {
                mT__24(); 

                }
                break;
            case 6 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:40: T__25
                {
                mT__25(); 

                }
                break;
            case 7 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:46: T__26
                {
                mT__26(); 

                }
                break;
            case 8 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:52: T__27
                {
                mT__27(); 

                }
                break;
            case 9 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:58: T__28
                {
                mT__28(); 

                }
                break;
            case 10 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:64: T__29
                {
                mT__29(); 

                }
                break;
            case 11 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:70: T__30
                {
                mT__30(); 

                }
                break;
            case 12 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:76: T__31
                {
                mT__31(); 

                }
                break;
            case 13 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:82: T__32
                {
                mT__32(); 

                }
                break;
            case 14 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:88: T__33
                {
                mT__33(); 

                }
                break;
            case 15 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:94: T__34
                {
                mT__34(); 

                }
                break;
            case 16 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:100: T__35
                {
                mT__35(); 

                }
                break;
            case 17 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:106: T__36
                {
                mT__36(); 

                }
                break;
            case 18 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:112: T__37
                {
                mT__37(); 

                }
                break;
            case 19 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:118: RULE_HEADERNAME
                {
                mRULE_HEADERNAME(); 

                }
                break;
            case 20 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:134: RULE_INTEGERLITERAL
                {
                mRULE_INTEGERLITERAL(); 

                }
                break;
            case 21 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:154: RULE_BOOLEANLITERAL
                {
                mRULE_BOOLEANLITERAL(); 

                }
                break;
            case 22 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:174: RULE_POINTERLITERAL
                {
                mRULE_POINTERLITERAL(); 

                }
                break;
            case 23 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:194: RULE_PPNUMBER
                {
                mRULE_PPNUMBER(); 

                }
                break;
            case 24 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:208: RULE_LITERAL
                {
                mRULE_LITERAL(); 

                }
                break;
            case 25 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:221: RULE_KEYWORD
                {
                mRULE_KEYWORD(); 

                }
                break;
            case 26 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:234: RULE_PPOPORPUNC
                {
                mRULE_PPOPORPUNC(); 

                }
                break;
            case 27 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:250: RULE_IDENTIFIER
                {
                mRULE_IDENTIFIER(); 

                }
                break;
            case 28 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:266: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 29 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:274: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 30 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:283: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 31 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:295: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 32 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:311: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 33 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:327: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 34 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:335: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA24 dfa24 = new DFA24(this);
    protected DFA25 dfa25 = new DFA25(this);
    protected DFA38 dfa38 = new DFA38(this);
    static final String DFA24_eotS =
        "\36\uffff\1\107\100\uffff\1\153\14\uffff\1\165\11\uffff\1\170\4"+
        "\uffff";
    static final String DFA24_eofS =
        "\173\uffff";
    static final String DFA24_minS =
        "\1\141\1\154\1\157\1\141\1\145\1\154\1\141\1\uffff\1\146\2\uffff"+
        "\1\141\1\uffff\1\162\1\145\1\150\1\145\1\156\1\151\1\143\1\151\4"+
        "\uffff\1\163\1\141\1\uffff\1\156\1\143\1\165\3\uffff\1\160\5\uffff"+
        "\1\154\4\uffff\1\151\1\uffff\1\147\1\uffff\1\147\1\141\2\uffff\1"+
        "\151\1\165\1\160\1\151\2\uffff\1\151\2\uffff\1\147\2\uffff\1\162"+
        "\1\163\5\uffff\1\154\12\uffff\1\164\2\uffff\1\145\2\uffff\1\145"+
        "\4\uffff\1\156\1\61\1\164\3\uffff\1\151\2\uffff\1\144\1\141\3\uffff"+
        "\1\137\1\143\10\uffff\1\137\1\141\3\uffff";
    static final String DFA24_maxS =
        "\1\167\1\165\1\162\1\157\1\171\1\170\1\162\1\uffff\1\156\2\uffff"+
        "\1\165\1\uffff\1\165\1\145\1\167\1\171\1\163\1\157\1\150\1\151\4"+
        "\uffff\1\164\1\141\1\uffff\1\156\1\154\1\165\3\uffff\1\164\5\uffff"+
        "\1\164\4\uffff\1\157\1\uffff\1\164\1\uffff\1\172\1\162\2\uffff\1"+
        "\162\1\171\1\160\1\163\2\uffff\1\154\2\uffff\1\147\2\uffff\1\162"+
        "\1\164\5\uffff\1\157\12\uffff\1\164\2\uffff\1\157\2\uffff\1\145"+
        "\4\uffff\1\156\1\63\1\164\3\uffff\1\151\2\uffff\1\156\1\157\3\uffff"+
        "\1\145\1\143\10\uffff\1\137\1\143\3\uffff";
    static final String DFA24_acceptS =
        "\7\uffff\1\40\1\uffff\1\44\1\45\1\uffff\1\52\10\uffff\1\3\1\4\1"+
        "\5\1\6\2\uffff\1\14\3\uffff\1\26\1\27\1\30\1\uffff\1\34\1\35\1\36"+
        "\1\37\1\41\1\uffff\1\46\1\47\1\50\1\51\1\uffff\1\55\1\uffff\1\61"+
        "\2\uffff\1\70\1\71\4\uffff\1\104\1\105\1\uffff\1\110\1\111\1\uffff"+
        "\1\7\1\10\2\uffff\1\21\1\22\1\23\1\25\1\24\1\uffff\1\33\1\42\1\43"+
        "\1\53\1\54\1\56\1\57\1\60\1\62\1\63\1\uffff\1\67\1\72\1\uffff\1"+
        "\75\1\76\1\uffff\1\102\1\103\1\106\1\107\3\uffff\1\20\1\31\1\32"+
        "\1\uffff\1\73\1\74\2\uffff\1\12\1\13\1\11\2\uffff\1\77\1\100\1\101"+
        "\1\1\1\2\1\16\1\17\1\15\2\uffff\1\64\1\65\1\66";
    static final String DFA24_specialS =
        "\173\uffff}>";
    static final String[] DFA24_transitionS = {
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

    static final short[] DFA24_eot = DFA.unpackEncodedString(DFA24_eotS);
    static final short[] DFA24_eof = DFA.unpackEncodedString(DFA24_eofS);
    static final char[] DFA24_min = DFA.unpackEncodedStringToUnsignedChars(DFA24_minS);
    static final char[] DFA24_max = DFA.unpackEncodedStringToUnsignedChars(DFA24_maxS);
    static final short[] DFA24_accept = DFA.unpackEncodedString(DFA24_acceptS);
    static final short[] DFA24_special = DFA.unpackEncodedString(DFA24_specialS);
    static final short[][] DFA24_transition;

    static {
        int numStates = DFA24_transitionS.length;
        DFA24_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA24_transition[i] = DFA.unpackEncodedString(DFA24_transitionS[i]);
        }
    }

    class DFA24 extends DFA {

        public DFA24(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 24;
            this.eot = DFA24_eot;
            this.eof = DFA24_eof;
            this.min = DFA24_min;
            this.max = DFA24_max;
            this.accept = DFA24_accept;
            this.special = DFA24_special;
            this.transition = DFA24_transition;
        }
        public String getDescription() {
            return "2495:16: ( 'alignas' | 'alignof' | 'asm' | 'auto' | 'bool' | 'break' | 'case' | 'catch' | 'char' | 'char16_t' | 'char32_t' | 'class' | 'const' | 'constexpr' | 'const_cast' | 'continue' | 'decltype' | 'default' | 'delete' | 'do' | 'double' | 'dynamic_cast' | 'else' | 'enum' | 'explicit' | 'export' | 'extern' | 'false' | 'float' | 'for' | 'friend' | 'goto' | 'if' | 'inline' | 'int' | 'long' | 'mutable' | 'namespace' | 'new' | 'noexcept' | 'nullptr' | 'operator' | 'private' | 'protected' | 'public' | 'register' | 'reinterpret_cast' | 'return' | 'short' | 'signed' | 'sizeof' | 'static' | 'static_assert' | 'static_cast' | 'struct' | 'switch' | 'template' | 'this' | 'thread_local' | 'throw' | 'true' | 'try' | 'typedef' | 'typeid' | 'typename' | 'union' | 'unsigned' | 'using' | 'virtual' | 'void' | 'volatile' | 'wchar_t' | 'while' )";
        }
    }
    static final String DFA25_eotS =
        "\5\uffff\1\42\2\uffff\1\47\1\52\1\56\1\uffff\1\61\3\uffff\1\66\1"+
        "\72\1\74\1\76\1\100\1\103\1\106\1\uffff\1\110\1\112\1\115\12\uffff"+
        "\1\123\6\uffff\1\125\14\uffff\1\130\21\uffff\1\132\4\uffff\1\136"+
        "\5\uffff\1\141\4\uffff\1\143\3\uffff\1\147\10\uffff";
    static final String DFA25_eofS =
        "\150\uffff";
    static final String DFA25_minS =
        "\1\41\4\uffff\1\43\2\uffff\1\45\2\72\1\uffff\1\52\1\145\2\uffff"+
        "\1\53\1\55\3\75\1\46\1\75\1\uffff\3\75\1\uffff\1\156\1\151\1\uffff"+
        "\1\162\1\157\4\uffff\1\75\6\uffff\1\45\6\uffff\1\164\5\uffff\1\52"+
        "\21\uffff\1\75\2\uffff\1\144\1\164\1\137\1\162\4\uffff\1\137\4\uffff"+
        "\1\137\1\141\2\uffff\1\137\10\uffff";
    static final String DFA25_maxS =
        "\1\176\4\uffff\1\43\2\uffff\1\75\2\76\1\uffff\1\56\1\157\2\uffff"+
        "\1\75\1\76\4\75\1\174\1\uffff\2\75\1\76\1\uffff\1\156\1\151\1\uffff"+
        "\1\162\1\157\4\uffff\1\75\6\uffff\1\45\6\uffff\1\164\5\uffff\1\52"+
        "\21\uffff\1\75\2\uffff\1\144\1\164\1\137\1\162\4\uffff\1\137\4\uffff"+
        "\1\137\1\157\2\uffff\1\137\10\uffff";
    static final String DFA25_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\uffff\1\7\1\10\3\uffff\1\17\2\uffff\1"+
        "\23\1\24\7\uffff\1\40\3\uffff\1\71\2\uffff\1\100\2\uffff\1\6\1\5"+
        "\1\11\1\13\1\uffff\1\63\1\43\1\12\1\25\1\20\1\14\1\uffff\1\51\1"+
        "\34\1\21\1\27\1\26\1\22\1\uffff\1\45\1\67\1\30\1\46\1\70\1\uffff"+
        "\1\31\1\47\1\32\1\50\1\33\1\52\1\35\1\53\1\65\1\36\1\54\1\66\1\37"+
        "\1\62\1\41\1\61\1\42\1\uffff\1\64\1\44\4\uffff\1\57\1\55\1\16\1"+
        "\15\1\uffff\1\72\1\73\1\60\1\56\2\uffff\1\104\1\103\1\uffff\1\102"+
        "\1\101\1\75\1\74\1\76\1\77\1\106\1\105";
    static final String DFA25_specialS =
        "\150\uffff}>";
    static final String[] DFA25_transitionS = {
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

    static final short[] DFA25_eot = DFA.unpackEncodedString(DFA25_eotS);
    static final short[] DFA25_eof = DFA.unpackEncodedString(DFA25_eofS);
    static final char[] DFA25_min = DFA.unpackEncodedStringToUnsignedChars(DFA25_minS);
    static final char[] DFA25_max = DFA.unpackEncodedStringToUnsignedChars(DFA25_maxS);
    static final short[] DFA25_accept = DFA.unpackEncodedString(DFA25_acceptS);
    static final short[] DFA25_special = DFA.unpackEncodedString(DFA25_specialS);
    static final short[][] DFA25_transition;

    static {
        int numStates = DFA25_transitionS.length;
        DFA25_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA25_transition[i] = DFA.unpackEncodedString(DFA25_transitionS[i]);
        }
    }

    class DFA25 extends DFA {

        public DFA25(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 25;
            this.eot = DFA25_eot;
            this.eof = DFA25_eof;
            this.min = DFA25_min;
            this.max = DFA25_max;
            this.accept = DFA25_accept;
            this.special = DFA25_special;
            this.transition = DFA25_transition;
        }
        public String getDescription() {
            return "2497:19: ( '{' | '}' | '[' | ']' | '#' | '##' | '(' | ')' | '<:' | ':>' | '<%' | '%>' | '%:' | '%:%:' | ';' | ':' | '...' | 'new' | 'delete' | '?' | '::' | '.' | '.*' | '+' | '-' | '*' | '/' | '%' | '^' | '&' | '|' | '~' | '!' | '=' | '<' | '>' | '+=' | '-=' | '*=' | '/=' | '%=' | '^=' | '&=' | '|=' | '<<' | '>>' | '<<=' | '>>=' | '==' | '!=' | '<=' | '>=' | '&&' | '||' | '++' | '--' | ',' | '->*' | '->' | 'and' | 'and_eq' | 'bitand' | 'bitor' | 'compl' | 'not' | 'not_eq' | 'or' | 'or_eq' | 'xor' | 'xor_eq' )";
        }
    }
    static final String DFA38_eotS =
        "\1\uffff\1\70\1\uffff\1\72\1\73\1\103\1\uffff\2\66\1\70\2\114\3"+
        "\136\1\70\20\136\13\uffff\2\70\6\uffff\2\136\7\uffff\1\u0091\20"+
        "\uffff\4\114\1\uffff\2\121\4\114\1\121\5\136\1\uffff\24\136\1\u00c7"+
        "\5\136\1\u00c7\4\136\1\70\15\136\3\uffff\1\136\2\uffff\1\u00eb\6"+
        "\uffff\16\114\2\136\1\u00c7\2\136\1\u00c7\6\136\1\u00c7\1\136\1"+
        "\70\1\136\1\u00c7\1\136\1\70\15\136\1\uffff\7\136\1\u00c7\30\136"+
        "\1\70\5\uffff\7\114\3\136\1\u013d\1\136\1\u00c7\10\136\1\u00c7\1"+
        "\136\1\u00c7\3\136\1\u00c7\1\136\1\u00c7\11\136\2\u00c7\3\136\1"+
        "\u00c7\1\136\1\u00c7\23\136\1\u00c7\4\136\5\114\1\u013d\1\u00c7"+
        "\1\136\1\uffff\2\136\1\u00c7\11\136\1\u00c7\1\136\1\70\1\u00c7\2"+
        "\136\2\u00c7\1\136\1\70\13\136\1\70\6\136\1\u00c7\5\136\1\u00c7"+
        "\1\136\1\u00c7\3\136\1\u00c7\1\136\2\114\1\u00c7\3\136\1\u00c7\4"+
        "\136\1\70\2\136\2\70\7\136\2\u00c7\2\136\3\u00c7\4\136\1\u00c7\2"+
        "\136\6\u00c7\4\136\1\70\2\136\1\u00c7\1\136\1\u01c4\2\136\2\u00c7"+
        "\6\136\1\u00c7\2\136\1\u00c7\1\136\1\u00c7\5\136\1\u00c7\1\136\2"+
        "\u00c7\1\136\1\u00c7\1\uffff\1\136\3\u00c7\2\136\2\u00c7\1\136\2"+
        "\u00c7\1\136\1\u00c7\3\136\2\u00c7\1\136\2\u00c7\2\136\1\u00c7\4"+
        "\136\1\u00c7\10\136\3\u00c7\3\136\1\u00c7\2\136\1\u00c7";
    static final String DFA38_eofS =
        "\u01f4\uffff";
    static final String DFA38_minS =
        "\1\0\1\75\1\uffff\1\11\1\12\1\43\1\uffff\2\0\3\56\24\60\13\uffff"+
        "\1\52\1\101\6\uffff\2\60\7\uffff\1\11\1\146\1\154\6\uffff\1\42\1"+
        "\0\1\uffff\1\42\1\0\3\uffff\4\56\1\uffff\2\60\4\56\6\60\1\uffff"+
        "\55\60\3\uffff\1\60\2\uffff\1\144\1\uffff\1\151\2\uffff\2\0\6\56"+
        "\2\53\6\56\40\60\1\uffff\41\60\5\uffff\7\56\100\60\5\56\3\60\1\uffff"+
        "\66\60\2\56\116\60\1\uffff\57\60";
    static final String DFA38_maxS =
        "\1\uffff\1\75\1\uffff\1\40\1\12\1\165\1\uffff\2\uffff\6\172\1\71"+
        "\20\172\13\uffff\1\57\1\172\6\uffff\2\172\7\uffff\1\40\1\156\1\162"+
        "\6\uffff\1\165\1\uffff\1\uffff\1\165\1\uffff\3\uffff\4\172\1\uffff"+
        "\2\146\4\172\1\71\5\172\1\uffff\55\172\3\uffff\1\172\2\uffff\1\156"+
        "\1\uffff\1\163\2\uffff\2\uffff\56\172\1\uffff\41\172\5\uffff\117"+
        "\172\1\uffff\u0086\172\1\uffff\57\172";
    static final String DFA38_acceptS =
        "\2\uffff\1\2\3\uffff\1\15\31\uffff\13\32\2\uffff\6\32\2\uffff\1"+
        "\41\1\42\1\1\1\32\1\2\1\3\1\41\3\uffff\1\14\1\16\1\17\1\21\1\22"+
        "\1\15\2\uffff\1\23\2\uffff\2\23\1\24\4\uffff\1\27\14\uffff\1\33"+
        "\55\uffff\1\37\1\40\1\34\1\uffff\1\1\1\4\1\uffff\1\13\1\uffff\1"+
        "\12\1\20\60\uffff\1\31\41\uffff\1\6\1\7\1\5\1\10\1\11\117\uffff"+
        "\1\25\u0086\uffff\1\26\57\uffff";
    static final String DFA38_specialS =
        "\1\4\6\uffff\1\0\1\3\75\uffff\1\2\2\uffff\1\6\115\uffff\1\1\1\5"+
        "\u015b\uffff}>";
    static final String[] DFA38_transitionS = {
            "\11\66\1\65\1\3\2\66\1\4\22\66\1\65\1\60\1\7\1\5\1\66\1\45\1"+
            "\55\1\10\1\2\1\6\1\52\1\50\1\62\1\51\1\17\1\53\1\13\11\12\1"+
            "\44\1\46\1\11\1\1\1\61\1\47\1\66\32\64\1\42\1\66\1\43\1\54\1"+
            "\64\1\66\1\20\1\21\1\22\1\23\1\24\1\14\1\25\1\64\1\26\2\64\1"+
            "\27\1\30\1\16\1\31\1\32\1\64\1\33\1\34\1\15\1\35\1\36\1\37\1"+
            "\63\2\64\1\40\1\56\1\41\1\57\uff81\66",
            "\1\67",
            "",
            "\2\73\2\uffff\1\73\22\uffff\1\73",
            "\1\74",
            "\1\70\100\uffff\1\77\1\76\3\uffff\1\75\2\uffff\1\101\3\uffff"+
            "\1\102\4\uffff\1\100",
            "",
            "\42\106\1\107\71\106\1\105\uffa3\106",
            "\47\111\1\112\64\111\1\110\uffa3\111",
            "\1\113\22\uffff\32\113\6\uffff\32\113",
            "\1\121\1\uffff\12\115\7\uffff\13\121\1\120\10\121\1\116\5\121"+
            "\4\uffff\1\121\1\uffff\13\121\1\117\10\121\1\116\5\121",
            "\1\121\1\uffff\10\124\2\130\7\uffff\13\121\1\127\10\121\1\125"+
            "\2\121\1\123\2\121\4\uffff\1\121\1\uffff\13\121\1\126\10\121"+
            "\1\125\2\121\1\122\2\121",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\1\131\12\135\1"+
            "\132\2\135\1\133\2\135\1\134\10\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\4\135\1\140\2"+
            "\135\1\141\11\135\1\137\6\135\1\142\1\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\1\144\3\135\1"+
            "\145\11\135\1\146\5\135\1\143\5\135",
            "\12\121",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\13\135\1\147\1"+
            "\135\1\152\4\135\1\150\1\135\1\151\5\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\10\135\1\155\5"+
            "\135\1\153\2\135\1\154\10\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\1\156\6\135\1"+
            "\157\3\135\1\160\2\135\1\161\13\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\4\135\1\162\11"+
            "\135\1\163\11\135\1\164\1\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\13\135\1\165\1"+
            "\135\1\166\11\135\1\167\2\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\16\135\1\170\13"+
            "\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\5\135\1\171\7"+
            "\135\1\172\14\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\16\135\1\173\13"+
            "\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\24\135\1\174\5"+
            "\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\17\135\1\175\1"+
            "\135\1\176\10\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\21\135\1\177\2"+
            "\135\1\u0080\5\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\4\135\1\u0081"+
            "\25\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\7\135\1\u0082"+
            "\1\u0083\12\135\1\u0084\2\135\1\u0085\3\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\15\135\1\u0086"+
            "\4\135\1\u0087\7\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\10\135\1\u0088"+
            "\5\135\1\u0089\13\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\2\135\1\u008a"+
            "\4\135\1\u008b\22\135",
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
            "\1\u008c\4\uffff\1\u008d",
            "\32\u008e\4\uffff\1\u008e\1\uffff\32\u008e",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\16\135\1\u008f"+
            "\13\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\32\135",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\2\73\2\uffff\1\73\22\uffff\1\73",
            "\1\u0092\7\uffff\1\u0093",
            "\1\u0094\1\uffff\1\u0095\3\uffff\1\u0096",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0097\4\uffff\1\u0097\64\uffff\1\u0097\5\uffff\1\u0097\3"+
            "\uffff\1\u0097\7\uffff\1\u0097\3\uffff\1\u0097\1\uffff\2\u0097",
            "\42\106\1\107\71\106\1\105\uffa3\106",
            "",
            "\1\u0098\4\uffff\1\u0098\64\uffff\1\u0098\5\uffff\1\u0098\3"+
            "\uffff\1\u0098\7\uffff\1\u0098\3\uffff\1\u0098\1\uffff\2\u0098",
            "\47\111\1\112\64\111\1\110\uffa3\111",
            "",
            "",
            "",
            "\1\121\1\uffff\12\115\7\uffff\13\121\1\120\10\121\1\116\5\121"+
            "\4\uffff\1\121\1\uffff\13\121\1\117\10\121\1\116\5\121",
            "\1\121\1\uffff\12\121\7\uffff\13\121\1\u009a\16\121\4\uffff"+
            "\1\121\1\uffff\13\121\1\u0099\16\121",
            "\1\121\1\uffff\12\121\7\uffff\24\121\1\u009c\5\121\4\uffff"+
            "\1\121\1\uffff\13\121\1\u009b\10\121\1\u009c\5\121",
            "\1\121\1\uffff\12\121\7\uffff\13\121\1\u009d\10\121\1\u009c"+
            "\5\121\4\uffff\1\121\1\uffff\24\121\1\u009c\5\121",
            "",
            "\12\u009e\7\uffff\4\u00a1\1\u00a0\1\u00a1\32\uffff\4\u00a1"+
            "\1\u009f\1\u00a1",
            "\12\u009e\7\uffff\4\u00a1\1\u00a0\1\u00a1\32\uffff\4\u00a1"+
            "\1\u009f\1\u00a1",
            "\1\121\1\uffff\10\124\2\130\7\uffff\13\121\1\127\10\121\1\125"+
            "\5\121\4\uffff\1\121\1\uffff\13\121\1\126\10\121\1\125\5\121",
            "\1\121\1\uffff\12\121\7\uffff\13\121\1\u00a3\16\121\4\uffff"+
            "\1\121\1\uffff\13\121\1\u00a2\16\121",
            "\1\121\1\uffff\12\121\7\uffff\24\121\1\u00a5\5\121\4\uffff"+
            "\1\121\1\uffff\13\121\1\u00a4\10\121\1\u00a5\5\121",
            "\1\121\1\uffff\12\121\7\uffff\13\121\1\u00a6\10\121\1\u00a5"+
            "\5\121\4\uffff\1\121\1\uffff\24\121\1\u00a5\5\121",
            "\12\130",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\13\135\1\u00a7"+
            "\16\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\16\135\1\u00a8"+
            "\13\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\21\135\1\u00a9"+
            "\10\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\10\135\1\u00aa"+
            "\21\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\32\135",
            "",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\24\135\1\u00ab"+
            "\3\135\1\u00ac\1\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\14\135\1\u00ad"+
            "\15\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\10\135\1\u00ae"+
            "\10\135\1\u00af\10\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\17\135\1\u00b0"+
            "\12\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\13\135\1\u00b1"+
            "\16\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\14\135\1\u00b2"+
            "\15\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\26\135\1\u00b3"+
            "\3\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\4\135\1\u00b4"+
            "\16\135\1\u00b5\6\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\10\135\1\u00b6"+
            "\21\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\14\135\1\u00b7"+
            "\15\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\23\135\1\u00b8"+
            "\6\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\3\135\1\u00b9"+
            "\26\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\16\135\1\u00ba"+
            "\13\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\4\135\1\u00bb"+
            "\25\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\23\135\1\u00bc"+
            "\6\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\22\135\1\u00bd"+
            "\1\u00be\6\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\1\u00bf\31\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\1\u00c0\31\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\14\135\1\u00c2"+
            "\1\u00c1\14\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\2\135\1\u00c3"+
            "\2\135\1\u00c4\5\135\1\u00c5\16\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\24\135\1\u00c6"+
            "\5\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\15\135\1\u00c8"+
            "\14\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\22\135\1\u00c9"+
            "\7\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\24\135\1\u00ca"+
            "\5\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\17\135\1\u00cb"+
            "\3\135\1\u00cc\6\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\23\135\1\u00cd"+
            "\6\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\32\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\13\135\1\u00ce"+
            "\7\135\1\u00cf\6\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\15\135\1\u00d0"+
            "\14\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\23\135\1\u00d1"+
            "\6\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\4\135\1\u00d2"+
            "\25\135",
            "\12\135\7\uffff\32\135\4\uffff\1\u00d3\1\uffff\32\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\10\135\1\u00d4"+
            "\5\135\1\u00d5\13\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\1\135\1\u00d6"+
            "\30\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\6\135\1\u00d7"+
            "\1\135\1\u00d8\12\135\1\u00d9\6\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\16\135\1\u00da"+
            "\13\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\6\135\1\u00db"+
            "\22\135\1\u00dc",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\1\u00dd\20\135"+
            "\1\u00de\10\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\10\135\1\u00df"+
            "\21\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\10\135\1\u00e0"+
            "\11\135\1\u00e1\7\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\10\135\1\u00e2"+
            "\21\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\21\135\1\u00e3"+
            "\10\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\10\135\1\u00e4"+
            "\2\135\1\u00e5\16\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\7\135\1\u00e6"+
            "\22\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\10\135\1\u00e7"+
            "\21\135",
            "",
            "",
            "",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\21\135\1\u00e8"+
            "\10\135",
            "",
            "",
            "\1\u00e9\11\uffff\1\u00ea",
            "",
            "\1\u00ec\11\uffff\1\u00ed",
            "",
            "",
            "\42\106\1\107\71\106\1\105\uffa3\106",
            "\47\111\1\112\64\111\1\110\uffa3\111",
            "\1\121\1\uffff\12\121\7\uffff\32\121\4\uffff\1\121\1\uffff"+
            "\13\121\1\u00ee\16\121",
            "\1\121\1\uffff\12\121\7\uffff\13\121\1\u00ef\16\121\4\uffff"+
            "\1\121\1\uffff\32\121",
            "\1\121\1\uffff\12\121\7\uffff\24\121\1\u009c\5\121\4\uffff"+
            "\1\121\1\uffff\24\121\1\u009c\5\121",
            "\1\121\1\uffff\12\121\7\uffff\32\121\4\uffff\1\121\1\uffff"+
            "\32\121",
            "\1\121\1\uffff\12\121\7\uffff\24\121\1\u009c\5\121\4\uffff"+
            "\1\121\1\uffff\24\121\1\u009c\5\121",
            "\1\121\1\uffff\12\u009e\7\uffff\4\u00a1\1\u00a0\1\u00a1\5\121"+
            "\1\u00f2\10\121\1\u00f0\5\121\4\uffff\1\121\1\uffff\4\u00a1"+
            "\1\u009f\1\u00a1\5\121\1\u00f1\10\121\1\u00f0\5\121",
            "\1\121\1\uffff\2\121\1\uffff\12\u009e\7\uffff\4\u00a1\1\u00a0"+
            "\1\u00a1\5\121\1\u00f2\10\121\1\u00f0\5\121\4\uffff\1\121\1"+
            "\uffff\4\u00a1\1\u009f\1\u00a1\5\121\1\u00f1\10\121\1\u00f0"+
            "\5\121",
            "\1\121\1\uffff\2\121\1\uffff\12\u009e\7\uffff\4\u00a1\1\u00a0"+
            "\1\u00a1\5\121\1\u00f2\10\121\1\u00f0\5\121\4\uffff\1\121\1"+
            "\uffff\4\u00a1\1\u009f\1\u00a1\5\121\1\u00f1\10\121\1\u00f0"+
            "\5\121",
            "\1\121\1\uffff\12\u009e\7\uffff\4\u00a1\1\u00a0\1\u00a1\5\121"+
            "\1\u00f2\10\121\1\u00f0\5\121\4\uffff\1\121\1\uffff\4\u00a1"+
            "\1\u009f\1\u00a1\5\121\1\u00f1\10\121\1\u00f0\5\121",
            "\1\121\1\uffff\12\121\7\uffff\32\121\4\uffff\1\121\1\uffff"+
            "\13\121\1\u00f3\16\121",
            "\1\121\1\uffff\12\121\7\uffff\13\121\1\u00f4\16\121\4\uffff"+
            "\1\121\1\uffff\32\121",
            "\1\121\1\uffff\12\121\7\uffff\24\121\1\u00a5\5\121\4\uffff"+
            "\1\121\1\uffff\24\121\1\u00a5\5\121",
            "\1\121\1\uffff\12\121\7\uffff\32\121\4\uffff\1\121\1\uffff"+
            "\32\121",
            "\1\121\1\uffff\12\121\7\uffff\24\121\1\u00a5\5\121\4\uffff"+
            "\1\121\1\uffff\24\121\1\u00a5\5\121",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\22\135\1\u00f5"+
            "\7\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\1\u00f6\31\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\32\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\4\135\1\u00f7"+
            "\25\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\4\135\1\u00f8"+
            "\25\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\32\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\17\135\1\u00f9"+
            "\12\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\22\135\1\u00fa"+
            "\7\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\4\135\1\u00fb"+
            "\11\135\1\u00fc\13\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\4\135\1\u00fd"+
            "\25\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\13\135\1\u00fe"+
            "\16\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\4\135\1\u00ff"+
            "\25\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\32\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\27\135\1\u0100"+
            "\2\135",
            "\12\135\7\uffff\32\135\4\uffff\1\u0101\1\uffff\32\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\6\135\1\u0102"+
            "\23\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\32\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\16\135\1\u0103"+
            "\13\135",
            "\12\135\7\uffff\32\135\4\uffff\1\u0104\1\uffff\32\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\13\135\1\u0105"+
            "\16\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\1\u0106\31\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\1\u0107\15\135"+
            "\1\u0108\13\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\4\135\1\u0109"+
            "\25\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\2\135\1\u010a"+
            "\27\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\21\135\1\u010b"+
            "\10\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\22\135\1\u010c"+
            "\7\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\22\135\1\u010d"+
            "\1\u010e\6\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\17\135\1\u010f"+
            "\12\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\13\135\1\u0110"+
            "\16\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\1\u0111\31\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\4\135\1\u0112"+
            "\25\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\1\135\1\u0113"+
            "\30\135",
            "",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\1\u0114\31\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\4\135\1\u0115"+
            "\25\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\14\135\1\u0116"+
            "\15\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\13\135\1\u0117"+
            "\2\135\1\u0118\13\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\4\135\1\u0119"+
            "\25\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\16\135\1\u011a"+
            "\13\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\10\135\1\u011b"+
            "\21\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\32\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\6\135\1\u011c"+
            "\23\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\1\u011d\31\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\21\135\1\u011e"+
            "\10\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\4\135\1\u011f"+
            "\25\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\25\135\1\u0120"+
            "\4\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\23\135\1\u0121"+
            "\6\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\13\135\1\u0122"+
            "\16\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\10\135\1\u0123"+
            "\21\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\15\135\1\u0124"+
            "\14\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\24\135\1\u0125"+
            "\5\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\21\135\1\u0126"+
            "\10\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\15\135\1\u0127"+
            "\14\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\4\135\1\u0128"+
            "\25\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\23\135\1\u0129"+
            "\6\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\24\135\1\u012a"+
            "\5\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\23\135\1\u012b"+
            "\6\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\16\135\1\u012c"+
            "\13\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\10\135\1\u012d"+
            "\21\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\15\135\1\u012e"+
            "\14\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\23\135\1\u012f"+
            "\6\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\3\135\1\u0130"+
            "\26\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\1\u0131\31\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\1\u0132\31\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\13\135\1\u0133"+
            "\16\135",
            "\12\135\7\uffff\32\135\4\uffff\1\u0134\1\uffff\32\135",
            "",
            "",
            "",
            "",
            "",
            "\1\121\1\uffff\12\121\7\uffff\32\121\4\uffff\1\121\1\uffff"+
            "\32\121",
            "\1\121\1\uffff\12\121\7\uffff\32\121\4\uffff\1\121\1\uffff"+
            "\32\121",
            "\1\121\1\uffff\12\121\7\uffff\13\121\1\u0136\16\121\4\uffff"+
            "\1\121\1\uffff\13\121\1\u0135\16\121",
            "\1\121\1\uffff\12\121\7\uffff\24\121\1\u0138\5\121\4\uffff"+
            "\1\121\1\uffff\13\121\1\u0137\10\121\1\u0138\5\121",
            "\1\121\1\uffff\12\121\7\uffff\13\121\1\u0139\10\121\1\u0138"+
            "\5\121\4\uffff\1\121\1\uffff\24\121\1\u0138\5\121",
            "\1\121\1\uffff\12\121\7\uffff\32\121\4\uffff\1\121\1\uffff"+
            "\32\121",
            "\1\121\1\uffff\12\121\7\uffff\32\121\4\uffff\1\121\1\uffff"+
            "\32\121",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\4\135\1\u013a"+
            "\25\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\23\135\1\u013b"+
            "\6\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\15\135\1\u013c"+
            "\14\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\32\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\13\135\1\u013e"+
            "\16\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\32\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\1\u013f\31\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\26\135\1\u0140"+
            "\3\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\3\135\1\u0141"+
            "\4\135\1\u0142\4\135\1\u0143\14\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\17\135\1\u0144"+
            "\12\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\22\135\1\u0145"+
            "\7\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\2\135\1\u0146"+
            "\27\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\4\135\1\u0147"+
            "\25\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\15\135\1\u0148"+
            "\14\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\32\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\4\135\1\u0149"+
            "\25\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\32\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\12\135\1\u014a"+
            "\17\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\15\135\1\u014b"+
            "\14\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\21\135\1\u014c"+
            "\10\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\32\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\7\135\1\u014d"+
            "\22\135",
            "\1\135\1\u014e\1\135\1\u014f\6\135\7\uffff\32\135\4\uffff\1"+
            "\135\1\uffff\32\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\22\135\1\u0150"+
            "\7\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\23\135\1\u0151"+
            "\6\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\10\135\1\u0152"+
            "\21\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\13\135\1\u0153"+
            "\16\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\23\135\1\u0154"+
            "\6\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\24\135\1\u0155"+
            "\5\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\23\135\1\u0156"+
            "\6\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\13\135\1\u0157"+
            "\16\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\14\135\1\u0158"+
            "\15\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\32\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\32\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\10\135\1\u0159"+
            "\21\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\21\135\1\u015a"+
            "\10\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\21\135\1\u015b"+
            "\10\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\32\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\15\135\1\u015c"+
            "\14\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\32\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\1\135\1\u015d"+
            "\30\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\1\u015e\31\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\20\135\1\u015f"+
            "\11\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\1\u0160\31\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\4\135\1\u0161"+
            "\25\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\10\135\1\u0162"+
            "\21\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\22\135\1\u0163"+
            "\7\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\23\135\1\u0164"+
            "\6\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\21\135\1\u0165"+
            "\10\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\23\135\1\u0166"+
            "\6\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\4\135\1\u0167"+
            "\25\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\16\135\1\u0168"+
            "\13\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\10\135\1\u0169"+
            "\21\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\2\135\1\u016a"+
            "\27\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\2\135\1\u016b"+
            "\27\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\15\135\1\u016c"+
            "\14\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\6\135\1\u016d"+
            "\23\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\6\135\1\u016e"+
            "\23\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\24\135\1\u016f"+
            "\5\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\32\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\23\135\1\u0170"+
            "\6\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\21\135\1\u0171"+
            "\10\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\4\135\1\u0172"+
            "\25\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\4\135\1\u0173"+
            "\25\135",
            "\1\121\1\uffff\12\121\7\uffff\32\121\4\uffff\1\121\1\uffff"+
            "\13\121\1\u0174\16\121",
            "\1\121\1\uffff\12\121\7\uffff\13\121\1\u0175\16\121\4\uffff"+
            "\1\121\1\uffff\32\121",
            "\1\121\1\uffff\12\121\7\uffff\24\121\1\u0138\5\121\4\uffff"+
            "\1\121\1\uffff\24\121\1\u0138\5\121",
            "\1\121\1\uffff\12\121\7\uffff\32\121\4\uffff\1\121\1\uffff"+
            "\32\121",
            "\1\121\1\uffff\12\121\7\uffff\24\121\1\u0138\5\121\4\uffff"+
            "\1\121\1\uffff\24\121\1\u0138\5\121",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\32\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\32\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\3\135\1\u0176"+
            "\26\135",
            "",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\1\u0177\31\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\3\135\1\u0178"+
            "\26\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\32\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\4\135\1\u0179"+
            "\25\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\3\135\1\u017a"+
            "\26\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\1\u017b\31\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\23\135\1\u017c"+
            "\6\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\17\135\1\u017d"+
            "\12\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\4\135\1\u017e"+
            "\25\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\20\135\1\u017f"+
            "\11\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\1\u0180\15\135"+
            "\1\u0181\13\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\20\135\1\u0182"+
            "\11\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\32\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\3\135\1\u0183"+
            "\26\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\32\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\32\135",
            "\6\135\1\u0184\3\135\7\uffff\32\135\4\uffff\1\135\1\uffff\32"+
            "\135",
            "\2\135\1\u0185\7\135\7\uffff\32\135\4\uffff\1\135\1\uffff\32"+
            "\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\32\135",
            "\12\135\7\uffff\32\135\4\uffff\1\u0187\1\uffff\4\135\1\u0186"+
            "\25\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\15\135\1\u0188"+
            "\14\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\32\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\30\135\1\u0189"+
            "\1\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\13\135\1\u018a"+
            "\16\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\4\135\1\u018b"+
            "\25\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\4\135\1\u018c"+
            "\25\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\10\135\1\u018d"+
            "\21\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\2\135\1\u018e"+
            "\27\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\23\135\1\u018f"+
            "\6\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\15\135\1\u0190"+
            "\14\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\4\135\1\u0191"+
            "\25\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\13\135\1\u0192"+
            "\16\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\23\135\1\u0193"+
            "\6\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\32\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\23\135\1\u0194"+
            "\6\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\2\135\1\u0195"+
            "\27\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\2\135\1\u0196"+
            "\27\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\23\135\1\u0197"+
            "\6\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\4\135\1\u0198"+
            "\25\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\15\135\1\u0199"+
            "\14\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\32\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\3\135\1\u019a"+
            "\26\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\5\135\1\u019b"+
            "\24\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\2\135\1\u019c"+
            "\27\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\23\135\1\u019d"+
            "\6\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\7\135\1\u019e"+
            "\22\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\32\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\15\135\1\u019f"+
            "\14\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\32\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\1\u01a0\31\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\10\135\1\u01a1"+
            "\21\135",
            "\12\135\7\uffff\32\135\4\uffff\1\u01a2\1\uffff\32\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\32\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\20\135\1\u01a3"+
            "\11\135",
            "\1\121\1\uffff\12\121\7\uffff\32\121\4\uffff\1\121\1\uffff"+
            "\32\121",
            "\1\121\1\uffff\12\121\7\uffff\32\121\4\uffff\1\121\1\uffff"+
            "\32\121",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\32\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\23\135\1\u01a4"+
            "\6\135",
            "\12\135\7\uffff\32\135\4\uffff\1\u01a5\1\uffff\32\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\5\135\1\u01a6"+
            "\24\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\32\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\14\135\1\u01a7"+
            "\15\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\21\135\1\u01a8"+
            "\10\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\1\u01a9\31\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\17\135\1\u01aa"+
            "\12\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\32\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\22\135\1\u01ab"+
            "\7\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\5\135\1\u01ac"+
            "\24\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\32\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\32\135",
            "\12\135\7\uffff\32\135\4\uffff\1\u01ad\1\uffff\32\135",
            "\12\135\7\uffff\32\135\4\uffff\1\u01ae\1\uffff\32\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\27\135\1\u01af"+
            "\2\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\2\135\1\u01b0"+
            "\27\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\24\135\1\u01b1"+
            "\5\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\17\135\1\u01b2"+
            "\12\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\23\135\1\u01b3"+
            "\6\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\32\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\32\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\2\135\1\u01b4"+
            "\27\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\10\135\1\u01b5"+
            "\21\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\32\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\32\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\32\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\4\135\1\u01b6"+
            "\25\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\16\135\1\u01b7"+
            "\13\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\4\135\1\u01b8"+
            "\25\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\23\135\1\u01b9"+
            "\6\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\32\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\4\135\1\u01ba"+
            "\25\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\21\135\1\u01bb"+
            "\10\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\32\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\32\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\32\135",
            "\12\135\7\uffff\32\135\4\uffff\1\u01bc\1\uffff\32\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\32\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\32\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\4\135\1\u01bd"+
            "\25\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\13\135\1\u01be"+
            "\16\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\13\135\1\u01bf"+
            "\16\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\23\135\1\u01c0"+
            "\6\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\32\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\4\135\1\u01c1"+
            "\25\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\13\135\1\u01c2"+
            "\16\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\32\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\4\135\1\u01c3"+
            "\25\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\32\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\2\135\1\u01c5"+
            "\27\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\23\135\1\u01c6"+
            "\6\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\32\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\32\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\23\135\1\u01c7"+
            "\6\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\23\135\1\u01c8"+
            "\6\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\17\135\1\u01c9"+
            "\12\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\1\u01ca\31\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\4\135\1\u01cb"+
            "\25\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\4\135\1\u01cc"+
            "\25\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\32\135",
            "\12\135\7\uffff\32\135\4\uffff\1\u01cd\1\uffff\32\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\23\135\1\u01ce"+
            "\6\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\32\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\21\135\1\u01cf"+
            "\10\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\32\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\4\135\1\u01d0"+
            "\25\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\21\135\1\u01d1"+
            "\10\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\17\135\1\u01d2"+
            "\12\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\1\u01d3\1\135"+
            "\1\u01d4\27\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\3\135\1\u01d5"+
            "\26\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\32\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\4\135\1\u01d6"+
            "\25\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\32\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\32\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\16\135\1\u01d7"+
            "\13\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\32\135",
            "",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\4\135\1\u01d8"+
            "\25\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\32\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\32\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\32\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\21\135\1\u01d9"+
            "\10\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\22\135\1\u01da"+
            "\7\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\32\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\32\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\2\135\1\u01db"+
            "\27\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\32\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\32\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\3\135\1\u01dc"+
            "\26\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\32\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\21\135\1\u01dd"+
            "\10\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\22\135\1\u01de"+
            "\7\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\1\u01df\31\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\32\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\32\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\2\135\1\u01e0"+
            "\27\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\32\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\32\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\23\135\1\u01e1"+
            "\6\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\1\u01e2\31\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\32\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\4\135\1\u01e3"+
            "\25\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\22\135\1\u01e4"+
            "\7\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\22\135\1\u01e5"+
            "\7\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\1\u01e6\31\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\32\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\22\135\1\u01e7"+
            "\7\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\23\135\1\u01e8"+
            "\6\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\4\135\1\u01e9"+
            "\25\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\23\135\1\u01ea"+
            "\6\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\13\135\1\u01eb"+
            "\16\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\23\135\1\u01ec"+
            "\6\135",
            "\12\135\7\uffff\32\135\4\uffff\1\u01ed\1\uffff\32\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\21\135\1\u01ee"+
            "\10\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\32\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\32\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\32\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\2\135\1\u01ef"+
            "\27\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\23\135\1\u01f0"+
            "\6\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\1\u01f1\31\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\32\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\22\135\1\u01f2"+
            "\7\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\23\135\1\u01f3"+
            "\6\135",
            "\12\135\7\uffff\32\135\4\uffff\1\135\1\uffff\32\135"
    };

    static final short[] DFA38_eot = DFA.unpackEncodedString(DFA38_eotS);
    static final short[] DFA38_eof = DFA.unpackEncodedString(DFA38_eofS);
    static final char[] DFA38_min = DFA.unpackEncodedStringToUnsignedChars(DFA38_minS);
    static final char[] DFA38_max = DFA.unpackEncodedStringToUnsignedChars(DFA38_maxS);
    static final short[] DFA38_accept = DFA.unpackEncodedString(DFA38_acceptS);
    static final short[] DFA38_special = DFA.unpackEncodedString(DFA38_specialS);
    static final short[][] DFA38_transition;

    static {
        int numStates = DFA38_transitionS.length;
        DFA38_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA38_transition[i] = DFA.unpackEncodedString(DFA38_transitionS[i]);
        }
    }

    class DFA38 extends DFA {

        public DFA38(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 38;
            this.eot = DFA38_eot;
            this.eof = DFA38_eof;
            this.min = DFA38_min;
            this.max = DFA38_max;
            this.accept = DFA38_accept;
            this.special = DFA38_special;
            this.transition = DFA38_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | RULE_HEADERNAME | RULE_INTEGERLITERAL | RULE_BOOLEANLITERAL | RULE_POINTERLITERAL | RULE_PPNUMBER | RULE_LITERAL | RULE_KEYWORD | RULE_PPOPORPUNC | RULE_IDENTIFIER | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA38_7 = input.LA(1);

                        s = -1;
                        if ( (LA38_7=='\\') ) {s = 69;}

                        else if ( ((LA38_7>='\u0000' && LA38_7<='!')||(LA38_7>='#' && LA38_7<='[')||(LA38_7>=']' && LA38_7<='\uFFFF')) ) {s = 70;}

                        else if ( (LA38_7=='\"') ) {s = 71;}

                        else s = 54;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA38_151 = input.LA(1);

                        s = -1;
                        if ( (LA38_151=='\"') ) {s = 71;}

                        else if ( (LA38_151=='\\') ) {s = 69;}

                        else if ( ((LA38_151>='\u0000' && LA38_151<='!')||(LA38_151>='#' && LA38_151<='[')||(LA38_151>=']' && LA38_151<='\uFFFF')) ) {s = 70;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA38_70 = input.LA(1);

                        s = -1;
                        if ( (LA38_70=='\"') ) {s = 71;}

                        else if ( (LA38_70=='\\') ) {s = 69;}

                        else if ( ((LA38_70>='\u0000' && LA38_70<='!')||(LA38_70>='#' && LA38_70<='[')||(LA38_70>=']' && LA38_70<='\uFFFF')) ) {s = 70;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA38_8 = input.LA(1);

                        s = -1;
                        if ( (LA38_8=='\\') ) {s = 72;}

                        else if ( ((LA38_8>='\u0000' && LA38_8<='&')||(LA38_8>='(' && LA38_8<='[')||(LA38_8>=']' && LA38_8<='\uFFFF')) ) {s = 73;}

                        else if ( (LA38_8=='\'') ) {s = 74;}

                        else s = 54;

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA38_0 = input.LA(1);

                        s = -1;
                        if ( (LA38_0=='=') ) {s = 1;}

                        else if ( (LA38_0=='(') ) {s = 2;}

                        else if ( (LA38_0=='\n') ) {s = 3;}

                        else if ( (LA38_0=='\r') ) {s = 4;}

                        else if ( (LA38_0=='#') ) {s = 5;}

                        else if ( (LA38_0==')') ) {s = 6;}

                        else if ( (LA38_0=='\"') ) {s = 7;}

                        else if ( (LA38_0=='\'') ) {s = 8;}

                        else if ( (LA38_0=='<') ) {s = 9;}

                        else if ( ((LA38_0>='1' && LA38_0<='9')) ) {s = 10;}

                        else if ( (LA38_0=='0') ) {s = 11;}

                        else if ( (LA38_0=='f') ) {s = 12;}

                        else if ( (LA38_0=='t') ) {s = 13;}

                        else if ( (LA38_0=='n') ) {s = 14;}

                        else if ( (LA38_0=='.') ) {s = 15;}

                        else if ( (LA38_0=='a') ) {s = 16;}

                        else if ( (LA38_0=='b') ) {s = 17;}

                        else if ( (LA38_0=='c') ) {s = 18;}

                        else if ( (LA38_0=='d') ) {s = 19;}

                        else if ( (LA38_0=='e') ) {s = 20;}

                        else if ( (LA38_0=='g') ) {s = 21;}

                        else if ( (LA38_0=='i') ) {s = 22;}

                        else if ( (LA38_0=='l') ) {s = 23;}

                        else if ( (LA38_0=='m') ) {s = 24;}

                        else if ( (LA38_0=='o') ) {s = 25;}

                        else if ( (LA38_0=='p') ) {s = 26;}

                        else if ( (LA38_0=='r') ) {s = 27;}

                        else if ( (LA38_0=='s') ) {s = 28;}

                        else if ( (LA38_0=='u') ) {s = 29;}

                        else if ( (LA38_0=='v') ) {s = 30;}

                        else if ( (LA38_0=='w') ) {s = 31;}

                        else if ( (LA38_0=='{') ) {s = 32;}

                        else if ( (LA38_0=='}') ) {s = 33;}

                        else if ( (LA38_0=='[') ) {s = 34;}

                        else if ( (LA38_0==']') ) {s = 35;}

                        else if ( (LA38_0==':') ) {s = 36;}

                        else if ( (LA38_0=='%') ) {s = 37;}

                        else if ( (LA38_0==';') ) {s = 38;}

                        else if ( (LA38_0=='?') ) {s = 39;}

                        else if ( (LA38_0=='+') ) {s = 40;}

                        else if ( (LA38_0=='-') ) {s = 41;}

                        else if ( (LA38_0=='*') ) {s = 42;}

                        else if ( (LA38_0=='/') ) {s = 43;}

                        else if ( (LA38_0=='^') ) {s = 44;}

                        else if ( (LA38_0=='&') ) {s = 45;}

                        else if ( (LA38_0=='|') ) {s = 46;}

                        else if ( (LA38_0=='~') ) {s = 47;}

                        else if ( (LA38_0=='!') ) {s = 48;}

                        else if ( (LA38_0=='>') ) {s = 49;}

                        else if ( (LA38_0==',') ) {s = 50;}

                        else if ( (LA38_0=='x') ) {s = 51;}

                        else if ( ((LA38_0>='A' && LA38_0<='Z')||LA38_0=='_'||LA38_0=='h'||(LA38_0>='j' && LA38_0<='k')||LA38_0=='q'||(LA38_0>='y' && LA38_0<='z')) ) {s = 52;}

                        else if ( (LA38_0=='\t'||LA38_0==' ') ) {s = 53;}

                        else if ( ((LA38_0>='\u0000' && LA38_0<='\b')||(LA38_0>='\u000B' && LA38_0<='\f')||(LA38_0>='\u000E' && LA38_0<='\u001F')||LA38_0=='$'||LA38_0=='@'||LA38_0=='\\'||LA38_0=='`'||(LA38_0>='\u007F' && LA38_0<='\uFFFF')) ) {s = 54;}

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA38_152 = input.LA(1);

                        s = -1;
                        if ( (LA38_152=='\'') ) {s = 74;}

                        else if ( (LA38_152=='\\') ) {s = 72;}

                        else if ( ((LA38_152>='\u0000' && LA38_152<='&')||(LA38_152>='(' && LA38_152<='[')||(LA38_152>=']' && LA38_152<='\uFFFF')) ) {s = 73;}

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA38_73 = input.LA(1);

                        s = -1;
                        if ( (LA38_73=='\'') ) {s = 74;}

                        else if ( (LA38_73=='\\') ) {s = 72;}

                        else if ( ((LA38_73>='\u0000' && LA38_73<='&')||(LA38_73>='(' && LA38_73<='[')||(LA38_73>=']' && LA38_73<='\uFFFF')) ) {s = 73;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 38, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}