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
    public static final int RULE_ID=6;
    public static final int RULE_FLOATING_LITERAL=9;
    public static final int RULE_ANY_OTHER=38;
    public static final int RULE_H_CHAR=14;
    public static final int EOF=-1;
    public static final int T__93=93;
    public static final int RULE_OCTAL_DIGIT=23;
    public static final int T__94=94;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int T__90=90;
    public static final int RULE_KEYWORD=4;
    public static final int RULE_DECIMAL_LITERAL=19;
    public static final int RULE_OCTAL_LITERAL=20;
    public static final int RULE_NONDIGIT=17;
    public static final int T__99=99;
    public static final int T__98=98;
    public static final int RULE_CHARACTER_LITERAL=8;
    public static final int T__97=97;
    public static final int RULE_HEX_QUAD=12;
    public static final int T__96=96;
    public static final int T__95=95;
    public static final int RULE_HEXADECIMAL_LITERAL=21;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int T__85=85;
    public static final int RULE_C_CHAR=24;
    public static final int RULE_SCHAR=32;
    public static final int T__84=84;
    public static final int T__87=87;
    public static final int T__86=86;
    public static final int T__89=89;
    public static final int T__88=88;
    public static final int RULE_ML_COMMENT=35;
    public static final int RULE_STRING=34;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int T__70=70;
    public static final int RULE_OCTAL_ESCAPE_SEQUENCE=27;
    public static final int T__76=76;
    public static final int RULE_DIGIT=18;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int RULE_INTEGER_SUFFIX=22;
    public static final int T__73=73;
    public static final int T__79=79;
    public static final int RULE_SIMPLE_ESCAPE_SEQUENCE=26;
    public static final int T__78=78;
    public static final int T__77=77;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int RULE_ESCAPE_SEQUENCE=25;
    public static final int RULE_HEXADECIMAL_ESCAPE_SEQUENCE=28;
    public static final int T__116=116;
    public static final int RULE_ENC_PREFIX=31;
    public static final int T__114=114;
    public static final int T__115=115;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int RULE_EXPONENT_PART=30;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_STRING_LITERAL=10;
    public static final int RULE_FRACTIONAL_CONSTANT=29;
    public static final int T__107=107;
    public static final int T__108=108;
    public static final int T__109=109;
    public static final int T__59=59;
    public static final int T__103=103;
    public static final int T__104=104;
    public static final int T__105=105;
    public static final int T__106=106;
    public static final int T__111=111;
    public static final int T__110=110;
    public static final int RULE_INT=7;
    public static final int T__113=113;
    public static final int T__112=112;
    public static final int RULE_Q_CHAR=15;
    public static final int T__50=50;
    public static final int RULE_HEADER_NAME=16;
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
    public static final int RULE_PP_NUMBER=33;
    public static final int T__101=101;
    public static final int RULE_PREPROCESSING_OP_OR_PUNC=5;
    public static final int T__100=100;
    public static final int RULE_SL_COMMENT=36;
    public static final int RULE_HEXADECIMAL_DIGIT=11;
    public static final int T__39=39;
    public static final int RULE_UNIVERSAL_CHARACTER_NAME=13;
    public static final int RULE_WS=37;

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

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
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
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
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
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
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
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:14:7: ( '::' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:14:9: '::'
            {
            match("::"); 


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
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:15:7: ( '[' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:15:9: '['
            {
            match('['); 

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
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:16:7: ( ']' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:16:9: ']'
            {
            match(']'); 

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
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:17:7: ( 'alignas' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:17:9: 'alignas'
            {
            match("alignas"); 


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
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:18:7: ( '(' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:18:9: '('
            {
            match('('); 

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
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:19:7: ( '...' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:19:9: '...'
            {
            match("..."); 


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
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:20:7: ( ')' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:20:9: ')'
            {
            match(')'); 

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
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:21:7: ( ',' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:21:9: ','
            {
            match(','); 

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
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:22:7: ( 'const' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:22:9: 'const'
            {
            match("const"); 


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
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:23:7: ( 'volatile' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:23:9: 'volatile'
            {
            match("volatile"); 


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
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:24:7: ( '&' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:24:9: '&'
            {
            match('&'); 

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
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:25:7: ( '&&' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:25:9: '&&'
            {
            match("&&"); 


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
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:26:7: ( '->' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:26:9: '->'
            {
            match("->"); 


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
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:27:7: ( '*' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:27:9: '*'
            {
            match('*'); 

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
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:28:7: ( 'operator' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:28:9: 'operator'
            {
            match("operator"); 


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
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:29:7: ( '<' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:29:9: '<'
            {
            match('<'); 

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
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:30:7: ( '>' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:30:9: '>'
            {
            match('>'); 

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
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:31:7: ( 'new' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:31:9: 'new'
            {
            match("new"); 


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
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:32:7: ( 'delete' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:32:9: 'delete'
            {
            match("delete"); 


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
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:33:7: ( '+' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:33:9: '+'
            {
            match('+'); 

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
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:34:7: ( '-' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:34:9: '-'
            {
            match('-'); 

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
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:35:7: ( '/' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:35:9: '/'
            {
            match('/'); 

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
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:36:7: ( '%' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:36:9: '%'
            {
            match('%'); 

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
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:37:7: ( '^' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:37:9: '^'
            {
            match('^'); 

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
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:38:7: ( '|' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:38:9: '|'
            {
            match('|'); 

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
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:39:7: ( '~' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:39:9: '~'
            {
            match('~'); 

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
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:40:7: ( '!' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:40:9: '!'
            {
            match('!'); 

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
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:41:7: ( '=' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:41:9: '='
            {
            match('='); 

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
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:42:7: ( '+=' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:42:9: '+='
            {
            match("+="); 


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
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:43:7: ( '-=' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:43:9: '-='
            {
            match("-="); 


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
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:44:7: ( '*=' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:44:9: '*='
            {
            match("*="); 


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
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:45:7: ( '/=' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:45:9: '/='
            {
            match("/="); 


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
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:46:7: ( '%=' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:46:9: '%='
            {
            match("%="); 


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
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:47:7: ( '^=' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:47:9: '^='
            {
            match("^="); 


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
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:48:7: ( '&=' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:48:9: '&='
            {
            match("&="); 


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
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:49:7: ( '|=' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:49:9: '|='
            {
            match("|="); 


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
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:50:7: ( '<<' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:50:9: '<<'
            {
            match("<<"); 


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
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:51:7: ( '>>' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:51:9: '>>'
            {
            match(">>"); 


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
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:52:7: ( '>>=' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:52:9: '>>='
            {
            match(">>="); 


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
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:53:7: ( '<<=' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:53:9: '<<='
            {
            match("<<="); 


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
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:54:7: ( '==' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:54:9: '=='
            {
            match("=="); 


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
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:55:7: ( '!=' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:55:9: '!='
            {
            match("!="); 


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
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:56:7: ( '<=' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:56:9: '<='
            {
            match("<="); 


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
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:57:7: ( '>=' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:57:9: '>='
            {
            match(">="); 


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
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:58:7: ( '||' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:58:9: '||'
            {
            match("||"); 


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
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:59:7: ( '++' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:59:9: '++'
            {
            match("++"); 


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
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:60:7: ( '--' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:60:9: '--'
            {
            match("--"); 


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
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:61:7: ( '->*' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:61:9: '->*'
            {
            match("->*"); 


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
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:62:7: ( '()' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:62:9: '()'
            {
            match("()"); 


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
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:63:7: ( '[]' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:63:9: '[]'
            {
            match("[]"); 


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
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:64:7: ( '\"' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:64:9: '\"'
            {
            match('\"'); 

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
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:65:7: ( 'class' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:65:9: 'class'
            {
            match("class"); 


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
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:66:7: ( 'typename' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:66:9: 'typename'
            {
            match("typename"); 


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
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:67:7: ( 'template' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:67:9: 'template'
            {
            match("template"); 


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
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:68:7: ( 'catch' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:68:9: 'catch'
            {
            match("catch"); 


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
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:69:7: ( 'throw' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:69:9: 'throw'
            {
            match("throw"); 


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
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:70:7: ( 'noexcept' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:70:9: 'noexcept'
            {
            match("noexcept"); 


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
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:71:7: ( 'ConstantExpression' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:71:9: 'ConstantExpression'
            {
            match("ConstantExpression"); 


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
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:72:8: ( 'TypeId' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:72:10: 'TypeId'
            {
            match("TypeId"); 


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
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:73:8: ( 'IdExpression' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:73:10: 'IdExpression'
            {
            match("IdExpression"); 


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
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:74:8: ( 'ParameterDeclaration' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:74:10: 'ParameterDeclaration'
            {
            match("ParameterDeclaration"); 


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
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:75:8: ( 'Declaration' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:75:10: 'Declaration'
            {
            match("Declaration"); 


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
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:76:8: ( 'NestedNameSpecifier' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:76:10: 'NestedNameSpecifier'
            {
            match("NestedNameSpecifier"); 


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
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:77:8: ( 'AssignmentExpression' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:77:10: 'AssignmentExpression'
            {
            match("AssignmentExpression"); 


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
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:78:8: ( 'AlignmentExpression' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:78:10: 'AlignmentExpression'
            {
            match("AlignmentExpression"); 


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
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:79:8: ( 'TypeSpecifier' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:79:10: 'TypeSpecifier'
            {
            match("TypeSpecifier"); 


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
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:80:8: ( 'AbstractDeclarator' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:80:10: 'AbstractDeclarator'
            {
            match("AbstractDeclarator"); 


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
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:81:8: ( 'CompoundStatement' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:81:10: 'CompoundStatement'
            {
            match("CompoundStatement"); 


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
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:82:8: ( 'CtorInitializer' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:82:10: 'CtorInitializer'
            {
            match("CtorInitializer"); 


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
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:83:8: ( 'TypeIdList' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:83:10: 'TypeIdList'
            {
            match("TypeIdList"); 


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
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:84:8: ( 'UnqualifiedId' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:84:10: 'UnqualifiedId'
            {
            match("UnqualifiedId"); 


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
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:85:8: ( 'ParameterDeclarationClause' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:85:10: 'ParameterDeclarationClause'
            {
            match("ParameterDeclarationClause"); 


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
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:86:8: ( 'TrailingTypeSpecifier' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:86:10: 'TrailingTypeSpecifier'
            {
            match("TrailingTypeSpecifier"); 


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
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:87:8: ( 'ClassName' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:87:10: 'ClassName'
            {
            match("ClassName"); 


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
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:88:8: ( 'Initializer' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:88:10: 'Initializer'
            {
            match("Initializer"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__116"

    // $ANTLR start "RULE_HEX_QUAD"
    public final void mRULE_HEX_QUAD() throws RecognitionException {
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3020:24: ( RULE_HEXADECIMAL_DIGIT RULE_HEXADECIMAL_DIGIT RULE_HEXADECIMAL_DIGIT RULE_HEXADECIMAL_DIGIT )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3020:26: RULE_HEXADECIMAL_DIGIT RULE_HEXADECIMAL_DIGIT RULE_HEXADECIMAL_DIGIT RULE_HEXADECIMAL_DIGIT
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
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3022:40: ( ( '\\\\u' RULE_HEX_QUAD | '\\\\U' RULE_HEX_QUAD RULE_HEX_QUAD ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3022:42: ( '\\\\u' RULE_HEX_QUAD | '\\\\U' RULE_HEX_QUAD RULE_HEX_QUAD )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3022:42: ( '\\\\u' RULE_HEX_QUAD | '\\\\U' RULE_HEX_QUAD RULE_HEX_QUAD )
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
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3022:43: '\\\\u' RULE_HEX_QUAD
                    {
                    match("\\u"); 

                    mRULE_HEX_QUAD(); 

                    }
                    break;
                case 2 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3022:63: '\\\\U' RULE_HEX_QUAD RULE_HEX_QUAD
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
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3024:18: ( ( '<' ( RULE_H_CHAR )+ '>' | '\"' ( RULE_Q_CHAR )+ '\"' ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3024:20: ( '<' ( RULE_H_CHAR )+ '>' | '\"' ( RULE_Q_CHAR )+ '\"' )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3024:20: ( '<' ( RULE_H_CHAR )+ '>' | '\"' ( RULE_Q_CHAR )+ '\"' )
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
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3024:21: '<' ( RULE_H_CHAR )+ '>'
                    {
                    match('<'); 
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3024:25: ( RULE_H_CHAR )+
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
                    	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3024:25: RULE_H_CHAR
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
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3024:42: '\"' ( RULE_Q_CHAR )+ '\"'
                    {
                    match('\"'); 
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3024:46: ( RULE_Q_CHAR )+
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
                    	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3024:46: RULE_Q_CHAR
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
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3026:22: (~ ( ( '\\n' | '>' ) ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3026:24: ~ ( ( '\\n' | '>' ) )
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
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3028:22: (~ ( ( '\\n' | '\"' ) ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3028:24: ~ ( ( '\\n' | '\"' ) )
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

    // $ANTLR start "RULE_KEYWORD"
    public final void mRULE_KEYWORD() throws RecognitionException {
        try {
            int _type = RULE_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3030:14: ( ( 'alignas' | 'alignof' | 'asm' | 'auto' | 'bool' | 'break' | 'case' | 'catch' | 'char' | 'char16_t' | 'char32_t' | 'class' | 'const' | 'constexpr' | 'const_cast' | 'continue' | 'decltype' | 'default' | 'delete' | 'do' | 'double' | 'dynamic_cast' | 'else' | 'enum' | 'explicit' | 'export' | 'extern' | 'false' | 'float' | 'for' | 'friend' | 'goto' | 'if' | 'inline' | 'int' | 'long' | 'mutable' | 'namespace' | 'new' | 'noexcept' | 'nullptr' | 'operator' | 'private' | 'protected' | 'public' | 'register' | 'reinterpret_cast' | 'return' | 'short' | 'signed' | 'sizeof' | 'static' | 'static_assert' | 'static_cast' | 'struct' | 'switch' | 'template' | 'this' | 'thread_local' | 'throw' | 'true' | 'try' | 'typedef' | 'typeid' | 'typename' | 'union' | 'unsigned' | 'using' | 'virtual' | 'void' | 'volatile' | 'wchar_t' | 'while' ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3030:16: ( 'alignas' | 'alignof' | 'asm' | 'auto' | 'bool' | 'break' | 'case' | 'catch' | 'char' | 'char16_t' | 'char32_t' | 'class' | 'const' | 'constexpr' | 'const_cast' | 'continue' | 'decltype' | 'default' | 'delete' | 'do' | 'double' | 'dynamic_cast' | 'else' | 'enum' | 'explicit' | 'export' | 'extern' | 'false' | 'float' | 'for' | 'friend' | 'goto' | 'if' | 'inline' | 'int' | 'long' | 'mutable' | 'namespace' | 'new' | 'noexcept' | 'nullptr' | 'operator' | 'private' | 'protected' | 'public' | 'register' | 'reinterpret_cast' | 'return' | 'short' | 'signed' | 'sizeof' | 'static' | 'static_assert' | 'static_cast' | 'struct' | 'switch' | 'template' | 'this' | 'thread_local' | 'throw' | 'true' | 'try' | 'typedef' | 'typeid' | 'typename' | 'union' | 'unsigned' | 'using' | 'virtual' | 'void' | 'volatile' | 'wchar_t' | 'while' )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3030:16: ( 'alignas' | 'alignof' | 'asm' | 'auto' | 'bool' | 'break' | 'case' | 'catch' | 'char' | 'char16_t' | 'char32_t' | 'class' | 'const' | 'constexpr' | 'const_cast' | 'continue' | 'decltype' | 'default' | 'delete' | 'do' | 'double' | 'dynamic_cast' | 'else' | 'enum' | 'explicit' | 'export' | 'extern' | 'false' | 'float' | 'for' | 'friend' | 'goto' | 'if' | 'inline' | 'int' | 'long' | 'mutable' | 'namespace' | 'new' | 'noexcept' | 'nullptr' | 'operator' | 'private' | 'protected' | 'public' | 'register' | 'reinterpret_cast' | 'return' | 'short' | 'signed' | 'sizeof' | 'static' | 'static_assert' | 'static_cast' | 'struct' | 'switch' | 'template' | 'this' | 'thread_local' | 'throw' | 'true' | 'try' | 'typedef' | 'typeid' | 'typename' | 'union' | 'unsigned' | 'using' | 'virtual' | 'void' | 'volatile' | 'wchar_t' | 'while' )
            int alt5=73;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3030:17: 'alignas'
                    {
                    match("alignas"); 


                    }
                    break;
                case 2 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3030:27: 'alignof'
                    {
                    match("alignof"); 


                    }
                    break;
                case 3 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3030:37: 'asm'
                    {
                    match("asm"); 


                    }
                    break;
                case 4 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3030:43: 'auto'
                    {
                    match("auto"); 


                    }
                    break;
                case 5 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3030:50: 'bool'
                    {
                    match("bool"); 


                    }
                    break;
                case 6 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3030:57: 'break'
                    {
                    match("break"); 


                    }
                    break;
                case 7 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3030:65: 'case'
                    {
                    match("case"); 


                    }
                    break;
                case 8 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3030:72: 'catch'
                    {
                    match("catch"); 


                    }
                    break;
                case 9 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3030:80: 'char'
                    {
                    match("char"); 


                    }
                    break;
                case 10 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3030:87: 'char16_t'
                    {
                    match("char16_t"); 


                    }
                    break;
                case 11 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3030:98: 'char32_t'
                    {
                    match("char32_t"); 


                    }
                    break;
                case 12 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3030:109: 'class'
                    {
                    match("class"); 


                    }
                    break;
                case 13 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3030:117: 'const'
                    {
                    match("const"); 


                    }
                    break;
                case 14 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3030:125: 'constexpr'
                    {
                    match("constexpr"); 


                    }
                    break;
                case 15 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3030:137: 'const_cast'
                    {
                    match("const_cast"); 


                    }
                    break;
                case 16 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3030:150: 'continue'
                    {
                    match("continue"); 


                    }
                    break;
                case 17 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3030:161: 'decltype'
                    {
                    match("decltype"); 


                    }
                    break;
                case 18 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3030:172: 'default'
                    {
                    match("default"); 


                    }
                    break;
                case 19 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3030:182: 'delete'
                    {
                    match("delete"); 


                    }
                    break;
                case 20 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3030:191: 'do'
                    {
                    match("do"); 


                    }
                    break;
                case 21 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3030:196: 'double'
                    {
                    match("double"); 


                    }
                    break;
                case 22 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3030:205: 'dynamic_cast'
                    {
                    match("dynamic_cast"); 


                    }
                    break;
                case 23 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3030:220: 'else'
                    {
                    match("else"); 


                    }
                    break;
                case 24 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3030:227: 'enum'
                    {
                    match("enum"); 


                    }
                    break;
                case 25 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3030:234: 'explicit'
                    {
                    match("explicit"); 


                    }
                    break;
                case 26 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3030:245: 'export'
                    {
                    match("export"); 


                    }
                    break;
                case 27 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3030:254: 'extern'
                    {
                    match("extern"); 


                    }
                    break;
                case 28 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3030:263: 'false'
                    {
                    match("false"); 


                    }
                    break;
                case 29 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3030:271: 'float'
                    {
                    match("float"); 


                    }
                    break;
                case 30 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3030:279: 'for'
                    {
                    match("for"); 


                    }
                    break;
                case 31 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3030:285: 'friend'
                    {
                    match("friend"); 


                    }
                    break;
                case 32 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3030:294: 'goto'
                    {
                    match("goto"); 


                    }
                    break;
                case 33 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3030:301: 'if'
                    {
                    match("if"); 


                    }
                    break;
                case 34 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3030:306: 'inline'
                    {
                    match("inline"); 


                    }
                    break;
                case 35 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3030:315: 'int'
                    {
                    match("int"); 


                    }
                    break;
                case 36 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3030:321: 'long'
                    {
                    match("long"); 


                    }
                    break;
                case 37 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3030:328: 'mutable'
                    {
                    match("mutable"); 


                    }
                    break;
                case 38 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3030:338: 'namespace'
                    {
                    match("namespace"); 


                    }
                    break;
                case 39 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3030:350: 'new'
                    {
                    match("new"); 


                    }
                    break;
                case 40 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3030:356: 'noexcept'
                    {
                    match("noexcept"); 


                    }
                    break;
                case 41 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3030:367: 'nullptr'
                    {
                    match("nullptr"); 


                    }
                    break;
                case 42 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3030:377: 'operator'
                    {
                    match("operator"); 


                    }
                    break;
                case 43 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3030:388: 'private'
                    {
                    match("private"); 


                    }
                    break;
                case 44 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3030:398: 'protected'
                    {
                    match("protected"); 


                    }
                    break;
                case 45 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3030:410: 'public'
                    {
                    match("public"); 


                    }
                    break;
                case 46 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3030:419: 'register'
                    {
                    match("register"); 


                    }
                    break;
                case 47 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3030:430: 'reinterpret_cast'
                    {
                    match("reinterpret_cast"); 


                    }
                    break;
                case 48 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3030:449: 'return'
                    {
                    match("return"); 


                    }
                    break;
                case 49 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3030:458: 'short'
                    {
                    match("short"); 


                    }
                    break;
                case 50 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3030:466: 'signed'
                    {
                    match("signed"); 


                    }
                    break;
                case 51 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3030:475: 'sizeof'
                    {
                    match("sizeof"); 


                    }
                    break;
                case 52 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3030:484: 'static'
                    {
                    match("static"); 


                    }
                    break;
                case 53 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3030:493: 'static_assert'
                    {
                    match("static_assert"); 


                    }
                    break;
                case 54 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3030:509: 'static_cast'
                    {
                    match("static_cast"); 


                    }
                    break;
                case 55 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3030:523: 'struct'
                    {
                    match("struct"); 


                    }
                    break;
                case 56 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3030:532: 'switch'
                    {
                    match("switch"); 


                    }
                    break;
                case 57 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3030:541: 'template'
                    {
                    match("template"); 


                    }
                    break;
                case 58 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3030:552: 'this'
                    {
                    match("this"); 


                    }
                    break;
                case 59 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3030:559: 'thread_local'
                    {
                    match("thread_local"); 


                    }
                    break;
                case 60 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3030:574: 'throw'
                    {
                    match("throw"); 


                    }
                    break;
                case 61 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3030:582: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 62 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3030:589: 'try'
                    {
                    match("try"); 


                    }
                    break;
                case 63 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3030:595: 'typedef'
                    {
                    match("typedef"); 


                    }
                    break;
                case 64 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3030:605: 'typeid'
                    {
                    match("typeid"); 


                    }
                    break;
                case 65 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3030:614: 'typename'
                    {
                    match("typename"); 


                    }
                    break;
                case 66 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3030:625: 'union'
                    {
                    match("union"); 


                    }
                    break;
                case 67 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3030:633: 'unsigned'
                    {
                    match("unsigned"); 


                    }
                    break;
                case 68 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3030:644: 'using'
                    {
                    match("using"); 


                    }
                    break;
                case 69 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3030:652: 'virtual'
                    {
                    match("virtual"); 


                    }
                    break;
                case 70 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3030:662: 'void'
                    {
                    match("void"); 


                    }
                    break;
                case 71 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3030:669: 'volatile'
                    {
                    match("volatile"); 


                    }
                    break;
                case 72 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3030:680: 'wchar_t'
                    {
                    match("wchar_t"); 


                    }
                    break;
                case 73 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3030:690: 'while'
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
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3032:31: ( ( '{' | '}' | '[' | ']' | '#' | '##' | '(' | ')' | '<:' | ':>' | '<%' | '%>' | '%:' | '%:%:' | ';' | ':' | '...' | 'new' | 'delete' | '?' | '::' | '.' | '.*' | '+' | '-' | '*' | '/' | '%' | '^' | '&' | '|' | '~' | '!' | '=' | '<' | '>' | '+=' | '-=' | '*=' | '/=' | '%=' | '^=' | '&=' | '|=' | '<<' | '>>' | '<<=' | '>>=' | '==' | '!=' | '<=' | '>=' | '&&' | '||' | '++' | '--' | ',' | '->*' | '->' | 'and' | 'and_eq' | 'bitand' | 'bitor' | 'compl' | 'not' | 'not_eq' | 'or' | 'or_eq' | 'xor' | 'xor_eq' ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3032:33: ( '{' | '}' | '[' | ']' | '#' | '##' | '(' | ')' | '<:' | ':>' | '<%' | '%>' | '%:' | '%:%:' | ';' | ':' | '...' | 'new' | 'delete' | '?' | '::' | '.' | '.*' | '+' | '-' | '*' | '/' | '%' | '^' | '&' | '|' | '~' | '!' | '=' | '<' | '>' | '+=' | '-=' | '*=' | '/=' | '%=' | '^=' | '&=' | '|=' | '<<' | '>>' | '<<=' | '>>=' | '==' | '!=' | '<=' | '>=' | '&&' | '||' | '++' | '--' | ',' | '->*' | '->' | 'and' | 'and_eq' | 'bitand' | 'bitor' | 'compl' | 'not' | 'not_eq' | 'or' | 'or_eq' | 'xor' | 'xor_eq' )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3032:33: ( '{' | '}' | '[' | ']' | '#' | '##' | '(' | ')' | '<:' | ':>' | '<%' | '%>' | '%:' | '%:%:' | ';' | ':' | '...' | 'new' | 'delete' | '?' | '::' | '.' | '.*' | '+' | '-' | '*' | '/' | '%' | '^' | '&' | '|' | '~' | '!' | '=' | '<' | '>' | '+=' | '-=' | '*=' | '/=' | '%=' | '^=' | '&=' | '|=' | '<<' | '>>' | '<<=' | '>>=' | '==' | '!=' | '<=' | '>=' | '&&' | '||' | '++' | '--' | ',' | '->*' | '->' | 'and' | 'and_eq' | 'bitand' | 'bitor' | 'compl' | 'not' | 'not_eq' | 'or' | 'or_eq' | 'xor' | 'xor_eq' )
            int alt6=70;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3032:34: '{'
                    {
                    match('{'); 

                    }
                    break;
                case 2 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3032:38: '}'
                    {
                    match('}'); 

                    }
                    break;
                case 3 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3032:42: '['
                    {
                    match('['); 

                    }
                    break;
                case 4 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3032:46: ']'
                    {
                    match(']'); 

                    }
                    break;
                case 5 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3032:50: '#'
                    {
                    match('#'); 

                    }
                    break;
                case 6 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3032:54: '##'
                    {
                    match("##"); 


                    }
                    break;
                case 7 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3032:59: '('
                    {
                    match('('); 

                    }
                    break;
                case 8 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3032:63: ')'
                    {
                    match(')'); 

                    }
                    break;
                case 9 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3032:67: '<:'
                    {
                    match("<:"); 


                    }
                    break;
                case 10 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3032:72: ':>'
                    {
                    match(":>"); 


                    }
                    break;
                case 11 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3032:77: '<%'
                    {
                    match("<%"); 


                    }
                    break;
                case 12 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3032:82: '%>'
                    {
                    match("%>"); 


                    }
                    break;
                case 13 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3032:87: '%:'
                    {
                    match("%:"); 


                    }
                    break;
                case 14 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3032:92: '%:%:'
                    {
                    match("%:%:"); 


                    }
                    break;
                case 15 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3032:99: ';'
                    {
                    match(';'); 

                    }
                    break;
                case 16 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3032:103: ':'
                    {
                    match(':'); 

                    }
                    break;
                case 17 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3032:107: '...'
                    {
                    match("..."); 


                    }
                    break;
                case 18 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3032:113: 'new'
                    {
                    match("new"); 


                    }
                    break;
                case 19 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3032:119: 'delete'
                    {
                    match("delete"); 


                    }
                    break;
                case 20 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3032:128: '?'
                    {
                    match('?'); 

                    }
                    break;
                case 21 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3032:132: '::'
                    {
                    match("::"); 


                    }
                    break;
                case 22 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3032:137: '.'
                    {
                    match('.'); 

                    }
                    break;
                case 23 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3032:141: '.*'
                    {
                    match(".*"); 


                    }
                    break;
                case 24 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3032:146: '+'
                    {
                    match('+'); 

                    }
                    break;
                case 25 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3032:150: '-'
                    {
                    match('-'); 

                    }
                    break;
                case 26 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3032:154: '*'
                    {
                    match('*'); 

                    }
                    break;
                case 27 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3032:158: '/'
                    {
                    match('/'); 

                    }
                    break;
                case 28 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3032:162: '%'
                    {
                    match('%'); 

                    }
                    break;
                case 29 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3032:166: '^'
                    {
                    match('^'); 

                    }
                    break;
                case 30 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3032:170: '&'
                    {
                    match('&'); 

                    }
                    break;
                case 31 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3032:174: '|'
                    {
                    match('|'); 

                    }
                    break;
                case 32 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3032:178: '~'
                    {
                    match('~'); 

                    }
                    break;
                case 33 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3032:182: '!'
                    {
                    match('!'); 

                    }
                    break;
                case 34 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3032:186: '='
                    {
                    match('='); 

                    }
                    break;
                case 35 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3032:190: '<'
                    {
                    match('<'); 

                    }
                    break;
                case 36 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3032:194: '>'
                    {
                    match('>'); 

                    }
                    break;
                case 37 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3032:198: '+='
                    {
                    match("+="); 


                    }
                    break;
                case 38 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3032:203: '-='
                    {
                    match("-="); 


                    }
                    break;
                case 39 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3032:208: '*='
                    {
                    match("*="); 


                    }
                    break;
                case 40 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3032:213: '/='
                    {
                    match("/="); 


                    }
                    break;
                case 41 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3032:218: '%='
                    {
                    match("%="); 


                    }
                    break;
                case 42 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3032:223: '^='
                    {
                    match("^="); 


                    }
                    break;
                case 43 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3032:228: '&='
                    {
                    match("&="); 


                    }
                    break;
                case 44 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3032:233: '|='
                    {
                    match("|="); 


                    }
                    break;
                case 45 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3032:238: '<<'
                    {
                    match("<<"); 


                    }
                    break;
                case 46 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3032:243: '>>'
                    {
                    match(">>"); 


                    }
                    break;
                case 47 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3032:248: '<<='
                    {
                    match("<<="); 


                    }
                    break;
                case 48 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3032:254: '>>='
                    {
                    match(">>="); 


                    }
                    break;
                case 49 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3032:260: '=='
                    {
                    match("=="); 


                    }
                    break;
                case 50 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3032:265: '!='
                    {
                    match("!="); 


                    }
                    break;
                case 51 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3032:270: '<='
                    {
                    match("<="); 


                    }
                    break;
                case 52 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3032:275: '>='
                    {
                    match(">="); 


                    }
                    break;
                case 53 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3032:280: '&&'
                    {
                    match("&&"); 


                    }
                    break;
                case 54 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3032:285: '||'
                    {
                    match("||"); 


                    }
                    break;
                case 55 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3032:290: '++'
                    {
                    match("++"); 


                    }
                    break;
                case 56 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3032:295: '--'
                    {
                    match("--"); 


                    }
                    break;
                case 57 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3032:300: ','
                    {
                    match(','); 

                    }
                    break;
                case 58 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3032:304: '->*'
                    {
                    match("->*"); 


                    }
                    break;
                case 59 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3032:310: '->'
                    {
                    match("->"); 


                    }
                    break;
                case 60 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3032:315: 'and'
                    {
                    match("and"); 


                    }
                    break;
                case 61 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3032:321: 'and_eq'
                    {
                    match("and_eq"); 


                    }
                    break;
                case 62 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3032:330: 'bitand'
                    {
                    match("bitand"); 


                    }
                    break;
                case 63 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3032:339: 'bitor'
                    {
                    match("bitor"); 


                    }
                    break;
                case 64 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3032:347: 'compl'
                    {
                    match("compl"); 


                    }
                    break;
                case 65 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3032:355: 'not'
                    {
                    match("not"); 


                    }
                    break;
                case 66 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3032:361: 'not_eq'
                    {
                    match("not_eq"); 


                    }
                    break;
                case 67 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3032:370: 'or'
                    {
                    match("or"); 


                    }
                    break;
                case 68 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3032:375: 'or_eq'
                    {
                    match("or_eq"); 


                    }
                    break;
                case 69 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3032:383: 'xor'
                    {
                    match("xor"); 


                    }
                    break;
                case 70 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3032:389: 'xor_eq'
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
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3034:9: ( ( RULE_NONDIGIT | RULE_UNIVERSAL_CHARACTER_NAME ) ( RULE_DIGIT | RULE_NONDIGIT | RULE_UNIVERSAL_CHARACTER_NAME )* )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3034:11: ( RULE_NONDIGIT | RULE_UNIVERSAL_CHARACTER_NAME ) ( RULE_DIGIT | RULE_NONDIGIT | RULE_UNIVERSAL_CHARACTER_NAME )*
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3034:11: ( RULE_NONDIGIT | RULE_UNIVERSAL_CHARACTER_NAME )
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
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3034:12: RULE_NONDIGIT
                    {
                    mRULE_NONDIGIT(); 

                    }
                    break;
                case 2 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3034:26: RULE_UNIVERSAL_CHARACTER_NAME
                    {
                    mRULE_UNIVERSAL_CHARACTER_NAME(); 

                    }
                    break;

            }

            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3034:57: ( RULE_DIGIT | RULE_NONDIGIT | RULE_UNIVERSAL_CHARACTER_NAME )*
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
            	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3034:58: RULE_DIGIT
            	    {
            	    mRULE_DIGIT(); 

            	    }
            	    break;
            	case 2 :
            	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3034:69: RULE_NONDIGIT
            	    {
            	    mRULE_NONDIGIT(); 

            	    }
            	    break;
            	case 3 :
            	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3034:83: RULE_UNIVERSAL_CHARACTER_NAME
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
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3036:24: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3036:26: ( 'a' .. 'z' | 'A' .. 'Z' | '_' )
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
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3038:21: ( '0' .. '9' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3038:23: '0' .. '9'
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
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3040:10: ( ( RULE_DECIMAL_LITERAL | RULE_OCTAL_LITERAL | RULE_HEXADECIMAL_LITERAL ) ( RULE_INTEGER_SUFFIX )? )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3040:12: ( RULE_DECIMAL_LITERAL | RULE_OCTAL_LITERAL | RULE_HEXADECIMAL_LITERAL ) ( RULE_INTEGER_SUFFIX )?
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3040:12: ( RULE_DECIMAL_LITERAL | RULE_OCTAL_LITERAL | RULE_HEXADECIMAL_LITERAL )
            int alt9=3;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>='1' && LA9_0<='9')) ) {
                alt9=1;
            }
            else if ( (LA9_0=='0') ) {
                int LA9_2 = input.LA(2);

                if ( (LA9_2=='X'||LA9_2=='x') ) {
                    alt9=3;
                }
                else {
                    alt9=2;}
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3040:13: RULE_DECIMAL_LITERAL
                    {
                    mRULE_DECIMAL_LITERAL(); 

                    }
                    break;
                case 2 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3040:34: RULE_OCTAL_LITERAL
                    {
                    mRULE_OCTAL_LITERAL(); 

                    }
                    break;
                case 3 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3040:53: RULE_HEXADECIMAL_LITERAL
                    {
                    mRULE_HEXADECIMAL_LITERAL(); 

                    }
                    break;

            }

            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3040:79: ( RULE_INTEGER_SUFFIX )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='L'||LA10_0=='U'||LA10_0=='l'||LA10_0=='u') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3040:79: RULE_INTEGER_SUFFIX
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
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3042:31: ( '1' .. '9' ( RULE_DIGIT )* )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3042:33: '1' .. '9' ( RULE_DIGIT )*
            {
            matchRange('1','9'); 
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3042:42: ( RULE_DIGIT )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='0' && LA11_0<='9')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3042:42: RULE_DIGIT
            	    {
            	    mRULE_DIGIT(); 

            	    }
            	    break;

            	default :
            	    break loop11;
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
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3044:29: ( '0' ( RULE_OCTAL_DIGIT )* )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3044:31: '0' ( RULE_OCTAL_DIGIT )*
            {
            match('0'); 
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3044:35: ( RULE_OCTAL_DIGIT )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='0' && LA12_0<='7')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3044:35: RULE_OCTAL_DIGIT
            	    {
            	    mRULE_OCTAL_DIGIT(); 

            	    }
            	    break;

            	default :
            	    break loop12;
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
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3046:35: ( ( '0x' | '0X' ) ( RULE_HEXADECIMAL_DIGIT )+ )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3046:37: ( '0x' | '0X' ) ( RULE_HEXADECIMAL_DIGIT )+
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3046:37: ( '0x' | '0X' )
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
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3046:38: '0x'
                    {
                    match("0x"); 


                    }
                    break;
                case 2 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3046:43: '0X'
                    {
                    match("0X"); 


                    }
                    break;

            }

            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3046:49: ( RULE_HEXADECIMAL_DIGIT )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>='0' && LA14_0<='9')||(LA14_0>='A' && LA14_0<='F')) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3046:49: RULE_HEXADECIMAL_DIGIT
            	    {
            	    mRULE_HEXADECIMAL_DIGIT(); 

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

        }
        finally {
        }
    }
    // $ANTLR end "RULE_HEXADECIMAL_LITERAL"

    // $ANTLR start "RULE_OCTAL_DIGIT"
    public final void mRULE_OCTAL_DIGIT() throws RecognitionException {
        try {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3048:27: ( '0' .. '7' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3048:29: '0' .. '7'
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
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3050:33: ( ( '0' .. '9' | 'A' .. 'F' ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3050:35: ( '0' .. '9' | 'A' .. 'F' )
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
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3052:30: ( ( ( 'u' | 'U' ) ( 'l' | 'L' | 'll' | 'LL' )? | ( 'l' | 'L' | 'll' | 'LL' ) ( 'u' | 'U' )? ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3052:32: ( ( 'u' | 'U' ) ( 'l' | 'L' | 'll' | 'LL' )? | ( 'l' | 'L' | 'll' | 'LL' ) ( 'u' | 'U' )? )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3052:32: ( ( 'u' | 'U' ) ( 'l' | 'L' | 'll' | 'LL' )? | ( 'l' | 'L' | 'll' | 'LL' ) ( 'u' | 'U' )? )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0=='U'||LA18_0=='u') ) {
                alt18=1;
            }
            else if ( (LA18_0=='L'||LA18_0=='l') ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3052:33: ( 'u' | 'U' ) ( 'l' | 'L' | 'll' | 'LL' )?
                    {
                    if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3052:43: ( 'l' | 'L' | 'll' | 'LL' )?
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
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3052:44: 'l'
                            {
                            match('l'); 

                            }
                            break;
                        case 2 :
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3052:48: 'L'
                            {
                            match('L'); 

                            }
                            break;
                        case 3 :
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3052:52: 'll'
                            {
                            match("ll"); 


                            }
                            break;
                        case 4 :
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3052:57: 'LL'
                            {
                            match("LL"); 


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3052:64: ( 'l' | 'L' | 'll' | 'LL' ) ( 'u' | 'U' )?
                    {
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3052:64: ( 'l' | 'L' | 'll' | 'LL' )
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
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3052:65: 'l'
                            {
                            match('l'); 

                            }
                            break;
                        case 2 :
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3052:69: 'L'
                            {
                            match('L'); 

                            }
                            break;
                        case 3 :
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3052:73: 'll'
                            {
                            match("ll"); 


                            }
                            break;
                        case 4 :
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3052:78: 'LL'
                            {
                            match("LL"); 


                            }
                            break;

                    }

                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3052:84: ( 'u' | 'U' )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0=='U'||LA17_0=='u') ) {
                        alt17=1;
                    }
                    switch (alt17) {
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
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3054:24: ( ( 'u' | 'U' | 'L' )? '\\'' ( RULE_C_CHAR )+ '\\'' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3054:26: ( 'u' | 'U' | 'L' )? '\\'' ( RULE_C_CHAR )+ '\\''
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3054:26: ( 'u' | 'U' | 'L' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0=='L'||LA19_0=='U'||LA19_0=='u') ) {
                alt19=1;
            }
            switch (alt19) {
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
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3054:46: ( RULE_C_CHAR )+
            int cnt20=0;
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>='\u0000' && LA20_0<='\t')||(LA20_0>='\u000B' && LA20_0<='&')||(LA20_0>='(' && LA20_0<='\uFFFF')) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3054:46: RULE_C_CHAR
            	    {
            	    mRULE_C_CHAR(); 

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
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3056:22: ( (~ ( ( '\\'' | '\\\\' | '\\n' ) ) | RULE_ESCAPE_SEQUENCE | RULE_UNIVERSAL_CHARACTER_NAME ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3056:24: (~ ( ( '\\'' | '\\\\' | '\\n' ) ) | RULE_ESCAPE_SEQUENCE | RULE_UNIVERSAL_CHARACTER_NAME )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3056:24: (~ ( ( '\\'' | '\\\\' | '\\n' ) ) | RULE_ESCAPE_SEQUENCE | RULE_UNIVERSAL_CHARACTER_NAME )
            int alt21=3;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>='\u0000' && LA21_0<='\t')||(LA21_0>='\u000B' && LA21_0<='&')||(LA21_0>='(' && LA21_0<='[')||(LA21_0>=']' && LA21_0<='\uFFFF')) ) {
                alt21=1;
            }
            else if ( (LA21_0=='\\') ) {
                int LA21_2 = input.LA(2);

                if ( (LA21_2=='\"'||LA21_2=='\''||(LA21_2>='0' && LA21_2<='7')||LA21_2=='?'||LA21_2=='\\'||(LA21_2>='a' && LA21_2<='b')||LA21_2=='f'||LA21_2=='n'||LA21_2=='r'||LA21_2=='t'||LA21_2=='v'||LA21_2=='x') ) {
                    alt21=2;
                }
                else if ( (LA21_2=='U'||LA21_2=='u') ) {
                    alt21=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 21, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3056:25: ~ ( ( '\\'' | '\\\\' | '\\n' ) )
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
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3056:45: RULE_ESCAPE_SEQUENCE
                    {
                    mRULE_ESCAPE_SEQUENCE(); 

                    }
                    break;
                case 3 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3056:66: RULE_UNIVERSAL_CHARACTER_NAME
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
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3058:31: ( ( RULE_SIMPLE_ESCAPE_SEQUENCE | RULE_OCTAL_ESCAPE_SEQUENCE | RULE_HEXADECIMAL_ESCAPE_SEQUENCE ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3058:33: ( RULE_SIMPLE_ESCAPE_SEQUENCE | RULE_OCTAL_ESCAPE_SEQUENCE | RULE_HEXADECIMAL_ESCAPE_SEQUENCE )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3058:33: ( RULE_SIMPLE_ESCAPE_SEQUENCE | RULE_OCTAL_ESCAPE_SEQUENCE | RULE_HEXADECIMAL_ESCAPE_SEQUENCE )
            int alt22=3;
            int LA22_0 = input.LA(1);

            if ( (LA22_0=='\\') ) {
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
                    alt22=1;
                    }
                    break;
                case 'x':
                    {
                    alt22=3;
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
                    alt22=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 22, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3058:34: RULE_SIMPLE_ESCAPE_SEQUENCE
                    {
                    mRULE_SIMPLE_ESCAPE_SEQUENCE(); 

                    }
                    break;
                case 2 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3058:62: RULE_OCTAL_ESCAPE_SEQUENCE
                    {
                    mRULE_OCTAL_ESCAPE_SEQUENCE(); 

                    }
                    break;
                case 3 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3058:89: RULE_HEXADECIMAL_ESCAPE_SEQUENCE
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
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3060:38: ( '\\\\' ( '\\'' | '\"' | '?' | '\\\\' | 'a' | 'b' | 'f' | 'n' | 'r' | 't' | 'v' ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3060:40: '\\\\' ( '\\'' | '\"' | '?' | '\\\\' | 'a' | 'b' | 'f' | 'n' | 'r' | 't' | 'v' )
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
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3062:37: ( '\\\\' RULE_OCTAL_DIGIT RULE_OCTAL_DIGIT RULE_OCTAL_DIGIT )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3062:39: '\\\\' RULE_OCTAL_DIGIT RULE_OCTAL_DIGIT RULE_OCTAL_DIGIT
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
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3064:43: ( '\\\\x' ( RULE_HEXADECIMAL_DIGIT )+ )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3064:45: '\\\\x' ( RULE_HEXADECIMAL_DIGIT )+
            {
            match("\\x"); 

            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3064:51: ( RULE_HEXADECIMAL_DIGIT )+
            int cnt23=0;
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>='0' && LA23_0<='9')||(LA23_0>='A' && LA23_0<='F')) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3064:51: RULE_HEXADECIMAL_DIGIT
            	    {
            	    mRULE_HEXADECIMAL_DIGIT(); 

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
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3066:23: ( ( RULE_FRACTIONAL_CONSTANT ( RULE_EXPONENT_PART )? | ( RULE_DIGIT )+ RULE_EXPONENT_PART ) ( 'f' | 'l' | 'F' | 'L' )? )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3066:25: ( RULE_FRACTIONAL_CONSTANT ( RULE_EXPONENT_PART )? | ( RULE_DIGIT )+ RULE_EXPONENT_PART ) ( 'f' | 'l' | 'F' | 'L' )?
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3066:25: ( RULE_FRACTIONAL_CONSTANT ( RULE_EXPONENT_PART )? | ( RULE_DIGIT )+ RULE_EXPONENT_PART )
            int alt26=2;
            alt26 = dfa26.predict(input);
            switch (alt26) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3066:26: RULE_FRACTIONAL_CONSTANT ( RULE_EXPONENT_PART )?
                    {
                    mRULE_FRACTIONAL_CONSTANT(); 
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3066:51: ( RULE_EXPONENT_PART )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0=='E'||LA24_0=='e') ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3066:51: RULE_EXPONENT_PART
                            {
                            mRULE_EXPONENT_PART(); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3066:71: ( RULE_DIGIT )+ RULE_EXPONENT_PART
                    {
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3066:71: ( RULE_DIGIT )+
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
                    	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3066:71: RULE_DIGIT
                    	    {
                    	    mRULE_DIGIT(); 

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

                    mRULE_EXPONENT_PART(); 

                    }
                    break;

            }

            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3066:103: ( 'f' | 'l' | 'F' | 'L' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0=='F'||LA27_0=='L'||LA27_0=='f'||LA27_0=='l') ) {
                alt27=1;
            }
            switch (alt27) {
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
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3068:35: ( ( ( RULE_DIGIT )* '.' ( RULE_DIGIT )+ | ( RULE_DIGIT )+ '.' ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3068:37: ( ( RULE_DIGIT )* '.' ( RULE_DIGIT )+ | ( RULE_DIGIT )+ '.' )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3068:37: ( ( RULE_DIGIT )* '.' ( RULE_DIGIT )+ | ( RULE_DIGIT )+ '.' )
            int alt31=2;
            alt31 = dfa31.predict(input);
            switch (alt31) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3068:38: ( RULE_DIGIT )* '.' ( RULE_DIGIT )+
                    {
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3068:38: ( RULE_DIGIT )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( ((LA28_0>='0' && LA28_0<='9')) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3068:38: RULE_DIGIT
                    	    {
                    	    mRULE_DIGIT(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop28;
                        }
                    } while (true);

                    match('.'); 
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3068:54: ( RULE_DIGIT )+
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
                    	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3068:54: RULE_DIGIT
                    	    {
                    	    mRULE_DIGIT(); 

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
                    break;
                case 2 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3068:66: ( RULE_DIGIT )+ '.'
                    {
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3068:66: ( RULE_DIGIT )+
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
                    	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3068:66: RULE_DIGIT
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
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3070:29: ( ( 'e' | 'E' ) ( '+' | '-' )? ( RULE_DIGIT )+ )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3070:31: ( 'e' | 'E' ) ( '+' | '-' )? ( RULE_DIGIT )+
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3070:41: ( '+' | '-' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0=='+'||LA32_0=='-') ) {
                alt32=1;
            }
            switch (alt32) {
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

            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3070:52: ( RULE_DIGIT )+
            int cnt33=0;
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( ((LA33_0>='0' && LA33_0<='9')) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3070:52: RULE_DIGIT
            	    {
            	    mRULE_DIGIT(); 

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
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3072:21: ( ( RULE_ENC_PREFIX )? '\"' ( RULE_SCHAR )+ '\"' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3072:23: ( RULE_ENC_PREFIX )? '\"' ( RULE_SCHAR )+ '\"'
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3072:23: ( RULE_ENC_PREFIX )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0=='L'||LA34_0=='U'||LA34_0=='u') ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3072:23: RULE_ENC_PREFIX
                    {
                    mRULE_ENC_PREFIX(); 

                    }
                    break;

            }

            match('\"'); 
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3072:44: ( RULE_SCHAR )+
            int cnt35=0;
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( ((LA35_0>='\u0000' && LA35_0<='\t')||(LA35_0>='\u000B' && LA35_0<='!')||(LA35_0>='#' && LA35_0<='\uFFFF')) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3072:44: RULE_SCHAR
            	    {
            	    mRULE_SCHAR(); 

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
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3074:26: ( ( 'u8' | 'u' | 'U' | 'L' ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3074:28: ( 'u8' | 'u' | 'U' | 'L' )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3074:28: ( 'u8' | 'u' | 'U' | 'L' )
            int alt36=4;
            switch ( input.LA(1) ) {
            case 'u':
                {
                int LA36_1 = input.LA(2);

                if ( (LA36_1=='8') ) {
                    alt36=1;
                }
                else {
                    alt36=2;}
                }
                break;
            case 'U':
                {
                alt36=3;
                }
                break;
            case 'L':
                {
                alt36=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }

            switch (alt36) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3074:29: 'u8'
                    {
                    match("u8"); 


                    }
                    break;
                case 2 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3074:34: 'u'
                    {
                    match('u'); 

                    }
                    break;
                case 3 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3074:38: 'U'
                    {
                    match('U'); 

                    }
                    break;
                case 4 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3074:42: 'L'
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
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3076:21: ( (~ ( ( '\"' | '\\\\' | '\\n' ) ) | RULE_ESCAPE_SEQUENCE | RULE_UNIVERSAL_CHARACTER_NAME ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3076:23: (~ ( ( '\"' | '\\\\' | '\\n' ) ) | RULE_ESCAPE_SEQUENCE | RULE_UNIVERSAL_CHARACTER_NAME )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3076:23: (~ ( ( '\"' | '\\\\' | '\\n' ) ) | RULE_ESCAPE_SEQUENCE | RULE_UNIVERSAL_CHARACTER_NAME )
            int alt37=3;
            int LA37_0 = input.LA(1);

            if ( ((LA37_0>='\u0000' && LA37_0<='\t')||(LA37_0>='\u000B' && LA37_0<='!')||(LA37_0>='#' && LA37_0<='[')||(LA37_0>=']' && LA37_0<='\uFFFF')) ) {
                alt37=1;
            }
            else if ( (LA37_0=='\\') ) {
                int LA37_2 = input.LA(2);

                if ( (LA37_2=='\"'||LA37_2=='\''||(LA37_2>='0' && LA37_2<='7')||LA37_2=='?'||LA37_2=='\\'||(LA37_2>='a' && LA37_2<='b')||LA37_2=='f'||LA37_2=='n'||LA37_2=='r'||LA37_2=='t'||LA37_2=='v'||LA37_2=='x') ) {
                    alt37=2;
                }
                else if ( (LA37_2=='U'||LA37_2=='u') ) {
                    alt37=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 37, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3076:24: ~ ( ( '\"' | '\\\\' | '\\n' ) )
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
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3076:43: RULE_ESCAPE_SEQUENCE
                    {
                    mRULE_ESCAPE_SEQUENCE(); 

                    }
                    break;
                case 3 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3076:64: RULE_UNIVERSAL_CHARACTER_NAME
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

    // $ANTLR start "RULE_PP_NUMBER"
    public final void mRULE_PP_NUMBER() throws RecognitionException {
        try {
            int _type = RULE_PP_NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3078:16: ( ( RULE_DIGIT | '.' RULE_DIGIT ) ( RULE_DIGIT | RULE_NONDIGIT | RULE_UNIVERSAL_CHARACTER_NAME | ( 'e' | 'E' ) ( '+' | '-' ) | '.' )* )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3078:18: ( RULE_DIGIT | '.' RULE_DIGIT ) ( RULE_DIGIT | RULE_NONDIGIT | RULE_UNIVERSAL_CHARACTER_NAME | ( 'e' | 'E' ) ( '+' | '-' ) | '.' )*
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3078:18: ( RULE_DIGIT | '.' RULE_DIGIT )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( ((LA38_0>='0' && LA38_0<='9')) ) {
                alt38=1;
            }
            else if ( (LA38_0=='.') ) {
                alt38=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3078:19: RULE_DIGIT
                    {
                    mRULE_DIGIT(); 

                    }
                    break;
                case 2 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3078:30: '.' RULE_DIGIT
                    {
                    match('.'); 
                    mRULE_DIGIT(); 

                    }
                    break;

            }

            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3078:46: ( RULE_DIGIT | RULE_NONDIGIT | RULE_UNIVERSAL_CHARACTER_NAME | ( 'e' | 'E' ) ( '+' | '-' ) | '.' )*
            loop39:
            do {
                int alt39=6;
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
                    alt39=1;
                    }
                    break;
                case 'E':
                case 'e':
                    {
                    int LA39_3 = input.LA(2);

                    if ( (LA39_3=='+'||LA39_3=='-') ) {
                        alt39=4;
                    }

                    else {
                        alt39=2;
                    }

                    }
                    break;
                case '\\':
                    {
                    alt39=3;
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
                    alt39=2;
                    }
                    break;
                case '.':
                    {
                    alt39=5;
                    }
                    break;

                }

                switch (alt39) {
            	case 1 :
            	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3078:47: RULE_DIGIT
            	    {
            	    mRULE_DIGIT(); 

            	    }
            	    break;
            	case 2 :
            	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3078:58: RULE_NONDIGIT
            	    {
            	    mRULE_NONDIGIT(); 

            	    }
            	    break;
            	case 3 :
            	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3078:72: RULE_UNIVERSAL_CHARACTER_NAME
            	    {
            	    mRULE_UNIVERSAL_CHARACTER_NAME(); 

            	    }
            	    break;
            	case 4 :
            	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3078:102: ( 'e' | 'E' ) ( '+' | '-' )
            	    {
            	    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}

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
            	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3078:122: '.'
            	    {
            	    match('.'); 

            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PP_NUMBER"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3080:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3080:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3080:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0=='\"') ) {
                alt42=1;
            }
            else if ( (LA42_0=='\'') ) {
                alt42=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3080:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3080:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop40:
                    do {
                        int alt40=3;
                        int LA40_0 = input.LA(1);

                        if ( (LA40_0=='\\') ) {
                            alt40=1;
                        }
                        else if ( ((LA40_0>='\u0000' && LA40_0<='!')||(LA40_0>='#' && LA40_0<='[')||(LA40_0>=']' && LA40_0<='\uFFFF')) ) {
                            alt40=2;
                        }


                        switch (alt40) {
                    	case 1 :
                    	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3080:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3080:66: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop40;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3080:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3080:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop41:
                    do {
                        int alt41=3;
                        int LA41_0 = input.LA(1);

                        if ( (LA41_0=='\\') ) {
                            alt41=1;
                        }
                        else if ( ((LA41_0>='\u0000' && LA41_0<='&')||(LA41_0>='(' && LA41_0<='[')||(LA41_0>=']' && LA41_0<='\uFFFF')) ) {
                            alt41=2;
                        }


                        switch (alt41) {
                    	case 1 :
                    	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3080:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3080:137: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop41;
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
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3082:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3082:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3082:24: ( options {greedy=false; } : . )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0=='*') ) {
                    int LA43_1 = input.LA(2);

                    if ( (LA43_1=='/') ) {
                        alt43=2;
                    }
                    else if ( ((LA43_1>='\u0000' && LA43_1<='.')||(LA43_1>='0' && LA43_1<='\uFFFF')) ) {
                        alt43=1;
                    }


                }
                else if ( ((LA43_0>='\u0000' && LA43_0<=')')||(LA43_0>='+' && LA43_0<='\uFFFF')) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3082:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop43;
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
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3084:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3084:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3084:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( ((LA44_0>='\u0000' && LA44_0<='\t')||(LA44_0>='\u000B' && LA44_0<='\f')||(LA44_0>='\u000E' && LA44_0<='\uFFFF')) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3084:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop44;
                }
            } while (true);

            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3084:40: ( ( '\\r' )? '\\n' )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0=='\n'||LA46_0=='\r') ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3084:41: ( '\\r' )? '\\n'
                    {
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3084:41: ( '\\r' )?
                    int alt45=2;
                    int LA45_0 = input.LA(1);

                    if ( (LA45_0=='\r') ) {
                        alt45=1;
                    }
                    switch (alt45) {
                        case 1 :
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3084:41: '\\r'
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
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3086:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3086:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3086:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt47=0;
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( ((LA47_0>='\t' && LA47_0<='\n')||LA47_0=='\r'||LA47_0==' ') ) {
                    alt47=1;
                }


                switch (alt47) {
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
            	    if ( cnt47 >= 1 ) break loop47;
                        EarlyExitException eee =
                            new EarlyExitException(47, input);
                        throw eee;
                }
                cnt47++;
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
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3088:16: ( . )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3088:18: .
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
        // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:8: ( T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | T__114 | T__115 | T__116 | RULE_HEADER_NAME | RULE_KEYWORD | RULE_PREPROCESSING_OP_OR_PUNC | RULE_ID | RULE_INT | RULE_CHARACTER_LITERAL | RULE_FLOATING_LITERAL | RULE_STRING_LITERAL | RULE_PP_NUMBER | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt48=92;
        alt48 = dfa48.predict(input);
        switch (alt48) {
            case 1 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:10: T__39
                {
                mT__39(); 

                }
                break;
            case 2 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:16: T__40
                {
                mT__40(); 

                }
                break;
            case 3 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:22: T__41
                {
                mT__41(); 

                }
                break;
            case 4 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:28: T__42
                {
                mT__42(); 

                }
                break;
            case 5 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:34: T__43
                {
                mT__43(); 

                }
                break;
            case 6 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:40: T__44
                {
                mT__44(); 

                }
                break;
            case 7 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:46: T__45
                {
                mT__45(); 

                }
                break;
            case 8 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:52: T__46
                {
                mT__46(); 

                }
                break;
            case 9 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:58: T__47
                {
                mT__47(); 

                }
                break;
            case 10 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:64: T__48
                {
                mT__48(); 

                }
                break;
            case 11 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:70: T__49
                {
                mT__49(); 

                }
                break;
            case 12 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:76: T__50
                {
                mT__50(); 

                }
                break;
            case 13 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:82: T__51
                {
                mT__51(); 

                }
                break;
            case 14 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:88: T__52
                {
                mT__52(); 

                }
                break;
            case 15 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:94: T__53
                {
                mT__53(); 

                }
                break;
            case 16 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:100: T__54
                {
                mT__54(); 

                }
                break;
            case 17 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:106: T__55
                {
                mT__55(); 

                }
                break;
            case 18 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:112: T__56
                {
                mT__56(); 

                }
                break;
            case 19 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:118: T__57
                {
                mT__57(); 

                }
                break;
            case 20 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:124: T__58
                {
                mT__58(); 

                }
                break;
            case 21 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:130: T__59
                {
                mT__59(); 

                }
                break;
            case 22 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:136: T__60
                {
                mT__60(); 

                }
                break;
            case 23 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:142: T__61
                {
                mT__61(); 

                }
                break;
            case 24 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:148: T__62
                {
                mT__62(); 

                }
                break;
            case 25 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:154: T__63
                {
                mT__63(); 

                }
                break;
            case 26 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:160: T__64
                {
                mT__64(); 

                }
                break;
            case 27 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:166: T__65
                {
                mT__65(); 

                }
                break;
            case 28 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:172: T__66
                {
                mT__66(); 

                }
                break;
            case 29 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:178: T__67
                {
                mT__67(); 

                }
                break;
            case 30 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:184: T__68
                {
                mT__68(); 

                }
                break;
            case 31 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:190: T__69
                {
                mT__69(); 

                }
                break;
            case 32 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:196: T__70
                {
                mT__70(); 

                }
                break;
            case 33 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:202: T__71
                {
                mT__71(); 

                }
                break;
            case 34 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:208: T__72
                {
                mT__72(); 

                }
                break;
            case 35 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:214: T__73
                {
                mT__73(); 

                }
                break;
            case 36 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:220: T__74
                {
                mT__74(); 

                }
                break;
            case 37 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:226: T__75
                {
                mT__75(); 

                }
                break;
            case 38 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:232: T__76
                {
                mT__76(); 

                }
                break;
            case 39 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:238: T__77
                {
                mT__77(); 

                }
                break;
            case 40 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:244: T__78
                {
                mT__78(); 

                }
                break;
            case 41 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:250: T__79
                {
                mT__79(); 

                }
                break;
            case 42 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:256: T__80
                {
                mT__80(); 

                }
                break;
            case 43 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:262: T__81
                {
                mT__81(); 

                }
                break;
            case 44 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:268: T__82
                {
                mT__82(); 

                }
                break;
            case 45 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:274: T__83
                {
                mT__83(); 

                }
                break;
            case 46 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:280: T__84
                {
                mT__84(); 

                }
                break;
            case 47 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:286: T__85
                {
                mT__85(); 

                }
                break;
            case 48 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:292: T__86
                {
                mT__86(); 

                }
                break;
            case 49 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:298: T__87
                {
                mT__87(); 

                }
                break;
            case 50 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:304: T__88
                {
                mT__88(); 

                }
                break;
            case 51 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:310: T__89
                {
                mT__89(); 

                }
                break;
            case 52 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:316: T__90
                {
                mT__90(); 

                }
                break;
            case 53 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:322: T__91
                {
                mT__91(); 

                }
                break;
            case 54 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:328: T__92
                {
                mT__92(); 

                }
                break;
            case 55 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:334: T__93
                {
                mT__93(); 

                }
                break;
            case 56 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:340: T__94
                {
                mT__94(); 

                }
                break;
            case 57 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:346: T__95
                {
                mT__95(); 

                }
                break;
            case 58 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:352: T__96
                {
                mT__96(); 

                }
                break;
            case 59 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:358: T__97
                {
                mT__97(); 

                }
                break;
            case 60 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:364: T__98
                {
                mT__98(); 

                }
                break;
            case 61 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:370: T__99
                {
                mT__99(); 

                }
                break;
            case 62 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:376: T__100
                {
                mT__100(); 

                }
                break;
            case 63 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:383: T__101
                {
                mT__101(); 

                }
                break;
            case 64 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:390: T__102
                {
                mT__102(); 

                }
                break;
            case 65 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:397: T__103
                {
                mT__103(); 

                }
                break;
            case 66 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:404: T__104
                {
                mT__104(); 

                }
                break;
            case 67 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:411: T__105
                {
                mT__105(); 

                }
                break;
            case 68 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:418: T__106
                {
                mT__106(); 

                }
                break;
            case 69 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:425: T__107
                {
                mT__107(); 

                }
                break;
            case 70 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:432: T__108
                {
                mT__108(); 

                }
                break;
            case 71 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:439: T__109
                {
                mT__109(); 

                }
                break;
            case 72 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:446: T__110
                {
                mT__110(); 

                }
                break;
            case 73 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:453: T__111
                {
                mT__111(); 

                }
                break;
            case 74 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:460: T__112
                {
                mT__112(); 

                }
                break;
            case 75 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:467: T__113
                {
                mT__113(); 

                }
                break;
            case 76 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:474: T__114
                {
                mT__114(); 

                }
                break;
            case 77 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:481: T__115
                {
                mT__115(); 

                }
                break;
            case 78 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:488: T__116
                {
                mT__116(); 

                }
                break;
            case 79 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:495: RULE_HEADER_NAME
                {
                mRULE_HEADER_NAME(); 

                }
                break;
            case 80 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:512: RULE_KEYWORD
                {
                mRULE_KEYWORD(); 

                }
                break;
            case 81 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:525: RULE_PREPROCESSING_OP_OR_PUNC
                {
                mRULE_PREPROCESSING_OP_OR_PUNC(); 

                }
                break;
            case 82 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:555: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 83 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:563: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 84 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:572: RULE_CHARACTER_LITERAL
                {
                mRULE_CHARACTER_LITERAL(); 

                }
                break;
            case 85 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:595: RULE_FLOATING_LITERAL
                {
                mRULE_FLOATING_LITERAL(); 

                }
                break;
            case 86 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:617: RULE_STRING_LITERAL
                {
                mRULE_STRING_LITERAL(); 

                }
                break;
            case 87 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:637: RULE_PP_NUMBER
                {
                mRULE_PP_NUMBER(); 

                }
                break;
            case 88 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:652: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 89 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:664: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 90 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:680: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 91 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:696: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 92 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:704: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA5 dfa5 = new DFA5(this);
    protected DFA6 dfa6 = new DFA6(this);
    protected DFA26 dfa26 = new DFA26(this);
    protected DFA31 dfa31 = new DFA31(this);
    protected DFA48 dfa48 = new DFA48(this);
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
            return "3030:16: ( 'alignas' | 'alignof' | 'asm' | 'auto' | 'bool' | 'break' | 'case' | 'catch' | 'char' | 'char16_t' | 'char32_t' | 'class' | 'const' | 'constexpr' | 'const_cast' | 'continue' | 'decltype' | 'default' | 'delete' | 'do' | 'double' | 'dynamic_cast' | 'else' | 'enum' | 'explicit' | 'export' | 'extern' | 'false' | 'float' | 'for' | 'friend' | 'goto' | 'if' | 'inline' | 'int' | 'long' | 'mutable' | 'namespace' | 'new' | 'noexcept' | 'nullptr' | 'operator' | 'private' | 'protected' | 'public' | 'register' | 'reinterpret_cast' | 'return' | 'short' | 'signed' | 'sizeof' | 'static' | 'static_assert' | 'static_cast' | 'struct' | 'switch' | 'template' | 'this' | 'thread_local' | 'throw' | 'true' | 'try' | 'typedef' | 'typeid' | 'typename' | 'union' | 'unsigned' | 'using' | 'virtual' | 'void' | 'volatile' | 'wchar_t' | 'while' )";
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
            return "3032:33: ( '{' | '}' | '[' | ']' | '#' | '##' | '(' | ')' | '<:' | ':>' | '<%' | '%>' | '%:' | '%:%:' | ';' | ':' | '...' | 'new' | 'delete' | '?' | '::' | '.' | '.*' | '+' | '-' | '*' | '/' | '%' | '^' | '&' | '|' | '~' | '!' | '=' | '<' | '>' | '+=' | '-=' | '*=' | '/=' | '%=' | '^=' | '&=' | '|=' | '<<' | '>>' | '<<=' | '>>=' | '==' | '!=' | '<=' | '>=' | '&&' | '||' | '++' | '--' | ',' | '->*' | '->' | 'and' | 'and_eq' | 'bitand' | 'bitor' | 'compl' | 'not' | 'not_eq' | 'or' | 'or_eq' | 'xor' | 'xor_eq' )";
        }
    }
    static final String DFA26_eotS =
        "\4\uffff";
    static final String DFA26_eofS =
        "\4\uffff";
    static final String DFA26_minS =
        "\2\56\2\uffff";
    static final String DFA26_maxS =
        "\1\71\1\145\2\uffff";
    static final String DFA26_acceptS =
        "\2\uffff\1\1\1\2";
    static final String DFA26_specialS =
        "\4\uffff}>";
    static final String[] DFA26_transitionS = {
            "\1\2\1\uffff\12\1",
            "\1\2\1\uffff\12\1\13\uffff\1\3\37\uffff\1\3",
            "",
            ""
    };

    static final short[] DFA26_eot = DFA.unpackEncodedString(DFA26_eotS);
    static final short[] DFA26_eof = DFA.unpackEncodedString(DFA26_eofS);
    static final char[] DFA26_min = DFA.unpackEncodedStringToUnsignedChars(DFA26_minS);
    static final char[] DFA26_max = DFA.unpackEncodedStringToUnsignedChars(DFA26_maxS);
    static final short[] DFA26_accept = DFA.unpackEncodedString(DFA26_acceptS);
    static final short[] DFA26_special = DFA.unpackEncodedString(DFA26_specialS);
    static final short[][] DFA26_transition;

    static {
        int numStates = DFA26_transitionS.length;
        DFA26_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA26_transition[i] = DFA.unpackEncodedString(DFA26_transitionS[i]);
        }
    }

    class DFA26 extends DFA {

        public DFA26(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 26;
            this.eot = DFA26_eot;
            this.eof = DFA26_eof;
            this.min = DFA26_min;
            this.max = DFA26_max;
            this.accept = DFA26_accept;
            this.special = DFA26_special;
            this.transition = DFA26_transition;
        }
        public String getDescription() {
            return "3066:25: ( RULE_FRACTIONAL_CONSTANT ( RULE_EXPONENT_PART )? | ( RULE_DIGIT )+ RULE_EXPONENT_PART )";
        }
    }
    static final String DFA31_eotS =
        "\3\uffff\1\4\1\uffff";
    static final String DFA31_eofS =
        "\5\uffff";
    static final String DFA31_minS =
        "\2\56\1\uffff\1\60\1\uffff";
    static final String DFA31_maxS =
        "\2\71\1\uffff\1\71\1\uffff";
    static final String DFA31_acceptS =
        "\2\uffff\1\1\1\uffff\1\2";
    static final String DFA31_specialS =
        "\5\uffff}>";
    static final String[] DFA31_transitionS = {
            "\1\2\1\uffff\12\1",
            "\1\3\1\uffff\12\1",
            "",
            "\12\2",
            ""
    };

    static final short[] DFA31_eot = DFA.unpackEncodedString(DFA31_eotS);
    static final short[] DFA31_eof = DFA.unpackEncodedString(DFA31_eofS);
    static final char[] DFA31_min = DFA.unpackEncodedStringToUnsignedChars(DFA31_minS);
    static final char[] DFA31_max = DFA.unpackEncodedStringToUnsignedChars(DFA31_maxS);
    static final short[] DFA31_accept = DFA.unpackEncodedString(DFA31_acceptS);
    static final short[] DFA31_special = DFA.unpackEncodedString(DFA31_specialS);
    static final short[][] DFA31_transition;

    static {
        int numStates = DFA31_transitionS.length;
        DFA31_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA31_transition[i] = DFA.unpackEncodedString(DFA31_transitionS[i]);
        }
    }

    class DFA31 extends DFA {

        public DFA31(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 31;
            this.eot = DFA31_eot;
            this.eof = DFA31_eof;
            this.min = DFA31_min;
            this.max = DFA31_max;
            this.accept = DFA31_accept;
            this.special = DFA31_special;
            this.transition = DFA31_transition;
        }
        public String getDescription() {
            return "3068:37: ( ( RULE_DIGIT )* '.' ( RULE_DIGIT )+ | ( RULE_DIGIT )+ '.' )";
        }
    }
    static final String DFA48_eotS =
        "\1\uffff\3\103\1\115\1\117\1\uffff\1\103\1\126\1\115\2\uffff\2"+
        "\103\1\143\1\147\1\151\1\103\1\161\1\164\1\103\1\172\1\176\1\u0080"+
        "\1\u0082\1\u0085\1\uffff\1\u0088\1\u008a\1\u008b\23\103\5\uffff"+
        "\2\103\1\76\2\u00b7\1\uffff\1\76\2\uffff\4\103\1\uffff\10\103\5"+
        "\uffff\4\103\3\uffff\1\u00db\2\uffff\6\103\3\uffff\1\u00eb\5\uffff"+
        "\1\103\1\115\1\u00f2\1\u00f3\2\115\2\uffff\1\u00f5\2\uffff\1\103"+
        "\1\u00fb\1\103\27\uffff\16\103\2\uffff\7\103\1\u00fb\20\103\1\uffff"+
        "\1\u00db\1\u00b7\1\u00bb\1\uffff\3\u00b7\2\u00bb\1\u00b7\1\u00bb"+
        "\3\uffff\1\103\1\u00fb\6\103\1\u00fb\2\103\1\u0152\1\103\1\115\1"+
        "\103\1\uffff\1\103\1\u00fb\1\103\1\115\2\uffff\1\u00db\1\u00bb\1"+
        "\u00db\11\103\7\uffff\2\103\1\u0169\5\uffff\4\103\1\uffff\1\103"+
        "\11\uffff\1\160\7\uffff\30\103\1\u00fb\23\103\1\115\1\u00bb\1\u00db"+
        "\10\u00b7\3\uffff\1\u01ae\4\103\1\u00fb\4\103\1\uffff\4\103\1\u00fb"+
        "\1\103\1\uffff\1\u00bb\1\u00db\5\103\2\u00fb\1\103\1\u00fb\1\103"+
        "\1\uffff\2\103\2\uffff\5\103\15\uffff\17\103\1\u00fb\3\103\2\u00fb"+
        "\3\103\1\u00fb\1\103\1\u00fb\23\103\2\u00b7\2\uffff\4\103\1\u0207"+
        "\1\103\1\u0209\1\u00fb\7\103\1\u0214\1\103\1\115\1\u0216\1\u0217"+
        "\5\103\1\115\5\103\3\uffff\1\160\1\uffff\1\160\4\uffff\20\103\1"+
        "\u00fb\1\103\1\115\13\103\1\u00fb\5\103\1\u00fb\1\103\1\u00fb\1"+
        "\103\1\u00fb\1\103\1\uffff\2\103\1\u00fb\1\103\1\uffff\1\103\1\uffff"+
        "\1\u00fb\2\103\1\115\3\103\1\115\2\103\1\uffff\1\103\2\uffff\5\103"+
        "\1\u025c\2\103\1\u00fb\1\103\4\uffff\4\103\1\u0269\13\103\1\115"+
        "\1\103\3\u00fb\3\103\1\u00fb\2\103\6\u00fb\2\103\1\115\1\uffff\1"+
        "\103\1\u00fb\2\103\1\u0282\2\103\1\u0285\1\u00fb\6\103\1\u00fb\1"+
        "\103\1\uffff\1\103\1\u00fb\1\103\4\uffff\5\103\1\uffff\14\103\2"+
        "\u00fb\5\103\1\u00fb\1\uffff\1\u02a9\1\u02aa\1\103\1\uffff\1\u02ac"+
        "\1\103\1\uffff\2\103\3\u00fb\1\u02b0\1\u02b1\1\u00fb\1\103\3\uffff"+
        "\20\103\1\u00fb\1\103\1\u00fb\3\103\1\u00fb\2\uffff\1\103\1\uffff"+
        "\2\u00fb\1\103\2\uffff\1\103\3\uffff\3\103\1\u02d1\14\103\1\u00fb"+
        "\4\103\1\u00fb\1\103\1\uffff\3\103\1\uffff\1\u02e7\20\103\1\uffff"+
        "\3\103\1\uffff\3\103\1\u02fe\1\103\1\u0300\7\103\3\u00fb\5\103\1"+
        "\u030d\1\uffff\1\103\1\uffff\12\103\1\u0319\1\103\1\uffff\5\103"+
        "\1\u0320\1\103\1\u00fb\3\103\1\uffff\6\103\1\uffff\3\103\1\u032e"+
        "\11\103\1\uffff\6\103\1\u00fb\1\103\1\u033f\6\103\1\u0346\1\uffff"+
        "\5\103\1\u034c\1\uffff\2\103\1\u034f\1\103\1\u0351\1\uffff\1\103"+
        "\1\u0354\1\uffff\1\u0355\1\uffff\1\u0356\1\103\3\uffff\4\103\1\u035c"+
        "\1\uffff";
    static final String DFA48_eofS =
        "\u035d\uffff";
    static final String DFA48_minS =
        "\1\0\1\145\2\141\1\72\1\135\1\uffff\1\154\1\51\1\56\2\uffff\1\141"+
        "\1\151\1\46\1\55\1\75\1\160\1\0\1\75\1\145\1\53\1\52\1\72\2\75\1"+
        "\uffff\2\75\1\0\1\154\1\162\1\144\1\141\2\145\1\142\1\42\1\151\1"+
        "\154\1\157\1\146\1\157\1\165\1\162\1\145\1\150\1\42\1\143\5\uffff"+
        "\1\157\1\42\1\125\2\56\1\uffff\1\0\2\uffff\1\165\1\160\1\155\1\151"+
        "\1\uffff\1\154\1\157\1\162\1\151\1\154\1\167\1\145\1\155\5\uffff"+
        "\1\151\1\155\1\164\1\144\2\uffff\2\56\2\uffff\1\155\1\141\1\163"+
        "\1\141\1\151\1\162\3\uffff\1\52\5\uffff\1\145\1\60\4\0\2\uffff\1"+
        "\75\2\uffff\1\143\1\60\1\156\24\uffff\2\0\1\uffff\1\155\1\157\1"+
        "\141\1\160\1\141\1\105\1\151\1\162\1\143\2\163\1\151\1\163\1\161"+
        "\2\uffff\1\157\1\145\1\164\1\163\1\165\1\160\1\164\1\60\1\154\1"+
        "\156\1\164\1\151\1\142\1\147\1\157\1\147\1\141\3\151\1\42\1\150"+
        "\1\151\1\162\1\uffff\2\56\1\53\1\uffff\3\56\2\60\2\56\1\42\1\0\1"+
        "\uffff\1\145\1\60\1\145\1\160\1\145\2\163\1\141\1\60\1\145\1\154"+
        "\1\60\1\170\1\60\1\145\1\uffff\1\147\1\60\1\157\1\60\2\uffff\1\56"+
        "\1\53\1\56\1\163\1\160\1\163\1\143\1\145\1\162\1\141\1\144\1\164"+
        "\7\uffff\1\162\1\145\1\0\5\uffff\1\145\1\154\1\141\1\142\1\uffff"+
        "\1\141\11\uffff\7\0\1\uffff\1\163\1\160\1\162\1\163\1\145\1\151"+
        "\1\170\1\164\1\141\1\154\1\164\1\151\1\147\1\164\1\165\1\154\2\141"+
        "\1\145\1\155\1\154\1\145\1\157\1\151\1\60\1\147\1\141\1\166\1\164"+
        "\1\154\1\151\1\156\1\165\1\162\1\156\1\145\1\164\1\165\1\164\1\157"+
        "\1\151\1\156\1\141\1\154\2\60\7\56\1\53\1\56\2\0\1\uffff\1\60\1"+
        "\144\1\154\1\167\1\141\1\60\1\145\1\164\1\156\1\160\1\uffff\1\143"+
        "\1\145\1\163\1\156\1\60\1\145\1\uffff\1\60\1\56\1\164\1\151\1\154"+
        "\1\163\1\150\2\60\1\164\1\60\1\165\1\uffff\1\141\1\161\2\uffff\2"+
        "\164\1\165\1\154\1\155\1\uffff\1\42\1\0\1\uffff\3\0\1\uffff\5\0"+
        "\1\164\1\157\1\111\1\163\1\111\1\154\1\160\1\151\1\155\1\141\1\145"+
        "\1\147\1\156\1\162\1\141\1\60\1\153\1\156\1\162\2\60\1\151\2\162"+
        "\1\60\1\156\1\60\1\142\1\141\1\145\1\151\1\163\1\164\1\162\1\164"+
        "\1\145\1\157\1\151\2\143\1\156\2\147\1\162\2\145\2\56\1\0\1\uffff"+
        "\1\141\1\145\1\144\1\141\1\60\1\144\2\60\1\144\1\164\1\145\1\161"+
        "\1\160\1\141\1\161\1\60\1\156\3\60\1\66\1\62\1\151\1\141\1\164\1"+
        "\60\1\145\1\171\1\154\1\145\1\151\12\0\1\141\1\165\1\156\1\116\1"+
        "\144\1\160\1\151\1\162\1\141\1\145\1\162\1\144\1\156\1\155\1\141"+
        "\1\154\1\60\1\144\1\60\1\143\1\164\1\156\1\145\1\154\1\164\2\143"+
        "\1\164\1\145\1\156\1\60\1\144\1\146\1\143\1\164\1\150\1\60\1\156"+
        "\1\60\1\137\1\60\1\161\1\0\1\155\1\146\1\60\1\164\1\uffff\1\137"+
        "\1\uffff\1\60\1\162\1\160\1\60\1\141\1\163\1\146\1\60\1\170\1\143"+
        "\1\uffff\1\165\2\uffff\2\137\2\154\1\157\1\60\1\160\1\164\1\60\1"+
        "\143\4\0\2\156\1\151\1\141\1\60\1\145\1\156\1\145\1\154\1\164\1"+
        "\141\1\116\1\155\1\145\1\143\1\151\1\60\1\151\3\60\2\145\1\164\1"+
        "\60\1\145\1\162\6\60\1\145\1\164\1\60\1\0\1\145\1\60\1\145\1\154"+
        "\1\60\1\164\1\143\2\60\1\160\1\141\1\145\2\164\1\145\1\60\1\162"+
        "\1\uffff\1\145\1\60\1\137\4\0\1\164\1\144\1\164\1\155\1\151\1\uffff"+
        "\1\143\1\147\1\163\1\151\1\145\1\164\1\141\1\145\1\156\1\164\1\146"+
        "\1\164\2\60\1\145\1\162\1\160\1\141\1\144\1\60\1\0\2\60\1\157\1"+
        "\uffff\1\60\1\145\1\uffff\1\162\1\163\6\60\1\143\3\0\1\105\1\123"+
        "\1\151\1\145\1\163\1\151\1\124\1\163\1\172\1\162\1\151\1\155\1\156"+
        "\1\164\1\104\1\151\1\60\1\144\1\60\1\162\1\163\1\141\1\60\2\uffff"+
        "\1\143\1\uffff\2\60\1\164\2\uffff\1\141\3\0\1\170\1\164\1\141\1"+
        "\60\1\164\1\146\1\171\1\151\1\145\1\104\1\157\1\145\1\164\1\105"+
        "\2\145\1\60\1\145\2\163\1\141\1\60\1\163\1\0\1\160\1\141\1\154\1"+
        "\uffff\1\60\1\151\1\160\1\157\1\162\1\145\1\156\1\123\1\105\1\170"+
        "\1\143\1\144\1\164\1\145\1\164\1\154\1\164\1\0\1\162\1\164\1\151"+
        "\1\uffff\2\145\1\156\1\60\1\143\1\60\1\160\1\170\1\160\1\154\1\111"+
        "\1\137\1\162\3\60\2\145\1\172\1\162\1\123\1\60\1\uffff\1\154\1\uffff"+
        "\1\145\1\160\1\162\1\141\1\144\1\143\1\164\1\163\1\155\1\145\1\60"+
        "\1\160\1\uffff\1\141\1\143\1\162\1\145\1\162\1\60\1\141\1\60\1\163"+
        "\1\145\1\162\1\uffff\1\145\1\162\1\151\1\145\1\163\1\141\1\uffff"+
        "\1\163\1\151\1\156\1\60\1\143\1\141\1\146\2\163\2\164\1\157\1\164"+
        "\1\uffff\1\151\1\164\1\151\1\163\1\151\1\157\1\60\1\156\1\60\1\146"+
        "\1\151\1\145\1\151\1\157\1\162\1\60\1\uffff\1\151\1\157\1\162\1"+
        "\157\1\156\1\60\1\uffff\1\145\1\156\1\60\1\156\1\60\1\uffff\1\162"+
        "\1\60\1\uffff\1\60\1\uffff\1\60\1\154\3\uffff\1\141\1\165\1\163"+
        "\1\145\1\60\1\uffff";
    static final String DFA48_maxS =
        "\1\uffff\1\171\1\162\1\165\1\72\1\135\1\uffff\1\165\1\51\1\71\2"+
        "\uffff\2\157\1\75\1\76\1\75\1\162\1\uffff\1\76\1\171\2\75\1\76\1"+
        "\75\1\174\1\uffff\2\75\1\uffff\1\164\1\171\1\156\1\141\2\145\1\163"+
        "\1\156\1\162\1\170\1\157\1\156\1\157\2\165\1\145\1\167\1\163\1\150"+
        "\5\uffff\1\157\1\47\1\165\2\172\1\uffff\1\uffff\2\uffff\1\171\1"+
        "\160\1\155\1\162\1\uffff\1\154\1\157\1\162\1\151\1\154\1\167\1\164"+
        "\1\155\5\uffff\1\151\1\155\1\164\1\144\2\uffff\1\56\1\172\2\uffff"+
        "\1\156\1\141\1\164\1\141\1\154\1\162\3\uffff\1\52\5\uffff\1\145"+
        "\1\172\4\uffff\2\uffff\1\75\2\uffff\1\154\1\172\1\156\24\uffff\2"+
        "\uffff\1\uffff\1\156\1\157\1\141\1\160\1\141\1\105\1\151\1\162\1"+
        "\143\2\163\1\151\1\163\1\161\2\uffff\1\157\1\145\1\164\1\163\1\165"+
        "\2\164\1\172\1\164\1\156\1\164\1\157\1\142\1\164\1\157\1\172\1\162"+
        "\1\151\1\163\1\151\1\42\1\150\1\151\1\162\1\uffff\2\172\1\71\1\uffff"+
        "\3\172\2\106\1\172\1\145\1\170\1\uffff\1\uffff\1\145\1\172\1\145"+
        "\1\160\1\157\2\163\1\141\1\172\1\145\1\154\1\172\1\170\1\172\1\145"+
        "\1\uffff\1\147\1\172\1\157\1\172\2\uffff\1\172\1\71\1\172\1\164"+
        "\1\160\1\163\1\143\1\145\1\162\1\141\1\144\1\164\7\uffff\1\162\1"+
        "\145\1\uffff\5\uffff\1\145\1\154\1\141\1\142\1\uffff\1\141\11\uffff"+
        "\7\uffff\1\uffff\1\163\1\160\1\162\1\163\1\145\1\151\1\170\1\164"+
        "\1\141\1\154\1\164\1\151\1\147\1\164\1\165\1\154\1\141\1\157\1\145"+
        "\1\155\1\157\1\145\1\157\1\151\1\172\1\147\1\141\1\166\1\164\1\154"+
        "\1\151\1\156\1\165\1\162\1\156\1\145\1\164\1\165\1\164\1\157\1\151"+
        "\1\156\1\141\1\154\1\172\1\71\11\172\2\uffff\1\uffff\1\172\1\156"+
        "\1\154\1\167\1\141\1\172\1\145\1\164\1\156\1\160\1\uffff\1\143\1"+
        "\145\1\163\1\156\1\172\1\145\1\uffff\1\71\1\172\1\164\1\151\1\154"+
        "\1\163\1\150\2\172\1\164\1\172\1\165\1\uffff\1\141\1\161\2\uffff"+
        "\2\164\1\165\1\154\1\155\1\uffff\1\170\1\uffff\1\uffff\3\uffff\1"+
        "\uffff\5\uffff\1\164\1\157\1\111\1\163\1\123\1\154\1\160\1\151\1"+
        "\155\1\141\1\145\1\147\1\156\1\162\1\141\1\172\1\153\1\156\1\162"+
        "\2\172\1\151\2\162\1\172\1\156\1\172\1\142\1\141\1\145\1\151\1\163"+
        "\1\164\1\162\1\164\1\145\1\157\1\151\2\143\1\156\2\147\1\162\2\145"+
        "\2\172\1\uffff\1\uffff\1\141\1\145\1\144\1\141\1\172\1\144\2\172"+
        "\1\144\1\164\1\145\1\161\1\160\1\157\1\161\1\172\1\156\3\172\1\66"+
        "\1\62\1\151\1\141\1\164\1\172\1\145\1\171\1\154\1\145\1\151\12\uffff"+
        "\1\141\1\165\1\156\1\116\1\144\1\160\1\151\1\162\1\141\1\145\1\162"+
        "\1\144\1\156\1\155\1\141\1\154\1\172\1\144\1\172\1\143\1\164\1\156"+
        "\1\145\1\154\1\164\2\143\1\164\1\145\1\156\1\172\1\144\1\146\1\143"+
        "\1\164\1\150\1\172\1\156\1\172\1\137\1\172\1\161\1\uffff\1\155\1"+
        "\146\1\172\1\164\1\uffff\1\137\1\uffff\1\172\1\162\1\160\1\172\1"+
        "\141\1\163\1\146\1\172\1\170\1\143\1\uffff\1\165\2\uffff\2\137\2"+
        "\154\1\157\1\172\1\160\1\164\1\172\1\143\4\uffff\2\156\1\151\1\141"+
        "\1\172\1\145\1\156\1\145\1\154\1\164\1\141\1\116\1\155\1\145\1\143"+
        "\1\151\1\172\1\151\3\172\2\145\1\164\1\172\1\145\1\162\6\172\1\145"+
        "\1\164\1\172\1\uffff\1\145\1\172\1\145\1\154\1\172\1\164\1\143\2"+
        "\172\1\160\1\141\1\145\2\164\1\145\1\172\1\162\1\uffff\1\145\1\172"+
        "\1\137\4\uffff\1\164\1\144\1\164\1\155\1\151\1\uffff\1\143\1\147"+
        "\1\163\1\151\1\145\1\164\1\141\1\145\1\156\1\164\1\146\1\164\2\172"+
        "\1\145\1\162\1\160\1\143\1\144\1\172\1\uffff\2\172\1\157\1\uffff"+
        "\1\172\1\145\1\uffff\1\162\1\163\6\172\1\143\3\uffff\1\105\1\123"+
        "\1\151\1\145\1\163\1\151\1\124\1\163\1\172\1\162\1\151\1\155\1\156"+
        "\1\164\1\104\1\151\1\172\1\144\1\172\1\162\1\163\1\141\1\172\2\uffff"+
        "\1\143\1\uffff\2\172\1\164\2\uffff\1\141\3\uffff\1\170\1\164\1\141"+
        "\1\172\1\164\1\146\1\171\1\151\1\145\1\104\1\157\1\145\1\164\1\105"+
        "\2\145\1\172\1\145\2\163\1\141\1\172\1\163\1\uffff\1\160\1\141\1"+
        "\154\1\uffff\1\172\1\151\1\160\1\157\1\162\1\145\1\156\1\123\1\105"+
        "\1\170\1\143\1\144\1\164\1\145\1\164\1\154\1\164\1\uffff\1\162\1"+
        "\164\1\151\1\uffff\2\145\1\156\1\172\1\143\1\172\1\160\1\170\1\160"+
        "\1\154\1\111\1\137\1\162\3\172\2\145\1\172\1\162\1\123\1\172\1\uffff"+
        "\1\154\1\uffff\1\145\1\160\1\162\1\141\1\144\1\143\1\164\1\163\1"+
        "\155\1\145\1\172\1\160\1\uffff\1\141\1\143\1\162\1\145\1\162\1\172"+
        "\1\141\1\172\1\163\1\145\1\162\1\uffff\1\145\1\162\1\151\1\145\1"+
        "\163\1\141\1\uffff\1\163\1\151\1\156\1\172\1\143\1\141\1\146\2\163"+
        "\2\164\1\157\1\164\1\uffff\1\151\1\164\1\151\1\163\1\151\1\157\1"+
        "\172\1\156\1\172\1\146\1\151\1\145\1\151\1\157\1\162\1\172\1\uffff"+
        "\1\151\1\157\1\162\1\157\1\156\1\172\1\uffff\1\145\1\156\1\172\1"+
        "\156\1\172\1\uffff\1\162\1\172\1\uffff\1\172\1\uffff\1\172\1\154"+
        "\3\uffff\1\141\1\165\1\163\1\145\1\172\1\uffff";
    static final String DFA48_acceptS =
        "\6\uffff\1\6\3\uffff\1\12\1\13\16\uffff\1\35\26\uffff\5\121\5\uffff"+
        "\1\122\1\uffff\1\133\1\134\4\uffff\1\122\10\uffff\1\4\1\121\1\65"+
        "\1\5\1\6\4\uffff\1\64\1\10\2\uffff\1\12\1\13\6\uffff\1\17\1\46\1"+
        "\16\1\uffff\1\41\1\62\1\30\1\42\1\21\6\uffff\1\117\1\23\1\uffff"+
        "\1\57\1\24\3\uffff\1\40\1\61\1\27\1\43\1\131\1\132\1\31\1\44\1\32"+
        "\1\45\1\33\1\47\1\60\1\34\1\35\1\55\1\36\1\54\1\37\1\66\2\uffff"+
        "\1\130\16\uffff\1\126\1\124\30\uffff\1\123\3\uffff\1\127\11\uffff"+
        "\1\133\17\uffff\1\4\4\uffff\1\11\1\125\14\uffff\1\17\1\46\1\63\1"+
        "\20\1\41\1\62\1\42\3\uffff\1\50\1\56\1\52\1\51\1\57\4\uffff\1\120"+
        "\1\uffff\1\40\1\61\1\43\1\44\1\45\1\47\1\60\1\55\1\54\7\uffff\1"+
        "\117\71\uffff\1\124\12\uffff\1\25\6\uffff\1\11\14\uffff\1\63\2\uffff"+
        "\1\53\1\52\5\uffff\1\126\2\uffff\1\117\3\uffff\1\117\66\uffff\1"+
        "\1\130\uffff\1\73\1\uffff\1\2\12\uffff\1\14\1\uffff\1\67\1\72\104"+
        "\uffff\1\26\14\uffff\1\76\30\uffff\1\3\2\uffff\1\7\43\uffff\1\70"+
        "\1\71\1\uffff\1\74\3\uffff\1\15\1\22\37\uffff\1\115\25\uffff\1\111"+
        "\26\uffff\1\116\1\uffff\1\101\14\uffff\1\77\13\uffff\1\105\6\uffff"+
        "\1\112\15\uffff\1\110\20\uffff\1\107\6\uffff\1\75\5\uffff\1\106"+
        "\2\uffff\1\102\1\uffff\1\104\2\uffff\1\100\1\103\1\114\5\uffff\1"+
        "\113";
    static final String DFA48_specialS =
        "\1\71\21\uffff\1\56\12\uffff\1\70\36\uffff\1\50\57\uffff\1\1\1"+
        "\3\1\47\1\46\34\uffff\1\13\1\61\66\uffff\1\53\54\uffff\1\6\24\uffff"+
        "\1\73\1\32\1\54\1\0\1\34\1\62\1\65\70\uffff\1\57\1\41\53\uffff\1"+
        "\45\1\uffff\1\20\1\64\1\51\1\uffff\1\7\1\72\1\5\1\27\1\66\60\uffff"+
        "\1\42\40\uffff\1\2\1\55\1\17\1\40\1\52\1\63\1\33\1\4\1\21\1\60\52"+
        "\uffff\1\43\37\uffff\1\35\1\16\1\30\1\24\44\uffff\1\44\25\uffff"+
        "\1\36\1\14\1\22\1\12\32\uffff\1\15\20\uffff\1\37\1\25\1\31\41\uffff"+
        "\1\67\1\10\1\23\27\uffff\1\26\25\uffff\1\11\171\uffff}>";
    static final String[] DFA48_transitionS = {
            "\11\76\2\75\2\76\1\75\22\76\1\75\1\33\1\35\1\63\1\76\1\27\1"+
            "\16\1\74\1\10\1\12\1\20\1\25\1\13\1\17\1\11\1\26\1\72\11\71"+
            "\1\4\1\64\1\22\1\34\1\23\1\65\1\76\1\44\1\73\1\36\1\42\4\73"+
            "\1\40\2\73\1\67\1\73\1\43\1\73\1\41\3\73\1\37\1\45\5\73\1\5"+
            "\1\70\1\6\1\30\1\73\1\76\1\7\1\46\1\14\1\24\1\47\1\2\1\50\1"+
            "\73\1\51\2\73\1\52\1\53\1\3\1\21\1\54\1\73\1\55\1\56\1\1\1\57"+
            "\1\15\1\60\1\66\2\73\1\61\1\31\1\62\1\32\uff81\76",
            "\1\101\2\uffff\1\102\11\uffff\1\77\6\uffff\1\100",
            "\1\104\12\uffff\1\105\2\uffff\1\106\2\uffff\1\107",
            "\1\113\3\uffff\1\111\11\uffff\1\112\5\uffff\1\110",
            "\1\114",
            "\1\116",
            "",
            "\1\121\1\uffff\1\124\4\uffff\1\122\1\uffff\1\123",
            "\1\125",
            "\1\127\1\uffff\12\130",
            "",
            "",
            "\1\135\6\uffff\1\136\3\uffff\1\134\2\uffff\1\133",
            "\1\140\5\uffff\1\137",
            "\1\141\26\uffff\1\142",
            "\1\146\17\uffff\1\145\1\144",
            "\1\150",
            "\1\152\1\uffff\1\153",
            "\12\160\1\uffff\32\160\1\157\24\160\1\156\1\160\1\154\1\155"+
            "\1\uffff\uffc1\160",
            "\1\163\1\162",
            "\1\165\11\uffff\1\166\11\uffff\1\167",
            "\1\171\21\uffff\1\170",
            "\1\174\4\uffff\1\175\15\uffff\1\173",
            "\1\115\2\uffff\1\177\1\115",
            "\1\u0081",
            "\1\u0083\76\uffff\1\u0084",
            "",
            "\1\u0087",
            "\1\u0089",
            "\12\u008d\1\u008e\27\u008d\1\u008e\71\u008d\1\u008c\uffa3"+
            "\u008d",
            "\1\u0091\2\uffff\1\u008f\4\uffff\1\u0090",
            "\1\u0093\6\uffff\1\u0092",
            "\1\u0094\11\uffff\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u009b\11\uffff\1\u009a\6\uffff\1\u0099",
            "\1\u009d\4\uffff\1\u009e\106\uffff\1\u009c",
            "\1\u00a1\5\uffff\1\u009f\2\uffff\1\u00a0",
            "\1\u00a2\1\uffff\1\u00a3\11\uffff\1\u00a4",
            "\1\u00a5",
            "\1\u00a6\7\uffff\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa\2\uffff\1\u00ab",
            "\1\u00ac",
            "\1\u00ad\1\u00ae\12\uffff\1\u00af\2\uffff\1\u00b0",
            "\1\u009d\4\uffff\1\u009e\20\uffff\1\u00b3\65\uffff\1\u00b1"+
            "\4\uffff\1\u00b2",
            "\1\u00b4\4\uffff\1\u00b5",
            "",
            "",
            "",
            "",
            "",
            "\1\u00b6",
            "\1\u009d\4\uffff\1\u009e",
            "\1\103\37\uffff\1\103",
            "\1\u00b8\1\uffff\12\u00b9\7\uffff\4\u00bb\1\u00ba\6\u00bb"+
            "\1\u00be\10\u00bb\1\u00bc\5\u00bb\1\uffff\1\u00bb\2\uffff\1"+
            "\u00bb\1\uffff\4\u00bb\1\u00ba\6\u00bb\1\u00bd\10\u00bb\1\u00bc"+
            "\5\u00bb",
            "\1\u00b8\1\uffff\10\u00c1\2\u00c2\7\uffff\4\u00bb\1\u00ba"+
            "\6\u00bb\1\u00be\10\u00bb\1\u00bc\2\u00bb\1\u00c0\2\u00bb\1"+
            "\uffff\1\u00bb\2\uffff\1\u00bb\1\uffff\4\u00bb\1\u00ba\6\u00bb"+
            "\1\u00bd\10\u00bb\1\u00bc\2\u00bb\1\u00bf\2\u00bb",
            "",
            "\12\u00c4\1\u008e\34\u00c4\1\u008e\64\u00c4\1\u00c3\uffa3"+
            "\u00c4",
            "",
            "",
            "\1\u00c6\3\uffff\1\u00c7",
            "\1\u00c8",
            "\1\u00c9",
            "\1\u00cb\10\uffff\1\u00ca",
            "",
            "\1\u00cc",
            "\1\u00cd",
            "\1\u00ce",
            "\1\u00cf",
            "\1\u00d0",
            "\1\u00d1",
            "\1\u00d2\16\uffff\1\u00d3",
            "\1\u00d4",
            "",
            "",
            "",
            "",
            "",
            "\1\u00d6",
            "\1\u00d7",
            "\1\u00d8",
            "\1\u00d9",
            "",
            "",
            "\1\u00da",
            "\1\u00bb\1\uffff\12\u00dc\7\uffff\4\u00bb\1\u00dd\1\u00de"+
            "\5\u00bb\1\u00de\16\u00bb\1\uffff\1\u00bb\2\uffff\1\u00bb\1"+
            "\uffff\4\u00bb\1\u00dd\1\u00de\5\u00bb\1\u00de\16\u00bb",
            "",
            "",
            "\1\u00e0\1\u00df",
            "\1\u00e1",
            "\1\u00e3\1\u00e2",
            "\1\u00e4",
            "\1\u00e6\2\uffff\1\u00e5",
            "\1\u00e7",
            "",
            "",
            "",
            "\1\u00ea",
            "",
            "",
            "",
            "",
            "",
            "\1\u00ef",
            "\12\103\7\uffff\32\103\1\uffff\1\103\2\uffff\1\u00f0\1\uffff"+
            "\32\103",
            "\12\160\1\uffff\62\160\1\u00f1\uffc2\160",
            "\12\160\1\uffff\ufff5\160",
            "\12\160\1\uffff\ufff5\160",
            "\12\160\1\uffff\ufff5\160",
            "",
            "",
            "\1\u00f4",
            "",
            "",
            "\1\u00f8\2\uffff\1\u00f9\5\uffff\1\u00f7",
            "\12\103\7\uffff\32\103\1\uffff\1\103\2\uffff\1\103\1\uffff"+
            "\24\103\1\u00fa\5\103",
            "\1\u00fc",
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
            "\12\160\1\uffff\27\160\1\u0106\4\160\1\u010b\10\160\10\u010c"+
            "\7\160\1\u0108\25\160\1\u010a\6\160\1\u010b\4\160\1\u0108\1"+
            "\u010b\3\160\1\u010b\7\160\1\u010b\3\160\1\u010b\1\160\1\u010b"+
            "\1\u0107\1\u0108\1\160\1\u0109\uff87\160",
            "\12\u008d\1\u008e\27\u008d\1\u010d\71\u008d\1\u008c\uffa3"+
            "\u008d",
            "",
            "\1\u010f\1\u010e",
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
            "\1\u011b",
            "\1\u011c",
            "",
            "",
            "\1\u011d",
            "\1\u011e",
            "\1\u011f",
            "\1\u0120",
            "\1\u0121",
            "\1\u0122\3\uffff\1\u0123",
            "\1\u0124",
            "\12\103\7\uffff\32\103\1\uffff\1\103\2\uffff\1\103\1\uffff"+
            "\32\103",
            "\1\u0125\7\uffff\1\u0126",
            "\1\u0127",
            "\1\u0128",
            "\1\u0129\5\uffff\1\u012a",
            "\1\u012b",
            "\1\u012c\1\uffff\1\u012d\12\uffff\1\u012e",
            "\1\u012f",
            "\1\u0130\22\uffff\1\u0131",
            "\1\u0132\20\uffff\1\u0133",
            "\1\u0134",
            "\1\u0135\11\uffff\1\u0136",
            "\1\u0137",
            "\1\u009d",
            "\1\u0138",
            "\1\u0139",
            "\1\u013a",
            "",
            "\1\u00bb\1\uffff\12\u00dc\7\uffff\4\u00bb\1\u00dd\1\u00de"+
            "\5\u00bb\1\u00de\16\u00bb\1\uffff\1\u00bb\2\uffff\1\u00bb\1"+
            "\uffff\4\u00bb\1\u00dd\1\u00de\5\u00bb\1\u00de\16\u00bb",
            "\1\u00b8\1\uffff\12\u00b9\7\uffff\4\u00bb\1\u00ba\6\u00bb"+
            "\1\u00be\10\u00bb\1\u00bc\5\u00bb\1\uffff\1\u00bb\2\uffff\1"+
            "\u00bb\1\uffff\4\u00bb\1\u00ba\6\u00bb\1\u00bd\10\u00bb\1\u00bc"+
            "\5\u00bb",
            "\1\u013b\1\uffff\1\u013b\2\uffff\12\u013c",
            "",
            "\1\u00bb\1\uffff\12\u00bb\7\uffff\13\u00bb\1\u013e\16\u00bb"+
            "\1\uffff\1\u00bb\2\uffff\1\u00bb\1\uffff\13\u00bb\1\u013d\16"+
            "\u00bb",
            "\1\u00bb\1\uffff\12\u00bb\7\uffff\24\u00bb\1\u0140\5\u00bb"+
            "\1\uffff\1\u00bb\2\uffff\1\u00bb\1\uffff\13\u00bb\1\u013f\10"+
            "\u00bb\1\u0140\5\u00bb",
            "\1\u00bb\1\uffff\12\u00bb\7\uffff\13\u00bb\1\u0141\10\u00bb"+
            "\1\u0140\5\u00bb\1\uffff\1\u00bb\2\uffff\1\u00bb\1\uffff\24"+
            "\u00bb\1\u0140\5\u00bb",
            "\12\u0142\7\uffff\4\u0144\1\u0143\1\u0144",
            "\12\u0142\7\uffff\4\u0144\1\u0143\1\u0144",
            "\1\u00b8\1\uffff\10\u00c1\2\u00c2\7\uffff\4\u00bb\1\u00ba"+
            "\6\u00bb\1\u00be\10\u00bb\1\u00bc\5\u00bb\1\uffff\1\u00bb\2"+
            "\uffff\1\u00bb\1\uffff\4\u00bb\1\u00ba\6\u00bb\1\u00bd\10\u00bb"+
            "\1\u00bc\5\u00bb",
            "\1\u00b8\1\uffff\12\u00c2\13\uffff\1\u00ba\37\uffff\1\u00ba",
            "\1\u0145\4\uffff\1\u0145\10\uffff\10\u009e\7\uffff\1\u009e"+
            "\25\uffff\1\u009e\6\uffff\1\u0145\4\uffff\1\u009e\1\u0145\3"+
            "\uffff\1\u0145\7\uffff\1\u0145\3\uffff\1\u0145\1\uffff\1\u0145"+
            "\1\u0146\1\u009e\1\uffff\1\u009e",
            "\12\u00c4\1\u008e\34\u00c4\1\u0147\64\u00c4\1\u00c3\uffa3"+
            "\u00c4",
            "",
            "\1\u0148",
            "\12\103\7\uffff\32\103\1\uffff\1\103\2\uffff\1\103\1\uffff"+
            "\32\103",
            "\1\u0149",
            "\1\u014a",
            "\1\u014c\11\uffff\1\u014b",
            "\1\u014d",
            "\1\u014e",
            "\1\u014f",
            "\12\103\7\uffff\32\103\1\uffff\1\103\2\uffff\1\103\1\uffff"+
            "\32\103",
            "\1\u0150",
            "\1\u0151",
            "\12\103\7\uffff\32\103\1\uffff\1\103\2\uffff\1\103\1\uffff"+
            "\32\103",
            "\1\u0153",
            "\12\103\7\uffff\32\103\1\uffff\1\103\2\uffff\1\u0154\1\uffff"+
            "\32\103",
            "\1\u0155",
            "",
            "\1\u0156",
            "\12\103\7\uffff\32\103\1\uffff\1\103\2\uffff\1\103\1\uffff"+
            "\32\103",
            "\1\u0157",
            "\12\103\7\uffff\32\103\1\uffff\1\103\2\uffff\1\u0158\1\uffff"+
            "\32\103",
            "",
            "",
            "\1\u00bb\1\uffff\12\u00dc\7\uffff\4\u00bb\1\u00dd\1\u00de"+
            "\5\u00bb\1\u00de\16\u00bb\1\uffff\1\u00bb\2\uffff\1\u00bb\1"+
            "\uffff\4\u00bb\1\u00dd\1\u00de\5\u00bb\1\u00de\16\u00bb",
            "\1\u015a\1\uffff\1\u015a\2\uffff\12\u015b",
            "\1\u00bb\1\uffff\12\u00bb\7\uffff\32\u00bb\1\uffff\1\u00bb"+
            "\2\uffff\1\u00bb\1\uffff\32\u00bb",
            "\1\u015c\1\u015d",
            "\1\u015e",
            "\1\u015f",
            "\1\u0160",
            "\1\u0161",
            "\1\u0162",
            "\1\u0163",
            "\1\u0164",
            "\1\u0165",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0167",
            "\1\u0168",
            "\12\160\1\uffff\ufff5\160",
            "",
            "",
            "",
            "",
            "",
            "\1\u016b",
            "\1\u016c",
            "\1\u016d",
            "\1\u016e",
            "",
            "\1\u016f",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\u0172\1\u008e\27\u0172\1\u0170\71\u0172\1\u0171\uffa3"+
            "\u0172",
            "\12\u0176\1\u008e\27\u0176\1\u0173\15\u0176\12\u0174\7\u0176"+
            "\6\u0174\25\u0176\1\u0175\uffa3\u0176",
            "\12\u0178\1\uffff\27\u0178\1\u0177\71\u0178\1\u0179\uffa3"+
            "\u0178",
            "\12\160\1\uffff\45\160\12\u017a\7\160\6\u017a\uffb9\160",
            "\12\160\1\uffff\45\160\12\u017b\7\160\6\u017b\uffb9\160",
            "\12\u008d\1\u008e\27\u008d\1\u010d\71\u008d\1\u008c\uffa3"+
            "\u008d",
            "\12\160\1\uffff\45\160\10\u017c\uffc8\160",
            "",
            "\1\u017d",
            "\1\u017e",
            "\1\u017f",
            "\1\u0180",
            "\1\u0181",
            "\1\u0182",
            "\1\u0183",
            "\1\u0184",
            "\1\u0185",
            "\1\u0186",
            "\1\u0187",
            "\1\u0188",
            "\1\u0189",
            "\1\u018a",
            "\1\u018b",
            "\1\u018c",
            "\1\u018d",
            "\1\u018e\15\uffff\1\u018f",
            "\1\u0190",
            "\1\u0191",
            "\1\u0192\2\uffff\1\u0193",
            "\1\u0194",
            "\1\u0195",
            "\1\u0196",
            "\12\103\7\uffff\32\103\1\uffff\1\103\2\uffff\1\103\1\uffff"+
            "\32\103",
            "\1\u0197",
            "\1\u0198",
            "\1\u0199",
            "\1\u019a",
            "\1\u019b",
            "\1\u019c",
            "\1\u019d",
            "\1\u019e",
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
            "\12\103\7\uffff\32\103\1\uffff\1\103\2\uffff\1\u01aa\1\uffff"+
            "\32\103",
            "\12\u013c",
            "\1\u00bb\1\uffff\12\u013c\7\uffff\5\u00bb\1\u00de\5\u00bb"+
            "\1\u00de\16\u00bb\1\uffff\1\u00bb\2\uffff\1\u00bb\1\uffff\5"+
            "\u00bb\1\u00de\5\u00bb\1\u00de\16\u00bb",
            "\1\u00bb\1\uffff\12\u00bb\7\uffff\32\u00bb\1\uffff\1\u00bb"+
            "\2\uffff\1\u00bb\1\uffff\13\u00bb\1\u01ab\16\u00bb",
            "\1\u00bb\1\uffff\12\u00bb\7\uffff\13\u00bb\1\u01ac\16\u00bb"+
            "\1\uffff\1\u00bb\2\uffff\1\u00bb\1\uffff\32\u00bb",
            "\1\u00bb\1\uffff\12\u00bb\7\uffff\24\u00bb\1\u0140\5\u00bb"+
            "\1\uffff\1\u00bb\2\uffff\1\u00bb\1\uffff\24\u00bb\1\u0140\5"+
            "\u00bb",
            "\1\u00bb\1\uffff\12\u00bb\7\uffff\32\u00bb\1\uffff\1\u00bb"+
            "\2\uffff\1\u00bb\1\uffff\32\u00bb",
            "\1\u00bb\1\uffff\12\u00bb\7\uffff\24\u00bb\1\u0140\5\u00bb"+
            "\1\uffff\1\u00bb\2\uffff\1\u00bb\1\uffff\24\u00bb\1\u0140\5"+
            "\u00bb",
            "\1\u00bb\1\uffff\12\u0142\7\uffff\4\u0144\1\u0143\1\u0144"+
            "\5\u00bb\1\u00be\10\u00bb\1\u00bc\5\u00bb\1\uffff\1\u00bb\2"+
            "\uffff\1\u00bb\1\uffff\13\u00bb\1\u00bd\10\u00bb\1\u00bc\5\u00bb",
            "\1\u00bb\1\uffff\2\u00bb\1\uffff\12\u0142\7\uffff\4\u0144"+
            "\1\u0143\1\u0144\5\u00bb\1\u00be\10\u00bb\1\u00bc\5\u00bb\1"+
            "\uffff\1\u00bb\2\uffff\1\u00bb\1\uffff\13\u00bb\1\u00bd\10\u00bb"+
            "\1\u00bc\5\u00bb",
            "\1\u00bb\1\uffff\12\u0142\7\uffff\4\u0144\1\u0143\1\u0144"+
            "\5\u00bb\1\u00be\10\u00bb\1\u00bc\5\u00bb\1\uffff\1\u00bb\2"+
            "\uffff\1\u00bb\1\uffff\13\u00bb\1\u00bd\10\u00bb\1\u00bc\5\u00bb",
            "\12\u00c4\1\u008e\34\u00c4\1\u0147\64\u00c4\1\u00c3\uffa3"+
            "\u00c4",
            "\60\u008e\12\u01ad\7\u008e\6\u01ad\uffb9\u008e",
            "",
            "\12\103\7\uffff\32\103\1\uffff\1\103\2\uffff\1\103\1\uffff"+
            "\32\103",
            "\1\u01b0\4\uffff\1\u01b1\4\uffff\1\u01af",
            "\1\u01b2",
            "\1\u01b3",
            "\1\u01b4",
            "\12\103\7\uffff\32\103\1\uffff\1\103\2\uffff\1\103\1\uffff"+
            "\32\103",
            "\1\u01b5",
            "\1\u01b6",
            "\1\u01b7",
            "\1\u01b8",
            "",
            "\1\u01b9",
            "\1\u01ba",
            "\1\u01bb",
            "\1\u01bc",
            "\12\103\7\uffff\32\103\1\uffff\1\103\2\uffff\1\103\1\uffff"+
            "\32\103",
            "\1\u01bd",
            "",
            "\12\u015b",
            "\1\u00bb\1\uffff\12\u015b\7\uffff\5\u00bb\1\u00de\5\u00bb"+
            "\1\u00de\16\u00bb\1\uffff\1\u00bb\2\uffff\1\u00bb\1\uffff\5"+
            "\u00bb\1\u00de\5\u00bb\1\u00de\16\u00bb",
            "\1\u01be",
            "\1\u01bf",
            "\1\u01c0",
            "\1\u01c1",
            "\1\u01c2",
            "\12\103\7\uffff\32\103\1\uffff\1\103\2\uffff\1\103\1\uffff"+
            "\32\103",
            "\1\103\1\u01c3\1\103\1\u01c4\6\103\7\uffff\32\103\1\uffff"+
            "\1\103\2\uffff\1\103\1\uffff\32\103",
            "\1\u01c5",
            "\12\103\7\uffff\32\103\1\uffff\1\103\2\uffff\1\103\1\uffff"+
            "\32\103",
            "\1\u01c6",
            "",
            "\1\u01c7",
            "\1\u01c8",
            "",
            "",
            "\1\u01c9",
            "\1\u01ca",
            "\1\u01cb",
            "\1\u01cc",
            "\1\u01cd",
            "",
            "\1\u01ce\4\uffff\1\u01ce\10\uffff\10\u009d\7\uffff\1\u009d"+
            "\25\uffff\1\u009d\6\uffff\1\u01ce\4\uffff\1\u009d\1\u01ce\3"+
            "\uffff\1\u01ce\7\uffff\1\u01ce\3\uffff\1\u01ce\1\uffff\1\u01ce"+
            "\1\u01cf\1\u009d\1\uffff\1\u009d",
            "\12\u0172\1\u008e\27\u0172\1\u0170\71\u0172\1\u0171\uffa3"+
            "\u0172",
            "",
            "\12\u0176\1\u008e\27\u0176\1\u0173\15\u0176\12\u01d0\7\u0176"+
            "\6\u01d0\25\u0176\1\u0175\uffa3\u0176",
            "\12\160\1\uffff\27\160\1\u01d1\4\160\1\u01d2\64\160\1\u01d2"+
            "\5\160\1\u01d2\3\160\1\u01d2\7\160\1\u01d2\3\160\1\u01d2\1\160"+
            "\2\u01d2\uff8a\160",
            "\12\u0176\1\u008e\27\u0176\1\u0173\71\u0176\1\u0175\uffa3"+
            "\u0176",
            "",
            "\12\u0178\1\uffff\27\u0178\1\u0177\71\u0178\1\u0179\uffa3"+
            "\u0178",
            "\12\160\1\uffff\27\160\1\u01d3\4\160\1\u0108\10\160\10\u010c"+
            "\7\160\1\u0108\25\160\1\u010a\6\160\1\u0108\4\160\2\u0108\3"+
            "\160\1\u0108\7\160\1\u0108\3\160\1\u0108\1\160\1\u0108\1\u01d4"+
            "\1\u0108\1\160\1\u0109\uff87\160",
            "\12\u0178\1\uffff\27\u0178\1\u0177\15\u0178\12\u01d5\7\u0178"+
            "\6\u01d5\25\u0178\1\u0179\uffa3\u0178",
            "\12\160\1\uffff\45\160\12\u01d6\7\160\6\u01d6\uffb9\160",
            "\12\160\1\uffff\45\160\10\u01d7\uffc8\160",
            "\1\u01d8",
            "\1\u01d9",
            "\1\u01da",
            "\1\u01db",
            "\1\u01dc\11\uffff\1\u01dd",
            "\1\u01de",
            "\1\u01df",
            "\1\u01e0",
            "\1\u01e1",
            "\1\u01e2",
            "\1\u01e3",
            "\1\u01e4",
            "\1\u01e5",
            "\1\u01e6",
            "\1\u01e7",
            "\12\103\7\uffff\32\103\1\uffff\1\103\2\uffff\1\103\1\uffff"+
            "\32\103",
            "\1\u01e8",
            "\1\u01e9",
            "\1\u01ea",
            "\12\103\7\uffff\32\103\1\uffff\1\103\2\uffff\1\103\1\uffff"+
            "\32\103",
            "\12\103\7\uffff\32\103\1\uffff\1\103\2\uffff\1\103\1\uffff"+
            "\32\103",
            "\1\u01eb",
            "\1\u01ec",
            "\1\u01ed",
            "\12\103\7\uffff\32\103\1\uffff\1\103\2\uffff\1\103\1\uffff"+
            "\32\103",
            "\1\u01ee",
            "\12\103\7\uffff\32\103\1\uffff\1\103\2\uffff\1\103\1\uffff"+
            "\32\103",
            "\1\u01ef",
            "\1\u01f0",
            "\1\u01f1",
            "\1\u01f2",
            "\1\u01f3",
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
            "\1\u01fe",
            "\1\u01ff",
            "\1\u0200",
            "\1\u0201",
            "\1\u00bb\1\uffff\12\u00bb\7\uffff\32\u00bb\1\uffff\1\u00bb"+
            "\2\uffff\1\u00bb\1\uffff\32\u00bb",
            "\1\u00bb\1\uffff\12\u00bb\7\uffff\32\u00bb\1\uffff\1\u00bb"+
            "\2\uffff\1\u00bb\1\uffff\32\u00bb",
            "\60\u008e\12\u0202\7\u008e\6\u0202\uffb9\u008e",
            "",
            "\1\u0203",
            "\1\u0204",
            "\1\u0205",
            "\1\u0206",
            "\12\103\7\uffff\32\103\1\uffff\1\103\2\uffff\1\103\1\uffff"+
            "\32\103",
            "\1\u0208",
            "\12\103\7\uffff\32\103\1\uffff\1\103\2\uffff\1\103\1\uffff"+
            "\32\103",
            "\12\103\7\uffff\32\103\1\uffff\1\103\2\uffff\1\103\1\uffff"+
            "\32\103",
            "\1\u020a",
            "\1\u020b",
            "\1\u020c",
            "\1\u020d",
            "\1\u020e",
            "\1\u020f\15\uffff\1\u0210",
            "\1\u0211",
            "\12\103\7\uffff\32\103\1\uffff\1\103\2\uffff\1\u0213\1\uffff"+
            "\4\103\1\u0212\25\103",
            "\1\u0215",
            "\12\103\7\uffff\32\103\1\uffff\1\103\2\uffff\1\103\1\uffff"+
            "\32\103",
            "\12\103\7\uffff\32\103\1\uffff\1\103\2\uffff\1\103\1\uffff"+
            "\32\103",
            "\12\103\7\uffff\32\103\1\uffff\1\103\2\uffff\1\103\1\uffff"+
            "\32\103",
            "\1\u0218",
            "\1\u0219",
            "\1\u021a",
            "\1\u021b",
            "\1\u021c",
            "\12\103\7\uffff\32\103\1\uffff\1\103\2\uffff\1\103\1\uffff"+
            "\32\103",
            "\1\u021d",
            "\1\u021e",
            "\1\u021f",
            "\1\u0220",
            "\1\u0221",
            "\12\u0172\1\u008e\27\u0172\1\u0170\71\u0172\1\u0171\uffa3"+
            "\u0172",
            "\60\u008e\12\u0222\7\u008e\6\u0222\uffb9\u008e",
            "\12\u0176\1\u008e\27\u0176\1\u0173\15\u0176\12\u0223\7\u0176"+
            "\6\u0223\25\u0176\1\u0175\uffa3\u0176",
            "\0\u008e",
            "\12\u0176\1\u008e\27\u0176\1\u0173\71\u0176\1\u0175\uffa3"+
            "\u0176",
            "\12\u009d\1\uffff\ufff5\u009d",
            "\12\160\1\uffff\45\160\12\u0224\7\160\6\u0224\uffb9\160",
            "\12\u0178\1\uffff\27\u0178\1\u0177\15\u0178\12\u01d5\7\u0178"+
            "\6\u01d5\25\u0178\1\u0179\uffa3\u0178",
            "\12\160\1\uffff\45\160\12\u0225\7\160\6\u0225\uffb9\160",
            "\12\u0178\1\uffff\27\u0178\1\u0177\71\u0178\1\u0179\uffa3"+
            "\u0178",
            "\1\u0226",
            "\1\u0227",
            "\1\u0228",
            "\1\u0229",
            "\1\u022a",
            "\1\u022b",
            "\1\u022c",
            "\1\u022d",
            "\1\u022e",
            "\1\u022f",
            "\1\u0230",
            "\1\u0231",
            "\1\u0232",
            "\1\u0233",
            "\1\u0234",
            "\1\u0235",
            "\12\103\7\uffff\32\103\1\uffff\1\103\2\uffff\1\103\1\uffff"+
            "\32\103",
            "\1\u0236",
            "\12\103\7\uffff\32\103\1\uffff\1\103\2\uffff\1\103\1\uffff"+
            "\32\103",
            "\1\u0237",
            "\1\u0238",
            "\1\u0239",
            "\1\u023a",
            "\1\u023b",
            "\1\u023c",
            "\1\u023d",
            "\1\u023e",
            "\1\u023f",
            "\1\u0240",
            "\1\u0241",
            "\12\103\7\uffff\32\103\1\uffff\1\103\2\uffff\1\103\1\uffff"+
            "\32\103",
            "\1\u0242",
            "\1\u0243",
            "\1\u0244",
            "\1\u0245",
            "\1\u0246",
            "\12\103\7\uffff\32\103\1\uffff\1\103\2\uffff\1\103\1\uffff"+
            "\32\103",
            "\1\u0247",
            "\12\103\7\uffff\32\103\1\uffff\1\103\2\uffff\1\103\1\uffff"+
            "\32\103",
            "\1\u0248",
            "\12\103\7\uffff\32\103\1\uffff\1\103\2\uffff\1\103\1\uffff"+
            "\32\103",
            "\1\u0249",
            "\60\u008e\12\u024a\7\u008e\6\u024a\uffb9\u008e",
            "\1\u024b",
            "\1\u024c",
            "\12\103\7\uffff\32\103\1\uffff\1\103\2\uffff\1\103\1\uffff"+
            "\32\103",
            "\1\u024d",
            "",
            "\1\u024e",
            "",
            "\12\103\7\uffff\32\103\1\uffff\1\103\2\uffff\1\103\1\uffff"+
            "\32\103",
            "\1\u024f",
            "\1\u0250",
            "\12\103\7\uffff\32\103\1\uffff\1\103\2\uffff\1\103\1\uffff"+
            "\32\103",
            "\1\u0251",
            "\1\u0252",
            "\1\u0253",
            "\12\103\7\uffff\32\103\1\uffff\1\103\2\uffff\1\103\1\uffff"+
            "\32\103",
            "\1\u0254",
            "\1\u0255",
            "",
            "\1\u0256",
            "",
            "",
            "\1\u0257",
            "\1\u0258",
            "\1\u0259",
            "\1\u025a",
            "\1\u025b",
            "\12\103\7\uffff\32\103\1\uffff\1\103\2\uffff\1\103\1\uffff"+
            "\32\103",
            "\1\u025d",
            "\1\u025e",
            "\12\103\7\uffff\32\103\1\uffff\1\103\2\uffff\1\103\1\uffff"+
            "\32\103",
            "\1\u025f",
            "\60\u008e\12\u0260\7\u008e\6\u0260\uffb9\u008e",
            "\12\u0176\1\u008e\27\u0176\1\u0173\15\u0176\12\u0261\7\u0176"+
            "\6\u0261\25\u0176\1\u0175\uffa3\u0176",
            "\12\160\1\uffff\45\160\12\u0262\7\160\6\u0262\uffb9\160",
            "\12\160\1\uffff\45\160\12\u0263\7\160\6\u0263\uffb9\160",
            "\1\u0264",
            "\1\u0265",
            "\1\u0266",
            "\1\u0267",
            "\12\103\7\uffff\13\103\1\u0268\16\103\1\uffff\1\103\2\uffff"+
            "\1\103\1\uffff\32\103",
            "\1\u026a",
            "\1\u026b",
            "\1\u026c",
            "\1\u026d",
            "\1\u026e",
            "\1\u026f",
            "\1\u0270",
            "\1\u0271",
            "\1\u0272",
            "\1\u0273",
            "\1\u0274",
            "\12\103\7\uffff\32\103\1\uffff\1\103\2\uffff\1\103\1\uffff"+
            "\32\103",
            "\1\u0275",
            "\12\103\7\uffff\32\103\1\uffff\1\103\2\uffff\1\103\1\uffff"+
            "\32\103",
            "\12\103\7\uffff\32\103\1\uffff\1\103\2\uffff\1\103\1\uffff"+
            "\32\103",
            "\12\103\7\uffff\32\103\1\uffff\1\103\2\uffff\1\103\1\uffff"+
            "\32\103",
            "\1\u0276",
            "\1\u0277",
            "\1\u0278",
            "\12\103\7\uffff\32\103\1\uffff\1\103\2\uffff\1\103\1\uffff"+
            "\32\103",
            "\1\u0279",
            "\1\u027a",
            "\12\103\7\uffff\32\103\1\uffff\1\103\2\uffff\1\103\1\uffff"+
            "\32\103",
            "\12\103\7\uffff\32\103\1\uffff\1\103\2\uffff\1\103\1\uffff"+
            "\32\103",
            "\12\103\7\uffff\32\103\1\uffff\1\103\2\uffff\1\103\1\uffff"+
            "\32\103",
            "\12\103\7\uffff\32\103\1\uffff\1\103\2\uffff\1\u027b\1\uffff"+
            "\32\103",
            "\12\103\7\uffff\32\103\1\uffff\1\103\2\uffff\1\103\1\uffff"+
            "\32\103",
            "\12\103\7\uffff\32\103\1\uffff\1\103\2\uffff\1\103\1\uffff"+
            "\32\103",
            "\1\u027c",
            "\1\u027d",
            "\12\103\7\uffff\32\103\1\uffff\1\103\2\uffff\1\103\1\uffff"+
            "\32\103",
            "\60\u008e\12\u027e\7\u008e\6\u027e\uffb9\u008e",
            "\1\u027f",
            "\12\103\7\uffff\32\103\1\uffff\1\103\2\uffff\1\103\1\uffff"+
            "\32\103",
            "\1\u0280",
            "\1\u0281",
            "\12\103\7\uffff\32\103\1\uffff\1\103\2\uffff\1\103\1\uffff"+
            "\32\103",
            "\1\u0283",
            "\1\u0284",
            "\12\103\7\uffff\32\103\1\uffff\1\103\2\uffff\1\103\1\uffff"+
            "\32\103",
            "\12\103\7\uffff\32\103\1\uffff\1\103\2\uffff\1\103\1\uffff"+
            "\32\103",
            "\1\u0286",
            "\1\u0287",
            "\1\u0288",
            "\1\u0289",
            "\1\u028a",
            "\1\u028b",
            "\12\103\7\uffff\32\103\1\uffff\1\103\2\uffff\1\103\1\uffff"+
            "\32\103",
            "\1\u028c",
            "",
            "\1\u028d",
            "\12\103\7\uffff\32\103\1\uffff\1\103\2\uffff\1\103\1\uffff"+
            "\32\103",
            "\1\u028e",
            "\60\u008e\12\u028f\7\u008e\6\u028f\uffb9\u008e",
            "\12\u008d\1\u008e\27\u008d\1\u010d\71\u008d\1\u008c\uffa3"+
            "\u008d",
            "\12\160\1\uffff\45\160\12\u0290\7\160\6\u0290\uffb9\160",
            "\12\160\1\uffff\45\160\12\u0291\7\160\6\u0291\uffb9\160",
            "\1\u0292",
            "\1\u0293",
            "\1\u0294",
            "\1\u0295",
            "\1\u0296",
            "",
            "\1\u0297",
            "\1\u0298",
            "\1\u0299",
            "\1\u029a",
            "\1\u029b",
            "\1\u029c",
            "\1\u029d",
            "\1\u029e",
            "\1\u029f",
            "\1\u02a0",
            "\1\u02a1",
            "\1\u02a2",
            "\12\103\7\uffff\32\103\1\uffff\1\103\2\uffff\1\103\1\uffff"+
            "\32\103",
            "\12\103\7\uffff\32\103\1\uffff\1\103\2\uffff\1\103\1\uffff"+
            "\32\103",
            "\1\u02a3",
            "\1\u02a4",
            "\1\u02a5",
            "\1\u02a6\1\uffff\1\u02a7",
            "\1\u02a8",
            "\12\103\7\uffff\32\103\1\uffff\1\103\2\uffff\1\103\1\uffff"+
            "\32\103",
            "\12\u00c4\1\u008e\34\u00c4\1\u0147\64\u00c4\1\u00c3\uffa3"+
            "\u00c4",
            "\12\103\7\uffff\32\103\1\uffff\1\103\2\uffff\1\103\1\uffff"+
            "\32\103",
            "\12\103\7\uffff\32\103\1\uffff\1\103\2\uffff\1\103\1\uffff"+
            "\32\103",
            "\1\u02ab",
            "",
            "\12\103\7\uffff\32\103\1\uffff\1\103\2\uffff\1\103\1\uffff"+
            "\32\103",
            "\1\u02ad",
            "",
            "\1\u02ae",
            "\1\u02af",
            "\12\103\7\uffff\32\103\1\uffff\1\103\2\uffff\1\103\1\uffff"+
            "\32\103",
            "\12\103\7\uffff\32\103\1\uffff\1\103\2\uffff\1\103\1\uffff"+
            "\32\103",
            "\12\103\7\uffff\32\103\1\uffff\1\103\2\uffff\1\103\1\uffff"+
            "\32\103",
            "\12\103\7\uffff\32\103\1\uffff\1\103\2\uffff\1\103\1\uffff"+
            "\32\103",
            "\12\103\7\uffff\32\103\1\uffff\1\103\2\uffff\1\103\1\uffff"+
            "\32\103",
            "\12\103\7\uffff\32\103\1\uffff\1\103\2\uffff\1\103\1\uffff"+
            "\32\103",
            "\1\u02b2",
            "\60\u008e\12\u02b3\7\u008e\6\u02b3\uffb9\u008e",
            "\12\160\1\uffff\45\160\12\u02b4\7\160\6\u02b4\uffb9\160",
            "\12\160\1\uffff\45\160\12\u02b5\7\160\6\u02b5\uffb9\160",
            "\1\u02b6",
            "\1\u02b7",
            "\1\u02b8",
            "\1\u02b9",
            "\1\u02ba",
            "\1\u02bb",
            "\1\u02bc",
            "\1\u02bd",
            "\1\u02be",
            "\1\u02bf",
            "\1\u02c0",
            "\1\u02c1",
            "\1\u02c2",
            "\1\u02c3",
            "\1\u02c4",
            "\1\u02c5",
            "\12\103\7\uffff\32\103\1\uffff\1\103\2\uffff\1\103\1\uffff"+
            "\32\103",
            "\1\u02c6",
            "\12\103\7\uffff\32\103\1\uffff\1\103\2\uffff\1\103\1\uffff"+
            "\32\103",
            "\1\u02c7",
            "\1\u02c8",
            "\1\u02c9",
            "\12\103\7\uffff\32\103\1\uffff\1\103\2\uffff\1\103\1\uffff"+
            "\32\103",
            "",
            "",
            "\1\u02ca",
            "",
            "\12\103\7\uffff\32\103\1\uffff\1\103\2\uffff\1\103\1\uffff"+
            "\32\103",
            "\12\103\7\uffff\32\103\1\uffff\1\103\2\uffff\1\103\1\uffff"+
            "\32\103",
            "\1\u02cb",
            "",
            "",
            "\1\u02cc",
            "\12\u0172\1\u008e\27\u0172\1\u0170\71\u0172\1\u0171\uffa3"+
            "\u0172",
            "\12\u0178\1\uffff\27\u0178\1\u0177\71\u0178\1\u0179\uffa3"+
            "\u0178",
            "\12\160\1\uffff\45\160\12\u02cd\7\160\6\u02cd\uffb9\160",
            "\1\u02ce",
            "\1\u02cf",
            "\1\u02d0",
            "\12\103\7\uffff\32\103\1\uffff\1\103\2\uffff\1\103\1\uffff"+
            "\32\103",
            "\1\u02d2",
            "\1\u02d3",
            "\1\u02d4",
            "\1\u02d5",
            "\1\u02d6",
            "\1\u02d7",
            "\1\u02d8",
            "\1\u02d9",
            "\1\u02da",
            "\1\u02db",
            "\1\u02dc",
            "\1\u02dd",
            "\12\103\7\uffff\32\103\1\uffff\1\103\2\uffff\1\103\1\uffff"+
            "\32\103",
            "\1\u02de",
            "\1\u02df",
            "\1\u02e0",
            "\1\u02e1",
            "\12\103\7\uffff\32\103\1\uffff\1\103\2\uffff\1\103\1\uffff"+
            "\32\103",
            "\1\u02e2",
            "\12\160\1\uffff\45\160\12\u02e3\7\160\6\u02e3\uffb9\160",
            "\1\u02e4",
            "\1\u02e5",
            "\1\u02e6",
            "",
            "\12\103\7\uffff\32\103\1\uffff\1\103\2\uffff\1\103\1\uffff"+
            "\32\103",
            "\1\u02e8",
            "\1\u02e9",
            "\1\u02ea",
            "\1\u02eb",
            "\1\u02ec",
            "\1\u02ed",
            "\1\u02ee",
            "\1\u02ef",
            "\1\u02f0",
            "\1\u02f1",
            "\1\u02f2",
            "\1\u02f3",
            "\1\u02f4",
            "\1\u02f5",
            "\1\u02f6",
            "\1\u02f7",
            "\12\u0178\1\uffff\27\u0178\1\u0177\71\u0178\1\u0179\uffa3"+
            "\u0178",
            "\1\u02f8",
            "\1\u02f9",
            "\1\u02fa",
            "",
            "\1\u02fb",
            "\1\u02fc",
            "\1\u02fd",
            "\12\103\7\uffff\32\103\1\uffff\1\103\2\uffff\1\103\1\uffff"+
            "\32\103",
            "\1\u02ff",
            "\12\103\7\uffff\32\103\1\uffff\1\103\2\uffff\1\103\1\uffff"+
            "\32\103",
            "\1\u0301",
            "\1\u0302",
            "\1\u0303",
            "\1\u0304",
            "\1\u0305",
            "\1\u0306",
            "\1\u0307",
            "\12\103\7\uffff\32\103\1\uffff\1\103\2\uffff\1\103\1\uffff"+
            "\32\103",
            "\12\103\7\uffff\32\103\1\uffff\1\103\2\uffff\1\103\1\uffff"+
            "\32\103",
            "\12\103\7\uffff\32\103\1\uffff\1\103\2\uffff\1\103\1\uffff"+
            "\32\103",
            "\1\u0308",
            "\1\u0309",
            "\1\u030a",
            "\1\u030b",
            "\1\u030c",
            "\12\103\7\uffff\32\103\1\uffff\1\103\2\uffff\1\103\1\uffff"+
            "\32\103",
            "",
            "\1\u030e",
            "",
            "\1\u030f",
            "\1\u0310",
            "\1\u0311",
            "\1\u0312",
            "\1\u0313",
            "\1\u0314",
            "\1\u0315",
            "\1\u0316",
            "\1\u0317",
            "\1\u0318",
            "\12\103\7\uffff\32\103\1\uffff\1\103\2\uffff\1\103\1\uffff"+
            "\32\103",
            "\1\u031a",
            "",
            "\1\u031b",
            "\1\u031c",
            "\1\u031d",
            "\1\u031e",
            "\1\u031f",
            "\12\103\7\uffff\32\103\1\uffff\1\103\2\uffff\1\103\1\uffff"+
            "\32\103",
            "\1\u0321",
            "\12\103\7\uffff\32\103\1\uffff\1\103\2\uffff\1\103\1\uffff"+
            "\32\103",
            "\1\u0322",
            "\1\u0323",
            "\1\u0324",
            "",
            "\1\u0325",
            "\1\u0326",
            "\1\u0327",
            "\1\u0328",
            "\1\u0329",
            "\1\u032a",
            "",
            "\1\u032b",
            "\1\u032c",
            "\1\u032d",
            "\12\103\7\uffff\32\103\1\uffff\1\103\2\uffff\1\103\1\uffff"+
            "\32\103",
            "\1\u032f",
            "\1\u0330",
            "\1\u0331",
            "\1\u0332",
            "\1\u0333",
            "\1\u0334",
            "\1\u0335",
            "\1\u0336",
            "\1\u0337",
            "",
            "\1\u0338",
            "\1\u0339",
            "\1\u033a",
            "\1\u033b",
            "\1\u033c",
            "\1\u033d",
            "\12\103\7\uffff\32\103\1\uffff\1\103\2\uffff\1\103\1\uffff"+
            "\32\103",
            "\1\u033e",
            "\12\103\7\uffff\32\103\1\uffff\1\103\2\uffff\1\103\1\uffff"+
            "\32\103",
            "\1\u0340",
            "\1\u0341",
            "\1\u0342",
            "\1\u0343",
            "\1\u0344",
            "\1\u0345",
            "\12\103\7\uffff\32\103\1\uffff\1\103\2\uffff\1\103\1\uffff"+
            "\32\103",
            "",
            "\1\u0347",
            "\1\u0348",
            "\1\u0349",
            "\1\u034a",
            "\1\u034b",
            "\12\103\7\uffff\32\103\1\uffff\1\103\2\uffff\1\103\1\uffff"+
            "\32\103",
            "",
            "\1\u034d",
            "\1\u034e",
            "\12\103\7\uffff\32\103\1\uffff\1\103\2\uffff\1\103\1\uffff"+
            "\32\103",
            "\1\u0350",
            "\12\103\7\uffff\32\103\1\uffff\1\103\2\uffff\1\103\1\uffff"+
            "\32\103",
            "",
            "\1\u0352",
            "\12\103\7\uffff\2\103\1\u0353\27\103\1\uffff\1\103\2\uffff"+
            "\1\103\1\uffff\32\103",
            "",
            "\12\103\7\uffff\32\103\1\uffff\1\103\2\uffff\1\103\1\uffff"+
            "\32\103",
            "",
            "\12\103\7\uffff\32\103\1\uffff\1\103\2\uffff\1\103\1\uffff"+
            "\32\103",
            "\1\u0357",
            "",
            "",
            "",
            "\1\u0358",
            "\1\u0359",
            "\1\u035a",
            "\1\u035b",
            "\12\103\7\uffff\32\103\1\uffff\1\103\2\uffff\1\103\1\uffff"+
            "\32\103",
            ""
    };

    static final short[] DFA48_eot = DFA.unpackEncodedString(DFA48_eotS);
    static final short[] DFA48_eof = DFA.unpackEncodedString(DFA48_eofS);
    static final char[] DFA48_min = DFA.unpackEncodedStringToUnsignedChars(DFA48_minS);
    static final char[] DFA48_max = DFA.unpackEncodedStringToUnsignedChars(DFA48_maxS);
    static final short[] DFA48_accept = DFA.unpackEncodedString(DFA48_acceptS);
    static final short[] DFA48_special = DFA.unpackEncodedString(DFA48_specialS);
    static final short[][] DFA48_transition;

    static {
        int numStates = DFA48_transitionS.length;
        DFA48_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA48_transition[i] = DFA.unpackEncodedString(DFA48_transitionS[i]);
        }
    }

    class DFA48 extends DFA {

        public DFA48(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 48;
            this.eot = DFA48_eot;
            this.eof = DFA48_eof;
            this.min = DFA48_min;
            this.max = DFA48_max;
            this.accept = DFA48_accept;
            this.special = DFA48_special;
            this.transition = DFA48_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | T__114 | T__115 | T__116 | RULE_HEADER_NAME | RULE_KEYWORD | RULE_PREPROCESSING_OP_OR_PUNC | RULE_ID | RULE_INT | RULE_CHARACTER_LITERAL | RULE_FLOATING_LITERAL | RULE_STRING_LITERAL | RULE_PP_NUMBER | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA48_265 = input.LA(1);

                        s = -1;
                        if ( ((LA48_265>='\u0000' && LA48_265<='\t')||(LA48_265>='\u000B' && LA48_265<='/')||(LA48_265>=':' && LA48_265<='@')||(LA48_265>='G' && LA48_265<='\uFFFF')) ) {s = 112;}

                        else if ( ((LA48_265>='0' && LA48_265<='9')||(LA48_265>='A' && LA48_265<='F')) ) {s = 378;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA48_108 = input.LA(1);

                        s = -1;
                        if ( (LA48_108=='=') ) {s = 241;}

                        else if ( ((LA48_108>='\u0000' && LA48_108<='\t')||(LA48_108>='\u000B' && LA48_108<='<')||(LA48_108>='>' && LA48_108<='\uFFFF')) ) {s = 112;}

                        else s = 242;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA48_462 = input.LA(1);

                        s = -1;
                        if ( (LA48_462=='\"') ) {s = 368;}

                        else if ( (LA48_462=='\\') ) {s = 369;}

                        else if ( ((LA48_462>='\u0000' && LA48_462<='\t')||(LA48_462>='\u000B' && LA48_462<='!')||(LA48_462>='#' && LA48_462<='[')||(LA48_462>=']' && LA48_462<='\uFFFF')) ) {s = 370;}

                        else if ( (LA48_462=='\n') ) {s = 142;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA48_109 = input.LA(1);

                        s = -1;
                        if ( ((LA48_109>='\u0000' && LA48_109<='\t')||(LA48_109>='\u000B' && LA48_109<='\uFFFF')) ) {s = 112;}

                        else s = 243;

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA48_469 = input.LA(1);

                        s = -1;
                        if ( (LA48_469=='\"') ) {s = 375;}

                        else if ( ((LA48_469>='0' && LA48_469<='9')||(LA48_469>='A' && LA48_469<='F')) ) {s = 469;}

                        else if ( (LA48_469=='\\') ) {s = 377;}

                        else if ( ((LA48_469>='\u0000' && LA48_469<='\t')||(LA48_469>='\u000B' && LA48_469<='!')||(LA48_469>='#' && LA48_469<='/')||(LA48_469>=':' && LA48_469<='@')||(LA48_469>='G' && LA48_469<='[')||(LA48_469>=']' && LA48_469<='\uFFFF')) ) {s = 376;}

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA48_378 = input.LA(1);

                        s = -1;
                        if ( (LA48_378=='\"') ) {s = 375;}

                        else if ( ((LA48_378>='0' && LA48_378<='9')||(LA48_378>='A' && LA48_378<='F')) ) {s = 469;}

                        else if ( (LA48_378=='\\') ) {s = 377;}

                        else if ( ((LA48_378>='\u0000' && LA48_378<='\t')||(LA48_378>='\u000B' && LA48_378<='!')||(LA48_378>='#' && LA48_378<='/')||(LA48_378>=':' && LA48_378<='@')||(LA48_378>='G' && LA48_378<='[')||(LA48_378>=']' && LA48_378<='\uFFFF')) ) {s = 376;}

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA48_241 = input.LA(1);

                        s = -1;
                        if ( ((LA48_241>='\u0000' && LA48_241<='\t')||(LA48_241>='\u000B' && LA48_241<='\uFFFF')) ) {s = 112;}

                        else s = 361;

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA48_376 = input.LA(1);

                        s = -1;
                        if ( (LA48_376=='\"') ) {s = 375;}

                        else if ( ((LA48_376>='\u0000' && LA48_376<='\t')||(LA48_376>='\u000B' && LA48_376<='!')||(LA48_376>='#' && LA48_376<='[')||(LA48_376>=']' && LA48_376<='\uFFFF')) ) {s = 376;}

                        else if ( (LA48_376=='\\') ) {s = 377;}

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA48_692 = input.LA(1);

                        s = -1;
                        if ( (LA48_692=='\"') ) {s = 375;}

                        else if ( ((LA48_692>='\u0000' && LA48_692<='\t')||(LA48_692>='\u000B' && LA48_692<='!')||(LA48_692>='#' && LA48_692<='[')||(LA48_692>=']' && LA48_692<='\uFFFF')) ) {s = 376;}

                        else if ( (LA48_692=='\\') ) {s = 377;}

                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA48_739 = input.LA(1);

                        s = -1;
                        if ( (LA48_739=='\"') ) {s = 375;}

                        else if ( ((LA48_739>='\u0000' && LA48_739<='\t')||(LA48_739>='\u000B' && LA48_739<='!')||(LA48_739>='#' && LA48_739<='[')||(LA48_739>=']' && LA48_739<='\uFFFF')) ) {s = 376;}

                        else if ( (LA48_739=='\\') ) {s = 377;}

                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA48_611 = input.LA(1);

                        s = -1;
                        if ( ((LA48_611>='\u0000' && LA48_611<='\t')||(LA48_611>='\u000B' && LA48_611<='/')||(LA48_611>=':' && LA48_611<='@')||(LA48_611>='G' && LA48_611<='\uFFFF')) ) {s = 112;}

                        else if ( ((LA48_611>='0' && LA48_611<='9')||(LA48_611>='A' && LA48_611<='F')) ) {s = 657;}

                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA48_140 = input.LA(1);

                        s = -1;
                        if ( (LA48_140=='\"') ) {s = 262;}

                        else if ( (LA48_140=='u') ) {s = 263;}

                        else if ( (LA48_140=='?'||LA48_140=='a'||LA48_140=='v') ) {s = 264;}

                        else if ( (LA48_140=='x') ) {s = 265;}

                        else if ( (LA48_140=='U') ) {s = 266;}

                        else if ( (LA48_140=='\''||LA48_140=='\\'||LA48_140=='b'||LA48_140=='f'||LA48_140=='n'||LA48_140=='r'||LA48_140=='t') ) {s = 267;}

                        else if ( ((LA48_140>='0' && LA48_140<='7')) ) {s = 268;}

                        else if ( ((LA48_140>='\u0000' && LA48_140<='\t')||(LA48_140>='\u000B' && LA48_140<='!')||(LA48_140>='#' && LA48_140<='&')||(LA48_140>='(' && LA48_140<='/')||(LA48_140>='8' && LA48_140<='>')||(LA48_140>='@' && LA48_140<='T')||(LA48_140>='V' && LA48_140<='[')||(LA48_140>=']' && LA48_140<='`')||(LA48_140>='c' && LA48_140<='e')||(LA48_140>='g' && LA48_140<='m')||(LA48_140>='o' && LA48_140<='q')||LA48_140=='s'||LA48_140=='w'||(LA48_140>='y' && LA48_140<='\uFFFF')) ) {s = 112;}

                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA48_609 = input.LA(1);

                        s = -1;
                        if ( (LA48_609=='\"') ) {s = 269;}

                        else if ( ((LA48_609>='\u0000' && LA48_609<='\t')||(LA48_609>='\u000B' && LA48_609<='!')||(LA48_609>='#' && LA48_609<='[')||(LA48_609>=']' && LA48_609<='\uFFFF')) ) {s = 141;}

                        else if ( (LA48_609=='\\') ) {s = 140;}

                        else if ( (LA48_609=='\n') ) {s = 142;}

                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA48_638 = input.LA(1);

                        s = -1;
                        if ( (LA48_638=='\'') ) {s = 327;}

                        else if ( (LA48_638=='\\') ) {s = 195;}

                        else if ( ((LA48_638>='\u0000' && LA48_638<='\t')||(LA48_638>='\u000B' && LA48_638<='&')||(LA48_638>='(' && LA48_638<='[')||(LA48_638>=']' && LA48_638<='\uFFFF')) ) {s = 196;}

                        else if ( (LA48_638=='\n') ) {s = 142;}

                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA48_547 = input.LA(1);

                        s = -1;
                        if ( (LA48_547=='\"') ) {s = 371;}

                        else if ( ((LA48_547>='0' && LA48_547<='9')||(LA48_547>='A' && LA48_547<='F')) ) {s = 609;}

                        else if ( (LA48_547=='\\') ) {s = 373;}

                        else if ( ((LA48_547>='\u0000' && LA48_547<='\t')||(LA48_547>='\u000B' && LA48_547<='!')||(LA48_547>='#' && LA48_547<='/')||(LA48_547>=':' && LA48_547<='@')||(LA48_547>='G' && LA48_547<='[')||(LA48_547>=']' && LA48_547<='\uFFFF')) ) {s = 374;}

                        else if ( (LA48_547=='\n') ) {s = 142;}

                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA48_464 = input.LA(1);

                        s = -1;
                        if ( (LA48_464=='\"') ) {s = 371;}

                        else if ( ((LA48_464>='0' && LA48_464<='9')||(LA48_464>='A' && LA48_464<='F')) ) {s = 547;}

                        else if ( (LA48_464=='\\') ) {s = 373;}

                        else if ( ((LA48_464>='\u0000' && LA48_464<='\t')||(LA48_464>='\u000B' && LA48_464<='!')||(LA48_464>='#' && LA48_464<='/')||(LA48_464>=':' && LA48_464<='@')||(LA48_464>='G' && LA48_464<='[')||(LA48_464>=']' && LA48_464<='\uFFFF')) ) {s = 374;}

                        else if ( (LA48_464=='\n') ) {s = 142;}

                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA48_372 = input.LA(1);

                        s = -1;
                        if ( (LA48_372=='\"') ) {s = 371;}

                        else if ( (LA48_372=='\\') ) {s = 373;}

                        else if ( ((LA48_372>='0' && LA48_372<='9')||(LA48_372>='A' && LA48_372<='F')) ) {s = 464;}

                        else if ( (LA48_372=='\n') ) {s = 142;}

                        else if ( ((LA48_372>='\u0000' && LA48_372<='\t')||(LA48_372>='\u000B' && LA48_372<='!')||(LA48_372>='#' && LA48_372<='/')||(LA48_372>=':' && LA48_372<='@')||(LA48_372>='G' && LA48_372<='[')||(LA48_372>=']' && LA48_372<='\uFFFF')) ) {s = 374;}

                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA48_470 = input.LA(1);

                        s = -1;
                        if ( ((LA48_470>='0' && LA48_470<='9')||(LA48_470>='A' && LA48_470<='F')) ) {s = 549;}

                        else if ( ((LA48_470>='\u0000' && LA48_470<='\t')||(LA48_470>='\u000B' && LA48_470<='/')||(LA48_470>=':' && LA48_470<='@')||(LA48_470>='G' && LA48_470<='\uFFFF')) ) {s = 112;}

                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA48_610 = input.LA(1);

                        s = -1;
                        if ( ((LA48_610>='\u0000' && LA48_610<='\t')||(LA48_610>='\u000B' && LA48_610<='/')||(LA48_610>=':' && LA48_610<='@')||(LA48_610>='G' && LA48_610<='\uFFFF')) ) {s = 112;}

                        else if ( ((LA48_610>='0' && LA48_610<='9')||(LA48_610>='A' && LA48_610<='F')) ) {s = 656;}

                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA48_693 = input.LA(1);

                        s = -1;
                        if ( ((LA48_693>='\u0000' && LA48_693<='\t')||(LA48_693>='\u000B' && LA48_693<='/')||(LA48_693>=':' && LA48_693<='@')||(LA48_693>='G' && LA48_693<='\uFFFF')) ) {s = 112;}

                        else if ( ((LA48_693>='0' && LA48_693<='9')||(LA48_693>='A' && LA48_693<='F')) ) {s = 717;}

                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA48_549 = input.LA(1);

                        s = -1;
                        if ( ((LA48_549>='\u0000' && LA48_549<='\t')||(LA48_549>='\u000B' && LA48_549<='/')||(LA48_549>=':' && LA48_549<='@')||(LA48_549>='G' && LA48_549<='\uFFFF')) ) {s = 112;}

                        else if ( ((LA48_549>='0' && LA48_549<='9')||(LA48_549>='A' && LA48_549<='F')) ) {s = 611;}

                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA48_656 = input.LA(1);

                        s = -1;
                        if ( ((LA48_656>='\u0000' && LA48_656<='\t')||(LA48_656>='\u000B' && LA48_656<='/')||(LA48_656>=':' && LA48_656<='@')||(LA48_656>='G' && LA48_656<='\uFFFF')) ) {s = 112;}

                        else if ( ((LA48_656>='0' && LA48_656<='9')||(LA48_656>='A' && LA48_656<='F')) ) {s = 692;}

                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA48_717 = input.LA(1);

                        s = -1;
                        if ( ((LA48_717>='\u0000' && LA48_717<='\t')||(LA48_717>='\u000B' && LA48_717<='/')||(LA48_717>=':' && LA48_717<='@')||(LA48_717>='G' && LA48_717<='\uFFFF')) ) {s = 112;}

                        else if ( ((LA48_717>='0' && LA48_717<='9')||(LA48_717>='A' && LA48_717<='F')) ) {s = 739;}

                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA48_379 = input.LA(1);

                        s = -1;
                        if ( ((LA48_379>='\u0000' && LA48_379<='\t')||(LA48_379>='\u000B' && LA48_379<='/')||(LA48_379>=':' && LA48_379<='@')||(LA48_379>='G' && LA48_379<='\uFFFF')) ) {s = 112;}

                        else if ( ((LA48_379>='0' && LA48_379<='9')||(LA48_379>='A' && LA48_379<='F')) ) {s = 470;}

                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA48_548 = input.LA(1);

                        s = -1;
                        if ( ((LA48_548>='\u0000' && LA48_548<='\t')||(LA48_548>='\u000B' && LA48_548<='/')||(LA48_548>=':' && LA48_548<='@')||(LA48_548>='G' && LA48_548<='\uFFFF')) ) {s = 112;}

                        else if ( ((LA48_548>='0' && LA48_548<='9')||(LA48_548>='A' && LA48_548<='F')) ) {s = 610;}

                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA48_657 = input.LA(1);

                        s = -1;
                        if ( ((LA48_657>='0' && LA48_657<='9')||(LA48_657>='A' && LA48_657<='F')) ) {s = 693;}

                        else if ( ((LA48_657>='\u0000' && LA48_657<='\t')||(LA48_657>='\u000B' && LA48_657<='/')||(LA48_657>=':' && LA48_657<='@')||(LA48_657>='G' && LA48_657<='\uFFFF')) ) {s = 112;}

                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA48_263 = input.LA(1);

                        s = -1;
                        if ( (LA48_263=='\"') ) {s = 371;}

                        else if ( ((LA48_263>='0' && LA48_263<='9')||(LA48_263>='A' && LA48_263<='F')) ) {s = 372;}

                        else if ( (LA48_263=='\\') ) {s = 373;}

                        else if ( ((LA48_263>='\u0000' && LA48_263<='\t')||(LA48_263>='\u000B' && LA48_263<='!')||(LA48_263>='#' && LA48_263<='/')||(LA48_263>=':' && LA48_263<='@')||(LA48_263>='G' && LA48_263<='[')||(LA48_263>=']' && LA48_263<='\uFFFF')) ) {s = 374;}

                        else if ( (LA48_263=='\n') ) {s = 142;}

                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA48_468 = input.LA(1);

                        s = -1;
                        if ( ((LA48_468>='\u0000' && LA48_468<='\t')||(LA48_468>='\u000B' && LA48_468<='/')||(LA48_468>=':' && LA48_468<='@')||(LA48_468>='G' && LA48_468<='\uFFFF')) ) {s = 112;}

                        else if ( ((LA48_468>='0' && LA48_468<='9')||(LA48_468>='A' && LA48_468<='F')) ) {s = 548;}

                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA48_266 = input.LA(1);

                        s = -1;
                        if ( ((LA48_266>='\u0000' && LA48_266<='\t')||(LA48_266>='\u000B' && LA48_266<='/')||(LA48_266>=':' && LA48_266<='@')||(LA48_266>='G' && LA48_266<='\uFFFF')) ) {s = 112;}

                        else if ( ((LA48_266>='0' && LA48_266<='9')||(LA48_266>='A' && LA48_266<='F')) ) {s = 379;}

                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA48_546 = input.LA(1);

                        s = -1;
                        if ( ((LA48_546>='\u0000' && LA48_546<='/')||(LA48_546>=':' && LA48_546<='@')||(LA48_546>='G' && LA48_546<='\uFFFF')) ) {s = 142;}

                        else if ( ((LA48_546>='0' && LA48_546<='9')||(LA48_546>='A' && LA48_546<='F')) ) {s = 608;}

                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA48_608 = input.LA(1);

                        s = -1;
                        if ( ((LA48_608>='0' && LA48_608<='9')||(LA48_608>='A' && LA48_608<='F')) ) {s = 655;}

                        else if ( ((LA48_608>='\u0000' && LA48_608<='/')||(LA48_608>=':' && LA48_608<='@')||(LA48_608>='G' && LA48_608<='\uFFFF')) ) {s = 142;}

                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA48_655 = input.LA(1);

                        s = -1;
                        if ( ((LA48_655>='0' && LA48_655<='9')||(LA48_655>='A' && LA48_655<='F')) ) {s = 691;}

                        else if ( ((LA48_655>='\u0000' && LA48_655<='/')||(LA48_655>=':' && LA48_655<='@')||(LA48_655>='G' && LA48_655<='\uFFFF')) ) {s = 142;}

                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        int LA48_465 = input.LA(1);

                        s = -1;
                        if ( ((LA48_465>='\u0000' && LA48_465<='\uFFFF')) ) {s = 142;}

                        else s = 112;

                        if ( s>=0 ) return s;
                        break;
                    case 33 : 
                        int LA48_326 = input.LA(1);

                        s = -1;
                        if ( ((LA48_326>='0' && LA48_326<='9')||(LA48_326>='A' && LA48_326<='F')) ) {s = 429;}

                        else if ( ((LA48_326>='\u0000' && LA48_326<='/')||(LA48_326>=':' && LA48_326<='@')||(LA48_326>='G' && LA48_326<='\uFFFF')) ) {s = 142;}

                        if ( s>=0 ) return s;
                        break;
                    case 34 : 
                        int LA48_429 = input.LA(1);

                        s = -1;
                        if ( ((LA48_429>='0' && LA48_429<='9')||(LA48_429>='A' && LA48_429<='F')) ) {s = 514;}

                        else if ( ((LA48_429>='\u0000' && LA48_429<='/')||(LA48_429>=':' && LA48_429<='@')||(LA48_429>='G' && LA48_429<='\uFFFF')) ) {s = 142;}

                        if ( s>=0 ) return s;
                        break;
                    case 35 : 
                        int LA48_514 = input.LA(1);

                        s = -1;
                        if ( ((LA48_514>='0' && LA48_514<='9')||(LA48_514>='A' && LA48_514<='F')) ) {s = 586;}

                        else if ( ((LA48_514>='\u0000' && LA48_514<='/')||(LA48_514>=':' && LA48_514<='@')||(LA48_514>='G' && LA48_514<='\uFFFF')) ) {s = 142;}

                        if ( s>=0 ) return s;
                        break;
                    case 36 : 
                        int LA48_586 = input.LA(1);

                        s = -1;
                        if ( ((LA48_586>='0' && LA48_586<='9')||(LA48_586>='A' && LA48_586<='F')) ) {s = 638;}

                        else if ( ((LA48_586>='\u0000' && LA48_586<='/')||(LA48_586>=':' && LA48_586<='@')||(LA48_586>='G' && LA48_586<='\uFFFF')) ) {s = 142;}

                        if ( s>=0 ) return s;
                        break;
                    case 37 : 
                        int LA48_370 = input.LA(1);

                        s = -1;
                        if ( (LA48_370=='\"') ) {s = 368;}

                        else if ( (LA48_370=='\\') ) {s = 369;}

                        else if ( ((LA48_370>='\u0000' && LA48_370<='\t')||(LA48_370>='\u000B' && LA48_370<='!')||(LA48_370>='#' && LA48_370<='[')||(LA48_370>=']' && LA48_370<='\uFFFF')) ) {s = 370;}

                        else if ( (LA48_370=='\n') ) {s = 142;}

                        if ( s>=0 ) return s;
                        break;
                    case 38 : 
                        int LA48_111 = input.LA(1);

                        s = -1;
                        if ( ((LA48_111>='\u0000' && LA48_111<='\t')||(LA48_111>='\u000B' && LA48_111<='\uFFFF')) ) {s = 112;}

                        else s = 77;

                        if ( s>=0 ) return s;
                        break;
                    case 39 : 
                        int LA48_110 = input.LA(1);

                        s = -1;
                        if ( ((LA48_110>='\u0000' && LA48_110<='\t')||(LA48_110>='\u000B' && LA48_110<='\uFFFF')) ) {s = 112;}

                        else s = 77;

                        if ( s>=0 ) return s;
                        break;
                    case 40 : 
                        int LA48_60 = input.LA(1);

                        s = -1;
                        if ( (LA48_60=='\\') ) {s = 195;}

                        else if ( ((LA48_60>='\u0000' && LA48_60<='\t')||(LA48_60>='\u000B' && LA48_60<='&')||(LA48_60>='(' && LA48_60<='[')||(LA48_60>=']' && LA48_60<='\uFFFF')) ) {s = 196;}

                        else if ( (LA48_60=='\n'||LA48_60=='\'') ) {s = 142;}

                        else s = 62;

                        if ( s>=0 ) return s;
                        break;
                    case 41 : 
                        int LA48_374 = input.LA(1);

                        s = -1;
                        if ( (LA48_374=='\"') ) {s = 371;}

                        else if ( (LA48_374=='\\') ) {s = 373;}

                        else if ( ((LA48_374>='\u0000' && LA48_374<='\t')||(LA48_374>='\u000B' && LA48_374<='!')||(LA48_374>='#' && LA48_374<='[')||(LA48_374>=']' && LA48_374<='\uFFFF')) ) {s = 374;}

                        else if ( (LA48_374=='\n') ) {s = 142;}

                        if ( s>=0 ) return s;
                        break;
                    case 42 : 
                        int LA48_466 = input.LA(1);

                        s = -1;
                        if ( (LA48_466=='\"') ) {s = 371;}

                        else if ( (LA48_466=='\\') ) {s = 373;}

                        else if ( ((LA48_466>='\u0000' && LA48_466<='\t')||(LA48_466>='\u000B' && LA48_466<='!')||(LA48_466>='#' && LA48_466<='[')||(LA48_466>=']' && LA48_466<='\uFFFF')) ) {s = 374;}

                        else if ( (LA48_466=='\n') ) {s = 142;}

                        if ( s>=0 ) return s;
                        break;
                    case 43 : 
                        int LA48_196 = input.LA(1);

                        s = -1;
                        if ( (LA48_196=='\'') ) {s = 327;}

                        else if ( (LA48_196=='\\') ) {s = 195;}

                        else if ( ((LA48_196>='\u0000' && LA48_196<='\t')||(LA48_196>='\u000B' && LA48_196<='&')||(LA48_196>='(' && LA48_196<='[')||(LA48_196>=']' && LA48_196<='\uFFFF')) ) {s = 196;}

                        else if ( (LA48_196=='\n') ) {s = 142;}

                        if ( s>=0 ) return s;
                        break;
                    case 44 : 
                        int LA48_264 = input.LA(1);

                        s = -1;
                        if ( (LA48_264=='\"') ) {s = 375;}

                        else if ( ((LA48_264>='\u0000' && LA48_264<='\t')||(LA48_264>='\u000B' && LA48_264<='!')||(LA48_264>='#' && LA48_264<='[')||(LA48_264>=']' && LA48_264<='\uFFFF')) ) {s = 376;}

                        else if ( (LA48_264=='\\') ) {s = 377;}

                        if ( s>=0 ) return s;
                        break;
                    case 45 : 
                        int LA48_463 = input.LA(1);

                        s = -1;
                        if ( ((LA48_463>='0' && LA48_463<='9')||(LA48_463>='A' && LA48_463<='F')) ) {s = 546;}

                        else if ( ((LA48_463>='\u0000' && LA48_463<='/')||(LA48_463>=':' && LA48_463<='@')||(LA48_463>='G' && LA48_463<='\uFFFF')) ) {s = 142;}

                        if ( s>=0 ) return s;
                        break;
                    case 46 : 
                        int LA48_18 = input.LA(1);

                        s = -1;
                        if ( (LA48_18=='<') ) {s = 108;}

                        else if ( (LA48_18=='=') ) {s = 109;}

                        else if ( (LA48_18==':') ) {s = 110;}

                        else if ( (LA48_18=='%') ) {s = 111;}

                        else if ( ((LA48_18>='\u0000' && LA48_18<='\t')||(LA48_18>='\u000B' && LA48_18<='$')||(LA48_18>='&' && LA48_18<='9')||LA48_18==';'||(LA48_18>='?' && LA48_18<='\uFFFF')) ) {s = 112;}

                        else s = 113;

                        if ( s>=0 ) return s;
                        break;
                    case 47 : 
                        int LA48_325 = input.LA(1);

                        s = -1;
                        if ( (LA48_325=='\'') ) {s = 327;}

                        else if ( ((LA48_325>='\u0000' && LA48_325<='\t')||(LA48_325>='\u000B' && LA48_325<='&')||(LA48_325>='(' && LA48_325<='[')||(LA48_325>=']' && LA48_325<='\uFFFF')) ) {s = 196;}

                        else if ( (LA48_325=='\\') ) {s = 195;}

                        else if ( (LA48_325=='\n') ) {s = 142;}

                        if ( s>=0 ) return s;
                        break;
                    case 48 : 
                        int LA48_471 = input.LA(1);

                        s = -1;
                        if ( (LA48_471=='\"') ) {s = 375;}

                        else if ( ((LA48_471>='\u0000' && LA48_471<='\t')||(LA48_471>='\u000B' && LA48_471<='!')||(LA48_471>='#' && LA48_471<='[')||(LA48_471>=']' && LA48_471<='\uFFFF')) ) {s = 376;}

                        else if ( (LA48_471=='\\') ) {s = 377;}

                        if ( s>=0 ) return s;
                        break;
                    case 49 : 
                        int LA48_141 = input.LA(1);

                        s = -1;
                        if ( (LA48_141=='\"') ) {s = 269;}

                        else if ( (LA48_141=='\\') ) {s = 140;}

                        else if ( ((LA48_141>='\u0000' && LA48_141<='\t')||(LA48_141>='\u000B' && LA48_141<='!')||(LA48_141>='#' && LA48_141<='[')||(LA48_141>=']' && LA48_141<='\uFFFF')) ) {s = 141;}

                        else if ( (LA48_141=='\n') ) {s = 142;}

                        if ( s>=0 ) return s;
                        break;
                    case 50 : 
                        int LA48_267 = input.LA(1);

                        s = -1;
                        if ( (LA48_267=='\"') ) {s = 269;}

                        else if ( (LA48_267=='\\') ) {s = 140;}

                        else if ( ((LA48_267>='\u0000' && LA48_267<='\t')||(LA48_267>='\u000B' && LA48_267<='!')||(LA48_267>='#' && LA48_267<='[')||(LA48_267>=']' && LA48_267<='\uFFFF')) ) {s = 141;}

                        else if ( (LA48_267=='\n') ) {s = 142;}

                        if ( s>=0 ) return s;
                        break;
                    case 51 : 
                        int LA48_467 = input.LA(1);

                        s = -1;
                        if ( ((LA48_467>='\u0000' && LA48_467<='\t')||(LA48_467>='\u000B' && LA48_467<='\uFFFF')) ) {s = 157;}

                        else s = 112;

                        if ( s>=0 ) return s;
                        break;
                    case 52 : 
                        int LA48_373 = input.LA(1);

                        s = -1;
                        if ( (LA48_373=='\"') ) {s = 465;}

                        else if ( (LA48_373=='\''||LA48_373=='\\'||LA48_373=='b'||LA48_373=='f'||LA48_373=='n'||LA48_373=='r'||(LA48_373>='t' && LA48_373<='u')) ) {s = 466;}

                        else if ( ((LA48_373>='\u0000' && LA48_373<='\t')||(LA48_373>='\u000B' && LA48_373<='!')||(LA48_373>='#' && LA48_373<='&')||(LA48_373>='(' && LA48_373<='[')||(LA48_373>=']' && LA48_373<='a')||(LA48_373>='c' && LA48_373<='e')||(LA48_373>='g' && LA48_373<='m')||(LA48_373>='o' && LA48_373<='q')||LA48_373=='s'||(LA48_373>='v' && LA48_373<='\uFFFF')) ) {s = 112;}

                        if ( s>=0 ) return s;
                        break;
                    case 53 : 
                        int LA48_268 = input.LA(1);

                        s = -1;
                        if ( ((LA48_268>='0' && LA48_268<='7')) ) {s = 380;}

                        else if ( ((LA48_268>='\u0000' && LA48_268<='\t')||(LA48_268>='\u000B' && LA48_268<='/')||(LA48_268>='8' && LA48_268<='\uFFFF')) ) {s = 112;}

                        if ( s>=0 ) return s;
                        break;
                    case 54 : 
                        int LA48_380 = input.LA(1);

                        s = -1;
                        if ( ((LA48_380>='\u0000' && LA48_380<='\t')||(LA48_380>='\u000B' && LA48_380<='/')||(LA48_380>='8' && LA48_380<='\uFFFF')) ) {s = 112;}

                        else if ( ((LA48_380>='0' && LA48_380<='7')) ) {s = 471;}

                        if ( s>=0 ) return s;
                        break;
                    case 55 : 
                        int LA48_691 = input.LA(1);

                        s = -1;
                        if ( (LA48_691=='\"') ) {s = 368;}

                        else if ( ((LA48_691>='\u0000' && LA48_691<='\t')||(LA48_691>='\u000B' && LA48_691<='!')||(LA48_691>='#' && LA48_691<='[')||(LA48_691>=']' && LA48_691<='\uFFFF')) ) {s = 370;}

                        else if ( (LA48_691=='\\') ) {s = 369;}

                        else if ( (LA48_691=='\n') ) {s = 142;}

                        if ( s>=0 ) return s;
                        break;
                    case 56 : 
                        int LA48_29 = input.LA(1);

                        s = -1;
                        if ( (LA48_29=='\\') ) {s = 140;}

                        else if ( ((LA48_29>='\u0000' && LA48_29<='\t')||(LA48_29>='\u000B' && LA48_29<='!')||(LA48_29>='#' && LA48_29<='[')||(LA48_29>=']' && LA48_29<='\uFFFF')) ) {s = 141;}

                        else if ( (LA48_29=='\n'||LA48_29=='\"') ) {s = 142;}

                        else s = 139;

                        if ( s>=0 ) return s;
                        break;
                    case 57 : 
                        int LA48_0 = input.LA(1);

                        s = -1;
                        if ( (LA48_0=='t') ) {s = 1;}

                        else if ( (LA48_0=='f') ) {s = 2;}

                        else if ( (LA48_0=='n') ) {s = 3;}

                        else if ( (LA48_0==':') ) {s = 4;}

                        else if ( (LA48_0=='[') ) {s = 5;}

                        else if ( (LA48_0==']') ) {s = 6;}

                        else if ( (LA48_0=='a') ) {s = 7;}

                        else if ( (LA48_0=='(') ) {s = 8;}

                        else if ( (LA48_0=='.') ) {s = 9;}

                        else if ( (LA48_0==')') ) {s = 10;}

                        else if ( (LA48_0==',') ) {s = 11;}

                        else if ( (LA48_0=='c') ) {s = 12;}

                        else if ( (LA48_0=='v') ) {s = 13;}

                        else if ( (LA48_0=='&') ) {s = 14;}

                        else if ( (LA48_0=='-') ) {s = 15;}

                        else if ( (LA48_0=='*') ) {s = 16;}

                        else if ( (LA48_0=='o') ) {s = 17;}

                        else if ( (LA48_0=='<') ) {s = 18;}

                        else if ( (LA48_0=='>') ) {s = 19;}

                        else if ( (LA48_0=='d') ) {s = 20;}

                        else if ( (LA48_0=='+') ) {s = 21;}

                        else if ( (LA48_0=='/') ) {s = 22;}

                        else if ( (LA48_0=='%') ) {s = 23;}

                        else if ( (LA48_0=='^') ) {s = 24;}

                        else if ( (LA48_0=='|') ) {s = 25;}

                        else if ( (LA48_0=='~') ) {s = 26;}

                        else if ( (LA48_0=='!') ) {s = 27;}

                        else if ( (LA48_0=='=') ) {s = 28;}

                        else if ( (LA48_0=='\"') ) {s = 29;}

                        else if ( (LA48_0=='C') ) {s = 30;}

                        else if ( (LA48_0=='T') ) {s = 31;}

                        else if ( (LA48_0=='I') ) {s = 32;}

                        else if ( (LA48_0=='P') ) {s = 33;}

                        else if ( (LA48_0=='D') ) {s = 34;}

                        else if ( (LA48_0=='N') ) {s = 35;}

                        else if ( (LA48_0=='A') ) {s = 36;}

                        else if ( (LA48_0=='U') ) {s = 37;}

                        else if ( (LA48_0=='b') ) {s = 38;}

                        else if ( (LA48_0=='e') ) {s = 39;}

                        else if ( (LA48_0=='g') ) {s = 40;}

                        else if ( (LA48_0=='i') ) {s = 41;}

                        else if ( (LA48_0=='l') ) {s = 42;}

                        else if ( (LA48_0=='m') ) {s = 43;}

                        else if ( (LA48_0=='p') ) {s = 44;}

                        else if ( (LA48_0=='r') ) {s = 45;}

                        else if ( (LA48_0=='s') ) {s = 46;}

                        else if ( (LA48_0=='u') ) {s = 47;}

                        else if ( (LA48_0=='w') ) {s = 48;}

                        else if ( (LA48_0=='{') ) {s = 49;}

                        else if ( (LA48_0=='}') ) {s = 50;}

                        else if ( (LA48_0=='#') ) {s = 51;}

                        else if ( (LA48_0==';') ) {s = 52;}

                        else if ( (LA48_0=='?') ) {s = 53;}

                        else if ( (LA48_0=='x') ) {s = 54;}

                        else if ( (LA48_0=='L') ) {s = 55;}

                        else if ( (LA48_0=='\\') ) {s = 56;}

                        else if ( ((LA48_0>='1' && LA48_0<='9')) ) {s = 57;}

                        else if ( (LA48_0=='0') ) {s = 58;}

                        else if ( (LA48_0=='B'||(LA48_0>='E' && LA48_0<='H')||(LA48_0>='J' && LA48_0<='K')||LA48_0=='M'||LA48_0=='O'||(LA48_0>='Q' && LA48_0<='S')||(LA48_0>='V' && LA48_0<='Z')||LA48_0=='_'||LA48_0=='h'||(LA48_0>='j' && LA48_0<='k')||LA48_0=='q'||(LA48_0>='y' && LA48_0<='z')) ) {s = 59;}

                        else if ( (LA48_0=='\'') ) {s = 60;}

                        else if ( ((LA48_0>='\t' && LA48_0<='\n')||LA48_0=='\r'||LA48_0==' ') ) {s = 61;}

                        else if ( ((LA48_0>='\u0000' && LA48_0<='\b')||(LA48_0>='\u000B' && LA48_0<='\f')||(LA48_0>='\u000E' && LA48_0<='\u001F')||LA48_0=='$'||LA48_0=='@'||LA48_0=='`'||(LA48_0>='\u007F' && LA48_0<='\uFFFF')) ) {s = 62;}

                        if ( s>=0 ) return s;
                        break;
                    case 58 : 
                        int LA48_377 = input.LA(1);

                        s = -1;
                        if ( (LA48_377=='\"') ) {s = 467;}

                        else if ( (LA48_377=='x') ) {s = 265;}

                        else if ( (LA48_377=='u') ) {s = 468;}

                        else if ( (LA48_377=='U') ) {s = 266;}

                        else if ( (LA48_377=='\''||LA48_377=='?'||LA48_377=='\\'||(LA48_377>='a' && LA48_377<='b')||LA48_377=='f'||LA48_377=='n'||LA48_377=='r'||LA48_377=='t'||LA48_377=='v') ) {s = 264;}

                        else if ( ((LA48_377>='0' && LA48_377<='7')) ) {s = 268;}

                        else if ( ((LA48_377>='\u0000' && LA48_377<='\t')||(LA48_377>='\u000B' && LA48_377<='!')||(LA48_377>='#' && LA48_377<='&')||(LA48_377>='(' && LA48_377<='/')||(LA48_377>='8' && LA48_377<='>')||(LA48_377>='@' && LA48_377<='T')||(LA48_377>='V' && LA48_377<='[')||(LA48_377>=']' && LA48_377<='`')||(LA48_377>='c' && LA48_377<='e')||(LA48_377>='g' && LA48_377<='m')||(LA48_377>='o' && LA48_377<='q')||LA48_377=='s'||LA48_377=='w'||(LA48_377>='y' && LA48_377<='\uFFFF')) ) {s = 112;}

                        if ( s>=0 ) return s;
                        break;
                    case 59 : 
                        int LA48_262 = input.LA(1);

                        s = -1;
                        if ( (LA48_262=='\"') ) {s = 368;}

                        else if ( (LA48_262=='\\') ) {s = 369;}

                        else if ( ((LA48_262>='\u0000' && LA48_262<='\t')||(LA48_262>='\u000B' && LA48_262<='!')||(LA48_262>='#' && LA48_262<='[')||(LA48_262>=']' && LA48_262<='\uFFFF')) ) {s = 370;}

                        else if ( (LA48_262=='\n') ) {s = 142;}

                        else s = 112;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 48, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}