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
    public static final int RULE_ID=5;
    public static final int RULE_FLOATING_LITERAL=8;
    public static final int T__159=159;
    public static final int T__158=158;
    public static final int RULE_ANY_OTHER=34;
    public static final int T__160=160;
    public static final int T__167=167;
    public static final int EOF=-1;
    public static final int T__168=168;
    public static final int T__165=165;
    public static final int T__166=166;
    public static final int T__163=163;
    public static final int T__164=164;
    public static final int T__161=161;
    public static final int T__162=162;
    public static final int T__93=93;
    public static final int T__94=94;
    public static final int RULE_OCTAL_DIGIT=18;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int T__148=148;
    public static final int T__90=90;
    public static final int T__147=147;
    public static final int T__149=149;
    public static final int RULE_KEYWORD=14;
    public static final int RULE_DECIMAL_LITERAL=17;
    public static final int RULE_OCTAL_LITERAL=19;
    public static final int T__154=154;
    public static final int T__155=155;
    public static final int T__156=156;
    public static final int RULE_NONDIGIT=16;
    public static final int T__99=99;
    public static final int T__157=157;
    public static final int T__98=98;
    public static final int T__150=150;
    public static final int T__97=97;
    public static final int T__151=151;
    public static final int RULE_CHARACTER_LITERAL=7;
    public static final int T__96=96;
    public static final int T__152=152;
    public static final int RULE_HEX_QUAD=12;
    public static final int T__153=153;
    public static final int T__95=95;
    public static final int RULE_HEXADECIMAL_LITERAL=20;
    public static final int T__139=139;
    public static final int T__138=138;
    public static final int T__137=137;
    public static final int T__136=136;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_SCHAR=30;
    public static final int RULE_C_CHAR=22;
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
    public static final int RULE_STRING=10;
    public static final int T__127=127;
    public static final int T__71=71;
    public static final int T__129=129;
    public static final int T__72=72;
    public static final int T__70=70;
    public static final int RULE_OCTAL_ESCAPE_SEQUENCE=25;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int T__130=130;
    public static final int T__74=74;
    public static final int RULE_INTEGER_SUFFIX=21;
    public static final int T__131=131;
    public static final int T__73=73;
    public static final int T__132=132;
    public static final int T__133=133;
    public static final int T__79=79;
    public static final int T__78=78;
    public static final int T__134=134;
    public static final int RULE_SIMPLE_ESCAPE_SEQUENCE=24;
    public static final int T__77=77;
    public static final int T__135=135;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__118=118;
    public static final int RULE_ESCAPE_SEQUENCE=23;
    public static final int T__119=119;
    public static final int RULE_HEXADECIMAL_ESCAPE_SEQUENCE=26;
    public static final int T__116=116;
    public static final int T__117=117;
    public static final int T__114=114;
    public static final int RULE_ENC_PREFIX=29;
    public static final int T__115=115;
    public static final int T__124=124;
    public static final int T__123=123;
    public static final int T__122=122;
    public static final int T__121=121;
    public static final int T__120=120;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int RULE_EXPONENT_PART=28;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_STRING_LITERAL=9;
    public static final int T__107=107;
    public static final int RULE_FRACTIONAL_CONSTANT=27;
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
    public static final int RULE_INT=6;
    public static final int T__112=112;
    public static final int T__50=50;
    public static final int RULE_HEADER_NAME=4;
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
    public static final int RULE_PREPROCESSING_OP_OR_PUNC=15;
    public static final int RULE_SL_COMMENT=32;
    public static final int RULE_HEXADECIMAL_DIGIT=11;
    public static final int T__174=174;
    public static final int T__173=173;
    public static final int T__172=172;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__171=171;
    public static final int RULE_UNIVERSAL_CHARACTER_NAME=13;
    public static final int T__170=170;
    public static final int RULE_WS=33;
    public static final int T__169=169;

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

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:11:7: ( 'TODO' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:11:9: 'TODO'
            {
            match("TODO"); 


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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:12:7: ( '#endif' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:12:9: '#endif'
            {
            match("#endif"); 


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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:13:7: ( '(' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:13:9: '('
            {
            match('('); 

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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:14:7: ( 'Expression' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:14:9: 'Expression'
            {
            match("Expression"); 


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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:15:7: ( 'ExplicitSpecialization' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:15:9: 'ExplicitSpecialization'
            {
            match("ExplicitSpecialization"); 


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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:16:7: ( 'ExplicitInstantiation' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:16:9: 'ExplicitInstantiation'
            {
            match("ExplicitInstantiation"); 


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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:17:7: ( 'CvQualifier' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:17:9: 'CvQualifier'
            {
            match("CvQualifier"); 


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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:18:7: ( 'ConstantExpression' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:18:9: 'ConstantExpression'
            {
            match("ConstantExpression"); 


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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19:7: ( 'IdExpression' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19:9: 'IdExpression'
            {
            match("IdExpression"); 


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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:20:7: ( 'NestedNameSpecifier' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:20:9: 'NestedNameSpecifier'
            {
            match("NestedNameSpecifier"); 


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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:21:7: ( 'AssignmentExpression' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:21:9: 'AssignmentExpression'
            {
            match("AssignmentExpression"); 


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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:22:7: ( 'CtorInitializer' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:22:9: 'CtorInitializer'
            {
            match("CtorInitializer"); 


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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:23:7: ( 'TypeIdList' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:23:9: 'TypeIdList'
            {
            match("TypeIdList"); 


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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:24:7: ( 'UnqualifiedId' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:24:9: 'UnqualifiedId'
            {
            match("UnqualifiedId"); 


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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:25:7: ( '#' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:25:9: '#'
            {
            match('#'); 

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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:26:7: ( '*' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:26:9: '*'
            {
            match('*'); 

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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:27:7: ( '&' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:27:9: '&'
            {
            match('&'); 

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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:28:7: ( 'false' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:28:9: 'false'
            {
            match("false"); 


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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:29:7: ( 'true' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:29:9: 'true'
            {
            match("true"); 


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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:30:7: ( 'friend' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:30:9: 'friend'
            {
            match("friend"); 


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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:31:7: ( 'typedef' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:31:9: 'typedef'
            {
            match("typedef"); 


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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:32:7: ( 'constexpr' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:32:9: 'constexpr'
            {
            match("constexpr"); 


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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:33:7: ( 'register' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:33:9: 'register'
            {
            match("register"); 


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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:34:7: ( 'static' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:34:9: 'static'
            {
            match("static"); 


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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:35:7: ( 'thread_local' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:35:9: 'thread_local'
            {
            match("thread_local"); 


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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:36:7: ( 'extern' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:36:9: 'extern'
            {
            match("extern"); 


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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:37:7: ( 'mutable' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:37:9: 'mutable'
            {
            match("mutable"); 


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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:38:7: ( 'inline' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:38:9: 'inline'
            {
            match("inline"); 


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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:39:7: ( 'virtual' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:39:9: 'virtual'
            {
            match("virtual"); 


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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:40:7: ( 'explicit' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:40:9: 'explicit'
            {
            match("explicit"); 


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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:41:7: ( 'char' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:41:9: 'char'
            {
            match("char"); 


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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:42:7: ( 'char16_t' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:42:9: 'char16_t'
            {
            match("char16_t"); 


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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:43:7: ( 'char32_t' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:43:9: 'char32_t'
            {
            match("char32_t"); 


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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:44:7: ( 'wchar_t' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:44:9: 'wchar_t'
            {
            match("wchar_t"); 


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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:45:7: ( 'bool' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:45:9: 'bool'
            {
            match("bool"); 


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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:46:7: ( 'short' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:46:9: 'short'
            {
            match("short"); 


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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:47:7: ( 'int' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:47:9: 'int'
            {
            match("int"); 


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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:48:7: ( 'long' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:48:9: 'long'
            {
            match("long"); 


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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:49:7: ( 'signed' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:49:9: 'signed'
            {
            match("signed"); 


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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:50:7: ( 'unsigned' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:50:9: 'unsigned'
            {
            match("unsigned"); 


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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:51:7: ( 'float' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:51:9: 'float'
            {
            match("float"); 


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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:52:7: ( 'double' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:52:9: 'double'
            {
            match("double"); 


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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:53:7: ( 'auto' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:53:9: 'auto'
            {
            match("auto"); 


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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:54:7: ( 'enum' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:54:9: 'enum'
            {
            match("enum"); 


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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:55:7: ( '::' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:55:9: '::'
            {
            match("::"); 


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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:56:7: ( 'const' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:56:9: 'const'
            {
            match("const"); 


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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:57:7: ( 'volatile' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:57:9: 'volatile'
            {
            match("volatile"); 


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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:58:7: ( '&&' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:58:9: '&&'
            {
            match("&&"); 


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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:59:7: ( '...' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:59:9: '...'
            {
            match("..."); 


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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:60:7: ( 'final' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:60:9: 'final'
            {
            match("final"); 


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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:61:7: ( 'class' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:61:9: 'class'
            {
            match("class"); 


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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:62:7: ( 'struct' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:62:9: 'struct'
            {
            match("struct"); 


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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:63:7: ( 'union' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:63:9: 'union'
            {
            match("union"); 


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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:64:7: ( 'override' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:64:9: 'override'
            {
            match("override"); 


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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:65:7: ( 'new' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:65:9: 'new'
            {
            match("new"); 


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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:66:7: ( 'private' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:66:9: 'private'
            {
            match("private"); 


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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:67:7: ( 'protected' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:67:9: 'protected'
            {
            match("protected"); 


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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:68:7: ( 'public' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:68:9: 'public'
            {
            match("public"); 


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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:69:7: ( 'delete' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:69:9: 'delete'
            {
            match("delete"); 


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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:70:7: ( '+' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:70:9: '+'
            {
            match('+'); 

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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:71:7: ( '-' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:71:9: '-'
            {
            match('-'); 

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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:72:7: ( '/' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:72:9: '/'
            {
            match('/'); 

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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:73:7: ( '%' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:73:9: '%'
            {
            match('%'); 

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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:74:7: ( '^' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:74:9: '^'
            {
            match('^'); 

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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:75:7: ( '|' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:75:9: '|'
            {
            match('|'); 

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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:76:8: ( '~' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:76:10: '~'
            {
            match('~'); 

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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:77:8: ( '!' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:77:10: '!'
            {
            match('!'); 

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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:78:8: ( '=' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:78:10: '='
            {
            match('='); 

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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:79:8: ( '<' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:79:10: '<'
            {
            match('<'); 

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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:80:8: ( '>' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:80:10: '>'
            {
            match('>'); 

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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:81:8: ( '+=' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:81:10: '+='
            {
            match("+="); 


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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:82:8: ( '-=' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:82:10: '-='
            {
            match("-="); 


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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:83:8: ( '*=' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:83:10: '*='
            {
            match("*="); 


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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:84:8: ( '/=' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:84:10: '/='
            {
            match("/="); 


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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:85:8: ( '%=' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:85:10: '%='
            {
            match("%="); 


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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:86:8: ( '^=' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:86:10: '^='
            {
            match("^="); 


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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:87:8: ( '&=' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:87:10: '&='
            {
            match("&="); 


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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:88:8: ( '|=' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:88:10: '|='
            {
            match("|="); 


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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:89:8: ( '<<' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:89:10: '<<'
            {
            match("<<"); 


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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:90:8: ( '>>' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:90:10: '>>'
            {
            match(">>"); 


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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:91:8: ( '>>=' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:91:10: '>>='
            {
            match(">>="); 


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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:92:8: ( '<<=' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:92:10: '<<='
            {
            match("<<="); 


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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:93:8: ( '==' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:93:10: '=='
            {
            match("=="); 


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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:94:8: ( '!=' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:94:10: '!='
            {
            match("!="); 


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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:95:8: ( '<=' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:95:10: '<='
            {
            match("<="); 


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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:96:8: ( '>=' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:96:10: '>='
            {
            match(">="); 


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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:97:8: ( '||' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:97:10: '||'
            {
            match("||"); 


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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:98:8: ( '++' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:98:10: '++'
            {
            match("++"); 


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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:99:8: ( '--' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:99:10: '--'
            {
            match("--"); 


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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:100:8: ( ',' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:100:10: ','
            {
            match(','); 

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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:101:8: ( '->*' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:101:10: '->*'
            {
            match("->*"); 


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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:102:8: ( '->' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:102:10: '->'
            {
            match("->"); 


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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:103:8: ( '()' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:103:10: '()'
            {
            match("()"); 


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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:104:8: ( '[]' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:104:10: '[]'
            {
            match("[]"); 


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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:105:8: ( 'typename' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:105:10: 'typename'
            {
            match("typename"); 


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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:106:8: ( 'namespace' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:106:10: 'namespace'
            {
            match("namespace"); 


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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:107:8: ( '{' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:107:10: '{'
            {
            match('{'); 

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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:108:8: ( '}' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:108:10: '}'
            {
            match('}'); 

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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:109:8: ( '#elif' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:109:10: '#elif'
            {
            match("#elif"); 


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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:110:8: ( '#else' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:110:10: '#else'
            {
            match("#else"); 


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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:111:8: ( '#include' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:111:10: '#include'
            {
            match("#include"); 


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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:112:8: ( '#define' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:112:10: '#define'
            {
            match("#define"); 


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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:113:8: ( ')' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:113:10: ')'
            {
            match(')'); 

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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:114:8: ( '#undef' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:114:10: '#undef'
            {
            match("#undef"); 


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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:115:8: ( '#line' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:115:10: '#line'
            {
            match("#line"); 


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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:116:8: ( '#error' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:116:10: '#error'
            {
            match("#error"); 


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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:117:8: ( '#pragma' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:117:10: '#pragma'
            {
            match("#pragma"); 


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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:118:8: ( '#if' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:118:10: '#if'
            {
            match("#if"); 


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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:119:8: ( '#ifdef' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:119:10: '#ifdef'
            {
            match("#ifdef"); 


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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:120:8: ( '#ifndef' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:120:10: '#ifndef'
            {
            match("#ifndef"); 


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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:121:8: ( '[' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:121:10: '['
            {
            match('['); 

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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:122:8: ( ']' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:122:10: ']'
            {
            match(']'); 

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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:123:8: ( ';' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:123:10: ';'
            {
            match(';'); 

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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:124:8: ( 'return' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:124:10: 'return'
            {
            match("return"); 


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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:125:8: ( 'nullptr' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:125:10: 'nullptr'
            {
            match("nullptr"); 


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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:126:8: ( ':' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:126:10: ':'
            {
            match(':'); 

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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:127:8: ( 'case' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:127:10: 'case'
            {
            match("case"); 


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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:128:8: ( 'default' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:128:10: 'default'
            {
            match("default"); 


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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:129:8: ( 'if' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:129:10: 'if'
            {
            match("if"); 


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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:130:8: ( 'else' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:130:10: 'else'
            {
            match("else"); 


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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:131:8: ( 'switch' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:131:10: 'switch'
            {
            match("switch"); 


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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:132:8: ( 'while' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:132:10: 'while'
            {
            match("while"); 


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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:133:8: ( 'do' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:133:10: 'do'
            {
            match("do"); 


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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:134:8: ( 'for' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:134:10: 'for'
            {
            match("for"); 


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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:135:8: ( 'break' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:135:10: 'break'
            {
            match("break"); 


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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:136:8: ( 'continue' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:136:10: 'continue'
            {
            match("continue"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__160"

    // $ANTLR start "T__161"
    public final void mT__161() throws RecognitionException {
        try {
            int _type = T__161;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:137:8: ( 'goto' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:137:10: 'goto'
            {
            match("goto"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__161"

    // $ANTLR start "T__162"
    public final void mT__162() throws RecognitionException {
        try {
            int _type = T__162;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:138:8: ( 'using' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:138:10: 'using'
            {
            match("using"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__162"

    // $ANTLR start "T__163"
    public final void mT__163() throws RecognitionException {
        try {
            int _type = T__163;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:139:8: ( 'static_assert' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:139:10: 'static_assert'
            {
            match("static_assert"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__163"

    // $ANTLR start "T__164"
    public final void mT__164() throws RecognitionException {
        try {
            int _type = T__164;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:140:8: ( 'template' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:140:10: 'template'
            {
            match("template"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__164"

    // $ANTLR start "T__165"
    public final void mT__165() throws RecognitionException {
        try {
            int _type = T__165;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:141:8: ( 'decltype' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:141:10: 'decltype'
            {
            match("decltype"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__165"

    // $ANTLR start "T__166"
    public final void mT__166() throws RecognitionException {
        try {
            int _type = T__166;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:142:8: ( 'asm' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:142:10: 'asm'
            {
            match("asm"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__166"

    // $ANTLR start "T__167"
    public final void mT__167() throws RecognitionException {
        try {
            int _type = T__167;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:143:8: ( '0' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:143:10: '0'
            {
            match('0'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__167"

    // $ANTLR start "T__168"
    public final void mT__168() throws RecognitionException {
        try {
            int _type = T__168;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:144:8: ( 'operator' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:144:10: 'operator'
            {
            match("operator"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__168"

    // $ANTLR start "T__169"
    public final void mT__169() throws RecognitionException {
        try {
            int _type = T__169;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:145:8: ( '\"' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:145:10: '\"'
            {
            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__169"

    // $ANTLR start "T__170"
    public final void mT__170() throws RecognitionException {
        try {
            int _type = T__170;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:146:8: ( 'try' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:146:10: 'try'
            {
            match("try"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__170"

    // $ANTLR start "T__171"
    public final void mT__171() throws RecognitionException {
        try {
            int _type = T__171;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:147:8: ( 'catch' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:147:10: 'catch'
            {
            match("catch"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__171"

    // $ANTLR start "T__172"
    public final void mT__172() throws RecognitionException {
        try {
            int _type = T__172;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:148:8: ( 'throw' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:148:10: 'throw'
            {
            match("throw"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__172"

    // $ANTLR start "T__173"
    public final void mT__173() throws RecognitionException {
        try {
            int _type = T__173;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:149:8: ( 'noexcept' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:149:10: 'noexcept'
            {
            match("noexcept"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__173"

    // $ANTLR start "T__174"
    public final void mT__174() throws RecognitionException {
        try {
            int _type = T__174;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:150:8: ( 'string' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:150:10: 'string'
            {
            match("string"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__174"

    // $ANTLR start "RULE_HEADER_NAME"
    public final void mRULE_HEADER_NAME() throws RecognitionException {
        try {
            int _type = RULE_HEADER_NAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19717:18: ( ( '<' ( RULE_ID | '.' ) '>' | '\"' ( RULE_ID | '.' ) '\"' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19717:20: ( '<' ( RULE_ID | '.' ) '>' | '\"' ( RULE_ID | '.' ) '\"' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19717:20: ( '<' ( RULE_ID | '.' ) '>' | '\"' ( RULE_ID | '.' ) '\"' )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='<') ) {
                alt3=1;
            }
            else if ( (LA3_0=='\"') ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19717:21: '<' ( RULE_ID | '.' ) '>'
                    {
                    match('<'); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19717:25: ( RULE_ID | '.' )
                    int alt1=2;
                    int LA1_0 = input.LA(1);

                    if ( ((LA1_0>='A' && LA1_0<='Z')||LA1_0=='\\'||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                        alt1=1;
                    }
                    else if ( (LA1_0=='.') ) {
                        alt1=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 1, 0, input);

                        throw nvae;
                    }
                    switch (alt1) {
                        case 1 :
                            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19717:26: RULE_ID
                            {
                            mRULE_ID(); 

                            }
                            break;
                        case 2 :
                            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19717:34: '.'
                            {
                            match('.'); 

                            }
                            break;

                    }

                    match('>'); 

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19717:43: '\"' ( RULE_ID | '.' ) '\"'
                    {
                    match('\"'); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19717:47: ( RULE_ID | '.' )
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( ((LA2_0>='A' && LA2_0<='Z')||LA2_0=='\\'||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
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
                            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19717:48: RULE_ID
                            {
                            mRULE_ID(); 

                            }
                            break;
                        case 2 :
                            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19717:56: '.'
                            {
                            match('.'); 

                            }
                            break;

                    }

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

    // $ANTLR start "RULE_HEX_QUAD"
    public final void mRULE_HEX_QUAD() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19719:24: ( RULE_HEXADECIMAL_DIGIT RULE_HEXADECIMAL_DIGIT RULE_HEXADECIMAL_DIGIT RULE_HEXADECIMAL_DIGIT )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19719:26: RULE_HEXADECIMAL_DIGIT RULE_HEXADECIMAL_DIGIT RULE_HEXADECIMAL_DIGIT RULE_HEXADECIMAL_DIGIT
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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19721:40: ( ( '\\\\u' RULE_HEX_QUAD | '\\\\U' RULE_HEX_QUAD RULE_HEX_QUAD ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19721:42: ( '\\\\u' RULE_HEX_QUAD | '\\\\U' RULE_HEX_QUAD RULE_HEX_QUAD )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19721:42: ( '\\\\u' RULE_HEX_QUAD | '\\\\U' RULE_HEX_QUAD RULE_HEX_QUAD )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='\\') ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1=='u') ) {
                    alt4=1;
                }
                else if ( (LA4_1=='U') ) {
                    alt4=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19721:43: '\\\\u' RULE_HEX_QUAD
                    {
                    match("\\u"); 

                    mRULE_HEX_QUAD(); 

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19721:63: '\\\\U' RULE_HEX_QUAD RULE_HEX_QUAD
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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19723:14: ( ( 'alignas' | 'alignof' | 'asm' | 'auto' | 'bool' | 'break' | 'case' | 'catch' | 'char' | 'char16_t' | 'char32_t' | 'class' | 'const' | 'constexpr' | 'const_cast' | 'continue' | 'decltype' | 'default' | 'delete' | 'do' | 'double' | 'dynamic_cast' | 'else' | 'enum' | 'explicit' | 'export' | 'extern' | 'false' | 'float' | 'for' | 'friend' | 'goto' | 'if' | 'inline' | 'int' | 'long' | 'mutable' | 'namespace' | 'new' | 'noexcept' | 'nullptr' | 'operator' | 'private' | 'protected' | 'public' | 'register' | 'reinterpret_cast' | 'return' | 'short' | 'signed' | 'sizeof' | 'static' | 'static_assert' | 'static_cast' | 'struct' | 'switch' | 'template' | 'this' | 'thread_local' | 'throw' | 'true' | 'try' | 'typedef' | 'typeid' | 'typename' | 'union' | 'unsigned' | 'using' | 'virtual' | 'volatile' | 'wchar_t' | 'while' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19723:16: ( 'alignas' | 'alignof' | 'asm' | 'auto' | 'bool' | 'break' | 'case' | 'catch' | 'char' | 'char16_t' | 'char32_t' | 'class' | 'const' | 'constexpr' | 'const_cast' | 'continue' | 'decltype' | 'default' | 'delete' | 'do' | 'double' | 'dynamic_cast' | 'else' | 'enum' | 'explicit' | 'export' | 'extern' | 'false' | 'float' | 'for' | 'friend' | 'goto' | 'if' | 'inline' | 'int' | 'long' | 'mutable' | 'namespace' | 'new' | 'noexcept' | 'nullptr' | 'operator' | 'private' | 'protected' | 'public' | 'register' | 'reinterpret_cast' | 'return' | 'short' | 'signed' | 'sizeof' | 'static' | 'static_assert' | 'static_cast' | 'struct' | 'switch' | 'template' | 'this' | 'thread_local' | 'throw' | 'true' | 'try' | 'typedef' | 'typeid' | 'typename' | 'union' | 'unsigned' | 'using' | 'virtual' | 'volatile' | 'wchar_t' | 'while' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19723:16: ( 'alignas' | 'alignof' | 'asm' | 'auto' | 'bool' | 'break' | 'case' | 'catch' | 'char' | 'char16_t' | 'char32_t' | 'class' | 'const' | 'constexpr' | 'const_cast' | 'continue' | 'decltype' | 'default' | 'delete' | 'do' | 'double' | 'dynamic_cast' | 'else' | 'enum' | 'explicit' | 'export' | 'extern' | 'false' | 'float' | 'for' | 'friend' | 'goto' | 'if' | 'inline' | 'int' | 'long' | 'mutable' | 'namespace' | 'new' | 'noexcept' | 'nullptr' | 'operator' | 'private' | 'protected' | 'public' | 'register' | 'reinterpret_cast' | 'return' | 'short' | 'signed' | 'sizeof' | 'static' | 'static_assert' | 'static_cast' | 'struct' | 'switch' | 'template' | 'this' | 'thread_local' | 'throw' | 'true' | 'try' | 'typedef' | 'typeid' | 'typename' | 'union' | 'unsigned' | 'using' | 'virtual' | 'volatile' | 'wchar_t' | 'while' )
            int alt5=72;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19723:17: 'alignas'
                    {
                    match("alignas"); 


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19723:27: 'alignof'
                    {
                    match("alignof"); 


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19723:37: 'asm'
                    {
                    match("asm"); 


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19723:43: 'auto'
                    {
                    match("auto"); 


                    }
                    break;
                case 5 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19723:50: 'bool'
                    {
                    match("bool"); 


                    }
                    break;
                case 6 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19723:57: 'break'
                    {
                    match("break"); 


                    }
                    break;
                case 7 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19723:65: 'case'
                    {
                    match("case"); 


                    }
                    break;
                case 8 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19723:72: 'catch'
                    {
                    match("catch"); 


                    }
                    break;
                case 9 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19723:80: 'char'
                    {
                    match("char"); 


                    }
                    break;
                case 10 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19723:87: 'char16_t'
                    {
                    match("char16_t"); 


                    }
                    break;
                case 11 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19723:98: 'char32_t'
                    {
                    match("char32_t"); 


                    }
                    break;
                case 12 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19723:109: 'class'
                    {
                    match("class"); 


                    }
                    break;
                case 13 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19723:117: 'const'
                    {
                    match("const"); 


                    }
                    break;
                case 14 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19723:125: 'constexpr'
                    {
                    match("constexpr"); 


                    }
                    break;
                case 15 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19723:137: 'const_cast'
                    {
                    match("const_cast"); 


                    }
                    break;
                case 16 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19723:150: 'continue'
                    {
                    match("continue"); 


                    }
                    break;
                case 17 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19723:161: 'decltype'
                    {
                    match("decltype"); 


                    }
                    break;
                case 18 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19723:172: 'default'
                    {
                    match("default"); 


                    }
                    break;
                case 19 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19723:182: 'delete'
                    {
                    match("delete"); 


                    }
                    break;
                case 20 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19723:191: 'do'
                    {
                    match("do"); 


                    }
                    break;
                case 21 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19723:196: 'double'
                    {
                    match("double"); 


                    }
                    break;
                case 22 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19723:205: 'dynamic_cast'
                    {
                    match("dynamic_cast"); 


                    }
                    break;
                case 23 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19723:220: 'else'
                    {
                    match("else"); 


                    }
                    break;
                case 24 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19723:227: 'enum'
                    {
                    match("enum"); 


                    }
                    break;
                case 25 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19723:234: 'explicit'
                    {
                    match("explicit"); 


                    }
                    break;
                case 26 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19723:245: 'export'
                    {
                    match("export"); 


                    }
                    break;
                case 27 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19723:254: 'extern'
                    {
                    match("extern"); 


                    }
                    break;
                case 28 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19723:263: 'false'
                    {
                    match("false"); 


                    }
                    break;
                case 29 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19723:271: 'float'
                    {
                    match("float"); 


                    }
                    break;
                case 30 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19723:279: 'for'
                    {
                    match("for"); 


                    }
                    break;
                case 31 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19723:285: 'friend'
                    {
                    match("friend"); 


                    }
                    break;
                case 32 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19723:294: 'goto'
                    {
                    match("goto"); 


                    }
                    break;
                case 33 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19723:301: 'if'
                    {
                    match("if"); 


                    }
                    break;
                case 34 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19723:306: 'inline'
                    {
                    match("inline"); 


                    }
                    break;
                case 35 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19723:315: 'int'
                    {
                    match("int"); 


                    }
                    break;
                case 36 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19723:321: 'long'
                    {
                    match("long"); 


                    }
                    break;
                case 37 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19723:328: 'mutable'
                    {
                    match("mutable"); 


                    }
                    break;
                case 38 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19723:338: 'namespace'
                    {
                    match("namespace"); 


                    }
                    break;
                case 39 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19723:350: 'new'
                    {
                    match("new"); 


                    }
                    break;
                case 40 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19723:356: 'noexcept'
                    {
                    match("noexcept"); 


                    }
                    break;
                case 41 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19723:367: 'nullptr'
                    {
                    match("nullptr"); 


                    }
                    break;
                case 42 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19723:377: 'operator'
                    {
                    match("operator"); 


                    }
                    break;
                case 43 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19723:388: 'private'
                    {
                    match("private"); 


                    }
                    break;
                case 44 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19723:398: 'protected'
                    {
                    match("protected"); 


                    }
                    break;
                case 45 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19723:410: 'public'
                    {
                    match("public"); 


                    }
                    break;
                case 46 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19723:419: 'register'
                    {
                    match("register"); 


                    }
                    break;
                case 47 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19723:430: 'reinterpret_cast'
                    {
                    match("reinterpret_cast"); 


                    }
                    break;
                case 48 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19723:449: 'return'
                    {
                    match("return"); 


                    }
                    break;
                case 49 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19723:458: 'short'
                    {
                    match("short"); 


                    }
                    break;
                case 50 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19723:466: 'signed'
                    {
                    match("signed"); 


                    }
                    break;
                case 51 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19723:475: 'sizeof'
                    {
                    match("sizeof"); 


                    }
                    break;
                case 52 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19723:484: 'static'
                    {
                    match("static"); 


                    }
                    break;
                case 53 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19723:493: 'static_assert'
                    {
                    match("static_assert"); 


                    }
                    break;
                case 54 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19723:509: 'static_cast'
                    {
                    match("static_cast"); 


                    }
                    break;
                case 55 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19723:523: 'struct'
                    {
                    match("struct"); 


                    }
                    break;
                case 56 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19723:532: 'switch'
                    {
                    match("switch"); 


                    }
                    break;
                case 57 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19723:541: 'template'
                    {
                    match("template"); 


                    }
                    break;
                case 58 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19723:552: 'this'
                    {
                    match("this"); 


                    }
                    break;
                case 59 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19723:559: 'thread_local'
                    {
                    match("thread_local"); 


                    }
                    break;
                case 60 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19723:574: 'throw'
                    {
                    match("throw"); 


                    }
                    break;
                case 61 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19723:582: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 62 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19723:589: 'try'
                    {
                    match("try"); 


                    }
                    break;
                case 63 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19723:595: 'typedef'
                    {
                    match("typedef"); 


                    }
                    break;
                case 64 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19723:605: 'typeid'
                    {
                    match("typeid"); 


                    }
                    break;
                case 65 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19723:614: 'typename'
                    {
                    match("typename"); 


                    }
                    break;
                case 66 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19723:625: 'union'
                    {
                    match("union"); 


                    }
                    break;
                case 67 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19723:633: 'unsigned'
                    {
                    match("unsigned"); 


                    }
                    break;
                case 68 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19723:644: 'using'
                    {
                    match("using"); 


                    }
                    break;
                case 69 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19723:652: 'virtual'
                    {
                    match("virtual"); 


                    }
                    break;
                case 70 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19723:662: 'volatile'
                    {
                    match("volatile"); 


                    }
                    break;
                case 71 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19723:673: 'wchar_t'
                    {
                    match("wchar_t"); 


                    }
                    break;
                case 72 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19723:683: 'while'
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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19725:31: ( ( '{' | '}' | '[' | ']' | '#' | '##' | '(' | ')' | '<:' | ':>' | '<%' | '%>' | '%:' | '%:%:' | ';' | ':' | '...' | 'new' | 'delete' | '?' | '::' | '.' | '.*' | '+' | '-' | '*' | '/' | '%' | '^' | '&' | '|' | '~' | '!' | '=' | '<' | '>' | '+=' | '-=' | '*=' | '/=' | '%=' | '^=' | '&=' | '|=' | '<<' | '>>' | '<<=' | '>>=' | '==' | '!=' | '<=' | '>=' | '&&' | '||' | '++' | '--' | ',' | '->*' | '->' | 'and' | 'and_eq' | 'bitand' | 'bitor' | 'compl' | 'not' | 'not_eq' | 'or' | 'or_eq' | 'xor' | 'xor_eq' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19725:33: ( '{' | '}' | '[' | ']' | '#' | '##' | '(' | ')' | '<:' | ':>' | '<%' | '%>' | '%:' | '%:%:' | ';' | ':' | '...' | 'new' | 'delete' | '?' | '::' | '.' | '.*' | '+' | '-' | '*' | '/' | '%' | '^' | '&' | '|' | '~' | '!' | '=' | '<' | '>' | '+=' | '-=' | '*=' | '/=' | '%=' | '^=' | '&=' | '|=' | '<<' | '>>' | '<<=' | '>>=' | '==' | '!=' | '<=' | '>=' | '&&' | '||' | '++' | '--' | ',' | '->*' | '->' | 'and' | 'and_eq' | 'bitand' | 'bitor' | 'compl' | 'not' | 'not_eq' | 'or' | 'or_eq' | 'xor' | 'xor_eq' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19725:33: ( '{' | '}' | '[' | ']' | '#' | '##' | '(' | ')' | '<:' | ':>' | '<%' | '%>' | '%:' | '%:%:' | ';' | ':' | '...' | 'new' | 'delete' | '?' | '::' | '.' | '.*' | '+' | '-' | '*' | '/' | '%' | '^' | '&' | '|' | '~' | '!' | '=' | '<' | '>' | '+=' | '-=' | '*=' | '/=' | '%=' | '^=' | '&=' | '|=' | '<<' | '>>' | '<<=' | '>>=' | '==' | '!=' | '<=' | '>=' | '&&' | '||' | '++' | '--' | ',' | '->*' | '->' | 'and' | 'and_eq' | 'bitand' | 'bitor' | 'compl' | 'not' | 'not_eq' | 'or' | 'or_eq' | 'xor' | 'xor_eq' )
            int alt6=70;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19725:34: '{'
                    {
                    match('{'); 

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19725:38: '}'
                    {
                    match('}'); 

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19725:42: '['
                    {
                    match('['); 

                    }
                    break;
                case 4 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19725:46: ']'
                    {
                    match(']'); 

                    }
                    break;
                case 5 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19725:50: '#'
                    {
                    match('#'); 

                    }
                    break;
                case 6 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19725:54: '##'
                    {
                    match("##"); 


                    }
                    break;
                case 7 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19725:59: '('
                    {
                    match('('); 

                    }
                    break;
                case 8 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19725:63: ')'
                    {
                    match(')'); 

                    }
                    break;
                case 9 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19725:67: '<:'
                    {
                    match("<:"); 


                    }
                    break;
                case 10 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19725:72: ':>'
                    {
                    match(":>"); 


                    }
                    break;
                case 11 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19725:77: '<%'
                    {
                    match("<%"); 


                    }
                    break;
                case 12 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19725:82: '%>'
                    {
                    match("%>"); 


                    }
                    break;
                case 13 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19725:87: '%:'
                    {
                    match("%:"); 


                    }
                    break;
                case 14 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19725:92: '%:%:'
                    {
                    match("%:%:"); 


                    }
                    break;
                case 15 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19725:99: ';'
                    {
                    match(';'); 

                    }
                    break;
                case 16 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19725:103: ':'
                    {
                    match(':'); 

                    }
                    break;
                case 17 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19725:107: '...'
                    {
                    match("..."); 


                    }
                    break;
                case 18 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19725:113: 'new'
                    {
                    match("new"); 


                    }
                    break;
                case 19 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19725:119: 'delete'
                    {
                    match("delete"); 


                    }
                    break;
                case 20 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19725:128: '?'
                    {
                    match('?'); 

                    }
                    break;
                case 21 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19725:132: '::'
                    {
                    match("::"); 


                    }
                    break;
                case 22 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19725:137: '.'
                    {
                    match('.'); 

                    }
                    break;
                case 23 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19725:141: '.*'
                    {
                    match(".*"); 


                    }
                    break;
                case 24 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19725:146: '+'
                    {
                    match('+'); 

                    }
                    break;
                case 25 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19725:150: '-'
                    {
                    match('-'); 

                    }
                    break;
                case 26 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19725:154: '*'
                    {
                    match('*'); 

                    }
                    break;
                case 27 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19725:158: '/'
                    {
                    match('/'); 

                    }
                    break;
                case 28 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19725:162: '%'
                    {
                    match('%'); 

                    }
                    break;
                case 29 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19725:166: '^'
                    {
                    match('^'); 

                    }
                    break;
                case 30 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19725:170: '&'
                    {
                    match('&'); 

                    }
                    break;
                case 31 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19725:174: '|'
                    {
                    match('|'); 

                    }
                    break;
                case 32 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19725:178: '~'
                    {
                    match('~'); 

                    }
                    break;
                case 33 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19725:182: '!'
                    {
                    match('!'); 

                    }
                    break;
                case 34 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19725:186: '='
                    {
                    match('='); 

                    }
                    break;
                case 35 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19725:190: '<'
                    {
                    match('<'); 

                    }
                    break;
                case 36 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19725:194: '>'
                    {
                    match('>'); 

                    }
                    break;
                case 37 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19725:198: '+='
                    {
                    match("+="); 


                    }
                    break;
                case 38 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19725:203: '-='
                    {
                    match("-="); 


                    }
                    break;
                case 39 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19725:208: '*='
                    {
                    match("*="); 


                    }
                    break;
                case 40 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19725:213: '/='
                    {
                    match("/="); 


                    }
                    break;
                case 41 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19725:218: '%='
                    {
                    match("%="); 


                    }
                    break;
                case 42 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19725:223: '^='
                    {
                    match("^="); 


                    }
                    break;
                case 43 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19725:228: '&='
                    {
                    match("&="); 


                    }
                    break;
                case 44 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19725:233: '|='
                    {
                    match("|="); 


                    }
                    break;
                case 45 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19725:238: '<<'
                    {
                    match("<<"); 


                    }
                    break;
                case 46 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19725:243: '>>'
                    {
                    match(">>"); 


                    }
                    break;
                case 47 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19725:248: '<<='
                    {
                    match("<<="); 


                    }
                    break;
                case 48 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19725:254: '>>='
                    {
                    match(">>="); 


                    }
                    break;
                case 49 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19725:260: '=='
                    {
                    match("=="); 


                    }
                    break;
                case 50 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19725:265: '!='
                    {
                    match("!="); 


                    }
                    break;
                case 51 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19725:270: '<='
                    {
                    match("<="); 


                    }
                    break;
                case 52 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19725:275: '>='
                    {
                    match(">="); 


                    }
                    break;
                case 53 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19725:280: '&&'
                    {
                    match("&&"); 


                    }
                    break;
                case 54 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19725:285: '||'
                    {
                    match("||"); 


                    }
                    break;
                case 55 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19725:290: '++'
                    {
                    match("++"); 


                    }
                    break;
                case 56 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19725:295: '--'
                    {
                    match("--"); 


                    }
                    break;
                case 57 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19725:300: ','
                    {
                    match(','); 

                    }
                    break;
                case 58 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19725:304: '->*'
                    {
                    match("->*"); 


                    }
                    break;
                case 59 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19725:310: '->'
                    {
                    match("->"); 


                    }
                    break;
                case 60 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19725:315: 'and'
                    {
                    match("and"); 


                    }
                    break;
                case 61 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19725:321: 'and_eq'
                    {
                    match("and_eq"); 


                    }
                    break;
                case 62 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19725:330: 'bitand'
                    {
                    match("bitand"); 


                    }
                    break;
                case 63 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19725:339: 'bitor'
                    {
                    match("bitor"); 


                    }
                    break;
                case 64 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19725:347: 'compl'
                    {
                    match("compl"); 


                    }
                    break;
                case 65 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19725:355: 'not'
                    {
                    match("not"); 


                    }
                    break;
                case 66 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19725:361: 'not_eq'
                    {
                    match("not_eq"); 


                    }
                    break;
                case 67 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19725:370: 'or'
                    {
                    match("or"); 


                    }
                    break;
                case 68 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19725:375: 'or_eq'
                    {
                    match("or_eq"); 


                    }
                    break;
                case 69 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19725:383: 'xor'
                    {
                    match("xor"); 


                    }
                    break;
                case 70 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19725:389: 'xor_eq'
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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19727:9: ( ( RULE_NONDIGIT | RULE_UNIVERSAL_CHARACTER_NAME ) ( '0' .. '9' | RULE_NONDIGIT | RULE_UNIVERSAL_CHARACTER_NAME )* )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19727:11: ( RULE_NONDIGIT | RULE_UNIVERSAL_CHARACTER_NAME ) ( '0' .. '9' | RULE_NONDIGIT | RULE_UNIVERSAL_CHARACTER_NAME )*
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19727:11: ( RULE_NONDIGIT | RULE_UNIVERSAL_CHARACTER_NAME )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>='A' && LA7_0<='Z')||LA7_0=='_'||(LA7_0>='a' && LA7_0<='z')) ) {
                alt7=1;
            }
            else if ( (LA7_0=='\\') ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19727:12: RULE_NONDIGIT
                    {
                    mRULE_NONDIGIT(); 

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19727:26: RULE_UNIVERSAL_CHARACTER_NAME
                    {
                    mRULE_UNIVERSAL_CHARACTER_NAME(); 

                    }
                    break;

            }

            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19727:57: ( '0' .. '9' | RULE_NONDIGIT | RULE_UNIVERSAL_CHARACTER_NAME )*
            loop8:
            do {
                int alt8=4;
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
                    alt8=1;
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
                    alt8=2;
                    }
                    break;
                case '\\':
                    {
                    alt8=3;
                    }
                    break;

                }

                switch (alt8) {
            	case 1 :
            	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19727:58: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;
            	case 2 :
            	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19727:67: RULE_NONDIGIT
            	    {
            	    mRULE_NONDIGIT(); 

            	    }
            	    break;
            	case 3 :
            	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19727:81: RULE_UNIVERSAL_CHARACTER_NAME
            	    {
            	    mRULE_UNIVERSAL_CHARACTER_NAME(); 

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

    // $ANTLR start "RULE_NONDIGIT"
    public final void mRULE_NONDIGIT() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19729:24: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19729:26: ( 'a' .. 'z' | 'A' .. 'Z' | '_' )
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

    // $ANTLR start "RULE_DECIMAL_LITERAL"
    public final void mRULE_DECIMAL_LITERAL() throws RecognitionException {
        try {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19731:31: ( '1' .. '9' ( '0' .. '9' )* )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19731:33: '1' .. '9' ( '0' .. '9' )*
            {
            matchRange('1','9'); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19731:42: ( '0' .. '9' )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='0' && LA9_0<='9')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19731:43: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19733:29: ( '0' ( RULE_OCTAL_DIGIT )* )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19733:31: '0' ( RULE_OCTAL_DIGIT )*
            {
            match('0'); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19733:35: ( RULE_OCTAL_DIGIT )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='0' && LA10_0<='7')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19733:35: RULE_OCTAL_DIGIT
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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19735:35: ( ( '0x' | '0X' ) ( RULE_HEXADECIMAL_DIGIT )+ )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19735:37: ( '0x' | '0X' ) ( RULE_HEXADECIMAL_DIGIT )+
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19735:37: ( '0x' | '0X' )
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
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19735:38: '0x'
                    {
                    match("0x"); 


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19735:43: '0X'
                    {
                    match("0X"); 


                    }
                    break;

            }

            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19735:49: ( RULE_HEXADECIMAL_DIGIT )+
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
            	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19735:49: RULE_HEXADECIMAL_DIGIT
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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19737:27: ( '0' .. '7' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19737:29: '0' .. '7'
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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19739:33: ( ( '0' .. '9' | 'A' .. 'F' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19739:35: ( '0' .. '9' | 'A' .. 'F' )
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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19741:30: ( ( ( 'u' | 'U' ) ( 'l' | 'L' | 'll' | 'LL' )? | ( 'l' | 'L' | 'll' | 'LL' ) ( 'u' | 'U' )? ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19741:32: ( ( 'u' | 'U' ) ( 'l' | 'L' | 'll' | 'LL' )? | ( 'l' | 'L' | 'll' | 'LL' ) ( 'u' | 'U' )? )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19741:32: ( ( 'u' | 'U' ) ( 'l' | 'L' | 'll' | 'LL' )? | ( 'l' | 'L' | 'll' | 'LL' ) ( 'u' | 'U' )? )
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
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19741:33: ( 'u' | 'U' ) ( 'l' | 'L' | 'll' | 'LL' )?
                    {
                    if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19741:43: ( 'l' | 'L' | 'll' | 'LL' )?
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
                            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19741:44: 'l'
                            {
                            match('l'); 

                            }
                            break;
                        case 2 :
                            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19741:48: 'L'
                            {
                            match('L'); 

                            }
                            break;
                        case 3 :
                            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19741:52: 'll'
                            {
                            match("ll"); 


                            }
                            break;
                        case 4 :
                            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19741:57: 'LL'
                            {
                            match("LL"); 


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19741:64: ( 'l' | 'L' | 'll' | 'LL' ) ( 'u' | 'U' )?
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19741:64: ( 'l' | 'L' | 'll' | 'LL' )
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
                            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19741:65: 'l'
                            {
                            match('l'); 

                            }
                            break;
                        case 2 :
                            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19741:69: 'L'
                            {
                            match('L'); 

                            }
                            break;
                        case 3 :
                            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19741:73: 'll'
                            {
                            match("ll"); 


                            }
                            break;
                        case 4 :
                            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19741:78: 'LL'
                            {
                            match("LL"); 


                            }
                            break;

                    }

                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19741:84: ( 'u' | 'U' )?
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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19743:24: ( ( 'u' | 'U' | 'L' )? '\\'' ( RULE_C_CHAR )+ '\\'' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19743:26: ( 'u' | 'U' | 'L' )? '\\'' ( RULE_C_CHAR )+ '\\''
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19743:26: ( 'u' | 'U' | 'L' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0=='L'||LA17_0=='U'||LA17_0=='u') ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:
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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19743:46: ( RULE_C_CHAR )+
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
            	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19743:46: RULE_C_CHAR
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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19745:22: ( (~ ( ( '\\'' | '\\\\' | '\\n' ) ) | RULE_ESCAPE_SEQUENCE | RULE_UNIVERSAL_CHARACTER_NAME ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19745:24: (~ ( ( '\\'' | '\\\\' | '\\n' ) ) | RULE_ESCAPE_SEQUENCE | RULE_UNIVERSAL_CHARACTER_NAME )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19745:24: (~ ( ( '\\'' | '\\\\' | '\\n' ) ) | RULE_ESCAPE_SEQUENCE | RULE_UNIVERSAL_CHARACTER_NAME )
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
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19745:25: ~ ( ( '\\'' | '\\\\' | '\\n' ) )
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
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19745:45: RULE_ESCAPE_SEQUENCE
                    {
                    mRULE_ESCAPE_SEQUENCE(); 

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19745:66: RULE_UNIVERSAL_CHARACTER_NAME
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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19747:31: ( ( RULE_SIMPLE_ESCAPE_SEQUENCE | RULE_OCTAL_ESCAPE_SEQUENCE | RULE_HEXADECIMAL_ESCAPE_SEQUENCE ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19747:33: ( RULE_SIMPLE_ESCAPE_SEQUENCE | RULE_OCTAL_ESCAPE_SEQUENCE | RULE_HEXADECIMAL_ESCAPE_SEQUENCE )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19747:33: ( RULE_SIMPLE_ESCAPE_SEQUENCE | RULE_OCTAL_ESCAPE_SEQUENCE | RULE_HEXADECIMAL_ESCAPE_SEQUENCE )
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
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19747:34: RULE_SIMPLE_ESCAPE_SEQUENCE
                    {
                    mRULE_SIMPLE_ESCAPE_SEQUENCE(); 

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19747:62: RULE_OCTAL_ESCAPE_SEQUENCE
                    {
                    mRULE_OCTAL_ESCAPE_SEQUENCE(); 

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19747:89: RULE_HEXADECIMAL_ESCAPE_SEQUENCE
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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19749:38: ( '\\\\' ( '\\'' | '\"' | '?' | '\\\\' | 'a' | 'b' | 'f' | 'n' | 'r' | 't' | 'v' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19749:40: '\\\\' ( '\\'' | '\"' | '?' | '\\\\' | 'a' | 'b' | 'f' | 'n' | 'r' | 't' | 'v' )
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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19751:37: ( '\\\\' RULE_OCTAL_DIGIT RULE_OCTAL_DIGIT RULE_OCTAL_DIGIT )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19751:39: '\\\\' RULE_OCTAL_DIGIT RULE_OCTAL_DIGIT RULE_OCTAL_DIGIT
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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19753:43: ( '\\\\x' ( RULE_HEXADECIMAL_DIGIT )+ )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19753:45: '\\\\x' ( RULE_HEXADECIMAL_DIGIT )+
            {
            match("\\x"); 

            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19753:51: ( RULE_HEXADECIMAL_DIGIT )+
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
            	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19753:51: RULE_HEXADECIMAL_DIGIT
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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19755:23: ( ( RULE_FRACTIONAL_CONSTANT ( RULE_EXPONENT_PART )? | ( '0' .. '9' )+ RULE_EXPONENT_PART ) ( 'f' | 'l' | 'F' | 'L' )? )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19755:25: ( RULE_FRACTIONAL_CONSTANT ( RULE_EXPONENT_PART )? | ( '0' .. '9' )+ RULE_EXPONENT_PART ) ( 'f' | 'l' | 'F' | 'L' )?
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19755:25: ( RULE_FRACTIONAL_CONSTANT ( RULE_EXPONENT_PART )? | ( '0' .. '9' )+ RULE_EXPONENT_PART )
            int alt24=2;
            alt24 = dfa24.predict(input);
            switch (alt24) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19755:26: RULE_FRACTIONAL_CONSTANT ( RULE_EXPONENT_PART )?
                    {
                    mRULE_FRACTIONAL_CONSTANT(); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19755:51: ( RULE_EXPONENT_PART )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0=='E'||LA22_0=='e') ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19755:51: RULE_EXPONENT_PART
                            {
                            mRULE_EXPONENT_PART(); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19755:71: ( '0' .. '9' )+ RULE_EXPONENT_PART
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19755:71: ( '0' .. '9' )+
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
                    	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19755:72: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

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

            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19755:103: ( 'f' | 'l' | 'F' | 'L' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0=='F'||LA25_0=='L'||LA25_0=='f'||LA25_0=='l') ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:
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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19757:35: ( ( ( '0' .. '9' )* '.' ( '0' .. '9' )+ | ( '0' .. '9' )+ '.' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19757:37: ( ( '0' .. '9' )* '.' ( '0' .. '9' )+ | ( '0' .. '9' )+ '.' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19757:37: ( ( '0' .. '9' )* '.' ( '0' .. '9' )+ | ( '0' .. '9' )+ '.' )
            int alt29=2;
            alt29 = dfa29.predict(input);
            switch (alt29) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19757:38: ( '0' .. '9' )* '.' ( '0' .. '9' )+
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19757:38: ( '0' .. '9' )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( ((LA26_0>='0' && LA26_0<='9')) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19757:39: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop26;
                        }
                    } while (true);

                    match('.'); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19757:54: ( '0' .. '9' )+
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
                    	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19757:55: '0' .. '9'
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
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19757:66: ( '0' .. '9' )+ '.'
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19757:66: ( '0' .. '9' )+
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
                    	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19757:67: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19759:29: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19759:31: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19759:41: ( '+' | '-' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0=='+'||LA30_0=='-') ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:
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

            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19759:52: ( '0' .. '9' )+
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
            	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19759:53: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19761:21: ( ( RULE_ENC_PREFIX )? '\"' ( RULE_SCHAR )+ '\"' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19761:23: ( RULE_ENC_PREFIX )? '\"' ( RULE_SCHAR )+ '\"'
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19761:23: ( RULE_ENC_PREFIX )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0=='L'||LA32_0=='U'||LA32_0=='u') ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19761:23: RULE_ENC_PREFIX
                    {
                    mRULE_ENC_PREFIX(); 

                    }
                    break;

            }

            match('\"'); 
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19761:44: ( RULE_SCHAR )+
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
            	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19761:44: RULE_SCHAR
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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19763:26: ( ( 'u8' | 'u' | 'U' | 'L' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19763:28: ( 'u8' | 'u' | 'U' | 'L' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19763:28: ( 'u8' | 'u' | 'U' | 'L' )
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
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19763:29: 'u8'
                    {
                    match("u8"); 


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19763:34: 'u'
                    {
                    match('u'); 

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19763:38: 'U'
                    {
                    match('U'); 

                    }
                    break;
                case 4 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19763:42: 'L'
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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19765:21: ( (~ ( ( '\"' | '\\\\' | '\\n' ) ) | RULE_ESCAPE_SEQUENCE | RULE_UNIVERSAL_CHARACTER_NAME ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19765:23: (~ ( ( '\"' | '\\\\' | '\\n' ) ) | RULE_ESCAPE_SEQUENCE | RULE_UNIVERSAL_CHARACTER_NAME )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19765:23: (~ ( ( '\"' | '\\\\' | '\\n' ) ) | RULE_ESCAPE_SEQUENCE | RULE_UNIVERSAL_CHARACTER_NAME )
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
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19765:24: ~ ( ( '\"' | '\\\\' | '\\n' ) )
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
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19765:43: RULE_ESCAPE_SEQUENCE
                    {
                    mRULE_ESCAPE_SEQUENCE(); 

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19765:64: RULE_UNIVERSAL_CHARACTER_NAME
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

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19767:10: ( ( '0' .. '9' )+ )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19767:12: ( '0' .. '9' )+
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19767:12: ( '0' .. '9' )+
            int cnt36=0;
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( ((LA36_0>='0' && LA36_0<='9')) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19767:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt36 >= 1 ) break loop36;
                        EarlyExitException eee =
                            new EarlyExitException(36, input);
                        throw eee;
                }
                cnt36++;
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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19769:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19769:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19769:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0=='\"') ) {
                alt39=1;
            }
            else if ( (LA39_0=='\'') ) {
                alt39=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19769:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19769:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop37:
                    do {
                        int alt37=3;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0=='\\') ) {
                            alt37=1;
                        }
                        else if ( ((LA37_0>='\u0000' && LA37_0<='!')||(LA37_0>='#' && LA37_0<='[')||(LA37_0>=']' && LA37_0<='\uFFFF')) ) {
                            alt37=2;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19769:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19769:66: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop37;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19769:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19769:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop38:
                    do {
                        int alt38=3;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0=='\\') ) {
                            alt38=1;
                        }
                        else if ( ((LA38_0>='\u0000' && LA38_0<='&')||(LA38_0>='(' && LA38_0<='[')||(LA38_0>=']' && LA38_0<='\uFFFF')) ) {
                            alt38=2;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19769:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19769:137: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop38;
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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19771:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19771:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19771:24: ( options {greedy=false; } : . )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0=='*') ) {
                    int LA40_1 = input.LA(2);

                    if ( (LA40_1=='/') ) {
                        alt40=2;
                    }
                    else if ( ((LA40_1>='\u0000' && LA40_1<='.')||(LA40_1>='0' && LA40_1<='\uFFFF')) ) {
                        alt40=1;
                    }


                }
                else if ( ((LA40_0>='\u0000' && LA40_0<=')')||(LA40_0>='+' && LA40_0<='\uFFFF')) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19771:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop40;
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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19773:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19773:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19773:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( ((LA41_0>='\u0000' && LA41_0<='\t')||(LA41_0>='\u000B' && LA41_0<='\f')||(LA41_0>='\u000E' && LA41_0<='\uFFFF')) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19773:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop41;
                }
            } while (true);

            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19773:40: ( ( '\\r' )? '\\n' )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0=='\n'||LA43_0=='\r') ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19773:41: ( '\\r' )? '\\n'
                    {
                    // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19773:41: ( '\\r' )?
                    int alt42=2;
                    int LA42_0 = input.LA(1);

                    if ( (LA42_0=='\r') ) {
                        alt42=1;
                    }
                    switch (alt42) {
                        case 1 :
                            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19773:41: '\\r'
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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19775:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19775:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19775:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt44=0;
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( ((LA44_0>='\t' && LA44_0<='\n')||LA44_0=='\r'||LA44_0==' ') ) {
                    alt44=1;
                }


                switch (alt44) {
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
            	    if ( cnt44 >= 1 ) break loop44;
                        EarlyExitException eee =
                            new EarlyExitException(44, input);
                        throw eee;
                }
                cnt44++;
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
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19777:16: ( . )
            // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:19777:18: .
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
        // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:8: ( T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | T__114 | T__115 | T__116 | T__117 | T__118 | T__119 | T__120 | T__121 | T__122 | T__123 | T__124 | T__125 | T__126 | T__127 | T__128 | T__129 | T__130 | T__131 | T__132 | T__133 | T__134 | T__135 | T__136 | T__137 | T__138 | T__139 | T__140 | T__141 | T__142 | T__143 | T__144 | T__145 | T__146 | T__147 | T__148 | T__149 | T__150 | T__151 | T__152 | T__153 | T__154 | T__155 | T__156 | T__157 | T__158 | T__159 | T__160 | T__161 | T__162 | T__163 | T__164 | T__165 | T__166 | T__167 | T__168 | T__169 | T__170 | T__171 | T__172 | T__173 | T__174 | RULE_HEADER_NAME | RULE_KEYWORD | RULE_PREPROCESSING_OP_OR_PUNC | RULE_ID | RULE_CHARACTER_LITERAL | RULE_FLOATING_LITERAL | RULE_STRING_LITERAL | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt45=153;
        alt45 = dfa45.predict(input);
        switch (alt45) {
            case 1 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:10: T__35
                {
                mT__35(); 

                }
                break;
            case 2 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:16: T__36
                {
                mT__36(); 

                }
                break;
            case 3 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:22: T__37
                {
                mT__37(); 

                }
                break;
            case 4 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:28: T__38
                {
                mT__38(); 

                }
                break;
            case 5 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:34: T__39
                {
                mT__39(); 

                }
                break;
            case 6 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:40: T__40
                {
                mT__40(); 

                }
                break;
            case 7 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:46: T__41
                {
                mT__41(); 

                }
                break;
            case 8 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:52: T__42
                {
                mT__42(); 

                }
                break;
            case 9 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:58: T__43
                {
                mT__43(); 

                }
                break;
            case 10 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:64: T__44
                {
                mT__44(); 

                }
                break;
            case 11 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:70: T__45
                {
                mT__45(); 

                }
                break;
            case 12 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:76: T__46
                {
                mT__46(); 

                }
                break;
            case 13 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:82: T__47
                {
                mT__47(); 

                }
                break;
            case 14 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:88: T__48
                {
                mT__48(); 

                }
                break;
            case 15 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:94: T__49
                {
                mT__49(); 

                }
                break;
            case 16 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:100: T__50
                {
                mT__50(); 

                }
                break;
            case 17 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:106: T__51
                {
                mT__51(); 

                }
                break;
            case 18 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:112: T__52
                {
                mT__52(); 

                }
                break;
            case 19 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:118: T__53
                {
                mT__53(); 

                }
                break;
            case 20 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:124: T__54
                {
                mT__54(); 

                }
                break;
            case 21 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:130: T__55
                {
                mT__55(); 

                }
                break;
            case 22 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:136: T__56
                {
                mT__56(); 

                }
                break;
            case 23 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:142: T__57
                {
                mT__57(); 

                }
                break;
            case 24 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:148: T__58
                {
                mT__58(); 

                }
                break;
            case 25 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:154: T__59
                {
                mT__59(); 

                }
                break;
            case 26 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:160: T__60
                {
                mT__60(); 

                }
                break;
            case 27 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:166: T__61
                {
                mT__61(); 

                }
                break;
            case 28 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:172: T__62
                {
                mT__62(); 

                }
                break;
            case 29 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:178: T__63
                {
                mT__63(); 

                }
                break;
            case 30 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:184: T__64
                {
                mT__64(); 

                }
                break;
            case 31 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:190: T__65
                {
                mT__65(); 

                }
                break;
            case 32 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:196: T__66
                {
                mT__66(); 

                }
                break;
            case 33 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:202: T__67
                {
                mT__67(); 

                }
                break;
            case 34 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:208: T__68
                {
                mT__68(); 

                }
                break;
            case 35 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:214: T__69
                {
                mT__69(); 

                }
                break;
            case 36 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:220: T__70
                {
                mT__70(); 

                }
                break;
            case 37 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:226: T__71
                {
                mT__71(); 

                }
                break;
            case 38 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:232: T__72
                {
                mT__72(); 

                }
                break;
            case 39 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:238: T__73
                {
                mT__73(); 

                }
                break;
            case 40 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:244: T__74
                {
                mT__74(); 

                }
                break;
            case 41 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:250: T__75
                {
                mT__75(); 

                }
                break;
            case 42 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:256: T__76
                {
                mT__76(); 

                }
                break;
            case 43 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:262: T__77
                {
                mT__77(); 

                }
                break;
            case 44 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:268: T__78
                {
                mT__78(); 

                }
                break;
            case 45 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:274: T__79
                {
                mT__79(); 

                }
                break;
            case 46 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:280: T__80
                {
                mT__80(); 

                }
                break;
            case 47 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:286: T__81
                {
                mT__81(); 

                }
                break;
            case 48 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:292: T__82
                {
                mT__82(); 

                }
                break;
            case 49 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:298: T__83
                {
                mT__83(); 

                }
                break;
            case 50 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:304: T__84
                {
                mT__84(); 

                }
                break;
            case 51 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:310: T__85
                {
                mT__85(); 

                }
                break;
            case 52 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:316: T__86
                {
                mT__86(); 

                }
                break;
            case 53 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:322: T__87
                {
                mT__87(); 

                }
                break;
            case 54 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:328: T__88
                {
                mT__88(); 

                }
                break;
            case 55 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:334: T__89
                {
                mT__89(); 

                }
                break;
            case 56 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:340: T__90
                {
                mT__90(); 

                }
                break;
            case 57 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:346: T__91
                {
                mT__91(); 

                }
                break;
            case 58 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:352: T__92
                {
                mT__92(); 

                }
                break;
            case 59 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:358: T__93
                {
                mT__93(); 

                }
                break;
            case 60 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:364: T__94
                {
                mT__94(); 

                }
                break;
            case 61 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:370: T__95
                {
                mT__95(); 

                }
                break;
            case 62 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:376: T__96
                {
                mT__96(); 

                }
                break;
            case 63 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:382: T__97
                {
                mT__97(); 

                }
                break;
            case 64 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:388: T__98
                {
                mT__98(); 

                }
                break;
            case 65 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:394: T__99
                {
                mT__99(); 

                }
                break;
            case 66 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:400: T__100
                {
                mT__100(); 

                }
                break;
            case 67 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:407: T__101
                {
                mT__101(); 

                }
                break;
            case 68 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:414: T__102
                {
                mT__102(); 

                }
                break;
            case 69 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:421: T__103
                {
                mT__103(); 

                }
                break;
            case 70 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:428: T__104
                {
                mT__104(); 

                }
                break;
            case 71 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:435: T__105
                {
                mT__105(); 

                }
                break;
            case 72 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:442: T__106
                {
                mT__106(); 

                }
                break;
            case 73 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:449: T__107
                {
                mT__107(); 

                }
                break;
            case 74 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:456: T__108
                {
                mT__108(); 

                }
                break;
            case 75 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:463: T__109
                {
                mT__109(); 

                }
                break;
            case 76 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:470: T__110
                {
                mT__110(); 

                }
                break;
            case 77 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:477: T__111
                {
                mT__111(); 

                }
                break;
            case 78 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:484: T__112
                {
                mT__112(); 

                }
                break;
            case 79 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:491: T__113
                {
                mT__113(); 

                }
                break;
            case 80 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:498: T__114
                {
                mT__114(); 

                }
                break;
            case 81 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:505: T__115
                {
                mT__115(); 

                }
                break;
            case 82 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:512: T__116
                {
                mT__116(); 

                }
                break;
            case 83 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:519: T__117
                {
                mT__117(); 

                }
                break;
            case 84 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:526: T__118
                {
                mT__118(); 

                }
                break;
            case 85 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:533: T__119
                {
                mT__119(); 

                }
                break;
            case 86 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:540: T__120
                {
                mT__120(); 

                }
                break;
            case 87 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:547: T__121
                {
                mT__121(); 

                }
                break;
            case 88 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:554: T__122
                {
                mT__122(); 

                }
                break;
            case 89 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:561: T__123
                {
                mT__123(); 

                }
                break;
            case 90 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:568: T__124
                {
                mT__124(); 

                }
                break;
            case 91 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:575: T__125
                {
                mT__125(); 

                }
                break;
            case 92 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:582: T__126
                {
                mT__126(); 

                }
                break;
            case 93 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:589: T__127
                {
                mT__127(); 

                }
                break;
            case 94 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:596: T__128
                {
                mT__128(); 

                }
                break;
            case 95 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:603: T__129
                {
                mT__129(); 

                }
                break;
            case 96 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:610: T__130
                {
                mT__130(); 

                }
                break;
            case 97 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:617: T__131
                {
                mT__131(); 

                }
                break;
            case 98 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:624: T__132
                {
                mT__132(); 

                }
                break;
            case 99 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:631: T__133
                {
                mT__133(); 

                }
                break;
            case 100 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:638: T__134
                {
                mT__134(); 

                }
                break;
            case 101 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:645: T__135
                {
                mT__135(); 

                }
                break;
            case 102 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:652: T__136
                {
                mT__136(); 

                }
                break;
            case 103 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:659: T__137
                {
                mT__137(); 

                }
                break;
            case 104 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:666: T__138
                {
                mT__138(); 

                }
                break;
            case 105 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:673: T__139
                {
                mT__139(); 

                }
                break;
            case 106 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:680: T__140
                {
                mT__140(); 

                }
                break;
            case 107 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:687: T__141
                {
                mT__141(); 

                }
                break;
            case 108 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:694: T__142
                {
                mT__142(); 

                }
                break;
            case 109 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:701: T__143
                {
                mT__143(); 

                }
                break;
            case 110 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:708: T__144
                {
                mT__144(); 

                }
                break;
            case 111 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:715: T__145
                {
                mT__145(); 

                }
                break;
            case 112 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:722: T__146
                {
                mT__146(); 

                }
                break;
            case 113 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:729: T__147
                {
                mT__147(); 

                }
                break;
            case 114 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:736: T__148
                {
                mT__148(); 

                }
                break;
            case 115 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:743: T__149
                {
                mT__149(); 

                }
                break;
            case 116 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:750: T__150
                {
                mT__150(); 

                }
                break;
            case 117 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:757: T__151
                {
                mT__151(); 

                }
                break;
            case 118 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:764: T__152
                {
                mT__152(); 

                }
                break;
            case 119 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:771: T__153
                {
                mT__153(); 

                }
                break;
            case 120 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:778: T__154
                {
                mT__154(); 

                }
                break;
            case 121 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:785: T__155
                {
                mT__155(); 

                }
                break;
            case 122 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:792: T__156
                {
                mT__156(); 

                }
                break;
            case 123 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:799: T__157
                {
                mT__157(); 

                }
                break;
            case 124 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:806: T__158
                {
                mT__158(); 

                }
                break;
            case 125 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:813: T__159
                {
                mT__159(); 

                }
                break;
            case 126 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:820: T__160
                {
                mT__160(); 

                }
                break;
            case 127 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:827: T__161
                {
                mT__161(); 

                }
                break;
            case 128 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:834: T__162
                {
                mT__162(); 

                }
                break;
            case 129 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:841: T__163
                {
                mT__163(); 

                }
                break;
            case 130 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:848: T__164
                {
                mT__164(); 

                }
                break;
            case 131 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:855: T__165
                {
                mT__165(); 

                }
                break;
            case 132 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:862: T__166
                {
                mT__166(); 

                }
                break;
            case 133 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:869: T__167
                {
                mT__167(); 

                }
                break;
            case 134 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:876: T__168
                {
                mT__168(); 

                }
                break;
            case 135 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:883: T__169
                {
                mT__169(); 

                }
                break;
            case 136 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:890: T__170
                {
                mT__170(); 

                }
                break;
            case 137 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:897: T__171
                {
                mT__171(); 

                }
                break;
            case 138 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:904: T__172
                {
                mT__172(); 

                }
                break;
            case 139 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:911: T__173
                {
                mT__173(); 

                }
                break;
            case 140 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:918: T__174
                {
                mT__174(); 

                }
                break;
            case 141 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:925: RULE_HEADER_NAME
                {
                mRULE_HEADER_NAME(); 

                }
                break;
            case 142 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:942: RULE_KEYWORD
                {
                mRULE_KEYWORD(); 

                }
                break;
            case 143 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:955: RULE_PREPROCESSING_OP_OR_PUNC
                {
                mRULE_PREPROCESSING_OP_OR_PUNC(); 

                }
                break;
            case 144 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:985: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 145 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:993: RULE_CHARACTER_LITERAL
                {
                mRULE_CHARACTER_LITERAL(); 

                }
                break;
            case 146 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:1016: RULE_FLOATING_LITERAL
                {
                mRULE_FLOATING_LITERAL(); 

                }
                break;
            case 147 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:1038: RULE_STRING_LITERAL
                {
                mRULE_STRING_LITERAL(); 

                }
                break;
            case 148 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:1058: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 149 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:1067: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 150 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:1079: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 151 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:1095: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 152 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:1111: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 153 :
                // ../org.xtext.example.mydsl.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1:1119: RULE_ANY_OTHER
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
    protected DFA45 dfa45 = new DFA45(this);
    static final String DFA5_eotS =
        "\36\uffff\1\107\76\uffff\1\151\14\uffff\1\163\11\uffff\1\166\4\uffff";
    static final String DFA5_eofS =
        "\171\uffff";
    static final String DFA5_minS =
        "\1\141\1\154\1\157\1\141\1\145\1\154\1\141\1\uffff\1\146\2\uffff"+
        "\1\141\1\uffff\1\162\1\145\1\150\1\145\1\156\1\151\1\143\1\151\4"+
        "\uffff\1\163\1\141\1\uffff\1\156\1\143\1\165\3\uffff\1\160\5\uffff"+
        "\1\154\4\uffff\1\151\1\uffff\1\147\1\uffff\1\147\1\141\2\uffff\1"+
        "\151\1\165\1\160\1\151\5\uffff\1\147\2\uffff\1\162\1\163\5\uffff"+
        "\1\154\12\uffff\1\164\2\uffff\1\145\2\uffff\1\145\2\uffff\1\156"+
        "\1\61\1\164\3\uffff\1\151\2\uffff\1\144\1\141\3\uffff\1\137\1\143"+
        "\10\uffff\1\137\1\141\3\uffff";
    static final String DFA5_maxS =
        "\1\167\1\165\1\162\1\157\1\171\1\170\1\162\1\uffff\1\156\2\uffff"+
        "\1\165\1\uffff\1\165\1\145\1\167\1\171\1\163\1\157\1\150\1\151\4"+
        "\uffff\1\164\1\141\1\uffff\1\156\1\154\1\165\3\uffff\1\164\5\uffff"+
        "\1\164\4\uffff\1\157\1\uffff\1\164\1\uffff\1\172\1\162\2\uffff\1"+
        "\162\1\171\1\160\1\163\5\uffff\1\147\2\uffff\1\162\1\164\5\uffff"+
        "\1\157\12\uffff\1\164\2\uffff\1\157\2\uffff\1\145\2\uffff\1\156"+
        "\1\63\1\164\3\uffff\1\151\2\uffff\1\156\1\157\3\uffff\1\145\1\143"+
        "\10\uffff\1\137\1\143\3\uffff";
    static final String DFA5_acceptS =
        "\7\uffff\1\40\1\uffff\1\44\1\45\1\uffff\1\52\10\uffff\1\3\1\4\1"+
        "\5\1\6\2\uffff\1\14\3\uffff\1\26\1\27\1\30\1\uffff\1\34\1\35\1\36"+
        "\1\37\1\41\1\uffff\1\46\1\47\1\50\1\51\1\uffff\1\55\1\uffff\1\61"+
        "\2\uffff\1\70\1\71\4\uffff\1\104\1\105\1\106\1\107\1\110\1\uffff"+
        "\1\7\1\10\2\uffff\1\21\1\22\1\23\1\25\1\24\1\uffff\1\33\1\42\1\43"+
        "\1\53\1\54\1\56\1\57\1\60\1\62\1\63\1\uffff\1\67\1\72\1\uffff\1"+
        "\75\1\76\1\uffff\1\102\1\103\3\uffff\1\20\1\31\1\32\1\uffff\1\73"+
        "\1\74\2\uffff\1\12\1\13\1\11\2\uffff\1\77\1\100\1\101\1\1\1\2\1"+
        "\16\1\17\1\15\2\uffff\1\64\1\65\1\66";
    static final String DFA5_specialS =
        "\171\uffff}>";
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
            "",
            "",
            "",
            "\1\134",
            "",
            "",
            "\1\135",
            "\1\136\1\137",
            "",
            "",
            "",
            "",
            "",
            "\1\140\2\uffff\1\141",
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
            "\1\142",
            "",
            "",
            "\1\143\11\uffff\1\144",
            "",
            "",
            "\1\145",
            "",
            "",
            "\1\146",
            "\1\147\1\uffff\1\150",
            "\1\152",
            "",
            "",
            "",
            "\1\153",
            "",
            "",
            "\1\154\4\uffff\1\155\4\uffff\1\156",
            "\1\157\15\uffff\1\160",
            "",
            "",
            "",
            "\1\162\5\uffff\1\161",
            "\1\164",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\165",
            "\1\167\1\uffff\1\170",
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
            return "19723:16: ( 'alignas' | 'alignof' | 'asm' | 'auto' | 'bool' | 'break' | 'case' | 'catch' | 'char' | 'char16_t' | 'char32_t' | 'class' | 'const' | 'constexpr' | 'const_cast' | 'continue' | 'decltype' | 'default' | 'delete' | 'do' | 'double' | 'dynamic_cast' | 'else' | 'enum' | 'explicit' | 'export' | 'extern' | 'false' | 'float' | 'for' | 'friend' | 'goto' | 'if' | 'inline' | 'int' | 'long' | 'mutable' | 'namespace' | 'new' | 'noexcept' | 'nullptr' | 'operator' | 'private' | 'protected' | 'public' | 'register' | 'reinterpret_cast' | 'return' | 'short' | 'signed' | 'sizeof' | 'static' | 'static_assert' | 'static_cast' | 'struct' | 'switch' | 'template' | 'this' | 'thread_local' | 'throw' | 'true' | 'try' | 'typedef' | 'typeid' | 'typename' | 'union' | 'unsigned' | 'using' | 'virtual' | 'volatile' | 'wchar_t' | 'while' )";
        }
    }
    static final String DFA6_eotS =
        "\5\uffff\1\42\2\uffff\1\47\1\52\1\56\1\uffff\1\61\3\uffff\1\66\1"+
        "\72\1\74\1\76\1\100\1\103\1\106\1\uffff\1\110\1\112\1\115\12\uffff"+
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
        "\1\uffff\1\1\1\2\1\3\1\4\1\uffff\1\7\1\10\3\uffff\1\17\2\uffff\1"+
        "\23\1\24\7\uffff\1\40\3\uffff\1\71\2\uffff\1\100\2\uffff\1\6\1\5"+
        "\1\11\1\13\1\uffff\1\63\1\43\1\12\1\25\1\20\1\14\1\uffff\1\51\1"+
        "\34\1\21\1\27\1\26\1\22\1\uffff\1\45\1\67\1\30\1\46\1\70\1\uffff"+
        "\1\31\1\47\1\32\1\50\1\33\1\52\1\35\1\53\1\65\1\36\1\54\1\66\1\37"+
        "\1\62\1\41\1\61\1\42\1\uffff\1\64\1\44\4\uffff\1\57\1\55\1\16\1"+
        "\15\1\uffff\1\72\1\73\1\60\1\56\2\uffff\1\104\1\103\1\uffff\1\102"+
        "\1\101\1\75\1\74\1\76\1\77\1\106\1\105";
    static final String DFA6_specialS =
        "\150\uffff}>";
    static final String[] DFA6_transitionS = {
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
            return "19725:33: ( '{' | '}' | '[' | ']' | '#' | '##' | '(' | ')' | '<:' | ':>' | '<%' | '%>' | '%:' | '%:%:' | ';' | ':' | '...' | 'new' | 'delete' | '?' | '::' | '.' | '.*' | '+' | '-' | '*' | '/' | '%' | '^' | '&' | '|' | '~' | '!' | '=' | '<' | '>' | '+=' | '-=' | '*=' | '/=' | '%=' | '^=' | '&=' | '|=' | '<<' | '>>' | '<<=' | '>>=' | '==' | '!=' | '<=' | '>=' | '&&' | '||' | '++' | '--' | ',' | '->*' | '->' | 'and' | 'and_eq' | 'bitand' | 'bitor' | 'compl' | 'not' | 'not_eq' | 'or' | 'or_eq' | 'xor' | 'xor_eq' )";
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
            return "19755:25: ( RULE_FRACTIONAL_CONSTANT ( RULE_EXPONENT_PART )? | ( '0' .. '9' )+ RULE_EXPONENT_PART )";
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
            return "19757:37: ( ( '0' .. '9' )* '.' ( '0' .. '9' )+ | ( '0' .. '9' )+ '.' )";
        }
    }
    static final String DFA45_eotS =
        "\1\uffff\1\100\1\110\1\112\6\100\1\126\1\131\17\100\1\u0085\1\107"+
        "\3\100\1\u0093\1\u0097\1\u009b\1\u009d\1\u009f\1\u00a2\1\uffff\1"+
        "\u00a5\1\u00a7\1\u00aa\1\u00ae\1\uffff\1\u00b1\5\uffff\1\100\1\u00b8"+
        "\1\u00ba\1\uffff\2\100\1\75\1\uffff\1\75\1\u00c3\2\uffff\2\100\13"+
        "\uffff\10\100\7\uffff\27\100\1\u00f8\13\100\1\u0105\6\100\4\uffff"+
        "\2\100\1\107\6\100\5\uffff\1\u0120\21\uffff\1\u0129\3\uffff\1\u012c"+
        "\12\uffff\1\100\1\uffff\1\u00c3\6\uffff\1\100\4\uffff\2\100\4\uffff"+
        "\1\u0142\10\100\3\uffff\4\100\1\u0150\1\100\1\u0152\31\100\1\u0170"+
        "\1\uffff\14\100\1\uffff\5\100\1\u0183\1\100\1\107\2\uffff\3\100"+
        "\1\u018a\3\100\1\107\3\100\23\uffff\1\100\11\uffff\1\107\3\uffff"+
        "\1\u019d\1\100\5\uffff\15\100\1\uffff\1\u01ac\1\uffff\3\100\1\u01b2"+
        "\4\100\1\u01b9\1\100\1\u01bb\16\100\1\u01ca\1\u01cb\2\100\1\uffff"+
        "\4\100\1\u01d2\3\100\1\u01d6\10\100\1\u01df\1\uffff\2\100\1\uffff"+
        "\3\100\1\uffff\7\100\3\uffff\1\u01ec\5\uffff\1\100\2\uffff\12\100"+
        "\1\u01fe\1\100\1\u0200\1\u0201\1\uffff\4\100\1\u0206\1\uffff\1\100"+
        "\1\u020a\1\100\1\107\2\100\1\uffff\1\u020e\1\uffff\1\u020f\6\100"+
        "\1\u0216\6\100\2\uffff\5\100\1\u0222\1\uffff\1\u0223\1\100\1\107"+
        "\1\uffff\1\100\1\u0226\1\u0227\5\100\1\uffff\4\100\1\107\7\100\6"+
        "\uffff\1\100\1\uffff\12\100\1\uffff\1\u024a\2\uffff\2\100\1\u01b2"+
        "\1\100\1\uffff\3\100\1\uffff\3\100\2\uffff\1\100\1\u0255\1\100\1"+
        "\u0258\1\u0259\1\u025a\1\uffff\1\u025b\1\u01b2\1\u025c\1\u025d\1"+
        "\100\1\u01b2\1\100\1\u0260\3\100\2\uffff\1\107\1\100\2\uffff\1\u0265"+
        "\1\u0266\5\100\1\107\5\100\1\107\2\100\1\u0273\5\uffff\1\107\1\uffff"+
        "\12\100\1\uffff\1\u0284\11\100\1\uffff\2\100\6\uffff\1\100\1\u0292"+
        "\1\uffff\1\u0293\1\100\1\u0295\1\100\2\uffff\1\u0297\2\100\2\u01b2"+
        "\3\100\1\u029d\1\100\1\u029f\1\100\7\uffff\12\100\1\uffff\1\u02b0"+
        "\1\100\1\u02b2\2\100\1\u02b5\1\u02b6\1\u02b7\1\u02b8\3\100\1\u02bc"+
        "\2\uffff\1\u02bd\1\uffff\1\u02be\1\uffff\1\u02bf\1\100\1\u02c1\1"+
        "\u02c2\1\100\1\uffff\1\u02c4\1\uffff\1\100\4\uffff\13\100\1\uffff"+
        "\1\100\1\uffff\1\u02d4\1\100\4\uffff\3\100\4\uffff\1\100\2\uffff"+
        "\1\u02da\1\uffff\1\u02db\2\uffff\1\u02de\1\u02df\12\100\1\uffff"+
        "\1\u01b2\4\100\6\uffff\2\100\1\u02f2\11\100\1\u01b2\1\100\2\uffff"+
        "\2\100\1\uffff\2\100\1\u0306\3\100\1\u030a\2\100\1\u01b2\5\uffff"+
        "\4\100\1\uffff\2\100\1\u0314\1\uffff\1\100\1\u0316\1\uffff\6\100"+
        "\1\uffff\1\100\2\uffff\3\100\1\u0323\3\100\1\uffff\3\100\1\uffff"+
        "\2\100\1\u01b2\1\uffff\5\100\1\uffff\2\100\1\u0335\4\100\1\uffff"+
        "\1\u033a\3\100\1\uffff\1\u033e\1\100\1\u0340\1\uffff\1\u0341\2\uffff";
    static final String DFA45_eofS =
        "\u0342\uffff";
    static final String DFA45_minS =
        "\1\0\1\117\1\43\1\51\1\170\1\157\1\144\1\145\1\163\1\42\1\75\1\46"+
        "\1\141\1\145\1\141\1\145\1\150\1\154\1\165\1\146\1\151\1\143\1\151"+
        "\1\157\1\42\1\145\1\154\1\72\1\56\1\160\1\141\1\162\1\53\1\55\1"+
        "\52\1\72\2\75\1\uffff\2\75\1\45\1\75\1\uffff\1\135\5\uffff\1\157"+
        "\1\56\1\0\1\uffff\1\157\1\42\1\125\1\uffff\1\0\1\56\2\uffff\1\104"+
        "\1\160\1\uffff\1\154\1\146\10\uffff\1\160\1\121\1\156\1\157\1\105"+
        "\2\163\1\161\7\uffff\1\154\1\151\1\157\1\156\1\162\1\165\1\160\1"+
        "\151\2\155\2\141\1\163\1\147\1\141\1\157\1\147\1\151\1\160\1\165"+
        "\1\163\1\164\1\154\1\60\1\162\1\154\1\150\1\151\1\157\1\145\1\164"+
        "\1\156\2\151\1\42\1\60\1\143\1\156\1\164\1\155\1\151\1\144\2\uffff"+
        "\1\56\1\uffff\2\145\1\60\1\167\1\155\1\154\1\145\1\151\1\142\5\uffff"+
        "\1\52\21\uffff\1\75\3\uffff\1\75\12\uffff\1\164\1\uffff\1\56\1\uffff"+
        "\1\42\1\0\1\uffff\2\0\1\162\1\42\1\0\2\uffff\1\117\1\145\1\uffff"+
        "\1\151\2\uffff\1\144\1\154\1\165\1\163\1\162\1\170\1\164\1\151\1"+
        "\165\3\uffff\1\163\1\145\2\141\1\60\1\145\1\60\2\145\1\163\1\160"+
        "\1\163\1\160\1\162\1\163\1\145\1\143\1\151\1\165\1\156\1\164\1\151"+
        "\1\162\1\156\1\145\1\164\1\145\1\154\1\155\1\145\1\141\1\151\1\60"+
        "\1\uffff\1\164\2\141\2\154\2\141\1\147\1\151\1\157\1\156\1\142\1"+
        "\uffff\1\145\1\141\1\154\1\141\1\157\1\60\1\147\1\60\2\uffff\2\162"+
        "\1\145\1\60\1\145\1\154\1\170\1\60\1\166\1\164\1\154\23\uffff\1"+
        "\157\2\0\1\60\1\uffff\1\42\2\0\1\42\1\uffff\1\60\2\0\1\uffff\1\60"+
        "\1\111\5\uffff\1\145\1\151\1\141\1\164\1\111\1\160\1\145\1\147\1"+
        "\141\1\145\1\156\1\164\1\154\1\uffff\1\60\1\uffff\1\144\1\141\1"+
        "\167\1\60\1\154\1\164\1\151\1\154\1\60\1\163\1\60\1\150\1\163\1"+
        "\162\1\164\1\151\1\143\1\156\1\164\1\145\1\157\1\143\1\162\1\151"+
        "\1\162\2\60\1\142\1\156\1\uffff\1\165\1\164\1\162\1\145\1\60\1\153"+
        "\1\156\1\162\1\60\1\147\1\156\1\147\1\154\1\164\1\165\1\164\1\155"+
        "\1\60\1\uffff\1\156\1\145\1\uffff\1\162\1\141\1\161\1\uffff\1\163"+
        "\1\160\1\143\1\145\1\141\1\145\1\151\3\uffff\1\60\1\0\1\60\1\0\1"+
        "\60\1\0\1\145\1\0\1\uffff\1\144\1\163\1\143\1\154\1\141\1\156\1"+
        "\162\1\144\1\156\1\154\1\60\1\144\2\60\1\uffff\1\145\1\141\2\144"+
        "\1\60\1\uffff\1\141\1\60\1\156\1\60\1\66\1\62\1\uffff\1\60\1\uffff"+
        "\1\60\1\164\1\156\1\145\1\143\1\164\1\147\1\60\1\144\1\146\1\150"+
        "\1\156\1\143\1\164\2\uffff\1\154\1\145\1\141\1\151\1\137\1\60\1"+
        "\uffff\1\60\1\144\1\60\1\uffff\1\156\2\60\2\145\1\154\1\171\1\151"+
        "\1\uffff\1\141\1\161\1\151\1\164\1\60\1\160\1\164\1\145\1\161\1"+
        "\164\2\143\1\uffff\1\0\1\60\1\0\1\60\1\0\1\161\1\0\1\114\1\163\2"+
        "\151\1\156\1\151\1\145\1\116\1\155\1\151\1\uffff\1\60\2\uffff\1"+
        "\146\1\155\1\60\1\137\1\uffff\1\164\1\170\1\143\1\uffff\1\165\2"+
        "\137\2\uffff\1\145\1\60\1\162\3\60\1\uffff\4\60\1\151\1\60\1\145"+
        "\1\60\2\154\1\164\2\uffff\1\60\1\145\2\uffff\2\60\1\164\1\160\1"+
        "\143\1\163\1\146\1\60\1\144\1\157\1\141\1\162\1\160\1\60\1\145\1"+
        "\164\1\60\1\0\1\60\1\0\1\60\1\0\1\60\1\0\2\151\1\164\1\146\2\164"+
        "\1\163\1\141\1\145\1\146\1\uffff\1\60\1\145\1\154\1\145\1\160\1"+
        "\141\1\145\2\164\1\162\1\uffff\1\160\1\141\6\uffff\1\164\1\60\1"+
        "\uffff\1\60\1\145\1\60\1\144\2\uffff\1\60\1\145\1\137\2\60\1\145"+
        "\1\162\1\143\1\60\1\164\1\60\1\145\1\uffff\1\0\1\60\1\0\1\60\2\0"+
        "\1\163\1\157\1\111\1\151\1\105\1\151\1\163\1\155\1\156\1\151\1\uffff"+
        "\1\60\1\157\1\60\1\162\1\163\4\60\1\162\1\163\1\141\1\60\2\uffff"+
        "\1\60\1\uffff\1\60\1\uffff\1\60\1\143\2\60\1\145\1\uffff\1\60\1"+
        "\uffff\1\144\1\60\1\0\1\60\1\0\1\164\1\156\1\160\1\156\1\145\1\170"+
        "\1\141\1\151\1\145\1\164\1\145\1\uffff\1\143\1\uffff\1\60\1\164"+
        "\4\uffff\1\145\2\163\4\uffff\1\141\2\uffff\1\60\1\uffff\5\60\1\145"+
        "\1\163\1\162\1\160\1\154\1\157\1\123\1\105\1\144\1\141\1\uffff\1"+
        "\60\1\164\1\145\1\164\1\163\2\uffff\2\60\2\uffff\1\143\1\164\1\60"+
        "\1\162\1\151\1\156\1\160\1\170\1\111\1\154\1\137\1\162\1\60\1\164"+
        "\1\0\1\60\1\151\1\141\1\uffff\1\145\1\172\1\60\1\145\1\160\1\144"+
        "\1\60\1\143\1\164\1\60\1\uffff\1\0\1\42\2\0\1\141\1\156\1\163\1"+
        "\145\1\uffff\1\143\1\162\1\60\1\uffff\1\141\2\60\1\154\1\164\1\163"+
        "\1\162\1\151\1\145\1\uffff\1\163\1\uffff\1\60\3\151\1\60\1\146\1"+
        "\163\1\164\1\60\1\172\1\141\1\157\1\uffff\1\151\1\163\2\60\1\141"+
        "\1\164\1\156\1\145\1\151\1\0\1\164\1\151\1\60\1\162\1\157\1\151"+
        "\1\157\1\uffff\1\60\1\156\1\157\1\156\1\uffff\1\60\1\156\1\60\1"+
        "\uffff\1\60\2\uffff";
    static final String DFA45_maxS =
        "\1\uffff\1\171\1\165\1\51\1\170\1\166\1\144\1\145\1\163\1\156\2"+
        "\75\1\162\1\171\1\157\1\145\1\167\1\170\1\165\1\156\1\157\1\150"+
        "\1\162\1\157\1\163\1\171\1\165\1\76\1\71\1\166\2\165\1\75\1\76\1"+
        "\75\1\76\1\75\1\174\1\uffff\2\75\1\172\1\76\1\uffff\1\135\5\uffff"+
        "\1\157\1\145\1\uffff\1\uffff\1\157\1\47\1\165\1\uffff\1\uffff\1"+
        "\145\2\uffff\1\104\1\160\1\uffff\1\162\1\156\10\uffff\1\160\1\121"+
        "\1\156\1\157\1\105\2\163\1\161\7\uffff\1\154\1\151\1\157\1\156\1"+
        "\162\1\171\1\160\1\162\1\155\1\156\2\141\2\164\1\162\1\157\1\172"+
        "\1\151\1\164\1\165\1\163\2\164\1\172\1\162\1\154\1\150\1\151\1\157"+
        "\1\145\1\164\1\156\1\163\1\151\1\42\1\172\1\154\1\156\1\164\1\155"+
        "\1\151\1\144\2\uffff\1\56\1\uffff\2\145\1\172\1\167\1\155\1\154"+
        "\1\164\1\157\1\142\5\uffff\1\52\21\uffff\1\75\3\uffff\1\75\12\uffff"+
        "\1\164\1\uffff\1\145\1\uffff\1\170\1\uffff\1\uffff\2\uffff\1\162"+
        "\1\170\1\uffff\2\uffff\1\117\1\145\1\uffff\1\163\2\uffff\1\156\1"+
        "\162\1\165\1\163\1\162\1\170\1\164\1\151\1\165\3\uffff\1\163\1\145"+
        "\2\141\1\172\1\145\1\172\1\145\1\157\1\163\1\160\1\164\1\160\1\162"+
        "\1\163\1\145\1\143\1\151\1\165\1\156\1\164\1\165\1\162\1\156\1\145"+
        "\1\164\1\145\1\157\1\155\1\145\1\141\1\151\1\172\1\uffff\1\164\2"+
        "\141\2\154\1\141\1\157\1\147\1\151\1\157\1\156\1\142\1\uffff\1\145"+
        "\1\141\1\154\1\141\1\157\1\172\1\147\1\172\2\uffff\2\162\1\145\1"+
        "\172\1\145\1\154\1\170\1\172\1\166\1\164\1\154\23\uffff\1\157\2"+
        "\uffff\1\106\1\uffff\1\170\2\uffff\1\170\1\uffff\1\172\2\uffff\1"+
        "\uffff\1\172\1\111\5\uffff\1\145\1\151\1\141\1\164\1\111\1\160\1"+
        "\145\1\147\1\141\1\145\1\156\1\164\1\154\1\uffff\1\172\1\uffff\1"+
        "\156\1\141\1\167\1\172\1\154\1\164\1\151\1\154\1\172\1\163\1\172"+
        "\1\150\1\163\1\162\1\164\1\151\1\143\1\156\1\164\1\145\1\157\1\143"+
        "\1\162\1\151\1\162\2\172\1\142\1\156\1\uffff\1\165\1\164\1\162\1"+
        "\145\1\172\1\153\1\156\1\162\1\172\1\147\1\156\1\147\1\154\1\164"+
        "\1\165\1\164\1\155\1\172\1\uffff\1\156\1\145\1\uffff\1\162\1\141"+
        "\1\161\1\uffff\1\163\1\160\1\143\1\145\1\141\1\145\1\151\3\uffff"+
        "\1\172\1\uffff\1\106\1\uffff\1\106\1\uffff\1\145\1\uffff\1\uffff"+
        "\1\144\1\163\1\143\1\154\1\141\1\156\1\162\1\144\1\156\1\154\1\172"+
        "\1\144\2\172\1\uffff\1\145\1\141\2\144\1\172\1\uffff\1\141\1\172"+
        "\1\156\1\172\1\66\1\62\1\uffff\1\172\1\uffff\1\172\1\164\1\156\1"+
        "\145\1\143\1\164\1\147\1\172\1\144\1\146\1\150\1\156\1\143\1\164"+
        "\2\uffff\1\154\1\145\1\141\1\151\1\137\1\172\1\uffff\1\172\1\144"+
        "\1\172\1\uffff\1\156\2\172\2\145\1\154\1\171\1\151\1\uffff\1\157"+
        "\1\161\1\151\1\164\1\172\1\160\1\164\1\145\1\161\1\164\2\143\1\uffff"+
        "\1\uffff\1\106\1\uffff\1\106\1\uffff\1\161\1\uffff\1\114\1\163\2"+
        "\151\1\156\1\151\1\145\1\116\1\155\1\151\1\uffff\1\172\2\uffff\1"+
        "\146\1\155\1\172\1\137\1\uffff\1\164\1\170\1\143\1\uffff\1\165\2"+
        "\137\2\uffff\1\145\1\172\1\162\3\172\1\uffff\4\172\1\151\1\172\1"+
        "\145\1\172\2\154\1\164\2\uffff\1\172\1\145\2\uffff\2\172\1\164\1"+
        "\160\1\143\1\163\1\146\1\172\1\144\1\157\1\141\1\162\1\160\1\172"+
        "\1\145\1\164\1\172\1\uffff\1\106\1\uffff\1\106\1\uffff\1\172\1\uffff"+
        "\2\151\1\164\1\146\2\164\1\163\1\141\1\145\1\146\1\uffff\1\172\1"+
        "\145\1\154\1\145\1\160\1\141\1\145\2\164\1\162\1\uffff\1\160\1\143"+
        "\6\uffff\1\164\1\172\1\uffff\1\172\1\145\1\172\1\144\2\uffff\1\172"+
        "\1\145\1\137\2\172\1\145\1\162\1\143\1\172\1\164\1\172\1\145\1\uffff"+
        "\1\uffff\1\106\1\uffff\1\106\2\uffff\1\163\1\157\1\123\1\151\1\105"+
        "\1\151\1\163\1\155\1\156\1\151\1\uffff\1\172\1\157\1\172\1\162\1"+
        "\163\4\172\1\162\1\163\1\141\1\172\2\uffff\1\172\1\uffff\1\172\1"+
        "\uffff\1\172\1\143\2\172\1\145\1\uffff\1\172\1\uffff\1\144\1\106"+
        "\1\uffff\1\106\1\uffff\1\164\1\156\1\160\1\156\1\145\1\170\1\141"+
        "\1\151\1\145\1\164\1\145\1\uffff\1\143\1\uffff\1\172\1\164\4\uffff"+
        "\1\145\2\163\4\uffff\1\141\2\uffff\1\172\1\uffff\1\172\2\106\2\172"+
        "\1\145\1\163\1\162\1\160\1\154\1\157\1\123\1\105\1\144\1\141\1\uffff"+
        "\1\172\1\164\1\145\1\164\1\163\2\uffff\2\106\2\uffff\1\143\1\164"+
        "\1\172\1\162\1\151\1\156\1\160\1\170\1\111\1\154\1\137\1\162\1\172"+
        "\1\164\1\uffff\1\106\1\151\1\141\1\uffff\1\145\2\172\1\145\1\160"+
        "\1\144\1\172\1\143\1\164\1\172\1\uffff\1\uffff\1\170\2\uffff\1\141"+
        "\1\156\1\163\1\145\1\uffff\1\143\1\162\1\172\1\uffff\1\141\1\172"+
        "\1\106\1\154\1\164\1\163\1\162\1\151\1\145\1\uffff\1\163\1\uffff"+
        "\1\106\3\151\1\172\1\146\1\163\1\164\1\106\1\172\1\141\1\157\1\uffff"+
        "\1\151\1\163\1\172\1\106\1\141\1\164\1\156\1\145\1\151\1\uffff\1"+
        "\164\1\151\1\172\1\162\1\157\1\151\1\157\1\uffff\1\172\1\156\1\157"+
        "\1\156\1\uffff\1\172\1\156\1\172\1\uffff\1\172\2\uffff";
    static final String DFA45_acceptS =
        "\46\uffff\1\102\4\uffff\1\132\1\uffff\1\141\1\142\1\147\1\160\1"+
        "\161\3\uffff\1\u008f\3\uffff\1\u0090\2\uffff\1\u0098\1\u0099\2\uffff"+
        "\1\u0090\2\uffff\1\146\1\150\1\151\1\153\1\u008f\1\17\1\135\1\3"+
        "\10\uffff\1\u0091\1\u0093\1\111\1\20\1\60\1\115\1\21\52\uffff\1"+
        "\55\1\164\1\uffff\1\u0092\11\uffff\1\107\1\130\1\74\1\110\1\131"+
        "\1\uffff\1\75\1\112\1\u0096\1\u0097\1\76\1\113\1\77\1\114\1\100"+
        "\1\116\1\127\1\101\1\102\1\124\1\103\1\123\1\104\1\uffff\1\125\1"+
        "\105\1\u008d\1\uffff\1\126\1\106\1\132\1\136\1\157\1\141\1\142\1"+
        "\147\1\160\1\161\1\uffff\1\u0085\1\uffff\1\u0087\2\uffff\1\u0095"+
        "\5\uffff\1\u0094\1\u0098\2\uffff\1\2\1\uffff\1\152\1\145\11\uffff"+
        "\1\111\1\60\1\115\41\uffff\1\167\14\uffff\1\173\10\uffff\1\55\1"+
        "\61\13\uffff\1\107\1\130\1\110\1\131\1\133\1\134\1\112\1\113\1\114"+
        "\1\116\1\127\1\124\1\123\1\122\1\117\1\125\1\121\1\120\1\126\4\uffff"+
        "\1\u008d\4\uffff\1\u0093\3\uffff\1\u0091\2\uffff\1\143\1\144\1\155"+
        "\1\156\1\154\15\uffff\1\174\1\uffff\1\u0088\35\uffff\1\45\22\uffff"+
        "\1\u0084\2\uffff\1\61\3\uffff\1\67\7\uffff\1\133\1\122\1\121\10"+
        "\uffff\1\1\16\uffff\1\23\5\uffff\1\u008e\6\uffff\1\37\1\uffff\1"+
        "\165\16\uffff\1\54\1\170\6\uffff\1\43\3\uffff\1\46\10\uffff\1\53"+
        "\14\uffff\1\177\21\uffff\1\22\1\uffff\1\51\1\62\4\uffff\1\u008a"+
        "\3\uffff\1\56\3\uffff\1\63\1\u0089\6\uffff\1\44\13\uffff\1\172\1"+
        "\175\2\uffff\1\65\1\u0080\42\uffff\1\24\12\uffff\1\162\2\uffff\1"+
        "\30\1\64\1\u008c\1\47\1\171\1\32\2\uffff\1\34\4\uffff\1\52\1\73"+
        "\14\uffff\1\72\20\uffff\1\25\15\uffff\1\33\1\35\1\uffff\1\42\1\uffff"+
        "\1\166\5\uffff\1\163\1\uffff\1\70\20\uffff\1\137\1\uffff\1\u0082"+
        "\2\uffff\1\176\1\40\1\41\1\27\3\uffff\1\36\1\57\1\50\1\u0083\1\uffff"+
        "\1\66\1\u0086\1\uffff\1\u008b\17\uffff\1\26\5\uffff\1\140\1\71\2"+
        "\uffff\1\15\1\4\22\uffff\1\7\12\uffff\1\u008d\10\uffff\1\11\3\uffff"+
        "\1\31\11\uffff\1\16\1\uffff\1\u0081\14\uffff\1\14\21\uffff\1\10"+
        "\4\uffff\1\12\3\uffff\1\13\1\uffff\1\6\1\5";
    static final String DFA45_specialS =
        "\1\42\63\uffff\1\10\5\uffff\1\41\u0081\uffff\1\43\1\uffff\1\34\1"+
        "\13\2\uffff\1\37\154\uffff\1\12\1\23\3\uffff\1\17\1\14\3\uffff\1"+
        "\33\1\15\133\uffff\1\4\1\uffff\1\24\1\uffff\1\22\1\uffff\1\30\120"+
        "\uffff\1\0\1\uffff\1\5\1\uffff\1\40\1\uffff\1\32\105\uffff\1\2\1"+
        "\uffff\1\1\1\uffff\1\35\1\uffff\1\31\64\uffff\1\21\1\uffff\1\3\1"+
        "\uffff\1\36\1\6\50\uffff\1\11\1\uffff\1\16\111\uffff\1\27\17\uffff"+
        "\1\7\1\uffff\1\20\1\26\53\uffff\1\25\24\uffff}>";
    static final String[] DFA45_transitionS = {
            "\11\75\2\74\2\75\1\74\22\75\1\74\1\47\1\64\1\2\1\75\1\43\1\13"+
            "\1\72\1\3\1\57\1\12\1\40\1\53\1\41\1\34\1\42\1\63\11\73\1\33"+
            "\1\61\1\51\1\50\1\52\1\65\1\75\1\10\1\71\1\5\1\71\1\4\3\71\1"+
            "\6\2\71\1\67\1\71\1\7\5\71\1\1\1\11\5\71\1\54\1\70\1\60\1\44"+
            "\1\71\1\75\1\32\1\26\1\16\1\31\1\21\1\14\1\62\1\71\1\23\2\71"+
            "\1\27\1\22\1\36\1\35\1\37\1\71\1\17\1\20\1\15\1\30\1\24\1\25"+
            "\1\66\2\71\1\55\1\45\1\56\1\46\uff81\75",
            "\1\76\51\uffff\1\77",
            "\1\107\100\uffff\1\103\1\101\3\uffff\1\102\2\uffff\1\105\3"+
            "\uffff\1\106\4\uffff\1\104",
            "\1\111",
            "\1\113",
            "\1\115\4\uffff\1\116\1\uffff\1\114",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\124\4\uffff\1\123\106\uffff\1\122",
            "\1\125",
            "\1\127\26\uffff\1\130",
            "\1\132\7\uffff\1\135\2\uffff\1\134\2\uffff\1\136\2\uffff\1"+
            "\133",
            "\1\142\2\uffff\1\141\11\uffff\1\137\6\uffff\1\140",
            "\1\146\6\uffff\1\144\3\uffff\1\145\2\uffff\1\143",
            "\1\147",
            "\1\151\1\152\12\uffff\1\150\2\uffff\1\153",
            "\1\156\1\uffff\1\155\11\uffff\1\154",
            "\1\157",
            "\1\161\7\uffff\1\160",
            "\1\162\5\uffff\1\163",
            "\1\164\4\uffff\1\165",
            "\1\170\5\uffff\1\166\2\uffff\1\167",
            "\1\171",
            "\1\124\4\uffff\1\123\20\uffff\1\174\65\uffff\1\172\4\uffff"+
            "\1\173",
            "\1\176\11\uffff\1\175\11\uffff\1\177",
            "\1\u0082\1\uffff\1\u0083\4\uffff\1\u0081\1\uffff\1\u0080",
            "\1\u0084\3\uffff\1\107",
            "\1\u0086\1\uffff\12\u0087",
            "\1\u0089\1\uffff\1\u008a\3\uffff\1\u0088",
            "\1\u008c\3\uffff\1\u008b\11\uffff\1\u008e\5\uffff\1\u008d",
            "\1\u008f\2\uffff\1\u0090",
            "\1\u0092\21\uffff\1\u0091",
            "\1\u0095\17\uffff\1\u0094\1\u0096",
            "\1\u0099\4\uffff\1\u009a\15\uffff\1\u0098",
            "\1\107\2\uffff\1\u009c\1\107",
            "\1\u009e",
            "\1\u00a0\76\uffff\1\u00a1",
            "",
            "\1\u00a4",
            "\1\u00a6",
            "\1\107\10\uffff\1\u00ab\13\uffff\1\107\1\uffff\1\u00a8\1\u00a9"+
            "\3\uffff\32\u00ab\1\uffff\1\u00ab\2\uffff\1\u00ab\1\uffff\32"+
            "\u00ab",
            "\1\u00ad\1\u00ac",
            "",
            "\1\u00b0",
            "",
            "",
            "",
            "",
            "",
            "\1\u00b7",
            "\1\u0087\1\uffff\12\u00b9\13\uffff\1\u0087\37\uffff\1\u0087",
            "\12\u00bf\1\u00bd\27\u00bf\1\u00bd\13\u00bf\1\u00be\22\u00bf"+
            "\32\u00bc\1\u00bf\1\u00bb\2\u00bf\1\u00bc\1\u00bf\32\u00bc\uff85"+
            "\u00bf",
            "",
            "\1\u00c0",
            "\1\124\4\uffff\1\123",
            "\1\100\37\uffff\1\100",
            "",
            "\12\u00c2\1\u00bd\34\u00c2\1\u00bd\64\u00c2\1\u00c1\uffa3\u00c2",
            "\1\u0087\1\uffff\12\u00b9\13\uffff\1\u0087\37\uffff\1\u0087",
            "",
            "",
            "\1\u00c5",
            "\1\u00c6",
            "",
            "\1\u00c8\1\uffff\1\u00c7\3\uffff\1\u00c9",
            "\1\u00cb\7\uffff\1\u00ca",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00cc",
            "\1\u00cd",
            "\1\u00ce",
            "\1\u00cf",
            "\1\u00d0",
            "\1\u00d1",
            "\1\u00d2",
            "\1\u00d3",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00d7",
            "\1\u00d8",
            "\1\u00d9",
            "\1\u00da",
            "\1\u00db",
            "\1\u00dc\3\uffff\1\u00dd",
            "\1\u00de",
            "\1\u00e0\10\uffff\1\u00df",
            "\1\u00e1",
            "\1\u00e3\1\u00e2",
            "\1\u00e4",
            "\1\u00e5",
            "\1\u00e6\1\u00e7",
            "\1\u00e8\1\uffff\1\u00ea\12\uffff\1\u00e9",
            "\1\u00eb\20\uffff\1\u00ec",
            "\1\u00ed",
            "\1\u00ee\22\uffff\1\u00ef",
            "\1\u00f0",
            "\1\u00f2\3\uffff\1\u00f1",
            "\1\u00f3",
            "\1\u00f4",
            "\1\u00f5",
            "\1\u00f6\7\uffff\1\u00f7",
            "\12\100\7\uffff\32\100\1\uffff\1\100\2\uffff\1\100\1\uffff"+
            "\32\100",
            "\1\u00f9",
            "\1\u00fa",
            "\1\u00fb",
            "\1\u00fc",
            "\1\u00fd",
            "\1\u00fe",
            "\1\u00ff",
            "\1\u0100",
            "\1\u0102\11\uffff\1\u0101",
            "\1\u0103",
            "\1\124",
            "\12\100\7\uffff\32\100\1\uffff\1\100\2\uffff\1\100\1\uffff"+
            "\24\100\1\u0104\5\100",
            "\1\u0108\2\uffff\1\u0107\5\uffff\1\u0106",
            "\1\u0109",
            "\1\u010a",
            "\1\u010b",
            "\1\u010c",
            "\1\u010d",
            "",
            "",
            "\1\u010f",
            "",
            "\1\u0110",
            "\1\u0111",
            "\12\100\7\uffff\32\100\1\uffff\1\100\2\uffff\1\u0112\1\uffff"+
            "\32\100",
            "\1\u0113",
            "\1\u0114",
            "\1\u0115",
            "\1\u0116\16\uffff\1\u0117",
            "\1\u0118\5\uffff\1\u0119",
            "\1\u011a",
            "",
            "",
            "",
            "",
            "",
            "\1\u011f",
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
            "\1\u0128",
            "",
            "",
            "",
            "\1\u012b",
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
            "\1\u012e",
            "",
            "\1\u0087\1\uffff\12\u00b9\13\uffff\1\u0087\37\uffff\1\u0087",
            "",
            "\1\u012f\4\uffff\1\u012f\10\uffff\10\124\7\uffff\1\124\25\uffff"+
            "\1\u0131\6\uffff\1\u012f\4\uffff\1\124\1\u012f\3\uffff\1\u012f"+
            "\7\uffff\1\u012f\3\uffff\1\u012f\1\uffff\1\u012f\1\u0130\1\124"+
            "\1\uffff\1\124",
            "\12\u00bf\1\u00bd\27\u00bf\1\u0132\15\u00bf\12\u0134\7\u00bf"+
            "\32\u0135\1\u00bf\1\u0133\2\u00bf\1\u0135\1\u00bf\32\u0135\uff85"+
            "\u00bf",
            "",
            "\12\u00bf\1\u00bd\27\u00bf\1\u0132\71\u00bf\1\u0136\uffa3\u00bf",
            "\12\u00bf\1\u00bd\27\u00bf\1\u0137\71\u00bf\1\u0136\uffa3\u00bf",
            "\1\u0138",
            "\1\u0139\4\uffff\1\u0139\10\uffff\10\123\7\uffff\1\123\25\uffff"+
            "\1\123\6\uffff\1\u0139\4\uffff\1\123\1\u0139\3\uffff\1\u0139"+
            "\7\uffff\1\u0139\3\uffff\1\u0139\1\uffff\1\u0139\1\u013a\1\123"+
            "\1\uffff\1\123",
            "\12\u00c2\1\u00bd\34\u00c2\1\u013b\64\u00c2\1\u00c1\uffa3\u00c2",
            "",
            "",
            "\1\u013c",
            "\1\u013d",
            "",
            "\1\u013e\11\uffff\1\u013f",
            "",
            "",
            "\1\u0140\11\uffff\1\u0141",
            "\1\u0144\5\uffff\1\u0143",
            "\1\u0145",
            "\1\u0146",
            "\1\u0147",
            "\1\u0148",
            "\1\u0149",
            "\1\u014a",
            "\1\u014b",
            "",
            "",
            "",
            "\1\u014c",
            "\1\u014d",
            "\1\u014e",
            "\1\u014f",
            "\12\100\7\uffff\32\100\1\uffff\1\100\2\uffff\1\100\1\uffff"+
            "\32\100",
            "\1\u0151",
            "\12\100\7\uffff\32\100\1\uffff\1\100\2\uffff\1\100\1\uffff"+
            "\32\100",
            "\1\u0153",
            "\1\u0154\11\uffff\1\u0155",
            "\1\u0156",
            "\1\u0157",
            "\1\u0158\1\u0159",
            "\1\u015a",
            "\1\u015b",
            "\1\u015c",
            "\1\u015d",
            "\1\u015e",
            "\1\u015f",
            "\1\u0160",
            "\1\u0161",
            "\1\u0162",
            "\1\u0164\13\uffff\1\u0163",
            "\1\u0165",
            "\1\u0166",
            "\1\u0167",
            "\1\u0168",
            "\1\u0169",
            "\1\u016a\2\uffff\1\u016b",
            "\1\u016c",
            "\1\u016d",
            "\1\u016e",
            "\1\u016f",
            "\12\100\7\uffff\32\100\1\uffff\1\100\2\uffff\1\100\1\uffff"+
            "\32\100",
            "",
            "\1\u0171",
            "\1\u0172",
            "\1\u0173",
            "\1\u0174",
            "\1\u0175",
            "\1\u0176",
            "\1\u0177\15\uffff\1\u0178",
            "\1\u0179",
            "\1\u017a",
            "\1\u017b",
            "\1\u017c",
            "\1\u017d",
            "",
            "\1\u017e",
            "\1\u017f",
            "\1\u0180",
            "\1\u0181",
            "\1\u0182",
            "\12\100\7\uffff\32\100\1\uffff\1\100\2\uffff\1\100\1\uffff"+
            "\32\100",
            "\1\u0184",
            "\12\100\7\uffff\32\100\1\uffff\1\100\2\uffff\1\u0185\1\uffff"+
            "\32\100",
            "",
            "",
            "\1\u0187",
            "\1\u0188",
            "\1\u0189",
            "\12\100\7\uffff\32\100\1\uffff\1\100\2\uffff\1\100\1\uffff"+
            "\32\100",
            "\1\u018b",
            "\1\u018c",
            "\1\u018d",
            "\12\100\7\uffff\32\100\1\uffff\1\100\2\uffff\1\u018e\1\uffff"+
            "\32\100",
            "\1\u018f",
            "\1\u0190",
            "\1\u0191",
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
            "\1\u0195",
            "\12\u00bf\1\u00bd\27\u00bf\1\u0137\71\u00bf\1\u0136\uffa3\u00bf",
            "\60\u00bd\12\u0196\7\u00bd\6\u0196\uffb9\u00bd",
            "\12\u0197\7\uffff\6\u0197",
            "",
            "\1\u012f\4\uffff\1\u012f\10\uffff\10\124\7\uffff\1\124\25\uffff"+
            "\1\u0199\6\uffff\1\u012f\4\uffff\1\124\1\u012f\3\uffff\1\u012f"+
            "\7\uffff\1\u012f\3\uffff\1\u012f\1\uffff\1\u012f\1\u0198\1\124"+
            "\1\uffff\1\124",
            "\12\u00bf\1\u00bd\27\u00bf\1\u0132\15\u00bf\12\u0134\7\u00bf"+
            "\32\u0135\1\u00bf\1\u0133\2\u00bf\1\u0135\1\u00bf\32\u0135\uff85"+
            "\u00bf",
            "\12\u00bf\1\u00bd\27\u00bf\1\u0132\15\u00bf\12\u0134\7\u00bf"+
            "\32\u0135\1\u00bf\1\u0133\2\u00bf\1\u0135\1\u00bf\32\u0135\uff85"+
            "\u00bf",
            "\1\u012f\4\uffff\1\u012f\10\uffff\10\124\7\uffff\1\124\25\uffff"+
            "\1\124\6\uffff\1\u012f\4\uffff\1\124\1\u012f\3\uffff\1\u012f"+
            "\7\uffff\1\u012f\3\uffff\1\u012f\1\uffff\1\u012f\1\u019a\1\124"+
            "\1\uffff\1\124",
            "",
            "\12\100\7\uffff\32\100\1\uffff\1\100\2\uffff\1\u019b\1\uffff"+
            "\32\100",
            "\12\u00c2\1\u00bd\34\u00c2\1\u013b\64\u00c2\1\u00c1\uffa3\u00c2",
            "\60\u00bd\12\u019c\7\u00bd\6\u019c\uffb9\u00bd",
            "",
            "\12\100\7\uffff\32\100\1\uffff\1\100\2\uffff\1\100\1\uffff"+
            "\32\100",
            "\1\u019e",
            "",
            "",
            "",
            "",
            "",
            "\1\u019f",
            "\1\u01a0",
            "\1\u01a1",
            "\1\u01a2",
            "\1\u01a3",
            "\1\u01a4",
            "\1\u01a5",
            "\1\u01a6",
            "\1\u01a7",
            "\1\u01a8",
            "\1\u01a9",
            "\1\u01aa",
            "\1\u01ab",
            "",
            "\12\100\7\uffff\32\100\1\uffff\1\100\2\uffff\1\100\1\uffff"+
            "\32\100",
            "",
            "\1\u01ad\4\uffff\1\u01af\4\uffff\1\u01ae",
            "\1\u01b0",
            "\1\u01b1",
            "\12\100\7\uffff\32\100\1\uffff\1\100\2\uffff\1\100\1\uffff"+
            "\32\100",
            "\1\u01b3",
            "\1\u01b4",
            "\1\u01b5",
            "\1\u01b6",
            "\1\100\1\u01b7\1\100\1\u01b8\6\100\7\uffff\32\100\1\uffff\1"+
            "\100\2\uffff\1\100\1\uffff\32\100",
            "\1\u01ba",
            "\12\100\7\uffff\32\100\1\uffff\1\100\2\uffff\1\100\1\uffff"+
            "\32\100",
            "\1\u01bc",
            "\1\u01bd",
            "\1\u01be",
            "\1\u01bf",
            "\1\u01c0",
            "\1\u01c1",
            "\1\u01c2",
            "\1\u01c3",
            "\1\u01c4",
            "\1\u01c5",
            "\1\u01c6",
            "\1\u01c7",
            "\1\u01c8",
            "\1\u01c9",
            "\12\100\7\uffff\32\100\1\uffff\1\100\2\uffff\1\100\1\uffff"+
            "\32\100",
            "\12\100\7\uffff\32\100\1\uffff\1\100\2\uffff\1\100\1\uffff"+
            "\32\100",
            "\1\u01cc",
            "\1\u01cd",
            "",
            "\1\u01ce",
            "\1\u01cf",
            "\1\u01d0",
            "\1\u01d1",
            "\12\100\7\uffff\32\100\1\uffff\1\100\2\uffff\1\100\1\uffff"+
            "\32\100",
            "\1\u01d3",
            "\1\u01d4",
            "\1\u01d5",
            "\12\100\7\uffff\32\100\1\uffff\1\100\2\uffff\1\100\1\uffff"+
            "\32\100",
            "\1\u01d7",
            "\1\u01d8",
            "\1\u01d9",
            "\1\u01da",
            "\1\u01db",
            "\1\u01dc",
            "\1\u01dd",
            "\1\u01de",
            "\12\100\7\uffff\32\100\1\uffff\1\100\2\uffff\1\100\1\uffff"+
            "\32\100",
            "",
            "\1\u01e0",
            "\1\u01e1",
            "",
            "\1\u01e2",
            "\1\u01e3",
            "\1\u01e4",
            "",
            "\1\u01e5",
            "\1\u01e6",
            "\1\u01e7",
            "\1\u01e8",
            "\1\u01e9",
            "\1\u01ea",
            "\1\u01eb",
            "",
            "",
            "",
            "\12\100\7\uffff\32\100\1\uffff\1\100\2\uffff\1\100\1\uffff"+
            "\32\100",
            "\60\u00bd\12\u01ed\7\u00bd\6\u01ed\uffb9\u00bd",
            "\12\u01ee\7\uffff\6\u01ee",
            "\60\u00bd\12\u01ef\7\u00bd\6\u01ef\uffb9\u00bd",
            "\12\u01f0\7\uffff\6\u01f0",
            "\60\u00bd\12\u01f1\7\u00bd\6\u01f1\uffb9\u00bd",
            "\1\u01f2",
            "\60\u00bd\12\u01f3\7\u00bd\6\u01f3\uffb9\u00bd",
            "",
            "\1\u01f4",
            "\1\u01f5",
            "\1\u01f6",
            "\1\u01f7",
            "\1\u01f8",
            "\1\u01f9",
            "\1\u01fa",
            "\1\u01fb",
            "\1\u01fc",
            "\1\u01fd",
            "\12\100\7\uffff\32\100\1\uffff\1\100\2\uffff\1\100\1\uffff"+
            "\32\100",
            "\1\u01ff",
            "\12\100\7\uffff\32\100\1\uffff\1\100\2\uffff\1\100\1\uffff"+
            "\32\100",
            "\12\100\7\uffff\32\100\1\uffff\1\100\2\uffff\1\100\1\uffff"+
            "\32\100",
            "",
            "\1\u0202",
            "\1\u0203",
            "\1\u0204",
            "\1\u0205",
            "\12\100\7\uffff\32\100\1\uffff\1\100\2\uffff\1\100\1\uffff"+
            "\32\100",
            "",
            "\1\u0207",
            "\12\100\7\uffff\32\100\1\uffff\1\100\2\uffff\1\u0209\1\uffff"+
            "\4\100\1\u0208\25\100",
            "\1\u020b",
            "\12\100\7\uffff\32\100\1\uffff\1\100\2\uffff\1\100\1\uffff"+
            "\32\100",
            "\1\u020c",
            "\1\u020d",
            "",
            "\12\100\7\uffff\32\100\1\uffff\1\100\2\uffff\1\100\1\uffff"+
            "\32\100",
            "",
            "\12\100\7\uffff\32\100\1\uffff\1\100\2\uffff\1\100\1\uffff"+
            "\32\100",
            "\1\u0210",
            "\1\u0211",
            "\1\u0212",
            "\1\u0213",
            "\1\u0214",
            "\1\u0215",
            "\12\100\7\uffff\32\100\1\uffff\1\100\2\uffff\1\100\1\uffff"+
            "\32\100",
            "\1\u0217",
            "\1\u0218",
            "\1\u0219",
            "\1\u021a",
            "\1\u021b",
            "\1\u021c",
            "",
            "",
            "\1\u021d",
            "\1\u021e",
            "\1\u021f",
            "\1\u0220",
            "\1\u0221",
            "\12\100\7\uffff\32\100\1\uffff\1\100\2\uffff\1\100\1\uffff"+
            "\32\100",
            "",
            "\12\100\7\uffff\32\100\1\uffff\1\100\2\uffff\1\100\1\uffff"+
            "\32\100",
            "\1\u0224",
            "\12\100\7\uffff\32\100\1\uffff\1\100\2\uffff\1\100\1\uffff"+
            "\32\100",
            "",
            "\1\u0225",
            "\12\100\7\uffff\32\100\1\uffff\1\100\2\uffff\1\100\1\uffff"+
            "\32\100",
            "\12\100\7\uffff\32\100\1\uffff\1\100\2\uffff\1\100\1\uffff"+
            "\32\100",
            "\1\u0228",
            "\1\u0229",
            "\1\u022a",
            "\1\u022b",
            "\1\u022c",
            "",
            "\1\u022d\15\uffff\1\u022e",
            "\1\u022f",
            "\1\u0230",
            "\1\u0231",
            "\12\100\7\uffff\32\100\1\uffff\1\100\2\uffff\1\100\1\uffff"+
            "\32\100",
            "\1\u0232",
            "\1\u0233",
            "\1\u0234",
            "\1\u0235",
            "\1\u0236",
            "\1\u0237",
            "\1\u0238",
            "",
            "\60\u00bd\12\u0239\7\u00bd\6\u0239\uffb9\u00bd",
            "\12\u023a\7\uffff\6\u023a",
            "\60\u00bd\12\u023b\7\u00bd\6\u023b\uffb9\u00bd",
            "\12\u023c\7\uffff\6\u023c",
            "\60\u00bd\12\u023d\7\u00bd\6\u023d\uffb9\u00bd",
            "\1\u023e",
            "\60\u00bd\12\u023f\7\u00bd\6\u023f\uffb9\u00bd",
            "\1\u0240",
            "\1\u0241",
            "\1\u0242",
            "\1\u0243",
            "\1\u0244",
            "\1\u0245",
            "\1\u0246",
            "\1\u0247",
            "\1\u0248",
            "\1\u0249",
            "",
            "\12\100\7\uffff\32\100\1\uffff\1\100\2\uffff\1\100\1\uffff"+
            "\32\100",
            "",
            "",
            "\1\u024b",
            "\1\u024c",
            "\12\100\7\uffff\32\100\1\uffff\1\100\2\uffff\1\100\1\uffff"+
            "\32\100",
            "\1\u024d",
            "",
            "\1\u024e",
            "\1\u024f",
            "\1\u0250",
            "",
            "\1\u0251",
            "\1\u0252",
            "\1\u0253",
            "",
            "",
            "\1\u0254",
            "\12\100\7\uffff\32\100\1\uffff\1\100\2\uffff\1\100\1\uffff"+
            "\32\100",
            "\1\u0256",
            "\12\100\7\uffff\32\100\1\uffff\1\100\2\uffff\1\u0257\1\uffff"+
            "\32\100",
            "\12\100\7\uffff\32\100\1\uffff\1\100\2\uffff\1\100\1\uffff"+
            "\32\100",
            "\12\100\7\uffff\32\100\1\uffff\1\100\2\uffff\1\100\1\uffff"+
            "\32\100",
            "",
            "\12\100\7\uffff\32\100\1\uffff\1\100\2\uffff\1\100\1\uffff"+
            "\32\100",
            "\12\100\7\uffff\32\100\1\uffff\1\100\2\uffff\1\100\1\uffff"+
            "\32\100",
            "\12\100\7\uffff\32\100\1\uffff\1\100\2\uffff\1\100\1\uffff"+
            "\32\100",
            "\12\100\7\uffff\32\100\1\uffff\1\100\2\uffff\1\100\1\uffff"+
            "\32\100",
            "\1\u025e",
            "\12\100\7\uffff\32\100\1\uffff\1\100\2\uffff\1\100\1\uffff"+
            "\32\100",
            "\1\u025f",
            "\12\100\7\uffff\32\100\1\uffff\1\100\2\uffff\1\100\1\uffff"+
            "\32\100",
            "\1\u0261",
            "\1\u0262",
            "\1\u0263",
            "",
            "",
            "\12\100\7\uffff\32\100\1\uffff\1\100\2\uffff\1\100\1\uffff"+
            "\32\100",
            "\1\u0264",
            "",
            "",
            "\12\100\7\uffff\32\100\1\uffff\1\100\2\uffff\1\100\1\uffff"+
            "\32\100",
            "\12\100\7\uffff\32\100\1\uffff\1\100\2\uffff\1\100\1\uffff"+
            "\32\100",
            "\1\u0267",
            "\1\u0268",
            "\1\u0269",
            "\1\u026a",
            "\1\u026b",
            "\12\100\7\uffff\32\100\1\uffff\1\100\2\uffff\1\100\1\uffff"+
            "\32\100",
            "\1\u026c",
            "\1\u026d",
            "\1\u026e",
            "\1\u026f",
            "\1\u0270",
            "\12\100\7\uffff\32\100\1\uffff\1\100\2\uffff\1\100\1\uffff"+
            "\32\100",
            "\1\u0271",
            "\1\u0272",
            "\12\100\7\uffff\32\100\1\uffff\1\100\2\uffff\1\100\1\uffff"+
            "\32\100",
            "\60\u00bd\12\u0274\7\u00bd\6\u0274\uffb9\u00bd",
            "\12\u0275\7\uffff\6\u0275",
            "\60\u00bd\12\u0276\7\u00bd\6\u0276\uffb9\u00bd",
            "\12\u0277\7\uffff\6\u0277",
            "\60\u00bd\12\u0278\7\u00bd\6\u0278\uffb9\u00bd",
            "\12\100\7\uffff\32\100\1\uffff\1\100\2\uffff\1\100\1\uffff"+
            "\32\100",
            "\60\u00bd\12\u0279\7\u00bd\6\u0279\uffb9\u00bd",
            "\1\u027a",
            "\1\u027b",
            "\1\u027c",
            "\1\u027d",
            "\1\u027e",
            "\1\u027f",
            "\1\u0280",
            "\1\u0281",
            "\1\u0282",
            "\1\u0283",
            "",
            "\12\100\7\uffff\32\100\1\uffff\1\100\2\uffff\1\100\1\uffff"+
            "\32\100",
            "\1\u0285",
            "\1\u0286",
            "\1\u0287",
            "\1\u0288",
            "\1\u0289",
            "\1\u028a",
            "\1\u028b",
            "\1\u028c",
            "\1\u028d",
            "",
            "\1\u028e",
            "\1\u028f\1\uffff\1\u0290",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0291",
            "\12\100\7\uffff\32\100\1\uffff\1\100\2\uffff\1\100\1\uffff"+
            "\32\100",
            "",
            "\12\100\7\uffff\32\100\1\uffff\1\100\2\uffff\1\100\1\uffff"+
            "\32\100",
            "\1\u0294",
            "\12\100\7\uffff\32\100\1\uffff\1\100\2\uffff\1\100\1\uffff"+
            "\32\100",
            "\1\u0296",
            "",
            "",
            "\12\100\7\uffff\32\100\1\uffff\1\100\2\uffff\1\100\1\uffff"+
            "\32\100",
            "\1\u0298",
            "\1\u0299",
            "\12\100\7\uffff\32\100\1\uffff\1\100\2\uffff\1\100\1\uffff"+
            "\32\100",
            "\12\100\7\uffff\32\100\1\uffff\1\100\2\uffff\1\100\1\uffff"+
            "\32\100",
            "\1\u029a",
            "\1\u029b",
            "\1\u029c",
            "\12\100\7\uffff\32\100\1\uffff\1\100\2\uffff\1\100\1\uffff"+
            "\32\100",
            "\1\u029e",
            "\12\100\7\uffff\32\100\1\uffff\1\100\2\uffff\1\100\1\uffff"+
            "\32\100",
            "\1\u02a0",
            "",
            "\12\u00bf\1\u00bd\27\u00bf\1\u0132\15\u00bf\12\u0134\7\u00bf"+
            "\32\u0135\1\u00bf\1\u0133\2\u00bf\1\u0135\1\u00bf\32\u0135\uff85"+
            "\u00bf",
            "\12\u02a1\7\uffff\6\u02a1",
            "\60\u00bd\12\u02a2\7\u00bd\6\u02a2\uffb9\u00bd",
            "\12\u02a3\7\uffff\6\u02a3",
            "\60\u00bd\12\u02a4\7\u00bd\6\u02a4\uffb9\u00bd",
            "\12\u00c2\1\u00bd\34\u00c2\1\u013b\64\u00c2\1\u00c1\uffa3\u00c2",
            "\1\u02a5",
            "\1\u02a6",
            "\1\u02a8\11\uffff\1\u02a7",
            "\1\u02a9",
            "\1\u02aa",
            "\1\u02ab",
            "\1\u02ac",
            "\1\u02ad",
            "\1\u02ae",
            "\1\u02af",
            "",
            "\12\100\7\uffff\32\100\1\uffff\1\100\2\uffff\1\100\1\uffff"+
            "\32\100",
            "\1\u02b1",
            "\12\100\7\uffff\32\100\1\uffff\1\100\2\uffff\1\100\1\uffff"+
            "\32\100",
            "\1\u02b3",
            "\1\u02b4",
            "\12\100\7\uffff\32\100\1\uffff\1\100\2\uffff\1\100\1\uffff"+
            "\32\100",
            "\12\100\7\uffff\32\100\1\uffff\1\100\2\uffff\1\100\1\uffff"+
            "\32\100",
            "\12\100\7\uffff\32\100\1\uffff\1\100\2\uffff\1\100\1\uffff"+
            "\32\100",
            "\12\100\7\uffff\32\100\1\uffff\1\100\2\uffff\1\100\1\uffff"+
            "\32\100",
            "\1\u02b9",
            "\1\u02ba",
            "\1\u02bb",
            "\12\100\7\uffff\32\100\1\uffff\1\100\2\uffff\1\100\1\uffff"+
            "\32\100",
            "",
            "",
            "\12\100\7\uffff\32\100\1\uffff\1\100\2\uffff\1\100\1\uffff"+
            "\32\100",
            "",
            "\12\100\7\uffff\32\100\1\uffff\1\100\2\uffff\1\100\1\uffff"+
            "\32\100",
            "",
            "\12\100\7\uffff\32\100\1\uffff\1\100\2\uffff\1\100\1\uffff"+
            "\32\100",
            "\1\u02c0",
            "\12\100\7\uffff\32\100\1\uffff\1\100\2\uffff\1\100\1\uffff"+
            "\32\100",
            "\12\100\7\uffff\32\100\1\uffff\1\100\2\uffff\1\100\1\uffff"+
            "\32\100",
            "\1\u02c3",
            "",
            "\12\100\7\uffff\32\100\1\uffff\1\100\2\uffff\1\100\1\uffff"+
            "\32\100",
            "",
            "\1\u02c5",
            "\12\u02c6\7\uffff\6\u02c6",
            "\12\u00bf\1\u00bd\27\u00bf\1\u0132\15\u00bf\12\u0134\7\u00bf"+
            "\32\u0135\1\u00bf\1\u0133\2\u00bf\1\u0135\1\u00bf\32\u0135\uff85"+
            "\u00bf",
            "\12\u02c7\7\uffff\6\u02c7",
            "\12\u00bf\1\u00bd\27\u00bf\1\u0137\71\u00bf\1\u0136\uffa3\u00bf",
            "\1\u02c8",
            "\1\u02c9",
            "\1\u02ca",
            "\1\u02cb",
            "\1\u02cc",
            "\1\u02cd",
            "\1\u02ce",
            "\1\u02cf",
            "\1\u02d0",
            "\1\u02d1",
            "\1\u02d2",
            "",
            "\1\u02d3",
            "",
            "\12\100\7\uffff\32\100\1\uffff\1\100\2\uffff\1\100\1\uffff"+
            "\32\100",
            "\1\u02d5",
            "",
            "",
            "",
            "",
            "\1\u02d6",
            "\1\u02d7",
            "\1\u02d8",
            "",
            "",
            "",
            "",
            "\1\u02d9",
            "",
            "",
            "\12\100\7\uffff\32\100\1\uffff\1\100\2\uffff\1\100\1\uffff"+
            "\32\100",
            "",
            "\12\100\7\uffff\32\100\1\uffff\1\100\2\uffff\1\100\1\uffff"+
            "\32\100",
            "\12\u02dc\7\uffff\6\u02dc",
            "\12\u02dd\7\uffff\6\u02dd",
            "\12\100\7\uffff\32\100\1\uffff\1\100\2\uffff\1\100\1\uffff"+
            "\32\100",
            "\12\100\7\uffff\32\100\1\uffff\1\100\2\uffff\1\100\1\uffff"+
            "\32\100",
            "\1\u02e0",
            "\1\u02e1",
            "\1\u02e2",
            "\1\u02e3",
            "\1\u02e4",
            "\1\u02e5",
            "\1\u02e6",
            "\1\u02e7",
            "\1\u02e8",
            "\1\u02e9",
            "",
            "\12\100\7\uffff\32\100\1\uffff\1\100\2\uffff\1\100\1\uffff"+
            "\32\100",
            "\1\u02ea",
            "\1\u02eb",
            "\1\u02ec",
            "\1\u02ed",
            "",
            "",
            "\12\u02ee\7\uffff\6\u02ee",
            "\12\u02ef\7\uffff\6\u02ef",
            "",
            "",
            "\1\u02f0",
            "\1\u02f1",
            "\12\100\7\uffff\32\100\1\uffff\1\100\2\uffff\1\100\1\uffff"+
            "\32\100",
            "\1\u02f3",
            "\1\u02f4",
            "\1\u02f5",
            "\1\u02f6",
            "\1\u02f7",
            "\1\u02f8",
            "\1\u02f9",
            "\1\u02fa",
            "\1\u02fb",
            "\12\100\7\uffff\32\100\1\uffff\1\100\2\uffff\1\100\1\uffff"+
            "\32\100",
            "\1\u02fc",
            "\12\124\1\uffff\27\124\1\u02fd\15\124\12\u02fe\7\124\32\u0300"+
            "\1\124\1\u02ff\2\124\1\u0300\1\124\32\u0300\uff85\124",
            "\12\u0301\7\uffff\6\u0301",
            "\1\u0302",
            "\1\u0303",
            "",
            "\1\u0304",
            "\1\u0305",
            "\12\100\7\uffff\32\100\1\uffff\1\100\2\uffff\1\100\1\uffff"+
            "\32\100",
            "\1\u0307",
            "\1\u0308",
            "\1\u0309",
            "\12\100\7\uffff\32\100\1\uffff\1\100\2\uffff\1\100\1\uffff"+
            "\32\100",
            "\1\u030b",
            "\1\u030c",
            "\12\100\7\uffff\32\100\1\uffff\1\100\2\uffff\1\100\1\uffff"+
            "\32\100",
            "",
            "\12\124\1\uffff\27\124\1\u02fd\15\124\12\u02fe\7\124\32\u0300"+
            "\1\124\1\u02ff\2\124\1\u0300\1\124\32\u0300\uff85\124",
            "\1\124\4\uffff\1\124\10\uffff\10\124\7\uffff\1\124\25\uffff"+
            "\1\u0199\6\uffff\1\124\4\uffff\2\124\3\uffff\1\124\7\uffff\1"+
            "\124\3\uffff\1\124\1\uffff\1\124\1\u030d\1\124\1\uffff\1\124",
            "\12\124\1\uffff\27\124\1\u02fd\15\124\12\u02fe\7\124\32\u0300"+
            "\1\124\1\u02ff\2\124\1\u0300\1\124\32\u0300\uff85\124",
            "\12\124\1\uffff\27\124\1\u02fd\15\124\12\u02fe\7\124\32\u0300"+
            "\1\124\1\u02ff\2\124\1\u0300\1\124\32\u0300\uff85\124",
            "\1\u030e",
            "\1\u030f",
            "\1\u0310",
            "\1\u0311",
            "",
            "\1\u0312",
            "\1\u0313",
            "\12\100\7\uffff\32\100\1\uffff\1\100\2\uffff\1\100\1\uffff"+
            "\32\100",
            "",
            "\1\u0315",
            "\12\100\7\uffff\32\100\1\uffff\1\100\2\uffff\1\100\1\uffff"+
            "\32\100",
            "\12\u0317\7\uffff\6\u0317",
            "\1\u0318",
            "\1\u0319",
            "\1\u031a",
            "\1\u031b",
            "\1\u031c",
            "\1\u031d",
            "",
            "\1\u031e",
            "",
            "\12\u031f\7\uffff\6\u031f",
            "\1\u0320",
            "\1\u0321",
            "\1\u0322",
            "\12\100\7\uffff\32\100\1\uffff\1\100\2\uffff\1\100\1\uffff"+
            "\32\100",
            "\1\u0324",
            "\1\u0325",
            "\1\u0326",
            "\12\u0327\7\uffff\6\u0327",
            "\1\u0328",
            "\1\u0329",
            "\1\u032a",
            "",
            "\1\u032b",
            "\1\u032c",
            "\12\100\7\uffff\32\100\1\uffff\1\100\2\uffff\1\100\1\uffff"+
            "\32\100",
            "\12\u032d\7\uffff\6\u032d",
            "\1\u032e",
            "\1\u032f",
            "\1\u0330",
            "\1\u0331",
            "\1\u0332",
            "\12\124\1\uffff\27\124\1\u02fd\15\124\12\u02fe\7\124\32\u0300"+
            "\1\124\1\u02ff\2\124\1\u0300\1\124\32\u0300\uff85\124",
            "\1\u0333",
            "\1\u0334",
            "\12\100\7\uffff\32\100\1\uffff\1\100\2\uffff\1\100\1\uffff"+
            "\32\100",
            "\1\u0336",
            "\1\u0337",
            "\1\u0338",
            "\1\u0339",
            "",
            "\12\100\7\uffff\32\100\1\uffff\1\100\2\uffff\1\100\1\uffff"+
            "\32\100",
            "\1\u033b",
            "\1\u033c",
            "\1\u033d",
            "",
            "\12\100\7\uffff\32\100\1\uffff\1\100\2\uffff\1\100\1\uffff"+
            "\32\100",
            "\1\u033f",
            "\12\100\7\uffff\32\100\1\uffff\1\100\2\uffff\1\100\1\uffff"+
            "\32\100",
            "",
            "\12\100\7\uffff\32\100\1\uffff\1\100\2\uffff\1\100\1\uffff"+
            "\32\100",
            "",
            ""
    };

    static final short[] DFA45_eot = DFA.unpackEncodedString(DFA45_eotS);
    static final short[] DFA45_eof = DFA.unpackEncodedString(DFA45_eofS);
    static final char[] DFA45_min = DFA.unpackEncodedStringToUnsignedChars(DFA45_minS);
    static final char[] DFA45_max = DFA.unpackEncodedStringToUnsignedChars(DFA45_maxS);
    static final short[] DFA45_accept = DFA.unpackEncodedString(DFA45_acceptS);
    static final short[] DFA45_special = DFA.unpackEncodedString(DFA45_specialS);
    static final short[][] DFA45_transition;

    static {
        int numStates = DFA45_transitionS.length;
        DFA45_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA45_transition[i] = DFA.unpackEncodedString(DFA45_transitionS[i]);
        }
    }

    class DFA45 extends DFA {

        public DFA45(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 45;
            this.eot = DFA45_eot;
            this.eof = DFA45_eof;
            this.min = DFA45_min;
            this.max = DFA45_max;
            this.accept = DFA45_accept;
            this.special = DFA45_special;
            this.transition = DFA45_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | T__114 | T__115 | T__116 | T__117 | T__118 | T__119 | T__120 | T__121 | T__122 | T__123 | T__124 | T__125 | T__126 | T__127 | T__128 | T__129 | T__130 | T__131 | T__132 | T__133 | T__134 | T__135 | T__136 | T__137 | T__138 | T__139 | T__140 | T__141 | T__142 | T__143 | T__144 | T__145 | T__146 | T__147 | T__148 | T__149 | T__150 | T__151 | T__152 | T__153 | T__154 | T__155 | T__156 | T__157 | T__158 | T__159 | T__160 | T__161 | T__162 | T__163 | T__164 | T__165 | T__166 | T__167 | T__168 | T__169 | T__170 | T__171 | T__172 | T__173 | T__174 | RULE_HEADER_NAME | RULE_KEYWORD | RULE_PREPROCESSING_OP_OR_PUNC | RULE_ID | RULE_CHARACTER_LITERAL | RULE_FLOATING_LITERAL | RULE_STRING_LITERAL | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA45_493 = input.LA(1);

                        s = -1;
                        if ( ((LA45_493>='\u0000' && LA45_493<='/')||(LA45_493>=':' && LA45_493<='@')||(LA45_493>='G' && LA45_493<='\uFFFF')) ) {s = 189;}

                        else if ( ((LA45_493>='0' && LA45_493<='9')||(LA45_493>='A' && LA45_493<='F')) ) {s = 569;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA45_571 = input.LA(1);

                        s = -1;
                        if ( ((LA45_571>='\u0000' && LA45_571<='/')||(LA45_571>=':' && LA45_571<='@')||(LA45_571>='G' && LA45_571<='\uFFFF')) ) {s = 189;}

                        else if ( ((LA45_571>='0' && LA45_571<='9')||(LA45_571>='A' && LA45_571<='F')) ) {s = 630;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA45_569 = input.LA(1);

                        s = -1;
                        if ( ((LA45_569>='\u0000' && LA45_569<='/')||(LA45_569>=':' && LA45_569<='@')||(LA45_569>='G' && LA45_569<='\uFFFF')) ) {s = 189;}

                        else if ( ((LA45_569>='0' && LA45_569<='9')||(LA45_569>='A' && LA45_569<='F')) ) {s = 628;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA45_630 = input.LA(1);

                        s = -1;
                        if ( ((LA45_630>='\u0000' && LA45_630<='/')||(LA45_630>=':' && LA45_630<='@')||(LA45_630>='G' && LA45_630<='\uFFFF')) ) {s = 189;}

                        else if ( ((LA45_630>='0' && LA45_630<='9')||(LA45_630>='A' && LA45_630<='F')) ) {s = 674;}

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA45_406 = input.LA(1);

                        s = -1;
                        if ( ((LA45_406>='\u0000' && LA45_406<='/')||(LA45_406>=':' && LA45_406<='@')||(LA45_406>='G' && LA45_406<='\uFFFF')) ) {s = 189;}

                        else if ( ((LA45_406>='0' && LA45_406<='9')||(LA45_406>='A' && LA45_406<='F')) ) {s = 493;}

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA45_495 = input.LA(1);

                        s = -1;
                        if ( ((LA45_495>='0' && LA45_495<='9')||(LA45_495>='A' && LA45_495<='F')) ) {s = 571;}

                        else if ( ((LA45_495>='\u0000' && LA45_495<='/')||(LA45_495>=':' && LA45_495<='@')||(LA45_495>='G' && LA45_495<='\uFFFF')) ) {s = 189;}

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA45_633 = input.LA(1);

                        s = -1;
                        if ( (LA45_633=='\'') ) {s = 315;}

                        else if ( ((LA45_633>='\u0000' && LA45_633<='\t')||(LA45_633>='\u000B' && LA45_633<='&')||(LA45_633>='(' && LA45_633<='[')||(LA45_633>=']' && LA45_633<='\uFFFF')) ) {s = 194;}

                        else if ( (LA45_633=='\\') ) {s = 193;}

                        else if ( (LA45_633=='\n') ) {s = 189;}

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA45_766 = input.LA(1);

                        s = -1;
                        if ( (LA45_766=='\"') ) {s = 765;}

                        else if ( ((LA45_766>='0' && LA45_766<='9')) ) {s = 766;}

                        else if ( ((LA45_766>='A' && LA45_766<='Z')||LA45_766=='_'||(LA45_766>='a' && LA45_766<='z')) ) {s = 768;}

                        else if ( (LA45_766=='\\') ) {s = 767;}

                        else if ( ((LA45_766>='\u0000' && LA45_766<='\t')||(LA45_766>='\u000B' && LA45_766<='!')||(LA45_766>='#' && LA45_766<='/')||(LA45_766>=':' && LA45_766<='@')||LA45_766=='['||(LA45_766>=']' && LA45_766<='^')||LA45_766=='`'||(LA45_766>='{' && LA45_766<='\uFFFF')) ) {s = 84;}

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA45_52 = input.LA(1);

                        s = -1;
                        if ( (LA45_52=='\\') ) {s = 187;}

                        else if ( ((LA45_52>='A' && LA45_52<='Z')||LA45_52=='_'||(LA45_52>='a' && LA45_52<='z')) ) {s = 188;}

                        else if ( (LA45_52=='\n'||LA45_52=='\"') ) {s = 189;}

                        else if ( (LA45_52=='.') ) {s = 190;}

                        else if ( ((LA45_52>='\u0000' && LA45_52<='\t')||(LA45_52>='\u000B' && LA45_52<='!')||(LA45_52>='#' && LA45_52<='-')||(LA45_52>='/' && LA45_52<='@')||LA45_52=='['||(LA45_52>=']' && LA45_52<='^')||LA45_52=='`'||(LA45_52>='{' && LA45_52<='\uFFFF')) ) {s = 191;}

                        else s = 186;

                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA45_674 = input.LA(1);

                        s = -1;
                        if ( (LA45_674=='\"') ) {s = 306;}

                        else if ( (LA45_674=='\\') ) {s = 307;}

                        else if ( ((LA45_674>='0' && LA45_674<='9')) ) {s = 308;}

                        else if ( ((LA45_674>='A' && LA45_674<='Z')||LA45_674=='_'||(LA45_674>='a' && LA45_674<='z')) ) {s = 309;}

                        else if ( ((LA45_674>='\u0000' && LA45_674<='\t')||(LA45_674>='\u000B' && LA45_674<='!')||(LA45_674>='#' && LA45_674<='/')||(LA45_674>=':' && LA45_674<='@')||LA45_674=='['||(LA45_674>=']' && LA45_674<='^')||LA45_674=='`'||(LA45_674>='{' && LA45_674<='\uFFFF')) ) {s = 191;}

                        else if ( (LA45_674=='\n') ) {s = 189;}

                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA45_303 = input.LA(1);

                        s = -1;
                        if ( (LA45_303=='\"') ) {s = 311;}

                        else if ( (LA45_303=='\\') ) {s = 310;}

                        else if ( ((LA45_303>='\u0000' && LA45_303<='\t')||(LA45_303>='\u000B' && LA45_303<='!')||(LA45_303>='#' && LA45_303<='[')||(LA45_303>=']' && LA45_303<='\uFFFF')) ) {s = 191;}

                        else if ( (LA45_303=='\n') ) {s = 189;}

                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA45_191 = input.LA(1);

                        s = -1;
                        if ( (LA45_191=='\"') ) {s = 311;}

                        else if ( (LA45_191=='\\') ) {s = 310;}

                        else if ( ((LA45_191>='\u0000' && LA45_191<='\t')||(LA45_191>='\u000B' && LA45_191<='!')||(LA45_191>='#' && LA45_191<='[')||(LA45_191>=']' && LA45_191<='\uFFFF')) ) {s = 191;}

                        else if ( (LA45_191=='\n') ) {s = 189;}

                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA45_309 = input.LA(1);

                        s = -1;
                        if ( (LA45_309=='\"') ) {s = 306;}

                        else if ( (LA45_309=='\\') ) {s = 307;}

                        else if ( ((LA45_309>='0' && LA45_309<='9')) ) {s = 308;}

                        else if ( ((LA45_309>='A' && LA45_309<='Z')||LA45_309=='_'||(LA45_309>='a' && LA45_309<='z')) ) {s = 309;}

                        else if ( ((LA45_309>='\u0000' && LA45_309<='\t')||(LA45_309>='\u000B' && LA45_309<='!')||(LA45_309>='#' && LA45_309<='/')||(LA45_309>=':' && LA45_309<='@')||LA45_309=='['||(LA45_309>=']' && LA45_309<='^')||LA45_309=='`'||(LA45_309>='{' && LA45_309<='\uFFFF')) ) {s = 191;}

                        else if ( (LA45_309=='\n') ) {s = 189;}

                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA45_314 = input.LA(1);

                        s = -1;
                        if ( ((LA45_314>='\u0000' && LA45_314<='/')||(LA45_314>=':' && LA45_314<='@')||(LA45_314>='G' && LA45_314<='\uFFFF')) ) {s = 189;}

                        else if ( ((LA45_314>='0' && LA45_314<='9')||(LA45_314>='A' && LA45_314<='F')) ) {s = 412;}

                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA45_676 = input.LA(1);

                        s = -1;
                        if ( (LA45_676=='\"') ) {s = 311;}

                        else if ( (LA45_676=='\\') ) {s = 310;}

                        else if ( ((LA45_676>='\u0000' && LA45_676<='\t')||(LA45_676>='\u000B' && LA45_676<='!')||(LA45_676>='#' && LA45_676<='[')||(LA45_676>=']' && LA45_676<='\uFFFF')) ) {s = 191;}

                        else if ( (LA45_676=='\n') ) {s = 189;}

                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA45_308 = input.LA(1);

                        s = -1;
                        if ( (LA45_308=='\"') ) {s = 306;}

                        else if ( (LA45_308=='\\') ) {s = 307;}

                        else if ( ((LA45_308>='0' && LA45_308<='9')) ) {s = 308;}

                        else if ( ((LA45_308>='A' && LA45_308<='Z')||LA45_308=='_'||(LA45_308>='a' && LA45_308<='z')) ) {s = 309;}

                        else if ( ((LA45_308>='\u0000' && LA45_308<='\t')||(LA45_308>='\u000B' && LA45_308<='!')||(LA45_308>='#' && LA45_308<='/')||(LA45_308>=':' && LA45_308<='@')||LA45_308=='['||(LA45_308>=']' && LA45_308<='^')||LA45_308=='`'||(LA45_308>='{' && LA45_308<='\uFFFF')) ) {s = 191;}

                        else if ( (LA45_308=='\n') ) {s = 189;}

                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA45_768 = input.LA(1);

                        s = -1;
                        if ( (LA45_768=='\"') ) {s = 765;}

                        else if ( ((LA45_768>='0' && LA45_768<='9')) ) {s = 766;}

                        else if ( ((LA45_768>='A' && LA45_768<='Z')||LA45_768=='_'||(LA45_768>='a' && LA45_768<='z')) ) {s = 768;}

                        else if ( (LA45_768=='\\') ) {s = 767;}

                        else if ( ((LA45_768>='\u0000' && LA45_768<='\t')||(LA45_768>='\u000B' && LA45_768<='!')||(LA45_768>='#' && LA45_768<='/')||(LA45_768>=':' && LA45_768<='@')||LA45_768=='['||(LA45_768>=']' && LA45_768<='^')||LA45_768=='`'||(LA45_768>='{' && LA45_768<='\uFFFF')) ) {s = 84;}

                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA45_628 = input.LA(1);

                        s = -1;
                        if ( (LA45_628=='\"') ) {s = 306;}

                        else if ( (LA45_628=='\\') ) {s = 307;}

                        else if ( ((LA45_628>='0' && LA45_628<='9')) ) {s = 308;}

                        else if ( ((LA45_628>='A' && LA45_628<='Z')||LA45_628=='_'||(LA45_628>='a' && LA45_628<='z')) ) {s = 309;}

                        else if ( ((LA45_628>='\u0000' && LA45_628<='\t')||(LA45_628>='\u000B' && LA45_628<='!')||(LA45_628>='#' && LA45_628<='/')||(LA45_628>=':' && LA45_628<='@')||LA45_628=='['||(LA45_628>=']' && LA45_628<='^')||LA45_628=='`'||(LA45_628>='{' && LA45_628<='\uFFFF')) ) {s = 191;}

                        else if ( (LA45_628=='\n') ) {s = 189;}

                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA45_410 = input.LA(1);

                        s = -1;
                        if ( ((LA45_410>='\u0000' && LA45_410<='/')||(LA45_410>=':' && LA45_410<='@')||(LA45_410>='G' && LA45_410<='\uFFFF')) ) {s = 189;}

                        else if ( ((LA45_410>='0' && LA45_410<='9')||(LA45_410>='A' && LA45_410<='F')) ) {s = 497;}

                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA45_304 = input.LA(1);

                        s = -1;
                        if ( ((LA45_304>='0' && LA45_304<='9')||(LA45_304>='A' && LA45_304<='F')) ) {s = 406;}

                        else if ( ((LA45_304>='\u0000' && LA45_304<='/')||(LA45_304>=':' && LA45_304<='@')||(LA45_304>='G' && LA45_304<='\uFFFF')) ) {s = 189;}

                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA45_408 = input.LA(1);

                        s = -1;
                        if ( ((LA45_408>='\u0000' && LA45_408<='/')||(LA45_408>=':' && LA45_408<='@')||(LA45_408>='G' && LA45_408<='\uFFFF')) ) {s = 189;}

                        else if ( ((LA45_408>='0' && LA45_408<='9')||(LA45_408>='A' && LA45_408<='F')) ) {s = 495;}

                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA45_813 = input.LA(1);

                        s = -1;
                        if ( (LA45_813=='\"') ) {s = 765;}

                        else if ( ((LA45_813>='0' && LA45_813<='9')) ) {s = 766;}

                        else if ( ((LA45_813>='A' && LA45_813<='Z')||LA45_813=='_'||(LA45_813>='a' && LA45_813<='z')) ) {s = 768;}

                        else if ( (LA45_813=='\\') ) {s = 767;}

                        else if ( ((LA45_813>='\u0000' && LA45_813<='\t')||(LA45_813>='\u000B' && LA45_813<='!')||(LA45_813>='#' && LA45_813<='/')||(LA45_813>=':' && LA45_813<='@')||LA45_813=='['||(LA45_813>=']' && LA45_813<='^')||LA45_813=='`'||(LA45_813>='{' && LA45_813<='\uFFFF')) ) {s = 84;}

                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA45_769 = input.LA(1);

                        s = -1;
                        if ( (LA45_769=='\"') ) {s = 765;}

                        else if ( ((LA45_769>='0' && LA45_769<='9')) ) {s = 766;}

                        else if ( (LA45_769=='\\') ) {s = 767;}

                        else if ( ((LA45_769>='A' && LA45_769<='Z')||LA45_769=='_'||(LA45_769>='a' && LA45_769<='z')) ) {s = 768;}

                        else if ( ((LA45_769>='\u0000' && LA45_769<='\t')||(LA45_769>='\u000B' && LA45_769<='!')||(LA45_769>='#' && LA45_769<='/')||(LA45_769>=':' && LA45_769<='@')||LA45_769=='['||(LA45_769>=']' && LA45_769<='^')||LA45_769=='`'||(LA45_769>='{' && LA45_769<='\uFFFF')) ) {s = 84;}

                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA45_750 = input.LA(1);

                        s = -1;
                        if ( (LA45_750=='\"') ) {s = 765;}

                        else if ( ((LA45_750>='0' && LA45_750<='9')) ) {s = 766;}

                        else if ( (LA45_750=='\\') ) {s = 767;}

                        else if ( ((LA45_750>='A' && LA45_750<='Z')||LA45_750=='_'||(LA45_750>='a' && LA45_750<='z')) ) {s = 768;}

                        else if ( ((LA45_750>='\u0000' && LA45_750<='\t')||(LA45_750>='\u000B' && LA45_750<='!')||(LA45_750>='#' && LA45_750<='/')||(LA45_750>=':' && LA45_750<='@')||LA45_750=='['||(LA45_750>=']' && LA45_750<='^')||LA45_750=='`'||(LA45_750>='{' && LA45_750<='\uFFFF')) ) {s = 84;}

                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA45_412 = input.LA(1);

                        s = -1;
                        if ( ((LA45_412>='\u0000' && LA45_412<='/')||(LA45_412>=':' && LA45_412<='@')||(LA45_412>='G' && LA45_412<='\uFFFF')) ) {s = 189;}

                        else if ( ((LA45_412>='0' && LA45_412<='9')||(LA45_412>='A' && LA45_412<='F')) ) {s = 499;}

                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA45_575 = input.LA(1);

                        s = -1;
                        if ( ((LA45_575>='0' && LA45_575<='9')||(LA45_575>='A' && LA45_575<='F')) ) {s = 633;}

                        else if ( ((LA45_575>='\u0000' && LA45_575<='/')||(LA45_575>=':' && LA45_575<='@')||(LA45_575>='G' && LA45_575<='\uFFFF')) ) {s = 189;}

                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA45_499 = input.LA(1);

                        s = -1;
                        if ( ((LA45_499>='\u0000' && LA45_499<='/')||(LA45_499>=':' && LA45_499<='@')||(LA45_499>='G' && LA45_499<='\uFFFF')) ) {s = 189;}

                        else if ( ((LA45_499>='0' && LA45_499<='9')||(LA45_499>='A' && LA45_499<='F')) ) {s = 575;}

                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA45_313 = input.LA(1);

                        s = -1;
                        if ( (LA45_313=='\'') ) {s = 315;}

                        else if ( ((LA45_313>='\u0000' && LA45_313<='\t')||(LA45_313>='\u000B' && LA45_313<='&')||(LA45_313>='(' && LA45_313<='[')||(LA45_313>=']' && LA45_313<='\uFFFF')) ) {s = 194;}

                        else if ( (LA45_313=='\\') ) {s = 193;}

                        else if ( (LA45_313=='\n') ) {s = 189;}

                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA45_190 = input.LA(1);

                        s = -1;
                        if ( (LA45_190=='\"') ) {s = 306;}

                        else if ( (LA45_190=='\\') ) {s = 310;}

                        else if ( ((LA45_190>='\u0000' && LA45_190<='\t')||(LA45_190>='\u000B' && LA45_190<='!')||(LA45_190>='#' && LA45_190<='[')||(LA45_190>=']' && LA45_190<='\uFFFF')) ) {s = 191;}

                        else if ( (LA45_190=='\n') ) {s = 189;}

                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA45_573 = input.LA(1);

                        s = -1;
                        if ( ((LA45_573>='\u0000' && LA45_573<='/')||(LA45_573>=':' && LA45_573<='@')||(LA45_573>='G' && LA45_573<='\uFFFF')) ) {s = 189;}

                        else if ( ((LA45_573>='0' && LA45_573<='9')||(LA45_573>='A' && LA45_573<='F')) ) {s = 632;}

                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA45_632 = input.LA(1);

                        s = -1;
                        if ( ((LA45_632>='\u0000' && LA45_632<='/')||(LA45_632>=':' && LA45_632<='@')||(LA45_632>='G' && LA45_632<='\uFFFF')) ) {s = 189;}

                        else if ( ((LA45_632>='0' && LA45_632<='9')||(LA45_632>='A' && LA45_632<='F')) ) {s = 676;}

                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA45_194 = input.LA(1);

                        s = -1;
                        if ( (LA45_194=='\'') ) {s = 315;}

                        else if ( ((LA45_194>='\u0000' && LA45_194<='\t')||(LA45_194>='\u000B' && LA45_194<='&')||(LA45_194>='(' && LA45_194<='[')||(LA45_194>=']' && LA45_194<='\uFFFF')) ) {s = 194;}

                        else if ( (LA45_194=='\\') ) {s = 193;}

                        else if ( (LA45_194=='\n') ) {s = 189;}

                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        int LA45_497 = input.LA(1);

                        s = -1;
                        if ( ((LA45_497>='\u0000' && LA45_497<='/')||(LA45_497>=':' && LA45_497<='@')||(LA45_497>='G' && LA45_497<='\uFFFF')) ) {s = 189;}

                        else if ( ((LA45_497>='0' && LA45_497<='9')||(LA45_497>='A' && LA45_497<='F')) ) {s = 573;}

                        if ( s>=0 ) return s;
                        break;
                    case 33 : 
                        int LA45_58 = input.LA(1);

                        s = -1;
                        if ( (LA45_58=='\\') ) {s = 193;}

                        else if ( ((LA45_58>='\u0000' && LA45_58<='\t')||(LA45_58>='\u000B' && LA45_58<='&')||(LA45_58>='(' && LA45_58<='[')||(LA45_58>=']' && LA45_58<='\uFFFF')) ) {s = 194;}

                        else if ( (LA45_58=='\n'||LA45_58=='\'') ) {s = 189;}

                        else s = 61;

                        if ( s>=0 ) return s;
                        break;
                    case 34 : 
                        int LA45_0 = input.LA(1);

                        s = -1;
                        if ( (LA45_0=='T') ) {s = 1;}

                        else if ( (LA45_0=='#') ) {s = 2;}

                        else if ( (LA45_0=='(') ) {s = 3;}

                        else if ( (LA45_0=='E') ) {s = 4;}

                        else if ( (LA45_0=='C') ) {s = 5;}

                        else if ( (LA45_0=='I') ) {s = 6;}

                        else if ( (LA45_0=='N') ) {s = 7;}

                        else if ( (LA45_0=='A') ) {s = 8;}

                        else if ( (LA45_0=='U') ) {s = 9;}

                        else if ( (LA45_0=='*') ) {s = 10;}

                        else if ( (LA45_0=='&') ) {s = 11;}

                        else if ( (LA45_0=='f') ) {s = 12;}

                        else if ( (LA45_0=='t') ) {s = 13;}

                        else if ( (LA45_0=='c') ) {s = 14;}

                        else if ( (LA45_0=='r') ) {s = 15;}

                        else if ( (LA45_0=='s') ) {s = 16;}

                        else if ( (LA45_0=='e') ) {s = 17;}

                        else if ( (LA45_0=='m') ) {s = 18;}

                        else if ( (LA45_0=='i') ) {s = 19;}

                        else if ( (LA45_0=='v') ) {s = 20;}

                        else if ( (LA45_0=='w') ) {s = 21;}

                        else if ( (LA45_0=='b') ) {s = 22;}

                        else if ( (LA45_0=='l') ) {s = 23;}

                        else if ( (LA45_0=='u') ) {s = 24;}

                        else if ( (LA45_0=='d') ) {s = 25;}

                        else if ( (LA45_0=='a') ) {s = 26;}

                        else if ( (LA45_0==':') ) {s = 27;}

                        else if ( (LA45_0=='.') ) {s = 28;}

                        else if ( (LA45_0=='o') ) {s = 29;}

                        else if ( (LA45_0=='n') ) {s = 30;}

                        else if ( (LA45_0=='p') ) {s = 31;}

                        else if ( (LA45_0=='+') ) {s = 32;}

                        else if ( (LA45_0=='-') ) {s = 33;}

                        else if ( (LA45_0=='/') ) {s = 34;}

                        else if ( (LA45_0=='%') ) {s = 35;}

                        else if ( (LA45_0=='^') ) {s = 36;}

                        else if ( (LA45_0=='|') ) {s = 37;}

                        else if ( (LA45_0=='~') ) {s = 38;}

                        else if ( (LA45_0=='!') ) {s = 39;}

                        else if ( (LA45_0=='=') ) {s = 40;}

                        else if ( (LA45_0=='<') ) {s = 41;}

                        else if ( (LA45_0=='>') ) {s = 42;}

                        else if ( (LA45_0==',') ) {s = 43;}

                        else if ( (LA45_0=='[') ) {s = 44;}

                        else if ( (LA45_0=='{') ) {s = 45;}

                        else if ( (LA45_0=='}') ) {s = 46;}

                        else if ( (LA45_0==')') ) {s = 47;}

                        else if ( (LA45_0==']') ) {s = 48;}

                        else if ( (LA45_0==';') ) {s = 49;}

                        else if ( (LA45_0=='g') ) {s = 50;}

                        else if ( (LA45_0=='0') ) {s = 51;}

                        else if ( (LA45_0=='\"') ) {s = 52;}

                        else if ( (LA45_0=='?') ) {s = 53;}

                        else if ( (LA45_0=='x') ) {s = 54;}

                        else if ( (LA45_0=='L') ) {s = 55;}

                        else if ( (LA45_0=='\\') ) {s = 56;}

                        else if ( (LA45_0=='B'||LA45_0=='D'||(LA45_0>='F' && LA45_0<='H')||(LA45_0>='J' && LA45_0<='K')||LA45_0=='M'||(LA45_0>='O' && LA45_0<='S')||(LA45_0>='V' && LA45_0<='Z')||LA45_0=='_'||LA45_0=='h'||(LA45_0>='j' && LA45_0<='k')||LA45_0=='q'||(LA45_0>='y' && LA45_0<='z')) ) {s = 57;}

                        else if ( (LA45_0=='\'') ) {s = 58;}

                        else if ( ((LA45_0>='1' && LA45_0<='9')) ) {s = 59;}

                        else if ( ((LA45_0>='\t' && LA45_0<='\n')||LA45_0=='\r'||LA45_0==' ') ) {s = 60;}

                        else if ( ((LA45_0>='\u0000' && LA45_0<='\b')||(LA45_0>='\u000B' && LA45_0<='\f')||(LA45_0>='\u000E' && LA45_0<='\u001F')||LA45_0=='$'||LA45_0=='@'||LA45_0=='`'||(LA45_0>='\u007F' && LA45_0<='\uFFFF')) ) {s = 61;}

                        if ( s>=0 ) return s;
                        break;
                    case 35 : 
                        int LA45_188 = input.LA(1);

                        s = -1;
                        if ( (LA45_188=='\"') ) {s = 306;}

                        else if ( (LA45_188=='\\') ) {s = 307;}

                        else if ( ((LA45_188>='0' && LA45_188<='9')) ) {s = 308;}

                        else if ( ((LA45_188>='A' && LA45_188<='Z')||LA45_188=='_'||(LA45_188>='a' && LA45_188<='z')) ) {s = 309;}

                        else if ( ((LA45_188>='\u0000' && LA45_188<='\t')||(LA45_188>='\u000B' && LA45_188<='!')||(LA45_188>='#' && LA45_188<='/')||(LA45_188>=':' && LA45_188<='@')||LA45_188=='['||(LA45_188>=']' && LA45_188<='^')||LA45_188=='`'||(LA45_188>='{' && LA45_188<='\uFFFF')) ) {s = 191;}

                        else if ( (LA45_188=='\n') ) {s = 189;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 45, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}