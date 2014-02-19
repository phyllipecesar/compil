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
    public static final int RULE_ID=10;
    public static final int RULE_STRING=12;
    public static final int RULE_KEYWORD=5;
    public static final int RULE_ANY_OTHER=16;
    public static final int RULE_INTEGERLITERAL=7;
    public static final int RULE_INT=11;
    public static final int RULE_IDENTIFIER=9;
    public static final int RULE_PPOPORPUNC=6;
    public static final int RULE_PPNUMBER=4;
    public static final int RULE_WS=15;
    public static final int RULE_LITERAL=8;
    public static final int RULE_SL_COMMENT=14;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=13;

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

    // $ANTLR start "RULE_INTEGERLITERAL"
    public final void mRULE_INTEGERLITERAL() throws RecognitionException {
        try {
            int _type = RULE_INTEGERLITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:170:21: ( ( '1' .. '9' ( '0' .. '9' )* ( ( 'u' | 'U' ) ( 'l' | 'L' | 'll' | 'LL' )? | ( 'l' | 'L' | 'll' | 'LL' ) ( 'u' | 'U' )? )? | '0' ( '0' .. '7' )* ( ( 'u' | 'U' ) ( 'l' | 'L' | 'll' | 'LL' )? | ( 'l' | 'L' | 'll' | 'LL' ) ( 'u' | 'U' )? )? | ( '0x' | '0X' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+ ( ( 'u' | 'U' ) ( 'l' | 'L' | 'll' | 'LL' )? | ( 'l' | 'L' | 'll' | 'LL' ) ( 'u' | 'U' )? )? ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:170:23: ( '1' .. '9' ( '0' .. '9' )* ( ( 'u' | 'U' ) ( 'l' | 'L' | 'll' | 'LL' )? | ( 'l' | 'L' | 'll' | 'LL' ) ( 'u' | 'U' )? )? | '0' ( '0' .. '7' )* ( ( 'u' | 'U' ) ( 'l' | 'L' | 'll' | 'LL' )? | ( 'l' | 'L' | 'll' | 'LL' ) ( 'u' | 'U' )? )? | ( '0x' | '0X' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+ ( ( 'u' | 'U' ) ( 'l' | 'L' | 'll' | 'LL' )? | ( 'l' | 'L' | 'll' | 'LL' ) ( 'u' | 'U' )? )? )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:170:23: ( '1' .. '9' ( '0' .. '9' )* ( ( 'u' | 'U' ) ( 'l' | 'L' | 'll' | 'LL' )? | ( 'l' | 'L' | 'll' | 'LL' ) ( 'u' | 'U' )? )? | '0' ( '0' .. '7' )* ( ( 'u' | 'U' ) ( 'l' | 'L' | 'll' | 'LL' )? | ( 'l' | 'L' | 'll' | 'LL' ) ( 'u' | 'U' )? )? | ( '0x' | '0X' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+ ( ( 'u' | 'U' ) ( 'l' | 'L' | 'll' | 'LL' )? | ( 'l' | 'L' | 'll' | 'LL' ) ( 'u' | 'U' )? )? )
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
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:170:24: '1' .. '9' ( '0' .. '9' )* ( ( 'u' | 'U' ) ( 'l' | 'L' | 'll' | 'LL' )? | ( 'l' | 'L' | 'll' | 'LL' ) ( 'u' | 'U' )? )?
                    {
                    matchRange('1','9'); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:170:33: ( '0' .. '9' )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:170:34: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:170:45: ( ( 'u' | 'U' ) ( 'l' | 'L' | 'll' | 'LL' )? | ( 'l' | 'L' | 'll' | 'LL' ) ( 'u' | 'U' )? )?
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
                            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:170:46: ( 'u' | 'U' ) ( 'l' | 'L' | 'll' | 'LL' )?
                            {
                            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}

                            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:170:56: ( 'l' | 'L' | 'll' | 'LL' )?
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
                                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:170:57: 'l'
                                    {
                                    match('l'); 

                                    }
                                    break;
                                case 2 :
                                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:170:61: 'L'
                                    {
                                    match('L'); 

                                    }
                                    break;
                                case 3 :
                                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:170:65: 'll'
                                    {
                                    match("ll"); 


                                    }
                                    break;
                                case 4 :
                                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:170:70: 'LL'
                                    {
                                    match("LL"); 


                                    }
                                    break;

                            }


                            }
                            break;
                        case 2 :
                            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:170:77: ( 'l' | 'L' | 'll' | 'LL' ) ( 'u' | 'U' )?
                            {
                            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:170:77: ( 'l' | 'L' | 'll' | 'LL' )
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
                                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:170:78: 'l'
                                    {
                                    match('l'); 

                                    }
                                    break;
                                case 2 :
                                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:170:82: 'L'
                                    {
                                    match('L'); 

                                    }
                                    break;
                                case 3 :
                                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:170:86: 'll'
                                    {
                                    match("ll"); 


                                    }
                                    break;
                                case 4 :
                                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:170:91: 'LL'
                                    {
                                    match("LL"); 


                                    }
                                    break;

                            }

                            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:170:97: ( 'u' | 'U' )?
                            int alt4=2;
                            int LA4_0 = input.LA(1);

                            if ( (LA4_0=='U'||LA4_0=='u') ) {
                                alt4=1;
                            }
                            switch (alt4) {
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
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:170:110: '0' ( '0' .. '7' )* ( ( 'u' | 'U' ) ( 'l' | 'L' | 'll' | 'LL' )? | ( 'l' | 'L' | 'll' | 'LL' ) ( 'u' | 'U' )? )?
                    {
                    match('0'); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:170:114: ( '0' .. '7' )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( ((LA6_0>='0' && LA6_0<='7')) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:170:115: '0' .. '7'
                    	    {
                    	    matchRange('0','7'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:170:126: ( ( 'u' | 'U' ) ( 'l' | 'L' | 'll' | 'LL' )? | ( 'l' | 'L' | 'll' | 'LL' ) ( 'u' | 'U' )? )?
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
                            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:170:127: ( 'u' | 'U' ) ( 'l' | 'L' | 'll' | 'LL' )?
                            {
                            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}

                            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:170:137: ( 'l' | 'L' | 'll' | 'LL' )?
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
                                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:170:138: 'l'
                                    {
                                    match('l'); 

                                    }
                                    break;
                                case 2 :
                                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:170:142: 'L'
                                    {
                                    match('L'); 

                                    }
                                    break;
                                case 3 :
                                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:170:146: 'll'
                                    {
                                    match("ll"); 


                                    }
                                    break;
                                case 4 :
                                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:170:151: 'LL'
                                    {
                                    match("LL"); 


                                    }
                                    break;

                            }


                            }
                            break;
                        case 2 :
                            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:170:158: ( 'l' | 'L' | 'll' | 'LL' ) ( 'u' | 'U' )?
                            {
                            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:170:158: ( 'l' | 'L' | 'll' | 'LL' )
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
                                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:170:159: 'l'
                                    {
                                    match('l'); 

                                    }
                                    break;
                                case 2 :
                                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:170:163: 'L'
                                    {
                                    match('L'); 

                                    }
                                    break;
                                case 3 :
                                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:170:167: 'll'
                                    {
                                    match("ll"); 


                                    }
                                    break;
                                case 4 :
                                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:170:172: 'LL'
                                    {
                                    match("LL"); 


                                    }
                                    break;

                            }

                            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:170:178: ( 'u' | 'U' )?
                            int alt9=2;
                            int LA9_0 = input.LA(1);

                            if ( (LA9_0=='U'||LA9_0=='u') ) {
                                alt9=1;
                            }
                            switch (alt9) {
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
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:170:191: ( '0x' | '0X' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+ ( ( 'u' | 'U' ) ( 'l' | 'L' | 'll' | 'LL' )? | ( 'l' | 'L' | 'll' | 'LL' ) ( 'u' | 'U' )? )?
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:170:191: ( '0x' | '0X' )
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
                            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:170:192: '0x'
                            {
                            match("0x"); 


                            }
                            break;
                        case 2 :
                            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:170:197: '0X'
                            {
                            match("0X"); 


                            }
                            break;

                    }

                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:170:203: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+
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
                    	    if ( cnt12 >= 1 ) break loop12;
                                EarlyExitException eee =
                                    new EarlyExitException(12, input);
                                throw eee;
                        }
                        cnt12++;
                    } while (true);

                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:170:233: ( ( 'u' | 'U' ) ( 'l' | 'L' | 'll' | 'LL' )? | ( 'l' | 'L' | 'll' | 'LL' ) ( 'u' | 'U' )? )?
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
                            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:170:234: ( 'u' | 'U' ) ( 'l' | 'L' | 'll' | 'LL' )?
                            {
                            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}

                            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:170:244: ( 'l' | 'L' | 'll' | 'LL' )?
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
                                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:170:245: 'l'
                                    {
                                    match('l'); 

                                    }
                                    break;
                                case 2 :
                                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:170:249: 'L'
                                    {
                                    match('L'); 

                                    }
                                    break;
                                case 3 :
                                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:170:253: 'll'
                                    {
                                    match("ll"); 


                                    }
                                    break;
                                case 4 :
                                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:170:258: 'LL'
                                    {
                                    match("LL"); 


                                    }
                                    break;

                            }


                            }
                            break;
                        case 2 :
                            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:170:265: ( 'l' | 'L' | 'll' | 'LL' ) ( 'u' | 'U' )?
                            {
                            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:170:265: ( 'l' | 'L' | 'll' | 'LL' )
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
                                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:170:266: 'l'
                                    {
                                    match('l'); 

                                    }
                                    break;
                                case 2 :
                                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:170:270: 'L'
                                    {
                                    match('L'); 

                                    }
                                    break;
                                case 3 :
                                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:170:274: 'll'
                                    {
                                    match("ll"); 


                                    }
                                    break;
                                case 4 :
                                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:170:279: 'LL'
                                    {
                                    match("LL"); 


                                    }
                                    break;

                            }

                            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:170:285: ( 'u' | 'U' )?
                            int alt15=2;
                            int LA15_0 = input.LA(1);

                            if ( (LA15_0=='U'||LA15_0=='u') ) {
                                alt15=1;
                            }
                            switch (alt15) {
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

    // $ANTLR start "RULE_PPNUMBER"
    public final void mRULE_PPNUMBER() throws RecognitionException {
        try {
            int _type = RULE_PPNUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:172:15: ( ( '0' .. '9' | '.' '0' .. '9' ) ( '0' .. '9' | ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) | 'e' ( '+' | '-' ) | 'E' ( '+' | '-' ) | '.' )* )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:172:17: ( '0' .. '9' | '.' '0' .. '9' ) ( '0' .. '9' | ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) | 'e' ( '+' | '-' ) | 'E' ( '+' | '-' ) | '.' )*
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:172:17: ( '0' .. '9' | '.' '0' .. '9' )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>='0' && LA18_0<='9')) ) {
                alt18=1;
            }
            else if ( (LA18_0=='.') ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:172:18: '0' .. '9'
                    {
                    matchRange('0','9'); 

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:172:27: '.' '0' .. '9'
                    {
                    match('.'); 
                    matchRange('0','9'); 

                    }
                    break;

            }

            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:172:41: ( '0' .. '9' | ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) | 'e' ( '+' | '-' ) | 'E' ( '+' | '-' ) | '.' )*
            loop19:
            do {
                int alt19=6;
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
                    alt19=1;
                    }
                    break;
                case 'e':
                    {
                    int LA19_3 = input.LA(2);

                    if ( (LA19_3=='+'||LA19_3=='-') ) {
                        alt19=3;
                    }

                    else {
                        alt19=2;
                    }

                    }
                    break;
                case 'E':
                    {
                    int LA19_4 = input.LA(2);

                    if ( (LA19_4=='+'||LA19_4=='-') ) {
                        alt19=4;
                    }

                    else {
                        alt19=2;
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
                    alt19=2;
                    }
                    break;
                case '.':
                    {
                    alt19=5;
                    }
                    break;

                }

                switch (alt19) {
            	case 1 :
            	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:172:42: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;
            	case 2 :
            	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:172:51: ( 'a' .. 'z' | 'A' .. 'Z' | '_' )
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
            	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:172:75: 'e' ( '+' | '-' )
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
            	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:172:89: 'E' ( '+' | '-' )
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
            	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:172:103: '.'
            	    {
            	    match('.'); 

            	    }
            	    break;

            	default :
            	    break loop19;
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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:174:14: ( RULE_INTEGERLITERAL )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:174:16: RULE_INTEGERLITERAL
            {
            mRULE_INTEGERLITERAL(); 

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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:176:14: ( ( 'alignas' | 'alignof' | 'asm' | 'auto' | 'bool' | 'break' | 'case' | 'catch' | 'char' | 'char16_t' | 'char32_t' | 'class' | 'const' | 'constexpr' | 'const_cast' | 'continue' | 'decltype' | 'default' | 'delete' | 'do' | 'double' | 'dynamic_cast' | 'else' | 'enum' | 'explicit' | 'export' | 'extern' | 'false' | 'float' | 'for' | 'friend' | 'goto' | 'if' | 'inline' | 'int' | 'long' | 'mutable' | 'namespace' | 'new' | 'noexcept' | 'nullptr' | 'operator' | 'private' | 'protected' | 'public' | 'register' | 'reinterpret_cast' | 'return' | 'short' | 'signed' | 'sizeof' | 'static' | 'static_assert' | 'static_cast' | 'struct' | 'switch' | 'template' | 'this' | 'thread_local' | 'throw' | 'true' | 'try' | 'typedef' | 'typeid' | 'typename' | 'union' | 'unsigned' | 'using' | 'virtual' | 'void' | 'volatile' | 'wchar_t' | 'while' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:176:16: ( 'alignas' | 'alignof' | 'asm' | 'auto' | 'bool' | 'break' | 'case' | 'catch' | 'char' | 'char16_t' | 'char32_t' | 'class' | 'const' | 'constexpr' | 'const_cast' | 'continue' | 'decltype' | 'default' | 'delete' | 'do' | 'double' | 'dynamic_cast' | 'else' | 'enum' | 'explicit' | 'export' | 'extern' | 'false' | 'float' | 'for' | 'friend' | 'goto' | 'if' | 'inline' | 'int' | 'long' | 'mutable' | 'namespace' | 'new' | 'noexcept' | 'nullptr' | 'operator' | 'private' | 'protected' | 'public' | 'register' | 'reinterpret_cast' | 'return' | 'short' | 'signed' | 'sizeof' | 'static' | 'static_assert' | 'static_cast' | 'struct' | 'switch' | 'template' | 'this' | 'thread_local' | 'throw' | 'true' | 'try' | 'typedef' | 'typeid' | 'typename' | 'union' | 'unsigned' | 'using' | 'virtual' | 'void' | 'volatile' | 'wchar_t' | 'while' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:176:16: ( 'alignas' | 'alignof' | 'asm' | 'auto' | 'bool' | 'break' | 'case' | 'catch' | 'char' | 'char16_t' | 'char32_t' | 'class' | 'const' | 'constexpr' | 'const_cast' | 'continue' | 'decltype' | 'default' | 'delete' | 'do' | 'double' | 'dynamic_cast' | 'else' | 'enum' | 'explicit' | 'export' | 'extern' | 'false' | 'float' | 'for' | 'friend' | 'goto' | 'if' | 'inline' | 'int' | 'long' | 'mutable' | 'namespace' | 'new' | 'noexcept' | 'nullptr' | 'operator' | 'private' | 'protected' | 'public' | 'register' | 'reinterpret_cast' | 'return' | 'short' | 'signed' | 'sizeof' | 'static' | 'static_assert' | 'static_cast' | 'struct' | 'switch' | 'template' | 'this' | 'thread_local' | 'throw' | 'true' | 'try' | 'typedef' | 'typeid' | 'typename' | 'union' | 'unsigned' | 'using' | 'virtual' | 'void' | 'volatile' | 'wchar_t' | 'while' )
            int alt20=73;
            alt20 = dfa20.predict(input);
            switch (alt20) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:176:17: 'alignas'
                    {
                    match("alignas"); 


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:176:27: 'alignof'
                    {
                    match("alignof"); 


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:176:37: 'asm'
                    {
                    match("asm"); 


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:176:43: 'auto'
                    {
                    match("auto"); 


                    }
                    break;
                case 5 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:176:50: 'bool'
                    {
                    match("bool"); 


                    }
                    break;
                case 6 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:176:57: 'break'
                    {
                    match("break"); 


                    }
                    break;
                case 7 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:176:65: 'case'
                    {
                    match("case"); 


                    }
                    break;
                case 8 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:176:72: 'catch'
                    {
                    match("catch"); 


                    }
                    break;
                case 9 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:176:80: 'char'
                    {
                    match("char"); 


                    }
                    break;
                case 10 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:176:87: 'char16_t'
                    {
                    match("char16_t"); 


                    }
                    break;
                case 11 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:176:98: 'char32_t'
                    {
                    match("char32_t"); 


                    }
                    break;
                case 12 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:176:109: 'class'
                    {
                    match("class"); 


                    }
                    break;
                case 13 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:176:117: 'const'
                    {
                    match("const"); 


                    }
                    break;
                case 14 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:176:125: 'constexpr'
                    {
                    match("constexpr"); 


                    }
                    break;
                case 15 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:176:137: 'const_cast'
                    {
                    match("const_cast"); 


                    }
                    break;
                case 16 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:176:150: 'continue'
                    {
                    match("continue"); 


                    }
                    break;
                case 17 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:176:161: 'decltype'
                    {
                    match("decltype"); 


                    }
                    break;
                case 18 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:176:172: 'default'
                    {
                    match("default"); 


                    }
                    break;
                case 19 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:176:182: 'delete'
                    {
                    match("delete"); 


                    }
                    break;
                case 20 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:176:191: 'do'
                    {
                    match("do"); 


                    }
                    break;
                case 21 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:176:196: 'double'
                    {
                    match("double"); 


                    }
                    break;
                case 22 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:176:205: 'dynamic_cast'
                    {
                    match("dynamic_cast"); 


                    }
                    break;
                case 23 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:176:220: 'else'
                    {
                    match("else"); 


                    }
                    break;
                case 24 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:176:227: 'enum'
                    {
                    match("enum"); 


                    }
                    break;
                case 25 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:176:234: 'explicit'
                    {
                    match("explicit"); 


                    }
                    break;
                case 26 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:176:245: 'export'
                    {
                    match("export"); 


                    }
                    break;
                case 27 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:176:254: 'extern'
                    {
                    match("extern"); 


                    }
                    break;
                case 28 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:176:263: 'false'
                    {
                    match("false"); 


                    }
                    break;
                case 29 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:176:271: 'float'
                    {
                    match("float"); 


                    }
                    break;
                case 30 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:176:279: 'for'
                    {
                    match("for"); 


                    }
                    break;
                case 31 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:176:285: 'friend'
                    {
                    match("friend"); 


                    }
                    break;
                case 32 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:176:294: 'goto'
                    {
                    match("goto"); 


                    }
                    break;
                case 33 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:176:301: 'if'
                    {
                    match("if"); 


                    }
                    break;
                case 34 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:176:306: 'inline'
                    {
                    match("inline"); 


                    }
                    break;
                case 35 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:176:315: 'int'
                    {
                    match("int"); 


                    }
                    break;
                case 36 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:176:321: 'long'
                    {
                    match("long"); 


                    }
                    break;
                case 37 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:176:328: 'mutable'
                    {
                    match("mutable"); 


                    }
                    break;
                case 38 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:176:338: 'namespace'
                    {
                    match("namespace"); 


                    }
                    break;
                case 39 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:176:350: 'new'
                    {
                    match("new"); 


                    }
                    break;
                case 40 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:176:356: 'noexcept'
                    {
                    match("noexcept"); 


                    }
                    break;
                case 41 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:176:367: 'nullptr'
                    {
                    match("nullptr"); 


                    }
                    break;
                case 42 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:176:377: 'operator'
                    {
                    match("operator"); 


                    }
                    break;
                case 43 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:176:388: 'private'
                    {
                    match("private"); 


                    }
                    break;
                case 44 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:176:398: 'protected'
                    {
                    match("protected"); 


                    }
                    break;
                case 45 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:176:410: 'public'
                    {
                    match("public"); 


                    }
                    break;
                case 46 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:176:419: 'register'
                    {
                    match("register"); 


                    }
                    break;
                case 47 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:176:430: 'reinterpret_cast'
                    {
                    match("reinterpret_cast"); 


                    }
                    break;
                case 48 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:176:449: 'return'
                    {
                    match("return"); 


                    }
                    break;
                case 49 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:176:458: 'short'
                    {
                    match("short"); 


                    }
                    break;
                case 50 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:176:466: 'signed'
                    {
                    match("signed"); 


                    }
                    break;
                case 51 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:176:475: 'sizeof'
                    {
                    match("sizeof"); 


                    }
                    break;
                case 52 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:176:484: 'static'
                    {
                    match("static"); 


                    }
                    break;
                case 53 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:176:493: 'static_assert'
                    {
                    match("static_assert"); 


                    }
                    break;
                case 54 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:176:509: 'static_cast'
                    {
                    match("static_cast"); 


                    }
                    break;
                case 55 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:176:523: 'struct'
                    {
                    match("struct"); 


                    }
                    break;
                case 56 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:176:532: 'switch'
                    {
                    match("switch"); 


                    }
                    break;
                case 57 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:176:541: 'template'
                    {
                    match("template"); 


                    }
                    break;
                case 58 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:176:552: 'this'
                    {
                    match("this"); 


                    }
                    break;
                case 59 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:176:559: 'thread_local'
                    {
                    match("thread_local"); 


                    }
                    break;
                case 60 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:176:574: 'throw'
                    {
                    match("throw"); 


                    }
                    break;
                case 61 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:176:582: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 62 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:176:589: 'try'
                    {
                    match("try"); 


                    }
                    break;
                case 63 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:176:595: 'typedef'
                    {
                    match("typedef"); 


                    }
                    break;
                case 64 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:176:605: 'typeid'
                    {
                    match("typeid"); 


                    }
                    break;
                case 65 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:176:614: 'typename'
                    {
                    match("typename"); 


                    }
                    break;
                case 66 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:176:625: 'union'
                    {
                    match("union"); 


                    }
                    break;
                case 67 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:176:633: 'unsigned'
                    {
                    match("unsigned"); 


                    }
                    break;
                case 68 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:176:644: 'using'
                    {
                    match("using"); 


                    }
                    break;
                case 69 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:176:652: 'virtual'
                    {
                    match("virtual"); 


                    }
                    break;
                case 70 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:176:662: 'void'
                    {
                    match("void"); 


                    }
                    break;
                case 71 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:176:669: 'volatile'
                    {
                    match("volatile"); 


                    }
                    break;
                case 72 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:176:680: 'wchar_t'
                    {
                    match("wchar_t"); 


                    }
                    break;
                case 73 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:176:690: 'while'
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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:178:17: ( ( '{' | '}' | '[' | ']' | '#' | '##' | '(' | ')' | '<:' | ':>' | '<%' | '%>' | '%:' | '%:%:' | ';' | ':' | '...' | 'new' | 'delete' | '?' | '::' | '.' | '.*' | '+' | '-' | '*' | '/' | '%' | '^' | '&' | '|' | '~' | '!' | '=' | '<' | '>' | '+=' | '-=' | '*=' | '/=' | '%=' | '^=' | '&=' | '|=' | '<<' | '>>' | '<<=' | '>>=' | '==' | '!=' | '<=' | '>=' | '&&' | '||' | '++' | '--' | ',' | '->*' | '->' | 'and' | 'and_eq' | 'bitand' | 'bitor' | 'compl' | 'not' | 'not_eq' | 'or' | 'or_eq' | 'xor' | 'xor_eq' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:178:19: ( '{' | '}' | '[' | ']' | '#' | '##' | '(' | ')' | '<:' | ':>' | '<%' | '%>' | '%:' | '%:%:' | ';' | ':' | '...' | 'new' | 'delete' | '?' | '::' | '.' | '.*' | '+' | '-' | '*' | '/' | '%' | '^' | '&' | '|' | '~' | '!' | '=' | '<' | '>' | '+=' | '-=' | '*=' | '/=' | '%=' | '^=' | '&=' | '|=' | '<<' | '>>' | '<<=' | '>>=' | '==' | '!=' | '<=' | '>=' | '&&' | '||' | '++' | '--' | ',' | '->*' | '->' | 'and' | 'and_eq' | 'bitand' | 'bitor' | 'compl' | 'not' | 'not_eq' | 'or' | 'or_eq' | 'xor' | 'xor_eq' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:178:19: ( '{' | '}' | '[' | ']' | '#' | '##' | '(' | ')' | '<:' | ':>' | '<%' | '%>' | '%:' | '%:%:' | ';' | ':' | '...' | 'new' | 'delete' | '?' | '::' | '.' | '.*' | '+' | '-' | '*' | '/' | '%' | '^' | '&' | '|' | '~' | '!' | '=' | '<' | '>' | '+=' | '-=' | '*=' | '/=' | '%=' | '^=' | '&=' | '|=' | '<<' | '>>' | '<<=' | '>>=' | '==' | '!=' | '<=' | '>=' | '&&' | '||' | '++' | '--' | ',' | '->*' | '->' | 'and' | 'and_eq' | 'bitand' | 'bitor' | 'compl' | 'not' | 'not_eq' | 'or' | 'or_eq' | 'xor' | 'xor_eq' )
            int alt21=70;
            alt21 = dfa21.predict(input);
            switch (alt21) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:178:20: '{'
                    {
                    match('{'); 

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:178:24: '}'
                    {
                    match('}'); 

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:178:28: '['
                    {
                    match('['); 

                    }
                    break;
                case 4 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:178:32: ']'
                    {
                    match(']'); 

                    }
                    break;
                case 5 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:178:36: '#'
                    {
                    match('#'); 

                    }
                    break;
                case 6 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:178:40: '##'
                    {
                    match("##"); 


                    }
                    break;
                case 7 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:178:45: '('
                    {
                    match('('); 

                    }
                    break;
                case 8 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:178:49: ')'
                    {
                    match(')'); 

                    }
                    break;
                case 9 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:178:53: '<:'
                    {
                    match("<:"); 


                    }
                    break;
                case 10 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:178:58: ':>'
                    {
                    match(":>"); 


                    }
                    break;
                case 11 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:178:63: '<%'
                    {
                    match("<%"); 


                    }
                    break;
                case 12 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:178:68: '%>'
                    {
                    match("%>"); 


                    }
                    break;
                case 13 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:178:73: '%:'
                    {
                    match("%:"); 


                    }
                    break;
                case 14 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:178:78: '%:%:'
                    {
                    match("%:%:"); 


                    }
                    break;
                case 15 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:178:85: ';'
                    {
                    match(';'); 

                    }
                    break;
                case 16 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:178:89: ':'
                    {
                    match(':'); 

                    }
                    break;
                case 17 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:178:93: '...'
                    {
                    match("..."); 


                    }
                    break;
                case 18 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:178:99: 'new'
                    {
                    match("new"); 


                    }
                    break;
                case 19 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:178:105: 'delete'
                    {
                    match("delete"); 


                    }
                    break;
                case 20 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:178:114: '?'
                    {
                    match('?'); 

                    }
                    break;
                case 21 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:178:118: '::'
                    {
                    match("::"); 


                    }
                    break;
                case 22 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:178:123: '.'
                    {
                    match('.'); 

                    }
                    break;
                case 23 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:178:127: '.*'
                    {
                    match(".*"); 


                    }
                    break;
                case 24 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:178:132: '+'
                    {
                    match('+'); 

                    }
                    break;
                case 25 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:178:136: '-'
                    {
                    match('-'); 

                    }
                    break;
                case 26 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:178:140: '*'
                    {
                    match('*'); 

                    }
                    break;
                case 27 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:178:144: '/'
                    {
                    match('/'); 

                    }
                    break;
                case 28 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:178:148: '%'
                    {
                    match('%'); 

                    }
                    break;
                case 29 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:178:152: '^'
                    {
                    match('^'); 

                    }
                    break;
                case 30 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:178:156: '&'
                    {
                    match('&'); 

                    }
                    break;
                case 31 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:178:160: '|'
                    {
                    match('|'); 

                    }
                    break;
                case 32 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:178:164: '~'
                    {
                    match('~'); 

                    }
                    break;
                case 33 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:178:168: '!'
                    {
                    match('!'); 

                    }
                    break;
                case 34 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:178:172: '='
                    {
                    match('='); 

                    }
                    break;
                case 35 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:178:176: '<'
                    {
                    match('<'); 

                    }
                    break;
                case 36 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:178:180: '>'
                    {
                    match('>'); 

                    }
                    break;
                case 37 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:178:184: '+='
                    {
                    match("+="); 


                    }
                    break;
                case 38 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:178:189: '-='
                    {
                    match("-="); 


                    }
                    break;
                case 39 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:178:194: '*='
                    {
                    match("*="); 


                    }
                    break;
                case 40 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:178:199: '/='
                    {
                    match("/="); 


                    }
                    break;
                case 41 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:178:204: '%='
                    {
                    match("%="); 


                    }
                    break;
                case 42 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:178:209: '^='
                    {
                    match("^="); 


                    }
                    break;
                case 43 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:178:214: '&='
                    {
                    match("&="); 


                    }
                    break;
                case 44 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:178:219: '|='
                    {
                    match("|="); 


                    }
                    break;
                case 45 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:178:224: '<<'
                    {
                    match("<<"); 


                    }
                    break;
                case 46 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:178:229: '>>'
                    {
                    match(">>"); 


                    }
                    break;
                case 47 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:178:234: '<<='
                    {
                    match("<<="); 


                    }
                    break;
                case 48 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:178:240: '>>='
                    {
                    match(">>="); 


                    }
                    break;
                case 49 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:178:246: '=='
                    {
                    match("=="); 


                    }
                    break;
                case 50 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:178:251: '!='
                    {
                    match("!="); 


                    }
                    break;
                case 51 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:178:256: '<='
                    {
                    match("<="); 


                    }
                    break;
                case 52 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:178:261: '>='
                    {
                    match(">="); 


                    }
                    break;
                case 53 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:178:266: '&&'
                    {
                    match("&&"); 


                    }
                    break;
                case 54 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:178:271: '||'
                    {
                    match("||"); 


                    }
                    break;
                case 55 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:178:276: '++'
                    {
                    match("++"); 


                    }
                    break;
                case 56 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:178:281: '--'
                    {
                    match("--"); 


                    }
                    break;
                case 57 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:178:286: ','
                    {
                    match(','); 

                    }
                    break;
                case 58 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:178:290: '->*'
                    {
                    match("->*"); 


                    }
                    break;
                case 59 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:178:296: '->'
                    {
                    match("->"); 


                    }
                    break;
                case 60 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:178:301: 'and'
                    {
                    match("and"); 


                    }
                    break;
                case 61 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:178:307: 'and_eq'
                    {
                    match("and_eq"); 


                    }
                    break;
                case 62 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:178:316: 'bitand'
                    {
                    match("bitand"); 


                    }
                    break;
                case 63 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:178:325: 'bitor'
                    {
                    match("bitor"); 


                    }
                    break;
                case 64 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:178:333: 'compl'
                    {
                    match("compl"); 


                    }
                    break;
                case 65 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:178:341: 'not'
                    {
                    match("not"); 


                    }
                    break;
                case 66 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:178:347: 'not_eq'
                    {
                    match("not_eq"); 


                    }
                    break;
                case 67 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:178:356: 'or'
                    {
                    match("or"); 


                    }
                    break;
                case 68 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:178:361: 'or_eq'
                    {
                    match("or_eq"); 


                    }
                    break;
                case 69 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:178:369: 'xor'
                    {
                    match("xor"); 


                    }
                    break;
                case 70 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:178:375: 'xor_eq'
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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:180:17: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( '0' .. '9' | 'A' .. 'Z' | 'a' .. 'z' | '_' )* )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:180:19: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( '0' .. '9' | 'A' .. 'Z' | 'a' .. 'z' | '_' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:180:43: ( '0' .. '9' | 'A' .. 'Z' | 'a' .. 'z' | '_' )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>='0' && LA22_0<='9')||(LA22_0>='A' && LA22_0<='Z')||LA22_0=='_'||(LA22_0>='a' && LA22_0<='z')) ) {
                    alt22=1;
                }


                switch (alt22) {
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
    // $ANTLR end "RULE_IDENTIFIER"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:182:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:182:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:182:11: ( '^' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0=='^') ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:182:11: '^'
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

            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:182:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>='0' && LA24_0<='9')||(LA24_0>='A' && LA24_0<='Z')||LA24_0=='_'||(LA24_0>='a' && LA24_0<='z')) ) {
                    alt24=1;
                }


                switch (alt24) {
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
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:184:10: ( ( '0' .. '9' )+ )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:184:12: ( '0' .. '9' )+
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:184:12: ( '0' .. '9' )+
            int cnt25=0;
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>='0' && LA25_0<='9')) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:184:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt25 >= 1 ) break loop25;
                        EarlyExitException eee =
                            new EarlyExitException(25, input);
                        throw eee;
                }
                cnt25++;
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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:186:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:186:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:186:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0=='\"') ) {
                alt28=1;
            }
            else if ( (LA28_0=='\'') ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:186:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:186:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop26:
                    do {
                        int alt26=3;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0=='\\') ) {
                            alt26=1;
                        }
                        else if ( ((LA26_0>='\u0000' && LA26_0<='!')||(LA26_0>='#' && LA26_0<='[')||(LA26_0>=']' && LA26_0<='\uFFFF')) ) {
                            alt26=2;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:186:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:186:66: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop26;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:186:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:186:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop27:
                    do {
                        int alt27=3;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0=='\\') ) {
                            alt27=1;
                        }
                        else if ( ((LA27_0>='\u0000' && LA27_0<='&')||(LA27_0>='(' && LA27_0<='[')||(LA27_0>=']' && LA27_0<='\uFFFF')) ) {
                            alt27=2;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:186:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:186:137: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop27;
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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:188:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:188:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:188:24: ( options {greedy=false; } : . )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0=='*') ) {
                    int LA29_1 = input.LA(2);

                    if ( (LA29_1=='/') ) {
                        alt29=2;
                    }
                    else if ( ((LA29_1>='\u0000' && LA29_1<='.')||(LA29_1>='0' && LA29_1<='\uFFFF')) ) {
                        alt29=1;
                    }


                }
                else if ( ((LA29_0>='\u0000' && LA29_0<=')')||(LA29_0>='+' && LA29_0<='\uFFFF')) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:188:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop29;
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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:190:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:190:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:190:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( ((LA30_0>='\u0000' && LA30_0<='\t')||(LA30_0>='\u000B' && LA30_0<='\f')||(LA30_0>='\u000E' && LA30_0<='\uFFFF')) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:190:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop30;
                }
            } while (true);

            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:190:40: ( ( '\\r' )? '\\n' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0=='\n'||LA32_0=='\r') ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:190:41: ( '\\r' )? '\\n'
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:190:41: ( '\\r' )?
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0=='\r') ) {
                        alt31=1;
                    }
                    switch (alt31) {
                        case 1 :
                            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:190:41: '\\r'
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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:192:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:192:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:192:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt33=0;
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( ((LA33_0>='\t' && LA33_0<='\n')||LA33_0=='\r'||LA33_0==' ') ) {
                    alt33=1;
                }


                switch (alt33) {
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
            	    if ( cnt33 >= 1 ) break loop33;
                        EarlyExitException eee =
                            new EarlyExitException(33, input);
                        throw eee;
                }
                cnt33++;
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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:194:16: ( . )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:194:18: .
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
        // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:8: ( RULE_INTEGERLITERAL | RULE_PPNUMBER | RULE_LITERAL | RULE_KEYWORD | RULE_PPOPORPUNC | RULE_IDENTIFIER | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt34=13;
        alt34 = dfa34.predict(input);
        switch (alt34) {
            case 1 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:10: RULE_INTEGERLITERAL
                {
                mRULE_INTEGERLITERAL(); 

                }
                break;
            case 2 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:30: RULE_PPNUMBER
                {
                mRULE_PPNUMBER(); 

                }
                break;
            case 3 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:44: RULE_LITERAL
                {
                mRULE_LITERAL(); 

                }
                break;
            case 4 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:57: RULE_KEYWORD
                {
                mRULE_KEYWORD(); 

                }
                break;
            case 5 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:70: RULE_PPOPORPUNC
                {
                mRULE_PPOPORPUNC(); 

                }
                break;
            case 6 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:86: RULE_IDENTIFIER
                {
                mRULE_IDENTIFIER(); 

                }
                break;
            case 7 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:102: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 8 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:110: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 9 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:119: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 10 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:131: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 11 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:147: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 12 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:163: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 13 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:171: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA20 dfa20 = new DFA20(this);
    protected DFA21 dfa21 = new DFA21(this);
    protected DFA34 dfa34 = new DFA34(this);
    static final String DFA20_eotS =
        "\36\uffff\1\107\100\uffff\1\153\14\uffff\1\165\11\uffff\1\170\4"+
        "\uffff";
    static final String DFA20_eofS =
        "\173\uffff";
    static final String DFA20_minS =
        "\1\141\1\154\1\157\1\141\1\145\1\154\1\141\1\uffff\1\146\2\uffff"+
        "\1\141\1\uffff\1\162\1\145\1\150\1\145\1\156\1\151\1\143\1\151\4"+
        "\uffff\1\163\1\141\1\uffff\1\156\1\143\1\165\3\uffff\1\160\5\uffff"+
        "\1\154\4\uffff\1\151\1\uffff\1\147\1\uffff\1\147\1\141\2\uffff\1"+
        "\151\1\165\1\160\1\151\2\uffff\1\151\2\uffff\1\147\2\uffff\1\162"+
        "\1\163\5\uffff\1\154\12\uffff\1\164\2\uffff\1\145\2\uffff\1\145"+
        "\4\uffff\1\156\1\61\1\164\3\uffff\1\151\2\uffff\1\144\1\141\3\uffff"+
        "\1\137\1\143\10\uffff\1\137\1\141\3\uffff";
    static final String DFA20_maxS =
        "\1\167\1\165\1\162\1\157\1\171\1\170\1\162\1\uffff\1\156\2\uffff"+
        "\1\165\1\uffff\1\165\1\145\1\167\1\171\1\163\1\157\1\150\1\151\4"+
        "\uffff\1\164\1\141\1\uffff\1\156\1\154\1\165\3\uffff\1\164\5\uffff"+
        "\1\164\4\uffff\1\157\1\uffff\1\164\1\uffff\1\172\1\162\2\uffff\1"+
        "\162\1\171\1\160\1\163\2\uffff\1\154\2\uffff\1\147\2\uffff\1\162"+
        "\1\164\5\uffff\1\157\12\uffff\1\164\2\uffff\1\157\2\uffff\1\145"+
        "\4\uffff\1\156\1\63\1\164\3\uffff\1\151\2\uffff\1\156\1\157\3\uffff"+
        "\1\145\1\143\10\uffff\1\137\1\143\3\uffff";
    static final String DFA20_acceptS =
        "\7\uffff\1\40\1\uffff\1\44\1\45\1\uffff\1\52\10\uffff\1\3\1\4\1"+
        "\5\1\6\2\uffff\1\14\3\uffff\1\26\1\27\1\30\1\uffff\1\34\1\35\1\36"+
        "\1\37\1\41\1\uffff\1\46\1\47\1\50\1\51\1\uffff\1\55\1\uffff\1\61"+
        "\2\uffff\1\70\1\71\4\uffff\1\104\1\105\1\uffff\1\110\1\111\1\uffff"+
        "\1\7\1\10\2\uffff\1\21\1\22\1\23\1\25\1\24\1\uffff\1\33\1\42\1\43"+
        "\1\53\1\54\1\56\1\57\1\60\1\62\1\63\1\uffff\1\67\1\72\1\uffff\1"+
        "\75\1\76\1\uffff\1\102\1\103\1\106\1\107\3\uffff\1\20\1\31\1\32"+
        "\1\uffff\1\73\1\74\2\uffff\1\12\1\13\1\11\2\uffff\1\77\1\100\1\101"+
        "\1\1\1\2\1\16\1\17\1\15\2\uffff\1\64\1\65\1\66";
    static final String DFA20_specialS =
        "\173\uffff}>";
    static final String[] DFA20_transitionS = {
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

    static final short[] DFA20_eot = DFA.unpackEncodedString(DFA20_eotS);
    static final short[] DFA20_eof = DFA.unpackEncodedString(DFA20_eofS);
    static final char[] DFA20_min = DFA.unpackEncodedStringToUnsignedChars(DFA20_minS);
    static final char[] DFA20_max = DFA.unpackEncodedStringToUnsignedChars(DFA20_maxS);
    static final short[] DFA20_accept = DFA.unpackEncodedString(DFA20_acceptS);
    static final short[] DFA20_special = DFA.unpackEncodedString(DFA20_specialS);
    static final short[][] DFA20_transition;

    static {
        int numStates = DFA20_transitionS.length;
        DFA20_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA20_transition[i] = DFA.unpackEncodedString(DFA20_transitionS[i]);
        }
    }

    class DFA20 extends DFA {

        public DFA20(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 20;
            this.eot = DFA20_eot;
            this.eof = DFA20_eof;
            this.min = DFA20_min;
            this.max = DFA20_max;
            this.accept = DFA20_accept;
            this.special = DFA20_special;
            this.transition = DFA20_transition;
        }
        public String getDescription() {
            return "176:16: ( 'alignas' | 'alignof' | 'asm' | 'auto' | 'bool' | 'break' | 'case' | 'catch' | 'char' | 'char16_t' | 'char32_t' | 'class' | 'const' | 'constexpr' | 'const_cast' | 'continue' | 'decltype' | 'default' | 'delete' | 'do' | 'double' | 'dynamic_cast' | 'else' | 'enum' | 'explicit' | 'export' | 'extern' | 'false' | 'float' | 'for' | 'friend' | 'goto' | 'if' | 'inline' | 'int' | 'long' | 'mutable' | 'namespace' | 'new' | 'noexcept' | 'nullptr' | 'operator' | 'private' | 'protected' | 'public' | 'register' | 'reinterpret_cast' | 'return' | 'short' | 'signed' | 'sizeof' | 'static' | 'static_assert' | 'static_cast' | 'struct' | 'switch' | 'template' | 'this' | 'thread_local' | 'throw' | 'true' | 'try' | 'typedef' | 'typeid' | 'typename' | 'union' | 'unsigned' | 'using' | 'virtual' | 'void' | 'volatile' | 'wchar_t' | 'while' )";
        }
    }
    static final String DFA21_eotS =
        "\5\uffff\1\42\2\uffff\1\47\1\52\1\56\1\uffff\1\61\3\uffff\1\66\1"+
        "\72\1\74\1\76\1\100\1\103\1\106\1\uffff\1\110\1\112\1\115\12\uffff"+
        "\1\123\6\uffff\1\125\14\uffff\1\130\21\uffff\1\132\4\uffff\1\136"+
        "\5\uffff\1\141\4\uffff\1\143\3\uffff\1\147\10\uffff";
    static final String DFA21_eofS =
        "\150\uffff";
    static final String DFA21_minS =
        "\1\41\4\uffff\1\43\2\uffff\1\45\2\72\1\uffff\1\52\1\145\2\uffff"+
        "\1\53\1\55\3\75\1\46\1\75\1\uffff\3\75\1\uffff\1\156\1\151\1\uffff"+
        "\1\162\1\157\4\uffff\1\75\6\uffff\1\45\6\uffff\1\164\5\uffff\1\52"+
        "\21\uffff\1\75\2\uffff\1\144\1\164\1\137\1\162\4\uffff\1\137\4\uffff"+
        "\1\137\1\141\2\uffff\1\137\10\uffff";
    static final String DFA21_maxS =
        "\1\176\4\uffff\1\43\2\uffff\1\75\2\76\1\uffff\1\56\1\157\2\uffff"+
        "\1\75\1\76\4\75\1\174\1\uffff\2\75\1\76\1\uffff\1\156\1\151\1\uffff"+
        "\1\162\1\157\4\uffff\1\75\6\uffff\1\45\6\uffff\1\164\5\uffff\1\52"+
        "\21\uffff\1\75\2\uffff\1\144\1\164\1\137\1\162\4\uffff\1\137\4\uffff"+
        "\1\137\1\157\2\uffff\1\137\10\uffff";
    static final String DFA21_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\uffff\1\7\1\10\3\uffff\1\17\2\uffff\1"+
        "\23\1\24\7\uffff\1\40\3\uffff\1\71\2\uffff\1\100\2\uffff\1\6\1\5"+
        "\1\11\1\13\1\uffff\1\63\1\43\1\12\1\25\1\20\1\14\1\uffff\1\51\1"+
        "\34\1\21\1\27\1\26\1\22\1\uffff\1\45\1\67\1\30\1\46\1\70\1\uffff"+
        "\1\31\1\47\1\32\1\50\1\33\1\52\1\35\1\53\1\65\1\36\1\54\1\66\1\37"+
        "\1\62\1\41\1\61\1\42\1\uffff\1\64\1\44\4\uffff\1\57\1\55\1\16\1"+
        "\15\1\uffff\1\72\1\73\1\60\1\56\2\uffff\1\104\1\103\1\uffff\1\102"+
        "\1\101\1\75\1\74\1\76\1\77\1\106\1\105";
    static final String DFA21_specialS =
        "\150\uffff}>";
    static final String[] DFA21_transitionS = {
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

    static final short[] DFA21_eot = DFA.unpackEncodedString(DFA21_eotS);
    static final short[] DFA21_eof = DFA.unpackEncodedString(DFA21_eofS);
    static final char[] DFA21_min = DFA.unpackEncodedStringToUnsignedChars(DFA21_minS);
    static final char[] DFA21_max = DFA.unpackEncodedStringToUnsignedChars(DFA21_maxS);
    static final short[] DFA21_accept = DFA.unpackEncodedString(DFA21_acceptS);
    static final short[] DFA21_special = DFA.unpackEncodedString(DFA21_specialS);
    static final short[][] DFA21_transition;

    static {
        int numStates = DFA21_transitionS.length;
        DFA21_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA21_transition[i] = DFA.unpackEncodedString(DFA21_transitionS[i]);
        }
    }

    class DFA21 extends DFA {

        public DFA21(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 21;
            this.eot = DFA21_eot;
            this.eof = DFA21_eof;
            this.min = DFA21_min;
            this.max = DFA21_max;
            this.accept = DFA21_accept;
            this.special = DFA21_special;
            this.transition = DFA21_transition;
        }
        public String getDescription() {
            return "178:19: ( '{' | '}' | '[' | ']' | '#' | '##' | '(' | ')' | '<:' | ':>' | '<%' | '%>' | '%:' | '%:%:' | ';' | ':' | '...' | 'new' | 'delete' | '?' | '::' | '.' | '.*' | '+' | '-' | '*' | '/' | '%' | '^' | '&' | '|' | '~' | '!' | '=' | '<' | '>' | '+=' | '-=' | '*=' | '/=' | '%=' | '^=' | '&=' | '|=' | '<<' | '>>' | '<<=' | '>>=' | '==' | '!=' | '<=' | '>=' | '&&' | '||' | '++' | '--' | ',' | '->*' | '->' | 'and' | 'and_eq' | 'bitand' | 'bitor' | 'compl' | 'not' | 'not_eq' | 'or' | 'or_eq' | 'xor' | 'xor_eq' )";
        }
    }
    static final String DFA34_eotS =
        "\1\uffff\2\71\1\102\23\110\17\uffff\2\102\7\uffff\2\110\2\64\2\uffff"+
        "\4\71\2\uffff\2\72\2\71\1\72\2\71\1\uffff\5\110\1\uffff\10\110\1"+
        "\u009b\11\110\1\u009b\10\110\1\102\21\110\3\uffff\1\110\2\uffff"+
        "\16\71\1\110\1\u009b\1\110\1\102\15\110\1\uffff\7\110\1\u009b\3"+
        "\110\1\u009b\3\110\1\u009b\1\110\1\102\23\110\1\u009b\11\110\1\102"+
        "\7\71\1\110\1\u009b\1\110\1\u009b\3\110\1\u009b\1\110\1\u009b\11"+
        "\110\2\u009b\6\110\1\u009b\1\110\1\u009b\24\110\1\u009b\2\110\1"+
        "\u009b\5\110\1\u009b\4\110\5\71\2\110\1\u009b\1\110\1\102\1\u009b"+
        "\2\110\2\u009b\1\110\1\102\10\110\2\u009b\10\110\1\102\6\110\1\u009b"+
        "\7\110\1\u009b\3\110\1\u009b\1\110\1\u009b\3\110\1\u009b\1\110\2"+
        "\71\2\110\2\102\7\110\2\u009b\2\110\4\u009b\3\110\1\102\4\110\1"+
        "\u009b\2\110\6\u009b\3\110\1\u009b\5\110\1\102\2\u009b\6\110\1\u009b"+
        "\2\110\1\u009b\2\110\1\u009b\1\110\1\u009b\6\110\1\u009b\2\110\1"+
        "\u009b\1\110\3\u009b\2\110\2\u009b\1\110\1\u009b\1\110\2\u009b\1"+
        "\110\1\u009b\3\110\1\u009b\1\110\4\u009b\2\110\2\u009b\4\110\1\u009b"+
        "\10\110\1\u009b\1\110\1\u009b\2\110\1\u009b\1\110\1\u009b\2\110"+
        "\1\u009b";
    static final String DFA34_eofS =
        "\u01d0\uffff";
    static final String DFA34_minS =
        "\1\0\2\56\24\60\17\uffff\1\52\1\101\7\uffff\2\60\2\0\2\uffff\4\56"+
        "\2\uffff\2\60\2\56\1\60\2\56\1\uffff\5\60\1\uffff\55\60\3\uffff"+
        "\1\60\2\uffff\6\56\2\53\6\56\21\60\1\uffff\60\60\7\56\100\60\5\56"+
        "\71\60\2\56\175\60";
    static final String DFA34_maxS =
        "\1\uffff\2\172\1\71\23\172\17\uffff\1\57\1\172\7\uffff\2\172\2\uffff"+
        "\2\uffff\4\172\2\uffff\2\146\2\172\1\71\2\172\1\uffff\5\172\1\uffff"+
        "\55\172\3\uffff\1\172\2\uffff\37\172\1\uffff\u0134\172";
    static final String DFA34_acceptS =
        "\27\uffff\17\5\2\uffff\7\5\4\uffff\1\14\1\15\4\uffff\1\1\1\2\7\uffff"+
        "\1\5\5\uffff\1\6\55\uffff\1\12\1\13\1\7\1\uffff\1\11\1\14\37\uffff"+
        "\1\4\u0134\uffff";
    static final String DFA34_specialS =
        "\1\0\60\uffff\1\1\1\2\u019d\uffff}>";
    static final String[] DFA34_transitionS = {
            "\11\64\2\63\2\64\1\63\22\64\1\63\1\53\1\61\1\33\1\64\1\40\1"+
            "\50\1\62\1\34\1\35\1\45\1\43\1\56\1\44\1\3\1\46\1\2\11\1\1\37"+
            "\1\41\1\36\1\54\1\55\1\42\1\64\32\60\1\31\1\64\1\32\1\47\1\60"+
            "\1\64\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\60\1\13\2\60\1\14\1\15"+
            "\1\16\1\17\1\20\1\60\1\21\1\22\1\23\1\24\1\25\1\26\1\57\2\60"+
            "\1\27\1\51\1\30\1\52\uff81\64",
            "\1\72\1\uffff\12\65\7\uffff\13\72\1\70\10\72\1\66\5\72\4\uffff"+
            "\1\72\1\uffff\13\72\1\67\10\72\1\66\5\72",
            "\1\72\1\uffff\10\75\2\77\7\uffff\13\72\1\101\10\72\1\76\2\72"+
            "\1\74\2\72\4\uffff\1\72\1\uffff\13\72\1\100\10\72\1\76\2\72"+
            "\1\73\2\72",
            "\12\72",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\13\107\1\103\1"+
            "\107\1\106\4\107\1\104\1\107\1\105\5\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\10\107\1\113\5"+
            "\107\1\111\2\107\1\112\10\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\1\114\6\107\1"+
            "\115\3\107\1\116\2\107\1\117\13\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\4\107\1\120\11"+
            "\107\1\121\11\107\1\122\1\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\13\107\1\123\1"+
            "\107\1\124\11\107\1\125\2\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\1\126\12\107\1"+
            "\127\2\107\1\130\2\107\1\131\10\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\16\107\1\132\13"+
            "\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\5\107\1\133\7"+
            "\107\1\134\14\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\16\107\1\135\13"+
            "\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\24\107\1\136\5"+
            "\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\1\137\3\107\1"+
            "\140\11\107\1\141\5\107\1\142\5\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\17\107\1\143\1"+
            "\107\1\144\10\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\21\107\1\145\2"+
            "\107\1\146\5\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\4\107\1\147\25"+
            "\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\7\107\1\150\1"+
            "\151\12\107\1\152\2\107\1\153\3\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\4\107\1\154\2"+
            "\107\1\155\11\107\1\156\6\107\1\157\1\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\15\107\1\160\4"+
            "\107\1\161\7\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\10\107\1\162\5"+
            "\107\1\163\13\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\2\107\1\164\4"+
            "\107\1\165\22\107",
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
            "\1\166\4\uffff\1\167",
            "\32\170\4\uffff\1\170\1\uffff\32\170",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\16\107\1\171\13"+
            "\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\32\107",
            "\0\172",
            "\0\172",
            "",
            "",
            "\1\72\1\uffff\12\65\7\uffff\13\72\1\70\10\72\1\66\5\72\4\uffff"+
            "\1\72\1\uffff\13\72\1\67\10\72\1\66\5\72",
            "\1\72\1\uffff\12\72\7\uffff\13\72\1\175\16\72\4\uffff\1\72"+
            "\1\uffff\13\72\1\174\16\72",
            "\1\72\1\uffff\12\72\7\uffff\24\72\1\177\5\72\4\uffff\1\72\1"+
            "\uffff\13\72\1\176\10\72\1\177\5\72",
            "\1\72\1\uffff\12\72\7\uffff\13\72\1\u0080\10\72\1\177\5\72"+
            "\4\uffff\1\72\1\uffff\24\72\1\177\5\72",
            "",
            "",
            "\12\u0081\7\uffff\4\u0084\1\u0083\1\u0084\32\uffff\4\u0084"+
            "\1\u0082\1\u0084",
            "\12\u0081\7\uffff\4\u0084\1\u0083\1\u0084\32\uffff\4\u0084"+
            "\1\u0082\1\u0084",
            "\1\72\1\uffff\10\75\2\77\7\uffff\13\72\1\101\10\72\1\76\5\72"+
            "\4\uffff\1\72\1\uffff\13\72\1\100\10\72\1\76\5\72",
            "\1\72\1\uffff\12\72\7\uffff\13\72\1\u0086\16\72\4\uffff\1\72"+
            "\1\uffff\13\72\1\u0085\16\72",
            "\12\77",
            "\1\72\1\uffff\12\72\7\uffff\24\72\1\u0088\5\72\4\uffff\1\72"+
            "\1\uffff\13\72\1\u0087\10\72\1\u0088\5\72",
            "\1\72\1\uffff\12\72\7\uffff\13\72\1\u0089\10\72\1\u0088\5\72"+
            "\4\uffff\1\72\1\uffff\24\72\1\u0088\5\72",
            "",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\10\107\1\u008a"+
            "\21\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\14\107\1\u008b"+
            "\15\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\23\107\1\u008c"+
            "\6\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\3\107\1\u008d"+
            "\26\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\32\107",
            "",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\16\107\1\u008e"+
            "\13\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\4\107\1\u008f"+
            "\25\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\23\107\1\u0090"+
            "\6\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\22\107\1\u0091"+
            "\1\u0092\6\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\1\u0093\31\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\1\u0094\31\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\14\107\1\u0096"+
            "\1\u0095\14\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\2\107\1\u0097"+
            "\2\107\1\u0098\5\107\1\u0099\16\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\24\107\1\u009a"+
            "\5\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\15\107\1\u009c"+
            "\14\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\22\107\1\u009d"+
            "\7\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\24\107\1\u009e"+
            "\5\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\17\107\1\u009f"+
            "\3\107\1\u00a0\6\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\13\107\1\u00a1"+
            "\16\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\16\107\1\u00a2"+
            "\13\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\21\107\1\u00a3"+
            "\10\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\10\107\1\u00a4"+
            "\21\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\23\107\1\u00a5"+
            "\6\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\32\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\13\107\1\u00a6"+
            "\7\107\1\u00a7\6\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\15\107\1\u00a8"+
            "\14\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\23\107\1\u00a9"+
            "\6\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\14\107\1\u00aa"+
            "\15\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\26\107\1\u00ab"+
            "\3\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\4\107\1\u00ac"+
            "\16\107\1\u00ad\6\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\13\107\1\u00ae"+
            "\16\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\4\107\1\u00af"+
            "\25\107",
            "\12\107\7\uffff\32\107\4\uffff\1\u00b0\1\uffff\32\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\10\107\1\u00b1"+
            "\5\107\1\u00b2\13\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\1\107\1\u00b3"+
            "\30\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\6\107\1\u00b4"+
            "\1\107\1\u00b5\12\107\1\u00b6\6\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\16\107\1\u00b7"+
            "\13\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\6\107\1\u00b8"+
            "\22\107\1\u00b9",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\1\u00ba\20\107"+
            "\1\u00bb\10\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\10\107\1\u00bc"+
            "\21\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\14\107\1\u00bd"+
            "\15\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\10\107\1\u00be"+
            "\10\107\1\u00bf\10\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\24\107\1\u00c0"+
            "\3\107\1\u00c1\1\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\17\107\1\u00c2"+
            "\12\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\10\107\1\u00c3"+
            "\11\107\1\u00c4\7\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\10\107\1\u00c5"+
            "\21\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\21\107\1\u00c6"+
            "\10\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\10\107\1\u00c7"+
            "\2\107\1\u00c8\16\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\7\107\1\u00c9"+
            "\22\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\10\107\1\u00ca"+
            "\21\107",
            "",
            "",
            "",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\21\107\1\u00cb"+
            "\10\107",
            "",
            "",
            "\1\72\1\uffff\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\13\72"+
            "\1\u00cc\16\72",
            "\1\72\1\uffff\12\72\7\uffff\13\72\1\u00cd\16\72\4\uffff\1\72"+
            "\1\uffff\32\72",
            "\1\72\1\uffff\12\72\7\uffff\24\72\1\177\5\72\4\uffff\1\72\1"+
            "\uffff\24\72\1\177\5\72",
            "\1\72\1\uffff\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\72\1\uffff\12\72\7\uffff\24\72\1\177\5\72\4\uffff\1\72\1"+
            "\uffff\24\72\1\177\5\72",
            "\1\72\1\uffff\12\u0081\7\uffff\4\u0084\1\u0083\1\u0084\5\72"+
            "\1\u00d0\10\72\1\u00ce\5\72\4\uffff\1\72\1\uffff\4\u0084\1\u0082"+
            "\1\u0084\5\72\1\u00cf\10\72\1\u00ce\5\72",
            "\1\72\1\uffff\2\72\1\uffff\12\u0081\7\uffff\4\u0084\1\u0083"+
            "\1\u0084\5\72\1\u00d0\10\72\1\u00ce\5\72\4\uffff\1\72\1\uffff"+
            "\4\u0084\1\u0082\1\u0084\5\72\1\u00cf\10\72\1\u00ce\5\72",
            "\1\72\1\uffff\2\72\1\uffff\12\u0081\7\uffff\4\u0084\1\u0083"+
            "\1\u0084\5\72\1\u00d0\10\72\1\u00ce\5\72\4\uffff\1\72\1\uffff"+
            "\4\u0084\1\u0082\1\u0084\5\72\1\u00cf\10\72\1\u00ce\5\72",
            "\1\72\1\uffff\12\u0081\7\uffff\4\u0084\1\u0083\1\u0084\5\72"+
            "\1\u00d0\10\72\1\u00ce\5\72\4\uffff\1\72\1\uffff\4\u0084\1\u0082"+
            "\1\u0084\5\72\1\u00cf\10\72\1\u00ce\5\72",
            "\1\72\1\uffff\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\13\72"+
            "\1\u00d1\16\72",
            "\1\72\1\uffff\12\72\7\uffff\13\72\1\u00d2\16\72\4\uffff\1\72"+
            "\1\uffff\32\72",
            "\1\72\1\uffff\12\72\7\uffff\24\72\1\u0088\5\72\4\uffff\1\72"+
            "\1\uffff\24\72\1\u0088\5\72",
            "\1\72\1\uffff\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\72\1\uffff\12\72\7\uffff\24\72\1\u0088\5\72\4\uffff\1\72"+
            "\1\uffff\24\72\1\u0088\5\72",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\6\107\1\u00d3"+
            "\23\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\32\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\16\107\1\u00d4"+
            "\13\107",
            "\12\107\7\uffff\32\107\4\uffff\1\u00d5\1\uffff\32\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\13\107\1\u00d6"+
            "\16\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\1\u00d7\31\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\1\u00d8\15\107"+
            "\1\u00d9\13\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\4\107\1\u00da"+
            "\25\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\2\107\1\u00db"+
            "\27\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\21\107\1\u00dc"+
            "\10\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\22\107\1\u00dd"+
            "\7\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\22\107\1\u00de"+
            "\1\u00df\6\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\17\107\1\u00e0"+
            "\12\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\13\107\1\u00e1"+
            "\16\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\1\u00e2\31\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\4\107\1\u00e3"+
            "\25\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\1\107\1\u00e4"+
            "\30\107",
            "",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\1\u00e5\31\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\4\107\1\u00e6"+
            "\25\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\14\107\1\u00e7"+
            "\15\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\13\107\1\u00e8"+
            "\2\107\1\u00e9\13\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\4\107\1\u00ea"+
            "\25\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\22\107\1\u00eb"+
            "\7\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\1\u00ec\31\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\32\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\4\107\1\u00ed"+
            "\25\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\16\107\1\u00ee"+
            "\13\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\10\107\1\u00ef"+
            "\21\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\32\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\6\107\1\u00f0"+
            "\23\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\1\u00f1\31\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\4\107\1\u00f2"+
            "\25\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\32\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\27\107\1\u00f3"+
            "\2\107",
            "\12\107\7\uffff\32\107\4\uffff\1\u00f4\1\uffff\32\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\13\107\1\u00f5"+
            "\16\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\21\107\1\u00f6"+
            "\10\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\4\107\1\u00f7"+
            "\25\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\25\107\1\u00f8"+
            "\4\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\23\107\1\u00f9"+
            "\6\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\13\107\1\u00fa"+
            "\16\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\10\107\1\u00fb"+
            "\21\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\15\107\1\u00fc"+
            "\14\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\24\107\1\u00fd"+
            "\5\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\21\107\1\u00fe"+
            "\10\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\15\107\1\u00ff"+
            "\14\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\4\107\1\u0100"+
            "\25\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\23\107\1\u0101"+
            "\6\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\24\107\1\u0102"+
            "\5\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\23\107\1\u0103"+
            "\6\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\17\107\1\u0104"+
            "\12\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\22\107\1\u0105"+
            "\7\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\4\107\1\u0106"+
            "\11\107\1\u0107\13\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\4\107\1\u0108"+
            "\25\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\32\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\4\107\1\u0109"+
            "\25\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\16\107\1\u010a"+
            "\13\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\10\107\1\u010b"+
            "\21\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\15\107\1\u010c"+
            "\14\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\23\107\1\u010d"+
            "\6\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\3\107\1\u010e"+
            "\26\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\1\u010f\31\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\1\u0110\31\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\13\107\1\u0111"+
            "\16\107",
            "\12\107\7\uffff\32\107\4\uffff\1\u0112\1\uffff\32\107",
            "\1\72\1\uffff\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\72\1\uffff\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\72\1\uffff\12\72\7\uffff\13\72\1\u0114\16\72\4\uffff\1\72"+
            "\1\uffff\13\72\1\u0113\16\72",
            "\1\72\1\uffff\12\72\7\uffff\24\72\1\u0116\5\72\4\uffff\1\72"+
            "\1\uffff\13\72\1\u0115\10\72\1\u0116\5\72",
            "\1\72\1\uffff\12\72\7\uffff\13\72\1\u0117\10\72\1\u0116\5\72"+
            "\4\uffff\1\72\1\uffff\24\72\1\u0116\5\72",
            "\1\72\1\uffff\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\72\1\uffff\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\15\107\1\u0118"+
            "\14\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\32\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\4\107\1\u0119"+
            "\25\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\32\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\12\107\1\u011a"+
            "\17\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\15\107\1\u011b"+
            "\14\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\21\107\1\u011c"+
            "\10\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\32\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\7\107\1\u011d"+
            "\22\107",
            "\1\107\1\u011e\1\107\1\u011f\6\107\7\uffff\32\107\4\uffff\1"+
            "\107\1\uffff\32\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\22\107\1\u0120"+
            "\7\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\23\107\1\u0121"+
            "\6\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\10\107\1\u0122"+
            "\21\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\13\107\1\u0123"+
            "\16\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\23\107\1\u0124"+
            "\6\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\24\107\1\u0125"+
            "\5\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\23\107\1\u0126"+
            "\6\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\13\107\1\u0127"+
            "\16\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\14\107\1\u0128"+
            "\15\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\32\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\32\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\10\107\1\u0129"+
            "\21\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\21\107\1\u012a"+
            "\10\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\21\107\1\u012b"+
            "\10\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\4\107\1\u012c"+
            "\25\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\23\107\1\u012d"+
            "\6\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\15\107\1\u012e"+
            "\14\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\32\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\15\107\1\u012f"+
            "\14\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\32\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\1\107\1\u0130"+
            "\30\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\22\107\1\u0131"+
            "\7\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\2\107\1\u0132"+
            "\27\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\4\107\1\u0133"+
            "\25\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\17\107\1\u0134"+
            "\12\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\1\u0135\31\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\20\107\1\u0136"+
            "\11\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\1\u0137\31\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\4\107\1\u0138"+
            "\25\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\10\107\1\u0139"+
            "\21\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\22\107\1\u013a"+
            "\7\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\23\107\1\u013b"+
            "\6\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\21\107\1\u013c"+
            "\10\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\23\107\1\u013d"+
            "\6\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\4\107\1\u013e"+
            "\25\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\16\107\1\u013f"+
            "\13\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\10\107\1\u0140"+
            "\21\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\2\107\1\u0141"+
            "\27\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\2\107\1\u0142"+
            "\27\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\13\107\1\u0143"+
            "\16\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\32\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\1\u0144\31\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\26\107\1\u0145"+
            "\3\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\32\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\3\107\1\u0146"+
            "\4\107\1\u0147\4\107\1\u0148\14\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\15\107\1\u0149"+
            "\14\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\6\107\1\u014a"+
            "\23\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\6\107\1\u014b"+
            "\23\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\24\107\1\u014c"+
            "\5\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\32\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\23\107\1\u014d"+
            "\6\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\21\107\1\u014e"+
            "\10\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\4\107\1\u014f"+
            "\25\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\4\107\1\u0150"+
            "\25\107",
            "\1\72\1\uffff\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\13\72"+
            "\1\u0151\16\72",
            "\1\72\1\uffff\12\72\7\uffff\13\72\1\u0152\16\72\4\uffff\1\72"+
            "\1\uffff\32\72",
            "\1\72\1\uffff\12\72\7\uffff\24\72\1\u0116\5\72\4\uffff\1\72"+
            "\1\uffff\24\72\1\u0116\5\72",
            "\1\72\1\uffff\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\72\1\uffff\12\72\7\uffff\24\72\1\u0116\5\72\4\uffff\1\72"+
            "\1\uffff\24\72\1\u0116\5\72",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\1\u0153\15\107"+
            "\1\u0154\13\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\20\107\1\u0155"+
            "\11\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\32\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\3\107\1\u0156"+
            "\26\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\32\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\32\107",
            "\6\107\1\u0157\3\107\7\uffff\32\107\4\uffff\1\107\1\uffff\32"+
            "\107",
            "\2\107\1\u0158\7\107\7\uffff\32\107\4\uffff\1\107\1\uffff\32"+
            "\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\32\107",
            "\12\107\7\uffff\32\107\4\uffff\1\u015a\1\uffff\4\107\1\u0159"+
            "\25\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\15\107\1\u015b"+
            "\14\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\32\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\30\107\1\u015c"+
            "\1\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\13\107\1\u015d"+
            "\16\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\4\107\1\u015e"+
            "\25\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\4\107\1\u015f"+
            "\25\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\10\107\1\u0160"+
            "\21\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\2\107\1\u0161"+
            "\27\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\23\107\1\u0162"+
            "\6\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\15\107\1\u0163"+
            "\14\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\32\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\32\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\3\107\1\u0164"+
            "\26\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\4\107\1\u0165"+
            "\25\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\13\107\1\u0166"+
            "\16\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\17\107\1\u0167"+
            "\12\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\4\107\1\u0168"+
            "\25\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\20\107\1\u0169"+
            "\11\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\23\107\1\u016a"+
            "\6\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\23\107\1\u016b"+
            "\6\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\32\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\23\107\1\u016c"+
            "\6\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\2\107\1\u016d"+
            "\27\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\2\107\1\u016e"+
            "\27\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\23\107\1\u016f"+
            "\6\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\4\107\1\u0170"+
            "\25\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\15\107\1\u0171"+
            "\14\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\32\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\3\107\1\u0172"+
            "\26\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\5\107\1\u0173"+
            "\24\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\2\107\1\u0174"+
            "\27\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\23\107\1\u0175"+
            "\6\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\7\107\1\u0176"+
            "\22\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\1\u0177\31\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\3\107\1\u0178"+
            "\26\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\32\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\4\107\1\u0179"+
            "\25\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\3\107\1\u017a"+
            "\26\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\1\u017b\31\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\32\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\15\107\1\u017c"+
            "\14\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\32\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\1\u017d\31\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\10\107\1\u017e"+
            "\21\107",
            "\12\107\7\uffff\32\107\4\uffff\1\u017f\1\uffff\32\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\32\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\20\107\1\u0180"+
            "\11\107",
            "\1\72\1\uffff\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\72\1\uffff\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\22\107\1\u0181"+
            "\7\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\5\107\1\u0182"+
            "\24\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\32\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\32\107",
            "\12\107\7\uffff\32\107\4\uffff\1\u0183\1\uffff\32\107",
            "\12\107\7\uffff\32\107\4\uffff\1\u0184\1\uffff\32\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\27\107\1\u0185"+
            "\2\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\2\107\1\u0186"+
            "\27\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\24\107\1\u0187"+
            "\5\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\17\107\1\u0188"+
            "\12\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\23\107\1\u0189"+
            "\6\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\32\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\32\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\2\107\1\u018a"+
            "\27\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\10\107\1\u018b"+
            "\21\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\32\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\32\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\32\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\32\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\4\107\1\u018c"+
            "\25\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\1\u018d\31\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\17\107\1\u018e"+
            "\12\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\32\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\21\107\1\u018f"+
            "\10\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\16\107\1\u0190"+
            "\13\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\4\107\1\u0191"+
            "\25\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\23\107\1\u0192"+
            "\6\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\32\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\4\107\1\u0193"+
            "\25\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\21\107\1\u0194"+
            "\10\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\32\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\32\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\32\107",
            "\12\107\7\uffff\32\107\4\uffff\1\u0195\1\uffff\32\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\32\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\32\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\23\107\1\u0196"+
            "\6\107",
            "\12\107\7\uffff\32\107\4\uffff\1\u0197\1\uffff\32\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\5\107\1\u0198"+
            "\24\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\32\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\14\107\1\u0199"+
            "\15\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\4\107\1\u019a"+
            "\25\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\13\107\1\u019b"+
            "\16\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\13\107\1\u019c"+
            "\16\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\23\107\1\u019d"+
            "\6\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\32\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\32\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\32\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\23\107\1\u019e"+
            "\6\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\23\107\1\u019f"+
            "\6\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\17\107\1\u01a0"+
            "\12\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\1\u01a1\31\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\4\107\1\u01a2"+
            "\25\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\4\107\1\u01a3"+
            "\25\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\32\107",
            "\12\107\7\uffff\32\107\4\uffff\1\u01a4\1\uffff\32\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\23\107\1\u01a5"+
            "\6\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\32\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\2\107\1\u01a6"+
            "\27\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\23\107\1\u01a7"+
            "\6\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\32\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\21\107\1\u01a8"+
            "\10\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\32\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\4\107\1\u01a9"+
            "\25\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\21\107\1\u01aa"+
            "\10\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\17\107\1\u01ab"+
            "\12\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\1\u01ac\1\107"+
            "\1\u01ad\27\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\4\107\1\u01ae"+
            "\25\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\13\107\1\u01af"+
            "\16\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\32\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\4\107\1\u01b0"+
            "\25\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\3\107\1\u01b1"+
            "\26\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\32\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\4\107\1\u01b2"+
            "\25\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\32\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\32\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\32\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\21\107\1\u01b3"+
            "\10\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\22\107\1\u01b4"+
            "\7\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\32\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\32\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\2\107\1\u01b5"+
            "\27\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\32\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\4\107\1\u01b6"+
            "\25\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\32\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\32\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\3\107\1\u01b7"+
            "\26\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\32\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\21\107\1\u01b8"+
            "\10\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\22\107\1\u01b9"+
            "\7\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\1\u01ba\31\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\32\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\16\107\1\u01bb"+
            "\13\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\32\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\32\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\32\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\32\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\23\107\1\u01bc"+
            "\6\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\1\u01bd\31\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\32\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\32\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\4\107\1\u01be"+
            "\25\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\22\107\1\u01bf"+
            "\7\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\22\107\1\u01c0"+
            "\7\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\2\107\1\u01c1"+
            "\27\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\32\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\22\107\1\u01c2"+
            "\7\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\23\107\1\u01c3"+
            "\6\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\4\107\1\u01c4"+
            "\25\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\23\107\1\u01c5"+
            "\6\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\1\u01c6\31\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\23\107\1\u01c7"+
            "\6\107",
            "\12\107\7\uffff\32\107\4\uffff\1\u01c8\1\uffff\32\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\21\107\1\u01c9"+
            "\10\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\32\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\13\107\1\u01ca"+
            "\16\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\32\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\2\107\1\u01cb"+
            "\27\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\23\107\1\u01cc"+
            "\6\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\32\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\1\u01cd\31\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\32\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\22\107\1\u01ce"+
            "\7\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\23\107\1\u01cf"+
            "\6\107",
            "\12\107\7\uffff\32\107\4\uffff\1\107\1\uffff\32\107"
    };

    static final short[] DFA34_eot = DFA.unpackEncodedString(DFA34_eotS);
    static final short[] DFA34_eof = DFA.unpackEncodedString(DFA34_eofS);
    static final char[] DFA34_min = DFA.unpackEncodedStringToUnsignedChars(DFA34_minS);
    static final char[] DFA34_max = DFA.unpackEncodedStringToUnsignedChars(DFA34_maxS);
    static final short[] DFA34_accept = DFA.unpackEncodedString(DFA34_acceptS);
    static final short[] DFA34_special = DFA.unpackEncodedString(DFA34_specialS);
    static final short[][] DFA34_transition;

    static {
        int numStates = DFA34_transitionS.length;
        DFA34_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA34_transition[i] = DFA.unpackEncodedString(DFA34_transitionS[i]);
        }
    }

    class DFA34 extends DFA {

        public DFA34(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 34;
            this.eot = DFA34_eot;
            this.eof = DFA34_eof;
            this.min = DFA34_min;
            this.max = DFA34_max;
            this.accept = DFA34_accept;
            this.special = DFA34_special;
            this.transition = DFA34_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( RULE_INTEGERLITERAL | RULE_PPNUMBER | RULE_LITERAL | RULE_KEYWORD | RULE_PPOPORPUNC | RULE_IDENTIFIER | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA34_0 = input.LA(1);

                        s = -1;
                        if ( ((LA34_0>='1' && LA34_0<='9')) ) {s = 1;}

                        else if ( (LA34_0=='0') ) {s = 2;}

                        else if ( (LA34_0=='.') ) {s = 3;}

                        else if ( (LA34_0=='a') ) {s = 4;}

                        else if ( (LA34_0=='b') ) {s = 5;}

                        else if ( (LA34_0=='c') ) {s = 6;}

                        else if ( (LA34_0=='d') ) {s = 7;}

                        else if ( (LA34_0=='e') ) {s = 8;}

                        else if ( (LA34_0=='f') ) {s = 9;}

                        else if ( (LA34_0=='g') ) {s = 10;}

                        else if ( (LA34_0=='i') ) {s = 11;}

                        else if ( (LA34_0=='l') ) {s = 12;}

                        else if ( (LA34_0=='m') ) {s = 13;}

                        else if ( (LA34_0=='n') ) {s = 14;}

                        else if ( (LA34_0=='o') ) {s = 15;}

                        else if ( (LA34_0=='p') ) {s = 16;}

                        else if ( (LA34_0=='r') ) {s = 17;}

                        else if ( (LA34_0=='s') ) {s = 18;}

                        else if ( (LA34_0=='t') ) {s = 19;}

                        else if ( (LA34_0=='u') ) {s = 20;}

                        else if ( (LA34_0=='v') ) {s = 21;}

                        else if ( (LA34_0=='w') ) {s = 22;}

                        else if ( (LA34_0=='{') ) {s = 23;}

                        else if ( (LA34_0=='}') ) {s = 24;}

                        else if ( (LA34_0=='[') ) {s = 25;}

                        else if ( (LA34_0==']') ) {s = 26;}

                        else if ( (LA34_0=='#') ) {s = 27;}

                        else if ( (LA34_0=='(') ) {s = 28;}

                        else if ( (LA34_0==')') ) {s = 29;}

                        else if ( (LA34_0=='<') ) {s = 30;}

                        else if ( (LA34_0==':') ) {s = 31;}

                        else if ( (LA34_0=='%') ) {s = 32;}

                        else if ( (LA34_0==';') ) {s = 33;}

                        else if ( (LA34_0=='?') ) {s = 34;}

                        else if ( (LA34_0=='+') ) {s = 35;}

                        else if ( (LA34_0=='-') ) {s = 36;}

                        else if ( (LA34_0=='*') ) {s = 37;}

                        else if ( (LA34_0=='/') ) {s = 38;}

                        else if ( (LA34_0=='^') ) {s = 39;}

                        else if ( (LA34_0=='&') ) {s = 40;}

                        else if ( (LA34_0=='|') ) {s = 41;}

                        else if ( (LA34_0=='~') ) {s = 42;}

                        else if ( (LA34_0=='!') ) {s = 43;}

                        else if ( (LA34_0=='=') ) {s = 44;}

                        else if ( (LA34_0=='>') ) {s = 45;}

                        else if ( (LA34_0==',') ) {s = 46;}

                        else if ( (LA34_0=='x') ) {s = 47;}

                        else if ( ((LA34_0>='A' && LA34_0<='Z')||LA34_0=='_'||LA34_0=='h'||(LA34_0>='j' && LA34_0<='k')||LA34_0=='q'||(LA34_0>='y' && LA34_0<='z')) ) {s = 48;}

                        else if ( (LA34_0=='\"') ) {s = 49;}

                        else if ( (LA34_0=='\'') ) {s = 50;}

                        else if ( ((LA34_0>='\t' && LA34_0<='\n')||LA34_0=='\r'||LA34_0==' ') ) {s = 51;}

                        else if ( ((LA34_0>='\u0000' && LA34_0<='\b')||(LA34_0>='\u000B' && LA34_0<='\f')||(LA34_0>='\u000E' && LA34_0<='\u001F')||LA34_0=='$'||LA34_0=='@'||LA34_0=='\\'||LA34_0=='`'||(LA34_0>='\u007F' && LA34_0<='\uFFFF')) ) {s = 52;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA34_49 = input.LA(1);

                        s = -1;
                        if ( ((LA34_49>='\u0000' && LA34_49<='\uFFFF')) ) {s = 122;}

                        else s = 52;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA34_50 = input.LA(1);

                        s = -1;
                        if ( ((LA34_50>='\u0000' && LA34_50<='\uFFFF')) ) {s = 122;}

                        else s = 52;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 34, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}