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
    public static final int RULE_ID=15;
    public static final int RULE_ANY_OTHER=21;
    public static final int RULE_HEXADECIMALDIGIT=10;
    public static final int RULE_IDENTIFIER=4;
    public static final int RULE_OCTALDIGIT=9;
    public static final int RULE_SIGN=7;
    public static final int EOF=-1;
    public static final int RULE_SL_COMMENT=19;
    public static final int RULE_ML_COMMENT=18;
    public static final int RULE_STRING=17;
    public static final int RULE_LONGLONGSUFFIX=13;
    public static final int RULE_KEYWORD=5;
    public static final int RULE_NONZERODIGIT=8;
    public static final int RULE_INT=16;
    public static final int RULE_PPOPORPUNC=6;
    public static final int RULE_LONGSUFFIX=12;
    public static final int RULE_PPNUMBER=14;
    public static final int RULE_WS=20;
    public static final int RULE_UNSIGNEDSUFFIX=11;

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

    // $ANTLR start "RULE_SIGN"
    public final void mRULE_SIGN() throws RecognitionException {
        try {
            int _type = RULE_SIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:184:11: ( ( '+' | '-' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:184:13: ( '+' | '-' )
            {
            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SIGN"

    // $ANTLR start "RULE_NONZERODIGIT"
    public final void mRULE_NONZERODIGIT() throws RecognitionException {
        try {
            int _type = RULE_NONZERODIGIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:186:19: ( '1' .. '9' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:186:21: '1' .. '9'
            {
            matchRange('1','9'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NONZERODIGIT"

    // $ANTLR start "RULE_OCTALDIGIT"
    public final void mRULE_OCTALDIGIT() throws RecognitionException {
        try {
            int _type = RULE_OCTALDIGIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:188:17: ( '0' .. '7' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:188:19: '0' .. '7'
            {
            matchRange('0','7'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_OCTALDIGIT"

    // $ANTLR start "RULE_HEXADECIMALDIGIT"
    public final void mRULE_HEXADECIMALDIGIT() throws RecognitionException {
        try {
            int _type = RULE_HEXADECIMALDIGIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:190:23: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:190:25: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_HEXADECIMALDIGIT"

    // $ANTLR start "RULE_UNSIGNEDSUFFIX"
    public final void mRULE_UNSIGNEDSUFFIX() throws RecognitionException {
        try {
            int _type = RULE_UNSIGNEDSUFFIX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:192:21: ( ( 'u' | 'U' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:192:23: ( 'u' | 'U' )
            {
            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_UNSIGNEDSUFFIX"

    // $ANTLR start "RULE_LONGSUFFIX"
    public final void mRULE_LONGSUFFIX() throws RecognitionException {
        try {
            int _type = RULE_LONGSUFFIX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:194:17: ( ( 'l' | 'L' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:194:19: ( 'l' | 'L' )
            {
            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LONGSUFFIX"

    // $ANTLR start "RULE_LONGLONGSUFFIX"
    public final void mRULE_LONGLONGSUFFIX() throws RecognitionException {
        try {
            int _type = RULE_LONGLONGSUFFIX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:196:21: ( ( 'll' | 'LL' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:196:23: ( 'll' | 'LL' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:196:23: ( 'll' | 'LL' )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='l') ) {
                alt1=1;
            }
            else if ( (LA1_0=='L') ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:196:24: 'll'
                    {
                    match("ll"); 


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:196:29: 'LL'
                    {
                    match("LL"); 


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
    // $ANTLR end "RULE_LONGLONGSUFFIX"

    // $ANTLR start "RULE_PPNUMBER"
    public final void mRULE_PPNUMBER() throws RecognitionException {
        try {
            int _type = RULE_PPNUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:198:15: ( ( '0' .. '9' | '.' '0' .. '9' ) ( '0' .. '9' | ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) | 'e' RULE_SIGN | 'E' RULE_SIGN | '.' )* )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:198:17: ( '0' .. '9' | '.' '0' .. '9' ) ( '0' .. '9' | ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) | 'e' RULE_SIGN | 'E' RULE_SIGN | '.' )*
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:198:17: ( '0' .. '9' | '.' '0' .. '9' )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                alt2=1;
            }
            else if ( (LA2_0=='.') ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:198:18: '0' .. '9'
                    {
                    matchRange('0','9'); 

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:198:27: '.' '0' .. '9'
                    {
                    match('.'); 
                    matchRange('0','9'); 

                    }
                    break;

            }

            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:198:41: ( '0' .. '9' | ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) | 'e' RULE_SIGN | 'E' RULE_SIGN | '.' )*
            loop3:
            do {
                int alt3=6;
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
                    alt3=1;
                    }
                    break;
                case 'e':
                    {
                    int LA3_3 = input.LA(2);

                    if ( (LA3_3=='+'||LA3_3=='-') ) {
                        alt3=3;
                    }

                    else {
                        alt3=2;
                    }

                    }
                    break;
                case 'E':
                    {
                    int LA3_4 = input.LA(2);

                    if ( (LA3_4=='+'||LA3_4=='-') ) {
                        alt3=4;
                    }

                    else {
                        alt3=2;
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
                    alt3=2;
                    }
                    break;
                case '.':
                    {
                    alt3=5;
                    }
                    break;

                }

                switch (alt3) {
            	case 1 :
            	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:198:42: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;
            	case 2 :
            	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:198:51: ( 'a' .. 'z' | 'A' .. 'Z' | '_' )
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
            	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:198:75: 'e' RULE_SIGN
            	    {
            	    match('e'); 
            	    mRULE_SIGN(); 

            	    }
            	    break;
            	case 4 :
            	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:198:89: 'E' RULE_SIGN
            	    {
            	    match('E'); 
            	    mRULE_SIGN(); 

            	    }
            	    break;
            	case 5 :
            	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:198:103: '.'
            	    {
            	    match('.'); 

            	    }
            	    break;

            	default :
            	    break loop3;
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

    // $ANTLR start "RULE_KEYWORD"
    public final void mRULE_KEYWORD() throws RecognitionException {
        try {
            int _type = RULE_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:200:14: ( ( 'alignas' | 'alignof' | 'asm' | 'auto' | 'bool' | 'break' | 'case' | 'catch' | 'char' | 'char16_t' | 'char32_t' | 'class' | 'const' | 'constexpr' | 'const_cast' | 'continue' | 'decltype' | 'default' | 'delete' | 'do' | 'double' | 'dynamic_cast' | 'else' | 'enum' | 'explicit' | 'export' | 'extern' | 'false' | 'float' | 'for' | 'friend' | 'goto' | 'if' | 'inline' | 'int' | 'long' | 'mutable' | 'namespace' | 'new' | 'noexcept' | 'nullptr' | 'operator' | 'private' | 'protected' | 'public' | 'register' | 'reinterpret_cast' | 'return' | 'short' | 'signed' | 'sizeof' | 'static' | 'static_assert' | 'static_cast' | 'struct' | 'switch' | 'template' | 'this' | 'thread_local' | 'throw' | 'true' | 'try' | 'typedef' | 'typeid' | 'typename' | 'union' | 'unsigned' | 'using' | 'virtual' | 'void' | 'volatile' | 'wchar_t' | 'while' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:200:16: ( 'alignas' | 'alignof' | 'asm' | 'auto' | 'bool' | 'break' | 'case' | 'catch' | 'char' | 'char16_t' | 'char32_t' | 'class' | 'const' | 'constexpr' | 'const_cast' | 'continue' | 'decltype' | 'default' | 'delete' | 'do' | 'double' | 'dynamic_cast' | 'else' | 'enum' | 'explicit' | 'export' | 'extern' | 'false' | 'float' | 'for' | 'friend' | 'goto' | 'if' | 'inline' | 'int' | 'long' | 'mutable' | 'namespace' | 'new' | 'noexcept' | 'nullptr' | 'operator' | 'private' | 'protected' | 'public' | 'register' | 'reinterpret_cast' | 'return' | 'short' | 'signed' | 'sizeof' | 'static' | 'static_assert' | 'static_cast' | 'struct' | 'switch' | 'template' | 'this' | 'thread_local' | 'throw' | 'true' | 'try' | 'typedef' | 'typeid' | 'typename' | 'union' | 'unsigned' | 'using' | 'virtual' | 'void' | 'volatile' | 'wchar_t' | 'while' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:200:16: ( 'alignas' | 'alignof' | 'asm' | 'auto' | 'bool' | 'break' | 'case' | 'catch' | 'char' | 'char16_t' | 'char32_t' | 'class' | 'const' | 'constexpr' | 'const_cast' | 'continue' | 'decltype' | 'default' | 'delete' | 'do' | 'double' | 'dynamic_cast' | 'else' | 'enum' | 'explicit' | 'export' | 'extern' | 'false' | 'float' | 'for' | 'friend' | 'goto' | 'if' | 'inline' | 'int' | 'long' | 'mutable' | 'namespace' | 'new' | 'noexcept' | 'nullptr' | 'operator' | 'private' | 'protected' | 'public' | 'register' | 'reinterpret_cast' | 'return' | 'short' | 'signed' | 'sizeof' | 'static' | 'static_assert' | 'static_cast' | 'struct' | 'switch' | 'template' | 'this' | 'thread_local' | 'throw' | 'true' | 'try' | 'typedef' | 'typeid' | 'typename' | 'union' | 'unsigned' | 'using' | 'virtual' | 'void' | 'volatile' | 'wchar_t' | 'while' )
            int alt4=73;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:200:17: 'alignas'
                    {
                    match("alignas"); 


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:200:27: 'alignof'
                    {
                    match("alignof"); 


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:200:37: 'asm'
                    {
                    match("asm"); 


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:200:43: 'auto'
                    {
                    match("auto"); 


                    }
                    break;
                case 5 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:200:50: 'bool'
                    {
                    match("bool"); 


                    }
                    break;
                case 6 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:200:57: 'break'
                    {
                    match("break"); 


                    }
                    break;
                case 7 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:200:65: 'case'
                    {
                    match("case"); 


                    }
                    break;
                case 8 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:200:72: 'catch'
                    {
                    match("catch"); 


                    }
                    break;
                case 9 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:200:80: 'char'
                    {
                    match("char"); 


                    }
                    break;
                case 10 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:200:87: 'char16_t'
                    {
                    match("char16_t"); 


                    }
                    break;
                case 11 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:200:98: 'char32_t'
                    {
                    match("char32_t"); 


                    }
                    break;
                case 12 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:200:109: 'class'
                    {
                    match("class"); 


                    }
                    break;
                case 13 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:200:117: 'const'
                    {
                    match("const"); 


                    }
                    break;
                case 14 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:200:125: 'constexpr'
                    {
                    match("constexpr"); 


                    }
                    break;
                case 15 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:200:137: 'const_cast'
                    {
                    match("const_cast"); 


                    }
                    break;
                case 16 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:200:150: 'continue'
                    {
                    match("continue"); 


                    }
                    break;
                case 17 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:200:161: 'decltype'
                    {
                    match("decltype"); 


                    }
                    break;
                case 18 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:200:172: 'default'
                    {
                    match("default"); 


                    }
                    break;
                case 19 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:200:182: 'delete'
                    {
                    match("delete"); 


                    }
                    break;
                case 20 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:200:191: 'do'
                    {
                    match("do"); 


                    }
                    break;
                case 21 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:200:196: 'double'
                    {
                    match("double"); 


                    }
                    break;
                case 22 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:200:205: 'dynamic_cast'
                    {
                    match("dynamic_cast"); 


                    }
                    break;
                case 23 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:200:220: 'else'
                    {
                    match("else"); 


                    }
                    break;
                case 24 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:200:227: 'enum'
                    {
                    match("enum"); 


                    }
                    break;
                case 25 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:200:234: 'explicit'
                    {
                    match("explicit"); 


                    }
                    break;
                case 26 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:200:245: 'export'
                    {
                    match("export"); 


                    }
                    break;
                case 27 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:200:254: 'extern'
                    {
                    match("extern"); 


                    }
                    break;
                case 28 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:200:263: 'false'
                    {
                    match("false"); 


                    }
                    break;
                case 29 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:200:271: 'float'
                    {
                    match("float"); 


                    }
                    break;
                case 30 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:200:279: 'for'
                    {
                    match("for"); 


                    }
                    break;
                case 31 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:200:285: 'friend'
                    {
                    match("friend"); 


                    }
                    break;
                case 32 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:200:294: 'goto'
                    {
                    match("goto"); 


                    }
                    break;
                case 33 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:200:301: 'if'
                    {
                    match("if"); 


                    }
                    break;
                case 34 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:200:306: 'inline'
                    {
                    match("inline"); 


                    }
                    break;
                case 35 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:200:315: 'int'
                    {
                    match("int"); 


                    }
                    break;
                case 36 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:200:321: 'long'
                    {
                    match("long"); 


                    }
                    break;
                case 37 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:200:328: 'mutable'
                    {
                    match("mutable"); 


                    }
                    break;
                case 38 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:200:338: 'namespace'
                    {
                    match("namespace"); 


                    }
                    break;
                case 39 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:200:350: 'new'
                    {
                    match("new"); 


                    }
                    break;
                case 40 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:200:356: 'noexcept'
                    {
                    match("noexcept"); 


                    }
                    break;
                case 41 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:200:367: 'nullptr'
                    {
                    match("nullptr"); 


                    }
                    break;
                case 42 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:200:377: 'operator'
                    {
                    match("operator"); 


                    }
                    break;
                case 43 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:200:388: 'private'
                    {
                    match("private"); 


                    }
                    break;
                case 44 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:200:398: 'protected'
                    {
                    match("protected"); 


                    }
                    break;
                case 45 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:200:410: 'public'
                    {
                    match("public"); 


                    }
                    break;
                case 46 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:200:419: 'register'
                    {
                    match("register"); 


                    }
                    break;
                case 47 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:200:430: 'reinterpret_cast'
                    {
                    match("reinterpret_cast"); 


                    }
                    break;
                case 48 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:200:449: 'return'
                    {
                    match("return"); 


                    }
                    break;
                case 49 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:200:458: 'short'
                    {
                    match("short"); 


                    }
                    break;
                case 50 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:200:466: 'signed'
                    {
                    match("signed"); 


                    }
                    break;
                case 51 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:200:475: 'sizeof'
                    {
                    match("sizeof"); 


                    }
                    break;
                case 52 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:200:484: 'static'
                    {
                    match("static"); 


                    }
                    break;
                case 53 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:200:493: 'static_assert'
                    {
                    match("static_assert"); 


                    }
                    break;
                case 54 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:200:509: 'static_cast'
                    {
                    match("static_cast"); 


                    }
                    break;
                case 55 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:200:523: 'struct'
                    {
                    match("struct"); 


                    }
                    break;
                case 56 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:200:532: 'switch'
                    {
                    match("switch"); 


                    }
                    break;
                case 57 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:200:541: 'template'
                    {
                    match("template"); 


                    }
                    break;
                case 58 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:200:552: 'this'
                    {
                    match("this"); 


                    }
                    break;
                case 59 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:200:559: 'thread_local'
                    {
                    match("thread_local"); 


                    }
                    break;
                case 60 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:200:574: 'throw'
                    {
                    match("throw"); 


                    }
                    break;
                case 61 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:200:582: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 62 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:200:589: 'try'
                    {
                    match("try"); 


                    }
                    break;
                case 63 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:200:595: 'typedef'
                    {
                    match("typedef"); 


                    }
                    break;
                case 64 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:200:605: 'typeid'
                    {
                    match("typeid"); 


                    }
                    break;
                case 65 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:200:614: 'typename'
                    {
                    match("typename"); 


                    }
                    break;
                case 66 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:200:625: 'union'
                    {
                    match("union"); 


                    }
                    break;
                case 67 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:200:633: 'unsigned'
                    {
                    match("unsigned"); 


                    }
                    break;
                case 68 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:200:644: 'using'
                    {
                    match("using"); 


                    }
                    break;
                case 69 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:200:652: 'virtual'
                    {
                    match("virtual"); 


                    }
                    break;
                case 70 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:200:662: 'void'
                    {
                    match("void"); 


                    }
                    break;
                case 71 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:200:669: 'volatile'
                    {
                    match("volatile"); 


                    }
                    break;
                case 72 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:200:680: 'wchar_t'
                    {
                    match("wchar_t"); 


                    }
                    break;
                case 73 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:200:690: 'while'
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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:202:17: ( ( '{' | '}' | '[' | ']' | '#' | '##' | '(' | ')' | '<:' | ':>' | '<%' | '%>' | '%:' | '%:%:' | ';' | ':' | '...' | 'new' | 'delete' | '?' | '::' | '.' | '.*' | '+' | '-' | '*' | '/' | '%' | '^' | '&' | '|' | '~' | '!' | '=' | '<' | '>' | '+=' | '-=' | '*=' | '/=' | '%=' | '^=' | '&=' | '|=' | '<<' | '>>' | '<<=' | '>>=' | '==' | '!=' | '<=' | '>=' | '&&' | '||' | '++' | '--' | ',' | '->*' | '->' | 'and' | 'and_eq' | 'bitand' | 'bitor' | 'compl' | 'not' | 'not_eq' | 'or' | 'or_eq' | 'xor' | 'xor_eq' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:202:19: ( '{' | '}' | '[' | ']' | '#' | '##' | '(' | ')' | '<:' | ':>' | '<%' | '%>' | '%:' | '%:%:' | ';' | ':' | '...' | 'new' | 'delete' | '?' | '::' | '.' | '.*' | '+' | '-' | '*' | '/' | '%' | '^' | '&' | '|' | '~' | '!' | '=' | '<' | '>' | '+=' | '-=' | '*=' | '/=' | '%=' | '^=' | '&=' | '|=' | '<<' | '>>' | '<<=' | '>>=' | '==' | '!=' | '<=' | '>=' | '&&' | '||' | '++' | '--' | ',' | '->*' | '->' | 'and' | 'and_eq' | 'bitand' | 'bitor' | 'compl' | 'not' | 'not_eq' | 'or' | 'or_eq' | 'xor' | 'xor_eq' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:202:19: ( '{' | '}' | '[' | ']' | '#' | '##' | '(' | ')' | '<:' | ':>' | '<%' | '%>' | '%:' | '%:%:' | ';' | ':' | '...' | 'new' | 'delete' | '?' | '::' | '.' | '.*' | '+' | '-' | '*' | '/' | '%' | '^' | '&' | '|' | '~' | '!' | '=' | '<' | '>' | '+=' | '-=' | '*=' | '/=' | '%=' | '^=' | '&=' | '|=' | '<<' | '>>' | '<<=' | '>>=' | '==' | '!=' | '<=' | '>=' | '&&' | '||' | '++' | '--' | ',' | '->*' | '->' | 'and' | 'and_eq' | 'bitand' | 'bitor' | 'compl' | 'not' | 'not_eq' | 'or' | 'or_eq' | 'xor' | 'xor_eq' )
            int alt5=70;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:202:20: '{'
                    {
                    match('{'); 

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:202:24: '}'
                    {
                    match('}'); 

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:202:28: '['
                    {
                    match('['); 

                    }
                    break;
                case 4 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:202:32: ']'
                    {
                    match(']'); 

                    }
                    break;
                case 5 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:202:36: '#'
                    {
                    match('#'); 

                    }
                    break;
                case 6 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:202:40: '##'
                    {
                    match("##"); 


                    }
                    break;
                case 7 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:202:45: '('
                    {
                    match('('); 

                    }
                    break;
                case 8 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:202:49: ')'
                    {
                    match(')'); 

                    }
                    break;
                case 9 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:202:53: '<:'
                    {
                    match("<:"); 


                    }
                    break;
                case 10 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:202:58: ':>'
                    {
                    match(":>"); 


                    }
                    break;
                case 11 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:202:63: '<%'
                    {
                    match("<%"); 


                    }
                    break;
                case 12 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:202:68: '%>'
                    {
                    match("%>"); 


                    }
                    break;
                case 13 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:202:73: '%:'
                    {
                    match("%:"); 


                    }
                    break;
                case 14 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:202:78: '%:%:'
                    {
                    match("%:%:"); 


                    }
                    break;
                case 15 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:202:85: ';'
                    {
                    match(';'); 

                    }
                    break;
                case 16 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:202:89: ':'
                    {
                    match(':'); 

                    }
                    break;
                case 17 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:202:93: '...'
                    {
                    match("..."); 


                    }
                    break;
                case 18 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:202:99: 'new'
                    {
                    match("new"); 


                    }
                    break;
                case 19 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:202:105: 'delete'
                    {
                    match("delete"); 


                    }
                    break;
                case 20 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:202:114: '?'
                    {
                    match('?'); 

                    }
                    break;
                case 21 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:202:118: '::'
                    {
                    match("::"); 


                    }
                    break;
                case 22 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:202:123: '.'
                    {
                    match('.'); 

                    }
                    break;
                case 23 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:202:127: '.*'
                    {
                    match(".*"); 


                    }
                    break;
                case 24 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:202:132: '+'
                    {
                    match('+'); 

                    }
                    break;
                case 25 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:202:136: '-'
                    {
                    match('-'); 

                    }
                    break;
                case 26 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:202:140: '*'
                    {
                    match('*'); 

                    }
                    break;
                case 27 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:202:144: '/'
                    {
                    match('/'); 

                    }
                    break;
                case 28 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:202:148: '%'
                    {
                    match('%'); 

                    }
                    break;
                case 29 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:202:152: '^'
                    {
                    match('^'); 

                    }
                    break;
                case 30 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:202:156: '&'
                    {
                    match('&'); 

                    }
                    break;
                case 31 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:202:160: '|'
                    {
                    match('|'); 

                    }
                    break;
                case 32 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:202:164: '~'
                    {
                    match('~'); 

                    }
                    break;
                case 33 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:202:168: '!'
                    {
                    match('!'); 

                    }
                    break;
                case 34 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:202:172: '='
                    {
                    match('='); 

                    }
                    break;
                case 35 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:202:176: '<'
                    {
                    match('<'); 

                    }
                    break;
                case 36 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:202:180: '>'
                    {
                    match('>'); 

                    }
                    break;
                case 37 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:202:184: '+='
                    {
                    match("+="); 


                    }
                    break;
                case 38 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:202:189: '-='
                    {
                    match("-="); 


                    }
                    break;
                case 39 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:202:194: '*='
                    {
                    match("*="); 


                    }
                    break;
                case 40 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:202:199: '/='
                    {
                    match("/="); 


                    }
                    break;
                case 41 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:202:204: '%='
                    {
                    match("%="); 


                    }
                    break;
                case 42 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:202:209: '^='
                    {
                    match("^="); 


                    }
                    break;
                case 43 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:202:214: '&='
                    {
                    match("&="); 


                    }
                    break;
                case 44 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:202:219: '|='
                    {
                    match("|="); 


                    }
                    break;
                case 45 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:202:224: '<<'
                    {
                    match("<<"); 


                    }
                    break;
                case 46 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:202:229: '>>'
                    {
                    match(">>"); 


                    }
                    break;
                case 47 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:202:234: '<<='
                    {
                    match("<<="); 


                    }
                    break;
                case 48 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:202:240: '>>='
                    {
                    match(">>="); 


                    }
                    break;
                case 49 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:202:246: '=='
                    {
                    match("=="); 


                    }
                    break;
                case 50 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:202:251: '!='
                    {
                    match("!="); 


                    }
                    break;
                case 51 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:202:256: '<='
                    {
                    match("<="); 


                    }
                    break;
                case 52 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:202:261: '>='
                    {
                    match(">="); 


                    }
                    break;
                case 53 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:202:266: '&&'
                    {
                    match("&&"); 


                    }
                    break;
                case 54 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:202:271: '||'
                    {
                    match("||"); 


                    }
                    break;
                case 55 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:202:276: '++'
                    {
                    match("++"); 


                    }
                    break;
                case 56 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:202:281: '--'
                    {
                    match("--"); 


                    }
                    break;
                case 57 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:202:286: ','
                    {
                    match(','); 

                    }
                    break;
                case 58 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:202:290: '->*'
                    {
                    match("->*"); 


                    }
                    break;
                case 59 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:202:296: '->'
                    {
                    match("->"); 


                    }
                    break;
                case 60 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:202:301: 'and'
                    {
                    match("and"); 


                    }
                    break;
                case 61 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:202:307: 'and_eq'
                    {
                    match("and_eq"); 


                    }
                    break;
                case 62 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:202:316: 'bitand'
                    {
                    match("bitand"); 


                    }
                    break;
                case 63 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:202:325: 'bitor'
                    {
                    match("bitor"); 


                    }
                    break;
                case 64 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:202:333: 'compl'
                    {
                    match("compl"); 


                    }
                    break;
                case 65 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:202:341: 'not'
                    {
                    match("not"); 


                    }
                    break;
                case 66 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:202:347: 'not_eq'
                    {
                    match("not_eq"); 


                    }
                    break;
                case 67 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:202:356: 'or'
                    {
                    match("or"); 


                    }
                    break;
                case 68 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:202:361: 'or_eq'
                    {
                    match("or_eq"); 


                    }
                    break;
                case 69 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:202:369: 'xor'
                    {
                    match("xor"); 


                    }
                    break;
                case 70 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:202:375: 'xor_eq'
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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:204:17: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( '0' .. '9' | 'A' .. 'Z' | 'a' .. 'z' | '_' )* )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:204:19: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( '0' .. '9' | 'A' .. 'Z' | 'a' .. 'z' | '_' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:204:43: ( '0' .. '9' | 'A' .. 'Z' | 'a' .. 'z' | '_' )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')||(LA6_0>='A' && LA6_0<='Z')||LA6_0=='_'||(LA6_0>='a' && LA6_0<='z')) ) {
                    alt6=1;
                }


                switch (alt6) {
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
    // $ANTLR end "RULE_IDENTIFIER"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:206:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:206:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:206:11: ( '^' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='^') ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:206:11: '^'
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

            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:206:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='0' && LA8_0<='9')||(LA8_0>='A' && LA8_0<='Z')||LA8_0=='_'||(LA8_0>='a' && LA8_0<='z')) ) {
                    alt8=1;
                }


                switch (alt8) {
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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:208:10: ( ( '0' .. '9' )+ )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:208:12: ( '0' .. '9' )+
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:208:12: ( '0' .. '9' )+
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
            	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:208:13: '0' .. '9'
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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:210:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:210:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:210:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:210:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:210:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:210:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:210:66: ~ ( ( '\\\\' | '\"' ) )
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
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:210:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:210:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:210:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:210:137: ~ ( ( '\\\\' | '\\'' ) )
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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:212:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:212:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:212:24: ( options {greedy=false; } : . )*
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
            	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:212:52: .
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

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:214:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:214:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:214:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>='\u0000' && LA14_0<='\t')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='\uFFFF')) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:214:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop14;
                }
            } while (true);

            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:214:40: ( ( '\\r' )? '\\n' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0=='\n'||LA16_0=='\r') ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:214:41: ( '\\r' )? '\\n'
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:214:41: ( '\\r' )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0=='\r') ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:214:41: '\\r'
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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:216:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:216:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:216:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>='\t' && LA17_0<='\n')||LA17_0=='\r'||LA17_0==' ') ) {
                    alt17=1;
                }


                switch (alt17) {
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
            	    if ( cnt17 >= 1 ) break loop17;
                        EarlyExitException eee =
                            new EarlyExitException(17, input);
                        throw eee;
                }
                cnt17++;
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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:218:16: ( . )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:218:18: .
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
        // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:8: ( RULE_SIGN | RULE_NONZERODIGIT | RULE_OCTALDIGIT | RULE_HEXADECIMALDIGIT | RULE_UNSIGNEDSUFFIX | RULE_LONGSUFFIX | RULE_LONGLONGSUFFIX | RULE_PPNUMBER | RULE_KEYWORD | RULE_PPOPORPUNC | RULE_IDENTIFIER | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt18=18;
        alt18 = dfa18.predict(input);
        switch (alt18) {
            case 1 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:10: RULE_SIGN
                {
                mRULE_SIGN(); 

                }
                break;
            case 2 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:20: RULE_NONZERODIGIT
                {
                mRULE_NONZERODIGIT(); 

                }
                break;
            case 3 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:38: RULE_OCTALDIGIT
                {
                mRULE_OCTALDIGIT(); 

                }
                break;
            case 4 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:54: RULE_HEXADECIMALDIGIT
                {
                mRULE_HEXADECIMALDIGIT(); 

                }
                break;
            case 5 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:76: RULE_UNSIGNEDSUFFIX
                {
                mRULE_UNSIGNEDSUFFIX(); 

                }
                break;
            case 6 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:96: RULE_LONGSUFFIX
                {
                mRULE_LONGSUFFIX(); 

                }
                break;
            case 7 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:112: RULE_LONGLONGSUFFIX
                {
                mRULE_LONGLONGSUFFIX(); 

                }
                break;
            case 8 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:132: RULE_PPNUMBER
                {
                mRULE_PPNUMBER(); 

                }
                break;
            case 9 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:146: RULE_KEYWORD
                {
                mRULE_KEYWORD(); 

                }
                break;
            case 10 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:159: RULE_PPOPORPUNC
                {
                mRULE_PPOPORPUNC(); 

                }
                break;
            case 11 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:175: RULE_IDENTIFIER
                {
                mRULE_IDENTIFIER(); 

                }
                break;
            case 12 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:191: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 13 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:199: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 14 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:208: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 15 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:220: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 16 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:236: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 17 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:252: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 18 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:260: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA4 dfa4 = new DFA4(this);
    protected DFA5 dfa5 = new DFA5(this);
    protected DFA18 dfa18 = new DFA18(this);
    static final String DFA4_eotS =
        "\36\uffff\1\107\100\uffff\1\153\14\uffff\1\165\11\uffff\1\170\4"+
        "\uffff";
    static final String DFA4_eofS =
        "\173\uffff";
    static final String DFA4_minS =
        "\1\141\1\154\1\157\1\141\1\145\1\154\1\141\1\uffff\1\146\2\uffff"+
        "\1\141\1\uffff\1\162\1\145\1\150\1\145\1\156\1\151\1\143\1\151\4"+
        "\uffff\1\163\1\141\1\uffff\1\156\1\143\1\165\3\uffff\1\160\5\uffff"+
        "\1\154\4\uffff\1\151\1\uffff\1\147\1\uffff\1\147\1\141\2\uffff\1"+
        "\151\1\165\1\160\1\151\2\uffff\1\151\2\uffff\1\147\2\uffff\1\162"+
        "\1\163\5\uffff\1\154\12\uffff\1\164\2\uffff\1\145\2\uffff\1\145"+
        "\4\uffff\1\156\1\61\1\164\3\uffff\1\151\2\uffff\1\144\1\141\3\uffff"+
        "\1\137\1\143\10\uffff\1\137\1\141\3\uffff";
    static final String DFA4_maxS =
        "\1\167\1\165\1\162\1\157\1\171\1\170\1\162\1\uffff\1\156\2\uffff"+
        "\1\165\1\uffff\1\165\1\145\1\167\1\171\1\163\1\157\1\150\1\151\4"+
        "\uffff\1\164\1\141\1\uffff\1\156\1\154\1\165\3\uffff\1\164\5\uffff"+
        "\1\164\4\uffff\1\157\1\uffff\1\164\1\uffff\1\172\1\162\2\uffff\1"+
        "\162\1\171\1\160\1\163\2\uffff\1\154\2\uffff\1\147\2\uffff\1\162"+
        "\1\164\5\uffff\1\157\12\uffff\1\164\2\uffff\1\157\2\uffff\1\145"+
        "\4\uffff\1\156\1\63\1\164\3\uffff\1\151\2\uffff\1\156\1\157\3\uffff"+
        "\1\145\1\143\10\uffff\1\137\1\143\3\uffff";
    static final String DFA4_acceptS =
        "\7\uffff\1\40\1\uffff\1\44\1\45\1\uffff\1\52\10\uffff\1\3\1\4\1"+
        "\5\1\6\2\uffff\1\14\3\uffff\1\26\1\27\1\30\1\uffff\1\34\1\35\1\36"+
        "\1\37\1\41\1\uffff\1\46\1\47\1\50\1\51\1\uffff\1\55\1\uffff\1\61"+
        "\2\uffff\1\70\1\71\4\uffff\1\104\1\105\1\uffff\1\110\1\111\1\uffff"+
        "\1\7\1\10\2\uffff\1\21\1\22\1\23\1\25\1\24\1\uffff\1\33\1\42\1\43"+
        "\1\53\1\54\1\56\1\57\1\60\1\62\1\63\1\uffff\1\67\1\72\1\uffff\1"+
        "\75\1\76\1\uffff\1\102\1\103\1\106\1\107\3\uffff\1\20\1\31\1\32"+
        "\1\uffff\1\73\1\74\2\uffff\1\12\1\13\1\11\2\uffff\1\77\1\100\1\101"+
        "\1\1\1\2\1\16\1\17\1\15\2\uffff\1\64\1\65\1\66";
    static final String DFA4_specialS =
        "\173\uffff}>";
    static final String[] DFA4_transitionS = {
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

    static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
    static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
    static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
    static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
    static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
    static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
    static final short[][] DFA4_transition;

    static {
        int numStates = DFA4_transitionS.length;
        DFA4_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
        }
    }

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = DFA4_eot;
            this.eof = DFA4_eof;
            this.min = DFA4_min;
            this.max = DFA4_max;
            this.accept = DFA4_accept;
            this.special = DFA4_special;
            this.transition = DFA4_transition;
        }
        public String getDescription() {
            return "200:16: ( 'alignas' | 'alignof' | 'asm' | 'auto' | 'bool' | 'break' | 'case' | 'catch' | 'char' | 'char16_t' | 'char32_t' | 'class' | 'const' | 'constexpr' | 'const_cast' | 'continue' | 'decltype' | 'default' | 'delete' | 'do' | 'double' | 'dynamic_cast' | 'else' | 'enum' | 'explicit' | 'export' | 'extern' | 'false' | 'float' | 'for' | 'friend' | 'goto' | 'if' | 'inline' | 'int' | 'long' | 'mutable' | 'namespace' | 'new' | 'noexcept' | 'nullptr' | 'operator' | 'private' | 'protected' | 'public' | 'register' | 'reinterpret_cast' | 'return' | 'short' | 'signed' | 'sizeof' | 'static' | 'static_assert' | 'static_cast' | 'struct' | 'switch' | 'template' | 'this' | 'thread_local' | 'throw' | 'true' | 'try' | 'typedef' | 'typeid' | 'typename' | 'union' | 'unsigned' | 'using' | 'virtual' | 'void' | 'volatile' | 'wchar_t' | 'while' )";
        }
    }
    static final String DFA5_eotS =
        "\5\uffff\1\42\2\uffff\1\47\1\52\1\56\1\uffff\1\61\3\uffff\1\66\1"+
        "\72\1\74\1\76\1\100\1\103\1\106\1\uffff\1\110\1\112\1\115\12\uffff"+
        "\1\123\6\uffff\1\125\14\uffff\1\130\21\uffff\1\132\4\uffff\1\136"+
        "\5\uffff\1\141\4\uffff\1\143\3\uffff\1\147\10\uffff";
    static final String DFA5_eofS =
        "\150\uffff";
    static final String DFA5_minS =
        "\1\41\4\uffff\1\43\2\uffff\1\45\2\72\1\uffff\1\52\1\145\2\uffff"+
        "\1\53\1\55\3\75\1\46\1\75\1\uffff\3\75\1\uffff\1\156\1\151\1\uffff"+
        "\1\162\1\157\4\uffff\1\75\6\uffff\1\45\6\uffff\1\164\5\uffff\1\52"+
        "\21\uffff\1\75\2\uffff\1\144\1\164\1\137\1\162\4\uffff\1\137\4\uffff"+
        "\1\137\1\141\2\uffff\1\137\10\uffff";
    static final String DFA5_maxS =
        "\1\176\4\uffff\1\43\2\uffff\1\75\2\76\1\uffff\1\56\1\157\2\uffff"+
        "\1\75\1\76\4\75\1\174\1\uffff\2\75\1\76\1\uffff\1\156\1\151\1\uffff"+
        "\1\162\1\157\4\uffff\1\75\6\uffff\1\45\6\uffff\1\164\5\uffff\1\52"+
        "\21\uffff\1\75\2\uffff\1\144\1\164\1\137\1\162\4\uffff\1\137\4\uffff"+
        "\1\137\1\157\2\uffff\1\137\10\uffff";
    static final String DFA5_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\uffff\1\7\1\10\3\uffff\1\17\2\uffff\1"+
        "\23\1\24\7\uffff\1\40\3\uffff\1\71\2\uffff\1\100\2\uffff\1\6\1\5"+
        "\1\11\1\13\1\uffff\1\63\1\43\1\12\1\25\1\20\1\14\1\uffff\1\51\1"+
        "\34\1\21\1\27\1\26\1\22\1\uffff\1\45\1\67\1\30\1\46\1\70\1\uffff"+
        "\1\31\1\47\1\32\1\50\1\33\1\52\1\35\1\53\1\65\1\36\1\54\1\66\1\37"+
        "\1\62\1\41\1\61\1\42\1\uffff\1\64\1\44\4\uffff\1\57\1\55\1\16\1"+
        "\15\1\uffff\1\72\1\73\1\60\1\56\2\uffff\1\104\1\103\1\uffff\1\102"+
        "\1\101\1\75\1\74\1\76\1\77\1\106\1\105";
    static final String DFA5_specialS =
        "\150\uffff}>";
    static final String[] DFA5_transitionS = {
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
            return "202:19: ( '{' | '}' | '[' | ']' | '#' | '##' | '(' | ')' | '<:' | ':>' | '<%' | '%>' | '%:' | '%:%:' | ';' | ':' | '...' | 'new' | 'delete' | '?' | '::' | '.' | '.*' | '+' | '-' | '*' | '/' | '%' | '^' | '&' | '|' | '~' | '!' | '=' | '<' | '>' | '+=' | '-=' | '*=' | '/=' | '%=' | '^=' | '&=' | '|=' | '<<' | '>>' | '<<=' | '>>=' | '==' | '!=' | '<=' | '>=' | '&&' | '||' | '++' | '--' | ',' | '->*' | '->' | 'and' | 'and_eq' | 'bitand' | 'bitor' | 'compl' | 'not' | 'not_eq' | 'or' | 'or_eq' | 'xor' | 'xor_eq' )";
        }
    }
    static final String DFA18_eotS =
        "\1\uffff\1\72\2\73\1\76\1\103\1\107\2\112\1\71\6\103\11\136\1\107"+
        "\2\136\14\uffff\1\72\1\uffff\2\71\7\uffff\2\136\2\70\5\uffff\1\75"+
        "\2\uffff\4\136\1\uffff\3\136\1\uffff\1\u0084\1\136\1\uffff\1\u0084"+
        "\10\136\1\u0093\11\136\1\uffff\1\u0093\7\136\1\71\17\136\3\uffff"+
        "\1\136\2\uffff\1\136\1\u0093\1\136\1\71\3\136\1\uffff\16\136\1\uffff"+
        "\7\136\1\u0093\3\136\1\u0093\2\136\1\u0093\1\136\1\71\23\136\1\u0093"+
        "\6\136\1\71\1\136\1\u0093\4\136\2\u0093\3\136\1\u0093\1\136\1\u0093"+
        "\11\136\2\u0093\6\136\1\u0093\25\136\1\u0093\2\136\1\u0093\2\136"+
        "\1\u0093\6\136\1\u0093\1\136\2\u0093\1\136\1\71\1\u0093\2\136\2"+
        "\u0093\1\136\1\71\10\136\2\u0093\10\136\1\71\6\136\1\u0093\7\136"+
        "\1\u0093\6\136\1\u0093\3\136\1\71\1\136\1\71\7\136\2\u0093\2\136"+
        "\4\u0093\3\136\1\71\4\136\1\u0093\2\136\6\u0093\3\136\1\u0093\4"+
        "\136\1\71\2\u0093\7\136\1\u0093\2\136\1\u0093\2\136\1\u0093\1\136"+
        "\1\u0093\6\136\1\u0093\1\136\1\u0093\1\136\4\u0093\2\136\2\u0093"+
        "\1\136\1\u0093\1\136\2\u0093\1\136\1\u0093\3\136\1\u0093\1\136\3"+
        "\u0093\2\136\2\u0093\4\136\1\u0093\10\136\1\u0093\1\136\1\u0093"+
        "\2\136\1\u0093\1\136\1\u0093\2\136\1\u0093";
    static final String DFA18_eofS =
        "\u01b6\uffff";
    static final String DFA18_minS =
        "\1\0\1\53\3\56\27\60\14\uffff\1\55\1\uffff\1\52\1\101\7\uffff\2"+
        "\60\2\0\5\uffff\1\60\2\uffff\4\60\1\uffff\3\60\1\uffff\2\60\1\uffff"+
        "\23\60\1\uffff\30\60\3\uffff\1\60\2\uffff\7\60\1\uffff\16\60\1\uffff"+
        "\u0122\60";
    static final String DFA18_maxS =
        "\1\uffff\1\75\7\172\1\71\22\172\14\uffff\1\76\1\uffff\1\57\1\172"+
        "\7\uffff\2\172\2\uffff\5\uffff\1\71\2\uffff\4\172\1\uffff\3\172"+
        "\1\uffff\2\172\1\uffff\23\172\1\uffff\30\172\3\uffff\1\172\2\uffff"+
        "\7\172\1\uffff\16\172\1\uffff\u0122\172";
    static final String DFA18_acceptS =
        "\34\uffff\14\12\1\uffff\1\12\2\uffff\7\12\4\uffff\1\21\1\22\1\12"+
        "\1\1\1\2\1\uffff\1\10\1\3\4\uffff\1\4\3\uffff\1\5\2\uffff\1\6\23"+
        "\uffff\1\13\30\uffff\1\17\1\20\1\14\1\uffff\1\16\1\21\7\uffff\1"+
        "\7\16\uffff\1\11\u0122\uffff";
    static final String DFA18_specialS =
        "\1\2\64\uffff\1\1\1\0\u017f\uffff}>";
    static final String[] DFA18_transitionS = {
            "\11\70\2\67\2\70\1\67\22\70\1\67\1\57\1\65\1\40\1\70\1\45\1"+
            "\54\1\66\1\41\1\42\1\51\1\1\1\62\1\50\1\11\1\52\1\4\7\2\2\3"+
            "\1\44\1\46\1\43\1\60\1\61\1\47\1\70\6\17\5\64\1\10\10\64\1\31"+
            "\5\64\1\36\1\70\1\37\1\53\1\64\1\70\1\5\1\12\1\13\1\14\1\15"+
            "\1\16\1\20\1\64\1\21\2\64\1\7\1\22\1\23\1\24\1\25\1\64\1\26"+
            "\1\27\1\30\1\6\1\32\1\33\1\63\2\64\1\34\1\55\1\35\1\56\uff81"+
            "\70",
            "\1\71\21\uffff\1\71",
            "\1\75\1\uffff\12\74\7\uffff\32\75\4\uffff\1\75\1\uffff\32\75",
            "\1\75\1\uffff\12\74\7\uffff\32\75\4\uffff\1\75\1\uffff\32\75",
            "\1\75\1\uffff\12\74\7\uffff\32\75\4\uffff\1\75\1\uffff\32\75",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\13\104\1\77\1"+
            "\104\1\102\4\104\1\100\1\104\1\101\5\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\15\104\1\105\4"+
            "\104\1\106\7\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\13\104\1\110\2"+
            "\104\1\111\13\104",
            "\12\104\7\uffff\13\104\1\113\16\104\4\uffff\1\104\1\uffff\32"+
            "\104",
            "\12\75",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\10\104\1\116\5"+
            "\104\1\114\2\104\1\115\10\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\1\117\6\104\1"+
            "\120\3\104\1\121\2\104\1\122\13\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\4\104\1\123\11"+
            "\104\1\124\11\104\1\125\1\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\13\104\1\126\1"+
            "\104\1\127\11\104\1\130\2\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\1\131\12\104\1"+
            "\132\2\104\1\133\2\104\1\134\10\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\32\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\16\104\1\135\13"+
            "\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\5\104\1\137\7"+
            "\104\1\140\14\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\24\104\1\141\5"+
            "\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\1\142\3\104\1"+
            "\143\11\104\1\144\5\104\1\145\5\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\17\104\1\146\1"+
            "\104\1\147\10\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\21\104\1\150\2"+
            "\104\1\151\5\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\4\104\1\152\25"+
            "\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\7\104\1\153\1"+
            "\154\12\104\1\155\2\104\1\156\3\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\4\104\1\157\2"+
            "\104\1\160\11\104\1\161\6\104\1\162\1\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\32\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\10\104\1\163\5"+
            "\104\1\164\13\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\2\104\1\165\4"+
            "\104\1\166\22\104",
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
            "\1\71\17\uffff\2\71",
            "",
            "\1\167\4\uffff\1\170",
            "\32\171\4\uffff\1\171\1\uffff\32\171",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\16\104\1\172\13"+
            "\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\32\104",
            "\0\173",
            "\0\173",
            "",
            "",
            "",
            "",
            "",
            "\12\74",
            "",
            "",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\10\104\1\175\21"+
            "\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\14\104\1\176\15"+
            "\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\23\104\1\177\6"+
            "\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\3\104\1\u0080"+
            "\26\104",
            "",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\32\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\10\104\1\u0081"+
            "\11\104\1\u0082\7\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\10\104\1\u0083"+
            "\21\104",
            "",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\32\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\15\104\1\u0085"+
            "\14\104",
            "",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\32\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\16\104\1\u0086"+
            "\13\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\4\104\1\u0087"+
            "\25\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\23\104\1\u0088"+
            "\6\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\22\104\1\u0089"+
            "\1\u008a\6\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\1\u008b\31\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\1\u008c\31\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\14\104\1\u008e"+
            "\1\u008d\14\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\2\104\1\u008f"+
            "\2\104\1\u0090\5\104\1\u0091\16\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\24\104\1\u0092"+
            "\5\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\15\104\1\u0094"+
            "\14\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\22\104\1\u0095"+
            "\7\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\24\104\1\u0096"+
            "\5\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\17\104\1\u0097"+
            "\3\104\1\u0098\6\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\13\104\1\u0099"+
            "\16\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\16\104\1\u009a"+
            "\13\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\21\104\1\u009b"+
            "\10\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\10\104\1\u009c"+
            "\21\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\23\104\1\u009d"+
            "\6\104",
            "",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\32\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\13\104\1\u009e"+
            "\7\104\1\u009f\6\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\23\104\1\u00a0"+
            "\6\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\14\104\1\u00a1"+
            "\15\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\26\104\1\u00a2"+
            "\3\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\4\104\1\u00a3"+
            "\16\104\1\u00a4\6\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\13\104\1\u00a5"+
            "\16\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\4\104\1\u00a6"+
            "\25\104",
            "\12\104\7\uffff\32\104\4\uffff\1\u00a7\1\uffff\32\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\10\104\1\u00a8"+
            "\5\104\1\u00a9\13\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\1\104\1\u00aa"+
            "\30\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\6\104\1\u00ab"+
            "\1\104\1\u00ac\12\104\1\u00ad\6\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\16\104\1\u00ae"+
            "\13\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\6\104\1\u00af"+
            "\22\104\1\u00b0",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\1\u00b1\20\104"+
            "\1\u00b2\10\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\10\104\1\u00b3"+
            "\21\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\14\104\1\u00b4"+
            "\15\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\10\104\1\u00b5"+
            "\10\104\1\u00b6\10\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\24\104\1\u00b7"+
            "\3\104\1\u00b8\1\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\17\104\1\u00b9"+
            "\12\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\21\104\1\u00ba"+
            "\10\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\10\104\1\u00bb"+
            "\2\104\1\u00bc\16\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\7\104\1\u00bd"+
            "\22\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\10\104\1\u00be"+
            "\21\104",
            "",
            "",
            "",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\21\104\1\u00bf"+
            "\10\104",
            "",
            "",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\6\104\1\u00c0"+
            "\23\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\32\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\16\104\1\u00c1"+
            "\13\104",
            "\12\104\7\uffff\32\104\4\uffff\1\u00c2\1\uffff\32\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\16\104\1\u00c3"+
            "\13\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\10\104\1\u00c4"+
            "\21\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\15\104\1\u00c5"+
            "\14\104",
            "",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\6\104\1\u00c6"+
            "\23\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\13\104\1\u00c7"+
            "\16\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\1\u00c8\31\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\1\u00c9\15\104"+
            "\1\u00ca\13\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\4\104\1\u00cb"+
            "\25\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\2\104\1\u00cc"+
            "\27\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\21\104\1\u00cd"+
            "\10\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\22\104\1\u00ce"+
            "\7\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\22\104\1\u00cf"+
            "\1\u00d0\6\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\17\104\1\u00d1"+
            "\12\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\13\104\1\u00d2"+
            "\16\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\1\u00d3\31\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\4\104\1\u00d4"+
            "\25\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\1\104\1\u00d5"+
            "\30\104",
            "",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\1\u00d6\31\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\4\104\1\u00d7"+
            "\25\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\14\104\1\u00d8"+
            "\15\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\13\104\1\u00d9"+
            "\2\104\1\u00da\13\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\4\104\1\u00db"+
            "\25\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\22\104\1\u00dc"+
            "\7\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\1\u00dd\31\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\32\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\4\104\1\u00de"+
            "\25\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\16\104\1\u00df"+
            "\13\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\10\104\1\u00e0"+
            "\21\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\32\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\1\u00e1\31\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\4\104\1\u00e2"+
            "\25\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\32\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\27\104\1\u00e3"+
            "\2\104",
            "\12\104\7\uffff\32\104\4\uffff\1\u00e4\1\uffff\32\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\13\104\1\u00e5"+
            "\16\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\21\104\1\u00e6"+
            "\10\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\4\104\1\u00e7"+
            "\25\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\25\104\1\u00e8"+
            "\4\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\23\104\1\u00e9"+
            "\6\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\13\104\1\u00ea"+
            "\16\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\10\104\1\u00eb"+
            "\21\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\15\104\1\u00ec"+
            "\14\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\24\104\1\u00ed"+
            "\5\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\21\104\1\u00ee"+
            "\10\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\15\104\1\u00ef"+
            "\14\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\4\104\1\u00f0"+
            "\25\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\23\104\1\u00f1"+
            "\6\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\24\104\1\u00f2"+
            "\5\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\23\104\1\u00f3"+
            "\6\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\17\104\1\u00f4"+
            "\12\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\22\104\1\u00f5"+
            "\7\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\4\104\1\u00f6"+
            "\11\104\1\u00f7\13\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\4\104\1\u00f8"+
            "\25\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\32\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\4\104\1\u00f9"+
            "\25\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\23\104\1\u00fa"+
            "\6\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\3\104\1\u00fb"+
            "\26\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\1\u00fc\31\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\1\u00fd\31\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\13\104\1\u00fe"+
            "\16\104",
            "\12\104\7\uffff\32\104\4\uffff\1\u00ff\1\uffff\32\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\15\104\1\u0100"+
            "\14\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\32\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\4\104\1\u0101"+
            "\25\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\15\104\1\u0102"+
            "\14\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\6\104\1\u0103"+
            "\23\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\6\104\1\u0104"+
            "\23\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\32\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\32\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\12\104\1\u0105"+
            "\17\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\15\104\1\u0106"+
            "\14\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\21\104\1\u0107"+
            "\10\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\32\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\7\104\1\u0108"+
            "\22\104",
            "\1\104\1\u0109\1\104\1\u010a\6\104\7\uffff\32\104\4\uffff\1"+
            "\104\1\uffff\32\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\22\104\1\u010b"+
            "\7\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\23\104\1\u010c"+
            "\6\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\10\104\1\u010d"+
            "\21\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\13\104\1\u010e"+
            "\16\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\23\104\1\u010f"+
            "\6\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\24\104\1\u0110"+
            "\5\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\23\104\1\u0111"+
            "\6\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\13\104\1\u0112"+
            "\16\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\14\104\1\u0113"+
            "\15\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\32\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\32\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\10\104\1\u0114"+
            "\21\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\21\104\1\u0115"+
            "\10\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\21\104\1\u0116"+
            "\10\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\4\104\1\u0117"+
            "\25\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\23\104\1\u0118"+
            "\6\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\15\104\1\u0119"+
            "\14\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\32\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\15\104\1\u011a"+
            "\14\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\1\104\1\u011b"+
            "\30\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\22\104\1\u011c"+
            "\7\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\2\104\1\u011d"+
            "\27\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\4\104\1\u011e"+
            "\25\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\17\104\1\u011f"+
            "\12\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\1\u0120\31\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\20\104\1\u0121"+
            "\11\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\1\u0122\31\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\4\104\1\u0123"+
            "\25\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\10\104\1\u0124"+
            "\21\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\22\104\1\u0125"+
            "\7\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\23\104\1\u0126"+
            "\6\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\21\104\1\u0127"+
            "\10\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\23\104\1\u0128"+
            "\6\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\4\104\1\u0129"+
            "\25\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\16\104\1\u012a"+
            "\13\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\10\104\1\u012b"+
            "\21\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\2\104\1\u012c"+
            "\27\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\2\104\1\u012d"+
            "\27\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\13\104\1\u012e"+
            "\16\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\32\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\1\u012f\31\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\26\104\1\u0130"+
            "\3\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\32\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\3\104\1\u0131"+
            "\4\104\1\u0132\4\104\1\u0133\14\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\24\104\1\u0134"+
            "\5\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\32\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\23\104\1\u0135"+
            "\6\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\21\104\1\u0136"+
            "\10\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\4\104\1\u0137"+
            "\25\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\4\104\1\u0138"+
            "\25\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\1\u0139\15\104"+
            "\1\u013a\13\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\20\104\1\u013b"+
            "\11\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\32\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\15\104\1\u013c"+
            "\14\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\32\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\32\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\3\104\1\u013d"+
            "\26\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\32\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\32\104",
            "\6\104\1\u013e\3\104\7\uffff\32\104\4\uffff\1\104\1\uffff\32"+
            "\104",
            "\2\104\1\u013f\7\104\7\uffff\32\104\4\uffff\1\104\1\uffff\32"+
            "\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\32\104",
            "\12\104\7\uffff\32\104\4\uffff\1\u0141\1\uffff\4\104\1\u0140"+
            "\25\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\15\104\1\u0142"+
            "\14\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\32\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\30\104\1\u0143"+
            "\1\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\13\104\1\u0144"+
            "\16\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\4\104\1\u0145"+
            "\25\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\4\104\1\u0146"+
            "\25\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\10\104\1\u0147"+
            "\21\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\2\104\1\u0148"+
            "\27\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\23\104\1\u0149"+
            "\6\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\15\104\1\u014a"+
            "\14\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\32\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\32\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\3\104\1\u014b"+
            "\26\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\4\104\1\u014c"+
            "\25\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\13\104\1\u014d"+
            "\16\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\17\104\1\u014e"+
            "\12\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\4\104\1\u014f"+
            "\25\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\20\104\1\u0150"+
            "\11\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\23\104\1\u0151"+
            "\6\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\23\104\1\u0152"+
            "\6\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\32\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\23\104\1\u0153"+
            "\6\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\2\104\1\u0154"+
            "\27\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\2\104\1\u0155"+
            "\27\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\23\104\1\u0156"+
            "\6\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\4\104\1\u0157"+
            "\25\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\15\104\1\u0158"+
            "\14\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\32\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\3\104\1\u0159"+
            "\26\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\5\104\1\u015a"+
            "\24\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\2\104\1\u015b"+
            "\27\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\23\104\1\u015c"+
            "\6\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\7\104\1\u015d"+
            "\22\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\1\u015e\31\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\3\104\1\u015f"+
            "\26\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\32\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\4\104\1\u0160"+
            "\25\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\3\104\1\u0161"+
            "\26\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\1\u0162\31\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\1\u0163\31\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\10\104\1\u0164"+
            "\21\104",
            "\12\104\7\uffff\32\104\4\uffff\1\u0165\1\uffff\32\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\32\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\20\104\1\u0166"+
            "\11\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\22\104\1\u0167"+
            "\7\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\5\104\1\u0168"+
            "\24\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\32\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\4\104\1\u0169"+
            "\25\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\32\104",
            "\12\104\7\uffff\32\104\4\uffff\1\u016a\1\uffff\32\104",
            "\12\104\7\uffff\32\104\4\uffff\1\u016b\1\uffff\32\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\27\104\1\u016c"+
            "\2\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\2\104\1\u016d"+
            "\27\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\24\104\1\u016e"+
            "\5\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\17\104\1\u016f"+
            "\12\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\23\104\1\u0170"+
            "\6\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\32\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\32\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\2\104\1\u0171"+
            "\27\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\10\104\1\u0172"+
            "\21\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\32\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\32\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\32\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\32\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\4\104\1\u0173"+
            "\25\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\1\u0174\31\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\17\104\1\u0175"+
            "\12\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\32\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\21\104\1\u0176"+
            "\10\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\16\104\1\u0177"+
            "\13\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\4\104\1\u0178"+
            "\25\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\23\104\1\u0179"+
            "\6\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\32\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\4\104\1\u017a"+
            "\25\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\21\104\1\u017b"+
            "\10\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\32\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\32\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\32\104",
            "\12\104\7\uffff\32\104\4\uffff\1\u017c\1\uffff\32\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\32\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\32\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\23\104\1\u017d"+
            "\6\104",
            "\12\104\7\uffff\32\104\4\uffff\1\u017e\1\uffff\32\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\5\104\1\u017f"+
            "\24\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\32\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\14\104\1\u0180"+
            "\15\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\13\104\1\u0181"+
            "\16\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\13\104\1\u0182"+
            "\16\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\23\104\1\u0183"+
            "\6\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\32\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\32\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\32\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\3\104\1\u0184"+
            "\26\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\23\104\1\u0185"+
            "\6\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\23\104\1\u0186"+
            "\6\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\17\104\1\u0187"+
            "\12\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\1\u0188\31\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\4\104\1\u0189"+
            "\25\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\4\104\1\u018a"+
            "\25\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\32\104",
            "\12\104\7\uffff\32\104\4\uffff\1\u018b\1\uffff\32\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\23\104\1\u018c"+
            "\6\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\32\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\2\104\1\u018d"+
            "\27\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\23\104\1\u018e"+
            "\6\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\32\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\21\104\1\u018f"+
            "\10\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\32\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\4\104\1\u0190"+
            "\25\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\21\104\1\u0191"+
            "\10\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\17\104\1\u0192"+
            "\12\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\1\u0193\1\104"+
            "\1\u0194\27\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\4\104\1\u0195"+
            "\25\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\13\104\1\u0196"+
            "\16\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\32\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\4\104\1\u0197"+
            "\25\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\32\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\4\104\1\u0198"+
            "\25\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\32\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\32\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\32\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\32\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\21\104\1\u0199"+
            "\10\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\22\104\1\u019a"+
            "\7\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\32\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\32\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\2\104\1\u019b"+
            "\27\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\32\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\4\104\1\u019c"+
            "\25\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\32\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\32\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\3\104\1\u019d"+
            "\26\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\32\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\21\104\1\u019e"+
            "\10\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\22\104\1\u019f"+
            "\7\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\1\u01a0\31\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\32\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\16\104\1\u01a1"+
            "\13\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\32\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\32\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\32\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\23\104\1\u01a2"+
            "\6\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\1\u01a3\31\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\32\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\32\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\4\104\1\u01a4"+
            "\25\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\22\104\1\u01a5"+
            "\7\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\22\104\1\u01a6"+
            "\7\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\2\104\1\u01a7"+
            "\27\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\32\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\22\104\1\u01a8"+
            "\7\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\23\104\1\u01a9"+
            "\6\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\4\104\1\u01aa"+
            "\25\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\23\104\1\u01ab"+
            "\6\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\1\u01ac\31\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\23\104\1\u01ad"+
            "\6\104",
            "\12\104\7\uffff\32\104\4\uffff\1\u01ae\1\uffff\32\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\21\104\1\u01af"+
            "\10\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\32\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\13\104\1\u01b0"+
            "\16\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\32\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\2\104\1\u01b1"+
            "\27\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\23\104\1\u01b2"+
            "\6\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\32\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\1\u01b3\31\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\32\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\22\104\1\u01b4"+
            "\7\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\23\104\1\u01b5"+
            "\6\104",
            "\12\104\7\uffff\32\104\4\uffff\1\104\1\uffff\32\104"
    };

    static final short[] DFA18_eot = DFA.unpackEncodedString(DFA18_eotS);
    static final short[] DFA18_eof = DFA.unpackEncodedString(DFA18_eofS);
    static final char[] DFA18_min = DFA.unpackEncodedStringToUnsignedChars(DFA18_minS);
    static final char[] DFA18_max = DFA.unpackEncodedStringToUnsignedChars(DFA18_maxS);
    static final short[] DFA18_accept = DFA.unpackEncodedString(DFA18_acceptS);
    static final short[] DFA18_special = DFA.unpackEncodedString(DFA18_specialS);
    static final short[][] DFA18_transition;

    static {
        int numStates = DFA18_transitionS.length;
        DFA18_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA18_transition[i] = DFA.unpackEncodedString(DFA18_transitionS[i]);
        }
    }

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = DFA18_eot;
            this.eof = DFA18_eof;
            this.min = DFA18_min;
            this.max = DFA18_max;
            this.accept = DFA18_accept;
            this.special = DFA18_special;
            this.transition = DFA18_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( RULE_SIGN | RULE_NONZERODIGIT | RULE_OCTALDIGIT | RULE_HEXADECIMALDIGIT | RULE_UNSIGNEDSUFFIX | RULE_LONGSUFFIX | RULE_LONGLONGSUFFIX | RULE_PPNUMBER | RULE_KEYWORD | RULE_PPOPORPUNC | RULE_IDENTIFIER | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA18_54 = input.LA(1);

                        s = -1;
                        if ( ((LA18_54>='\u0000' && LA18_54<='\uFFFF')) ) {s = 123;}

                        else s = 56;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA18_53 = input.LA(1);

                        s = -1;
                        if ( ((LA18_53>='\u0000' && LA18_53<='\uFFFF')) ) {s = 123;}

                        else s = 56;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA18_0 = input.LA(1);

                        s = -1;
                        if ( (LA18_0=='+') ) {s = 1;}

                        else if ( ((LA18_0>='1' && LA18_0<='7')) ) {s = 2;}

                        else if ( ((LA18_0>='8' && LA18_0<='9')) ) {s = 3;}

                        else if ( (LA18_0=='0') ) {s = 4;}

                        else if ( (LA18_0=='a') ) {s = 5;}

                        else if ( (LA18_0=='u') ) {s = 6;}

                        else if ( (LA18_0=='l') ) {s = 7;}

                        else if ( (LA18_0=='L') ) {s = 8;}

                        else if ( (LA18_0=='.') ) {s = 9;}

                        else if ( (LA18_0=='b') ) {s = 10;}

                        else if ( (LA18_0=='c') ) {s = 11;}

                        else if ( (LA18_0=='d') ) {s = 12;}

                        else if ( (LA18_0=='e') ) {s = 13;}

                        else if ( (LA18_0=='f') ) {s = 14;}

                        else if ( ((LA18_0>='A' && LA18_0<='F')) ) {s = 15;}

                        else if ( (LA18_0=='g') ) {s = 16;}

                        else if ( (LA18_0=='i') ) {s = 17;}

                        else if ( (LA18_0=='m') ) {s = 18;}

                        else if ( (LA18_0=='n') ) {s = 19;}

                        else if ( (LA18_0=='o') ) {s = 20;}

                        else if ( (LA18_0=='p') ) {s = 21;}

                        else if ( (LA18_0=='r') ) {s = 22;}

                        else if ( (LA18_0=='s') ) {s = 23;}

                        else if ( (LA18_0=='t') ) {s = 24;}

                        else if ( (LA18_0=='U') ) {s = 25;}

                        else if ( (LA18_0=='v') ) {s = 26;}

                        else if ( (LA18_0=='w') ) {s = 27;}

                        else if ( (LA18_0=='{') ) {s = 28;}

                        else if ( (LA18_0=='}') ) {s = 29;}

                        else if ( (LA18_0=='[') ) {s = 30;}

                        else if ( (LA18_0==']') ) {s = 31;}

                        else if ( (LA18_0=='#') ) {s = 32;}

                        else if ( (LA18_0=='(') ) {s = 33;}

                        else if ( (LA18_0==')') ) {s = 34;}

                        else if ( (LA18_0=='<') ) {s = 35;}

                        else if ( (LA18_0==':') ) {s = 36;}

                        else if ( (LA18_0=='%') ) {s = 37;}

                        else if ( (LA18_0==';') ) {s = 38;}

                        else if ( (LA18_0=='?') ) {s = 39;}

                        else if ( (LA18_0=='-') ) {s = 40;}

                        else if ( (LA18_0=='*') ) {s = 41;}

                        else if ( (LA18_0=='/') ) {s = 42;}

                        else if ( (LA18_0=='^') ) {s = 43;}

                        else if ( (LA18_0=='&') ) {s = 44;}

                        else if ( (LA18_0=='|') ) {s = 45;}

                        else if ( (LA18_0=='~') ) {s = 46;}

                        else if ( (LA18_0=='!') ) {s = 47;}

                        else if ( (LA18_0=='=') ) {s = 48;}

                        else if ( (LA18_0=='>') ) {s = 49;}

                        else if ( (LA18_0==',') ) {s = 50;}

                        else if ( (LA18_0=='x') ) {s = 51;}

                        else if ( ((LA18_0>='G' && LA18_0<='K')||(LA18_0>='M' && LA18_0<='T')||(LA18_0>='V' && LA18_0<='Z')||LA18_0=='_'||LA18_0=='h'||(LA18_0>='j' && LA18_0<='k')||LA18_0=='q'||(LA18_0>='y' && LA18_0<='z')) ) {s = 52;}

                        else if ( (LA18_0=='\"') ) {s = 53;}

                        else if ( (LA18_0=='\'') ) {s = 54;}

                        else if ( ((LA18_0>='\t' && LA18_0<='\n')||LA18_0=='\r'||LA18_0==' ') ) {s = 55;}

                        else if ( ((LA18_0>='\u0000' && LA18_0<='\b')||(LA18_0>='\u000B' && LA18_0<='\f')||(LA18_0>='\u000E' && LA18_0<='\u001F')||LA18_0=='$'||LA18_0=='@'||LA18_0=='\\'||LA18_0=='`'||(LA18_0>='\u007F' && LA18_0<='\uFFFF')) ) {s = 56;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 18, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}