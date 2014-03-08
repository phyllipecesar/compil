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
    public static final int RULE_ANY_OTHER=37;
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
    public static final int RULE_ML_COMMENT=34;
    public static final int RULE_STRING=33;
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
    public static final int T__101=101;
    public static final int RULE_PREPROCESSING_OP_OR_PUNC=5;
    public static final int T__100=100;
    public static final int RULE_SL_COMMENT=35;
    public static final int RULE_HEXADECIMAL_DIGIT=11;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_UNIVERSAL_CHARACTER_NAME=13;
    public static final int RULE_WS=36;

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

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
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
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
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
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
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
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
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
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
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
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
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
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
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
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
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
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
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
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
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
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
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
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
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
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
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
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
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
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
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
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
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
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
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
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
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
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
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
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
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
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
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
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
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
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
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
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
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
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
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
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
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
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
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
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
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
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
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
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
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
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
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
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
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
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
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
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
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
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
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
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
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
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
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
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
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
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
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
    // $ANTLR end "T__78"

    // $ANTLR start "T__79"
    public final void mT__79() throws RecognitionException {
        try {
            int _type = T__79;
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
    // $ANTLR end "T__79"

    // $ANTLR start "T__80"
    public final void mT__80() throws RecognitionException {
        try {
            int _type = T__80;
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
    // $ANTLR end "T__80"

    // $ANTLR start "T__81"
    public final void mT__81() throws RecognitionException {
        try {
            int _type = T__81;
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
    // $ANTLR end "T__81"

    // $ANTLR start "T__82"
    public final void mT__82() throws RecognitionException {
        try {
            int _type = T__82;
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
    // $ANTLR end "T__82"

    // $ANTLR start "T__83"
    public final void mT__83() throws RecognitionException {
        try {
            int _type = T__83;
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
    // $ANTLR end "T__83"

    // $ANTLR start "T__84"
    public final void mT__84() throws RecognitionException {
        try {
            int _type = T__84;
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
    // $ANTLR end "T__84"

    // $ANTLR start "T__85"
    public final void mT__85() throws RecognitionException {
        try {
            int _type = T__85;
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
    // $ANTLR end "T__85"

    // $ANTLR start "T__86"
    public final void mT__86() throws RecognitionException {
        try {
            int _type = T__86;
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
    // $ANTLR end "T__86"

    // $ANTLR start "T__87"
    public final void mT__87() throws RecognitionException {
        try {
            int _type = T__87;
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
    // $ANTLR end "T__87"

    // $ANTLR start "T__88"
    public final void mT__88() throws RecognitionException {
        try {
            int _type = T__88;
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
    // $ANTLR end "T__88"

    // $ANTLR start "T__89"
    public final void mT__89() throws RecognitionException {
        try {
            int _type = T__89;
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
    // $ANTLR end "T__89"

    // $ANTLR start "T__90"
    public final void mT__90() throws RecognitionException {
        try {
            int _type = T__90;
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
    // $ANTLR end "T__90"

    // $ANTLR start "T__91"
    public final void mT__91() throws RecognitionException {
        try {
            int _type = T__91;
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
    // $ANTLR end "T__91"

    // $ANTLR start "T__92"
    public final void mT__92() throws RecognitionException {
        try {
            int _type = T__92;
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
    // $ANTLR end "T__92"

    // $ANTLR start "T__93"
    public final void mT__93() throws RecognitionException {
        try {
            int _type = T__93;
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
    // $ANTLR end "T__93"

    // $ANTLR start "T__94"
    public final void mT__94() throws RecognitionException {
        try {
            int _type = T__94;
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
    // $ANTLR end "T__94"

    // $ANTLR start "T__95"
    public final void mT__95() throws RecognitionException {
        try {
            int _type = T__95;
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
    // $ANTLR end "T__95"

    // $ANTLR start "T__96"
    public final void mT__96() throws RecognitionException {
        try {
            int _type = T__96;
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
    // $ANTLR end "T__96"

    // $ANTLR start "T__97"
    public final void mT__97() throws RecognitionException {
        try {
            int _type = T__97;
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
    // $ANTLR end "T__97"

    // $ANTLR start "T__98"
    public final void mT__98() throws RecognitionException {
        try {
            int _type = T__98;
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
    // $ANTLR end "T__98"

    // $ANTLR start "T__99"
    public final void mT__99() throws RecognitionException {
        try {
            int _type = T__99;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:72:7: ( 'TypeId' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:72:9: 'TypeId'
            {
            match("TypeId"); 


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
    // $ANTLR end "T__100"

    // $ANTLR start "T__101"
    public final void mT__101() throws RecognitionException {
        try {
            int _type = T__101;
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
    // $ANTLR end "T__101"

    // $ANTLR start "T__102"
    public final void mT__102() throws RecognitionException {
        try {
            int _type = T__102;
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
    // $ANTLR end "T__102"

    // $ANTLR start "T__103"
    public final void mT__103() throws RecognitionException {
        try {
            int _type = T__103;
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
    // $ANTLR end "T__103"

    // $ANTLR start "T__104"
    public final void mT__104() throws RecognitionException {
        try {
            int _type = T__104;
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
    // $ANTLR end "T__104"

    // $ANTLR start "T__105"
    public final void mT__105() throws RecognitionException {
        try {
            int _type = T__105;
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
    // $ANTLR end "T__105"

    // $ANTLR start "T__106"
    public final void mT__106() throws RecognitionException {
        try {
            int _type = T__106;
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
    // $ANTLR end "T__106"

    // $ANTLR start "T__107"
    public final void mT__107() throws RecognitionException {
        try {
            int _type = T__107;
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
    // $ANTLR end "T__107"

    // $ANTLR start "T__108"
    public final void mT__108() throws RecognitionException {
        try {
            int _type = T__108;
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
    // $ANTLR end "T__108"

    // $ANTLR start "T__109"
    public final void mT__109() throws RecognitionException {
        try {
            int _type = T__109;
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
    // $ANTLR end "T__109"

    // $ANTLR start "T__110"
    public final void mT__110() throws RecognitionException {
        try {
            int _type = T__110;
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
    // $ANTLR end "T__110"

    // $ANTLR start "T__111"
    public final void mT__111() throws RecognitionException {
        try {
            int _type = T__111;
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
    // $ANTLR end "T__111"

    // $ANTLR start "T__112"
    public final void mT__112() throws RecognitionException {
        try {
            int _type = T__112;
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
    // $ANTLR end "T__112"

    // $ANTLR start "T__113"
    public final void mT__113() throws RecognitionException {
        try {
            int _type = T__113;
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
    // $ANTLR end "T__113"

    // $ANTLR start "T__114"
    public final void mT__114() throws RecognitionException {
        try {
            int _type = T__114;
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
    // $ANTLR end "T__114"

    // $ANTLR start "T__115"
    public final void mT__115() throws RecognitionException {
        try {
            int _type = T__115;
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
    // $ANTLR end "T__115"

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

    // $ANTLR start "RULE_NONDIGIT"
    public final void mRULE_NONDIGIT() throws RecognitionException {
        try {
            int _type = RULE_NONDIGIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3030:15: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3030:17: ( 'a' .. 'z' | 'A' .. 'Z' | '_' )
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

    // $ANTLR start "RULE_DIGIT"
    public final void mRULE_DIGIT() throws RecognitionException {
        try {
            int _type = RULE_DIGIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3032:12: ( '0' .. '9' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3032:14: '0' .. '9'
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

    // $ANTLR start "RULE_KEYWORD"
    public final void mRULE_KEYWORD() throws RecognitionException {
        try {
            int _type = RULE_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3034:14: ( ( 'alignas' | 'alignof' | 'asm' | 'auto' | 'bool' | 'break' | 'case' | 'catch' | 'char' | 'char16_t' | 'char32_t' | 'class' | 'const' | 'constexpr' | 'const_cast' | 'continue' | 'decltype' | 'default' | 'delete' | 'do' | 'double' | 'dynamic_cast' | 'else' | 'enum' | 'explicit' | 'export' | 'extern' | 'false' | 'float' | 'for' | 'friend' | 'goto' | 'if' | 'inline' | 'int' | 'long' | 'mutable' | 'namespace' | 'new' | 'noexcept' | 'nullptr' | 'operator' | 'private' | 'protected' | 'public' | 'register' | 'reinterpret_cast' | 'return' | 'short' | 'signed' | 'sizeof' | 'static' | 'static_assert' | 'static_cast' | 'struct' | 'switch' | 'template' | 'this' | 'thread_local' | 'throw' | 'true' | 'try' | 'typedef' | 'typeid' | 'typename' | 'union' | 'unsigned' | 'using' | 'virtual' | 'void' | 'volatile' | 'wchar_t' | 'while' ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3034:16: ( 'alignas' | 'alignof' | 'asm' | 'auto' | 'bool' | 'break' | 'case' | 'catch' | 'char' | 'char16_t' | 'char32_t' | 'class' | 'const' | 'constexpr' | 'const_cast' | 'continue' | 'decltype' | 'default' | 'delete' | 'do' | 'double' | 'dynamic_cast' | 'else' | 'enum' | 'explicit' | 'export' | 'extern' | 'false' | 'float' | 'for' | 'friend' | 'goto' | 'if' | 'inline' | 'int' | 'long' | 'mutable' | 'namespace' | 'new' | 'noexcept' | 'nullptr' | 'operator' | 'private' | 'protected' | 'public' | 'register' | 'reinterpret_cast' | 'return' | 'short' | 'signed' | 'sizeof' | 'static' | 'static_assert' | 'static_cast' | 'struct' | 'switch' | 'template' | 'this' | 'thread_local' | 'throw' | 'true' | 'try' | 'typedef' | 'typeid' | 'typename' | 'union' | 'unsigned' | 'using' | 'virtual' | 'void' | 'volatile' | 'wchar_t' | 'while' )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3034:16: ( 'alignas' | 'alignof' | 'asm' | 'auto' | 'bool' | 'break' | 'case' | 'catch' | 'char' | 'char16_t' | 'char32_t' | 'class' | 'const' | 'constexpr' | 'const_cast' | 'continue' | 'decltype' | 'default' | 'delete' | 'do' | 'double' | 'dynamic_cast' | 'else' | 'enum' | 'explicit' | 'export' | 'extern' | 'false' | 'float' | 'for' | 'friend' | 'goto' | 'if' | 'inline' | 'int' | 'long' | 'mutable' | 'namespace' | 'new' | 'noexcept' | 'nullptr' | 'operator' | 'private' | 'protected' | 'public' | 'register' | 'reinterpret_cast' | 'return' | 'short' | 'signed' | 'sizeof' | 'static' | 'static_assert' | 'static_cast' | 'struct' | 'switch' | 'template' | 'this' | 'thread_local' | 'throw' | 'true' | 'try' | 'typedef' | 'typeid' | 'typename' | 'union' | 'unsigned' | 'using' | 'virtual' | 'void' | 'volatile' | 'wchar_t' | 'while' )
            int alt5=73;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3034:17: 'alignas'
                    {
                    match("alignas"); 


                    }
                    break;
                case 2 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3034:27: 'alignof'
                    {
                    match("alignof"); 


                    }
                    break;
                case 3 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3034:37: 'asm'
                    {
                    match("asm"); 


                    }
                    break;
                case 4 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3034:43: 'auto'
                    {
                    match("auto"); 


                    }
                    break;
                case 5 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3034:50: 'bool'
                    {
                    match("bool"); 


                    }
                    break;
                case 6 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3034:57: 'break'
                    {
                    match("break"); 


                    }
                    break;
                case 7 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3034:65: 'case'
                    {
                    match("case"); 


                    }
                    break;
                case 8 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3034:72: 'catch'
                    {
                    match("catch"); 


                    }
                    break;
                case 9 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3034:80: 'char'
                    {
                    match("char"); 


                    }
                    break;
                case 10 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3034:87: 'char16_t'
                    {
                    match("char16_t"); 


                    }
                    break;
                case 11 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3034:98: 'char32_t'
                    {
                    match("char32_t"); 


                    }
                    break;
                case 12 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3034:109: 'class'
                    {
                    match("class"); 


                    }
                    break;
                case 13 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3034:117: 'const'
                    {
                    match("const"); 


                    }
                    break;
                case 14 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3034:125: 'constexpr'
                    {
                    match("constexpr"); 


                    }
                    break;
                case 15 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3034:137: 'const_cast'
                    {
                    match("const_cast"); 


                    }
                    break;
                case 16 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3034:150: 'continue'
                    {
                    match("continue"); 


                    }
                    break;
                case 17 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3034:161: 'decltype'
                    {
                    match("decltype"); 


                    }
                    break;
                case 18 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3034:172: 'default'
                    {
                    match("default"); 


                    }
                    break;
                case 19 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3034:182: 'delete'
                    {
                    match("delete"); 


                    }
                    break;
                case 20 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3034:191: 'do'
                    {
                    match("do"); 


                    }
                    break;
                case 21 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3034:196: 'double'
                    {
                    match("double"); 


                    }
                    break;
                case 22 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3034:205: 'dynamic_cast'
                    {
                    match("dynamic_cast"); 


                    }
                    break;
                case 23 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3034:220: 'else'
                    {
                    match("else"); 


                    }
                    break;
                case 24 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3034:227: 'enum'
                    {
                    match("enum"); 


                    }
                    break;
                case 25 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3034:234: 'explicit'
                    {
                    match("explicit"); 


                    }
                    break;
                case 26 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3034:245: 'export'
                    {
                    match("export"); 


                    }
                    break;
                case 27 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3034:254: 'extern'
                    {
                    match("extern"); 


                    }
                    break;
                case 28 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3034:263: 'false'
                    {
                    match("false"); 


                    }
                    break;
                case 29 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3034:271: 'float'
                    {
                    match("float"); 


                    }
                    break;
                case 30 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3034:279: 'for'
                    {
                    match("for"); 


                    }
                    break;
                case 31 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3034:285: 'friend'
                    {
                    match("friend"); 


                    }
                    break;
                case 32 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3034:294: 'goto'
                    {
                    match("goto"); 


                    }
                    break;
                case 33 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3034:301: 'if'
                    {
                    match("if"); 


                    }
                    break;
                case 34 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3034:306: 'inline'
                    {
                    match("inline"); 


                    }
                    break;
                case 35 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3034:315: 'int'
                    {
                    match("int"); 


                    }
                    break;
                case 36 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3034:321: 'long'
                    {
                    match("long"); 


                    }
                    break;
                case 37 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3034:328: 'mutable'
                    {
                    match("mutable"); 


                    }
                    break;
                case 38 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3034:338: 'namespace'
                    {
                    match("namespace"); 


                    }
                    break;
                case 39 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3034:350: 'new'
                    {
                    match("new"); 


                    }
                    break;
                case 40 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3034:356: 'noexcept'
                    {
                    match("noexcept"); 


                    }
                    break;
                case 41 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3034:367: 'nullptr'
                    {
                    match("nullptr"); 


                    }
                    break;
                case 42 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3034:377: 'operator'
                    {
                    match("operator"); 


                    }
                    break;
                case 43 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3034:388: 'private'
                    {
                    match("private"); 


                    }
                    break;
                case 44 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3034:398: 'protected'
                    {
                    match("protected"); 


                    }
                    break;
                case 45 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3034:410: 'public'
                    {
                    match("public"); 


                    }
                    break;
                case 46 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3034:419: 'register'
                    {
                    match("register"); 


                    }
                    break;
                case 47 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3034:430: 'reinterpret_cast'
                    {
                    match("reinterpret_cast"); 


                    }
                    break;
                case 48 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3034:449: 'return'
                    {
                    match("return"); 


                    }
                    break;
                case 49 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3034:458: 'short'
                    {
                    match("short"); 


                    }
                    break;
                case 50 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3034:466: 'signed'
                    {
                    match("signed"); 


                    }
                    break;
                case 51 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3034:475: 'sizeof'
                    {
                    match("sizeof"); 


                    }
                    break;
                case 52 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3034:484: 'static'
                    {
                    match("static"); 


                    }
                    break;
                case 53 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3034:493: 'static_assert'
                    {
                    match("static_assert"); 


                    }
                    break;
                case 54 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3034:509: 'static_cast'
                    {
                    match("static_cast"); 


                    }
                    break;
                case 55 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3034:523: 'struct'
                    {
                    match("struct"); 


                    }
                    break;
                case 56 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3034:532: 'switch'
                    {
                    match("switch"); 


                    }
                    break;
                case 57 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3034:541: 'template'
                    {
                    match("template"); 


                    }
                    break;
                case 58 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3034:552: 'this'
                    {
                    match("this"); 


                    }
                    break;
                case 59 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3034:559: 'thread_local'
                    {
                    match("thread_local"); 


                    }
                    break;
                case 60 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3034:574: 'throw'
                    {
                    match("throw"); 


                    }
                    break;
                case 61 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3034:582: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 62 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3034:589: 'try'
                    {
                    match("try"); 


                    }
                    break;
                case 63 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3034:595: 'typedef'
                    {
                    match("typedef"); 


                    }
                    break;
                case 64 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3034:605: 'typeid'
                    {
                    match("typeid"); 


                    }
                    break;
                case 65 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3034:614: 'typename'
                    {
                    match("typename"); 


                    }
                    break;
                case 66 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3034:625: 'union'
                    {
                    match("union"); 


                    }
                    break;
                case 67 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3034:633: 'unsigned'
                    {
                    match("unsigned"); 


                    }
                    break;
                case 68 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3034:644: 'using'
                    {
                    match("using"); 


                    }
                    break;
                case 69 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3034:652: 'virtual'
                    {
                    match("virtual"); 


                    }
                    break;
                case 70 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3034:662: 'void'
                    {
                    match("void"); 


                    }
                    break;
                case 71 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3034:669: 'volatile'
                    {
                    match("volatile"); 


                    }
                    break;
                case 72 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3034:680: 'wchar_t'
                    {
                    match("wchar_t"); 


                    }
                    break;
                case 73 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3034:690: 'while'
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
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3036:31: ( ( '{' | '}' | '[' | ']' | '#' | '##' | '(' | ')' | '<:' | ':>' | '<%' | '%>' | '%:' | '%:%:' | ';' | ':' | '...' | 'new' | 'delete' | '?' | '::' | '.' | '.*' | '+' | '-' | '*' | '/' | '%' | '^' | '&' | '|' | '~' | '!' | '=' | '<' | '>' | '+=' | '-=' | '*=' | '/=' | '%=' | '^=' | '&=' | '|=' | '<<' | '>>' | '<<=' | '>>=' | '==' | '!=' | '<=' | '>=' | '&&' | '||' | '++' | '--' | ',' | '->*' | '->' | 'and' | 'and_eq' | 'bitand' | 'bitor' | 'compl' | 'not' | 'not_eq' | 'or' | 'or_eq' | 'xor' | 'xor_eq' ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3036:33: ( '{' | '}' | '[' | ']' | '#' | '##' | '(' | ')' | '<:' | ':>' | '<%' | '%>' | '%:' | '%:%:' | ';' | ':' | '...' | 'new' | 'delete' | '?' | '::' | '.' | '.*' | '+' | '-' | '*' | '/' | '%' | '^' | '&' | '|' | '~' | '!' | '=' | '<' | '>' | '+=' | '-=' | '*=' | '/=' | '%=' | '^=' | '&=' | '|=' | '<<' | '>>' | '<<=' | '>>=' | '==' | '!=' | '<=' | '>=' | '&&' | '||' | '++' | '--' | ',' | '->*' | '->' | 'and' | 'and_eq' | 'bitand' | 'bitor' | 'compl' | 'not' | 'not_eq' | 'or' | 'or_eq' | 'xor' | 'xor_eq' )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3036:33: ( '{' | '}' | '[' | ']' | '#' | '##' | '(' | ')' | '<:' | ':>' | '<%' | '%>' | '%:' | '%:%:' | ';' | ':' | '...' | 'new' | 'delete' | '?' | '::' | '.' | '.*' | '+' | '-' | '*' | '/' | '%' | '^' | '&' | '|' | '~' | '!' | '=' | '<' | '>' | '+=' | '-=' | '*=' | '/=' | '%=' | '^=' | '&=' | '|=' | '<<' | '>>' | '<<=' | '>>=' | '==' | '!=' | '<=' | '>=' | '&&' | '||' | '++' | '--' | ',' | '->*' | '->' | 'and' | 'and_eq' | 'bitand' | 'bitor' | 'compl' | 'not' | 'not_eq' | 'or' | 'or_eq' | 'xor' | 'xor_eq' )
            int alt6=70;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3036:34: '{'
                    {
                    match('{'); 

                    }
                    break;
                case 2 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3036:38: '}'
                    {
                    match('}'); 

                    }
                    break;
                case 3 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3036:42: '['
                    {
                    match('['); 

                    }
                    break;
                case 4 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3036:46: ']'
                    {
                    match(']'); 

                    }
                    break;
                case 5 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3036:50: '#'
                    {
                    match('#'); 

                    }
                    break;
                case 6 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3036:54: '##'
                    {
                    match("##"); 


                    }
                    break;
                case 7 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3036:59: '('
                    {
                    match('('); 

                    }
                    break;
                case 8 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3036:63: ')'
                    {
                    match(')'); 

                    }
                    break;
                case 9 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3036:67: '<:'
                    {
                    match("<:"); 


                    }
                    break;
                case 10 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3036:72: ':>'
                    {
                    match(":>"); 


                    }
                    break;
                case 11 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3036:77: '<%'
                    {
                    match("<%"); 


                    }
                    break;
                case 12 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3036:82: '%>'
                    {
                    match("%>"); 


                    }
                    break;
                case 13 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3036:87: '%:'
                    {
                    match("%:"); 


                    }
                    break;
                case 14 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3036:92: '%:%:'
                    {
                    match("%:%:"); 


                    }
                    break;
                case 15 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3036:99: ';'
                    {
                    match(';'); 

                    }
                    break;
                case 16 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3036:103: ':'
                    {
                    match(':'); 

                    }
                    break;
                case 17 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3036:107: '...'
                    {
                    match("..."); 


                    }
                    break;
                case 18 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3036:113: 'new'
                    {
                    match("new"); 


                    }
                    break;
                case 19 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3036:119: 'delete'
                    {
                    match("delete"); 


                    }
                    break;
                case 20 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3036:128: '?'
                    {
                    match('?'); 

                    }
                    break;
                case 21 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3036:132: '::'
                    {
                    match("::"); 


                    }
                    break;
                case 22 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3036:137: '.'
                    {
                    match('.'); 

                    }
                    break;
                case 23 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3036:141: '.*'
                    {
                    match(".*"); 


                    }
                    break;
                case 24 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3036:146: '+'
                    {
                    match('+'); 

                    }
                    break;
                case 25 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3036:150: '-'
                    {
                    match('-'); 

                    }
                    break;
                case 26 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3036:154: '*'
                    {
                    match('*'); 

                    }
                    break;
                case 27 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3036:158: '/'
                    {
                    match('/'); 

                    }
                    break;
                case 28 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3036:162: '%'
                    {
                    match('%'); 

                    }
                    break;
                case 29 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3036:166: '^'
                    {
                    match('^'); 

                    }
                    break;
                case 30 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3036:170: '&'
                    {
                    match('&'); 

                    }
                    break;
                case 31 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3036:174: '|'
                    {
                    match('|'); 

                    }
                    break;
                case 32 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3036:178: '~'
                    {
                    match('~'); 

                    }
                    break;
                case 33 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3036:182: '!'
                    {
                    match('!'); 

                    }
                    break;
                case 34 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3036:186: '='
                    {
                    match('='); 

                    }
                    break;
                case 35 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3036:190: '<'
                    {
                    match('<'); 

                    }
                    break;
                case 36 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3036:194: '>'
                    {
                    match('>'); 

                    }
                    break;
                case 37 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3036:198: '+='
                    {
                    match("+="); 


                    }
                    break;
                case 38 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3036:203: '-='
                    {
                    match("-="); 


                    }
                    break;
                case 39 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3036:208: '*='
                    {
                    match("*="); 


                    }
                    break;
                case 40 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3036:213: '/='
                    {
                    match("/="); 


                    }
                    break;
                case 41 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3036:218: '%='
                    {
                    match("%="); 


                    }
                    break;
                case 42 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3036:223: '^='
                    {
                    match("^="); 


                    }
                    break;
                case 43 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3036:228: '&='
                    {
                    match("&="); 


                    }
                    break;
                case 44 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3036:233: '|='
                    {
                    match("|="); 


                    }
                    break;
                case 45 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3036:238: '<<'
                    {
                    match("<<"); 


                    }
                    break;
                case 46 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3036:243: '>>'
                    {
                    match(">>"); 


                    }
                    break;
                case 47 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3036:248: '<<='
                    {
                    match("<<="); 


                    }
                    break;
                case 48 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3036:254: '>>='
                    {
                    match(">>="); 


                    }
                    break;
                case 49 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3036:260: '=='
                    {
                    match("=="); 


                    }
                    break;
                case 50 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3036:265: '!='
                    {
                    match("!="); 


                    }
                    break;
                case 51 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3036:270: '<='
                    {
                    match("<="); 


                    }
                    break;
                case 52 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3036:275: '>='
                    {
                    match(">="); 


                    }
                    break;
                case 53 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3036:280: '&&'
                    {
                    match("&&"); 


                    }
                    break;
                case 54 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3036:285: '||'
                    {
                    match("||"); 


                    }
                    break;
                case 55 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3036:290: '++'
                    {
                    match("++"); 


                    }
                    break;
                case 56 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3036:295: '--'
                    {
                    match("--"); 


                    }
                    break;
                case 57 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3036:300: ','
                    {
                    match(','); 

                    }
                    break;
                case 58 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3036:304: '->*'
                    {
                    match("->*"); 


                    }
                    break;
                case 59 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3036:310: '->'
                    {
                    match("->"); 


                    }
                    break;
                case 60 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3036:315: 'and'
                    {
                    match("and"); 


                    }
                    break;
                case 61 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3036:321: 'and_eq'
                    {
                    match("and_eq"); 


                    }
                    break;
                case 62 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3036:330: 'bitand'
                    {
                    match("bitand"); 


                    }
                    break;
                case 63 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3036:339: 'bitor'
                    {
                    match("bitor"); 


                    }
                    break;
                case 64 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3036:347: 'compl'
                    {
                    match("compl"); 


                    }
                    break;
                case 65 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3036:355: 'not'
                    {
                    match("not"); 


                    }
                    break;
                case 66 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3036:361: 'not_eq'
                    {
                    match("not_eq"); 


                    }
                    break;
                case 67 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3036:370: 'or'
                    {
                    match("or"); 


                    }
                    break;
                case 68 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3036:375: 'or_eq'
                    {
                    match("or_eq"); 


                    }
                    break;
                case 69 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3036:383: 'xor'
                    {
                    match("xor"); 


                    }
                    break;
                case 70 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3036:389: 'xor_eq'
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
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3038:9: ( ( RULE_NONDIGIT | RULE_UNIVERSAL_CHARACTER_NAME ) ( RULE_DIGIT | RULE_NONDIGIT | RULE_UNIVERSAL_CHARACTER_NAME )* )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3038:11: ( RULE_NONDIGIT | RULE_UNIVERSAL_CHARACTER_NAME ) ( RULE_DIGIT | RULE_NONDIGIT | RULE_UNIVERSAL_CHARACTER_NAME )*
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3038:11: ( RULE_NONDIGIT | RULE_UNIVERSAL_CHARACTER_NAME )
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
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3038:12: RULE_NONDIGIT
                    {
                    mRULE_NONDIGIT(); 

                    }
                    break;
                case 2 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3038:26: RULE_UNIVERSAL_CHARACTER_NAME
                    {
                    mRULE_UNIVERSAL_CHARACTER_NAME(); 

                    }
                    break;

            }

            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3038:57: ( RULE_DIGIT | RULE_NONDIGIT | RULE_UNIVERSAL_CHARACTER_NAME )*
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
            	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3038:58: RULE_DIGIT
            	    {
            	    mRULE_DIGIT(); 

            	    }
            	    break;
            	case 2 :
            	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3038:69: RULE_NONDIGIT
            	    {
            	    mRULE_NONDIGIT(); 

            	    }
            	    break;
            	case 3 :
            	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3038:83: RULE_UNIVERSAL_CHARACTER_NAME
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

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3078:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3078:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3078:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3078:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3078:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3078:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3078:66: ~ ( ( '\\\\' | '\"' ) )
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
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3078:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3078:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3078:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3078:137: ~ ( ( '\\\\' | '\\'' ) )
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
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3080:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3080:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3080:24: ( options {greedy=false; } : . )*
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
            	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3080:52: .
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
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3082:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3082:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3082:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( ((LA42_0>='\u0000' && LA42_0<='\t')||(LA42_0>='\u000B' && LA42_0<='\f')||(LA42_0>='\u000E' && LA42_0<='\uFFFF')) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3082:24: ~ ( ( '\\n' | '\\r' ) )
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

            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3082:40: ( ( '\\r' )? '\\n' )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0=='\n'||LA44_0=='\r') ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3082:41: ( '\\r' )? '\\n'
                    {
                    // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3082:41: ( '\\r' )?
                    int alt43=2;
                    int LA43_0 = input.LA(1);

                    if ( (LA43_0=='\r') ) {
                        alt43=1;
                    }
                    switch (alt43) {
                        case 1 :
                            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3082:41: '\\r'
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
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3084:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3084:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3084:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3086:16: ( . )
            // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:3086:18: .
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
        // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:8: ( T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | T__114 | T__115 | RULE_HEADER_NAME | RULE_NONDIGIT | RULE_DIGIT | RULE_KEYWORD | RULE_PREPROCESSING_OP_OR_PUNC | RULE_ID | RULE_INT | RULE_CHARACTER_LITERAL | RULE_FLOATING_LITERAL | RULE_STRING_LITERAL | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt46=93;
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
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:22: T__40
                {
                mT__40(); 

                }
                break;
            case 4 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:28: T__41
                {
                mT__41(); 

                }
                break;
            case 5 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:34: T__42
                {
                mT__42(); 

                }
                break;
            case 6 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:40: T__43
                {
                mT__43(); 

                }
                break;
            case 7 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:46: T__44
                {
                mT__44(); 

                }
                break;
            case 8 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:52: T__45
                {
                mT__45(); 

                }
                break;
            case 9 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:58: T__46
                {
                mT__46(); 

                }
                break;
            case 10 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:64: T__47
                {
                mT__47(); 

                }
                break;
            case 11 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:70: T__48
                {
                mT__48(); 

                }
                break;
            case 12 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:76: T__49
                {
                mT__49(); 

                }
                break;
            case 13 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:82: T__50
                {
                mT__50(); 

                }
                break;
            case 14 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:88: T__51
                {
                mT__51(); 

                }
                break;
            case 15 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:94: T__52
                {
                mT__52(); 

                }
                break;
            case 16 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:100: T__53
                {
                mT__53(); 

                }
                break;
            case 17 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:106: T__54
                {
                mT__54(); 

                }
                break;
            case 18 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:112: T__55
                {
                mT__55(); 

                }
                break;
            case 19 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:118: T__56
                {
                mT__56(); 

                }
                break;
            case 20 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:124: T__57
                {
                mT__57(); 

                }
                break;
            case 21 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:130: T__58
                {
                mT__58(); 

                }
                break;
            case 22 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:136: T__59
                {
                mT__59(); 

                }
                break;
            case 23 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:142: T__60
                {
                mT__60(); 

                }
                break;
            case 24 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:148: T__61
                {
                mT__61(); 

                }
                break;
            case 25 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:154: T__62
                {
                mT__62(); 

                }
                break;
            case 26 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:160: T__63
                {
                mT__63(); 

                }
                break;
            case 27 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:166: T__64
                {
                mT__64(); 

                }
                break;
            case 28 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:172: T__65
                {
                mT__65(); 

                }
                break;
            case 29 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:178: T__66
                {
                mT__66(); 

                }
                break;
            case 30 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:184: T__67
                {
                mT__67(); 

                }
                break;
            case 31 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:190: T__68
                {
                mT__68(); 

                }
                break;
            case 32 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:196: T__69
                {
                mT__69(); 

                }
                break;
            case 33 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:202: T__70
                {
                mT__70(); 

                }
                break;
            case 34 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:208: T__71
                {
                mT__71(); 

                }
                break;
            case 35 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:214: T__72
                {
                mT__72(); 

                }
                break;
            case 36 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:220: T__73
                {
                mT__73(); 

                }
                break;
            case 37 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:226: T__74
                {
                mT__74(); 

                }
                break;
            case 38 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:232: T__75
                {
                mT__75(); 

                }
                break;
            case 39 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:238: T__76
                {
                mT__76(); 

                }
                break;
            case 40 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:244: T__77
                {
                mT__77(); 

                }
                break;
            case 41 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:250: T__78
                {
                mT__78(); 

                }
                break;
            case 42 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:256: T__79
                {
                mT__79(); 

                }
                break;
            case 43 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:262: T__80
                {
                mT__80(); 

                }
                break;
            case 44 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:268: T__81
                {
                mT__81(); 

                }
                break;
            case 45 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:274: T__82
                {
                mT__82(); 

                }
                break;
            case 46 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:280: T__83
                {
                mT__83(); 

                }
                break;
            case 47 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:286: T__84
                {
                mT__84(); 

                }
                break;
            case 48 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:292: T__85
                {
                mT__85(); 

                }
                break;
            case 49 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:298: T__86
                {
                mT__86(); 

                }
                break;
            case 50 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:304: T__87
                {
                mT__87(); 

                }
                break;
            case 51 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:310: T__88
                {
                mT__88(); 

                }
                break;
            case 52 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:316: T__89
                {
                mT__89(); 

                }
                break;
            case 53 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:322: T__90
                {
                mT__90(); 

                }
                break;
            case 54 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:328: T__91
                {
                mT__91(); 

                }
                break;
            case 55 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:334: T__92
                {
                mT__92(); 

                }
                break;
            case 56 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:340: T__93
                {
                mT__93(); 

                }
                break;
            case 57 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:346: T__94
                {
                mT__94(); 

                }
                break;
            case 58 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:352: T__95
                {
                mT__95(); 

                }
                break;
            case 59 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:358: T__96
                {
                mT__96(); 

                }
                break;
            case 60 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:364: T__97
                {
                mT__97(); 

                }
                break;
            case 61 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:370: T__98
                {
                mT__98(); 

                }
                break;
            case 62 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:376: T__99
                {
                mT__99(); 

                }
                break;
            case 63 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:382: T__100
                {
                mT__100(); 

                }
                break;
            case 64 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:389: T__101
                {
                mT__101(); 

                }
                break;
            case 65 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:396: T__102
                {
                mT__102(); 

                }
                break;
            case 66 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:403: T__103
                {
                mT__103(); 

                }
                break;
            case 67 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:410: T__104
                {
                mT__104(); 

                }
                break;
            case 68 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:417: T__105
                {
                mT__105(); 

                }
                break;
            case 69 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:424: T__106
                {
                mT__106(); 

                }
                break;
            case 70 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:431: T__107
                {
                mT__107(); 

                }
                break;
            case 71 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:438: T__108
                {
                mT__108(); 

                }
                break;
            case 72 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:445: T__109
                {
                mT__109(); 

                }
                break;
            case 73 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:452: T__110
                {
                mT__110(); 

                }
                break;
            case 74 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:459: T__111
                {
                mT__111(); 

                }
                break;
            case 75 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:466: T__112
                {
                mT__112(); 

                }
                break;
            case 76 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:473: T__113
                {
                mT__113(); 

                }
                break;
            case 77 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:480: T__114
                {
                mT__114(); 

                }
                break;
            case 78 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:487: T__115
                {
                mT__115(); 

                }
                break;
            case 79 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:494: RULE_HEADER_NAME
                {
                mRULE_HEADER_NAME(); 

                }
                break;
            case 80 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:511: RULE_NONDIGIT
                {
                mRULE_NONDIGIT(); 

                }
                break;
            case 81 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:525: RULE_DIGIT
                {
                mRULE_DIGIT(); 

                }
                break;
            case 82 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:536: RULE_KEYWORD
                {
                mRULE_KEYWORD(); 

                }
                break;
            case 83 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:549: RULE_PREPROCESSING_OP_OR_PUNC
                {
                mRULE_PREPROCESSING_OP_OR_PUNC(); 

                }
                break;
            case 84 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:579: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 85 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:587: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 86 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:596: RULE_CHARACTER_LITERAL
                {
                mRULE_CHARACTER_LITERAL(); 

                }
                break;
            case 87 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:619: RULE_FLOATING_LITERAL
                {
                mRULE_FLOATING_LITERAL(); 

                }
                break;
            case 88 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:641: RULE_STRING_LITERAL
                {
                mRULE_STRING_LITERAL(); 

                }
                break;
            case 89 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:661: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 90 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:673: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 91 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:689: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 92 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:705: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 93 :
                // ../cpp2/src-gen/org/parser/antlr/internal/InternalCpp2.g:1:713: RULE_ANY_OTHER
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
            return "3034:16: ( 'alignas' | 'alignof' | 'asm' | 'auto' | 'bool' | 'break' | 'case' | 'catch' | 'char' | 'char16_t' | 'char32_t' | 'class' | 'const' | 'constexpr' | 'const_cast' | 'continue' | 'decltype' | 'default' | 'delete' | 'do' | 'double' | 'dynamic_cast' | 'else' | 'enum' | 'explicit' | 'export' | 'extern' | 'false' | 'float' | 'for' | 'friend' | 'goto' | 'if' | 'inline' | 'int' | 'long' | 'mutable' | 'namespace' | 'new' | 'noexcept' | 'nullptr' | 'operator' | 'private' | 'protected' | 'public' | 'register' | 'reinterpret_cast' | 'return' | 'short' | 'signed' | 'sizeof' | 'static' | 'static_assert' | 'static_cast' | 'struct' | 'switch' | 'template' | 'this' | 'thread_local' | 'throw' | 'true' | 'try' | 'typedef' | 'typeid' | 'typename' | 'union' | 'unsigned' | 'using' | 'virtual' | 'void' | 'volatile' | 'wchar_t' | 'while' )";
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
            return "3036:33: ( '{' | '}' | '[' | ']' | '#' | '##' | '(' | ')' | '<:' | ':>' | '<%' | '%>' | '%:' | '%:%:' | ';' | ':' | '...' | 'new' | 'delete' | '?' | '::' | '.' | '.*' | '+' | '-' | '*' | '/' | '%' | '^' | '&' | '|' | '~' | '!' | '=' | '<' | '>' | '+=' | '-=' | '*=' | '/=' | '%=' | '^=' | '&=' | '|=' | '<<' | '>>' | '<<=' | '>>=' | '==' | '!=' | '<=' | '>=' | '&&' | '||' | '++' | '--' | ',' | '->*' | '->' | 'and' | 'and_eq' | 'bitand' | 'bitor' | 'compl' | 'not' | 'not_eq' | 'or' | 'or_eq' | 'xor' | 'xor_eq' )";
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
    static final String DFA46_eotS =
        "\1\uffff\3\103\1\116\1\120\1\uffff\1\103\1\127\1\116\2\uffff\2"+
        "\103\1\144\1\150\1\152\1\103\1\161\1\165\1\103\1\173\1\177\1\u0081"+
        "\1\u0083\1\u0086\1\uffff\1\u0089\1\u008b\1\u008c\11\103\1\u00a3"+
        "\13\103\5\uffff\1\103\1\76\1\u00a3\1\103\1\76\2\uffff\4\104\2\uffff"+
        "\10\104\5\uffff\4\104\6\uffff\6\104\3\uffff\1\u00e0\5\uffff\1\104"+
        "\1\116\1\u00e7\1\u00e8\2\116\2\uffff\1\u00ea\2\uffff\1\104\1\u00f0"+
        "\1\104\27\uffff\16\104\2\uffff\3\104\1\uffff\1\u00a5\1\uffff\4\104"+
        "\1\u00f0\20\104\1\u00a5\3\uffff\1\104\1\u00f0\6\104\1\u00f0\2\104"+
        "\1\u013d\1\104\1\116\1\104\1\uffff\1\104\1\u00f0\1\104\1\116\1\uffff"+
        "\11\104\7\uffff\2\104\1\u0152\5\uffff\4\104\1\uffff\1\104\11\uffff"+
        "\1\162\7\uffff\30\104\1\u00f0\23\104\1\116\3\uffff\1\u0195\4\104"+
        "\1\u00f0\4\104\1\uffff\4\104\1\u00f0\1\104\1\uffff\5\104\2\u00f0"+
        "\1\104\1\u00f0\1\104\1\uffff\2\104\2\uffff\5\104\15\uffff\17\104"+
        "\1\u00f0\3\104\2\u00f0\3\104\1\u00f0\1\104\1\u00f0\23\104\2\uffff"+
        "\4\104\1\u01ee\1\104\1\u01f0\1\u00f0\7\104\1\u01fb\1\104\1\116\1"+
        "\u01fd\1\u01fe\5\104\1\116\5\104\3\uffff\1\162\1\uffff\1\162\4\uffff"+
        "\20\104\1\u00f0\1\104\1\116\13\104\1\u00f0\5\104\1\u00f0\1\104\1"+
        "\u00f0\1\104\1\u00f0\1\104\1\uffff\2\104\1\u00f0\1\104\1\uffff\1"+
        "\104\1\uffff\1\u00f0\2\104\1\116\3\104\1\116\2\104\1\uffff\1\104"+
        "\2\uffff\5\104\1\u0243\2\104\1\u00f0\1\104\4\uffff\4\104\1\u0250"+
        "\13\104\1\116\1\104\3\u00f0\3\104\1\u00f0\2\104\6\u00f0\2\104\1"+
        "\116\1\uffff\1\104\1\u00f0\2\104\1\u0269\2\104\1\u026c\1\u00f0\6"+
        "\104\1\u00f0\1\104\1\uffff\1\104\1\u00f0\1\104\4\uffff\5\104\1\uffff"+
        "\14\104\2\u00f0\5\104\1\u00f0\1\uffff\1\u0290\1\u0291\1\104\1\uffff"+
        "\1\u0293\1\104\1\uffff\2\104\3\u00f0\1\u0297\1\u0298\1\u00f0\1\104"+
        "\3\uffff\20\104\1\u00f0\1\104\1\u00f0\3\104\1\u00f0\2\uffff\1\104"+
        "\1\uffff\2\u00f0\1\104\2\uffff\1\104\3\uffff\3\104\1\u02b8\14\104"+
        "\1\u00f0\4\104\1\u00f0\1\104\1\uffff\3\104\1\uffff\1\u02ce\20\104"+
        "\1\uffff\3\104\1\uffff\3\104\1\u02e5\1\104\1\u02e7\7\104\3\u00f0"+
        "\5\104\1\u02f4\1\uffff\1\104\1\uffff\12\104\1\u0300\1\104\1\uffff"+
        "\5\104\1\u0307\1\104\1\u00f0\3\104\1\uffff\6\104\1\uffff\3\104\1"+
        "\u0315\11\104\1\uffff\6\104\1\u00f0\1\104\1\u0326\6\104\1\u032d"+
        "\1\uffff\5\104\1\u0333\1\uffff\2\104\1\u0336\1\104\1\u0338\1\uffff"+
        "\1\104\1\u033b\1\uffff\1\u033c\1\uffff\1\u033d\1\104\3\uffff\4\104"+
        "\1\u0343\1\uffff";
    static final String DFA46_eofS =
        "\u0344\uffff";
    static final String DFA46_minS =
        "\1\0\3\60\1\72\1\135\1\uffff\1\60\1\51\1\56\2\uffff\2\60\1\46\1"+
        "\55\1\75\1\60\1\0\1\75\1\60\1\53\1\52\1\72\2\75\1\uffff\2\75\1\0"+
        "\7\60\1\42\1\60\1\56\10\60\1\42\2\60\5\uffff\1\42\1\125\1\56\1\60"+
        "\1\0\2\uffff\1\165\1\160\1\155\1\151\2\uffff\1\154\1\157\1\162\1"+
        "\151\1\154\1\167\1\145\1\155\5\uffff\1\151\1\155\1\164\1\144\2\uffff"+
        "\1\56\3\uffff\1\155\1\141\1\163\1\141\1\151\1\162\3\uffff\1\52\5"+
        "\uffff\1\145\1\60\4\0\2\uffff\1\75\2\uffff\1\143\1\60\1\156\24\uffff"+
        "\2\0\1\uffff\1\155\1\157\1\141\1\160\1\141\1\105\1\151\1\162\1\143"+
        "\2\163\1\151\1\163\1\161\2\uffff\1\157\1\145\1\164\1\uffff\1\56"+
        "\1\uffff\1\163\1\165\1\160\1\164\1\60\1\154\1\156\1\164\1\151\1"+
        "\142\1\147\1\157\1\147\1\141\3\151\1\42\1\150\1\151\1\162\1\56\1"+
        "\0\1\42\1\uffff\1\145\1\60\1\145\1\160\1\145\2\163\1\141\1\60\1"+
        "\145\1\154\1\60\1\170\1\60\1\145\1\uffff\1\147\1\60\1\157\1\60\1"+
        "\uffff\1\163\1\160\1\163\1\143\1\145\1\162\1\141\1\144\1\164\7\uffff"+
        "\1\162\1\145\1\0\5\uffff\1\145\1\154\1\141\1\142\1\uffff\1\141\11"+
        "\uffff\7\0\1\uffff\1\163\1\160\1\162\1\163\1\145\1\151\1\170\1\164"+
        "\1\141\1\154\1\164\1\151\1\147\1\164\1\165\1\154\2\141\1\145\1\155"+
        "\1\154\1\145\1\157\1\151\1\60\1\147\1\141\1\166\1\164\1\154\1\151"+
        "\1\156\1\165\1\162\1\156\1\145\1\164\1\165\1\164\1\157\1\151\1\156"+
        "\1\141\1\154\1\60\1\uffff\2\0\1\60\1\144\1\154\1\167\1\141\1\60"+
        "\1\145\1\164\1\156\1\160\1\uffff\1\143\1\145\1\163\1\156\1\60\1"+
        "\145\1\uffff\1\164\1\151\1\154\1\163\1\150\2\60\1\164\1\60\1\165"+
        "\1\uffff\1\141\1\161\2\uffff\2\164\1\165\1\154\1\155\1\uffff\1\0"+
        "\1\42\1\uffff\3\0\1\uffff\5\0\1\164\1\157\1\111\1\163\1\111\1\154"+
        "\1\160\1\151\1\155\1\141\1\145\1\147\1\156\1\162\1\141\1\60\1\153"+
        "\1\156\1\162\2\60\1\151\2\162\1\60\1\156\1\60\1\142\1\141\1\145"+
        "\1\151\1\163\1\164\1\162\1\164\1\145\1\157\1\151\2\143\1\156\2\147"+
        "\1\162\2\145\1\0\1\uffff\1\141\1\145\1\144\1\141\1\60\1\144\2\60"+
        "\1\144\1\164\1\145\1\161\1\160\1\141\1\161\1\60\1\156\3\60\1\66"+
        "\1\62\1\151\1\141\1\164\1\60\1\145\1\171\1\154\1\145\1\151\12\0"+
        "\1\141\1\165\1\156\1\116\1\144\1\160\1\151\1\162\1\141\1\145\1\162"+
        "\1\144\1\156\1\155\1\141\1\154\1\60\1\144\1\60\1\143\1\164\1\156"+
        "\1\145\1\154\1\164\2\143\1\164\1\145\1\156\1\60\1\144\1\146\1\143"+
        "\1\164\1\150\1\60\1\156\1\60\1\137\1\60\1\161\1\0\1\155\1\146\1"+
        "\60\1\164\1\uffff\1\137\1\uffff\1\60\1\162\1\160\1\60\1\141\1\163"+
        "\1\146\1\60\1\170\1\143\1\uffff\1\165\2\uffff\2\137\2\154\1\157"+
        "\1\60\1\160\1\164\1\60\1\143\4\0\2\156\1\151\1\141\1\60\1\145\1"+
        "\156\1\145\1\154\1\164\1\141\1\116\1\155\1\145\1\143\1\151\1\60"+
        "\1\151\3\60\2\145\1\164\1\60\1\145\1\162\6\60\1\145\1\164\1\60\1"+
        "\0\1\145\1\60\1\145\1\154\1\60\1\164\1\143\2\60\1\160\1\141\1\145"+
        "\2\164\1\145\1\60\1\162\1\uffff\1\145\1\60\1\137\4\0\1\164\1\144"+
        "\1\164\1\155\1\151\1\uffff\1\143\1\147\1\163\1\151\1\145\1\164\1"+
        "\141\1\145\1\156\1\164\1\146\1\164\2\60\1\145\1\162\1\160\1\141"+
        "\1\144\1\60\1\0\2\60\1\157\1\uffff\1\60\1\145\1\uffff\1\162\1\163"+
        "\6\60\1\143\3\0\1\105\1\123\1\151\1\145\1\163\1\151\1\124\1\163"+
        "\1\172\1\162\1\151\1\155\1\156\1\164\1\104\1\151\1\60\1\144\1\60"+
        "\1\162\1\163\1\141\1\60\2\uffff\1\143\1\uffff\2\60\1\164\2\uffff"+
        "\1\141\3\0\1\170\1\164\1\141\1\60\1\164\1\146\1\171\1\151\1\145"+
        "\1\104\1\157\1\145\1\164\1\105\2\145\1\60\1\145\2\163\1\141\1\60"+
        "\1\163\1\0\1\160\1\141\1\154\1\uffff\1\60\1\151\1\160\1\157\1\162"+
        "\1\145\1\156\1\123\1\105\1\170\1\143\1\144\1\164\1\145\1\164\1\154"+
        "\1\164\1\0\1\162\1\164\1\151\1\uffff\2\145\1\156\1\60\1\143\1\60"+
        "\1\160\1\170\1\160\1\154\1\111\1\137\1\162\3\60\2\145\1\172\1\162"+
        "\1\123\1\60\1\uffff\1\154\1\uffff\1\145\1\160\1\162\1\141\1\144"+
        "\1\143\1\164\1\163\1\155\1\145\1\60\1\160\1\uffff\1\141\1\143\1"+
        "\162\1\145\1\162\1\60\1\141\1\60\1\163\1\145\1\162\1\uffff\1\145"+
        "\1\162\1\151\1\145\1\163\1\141\1\uffff\1\163\1\151\1\156\1\60\1"+
        "\143\1\141\1\146\2\163\2\164\1\157\1\164\1\uffff\1\151\1\164\1\151"+
        "\1\163\1\151\1\157\1\60\1\156\1\60\1\146\1\151\1\145\1\151\1\157"+
        "\1\162\1\60\1\uffff\1\151\1\157\1\162\1\157\1\156\1\60\1\uffff\1"+
        "\145\1\156\1\60\1\156\1\60\1\uffff\1\162\1\60\1\uffff\1\60\1\uffff"+
        "\1\60\1\154\3\uffff\1\141\1\165\1\163\1\145\1\60\1\uffff";
    static final String DFA46_maxS =
        "\1\uffff\3\172\1\72\1\135\1\uffff\1\172\1\51\1\71\2\uffff\2\172"+
        "\1\75\1\76\1\75\1\172\1\uffff\1\76\1\172\2\75\1\76\1\75\1\174\1"+
        "\uffff\2\75\1\uffff\11\172\1\165\13\172\5\uffff\1\172\1\165\1\170"+
        "\1\172\1\uffff\2\uffff\1\171\1\160\1\155\1\162\2\uffff\1\154\1\157"+
        "\1\162\1\151\1\154\1\167\1\164\1\155\5\uffff\1\151\1\155\1\164\1"+
        "\144\2\uffff\1\56\3\uffff\1\156\1\141\1\164\1\141\1\154\1\162\3"+
        "\uffff\1\52\5\uffff\1\145\1\172\4\uffff\2\uffff\1\75\2\uffff\1\154"+
        "\1\172\1\156\24\uffff\2\uffff\1\uffff\1\156\1\157\1\141\1\160\1"+
        "\141\1\105\1\151\1\162\1\143\2\163\1\151\1\163\1\161\2\uffff\1\157"+
        "\1\145\1\164\1\uffff\1\145\1\uffff\1\163\1\165\2\164\1\172\1\164"+
        "\1\156\1\164\1\157\1\142\1\164\1\157\1\172\1\162\1\151\1\163\1\151"+
        "\1\42\1\150\1\151\1\162\1\145\1\uffff\1\170\1\uffff\1\145\1\172"+
        "\1\145\1\160\1\157\2\163\1\141\1\172\1\145\1\154\1\172\1\170\1\172"+
        "\1\145\1\uffff\1\147\1\172\1\157\1\172\1\uffff\1\164\1\160\1\163"+
        "\1\143\1\145\1\162\1\141\1\144\1\164\7\uffff\1\162\1\145\1\uffff"+
        "\5\uffff\1\145\1\154\1\141\1\142\1\uffff\1\141\11\uffff\7\uffff"+
        "\1\uffff\1\163\1\160\1\162\1\163\1\145\1\151\1\170\1\164\1\141\1"+
        "\154\1\164\1\151\1\147\1\164\1\165\1\154\1\141\1\157\1\145\1\155"+
        "\1\157\1\145\1\157\1\151\1\172\1\147\1\141\1\166\1\164\1\154\1\151"+
        "\1\156\1\165\1\162\1\156\1\145\1\164\1\165\1\164\1\157\1\151\1\156"+
        "\1\141\1\154\1\172\1\uffff\2\uffff\1\172\1\156\1\154\1\167\1\141"+
        "\1\172\1\145\1\164\1\156\1\160\1\uffff\1\143\1\145\1\163\1\156\1"+
        "\172\1\145\1\uffff\1\164\1\151\1\154\1\163\1\150\2\172\1\164\1\172"+
        "\1\165\1\uffff\1\141\1\161\2\uffff\2\164\1\165\1\154\1\155\1\uffff"+
        "\1\uffff\1\170\1\uffff\3\uffff\1\uffff\5\uffff\1\164\1\157\1\111"+
        "\1\163\1\123\1\154\1\160\1\151\1\155\1\141\1\145\1\147\1\156\1\162"+
        "\1\141\1\172\1\153\1\156\1\162\2\172\1\151\2\162\1\172\1\156\1\172"+
        "\1\142\1\141\1\145\1\151\1\163\1\164\1\162\1\164\1\145\1\157\1\151"+
        "\2\143\1\156\2\147\1\162\2\145\1\uffff\1\uffff\1\141\1\145\1\144"+
        "\1\141\1\172\1\144\2\172\1\144\1\164\1\145\1\161\1\160\1\157\1\161"+
        "\1\172\1\156\3\172\1\66\1\62\1\151\1\141\1\164\1\172\1\145\1\171"+
        "\1\154\1\145\1\151\12\uffff\1\141\1\165\1\156\1\116\1\144\1\160"+
        "\1\151\1\162\1\141\1\145\1\162\1\144\1\156\1\155\1\141\1\154\1\172"+
        "\1\144\1\172\1\143\1\164\1\156\1\145\1\154\1\164\2\143\1\164\1\145"+
        "\1\156\1\172\1\144\1\146\1\143\1\164\1\150\1\172\1\156\1\172\1\137"+
        "\1\172\1\161\1\uffff\1\155\1\146\1\172\1\164\1\uffff\1\137\1\uffff"+
        "\1\172\1\162\1\160\1\172\1\141\1\163\1\146\1\172\1\170\1\143\1\uffff"+
        "\1\165\2\uffff\2\137\2\154\1\157\1\172\1\160\1\164\1\172\1\143\4"+
        "\uffff\2\156\1\151\1\141\1\172\1\145\1\156\1\145\1\154\1\164\1\141"+
        "\1\116\1\155\1\145\1\143\1\151\1\172\1\151\3\172\2\145\1\164\1\172"+
        "\1\145\1\162\6\172\1\145\1\164\1\172\1\uffff\1\145\1\172\1\145\1"+
        "\154\1\172\1\164\1\143\2\172\1\160\1\141\1\145\2\164\1\145\1\172"+
        "\1\162\1\uffff\1\145\1\172\1\137\4\uffff\1\164\1\144\1\164\1\155"+
        "\1\151\1\uffff\1\143\1\147\1\163\1\151\1\145\1\164\1\141\1\145\1"+
        "\156\1\164\1\146\1\164\2\172\1\145\1\162\1\160\1\143\1\144\1\172"+
        "\1\uffff\2\172\1\157\1\uffff\1\172\1\145\1\uffff\1\162\1\163\6\172"+
        "\1\143\3\uffff\1\105\1\123\1\151\1\145\1\163\1\151\1\124\1\163\1"+
        "\172\1\162\1\151\1\155\1\156\1\164\1\104\1\151\1\172\1\144\1\172"+
        "\1\162\1\163\1\141\1\172\2\uffff\1\143\1\uffff\2\172\1\164\2\uffff"+
        "\1\141\3\uffff\1\170\1\164\1\141\1\172\1\164\1\146\1\171\1\151\1"+
        "\145\1\104\1\157\1\145\1\164\1\105\2\145\1\172\1\145\2\163\1\141"+
        "\1\172\1\163\1\uffff\1\160\1\141\1\154\1\uffff\1\172\1\151\1\160"+
        "\1\157\1\162\1\145\1\156\1\123\1\105\1\170\1\143\1\144\1\164\1\145"+
        "\1\164\1\154\1\164\1\uffff\1\162\1\164\1\151\1\uffff\2\145\1\156"+
        "\1\172\1\143\1\172\1\160\1\170\1\160\1\154\1\111\1\137\1\162\3\172"+
        "\2\145\1\172\1\162\1\123\1\172\1\uffff\1\154\1\uffff\1\145\1\160"+
        "\1\162\1\141\1\144\1\143\1\164\1\163\1\155\1\145\1\172\1\160\1\uffff"+
        "\1\141\1\143\1\162\1\145\1\162\1\172\1\141\1\172\1\163\1\145\1\162"+
        "\1\uffff\1\145\1\162\1\151\1\145\1\163\1\141\1\uffff\1\163\1\151"+
        "\1\156\1\172\1\143\1\141\1\146\2\163\2\164\1\157\1\164\1\uffff\1"+
        "\151\1\164\1\151\1\163\1\151\1\157\1\172\1\156\1\172\1\146\1\151"+
        "\1\145\1\151\1\157\1\162\1\172\1\uffff\1\151\1\157\1\162\1\157\1"+
        "\156\1\172\1\uffff\1\145\1\156\1\172\1\156\1\172\1\uffff\1\162\1"+
        "\172\1\uffff\1\172\1\uffff\1\172\1\154\3\uffff\1\141\1\165\1\163"+
        "\1\145\1\172\1\uffff";
    static final String DFA46_acceptS =
        "\6\uffff\1\6\3\uffff\1\12\1\13\16\uffff\1\35\30\uffff\5\123\5\uffff"+
        "\1\134\1\135\4\uffff\1\120\1\124\10\uffff\1\4\1\123\1\65\1\5\1\6"+
        "\4\uffff\1\64\1\10\1\uffff\1\127\1\12\1\13\6\uffff\1\17\1\46\1\16"+
        "\1\uffff\1\41\1\62\1\30\1\42\1\21\6\uffff\1\23\1\117\1\uffff\1\57"+
        "\1\24\3\uffff\1\40\1\61\1\27\1\43\1\132\1\133\1\31\1\44\1\32\1\45"+
        "\1\33\1\47\1\60\1\34\1\35\1\55\1\36\1\54\1\37\1\66\2\uffff\1\131"+
        "\16\uffff\1\126\1\130\3\uffff\1\121\1\uffff\1\125\30\uffff\1\134"+
        "\17\uffff\1\4\4\uffff\1\11\11\uffff\1\17\1\46\1\63\1\20\1\41\1\62"+
        "\1\42\3\uffff\1\50\1\56\1\52\1\51\1\57\4\uffff\1\122\1\uffff\1\40"+
        "\1\61\1\43\1\44\1\45\1\47\1\60\1\55\1\54\7\uffff\1\117\55\uffff"+
        "\1\126\14\uffff\1\25\6\uffff\1\11\12\uffff\1\63\2\uffff\1\53\1\52"+
        "\5\uffff\1\130\2\uffff\1\117\3\uffff\1\117\64\uffff\1\1\130\uffff"+
        "\1\73\1\uffff\1\2\12\uffff\1\14\1\uffff\1\67\1\72\104\uffff\1\26"+
        "\14\uffff\1\76\30\uffff\1\3\2\uffff\1\7\43\uffff\1\70\1\71\1\uffff"+
        "\1\74\3\uffff\1\15\1\22\37\uffff\1\115\25\uffff\1\111\26\uffff\1"+
        "\116\1\uffff\1\101\14\uffff\1\77\13\uffff\1\105\6\uffff\1\112\15"+
        "\uffff\1\110\20\uffff\1\107\6\uffff\1\75\5\uffff\1\106\2\uffff\1"+
        "\102\1\uffff\1\104\2\uffff\1\100\1\103\1\114\5\uffff\1\113";
    static final String DFA46_specialS =
        "\1\5\21\uffff\1\65\12\uffff\1\50\36\uffff\1\17\60\uffff\1\14\1"+
        "\4\1\61\1\57\34\uffff\1\13\1\10\55\uffff\1\47\51\uffff\1\11\24\uffff"+
        "\1\70\1\46\1\60\1\0\1\36\1\51\1\66\57\uffff\1\71\1\52\47\uffff\1"+
        "\34\2\uffff\1\37\1\64\1\15\1\uffff\1\3\1\72\1\1\1\25\1\67\56\uffff"+
        "\1\43\40\uffff\1\33\1\16\1\40\1\53\1\20\1\63\1\42\1\2\1\30\1\62"+
        "\52\uffff\1\45\37\uffff\1\56\1\41\1\26\1\22\44\uffff\1\44\25\uffff"+
        "\1\54\1\21\1\31\1\12\32\uffff\1\35\20\uffff\1\55\1\23\1\27\41\uffff"+
        "\1\73\1\6\1\32\27\uffff\1\24\25\uffff\1\7\171\uffff}>";
    static final String[] DFA46_transitionS = {
            "\11\76\2\75\2\76\1\75\22\76\1\75\1\33\1\35\1\65\1\76\1\27\1"+
            "\16\1\74\1\10\1\12\1\20\1\25\1\13\1\17\1\11\1\26\1\72\11\47"+
            "\1\4\1\66\1\22\1\34\1\23\1\67\1\76\1\44\1\73\1\36\1\42\4\73"+
            "\1\40\2\73\1\70\1\73\1\43\1\73\1\41\3\73\1\37\1\45\5\73\1\5"+
            "\1\71\1\6\1\30\1\73\1\76\1\7\1\46\1\14\1\24\1\50\1\2\1\51\1"+
            "\73\1\52\2\73\1\53\1\54\1\3\1\21\1\55\1\73\1\56\1\57\1\1\1\60"+
            "\1\15\1\61\1\62\2\73\1\63\1\31\1\64\1\32\uff81\76",
            "\12\104\7\uffff\32\104\1\uffff\1\104\2\uffff\1\104\1\uffff"+
            "\4\104\1\101\2\104\1\102\11\104\1\77\6\104\1\100\1\104",
            "\12\104\7\uffff\32\104\1\uffff\1\104\2\uffff\1\104\1\uffff"+
            "\1\105\12\104\1\106\2\104\1\107\2\104\1\110\10\104",
            "\12\104\7\uffff\32\104\1\uffff\1\104\2\uffff\1\104\1\uffff"+
            "\1\114\3\104\1\112\11\104\1\113\5\104\1\111\5\104",
            "\1\115",
            "\1\117",
            "",
            "\12\104\7\uffff\32\104\1\uffff\1\104\2\uffff\1\104\1\uffff"+
            "\13\104\1\122\1\104\1\125\4\104\1\123\1\104\1\124\5\104",
            "\1\126",
            "\1\130\1\uffff\12\131",
            "",
            "",
            "\12\104\7\uffff\32\104\1\uffff\1\104\2\uffff\1\104\1\uffff"+
            "\1\136\6\104\1\137\3\104\1\135\2\104\1\134\13\104",
            "\12\104\7\uffff\32\104\1\uffff\1\104\2\uffff\1\104\1\uffff"+
            "\10\104\1\141\5\104\1\140\13\104",
            "\1\142\26\uffff\1\143",
            "\1\147\17\uffff\1\146\1\145",
            "\1\151",
            "\12\104\7\uffff\32\104\1\uffff\1\104\2\uffff\1\104\1\uffff"+
            "\17\104\1\153\1\104\1\154\10\104",
            "\12\162\1\uffff\32\162\1\160\24\162\1\157\1\162\1\155\1\156"+
            "\1\uffff\uffc1\162",
            "\1\164\1\163",
            "\12\104\7\uffff\32\104\1\uffff\1\104\2\uffff\1\104\1\uffff"+
            "\4\104\1\166\11\104\1\167\11\104\1\170\1\104",
            "\1\172\21\uffff\1\171",
            "\1\175\4\uffff\1\176\15\uffff\1\174",
            "\1\116\2\uffff\1\u0080\1\116",
            "\1\u0082",
            "\1\u0084\76\uffff\1\u0085",
            "",
            "\1\u0088",
            "\1\u008a",
            "\12\u008e\1\u008f\27\u008e\1\u008f\71\u008e\1\u008d\uffa3"+
            "\u008e",
            "\12\104\7\uffff\32\104\1\uffff\1\104\2\uffff\1\104\1\uffff"+
            "\13\104\1\u0092\2\104\1\u0090\4\104\1\u0091\6\104",
            "\12\104\7\uffff\32\104\1\uffff\1\104\2\uffff\1\104\1\uffff"+
            "\21\104\1\u0094\6\104\1\u0093\1\104",
            "\12\104\7\uffff\32\104\1\uffff\1\104\2\uffff\1\104\1\uffff"+
            "\3\104\1\u0095\11\104\1\u0096\14\104",
            "\12\104\7\uffff\32\104\1\uffff\1\104\2\uffff\1\104\1\uffff"+
            "\1\u0097\31\104",
            "\12\104\7\uffff\32\104\1\uffff\1\104\2\uffff\1\104\1\uffff"+
            "\4\104\1\u0098\25\104",
            "\12\104\7\uffff\32\104\1\uffff\1\104\2\uffff\1\104\1\uffff"+
            "\4\104\1\u0099\25\104",
            "\12\104\7\uffff\32\104\1\uffff\1\104\2\uffff\1\104\1\uffff"+
            "\1\104\1\u009c\11\104\1\u009b\6\104\1\u009a\7\104",
            "\1\u009f\4\uffff\1\u009e\10\uffff\12\104\7\uffff\32\104\1"+
            "\uffff\1\104\2\uffff\1\104\1\uffff\15\104\1\u009d\14\104",
            "\12\104\7\uffff\32\104\1\uffff\1\104\2\uffff\1\104\1\uffff"+
            "\10\104\1\u00a2\5\104\1\u00a0\2\104\1\u00a1\10\104",
            "\1\131\1\uffff\12\u00a4\13\uffff\1\131\6\uffff\1\u00a5\10"+
            "\uffff\1\u00a5\17\uffff\1\131\6\uffff\1\u00a5\10\uffff\1\u00a5",
            "\12\104\7\uffff\32\104\1\uffff\1\104\2\uffff\1\104\1\uffff"+
            "\13\104\1\u00a6\1\104\1\u00a7\11\104\1\u00a8\2\104",
            "\12\104\7\uffff\32\104\1\uffff\1\104\2\uffff\1\104\1\uffff"+
            "\16\104\1\u00a9\13\104",
            "\12\104\7\uffff\32\104\1\uffff\1\104\2\uffff\1\104\1\uffff"+
            "\5\104\1\u00aa\7\104\1\u00ab\14\104",
            "\12\104\7\uffff\32\104\1\uffff\1\104\2\uffff\1\104\1\uffff"+
            "\16\104\1\u00ac\13\104",
            "\12\104\7\uffff\32\104\1\uffff\1\104\2\uffff\1\104\1\uffff"+
            "\24\104\1\u00ad\5\104",
            "\12\104\7\uffff\32\104\1\uffff\1\104\2\uffff\1\104\1\uffff"+
            "\21\104\1\u00ae\2\104\1\u00af\5\104",
            "\12\104\7\uffff\32\104\1\uffff\1\104\2\uffff\1\104\1\uffff"+
            "\4\104\1\u00b0\25\104",
            "\12\104\7\uffff\32\104\1\uffff\1\104\2\uffff\1\104\1\uffff"+
            "\7\104\1\u00b1\1\u00b2\12\104\1\u00b3\2\104\1\u00b4\3\104",
            "\1\u009f\4\uffff\1\u009e\10\uffff\10\104\1\u00b7\1\104\7\uffff"+
            "\32\104\1\uffff\1\104\2\uffff\1\104\1\uffff\15\104\1\u00b5\4"+
            "\104\1\u00b6\7\104",
            "\12\104\7\uffff\32\104\1\uffff\1\104\2\uffff\1\104\1\uffff"+
            "\2\104\1\u00b8\4\104\1\u00b9\22\104",
            "\12\104\7\uffff\32\104\1\uffff\1\104\2\uffff\1\104\1\uffff"+
            "\16\104\1\u00ba\13\104",
            "",
            "",
            "",
            "",
            "",
            "\1\u009f\4\uffff\1\u009e\10\uffff\12\104\7\uffff\32\104\1"+
            "\uffff\1\104\2\uffff\1\104\1\uffff\32\104",
            "\1\104\37\uffff\1\104",
            "\1\131\1\uffff\10\u00bb\2\131\13\uffff\1\131\6\uffff\1\u00a5"+
            "\10\uffff\1\u00a5\2\uffff\1\u00a5\14\uffff\1\131\6\uffff\1\u00a5"+
            "\10\uffff\1\u00a5\2\uffff\1\u00a5",
            "\12\104\7\uffff\32\104\1\uffff\1\104\2\uffff\1\104\1\uffff"+
            "\32\104",
            "\12\u00bc\1\u008f\34\u00bc\1\u008f\64\u00bc\1\u00bd\uffa3"+
            "\u00bc",
            "",
            "",
            "\1\u00bf\3\uffff\1\u00c0",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c4\10\uffff\1\u00c3",
            "",
            "",
            "\1\u00c5",
            "\1\u00c6",
            "\1\u00c7",
            "\1\u00c8",
            "\1\u00c9",
            "\1\u00ca",
            "\1\u00cb\16\uffff\1\u00cc",
            "\1\u00cd",
            "",
            "",
            "",
            "",
            "",
            "\1\u00cf",
            "\1\u00d0",
            "\1\u00d1",
            "\1\u00d2",
            "",
            "",
            "\1\u00d3",
            "",
            "",
            "",
            "\1\u00d5\1\u00d4",
            "\1\u00d6",
            "\1\u00d8\1\u00d7",
            "\1\u00d9",
            "\1\u00db\2\uffff\1\u00da",
            "\1\u00dc",
            "",
            "",
            "",
            "\1\u00df",
            "",
            "",
            "",
            "",
            "",
            "\1\u00e4",
            "\12\104\7\uffff\32\104\1\uffff\1\104\2\uffff\1\u00e5\1\uffff"+
            "\32\104",
            "\12\162\1\uffff\62\162\1\u00e6\uffc2\162",
            "\12\162\1\uffff\ufff5\162",
            "\12\162\1\uffff\ufff5\162",
            "\12\162\1\uffff\ufff5\162",
            "",
            "",
            "\1\u00e9",
            "",
            "",
            "\1\u00ed\2\uffff\1\u00ee\5\uffff\1\u00ec",
            "\12\104\7\uffff\32\104\1\uffff\1\104\2\uffff\1\104\1\uffff"+
            "\24\104\1\u00ef\5\104",
            "\1\u00f1",
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
            "\12\162\1\uffff\27\162\1\u00fb\4\162\1\u0100\10\162\10\u0101"+
            "\7\162\1\u00fd\25\162\1\u00ff\6\162\1\u0100\4\162\1\u00fd\1"+
            "\u0100\3\162\1\u0100\7\162\1\u0100\3\162\1\u0100\1\162\1\u0100"+
            "\1\u00fc\1\u00fd\1\162\1\u00fe\uff87\162",
            "\12\u008e\1\u008f\27\u008e\1\u0102\71\u008e\1\u008d\uffa3"+
            "\u008e",
            "",
            "\1\u0104\1\u0103",
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
            "",
            "",
            "\1\u0112",
            "\1\u0113",
            "\1\u0114",
            "",
            "\1\131\1\uffff\12\u00a4\13\uffff\1\131\37\uffff\1\131",
            "",
            "\1\u0115",
            "\1\u0116",
            "\1\u0117\3\uffff\1\u0118",
            "\1\u0119",
            "\12\104\7\uffff\32\104\1\uffff\1\104\2\uffff\1\104\1\uffff"+
            "\32\104",
            "\1\u011a\7\uffff\1\u011b",
            "\1\u011c",
            "\1\u011d",
            "\1\u011e\5\uffff\1\u011f",
            "\1\u0120",
            "\1\u0121\1\uffff\1\u0122\12\uffff\1\u0123",
            "\1\u0124",
            "\1\u0125\22\uffff\1\u0126",
            "\1\u0127\20\uffff\1\u0128",
            "\1\u0129",
            "\1\u012a\11\uffff\1\u012b",
            "\1\u012c",
            "\1\u009f",
            "\1\u012d",
            "\1\u012e",
            "\1\u012f",
            "\1\131\1\uffff\10\u00bb\2\131\13\uffff\1\131\37\uffff\1\131",
            "\12\u00bc\1\u008f\34\u00bc\1\u0130\64\u00bc\1\u00bd\uffa3"+
            "\u00bc",
            "\1\u0131\4\uffff\1\u0131\10\uffff\10\u009e\7\uffff\1\u009e"+
            "\25\uffff\1\u009e\6\uffff\1\u0131\4\uffff\1\u009e\1\u0131\3"+
            "\uffff\1\u0131\7\uffff\1\u0131\3\uffff\1\u0131\1\uffff\1\u0131"+
            "\1\u0132\1\u009e\1\uffff\1\u009e",
            "",
            "\1\u0133",
            "\12\104\7\uffff\32\104\1\uffff\1\104\2\uffff\1\104\1\uffff"+
            "\32\104",
            "\1\u0134",
            "\1\u0135",
            "\1\u0137\11\uffff\1\u0136",
            "\1\u0138",
            "\1\u0139",
            "\1\u013a",
            "\12\104\7\uffff\32\104\1\uffff\1\104\2\uffff\1\104\1\uffff"+
            "\32\104",
            "\1\u013b",
            "\1\u013c",
            "\12\104\7\uffff\32\104\1\uffff\1\104\2\uffff\1\104\1\uffff"+
            "\32\104",
            "\1\u013e",
            "\12\104\7\uffff\32\104\1\uffff\1\104\2\uffff\1\u013f\1\uffff"+
            "\32\104",
            "\1\u0140",
            "",
            "\1\u0141",
            "\12\104\7\uffff\32\104\1\uffff\1\104\2\uffff\1\104\1\uffff"+
            "\32\104",
            "\1\u0142",
            "\12\104\7\uffff\32\104\1\uffff\1\104\2\uffff\1\u0143\1\uffff"+
            "\32\104",
            "",
            "\1\u0145\1\u0146",
            "\1\u0147",
            "\1\u0148",
            "\1\u0149",
            "\1\u014a",
            "\1\u014b",
            "\1\u014c",
            "\1\u014d",
            "\1\u014e",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0150",
            "\1\u0151",
            "\12\162\1\uffff\ufff5\162",
            "",
            "",
            "",
            "",
            "",
            "\1\u0154",
            "\1\u0155",
            "\1\u0156",
            "\1\u0157",
            "",
            "\1\u0158",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\u015a\1\u008f\27\u015a\1\u0159\71\u015a\1\u015b\uffa3"+
            "\u015a",
            "\12\u015f\1\u008f\27\u015f\1\u015c\15\u015f\12\u015d\7\u015f"+
            "\6\u015d\25\u015f\1\u015e\uffa3\u015f",
            "\12\u0161\1\uffff\27\u0161\1\u0160\71\u0161\1\u0162\uffa3"+
            "\u0161",
            "\12\162\1\uffff\45\162\12\u0163\7\162\6\u0163\uffb9\162",
            "\12\162\1\uffff\45\162\12\u0164\7\162\6\u0164\uffb9\162",
            "\12\u008e\1\u008f\27\u008e\1\u0102\71\u008e\1\u008d\uffa3"+
            "\u008e",
            "\12\162\1\uffff\45\162\10\u0165\uffc8\162",
            "",
            "\1\u0166",
            "\1\u0167",
            "\1\u0168",
            "\1\u0169",
            "\1\u016a",
            "\1\u016b",
            "\1\u016c",
            "\1\u016d",
            "\1\u016e",
            "\1\u016f",
            "\1\u0170",
            "\1\u0171",
            "\1\u0172",
            "\1\u0173",
            "\1\u0174",
            "\1\u0175",
            "\1\u0176",
            "\1\u0177\15\uffff\1\u0178",
            "\1\u0179",
            "\1\u017a",
            "\1\u017b\2\uffff\1\u017c",
            "\1\u017d",
            "\1\u017e",
            "\1\u017f",
            "\12\104\7\uffff\32\104\1\uffff\1\104\2\uffff\1\104\1\uffff"+
            "\32\104",
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
            "\1\u018e",
            "\1\u018f",
            "\1\u0190",
            "\1\u0191",
            "\1\u0192",
            "\12\104\7\uffff\32\104\1\uffff\1\104\2\uffff\1\u0193\1\uffff"+
            "\32\104",
            "",
            "\12\u00bc\1\u008f\34\u00bc\1\u0130\64\u00bc\1\u00bd\uffa3"+
            "\u00bc",
            "\60\u008f\12\u0194\7\u008f\6\u0194\uffb9\u008f",
            "\12\104\7\uffff\32\104\1\uffff\1\104\2\uffff\1\104\1\uffff"+
            "\32\104",
            "\1\u0197\4\uffff\1\u0198\4\uffff\1\u0196",
            "\1\u0199",
            "\1\u019a",
            "\1\u019b",
            "\12\104\7\uffff\32\104\1\uffff\1\104\2\uffff\1\104\1\uffff"+
            "\32\104",
            "\1\u019c",
            "\1\u019d",
            "\1\u019e",
            "\1\u019f",
            "",
            "\1\u01a0",
            "\1\u01a1",
            "\1\u01a2",
            "\1\u01a3",
            "\12\104\7\uffff\32\104\1\uffff\1\104\2\uffff\1\104\1\uffff"+
            "\32\104",
            "\1\u01a4",
            "",
            "\1\u01a5",
            "\1\u01a6",
            "\1\u01a7",
            "\1\u01a8",
            "\1\u01a9",
            "\12\104\7\uffff\32\104\1\uffff\1\104\2\uffff\1\104\1\uffff"+
            "\32\104",
            "\1\104\1\u01aa\1\104\1\u01ab\6\104\7\uffff\32\104\1\uffff"+
            "\1\104\2\uffff\1\104\1\uffff\32\104",
            "\1\u01ac",
            "\12\104\7\uffff\32\104\1\uffff\1\104\2\uffff\1\104\1\uffff"+
            "\32\104",
            "\1\u01ad",
            "",
            "\1\u01ae",
            "\1\u01af",
            "",
            "",
            "\1\u01b0",
            "\1\u01b1",
            "\1\u01b2",
            "\1\u01b3",
            "\1\u01b4",
            "",
            "\12\u015a\1\u008f\27\u015a\1\u0159\71\u015a\1\u015b\uffa3"+
            "\u015a",
            "\1\u01b5\4\uffff\1\u01b5\10\uffff\10\u009f\7\uffff\1\u009f"+
            "\25\uffff\1\u009f\6\uffff\1\u01b5\4\uffff\1\u009f\1\u01b5\3"+
            "\uffff\1\u01b5\7\uffff\1\u01b5\3\uffff\1\u01b5\1\uffff\1\u01b5"+
            "\1\u01b6\1\u009f\1\uffff\1\u009f",
            "",
            "\12\u015f\1\u008f\27\u015f\1\u015c\15\u015f\12\u01b7\7\u015f"+
            "\6\u01b7\25\u015f\1\u015e\uffa3\u015f",
            "\12\162\1\uffff\27\162\1\u01b8\4\162\1\u01b9\64\162\1\u01b9"+
            "\5\162\1\u01b9\3\162\1\u01b9\7\162\1\u01b9\3\162\1\u01b9\1\162"+
            "\2\u01b9\uff8a\162",
            "\12\u015f\1\u008f\27\u015f\1\u015c\71\u015f\1\u015e\uffa3"+
            "\u015f",
            "",
            "\12\u0161\1\uffff\27\u0161\1\u0160\71\u0161\1\u0162\uffa3"+
            "\u0161",
            "\12\162\1\uffff\27\162\1\u01ba\4\162\1\u00fd\10\162\10\u0101"+
            "\7\162\1\u00fd\25\162\1\u00ff\6\162\1\u00fd\4\162\2\u00fd\3"+
            "\162\1\u00fd\7\162\1\u00fd\3\162\1\u00fd\1\162\1\u00fd\1\u01bb"+
            "\1\u00fd\1\162\1\u00fe\uff87\162",
            "\12\u0161\1\uffff\27\u0161\1\u0160\15\u0161\12\u01bc\7\u0161"+
            "\6\u01bc\25\u0161\1\u0162\uffa3\u0161",
            "\12\162\1\uffff\45\162\12\u01bd\7\162\6\u01bd\uffb9\162",
            "\12\162\1\uffff\45\162\10\u01be\uffc8\162",
            "\1\u01bf",
            "\1\u01c0",
            "\1\u01c1",
            "\1\u01c2",
            "\1\u01c3\11\uffff\1\u01c4",
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
            "\12\104\7\uffff\32\104\1\uffff\1\104\2\uffff\1\104\1\uffff"+
            "\32\104",
            "\1\u01cf",
            "\1\u01d0",
            "\1\u01d1",
            "\12\104\7\uffff\32\104\1\uffff\1\104\2\uffff\1\104\1\uffff"+
            "\32\104",
            "\12\104\7\uffff\32\104\1\uffff\1\104\2\uffff\1\104\1\uffff"+
            "\32\104",
            "\1\u01d2",
            "\1\u01d3",
            "\1\u01d4",
            "\12\104\7\uffff\32\104\1\uffff\1\104\2\uffff\1\104\1\uffff"+
            "\32\104",
            "\1\u01d5",
            "\12\104\7\uffff\32\104\1\uffff\1\104\2\uffff\1\104\1\uffff"+
            "\32\104",
            "\1\u01d6",
            "\1\u01d7",
            "\1\u01d8",
            "\1\u01d9",
            "\1\u01da",
            "\1\u01db",
            "\1\u01dc",
            "\1\u01dd",
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
            "\1\u01e8",
            "\60\u008f\12\u01e9\7\u008f\6\u01e9\uffb9\u008f",
            "",
            "\1\u01ea",
            "\1\u01eb",
            "\1\u01ec",
            "\1\u01ed",
            "\12\104\7\uffff\32\104\1\uffff\1\104\2\uffff\1\104\1\uffff"+
            "\32\104",
            "\1\u01ef",
            "\12\104\7\uffff\32\104\1\uffff\1\104\2\uffff\1\104\1\uffff"+
            "\32\104",
            "\12\104\7\uffff\32\104\1\uffff\1\104\2\uffff\1\104\1\uffff"+
            "\32\104",
            "\1\u01f1",
            "\1\u01f2",
            "\1\u01f3",
            "\1\u01f4",
            "\1\u01f5",
            "\1\u01f6\15\uffff\1\u01f7",
            "\1\u01f8",
            "\12\104\7\uffff\32\104\1\uffff\1\104\2\uffff\1\u01fa\1\uffff"+
            "\4\104\1\u01f9\25\104",
            "\1\u01fc",
            "\12\104\7\uffff\32\104\1\uffff\1\104\2\uffff\1\104\1\uffff"+
            "\32\104",
            "\12\104\7\uffff\32\104\1\uffff\1\104\2\uffff\1\104\1\uffff"+
            "\32\104",
            "\12\104\7\uffff\32\104\1\uffff\1\104\2\uffff\1\104\1\uffff"+
            "\32\104",
            "\1\u01ff",
            "\1\u0200",
            "\1\u0201",
            "\1\u0202",
            "\1\u0203",
            "\12\104\7\uffff\32\104\1\uffff\1\104\2\uffff\1\104\1\uffff"+
            "\32\104",
            "\1\u0204",
            "\1\u0205",
            "\1\u0206",
            "\1\u0207",
            "\1\u0208",
            "\12\u015a\1\u008f\27\u015a\1\u0159\71\u015a\1\u015b\uffa3"+
            "\u015a",
            "\60\u008f\12\u0209\7\u008f\6\u0209\uffb9\u008f",
            "\12\u015f\1\u008f\27\u015f\1\u015c\15\u015f\12\u020a\7\u015f"+
            "\6\u020a\25\u015f\1\u015e\uffa3\u015f",
            "\0\u008f",
            "\12\u015f\1\u008f\27\u015f\1\u015c\71\u015f\1\u015e\uffa3"+
            "\u015f",
            "\12\u009f\1\uffff\ufff5\u009f",
            "\12\162\1\uffff\45\162\12\u020b\7\162\6\u020b\uffb9\162",
            "\12\u0161\1\uffff\27\u0161\1\u0160\15\u0161\12\u01bc\7\u0161"+
            "\6\u01bc\25\u0161\1\u0162\uffa3\u0161",
            "\12\162\1\uffff\45\162\12\u020c\7\162\6\u020c\uffb9\162",
            "\12\u0161\1\uffff\27\u0161\1\u0160\71\u0161\1\u0162\uffa3"+
            "\u0161",
            "\1\u020d",
            "\1\u020e",
            "\1\u020f",
            "\1\u0210",
            "\1\u0211",
            "\1\u0212",
            "\1\u0213",
            "\1\u0214",
            "\1\u0215",
            "\1\u0216",
            "\1\u0217",
            "\1\u0218",
            "\1\u0219",
            "\1\u021a",
            "\1\u021b",
            "\1\u021c",
            "\12\104\7\uffff\32\104\1\uffff\1\104\2\uffff\1\104\1\uffff"+
            "\32\104",
            "\1\u021d",
            "\12\104\7\uffff\32\104\1\uffff\1\104\2\uffff\1\104\1\uffff"+
            "\32\104",
            "\1\u021e",
            "\1\u021f",
            "\1\u0220",
            "\1\u0221",
            "\1\u0222",
            "\1\u0223",
            "\1\u0224",
            "\1\u0225",
            "\1\u0226",
            "\1\u0227",
            "\1\u0228",
            "\12\104\7\uffff\32\104\1\uffff\1\104\2\uffff\1\104\1\uffff"+
            "\32\104",
            "\1\u0229",
            "\1\u022a",
            "\1\u022b",
            "\1\u022c",
            "\1\u022d",
            "\12\104\7\uffff\32\104\1\uffff\1\104\2\uffff\1\104\1\uffff"+
            "\32\104",
            "\1\u022e",
            "\12\104\7\uffff\32\104\1\uffff\1\104\2\uffff\1\104\1\uffff"+
            "\32\104",
            "\1\u022f",
            "\12\104\7\uffff\32\104\1\uffff\1\104\2\uffff\1\104\1\uffff"+
            "\32\104",
            "\1\u0230",
            "\60\u008f\12\u0231\7\u008f\6\u0231\uffb9\u008f",
            "\1\u0232",
            "\1\u0233",
            "\12\104\7\uffff\32\104\1\uffff\1\104\2\uffff\1\104\1\uffff"+
            "\32\104",
            "\1\u0234",
            "",
            "\1\u0235",
            "",
            "\12\104\7\uffff\32\104\1\uffff\1\104\2\uffff\1\104\1\uffff"+
            "\32\104",
            "\1\u0236",
            "\1\u0237",
            "\12\104\7\uffff\32\104\1\uffff\1\104\2\uffff\1\104\1\uffff"+
            "\32\104",
            "\1\u0238",
            "\1\u0239",
            "\1\u023a",
            "\12\104\7\uffff\32\104\1\uffff\1\104\2\uffff\1\104\1\uffff"+
            "\32\104",
            "\1\u023b",
            "\1\u023c",
            "",
            "\1\u023d",
            "",
            "",
            "\1\u023e",
            "\1\u023f",
            "\1\u0240",
            "\1\u0241",
            "\1\u0242",
            "\12\104\7\uffff\32\104\1\uffff\1\104\2\uffff\1\104\1\uffff"+
            "\32\104",
            "\1\u0244",
            "\1\u0245",
            "\12\104\7\uffff\32\104\1\uffff\1\104\2\uffff\1\104\1\uffff"+
            "\32\104",
            "\1\u0246",
            "\60\u008f\12\u0247\7\u008f\6\u0247\uffb9\u008f",
            "\12\u015f\1\u008f\27\u015f\1\u015c\15\u015f\12\u0248\7\u015f"+
            "\6\u0248\25\u015f\1\u015e\uffa3\u015f",
            "\12\162\1\uffff\45\162\12\u0249\7\162\6\u0249\uffb9\162",
            "\12\162\1\uffff\45\162\12\u024a\7\162\6\u024a\uffb9\162",
            "\1\u024b",
            "\1\u024c",
            "\1\u024d",
            "\1\u024e",
            "\12\104\7\uffff\13\104\1\u024f\16\104\1\uffff\1\104\2\uffff"+
            "\1\104\1\uffff\32\104",
            "\1\u0251",
            "\1\u0252",
            "\1\u0253",
            "\1\u0254",
            "\1\u0255",
            "\1\u0256",
            "\1\u0257",
            "\1\u0258",
            "\1\u0259",
            "\1\u025a",
            "\1\u025b",
            "\12\104\7\uffff\32\104\1\uffff\1\104\2\uffff\1\104\1\uffff"+
            "\32\104",
            "\1\u025c",
            "\12\104\7\uffff\32\104\1\uffff\1\104\2\uffff\1\104\1\uffff"+
            "\32\104",
            "\12\104\7\uffff\32\104\1\uffff\1\104\2\uffff\1\104\1\uffff"+
            "\32\104",
            "\12\104\7\uffff\32\104\1\uffff\1\104\2\uffff\1\104\1\uffff"+
            "\32\104",
            "\1\u025d",
            "\1\u025e",
            "\1\u025f",
            "\12\104\7\uffff\32\104\1\uffff\1\104\2\uffff\1\104\1\uffff"+
            "\32\104",
            "\1\u0260",
            "\1\u0261",
            "\12\104\7\uffff\32\104\1\uffff\1\104\2\uffff\1\104\1\uffff"+
            "\32\104",
            "\12\104\7\uffff\32\104\1\uffff\1\104\2\uffff\1\104\1\uffff"+
            "\32\104",
            "\12\104\7\uffff\32\104\1\uffff\1\104\2\uffff\1\104\1\uffff"+
            "\32\104",
            "\12\104\7\uffff\32\104\1\uffff\1\104\2\uffff\1\u0262\1\uffff"+
            "\32\104",
            "\12\104\7\uffff\32\104\1\uffff\1\104\2\uffff\1\104\1\uffff"+
            "\32\104",
            "\12\104\7\uffff\32\104\1\uffff\1\104\2\uffff\1\104\1\uffff"+
            "\32\104",
            "\1\u0263",
            "\1\u0264",
            "\12\104\7\uffff\32\104\1\uffff\1\104\2\uffff\1\104\1\uffff"+
            "\32\104",
            "\60\u008f\12\u0265\7\u008f\6\u0265\uffb9\u008f",
            "\1\u0266",
            "\12\104\7\uffff\32\104\1\uffff\1\104\2\uffff\1\104\1\uffff"+
            "\32\104",
            "\1\u0267",
            "\1\u0268",
            "\12\104\7\uffff\32\104\1\uffff\1\104\2\uffff\1\104\1\uffff"+
            "\32\104",
            "\1\u026a",
            "\1\u026b",
            "\12\104\7\uffff\32\104\1\uffff\1\104\2\uffff\1\104\1\uffff"+
            "\32\104",
            "\12\104\7\uffff\32\104\1\uffff\1\104\2\uffff\1\104\1\uffff"+
            "\32\104",
            "\1\u026d",
            "\1\u026e",
            "\1\u026f",
            "\1\u0270",
            "\1\u0271",
            "\1\u0272",
            "\12\104\7\uffff\32\104\1\uffff\1\104\2\uffff\1\104\1\uffff"+
            "\32\104",
            "\1\u0273",
            "",
            "\1\u0274",
            "\12\104\7\uffff\32\104\1\uffff\1\104\2\uffff\1\104\1\uffff"+
            "\32\104",
            "\1\u0275",
            "\60\u008f\12\u0276\7\u008f\6\u0276\uffb9\u008f",
            "\12\u008e\1\u008f\27\u008e\1\u0102\71\u008e\1\u008d\uffa3"+
            "\u008e",
            "\12\162\1\uffff\45\162\12\u0277\7\162\6\u0277\uffb9\162",
            "\12\162\1\uffff\45\162\12\u0278\7\162\6\u0278\uffb9\162",
            "\1\u0279",
            "\1\u027a",
            "\1\u027b",
            "\1\u027c",
            "\1\u027d",
            "",
            "\1\u027e",
            "\1\u027f",
            "\1\u0280",
            "\1\u0281",
            "\1\u0282",
            "\1\u0283",
            "\1\u0284",
            "\1\u0285",
            "\1\u0286",
            "\1\u0287",
            "\1\u0288",
            "\1\u0289",
            "\12\104\7\uffff\32\104\1\uffff\1\104\2\uffff\1\104\1\uffff"+
            "\32\104",
            "\12\104\7\uffff\32\104\1\uffff\1\104\2\uffff\1\104\1\uffff"+
            "\32\104",
            "\1\u028a",
            "\1\u028b",
            "\1\u028c",
            "\1\u028d\1\uffff\1\u028e",
            "\1\u028f",
            "\12\104\7\uffff\32\104\1\uffff\1\104\2\uffff\1\104\1\uffff"+
            "\32\104",
            "\12\u00bc\1\u008f\34\u00bc\1\u0130\64\u00bc\1\u00bd\uffa3"+
            "\u00bc",
            "\12\104\7\uffff\32\104\1\uffff\1\104\2\uffff\1\104\1\uffff"+
            "\32\104",
            "\12\104\7\uffff\32\104\1\uffff\1\104\2\uffff\1\104\1\uffff"+
            "\32\104",
            "\1\u0292",
            "",
            "\12\104\7\uffff\32\104\1\uffff\1\104\2\uffff\1\104\1\uffff"+
            "\32\104",
            "\1\u0294",
            "",
            "\1\u0295",
            "\1\u0296",
            "\12\104\7\uffff\32\104\1\uffff\1\104\2\uffff\1\104\1\uffff"+
            "\32\104",
            "\12\104\7\uffff\32\104\1\uffff\1\104\2\uffff\1\104\1\uffff"+
            "\32\104",
            "\12\104\7\uffff\32\104\1\uffff\1\104\2\uffff\1\104\1\uffff"+
            "\32\104",
            "\12\104\7\uffff\32\104\1\uffff\1\104\2\uffff\1\104\1\uffff"+
            "\32\104",
            "\12\104\7\uffff\32\104\1\uffff\1\104\2\uffff\1\104\1\uffff"+
            "\32\104",
            "\12\104\7\uffff\32\104\1\uffff\1\104\2\uffff\1\104\1\uffff"+
            "\32\104",
            "\1\u0299",
            "\60\u008f\12\u029a\7\u008f\6\u029a\uffb9\u008f",
            "\12\162\1\uffff\45\162\12\u029b\7\162\6\u029b\uffb9\162",
            "\12\162\1\uffff\45\162\12\u029c\7\162\6\u029c\uffb9\162",
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
            "\1\u02a9",
            "\1\u02aa",
            "\1\u02ab",
            "\1\u02ac",
            "\12\104\7\uffff\32\104\1\uffff\1\104\2\uffff\1\104\1\uffff"+
            "\32\104",
            "\1\u02ad",
            "\12\104\7\uffff\32\104\1\uffff\1\104\2\uffff\1\104\1\uffff"+
            "\32\104",
            "\1\u02ae",
            "\1\u02af",
            "\1\u02b0",
            "\12\104\7\uffff\32\104\1\uffff\1\104\2\uffff\1\104\1\uffff"+
            "\32\104",
            "",
            "",
            "\1\u02b1",
            "",
            "\12\104\7\uffff\32\104\1\uffff\1\104\2\uffff\1\104\1\uffff"+
            "\32\104",
            "\12\104\7\uffff\32\104\1\uffff\1\104\2\uffff\1\104\1\uffff"+
            "\32\104",
            "\1\u02b2",
            "",
            "",
            "\1\u02b3",
            "\12\u015a\1\u008f\27\u015a\1\u0159\71\u015a\1\u015b\uffa3"+
            "\u015a",
            "\12\u0161\1\uffff\27\u0161\1\u0160\71\u0161\1\u0162\uffa3"+
            "\u0161",
            "\12\162\1\uffff\45\162\12\u02b4\7\162\6\u02b4\uffb9\162",
            "\1\u02b5",
            "\1\u02b6",
            "\1\u02b7",
            "\12\104\7\uffff\32\104\1\uffff\1\104\2\uffff\1\104\1\uffff"+
            "\32\104",
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
            "\12\104\7\uffff\32\104\1\uffff\1\104\2\uffff\1\104\1\uffff"+
            "\32\104",
            "\1\u02c5",
            "\1\u02c6",
            "\1\u02c7",
            "\1\u02c8",
            "\12\104\7\uffff\32\104\1\uffff\1\104\2\uffff\1\104\1\uffff"+
            "\32\104",
            "\1\u02c9",
            "\12\162\1\uffff\45\162\12\u02ca\7\162\6\u02ca\uffb9\162",
            "\1\u02cb",
            "\1\u02cc",
            "\1\u02cd",
            "",
            "\12\104\7\uffff\32\104\1\uffff\1\104\2\uffff\1\104\1\uffff"+
            "\32\104",
            "\1\u02cf",
            "\1\u02d0",
            "\1\u02d1",
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
            "\1\u02de",
            "\12\u0161\1\uffff\27\u0161\1\u0160\71\u0161\1\u0162\uffa3"+
            "\u0161",
            "\1\u02df",
            "\1\u02e0",
            "\1\u02e1",
            "",
            "\1\u02e2",
            "\1\u02e3",
            "\1\u02e4",
            "\12\104\7\uffff\32\104\1\uffff\1\104\2\uffff\1\104\1\uffff"+
            "\32\104",
            "\1\u02e6",
            "\12\104\7\uffff\32\104\1\uffff\1\104\2\uffff\1\104\1\uffff"+
            "\32\104",
            "\1\u02e8",
            "\1\u02e9",
            "\1\u02ea",
            "\1\u02eb",
            "\1\u02ec",
            "\1\u02ed",
            "\1\u02ee",
            "\12\104\7\uffff\32\104\1\uffff\1\104\2\uffff\1\104\1\uffff"+
            "\32\104",
            "\12\104\7\uffff\32\104\1\uffff\1\104\2\uffff\1\104\1\uffff"+
            "\32\104",
            "\12\104\7\uffff\32\104\1\uffff\1\104\2\uffff\1\104\1\uffff"+
            "\32\104",
            "\1\u02ef",
            "\1\u02f0",
            "\1\u02f1",
            "\1\u02f2",
            "\1\u02f3",
            "\12\104\7\uffff\32\104\1\uffff\1\104\2\uffff\1\104\1\uffff"+
            "\32\104",
            "",
            "\1\u02f5",
            "",
            "\1\u02f6",
            "\1\u02f7",
            "\1\u02f8",
            "\1\u02f9",
            "\1\u02fa",
            "\1\u02fb",
            "\1\u02fc",
            "\1\u02fd",
            "\1\u02fe",
            "\1\u02ff",
            "\12\104\7\uffff\32\104\1\uffff\1\104\2\uffff\1\104\1\uffff"+
            "\32\104",
            "\1\u0301",
            "",
            "\1\u0302",
            "\1\u0303",
            "\1\u0304",
            "\1\u0305",
            "\1\u0306",
            "\12\104\7\uffff\32\104\1\uffff\1\104\2\uffff\1\104\1\uffff"+
            "\32\104",
            "\1\u0308",
            "\12\104\7\uffff\32\104\1\uffff\1\104\2\uffff\1\104\1\uffff"+
            "\32\104",
            "\1\u0309",
            "\1\u030a",
            "\1\u030b",
            "",
            "\1\u030c",
            "\1\u030d",
            "\1\u030e",
            "\1\u030f",
            "\1\u0310",
            "\1\u0311",
            "",
            "\1\u0312",
            "\1\u0313",
            "\1\u0314",
            "\12\104\7\uffff\32\104\1\uffff\1\104\2\uffff\1\104\1\uffff"+
            "\32\104",
            "\1\u0316",
            "\1\u0317",
            "\1\u0318",
            "\1\u0319",
            "\1\u031a",
            "\1\u031b",
            "\1\u031c",
            "\1\u031d",
            "\1\u031e",
            "",
            "\1\u031f",
            "\1\u0320",
            "\1\u0321",
            "\1\u0322",
            "\1\u0323",
            "\1\u0324",
            "\12\104\7\uffff\32\104\1\uffff\1\104\2\uffff\1\104\1\uffff"+
            "\32\104",
            "\1\u0325",
            "\12\104\7\uffff\32\104\1\uffff\1\104\2\uffff\1\104\1\uffff"+
            "\32\104",
            "\1\u0327",
            "\1\u0328",
            "\1\u0329",
            "\1\u032a",
            "\1\u032b",
            "\1\u032c",
            "\12\104\7\uffff\32\104\1\uffff\1\104\2\uffff\1\104\1\uffff"+
            "\32\104",
            "",
            "\1\u032e",
            "\1\u032f",
            "\1\u0330",
            "\1\u0331",
            "\1\u0332",
            "\12\104\7\uffff\32\104\1\uffff\1\104\2\uffff\1\104\1\uffff"+
            "\32\104",
            "",
            "\1\u0334",
            "\1\u0335",
            "\12\104\7\uffff\32\104\1\uffff\1\104\2\uffff\1\104\1\uffff"+
            "\32\104",
            "\1\u0337",
            "\12\104\7\uffff\32\104\1\uffff\1\104\2\uffff\1\104\1\uffff"+
            "\32\104",
            "",
            "\1\u0339",
            "\12\104\7\uffff\2\104\1\u033a\27\104\1\uffff\1\104\2\uffff"+
            "\1\104\1\uffff\32\104",
            "",
            "\12\104\7\uffff\32\104\1\uffff\1\104\2\uffff\1\104\1\uffff"+
            "\32\104",
            "",
            "\12\104\7\uffff\32\104\1\uffff\1\104\2\uffff\1\104\1\uffff"+
            "\32\104",
            "\1\u033e",
            "",
            "",
            "",
            "\1\u033f",
            "\1\u0340",
            "\1\u0341",
            "\1\u0342",
            "\12\104\7\uffff\32\104\1\uffff\1\104\2\uffff\1\104\1\uffff"+
            "\32\104",
            ""
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
            return "1:1: Tokens : ( T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | T__114 | T__115 | RULE_HEADER_NAME | RULE_NONDIGIT | RULE_DIGIT | RULE_KEYWORD | RULE_PREPROCESSING_OP_OR_PUNC | RULE_ID | RULE_INT | RULE_CHARACTER_LITERAL | RULE_FLOATING_LITERAL | RULE_STRING_LITERAL | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA46_254 = input.LA(1);

                        s = -1;
                        if ( ((LA46_254>='0' && LA46_254<='9')||(LA46_254>='A' && LA46_254<='F')) ) {s = 355;}

                        else if ( ((LA46_254>='\u0000' && LA46_254<='\t')||(LA46_254>='\u000B' && LA46_254<='/')||(LA46_254>=':' && LA46_254<='@')||(LA46_254>='G' && LA46_254<='\uFFFF')) ) {s = 114;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA46_355 = input.LA(1);

                        s = -1;
                        if ( (LA46_355=='\"') ) {s = 352;}

                        else if ( ((LA46_355>='0' && LA46_355<='9')||(LA46_355>='A' && LA46_355<='F')) ) {s = 444;}

                        else if ( (LA46_355=='\\') ) {s = 354;}

                        else if ( ((LA46_355>='\u0000' && LA46_355<='\t')||(LA46_355>='\u000B' && LA46_355<='!')||(LA46_355>='#' && LA46_355<='/')||(LA46_355>=':' && LA46_355<='@')||(LA46_355>='G' && LA46_355<='[')||(LA46_355>=']' && LA46_355<='\uFFFF')) ) {s = 353;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA46_444 = input.LA(1);

                        s = -1;
                        if ( (LA46_444=='\"') ) {s = 352;}

                        else if ( ((LA46_444>='0' && LA46_444<='9')||(LA46_444>='A' && LA46_444<='F')) ) {s = 444;}

                        else if ( (LA46_444=='\\') ) {s = 354;}

                        else if ( ((LA46_444>='\u0000' && LA46_444<='\t')||(LA46_444>='\u000B' && LA46_444<='!')||(LA46_444>='#' && LA46_444<='/')||(LA46_444>=':' && LA46_444<='@')||(LA46_444>='G' && LA46_444<='[')||(LA46_444>=']' && LA46_444<='\uFFFF')) ) {s = 353;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA46_353 = input.LA(1);

                        s = -1;
                        if ( (LA46_353=='\"') ) {s = 352;}

                        else if ( ((LA46_353>='\u0000' && LA46_353<='\t')||(LA46_353>='\u000B' && LA46_353<='!')||(LA46_353>='#' && LA46_353<='[')||(LA46_353>=']' && LA46_353<='\uFFFF')) ) {s = 353;}

                        else if ( (LA46_353=='\\') ) {s = 354;}

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA46_110 = input.LA(1);

                        s = -1;
                        if ( ((LA46_110>='\u0000' && LA46_110<='\t')||(LA46_110>='\u000B' && LA46_110<='\uFFFF')) ) {s = 114;}

                        else s = 232;

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA46_0 = input.LA(1);

                        s = -1;
                        if ( (LA46_0=='t') ) {s = 1;}

                        else if ( (LA46_0=='f') ) {s = 2;}

                        else if ( (LA46_0=='n') ) {s = 3;}

                        else if ( (LA46_0==':') ) {s = 4;}

                        else if ( (LA46_0=='[') ) {s = 5;}

                        else if ( (LA46_0==']') ) {s = 6;}

                        else if ( (LA46_0=='a') ) {s = 7;}

                        else if ( (LA46_0=='(') ) {s = 8;}

                        else if ( (LA46_0=='.') ) {s = 9;}

                        else if ( (LA46_0==')') ) {s = 10;}

                        else if ( (LA46_0==',') ) {s = 11;}

                        else if ( (LA46_0=='c') ) {s = 12;}

                        else if ( (LA46_0=='v') ) {s = 13;}

                        else if ( (LA46_0=='&') ) {s = 14;}

                        else if ( (LA46_0=='-') ) {s = 15;}

                        else if ( (LA46_0=='*') ) {s = 16;}

                        else if ( (LA46_0=='o') ) {s = 17;}

                        else if ( (LA46_0=='<') ) {s = 18;}

                        else if ( (LA46_0=='>') ) {s = 19;}

                        else if ( (LA46_0=='d') ) {s = 20;}

                        else if ( (LA46_0=='+') ) {s = 21;}

                        else if ( (LA46_0=='/') ) {s = 22;}

                        else if ( (LA46_0=='%') ) {s = 23;}

                        else if ( (LA46_0=='^') ) {s = 24;}

                        else if ( (LA46_0=='|') ) {s = 25;}

                        else if ( (LA46_0=='~') ) {s = 26;}

                        else if ( (LA46_0=='!') ) {s = 27;}

                        else if ( (LA46_0=='=') ) {s = 28;}

                        else if ( (LA46_0=='\"') ) {s = 29;}

                        else if ( (LA46_0=='C') ) {s = 30;}

                        else if ( (LA46_0=='T') ) {s = 31;}

                        else if ( (LA46_0=='I') ) {s = 32;}

                        else if ( (LA46_0=='P') ) {s = 33;}

                        else if ( (LA46_0=='D') ) {s = 34;}

                        else if ( (LA46_0=='N') ) {s = 35;}

                        else if ( (LA46_0=='A') ) {s = 36;}

                        else if ( (LA46_0=='U') ) {s = 37;}

                        else if ( (LA46_0=='b') ) {s = 38;}

                        else if ( ((LA46_0>='1' && LA46_0<='9')) ) {s = 39;}

                        else if ( (LA46_0=='e') ) {s = 40;}

                        else if ( (LA46_0=='g') ) {s = 41;}

                        else if ( (LA46_0=='i') ) {s = 42;}

                        else if ( (LA46_0=='l') ) {s = 43;}

                        else if ( (LA46_0=='m') ) {s = 44;}

                        else if ( (LA46_0=='p') ) {s = 45;}

                        else if ( (LA46_0=='r') ) {s = 46;}

                        else if ( (LA46_0=='s') ) {s = 47;}

                        else if ( (LA46_0=='u') ) {s = 48;}

                        else if ( (LA46_0=='w') ) {s = 49;}

                        else if ( (LA46_0=='x') ) {s = 50;}

                        else if ( (LA46_0=='{') ) {s = 51;}

                        else if ( (LA46_0=='}') ) {s = 52;}

                        else if ( (LA46_0=='#') ) {s = 53;}

                        else if ( (LA46_0==';') ) {s = 54;}

                        else if ( (LA46_0=='?') ) {s = 55;}

                        else if ( (LA46_0=='L') ) {s = 56;}

                        else if ( (LA46_0=='\\') ) {s = 57;}

                        else if ( (LA46_0=='0') ) {s = 58;}

                        else if ( (LA46_0=='B'||(LA46_0>='E' && LA46_0<='H')||(LA46_0>='J' && LA46_0<='K')||LA46_0=='M'||LA46_0=='O'||(LA46_0>='Q' && LA46_0<='S')||(LA46_0>='V' && LA46_0<='Z')||LA46_0=='_'||LA46_0=='h'||(LA46_0>='j' && LA46_0<='k')||LA46_0=='q'||(LA46_0>='y' && LA46_0<='z')) ) {s = 59;}

                        else if ( (LA46_0=='\'') ) {s = 60;}

                        else if ( ((LA46_0>='\t' && LA46_0<='\n')||LA46_0=='\r'||LA46_0==' ') ) {s = 61;}

                        else if ( ((LA46_0>='\u0000' && LA46_0<='\b')||(LA46_0>='\u000B' && LA46_0<='\f')||(LA46_0>='\u000E' && LA46_0<='\u001F')||LA46_0=='$'||LA46_0=='@'||LA46_0=='`'||(LA46_0>='\u007F' && LA46_0<='\uFFFF')) ) {s = 62;}

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA46_667 = input.LA(1);

                        s = -1;
                        if ( (LA46_667=='\"') ) {s = 352;}

                        else if ( ((LA46_667>='\u0000' && LA46_667<='\t')||(LA46_667>='\u000B' && LA46_667<='!')||(LA46_667>='#' && LA46_667<='[')||(LA46_667>=']' && LA46_667<='\uFFFF')) ) {s = 353;}

                        else if ( (LA46_667=='\\') ) {s = 354;}

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA46_714 = input.LA(1);

                        s = -1;
                        if ( (LA46_714=='\"') ) {s = 352;}

                        else if ( ((LA46_714>='\u0000' && LA46_714<='\t')||(LA46_714>='\u000B' && LA46_714<='!')||(LA46_714>='#' && LA46_714<='[')||(LA46_714>=']' && LA46_714<='\uFFFF')) ) {s = 353;}

                        else if ( (LA46_714=='\\') ) {s = 354;}

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA46_142 = input.LA(1);

                        s = -1;
                        if ( (LA46_142=='\"') ) {s = 258;}

                        else if ( (LA46_142=='\\') ) {s = 141;}

                        else if ( ((LA46_142>='\u0000' && LA46_142<='\t')||(LA46_142>='\u000B' && LA46_142<='!')||(LA46_142>='#' && LA46_142<='[')||(LA46_142>=']' && LA46_142<='\uFFFF')) ) {s = 142;}

                        else if ( (LA46_142=='\n') ) {s = 143;}

                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA46_230 = input.LA(1);

                        s = -1;
                        if ( ((LA46_230>='\u0000' && LA46_230<='\t')||(LA46_230>='\u000B' && LA46_230<='\uFFFF')) ) {s = 114;}

                        else s = 338;

                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA46_586 = input.LA(1);

                        s = -1;
                        if ( ((LA46_586>='0' && LA46_586<='9')||(LA46_586>='A' && LA46_586<='F')) ) {s = 632;}

                        else if ( ((LA46_586>='\u0000' && LA46_586<='\t')||(LA46_586>='\u000B' && LA46_586<='/')||(LA46_586>=':' && LA46_586<='@')||(LA46_586>='G' && LA46_586<='\uFFFF')) ) {s = 114;}

                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA46_141 = input.LA(1);

                        s = -1;
                        if ( (LA46_141=='\"') ) {s = 251;}

                        else if ( (LA46_141=='u') ) {s = 252;}

                        else if ( (LA46_141=='?'||LA46_141=='a'||LA46_141=='v') ) {s = 253;}

                        else if ( (LA46_141=='x') ) {s = 254;}

                        else if ( (LA46_141=='U') ) {s = 255;}

                        else if ( (LA46_141=='\''||LA46_141=='\\'||LA46_141=='b'||LA46_141=='f'||LA46_141=='n'||LA46_141=='r'||LA46_141=='t') ) {s = 256;}

                        else if ( ((LA46_141>='0' && LA46_141<='7')) ) {s = 257;}

                        else if ( ((LA46_141>='\u0000' && LA46_141<='\t')||(LA46_141>='\u000B' && LA46_141<='!')||(LA46_141>='#' && LA46_141<='&')||(LA46_141>='(' && LA46_141<='/')||(LA46_141>='8' && LA46_141<='>')||(LA46_141>='@' && LA46_141<='T')||(LA46_141>='V' && LA46_141<='[')||(LA46_141>=']' && LA46_141<='`')||(LA46_141>='c' && LA46_141<='e')||(LA46_141>='g' && LA46_141<='m')||(LA46_141>='o' && LA46_141<='q')||LA46_141=='s'||LA46_141=='w'||(LA46_141>='y' && LA46_141<='\uFFFF')) ) {s = 114;}

                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA46_109 = input.LA(1);

                        s = -1;
                        if ( (LA46_109=='=') ) {s = 230;}

                        else if ( ((LA46_109>='\u0000' && LA46_109<='\t')||(LA46_109>='\u000B' && LA46_109<='<')||(LA46_109>='>' && LA46_109<='\uFFFF')) ) {s = 114;}

                        else s = 231;

                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA46_351 = input.LA(1);

                        s = -1;
                        if ( (LA46_351=='\"') ) {s = 348;}

                        else if ( (LA46_351=='\\') ) {s = 350;}

                        else if ( ((LA46_351>='\u0000' && LA46_351<='\t')||(LA46_351>='\u000B' && LA46_351<='!')||(LA46_351>='#' && LA46_351<='[')||(LA46_351>=']' && LA46_351<='\uFFFF')) ) {s = 351;}

                        else if ( (LA46_351=='\n') ) {s = 143;}

                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA46_438 = input.LA(1);

                        s = -1;
                        if ( ((LA46_438>='0' && LA46_438<='9')||(LA46_438>='A' && LA46_438<='F')) ) {s = 521;}

                        else if ( ((LA46_438>='\u0000' && LA46_438<='/')||(LA46_438>=':' && LA46_438<='@')||(LA46_438>='G' && LA46_438<='\uFFFF')) ) {s = 143;}

                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA46_60 = input.LA(1);

                        s = -1;
                        if ( ((LA46_60>='\u0000' && LA46_60<='\t')||(LA46_60>='\u000B' && LA46_60<='&')||(LA46_60>='(' && LA46_60<='[')||(LA46_60>=']' && LA46_60<='\uFFFF')) ) {s = 188;}

                        else if ( (LA46_60=='\\') ) {s = 189;}

                        else if ( (LA46_60=='\n'||LA46_60=='\'') ) {s = 143;}

                        else s = 62;

                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA46_441 = input.LA(1);

                        s = -1;
                        if ( (LA46_441=='\"') ) {s = 348;}

                        else if ( (LA46_441=='\\') ) {s = 350;}

                        else if ( ((LA46_441>='\u0000' && LA46_441<='\t')||(LA46_441>='\u000B' && LA46_441<='!')||(LA46_441>='#' && LA46_441<='[')||(LA46_441>=']' && LA46_441<='\uFFFF')) ) {s = 351;}

                        else if ( (LA46_441=='\n') ) {s = 143;}

                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA46_584 = input.LA(1);

                        s = -1;
                        if ( (LA46_584=='\"') ) {s = 258;}

                        else if ( (LA46_584=='\\') ) {s = 141;}

                        else if ( ((LA46_584>='\u0000' && LA46_584<='\t')||(LA46_584>='\u000B' && LA46_584<='!')||(LA46_584>='#' && LA46_584<='[')||(LA46_584>=']' && LA46_584<='\uFFFF')) ) {s = 142;}

                        else if ( (LA46_584=='\n') ) {s = 143;}

                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA46_524 = input.LA(1);

                        s = -1;
                        if ( ((LA46_524>='\u0000' && LA46_524<='\t')||(LA46_524>='\u000B' && LA46_524<='/')||(LA46_524>=':' && LA46_524<='@')||(LA46_524>='G' && LA46_524<='\uFFFF')) ) {s = 114;}

                        else if ( ((LA46_524>='0' && LA46_524<='9')||(LA46_524>='A' && LA46_524<='F')) ) {s = 586;}

                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA46_631 = input.LA(1);

                        s = -1;
                        if ( ((LA46_631>='\u0000' && LA46_631<='\t')||(LA46_631>='\u000B' && LA46_631<='/')||(LA46_631>=':' && LA46_631<='@')||(LA46_631>='G' && LA46_631<='\uFFFF')) ) {s = 114;}

                        else if ( ((LA46_631>='0' && LA46_631<='9')||(LA46_631>='A' && LA46_631<='F')) ) {s = 667;}

                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA46_692 = input.LA(1);

                        s = -1;
                        if ( ((LA46_692>='0' && LA46_692<='9')||(LA46_692>='A' && LA46_692<='F')) ) {s = 714;}

                        else if ( ((LA46_692>='\u0000' && LA46_692<='\t')||(LA46_692>='\u000B' && LA46_692<='/')||(LA46_692>=':' && LA46_692<='@')||(LA46_692>='G' && LA46_692<='\uFFFF')) ) {s = 114;}

                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA46_356 = input.LA(1);

                        s = -1;
                        if ( ((LA46_356>='\u0000' && LA46_356<='\t')||(LA46_356>='\u000B' && LA46_356<='/')||(LA46_356>=':' && LA46_356<='@')||(LA46_356>='G' && LA46_356<='\uFFFF')) ) {s = 114;}

                        else if ( ((LA46_356>='0' && LA46_356<='9')||(LA46_356>='A' && LA46_356<='F')) ) {s = 445;}

                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA46_523 = input.LA(1);

                        s = -1;
                        if ( ((LA46_523>='0' && LA46_523<='9')||(LA46_523>='A' && LA46_523<='F')) ) {s = 585;}

                        else if ( ((LA46_523>='\u0000' && LA46_523<='\t')||(LA46_523>='\u000B' && LA46_523<='/')||(LA46_523>=':' && LA46_523<='@')||(LA46_523>='G' && LA46_523<='\uFFFF')) ) {s = 114;}

                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA46_632 = input.LA(1);

                        s = -1;
                        if ( ((LA46_632>='\u0000' && LA46_632<='\t')||(LA46_632>='\u000B' && LA46_632<='/')||(LA46_632>=':' && LA46_632<='@')||(LA46_632>='G' && LA46_632<='\uFFFF')) ) {s = 114;}

                        else if ( ((LA46_632>='0' && LA46_632<='9')||(LA46_632>='A' && LA46_632<='F')) ) {s = 668;}

                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA46_445 = input.LA(1);

                        s = -1;
                        if ( ((LA46_445>='0' && LA46_445<='9')||(LA46_445>='A' && LA46_445<='F')) ) {s = 524;}

                        else if ( ((LA46_445>='\u0000' && LA46_445<='\t')||(LA46_445>='\u000B' && LA46_445<='/')||(LA46_445>=':' && LA46_445<='@')||(LA46_445>='G' && LA46_445<='\uFFFF')) ) {s = 114;}

                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA46_585 = input.LA(1);

                        s = -1;
                        if ( ((LA46_585>='\u0000' && LA46_585<='\t')||(LA46_585>='\u000B' && LA46_585<='/')||(LA46_585>=':' && LA46_585<='@')||(LA46_585>='G' && LA46_585<='\uFFFF')) ) {s = 114;}

                        else if ( ((LA46_585>='0' && LA46_585<='9')||(LA46_585>='A' && LA46_585<='F')) ) {s = 631;}

                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA46_668 = input.LA(1);

                        s = -1;
                        if ( ((LA46_668>='\u0000' && LA46_668<='\t')||(LA46_668>='\u000B' && LA46_668<='/')||(LA46_668>=':' && LA46_668<='@')||(LA46_668>='G' && LA46_668<='\uFFFF')) ) {s = 114;}

                        else if ( ((LA46_668>='0' && LA46_668<='9')||(LA46_668>='A' && LA46_668<='F')) ) {s = 692;}

                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA46_437 = input.LA(1);

                        s = -1;
                        if ( (LA46_437=='\"') ) {s = 345;}

                        else if ( ((LA46_437>='\u0000' && LA46_437<='\t')||(LA46_437>='\u000B' && LA46_437<='!')||(LA46_437>='#' && LA46_437<='[')||(LA46_437>=']' && LA46_437<='\uFFFF')) ) {s = 346;}

                        else if ( (LA46_437=='\\') ) {s = 347;}

                        else if ( (LA46_437=='\n') ) {s = 143;}

                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA46_346 = input.LA(1);

                        s = -1;
                        if ( (LA46_346=='\"') ) {s = 345;}

                        else if ( (LA46_346=='\\') ) {s = 347;}

                        else if ( ((LA46_346>='\u0000' && LA46_346<='\t')||(LA46_346>='\u000B' && LA46_346<='!')||(LA46_346>='#' && LA46_346<='[')||(LA46_346>=']' && LA46_346<='\uFFFF')) ) {s = 346;}

                        else if ( (LA46_346=='\n') ) {s = 143;}

                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA46_613 = input.LA(1);

                        s = -1;
                        if ( (LA46_613=='\'') ) {s = 304;}

                        else if ( ((LA46_613>='\u0000' && LA46_613<='\t')||(LA46_613>='\u000B' && LA46_613<='&')||(LA46_613>='(' && LA46_613<='[')||(LA46_613>=']' && LA46_613<='\uFFFF')) ) {s = 188;}

                        else if ( (LA46_613=='\\') ) {s = 189;}

                        else if ( (LA46_613=='\n') ) {s = 143;}

                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA46_255 = input.LA(1);

                        s = -1;
                        if ( ((LA46_255>='\u0000' && LA46_255<='\t')||(LA46_255>='\u000B' && LA46_255<='/')||(LA46_255>=':' && LA46_255<='@')||(LA46_255>='G' && LA46_255<='\uFFFF')) ) {s = 114;}

                        else if ( ((LA46_255>='0' && LA46_255<='9')||(LA46_255>='A' && LA46_255<='F')) ) {s = 356;}

                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA46_349 = input.LA(1);

                        s = -1;
                        if ( ((LA46_349>='0' && LA46_349<='9')||(LA46_349>='A' && LA46_349<='F')) ) {s = 439;}

                        else if ( (LA46_349=='\"') ) {s = 348;}

                        else if ( (LA46_349=='\\') ) {s = 350;}

                        else if ( ((LA46_349>='\u0000' && LA46_349<='\t')||(LA46_349>='\u000B' && LA46_349<='!')||(LA46_349>='#' && LA46_349<='/')||(LA46_349>=':' && LA46_349<='@')||(LA46_349>='G' && LA46_349<='[')||(LA46_349>=']' && LA46_349<='\uFFFF')) ) {s = 351;}

                        else if ( (LA46_349=='\n') ) {s = 143;}

                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        int LA46_439 = input.LA(1);

                        s = -1;
                        if ( (LA46_439=='\"') ) {s = 348;}

                        else if ( (LA46_439=='\\') ) {s = 350;}

                        else if ( ((LA46_439>='0' && LA46_439<='9')||(LA46_439>='A' && LA46_439<='F')) ) {s = 522;}

                        else if ( (LA46_439=='\n') ) {s = 143;}

                        else if ( ((LA46_439>='\u0000' && LA46_439<='\t')||(LA46_439>='\u000B' && LA46_439<='!')||(LA46_439>='#' && LA46_439<='/')||(LA46_439>=':' && LA46_439<='@')||(LA46_439>='G' && LA46_439<='[')||(LA46_439>=']' && LA46_439<='\uFFFF')) ) {s = 351;}

                        if ( s>=0 ) return s;
                        break;
                    case 33 : 
                        int LA46_522 = input.LA(1);

                        s = -1;
                        if ( (LA46_522=='\"') ) {s = 348;}

                        else if ( ((LA46_522>='0' && LA46_522<='9')||(LA46_522>='A' && LA46_522<='F')) ) {s = 584;}

                        else if ( (LA46_522=='\\') ) {s = 350;}

                        else if ( ((LA46_522>='\u0000' && LA46_522<='\t')||(LA46_522>='\u000B' && LA46_522<='!')||(LA46_522>='#' && LA46_522<='/')||(LA46_522>=':' && LA46_522<='@')||(LA46_522>='G' && LA46_522<='[')||(LA46_522>=']' && LA46_522<='\uFFFF')) ) {s = 351;}

                        else if ( (LA46_522=='\n') ) {s = 143;}

                        if ( s>=0 ) return s;
                        break;
                    case 34 : 
                        int LA46_443 = input.LA(1);

                        s = -1;
                        if ( ((LA46_443>='\u0000' && LA46_443<='\t')||(LA46_443>='\u000B' && LA46_443<='/')||(LA46_443>=':' && LA46_443<='@')||(LA46_443>='G' && LA46_443<='\uFFFF')) ) {s = 114;}

                        else if ( ((LA46_443>='0' && LA46_443<='9')||(LA46_443>='A' && LA46_443<='F')) ) {s = 523;}

                        if ( s>=0 ) return s;
                        break;
                    case 35 : 
                        int LA46_404 = input.LA(1);

                        s = -1;
                        if ( ((LA46_404>='0' && LA46_404<='9')||(LA46_404>='A' && LA46_404<='F')) ) {s = 489;}

                        else if ( ((LA46_404>='\u0000' && LA46_404<='/')||(LA46_404>=':' && LA46_404<='@')||(LA46_404>='G' && LA46_404<='\uFFFF')) ) {s = 143;}

                        if ( s>=0 ) return s;
                        break;
                    case 36 : 
                        int LA46_561 = input.LA(1);

                        s = -1;
                        if ( ((LA46_561>='0' && LA46_561<='9')||(LA46_561>='A' && LA46_561<='F')) ) {s = 613;}

                        else if ( ((LA46_561>='\u0000' && LA46_561<='/')||(LA46_561>=':' && LA46_561<='@')||(LA46_561>='G' && LA46_561<='\uFFFF')) ) {s = 143;}

                        if ( s>=0 ) return s;
                        break;
                    case 37 : 
                        int LA46_489 = input.LA(1);

                        s = -1;
                        if ( ((LA46_489>='0' && LA46_489<='9')||(LA46_489>='A' && LA46_489<='F')) ) {s = 561;}

                        else if ( ((LA46_489>='\u0000' && LA46_489<='/')||(LA46_489>=':' && LA46_489<='@')||(LA46_489>='G' && LA46_489<='\uFFFF')) ) {s = 143;}

                        if ( s>=0 ) return s;
                        break;
                    case 38 : 
                        int LA46_252 = input.LA(1);

                        s = -1;
                        if ( (LA46_252=='\"') ) {s = 348;}

                        else if ( ((LA46_252>='0' && LA46_252<='9')||(LA46_252>='A' && LA46_252<='F')) ) {s = 349;}

                        else if ( (LA46_252=='\\') ) {s = 350;}

                        else if ( ((LA46_252>='\u0000' && LA46_252<='\t')||(LA46_252>='\u000B' && LA46_252<='!')||(LA46_252>='#' && LA46_252<='/')||(LA46_252>=':' && LA46_252<='@')||(LA46_252>='G' && LA46_252<='[')||(LA46_252>=']' && LA46_252<='\uFFFF')) ) {s = 351;}

                        else if ( (LA46_252=='\n') ) {s = 143;}

                        if ( s>=0 ) return s;
                        break;
                    case 39 : 
                        int LA46_188 = input.LA(1);

                        s = -1;
                        if ( (LA46_188=='\'') ) {s = 304;}

                        else if ( ((LA46_188>='\u0000' && LA46_188<='\t')||(LA46_188>='\u000B' && LA46_188<='&')||(LA46_188>='(' && LA46_188<='[')||(LA46_188>=']' && LA46_188<='\uFFFF')) ) {s = 188;}

                        else if ( (LA46_188=='\\') ) {s = 189;}

                        else if ( (LA46_188=='\n') ) {s = 143;}

                        if ( s>=0 ) return s;
                        break;
                    case 40 : 
                        int LA46_29 = input.LA(1);

                        s = -1;
                        if ( (LA46_29=='\\') ) {s = 141;}

                        else if ( ((LA46_29>='\u0000' && LA46_29<='\t')||(LA46_29>='\u000B' && LA46_29<='!')||(LA46_29>='#' && LA46_29<='[')||(LA46_29>=']' && LA46_29<='\uFFFF')) ) {s = 142;}

                        else if ( (LA46_29=='\n'||LA46_29=='\"') ) {s = 143;}

                        else s = 140;

                        if ( s>=0 ) return s;
                        break;
                    case 41 : 
                        int LA46_256 = input.LA(1);

                        s = -1;
                        if ( (LA46_256=='\"') ) {s = 258;}

                        else if ( ((LA46_256>='\u0000' && LA46_256<='\t')||(LA46_256>='\u000B' && LA46_256<='!')||(LA46_256>='#' && LA46_256<='[')||(LA46_256>=']' && LA46_256<='\uFFFF')) ) {s = 142;}

                        else if ( (LA46_256=='\\') ) {s = 141;}

                        else if ( (LA46_256=='\n') ) {s = 143;}

                        if ( s>=0 ) return s;
                        break;
                    case 42 : 
                        int LA46_306 = input.LA(1);

                        s = -1;
                        if ( ((LA46_306>='\u0000' && LA46_306<='/')||(LA46_306>=':' && LA46_306<='@')||(LA46_306>='G' && LA46_306<='\uFFFF')) ) {s = 143;}

                        else if ( ((LA46_306>='0' && LA46_306<='9')||(LA46_306>='A' && LA46_306<='F')) ) {s = 404;}

                        if ( s>=0 ) return s;
                        break;
                    case 43 : 
                        int LA46_440 = input.LA(1);

                        s = -1;
                        if ( ((LA46_440>='\u0000' && LA46_440<='\uFFFF')) ) {s = 143;}

                        else s = 114;

                        if ( s>=0 ) return s;
                        break;
                    case 44 : 
                        int LA46_583 = input.LA(1);

                        s = -1;
                        if ( ((LA46_583>='\u0000' && LA46_583<='/')||(LA46_583>=':' && LA46_583<='@')||(LA46_583>='G' && LA46_583<='\uFFFF')) ) {s = 143;}

                        else if ( ((LA46_583>='0' && LA46_583<='9')||(LA46_583>='A' && LA46_583<='F')) ) {s = 630;}

                        if ( s>=0 ) return s;
                        break;
                    case 45 : 
                        int LA46_630 = input.LA(1);

                        s = -1;
                        if ( ((LA46_630>='0' && LA46_630<='9')||(LA46_630>='A' && LA46_630<='F')) ) {s = 666;}

                        else if ( ((LA46_630>='\u0000' && LA46_630<='/')||(LA46_630>=':' && LA46_630<='@')||(LA46_630>='G' && LA46_630<='\uFFFF')) ) {s = 143;}

                        if ( s>=0 ) return s;
                        break;
                    case 46 : 
                        int LA46_521 = input.LA(1);

                        s = -1;
                        if ( ((LA46_521>='0' && LA46_521<='9')||(LA46_521>='A' && LA46_521<='F')) ) {s = 583;}

                        else if ( ((LA46_521>='\u0000' && LA46_521<='/')||(LA46_521>=':' && LA46_521<='@')||(LA46_521>='G' && LA46_521<='\uFFFF')) ) {s = 143;}

                        if ( s>=0 ) return s;
                        break;
                    case 47 : 
                        int LA46_112 = input.LA(1);

                        s = -1;
                        if ( ((LA46_112>='\u0000' && LA46_112<='\t')||(LA46_112>='\u000B' && LA46_112<='\uFFFF')) ) {s = 114;}

                        else s = 78;

                        if ( s>=0 ) return s;
                        break;
                    case 48 : 
                        int LA46_253 = input.LA(1);

                        s = -1;
                        if ( (LA46_253=='\"') ) {s = 352;}

                        else if ( ((LA46_253>='\u0000' && LA46_253<='\t')||(LA46_253>='\u000B' && LA46_253<='!')||(LA46_253>='#' && LA46_253<='[')||(LA46_253>=']' && LA46_253<='\uFFFF')) ) {s = 353;}

                        else if ( (LA46_253=='\\') ) {s = 354;}

                        if ( s>=0 ) return s;
                        break;
                    case 49 : 
                        int LA46_111 = input.LA(1);

                        s = -1;
                        if ( ((LA46_111>='\u0000' && LA46_111<='\t')||(LA46_111>='\u000B' && LA46_111<='\uFFFF')) ) {s = 114;}

                        else s = 78;

                        if ( s>=0 ) return s;
                        break;
                    case 50 : 
                        int LA46_446 = input.LA(1);

                        s = -1;
                        if ( (LA46_446=='\"') ) {s = 352;}

                        else if ( ((LA46_446>='\u0000' && LA46_446<='\t')||(LA46_446>='\u000B' && LA46_446<='!')||(LA46_446>='#' && LA46_446<='[')||(LA46_446>=']' && LA46_446<='\uFFFF')) ) {s = 353;}

                        else if ( (LA46_446=='\\') ) {s = 354;}

                        if ( s>=0 ) return s;
                        break;
                    case 51 : 
                        int LA46_442 = input.LA(1);

                        s = -1;
                        if ( ((LA46_442>='\u0000' && LA46_442<='\t')||(LA46_442>='\u000B' && LA46_442<='\uFFFF')) ) {s = 159;}

                        else s = 114;

                        if ( s>=0 ) return s;
                        break;
                    case 52 : 
                        int LA46_350 = input.LA(1);

                        s = -1;
                        if ( (LA46_350=='\"') ) {s = 440;}

                        else if ( (LA46_350=='\''||LA46_350=='\\'||LA46_350=='b'||LA46_350=='f'||LA46_350=='n'||LA46_350=='r'||(LA46_350>='t' && LA46_350<='u')) ) {s = 441;}

                        else if ( ((LA46_350>='\u0000' && LA46_350<='\t')||(LA46_350>='\u000B' && LA46_350<='!')||(LA46_350>='#' && LA46_350<='&')||(LA46_350>='(' && LA46_350<='[')||(LA46_350>=']' && LA46_350<='a')||(LA46_350>='c' && LA46_350<='e')||(LA46_350>='g' && LA46_350<='m')||(LA46_350>='o' && LA46_350<='q')||LA46_350=='s'||(LA46_350>='v' && LA46_350<='\uFFFF')) ) {s = 114;}

                        if ( s>=0 ) return s;
                        break;
                    case 53 : 
                        int LA46_18 = input.LA(1);

                        s = -1;
                        if ( (LA46_18=='<') ) {s = 109;}

                        else if ( (LA46_18=='=') ) {s = 110;}

                        else if ( (LA46_18==':') ) {s = 111;}

                        else if ( (LA46_18=='%') ) {s = 112;}

                        else if ( ((LA46_18>='\u0000' && LA46_18<='\t')||(LA46_18>='\u000B' && LA46_18<='$')||(LA46_18>='&' && LA46_18<='9')||LA46_18==';'||(LA46_18>='?' && LA46_18<='\uFFFF')) ) {s = 114;}

                        else s = 113;

                        if ( s>=0 ) return s;
                        break;
                    case 54 : 
                        int LA46_257 = input.LA(1);

                        s = -1;
                        if ( ((LA46_257>='\u0000' && LA46_257<='\t')||(LA46_257>='\u000B' && LA46_257<='/')||(LA46_257>='8' && LA46_257<='\uFFFF')) ) {s = 114;}

                        else if ( ((LA46_257>='0' && LA46_257<='7')) ) {s = 357;}

                        if ( s>=0 ) return s;
                        break;
                    case 55 : 
                        int LA46_357 = input.LA(1);

                        s = -1;
                        if ( ((LA46_357>='\u0000' && LA46_357<='\t')||(LA46_357>='\u000B' && LA46_357<='/')||(LA46_357>='8' && LA46_357<='\uFFFF')) ) {s = 114;}

                        else if ( ((LA46_357>='0' && LA46_357<='7')) ) {s = 446;}

                        if ( s>=0 ) return s;
                        break;
                    case 56 : 
                        int LA46_251 = input.LA(1);

                        s = -1;
                        if ( (LA46_251=='\"') ) {s = 345;}

                        else if ( ((LA46_251>='\u0000' && LA46_251<='\t')||(LA46_251>='\u000B' && LA46_251<='!')||(LA46_251>='#' && LA46_251<='[')||(LA46_251>=']' && LA46_251<='\uFFFF')) ) {s = 346;}

                        else if ( (LA46_251=='\\') ) {s = 347;}

                        else if ( (LA46_251=='\n') ) {s = 143;}

                        else s = 114;

                        if ( s>=0 ) return s;
                        break;
                    case 57 : 
                        int LA46_305 = input.LA(1);

                        s = -1;
                        if ( (LA46_305=='\'') ) {s = 304;}

                        else if ( (LA46_305=='\\') ) {s = 189;}

                        else if ( ((LA46_305>='\u0000' && LA46_305<='\t')||(LA46_305>='\u000B' && LA46_305<='&')||(LA46_305>='(' && LA46_305<='[')||(LA46_305>=']' && LA46_305<='\uFFFF')) ) {s = 188;}

                        else if ( (LA46_305=='\n') ) {s = 143;}

                        if ( s>=0 ) return s;
                        break;
                    case 58 : 
                        int LA46_354 = input.LA(1);

                        s = -1;
                        if ( (LA46_354=='\"') ) {s = 442;}

                        else if ( (LA46_354=='x') ) {s = 254;}

                        else if ( (LA46_354=='u') ) {s = 443;}

                        else if ( (LA46_354=='U') ) {s = 255;}

                        else if ( (LA46_354=='\''||LA46_354=='?'||LA46_354=='\\'||(LA46_354>='a' && LA46_354<='b')||LA46_354=='f'||LA46_354=='n'||LA46_354=='r'||LA46_354=='t'||LA46_354=='v') ) {s = 253;}

                        else if ( ((LA46_354>='0' && LA46_354<='7')) ) {s = 257;}

                        else if ( ((LA46_354>='\u0000' && LA46_354<='\t')||(LA46_354>='\u000B' && LA46_354<='!')||(LA46_354>='#' && LA46_354<='&')||(LA46_354>='(' && LA46_354<='/')||(LA46_354>='8' && LA46_354<='>')||(LA46_354>='@' && LA46_354<='T')||(LA46_354>='V' && LA46_354<='[')||(LA46_354>=']' && LA46_354<='`')||(LA46_354>='c' && LA46_354<='e')||(LA46_354>='g' && LA46_354<='m')||(LA46_354>='o' && LA46_354<='q')||LA46_354=='s'||LA46_354=='w'||(LA46_354>='y' && LA46_354<='\uFFFF')) ) {s = 114;}

                        if ( s>=0 ) return s;
                        break;
                    case 59 : 
                        int LA46_666 = input.LA(1);

                        s = -1;
                        if ( (LA46_666=='\"') ) {s = 345;}

                        else if ( (LA46_666=='\\') ) {s = 347;}

                        else if ( ((LA46_666>='\u0000' && LA46_666<='\t')||(LA46_666>='\u000B' && LA46_666<='!')||(LA46_666>='#' && LA46_666<='[')||(LA46_666>=']' && LA46_666<='\uFFFF')) ) {s = 346;}

                        else if ( (LA46_666=='\n') ) {s = 143;}

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