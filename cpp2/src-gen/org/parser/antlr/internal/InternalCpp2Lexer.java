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
    public static final int RULE_ID=8;
    public static final int RULE_FLOATING_LITERAL=6;
    public static final int T__159=159;
    public static final int T__158=158;
    public static final int RULE_ANY_OTHER=34;
    public static final int T__160=160;
    public static final int EOF=-1;
    public static final int T__93=93;
    public static final int RULE_OCTAL_DIGIT=20;
    public static final int T__94=94;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int T__148=148;
    public static final int T__147=147;
    public static final int T__90=90;
    public static final int T__149=149;
    public static final int RULE_KEYWORD=12;
    public static final int RULE_DECIMAL_LITERAL=16;
    public static final int RULE_OCTAL_LITERAL=17;
    public static final int T__154=154;
    public static final int T__155=155;
    public static final int T__156=156;
    public static final int RULE_NONDIGIT=14;
    public static final int T__99=99;
    public static final int T__157=157;
    public static final int T__98=98;
    public static final int T__150=150;
    public static final int T__97=97;
    public static final int T__151=151;
    public static final int RULE_CHARACTER_LITERAL=5;
    public static final int T__96=96;
    public static final int T__152=152;
    public static final int RULE_HEX_QUAD=10;
    public static final int T__95=95;
    public static final int T__153=153;
    public static final int T__139=139;
    public static final int RULE_HEXADECIMAL_LITERAL=18;
    public static final int T__138=138;
    public static final int T__137=137;
    public static final int T__136=136;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_SCHAR=29;
    public static final int RULE_C_CHAR=21;
    public static final int T__141=141;
    public static final int T__85=85;
    public static final int T__142=142;
    public static final int T__84=84;
    public static final int T__87=87;
    public static final int T__140=140;
    public static final int T__86=86;
    public static final int T__145=145;
    public static final int T__89=89;
    public static final int T__146=146;
    public static final int T__88=88;
    public static final int RULE_ML_COMMENT=31;
    public static final int T__143=143;
    public static final int T__144=144;
    public static final int T__126=126;
    public static final int T__125=125;
    public static final int T__128=128;
    public static final int RULE_STRING=30;
    public static final int T__127=127;
    public static final int T__71=71;
    public static final int T__129=129;
    public static final int T__72=72;
    public static final int T__70=70;
    public static final int RULE_OCTAL_ESCAPE_SEQUENCE=24;
    public static final int T__76=76;
    public static final int RULE_DIGIT=15;
    public static final int T__75=75;
    public static final int T__130=130;
    public static final int T__74=74;
    public static final int RULE_INTEGER_SUFFIX=19;
    public static final int T__131=131;
    public static final int T__73=73;
    public static final int T__132=132;
    public static final int T__133=133;
    public static final int T__79=79;
    public static final int RULE_SIMPLE_ESCAPE_SEQUENCE=23;
    public static final int T__134=134;
    public static final int T__78=78;
    public static final int T__135=135;
    public static final int T__77=77;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__118=118;
    public static final int RULE_ESCAPE_SEQUENCE=22;
    public static final int T__119=119;
    public static final int RULE_HEXADECIMAL_ESCAPE_SEQUENCE=25;
    public static final int T__116=116;
    public static final int T__117=117;
    public static final int T__114=114;
    public static final int RULE_ENC_PREFIX=28;
    public static final int T__115=115;
    public static final int T__124=124;
    public static final int T__123=123;
    public static final int T__122=122;
    public static final int T__121=121;
    public static final int T__120=120;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int RULE_EXPONENT_PART=27;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_STRING_LITERAL=7;
    public static final int T__107=107;
    public static final int RULE_FRACTIONAL_CONSTANT=26;
    public static final int T__108=108;
    public static final int T__109=109;
    public static final int T__103=103;
    public static final int T__59=59;
    public static final int T__104=104;
    public static final int T__105=105;
    public static final int T__106=106;
    public static final int T__111=111;
    public static final int T__110=110;
    public static final int T__113=113;
    public static final int RULE_INT=4;
    public static final int T__112=112;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__102=102;
    public static final int T__101=101;
    public static final int T__100=100;
    public static final int RULE_PREPROCESSING_OP_OR_PUNC=13;
    public static final int RULE_SL_COMMENT=32;
    public static final int RULE_HEXADECIMAL_DIGIT=9;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_UNIVERSAL_CHARACTER_NAME=11;
    public static final int RULE_WS=33;

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

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
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
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
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
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:13:7: ( 'nullptr' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:13:9: 'nullptr'
            {
            match("nullptr"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:14:7: ( ':' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:14:9: ':'
            {
            match(':'); 

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
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:15:7: ( 'case' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:15:9: 'case'
            {
            match("case"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:16:7: ( 'default' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:16:9: 'default'
            {
            match("default"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:17:7: ( ';' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:17:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:18:7: ( '{' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:18:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:19:7: ( '}' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:19:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:20:7: ( 'if' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:20:9: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:21:7: ( '(' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:21:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:22:7: ( ')' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:22:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:23:7: ( 'else' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:23:9: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:24:7: ( 'switch' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:24:9: 'switch'
            {
            match("switch"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:25:7: ( '=' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:25:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:26:7: ( 'while' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:26:9: 'while'
            {
            match("while"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:27:7: ( 'do' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:27:9: 'do'
            {
            match("do"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:28:7: ( 'for' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:28:9: 'for'
            {
            match("for"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:29:7: ( 'break' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:29:9: 'break'
            {
            match("break"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:30:7: ( 'continue' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:30:9: 'continue'
            {
            match("continue"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:31:7: ( 'return' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:31:9: 'return'
            {
            match("return"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:32:7: ( 'goto' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:32:9: 'goto'
            {
            match("goto"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:33:7: ( 'using' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:33:9: 'using'
            {
            match("using"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:34:7: ( 'delete' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:34:9: 'delete'
            {
            match("delete"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:35:7: ( 'static_assert' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:35:9: 'static_assert'
            {
            match("static_assert"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:36:7: ( ',' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:36:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:37:7: ( 'friend' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:37:9: 'friend'
            {
            match("friend"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:38:7: ( 'typedef' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:38:9: 'typedef'
            {
            match("typedef"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:39:7: ( 'constexpr' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:39:9: 'constexpr'
            {
            match("constexpr"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:40:7: ( 'register' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:40:9: 'register'
            {
            match("register"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:41:7: ( 'static' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:41:9: 'static'
            {
            match("static"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:42:7: ( 'thread_local' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:42:9: 'thread_local'
            {
            match("thread_local"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:43:7: ( 'extern' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:43:9: 'extern'
            {
            match("extern"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:44:7: ( 'mutable' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:44:9: 'mutable'
            {
            match("mutable"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:45:7: ( 'inline' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:45:9: 'inline'
            {
            match("inline"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:46:7: ( 'virtual' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:46:9: 'virtual'
            {
            match("virtual"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:47:7: ( 'explicit' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:47:9: 'explicit'
            {
            match("explicit"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:48:7: ( '::' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:48:9: '::'
            {
            match("::"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:49:7: ( 'template' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:49:9: 'template'
            {
            match("template"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:50:7: ( 'char' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:50:9: 'char'
            {
            match("char"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:51:7: ( 'char16_t' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:51:9: 'char16_t'
            {
            match("char16_t"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:52:7: ( 'char32_t' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:52:9: 'char32_t'
            {
            match("char32_t"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:53:7: ( 'wchar_t' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:53:9: 'wchar_t'
            {
            match("wchar_t"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:54:7: ( 'bool' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:54:9: 'bool'
            {
            match("bool"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__78"

    // $ANTLR start "T__79"
    public final void mT__79() throws RecognitionException {
        try {
            int _type = T__79;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:55:7: ( 'short' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:55:9: 'short'
            {
            match("short"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__79"

    // $ANTLR start "T__80"
    public final void mT__80() throws RecognitionException {
        try {
            int _type = T__80;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:56:7: ( 'int' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:56:9: 'int'
            {
            match("int"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__80"

    // $ANTLR start "T__81"
    public final void mT__81() throws RecognitionException {
        try {
            int _type = T__81;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:57:7: ( 'long' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:57:9: 'long'
            {
            match("long"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__81"

    // $ANTLR start "T__82"
    public final void mT__82() throws RecognitionException {
        try {
            int _type = T__82;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:58:7: ( 'signed' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:58:9: 'signed'
            {
            match("signed"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__82"

    // $ANTLR start "T__83"
    public final void mT__83() throws RecognitionException {
        try {
            int _type = T__83;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:59:7: ( 'unsigned' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:59:9: 'unsigned'
            {
            match("unsigned"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__83"

    // $ANTLR start "T__84"
    public final void mT__84() throws RecognitionException {
        try {
            int _type = T__84;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:60:7: ( 'float' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:60:9: 'float'
            {
            match("float"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__84"

    // $ANTLR start "T__85"
    public final void mT__85() throws RecognitionException {
        try {
            int _type = T__85;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:61:7: ( 'double' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:61:9: 'double'
            {
            match("double"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__85"

    // $ANTLR start "T__86"
    public final void mT__86() throws RecognitionException {
        try {
            int _type = T__86;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:62:7: ( 'void' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:62:9: 'void'
            {
            match("void"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__86"

    // $ANTLR start "T__87"
    public final void mT__87() throws RecognitionException {
        try {
            int _type = T__87;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:63:7: ( 'auto' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:63:9: 'auto'
            {
            match("auto"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__87"

    // $ANTLR start "T__88"
    public final void mT__88() throws RecognitionException {
        try {
            int _type = T__88;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:64:7: ( 'decltype' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:64:9: 'decltype'
            {
            match("decltype"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__88"

    // $ANTLR start "T__89"
    public final void mT__89() throws RecognitionException {
        try {
            int _type = T__89;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:65:7: ( 'enum' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:65:9: 'enum'
            {
            match("enum"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__89"

    // $ANTLR start "T__90"
    public final void mT__90() throws RecognitionException {
        try {
            int _type = T__90;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:66:7: ( 'class' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:66:9: 'class'
            {
            match("class"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__90"

    // $ANTLR start "T__91"
    public final void mT__91() throws RecognitionException {
        try {
            int _type = T__91;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:67:7: ( 'struct' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:67:9: 'struct'
            {
            match("struct"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__91"

    // $ANTLR start "T__92"
    public final void mT__92() throws RecognitionException {
        try {
            int _type = T__92;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:68:7: ( 'namespace' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:68:9: 'namespace'
            {
            match("namespace"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__92"

    // $ANTLR start "T__93"
    public final void mT__93() throws RecognitionException {
        try {
            int _type = T__93;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:69:7: ( 'typename' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:69:9: 'typename'
            {
            match("typename"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__93"

    // $ANTLR start "T__94"
    public final void mT__94() throws RecognitionException {
        try {
            int _type = T__94;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:70:7: ( 'asm' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:70:9: 'asm'
            {
            match("asm"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__94"

    // $ANTLR start "T__95"
    public final void mT__95() throws RecognitionException {
        try {
            int _type = T__95;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:71:7: ( 'const' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:71:9: 'const'
            {
            match("const"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__95"

    // $ANTLR start "T__96"
    public final void mT__96() throws RecognitionException {
        try {
            int _type = T__96;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:72:7: ( 'volatile' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:72:9: 'volatile'
            {
            match("volatile"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__96"

    // $ANTLR start "T__97"
    public final void mT__97() throws RecognitionException {
        try {
            int _type = T__97;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:73:7: ( '&' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:73:9: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__97"

    // $ANTLR start "T__98"
    public final void mT__98() throws RecognitionException {
        try {
            int _type = T__98;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:74:7: ( '&&' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:74:9: '&&'
            {
            match("&&"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__98"

    // $ANTLR start "T__99"
    public final void mT__99() throws RecognitionException {
        try {
            int _type = T__99;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:75:7: ( '...' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:75:9: '...'
            {
            match("..."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__99"

    // $ANTLR start "T__100"
    public final void mT__100() throws RecognitionException {
        try {
            int _type = T__100;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:76:8: ( 'final' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:76:10: 'final'
            {
            match("final"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__100"

    // $ANTLR start "T__101"
    public final void mT__101() throws RecognitionException {
        try {
            int _type = T__101;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:77:8: ( 'union' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:77:10: 'union'
            {
            match("union"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__101"

    // $ANTLR start "T__102"
    public final void mT__102() throws RecognitionException {
        try {
            int _type = T__102;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:78:8: ( 'override' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:78:10: 'override'
            {
            match("override"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__102"

    // $ANTLR start "T__103"
    public final void mT__103() throws RecognitionException {
        try {
            int _type = T__103;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:79:8: ( 'new' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:79:10: 'new'
            {
            match("new"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__103"

    // $ANTLR start "T__104"
    public final void mT__104() throws RecognitionException {
        try {
            int _type = T__104;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:80:8: ( '0' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:80:10: '0'
            {
            match('0'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__104"

    // $ANTLR start "T__105"
    public final void mT__105() throws RecognitionException {
        try {
            int _type = T__105;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:81:8: ( 'private' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:81:10: 'private'
            {
            match("private"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__105"

    // $ANTLR start "T__106"
    public final void mT__106() throws RecognitionException {
        try {
            int _type = T__106;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:82:8: ( 'protected' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:82:10: 'protected'
            {
            match("protected"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__106"

    // $ANTLR start "T__107"
    public final void mT__107() throws RecognitionException {
        try {
            int _type = T__107;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:83:8: ( 'public' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:83:10: 'public'
            {
            match("public"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__107"

    // $ANTLR start "T__108"
    public final void mT__108() throws RecognitionException {
        try {
            int _type = T__108;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:84:8: ( 'operator' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:84:10: 'operator'
            {
            match("operator"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__108"

    // $ANTLR start "T__109"
    public final void mT__109() throws RecognitionException {
        try {
            int _type = T__109;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:85:8: ( '<' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:85:10: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__109"

    // $ANTLR start "T__110"
    public final void mT__110() throws RecognitionException {
        try {
            int _type = T__110;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:86:8: ( '>' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:86:10: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__110"

    // $ANTLR start "T__111"
    public final void mT__111() throws RecognitionException {
        try {
            int _type = T__111;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:87:8: ( '[' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:87:10: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__111"

    // $ANTLR start "T__112"
    public final void mT__112() throws RecognitionException {
        try {
            int _type = T__112;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:88:8: ( ']' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:88:10: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__112"

    // $ANTLR start "T__113"
    public final void mT__113() throws RecognitionException {
        try {
            int _type = T__113;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:89:8: ( '+' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:89:10: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__113"

    // $ANTLR start "T__114"
    public final void mT__114() throws RecognitionException {
        try {
            int _type = T__114;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:90:8: ( '-' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:90:10: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__114"

    // $ANTLR start "T__115"
    public final void mT__115() throws RecognitionException {
        try {
            int _type = T__115;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:91:8: ( '*' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:91:10: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__115"

    // $ANTLR start "T__116"
    public final void mT__116() throws RecognitionException {
        try {
            int _type = T__116;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:92:8: ( '/' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:92:10: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__116"

    // $ANTLR start "T__117"
    public final void mT__117() throws RecognitionException {
        try {
            int _type = T__117;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:93:8: ( '%' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:93:10: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__117"

    // $ANTLR start "T__118"
    public final void mT__118() throws RecognitionException {
        try {
            int _type = T__118;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:94:8: ( '^' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:94:10: '^'
            {
            match('^'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__118"

    // $ANTLR start "T__119"
    public final void mT__119() throws RecognitionException {
        try {
            int _type = T__119;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:95:8: ( '|' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:95:10: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__119"

    // $ANTLR start "T__120"
    public final void mT__120() throws RecognitionException {
        try {
            int _type = T__120;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:96:8: ( '~' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:96:10: '~'
            {
            match('~'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__120"

    // $ANTLR start "T__121"
    public final void mT__121() throws RecognitionException {
        try {
            int _type = T__121;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:97:8: ( '!' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:97:10: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__121"

    // $ANTLR start "T__122"
    public final void mT__122() throws RecognitionException {
        try {
            int _type = T__122;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:98:8: ( '+=' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:98:10: '+='
            {
            match("+="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__122"

    // $ANTLR start "T__123"
    public final void mT__123() throws RecognitionException {
        try {
            int _type = T__123;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:99:8: ( '-=' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:99:10: '-='
            {
            match("-="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__123"

    // $ANTLR start "T__124"
    public final void mT__124() throws RecognitionException {
        try {
            int _type = T__124;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:100:8: ( '*=' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:100:10: '*='
            {
            match("*="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__124"

    // $ANTLR start "T__125"
    public final void mT__125() throws RecognitionException {
        try {
            int _type = T__125;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:101:8: ( '/=' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:101:10: '/='
            {
            match("/="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__125"

    // $ANTLR start "T__126"
    public final void mT__126() throws RecognitionException {
        try {
            int _type = T__126;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:102:8: ( '%=' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:102:10: '%='
            {
            match("%="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__126"

    // $ANTLR start "T__127"
    public final void mT__127() throws RecognitionException {
        try {
            int _type = T__127;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:103:8: ( '^=' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:103:10: '^='
            {
            match("^="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__127"

    // $ANTLR start "T__128"
    public final void mT__128() throws RecognitionException {
        try {
            int _type = T__128;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:104:8: ( '&=' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:104:10: '&='
            {
            match("&="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__128"

    // $ANTLR start "T__129"
    public final void mT__129() throws RecognitionException {
        try {
            int _type = T__129;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:105:8: ( '|=' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:105:10: '|='
            {
            match("|="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__129"

    // $ANTLR start "T__130"
    public final void mT__130() throws RecognitionException {
        try {
            int _type = T__130;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:106:8: ( '<<' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:106:10: '<<'
            {
            match("<<"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__130"

    // $ANTLR start "T__131"
    public final void mT__131() throws RecognitionException {
        try {
            int _type = T__131;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:107:8: ( '>>' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:107:10: '>>'
            {
            match(">>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__131"

    // $ANTLR start "T__132"
    public final void mT__132() throws RecognitionException {
        try {
            int _type = T__132;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:108:8: ( '>>=' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:108:10: '>>='
            {
            match(">>="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__132"

    // $ANTLR start "T__133"
    public final void mT__133() throws RecognitionException {
        try {
            int _type = T__133;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:109:8: ( '<<=' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:109:10: '<<='
            {
            match("<<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__133"

    // $ANTLR start "T__134"
    public final void mT__134() throws RecognitionException {
        try {
            int _type = T__134;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:110:8: ( '==' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:110:10: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__134"

    // $ANTLR start "T__135"
    public final void mT__135() throws RecognitionException {
        try {
            int _type = T__135;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:111:8: ( '!=' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:111:10: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__135"

    // $ANTLR start "T__136"
    public final void mT__136() throws RecognitionException {
        try {
            int _type = T__136;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:112:8: ( '<=' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:112:10: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__136"

    // $ANTLR start "T__137"
    public final void mT__137() throws RecognitionException {
        try {
            int _type = T__137;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:113:8: ( '>=' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:113:10: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__137"

    // $ANTLR start "T__138"
    public final void mT__138() throws RecognitionException {
        try {
            int _type = T__138;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:114:8: ( '||' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:114:10: '||'
            {
            match("||"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__138"

    // $ANTLR start "T__139"
    public final void mT__139() throws RecognitionException {
        try {
            int _type = T__139;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:115:8: ( '++' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:115:10: '++'
            {
            match("++"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__139"

    // $ANTLR start "T__140"
    public final void mT__140() throws RecognitionException {
        try {
            int _type = T__140;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:116:8: ( '--' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:116:10: '--'
            {
            match("--"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__140"

    // $ANTLR start "T__141"
    public final void mT__141() throws RecognitionException {
        try {
            int _type = T__141;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:117:8: ( '->*' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:117:10: '->*'
            {
            match("->*"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__141"

    // $ANTLR start "T__142"
    public final void mT__142() throws RecognitionException {
        try {
            int _type = T__142;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:118:8: ( '->' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:118:10: '->'
            {
            match("->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__142"

    // $ANTLR start "T__143"
    public final void mT__143() throws RecognitionException {
        try {
            int _type = T__143;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:119:8: ( '()' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:119:10: '()'
            {
            match("()"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__143"

    // $ANTLR start "T__144"
    public final void mT__144() throws RecognitionException {
        try {
            int _type = T__144;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:120:8: ( '[]' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:120:10: '[]'
            {
            match("[]"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__144"

    // $ANTLR start "T__145"
    public final void mT__145() throws RecognitionException {
        try {
            int _type = T__145;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:121:8: ( '\"' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:121:10: '\"'
            {
            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__145"

    // $ANTLR start "T__146"
    public final void mT__146() throws RecognitionException {
        try {
            int _type = T__146;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:122:8: ( 'try' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:122:10: 'try'
            {
            match("try"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__146"

    // $ANTLR start "T__147"
    public final void mT__147() throws RecognitionException {
        try {
            int _type = T__147;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:123:8: ( 'catch' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:123:10: 'catch'
            {
            match("catch"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__147"

    // $ANTLR start "T__148"
    public final void mT__148() throws RecognitionException {
        try {
            int _type = T__148;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:124:8: ( 'throw' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:124:10: 'throw'
            {
            match("throw"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__148"

    // $ANTLR start "T__149"
    public final void mT__149() throws RecognitionException {
        try {
            int _type = T__149;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:125:8: ( 'noexcept' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:125:10: 'noexcept'
            {
            match("noexcept"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__149"

    // $ANTLR start "T__150"
    public final void mT__150() throws RecognitionException {
        try {
            int _type = T__150;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:126:8: ( 'Expression' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:126:10: 'Expression'
            {
            match("Expression"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__150"

    // $ANTLR start "T__151"
    public final void mT__151() throws RecognitionException {
        try {
            int _type = T__151;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:127:8: ( 'ExplicitSpecialization' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:127:10: 'ExplicitSpecialization'
            {
            match("ExplicitSpecialization"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__151"

    // $ANTLR start "T__152"
    public final void mT__152() throws RecognitionException {
        try {
            int _type = T__152;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:128:8: ( 'ExplicitInstantiation' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:128:10: 'ExplicitInstantiation'
            {
            match("ExplicitInstantiation"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__152"

    // $ANTLR start "T__153"
    public final void mT__153() throws RecognitionException {
        try {
            int _type = T__153;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:129:8: ( 'CvQualifier' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:129:10: 'CvQualifier'
            {
            match("CvQualifier"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__153"

    // $ANTLR start "T__154"
    public final void mT__154() throws RecognitionException {
        try {
            int _type = T__154;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:130:8: ( 'ConstantExpression' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:130:10: 'ConstantExpression'
            {
            match("ConstantExpression"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__154"

    // $ANTLR start "T__155"
    public final void mT__155() throws RecognitionException {
        try {
            int _type = T__155;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:131:8: ( 'IdExpression' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:131:10: 'IdExpression'
            {
            match("IdExpression"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__155"

    // $ANTLR start "T__156"
    public final void mT__156() throws RecognitionException {
        try {
            int _type = T__156;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:132:8: ( 'NestedNameSpecifier' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:132:10: 'NestedNameSpecifier'
            {
            match("NestedNameSpecifier"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__156"

    // $ANTLR start "T__157"
    public final void mT__157() throws RecognitionException {
        try {
            int _type = T__157;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:133:8: ( 'AssignmentExpression' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:133:10: 'AssignmentExpression'
            {
            match("AssignmentExpression"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__157"

    // $ANTLR start "T__158"
    public final void mT__158() throws RecognitionException {
        try {
            int _type = T__158;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:134:8: ( 'CtorInitializer' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:134:10: 'CtorInitializer'
            {
            match("CtorInitializer"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__158"

    // $ANTLR start "T__159"
    public final void mT__159() throws RecognitionException {
        try {
            int _type = T__159;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:135:8: ( 'TypeIdList' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:135:10: 'TypeIdList'
            {
            match("TypeIdList"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__159"

    // $ANTLR start "T__160"
    public final void mT__160() throws RecognitionException {
        try {
            int _type = T__160;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:136:8: ( 'UnqualifiedId' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:136:10: 'UnqualifiedId'
            {
            match("UnqualifiedId"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__160"

    // $ANTLR start "RULE_HEX_QUAD"
    public final void mRULE_HEX_QUAD() throws RecognitionException {
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6150:24: ( RULE_HEXADECIMAL_DIGIT RULE_HEXADECIMAL_DIGIT RULE_HEXADECIMAL_DIGIT RULE_HEXADECIMAL_DIGIT )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6150:26: RULE_HEXADECIMAL_DIGIT RULE_HEXADECIMAL_DIGIT RULE_HEXADECIMAL_DIGIT RULE_HEXADECIMAL_DIGIT
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
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6152:40: ( ( '\\\\u' RULE_HEX_QUAD | '\\\\U' RULE_HEX_QUAD RULE_HEX_QUAD ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6152:42: ( '\\\\u' RULE_HEX_QUAD | '\\\\U' RULE_HEX_QUAD RULE_HEX_QUAD )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6152:42: ( '\\\\u' RULE_HEX_QUAD | '\\\\U' RULE_HEX_QUAD RULE_HEX_QUAD )
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
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6152:43: '\\\\u' RULE_HEX_QUAD
                    {
                    match("\\u"); 

                    mRULE_HEX_QUAD(); 

                    }
                    break;
                case 2 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6152:63: '\\\\U' RULE_HEX_QUAD RULE_HEX_QUAD
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

    // $ANTLR start "RULE_KEYWORD"
    public final void mRULE_KEYWORD() throws RecognitionException {
        try {
            int _type = RULE_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6154:14: ( ( 'alignas' | 'alignof' | 'asm' | 'auto' | 'bool' | 'break' | 'case' | 'catch' | 'char' | 'char16_t' | 'char32_t' | 'class' | 'const' | 'constexpr' | 'const_cast' | 'continue' | 'decltype' | 'default' | 'delete' | 'do' | 'double' | 'dynamic_cast' | 'else' | 'enum' | 'explicit' | 'export' | 'extern' | 'false' | 'float' | 'for' | 'friend' | 'goto' | 'if' | 'inline' | 'int' | 'long' | 'mutable' | 'namespace' | 'new' | 'noexcept' | 'nullptr' | 'operator' | 'private' | 'protected' | 'public' | 'register' | 'reinterpret_cast' | 'return' | 'short' | 'signed' | 'sizeof' | 'static' | 'static_assert' | 'static_cast' | 'struct' | 'switch' | 'template' | 'this' | 'thread_local' | 'throw' | 'true' | 'try' | 'typedef' | 'typeid' | 'typename' | 'union' | 'unsigned' | 'using' | 'virtual' | 'void' | 'volatile' | 'wchar_t' | 'while' ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6154:16: ( 'alignas' | 'alignof' | 'asm' | 'auto' | 'bool' | 'break' | 'case' | 'catch' | 'char' | 'char16_t' | 'char32_t' | 'class' | 'const' | 'constexpr' | 'const_cast' | 'continue' | 'decltype' | 'default' | 'delete' | 'do' | 'double' | 'dynamic_cast' | 'else' | 'enum' | 'explicit' | 'export' | 'extern' | 'false' | 'float' | 'for' | 'friend' | 'goto' | 'if' | 'inline' | 'int' | 'long' | 'mutable' | 'namespace' | 'new' | 'noexcept' | 'nullptr' | 'operator' | 'private' | 'protected' | 'public' | 'register' | 'reinterpret_cast' | 'return' | 'short' | 'signed' | 'sizeof' | 'static' | 'static_assert' | 'static_cast' | 'struct' | 'switch' | 'template' | 'this' | 'thread_local' | 'throw' | 'true' | 'try' | 'typedef' | 'typeid' | 'typename' | 'union' | 'unsigned' | 'using' | 'virtual' | 'void' | 'volatile' | 'wchar_t' | 'while' )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6154:16: ( 'alignas' | 'alignof' | 'asm' | 'auto' | 'bool' | 'break' | 'case' | 'catch' | 'char' | 'char16_t' | 'char32_t' | 'class' | 'const' | 'constexpr' | 'const_cast' | 'continue' | 'decltype' | 'default' | 'delete' | 'do' | 'double' | 'dynamic_cast' | 'else' | 'enum' | 'explicit' | 'export' | 'extern' | 'false' | 'float' | 'for' | 'friend' | 'goto' | 'if' | 'inline' | 'int' | 'long' | 'mutable' | 'namespace' | 'new' | 'noexcept' | 'nullptr' | 'operator' | 'private' | 'protected' | 'public' | 'register' | 'reinterpret_cast' | 'return' | 'short' | 'signed' | 'sizeof' | 'static' | 'static_assert' | 'static_cast' | 'struct' | 'switch' | 'template' | 'this' | 'thread_local' | 'throw' | 'true' | 'try' | 'typedef' | 'typeid' | 'typename' | 'union' | 'unsigned' | 'using' | 'virtual' | 'void' | 'volatile' | 'wchar_t' | 'while' )
            int alt2=73;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6154:17: 'alignas'
                    {
                    match("alignas"); 


                    }
                    break;
                case 2 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6154:27: 'alignof'
                    {
                    match("alignof"); 


                    }
                    break;
                case 3 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6154:37: 'asm'
                    {
                    match("asm"); 


                    }
                    break;
                case 4 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6154:43: 'auto'
                    {
                    match("auto"); 


                    }
                    break;
                case 5 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6154:50: 'bool'
                    {
                    match("bool"); 


                    }
                    break;
                case 6 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6154:57: 'break'
                    {
                    match("break"); 


                    }
                    break;
                case 7 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6154:65: 'case'
                    {
                    match("case"); 


                    }
                    break;
                case 8 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6154:72: 'catch'
                    {
                    match("catch"); 


                    }
                    break;
                case 9 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6154:80: 'char'
                    {
                    match("char"); 


                    }
                    break;
                case 10 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6154:87: 'char16_t'
                    {
                    match("char16_t"); 


                    }
                    break;
                case 11 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6154:98: 'char32_t'
                    {
                    match("char32_t"); 


                    }
                    break;
                case 12 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6154:109: 'class'
                    {
                    match("class"); 


                    }
                    break;
                case 13 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6154:117: 'const'
                    {
                    match("const"); 


                    }
                    break;
                case 14 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6154:125: 'constexpr'
                    {
                    match("constexpr"); 


                    }
                    break;
                case 15 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6154:137: 'const_cast'
                    {
                    match("const_cast"); 


                    }
                    break;
                case 16 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6154:150: 'continue'
                    {
                    match("continue"); 


                    }
                    break;
                case 17 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6154:161: 'decltype'
                    {
                    match("decltype"); 


                    }
                    break;
                case 18 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6154:172: 'default'
                    {
                    match("default"); 


                    }
                    break;
                case 19 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6154:182: 'delete'
                    {
                    match("delete"); 


                    }
                    break;
                case 20 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6154:191: 'do'
                    {
                    match("do"); 


                    }
                    break;
                case 21 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6154:196: 'double'
                    {
                    match("double"); 


                    }
                    break;
                case 22 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6154:205: 'dynamic_cast'
                    {
                    match("dynamic_cast"); 


                    }
                    break;
                case 23 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6154:220: 'else'
                    {
                    match("else"); 


                    }
                    break;
                case 24 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6154:227: 'enum'
                    {
                    match("enum"); 


                    }
                    break;
                case 25 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6154:234: 'explicit'
                    {
                    match("explicit"); 


                    }
                    break;
                case 26 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6154:245: 'export'
                    {
                    match("export"); 


                    }
                    break;
                case 27 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6154:254: 'extern'
                    {
                    match("extern"); 


                    }
                    break;
                case 28 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6154:263: 'false'
                    {
                    match("false"); 


                    }
                    break;
                case 29 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6154:271: 'float'
                    {
                    match("float"); 


                    }
                    break;
                case 30 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6154:279: 'for'
                    {
                    match("for"); 


                    }
                    break;
                case 31 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6154:285: 'friend'
                    {
                    match("friend"); 


                    }
                    break;
                case 32 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6154:294: 'goto'
                    {
                    match("goto"); 


                    }
                    break;
                case 33 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6154:301: 'if'
                    {
                    match("if"); 


                    }
                    break;
                case 34 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6154:306: 'inline'
                    {
                    match("inline"); 


                    }
                    break;
                case 35 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6154:315: 'int'
                    {
                    match("int"); 


                    }
                    break;
                case 36 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6154:321: 'long'
                    {
                    match("long"); 


                    }
                    break;
                case 37 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6154:328: 'mutable'
                    {
                    match("mutable"); 


                    }
                    break;
                case 38 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6154:338: 'namespace'
                    {
                    match("namespace"); 


                    }
                    break;
                case 39 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6154:350: 'new'
                    {
                    match("new"); 


                    }
                    break;
                case 40 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6154:356: 'noexcept'
                    {
                    match("noexcept"); 


                    }
                    break;
                case 41 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6154:367: 'nullptr'
                    {
                    match("nullptr"); 


                    }
                    break;
                case 42 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6154:377: 'operator'
                    {
                    match("operator"); 


                    }
                    break;
                case 43 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6154:388: 'private'
                    {
                    match("private"); 


                    }
                    break;
                case 44 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6154:398: 'protected'
                    {
                    match("protected"); 


                    }
                    break;
                case 45 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6154:410: 'public'
                    {
                    match("public"); 


                    }
                    break;
                case 46 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6154:419: 'register'
                    {
                    match("register"); 


                    }
                    break;
                case 47 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6154:430: 'reinterpret_cast'
                    {
                    match("reinterpret_cast"); 


                    }
                    break;
                case 48 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6154:449: 'return'
                    {
                    match("return"); 


                    }
                    break;
                case 49 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6154:458: 'short'
                    {
                    match("short"); 


                    }
                    break;
                case 50 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6154:466: 'signed'
                    {
                    match("signed"); 


                    }
                    break;
                case 51 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6154:475: 'sizeof'
                    {
                    match("sizeof"); 


                    }
                    break;
                case 52 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6154:484: 'static'
                    {
                    match("static"); 


                    }
                    break;
                case 53 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6154:493: 'static_assert'
                    {
                    match("static_assert"); 


                    }
                    break;
                case 54 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6154:509: 'static_cast'
                    {
                    match("static_cast"); 


                    }
                    break;
                case 55 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6154:523: 'struct'
                    {
                    match("struct"); 


                    }
                    break;
                case 56 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6154:532: 'switch'
                    {
                    match("switch"); 


                    }
                    break;
                case 57 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6154:541: 'template'
                    {
                    match("template"); 


                    }
                    break;
                case 58 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6154:552: 'this'
                    {
                    match("this"); 


                    }
                    break;
                case 59 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6154:559: 'thread_local'
                    {
                    match("thread_local"); 


                    }
                    break;
                case 60 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6154:574: 'throw'
                    {
                    match("throw"); 


                    }
                    break;
                case 61 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6154:582: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 62 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6154:589: 'try'
                    {
                    match("try"); 


                    }
                    break;
                case 63 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6154:595: 'typedef'
                    {
                    match("typedef"); 


                    }
                    break;
                case 64 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6154:605: 'typeid'
                    {
                    match("typeid"); 


                    }
                    break;
                case 65 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6154:614: 'typename'
                    {
                    match("typename"); 


                    }
                    break;
                case 66 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6154:625: 'union'
                    {
                    match("union"); 


                    }
                    break;
                case 67 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6154:633: 'unsigned'
                    {
                    match("unsigned"); 


                    }
                    break;
                case 68 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6154:644: 'using'
                    {
                    match("using"); 


                    }
                    break;
                case 69 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6154:652: 'virtual'
                    {
                    match("virtual"); 


                    }
                    break;
                case 70 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6154:662: 'void'
                    {
                    match("void"); 


                    }
                    break;
                case 71 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6154:669: 'volatile'
                    {
                    match("volatile"); 


                    }
                    break;
                case 72 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6154:680: 'wchar_t'
                    {
                    match("wchar_t"); 


                    }
                    break;
                case 73 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6154:690: 'while'
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
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6156:31: ( ( '{' | '}' | '[' | ']' | '#' | '##' | '(' | ')' | '<:' | ':>' | '<%' | '%>' | '%:' | '%:%:' | ';' | ':' | '...' | 'new' | 'delete' | '?' | '::' | '.' | '.*' | '+' | '-' | '*' | '/' | '%' | '^' | '&' | '|' | '~' | '!' | '=' | '<' | '>' | '+=' | '-=' | '*=' | '/=' | '%=' | '^=' | '&=' | '|=' | '<<' | '>>' | '<<=' | '>>=' | '==' | '!=' | '<=' | '>=' | '&&' | '||' | '++' | '--' | ',' | '->*' | '->' | 'and' | 'and_eq' | 'bitand' | 'bitor' | 'compl' | 'not' | 'not_eq' | 'or' | 'or_eq' | 'xor' | 'xor_eq' ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6156:33: ( '{' | '}' | '[' | ']' | '#' | '##' | '(' | ')' | '<:' | ':>' | '<%' | '%>' | '%:' | '%:%:' | ';' | ':' | '...' | 'new' | 'delete' | '?' | '::' | '.' | '.*' | '+' | '-' | '*' | '/' | '%' | '^' | '&' | '|' | '~' | '!' | '=' | '<' | '>' | '+=' | '-=' | '*=' | '/=' | '%=' | '^=' | '&=' | '|=' | '<<' | '>>' | '<<=' | '>>=' | '==' | '!=' | '<=' | '>=' | '&&' | '||' | '++' | '--' | ',' | '->*' | '->' | 'and' | 'and_eq' | 'bitand' | 'bitor' | 'compl' | 'not' | 'not_eq' | 'or' | 'or_eq' | 'xor' | 'xor_eq' )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6156:33: ( '{' | '}' | '[' | ']' | '#' | '##' | '(' | ')' | '<:' | ':>' | '<%' | '%>' | '%:' | '%:%:' | ';' | ':' | '...' | 'new' | 'delete' | '?' | '::' | '.' | '.*' | '+' | '-' | '*' | '/' | '%' | '^' | '&' | '|' | '~' | '!' | '=' | '<' | '>' | '+=' | '-=' | '*=' | '/=' | '%=' | '^=' | '&=' | '|=' | '<<' | '>>' | '<<=' | '>>=' | '==' | '!=' | '<=' | '>=' | '&&' | '||' | '++' | '--' | ',' | '->*' | '->' | 'and' | 'and_eq' | 'bitand' | 'bitor' | 'compl' | 'not' | 'not_eq' | 'or' | 'or_eq' | 'xor' | 'xor_eq' )
            int alt3=70;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6156:34: '{'
                    {
                    match('{'); 

                    }
                    break;
                case 2 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6156:38: '}'
                    {
                    match('}'); 

                    }
                    break;
                case 3 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6156:42: '['
                    {
                    match('['); 

                    }
                    break;
                case 4 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6156:46: ']'
                    {
                    match(']'); 

                    }
                    break;
                case 5 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6156:50: '#'
                    {
                    match('#'); 

                    }
                    break;
                case 6 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6156:54: '##'
                    {
                    match("##"); 


                    }
                    break;
                case 7 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6156:59: '('
                    {
                    match('('); 

                    }
                    break;
                case 8 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6156:63: ')'
                    {
                    match(')'); 

                    }
                    break;
                case 9 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6156:67: '<:'
                    {
                    match("<:"); 


                    }
                    break;
                case 10 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6156:72: ':>'
                    {
                    match(":>"); 


                    }
                    break;
                case 11 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6156:77: '<%'
                    {
                    match("<%"); 


                    }
                    break;
                case 12 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6156:82: '%>'
                    {
                    match("%>"); 


                    }
                    break;
                case 13 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6156:87: '%:'
                    {
                    match("%:"); 


                    }
                    break;
                case 14 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6156:92: '%:%:'
                    {
                    match("%:%:"); 


                    }
                    break;
                case 15 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6156:99: ';'
                    {
                    match(';'); 

                    }
                    break;
                case 16 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6156:103: ':'
                    {
                    match(':'); 

                    }
                    break;
                case 17 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6156:107: '...'
                    {
                    match("..."); 


                    }
                    break;
                case 18 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6156:113: 'new'
                    {
                    match("new"); 


                    }
                    break;
                case 19 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6156:119: 'delete'
                    {
                    match("delete"); 


                    }
                    break;
                case 20 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6156:128: '?'
                    {
                    match('?'); 

                    }
                    break;
                case 21 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6156:132: '::'
                    {
                    match("::"); 


                    }
                    break;
                case 22 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6156:137: '.'
                    {
                    match('.'); 

                    }
                    break;
                case 23 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6156:141: '.*'
                    {
                    match(".*"); 


                    }
                    break;
                case 24 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6156:146: '+'
                    {
                    match('+'); 

                    }
                    break;
                case 25 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6156:150: '-'
                    {
                    match('-'); 

                    }
                    break;
                case 26 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6156:154: '*'
                    {
                    match('*'); 

                    }
                    break;
                case 27 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6156:158: '/'
                    {
                    match('/'); 

                    }
                    break;
                case 28 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6156:162: '%'
                    {
                    match('%'); 

                    }
                    break;
                case 29 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6156:166: '^'
                    {
                    match('^'); 

                    }
                    break;
                case 30 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6156:170: '&'
                    {
                    match('&'); 

                    }
                    break;
                case 31 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6156:174: '|'
                    {
                    match('|'); 

                    }
                    break;
                case 32 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6156:178: '~'
                    {
                    match('~'); 

                    }
                    break;
                case 33 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6156:182: '!'
                    {
                    match('!'); 

                    }
                    break;
                case 34 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6156:186: '='
                    {
                    match('='); 

                    }
                    break;
                case 35 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6156:190: '<'
                    {
                    match('<'); 

                    }
                    break;
                case 36 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6156:194: '>'
                    {
                    match('>'); 

                    }
                    break;
                case 37 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6156:198: '+='
                    {
                    match("+="); 


                    }
                    break;
                case 38 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6156:203: '-='
                    {
                    match("-="); 


                    }
                    break;
                case 39 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6156:208: '*='
                    {
                    match("*="); 


                    }
                    break;
                case 40 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6156:213: '/='
                    {
                    match("/="); 


                    }
                    break;
                case 41 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6156:218: '%='
                    {
                    match("%="); 


                    }
                    break;
                case 42 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6156:223: '^='
                    {
                    match("^="); 


                    }
                    break;
                case 43 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6156:228: '&='
                    {
                    match("&="); 


                    }
                    break;
                case 44 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6156:233: '|='
                    {
                    match("|="); 


                    }
                    break;
                case 45 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6156:238: '<<'
                    {
                    match("<<"); 


                    }
                    break;
                case 46 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6156:243: '>>'
                    {
                    match(">>"); 


                    }
                    break;
                case 47 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6156:248: '<<='
                    {
                    match("<<="); 


                    }
                    break;
                case 48 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6156:254: '>>='
                    {
                    match(">>="); 


                    }
                    break;
                case 49 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6156:260: '=='
                    {
                    match("=="); 


                    }
                    break;
                case 50 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6156:265: '!='
                    {
                    match("!="); 


                    }
                    break;
                case 51 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6156:270: '<='
                    {
                    match("<="); 


                    }
                    break;
                case 52 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6156:275: '>='
                    {
                    match(">="); 


                    }
                    break;
                case 53 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6156:280: '&&'
                    {
                    match("&&"); 


                    }
                    break;
                case 54 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6156:285: '||'
                    {
                    match("||"); 


                    }
                    break;
                case 55 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6156:290: '++'
                    {
                    match("++"); 


                    }
                    break;
                case 56 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6156:295: '--'
                    {
                    match("--"); 


                    }
                    break;
                case 57 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6156:300: ','
                    {
                    match(','); 

                    }
                    break;
                case 58 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6156:304: '->*'
                    {
                    match("->*"); 


                    }
                    break;
                case 59 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6156:310: '->'
                    {
                    match("->"); 


                    }
                    break;
                case 60 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6156:315: 'and'
                    {
                    match("and"); 


                    }
                    break;
                case 61 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6156:321: 'and_eq'
                    {
                    match("and_eq"); 


                    }
                    break;
                case 62 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6156:330: 'bitand'
                    {
                    match("bitand"); 


                    }
                    break;
                case 63 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6156:339: 'bitor'
                    {
                    match("bitor"); 


                    }
                    break;
                case 64 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6156:347: 'compl'
                    {
                    match("compl"); 


                    }
                    break;
                case 65 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6156:355: 'not'
                    {
                    match("not"); 


                    }
                    break;
                case 66 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6156:361: 'not_eq'
                    {
                    match("not_eq"); 


                    }
                    break;
                case 67 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6156:370: 'or'
                    {
                    match("or"); 


                    }
                    break;
                case 68 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6156:375: 'or_eq'
                    {
                    match("or_eq"); 


                    }
                    break;
                case 69 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6156:383: 'xor'
                    {
                    match("xor"); 


                    }
                    break;
                case 70 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6156:389: 'xor_eq'
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

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6158:9: ( ( RULE_NONDIGIT | RULE_UNIVERSAL_CHARACTER_NAME ) ( RULE_DIGIT | RULE_NONDIGIT | RULE_UNIVERSAL_CHARACTER_NAME )* )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6158:11: ( RULE_NONDIGIT | RULE_UNIVERSAL_CHARACTER_NAME ) ( RULE_DIGIT | RULE_NONDIGIT | RULE_UNIVERSAL_CHARACTER_NAME )*
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6158:11: ( RULE_NONDIGIT | RULE_UNIVERSAL_CHARACTER_NAME )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>='A' && LA4_0<='Z')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')) ) {
                alt4=1;
            }
            else if ( (LA4_0=='\\') ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6158:12: RULE_NONDIGIT
                    {
                    mRULE_NONDIGIT(); 

                    }
                    break;
                case 2 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6158:26: RULE_UNIVERSAL_CHARACTER_NAME
                    {
                    mRULE_UNIVERSAL_CHARACTER_NAME(); 

                    }
                    break;

            }

            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6158:57: ( RULE_DIGIT | RULE_NONDIGIT | RULE_UNIVERSAL_CHARACTER_NAME )*
            loop5:
            do {
                int alt5=4;
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
                    alt5=1;
                    }
                    break;
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
                    {
                    alt5=2;
                    }
                    break;
                case '\\':
                    {
                    alt5=3;
                    }
                    break;

                }

                switch (alt5) {
            	case 1 :
            	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6158:58: RULE_DIGIT
            	    {
            	    mRULE_DIGIT(); 

            	    }
            	    break;
            	case 2 :
            	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6158:69: RULE_NONDIGIT
            	    {
            	    mRULE_NONDIGIT(); 

            	    }
            	    break;
            	case 3 :
            	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6158:83: RULE_UNIVERSAL_CHARACTER_NAME
            	    {
            	    mRULE_UNIVERSAL_CHARACTER_NAME(); 

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
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_NONDIGIT"
    public final void mRULE_NONDIGIT() throws RecognitionException {
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6160:24: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6160:26: ( 'a' .. 'z' | 'A' .. 'Z' | '_' )
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
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
    // $ANTLR end "RULE_NONDIGIT"

    // $ANTLR start "RULE_DIGIT"
    public final void mRULE_DIGIT() throws RecognitionException {
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6162:21: ( '0' .. '9' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6162:23: '0' .. '9'
            {
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_DIGIT"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6164:10: ( ( RULE_DECIMAL_LITERAL | RULE_OCTAL_LITERAL | RULE_HEXADECIMAL_LITERAL ) ( RULE_INTEGER_SUFFIX )? )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6164:12: ( RULE_DECIMAL_LITERAL | RULE_OCTAL_LITERAL | RULE_HEXADECIMAL_LITERAL ) ( RULE_INTEGER_SUFFIX )?
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6164:12: ( RULE_DECIMAL_LITERAL | RULE_OCTAL_LITERAL | RULE_HEXADECIMAL_LITERAL )
            int alt6=3;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>='1' && LA6_0<='9')) ) {
                alt6=1;
            }
            else if ( (LA6_0=='0') ) {
                int LA6_2 = input.LA(2);

                if ( (LA6_2=='X'||LA6_2=='x') ) {
                    alt6=3;
                }
                else {
                    alt6=2;}
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6164:13: RULE_DECIMAL_LITERAL
                    {
                    mRULE_DECIMAL_LITERAL(); 

                    }
                    break;
                case 2 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6164:34: RULE_OCTAL_LITERAL
                    {
                    mRULE_OCTAL_LITERAL(); 

                    }
                    break;
                case 3 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6164:53: RULE_HEXADECIMAL_LITERAL
                    {
                    mRULE_HEXADECIMAL_LITERAL(); 

                    }
                    break;

            }

            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6164:79: ( RULE_INTEGER_SUFFIX )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='L'||LA7_0=='U'||LA7_0=='l'||LA7_0=='u') ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6164:79: RULE_INTEGER_SUFFIX
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
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6166:31: ( '1' .. '9' ( RULE_DIGIT )* )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6166:33: '1' .. '9' ( RULE_DIGIT )*
            {
            matchRange('1','9'); 
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6166:42: ( RULE_DIGIT )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='0' && LA8_0<='9')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6166:42: RULE_DIGIT
            	    {
            	    mRULE_DIGIT(); 

            	    }
            	    break;

            	default :
            	    break loop8;
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
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6168:29: ( '0' ( RULE_OCTAL_DIGIT )* )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6168:31: '0' ( RULE_OCTAL_DIGIT )*
            {
            match('0'); 
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6168:35: ( RULE_OCTAL_DIGIT )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='0' && LA9_0<='7')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6168:35: RULE_OCTAL_DIGIT
            	    {
            	    mRULE_OCTAL_DIGIT(); 

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
    // $ANTLR end "RULE_OCTAL_LITERAL"

    // $ANTLR start "RULE_HEXADECIMAL_LITERAL"
    public final void mRULE_HEXADECIMAL_LITERAL() throws RecognitionException {
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6170:35: ( ( '0x' | '0X' ) ( RULE_HEXADECIMAL_DIGIT )+ )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6170:37: ( '0x' | '0X' ) ( RULE_HEXADECIMAL_DIGIT )+
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6170:37: ( '0x' | '0X' )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='0') ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1=='x') ) {
                    alt10=1;
                }
                else if ( (LA10_1=='X') ) {
                    alt10=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6170:38: '0x'
                    {
                    match("0x"); 


                    }
                    break;
                case 2 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6170:43: '0X'
                    {
                    match("0X"); 


                    }
                    break;

            }

            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6170:49: ( RULE_HEXADECIMAL_DIGIT )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='0' && LA11_0<='9')||(LA11_0>='A' && LA11_0<='F')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6170:49: RULE_HEXADECIMAL_DIGIT
            	    {
            	    mRULE_HEXADECIMAL_DIGIT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
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
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6172:27: ( '0' .. '7' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6172:29: '0' .. '7'
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
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6174:33: ( ( '0' .. '9' | 'A' .. 'F' ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6174:35: ( '0' .. '9' | 'A' .. 'F' )
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
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6176:30: ( ( ( 'u' | 'U' ) ( 'l' | 'L' | 'll' | 'LL' )? | ( 'l' | 'L' | 'll' | 'LL' ) ( 'u' | 'U' )? ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6176:32: ( ( 'u' | 'U' ) ( 'l' | 'L' | 'll' | 'LL' )? | ( 'l' | 'L' | 'll' | 'LL' ) ( 'u' | 'U' )? )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6176:32: ( ( 'u' | 'U' ) ( 'l' | 'L' | 'll' | 'LL' )? | ( 'l' | 'L' | 'll' | 'LL' ) ( 'u' | 'U' )? )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0=='U'||LA15_0=='u') ) {
                alt15=1;
            }
            else if ( (LA15_0=='L'||LA15_0=='l') ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6176:33: ( 'u' | 'U' ) ( 'l' | 'L' | 'll' | 'LL' )?
                    {
                    if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6176:43: ( 'l' | 'L' | 'll' | 'LL' )?
                    int alt12=5;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0=='l') ) {
                        int LA12_1 = input.LA(2);

                        if ( (LA12_1=='l') ) {
                            alt12=3;
                        }
                    }
                    else if ( (LA12_0=='L') ) {
                        int LA12_2 = input.LA(2);

                        if ( (LA12_2=='L') ) {
                            alt12=4;
                        }
                    }
                    switch (alt12) {
                        case 1 :
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6176:44: 'l'
                            {
                            match('l'); 

                            }
                            break;
                        case 2 :
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6176:48: 'L'
                            {
                            match('L'); 

                            }
                            break;
                        case 3 :
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6176:52: 'll'
                            {
                            match("ll"); 


                            }
                            break;
                        case 4 :
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6176:57: 'LL'
                            {
                            match("LL"); 


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6176:64: ( 'l' | 'L' | 'll' | 'LL' ) ( 'u' | 'U' )?
                    {
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6176:64: ( 'l' | 'L' | 'll' | 'LL' )
                    int alt13=4;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0=='l') ) {
                        int LA13_1 = input.LA(2);

                        if ( (LA13_1=='l') ) {
                            alt13=3;
                        }
                        else {
                            alt13=1;}
                    }
                    else if ( (LA13_0=='L') ) {
                        int LA13_2 = input.LA(2);

                        if ( (LA13_2=='L') ) {
                            alt13=4;
                        }
                        else {
                            alt13=2;}
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 0, input);

                        throw nvae;
                    }
                    switch (alt13) {
                        case 1 :
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6176:65: 'l'
                            {
                            match('l'); 

                            }
                            break;
                        case 2 :
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6176:69: 'L'
                            {
                            match('L'); 

                            }
                            break;
                        case 3 :
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6176:73: 'll'
                            {
                            match("ll"); 


                            }
                            break;
                        case 4 :
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6176:78: 'LL'
                            {
                            match("LL"); 


                            }
                            break;

                    }

                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6176:84: ( 'u' | 'U' )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0=='U'||LA14_0=='u') ) {
                        alt14=1;
                    }
                    switch (alt14) {
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
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6178:24: ( ( 'u' | 'U' | 'L' )? '\\'' ( RULE_C_CHAR )+ '\\'' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6178:26: ( 'u' | 'U' | 'L' )? '\\'' ( RULE_C_CHAR )+ '\\''
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6178:26: ( 'u' | 'U' | 'L' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0=='L'||LA16_0=='U'||LA16_0=='u') ) {
                alt16=1;
            }
            switch (alt16) {
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
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6178:46: ( RULE_C_CHAR )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>='\u0000' && LA17_0<='\t')||(LA17_0>='\u000B' && LA17_0<='&')||(LA17_0>='(' && LA17_0<='\uFFFF')) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6178:46: RULE_C_CHAR
            	    {
            	    mRULE_C_CHAR(); 

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
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6180:22: ( (~ ( ( '\\'' | '\\\\' | '\\n' ) ) | RULE_ESCAPE_SEQUENCE | RULE_UNIVERSAL_CHARACTER_NAME ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6180:24: (~ ( ( '\\'' | '\\\\' | '\\n' ) ) | RULE_ESCAPE_SEQUENCE | RULE_UNIVERSAL_CHARACTER_NAME )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6180:24: (~ ( ( '\\'' | '\\\\' | '\\n' ) ) | RULE_ESCAPE_SEQUENCE | RULE_UNIVERSAL_CHARACTER_NAME )
            int alt18=3;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>='\u0000' && LA18_0<='\t')||(LA18_0>='\u000B' && LA18_0<='&')||(LA18_0>='(' && LA18_0<='[')||(LA18_0>=']' && LA18_0<='\uFFFF')) ) {
                alt18=1;
            }
            else if ( (LA18_0=='\\') ) {
                int LA18_2 = input.LA(2);

                if ( (LA18_2=='\"'||LA18_2=='\''||(LA18_2>='0' && LA18_2<='7')||LA18_2=='?'||LA18_2=='\\'||(LA18_2>='a' && LA18_2<='b')||LA18_2=='f'||LA18_2=='n'||LA18_2=='r'||LA18_2=='t'||LA18_2=='v'||LA18_2=='x') ) {
                    alt18=2;
                }
                else if ( (LA18_2=='U'||LA18_2=='u') ) {
                    alt18=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6180:25: ~ ( ( '\\'' | '\\\\' | '\\n' ) )
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
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6180:45: RULE_ESCAPE_SEQUENCE
                    {
                    mRULE_ESCAPE_SEQUENCE(); 

                    }
                    break;
                case 3 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6180:66: RULE_UNIVERSAL_CHARACTER_NAME
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
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6182:31: ( ( RULE_SIMPLE_ESCAPE_SEQUENCE | RULE_OCTAL_ESCAPE_SEQUENCE | RULE_HEXADECIMAL_ESCAPE_SEQUENCE ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6182:33: ( RULE_SIMPLE_ESCAPE_SEQUENCE | RULE_OCTAL_ESCAPE_SEQUENCE | RULE_HEXADECIMAL_ESCAPE_SEQUENCE )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6182:33: ( RULE_SIMPLE_ESCAPE_SEQUENCE | RULE_OCTAL_ESCAPE_SEQUENCE | RULE_HEXADECIMAL_ESCAPE_SEQUENCE )
            int alt19=3;
            int LA19_0 = input.LA(1);

            if ( (LA19_0=='\\') ) {
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
                    alt19=1;
                    }
                    break;
                case 'x':
                    {
                    alt19=3;
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
                    alt19=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 1, input);

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
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6182:34: RULE_SIMPLE_ESCAPE_SEQUENCE
                    {
                    mRULE_SIMPLE_ESCAPE_SEQUENCE(); 

                    }
                    break;
                case 2 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6182:62: RULE_OCTAL_ESCAPE_SEQUENCE
                    {
                    mRULE_OCTAL_ESCAPE_SEQUENCE(); 

                    }
                    break;
                case 3 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6182:89: RULE_HEXADECIMAL_ESCAPE_SEQUENCE
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
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6184:38: ( '\\\\' ( '\\'' | '\"' | '?' | '\\\\' | 'a' | 'b' | 'f' | 'n' | 'r' | 't' | 'v' ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6184:40: '\\\\' ( '\\'' | '\"' | '?' | '\\\\' | 'a' | 'b' | 'f' | 'n' | 'r' | 't' | 'v' )
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
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6186:37: ( '\\\\' RULE_OCTAL_DIGIT RULE_OCTAL_DIGIT RULE_OCTAL_DIGIT )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6186:39: '\\\\' RULE_OCTAL_DIGIT RULE_OCTAL_DIGIT RULE_OCTAL_DIGIT
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
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6188:43: ( '\\\\x' ( RULE_HEXADECIMAL_DIGIT )+ )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6188:45: '\\\\x' ( RULE_HEXADECIMAL_DIGIT )+
            {
            match("\\x"); 

            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6188:51: ( RULE_HEXADECIMAL_DIGIT )+
            int cnt20=0;
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>='0' && LA20_0<='9')||(LA20_0>='A' && LA20_0<='F')) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6188:51: RULE_HEXADECIMAL_DIGIT
            	    {
            	    mRULE_HEXADECIMAL_DIGIT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt20 >= 1 ) break loop20;
                        EarlyExitException eee =
                            new EarlyExitException(20, input);
                        throw eee;
                }
                cnt20++;
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
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6190:23: ( ( RULE_FRACTIONAL_CONSTANT ( RULE_EXPONENT_PART )? | ( RULE_DIGIT )+ RULE_EXPONENT_PART ) ( 'f' | 'l' | 'F' | 'L' )? )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6190:25: ( RULE_FRACTIONAL_CONSTANT ( RULE_EXPONENT_PART )? | ( RULE_DIGIT )+ RULE_EXPONENT_PART ) ( 'f' | 'l' | 'F' | 'L' )?
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6190:25: ( RULE_FRACTIONAL_CONSTANT ( RULE_EXPONENT_PART )? | ( RULE_DIGIT )+ RULE_EXPONENT_PART )
            int alt23=2;
            alt23 = dfa23.predict(input);
            switch (alt23) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6190:26: RULE_FRACTIONAL_CONSTANT ( RULE_EXPONENT_PART )?
                    {
                    mRULE_FRACTIONAL_CONSTANT(); 
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6190:51: ( RULE_EXPONENT_PART )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0=='E'||LA21_0=='e') ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6190:51: RULE_EXPONENT_PART
                            {
                            mRULE_EXPONENT_PART(); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6190:71: ( RULE_DIGIT )+ RULE_EXPONENT_PART
                    {
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6190:71: ( RULE_DIGIT )+
                    int cnt22=0;
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( ((LA22_0>='0' && LA22_0<='9')) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6190:71: RULE_DIGIT
                    	    {
                    	    mRULE_DIGIT(); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt22 >= 1 ) break loop22;
                                EarlyExitException eee =
                                    new EarlyExitException(22, input);
                                throw eee;
                        }
                        cnt22++;
                    } while (true);

                    mRULE_EXPONENT_PART(); 

                    }
                    break;

            }

            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6190:103: ( 'f' | 'l' | 'F' | 'L' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0=='F'||LA24_0=='L'||LA24_0=='f'||LA24_0=='l') ) {
                alt24=1;
            }
            switch (alt24) {
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
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6192:35: ( ( ( RULE_DIGIT )* '.' ( RULE_DIGIT )+ | ( RULE_DIGIT )+ '.' ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6192:37: ( ( RULE_DIGIT )* '.' ( RULE_DIGIT )+ | ( RULE_DIGIT )+ '.' )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6192:37: ( ( RULE_DIGIT )* '.' ( RULE_DIGIT )+ | ( RULE_DIGIT )+ '.' )
            int alt28=2;
            alt28 = dfa28.predict(input);
            switch (alt28) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6192:38: ( RULE_DIGIT )* '.' ( RULE_DIGIT )+
                    {
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6192:38: ( RULE_DIGIT )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( ((LA25_0>='0' && LA25_0<='9')) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6192:38: RULE_DIGIT
                    	    {
                    	    mRULE_DIGIT(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop25;
                        }
                    } while (true);

                    match('.'); 
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6192:54: ( RULE_DIGIT )+
                    int cnt26=0;
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( ((LA26_0>='0' && LA26_0<='9')) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6192:54: RULE_DIGIT
                    	    {
                    	    mRULE_DIGIT(); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt26 >= 1 ) break loop26;
                                EarlyExitException eee =
                                    new EarlyExitException(26, input);
                                throw eee;
                        }
                        cnt26++;
                    } while (true);


                    }
                    break;
                case 2 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6192:66: ( RULE_DIGIT )+ '.'
                    {
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6192:66: ( RULE_DIGIT )+
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
                    	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6192:66: RULE_DIGIT
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
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6194:29: ( ( 'e' | 'E' ) ( '+' | '-' )? ( RULE_DIGIT )+ )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6194:31: ( 'e' | 'E' ) ( '+' | '-' )? ( RULE_DIGIT )+
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6194:41: ( '+' | '-' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0=='+'||LA29_0=='-') ) {
                alt29=1;
            }
            switch (alt29) {
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

            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6194:52: ( RULE_DIGIT )+
            int cnt30=0;
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( ((LA30_0>='0' && LA30_0<='9')) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6194:52: RULE_DIGIT
            	    {
            	    mRULE_DIGIT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt30 >= 1 ) break loop30;
                        EarlyExitException eee =
                            new EarlyExitException(30, input);
                        throw eee;
                }
                cnt30++;
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
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6196:21: ( ( RULE_ENC_PREFIX )? '\"' ( RULE_SCHAR )+ '\"' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6196:23: ( RULE_ENC_PREFIX )? '\"' ( RULE_SCHAR )+ '\"'
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6196:23: ( RULE_ENC_PREFIX )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0=='L'||LA31_0=='U'||LA31_0=='u') ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6196:23: RULE_ENC_PREFIX
                    {
                    mRULE_ENC_PREFIX(); 

                    }
                    break;

            }

            match('\"'); 
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6196:44: ( RULE_SCHAR )+
            int cnt32=0;
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( ((LA32_0>='\u0000' && LA32_0<='\t')||(LA32_0>='\u000B' && LA32_0<='!')||(LA32_0>='#' && LA32_0<='\uFFFF')) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6196:44: RULE_SCHAR
            	    {
            	    mRULE_SCHAR(); 

            	    }
            	    break;

            	default :
            	    if ( cnt32 >= 1 ) break loop32;
                        EarlyExitException eee =
                            new EarlyExitException(32, input);
                        throw eee;
                }
                cnt32++;
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
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6198:26: ( ( 'u8' | 'u' | 'U' | 'L' ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6198:28: ( 'u8' | 'u' | 'U' | 'L' )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6198:28: ( 'u8' | 'u' | 'U' | 'L' )
            int alt33=4;
            switch ( input.LA(1) ) {
            case 'u':
                {
                int LA33_1 = input.LA(2);

                if ( (LA33_1=='8') ) {
                    alt33=1;
                }
                else {
                    alt33=2;}
                }
                break;
            case 'U':
                {
                alt33=3;
                }
                break;
            case 'L':
                {
                alt33=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6198:29: 'u8'
                    {
                    match("u8"); 


                    }
                    break;
                case 2 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6198:34: 'u'
                    {
                    match('u'); 

                    }
                    break;
                case 3 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6198:38: 'U'
                    {
                    match('U'); 

                    }
                    break;
                case 4 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6198:42: 'L'
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
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6200:21: ( (~ ( ( '\"' | '\\\\' | '\\n' ) ) | RULE_ESCAPE_SEQUENCE | RULE_UNIVERSAL_CHARACTER_NAME ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6200:23: (~ ( ( '\"' | '\\\\' | '\\n' ) ) | RULE_ESCAPE_SEQUENCE | RULE_UNIVERSAL_CHARACTER_NAME )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6200:23: (~ ( ( '\"' | '\\\\' | '\\n' ) ) | RULE_ESCAPE_SEQUENCE | RULE_UNIVERSAL_CHARACTER_NAME )
            int alt34=3;
            int LA34_0 = input.LA(1);

            if ( ((LA34_0>='\u0000' && LA34_0<='\t')||(LA34_0>='\u000B' && LA34_0<='!')||(LA34_0>='#' && LA34_0<='[')||(LA34_0>=']' && LA34_0<='\uFFFF')) ) {
                alt34=1;
            }
            else if ( (LA34_0=='\\') ) {
                int LA34_2 = input.LA(2);

                if ( (LA34_2=='\"'||LA34_2=='\''||(LA34_2>='0' && LA34_2<='7')||LA34_2=='?'||LA34_2=='\\'||(LA34_2>='a' && LA34_2<='b')||LA34_2=='f'||LA34_2=='n'||LA34_2=='r'||LA34_2=='t'||LA34_2=='v'||LA34_2=='x') ) {
                    alt34=2;
                }
                else if ( (LA34_2=='U'||LA34_2=='u') ) {
                    alt34=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 34, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6200:24: ~ ( ( '\"' | '\\\\' | '\\n' ) )
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
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6200:43: RULE_ESCAPE_SEQUENCE
                    {
                    mRULE_ESCAPE_SEQUENCE(); 

                    }
                    break;
                case 3 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6200:64: RULE_UNIVERSAL_CHARACTER_NAME
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

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6202:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6202:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6202:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0=='\"') ) {
                alt37=1;
            }
            else if ( (LA37_0=='\'') ) {
                alt37=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6202:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6202:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop35:
                    do {
                        int alt35=3;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0=='\\') ) {
                            alt35=1;
                        }
                        else if ( ((LA35_0>='\u0000' && LA35_0<='!')||(LA35_0>='#' && LA35_0<='[')||(LA35_0>=']' && LA35_0<='\uFFFF')) ) {
                            alt35=2;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6202:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6202:66: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop35;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6202:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6202:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop36:
                    do {
                        int alt36=3;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0=='\\') ) {
                            alt36=1;
                        }
                        else if ( ((LA36_0>='\u0000' && LA36_0<='&')||(LA36_0>='(' && LA36_0<='[')||(LA36_0>=']' && LA36_0<='\uFFFF')) ) {
                            alt36=2;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6202:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6202:137: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop36;
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
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6204:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6204:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6204:24: ( options {greedy=false; } : . )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0=='*') ) {
                    int LA38_1 = input.LA(2);

                    if ( (LA38_1=='/') ) {
                        alt38=2;
                    }
                    else if ( ((LA38_1>='\u0000' && LA38_1<='.')||(LA38_1>='0' && LA38_1<='\uFFFF')) ) {
                        alt38=1;
                    }


                }
                else if ( ((LA38_0>='\u0000' && LA38_0<=')')||(LA38_0>='+' && LA38_0<='\uFFFF')) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6204:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop38;
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
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6206:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6206:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6206:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( ((LA39_0>='\u0000' && LA39_0<='\t')||(LA39_0>='\u000B' && LA39_0<='\f')||(LA39_0>='\u000E' && LA39_0<='\uFFFF')) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6206:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop39;
                }
            } while (true);

            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6206:40: ( ( '\\r' )? '\\n' )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0=='\n'||LA41_0=='\r') ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6206:41: ( '\\r' )? '\\n'
                    {
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6206:41: ( '\\r' )?
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0=='\r') ) {
                        alt40=1;
                    }
                    switch (alt40) {
                        case 1 :
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6206:41: '\\r'
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
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6208:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6208:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6208:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt42=0;
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( ((LA42_0>='\t' && LA42_0<='\n')||LA42_0=='\r'||LA42_0==' ') ) {
                    alt42=1;
                }


                switch (alt42) {
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
            	    if ( cnt42 >= 1 ) break loop42;
                        EarlyExitException eee =
                            new EarlyExitException(42, input);
                        throw eee;
                }
                cnt42++;
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
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6210:16: ( . )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:6210:18: .
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
        // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:8: ( T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | T__114 | T__115 | T__116 | T__117 | T__118 | T__119 | T__120 | T__121 | T__122 | T__123 | T__124 | T__125 | T__126 | T__127 | T__128 | T__129 | T__130 | T__131 | T__132 | T__133 | T__134 | T__135 | T__136 | T__137 | T__138 | T__139 | T__140 | T__141 | T__142 | T__143 | T__144 | T__145 | T__146 | T__147 | T__148 | T__149 | T__150 | T__151 | T__152 | T__153 | T__154 | T__155 | T__156 | T__157 | T__158 | T__159 | T__160 | RULE_KEYWORD | RULE_PREPROCESSING_OP_OR_PUNC | RULE_ID | RULE_INT | RULE_CHARACTER_LITERAL | RULE_FLOATING_LITERAL | RULE_STRING_LITERAL | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt43=138;
        alt43 = dfa43.predict(input);
        switch (alt43) {
            case 1 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:10: T__35
                {
                mT__35(); 

                }
                break;
            case 2 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:16: T__36
                {
                mT__36(); 

                }
                break;
            case 3 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:22: T__37
                {
                mT__37(); 

                }
                break;
            case 4 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:28: T__38
                {
                mT__38(); 

                }
                break;
            case 5 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:34: T__39
                {
                mT__39(); 

                }
                break;
            case 6 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:40: T__40
                {
                mT__40(); 

                }
                break;
            case 7 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:46: T__41
                {
                mT__41(); 

                }
                break;
            case 8 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:52: T__42
                {
                mT__42(); 

                }
                break;
            case 9 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:58: T__43
                {
                mT__43(); 

                }
                break;
            case 10 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:64: T__44
                {
                mT__44(); 

                }
                break;
            case 11 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:70: T__45
                {
                mT__45(); 

                }
                break;
            case 12 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:76: T__46
                {
                mT__46(); 

                }
                break;
            case 13 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:82: T__47
                {
                mT__47(); 

                }
                break;
            case 14 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:88: T__48
                {
                mT__48(); 

                }
                break;
            case 15 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:94: T__49
                {
                mT__49(); 

                }
                break;
            case 16 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:100: T__50
                {
                mT__50(); 

                }
                break;
            case 17 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:106: T__51
                {
                mT__51(); 

                }
                break;
            case 18 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:112: T__52
                {
                mT__52(); 

                }
                break;
            case 19 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:118: T__53
                {
                mT__53(); 

                }
                break;
            case 20 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:124: T__54
                {
                mT__54(); 

                }
                break;
            case 21 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:130: T__55
                {
                mT__55(); 

                }
                break;
            case 22 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:136: T__56
                {
                mT__56(); 

                }
                break;
            case 23 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:142: T__57
                {
                mT__57(); 

                }
                break;
            case 24 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:148: T__58
                {
                mT__58(); 

                }
                break;
            case 25 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:154: T__59
                {
                mT__59(); 

                }
                break;
            case 26 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:160: T__60
                {
                mT__60(); 

                }
                break;
            case 27 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:166: T__61
                {
                mT__61(); 

                }
                break;
            case 28 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:172: T__62
                {
                mT__62(); 

                }
                break;
            case 29 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:178: T__63
                {
                mT__63(); 

                }
                break;
            case 30 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:184: T__64
                {
                mT__64(); 

                }
                break;
            case 31 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:190: T__65
                {
                mT__65(); 

                }
                break;
            case 32 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:196: T__66
                {
                mT__66(); 

                }
                break;
            case 33 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:202: T__67
                {
                mT__67(); 

                }
                break;
            case 34 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:208: T__68
                {
                mT__68(); 

                }
                break;
            case 35 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:214: T__69
                {
                mT__69(); 

                }
                break;
            case 36 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:220: T__70
                {
                mT__70(); 

                }
                break;
            case 37 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:226: T__71
                {
                mT__71(); 

                }
                break;
            case 38 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:232: T__72
                {
                mT__72(); 

                }
                break;
            case 39 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:238: T__73
                {
                mT__73(); 

                }
                break;
            case 40 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:244: T__74
                {
                mT__74(); 

                }
                break;
            case 41 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:250: T__75
                {
                mT__75(); 

                }
                break;
            case 42 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:256: T__76
                {
                mT__76(); 

                }
                break;
            case 43 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:262: T__77
                {
                mT__77(); 

                }
                break;
            case 44 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:268: T__78
                {
                mT__78(); 

                }
                break;
            case 45 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:274: T__79
                {
                mT__79(); 

                }
                break;
            case 46 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:280: T__80
                {
                mT__80(); 

                }
                break;
            case 47 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:286: T__81
                {
                mT__81(); 

                }
                break;
            case 48 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:292: T__82
                {
                mT__82(); 

                }
                break;
            case 49 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:298: T__83
                {
                mT__83(); 

                }
                break;
            case 50 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:304: T__84
                {
                mT__84(); 

                }
                break;
            case 51 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:310: T__85
                {
                mT__85(); 

                }
                break;
            case 52 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:316: T__86
                {
                mT__86(); 

                }
                break;
            case 53 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:322: T__87
                {
                mT__87(); 

                }
                break;
            case 54 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:328: T__88
                {
                mT__88(); 

                }
                break;
            case 55 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:334: T__89
                {
                mT__89(); 

                }
                break;
            case 56 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:340: T__90
                {
                mT__90(); 

                }
                break;
            case 57 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:346: T__91
                {
                mT__91(); 

                }
                break;
            case 58 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:352: T__92
                {
                mT__92(); 

                }
                break;
            case 59 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:358: T__93
                {
                mT__93(); 

                }
                break;
            case 60 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:364: T__94
                {
                mT__94(); 

                }
                break;
            case 61 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:370: T__95
                {
                mT__95(); 

                }
                break;
            case 62 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:376: T__96
                {
                mT__96(); 

                }
                break;
            case 63 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:382: T__97
                {
                mT__97(); 

                }
                break;
            case 64 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:388: T__98
                {
                mT__98(); 

                }
                break;
            case 65 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:394: T__99
                {
                mT__99(); 

                }
                break;
            case 66 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:400: T__100
                {
                mT__100(); 

                }
                break;
            case 67 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:407: T__101
                {
                mT__101(); 

                }
                break;
            case 68 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:414: T__102
                {
                mT__102(); 

                }
                break;
            case 69 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:421: T__103
                {
                mT__103(); 

                }
                break;
            case 70 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:428: T__104
                {
                mT__104(); 

                }
                break;
            case 71 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:435: T__105
                {
                mT__105(); 

                }
                break;
            case 72 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:442: T__106
                {
                mT__106(); 

                }
                break;
            case 73 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:449: T__107
                {
                mT__107(); 

                }
                break;
            case 74 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:456: T__108
                {
                mT__108(); 

                }
                break;
            case 75 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:463: T__109
                {
                mT__109(); 

                }
                break;
            case 76 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:470: T__110
                {
                mT__110(); 

                }
                break;
            case 77 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:477: T__111
                {
                mT__111(); 

                }
                break;
            case 78 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:484: T__112
                {
                mT__112(); 

                }
                break;
            case 79 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:491: T__113
                {
                mT__113(); 

                }
                break;
            case 80 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:498: T__114
                {
                mT__114(); 

                }
                break;
            case 81 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:505: T__115
                {
                mT__115(); 

                }
                break;
            case 82 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:512: T__116
                {
                mT__116(); 

                }
                break;
            case 83 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:519: T__117
                {
                mT__117(); 

                }
                break;
            case 84 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:526: T__118
                {
                mT__118(); 

                }
                break;
            case 85 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:533: T__119
                {
                mT__119(); 

                }
                break;
            case 86 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:540: T__120
                {
                mT__120(); 

                }
                break;
            case 87 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:547: T__121
                {
                mT__121(); 

                }
                break;
            case 88 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:554: T__122
                {
                mT__122(); 

                }
                break;
            case 89 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:561: T__123
                {
                mT__123(); 

                }
                break;
            case 90 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:568: T__124
                {
                mT__124(); 

                }
                break;
            case 91 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:575: T__125
                {
                mT__125(); 

                }
                break;
            case 92 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:582: T__126
                {
                mT__126(); 

                }
                break;
            case 93 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:589: T__127
                {
                mT__127(); 

                }
                break;
            case 94 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:596: T__128
                {
                mT__128(); 

                }
                break;
            case 95 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:603: T__129
                {
                mT__129(); 

                }
                break;
            case 96 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:610: T__130
                {
                mT__130(); 

                }
                break;
            case 97 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:617: T__131
                {
                mT__131(); 

                }
                break;
            case 98 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:624: T__132
                {
                mT__132(); 

                }
                break;
            case 99 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:631: T__133
                {
                mT__133(); 

                }
                break;
            case 100 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:638: T__134
                {
                mT__134(); 

                }
                break;
            case 101 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:645: T__135
                {
                mT__135(); 

                }
                break;
            case 102 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:652: T__136
                {
                mT__136(); 

                }
                break;
            case 103 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:659: T__137
                {
                mT__137(); 

                }
                break;
            case 104 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:666: T__138
                {
                mT__138(); 

                }
                break;
            case 105 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:673: T__139
                {
                mT__139(); 

                }
                break;
            case 106 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:680: T__140
                {
                mT__140(); 

                }
                break;
            case 107 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:687: T__141
                {
                mT__141(); 

                }
                break;
            case 108 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:694: T__142
                {
                mT__142(); 

                }
                break;
            case 109 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:701: T__143
                {
                mT__143(); 

                }
                break;
            case 110 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:708: T__144
                {
                mT__144(); 

                }
                break;
            case 111 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:715: T__145
                {
                mT__145(); 

                }
                break;
            case 112 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:722: T__146
                {
                mT__146(); 

                }
                break;
            case 113 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:729: T__147
                {
                mT__147(); 

                }
                break;
            case 114 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:736: T__148
                {
                mT__148(); 

                }
                break;
            case 115 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:743: T__149
                {
                mT__149(); 

                }
                break;
            case 116 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:750: T__150
                {
                mT__150(); 

                }
                break;
            case 117 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:757: T__151
                {
                mT__151(); 

                }
                break;
            case 118 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:764: T__152
                {
                mT__152(); 

                }
                break;
            case 119 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:771: T__153
                {
                mT__153(); 

                }
                break;
            case 120 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:778: T__154
                {
                mT__154(); 

                }
                break;
            case 121 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:785: T__155
                {
                mT__155(); 

                }
                break;
            case 122 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:792: T__156
                {
                mT__156(); 

                }
                break;
            case 123 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:799: T__157
                {
                mT__157(); 

                }
                break;
            case 124 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:806: T__158
                {
                mT__158(); 

                }
                break;
            case 125 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:813: T__159
                {
                mT__159(); 

                }
                break;
            case 126 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:820: T__160
                {
                mT__160(); 

                }
                break;
            case 127 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:827: RULE_KEYWORD
                {
                mRULE_KEYWORD(); 

                }
                break;
            case 128 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:840: RULE_PREPROCESSING_OP_OR_PUNC
                {
                mRULE_PREPROCESSING_OP_OR_PUNC(); 

                }
                break;
            case 129 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:870: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 130 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:878: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 131 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:887: RULE_CHARACTER_LITERAL
                {
                mRULE_CHARACTER_LITERAL(); 

                }
                break;
            case 132 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:910: RULE_FLOATING_LITERAL
                {
                mRULE_FLOATING_LITERAL(); 

                }
                break;
            case 133 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:932: RULE_STRING_LITERAL
                {
                mRULE_STRING_LITERAL(); 

                }
                break;
            case 134 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:952: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 135 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:964: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 136 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:980: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 137 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:996: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 138 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:1004: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA3 dfa3 = new DFA3(this);
    protected DFA23 dfa23 = new DFA23(this);
    protected DFA28 dfa28 = new DFA28(this);
    protected DFA43 dfa43 = new DFA43(this);
    static final String DFA2_eotS =
        "\36\uffff\1\107\100\uffff\1\153\14\uffff\1\165\11\uffff\1\170\4"+
        "\uffff";
    static final String DFA2_eofS =
        "\173\uffff";
    static final String DFA2_minS =
        "\1\141\1\154\1\157\1\141\1\145\1\154\1\141\1\uffff\1\146\2\uffff"+
        "\1\141\1\uffff\1\162\1\145\1\150\1\145\1\156\1\151\1\143\1\151\4"+
        "\uffff\1\163\1\141\1\uffff\1\156\1\143\1\165\3\uffff\1\160\5\uffff"+
        "\1\154\4\uffff\1\151\1\uffff\1\147\1\uffff\1\147\1\141\2\uffff\1"+
        "\151\1\165\1\160\1\151\2\uffff\1\151\2\uffff\1\147\2\uffff\1\162"+
        "\1\163\5\uffff\1\154\12\uffff\1\164\2\uffff\1\145\2\uffff\1\145"+
        "\4\uffff\1\156\1\61\1\164\3\uffff\1\151\2\uffff\1\144\1\141\3\uffff"+
        "\1\137\1\143\10\uffff\1\137\1\141\3\uffff";
    static final String DFA2_maxS =
        "\1\167\1\165\1\162\1\157\1\171\1\170\1\162\1\uffff\1\156\2\uffff"+
        "\1\165\1\uffff\1\165\1\145\1\167\1\171\1\163\1\157\1\150\1\151\4"+
        "\uffff\1\164\1\141\1\uffff\1\156\1\154\1\165\3\uffff\1\164\5\uffff"+
        "\1\164\4\uffff\1\157\1\uffff\1\164\1\uffff\1\172\1\162\2\uffff\1"+
        "\162\1\171\1\160\1\163\2\uffff\1\154\2\uffff\1\147\2\uffff\1\162"+
        "\1\164\5\uffff\1\157\12\uffff\1\164\2\uffff\1\157\2\uffff\1\145"+
        "\4\uffff\1\156\1\63\1\164\3\uffff\1\151\2\uffff\1\156\1\157\3\uffff"+
        "\1\145\1\143\10\uffff\1\137\1\143\3\uffff";
    static final String DFA2_acceptS =
        "\7\uffff\1\40\1\uffff\1\44\1\45\1\uffff\1\52\10\uffff\1\3\1\4\1"+
        "\5\1\6\2\uffff\1\14\3\uffff\1\26\1\27\1\30\1\uffff\1\34\1\35\1\36"+
        "\1\37\1\41\1\uffff\1\46\1\47\1\50\1\51\1\uffff\1\55\1\uffff\1\61"+
        "\2\uffff\1\70\1\71\4\uffff\1\104\1\105\1\uffff\1\110\1\111\1\uffff"+
        "\1\7\1\10\2\uffff\1\21\1\22\1\23\1\25\1\24\1\uffff\1\33\1\42\1\43"+
        "\1\53\1\54\1\56\1\57\1\60\1\62\1\63\1\uffff\1\67\1\72\1\uffff\1"+
        "\75\1\76\1\uffff\1\102\1\103\1\106\1\107\3\uffff\1\20\1\31\1\32"+
        "\1\uffff\1\73\1\74\2\uffff\1\12\1\13\1\11\2\uffff\1\77\1\100\1\101"+
        "\1\1\1\2\1\16\1\17\1\15\2\uffff\1\64\1\65\1\66";
    static final String DFA2_specialS =
        "\173\uffff}>";
    static final String[] DFA2_transitionS = {
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

    static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
    static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
    static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
    static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
    static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
    static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
    static final short[][] DFA2_transition;

    static {
        int numStates = DFA2_transitionS.length;
        DFA2_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
        }
    }

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = DFA2_eot;
            this.eof = DFA2_eof;
            this.min = DFA2_min;
            this.max = DFA2_max;
            this.accept = DFA2_accept;
            this.special = DFA2_special;
            this.transition = DFA2_transition;
        }
        public String getDescription() {
            return "6154:16: ( 'alignas' | 'alignof' | 'asm' | 'auto' | 'bool' | 'break' | 'case' | 'catch' | 'char' | 'char16_t' | 'char32_t' | 'class' | 'const' | 'constexpr' | 'const_cast' | 'continue' | 'decltype' | 'default' | 'delete' | 'do' | 'double' | 'dynamic_cast' | 'else' | 'enum' | 'explicit' | 'export' | 'extern' | 'false' | 'float' | 'for' | 'friend' | 'goto' | 'if' | 'inline' | 'int' | 'long' | 'mutable' | 'namespace' | 'new' | 'noexcept' | 'nullptr' | 'operator' | 'private' | 'protected' | 'public' | 'register' | 'reinterpret_cast' | 'return' | 'short' | 'signed' | 'sizeof' | 'static' | 'static_assert' | 'static_cast' | 'struct' | 'switch' | 'template' | 'this' | 'thread_local' | 'throw' | 'true' | 'try' | 'typedef' | 'typeid' | 'typename' | 'union' | 'unsigned' | 'using' | 'virtual' | 'void' | 'volatile' | 'wchar_t' | 'while' )";
        }
    }
    static final String DFA3_eotS =
        "\5\uffff\1\42\2\uffff\1\47\1\52\1\56\1\uffff\1\61\3\uffff\1\66"+
        "\1\72\1\74\1\76\1\100\1\103\1\106\1\uffff\1\110\1\112\1\115\12\uffff"+
        "\1\123\6\uffff\1\125\14\uffff\1\130\21\uffff\1\132\4\uffff\1\136"+
        "\5\uffff\1\141\4\uffff\1\143\3\uffff\1\147\10\uffff";
    static final String DFA3_eofS =
        "\150\uffff";
    static final String DFA3_minS =
        "\1\41\4\uffff\1\43\2\uffff\1\45\2\72\1\uffff\1\52\1\145\2\uffff"+
        "\1\53\1\55\3\75\1\46\1\75\1\uffff\3\75\1\uffff\1\156\1\151\1\uffff"+
        "\1\162\1\157\4\uffff\1\75\6\uffff\1\45\6\uffff\1\164\5\uffff\1\52"+
        "\21\uffff\1\75\2\uffff\1\144\1\164\1\137\1\162\4\uffff\1\137\4\uffff"+
        "\1\137\1\141\2\uffff\1\137\10\uffff";
    static final String DFA3_maxS =
        "\1\176\4\uffff\1\43\2\uffff\1\75\2\76\1\uffff\1\56\1\157\2\uffff"+
        "\1\75\1\76\4\75\1\174\1\uffff\2\75\1\76\1\uffff\1\156\1\151\1\uffff"+
        "\1\162\1\157\4\uffff\1\75\6\uffff\1\45\6\uffff\1\164\5\uffff\1\52"+
        "\21\uffff\1\75\2\uffff\1\144\1\164\1\137\1\162\4\uffff\1\137\4\uffff"+
        "\1\137\1\157\2\uffff\1\137\10\uffff";
    static final String DFA3_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\uffff\1\7\1\10\3\uffff\1\17\2\uffff"+
        "\1\23\1\24\7\uffff\1\40\3\uffff\1\71\2\uffff\1\100\2\uffff\1\6\1"+
        "\5\1\11\1\13\1\uffff\1\63\1\43\1\12\1\25\1\20\1\14\1\uffff\1\51"+
        "\1\34\1\21\1\27\1\26\1\22\1\uffff\1\45\1\67\1\30\1\46\1\70\1\uffff"+
        "\1\31\1\47\1\32\1\50\1\33\1\52\1\35\1\53\1\65\1\36\1\54\1\66\1\37"+
        "\1\62\1\41\1\61\1\42\1\uffff\1\64\1\44\4\uffff\1\57\1\55\1\16\1"+
        "\15\1\uffff\1\72\1\73\1\60\1\56\2\uffff\1\104\1\103\1\uffff\1\102"+
        "\1\101\1\75\1\74\1\76\1\77\1\106\1\105";
    static final String DFA3_specialS =
        "\150\uffff}>";
    static final String[] DFA3_transitionS = {
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

    static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);
    static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);
    static final char[] DFA3_min = DFA.unpackEncodedStringToUnsignedChars(DFA3_minS);
    static final char[] DFA3_max = DFA.unpackEncodedStringToUnsignedChars(DFA3_maxS);
    static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);
    static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);
    static final short[][] DFA3_transition;

    static {
        int numStates = DFA3_transitionS.length;
        DFA3_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA3_transition[i] = DFA.unpackEncodedString(DFA3_transitionS[i]);
        }
    }

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = DFA3_eot;
            this.eof = DFA3_eof;
            this.min = DFA3_min;
            this.max = DFA3_max;
            this.accept = DFA3_accept;
            this.special = DFA3_special;
            this.transition = DFA3_transition;
        }
        public String getDescription() {
            return "6156:33: ( '{' | '}' | '[' | ']' | '#' | '##' | '(' | ')' | '<:' | ':>' | '<%' | '%>' | '%:' | '%:%:' | ';' | ':' | '...' | 'new' | 'delete' | '?' | '::' | '.' | '.*' | '+' | '-' | '*' | '/' | '%' | '^' | '&' | '|' | '~' | '!' | '=' | '<' | '>' | '+=' | '-=' | '*=' | '/=' | '%=' | '^=' | '&=' | '|=' | '<<' | '>>' | '<<=' | '>>=' | '==' | '!=' | '<=' | '>=' | '&&' | '||' | '++' | '--' | ',' | '->*' | '->' | 'and' | 'and_eq' | 'bitand' | 'bitor' | 'compl' | 'not' | 'not_eq' | 'or' | 'or_eq' | 'xor' | 'xor_eq' )";
        }
    }
    static final String DFA23_eotS =
        "\4\uffff";
    static final String DFA23_eofS =
        "\4\uffff";
    static final String DFA23_minS =
        "\2\56\2\uffff";
    static final String DFA23_maxS =
        "\1\71\1\145\2\uffff";
    static final String DFA23_acceptS =
        "\2\uffff\1\1\1\2";
    static final String DFA23_specialS =
        "\4\uffff}>";
    static final String[] DFA23_transitionS = {
            "\1\2\1\uffff\12\1",
            "\1\2\1\uffff\12\1\13\uffff\1\3\37\uffff\1\3",
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
            return "6190:25: ( RULE_FRACTIONAL_CONSTANT ( RULE_EXPONENT_PART )? | ( RULE_DIGIT )+ RULE_EXPONENT_PART )";
        }
    }
    static final String DFA28_eotS =
        "\3\uffff\1\4\1\uffff";
    static final String DFA28_eofS =
        "\5\uffff";
    static final String DFA28_minS =
        "\2\56\1\uffff\1\60\1\uffff";
    static final String DFA28_maxS =
        "\2\71\1\uffff\1\71\1\uffff";
    static final String DFA28_acceptS =
        "\2\uffff\1\1\1\uffff\1\2";
    static final String DFA28_specialS =
        "\5\uffff}>";
    static final String[] DFA28_transitionS = {
            "\1\2\1\uffff\12\1",
            "\1\3\1\uffff\12\1",
            "",
            "\12\2",
            ""
    };

    static final short[] DFA28_eot = DFA.unpackEncodedString(DFA28_eotS);
    static final short[] DFA28_eof = DFA.unpackEncodedString(DFA28_eofS);
    static final char[] DFA28_min = DFA.unpackEncodedStringToUnsignedChars(DFA28_minS);
    static final char[] DFA28_max = DFA.unpackEncodedStringToUnsignedChars(DFA28_maxS);
    static final short[] DFA28_accept = DFA.unpackEncodedString(DFA28_acceptS);
    static final short[] DFA28_special = DFA.unpackEncodedString(DFA28_specialS);
    static final short[][] DFA28_transition;

    static {
        int numStates = DFA28_transitionS.length;
        DFA28_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA28_transition[i] = DFA.unpackEncodedString(DFA28_transitionS[i]);
        }
    }

    class DFA28 extends DFA {

        public DFA28(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 28;
            this.eot = DFA28_eot;
            this.eof = DFA28_eof;
            this.min = DFA28_min;
            this.max = DFA28_max;
            this.accept = DFA28_accept;
            this.special = DFA28_special;
            this.transition = DFA28_transition;
        }
        public String getDescription() {
            return "6192:37: ( ( RULE_DIGIT )* '.' ( RULE_DIGIT )+ | ( RULE_DIGIT )+ '.' )";
        }
    }
    static final String DFA43_eotS =
        "\1\uffff\3\102\1\116\2\102\3\uffff\1\102\1\134\1\uffff\2\102\1"+
        "\146\5\102\1\uffff\4\102\1\176\1\115\1\102\1\u0085\1\102\1\u008b"+
        "\1\u008e\1\u0090\1\uffff\1\u0094\1\u0098\1\u009a\1\u009e\1\u00a0"+
        "\1\u00a2\1\u00a5\1\uffff\1\u00a8\1\u00ac\7\102\2\uffff\2\102\1\75"+
        "\1\u0084\1\uffff\1\75\2\uffff\4\102\1\uffff\11\102\3\uffff\5\102"+
        "\1\u00d6\1\102\3\uffff\1\u00d8\1\102\3\uffff\7\102\2\uffff\12\102"+
        "\3\uffff\10\102\5\uffff\2\102\1\115\2\uffff\1\u0084\2\102\1\u0105"+
        "\2\uffff\1\u0108\12\uffff\1\u010f\25\uffff\12\102\1\u0084\3\uffff"+
        "\1\102\1\u0128\5\102\1\u012f\5\102\1\u0135\1\102\1\115\1\uffff\12"+
        "\102\1\uffff\1\102\1\uffff\1\102\1\u0145\12\102\1\uffff\22\102\1"+
        "\u0164\1\102\1\115\3\uffff\6\102\26\uffff\11\102\1\115\3\uffff\1"+
        "\u017e\1\uffff\3\102\1\u0184\2\102\1\uffff\5\102\1\uffff\2\102\1"+
        "\u018e\4\102\1\u0195\7\102\1\uffff\1\u019d\3\102\1\u01a1\11\102"+
        "\1\u01ab\5\102\1\u01b1\5\102\1\u01b7\1\102\1\u01b9\1\u01ba\1\uffff"+
        "\2\102\1\uffff\6\102\4\uffff\13\102\2\uffff\4\102\1\u01d4\1\uffff"+
        "\1\102\1\u01d6\1\102\1\u01d8\1\u01d9\4\102\1\uffff\1\u01de\1\102"+
        "\1\u01e2\1\115\2\102\1\uffff\1\u01e5\6\102\1\uffff\3\102\1\uffff"+
        "\3\102\1\u01f2\2\102\1\u01f5\1\102\1\u01f7\1\uffff\1\102\1\115\3"+
        "\102\1\uffff\1\u01fc\1\102\1\u01fe\2\102\1\uffff\1\102\2\uffff\4"+
        "\102\1\115\3\102\1\uffff\13\102\1\uffff\2\102\1\u0184\1\102\1\uffff"+
        "\1\102\1\uffff\1\u021b\2\uffff\3\102\1\115\1\uffff\3\102\1\uffff"+
        "\2\102\1\uffff\1\102\1\u0225\1\102\1\u0227\1\102\1\u0229\1\u022a"+
        "\1\102\1\u0184\1\u022c\1\u022e\1\u022f\1\uffff\1\u0230\1\u0184\1"+
        "\uffff\1\102\1\uffff\1\115\1\u0232\2\102\1\uffff\1\102\1\uffff\5"+
        "\102\1\115\4\102\1\u023f\1\uffff\12\102\1\115\1\uffff\1\u024c\3"+
        "\102\1\uffff\1\u0250\7\102\1\u0258\1\uffff\1\102\1\uffff\1\102\2"+
        "\uffff\1\102\1\uffff\1\102\3\uffff\1\u025e\1\uffff\3\102\1\u0262"+
        "\1\u0263\1\102\2\u0184\2\102\1\u0267\1\102\2\uffff\12\102\2\uffff"+
        "\1\u0273\1\102\1\u0275\1\uffff\1\102\1\u0277\1\u0278\2\102\1\u027b"+
        "\1\u027c\1\uffff\1\u027d\1\102\1\u027f\2\102\1\uffff\1\u0282\1\102"+
        "\1\u0284\2\uffff\1\u0285\1\u0286\1\u0287\1\uffff\13\102\1\uffff"+
        "\1\102\1\uffff\1\u0295\2\uffff\1\u0296\1\102\3\uffff\1\102\1\uffff"+
        "\2\102\1\uffff\1\102\4\uffff\1\u029c\14\102\2\uffff\1\u0184\4\102"+
        "\1\uffff\1\u02ad\10\102\1\u02b6\4\102\1\u0184\1\102\1\uffff\2\102"+
        "\1\u02be\5\102\1\uffff\1\102\1\u02c5\1\u0184\4\102\1\uffff\2\102"+
        "\1\u02cc\3\102\1\uffff\1\u02d0\5\102\1\uffff\2\102\1\u02d8\1\uffff"+
        "\7\102\1\uffff\4\102\1\u02e4\2\102\1\u0184\3\102\1\uffff\11\102"+
        "\1\u02f3\4\102\1\uffff\1\u02f8\3\102\1\uffff\1\u02fc\1\102\1\u02fe"+
        "\1\uffff\1\u02ff\2\uffff";
    static final String DFA43_eofS =
        "\u0300\uffff";
    static final String DFA43_minS =
        "\1\0\1\145\2\141\1\72\1\141\1\145\3\uffff\1\146\1\51\1\uffff\1"+
        "\154\1\150\1\75\1\143\1\151\1\145\1\157\1\42\1\uffff\1\165\1\151"+
        "\1\157\1\154\1\46\1\56\1\160\1\56\1\162\1\45\1\75\1\135\1\uffff"+
        "\1\53\1\55\1\75\1\52\1\72\2\75\1\uffff\1\75\1\0\1\170\1\157\1\144"+
        "\1\145\1\163\1\171\1\42\2\uffff\1\157\1\42\1\125\1\56\1\uffff\1"+
        "\0\2\uffff\1\165\1\160\1\151\1\155\1\uffff\1\154\1\162\1\151\1\157"+
        "\1\156\1\154\1\155\1\167\1\145\3\uffff\1\163\1\155\2\141\1\143\1"+
        "\60\1\156\3\uffff\1\60\1\154\3\uffff\1\163\1\160\1\165\1\151\1\141"+
        "\1\157\1\147\2\uffff\1\151\1\150\1\145\1\157\1\164\1\147\1\164\2"+
        "\151\1\42\3\uffff\1\164\1\162\1\151\1\156\1\164\1\155\1\151\1\144"+
        "\3\uffff\1\56\1\uffff\2\145\1\60\2\uffff\1\56\1\151\1\142\1\75\2"+
        "\uffff\1\75\12\uffff\1\52\21\uffff\1\0\1\42\2\uffff\1\160\1\121"+
        "\1\156\1\157\1\105\2\163\1\160\1\161\1\162\1\56\1\42\1\0\1\uffff"+
        "\1\145\1\60\2\145\1\163\1\160\1\163\1\60\1\145\2\141\1\154\1\145"+
        "\1\60\1\170\1\60\1\uffff\1\145\1\143\1\163\1\160\1\162\1\163\1\141"+
        "\1\145\1\154\1\142\1\uffff\1\141\1\uffff\1\151\1\60\2\145\1\154"+
        "\1\155\2\164\1\165\1\162\1\156\1\145\1\uffff\1\154\2\141\1\154\1"+
        "\141\1\165\1\151\1\156\1\157\1\156\1\151\1\157\1\141\1\164\1\144"+
        "\1\141\1\147\1\157\1\60\1\147\1\60\3\uffff\2\162\1\145\1\166\1\164"+
        "\1\154\24\uffff\2\0\1\154\1\165\1\163\1\162\1\170\1\164\1\151\1"+
        "\145\1\165\1\60\2\0\1\uffff\1\60\1\uffff\1\144\1\141\1\167\1\60"+
        "\1\154\1\145\1\uffff\1\156\1\164\1\154\1\160\1\163\1\uffff\1\143"+
        "\1\145\1\60\1\150\1\151\1\164\1\154\1\60\1\163\1\165\2\164\1\154"+
        "\1\155\1\156\1\uffff\1\60\1\162\1\151\1\162\1\60\1\143\1\151\1\143"+
        "\1\164\1\145\1\157\1\145\1\162\1\153\1\60\1\156\2\162\1\163\1\164"+
        "\1\60\2\147\1\156\1\142\1\165\1\60\1\164\2\60\1\uffff\1\156\1\145"+
        "\1\uffff\1\162\1\141\1\161\1\141\1\145\1\151\3\uffff\1\0\1\145\1"+
        "\151\1\141\1\164\1\111\1\160\1\145\1\147\1\111\1\141\1\145\1\0\1"+
        "\uffff\1\145\1\141\2\144\1\60\1\uffff\1\141\1\60\1\144\2\60\1\164"+
        "\1\160\1\145\1\161\1\uffff\1\60\1\156\2\60\1\66\1\62\1\uffff\1\60"+
        "\1\154\1\145\1\171\1\145\1\151\1\145\1\uffff\1\156\1\143\1\164\1"+
        "\uffff\1\150\1\143\1\164\1\60\1\144\1\146\1\60\1\137\1\60\1\uffff"+
        "\1\144\1\60\1\156\1\164\1\145\1\uffff\1\60\1\156\1\60\1\154\1\141"+
        "\1\uffff\1\151\2\uffff\1\141\1\161\1\151\1\164\1\60\1\164\2\143"+
        "\1\0\1\163\1\143\1\154\1\141\1\156\1\162\1\144\1\156\1\144\1\154"+
        "\1\161\1\0\1\146\1\155\1\60\1\137\1\uffff\1\164\1\uffff\1\60\2\uffff"+
        "\1\162\1\141\1\160\1\60\1\uffff\1\165\1\170\1\143\1\uffff\2\137"+
        "\1\uffff\1\164\1\60\1\160\1\60\1\143\2\60\1\151\4\60\1\uffff\2\60"+
        "\1\uffff\1\164\1\uffff\2\60\1\145\1\162\1\uffff\1\145\1\uffff\1"+
        "\145\2\154\1\163\1\146\1\60\1\144\1\157\1\145\1\164\1\60\1\0\1\163"+
        "\2\151\1\156\1\151\1\145\1\116\1\155\1\114\1\151\1\60\1\0\1\60\1"+
        "\145\1\154\1\145\1\uffff\1\60\1\143\1\164\1\145\1\160\1\141\2\164"+
        "\1\60\1\uffff\1\145\1\uffff\1\137\2\uffff\1\164\1\uffff\1\141\3"+
        "\uffff\1\60\1\uffff\1\162\1\160\1\144\2\60\1\145\2\60\1\145\1\162"+
        "\1\60\1\145\1\uffff\1\0\1\151\1\164\1\146\2\164\1\163\1\141\1\145"+
        "\1\151\1\146\1\0\1\uffff\1\60\1\157\1\60\1\uffff\1\145\2\60\1\162"+
        "\1\163\2\60\1\uffff\1\60\1\143\1\60\1\163\1\141\1\uffff\1\60\1\162"+
        "\1\60\2\uffff\3\60\1\uffff\1\144\1\157\1\111\1\151\1\105\1\151\1"+
        "\163\1\155\1\156\1\163\1\151\1\uffff\1\143\1\uffff\1\60\2\uffff"+
        "\1\60\1\164\3\uffff\1\141\1\uffff\2\163\1\uffff\1\145\4\uffff\1"+
        "\60\1\156\1\160\1\156\1\145\1\170\1\141\1\151\1\145\2\164\1\145"+
        "\1\141\2\uffff\1\60\1\163\1\145\2\164\1\uffff\1\60\1\145\1\163\1"+
        "\162\1\160\1\154\1\157\1\123\1\105\1\60\1\144\1\154\1\164\1\162"+
        "\1\60\1\137\1\uffff\1\143\1\164\1\60\1\162\1\151\1\156\1\160\1\170"+
        "\1\uffff\1\111\2\60\1\164\1\143\1\151\1\141\1\uffff\1\145\1\172"+
        "\1\60\1\145\1\160\1\144\1\uffff\1\60\2\141\1\156\1\163\1\145\1\uffff"+
        "\1\143\1\162\1\60\1\uffff\1\163\1\154\1\164\1\163\1\162\1\151\1"+
        "\145\1\uffff\1\164\3\151\1\60\1\146\1\163\1\60\1\172\1\141\1\157"+
        "\1\uffff\1\151\1\163\1\141\1\164\1\156\1\145\1\151\1\164\1\151\1"+
        "\60\1\162\1\157\1\151\1\157\1\uffff\1\60\1\156\1\157\1\156\1\uffff"+
        "\1\60\1\156\1\60\1\uffff\1\60\2\uffff";
    static final String DFA43_maxS =
        "\1\uffff\1\171\1\162\1\165\1\76\1\157\1\171\3\uffff\1\156\1\51"+
        "\1\uffff\1\170\1\167\1\75\1\150\1\162\1\145\1\157\1\163\1\uffff"+
        "\1\165\2\157\1\165\1\75\1\71\1\166\1\170\1\165\1\75\1\76\1\135\1"+
        "\uffff\1\75\1\76\2\75\1\76\1\75\1\174\1\uffff\1\75\1\uffff\1\170"+
        "\1\166\1\144\1\145\1\163\1\171\1\156\2\uffff\1\157\1\47\1\165\1"+
        "\145\1\uffff\1\uffff\2\uffff\1\171\1\160\1\162\1\155\1\uffff\1\154"+
        "\1\162\1\151\1\157\1\156\1\154\1\155\1\167\1\164\3\uffff\1\164\1"+
        "\156\2\141\1\154\1\172\1\156\3\uffff\1\172\1\164\3\uffff\1\163\1"+
        "\164\1\165\1\151\1\162\1\157\1\172\2\uffff\1\151\1\150\1\145\1\157"+
        "\3\164\1\151\1\163\1\42\3\uffff\1\164\1\162\1\154\1\156\1\164\1"+
        "\155\1\151\1\144\3\uffff\1\56\1\uffff\2\145\1\172\2\uffff\1\145"+
        "\1\157\1\142\1\75\2\uffff\1\75\12\uffff\1\52\21\uffff\1\uffff\1"+
        "\170\2\uffff\1\160\1\121\1\156\1\157\1\105\2\163\1\160\1\161\1\162"+
        "\1\145\1\170\1\uffff\1\uffff\1\145\1\172\1\145\1\157\1\163\1\160"+
        "\1\163\1\172\1\145\2\141\1\154\1\145\1\172\1\170\1\172\1\uffff\1"+
        "\145\1\143\1\164\1\160\1\162\1\163\1\141\1\145\1\154\1\142\1\uffff"+
        "\1\141\1\uffff\1\151\1\172\2\145\1\157\1\155\2\164\1\165\1\162\1"+
        "\156\1\145\1\uffff\1\154\2\141\1\154\1\157\1\165\1\151\1\156\1\157"+
        "\1\156\1\151\1\157\1\141\1\164\1\144\1\141\1\147\1\157\1\172\1\147"+
        "\1\172\3\uffff\2\162\1\145\1\166\1\164\1\154\24\uffff\2\uffff\1"+
        "\162\1\165\1\163\1\162\1\170\1\164\1\151\1\145\1\165\1\172\2\uffff"+
        "\1\uffff\1\172\1\uffff\1\156\1\141\1\167\1\172\1\154\1\145\1\uffff"+
        "\1\156\1\164\1\154\1\160\1\163\1\uffff\1\143\1\145\1\172\1\150\1"+
        "\151\1\164\1\154\1\172\1\163\1\165\2\164\1\154\1\155\1\156\1\uffff"+
        "\1\172\1\162\1\151\1\162\1\172\1\143\1\151\1\143\1\164\1\145\1\157"+
        "\1\145\1\162\1\153\1\172\1\156\2\162\1\163\1\164\1\172\2\147\1\156"+
        "\1\142\1\165\1\172\1\164\2\172\1\uffff\1\156\1\145\1\uffff\1\162"+
        "\1\141\1\161\1\141\1\145\1\151\3\uffff\1\uffff\1\145\1\151\1\141"+
        "\1\164\1\111\1\160\1\145\1\147\1\111\1\141\1\145\1\uffff\1\uffff"+
        "\1\145\1\141\2\144\1\172\1\uffff\1\141\1\172\1\144\2\172\1\164\1"+
        "\160\1\145\1\161\1\uffff\1\172\1\156\2\172\1\66\1\62\1\uffff\1\172"+
        "\1\154\1\145\1\171\1\145\1\151\1\145\1\uffff\1\156\1\143\1\164\1"+
        "\uffff\1\150\1\143\1\164\1\172\1\144\1\146\1\172\1\137\1\172\1\uffff"+
        "\1\144\1\172\1\156\1\164\1\145\1\uffff\1\172\1\156\1\172\1\154\1"+
        "\141\1\uffff\1\151\2\uffff\1\157\1\161\1\151\1\164\1\172\1\164\2"+
        "\143\1\uffff\1\163\1\143\1\154\1\141\1\156\1\162\1\144\1\156\1\144"+
        "\1\154\1\161\1\uffff\1\146\1\155\1\172\1\137\1\uffff\1\164\1\uffff"+
        "\1\172\2\uffff\1\162\1\141\1\160\1\172\1\uffff\1\165\1\170\1\143"+
        "\1\uffff\2\137\1\uffff\1\164\1\172\1\160\1\172\1\143\2\172\1\151"+
        "\4\172\1\uffff\2\172\1\uffff\1\164\1\uffff\2\172\1\145\1\162\1\uffff"+
        "\1\145\1\uffff\1\145\2\154\1\163\1\146\1\172\1\144\1\157\1\145\1"+
        "\164\1\172\1\uffff\1\163\2\151\1\156\1\151\1\145\1\116\1\155\1\114"+
        "\1\151\1\172\1\uffff\1\172\1\145\1\154\1\145\1\uffff\1\172\1\143"+
        "\1\164\1\145\1\160\1\141\2\164\1\172\1\uffff\1\145\1\uffff\1\137"+
        "\2\uffff\1\164\1\uffff\1\143\3\uffff\1\172\1\uffff\1\162\1\160\1"+
        "\144\2\172\1\145\2\172\1\145\1\162\1\172\1\145\1\uffff\1\uffff\1"+
        "\151\1\164\1\146\2\164\1\163\1\141\1\145\1\151\1\146\1\uffff\1\uffff"+
        "\1\172\1\157\1\172\1\uffff\1\145\2\172\1\162\1\163\2\172\1\uffff"+
        "\1\172\1\143\1\172\1\163\1\141\1\uffff\1\172\1\162\1\172\2\uffff"+
        "\3\172\1\uffff\1\144\1\157\1\123\1\151\1\105\1\151\1\163\1\155\1"+
        "\156\1\163\1\151\1\uffff\1\143\1\uffff\1\172\2\uffff\1\172\1\164"+
        "\3\uffff\1\141\1\uffff\2\163\1\uffff\1\145\4\uffff\1\172\1\156\1"+
        "\160\1\156\1\145\1\170\1\141\1\151\1\145\2\164\1\145\1\141\2\uffff"+
        "\1\172\1\163\1\145\2\164\1\uffff\1\172\1\145\1\163\1\162\1\160\1"+
        "\154\1\157\1\123\1\105\1\172\1\144\1\154\1\164\1\162\1\172\1\137"+
        "\1\uffff\1\143\1\164\1\172\1\162\1\151\1\156\1\160\1\170\1\uffff"+
        "\1\111\2\172\1\164\1\143\1\151\1\141\1\uffff\1\145\2\172\1\145\1"+
        "\160\1\144\1\uffff\1\172\2\141\1\156\1\163\1\145\1\uffff\1\143\1"+
        "\162\1\172\1\uffff\1\163\1\154\1\164\1\163\1\162\1\151\1\145\1\uffff"+
        "\1\164\3\151\1\172\1\146\1\163\2\172\1\141\1\157\1\uffff\1\151\1"+
        "\163\1\141\1\164\1\156\1\145\1\151\1\164\1\151\1\172\1\162\1\157"+
        "\1\151\1\157\1\uffff\1\172\1\156\1\157\1\156\1\uffff\1\172\1\156"+
        "\1\172\1\uffff\1\172\2\uffff";
    static final String DFA43_acceptS =
        "\7\uffff\1\7\1\10\1\11\2\uffff\1\14\10\uffff\1\32\14\uffff\1\116"+
        "\7\uffff\1\126\11\uffff\2\u0080\4\uffff\1\u0081\1\uffff\1\u0089"+
        "\1\u008a\4\uffff\1\u0081\11\uffff\1\46\1\u0080\1\4\7\uffff\1\7\1"+
        "\10\1\11\2\uffff\1\155\1\13\1\14\7\uffff\1\144\1\17\12\uffff\1\u0083"+
        "\1\u0085\1\32\10\uffff\1\100\1\136\1\77\1\uffff\1\u0084\3\uffff"+
        "\1\u0082\1\106\4\uffff\1\146\1\113\1\uffff\1\147\1\114\1\156\1\115"+
        "\1\116\1\130\1\151\1\117\1\131\1\152\1\uffff\1\120\1\132\1\121\1"+
        "\133\1\u0087\1\u0088\1\122\1\134\1\123\1\135\1\124\1\137\1\150\1"+
        "\125\1\126\1\145\1\127\2\uffff\1\u0086\1\157\15\uffff\1\u0089\20"+
        "\uffff\1\46\12\uffff\1\21\1\uffff\1\12\14\uffff\1\144\25\uffff\1"+
        "\100\1\136\1\101\6\uffff\1\143\1\140\1\146\1\142\1\141\1\147\1\130"+
        "\1\151\1\131\1\152\1\153\1\154\1\132\1\133\1\134\1\135\1\137\1\150"+
        "\1\145\1\u0085\16\uffff\1\u0083\1\uffff\1\160\6\uffff\1\22\5\uffff"+
        "\1\105\17\uffff\1\56\36\uffff\1\74\2\uffff\1\101\6\uffff\1\143\1"+
        "\142\1\153\15\uffff\1\1\5\uffff\1\177\11\uffff\1\5\6\uffff\1\50"+
        "\7\uffff\1\15\3\uffff\1\67\11\uffff\1\54\5\uffff\1\26\5\uffff\1"+
        "\64\1\uffff\1\57\1\65\31\uffff\1\162\1\uffff\1\2\1\uffff\1\62\1"+
        "\102\4\uffff\1\161\3\uffff\1\75\2\uffff\1\70\14\uffff\1\55\2\uffff"+
        "\1\20\1\uffff\1\23\4\uffff\1\27\1\uffff\1\103\34\uffff\1\33\11\uffff"+
        "\1\30\1\uffff\1\63\1\uffff\1\43\1\41\1\uffff\1\16\1\uffff\1\37\1"+
        "\71\1\60\1\uffff\1\25\14\uffff\1\111\14\uffff\1\34\3\uffff\1\3\7"+
        "\uffff\1\6\5\uffff\1\53\3\uffff\1\42\1\44\3\uffff\1\107\13\uffff"+
        "\1\73\1\uffff\1\47\1\uffff\1\163\1\24\2\uffff\1\51\1\52\1\66\1\uffff"+
        "\1\45\2\uffff\1\36\1\uffff\1\61\1\76\1\104\1\112\15\uffff\1\72\1"+
        "\35\5\uffff\1\110\20\uffff\1\164\10\uffff\1\175\7\uffff\1\167\6"+
        "\uffff\1\40\6\uffff\1\171\3\uffff\1\31\7\uffff\1\176\13\uffff\1"+
        "\174\16\uffff\1\170\4\uffff\1\172\3\uffff\1\173\1\uffff\1\166\1"+
        "\165";
    static final String DFA43_specialS =
        "\1\17\53\uffff\1\11\16\uffff\1\1\155\uffff\1\15\17\uffff\1\20\136"+
        "\uffff\1\2\1\16\12\uffff\1\0\1\3\113\uffff\1\10\13\uffff\1\12\105"+
        "\uffff\1\7\13\uffff\1\13\72\uffff\1\6\13\uffff\1\14\51\uffff\1\5"+
        "\12\uffff\1\4\u00b4\uffff}>";
    static final String[] DFA43_transitionS = {
            "\11\75\2\74\2\75\1\74\22\75\1\74\1\53\1\54\1\64\1\75\1\47\1"+
            "\32\1\73\1\13\1\14\1\45\1\43\1\25\1\44\1\33\1\46\1\35\11\71"+
            "\1\4\1\7\1\37\1\17\1\40\1\65\1\75\1\61\1\72\1\56\1\72\1\55\3"+
            "\72\1\57\2\72\1\67\1\72\1\60\5\72\1\62\1\63\5\72\1\41\1\70\1"+
            "\42\1\50\1\72\1\75\1\31\1\21\1\5\1\6\1\15\1\2\1\23\1\72\1\12"+
            "\2\72\1\30\1\26\1\3\1\34\1\36\1\72\1\22\1\16\1\1\1\24\1\27\1"+
            "\20\1\66\2\72\1\10\1\51\1\11\1\52\uff81\75",
            "\1\101\2\uffff\1\100\11\uffff\1\76\6\uffff\1\77",
            "\1\103\7\uffff\1\107\2\uffff\1\106\2\uffff\1\104\2\uffff\1"+
            "\105",
            "\1\111\3\uffff\1\112\11\uffff\1\113\5\uffff\1\110",
            "\1\114\3\uffff\1\115",
            "\1\117\6\uffff\1\121\3\uffff\1\122\2\uffff\1\120",
            "\1\123\11\uffff\1\124\11\uffff\1\125",
            "",
            "",
            "",
            "\1\131\7\uffff\1\132",
            "\1\133",
            "",
            "\1\136\1\uffff\1\140\11\uffff\1\137",
            "\1\143\1\144\12\uffff\1\142\2\uffff\1\141",
            "\1\145",
            "\1\150\4\uffff\1\147",
            "\1\153\5\uffff\1\152\2\uffff\1\151",
            "\1\154",
            "\1\155",
            "\1\162\4\uffff\1\161\20\uffff\1\160\65\uffff\1\157\4\uffff"+
            "\1\156",
            "",
            "\1\164",
            "\1\165\5\uffff\1\166",
            "\1\167",
            "\1\172\1\uffff\1\173\4\uffff\1\171\1\uffff\1\170",
            "\1\174\26\uffff\1\175",
            "\1\177\1\uffff\12\u0080",
            "\1\u0082\1\uffff\1\u0083\3\uffff\1\u0081",
            "\1\u0080\1\uffff\10\u0086\2\u0080\13\uffff\1\u0080\6\uffff"+
            "\1\u0084\10\uffff\1\u0084\2\uffff\1\u0084\14\uffff\1\u0080\6"+
            "\uffff\1\u0084\10\uffff\1\u0084\2\uffff\1\u0084",
            "\1\u0087\2\uffff\1\u0088",
            "\1\115\24\uffff\1\115\1\uffff\1\u0089\1\u008a",
            "\1\u008d\1\u008c",
            "\1\u008f",
            "",
            "\1\u0093\21\uffff\1\u0092",
            "\1\u0096\17\uffff\1\u0095\1\u0097",
            "\1\u0099",
            "\1\u009c\4\uffff\1\u009d\15\uffff\1\u009b",
            "\1\115\2\uffff\1\u009f\1\115",
            "\1\u00a1",
            "\1\u00a3\76\uffff\1\u00a4",
            "",
            "\1\u00a7",
            "\12\u00a9\1\u00ab\27\u00a9\1\u00ab\71\u00a9\1\u00aa\uffa3"+
            "\u00a9",
            "\1\u00ad",
            "\1\u00af\4\uffff\1\u00b0\1\uffff\1\u00ae",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "\1\162\4\uffff\1\161\106\uffff\1\u00b5",
            "",
            "",
            "\1\u00b6",
            "\1\162\4\uffff\1\161",
            "\1\102\37\uffff\1\102",
            "\1\u0080\1\uffff\12\u00b7\13\uffff\1\u0080\37\uffff\1\u0080",
            "",
            "\12\u00b9\1\u00ab\34\u00b9\1\u00ab\64\u00b9\1\u00b8\uffa3"+
            "\u00b9",
            "",
            "",
            "\1\u00bb\3\uffff\1\u00bc",
            "\1\u00bd",
            "\1\u00bf\10\uffff\1\u00be",
            "\1\u00c0",
            "",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c5",
            "\1\u00c6",
            "\1\u00c7",
            "\1\u00c8",
            "\1\u00c9\16\uffff\1\u00ca",
            "",
            "",
            "",
            "\1\u00cc\1\u00cd",
            "\1\u00cf\1\u00ce",
            "\1\u00d0",
            "\1\u00d1",
            "\1\u00d4\2\uffff\1\u00d2\5\uffff\1\u00d3",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\102\1\uffff"+
            "\24\102\1\u00d5\5\102",
            "\1\u00d7",
            "",
            "",
            "",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\102\1\uffff"+
            "\32\102",
            "\1\u00d9\7\uffff\1\u00da",
            "",
            "",
            "",
            "\1\u00db",
            "\1\u00dd\3\uffff\1\u00dc",
            "\1\u00de",
            "\1\u00df",
            "\1\u00e0\20\uffff\1\u00e1",
            "\1\u00e2",
            "\1\u00e3\22\uffff\1\u00e4",
            "",
            "",
            "\1\u00e6",
            "\1\u00e7",
            "\1\u00e8",
            "\1\u00e9",
            "\1\u00ea",
            "\1\u00ec\1\uffff\1\u00ed\12\uffff\1\u00eb",
            "\1\u00ee",
            "\1\u00ef",
            "\1\u00f1\11\uffff\1\u00f0",
            "\1\162",
            "",
            "",
            "",
            "\1\u00f2",
            "\1\u00f3",
            "\1\u00f4\2\uffff\1\u00f5",
            "\1\u00f6",
            "\1\u00f7",
            "\1\u00f8",
            "\1\u00f9",
            "\1\u00fa",
            "",
            "",
            "",
            "\1\u00fd",
            "",
            "\1\u00fe",
            "\1\u00ff",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\u0100\1\uffff"+
            "\32\102",
            "",
            "",
            "\1\u0080\1\uffff\10\u0086\2\u0080\13\uffff\1\u0080\37\uffff"+
            "\1\u0080",
            "\1\u0101\5\uffff\1\u0102",
            "\1\u0103",
            "\1\u0104",
            "",
            "",
            "\1\u0107",
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
            "\1\u010e",
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
            "\12\u00a9\1\u00ab\27\u00a9\1\u0117\71\u00a9\1\u00aa\uffa3"+
            "\u00a9",
            "\1\u0118\4\uffff\1\u0118\10\uffff\10\162\7\uffff\1\162\25"+
            "\uffff\1\162\6\uffff\1\u0118\4\uffff\1\162\1\u0118\3\uffff\1"+
            "\u0118\7\uffff\1\u0118\3\uffff\1\u0118\1\uffff\1\u0118\1\u0119"+
            "\1\162\1\uffff\1\162",
            "",
            "",
            "\1\u011a",
            "\1\u011b",
            "\1\u011c",
            "\1\u011d",
            "\1\u011e",
            "\1\u011f",
            "\1\u0120",
            "\1\u0121",
            "\1\u0122",
            "\1\u0123",
            "\1\u0080\1\uffff\12\u00b7\13\uffff\1\u0080\37\uffff\1\u0080",
            "\1\u0124\4\uffff\1\u0124\10\uffff\10\161\7\uffff\1\161\25"+
            "\uffff\1\161\6\uffff\1\u0124\4\uffff\1\161\1\u0124\3\uffff\1"+
            "\u0124\7\uffff\1\u0124\3\uffff\1\u0124\1\uffff\1\u0124\1\u0125"+
            "\1\161\1\uffff\1\161",
            "\12\u00b9\1\u00ab\34\u00b9\1\u0126\64\u00b9\1\u00b8\uffa3"+
            "\u00b9",
            "",
            "\1\u0127",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\102\1\uffff"+
            "\32\102",
            "\1\u0129",
            "\1\u012a\11\uffff\1\u012b",
            "\1\u012c",
            "\1\u012d",
            "\1\u012e",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\102\1\uffff"+
            "\32\102",
            "\1\u0130",
            "\1\u0131",
            "\1\u0132",
            "\1\u0133",
            "\1\u0134",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\102\1\uffff"+
            "\32\102",
            "\1\u0136",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\u0137\1\uffff"+
            "\32\102",
            "",
            "\1\u0138",
            "\1\u0139",
            "\1\u013b\1\u013a",
            "\1\u013c",
            "\1\u013d",
            "\1\u013e",
            "\1\u013f",
            "\1\u0140",
            "\1\u0141",
            "\1\u0142",
            "",
            "\1\u0143",
            "",
            "\1\u0144",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\102\1\uffff"+
            "\32\102",
            "\1\u0146",
            "\1\u0147",
            "\1\u0148\2\uffff\1\u0149",
            "\1\u014a",
            "\1\u014b",
            "\1\u014c",
            "\1\u014d",
            "\1\u014e",
            "\1\u014f",
            "\1\u0150",
            "",
            "\1\u0151",
            "\1\u0152",
            "\1\u0153",
            "\1\u0154",
            "\1\u0155\15\uffff\1\u0156",
            "\1\u0157",
            "\1\u0158",
            "\1\u0159",
            "\1\u015a",
            "\1\u015b",
            "\1\u015c",
            "\1\u015d",
            "\1\u015e",
            "\1\u015f",
            "\1\u0160",
            "\1\u0161",
            "\1\u0162",
            "\1\u0163",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\102\1\uffff"+
            "\32\102",
            "\1\u0165",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\u0166\1\uffff"+
            "\32\102",
            "",
            "",
            "",
            "\1\u0168",
            "\1\u0169",
            "\1\u016a",
            "\1\u016b",
            "\1\u016c",
            "\1\u016d",
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
            "",
            "",
            "",
            "\12\u00a9\1\u00ab\27\u00a9\1\u0117\71\u00a9\1\u00aa\uffa3"+
            "\u00a9",
            "\60\u00ab\12\u0171\7\u00ab\6\u0171\uffb9\u00ab",
            "\1\u0173\5\uffff\1\u0172",
            "\1\u0174",
            "\1\u0175",
            "\1\u0176",
            "\1\u0177",
            "\1\u0178",
            "\1\u0179",
            "\1\u017a",
            "\1\u017b",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\u017c\1\uffff"+
            "\32\102",
            "\12\u00b9\1\u00ab\34\u00b9\1\u0126\64\u00b9\1\u00b8\uffa3"+
            "\u00b9",
            "\60\u00ab\12\u017d\7\u00ab\6\u017d\uffb9\u00ab",
            "",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\102\1\uffff"+
            "\32\102",
            "",
            "\1\u017f\4\uffff\1\u0181\4\uffff\1\u0180",
            "\1\u0182",
            "\1\u0183",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\102\1\uffff"+
            "\32\102",
            "\1\u0185",
            "\1\u0186",
            "",
            "\1\u0187",
            "\1\u0188",
            "\1\u0189",
            "\1\u018a",
            "\1\u018b",
            "",
            "\1\u018c",
            "\1\u018d",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\102\1\uffff"+
            "\32\102",
            "\1\u018f",
            "\1\u0190",
            "\1\u0191",
            "\1\u0192",
            "\1\102\1\u0193\1\102\1\u0194\6\102\7\uffff\32\102\1\uffff"+
            "\1\102\2\uffff\1\102\1\uffff\32\102",
            "\1\u0196",
            "\1\u0197",
            "\1\u0198",
            "\1\u0199",
            "\1\u019a",
            "\1\u019b",
            "\1\u019c",
            "",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\102\1\uffff"+
            "\32\102",
            "\1\u019e",
            "\1\u019f",
            "\1\u01a0",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\102\1\uffff"+
            "\32\102",
            "\1\u01a2",
            "\1\u01a3",
            "\1\u01a4",
            "\1\u01a5",
            "\1\u01a6",
            "\1\u01a7",
            "\1\u01a8",
            "\1\u01a9",
            "\1\u01aa",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\102\1\uffff"+
            "\32\102",
            "\1\u01ac",
            "\1\u01ad",
            "\1\u01ae",
            "\1\u01af",
            "\1\u01b0",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\102\1\uffff"+
            "\32\102",
            "\1\u01b2",
            "\1\u01b3",
            "\1\u01b4",
            "\1\u01b5",
            "\1\u01b6",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\102\1\uffff"+
            "\32\102",
            "\1\u01b8",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\102\1\uffff"+
            "\32\102",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\102\1\uffff"+
            "\32\102",
            "",
            "\1\u01bb",
            "\1\u01bc",
            "",
            "\1\u01bd",
            "\1\u01be",
            "\1\u01bf",
            "\1\u01c0",
            "\1\u01c1",
            "\1\u01c2",
            "",
            "",
            "",
            "\60\u00ab\12\u01c3\7\u00ab\6\u01c3\uffb9\u00ab",
            "\1\u01c4",
            "\1\u01c5",
            "\1\u01c6",
            "\1\u01c7",
            "\1\u01c8",
            "\1\u01c9",
            "\1\u01ca",
            "\1\u01cb",
            "\1\u01cc",
            "\1\u01cd",
            "\1\u01ce",
            "\60\u00ab\12\u01cf\7\u00ab\6\u01cf\uffb9\u00ab",
            "",
            "\1\u01d0",
            "\1\u01d1",
            "\1\u01d2",
            "\1\u01d3",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\102\1\uffff"+
            "\32\102",
            "",
            "\1\u01d5",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\102\1\uffff"+
            "\32\102",
            "\1\u01d7",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\102\1\uffff"+
            "\32\102",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\102\1\uffff"+
            "\32\102",
            "\1\u01da",
            "\1\u01db",
            "\1\u01dc",
            "\1\u01dd",
            "",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\102\1\uffff"+
            "\32\102",
            "\1\u01df",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\u01e1\1\uffff"+
            "\4\102\1\u01e0\25\102",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\102\1\uffff"+
            "\32\102",
            "\1\u01e3",
            "\1\u01e4",
            "",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\102\1\uffff"+
            "\32\102",
            "\1\u01e6",
            "\1\u01e7",
            "\1\u01e8",
            "\1\u01e9",
            "\1\u01ea",
            "\1\u01eb",
            "",
            "\1\u01ec",
            "\1\u01ed",
            "\1\u01ee",
            "",
            "\1\u01ef",
            "\1\u01f0",
            "\1\u01f1",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\102\1\uffff"+
            "\32\102",
            "\1\u01f3",
            "\1\u01f4",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\102\1\uffff"+
            "\32\102",
            "\1\u01f6",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\102\1\uffff"+
            "\32\102",
            "",
            "\1\u01f8",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\102\1\uffff"+
            "\32\102",
            "\1\u01f9",
            "\1\u01fa",
            "\1\u01fb",
            "",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\102\1\uffff"+
            "\32\102",
            "\1\u01fd",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\102\1\uffff"+
            "\32\102",
            "\1\u01ff",
            "\1\u0200",
            "",
            "\1\u0201",
            "",
            "",
            "\1\u0202\15\uffff\1\u0203",
            "\1\u0204",
            "\1\u0205",
            "\1\u0206",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\102\1\uffff"+
            "\32\102",
            "\1\u0207",
            "\1\u0208",
            "\1\u0209",
            "\60\u00ab\12\u020a\7\u00ab\6\u020a\uffb9\u00ab",
            "\1\u020b",
            "\1\u020c",
            "\1\u020d",
            "\1\u020e",
            "\1\u020f",
            "\1\u0210",
            "\1\u0211",
            "\1\u0212",
            "\1\u0213",
            "\1\u0214",
            "\1\u0215",
            "\60\u00ab\12\u0216\7\u00ab\6\u0216\uffb9\u00ab",
            "\1\u0217",
            "\1\u0218",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\102\1\uffff"+
            "\32\102",
            "\1\u0219",
            "",
            "\1\u021a",
            "",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\102\1\uffff"+
            "\32\102",
            "",
            "",
            "\1\u021c",
            "\1\u021d",
            "\1\u021e",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\102\1\uffff"+
            "\32\102",
            "",
            "\1\u021f",
            "\1\u0220",
            "\1\u0221",
            "",
            "\1\u0222",
            "\1\u0223",
            "",
            "\1\u0224",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\102\1\uffff"+
            "\32\102",
            "\1\u0226",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\102\1\uffff"+
            "\32\102",
            "\1\u0228",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\102\1\uffff"+
            "\32\102",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\102\1\uffff"+
            "\32\102",
            "\1\u022b",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\102\1\uffff"+
            "\32\102",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\102\1\uffff"+
            "\32\102",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\u022d\1\uffff"+
            "\32\102",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\102\1\uffff"+
            "\32\102",
            "",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\102\1\uffff"+
            "\32\102",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\102\1\uffff"+
            "\32\102",
            "",
            "\1\u0231",
            "",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\102\1\uffff"+
            "\32\102",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\102\1\uffff"+
            "\32\102",
            "\1\u0233",
            "\1\u0234",
            "",
            "\1\u0235",
            "",
            "\1\u0236",
            "\1\u0237",
            "\1\u0238",
            "\1\u0239",
            "\1\u023a",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\102\1\uffff"+
            "\32\102",
            "\1\u023b",
            "\1\u023c",
            "\1\u023d",
            "\1\u023e",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\102\1\uffff"+
            "\32\102",
            "\60\u00ab\12\u0240\7\u00ab\6\u0240\uffb9\u00ab",
            "\1\u0241",
            "\1\u0242",
            "\1\u0243",
            "\1\u0244",
            "\1\u0245",
            "\1\u0246",
            "\1\u0247",
            "\1\u0248",
            "\1\u0249",
            "\1\u024a",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\102\1\uffff"+
            "\32\102",
            "\60\u00ab\12\u024b\7\u00ab\6\u024b\uffb9\u00ab",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\102\1\uffff"+
            "\32\102",
            "\1\u024d",
            "\1\u024e",
            "\1\u024f",
            "",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\102\1\uffff"+
            "\32\102",
            "\1\u0251",
            "\1\u0252",
            "\1\u0253",
            "\1\u0254",
            "\1\u0255",
            "\1\u0256",
            "\1\u0257",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\102\1\uffff"+
            "\32\102",
            "",
            "\1\u0259",
            "",
            "\1\u025a",
            "",
            "",
            "\1\u025b",
            "",
            "\1\u025c\1\uffff\1\u025d",
            "",
            "",
            "",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\102\1\uffff"+
            "\32\102",
            "",
            "\1\u025f",
            "\1\u0260",
            "\1\u0261",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\102\1\uffff"+
            "\32\102",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\102\1\uffff"+
            "\32\102",
            "\1\u0264",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\102\1\uffff"+
            "\32\102",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\102\1\uffff"+
            "\32\102",
            "\1\u0265",
            "\1\u0266",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\102\1\uffff"+
            "\32\102",
            "\1\u0268",
            "",
            "\12\u00a9\1\u00ab\27\u00a9\1\u0117\71\u00a9\1\u00aa\uffa3"+
            "\u00a9",
            "\1\u0269",
            "\1\u026a",
            "\1\u026b",
            "\1\u026c",
            "\1\u026d",
            "\1\u026e",
            "\1\u026f",
            "\1\u0270",
            "\1\u0271",
            "\1\u0272",
            "\12\u00b9\1\u00ab\34\u00b9\1\u0126\64\u00b9\1\u00b8\uffa3"+
            "\u00b9",
            "",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\102\1\uffff"+
            "\32\102",
            "\1\u0274",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\102\1\uffff"+
            "\32\102",
            "",
            "\1\u0276",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\102\1\uffff"+
            "\32\102",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\102\1\uffff"+
            "\32\102",
            "\1\u0279",
            "\1\u027a",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\102\1\uffff"+
            "\32\102",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\102\1\uffff"+
            "\32\102",
            "",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\102\1\uffff"+
            "\32\102",
            "\1\u027e",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\102\1\uffff"+
            "\32\102",
            "\1\u0280",
            "\1\u0281",
            "",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\102\1\uffff"+
            "\32\102",
            "\1\u0283",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\102\1\uffff"+
            "\32\102",
            "",
            "",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\102\1\uffff"+
            "\32\102",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\102\1\uffff"+
            "\32\102",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\102\1\uffff"+
            "\32\102",
            "",
            "\1\u0288",
            "\1\u0289",
            "\1\u028b\11\uffff\1\u028a",
            "\1\u028c",
            "\1\u028d",
            "\1\u028e",
            "\1\u028f",
            "\1\u0290",
            "\1\u0291",
            "\1\u0292",
            "\1\u0293",
            "",
            "\1\u0294",
            "",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\102\1\uffff"+
            "\32\102",
            "",
            "",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\102\1\uffff"+
            "\32\102",
            "\1\u0297",
            "",
            "",
            "",
            "\1\u0298",
            "",
            "\1\u0299",
            "\1\u029a",
            "",
            "\1\u029b",
            "",
            "",
            "",
            "",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\102\1\uffff"+
            "\32\102",
            "\1\u029d",
            "\1\u029e",
            "\1\u029f",
            "\1\u02a0",
            "\1\u02a1",
            "\1\u02a2",
            "\1\u02a3",
            "\1\u02a4",
            "\1\u02a5",
            "\1\u02a6",
            "\1\u02a7",
            "\1\u02a8",
            "",
            "",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\102\1\uffff"+
            "\32\102",
            "\1\u02a9",
            "\1\u02aa",
            "\1\u02ab",
            "\1\u02ac",
            "",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\102\1\uffff"+
            "\32\102",
            "\1\u02ae",
            "\1\u02af",
            "\1\u02b0",
            "\1\u02b1",
            "\1\u02b2",
            "\1\u02b3",
            "\1\u02b4",
            "\1\u02b5",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\102\1\uffff"+
            "\32\102",
            "\1\u02b7",
            "\1\u02b8",
            "\1\u02b9",
            "\1\u02ba",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\102\1\uffff"+
            "\32\102",
            "\1\u02bb",
            "",
            "\1\u02bc",
            "\1\u02bd",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\102\1\uffff"+
            "\32\102",
            "\1\u02bf",
            "\1\u02c0",
            "\1\u02c1",
            "\1\u02c2",
            "\1\u02c3",
            "",
            "\1\u02c4",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\102\1\uffff"+
            "\32\102",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\102\1\uffff"+
            "\32\102",
            "\1\u02c6",
            "\1\u02c7",
            "\1\u02c8",
            "\1\u02c9",
            "",
            "\1\u02ca",
            "\1\u02cb",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\102\1\uffff"+
            "\32\102",
            "\1\u02cd",
            "\1\u02ce",
            "\1\u02cf",
            "",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\102\1\uffff"+
            "\32\102",
            "\1\u02d1",
            "\1\u02d2",
            "\1\u02d3",
            "\1\u02d4",
            "\1\u02d5",
            "",
            "\1\u02d6",
            "\1\u02d7",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\102\1\uffff"+
            "\32\102",
            "",
            "\1\u02d9",
            "\1\u02da",
            "\1\u02db",
            "\1\u02dc",
            "\1\u02dd",
            "\1\u02de",
            "\1\u02df",
            "",
            "\1\u02e0",
            "\1\u02e1",
            "\1\u02e2",
            "\1\u02e3",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\102\1\uffff"+
            "\32\102",
            "\1\u02e5",
            "\1\u02e6",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\102\1\uffff"+
            "\32\102",
            "\1\u02e7",
            "\1\u02e8",
            "\1\u02e9",
            "",
            "\1\u02ea",
            "\1\u02eb",
            "\1\u02ec",
            "\1\u02ed",
            "\1\u02ee",
            "\1\u02ef",
            "\1\u02f0",
            "\1\u02f1",
            "\1\u02f2",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\102\1\uffff"+
            "\32\102",
            "\1\u02f4",
            "\1\u02f5",
            "\1\u02f6",
            "\1\u02f7",
            "",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\102\1\uffff"+
            "\32\102",
            "\1\u02f9",
            "\1\u02fa",
            "\1\u02fb",
            "",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\102\1\uffff"+
            "\32\102",
            "\1\u02fd",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\102\1\uffff"+
            "\32\102",
            "",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\102\1\uffff"+
            "\32\102",
            "",
            ""
    };

    static final short[] DFA43_eot = DFA.unpackEncodedString(DFA43_eotS);
    static final short[] DFA43_eof = DFA.unpackEncodedString(DFA43_eofS);
    static final char[] DFA43_min = DFA.unpackEncodedStringToUnsignedChars(DFA43_minS);
    static final char[] DFA43_max = DFA.unpackEncodedStringToUnsignedChars(DFA43_maxS);
    static final short[] DFA43_accept = DFA.unpackEncodedString(DFA43_acceptS);
    static final short[] DFA43_special = DFA.unpackEncodedString(DFA43_specialS);
    static final short[][] DFA43_transition;

    static {
        int numStates = DFA43_transitionS.length;
        DFA43_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA43_transition[i] = DFA.unpackEncodedString(DFA43_transitionS[i]);
        }
    }

    class DFA43 extends DFA {

        public DFA43(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 43;
            this.eot = DFA43_eot;
            this.eof = DFA43_eof;
            this.min = DFA43_min;
            this.max = DFA43_max;
            this.accept = DFA43_accept;
            this.special = DFA43_special;
            this.transition = DFA43_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | T__114 | T__115 | T__116 | T__117 | T__118 | T__119 | T__120 | T__121 | T__122 | T__123 | T__124 | T__125 | T__126 | T__127 | T__128 | T__129 | T__130 | T__131 | T__132 | T__133 | T__134 | T__135 | T__136 | T__137 | T__138 | T__139 | T__140 | T__141 | T__142 | T__143 | T__144 | T__145 | T__146 | T__147 | T__148 | T__149 | T__150 | T__151 | T__152 | T__153 | T__154 | T__155 | T__156 | T__157 | T__158 | T__159 | T__160 | RULE_KEYWORD | RULE_PREPROCESSING_OP_OR_PUNC | RULE_ID | RULE_INT | RULE_CHARACTER_LITERAL | RULE_FLOATING_LITERAL | RULE_STRING_LITERAL | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA43_292 = input.LA(1);

                        s = -1;
                        if ( (LA43_292=='\'') ) {s = 294;}

                        else if ( ((LA43_292>='\u0000' && LA43_292<='\t')||(LA43_292>='\u000B' && LA43_292<='&')||(LA43_292>='(' && LA43_292<='[')||(LA43_292>=']' && LA43_292<='\uFFFF')) ) {s = 185;}

                        else if ( (LA43_292=='\\') ) {s = 184;}

                        else if ( (LA43_292=='\n') ) {s = 171;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA43_59 = input.LA(1);

                        s = -1;
                        if ( (LA43_59=='\\') ) {s = 184;}

                        else if ( ((LA43_59>='\u0000' && LA43_59<='\t')||(LA43_59>='\u000B' && LA43_59<='&')||(LA43_59>='(' && LA43_59<='[')||(LA43_59>=']' && LA43_59<='\uFFFF')) ) {s = 185;}

                        else if ( (LA43_59=='\n'||LA43_59=='\'') ) {s = 171;}

                        else s = 61;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA43_280 = input.LA(1);

                        s = -1;
                        if ( (LA43_280=='\"') ) {s = 279;}

                        else if ( ((LA43_280>='\u0000' && LA43_280<='\t')||(LA43_280>='\u000B' && LA43_280<='!')||(LA43_280>='#' && LA43_280<='[')||(LA43_280>=']' && LA43_280<='\uFFFF')) ) {s = 169;}

                        else if ( (LA43_280=='\\') ) {s = 170;}

                        else if ( (LA43_280=='\n') ) {s = 171;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA43_293 = input.LA(1);

                        s = -1;
                        if ( ((LA43_293>='0' && LA43_293<='9')||(LA43_293>='A' && LA43_293<='F')) ) {s = 381;}

                        else if ( ((LA43_293>='\u0000' && LA43_293<='/')||(LA43_293>=':' && LA43_293<='@')||(LA43_293>='G' && LA43_293<='\uFFFF')) ) {s = 171;}

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA43_587 = input.LA(1);

                        s = -1;
                        if ( (LA43_587=='\'') ) {s = 294;}

                        else if ( (LA43_587=='\\') ) {s = 184;}

                        else if ( ((LA43_587>='\u0000' && LA43_587<='\t')||(LA43_587>='\u000B' && LA43_587<='&')||(LA43_587>='(' && LA43_587<='[')||(LA43_587>=']' && LA43_587<='\uFFFF')) ) {s = 185;}

                        else if ( (LA43_587=='\n') ) {s = 171;}

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA43_576 = input.LA(1);

                        s = -1;
                        if ( (LA43_576=='\"') ) {s = 279;}

                        else if ( (LA43_576=='\\') ) {s = 170;}

                        else if ( ((LA43_576>='\u0000' && LA43_576<='\t')||(LA43_576>='\u000B' && LA43_576<='!')||(LA43_576>='#' && LA43_576<='[')||(LA43_576>=']' && LA43_576<='\uFFFF')) ) {s = 169;}

                        else if ( (LA43_576=='\n') ) {s = 171;}

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA43_522 = input.LA(1);

                        s = -1;
                        if ( ((LA43_522>='\u0000' && LA43_522<='/')||(LA43_522>=':' && LA43_522<='@')||(LA43_522>='G' && LA43_522<='\uFFFF')) ) {s = 171;}

                        else if ( ((LA43_522>='0' && LA43_522<='9')||(LA43_522>='A' && LA43_522<='F')) ) {s = 576;}

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA43_451 = input.LA(1);

                        s = -1;
                        if ( ((LA43_451>='\u0000' && LA43_451<='/')||(LA43_451>=':' && LA43_451<='@')||(LA43_451>='G' && LA43_451<='\uFFFF')) ) {s = 171;}

                        else if ( ((LA43_451>='0' && LA43_451<='9')||(LA43_451>='A' && LA43_451<='F')) ) {s = 522;}

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA43_369 = input.LA(1);

                        s = -1;
                        if ( ((LA43_369>='\u0000' && LA43_369<='/')||(LA43_369>=':' && LA43_369<='@')||(LA43_369>='G' && LA43_369<='\uFFFF')) ) {s = 171;}

                        else if ( ((LA43_369>='0' && LA43_369<='9')||(LA43_369>='A' && LA43_369<='F')) ) {s = 451;}

                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA43_44 = input.LA(1);

                        s = -1;
                        if ( ((LA43_44>='\u0000' && LA43_44<='\t')||(LA43_44>='\u000B' && LA43_44<='!')||(LA43_44>='#' && LA43_44<='[')||(LA43_44>=']' && LA43_44<='\uFFFF')) ) {s = 169;}

                        else if ( (LA43_44=='\\') ) {s = 170;}

                        else if ( (LA43_44=='\n'||LA43_44=='\"') ) {s = 171;}

                        else s = 172;

                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA43_381 = input.LA(1);

                        s = -1;
                        if ( ((LA43_381>='\u0000' && LA43_381<='/')||(LA43_381>=':' && LA43_381<='@')||(LA43_381>='G' && LA43_381<='\uFFFF')) ) {s = 171;}

                        else if ( ((LA43_381>='0' && LA43_381<='9')||(LA43_381>='A' && LA43_381<='F')) ) {s = 463;}

                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA43_463 = input.LA(1);

                        s = -1;
                        if ( ((LA43_463>='\u0000' && LA43_463<='/')||(LA43_463>=':' && LA43_463<='@')||(LA43_463>='G' && LA43_463<='\uFFFF')) ) {s = 171;}

                        else if ( ((LA43_463>='0' && LA43_463<='9')||(LA43_463>='A' && LA43_463<='F')) ) {s = 534;}

                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA43_534 = input.LA(1);

                        s = -1;
                        if ( ((LA43_534>='\u0000' && LA43_534<='/')||(LA43_534>=':' && LA43_534<='@')||(LA43_534>='G' && LA43_534<='\uFFFF')) ) {s = 171;}

                        else if ( ((LA43_534>='0' && LA43_534<='9')||(LA43_534>='A' && LA43_534<='F')) ) {s = 587;}

                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA43_169 = input.LA(1);

                        s = -1;
                        if ( (LA43_169=='\"') ) {s = 279;}

                        else if ( (LA43_169=='\\') ) {s = 170;}

                        else if ( ((LA43_169>='\u0000' && LA43_169<='\t')||(LA43_169>='\u000B' && LA43_169<='!')||(LA43_169>='#' && LA43_169<='[')||(LA43_169>=']' && LA43_169<='\uFFFF')) ) {s = 169;}

                        else if ( (LA43_169=='\n') ) {s = 171;}

                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA43_281 = input.LA(1);

                        s = -1;
                        if ( ((LA43_281>='0' && LA43_281<='9')||(LA43_281>='A' && LA43_281<='F')) ) {s = 369;}

                        else if ( ((LA43_281>='\u0000' && LA43_281<='/')||(LA43_281>=':' && LA43_281<='@')||(LA43_281>='G' && LA43_281<='\uFFFF')) ) {s = 171;}

                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA43_0 = input.LA(1);

                        s = -1;
                        if ( (LA43_0=='t') ) {s = 1;}

                        else if ( (LA43_0=='f') ) {s = 2;}

                        else if ( (LA43_0=='n') ) {s = 3;}

                        else if ( (LA43_0==':') ) {s = 4;}

                        else if ( (LA43_0=='c') ) {s = 5;}

                        else if ( (LA43_0=='d') ) {s = 6;}

                        else if ( (LA43_0==';') ) {s = 7;}

                        else if ( (LA43_0=='{') ) {s = 8;}

                        else if ( (LA43_0=='}') ) {s = 9;}

                        else if ( (LA43_0=='i') ) {s = 10;}

                        else if ( (LA43_0=='(') ) {s = 11;}

                        else if ( (LA43_0==')') ) {s = 12;}

                        else if ( (LA43_0=='e') ) {s = 13;}

                        else if ( (LA43_0=='s') ) {s = 14;}

                        else if ( (LA43_0=='=') ) {s = 15;}

                        else if ( (LA43_0=='w') ) {s = 16;}

                        else if ( (LA43_0=='b') ) {s = 17;}

                        else if ( (LA43_0=='r') ) {s = 18;}

                        else if ( (LA43_0=='g') ) {s = 19;}

                        else if ( (LA43_0=='u') ) {s = 20;}

                        else if ( (LA43_0==',') ) {s = 21;}

                        else if ( (LA43_0=='m') ) {s = 22;}

                        else if ( (LA43_0=='v') ) {s = 23;}

                        else if ( (LA43_0=='l') ) {s = 24;}

                        else if ( (LA43_0=='a') ) {s = 25;}

                        else if ( (LA43_0=='&') ) {s = 26;}

                        else if ( (LA43_0=='.') ) {s = 27;}

                        else if ( (LA43_0=='o') ) {s = 28;}

                        else if ( (LA43_0=='0') ) {s = 29;}

                        else if ( (LA43_0=='p') ) {s = 30;}

                        else if ( (LA43_0=='<') ) {s = 31;}

                        else if ( (LA43_0=='>') ) {s = 32;}

                        else if ( (LA43_0=='[') ) {s = 33;}

                        else if ( (LA43_0==']') ) {s = 34;}

                        else if ( (LA43_0=='+') ) {s = 35;}

                        else if ( (LA43_0=='-') ) {s = 36;}

                        else if ( (LA43_0=='*') ) {s = 37;}

                        else if ( (LA43_0=='/') ) {s = 38;}

                        else if ( (LA43_0=='%') ) {s = 39;}

                        else if ( (LA43_0=='^') ) {s = 40;}

                        else if ( (LA43_0=='|') ) {s = 41;}

                        else if ( (LA43_0=='~') ) {s = 42;}

                        else if ( (LA43_0=='!') ) {s = 43;}

                        else if ( (LA43_0=='\"') ) {s = 44;}

                        else if ( (LA43_0=='E') ) {s = 45;}

                        else if ( (LA43_0=='C') ) {s = 46;}

                        else if ( (LA43_0=='I') ) {s = 47;}

                        else if ( (LA43_0=='N') ) {s = 48;}

                        else if ( (LA43_0=='A') ) {s = 49;}

                        else if ( (LA43_0=='T') ) {s = 50;}

                        else if ( (LA43_0=='U') ) {s = 51;}

                        else if ( (LA43_0=='#') ) {s = 52;}

                        else if ( (LA43_0=='?') ) {s = 53;}

                        else if ( (LA43_0=='x') ) {s = 54;}

                        else if ( (LA43_0=='L') ) {s = 55;}

                        else if ( (LA43_0=='\\') ) {s = 56;}

                        else if ( ((LA43_0>='1' && LA43_0<='9')) ) {s = 57;}

                        else if ( (LA43_0=='B'||LA43_0=='D'||(LA43_0>='F' && LA43_0<='H')||(LA43_0>='J' && LA43_0<='K')||LA43_0=='M'||(LA43_0>='O' && LA43_0<='S')||(LA43_0>='V' && LA43_0<='Z')||LA43_0=='_'||LA43_0=='h'||(LA43_0>='j' && LA43_0<='k')||LA43_0=='q'||(LA43_0>='y' && LA43_0<='z')) ) {s = 58;}

                        else if ( (LA43_0=='\'') ) {s = 59;}

                        else if ( ((LA43_0>='\t' && LA43_0<='\n')||LA43_0=='\r'||LA43_0==' ') ) {s = 60;}

                        else if ( ((LA43_0>='\u0000' && LA43_0<='\b')||(LA43_0>='\u000B' && LA43_0<='\f')||(LA43_0>='\u000E' && LA43_0<='\u001F')||LA43_0=='$'||LA43_0=='@'||LA43_0=='`'||(LA43_0>='\u007F' && LA43_0<='\uFFFF')) ) {s = 61;}

                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA43_185 = input.LA(1);

                        s = -1;
                        if ( (LA43_185=='\'') ) {s = 294;}

                        else if ( (LA43_185=='\\') ) {s = 184;}

                        else if ( ((LA43_185>='\u0000' && LA43_185<='\t')||(LA43_185>='\u000B' && LA43_185<='&')||(LA43_185>='(' && LA43_185<='[')||(LA43_185>=']' && LA43_185<='\uFFFF')) ) {s = 185;}

                        else if ( (LA43_185=='\n') ) {s = 171;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 43, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}