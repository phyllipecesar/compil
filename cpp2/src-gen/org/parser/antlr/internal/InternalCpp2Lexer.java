package org.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCpp2Lexer extends Lexer {
    public static final int RULE_HEXADECIMAL_LITERAL=21;
    public static final int RULE_ID=6;
    public static final int RULE_FLOATING_LITERAL=9;
    public static final int RULE_ESCAPE_SEQUENCE=25;
    public static final int RULE_HEXADECIMAL_ESCAPE_SEQUENCE=28;
    public static final int RULE_ANY_OTHER=37;
    public static final int RULE_ENC_PREFIX=31;
    public static final int RULE_H_CHAR=14;
    public static final int RULE_PREPROCESSING_OP_OR_PUNC=5;
    public static final int RULE_SCHAR=32;
    public static final int RULE_C_CHAR=24;
    public static final int EOF=-1;
    public static final int RULE_SL_COMMENT=35;
    public static final int RULE_HEXADECIMAL_DIGIT=11;
    public static final int RULE_ML_COMMENT=34;
    public static final int RULE_EXPONENT_PART=30;
    public static final int RULE_OCTAL_DIGIT=23;
    public static final int RULE_STRING=33;
    public static final int RULE_STRING_LITERAL=10;
    public static final int RULE_FRACTIONAL_CONSTANT=29;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_KEYWORD=4;
    public static final int RULE_UNIVERSAL_CHARACTER_NAME=13;
    public static final int RULE_DECIMAL_LITERAL=19;
    public static final int RULE_INT=7;
    public static final int RULE_OCTAL_LITERAL=20;
    public static final int RULE_OCTAL_ESCAPE_SEQUENCE=27;
    public static final int RULE_Q_CHAR=15;
    public static final int RULE_WS=36;
    public static final int RULE_DIGIT=17;
    public static final int RULE_NONDIGIT=18;
    public static final int RULE_INTEGER_SUFFIX=22;
    public static final int RULE_CHARACTER_LITERAL=8;
    public static final int RULE_HEADER_NAME=16;
    public static final int RULE_HEX_QUAD=12;
    public static final int RULE_SIMPLE_ESCAPE_SEQUENCE=26;

    // delegates
    // delegators

    public InternalCpp2Lexer() {;} 
    public InternalCpp2Lexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalCpp2Lexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g"; }

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:11:7: ( 'true' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:11:9: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:12:7: ( 'false' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:12:9: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "RULE_HEX_QUAD"
    public final void mRULE_HEX_QUAD() throws RecognitionException {
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:228:24: ( RULE_HEXADECIMAL_DIGIT RULE_HEXADECIMAL_DIGIT RULE_HEXADECIMAL_DIGIT RULE_HEXADECIMAL_DIGIT )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:228:26: RULE_HEXADECIMAL_DIGIT RULE_HEXADECIMAL_DIGIT RULE_HEXADECIMAL_DIGIT RULE_HEXADECIMAL_DIGIT
            {
            mRULE_HEXADECIMAL_DIGIT(); 
            mRULE_HEXADECIMAL_DIGIT(); 
            mRULE_HEXADECIMAL_DIGIT(); 
            mRULE_HEXADECIMAL_DIGIT(); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_HEX_QUAD"

    // $ANTLR start "RULE_UNIVERSAL_CHARACTER_NAME"
    public final void mRULE_UNIVERSAL_CHARACTER_NAME() throws RecognitionException {
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:230:40: ( ( '\\\\u' RULE_HEX_QUAD | '\\\\U' RULE_HEX_QUAD RULE_HEX_QUAD ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:230:42: ( '\\\\u' RULE_HEX_QUAD | '\\\\U' RULE_HEX_QUAD RULE_HEX_QUAD )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:230:42: ( '\\\\u' RULE_HEX_QUAD | '\\\\U' RULE_HEX_QUAD RULE_HEX_QUAD )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='\\') ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1=='u') ) {
                    alt1=1;
                }
                else if ( (LA1_1=='U') ) {
                    alt1=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:230:43: '\\\\u' RULE_HEX_QUAD
                    {
                    match("\\u"); 

                    mRULE_HEX_QUAD(); 

                    }
                    break;
                case 2 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:230:63: '\\\\U' RULE_HEX_QUAD RULE_HEX_QUAD
                    {
                    match("\\U"); 

                    mRULE_HEX_QUAD(); 
                    mRULE_HEX_QUAD(); 

                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_UNIVERSAL_CHARACTER_NAME"

    // $ANTLR start "RULE_HEADER_NAME"
    public final void mRULE_HEADER_NAME() throws RecognitionException {
        try {
            int _type = RULE_HEADER_NAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:232:18: ( ( '<' ( RULE_H_CHAR )+ '>' | '\"' ( RULE_Q_CHAR )+ '\"' ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:232:20: ( '<' ( RULE_H_CHAR )+ '>' | '\"' ( RULE_Q_CHAR )+ '\"' )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:232:20: ( '<' ( RULE_H_CHAR )+ '>' | '\"' ( RULE_Q_CHAR )+ '\"' )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='<') ) {
                alt4=1;
            }
            else if ( (LA4_0=='\"') ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:232:21: '<' ( RULE_H_CHAR )+ '>'
                    {
                    match('<'); 
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:232:25: ( RULE_H_CHAR )+
                    int cnt2=0;
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( ((LA2_0>='\u0000' && LA2_0<='\t')||(LA2_0>='\u000B' && LA2_0<='=')||(LA2_0>='?' && LA2_0<='\uFFFF')) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:232:25: RULE_H_CHAR
                    	    {
                    	    mRULE_H_CHAR(); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt2 >= 1 ) break loop2;
                                EarlyExitException eee =
                                    new EarlyExitException(2, input);
                                throw eee;
                        }
                        cnt2++;
                    } while (true);

                    match('>'); 

                    }
                    break;
                case 2 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:232:42: '\"' ( RULE_Q_CHAR )+ '\"'
                    {
                    match('\"'); 
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:232:46: ( RULE_Q_CHAR )+
                    int cnt3=0;
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0>='\u0000' && LA3_0<='\t')||(LA3_0>='\u000B' && LA3_0<='!')||(LA3_0>='#' && LA3_0<='\uFFFF')) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:232:46: RULE_Q_CHAR
                    	    {
                    	    mRULE_Q_CHAR(); 

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

                    match('\"'); 

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
    // $ANTLR end "RULE_HEADER_NAME"

    // $ANTLR start "RULE_H_CHAR"
    public final void mRULE_H_CHAR() throws RecognitionException {
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:234:22: (~ ( ( '\\n' | '>' ) ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:234:24: ~ ( ( '\\n' | '>' ) )
            {
            if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='=')||(input.LA(1)>='?' && input.LA(1)<='\uFFFF') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_H_CHAR"

    // $ANTLR start "RULE_Q_CHAR"
    public final void mRULE_Q_CHAR() throws RecognitionException {
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:236:22: (~ ( ( '\\n' | '\"' ) ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:236:24: ~ ( ( '\\n' | '\"' ) )
            {
            if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='\uFFFF') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_Q_CHAR"

    // $ANTLR start "RULE_DIGIT"
    public final void mRULE_DIGIT() throws RecognitionException {
        try {
            int _type = RULE_DIGIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:238:12: ( '0' .. '9' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:238:14: '0' .. '9'
            {
            matchRange('0','9'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DIGIT"

    // $ANTLR start "RULE_NONDIGIT"
    public final void mRULE_NONDIGIT() throws RecognitionException {
        try {
            int _type = RULE_NONDIGIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:240:15: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:240:17: ( 'a' .. 'z' | 'A' .. 'Z' | '_' )
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
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
    // $ANTLR end "RULE_NONDIGIT"

    // $ANTLR start "RULE_KEYWORD"
    public final void mRULE_KEYWORD() throws RecognitionException {
        try {
            int _type = RULE_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:242:14: ( ( 'alignas' | 'alignof' | 'asm' | 'auto' | 'bool' | 'break' | 'case' | 'catch' | 'char' | 'char16_t' | 'char32_t' | 'class' | 'const' | 'constexpr' | 'const_cast' | 'continue' | 'decltype' | 'default' | 'delete' | 'do' | 'double' | 'dynamic_cast' | 'else' | 'enum' | 'explicit' | 'export' | 'extern' | 'false' | 'float' | 'for' | 'friend' | 'goto' | 'if' | 'inline' | 'int' | 'long' | 'mutable' | 'namespace' | 'new' | 'noexcept' | 'nullptr' | 'operator' | 'private' | 'protected' | 'public' | 'register' | 'reinterpret_cast' | 'return' | 'short' | 'signed' | 'sizeof' | 'static' | 'static_assert' | 'static_cast' | 'struct' | 'switch' | 'template' | 'this' | 'thread_local' | 'throw' | 'true' | 'try' | 'typedef' | 'typeid' | 'typename' | 'union' | 'unsigned' | 'using' | 'virtual' | 'void' | 'volatile' | 'wchar_t' | 'while' ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:242:16: ( 'alignas' | 'alignof' | 'asm' | 'auto' | 'bool' | 'break' | 'case' | 'catch' | 'char' | 'char16_t' | 'char32_t' | 'class' | 'const' | 'constexpr' | 'const_cast' | 'continue' | 'decltype' | 'default' | 'delete' | 'do' | 'double' | 'dynamic_cast' | 'else' | 'enum' | 'explicit' | 'export' | 'extern' | 'false' | 'float' | 'for' | 'friend' | 'goto' | 'if' | 'inline' | 'int' | 'long' | 'mutable' | 'namespace' | 'new' | 'noexcept' | 'nullptr' | 'operator' | 'private' | 'protected' | 'public' | 'register' | 'reinterpret_cast' | 'return' | 'short' | 'signed' | 'sizeof' | 'static' | 'static_assert' | 'static_cast' | 'struct' | 'switch' | 'template' | 'this' | 'thread_local' | 'throw' | 'true' | 'try' | 'typedef' | 'typeid' | 'typename' | 'union' | 'unsigned' | 'using' | 'virtual' | 'void' | 'volatile' | 'wchar_t' | 'while' )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:242:16: ( 'alignas' | 'alignof' | 'asm' | 'auto' | 'bool' | 'break' | 'case' | 'catch' | 'char' | 'char16_t' | 'char32_t' | 'class' | 'const' | 'constexpr' | 'const_cast' | 'continue' | 'decltype' | 'default' | 'delete' | 'do' | 'double' | 'dynamic_cast' | 'else' | 'enum' | 'explicit' | 'export' | 'extern' | 'false' | 'float' | 'for' | 'friend' | 'goto' | 'if' | 'inline' | 'int' | 'long' | 'mutable' | 'namespace' | 'new' | 'noexcept' | 'nullptr' | 'operator' | 'private' | 'protected' | 'public' | 'register' | 'reinterpret_cast' | 'return' | 'short' | 'signed' | 'sizeof' | 'static' | 'static_assert' | 'static_cast' | 'struct' | 'switch' | 'template' | 'this' | 'thread_local' | 'throw' | 'true' | 'try' | 'typedef' | 'typeid' | 'typename' | 'union' | 'unsigned' | 'using' | 'virtual' | 'void' | 'volatile' | 'wchar_t' | 'while' )
            int alt5=73;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:242:17: 'alignas'
                    {
                    match("alignas"); 


                    }
                    break;
                case 2 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:242:27: 'alignof'
                    {
                    match("alignof"); 


                    }
                    break;
                case 3 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:242:37: 'asm'
                    {
                    match("asm"); 


                    }
                    break;
                case 4 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:242:43: 'auto'
                    {
                    match("auto"); 


                    }
                    break;
                case 5 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:242:50: 'bool'
                    {
                    match("bool"); 


                    }
                    break;
                case 6 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:242:57: 'break'
                    {
                    match("break"); 


                    }
                    break;
                case 7 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:242:65: 'case'
                    {
                    match("case"); 


                    }
                    break;
                case 8 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:242:72: 'catch'
                    {
                    match("catch"); 


                    }
                    break;
                case 9 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:242:80: 'char'
                    {
                    match("char"); 


                    }
                    break;
                case 10 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:242:87: 'char16_t'
                    {
                    match("char16_t"); 


                    }
                    break;
                case 11 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:242:98: 'char32_t'
                    {
                    match("char32_t"); 


                    }
                    break;
                case 12 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:242:109: 'class'
                    {
                    match("class"); 


                    }
                    break;
                case 13 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:242:117: 'const'
                    {
                    match("const"); 


                    }
                    break;
                case 14 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:242:125: 'constexpr'
                    {
                    match("constexpr"); 


                    }
                    break;
                case 15 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:242:137: 'const_cast'
                    {
                    match("const_cast"); 


                    }
                    break;
                case 16 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:242:150: 'continue'
                    {
                    match("continue"); 


                    }
                    break;
                case 17 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:242:161: 'decltype'
                    {
                    match("decltype"); 


                    }
                    break;
                case 18 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:242:172: 'default'
                    {
                    match("default"); 


                    }
                    break;
                case 19 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:242:182: 'delete'
                    {
                    match("delete"); 


                    }
                    break;
                case 20 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:242:191: 'do'
                    {
                    match("do"); 


                    }
                    break;
                case 21 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:242:196: 'double'
                    {
                    match("double"); 


                    }
                    break;
                case 22 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:242:205: 'dynamic_cast'
                    {
                    match("dynamic_cast"); 


                    }
                    break;
                case 23 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:242:220: 'else'
                    {
                    match("else"); 


                    }
                    break;
                case 24 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:242:227: 'enum'
                    {
                    match("enum"); 


                    }
                    break;
                case 25 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:242:234: 'explicit'
                    {
                    match("explicit"); 


                    }
                    break;
                case 26 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:242:245: 'export'
                    {
                    match("export"); 


                    }
                    break;
                case 27 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:242:254: 'extern'
                    {
                    match("extern"); 


                    }
                    break;
                case 28 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:242:263: 'false'
                    {
                    match("false"); 


                    }
                    break;
                case 29 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:242:271: 'float'
                    {
                    match("float"); 


                    }
                    break;
                case 30 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:242:279: 'for'
                    {
                    match("for"); 


                    }
                    break;
                case 31 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:242:285: 'friend'
                    {
                    match("friend"); 


                    }
                    break;
                case 32 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:242:294: 'goto'
                    {
                    match("goto"); 


                    }
                    break;
                case 33 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:242:301: 'if'
                    {
                    match("if"); 


                    }
                    break;
                case 34 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:242:306: 'inline'
                    {
                    match("inline"); 


                    }
                    break;
                case 35 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:242:315: 'int'
                    {
                    match("int"); 


                    }
                    break;
                case 36 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:242:321: 'long'
                    {
                    match("long"); 


                    }
                    break;
                case 37 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:242:328: 'mutable'
                    {
                    match("mutable"); 


                    }
                    break;
                case 38 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:242:338: 'namespace'
                    {
                    match("namespace"); 


                    }
                    break;
                case 39 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:242:350: 'new'
                    {
                    match("new"); 


                    }
                    break;
                case 40 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:242:356: 'noexcept'
                    {
                    match("noexcept"); 


                    }
                    break;
                case 41 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:242:367: 'nullptr'
                    {
                    match("nullptr"); 


                    }
                    break;
                case 42 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:242:377: 'operator'
                    {
                    match("operator"); 


                    }
                    break;
                case 43 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:242:388: 'private'
                    {
                    match("private"); 


                    }
                    break;
                case 44 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:242:398: 'protected'
                    {
                    match("protected"); 


                    }
                    break;
                case 45 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:242:410: 'public'
                    {
                    match("public"); 


                    }
                    break;
                case 46 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:242:419: 'register'
                    {
                    match("register"); 


                    }
                    break;
                case 47 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:242:430: 'reinterpret_cast'
                    {
                    match("reinterpret_cast"); 


                    }
                    break;
                case 48 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:242:449: 'return'
                    {
                    match("return"); 


                    }
                    break;
                case 49 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:242:458: 'short'
                    {
                    match("short"); 


                    }
                    break;
                case 50 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:242:466: 'signed'
                    {
                    match("signed"); 


                    }
                    break;
                case 51 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:242:475: 'sizeof'
                    {
                    match("sizeof"); 


                    }
                    break;
                case 52 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:242:484: 'static'
                    {
                    match("static"); 


                    }
                    break;
                case 53 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:242:493: 'static_assert'
                    {
                    match("static_assert"); 


                    }
                    break;
                case 54 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:242:509: 'static_cast'
                    {
                    match("static_cast"); 


                    }
                    break;
                case 55 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:242:523: 'struct'
                    {
                    match("struct"); 


                    }
                    break;
                case 56 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:242:532: 'switch'
                    {
                    match("switch"); 


                    }
                    break;
                case 57 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:242:541: 'template'
                    {
                    match("template"); 


                    }
                    break;
                case 58 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:242:552: 'this'
                    {
                    match("this"); 


                    }
                    break;
                case 59 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:242:559: 'thread_local'
                    {
                    match("thread_local"); 


                    }
                    break;
                case 60 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:242:574: 'throw'
                    {
                    match("throw"); 


                    }
                    break;
                case 61 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:242:582: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 62 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:242:589: 'try'
                    {
                    match("try"); 


                    }
                    break;
                case 63 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:242:595: 'typedef'
                    {
                    match("typedef"); 


                    }
                    break;
                case 64 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:242:605: 'typeid'
                    {
                    match("typeid"); 


                    }
                    break;
                case 65 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:242:614: 'typename'
                    {
                    match("typename"); 


                    }
                    break;
                case 66 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:242:625: 'union'
                    {
                    match("union"); 


                    }
                    break;
                case 67 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:242:633: 'unsigned'
                    {
                    match("unsigned"); 


                    }
                    break;
                case 68 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:242:644: 'using'
                    {
                    match("using"); 


                    }
                    break;
                case 69 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:242:652: 'virtual'
                    {
                    match("virtual"); 


                    }
                    break;
                case 70 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:242:662: 'void'
                    {
                    match("void"); 


                    }
                    break;
                case 71 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:242:669: 'volatile'
                    {
                    match("volatile"); 


                    }
                    break;
                case 72 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:242:680: 'wchar_t'
                    {
                    match("wchar_t"); 


                    }
                    break;
                case 73 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:242:690: 'while'
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

    // $ANTLR start "RULE_PREPROCESSING_OP_OR_PUNC"
    public final void mRULE_PREPROCESSING_OP_OR_PUNC() throws RecognitionException {
        try {
            int _type = RULE_PREPROCESSING_OP_OR_PUNC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:244:31: ( ( '{' | '}' | '[' | ']' | '#' | '##' | '(' | ')' | '<:' | ':>' | '<%' | '%>' | '%:' | '%:%:' | ';' | ':' | '...' | 'new' | 'delete' | '?' | '::' | '.' | '.*' | '+' | '-' | '*' | '/' | '%' | '^' | '&' | '|' | '~' | '!' | '=' | '<' | '>' | '+=' | '-=' | '*=' | '/=' | '%=' | '^=' | '&=' | '|=' | '<<' | '>>' | '<<=' | '>>=' | '==' | '!=' | '<=' | '>=' | '&&' | '||' | '++' | '--' | ',' | '->*' | '->' | 'and' | 'and_eq' | 'bitand' | 'bitor' | 'compl' | 'not' | 'not_eq' | 'or' | 'or_eq' | 'xor' | 'xor_eq' ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:244:33: ( '{' | '}' | '[' | ']' | '#' | '##' | '(' | ')' | '<:' | ':>' | '<%' | '%>' | '%:' | '%:%:' | ';' | ':' | '...' | 'new' | 'delete' | '?' | '::' | '.' | '.*' | '+' | '-' | '*' | '/' | '%' | '^' | '&' | '|' | '~' | '!' | '=' | '<' | '>' | '+=' | '-=' | '*=' | '/=' | '%=' | '^=' | '&=' | '|=' | '<<' | '>>' | '<<=' | '>>=' | '==' | '!=' | '<=' | '>=' | '&&' | '||' | '++' | '--' | ',' | '->*' | '->' | 'and' | 'and_eq' | 'bitand' | 'bitor' | 'compl' | 'not' | 'not_eq' | 'or' | 'or_eq' | 'xor' | 'xor_eq' )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:244:33: ( '{' | '}' | '[' | ']' | '#' | '##' | '(' | ')' | '<:' | ':>' | '<%' | '%>' | '%:' | '%:%:' | ';' | ':' | '...' | 'new' | 'delete' | '?' | '::' | '.' | '.*' | '+' | '-' | '*' | '/' | '%' | '^' | '&' | '|' | '~' | '!' | '=' | '<' | '>' | '+=' | '-=' | '*=' | '/=' | '%=' | '^=' | '&=' | '|=' | '<<' | '>>' | '<<=' | '>>=' | '==' | '!=' | '<=' | '>=' | '&&' | '||' | '++' | '--' | ',' | '->*' | '->' | 'and' | 'and_eq' | 'bitand' | 'bitor' | 'compl' | 'not' | 'not_eq' | 'or' | 'or_eq' | 'xor' | 'xor_eq' )
            int alt6=70;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:244:34: '{'
                    {
                    match('{'); 

                    }
                    break;
                case 2 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:244:38: '}'
                    {
                    match('}'); 

                    }
                    break;
                case 3 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:244:42: '['
                    {
                    match('['); 

                    }
                    break;
                case 4 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:244:46: ']'
                    {
                    match(']'); 

                    }
                    break;
                case 5 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:244:50: '#'
                    {
                    match('#'); 

                    }
                    break;
                case 6 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:244:54: '##'
                    {
                    match("##"); 


                    }
                    break;
                case 7 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:244:59: '('
                    {
                    match('('); 

                    }
                    break;
                case 8 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:244:63: ')'
                    {
                    match(')'); 

                    }
                    break;
                case 9 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:244:67: '<:'
                    {
                    match("<:"); 


                    }
                    break;
                case 10 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:244:72: ':>'
                    {
                    match(":>"); 


                    }
                    break;
                case 11 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:244:77: '<%'
                    {
                    match("<%"); 


                    }
                    break;
                case 12 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:244:82: '%>'
                    {
                    match("%>"); 


                    }
                    break;
                case 13 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:244:87: '%:'
                    {
                    match("%:"); 


                    }
                    break;
                case 14 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:244:92: '%:%:'
                    {
                    match("%:%:"); 


                    }
                    break;
                case 15 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:244:99: ';'
                    {
                    match(';'); 

                    }
                    break;
                case 16 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:244:103: ':'
                    {
                    match(':'); 

                    }
                    break;
                case 17 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:244:107: '...'
                    {
                    match("..."); 


                    }
                    break;
                case 18 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:244:113: 'new'
                    {
                    match("new"); 


                    }
                    break;
                case 19 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:244:119: 'delete'
                    {
                    match("delete"); 


                    }
                    break;
                case 20 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:244:128: '?'
                    {
                    match('?'); 

                    }
                    break;
                case 21 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:244:132: '::'
                    {
                    match("::"); 


                    }
                    break;
                case 22 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:244:137: '.'
                    {
                    match('.'); 

                    }
                    break;
                case 23 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:244:141: '.*'
                    {
                    match(".*"); 


                    }
                    break;
                case 24 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:244:146: '+'
                    {
                    match('+'); 

                    }
                    break;
                case 25 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:244:150: '-'
                    {
                    match('-'); 

                    }
                    break;
                case 26 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:244:154: '*'
                    {
                    match('*'); 

                    }
                    break;
                case 27 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:244:158: '/'
                    {
                    match('/'); 

                    }
                    break;
                case 28 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:244:162: '%'
                    {
                    match('%'); 

                    }
                    break;
                case 29 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:244:166: '^'
                    {
                    match('^'); 

                    }
                    break;
                case 30 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:244:170: '&'
                    {
                    match('&'); 

                    }
                    break;
                case 31 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:244:174: '|'
                    {
                    match('|'); 

                    }
                    break;
                case 32 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:244:178: '~'
                    {
                    match('~'); 

                    }
                    break;
                case 33 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:244:182: '!'
                    {
                    match('!'); 

                    }
                    break;
                case 34 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:244:186: '='
                    {
                    match('='); 

                    }
                    break;
                case 35 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:244:190: '<'
                    {
                    match('<'); 

                    }
                    break;
                case 36 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:244:194: '>'
                    {
                    match('>'); 

                    }
                    break;
                case 37 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:244:198: '+='
                    {
                    match("+="); 


                    }
                    break;
                case 38 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:244:203: '-='
                    {
                    match("-="); 


                    }
                    break;
                case 39 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:244:208: '*='
                    {
                    match("*="); 


                    }
                    break;
                case 40 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:244:213: '/='
                    {
                    match("/="); 


                    }
                    break;
                case 41 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:244:218: '%='
                    {
                    match("%="); 


                    }
                    break;
                case 42 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:244:223: '^='
                    {
                    match("^="); 


                    }
                    break;
                case 43 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:244:228: '&='
                    {
                    match("&="); 


                    }
                    break;
                case 44 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:244:233: '|='
                    {
                    match("|="); 


                    }
                    break;
                case 45 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:244:238: '<<'
                    {
                    match("<<"); 


                    }
                    break;
                case 46 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:244:243: '>>'
                    {
                    match(">>"); 


                    }
                    break;
                case 47 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:244:248: '<<='
                    {
                    match("<<="); 


                    }
                    break;
                case 48 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:244:254: '>>='
                    {
                    match(">>="); 


                    }
                    break;
                case 49 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:244:260: '=='
                    {
                    match("=="); 


                    }
                    break;
                case 50 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:244:265: '!='
                    {
                    match("!="); 


                    }
                    break;
                case 51 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:244:270: '<='
                    {
                    match("<="); 


                    }
                    break;
                case 52 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:244:275: '>='
                    {
                    match(">="); 


                    }
                    break;
                case 53 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:244:280: '&&'
                    {
                    match("&&"); 


                    }
                    break;
                case 54 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:244:285: '||'
                    {
                    match("||"); 


                    }
                    break;
                case 55 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:244:290: '++'
                    {
                    match("++"); 


                    }
                    break;
                case 56 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:244:295: '--'
                    {
                    match("--"); 


                    }
                    break;
                case 57 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:244:300: ','
                    {
                    match(','); 

                    }
                    break;
                case 58 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:244:304: '->*'
                    {
                    match("->*"); 


                    }
                    break;
                case 59 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:244:310: '->'
                    {
                    match("->"); 


                    }
                    break;
                case 60 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:244:315: 'and'
                    {
                    match("and"); 


                    }
                    break;
                case 61 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:244:321: 'and_eq'
                    {
                    match("and_eq"); 


                    }
                    break;
                case 62 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:244:330: 'bitand'
                    {
                    match("bitand"); 


                    }
                    break;
                case 63 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:244:339: 'bitor'
                    {
                    match("bitor"); 


                    }
                    break;
                case 64 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:244:347: 'compl'
                    {
                    match("compl"); 


                    }
                    break;
                case 65 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:244:355: 'not'
                    {
                    match("not"); 


                    }
                    break;
                case 66 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:244:361: 'not_eq'
                    {
                    match("not_eq"); 


                    }
                    break;
                case 67 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:244:370: 'or'
                    {
                    match("or"); 


                    }
                    break;
                case 68 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:244:375: 'or_eq'
                    {
                    match("or_eq"); 


                    }
                    break;
                case 69 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:244:383: 'xor'
                    {
                    match("xor"); 


                    }
                    break;
                case 70 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:244:389: 'xor_eq'
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
    // $ANTLR end "RULE_PREPROCESSING_OP_OR_PUNC"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:246:10: ( ( RULE_DECIMAL_LITERAL | RULE_OCTAL_LITERAL | RULE_HEXADECIMAL_LITERAL ) ( RULE_INTEGER_SUFFIX )? )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:246:12: ( RULE_DECIMAL_LITERAL | RULE_OCTAL_LITERAL | RULE_HEXADECIMAL_LITERAL ) ( RULE_INTEGER_SUFFIX )?
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:246:12: ( RULE_DECIMAL_LITERAL | RULE_OCTAL_LITERAL | RULE_HEXADECIMAL_LITERAL )
            int alt7=3;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>='1' && LA7_0<='9')) ) {
                alt7=1;
            }
            else if ( (LA7_0=='0') ) {
                int LA7_2 = input.LA(2);

                if ( (LA7_2=='X'||LA7_2=='x') ) {
                    alt7=3;
                }
                else {
                    alt7=2;}
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:246:13: RULE_DECIMAL_LITERAL
                    {
                    mRULE_DECIMAL_LITERAL(); 

                    }
                    break;
                case 2 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:246:34: RULE_OCTAL_LITERAL
                    {
                    mRULE_OCTAL_LITERAL(); 

                    }
                    break;
                case 3 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:246:53: RULE_HEXADECIMAL_LITERAL
                    {
                    mRULE_HEXADECIMAL_LITERAL(); 

                    }
                    break;

            }

            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:246:79: ( RULE_INTEGER_SUFFIX )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='L'||LA8_0=='U'||LA8_0=='l'||LA8_0=='u') ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:246:79: RULE_INTEGER_SUFFIX
                    {
                    mRULE_INTEGER_SUFFIX(); 

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
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_DECIMAL_LITERAL"
    public final void mRULE_DECIMAL_LITERAL() throws RecognitionException {
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:248:31: ( '1' .. '9' ( RULE_DIGIT )* )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:248:33: '1' .. '9' ( RULE_DIGIT )*
            {
            matchRange('1','9'); 
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:248:42: ( RULE_DIGIT )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='0' && LA9_0<='9')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:248:42: RULE_DIGIT
            	    {
            	    mRULE_DIGIT(); 

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_DECIMAL_LITERAL"

    // $ANTLR start "RULE_OCTAL_LITERAL"
    public final void mRULE_OCTAL_LITERAL() throws RecognitionException {
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:250:29: ( '0' ( RULE_OCTAL_DIGIT )* )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:250:31: '0' ( RULE_OCTAL_DIGIT )*
            {
            match('0'); 
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:250:35: ( RULE_OCTAL_DIGIT )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='0' && LA10_0<='7')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:250:35: RULE_OCTAL_DIGIT
            	    {
            	    mRULE_OCTAL_DIGIT(); 

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_OCTAL_LITERAL"

    // $ANTLR start "RULE_HEXADECIMAL_LITERAL"
    public final void mRULE_HEXADECIMAL_LITERAL() throws RecognitionException {
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:252:35: ( ( '0x' | '0X' ) ( RULE_HEXADECIMAL_DIGIT )+ )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:252:37: ( '0x' | '0X' ) ( RULE_HEXADECIMAL_DIGIT )+
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:252:37: ( '0x' | '0X' )
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
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:252:38: '0x'
                    {
                    match("0x"); 


                    }
                    break;
                case 2 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:252:43: '0X'
                    {
                    match("0X"); 


                    }
                    break;

            }

            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:252:49: ( RULE_HEXADECIMAL_DIGIT )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='0' && LA12_0<='9')||(LA12_0>='A' && LA12_0<='F')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:252:49: RULE_HEXADECIMAL_DIGIT
            	    {
            	    mRULE_HEXADECIMAL_DIGIT(); 

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


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_HEXADECIMAL_LITERAL"

    // $ANTLR start "RULE_OCTAL_DIGIT"
    public final void mRULE_OCTAL_DIGIT() throws RecognitionException {
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:254:27: ( '0' .. '7' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:254:29: '0' .. '7'
            {
            matchRange('0','7'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_OCTAL_DIGIT"

    // $ANTLR start "RULE_HEXADECIMAL_DIGIT"
    public final void mRULE_HEXADECIMAL_DIGIT() throws RecognitionException {
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:256:33: ( ( '0' .. '9' | 'A' .. 'F' ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:256:35: ( '0' .. '9' | 'A' .. 'F' )
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_HEXADECIMAL_DIGIT"

    // $ANTLR start "RULE_INTEGER_SUFFIX"
    public final void mRULE_INTEGER_SUFFIX() throws RecognitionException {
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:258:30: ( ( ( 'u' | 'U' ) ( 'l' | 'L' | 'll' | 'LL' )? | ( 'l' | 'L' | 'll' | 'LL' ) ( 'u' | 'U' )? ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:258:32: ( ( 'u' | 'U' ) ( 'l' | 'L' | 'll' | 'LL' )? | ( 'l' | 'L' | 'll' | 'LL' ) ( 'u' | 'U' )? )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:258:32: ( ( 'u' | 'U' ) ( 'l' | 'L' | 'll' | 'LL' )? | ( 'l' | 'L' | 'll' | 'LL' ) ( 'u' | 'U' )? )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0=='U'||LA16_0=='u') ) {
                alt16=1;
            }
            else if ( (LA16_0=='L'||LA16_0=='l') ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:258:33: ( 'u' | 'U' ) ( 'l' | 'L' | 'll' | 'LL' )?
                    {
                    if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:258:43: ( 'l' | 'L' | 'll' | 'LL' )?
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
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:258:44: 'l'
                            {
                            match('l'); 

                            }
                            break;
                        case 2 :
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:258:48: 'L'
                            {
                            match('L'); 

                            }
                            break;
                        case 3 :
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:258:52: 'll'
                            {
                            match("ll"); 


                            }
                            break;
                        case 4 :
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:258:57: 'LL'
                            {
                            match("LL"); 


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:258:64: ( 'l' | 'L' | 'll' | 'LL' ) ( 'u' | 'U' )?
                    {
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:258:64: ( 'l' | 'L' | 'll' | 'LL' )
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
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:258:65: 'l'
                            {
                            match('l'); 

                            }
                            break;
                        case 2 :
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:258:69: 'L'
                            {
                            match('L'); 

                            }
                            break;
                        case 3 :
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:258:73: 'll'
                            {
                            match("ll"); 


                            }
                            break;
                        case 4 :
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:258:78: 'LL'
                            {
                            match("LL"); 


                            }
                            break;

                    }

                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:258:84: ( 'u' | 'U' )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0=='U'||LA15_0=='u') ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:
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

        }
        finally {
        }
    }
    // $ANTLR end "RULE_INTEGER_SUFFIX"

    // $ANTLR start "RULE_CHARACTER_LITERAL"
    public final void mRULE_CHARACTER_LITERAL() throws RecognitionException {
        try {
            int _type = RULE_CHARACTER_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:260:24: ( ( 'u' | 'U' | 'L' )? '\\'' ( RULE_C_CHAR )+ '\\'' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:260:26: ( 'u' | 'U' | 'L' )? '\\'' ( RULE_C_CHAR )+ '\\''
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:260:26: ( 'u' | 'U' | 'L' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0=='L'||LA17_0=='U'||LA17_0=='u') ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:
                    {
                    if ( input.LA(1)=='L'||input.LA(1)=='U'||input.LA(1)=='u' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }

            match('\''); 
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:260:46: ( RULE_C_CHAR )+
            int cnt18=0;
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>='\u0000' && LA18_0<='\t')||(LA18_0>='\u000B' && LA18_0<='&')||(LA18_0>='(' && LA18_0<='\uFFFF')) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:260:46: RULE_C_CHAR
            	    {
            	    mRULE_C_CHAR(); 

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

            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_CHARACTER_LITERAL"

    // $ANTLR start "RULE_C_CHAR"
    public final void mRULE_C_CHAR() throws RecognitionException {
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:262:22: ( (~ ( ( '\\'' | '\\\\' | '\\n' ) ) | RULE_ESCAPE_SEQUENCE | RULE_UNIVERSAL_CHARACTER_NAME ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:262:24: (~ ( ( '\\'' | '\\\\' | '\\n' ) ) | RULE_ESCAPE_SEQUENCE | RULE_UNIVERSAL_CHARACTER_NAME )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:262:24: (~ ( ( '\\'' | '\\\\' | '\\n' ) ) | RULE_ESCAPE_SEQUENCE | RULE_UNIVERSAL_CHARACTER_NAME )
            int alt19=3;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>='\u0000' && LA19_0<='\t')||(LA19_0>='\u000B' && LA19_0<='&')||(LA19_0>='(' && LA19_0<='[')||(LA19_0>=']' && LA19_0<='\uFFFF')) ) {
                alt19=1;
            }
            else if ( (LA19_0=='\\') ) {
                int LA19_2 = input.LA(2);

                if ( (LA19_2=='\"'||LA19_2=='\''||(LA19_2>='0' && LA19_2<='7')||LA19_2=='?'||LA19_2=='\\'||(LA19_2>='a' && LA19_2<='b')||LA19_2=='f'||LA19_2=='n'||LA19_2=='r'||LA19_2=='t'||LA19_2=='v'||LA19_2=='x') ) {
                    alt19=2;
                }
                else if ( (LA19_2=='U'||LA19_2=='u') ) {
                    alt19=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:262:25: ~ ( ( '\\'' | '\\\\' | '\\n' ) )
                    {
                    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;
                case 2 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:262:45: RULE_ESCAPE_SEQUENCE
                    {
                    mRULE_ESCAPE_SEQUENCE(); 

                    }
                    break;
                case 3 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:262:66: RULE_UNIVERSAL_CHARACTER_NAME
                    {
                    mRULE_UNIVERSAL_CHARACTER_NAME(); 

                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_C_CHAR"

    // $ANTLR start "RULE_ESCAPE_SEQUENCE"
    public final void mRULE_ESCAPE_SEQUENCE() throws RecognitionException {
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:264:31: ( ( RULE_SIMPLE_ESCAPE_SEQUENCE | RULE_OCTAL_ESCAPE_SEQUENCE | RULE_HEXADECIMAL_ESCAPE_SEQUENCE ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:264:33: ( RULE_SIMPLE_ESCAPE_SEQUENCE | RULE_OCTAL_ESCAPE_SEQUENCE | RULE_HEXADECIMAL_ESCAPE_SEQUENCE )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:264:33: ( RULE_SIMPLE_ESCAPE_SEQUENCE | RULE_OCTAL_ESCAPE_SEQUENCE | RULE_HEXADECIMAL_ESCAPE_SEQUENCE )
            int alt20=3;
            int LA20_0 = input.LA(1);

            if ( (LA20_0=='\\') ) {
                switch ( input.LA(2) ) {
                case '\"':
                case '\'':
                case '?':
                case '\\':
                case 'a':
                case 'b':
                case 'f':
                case 'n':
                case 'r':
                case 't':
                case 'v':
                    {
                    alt20=1;
                    }
                    break;
                case 'x':
                    {
                    alt20=3;
                    }
                    break;
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                    {
                    alt20=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:264:34: RULE_SIMPLE_ESCAPE_SEQUENCE
                    {
                    mRULE_SIMPLE_ESCAPE_SEQUENCE(); 

                    }
                    break;
                case 2 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:264:62: RULE_OCTAL_ESCAPE_SEQUENCE
                    {
                    mRULE_OCTAL_ESCAPE_SEQUENCE(); 

                    }
                    break;
                case 3 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:264:89: RULE_HEXADECIMAL_ESCAPE_SEQUENCE
                    {
                    mRULE_HEXADECIMAL_ESCAPE_SEQUENCE(); 

                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_ESCAPE_SEQUENCE"

    // $ANTLR start "RULE_SIMPLE_ESCAPE_SEQUENCE"
    public final void mRULE_SIMPLE_ESCAPE_SEQUENCE() throws RecognitionException {
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:266:38: ( '\\\\' ( '\\'' | '\"' | '?' | '\\\\' | 'a' | 'b' | 'f' | 'n' | 'r' | 't' | 'v' ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:266:40: '\\\\' ( '\\'' | '\"' | '?' | '\\\\' | 'a' | 'b' | 'f' | 'n' | 'r' | 't' | 'v' )
            {
            match('\\'); 
            if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='?'||input.LA(1)=='\\'||(input.LA(1)>='a' && input.LA(1)<='b')||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t'||input.LA(1)=='v' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_SIMPLE_ESCAPE_SEQUENCE"

    // $ANTLR start "RULE_OCTAL_ESCAPE_SEQUENCE"
    public final void mRULE_OCTAL_ESCAPE_SEQUENCE() throws RecognitionException {
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:268:37: ( '\\\\' RULE_OCTAL_DIGIT RULE_OCTAL_DIGIT RULE_OCTAL_DIGIT )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:268:39: '\\\\' RULE_OCTAL_DIGIT RULE_OCTAL_DIGIT RULE_OCTAL_DIGIT
            {
            match('\\'); 
            mRULE_OCTAL_DIGIT(); 
            mRULE_OCTAL_DIGIT(); 
            mRULE_OCTAL_DIGIT(); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_OCTAL_ESCAPE_SEQUENCE"

    // $ANTLR start "RULE_HEXADECIMAL_ESCAPE_SEQUENCE"
    public final void mRULE_HEXADECIMAL_ESCAPE_SEQUENCE() throws RecognitionException {
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:270:43: ( '\\\\x' ( RULE_HEXADECIMAL_DIGIT )+ )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:270:45: '\\\\x' ( RULE_HEXADECIMAL_DIGIT )+
            {
            match("\\x"); 

            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:270:51: ( RULE_HEXADECIMAL_DIGIT )+
            int cnt21=0;
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>='0' && LA21_0<='9')||(LA21_0>='A' && LA21_0<='F')) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:270:51: RULE_HEXADECIMAL_DIGIT
            	    {
            	    mRULE_HEXADECIMAL_DIGIT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt21 >= 1 ) break loop21;
                        EarlyExitException eee =
                            new EarlyExitException(21, input);
                        throw eee;
                }
                cnt21++;
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_HEXADECIMAL_ESCAPE_SEQUENCE"

    // $ANTLR start "RULE_FLOATING_LITERAL"
    public final void mRULE_FLOATING_LITERAL() throws RecognitionException {
        try {
            int _type = RULE_FLOATING_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:272:23: ( ( RULE_FRACTIONAL_CONSTANT ( RULE_EXPONENT_PART )? | ( RULE_DIGIT )+ RULE_EXPONENT_PART ) ( 'f' | 'l' | 'F' | 'L' )? )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:272:25: ( RULE_FRACTIONAL_CONSTANT ( RULE_EXPONENT_PART )? | ( RULE_DIGIT )+ RULE_EXPONENT_PART ) ( 'f' | 'l' | 'F' | 'L' )?
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:272:25: ( RULE_FRACTIONAL_CONSTANT ( RULE_EXPONENT_PART )? | ( RULE_DIGIT )+ RULE_EXPONENT_PART )
            int alt24=2;
            alt24 = dfa24.predict(input);
            switch (alt24) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:272:26: RULE_FRACTIONAL_CONSTANT ( RULE_EXPONENT_PART )?
                    {
                    mRULE_FRACTIONAL_CONSTANT(); 
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:272:51: ( RULE_EXPONENT_PART )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0=='E'||LA22_0=='e') ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:272:51: RULE_EXPONENT_PART
                            {
                            mRULE_EXPONENT_PART(); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:272:71: ( RULE_DIGIT )+ RULE_EXPONENT_PART
                    {
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:272:71: ( RULE_DIGIT )+
                    int cnt23=0;
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( ((LA23_0>='0' && LA23_0<='9')) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:272:71: RULE_DIGIT
                    	    {
                    	    mRULE_DIGIT(); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt23 >= 1 ) break loop23;
                                EarlyExitException eee =
                                    new EarlyExitException(23, input);
                                throw eee;
                        }
                        cnt23++;
                    } while (true);

                    mRULE_EXPONENT_PART(); 

                    }
                    break;

            }

            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:272:103: ( 'f' | 'l' | 'F' | 'L' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0=='F'||LA25_0=='L'||LA25_0=='f'||LA25_0=='l') ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:
                    {
                    if ( input.LA(1)=='F'||input.LA(1)=='L'||input.LA(1)=='f'||input.LA(1)=='l' ) {
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
    // $ANTLR end "RULE_FLOATING_LITERAL"

    // $ANTLR start "RULE_FRACTIONAL_CONSTANT"
    public final void mRULE_FRACTIONAL_CONSTANT() throws RecognitionException {
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:274:35: ( ( ( RULE_DIGIT )* '.' ( RULE_DIGIT )+ | ( RULE_DIGIT )+ '.' ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:274:37: ( ( RULE_DIGIT )* '.' ( RULE_DIGIT )+ | ( RULE_DIGIT )+ '.' )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:274:37: ( ( RULE_DIGIT )* '.' ( RULE_DIGIT )+ | ( RULE_DIGIT )+ '.' )
            int alt29=2;
            alt29 = dfa29.predict(input);
            switch (alt29) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:274:38: ( RULE_DIGIT )* '.' ( RULE_DIGIT )+
                    {
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:274:38: ( RULE_DIGIT )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( ((LA26_0>='0' && LA26_0<='9')) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:274:38: RULE_DIGIT
                    	    {
                    	    mRULE_DIGIT(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop26;
                        }
                    } while (true);

                    match('.'); 
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:274:54: ( RULE_DIGIT )+
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
                    	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:274:54: RULE_DIGIT
                    	    {
                    	    mRULE_DIGIT(); 

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
                    break;
                case 2 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:274:66: ( RULE_DIGIT )+ '.'
                    {
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:274:66: ( RULE_DIGIT )+
                    int cnt28=0;
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( ((LA28_0>='0' && LA28_0<='9')) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:274:66: RULE_DIGIT
                    	    {
                    	    mRULE_DIGIT(); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt28 >= 1 ) break loop28;
                                EarlyExitException eee =
                                    new EarlyExitException(28, input);
                                throw eee;
                        }
                        cnt28++;
                    } while (true);

                    match('.'); 

                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_FRACTIONAL_CONSTANT"

    // $ANTLR start "RULE_EXPONENT_PART"
    public final void mRULE_EXPONENT_PART() throws RecognitionException {
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:276:29: ( ( 'e' | 'E' ) ( '+' | '-' )? ( RULE_DIGIT )+ )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:276:31: ( 'e' | 'E' ) ( '+' | '-' )? ( RULE_DIGIT )+
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:276:41: ( '+' | '-' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0=='+'||LA30_0=='-') ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:
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

            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:276:52: ( RULE_DIGIT )+
            int cnt31=0;
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( ((LA31_0>='0' && LA31_0<='9')) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:276:52: RULE_DIGIT
            	    {
            	    mRULE_DIGIT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt31 >= 1 ) break loop31;
                        EarlyExitException eee =
                            new EarlyExitException(31, input);
                        throw eee;
                }
                cnt31++;
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_EXPONENT_PART"

    // $ANTLR start "RULE_STRING_LITERAL"
    public final void mRULE_STRING_LITERAL() throws RecognitionException {
        try {
            int _type = RULE_STRING_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:278:21: ( ( RULE_ENC_PREFIX )? '\"' ( RULE_SCHAR )+ '\"' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:278:23: ( RULE_ENC_PREFIX )? '\"' ( RULE_SCHAR )+ '\"'
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:278:23: ( RULE_ENC_PREFIX )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0=='L'||LA32_0=='U'||LA32_0=='u') ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:278:23: RULE_ENC_PREFIX
                    {
                    mRULE_ENC_PREFIX(); 

                    }
                    break;

            }

            match('\"'); 
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:278:44: ( RULE_SCHAR )+
            int cnt33=0;
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( ((LA33_0>='\u0000' && LA33_0<='\t')||(LA33_0>='\u000B' && LA33_0<='!')||(LA33_0>='#' && LA33_0<='\uFFFF')) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:278:44: RULE_SCHAR
            	    {
            	    mRULE_SCHAR(); 

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

            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING_LITERAL"

    // $ANTLR start "RULE_ENC_PREFIX"
    public final void mRULE_ENC_PREFIX() throws RecognitionException {
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:280:26: ( ( 'u8' | 'u' | 'U' | 'L' ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:280:28: ( 'u8' | 'u' | 'U' | 'L' )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:280:28: ( 'u8' | 'u' | 'U' | 'L' )
            int alt34=4;
            switch ( input.LA(1) ) {
            case 'u':
                {
                int LA34_1 = input.LA(2);

                if ( (LA34_1=='8') ) {
                    alt34=1;
                }
                else {
                    alt34=2;}
                }
                break;
            case 'U':
                {
                alt34=3;
                }
                break;
            case 'L':
                {
                alt34=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }

            switch (alt34) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:280:29: 'u8'
                    {
                    match("u8"); 


                    }
                    break;
                case 2 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:280:34: 'u'
                    {
                    match('u'); 

                    }
                    break;
                case 3 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:280:38: 'U'
                    {
                    match('U'); 

                    }
                    break;
                case 4 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:280:42: 'L'
                    {
                    match('L'); 

                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_ENC_PREFIX"

    // $ANTLR start "RULE_SCHAR"
    public final void mRULE_SCHAR() throws RecognitionException {
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:282:21: ( (~ ( ( '\"' | '\\\\' | '\\n' ) ) | RULE_ESCAPE_SEQUENCE | RULE_UNIVERSAL_CHARACTER_NAME ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:282:23: (~ ( ( '\"' | '\\\\' | '\\n' ) ) | RULE_ESCAPE_SEQUENCE | RULE_UNIVERSAL_CHARACTER_NAME )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:282:23: (~ ( ( '\"' | '\\\\' | '\\n' ) ) | RULE_ESCAPE_SEQUENCE | RULE_UNIVERSAL_CHARACTER_NAME )
            int alt35=3;
            int LA35_0 = input.LA(1);

            if ( ((LA35_0>='\u0000' && LA35_0<='\t')||(LA35_0>='\u000B' && LA35_0<='!')||(LA35_0>='#' && LA35_0<='[')||(LA35_0>=']' && LA35_0<='\uFFFF')) ) {
                alt35=1;
            }
            else if ( (LA35_0=='\\') ) {
                int LA35_2 = input.LA(2);

                if ( (LA35_2=='\"'||LA35_2=='\''||(LA35_2>='0' && LA35_2<='7')||LA35_2=='?'||LA35_2=='\\'||(LA35_2>='a' && LA35_2<='b')||LA35_2=='f'||LA35_2=='n'||LA35_2=='r'||LA35_2=='t'||LA35_2=='v'||LA35_2=='x') ) {
                    alt35=2;
                }
                else if ( (LA35_2=='U'||LA35_2=='u') ) {
                    alt35=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 35, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:282:24: ~ ( ( '\"' | '\\\\' | '\\n' ) )
                    {
                    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;
                case 2 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:282:43: RULE_ESCAPE_SEQUENCE
                    {
                    mRULE_ESCAPE_SEQUENCE(); 

                    }
                    break;
                case 3 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:282:64: RULE_UNIVERSAL_CHARACTER_NAME
                    {
                    mRULE_UNIVERSAL_CHARACTER_NAME(); 

                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_SCHAR"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:284:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:284:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:284:11: ( '^' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0=='^') ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:284:11: '^'
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

            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:284:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( ((LA37_0>='0' && LA37_0<='9')||(LA37_0>='A' && LA37_0<='Z')||LA37_0=='_'||(LA37_0>='a' && LA37_0<='z')) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:
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
            	    break loop37;
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
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:286:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:286:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:286:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0=='\"') ) {
                alt40=1;
            }
            else if ( (LA40_0=='\'') ) {
                alt40=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:286:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:286:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop38:
                    do {
                        int alt38=3;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0=='\\') ) {
                            alt38=1;
                        }
                        else if ( ((LA38_0>='\u0000' && LA38_0<='!')||(LA38_0>='#' && LA38_0<='[')||(LA38_0>=']' && LA38_0<='\uFFFF')) ) {
                            alt38=2;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:286:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:286:66: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop38;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:286:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:286:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop39:
                    do {
                        int alt39=3;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0=='\\') ) {
                            alt39=1;
                        }
                        else if ( ((LA39_0>='\u0000' && LA39_0<='&')||(LA39_0>='(' && LA39_0<='[')||(LA39_0>=']' && LA39_0<='\uFFFF')) ) {
                            alt39=2;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:286:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:286:137: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop39;
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
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:288:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:288:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:288:24: ( options {greedy=false; } : . )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0=='*') ) {
                    int LA41_1 = input.LA(2);

                    if ( (LA41_1=='/') ) {
                        alt41=2;
                    }
                    else if ( ((LA41_1>='\u0000' && LA41_1<='.')||(LA41_1>='0' && LA41_1<='\uFFFF')) ) {
                        alt41=1;
                    }


                }
                else if ( ((LA41_0>='\u0000' && LA41_0<=')')||(LA41_0>='+' && LA41_0<='\uFFFF')) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:288:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop41;
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
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:290:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:290:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:290:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( ((LA42_0>='\u0000' && LA42_0<='\t')||(LA42_0>='\u000B' && LA42_0<='\f')||(LA42_0>='\u000E' && LA42_0<='\uFFFF')) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:290:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop42;
                }
            } while (true);

            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:290:40: ( ( '\\r' )? '\\n' )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0=='\n'||LA44_0=='\r') ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:290:41: ( '\\r' )? '\\n'
                    {
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:290:41: ( '\\r' )?
                    int alt43=2;
                    int LA43_0 = input.LA(1);

                    if ( (LA43_0=='\r') ) {
                        alt43=1;
                    }
                    switch (alt43) {
                        case 1 :
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:290:41: '\\r'
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
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:292:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:292:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:292:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt45=0;
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( ((LA45_0>='\t' && LA45_0<='\n')||LA45_0=='\r'||LA45_0==' ') ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:
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
            	    if ( cnt45 >= 1 ) break loop45;
                        EarlyExitException eee =
                            new EarlyExitException(45, input);
                        throw eee;
                }
                cnt45++;
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
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:294:16: ( . )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:294:18: .
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
        // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:8: ( T__38 | T__39 | RULE_HEADER_NAME | RULE_DIGIT | RULE_NONDIGIT | RULE_KEYWORD | RULE_PREPROCESSING_OP_OR_PUNC | RULE_INT | RULE_CHARACTER_LITERAL | RULE_FLOATING_LITERAL | RULE_STRING_LITERAL | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt46=17;
        alt46 = dfa46.predict(input);
        switch (alt46) {
            case 1 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:10: T__38
                {
                mT__38(); 

                }
                break;
            case 2 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:16: T__39
                {
                mT__39(); 

                }
                break;
            case 3 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:22: RULE_HEADER_NAME
                {
                mRULE_HEADER_NAME(); 

                }
                break;
            case 4 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:39: RULE_DIGIT
                {
                mRULE_DIGIT(); 

                }
                break;
            case 5 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:50: RULE_NONDIGIT
                {
                mRULE_NONDIGIT(); 

                }
                break;
            case 6 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:64: RULE_KEYWORD
                {
                mRULE_KEYWORD(); 

                }
                break;
            case 7 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:77: RULE_PREPROCESSING_OP_OR_PUNC
                {
                mRULE_PREPROCESSING_OP_OR_PUNC(); 

                }
                break;
            case 8 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:107: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 9 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:116: RULE_CHARACTER_LITERAL
                {
                mRULE_CHARACTER_LITERAL(); 

                }
                break;
            case 10 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:139: RULE_FLOATING_LITERAL
                {
                mRULE_FLOATING_LITERAL(); 

                }
                break;
            case 11 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:161: RULE_STRING_LITERAL
                {
                mRULE_STRING_LITERAL(); 

                }
                break;
            case 12 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:181: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 13 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:189: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 14 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:201: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 15 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:217: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 16 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:233: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 17 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:241: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA5 dfa5 = new DFA5(this);
    protected DFA6 dfa6 = new DFA6(this);
    protected DFA24 dfa24 = new DFA24(this);
    protected DFA29 dfa29 = new DFA29(this);
    protected DFA46 dfa46 = new DFA46(this);
    static final String DFA5_eotS =
        "\36\uffff\1\107\100\uffff\1\153\14\uffff\1\165\11\uffff\1\170\4"+
        "\uffff";
    static final String DFA5_eofS =
        "\173\uffff";
    static final String DFA5_minS =
        "\1\141\1\154\1\157\1\141\1\145\1\154\1\141\1\uffff\1\146\2\uffff"+
        "\1\141\1\uffff\1\162\1\145\1\150\1\145\1\156\1\151\1\143\1\151\4"+
        "\uffff\1\163\1\141\1\uffff\1\156\1\143\1\165\3\uffff\1\160\5\uffff"+
        "\1\154\4\uffff\1\151\1\uffff\1\147\1\uffff\1\147\1\141\2\uffff\1"+
        "\151\1\165\1\160\1\151\2\uffff\1\151\2\uffff\1\147\2\uffff\1\162"+
        "\1\163\5\uffff\1\154\12\uffff\1\164\2\uffff\1\145\2\uffff\1\145"+
        "\4\uffff\1\156\1\61\1\164\3\uffff\1\151\2\uffff\1\144\1\141\3\uffff"+
        "\1\137\1\143\10\uffff\1\137\1\141\3\uffff";
    static final String DFA5_maxS =
        "\1\167\1\165\1\162\1\157\1\171\1\170\1\162\1\uffff\1\156\2\uffff"+
        "\1\165\1\uffff\1\165\1\145\1\167\1\171\1\163\1\157\1\150\1\151\4"+
        "\uffff\1\164\1\141\1\uffff\1\156\1\154\1\165\3\uffff\1\164\5\uffff"+
        "\1\164\4\uffff\1\157\1\uffff\1\164\1\uffff\1\172\1\162\2\uffff\1"+
        "\162\1\171\1\160\1\163\2\uffff\1\154\2\uffff\1\147\2\uffff\1\162"+
        "\1\164\5\uffff\1\157\12\uffff\1\164\2\uffff\1\157\2\uffff\1\145"+
        "\4\uffff\1\156\1\63\1\164\3\uffff\1\151\2\uffff\1\156\1\157\3\uffff"+
        "\1\145\1\143\10\uffff\1\137\1\143\3\uffff";
    static final String DFA5_acceptS =
        "\7\uffff\1\40\1\uffff\1\44\1\45\1\uffff\1\52\10\uffff\1\3\1\4\1"+
        "\5\1\6\2\uffff\1\14\3\uffff\1\26\1\27\1\30\1\uffff\1\34\1\35\1\36"+
        "\1\37\1\41\1\uffff\1\46\1\47\1\50\1\51\1\uffff\1\55\1\uffff\1\61"+
        "\2\uffff\1\70\1\71\4\uffff\1\104\1\105\1\uffff\1\110\1\111\1\uffff"+
        "\1\7\1\10\2\uffff\1\21\1\22\1\23\1\25\1\24\1\uffff\1\33\1\42\1\43"+
        "\1\53\1\54\1\56\1\57\1\60\1\62\1\63\1\uffff\1\67\1\72\1\uffff\1"+
        "\75\1\76\1\uffff\1\102\1\103\1\106\1\107\3\uffff\1\20\1\31\1\32"+
        "\1\uffff\1\73\1\74\2\uffff\1\12\1\13\1\11\2\uffff\1\77\1\100\1\101"+
        "\1\1\1\2\1\16\1\17\1\15\2\uffff\1\64\1\65\1\66";
    static final String DFA5_specialS =
        "\173\uffff}>";
    static final String[] DFA5_transitionS = {
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
            return "242:16: ( 'alignas' | 'alignof' | 'asm' | 'auto' | 'bool' | 'break' | 'case' | 'catch' | 'char' | 'char16_t' | 'char32_t' | 'class' | 'const' | 'constexpr' | 'const_cast' | 'continue' | 'decltype' | 'default' | 'delete' | 'do' | 'double' | 'dynamic_cast' | 'else' | 'enum' | 'explicit' | 'export' | 'extern' | 'false' | 'float' | 'for' | 'friend' | 'goto' | 'if' | 'inline' | 'int' | 'long' | 'mutable' | 'namespace' | 'new' | 'noexcept' | 'nullptr' | 'operator' | 'private' | 'protected' | 'public' | 'register' | 'reinterpret_cast' | 'return' | 'short' | 'signed' | 'sizeof' | 'static' | 'static_assert' | 'static_cast' | 'struct' | 'switch' | 'template' | 'this' | 'thread_local' | 'throw' | 'true' | 'try' | 'typedef' | 'typeid' | 'typename' | 'union' | 'unsigned' | 'using' | 'virtual' | 'void' | 'volatile' | 'wchar_t' | 'while' )";
        }
    }
    static final String DFA6_eotS =
        "\5\uffff\1\42\2\uffff\1\47\1\52\1\56\1\uffff\1\61\3\uffff\1\66"+
        "\1\72\1\74\1\76\1\100\1\103\1\106\1\uffff\1\110\1\112\1\115\12\uffff"+
        "\1\123\6\uffff\1\125\14\uffff\1\130\21\uffff\1\132\4\uffff\1\136"+
        "\5\uffff\1\141\4\uffff\1\143\3\uffff\1\147\10\uffff";
    static final String DFA6_eofS =
        "\150\uffff";
    static final String DFA6_minS =
        "\1\41\4\uffff\1\43\2\uffff\1\45\2\72\1\uffff\1\52\1\145\2\uffff"+
        "\1\53\1\55\3\75\1\46\1\75\1\uffff\3\75\1\uffff\1\156\1\151\1\uffff"+
        "\1\162\1\157\4\uffff\1\75\6\uffff\1\45\6\uffff\1\164\5\uffff\1\52"+
        "\21\uffff\1\75\2\uffff\1\144\1\164\1\137\1\162\4\uffff\1\137\4\uffff"+
        "\1\137\1\141\2\uffff\1\137\10\uffff";
    static final String DFA6_maxS =
        "\1\176\4\uffff\1\43\2\uffff\1\75\2\76\1\uffff\1\56\1\157\2\uffff"+
        "\1\75\1\76\4\75\1\174\1\uffff\2\75\1\76\1\uffff\1\156\1\151\1\uffff"+
        "\1\162\1\157\4\uffff\1\75\6\uffff\1\45\6\uffff\1\164\5\uffff\1\52"+
        "\21\uffff\1\75\2\uffff\1\144\1\164\1\137\1\162\4\uffff\1\137\4\uffff"+
        "\1\137\1\157\2\uffff\1\137\10\uffff";
    static final String DFA6_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\uffff\1\7\1\10\3\uffff\1\17\2\uffff"+
        "\1\23\1\24\7\uffff\1\40\3\uffff\1\71\2\uffff\1\100\2\uffff\1\6\1"+
        "\5\1\11\1\13\1\uffff\1\63\1\43\1\12\1\25\1\20\1\14\1\uffff\1\51"+
        "\1\34\1\21\1\27\1\26\1\22\1\uffff\1\45\1\67\1\30\1\46\1\70\1\uffff"+
        "\1\31\1\47\1\32\1\50\1\33\1\52\1\35\1\53\1\65\1\36\1\54\1\66\1\37"+
        "\1\62\1\41\1\61\1\42\1\uffff\1\64\1\44\4\uffff\1\57\1\55\1\16\1"+
        "\15\1\uffff\1\72\1\73\1\60\1\56\2\uffff\1\104\1\103\1\uffff\1\102"+
        "\1\101\1\75\1\74\1\76\1\77\1\106\1\105";
    static final String DFA6_specialS =
        "\150\uffff}>";
    static final String[] DFA6_transitionS = {
            "\1\30\1\uffff\1\5\1\uffff\1\12\1\25\1\uffff\1\6\1\7\1\22\1"+
            "\20\1\33\1\21\1\14\1\23\12\uffff\1\11\1\13\1\10\1\31\1\32\1"+
            "\17\33\uffff\1\3\1\uffff\1\4\1\24\2\uffff\1\34\1\35\1\36\1\16"+
            "\11\uffff\1\15\1\37\10\uffff\1\40\2\uffff\1\1\1\26\1\2\1\27",
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

    static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
    static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
    static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
    static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
    static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
    static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
    static final short[][] DFA6_transition;

    static {
        int numStates = DFA6_transitionS.length;
        DFA6_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
        }
    }

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = DFA6_eot;
            this.eof = DFA6_eof;
            this.min = DFA6_min;
            this.max = DFA6_max;
            this.accept = DFA6_accept;
            this.special = DFA6_special;
            this.transition = DFA6_transition;
        }
        public String getDescription() {
            return "244:33: ( '{' | '}' | '[' | ']' | '#' | '##' | '(' | ')' | '<:' | ':>' | '<%' | '%>' | '%:' | '%:%:' | ';' | ':' | '...' | 'new' | 'delete' | '?' | '::' | '.' | '.*' | '+' | '-' | '*' | '/' | '%' | '^' | '&' | '|' | '~' | '!' | '=' | '<' | '>' | '+=' | '-=' | '*=' | '/=' | '%=' | '^=' | '&=' | '|=' | '<<' | '>>' | '<<=' | '>>=' | '==' | '!=' | '<=' | '>=' | '&&' | '||' | '++' | '--' | ',' | '->*' | '->' | 'and' | 'and_eq' | 'bitand' | 'bitor' | 'compl' | 'not' | 'not_eq' | 'or' | 'or_eq' | 'xor' | 'xor_eq' )";
        }
    }
    static final String DFA24_eotS =
        "\4\uffff";
    static final String DFA24_eofS =
        "\4\uffff";
    static final String DFA24_minS =
        "\2\56\2\uffff";
    static final String DFA24_maxS =
        "\1\71\1\145\2\uffff";
    static final String DFA24_acceptS =
        "\2\uffff\1\1\1\2";
    static final String DFA24_specialS =
        "\4\uffff}>";
    static final String[] DFA24_transitionS = {
            "\1\2\1\uffff\12\1",
            "\1\2\1\uffff\12\1\13\uffff\1\3\37\uffff\1\3",
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
            return "272:25: ( RULE_FRACTIONAL_CONSTANT ( RULE_EXPONENT_PART )? | ( RULE_DIGIT )+ RULE_EXPONENT_PART )";
        }
    }
    static final String DFA29_eotS =
        "\3\uffff\1\4\1\uffff";
    static final String DFA29_eofS =
        "\5\uffff";
    static final String DFA29_minS =
        "\2\56\1\uffff\1\60\1\uffff";
    static final String DFA29_maxS =
        "\2\71\1\uffff\1\71\1\uffff";
    static final String DFA29_acceptS =
        "\2\uffff\1\1\1\uffff\1\2";
    static final String DFA29_specialS =
        "\5\uffff}>";
    static final String[] DFA29_transitionS = {
            "\1\2\1\uffff\12\1",
            "\1\3\1\uffff\12\1",
            "",
            "\12\2",
            ""
    };

    static final short[] DFA29_eot = DFA.unpackEncodedString(DFA29_eotS);
    static final short[] DFA29_eof = DFA.unpackEncodedString(DFA29_eofS);
    static final char[] DFA29_min = DFA.unpackEncodedStringToUnsignedChars(DFA29_minS);
    static final char[] DFA29_max = DFA.unpackEncodedStringToUnsignedChars(DFA29_maxS);
    static final short[] DFA29_accept = DFA.unpackEncodedString(DFA29_acceptS);
    static final short[] DFA29_special = DFA.unpackEncodedString(DFA29_specialS);
    static final short[][] DFA29_transition;

    static {
        int numStates = DFA29_transitionS.length;
        DFA29_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA29_transition[i] = DFA.unpackEncodedString(DFA29_transitionS[i]);
        }
    }

    class DFA29 extends DFA {

        public DFA29(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 29;
            this.eot = DFA29_eot;
            this.eof = DFA29_eof;
            this.min = DFA29_min;
            this.max = DFA29_max;
            this.accept = DFA29_accept;
            this.special = DFA29_special;
            this.transition = DFA29_transition;
        }
        public String getDescription() {
            return "274:37: ( ( RULE_DIGIT )* '.' ( RULE_DIGIT )+ | ( RULE_DIGIT )+ '.' )";
        }
    }
    static final String DFA46_eotS =
        "\1\uffff\2\73\1\105\1\66\1\112\22\73\12\uffff\1\105\4\uffff\2\105"+
        "\7\uffff\1\73\1\112\1\73\1\66\1\73\2\uffff\4\74\2\uffff\4\74\4\105"+
        "\7\uffff\1\115\1\uffff\14\74\1\u00a5\5\74\1\u00a5\10\74\1\105\12"+
        "\74\2\uffff\5\74\2\uffff\1\115\3\uffff\1\74\1\u00a5\6\74\1\u00a5"+
        "\1\74\1\105\1\106\7\uffff\1\74\1\u00a5\1\74\1\105\15\74\1\uffff"+
        "\7\74\1\u00a5\3\74\1\u00a5\1\74\1\105\27\74\1\105\3\uffff\1\u011d"+
        "\1\74\1\u00a5\6\74\15\uffff\1\74\1\u00a5\1\74\1\u00a5\3\74\1\u00a5"+
        "\1\74\1\u00a5\11\74\2\u00a5\3\74\1\u00a5\1\74\1\u00a5\27\74\1\u00a5"+
        "\4\74\2\uffff\2\74\1\u00a5\3\74\1\u0167\1\u00a5\1\74\3\uffff\1\106"+
        "\1\uffff\1\106\4\uffff\2\74\1\u00a5\1\74\1\105\1\u00a5\2\74\2\u00a5"+
        "\1\74\1\105\17\74\1\105\6\74\1\u00a5\5\74\1\u00a5\1\74\1\u00a5\3"+
        "\74\1\u00a5\1\74\1\uffff\3\74\1\u00a5\1\74\1\uffff\1\u00a5\4\uffff"+
        "\2\74\2\105\7\74\2\u00a5\2\74\3\u00a5\3\74\1\105\4\74\1\u00a5\2"+
        "\74\6\u00a5\4\74\1\105\1\uffff\2\74\1\u00a5\1\74\4\uffff\2\u00a5"+
        "\6\74\1\u00a5\2\74\1\u00a5\2\74\1\u00a5\1\74\1\u00a5\5\74\1\u00a5"+
        "\1\74\1\u00a5\1\uffff\1\u00a5\1\74\1\u00a5\3\uffff\2\u00a5\2\74"+
        "\2\u00a5\1\74\1\u00a5\1\74\2\u00a5\1\74\1\u00a5\3\74\2\u00a5\1\74"+
        "\3\uffff\1\u00a5\2\74\2\u00a5\4\74\1\uffff\1\u00a5\5\74\1\uffff"+
        "\3\74\3\u00a5\3\74\1\u00a5\2\74\1\u00a5";
    static final String DFA46_eofS =
        "\u01f2\uffff";
    static final String DFA46_minS =
        "\1\0\2\60\2\0\1\56\16\60\1\42\3\60\12\uffff\1\60\4\uffff\1\52\1"+
        "\101\7\uffff\1\42\1\56\1\60\1\0\1\42\2\uffff\1\165\1\155\1\151\1"+
        "\160\2\uffff\1\154\1\157\1\162\1\151\4\0\2\uffff\2\0\3\uffff\1\56"+
        "\1\uffff\1\151\1\155\1\164\1\144\1\157\1\145\1\164\1\163\2\141\1"+
        "\155\1\143\1\60\1\156\1\163\1\165\1\160\1\164\1\60\1\154\1\156\1"+
        "\164\1\155\1\167\1\145\1\154\1\145\1\60\1\151\1\142\1\147\1\157"+
        "\1\147\1\141\3\151\1\42\2\uffff\1\162\1\151\1\150\1\151\1\162\2"+
        "\uffff\1\56\1\42\1\0\1\uffff\1\145\1\60\1\160\1\163\2\145\1\163"+
        "\1\141\1\60\1\145\10\0\1\uffff\1\147\1\60\1\157\1\60\1\154\2\141"+
        "\1\145\1\143\1\162\2\163\1\160\1\154\1\141\1\145\1\142\1\uffff\1"+
        "\141\1\145\1\155\1\154\1\145\1\157\1\151\1\60\1\147\1\141\1\145"+
        "\1\60\1\170\1\60\1\154\1\162\1\145\1\166\1\164\1\154\1\151\1\156"+
        "\1\165\1\162\1\156\1\145\1\164\1\165\1\164\1\157\1\151\1\156\1\164"+
        "\1\144\2\141\1\154\1\60\2\0\1\uffff\1\60\1\154\1\60\1\141\1\167"+
        "\1\144\1\145\1\164\1\156\1\uffff\1\0\1\42\1\0\1\uffff\2\0\1\uffff"+
        "\5\0\1\156\1\60\1\145\1\60\1\153\1\156\1\162\1\60\1\150\1\60\1\163"+
        "\1\164\1\151\1\154\1\164\1\165\1\164\1\154\1\155\2\60\1\151\2\162"+
        "\1\60\1\156\1\60\1\142\1\163\1\143\1\145\1\160\1\141\1\161\1\141"+
        "\1\145\1\151\1\163\1\164\1\162\1\164\1\145\1\157\1\151\2\143\1\156"+
        "\2\147\1\165\1\60\1\164\1\162\2\145\1\0\1\uffff\1\141\1\144\1\60"+
        "\1\145\1\144\1\141\2\60\1\144\12\0\1\141\1\161\1\60\1\144\2\60\1"+
        "\66\1\62\2\60\1\156\1\60\1\171\1\154\2\145\1\151\1\143\1\164\1\156"+
        "\1\145\1\154\1\160\1\145\1\161\2\164\1\60\1\164\2\143\1\164\1\145"+
        "\1\156\1\60\1\144\1\146\1\143\1\164\1\150\1\60\1\156\1\60\1\141"+
        "\1\151\1\137\1\60\1\161\1\0\1\164\1\137\1\146\1\60\1\155\1\uffff"+
        "\1\60\4\0\1\163\1\146\2\60\2\137\1\170\1\143\1\165\1\160\1\164\2"+
        "\60\1\143\1\151\3\60\1\145\1\141\1\160\1\60\1\162\1\157\1\145\1"+
        "\164\1\60\1\145\1\162\6\60\1\145\2\154\1\164\1\60\1\0\1\145\1\154"+
        "\1\60\1\145\4\0\2\60\2\164\1\160\1\141\2\145\1\60\1\137\1\164\1"+
        "\60\1\143\1\164\1\60\1\162\1\60\1\145\1\162\1\160\1\141\1\144\1"+
        "\60\1\145\1\60\1\0\1\60\1\157\1\60\3\0\2\60\1\162\1\163\2\60\1\143"+
        "\1\60\1\145\2\60\1\144\1\60\1\162\1\163\1\141\2\60\1\143\3\0\1\60"+
        "\1\164\1\141\2\60\1\145\2\163\1\141\1\0\1\60\1\163\1\164\1\145\1"+
        "\164\1\154\1\0\1\164\1\137\1\162\3\60\1\143\1\164\1\141\1\60\1\163"+
        "\1\164\1\60";
    static final String DFA46_maxS =
        "\1\uffff\2\172\2\uffff\1\165\22\172\12\uffff\1\71\4\uffff\1\57"+
        "\1\172\7\uffff\1\172\1\170\1\172\1\uffff\1\172\2\uffff\1\171\1\155"+
        "\1\162\1\160\2\uffff\1\154\1\157\1\162\1\151\4\uffff\2\uffff\2\uffff"+
        "\3\uffff\1\145\1\uffff\1\151\1\155\1\164\1\144\1\157\1\145\2\164"+
        "\2\141\1\156\1\154\1\172\1\156\1\163\1\165\2\164\1\172\1\164\1\156"+
        "\1\164\1\155\1\167\1\164\1\154\1\145\1\172\1\157\1\142\1\164\1\157"+
        "\1\172\1\162\1\151\1\163\1\151\1\42\2\uffff\1\162\1\154\1\150\1"+
        "\151\1\162\2\uffff\1\145\1\170\1\uffff\1\uffff\1\145\1\172\1\160"+
        "\1\163\1\157\1\145\1\163\1\141\1\172\1\145\10\uffff\1\uffff\1\147"+
        "\1\172\1\157\1\172\1\154\1\141\1\157\1\145\1\143\1\162\1\163\1\164"+
        "\1\160\1\154\1\141\1\145\1\142\1\uffff\1\141\1\145\1\155\1\157\1"+
        "\145\1\157\1\151\1\172\1\147\1\141\1\145\1\172\1\170\1\172\1\154"+
        "\1\162\1\145\1\166\1\164\1\154\1\151\1\156\1\165\1\162\1\156\1\145"+
        "\1\164\1\165\1\164\1\157\1\151\1\156\1\164\1\144\2\141\1\154\1\172"+
        "\2\uffff\1\uffff\1\172\1\154\1\172\1\141\1\167\1\156\1\145\1\164"+
        "\1\156\1\uffff\1\uffff\1\170\1\uffff\1\uffff\2\uffff\1\uffff\5\uffff"+
        "\1\156\1\172\1\145\1\172\1\153\1\156\1\162\1\172\1\150\1\172\1\163"+
        "\1\164\1\151\1\154\1\164\1\165\1\164\1\154\1\155\2\172\1\151\2\162"+
        "\1\172\1\156\1\172\1\142\1\163\1\143\1\145\1\160\1\141\1\161\1\141"+
        "\1\145\1\151\1\163\1\164\1\162\1\164\1\145\1\157\1\151\2\143\1\156"+
        "\2\147\1\165\1\172\1\164\1\162\2\145\1\uffff\1\uffff\1\141\1\144"+
        "\1\172\1\145\1\144\1\141\2\172\1\144\12\uffff\1\157\1\161\1\172"+
        "\1\144\2\172\1\66\1\62\2\172\1\156\1\172\1\171\1\154\2\145\1\151"+
        "\1\143\1\164\1\156\1\145\1\154\1\160\1\145\1\161\2\164\1\172\1\164"+
        "\2\143\1\164\1\145\1\156\1\172\1\144\1\146\1\143\1\164\1\150\1\172"+
        "\1\156\1\172\1\141\1\151\1\137\1\172\1\161\1\uffff\1\164\1\137\1"+
        "\146\1\172\1\155\1\uffff\1\172\4\uffff\1\163\1\146\2\172\2\137\1"+
        "\170\1\143\1\165\1\160\1\164\2\172\1\143\1\151\3\172\1\145\1\141"+
        "\1\160\1\172\1\162\1\157\1\145\1\164\1\172\1\145\1\162\6\172\1\145"+
        "\2\154\1\164\1\172\1\uffff\1\145\1\154\1\172\1\145\4\uffff\2\172"+
        "\2\164\1\160\1\141\2\145\1\172\1\137\1\164\1\172\1\143\1\164\1\172"+
        "\1\162\1\172\1\145\1\162\1\160\1\143\1\144\1\172\1\145\1\172\1\uffff"+
        "\1\172\1\157\1\172\3\uffff\2\172\1\162\1\163\2\172\1\143\1\172\1"+
        "\145\2\172\1\144\1\172\1\162\1\163\1\141\2\172\1\143\3\uffff\1\172"+
        "\1\164\1\141\2\172\1\145\2\163\1\141\1\uffff\1\172\1\163\1\164\1"+
        "\145\1\164\1\154\1\uffff\1\164\1\137\1\162\3\172\1\143\1\164\1\141"+
        "\1\172\1\163\1\164\1\172";
    static final String DFA46_acceptS =
        "\30\uffff\12\7\1\uffff\4\7\2\uffff\7\7\5\uffff\1\20\1\21\4\uffff"+
        "\1\5\1\14\10\uffff\1\7\1\3\2\uffff\1\15\1\4\1\12\1\uffff\1\10\46"+
        "\uffff\1\11\1\13\5\uffff\1\16\1\17\3\uffff\1\20\22\uffff\1\3\21"+
        "\uffff\1\6\50\uffff\1\11\11\uffff\1\13\3\uffff\1\3\2\uffff\1\3\75"+
        "\uffff\1\1\111\uffff\1\2\u008a\uffff";
    static final String DFA46_specialS =
        "\1\54\2\uffff\1\67\1\31\56\uffff\1\64\15\uffff\1\52\1\53\1\65\1"+
        "\63\2\uffff\1\60\1\47\66\uffff\1\30\13\uffff\1\62\1\26\1\4\1\46"+
        "\1\41\1\44\1\56\1\42\71\uffff\1\51\1\61\13\uffff\1\37\1\uffff\1"+
        "\2\1\uffff\1\32\1\73\1\uffff\1\33\1\40\1\24\1\22\1\57\67\uffff\1"+
        "\12\12\uffff\1\43\1\25\1\3\1\27\1\72\1\55\1\45\1\35\1\20\1\71\60"+
        "\uffff\1\11\7\uffff\1\6\1\1\1\23\1\15\50\uffff\1\10\4\uffff\1\5"+
        "\1\34\1\17\1\36\31\uffff\1\50\3\uffff\1\7\1\14\1\21\23\uffff\1\0"+
        "\1\66\1\16\11\uffff\1\13\6\uffff\1\70\15\uffff}>";
    static final String[] DFA46_transitionS = {
            "\11\66\2\65\2\66\1\65\22\66\1\65\1\54\1\4\1\34\1\66\1\40\1"+
            "\51\1\63\1\35\1\36\1\46\1\44\1\57\1\45\1\42\1\47\1\61\11\5\1"+
            "\37\1\41\1\3\1\55\1\56\1\43\1\66\13\62\1\64\10\62\1\60\5\62"+
            "\1\32\1\66\1\33\1\50\1\62\1\66\1\6\1\7\1\10\1\11\1\12\1\2\1"+
            "\13\1\62\1\14\2\62\1\15\1\16\1\17\1\20\1\21\1\62\1\22\1\23\1"+
            "\1\1\24\1\25\1\26\1\27\2\62\1\30\1\52\1\31\1\53\uff81\66",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\4\74\1\70\2\74\1"+
            "\71\11\74\1\67\6\74\1\72\1\74",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\1\75\12\74\1\76"+
            "\2\74\1\77\2\74\1\100\10\74",
            "\12\106\1\uffff\32\106\1\102\24\106\1\101\1\106\1\103\1\104"+
            "\1\uffff\uffc1\106",
            "\12\110\1\111\27\110\1\111\71\110\1\107\uffa3\110",
            "\1\113\1\uffff\12\114\13\uffff\1\113\6\uffff\1\115\10\uffff"+
            "\1\115\17\uffff\1\113\6\uffff\1\115\10\uffff\1\115",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\13\74\1\116\1\74"+
            "\1\121\4\74\1\117\1\74\1\120\5\74",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\10\74\1\124\5\74"+
            "\1\122\2\74\1\123\10\74",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\1\125\6\74\1\126"+
            "\3\74\1\127\2\74\1\130\13\74",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\4\74\1\131\11\74"+
            "\1\132\11\74\1\133\1\74",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\13\74\1\134\1\74"+
            "\1\135\11\74\1\136\2\74",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\16\74\1\137\13\74",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\5\74\1\140\7\74"+
            "\1\141\14\74",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\16\74\1\142\13\74",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\24\74\1\143\5\74",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\1\144\3\74\1\145"+
            "\11\74\1\146\5\74\1\147\5\74",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\17\74\1\150\1\74"+
            "\1\151\10\74",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\21\74\1\152\2\74"+
            "\1\153\5\74",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\4\74\1\154\25\74",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\7\74\1\155\1\156"+
            "\12\74\1\157\2\74\1\160\3\74",
            "\1\165\4\uffff\1\164\10\uffff\10\74\1\163\1\74\7\uffff\32"+
            "\74\4\uffff\1\74\1\uffff\15\74\1\161\4\74\1\162\7\74",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\10\74\1\166\5\74"+
            "\1\167\13\74",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\2\74\1\170\4\74"+
            "\1\171\22\74",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\16\74\1\172\13\74",
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
            "\12\113",
            "",
            "",
            "",
            "",
            "\1\173\4\uffff\1\174",
            "\32\74\4\uffff\1\74\1\uffff\32\74",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\165\4\uffff\1\164\10\uffff\12\74\7\uffff\32\74\4\uffff"+
            "\1\74\1\uffff\32\74",
            "\1\113\1\uffff\10\175\2\113\13\uffff\1\113\6\uffff\1\115\10"+
            "\uffff\1\115\2\uffff\1\115\14\uffff\1\113\6\uffff\1\115\10\uffff"+
            "\1\115\2\uffff\1\115",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\12\177\1\111\34\177\1\111\64\177\1\176\uffa3\177",
            "\1\165\4\uffff\1\164\10\uffff\12\74\7\uffff\32\74\4\uffff"+
            "\1\74\1\uffff\32\74",
            "",
            "",
            "\1\u0081\3\uffff\1\u0082",
            "\1\u0083",
            "\1\u0084\10\uffff\1\u0085",
            "\1\u0086",
            "",
            "",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\12\106\1\uffff\ufff5\106",
            "\12\106\1\uffff\ufff5\106",
            "\12\106\1\uffff\62\106\1\u008b\uffc2\106",
            "\12\106\1\uffff\ufff5\106",
            "",
            "",
            "\12\106\1\uffff\27\106\1\u008c\4\106\1\u0092\10\106\10\u0091"+
            "\7\106\1\u008e\25\106\1\u0090\6\106\1\u0092\4\106\1\u008e\1"+
            "\u0092\3\106\1\u0092\7\106\1\u0092\3\106\1\u0092\1\106\1\u0092"+
            "\1\u008d\1\u008e\1\106\1\u008f\uff87\106",
            "\12\110\1\111\27\110\1\u0093\71\110\1\107\uffa3\110",
            "",
            "",
            "",
            "\1\113\1\uffff\12\114\13\uffff\1\113\37\uffff\1\113",
            "",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\1\u00a0\1\u009f",
            "\1\u00a1\2\uffff\1\u00a2\5\uffff\1\u00a3",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\24\74\1\u00a4\5"+
            "\74",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9\3\uffff\1\u00aa",
            "\1\u00ab",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\1\u00ac\7\uffff\1\u00ad",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2\16\uffff\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "\12\74\7\uffff\32\74\4\uffff\1\u00b6\1\uffff\32\74",
            "\1\u00b7\5\uffff\1\u00b8",
            "\1\u00b9",
            "\1\u00ba\1\uffff\1\u00bb\12\uffff\1\u00bc",
            "\1\u00bd",
            "\1\u00be\22\uffff\1\u00bf",
            "\1\u00c0\20\uffff\1\u00c1",
            "\1\u00c2",
            "\1\u00c3\11\uffff\1\u00c4",
            "\1\u00c5",
            "\1\165",
            "",
            "",
            "\1\u00c6",
            "\1\u00c7\2\uffff\1\u00c8",
            "\1\u00c9",
            "\1\u00ca",
            "\1\u00cb",
            "",
            "",
            "\1\113\1\uffff\10\175\2\113\13\uffff\1\113\37\uffff\1\113",
            "\1\u00cc\4\uffff\1\u00cc\10\uffff\10\164\7\uffff\1\164\25"+
            "\uffff\1\164\6\uffff\1\u00cc\4\uffff\1\164\1\u00cc\3\uffff\1"+
            "\u00cc\7\uffff\1\u00cc\3\uffff\1\u00cc\1\uffff\1\u00cc\1\u00cd"+
            "\1\164\1\uffff\1\164",
            "\12\177\1\111\34\177\1\u00ce\64\177\1\176\uffa3\177",
            "",
            "\1\u00cf",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\1\u00d0",
            "\1\u00d1",
            "\1\u00d2\11\uffff\1\u00d3",
            "\1\u00d4",
            "\1\u00d5",
            "\1\u00d6",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\1\u00d7",
            "\12\106\1\uffff\ufff5\106",
            "\12\u00d9\1\111\27\u00d9\1\u00d8\71\u00d9\1\u00da\uffa3\u00d9",
            "\12\u00de\1\111\27\u00de\1\u00dc\15\u00de\12\u00db\7\u00de"+
            "\6\u00db\25\u00de\1\u00dd\uffa3\u00de",
            "\12\u00e0\1\uffff\27\u00e0\1\u00df\71\u00e0\1\u00e1\uffa3"+
            "\u00e0",
            "\12\106\1\uffff\45\106\12\u00e2\7\106\6\u00e2\uffb9\106",
            "\12\106\1\uffff\45\106\12\u00e3\7\106\6\u00e3\uffb9\106",
            "\12\106\1\uffff\45\106\10\u00e4\uffc8\106",
            "\12\110\1\111\27\110\1\u0093\71\110\1\107\uffa3\110",
            "",
            "\1\u00e5",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\1\u00e6",
            "\12\74\7\uffff\32\74\4\uffff\1\u00e7\1\uffff\32\74",
            "\1\u00e8",
            "\1\u00e9",
            "\1\u00ea\15\uffff\1\u00eb",
            "\1\u00ec",
            "\1\u00ed",
            "\1\u00ee",
            "\1\u00ef",
            "\1\u00f0\1\u00f1",
            "\1\u00f2",
            "\1\u00f3",
            "\1\u00f4",
            "\1\u00f5",
            "\1\u00f6",
            "",
            "\1\u00f7",
            "\1\u00f8",
            "\1\u00f9",
            "\1\u00fa\2\uffff\1\u00fb",
            "\1\u00fc",
            "\1\u00fd",
            "\1\u00fe",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\1\u00ff",
            "\1\u0100",
            "\1\u0101",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\1\u0102",
            "\12\74\7\uffff\32\74\4\uffff\1\u0103\1\uffff\32\74",
            "\1\u0104",
            "\1\u0105",
            "\1\u0106",
            "\1\u0107",
            "\1\u0108",
            "\1\u0109",
            "\1\u010a",
            "\1\u010b",
            "\1\u010c",
            "\1\u010d",
            "\1\u010e",
            "\1\u010f",
            "\1\u0110",
            "\1\u0111",
            "\1\u0112",
            "\1\u0113",
            "\1\u0114",
            "\1\u0115",
            "\1\u0116",
            "\1\u0117",
            "\1\u0118",
            "\1\u0119",
            "\1\u011a",
            "\12\74\7\uffff\32\74\4\uffff\1\u011b\1\uffff\32\74",
            "\12\177\1\111\34\177\1\u00ce\64\177\1\176\uffa3\177",
            "\60\111\12\u011c\7\111\6\u011c\uffb9\111",
            "",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\1\u011e",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\1\u011f",
            "\1\u0120",
            "\1\u0121\4\uffff\1\u0122\4\uffff\1\u0123",
            "\1\u0124",
            "\1\u0125",
            "\1\u0126",
            "",
            "\12\u00d9\1\111\27\u00d9\1\u00d8\71\u00d9\1\u00da\uffa3\u00d9",
            "\1\u0127\4\uffff\1\u0127\10\uffff\10\165\7\uffff\1\165\25"+
            "\uffff\1\165\6\uffff\1\u0127\4\uffff\1\165\1\u0127\3\uffff\1"+
            "\u0127\7\uffff\1\u0127\3\uffff\1\u0127\1\uffff\1\u0127\1\u0128"+
            "\1\165\1\uffff\1\165",
            "\12\u00de\1\111\27\u00de\1\u00dc\15\u00de\12\u0129\7\u00de"+
            "\6\u0129\25\u00de\1\u00dd\uffa3\u00de",
            "",
            "\12\106\1\uffff\27\106\1\u012a\4\106\1\u012b\64\106\1\u012b"+
            "\5\106\1\u012b\3\106\1\u012b\7\106\1\u012b\3\106\1\u012b\1\106"+
            "\2\u012b\uff8a\106",
            "\12\u00de\1\111\27\u00de\1\u00dc\71\u00de\1\u00dd\uffa3\u00de",
            "",
            "\12\u00e0\1\uffff\27\u00e0\1\u00df\71\u00e0\1\u00e1\uffa3"+
            "\u00e0",
            "\12\106\1\uffff\27\106\1\u012c\4\106\1\u008e\10\106\10\u0091"+
            "\7\106\1\u008e\25\106\1\u0090\6\106\1\u008e\4\106\2\u008e\3"+
            "\106\1\u008e\7\106\1\u008e\3\106\1\u008e\1\106\1\u008e\1\u012d"+
            "\1\u008e\1\106\1\u008f\uff87\106",
            "\12\u00e0\1\uffff\27\u00e0\1\u00df\15\u00e0\12\u012e\7\u00e0"+
            "\6\u012e\25\u00e0\1\u00e1\uffa3\u00e0",
            "\12\106\1\uffff\45\106\12\u012f\7\106\6\u012f\uffb9\106",
            "\12\106\1\uffff\45\106\10\u0130\uffc8\106",
            "\1\u0131",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\1\u0132",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\1\u0133",
            "\1\u0134",
            "\1\u0135",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\1\u0136",
            "\1\74\1\u0137\1\74\1\u0138\6\74\7\uffff\32\74\4\uffff\1\74"+
            "\1\uffff\32\74",
            "\1\u0139",
            "\1\u013a",
            "\1\u013b",
            "\1\u013c",
            "\1\u013d",
            "\1\u013e",
            "\1\u013f",
            "\1\u0140",
            "\1\u0141",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\1\u0142",
            "\1\u0143",
            "\1\u0144",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\1\u0145",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\1\u0146",
            "\1\u0147",
            "\1\u0148",
            "\1\u0149",
            "\1\u014a",
            "\1\u014b",
            "\1\u014c",
            "\1\u014d",
            "\1\u014e",
            "\1\u014f",
            "\1\u0150",
            "\1\u0151",
            "\1\u0152",
            "\1\u0153",
            "\1\u0154",
            "\1\u0155",
            "\1\u0156",
            "\1\u0157",
            "\1\u0158",
            "\1\u0159",
            "\1\u015a",
            "\1\u015b",
            "\1\u015c",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\1\u015d",
            "\1\u015e",
            "\1\u015f",
            "\1\u0160",
            "\60\111\12\u0161\7\111\6\u0161\uffb9\111",
            "",
            "\1\u0162",
            "\1\u0163",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\1\u0164",
            "\1\u0165",
            "\1\u0166",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\1\u0168",
            "\12\u00d9\1\111\27\u00d9\1\u00d8\71\u00d9\1\u00da\uffa3\u00d9",
            "\60\111\12\u0169\7\111\6\u0169\uffb9\111",
            "\12\u00de\1\111\27\u00de\1\u00dc\15\u00de\12\u016a\7\u00de"+
            "\6\u016a\25\u00de\1\u00dd\uffa3\u00de",
            "\0\111",
            "\12\u00de\1\111\27\u00de\1\u00dc\71\u00de\1\u00dd\uffa3\u00de",
            "\12\165\1\uffff\ufff5\165",
            "\12\106\1\uffff\45\106\12\u016b\7\106\6\u016b\uffb9\106",
            "\12\u00e0\1\uffff\27\u00e0\1\u00df\15\u00e0\12\u012e\7\u00e0"+
            "\6\u012e\25\u00e0\1\u00e1\uffa3\u00e0",
            "\12\106\1\uffff\45\106\12\u016c\7\106\6\u016c\uffb9\106",
            "\12\u00e0\1\uffff\27\u00e0\1\u00df\71\u00e0\1\u00e1\uffa3"+
            "\u00e0",
            "\1\u016d\15\uffff\1\u016e",
            "\1\u016f",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\1\u0170",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\1\u0171",
            "\1\u0172",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\12\74\7\uffff\32\74\4\uffff\1\u0174\1\uffff\4\74\1\u0173"+
            "\25\74",
            "\1\u0175",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\1\u0176",
            "\1\u0177",
            "\1\u0178",
            "\1\u0179",
            "\1\u017a",
            "\1\u017b",
            "\1\u017c",
            "\1\u017d",
            "\1\u017e",
            "\1\u017f",
            "\1\u0180",
            "\1\u0181",
            "\1\u0182",
            "\1\u0183",
            "\1\u0184",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\1\u0185",
            "\1\u0186",
            "\1\u0187",
            "\1\u0188",
            "\1\u0189",
            "\1\u018a",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\1\u018b",
            "\1\u018c",
            "\1\u018d",
            "\1\u018e",
            "\1\u018f",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\1\u0190",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\1\u0191",
            "\1\u0192",
            "\1\u0193",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\1\u0194",
            "\60\111\12\u0195\7\111\6\u0195\uffb9\111",
            "\1\u0196",
            "\1\u0197",
            "\1\u0198",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\1\u0199",
            "",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\60\111\12\u019a\7\111\6\u019a\uffb9\111",
            "\12\u00de\1\111\27\u00de\1\u00dc\15\u00de\12\u019b\7\u00de"+
            "\6\u019b\25\u00de\1\u00dd\uffa3\u00de",
            "\12\106\1\uffff\45\106\12\u019c\7\106\6\u019c\uffb9\106",
            "\12\106\1\uffff\45\106\12\u019d\7\106\6\u019d\uffb9\106",
            "\1\u019e",
            "\1\u019f",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\1\u01a0",
            "\1\u01a1",
            "\1\u01a2",
            "\1\u01a3",
            "\1\u01a4",
            "\1\u01a5",
            "\1\u01a6",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\1\u01a7",
            "\1\u01a8",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\1\u01a9",
            "\1\u01aa",
            "\1\u01ab",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\1\u01ac",
            "\1\u01ad",
            "\1\u01ae",
            "\1\u01af",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\1\u01b0",
            "\1\u01b1",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\12\74\7\uffff\32\74\4\uffff\1\u01b2\1\uffff\32\74",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\1\u01b3",
            "\1\u01b4",
            "\1\u01b5",
            "\1\u01b6",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\60\111\12\u01b7\7\111\6\u01b7\uffb9\111",
            "\1\u01b8",
            "\1\u01b9",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\1\u01ba",
            "\60\111\12\u01bb\7\111\6\u01bb\uffb9\111",
            "\12\110\1\111\27\110\1\u0093\71\110\1\107\uffa3\110",
            "\12\106\1\uffff\45\106\12\u01bc\7\106\6\u01bc\uffb9\106",
            "\12\106\1\uffff\45\106\12\u01bd\7\106\6\u01bd\uffb9\106",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\1\u01be",
            "\1\u01bf",
            "\1\u01c0",
            "\1\u01c1",
            "\1\u01c2",
            "\1\u01c3",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\1\u01c4",
            "\1\u01c5",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\1\u01c6",
            "\1\u01c7",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\1\u01c8",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\1\u01c9",
            "\1\u01ca",
            "\1\u01cb",
            "\1\u01cc\1\uffff\1\u01cd",
            "\1\u01ce",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\1\u01cf",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\12\177\1\111\34\177\1\u00ce\64\177\1\176\uffa3\177",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\1\u01d0",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\60\111\12\u01d1\7\111\6\u01d1\uffb9\111",
            "\12\106\1\uffff\45\106\12\u01d2\7\106\6\u01d2\uffb9\106",
            "\12\106\1\uffff\45\106\12\u01d3\7\106\6\u01d3\uffb9\106",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\1\u01d4",
            "\1\u01d5",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\1\u01d6",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\1\u01d7",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\1\u01d8",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\1\u01d9",
            "\1\u01da",
            "\1\u01db",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\1\u01dc",
            "\12\u00d9\1\111\27\u00d9\1\u00d8\71\u00d9\1\u00da\uffa3\u00d9",
            "\12\u00e0\1\uffff\27\u00e0\1\u00df\71\u00e0\1\u00e1\uffa3"+
            "\u00e0",
            "\12\106\1\uffff\45\106\12\u01dd\7\106\6\u01dd\uffb9\106",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\1\u01de",
            "\1\u01df",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\1\u01e0",
            "\1\u01e1",
            "\1\u01e2",
            "\1\u01e3",
            "\12\106\1\uffff\45\106\12\u01e4\7\106\6\u01e4\uffb9\106",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\1\u01e5",
            "\1\u01e6",
            "\1\u01e7",
            "\1\u01e8",
            "\1\u01e9",
            "\12\u00e0\1\uffff\27\u00e0\1\u00df\71\u00e0\1\u00e1\uffa3"+
            "\u00e0",
            "\1\u01ea",
            "\1\u01eb",
            "\1\u01ec",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\1\u01ed",
            "\1\u01ee",
            "\1\u01ef",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74",
            "\1\u01f0",
            "\1\u01f1",
            "\12\74\7\uffff\32\74\4\uffff\1\74\1\uffff\32\74"
    };

    static final short[] DFA46_eot = DFA.unpackEncodedString(DFA46_eotS);
    static final short[] DFA46_eof = DFA.unpackEncodedString(DFA46_eofS);
    static final char[] DFA46_min = DFA.unpackEncodedStringToUnsignedChars(DFA46_minS);
    static final char[] DFA46_max = DFA.unpackEncodedStringToUnsignedChars(DFA46_maxS);
    static final short[] DFA46_accept = DFA.unpackEncodedString(DFA46_acceptS);
    static final short[] DFA46_special = DFA.unpackEncodedString(DFA46_specialS);
    static final short[][] DFA46_transition;

    static {
        int numStates = DFA46_transitionS.length;
        DFA46_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA46_transition[i] = DFA.unpackEncodedString(DFA46_transitionS[i]);
        }
    }

    class DFA46 extends DFA {

        public DFA46(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 46;
            this.eot = DFA46_eot;
            this.eof = DFA46_eof;
            this.min = DFA46_min;
            this.max = DFA46_max;
            this.accept = DFA46_accept;
            this.special = DFA46_special;
            this.transition = DFA46_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__38 | T__39 | RULE_HEADER_NAME | RULE_DIGIT | RULE_NONDIGIT | RULE_KEYWORD | RULE_PREPROCESSING_OP_OR_PUNC | RULE_INT | RULE_CHARACTER_LITERAL | RULE_FLOATING_LITERAL | RULE_STRING_LITERAL | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA46_465 = input.LA(1);

                        s = -1;
                        if ( (LA46_465=='\"') ) {s = 216;}

                        else if ( (LA46_465=='\\') ) {s = 218;}

                        else if ( ((LA46_465>='\u0000' && LA46_465<='\t')||(LA46_465>='\u000B' && LA46_465<='!')||(LA46_465>='#' && LA46_465<='[')||(LA46_465>=']' && LA46_465<='\uFFFF')) ) {s = 217;}

                        else if ( (LA46_465=='\n') ) {s = 73;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA46_362 = input.LA(1);

                        s = -1;
                        if ( (LA46_362=='\"') ) {s = 220;}

                        else if ( (LA46_362=='\\') ) {s = 221;}

                        else if ( ((LA46_362>='0' && LA46_362<='9')||(LA46_362>='A' && LA46_362<='F')) ) {s = 411;}

                        else if ( (LA46_362=='\n') ) {s = 73;}

                        else if ( ((LA46_362>='\u0000' && LA46_362<='\t')||(LA46_362>='\u000B' && LA46_362<='!')||(LA46_362>='#' && LA46_362<='/')||(LA46_362>=':' && LA46_362<='@')||(LA46_362>='G' && LA46_362<='[')||(LA46_362>=']' && LA46_362<='\uFFFF')) ) {s = 222;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA46_219 = input.LA(1);

                        s = -1;
                        if ( ((LA46_219>='0' && LA46_219<='9')||(LA46_219>='A' && LA46_219<='F')) ) {s = 297;}

                        else if ( (LA46_219=='\"') ) {s = 220;}

                        else if ( (LA46_219=='\\') ) {s = 221;}

                        else if ( ((LA46_219>='\u0000' && LA46_219<='\t')||(LA46_219>='\u000B' && LA46_219<='!')||(LA46_219>='#' && LA46_219<='/')||(LA46_219>=':' && LA46_219<='@')||(LA46_219>='G' && LA46_219<='[')||(LA46_219>=']' && LA46_219<='\uFFFF')) ) {s = 222;}

                        else if ( (LA46_219=='\n') ) {s = 73;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA46_297 = input.LA(1);

                        s = -1;
                        if ( ((LA46_297>='0' && LA46_297<='9')||(LA46_297>='A' && LA46_297<='F')) ) {s = 362;}

                        else if ( (LA46_297=='\"') ) {s = 220;}

                        else if ( (LA46_297=='\\') ) {s = 221;}

                        else if ( ((LA46_297>='\u0000' && LA46_297<='\t')||(LA46_297>='\u000B' && LA46_297<='!')||(LA46_297>='#' && LA46_297<='/')||(LA46_297>=':' && LA46_297<='@')||(LA46_297>='G' && LA46_297<='[')||(LA46_297>=']' && LA46_297<='\uFFFF')) ) {s = 222;}

                        else if ( (LA46_297=='\n') ) {s = 73;}

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA46_141 = input.LA(1);

                        s = -1;
                        if ( ((LA46_141>='0' && LA46_141<='9')||(LA46_141>='A' && LA46_141<='F')) ) {s = 219;}

                        else if ( (LA46_141=='\"') ) {s = 220;}

                        else if ( (LA46_141=='\\') ) {s = 221;}

                        else if ( ((LA46_141>='\u0000' && LA46_141<='\t')||(LA46_141>='\u000B' && LA46_141<='!')||(LA46_141>='#' && LA46_141<='/')||(LA46_141>=':' && LA46_141<='@')||(LA46_141>='G' && LA46_141<='[')||(LA46_141>=']' && LA46_141<='\uFFFF')) ) {s = 222;}

                        else if ( (LA46_141=='\n') ) {s = 73;}

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA46_410 = input.LA(1);

                        s = -1;
                        if ( ((LA46_410>='0' && LA46_410<='9')||(LA46_410>='A' && LA46_410<='F')) ) {s = 443;}

                        else if ( ((LA46_410>='\u0000' && LA46_410<='/')||(LA46_410>=':' && LA46_410<='@')||(LA46_410>='G' && LA46_410<='\uFFFF')) ) {s = 73;}

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA46_361 = input.LA(1);

                        s = -1;
                        if ( ((LA46_361>='0' && LA46_361<='9')||(LA46_361>='A' && LA46_361<='F')) ) {s = 410;}

                        else if ( ((LA46_361>='\u0000' && LA46_361<='/')||(LA46_361>=':' && LA46_361<='@')||(LA46_361>='G' && LA46_361<='\uFFFF')) ) {s = 73;}

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA46_443 = input.LA(1);

                        s = -1;
                        if ( ((LA46_443>='\u0000' && LA46_443<='/')||(LA46_443>=':' && LA46_443<='@')||(LA46_443>='G' && LA46_443<='\uFFFF')) ) {s = 73;}

                        else if ( ((LA46_443>='0' && LA46_443<='9')||(LA46_443>='A' && LA46_443<='F')) ) {s = 465;}

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA46_405 = input.LA(1);

                        s = -1;
                        if ( ((LA46_405>='\u0000' && LA46_405<='/')||(LA46_405>=':' && LA46_405<='@')||(LA46_405>='G' && LA46_405<='\uFFFF')) ) {s = 73;}

                        else if ( ((LA46_405>='0' && LA46_405<='9')||(LA46_405>='A' && LA46_405<='F')) ) {s = 439;}

                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA46_353 = input.LA(1);

                        s = -1;
                        if ( ((LA46_353>='\u0000' && LA46_353<='/')||(LA46_353>=':' && LA46_353<='@')||(LA46_353>='G' && LA46_353<='\uFFFF')) ) {s = 73;}

                        else if ( ((LA46_353>='0' && LA46_353<='9')||(LA46_353>='A' && LA46_353<='F')) ) {s = 405;}

                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA46_284 = input.LA(1);

                        s = -1;
                        if ( ((LA46_284>='\u0000' && LA46_284<='/')||(LA46_284>=':' && LA46_284<='@')||(LA46_284>='G' && LA46_284<='\uFFFF')) ) {s = 73;}

                        else if ( ((LA46_284>='0' && LA46_284<='9')||(LA46_284>='A' && LA46_284<='F')) ) {s = 353;}

                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA46_477 = input.LA(1);

                        s = -1;
                        if ( ((LA46_477>='0' && LA46_477<='9')||(LA46_477>='A' && LA46_477<='F')) ) {s = 484;}

                        else if ( ((LA46_477>='\u0000' && LA46_477<='\t')||(LA46_477>='\u000B' && LA46_477<='/')||(LA46_477>=':' && LA46_477<='@')||(LA46_477>='G' && LA46_477<='\uFFFF')) ) {s = 70;}

                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA46_444 = input.LA(1);

                        s = -1;
                        if ( ((LA46_444>='\u0000' && LA46_444<='\t')||(LA46_444>='\u000B' && LA46_444<='/')||(LA46_444>=':' && LA46_444<='@')||(LA46_444>='G' && LA46_444<='\uFFFF')) ) {s = 70;}

                        else if ( ((LA46_444>='0' && LA46_444<='9')||(LA46_444>='A' && LA46_444<='F')) ) {s = 466;}

                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA46_364 = input.LA(1);

                        s = -1;
                        if ( ((LA46_364>='0' && LA46_364<='9')||(LA46_364>='A' && LA46_364<='F')) ) {s = 413;}

                        else if ( ((LA46_364>='\u0000' && LA46_364<='\t')||(LA46_364>='\u000B' && LA46_364<='/')||(LA46_364>=':' && LA46_364<='@')||(LA46_364>='G' && LA46_364<='\uFFFF')) ) {s = 70;}

                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA46_467 = input.LA(1);

                        s = -1;
                        if ( ((LA46_467>='0' && LA46_467<='9')||(LA46_467>='A' && LA46_467<='F')) ) {s = 477;}

                        else if ( ((LA46_467>='\u0000' && LA46_467<='\t')||(LA46_467>='\u000B' && LA46_467<='/')||(LA46_467>=':' && LA46_467<='@')||(LA46_467>='G' && LA46_467<='\uFFFF')) ) {s = 70;}

                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA46_412 = input.LA(1);

                        s = -1;
                        if ( ((LA46_412>='0' && LA46_412<='9')||(LA46_412>='A' && LA46_412<='F')) ) {s = 444;}

                        else if ( ((LA46_412>='\u0000' && LA46_412<='\t')||(LA46_412>='\u000B' && LA46_412<='/')||(LA46_412>=':' && LA46_412<='@')||(LA46_412>='G' && LA46_412<='\uFFFF')) ) {s = 70;}

                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA46_303 = input.LA(1);

                        s = -1;
                        if ( ((LA46_303>='0' && LA46_303<='9')||(LA46_303>='A' && LA46_303<='F')) ) {s = 364;}

                        else if ( ((LA46_303>='\u0000' && LA46_303<='\t')||(LA46_303>='\u000B' && LA46_303<='/')||(LA46_303>=':' && LA46_303<='@')||(LA46_303>='G' && LA46_303<='\uFFFF')) ) {s = 70;}

                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA46_445 = input.LA(1);

                        s = -1;
                        if ( ((LA46_445>='0' && LA46_445<='9')||(LA46_445>='A' && LA46_445<='F')) ) {s = 467;}

                        else if ( ((LA46_445>='\u0000' && LA46_445<='\t')||(LA46_445>='\u000B' && LA46_445<='/')||(LA46_445>=':' && LA46_445<='@')||(LA46_445>='G' && LA46_445<='\uFFFF')) ) {s = 70;}

                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA46_227 = input.LA(1);

                        s = -1;
                        if ( ((LA46_227>='0' && LA46_227<='9')||(LA46_227>='A' && LA46_227<='F')) ) {s = 303;}

                        else if ( ((LA46_227>='\u0000' && LA46_227<='\t')||(LA46_227>='\u000B' && LA46_227<='/')||(LA46_227>=':' && LA46_227<='@')||(LA46_227>='G' && LA46_227<='\uFFFF')) ) {s = 70;}

                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA46_363 = input.LA(1);

                        s = -1;
                        if ( ((LA46_363>='0' && LA46_363<='9')||(LA46_363>='A' && LA46_363<='F')) ) {s = 412;}

                        else if ( ((LA46_363>='\u0000' && LA46_363<='\t')||(LA46_363>='\u000B' && LA46_363<='/')||(LA46_363>=':' && LA46_363<='@')||(LA46_363>='G' && LA46_363<='\uFFFF')) ) {s = 70;}

                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA46_226 = input.LA(1);

                        s = -1;
                        if ( (LA46_226=='\"') ) {s = 223;}

                        else if ( ((LA46_226>='0' && LA46_226<='9')||(LA46_226>='A' && LA46_226<='F')) ) {s = 302;}

                        else if ( (LA46_226=='\\') ) {s = 225;}

                        else if ( ((LA46_226>='\u0000' && LA46_226<='\t')||(LA46_226>='\u000B' && LA46_226<='!')||(LA46_226>='#' && LA46_226<='/')||(LA46_226>=':' && LA46_226<='@')||(LA46_226>='G' && LA46_226<='[')||(LA46_226>=']' && LA46_226<='\uFFFF')) ) {s = 224;}

                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA46_296 = input.LA(1);

                        s = -1;
                        if ( ((LA46_296>='0' && LA46_296<='9')||(LA46_296>='A' && LA46_296<='F')) ) {s = 361;}

                        else if ( ((LA46_296>='\u0000' && LA46_296<='/')||(LA46_296>=':' && LA46_296<='@')||(LA46_296>='G' && LA46_296<='\uFFFF')) ) {s = 73;}

                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA46_140 = input.LA(1);

                        s = -1;
                        if ( (LA46_140=='\"') ) {s = 216;}

                        else if ( ((LA46_140>='\u0000' && LA46_140<='\t')||(LA46_140>='\u000B' && LA46_140<='!')||(LA46_140>='#' && LA46_140<='[')||(LA46_140>=']' && LA46_140<='\uFFFF')) ) {s = 217;}

                        else if ( (LA46_140=='\\') ) {s = 218;}

                        else if ( (LA46_140=='\n') ) {s = 73;}

                        else s = 70;

                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA46_298 = input.LA(1);

                        s = -1;
                        if ( ((LA46_298>='\u0000' && LA46_298<='\uFFFF')) ) {s = 73;}

                        else s = 70;

                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA46_127 = input.LA(1);

                        s = -1;
                        if ( (LA46_127=='\'') ) {s = 206;}

                        else if ( (LA46_127=='\\') ) {s = 126;}

                        else if ( ((LA46_127>='\u0000' && LA46_127<='\t')||(LA46_127>='\u000B' && LA46_127<='&')||(LA46_127>='(' && LA46_127<='[')||(LA46_127>=']' && LA46_127<='\uFFFF')) ) {s = 127;}

                        else if ( (LA46_127=='\n') ) {s = 73;}

                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA46_4 = input.LA(1);

                        s = -1;
                        if ( (LA46_4=='\\') ) {s = 71;}

                        else if ( ((LA46_4>='\u0000' && LA46_4<='\t')||(LA46_4>='\u000B' && LA46_4<='!')||(LA46_4>='#' && LA46_4<='[')||(LA46_4>=']' && LA46_4<='\uFFFF')) ) {s = 72;}

                        else if ( (LA46_4=='\n'||LA46_4=='\"') ) {s = 73;}

                        else s = 54;

                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA46_221 = input.LA(1);

                        s = -1;
                        if ( (LA46_221=='\"') ) {s = 298;}

                        else if ( (LA46_221=='\''||LA46_221=='\\'||LA46_221=='b'||LA46_221=='f'||LA46_221=='n'||LA46_221=='r'||(LA46_221>='t' && LA46_221<='u')) ) {s = 299;}

                        else if ( ((LA46_221>='\u0000' && LA46_221<='\t')||(LA46_221>='\u000B' && LA46_221<='!')||(LA46_221>='#' && LA46_221<='&')||(LA46_221>='(' && LA46_221<='[')||(LA46_221>=']' && LA46_221<='a')||(LA46_221>='c' && LA46_221<='e')||(LA46_221>='g' && LA46_221<='m')||(LA46_221>='o' && LA46_221<='q')||LA46_221=='s'||(LA46_221>='v' && LA46_221<='\uFFFF')) ) {s = 70;}

                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA46_224 = input.LA(1);

                        s = -1;
                        if ( (LA46_224=='\"') ) {s = 223;}

                        else if ( ((LA46_224>='\u0000' && LA46_224<='\t')||(LA46_224>='\u000B' && LA46_224<='!')||(LA46_224>='#' && LA46_224<='[')||(LA46_224>=']' && LA46_224<='\uFFFF')) ) {s = 224;}

                        else if ( (LA46_224=='\\') ) {s = 225;}

                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA46_411 = input.LA(1);

                        s = -1;
                        if ( (LA46_411=='\"') ) {s = 147;}

                        else if ( (LA46_411=='\\') ) {s = 71;}

                        else if ( ((LA46_411>='\u0000' && LA46_411<='\t')||(LA46_411>='\u000B' && LA46_411<='!')||(LA46_411>='#' && LA46_411<='[')||(LA46_411>=']' && LA46_411<='\uFFFF')) ) {s = 72;}

                        else if ( (LA46_411=='\n') ) {s = 73;}

                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA46_302 = input.LA(1);

                        s = -1;
                        if ( (LA46_302=='\"') ) {s = 223;}

                        else if ( ((LA46_302>='0' && LA46_302<='9')||(LA46_302>='A' && LA46_302<='F')) ) {s = 302;}

                        else if ( (LA46_302=='\\') ) {s = 225;}

                        else if ( ((LA46_302>='\u0000' && LA46_302<='\t')||(LA46_302>='\u000B' && LA46_302<='!')||(LA46_302>='#' && LA46_302<='/')||(LA46_302>=':' && LA46_302<='@')||(LA46_302>='G' && LA46_302<='[')||(LA46_302>=']' && LA46_302<='\uFFFF')) ) {s = 224;}

                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA46_413 = input.LA(1);

                        s = -1;
                        if ( ((LA46_413>='0' && LA46_413<='9')||(LA46_413>='A' && LA46_413<='F')) ) {s = 445;}

                        else if ( ((LA46_413>='\u0000' && LA46_413<='\t')||(LA46_413>='\u000B' && LA46_413<='/')||(LA46_413>=':' && LA46_413<='@')||(LA46_413>='G' && LA46_413<='\uFFFF')) ) {s = 70;}

                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA46_217 = input.LA(1);

                        s = -1;
                        if ( (LA46_217=='\"') ) {s = 216;}

                        else if ( ((LA46_217>='\u0000' && LA46_217<='\t')||(LA46_217>='\u000B' && LA46_217<='!')||(LA46_217>='#' && LA46_217<='[')||(LA46_217>=']' && LA46_217<='\uFFFF')) ) {s = 217;}

                        else if ( (LA46_217=='\\') ) {s = 218;}

                        else if ( (LA46_217=='\n') ) {s = 73;}

                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        int LA46_225 = input.LA(1);

                        s = -1;
                        if ( (LA46_225=='\"') ) {s = 300;}

                        else if ( (LA46_225=='x') ) {s = 143;}

                        else if ( (LA46_225=='u') ) {s = 301;}

                        else if ( (LA46_225=='U') ) {s = 144;}

                        else if ( ((LA46_225>='0' && LA46_225<='7')) ) {s = 145;}

                        else if ( (LA46_225=='\''||LA46_225=='?'||LA46_225=='\\'||(LA46_225>='a' && LA46_225<='b')||LA46_225=='f'||LA46_225=='n'||LA46_225=='r'||LA46_225=='t'||LA46_225=='v') ) {s = 142;}

                        else if ( ((LA46_225>='\u0000' && LA46_225<='\t')||(LA46_225>='\u000B' && LA46_225<='!')||(LA46_225>='#' && LA46_225<='&')||(LA46_225>='(' && LA46_225<='/')||(LA46_225>='8' && LA46_225<='>')||(LA46_225>='@' && LA46_225<='T')||(LA46_225>='V' && LA46_225<='[')||(LA46_225>=']' && LA46_225<='`')||(LA46_225>='c' && LA46_225<='e')||(LA46_225>='g' && LA46_225<='m')||(LA46_225>='o' && LA46_225<='q')||LA46_225=='s'||LA46_225=='w'||(LA46_225>='y' && LA46_225<='\uFFFF')) ) {s = 70;}

                        if ( s>=0 ) return s;
                        break;
                    case 33 : 
                        int LA46_143 = input.LA(1);

                        s = -1;
                        if ( ((LA46_143>='0' && LA46_143<='9')||(LA46_143>='A' && LA46_143<='F')) ) {s = 226;}

                        else if ( ((LA46_143>='\u0000' && LA46_143<='\t')||(LA46_143>='\u000B' && LA46_143<='/')||(LA46_143>=':' && LA46_143<='@')||(LA46_143>='G' && LA46_143<='\uFFFF')) ) {s = 70;}

                        if ( s>=0 ) return s;
                        break;
                    case 34 : 
                        int LA46_146 = input.LA(1);

                        s = -1;
                        if ( (LA46_146=='\"') ) {s = 147;}

                        else if ( ((LA46_146>='\u0000' && LA46_146<='\t')||(LA46_146>='\u000B' && LA46_146<='!')||(LA46_146>='#' && LA46_146<='[')||(LA46_146>=']' && LA46_146<='\uFFFF')) ) {s = 72;}

                        else if ( (LA46_146=='\\') ) {s = 71;}

                        else if ( (LA46_146=='\n') ) {s = 73;}

                        if ( s>=0 ) return s;
                        break;
                    case 35 : 
                        int LA46_295 = input.LA(1);

                        s = -1;
                        if ( (LA46_295=='\"') ) {s = 216;}

                        else if ( (LA46_295=='\\') ) {s = 218;}

                        else if ( ((LA46_295>='\u0000' && LA46_295<='\t')||(LA46_295>='\u000B' && LA46_295<='!')||(LA46_295>='#' && LA46_295<='[')||(LA46_295>=']' && LA46_295<='\uFFFF')) ) {s = 217;}

                        else if ( (LA46_295=='\n') ) {s = 73;}

                        if ( s>=0 ) return s;
                        break;
                    case 36 : 
                        int LA46_144 = input.LA(1);

                        s = -1;
                        if ( ((LA46_144>='\u0000' && LA46_144<='\t')||(LA46_144>='\u000B' && LA46_144<='/')||(LA46_144>=':' && LA46_144<='@')||(LA46_144>='G' && LA46_144<='\uFFFF')) ) {s = 70;}

                        else if ( ((LA46_144>='0' && LA46_144<='9')||(LA46_144>='A' && LA46_144<='F')) ) {s = 227;}

                        if ( s>=0 ) return s;
                        break;
                    case 37 : 
                        int LA46_301 = input.LA(1);

                        s = -1;
                        if ( ((LA46_301>='0' && LA46_301<='9')||(LA46_301>='A' && LA46_301<='F')) ) {s = 363;}

                        else if ( ((LA46_301>='\u0000' && LA46_301<='\t')||(LA46_301>='\u000B' && LA46_301<='/')||(LA46_301>=':' && LA46_301<='@')||(LA46_301>='G' && LA46_301<='\uFFFF')) ) {s = 70;}

                        if ( s>=0 ) return s;
                        break;
                    case 38 : 
                        int LA46_142 = input.LA(1);

                        s = -1;
                        if ( (LA46_142=='\"') ) {s = 223;}

                        else if ( ((LA46_142>='\u0000' && LA46_142<='\t')||(LA46_142>='\u000B' && LA46_142<='!')||(LA46_142>='#' && LA46_142<='[')||(LA46_142>=']' && LA46_142<='\uFFFF')) ) {s = 224;}

                        else if ( (LA46_142=='\\') ) {s = 225;}

                        if ( s>=0 ) return s;
                        break;
                    case 39 : 
                        int LA46_72 = input.LA(1);

                        s = -1;
                        if ( (LA46_72=='\"') ) {s = 147;}

                        else if ( ((LA46_72>='\u0000' && LA46_72<='\t')||(LA46_72>='\u000B' && LA46_72<='!')||(LA46_72>='#' && LA46_72<='[')||(LA46_72>=']' && LA46_72<='\uFFFF')) ) {s = 72;}

                        else if ( (LA46_72=='\\') ) {s = 71;}

                        else if ( (LA46_72=='\n') ) {s = 73;}

                        if ( s>=0 ) return s;
                        break;
                    case 40 : 
                        int LA46_439 = input.LA(1);

                        s = -1;
                        if ( (LA46_439=='\'') ) {s = 206;}

                        else if ( (LA46_439=='\\') ) {s = 126;}

                        else if ( ((LA46_439>='\u0000' && LA46_439<='\t')||(LA46_439>='\u000B' && LA46_439<='&')||(LA46_439>='(' && LA46_439<='[')||(LA46_439>=']' && LA46_439<='\uFFFF')) ) {s = 127;}

                        else if ( (LA46_439=='\n') ) {s = 73;}

                        if ( s>=0 ) return s;
                        break;
                    case 41 : 
                        int LA46_204 = input.LA(1);

                        s = -1;
                        if ( (LA46_204=='\'') ) {s = 206;}

                        else if ( (LA46_204=='\\') ) {s = 126;}

                        else if ( ((LA46_204>='\u0000' && LA46_204<='\t')||(LA46_204>='\u000B' && LA46_204<='&')||(LA46_204>='(' && LA46_204<='[')||(LA46_204>=']' && LA46_204<='\uFFFF')) ) {s = 127;}

                        else if ( (LA46_204=='\n') ) {s = 73;}

                        if ( s>=0 ) return s;
                        break;
                    case 42 : 
                        int LA46_65 = input.LA(1);

                        s = -1;
                        if ( ((LA46_65>='\u0000' && LA46_65<='\t')||(LA46_65>='\u000B' && LA46_65<='\uFFFF')) ) {s = 70;}

                        else s = 69;

                        if ( s>=0 ) return s;
                        break;
                    case 43 : 
                        int LA46_66 = input.LA(1);

                        s = -1;
                        if ( ((LA46_66>='\u0000' && LA46_66<='\t')||(LA46_66>='\u000B' && LA46_66<='\uFFFF')) ) {s = 70;}

                        else s = 69;

                        if ( s>=0 ) return s;
                        break;
                    case 44 : 
                        int LA46_0 = input.LA(1);

                        s = -1;
                        if ( (LA46_0=='t') ) {s = 1;}

                        else if ( (LA46_0=='f') ) {s = 2;}

                        else if ( (LA46_0=='<') ) {s = 3;}

                        else if ( (LA46_0=='\"') ) {s = 4;}

                        else if ( ((LA46_0>='1' && LA46_0<='9')) ) {s = 5;}

                        else if ( (LA46_0=='a') ) {s = 6;}

                        else if ( (LA46_0=='b') ) {s = 7;}

                        else if ( (LA46_0=='c') ) {s = 8;}

                        else if ( (LA46_0=='d') ) {s = 9;}

                        else if ( (LA46_0=='e') ) {s = 10;}

                        else if ( (LA46_0=='g') ) {s = 11;}

                        else if ( (LA46_0=='i') ) {s = 12;}

                        else if ( (LA46_0=='l') ) {s = 13;}

                        else if ( (LA46_0=='m') ) {s = 14;}

                        else if ( (LA46_0=='n') ) {s = 15;}

                        else if ( (LA46_0=='o') ) {s = 16;}

                        else if ( (LA46_0=='p') ) {s = 17;}

                        else if ( (LA46_0=='r') ) {s = 18;}

                        else if ( (LA46_0=='s') ) {s = 19;}

                        else if ( (LA46_0=='u') ) {s = 20;}

                        else if ( (LA46_0=='v') ) {s = 21;}

                        else if ( (LA46_0=='w') ) {s = 22;}

                        else if ( (LA46_0=='x') ) {s = 23;}

                        else if ( (LA46_0=='{') ) {s = 24;}

                        else if ( (LA46_0=='}') ) {s = 25;}

                        else if ( (LA46_0=='[') ) {s = 26;}

                        else if ( (LA46_0==']') ) {s = 27;}

                        else if ( (LA46_0=='#') ) {s = 28;}

                        else if ( (LA46_0=='(') ) {s = 29;}

                        else if ( (LA46_0==')') ) {s = 30;}

                        else if ( (LA46_0==':') ) {s = 31;}

                        else if ( (LA46_0=='%') ) {s = 32;}

                        else if ( (LA46_0==';') ) {s = 33;}

                        else if ( (LA46_0=='.') ) {s = 34;}

                        else if ( (LA46_0=='?') ) {s = 35;}

                        else if ( (LA46_0=='+') ) {s = 36;}

                        else if ( (LA46_0=='-') ) {s = 37;}

                        else if ( (LA46_0=='*') ) {s = 38;}

                        else if ( (LA46_0=='/') ) {s = 39;}

                        else if ( (LA46_0=='^') ) {s = 40;}

                        else if ( (LA46_0=='&') ) {s = 41;}

                        else if ( (LA46_0=='|') ) {s = 42;}

                        else if ( (LA46_0=='~') ) {s = 43;}

                        else if ( (LA46_0=='!') ) {s = 44;}

                        else if ( (LA46_0=='=') ) {s = 45;}

                        else if ( (LA46_0=='>') ) {s = 46;}

                        else if ( (LA46_0==',') ) {s = 47;}

                        else if ( (LA46_0=='U') ) {s = 48;}

                        else if ( (LA46_0=='0') ) {s = 49;}

                        else if ( ((LA46_0>='A' && LA46_0<='K')||(LA46_0>='M' && LA46_0<='T')||(LA46_0>='V' && LA46_0<='Z')||LA46_0=='_'||LA46_0=='h'||(LA46_0>='j' && LA46_0<='k')||LA46_0=='q'||(LA46_0>='y' && LA46_0<='z')) ) {s = 50;}

                        else if ( (LA46_0=='\'') ) {s = 51;}

                        else if ( (LA46_0=='L') ) {s = 52;}

                        else if ( ((LA46_0>='\t' && LA46_0<='\n')||LA46_0=='\r'||LA46_0==' ') ) {s = 53;}

                        else if ( ((LA46_0>='\u0000' && LA46_0<='\b')||(LA46_0>='\u000B' && LA46_0<='\f')||(LA46_0>='\u000E' && LA46_0<='\u001F')||LA46_0=='$'||LA46_0=='@'||LA46_0=='\\'||LA46_0=='`'||(LA46_0>='\u007F' && LA46_0<='\uFFFF')) ) {s = 54;}

                        if ( s>=0 ) return s;
                        break;
                    case 45 : 
                        int LA46_300 = input.LA(1);

                        s = -1;
                        if ( ((LA46_300>='\u0000' && LA46_300<='\t')||(LA46_300>='\u000B' && LA46_300<='\uFFFF')) ) {s = 117;}

                        else s = 70;

                        if ( s>=0 ) return s;
                        break;
                    case 46 : 
                        int LA46_145 = input.LA(1);

                        s = -1;
                        if ( ((LA46_145>='0' && LA46_145<='7')) ) {s = 228;}

                        else if ( ((LA46_145>='\u0000' && LA46_145<='\t')||(LA46_145>='\u000B' && LA46_145<='/')||(LA46_145>='8' && LA46_145<='\uFFFF')) ) {s = 70;}

                        if ( s>=0 ) return s;
                        break;
                    case 47 : 
                        int LA46_228 = input.LA(1);

                        s = -1;
                        if ( ((LA46_228>='0' && LA46_228<='7')) ) {s = 304;}

                        else if ( ((LA46_228>='\u0000' && LA46_228<='\t')||(LA46_228>='\u000B' && LA46_228<='/')||(LA46_228>='8' && LA46_228<='\uFFFF')) ) {s = 70;}

                        if ( s>=0 ) return s;
                        break;
                    case 48 : 
                        int LA46_71 = input.LA(1);

                        s = -1;
                        if ( (LA46_71=='\"') ) {s = 140;}

                        else if ( (LA46_71=='u') ) {s = 141;}

                        else if ( (LA46_71=='?'||LA46_71=='a'||LA46_71=='v') ) {s = 142;}

                        else if ( (LA46_71=='x') ) {s = 143;}

                        else if ( (LA46_71=='U') ) {s = 144;}

                        else if ( ((LA46_71>='0' && LA46_71<='7')) ) {s = 145;}

                        else if ( (LA46_71=='\''||LA46_71=='\\'||LA46_71=='b'||LA46_71=='f'||LA46_71=='n'||LA46_71=='r'||LA46_71=='t') ) {s = 146;}

                        else if ( ((LA46_71>='\u0000' && LA46_71<='\t')||(LA46_71>='\u000B' && LA46_71<='!')||(LA46_71>='#' && LA46_71<='&')||(LA46_71>='(' && LA46_71<='/')||(LA46_71>='8' && LA46_71<='>')||(LA46_71>='@' && LA46_71<='T')||(LA46_71>='V' && LA46_71<='[')||(LA46_71>=']' && LA46_71<='`')||(LA46_71>='c' && LA46_71<='e')||(LA46_71>='g' && LA46_71<='m')||(LA46_71>='o' && LA46_71<='q')||LA46_71=='s'||LA46_71=='w'||(LA46_71>='y' && LA46_71<='\uFFFF')) ) {s = 70;}

                        if ( s>=0 ) return s;
                        break;
                    case 49 : 
                        int LA46_205 = input.LA(1);

                        s = -1;
                        if ( ((LA46_205>='0' && LA46_205<='9')||(LA46_205>='A' && LA46_205<='F')) ) {s = 284;}

                        else if ( ((LA46_205>='\u0000' && LA46_205<='/')||(LA46_205>=':' && LA46_205<='@')||(LA46_205>='G' && LA46_205<='\uFFFF')) ) {s = 73;}

                        if ( s>=0 ) return s;
                        break;
                    case 50 : 
                        int LA46_139 = input.LA(1);

                        s = -1;
                        if ( ((LA46_139>='\u0000' && LA46_139<='\t')||(LA46_139>='\u000B' && LA46_139<='\uFFFF')) ) {s = 70;}

                        else s = 69;

                        if ( s>=0 ) return s;
                        break;
                    case 51 : 
                        int LA46_68 = input.LA(1);

                        s = -1;
                        if ( ((LA46_68>='\u0000' && LA46_68<='\t')||(LA46_68>='\u000B' && LA46_68<='\uFFFF')) ) {s = 70;}

                        else s = 69;

                        if ( s>=0 ) return s;
                        break;
                    case 52 : 
                        int LA46_51 = input.LA(1);

                        s = -1;
                        if ( (LA46_51=='\\') ) {s = 126;}

                        else if ( ((LA46_51>='\u0000' && LA46_51<='\t')||(LA46_51>='\u000B' && LA46_51<='&')||(LA46_51>='(' && LA46_51<='[')||(LA46_51>=']' && LA46_51<='\uFFFF')) ) {s = 127;}

                        else if ( (LA46_51=='\n'||LA46_51=='\'') ) {s = 73;}

                        else s = 54;

                        if ( s>=0 ) return s;
                        break;
                    case 53 : 
                        int LA46_67 = input.LA(1);

                        s = -1;
                        if ( (LA46_67=='=') ) {s = 139;}

                        else if ( ((LA46_67>='\u0000' && LA46_67<='\t')||(LA46_67>='\u000B' && LA46_67<='<')||(LA46_67>='>' && LA46_67<='\uFFFF')) ) {s = 70;}

                        else s = 69;

                        if ( s>=0 ) return s;
                        break;
                    case 54 : 
                        int LA46_466 = input.LA(1);

                        s = -1;
                        if ( (LA46_466=='\"') ) {s = 223;}

                        else if ( ((LA46_466>='\u0000' && LA46_466<='\t')||(LA46_466>='\u000B' && LA46_466<='!')||(LA46_466>='#' && LA46_466<='[')||(LA46_466>=']' && LA46_466<='\uFFFF')) ) {s = 224;}

                        else if ( (LA46_466=='\\') ) {s = 225;}

                        if ( s>=0 ) return s;
                        break;
                    case 55 : 
                        int LA46_3 = input.LA(1);

                        s = -1;
                        if ( (LA46_3==':') ) {s = 65;}

                        else if ( (LA46_3=='%') ) {s = 66;}

                        else if ( (LA46_3=='<') ) {s = 67;}

                        else if ( (LA46_3=='=') ) {s = 68;}

                        else if ( ((LA46_3>='\u0000' && LA46_3<='\t')||(LA46_3>='\u000B' && LA46_3<='$')||(LA46_3>='&' && LA46_3<='9')||LA46_3==';'||(LA46_3>='?' && LA46_3<='\uFFFF')) ) {s = 70;}

                        else s = 69;

                        if ( s>=0 ) return s;
                        break;
                    case 56 : 
                        int LA46_484 = input.LA(1);

                        s = -1;
                        if ( (LA46_484=='\"') ) {s = 223;}

                        else if ( ((LA46_484>='\u0000' && LA46_484<='\t')||(LA46_484>='\u000B' && LA46_484<='!')||(LA46_484>='#' && LA46_484<='[')||(LA46_484>=']' && LA46_484<='\uFFFF')) ) {s = 224;}

                        else if ( (LA46_484=='\\') ) {s = 225;}

                        if ( s>=0 ) return s;
                        break;
                    case 57 : 
                        int LA46_304 = input.LA(1);

                        s = -1;
                        if ( (LA46_304=='\"') ) {s = 223;}

                        else if ( ((LA46_304>='\u0000' && LA46_304<='\t')||(LA46_304>='\u000B' && LA46_304<='!')||(LA46_304>='#' && LA46_304<='[')||(LA46_304>=']' && LA46_304<='\uFFFF')) ) {s = 224;}

                        else if ( (LA46_304=='\\') ) {s = 225;}

                        if ( s>=0 ) return s;
                        break;
                    case 58 : 
                        int LA46_299 = input.LA(1);

                        s = -1;
                        if ( (LA46_299=='\"') ) {s = 220;}

                        else if ( (LA46_299=='\\') ) {s = 221;}

                        else if ( ((LA46_299>='\u0000' && LA46_299<='\t')||(LA46_299>='\u000B' && LA46_299<='!')||(LA46_299>='#' && LA46_299<='[')||(LA46_299>=']' && LA46_299<='\uFFFF')) ) {s = 222;}

                        else if ( (LA46_299=='\n') ) {s = 73;}

                        if ( s>=0 ) return s;
                        break;
                    case 59 : 
                        int LA46_222 = input.LA(1);

                        s = -1;
                        if ( (LA46_222=='\"') ) {s = 220;}

                        else if ( (LA46_222=='\\') ) {s = 221;}

                        else if ( ((LA46_222>='\u0000' && LA46_222<='\t')||(LA46_222>='\u000B' && LA46_222<='!')||(LA46_222>='#' && LA46_222<='[')||(LA46_222>=']' && LA46_222<='\uFFFF')) ) {s = 222;}

                        else if ( (LA46_222=='\n') ) {s = 73;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 46, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}