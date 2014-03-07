package org.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCpp2Lexer extends Lexer {
    public static final int RULE_ID=10;
    public static final int RULE_FLOATING_LITERAL=7;
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
    public static final int RULE_NONDIGIT=18;
    public static final int T__99=99;
    public static final int T__98=98;
    public static final int RULE_CHARACTER_LITERAL=6;
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
    public static final int T__75=75;
    public static final int RULE_DIGIT=17;
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
    public static final int RULE_STRING_LITERAL=8;
    public static final int RULE_FRACTIONAL_CONSTANT=29;
    public static final int T__107=107;
    public static final int T__59=59;
    public static final int T__103=103;
    public static final int T__104=104;
    public static final int T__105=105;
    public static final int T__106=106;
    public static final int RULE_INT=5;
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
    public static final int RULE_PREPROCESSING_OP_OR_PUNC=9;
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
    public String getGrammarFileName() { return "../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g"; }

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:11:7: ( 'DUMMY1' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:11:9: 'DUMMY1'
            {
            match("DUMMY1"); 


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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:12:7: ( 'DUMMY2' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:12:9: 'DUMMY2'
            {
            match("DUMMY2"); 


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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:13:7: ( 'DUMMY3' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:13:9: 'DUMMY3'
            {
            match("DUMMY3"); 


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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:14:7: ( 'DUMMY4' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:14:9: 'DUMMY4'
            {
            match("DUMMY4"); 


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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:15:7: ( 'DUMMY5' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:15:9: 'DUMMY5'
            {
            match("DUMMY5"); 


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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:16:7: ( 'DUMMY6' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:16:9: 'DUMMY6'
            {
            match("DUMMY6"); 


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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:17:7: ( 'DUMMY7' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:17:9: 'DUMMY7'
            {
            match("DUMMY7"); 


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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:18:7: ( 'DUMMY8' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:18:9: 'DUMMY8'
            {
            match("DUMMY8"); 


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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:19:7: ( 'DUMMY9' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:19:9: 'DUMMY9'
            {
            match("DUMMY9"); 


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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:20:7: ( 'DUMMY10' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:20:9: 'DUMMY10'
            {
            match("DUMMY10"); 


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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:21:7: ( 'DUMMY11' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:21:9: 'DUMMY11'
            {
            match("DUMMY11"); 


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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:22:7: ( 'DUMMY12' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:22:9: 'DUMMY12'
            {
            match("DUMMY12"); 


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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:23:7: ( 'DUMMY13' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:23:9: 'DUMMY13'
            {
            match("DUMMY13"); 


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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:24:7: ( 'DUMMY14' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:24:9: 'DUMMY14'
            {
            match("DUMMY14"); 


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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:25:7: ( 'true' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:25:9: 'true'
            {
            match("true"); 


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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:26:7: ( 'false' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:26:9: 'false'
            {
            match("false"); 


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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:27:7: ( 'new' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:27:9: 'new'
            {
            match("new"); 


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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:28:7: ( 'delete' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:28:9: 'delete'
            {
            match("delete"); 


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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:29:7: ( '+' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:29:9: '+'
            {
            match('+'); 

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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:30:7: ( '-' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:30:9: '-'
            {
            match('-'); 

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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:31:7: ( '*' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:31:9: '*'
            {
            match('*'); 

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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:32:7: ( '/' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:32:9: '/'
            {
            match('/'); 

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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:33:7: ( '%' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:33:9: '%'
            {
            match('%'); 

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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:34:7: ( '^' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:34:9: '^'
            {
            match('^'); 

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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:35:7: ( '&' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:35:9: '&'
            {
            match('&'); 

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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:36:7: ( '|' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:36:9: '|'
            {
            match('|'); 

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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:37:7: ( '~' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:37:9: '~'
            {
            match('~'); 

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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:38:7: ( '!' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:38:9: '!'
            {
            match('!'); 

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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:39:7: ( '=' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:39:9: '='
            {
            match('='); 

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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:40:7: ( '<' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:40:9: '<'
            {
            match('<'); 

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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:41:7: ( '>' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:41:9: '>'
            {
            match('>'); 

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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:42:7: ( '+=' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:42:9: '+='
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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:43:7: ( '-=' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:43:9: '-='
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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:44:7: ( '*=' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:44:9: '*='
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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:45:7: ( '/=' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:45:9: '/='
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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:46:7: ( '%=' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:46:9: '%='
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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:47:7: ( '^=' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:47:9: '^='
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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:48:7: ( '&=' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:48:9: '&='
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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:49:7: ( '|=' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:49:9: '|='
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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:50:7: ( '<<' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:50:9: '<<'
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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:51:7: ( '>>' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:51:9: '>>'
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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:52:7: ( '>>=' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:52:9: '>>='
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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:53:7: ( '<<=' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:53:9: '<<='
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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:54:7: ( '==' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:54:9: '=='
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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:55:7: ( '!=' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:55:9: '!='
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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:56:7: ( '<=' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:56:9: '<='
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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:57:7: ( '>=' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:57:9: '>='
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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:58:7: ( '&&' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:58:9: '&&'
            {
            match("&&"); 


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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:59:7: ( '||' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:59:9: '||'
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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:60:7: ( '++' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:60:9: '++'
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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:61:7: ( '--' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:61:9: '--'
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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:62:7: ( ',' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:62:9: ','
            {
            match(','); 

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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:63:7: ( '->*' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:63:9: '->*'
            {
            match("->*"); 


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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:64:7: ( '->' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:64:9: '->'
            {
            match("->"); 


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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:65:7: ( '()' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:65:9: '()'
            {
            match("()"); 


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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:66:7: ( '[]' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:66:9: '[]'
            {
            match("[]"); 


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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:67:7: ( '...' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:67:9: '...'
            {
            match("..."); 


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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:68:7: ( 'nullptr' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:68:9: 'nullptr'
            {
            match("nullptr"); 


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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:69:7: ( 'operator' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:69:9: 'operator'
            {
            match("operator"); 


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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:70:7: ( '[' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:70:9: '['
            {
            match('['); 

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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:71:7: ( ']' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:71:9: ']'
            {
            match(']'); 

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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:72:7: ( '\"' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:72:9: '\"'
            {
            match('\"'); 

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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:73:8: ( 'class' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:73:10: 'class'
            {
            match("class"); 


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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:74:8: ( 'typename' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:74:10: 'typename'
            {
            match("typename"); 


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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:75:8: ( 'template' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:75:10: 'template'
            {
            match("template"); 


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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:76:8: ( 'catch' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:76:10: 'catch'
            {
            match("catch"); 


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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:77:8: ( '(' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:77:10: '('
            {
            match('('); 

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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:78:8: ( ')' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:78:10: ')'
            {
            match(')'); 

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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:79:8: ( 'throw' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:79:10: 'throw'
            {
            match("throw"); 


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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:80:8: ( 'noexcept' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:80:10: 'noexcept'
            {
            match("noexcept"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__107"

    // $ANTLR start "RULE_HEX_QUAD"
    public final void mRULE_HEX_QUAD() throws RecognitionException {
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4000:24: ( RULE_HEXADECIMAL_DIGIT RULE_HEXADECIMAL_DIGIT RULE_HEXADECIMAL_DIGIT RULE_HEXADECIMAL_DIGIT )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4000:26: RULE_HEXADECIMAL_DIGIT RULE_HEXADECIMAL_DIGIT RULE_HEXADECIMAL_DIGIT RULE_HEXADECIMAL_DIGIT
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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4002:40: ( ( '\\\\u' RULE_HEX_QUAD | '\\\\U' RULE_HEX_QUAD RULE_HEX_QUAD ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4002:42: ( '\\\\u' RULE_HEX_QUAD | '\\\\U' RULE_HEX_QUAD RULE_HEX_QUAD )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4002:42: ( '\\\\u' RULE_HEX_QUAD | '\\\\U' RULE_HEX_QUAD RULE_HEX_QUAD )
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
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4002:43: '\\\\u' RULE_HEX_QUAD
                    {
                    match("\\u"); 

                    mRULE_HEX_QUAD(); 

                    }
                    break;
                case 2 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4002:63: '\\\\U' RULE_HEX_QUAD RULE_HEX_QUAD
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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4004:18: ( ( '<' ( RULE_H_CHAR )+ '>' | '\"' ( RULE_Q_CHAR )+ '\"' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4004:20: ( '<' ( RULE_H_CHAR )+ '>' | '\"' ( RULE_Q_CHAR )+ '\"' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4004:20: ( '<' ( RULE_H_CHAR )+ '>' | '\"' ( RULE_Q_CHAR )+ '\"' )
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
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4004:21: '<' ( RULE_H_CHAR )+ '>'
                    {
                    match('<'); 
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4004:25: ( RULE_H_CHAR )+
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
                    	    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4004:25: RULE_H_CHAR
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
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4004:42: '\"' ( RULE_Q_CHAR )+ '\"'
                    {
                    match('\"'); 
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4004:46: ( RULE_Q_CHAR )+
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
                    	    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4004:46: RULE_Q_CHAR
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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4006:22: (~ ( ( '\\n' | '>' ) ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4006:24: ~ ( ( '\\n' | '>' ) )
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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4008:22: (~ ( ( '\\n' | '\"' ) ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4008:24: ~ ( ( '\\n' | '\"' ) )
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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4010:12: ( '0' .. '9' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4010:14: '0' .. '9'
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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4012:15: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4012:17: ( 'a' .. 'z' | 'A' .. 'Z' | '_' )
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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4014:14: ( ( 'alignas' | 'alignof' | 'asm' | 'auto' | 'bool' | 'break' | 'case' | 'catch' | 'char' | 'char16_t' | 'char32_t' | 'class' | 'const' | 'constexpr' | 'const_cast' | 'continue' | 'decltype' | 'default' | 'delete' | 'do' | 'double' | 'dynamic_cast' | 'else' | 'enum' | 'explicit' | 'export' | 'extern' | 'false' | 'float' | 'for' | 'friend' | 'goto' | 'if' | 'inline' | 'int' | 'long' | 'mutable' | 'namespace' | 'new' | 'noexcept' | 'nullptr' | 'operator' | 'private' | 'protected' | 'public' | 'register' | 'reinterpret_cast' | 'return' | 'short' | 'signed' | 'sizeof' | 'static' | 'static_assert' | 'static_cast' | 'struct' | 'switch' | 'template' | 'this' | 'thread_local' | 'throw' | 'true' | 'try' | 'typedef' | 'typeid' | 'typename' | 'union' | 'unsigned' | 'using' | 'virtual' | 'void' | 'volatile' | 'wchar_t' | 'while' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4014:16: ( 'alignas' | 'alignof' | 'asm' | 'auto' | 'bool' | 'break' | 'case' | 'catch' | 'char' | 'char16_t' | 'char32_t' | 'class' | 'const' | 'constexpr' | 'const_cast' | 'continue' | 'decltype' | 'default' | 'delete' | 'do' | 'double' | 'dynamic_cast' | 'else' | 'enum' | 'explicit' | 'export' | 'extern' | 'false' | 'float' | 'for' | 'friend' | 'goto' | 'if' | 'inline' | 'int' | 'long' | 'mutable' | 'namespace' | 'new' | 'noexcept' | 'nullptr' | 'operator' | 'private' | 'protected' | 'public' | 'register' | 'reinterpret_cast' | 'return' | 'short' | 'signed' | 'sizeof' | 'static' | 'static_assert' | 'static_cast' | 'struct' | 'switch' | 'template' | 'this' | 'thread_local' | 'throw' | 'true' | 'try' | 'typedef' | 'typeid' | 'typename' | 'union' | 'unsigned' | 'using' | 'virtual' | 'void' | 'volatile' | 'wchar_t' | 'while' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4014:16: ( 'alignas' | 'alignof' | 'asm' | 'auto' | 'bool' | 'break' | 'case' | 'catch' | 'char' | 'char16_t' | 'char32_t' | 'class' | 'const' | 'constexpr' | 'const_cast' | 'continue' | 'decltype' | 'default' | 'delete' | 'do' | 'double' | 'dynamic_cast' | 'else' | 'enum' | 'explicit' | 'export' | 'extern' | 'false' | 'float' | 'for' | 'friend' | 'goto' | 'if' | 'inline' | 'int' | 'long' | 'mutable' | 'namespace' | 'new' | 'noexcept' | 'nullptr' | 'operator' | 'private' | 'protected' | 'public' | 'register' | 'reinterpret_cast' | 'return' | 'short' | 'signed' | 'sizeof' | 'static' | 'static_assert' | 'static_cast' | 'struct' | 'switch' | 'template' | 'this' | 'thread_local' | 'throw' | 'true' | 'try' | 'typedef' | 'typeid' | 'typename' | 'union' | 'unsigned' | 'using' | 'virtual' | 'void' | 'volatile' | 'wchar_t' | 'while' )
            int alt5=73;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4014:17: 'alignas'
                    {
                    match("alignas"); 


                    }
                    break;
                case 2 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4014:27: 'alignof'
                    {
                    match("alignof"); 


                    }
                    break;
                case 3 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4014:37: 'asm'
                    {
                    match("asm"); 


                    }
                    break;
                case 4 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4014:43: 'auto'
                    {
                    match("auto"); 


                    }
                    break;
                case 5 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4014:50: 'bool'
                    {
                    match("bool"); 


                    }
                    break;
                case 6 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4014:57: 'break'
                    {
                    match("break"); 


                    }
                    break;
                case 7 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4014:65: 'case'
                    {
                    match("case"); 


                    }
                    break;
                case 8 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4014:72: 'catch'
                    {
                    match("catch"); 


                    }
                    break;
                case 9 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4014:80: 'char'
                    {
                    match("char"); 


                    }
                    break;
                case 10 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4014:87: 'char16_t'
                    {
                    match("char16_t"); 


                    }
                    break;
                case 11 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4014:98: 'char32_t'
                    {
                    match("char32_t"); 


                    }
                    break;
                case 12 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4014:109: 'class'
                    {
                    match("class"); 


                    }
                    break;
                case 13 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4014:117: 'const'
                    {
                    match("const"); 


                    }
                    break;
                case 14 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4014:125: 'constexpr'
                    {
                    match("constexpr"); 


                    }
                    break;
                case 15 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4014:137: 'const_cast'
                    {
                    match("const_cast"); 


                    }
                    break;
                case 16 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4014:150: 'continue'
                    {
                    match("continue"); 


                    }
                    break;
                case 17 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4014:161: 'decltype'
                    {
                    match("decltype"); 


                    }
                    break;
                case 18 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4014:172: 'default'
                    {
                    match("default"); 


                    }
                    break;
                case 19 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4014:182: 'delete'
                    {
                    match("delete"); 


                    }
                    break;
                case 20 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4014:191: 'do'
                    {
                    match("do"); 


                    }
                    break;
                case 21 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4014:196: 'double'
                    {
                    match("double"); 


                    }
                    break;
                case 22 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4014:205: 'dynamic_cast'
                    {
                    match("dynamic_cast"); 


                    }
                    break;
                case 23 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4014:220: 'else'
                    {
                    match("else"); 


                    }
                    break;
                case 24 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4014:227: 'enum'
                    {
                    match("enum"); 


                    }
                    break;
                case 25 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4014:234: 'explicit'
                    {
                    match("explicit"); 


                    }
                    break;
                case 26 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4014:245: 'export'
                    {
                    match("export"); 


                    }
                    break;
                case 27 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4014:254: 'extern'
                    {
                    match("extern"); 


                    }
                    break;
                case 28 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4014:263: 'false'
                    {
                    match("false"); 


                    }
                    break;
                case 29 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4014:271: 'float'
                    {
                    match("float"); 


                    }
                    break;
                case 30 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4014:279: 'for'
                    {
                    match("for"); 


                    }
                    break;
                case 31 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4014:285: 'friend'
                    {
                    match("friend"); 


                    }
                    break;
                case 32 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4014:294: 'goto'
                    {
                    match("goto"); 


                    }
                    break;
                case 33 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4014:301: 'if'
                    {
                    match("if"); 


                    }
                    break;
                case 34 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4014:306: 'inline'
                    {
                    match("inline"); 


                    }
                    break;
                case 35 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4014:315: 'int'
                    {
                    match("int"); 


                    }
                    break;
                case 36 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4014:321: 'long'
                    {
                    match("long"); 


                    }
                    break;
                case 37 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4014:328: 'mutable'
                    {
                    match("mutable"); 


                    }
                    break;
                case 38 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4014:338: 'namespace'
                    {
                    match("namespace"); 


                    }
                    break;
                case 39 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4014:350: 'new'
                    {
                    match("new"); 


                    }
                    break;
                case 40 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4014:356: 'noexcept'
                    {
                    match("noexcept"); 


                    }
                    break;
                case 41 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4014:367: 'nullptr'
                    {
                    match("nullptr"); 


                    }
                    break;
                case 42 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4014:377: 'operator'
                    {
                    match("operator"); 


                    }
                    break;
                case 43 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4014:388: 'private'
                    {
                    match("private"); 


                    }
                    break;
                case 44 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4014:398: 'protected'
                    {
                    match("protected"); 


                    }
                    break;
                case 45 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4014:410: 'public'
                    {
                    match("public"); 


                    }
                    break;
                case 46 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4014:419: 'register'
                    {
                    match("register"); 


                    }
                    break;
                case 47 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4014:430: 'reinterpret_cast'
                    {
                    match("reinterpret_cast"); 


                    }
                    break;
                case 48 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4014:449: 'return'
                    {
                    match("return"); 


                    }
                    break;
                case 49 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4014:458: 'short'
                    {
                    match("short"); 


                    }
                    break;
                case 50 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4014:466: 'signed'
                    {
                    match("signed"); 


                    }
                    break;
                case 51 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4014:475: 'sizeof'
                    {
                    match("sizeof"); 


                    }
                    break;
                case 52 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4014:484: 'static'
                    {
                    match("static"); 


                    }
                    break;
                case 53 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4014:493: 'static_assert'
                    {
                    match("static_assert"); 


                    }
                    break;
                case 54 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4014:509: 'static_cast'
                    {
                    match("static_cast"); 


                    }
                    break;
                case 55 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4014:523: 'struct'
                    {
                    match("struct"); 


                    }
                    break;
                case 56 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4014:532: 'switch'
                    {
                    match("switch"); 


                    }
                    break;
                case 57 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4014:541: 'template'
                    {
                    match("template"); 


                    }
                    break;
                case 58 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4014:552: 'this'
                    {
                    match("this"); 


                    }
                    break;
                case 59 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4014:559: 'thread_local'
                    {
                    match("thread_local"); 


                    }
                    break;
                case 60 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4014:574: 'throw'
                    {
                    match("throw"); 


                    }
                    break;
                case 61 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4014:582: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 62 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4014:589: 'try'
                    {
                    match("try"); 


                    }
                    break;
                case 63 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4014:595: 'typedef'
                    {
                    match("typedef"); 


                    }
                    break;
                case 64 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4014:605: 'typeid'
                    {
                    match("typeid"); 


                    }
                    break;
                case 65 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4014:614: 'typename'
                    {
                    match("typename"); 


                    }
                    break;
                case 66 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4014:625: 'union'
                    {
                    match("union"); 


                    }
                    break;
                case 67 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4014:633: 'unsigned'
                    {
                    match("unsigned"); 


                    }
                    break;
                case 68 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4014:644: 'using'
                    {
                    match("using"); 


                    }
                    break;
                case 69 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4014:652: 'virtual'
                    {
                    match("virtual"); 


                    }
                    break;
                case 70 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4014:662: 'void'
                    {
                    match("void"); 


                    }
                    break;
                case 71 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4014:669: 'volatile'
                    {
                    match("volatile"); 


                    }
                    break;
                case 72 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4014:680: 'wchar_t'
                    {
                    match("wchar_t"); 


                    }
                    break;
                case 73 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4014:690: 'while'
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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4016:31: ( ( '{' | '}' | '[' | ']' | '#' | '##' | '(' | ')' | '<:' | ':>' | '<%' | '%>' | '%:' | '%:%:' | ';' | ':' | '...' | 'new' | 'delete' | '?' | '::' | '.' | '.*' | '+' | '-' | '*' | '/' | '%' | '^' | '&' | '|' | '~' | '!' | '=' | '<' | '>' | '+=' | '-=' | '*=' | '/=' | '%=' | '^=' | '&=' | '|=' | '<<' | '>>' | '<<=' | '>>=' | '==' | '!=' | '<=' | '>=' | '&&' | '||' | '++' | '--' | ',' | '->*' | '->' | 'and' | 'and_eq' | 'bitand' | 'bitor' | 'compl' | 'not' | 'not_eq' | 'or' | 'or_eq' | 'xor' | 'xor_eq' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4016:33: ( '{' | '}' | '[' | ']' | '#' | '##' | '(' | ')' | '<:' | ':>' | '<%' | '%>' | '%:' | '%:%:' | ';' | ':' | '...' | 'new' | 'delete' | '?' | '::' | '.' | '.*' | '+' | '-' | '*' | '/' | '%' | '^' | '&' | '|' | '~' | '!' | '=' | '<' | '>' | '+=' | '-=' | '*=' | '/=' | '%=' | '^=' | '&=' | '|=' | '<<' | '>>' | '<<=' | '>>=' | '==' | '!=' | '<=' | '>=' | '&&' | '||' | '++' | '--' | ',' | '->*' | '->' | 'and' | 'and_eq' | 'bitand' | 'bitor' | 'compl' | 'not' | 'not_eq' | 'or' | 'or_eq' | 'xor' | 'xor_eq' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4016:33: ( '{' | '}' | '[' | ']' | '#' | '##' | '(' | ')' | '<:' | ':>' | '<%' | '%>' | '%:' | '%:%:' | ';' | ':' | '...' | 'new' | 'delete' | '?' | '::' | '.' | '.*' | '+' | '-' | '*' | '/' | '%' | '^' | '&' | '|' | '~' | '!' | '=' | '<' | '>' | '+=' | '-=' | '*=' | '/=' | '%=' | '^=' | '&=' | '|=' | '<<' | '>>' | '<<=' | '>>=' | '==' | '!=' | '<=' | '>=' | '&&' | '||' | '++' | '--' | ',' | '->*' | '->' | 'and' | 'and_eq' | 'bitand' | 'bitor' | 'compl' | 'not' | 'not_eq' | 'or' | 'or_eq' | 'xor' | 'xor_eq' )
            int alt6=70;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4016:34: '{'
                    {
                    match('{'); 

                    }
                    break;
                case 2 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4016:38: '}'
                    {
                    match('}'); 

                    }
                    break;
                case 3 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4016:42: '['
                    {
                    match('['); 

                    }
                    break;
                case 4 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4016:46: ']'
                    {
                    match(']'); 

                    }
                    break;
                case 5 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4016:50: '#'
                    {
                    match('#'); 

                    }
                    break;
                case 6 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4016:54: '##'
                    {
                    match("##"); 


                    }
                    break;
                case 7 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4016:59: '('
                    {
                    match('('); 

                    }
                    break;
                case 8 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4016:63: ')'
                    {
                    match(')'); 

                    }
                    break;
                case 9 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4016:67: '<:'
                    {
                    match("<:"); 


                    }
                    break;
                case 10 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4016:72: ':>'
                    {
                    match(":>"); 


                    }
                    break;
                case 11 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4016:77: '<%'
                    {
                    match("<%"); 


                    }
                    break;
                case 12 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4016:82: '%>'
                    {
                    match("%>"); 


                    }
                    break;
                case 13 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4016:87: '%:'
                    {
                    match("%:"); 


                    }
                    break;
                case 14 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4016:92: '%:%:'
                    {
                    match("%:%:"); 


                    }
                    break;
                case 15 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4016:99: ';'
                    {
                    match(';'); 

                    }
                    break;
                case 16 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4016:103: ':'
                    {
                    match(':'); 

                    }
                    break;
                case 17 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4016:107: '...'
                    {
                    match("..."); 


                    }
                    break;
                case 18 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4016:113: 'new'
                    {
                    match("new"); 


                    }
                    break;
                case 19 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4016:119: 'delete'
                    {
                    match("delete"); 


                    }
                    break;
                case 20 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4016:128: '?'
                    {
                    match('?'); 

                    }
                    break;
                case 21 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4016:132: '::'
                    {
                    match("::"); 


                    }
                    break;
                case 22 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4016:137: '.'
                    {
                    match('.'); 

                    }
                    break;
                case 23 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4016:141: '.*'
                    {
                    match(".*"); 


                    }
                    break;
                case 24 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4016:146: '+'
                    {
                    match('+'); 

                    }
                    break;
                case 25 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4016:150: '-'
                    {
                    match('-'); 

                    }
                    break;
                case 26 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4016:154: '*'
                    {
                    match('*'); 

                    }
                    break;
                case 27 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4016:158: '/'
                    {
                    match('/'); 

                    }
                    break;
                case 28 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4016:162: '%'
                    {
                    match('%'); 

                    }
                    break;
                case 29 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4016:166: '^'
                    {
                    match('^'); 

                    }
                    break;
                case 30 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4016:170: '&'
                    {
                    match('&'); 

                    }
                    break;
                case 31 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4016:174: '|'
                    {
                    match('|'); 

                    }
                    break;
                case 32 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4016:178: '~'
                    {
                    match('~'); 

                    }
                    break;
                case 33 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4016:182: '!'
                    {
                    match('!'); 

                    }
                    break;
                case 34 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4016:186: '='
                    {
                    match('='); 

                    }
                    break;
                case 35 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4016:190: '<'
                    {
                    match('<'); 

                    }
                    break;
                case 36 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4016:194: '>'
                    {
                    match('>'); 

                    }
                    break;
                case 37 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4016:198: '+='
                    {
                    match("+="); 


                    }
                    break;
                case 38 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4016:203: '-='
                    {
                    match("-="); 


                    }
                    break;
                case 39 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4016:208: '*='
                    {
                    match("*="); 


                    }
                    break;
                case 40 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4016:213: '/='
                    {
                    match("/="); 


                    }
                    break;
                case 41 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4016:218: '%='
                    {
                    match("%="); 


                    }
                    break;
                case 42 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4016:223: '^='
                    {
                    match("^="); 


                    }
                    break;
                case 43 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4016:228: '&='
                    {
                    match("&="); 


                    }
                    break;
                case 44 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4016:233: '|='
                    {
                    match("|="); 


                    }
                    break;
                case 45 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4016:238: '<<'
                    {
                    match("<<"); 


                    }
                    break;
                case 46 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4016:243: '>>'
                    {
                    match(">>"); 


                    }
                    break;
                case 47 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4016:248: '<<='
                    {
                    match("<<="); 


                    }
                    break;
                case 48 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4016:254: '>>='
                    {
                    match(">>="); 


                    }
                    break;
                case 49 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4016:260: '=='
                    {
                    match("=="); 


                    }
                    break;
                case 50 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4016:265: '!='
                    {
                    match("!="); 


                    }
                    break;
                case 51 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4016:270: '<='
                    {
                    match("<="); 


                    }
                    break;
                case 52 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4016:275: '>='
                    {
                    match(">="); 


                    }
                    break;
                case 53 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4016:280: '&&'
                    {
                    match("&&"); 


                    }
                    break;
                case 54 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4016:285: '||'
                    {
                    match("||"); 


                    }
                    break;
                case 55 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4016:290: '++'
                    {
                    match("++"); 


                    }
                    break;
                case 56 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4016:295: '--'
                    {
                    match("--"); 


                    }
                    break;
                case 57 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4016:300: ','
                    {
                    match(','); 

                    }
                    break;
                case 58 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4016:304: '->*'
                    {
                    match("->*"); 


                    }
                    break;
                case 59 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4016:310: '->'
                    {
                    match("->"); 


                    }
                    break;
                case 60 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4016:315: 'and'
                    {
                    match("and"); 


                    }
                    break;
                case 61 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4016:321: 'and_eq'
                    {
                    match("and_eq"); 


                    }
                    break;
                case 62 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4016:330: 'bitand'
                    {
                    match("bitand"); 


                    }
                    break;
                case 63 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4016:339: 'bitor'
                    {
                    match("bitor"); 


                    }
                    break;
                case 64 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4016:347: 'compl'
                    {
                    match("compl"); 


                    }
                    break;
                case 65 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4016:355: 'not'
                    {
                    match("not"); 


                    }
                    break;
                case 66 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4016:361: 'not_eq'
                    {
                    match("not_eq"); 


                    }
                    break;
                case 67 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4016:370: 'or'
                    {
                    match("or"); 


                    }
                    break;
                case 68 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4016:375: 'or_eq'
                    {
                    match("or_eq"); 


                    }
                    break;
                case 69 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4016:383: 'xor'
                    {
                    match("xor"); 


                    }
                    break;
                case 70 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4016:389: 'xor_eq'
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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4018:10: ( ( RULE_DECIMAL_LITERAL | RULE_OCTAL_LITERAL | RULE_HEXADECIMAL_LITERAL ) ( RULE_INTEGER_SUFFIX )? )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4018:12: ( RULE_DECIMAL_LITERAL | RULE_OCTAL_LITERAL | RULE_HEXADECIMAL_LITERAL ) ( RULE_INTEGER_SUFFIX )?
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4018:12: ( RULE_DECIMAL_LITERAL | RULE_OCTAL_LITERAL | RULE_HEXADECIMAL_LITERAL )
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
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4018:13: RULE_DECIMAL_LITERAL
                    {
                    mRULE_DECIMAL_LITERAL(); 

                    }
                    break;
                case 2 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4018:34: RULE_OCTAL_LITERAL
                    {
                    mRULE_OCTAL_LITERAL(); 

                    }
                    break;
                case 3 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4018:53: RULE_HEXADECIMAL_LITERAL
                    {
                    mRULE_HEXADECIMAL_LITERAL(); 

                    }
                    break;

            }

            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4018:79: ( RULE_INTEGER_SUFFIX )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='L'||LA8_0=='U'||LA8_0=='l'||LA8_0=='u') ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4018:79: RULE_INTEGER_SUFFIX
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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4020:31: ( '1' .. '9' ( RULE_DIGIT )* )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4020:33: '1' .. '9' ( RULE_DIGIT )*
            {
            matchRange('1','9'); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4020:42: ( RULE_DIGIT )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='0' && LA9_0<='9')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4020:42: RULE_DIGIT
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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4022:29: ( '0' ( RULE_OCTAL_DIGIT )* )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4022:31: '0' ( RULE_OCTAL_DIGIT )*
            {
            match('0'); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4022:35: ( RULE_OCTAL_DIGIT )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='0' && LA10_0<='7')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4022:35: RULE_OCTAL_DIGIT
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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4024:35: ( ( '0x' | '0X' ) ( RULE_HEXADECIMAL_DIGIT )+ )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4024:37: ( '0x' | '0X' ) ( RULE_HEXADECIMAL_DIGIT )+
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4024:37: ( '0x' | '0X' )
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
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4024:38: '0x'
                    {
                    match("0x"); 


                    }
                    break;
                case 2 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4024:43: '0X'
                    {
                    match("0X"); 


                    }
                    break;

            }

            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4024:49: ( RULE_HEXADECIMAL_DIGIT )+
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
            	    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4024:49: RULE_HEXADECIMAL_DIGIT
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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4026:27: ( '0' .. '7' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4026:29: '0' .. '7'
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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4028:33: ( ( '0' .. '9' | 'A' .. 'F' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4028:35: ( '0' .. '9' | 'A' .. 'F' )
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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4030:30: ( ( ( 'u' | 'U' ) ( 'l' | 'L' | 'll' | 'LL' )? | ( 'l' | 'L' | 'll' | 'LL' ) ( 'u' | 'U' )? ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4030:32: ( ( 'u' | 'U' ) ( 'l' | 'L' | 'll' | 'LL' )? | ( 'l' | 'L' | 'll' | 'LL' ) ( 'u' | 'U' )? )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4030:32: ( ( 'u' | 'U' ) ( 'l' | 'L' | 'll' | 'LL' )? | ( 'l' | 'L' | 'll' | 'LL' ) ( 'u' | 'U' )? )
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
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4030:33: ( 'u' | 'U' ) ( 'l' | 'L' | 'll' | 'LL' )?
                    {
                    if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4030:43: ( 'l' | 'L' | 'll' | 'LL' )?
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
                            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4030:44: 'l'
                            {
                            match('l'); 

                            }
                            break;
                        case 2 :
                            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4030:48: 'L'
                            {
                            match('L'); 

                            }
                            break;
                        case 3 :
                            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4030:52: 'll'
                            {
                            match("ll"); 


                            }
                            break;
                        case 4 :
                            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4030:57: 'LL'
                            {
                            match("LL"); 


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4030:64: ( 'l' | 'L' | 'll' | 'LL' ) ( 'u' | 'U' )?
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4030:64: ( 'l' | 'L' | 'll' | 'LL' )
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
                            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4030:65: 'l'
                            {
                            match('l'); 

                            }
                            break;
                        case 2 :
                            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4030:69: 'L'
                            {
                            match('L'); 

                            }
                            break;
                        case 3 :
                            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4030:73: 'll'
                            {
                            match("ll"); 


                            }
                            break;
                        case 4 :
                            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4030:78: 'LL'
                            {
                            match("LL"); 


                            }
                            break;

                    }

                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4030:84: ( 'u' | 'U' )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0=='U'||LA15_0=='u') ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:
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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4032:24: ( ( 'u' | 'U' | 'L' )? '\\'' ( RULE_C_CHAR )+ '\\'' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4032:26: ( 'u' | 'U' | 'L' )? '\\'' ( RULE_C_CHAR )+ '\\''
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4032:26: ( 'u' | 'U' | 'L' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0=='L'||LA17_0=='U'||LA17_0=='u') ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:
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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4032:46: ( RULE_C_CHAR )+
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
            	    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4032:46: RULE_C_CHAR
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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4034:22: ( (~ ( ( '\\'' | '\\\\' | '\\n' ) ) | RULE_ESCAPE_SEQUENCE | RULE_UNIVERSAL_CHARACTER_NAME ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4034:24: (~ ( ( '\\'' | '\\\\' | '\\n' ) ) | RULE_ESCAPE_SEQUENCE | RULE_UNIVERSAL_CHARACTER_NAME )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4034:24: (~ ( ( '\\'' | '\\\\' | '\\n' ) ) | RULE_ESCAPE_SEQUENCE | RULE_UNIVERSAL_CHARACTER_NAME )
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
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4034:25: ~ ( ( '\\'' | '\\\\' | '\\n' ) )
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
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4034:45: RULE_ESCAPE_SEQUENCE
                    {
                    mRULE_ESCAPE_SEQUENCE(); 

                    }
                    break;
                case 3 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4034:66: RULE_UNIVERSAL_CHARACTER_NAME
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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4036:31: ( ( RULE_SIMPLE_ESCAPE_SEQUENCE | RULE_OCTAL_ESCAPE_SEQUENCE | RULE_HEXADECIMAL_ESCAPE_SEQUENCE ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4036:33: ( RULE_SIMPLE_ESCAPE_SEQUENCE | RULE_OCTAL_ESCAPE_SEQUENCE | RULE_HEXADECIMAL_ESCAPE_SEQUENCE )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4036:33: ( RULE_SIMPLE_ESCAPE_SEQUENCE | RULE_OCTAL_ESCAPE_SEQUENCE | RULE_HEXADECIMAL_ESCAPE_SEQUENCE )
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
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4036:34: RULE_SIMPLE_ESCAPE_SEQUENCE
                    {
                    mRULE_SIMPLE_ESCAPE_SEQUENCE(); 

                    }
                    break;
                case 2 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4036:62: RULE_OCTAL_ESCAPE_SEQUENCE
                    {
                    mRULE_OCTAL_ESCAPE_SEQUENCE(); 

                    }
                    break;
                case 3 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4036:89: RULE_HEXADECIMAL_ESCAPE_SEQUENCE
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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4038:38: ( '\\\\' ( '\\'' | '\"' | '?' | '\\\\' | 'a' | 'b' | 'f' | 'n' | 'r' | 't' | 'v' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4038:40: '\\\\' ( '\\'' | '\"' | '?' | '\\\\' | 'a' | 'b' | 'f' | 'n' | 'r' | 't' | 'v' )
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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4040:37: ( '\\\\' RULE_OCTAL_DIGIT RULE_OCTAL_DIGIT RULE_OCTAL_DIGIT )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4040:39: '\\\\' RULE_OCTAL_DIGIT RULE_OCTAL_DIGIT RULE_OCTAL_DIGIT
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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4042:43: ( '\\\\x' ( RULE_HEXADECIMAL_DIGIT )+ )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4042:45: '\\\\x' ( RULE_HEXADECIMAL_DIGIT )+
            {
            match("\\x"); 

            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4042:51: ( RULE_HEXADECIMAL_DIGIT )+
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
            	    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4042:51: RULE_HEXADECIMAL_DIGIT
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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4044:23: ( ( RULE_FRACTIONAL_CONSTANT ( RULE_EXPONENT_PART )? | ( RULE_DIGIT )+ RULE_EXPONENT_PART ) ( 'f' | 'l' | 'F' | 'L' )? )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4044:25: ( RULE_FRACTIONAL_CONSTANT ( RULE_EXPONENT_PART )? | ( RULE_DIGIT )+ RULE_EXPONENT_PART ) ( 'f' | 'l' | 'F' | 'L' )?
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4044:25: ( RULE_FRACTIONAL_CONSTANT ( RULE_EXPONENT_PART )? | ( RULE_DIGIT )+ RULE_EXPONENT_PART )
            int alt24=2;
            alt24 = dfa24.predict(input);
            switch (alt24) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4044:26: RULE_FRACTIONAL_CONSTANT ( RULE_EXPONENT_PART )?
                    {
                    mRULE_FRACTIONAL_CONSTANT(); 
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4044:51: ( RULE_EXPONENT_PART )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0=='E'||LA22_0=='e') ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4044:51: RULE_EXPONENT_PART
                            {
                            mRULE_EXPONENT_PART(); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4044:71: ( RULE_DIGIT )+ RULE_EXPONENT_PART
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4044:71: ( RULE_DIGIT )+
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
                    	    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4044:71: RULE_DIGIT
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

            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4044:103: ( 'f' | 'l' | 'F' | 'L' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0=='F'||LA25_0=='L'||LA25_0=='f'||LA25_0=='l') ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:
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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4046:35: ( ( ( RULE_DIGIT )* '.' ( RULE_DIGIT )+ | ( RULE_DIGIT )+ '.' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4046:37: ( ( RULE_DIGIT )* '.' ( RULE_DIGIT )+ | ( RULE_DIGIT )+ '.' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4046:37: ( ( RULE_DIGIT )* '.' ( RULE_DIGIT )+ | ( RULE_DIGIT )+ '.' )
            int alt29=2;
            alt29 = dfa29.predict(input);
            switch (alt29) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4046:38: ( RULE_DIGIT )* '.' ( RULE_DIGIT )+
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4046:38: ( RULE_DIGIT )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( ((LA26_0>='0' && LA26_0<='9')) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4046:38: RULE_DIGIT
                    	    {
                    	    mRULE_DIGIT(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop26;
                        }
                    } while (true);

                    match('.'); 
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4046:54: ( RULE_DIGIT )+
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
                    	    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4046:54: RULE_DIGIT
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
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4046:66: ( RULE_DIGIT )+ '.'
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4046:66: ( RULE_DIGIT )+
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
                    	    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4046:66: RULE_DIGIT
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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4048:29: ( ( 'e' | 'E' ) ( '+' | '-' )? ( RULE_DIGIT )+ )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4048:31: ( 'e' | 'E' ) ( '+' | '-' )? ( RULE_DIGIT )+
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4048:41: ( '+' | '-' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0=='+'||LA30_0=='-') ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:
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

            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4048:52: ( RULE_DIGIT )+
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
            	    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4048:52: RULE_DIGIT
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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4050:21: ( ( RULE_ENC_PREFIX )? '\"' ( RULE_SCHAR )+ '\"' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4050:23: ( RULE_ENC_PREFIX )? '\"' ( RULE_SCHAR )+ '\"'
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4050:23: ( RULE_ENC_PREFIX )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0=='L'||LA32_0=='U'||LA32_0=='u') ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4050:23: RULE_ENC_PREFIX
                    {
                    mRULE_ENC_PREFIX(); 

                    }
                    break;

            }

            match('\"'); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4050:44: ( RULE_SCHAR )+
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
            	    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4050:44: RULE_SCHAR
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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4052:26: ( ( 'u8' | 'u' | 'U' | 'L' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4052:28: ( 'u8' | 'u' | 'U' | 'L' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4052:28: ( 'u8' | 'u' | 'U' | 'L' )
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
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4052:29: 'u8'
                    {
                    match("u8"); 


                    }
                    break;
                case 2 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4052:34: 'u'
                    {
                    match('u'); 

                    }
                    break;
                case 3 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4052:38: 'U'
                    {
                    match('U'); 

                    }
                    break;
                case 4 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4052:42: 'L'
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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4054:21: ( (~ ( ( '\"' | '\\\\' | '\\n' ) ) | RULE_ESCAPE_SEQUENCE | RULE_UNIVERSAL_CHARACTER_NAME ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4054:23: (~ ( ( '\"' | '\\\\' | '\\n' ) ) | RULE_ESCAPE_SEQUENCE | RULE_UNIVERSAL_CHARACTER_NAME )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4054:23: (~ ( ( '\"' | '\\\\' | '\\n' ) ) | RULE_ESCAPE_SEQUENCE | RULE_UNIVERSAL_CHARACTER_NAME )
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
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4054:24: ~ ( ( '\"' | '\\\\' | '\\n' ) )
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
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4054:43: RULE_ESCAPE_SEQUENCE
                    {
                    mRULE_ESCAPE_SEQUENCE(); 

                    }
                    break;
                case 3 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4054:64: RULE_UNIVERSAL_CHARACTER_NAME
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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4056:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4056:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4056:11: ( '^' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0=='^') ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4056:11: '^'
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

            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4056:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( ((LA37_0>='0' && LA37_0<='9')||(LA37_0>='A' && LA37_0<='Z')||LA37_0=='_'||(LA37_0>='a' && LA37_0<='z')) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:
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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4058:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4058:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4058:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4058:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4058:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4058:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4058:66: ~ ( ( '\\\\' | '\"' ) )
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
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4058:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4058:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4058:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4058:137: ~ ( ( '\\\\' | '\\'' ) )
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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4060:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4060:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4060:24: ( options {greedy=false; } : . )*
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
            	    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4060:52: .
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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4062:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4062:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4062:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( ((LA42_0>='\u0000' && LA42_0<='\t')||(LA42_0>='\u000B' && LA42_0<='\f')||(LA42_0>='\u000E' && LA42_0<='\uFFFF')) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4062:24: ~ ( ( '\\n' | '\\r' ) )
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

            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4062:40: ( ( '\\r' )? '\\n' )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0=='\n'||LA44_0=='\r') ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4062:41: ( '\\r' )? '\\n'
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4062:41: ( '\\r' )?
                    int alt43=2;
                    int LA43_0 = input.LA(1);

                    if ( (LA43_0=='\r') ) {
                        alt43=1;
                    }
                    switch (alt43) {
                        case 1 :
                            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4062:41: '\\r'
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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4064:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4064:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4064:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            	    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:
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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4066:16: ( . )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4066:18: .
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
        // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1:8: ( T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | RULE_HEADER_NAME | RULE_DIGIT | RULE_NONDIGIT | RULE_KEYWORD | RULE_PREPROCESSING_OP_OR_PUNC | RULE_INT | RULE_CHARACTER_LITERAL | RULE_FLOATING_LITERAL | RULE_STRING_LITERAL | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt46=85;
        alt46 = dfa46.predict(input);
        switch (alt46) {
            case 1 :
                // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1:10: T__38
                {
                mT__38(); 

                }
                break;
            case 2 :
                // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1:16: T__39
                {
                mT__39(); 

                }
                break;
            case 3 :
                // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1:22: T__40
                {
                mT__40(); 

                }
                break;
            case 4 :
                // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1:28: T__41
                {
                mT__41(); 

                }
                break;
            case 5 :
                // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1:34: T__42
                {
                mT__42(); 

                }
                break;
            case 6 :
                // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1:40: T__43
                {
                mT__43(); 

                }
                break;
            case 7 :
                // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1:46: T__44
                {
                mT__44(); 

                }
                break;
            case 8 :
                // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1:52: T__45
                {
                mT__45(); 

                }
                break;
            case 9 :
                // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1:58: T__46
                {
                mT__46(); 

                }
                break;
            case 10 :
                // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1:64: T__47
                {
                mT__47(); 

                }
                break;
            case 11 :
                // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1:70: T__48
                {
                mT__48(); 

                }
                break;
            case 12 :
                // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1:76: T__49
                {
                mT__49(); 

                }
                break;
            case 13 :
                // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1:82: T__50
                {
                mT__50(); 

                }
                break;
            case 14 :
                // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1:88: T__51
                {
                mT__51(); 

                }
                break;
            case 15 :
                // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1:94: T__52
                {
                mT__52(); 

                }
                break;
            case 16 :
                // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1:100: T__53
                {
                mT__53(); 

                }
                break;
            case 17 :
                // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1:106: T__54
                {
                mT__54(); 

                }
                break;
            case 18 :
                // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1:112: T__55
                {
                mT__55(); 

                }
                break;
            case 19 :
                // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1:118: T__56
                {
                mT__56(); 

                }
                break;
            case 20 :
                // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1:124: T__57
                {
                mT__57(); 

                }
                break;
            case 21 :
                // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1:130: T__58
                {
                mT__58(); 

                }
                break;
            case 22 :
                // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1:136: T__59
                {
                mT__59(); 

                }
                break;
            case 23 :
                // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1:142: T__60
                {
                mT__60(); 

                }
                break;
            case 24 :
                // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1:148: T__61
                {
                mT__61(); 

                }
                break;
            case 25 :
                // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1:154: T__62
                {
                mT__62(); 

                }
                break;
            case 26 :
                // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1:160: T__63
                {
                mT__63(); 

                }
                break;
            case 27 :
                // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1:166: T__64
                {
                mT__64(); 

                }
                break;
            case 28 :
                // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1:172: T__65
                {
                mT__65(); 

                }
                break;
            case 29 :
                // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1:178: T__66
                {
                mT__66(); 

                }
                break;
            case 30 :
                // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1:184: T__67
                {
                mT__67(); 

                }
                break;
            case 31 :
                // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1:190: T__68
                {
                mT__68(); 

                }
                break;
            case 32 :
                // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1:196: T__69
                {
                mT__69(); 

                }
                break;
            case 33 :
                // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1:202: T__70
                {
                mT__70(); 

                }
                break;
            case 34 :
                // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1:208: T__71
                {
                mT__71(); 

                }
                break;
            case 35 :
                // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1:214: T__72
                {
                mT__72(); 

                }
                break;
            case 36 :
                // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1:220: T__73
                {
                mT__73(); 

                }
                break;
            case 37 :
                // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1:226: T__74
                {
                mT__74(); 

                }
                break;
            case 38 :
                // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1:232: T__75
                {
                mT__75(); 

                }
                break;
            case 39 :
                // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1:238: T__76
                {
                mT__76(); 

                }
                break;
            case 40 :
                // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1:244: T__77
                {
                mT__77(); 

                }
                break;
            case 41 :
                // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1:250: T__78
                {
                mT__78(); 

                }
                break;
            case 42 :
                // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1:256: T__79
                {
                mT__79(); 

                }
                break;
            case 43 :
                // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1:262: T__80
                {
                mT__80(); 

                }
                break;
            case 44 :
                // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1:268: T__81
                {
                mT__81(); 

                }
                break;
            case 45 :
                // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1:274: T__82
                {
                mT__82(); 

                }
                break;
            case 46 :
                // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1:280: T__83
                {
                mT__83(); 

                }
                break;
            case 47 :
                // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1:286: T__84
                {
                mT__84(); 

                }
                break;
            case 48 :
                // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1:292: T__85
                {
                mT__85(); 

                }
                break;
            case 49 :
                // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1:298: T__86
                {
                mT__86(); 

                }
                break;
            case 50 :
                // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1:304: T__87
                {
                mT__87(); 

                }
                break;
            case 51 :
                // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1:310: T__88
                {
                mT__88(); 

                }
                break;
            case 52 :
                // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1:316: T__89
                {
                mT__89(); 

                }
                break;
            case 53 :
                // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1:322: T__90
                {
                mT__90(); 

                }
                break;
            case 54 :
                // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1:328: T__91
                {
                mT__91(); 

                }
                break;
            case 55 :
                // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1:334: T__92
                {
                mT__92(); 

                }
                break;
            case 56 :
                // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1:340: T__93
                {
                mT__93(); 

                }
                break;
            case 57 :
                // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1:346: T__94
                {
                mT__94(); 

                }
                break;
            case 58 :
                // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1:352: T__95
                {
                mT__95(); 

                }
                break;
            case 59 :
                // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1:358: T__96
                {
                mT__96(); 

                }
                break;
            case 60 :
                // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1:364: T__97
                {
                mT__97(); 

                }
                break;
            case 61 :
                // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1:370: T__98
                {
                mT__98(); 

                }
                break;
            case 62 :
                // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1:376: T__99
                {
                mT__99(); 

                }
                break;
            case 63 :
                // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1:382: T__100
                {
                mT__100(); 

                }
                break;
            case 64 :
                // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1:389: T__101
                {
                mT__101(); 

                }
                break;
            case 65 :
                // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1:396: T__102
                {
                mT__102(); 

                }
                break;
            case 66 :
                // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1:403: T__103
                {
                mT__103(); 

                }
                break;
            case 67 :
                // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1:410: T__104
                {
                mT__104(); 

                }
                break;
            case 68 :
                // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1:417: T__105
                {
                mT__105(); 

                }
                break;
            case 69 :
                // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1:424: T__106
                {
                mT__106(); 

                }
                break;
            case 70 :
                // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1:431: T__107
                {
                mT__107(); 

                }
                break;
            case 71 :
                // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1:438: RULE_HEADER_NAME
                {
                mRULE_HEADER_NAME(); 

                }
                break;
            case 72 :
                // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1:455: RULE_DIGIT
                {
                mRULE_DIGIT(); 

                }
                break;
            case 73 :
                // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1:466: RULE_NONDIGIT
                {
                mRULE_NONDIGIT(); 

                }
                break;
            case 74 :
                // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1:480: RULE_KEYWORD
                {
                mRULE_KEYWORD(); 

                }
                break;
            case 75 :
                // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1:493: RULE_PREPROCESSING_OP_OR_PUNC
                {
                mRULE_PREPROCESSING_OP_OR_PUNC(); 

                }
                break;
            case 76 :
                // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1:523: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 77 :
                // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1:532: RULE_CHARACTER_LITERAL
                {
                mRULE_CHARACTER_LITERAL(); 

                }
                break;
            case 78 :
                // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1:555: RULE_FLOATING_LITERAL
                {
                mRULE_FLOATING_LITERAL(); 

                }
                break;
            case 79 :
                // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1:577: RULE_STRING_LITERAL
                {
                mRULE_STRING_LITERAL(); 

                }
                break;
            case 80 :
                // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1:597: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 81 :
                // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1:605: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 82 :
                // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1:617: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 83 :
                // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1:633: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 84 :
                // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1:649: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 85 :
                // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1:657: RULE_ANY_OTHER
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
            return "4014:16: ( 'alignas' | 'alignof' | 'asm' | 'auto' | 'bool' | 'break' | 'case' | 'catch' | 'char' | 'char16_t' | 'char32_t' | 'class' | 'const' | 'constexpr' | 'const_cast' | 'continue' | 'decltype' | 'default' | 'delete' | 'do' | 'double' | 'dynamic_cast' | 'else' | 'enum' | 'explicit' | 'export' | 'extern' | 'false' | 'float' | 'for' | 'friend' | 'goto' | 'if' | 'inline' | 'int' | 'long' | 'mutable' | 'namespace' | 'new' | 'noexcept' | 'nullptr' | 'operator' | 'private' | 'protected' | 'public' | 'register' | 'reinterpret_cast' | 'return' | 'short' | 'signed' | 'sizeof' | 'static' | 'static_assert' | 'static_cast' | 'struct' | 'switch' | 'template' | 'this' | 'thread_local' | 'throw' | 'true' | 'try' | 'typedef' | 'typeid' | 'typename' | 'union' | 'unsigned' | 'using' | 'virtual' | 'void' | 'volatile' | 'wchar_t' | 'while' )";
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
            return "4016:33: ( '{' | '}' | '[' | ']' | '#' | '##' | '(' | ')' | '<:' | ':>' | '<%' | '%>' | '%:' | '%:%:' | ';' | ':' | '...' | 'new' | 'delete' | '?' | '::' | '.' | '.*' | '+' | '-' | '*' | '/' | '%' | '^' | '&' | '|' | '~' | '!' | '=' | '<' | '>' | '+=' | '-=' | '*=' | '/=' | '%=' | '^=' | '&=' | '|=' | '<<' | '>>' | '<<=' | '>>=' | '==' | '!=' | '<=' | '>=' | '&&' | '||' | '++' | '--' | ',' | '->*' | '->' | 'and' | 'and_eq' | 'bitand' | 'bitor' | 'compl' | 'not' | 'not_eq' | 'or' | 'or_eq' | 'xor' | 'xor_eq' )";
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
            return "4044:25: ( RULE_FRACTIONAL_CONSTANT ( RULE_EXPONENT_PART )? | ( RULE_DIGIT )+ RULE_EXPONENT_PART )";
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
            return "4046:37: ( ( RULE_DIGIT )* '.' ( RULE_DIGIT )+ | ( RULE_DIGIT )+ '.' )";
        }
    }
    static final String DFA46_eotS =
        "\1\uffff\5\71\1\114\1\120\1\122\1\126\1\131\1\133\1\136\1\141\1"+
        "\uffff\1\144\1\146\1\154\1\157\1\uffff\1\162\1\164\1\130\1\71\1"+
        "\uffff\1\175\1\71\1\uffff\1\u0084\16\71\6\uffff\1\71\1\u0084\1\71"+
        "\1\67\1\71\2\uffff\1\72\2\uffff\15\72\1\u00be\1\72\5\uffff\1\u00c5"+
        "\27\uffff\1\u00d1\1\u00d2\2\130\2\uffff\1\u00d4\11\uffff\1\72\1"+
        "\130\5\uffff\4\72\1\uffff\1\u0085\2\uffff\13\72\1\u00be\15\72\2"+
        "\uffff\5\72\1\u0085\3\uffff\2\72\1\u00be\6\72\1\u00be\1\72\1\u0119"+
        "\2\72\1\130\5\72\1\uffff\1\72\20\uffff\1\u0124\6\uffff\2\72\1\uffff"+
        "\1\153\6\uffff\7\72\1\u00be\1\72\1\130\11\72\1\u00be\26\72\1\130"+
        "\3\uffff\1\72\1\u0164\4\72\1\u00be\3\72\1\uffff\11\72\4\uffff\2"+
        "\72\15\uffff\2\72\2\u00be\4\72\1\u00be\1\72\1\u00be\3\72\2\u00be"+
        "\3\72\1\u00be\1\72\1\u00be\21\72\1\u00be\4\72\1\uffff\1\72\1\uffff"+
        "\4\72\1\u01b6\1\72\1\u01b8\1\u00be\13\72\1\130\4\uffff\1\153\2\uffff"+
        "\1\153\2\uffff\1\u01c8\1\u01c9\2\72\1\u00be\1\72\1\130\2\72\1\u00be"+
        "\1\72\1\130\13\72\1\u00be\5\72\1\u00be\1\72\1\u00be\3\72\1\u00be"+
        "\1\72\1\uffff\1\u01ee\1\u01ef\1\u01f0\1\u01f1\1\u01f2\1\u01f3\1"+
        "\u01f4\1\u01f5\1\u01f6\2\72\1\u00be\1\72\1\uffff\1\72\1\uffff\1"+
        "\u00be\2\72\1\130\1\72\1\u01fe\2\72\1\u00be\2\72\6\uffff\7\72\2"+
        "\130\1\72\3\u00be\3\72\1\u00be\2\72\6\u00be\4\72\1\130\1\uffff\1"+
        "\u021a\1\u021b\1\u021c\1\u021d\1\u021e\11\uffff\1\72\1\u00be\2\72"+
        "\1\u0222\2\72\1\uffff\1\72\1\u00be\2\72\4\uffff\5\72\2\u00be\1\72"+
        "\2\u00be\5\72\1\u00be\1\72\1\u00be\6\uffff\1\u0238\1\u0239\1\72"+
        "\1\uffff\1\u023b\1\72\1\u00be\1\72\1\u023e\3\uffff\2\u00be\2\72"+
        "\2\u00be\1\72\1\u00be\3\72\2\u00be\2\uffff\1\72\1\uffff\1\u00be"+
        "\1\72\4\uffff\1\u00be\1\72\1\u00be\5\72\1\uffff\1\u00be\5\72\1\uffff"+
        "\2\72\3\u00be\3\72\1\u00be\2\72\1\u00be";
    static final String DFA46_eofS =
        "\u025e\uffff";
    static final String DFA46_minS =
        "\1\0\5\60\1\53\1\55\1\75\1\52\1\72\1\75\1\46\1\75\1\uffff\2\75"+
        "\1\0\1\75\1\uffff\1\51\1\135\1\56\1\60\1\uffff\1\0\1\60\1\uffff"+
        "\1\56\12\60\1\42\3\60\6\uffff\1\42\1\56\1\60\1\0\1\42\2\uffff\1"+
        "\115\2\uffff\1\165\1\160\1\155\1\151\1\154\1\157\1\162\1\151\1\167"+
        "\1\154\1\145\1\155\1\143\1\60\1\156\5\uffff\1\52\27\uffff\4\0\2"+
        "\uffff\1\75\7\uffff\1\56\1\uffff\1\145\1\60\1\uffff\2\0\2\uffff"+
        "\1\141\1\163\1\141\1\155\1\uffff\1\56\2\uffff\1\151\1\155\1\164"+
        "\1\144\1\157\1\145\1\164\1\163\1\165\1\160\1\164\1\60\1\154\1\156"+
        "\1\164\1\151\1\142\1\147\1\157\1\147\1\141\3\151\1\42\2\uffff\1"+
        "\162\1\151\1\150\1\151\1\162\1\56\1\0\1\42\1\uffff\1\115\1\145\1"+
        "\60\1\145\1\160\1\145\2\163\1\141\1\60\1\145\1\60\1\154\1\170\1"+
        "\60\2\145\1\154\1\141\1\142\1\uffff\1\141\20\uffff\1\0\6\uffff\1"+
        "\162\1\145\1\uffff\7\0\1\163\1\143\1\145\1\162\1\163\1\160\1\147"+
        "\1\60\1\157\1\60\1\154\2\141\1\145\1\155\1\154\1\145\1\157\1\151"+
        "\1\60\1\147\1\141\1\166\1\164\1\154\1\151\1\156\1\165\1\162\1\156"+
        "\1\145\1\164\1\165\1\164\1\157\1\151\1\156\1\164\1\144\2\141\1\154"+
        "\1\60\1\uffff\2\0\1\131\1\60\1\144\1\154\1\167\1\141\1\60\1\145"+
        "\1\164\1\156\1\uffff\1\160\1\143\1\145\1\163\2\164\1\165\1\154\1"+
        "\155\4\uffff\1\141\1\161\1\uffff\1\0\1\42\1\0\1\uffff\4\0\1\uffff"+
        "\3\0\1\163\1\150\2\60\1\164\1\151\1\154\1\156\1\60\1\145\1\60\1"+
        "\153\1\156\1\162\2\60\1\151\2\162\1\60\1\156\1\60\1\142\1\141\1"+
        "\145\1\151\1\163\1\164\1\162\1\164\1\145\1\157\1\151\2\143\1\156"+
        "\2\147\1\165\1\60\1\164\1\162\2\145\1\0\1\61\1\uffff\1\141\1\145"+
        "\1\144\1\141\1\60\1\144\2\60\1\144\1\164\1\145\1\161\1\160\1\145"+
        "\1\171\1\154\1\145\1\151\1\164\1\60\12\0\2\60\1\66\1\62\1\60\1\156"+
        "\1\60\1\141\1\161\1\60\1\144\1\60\1\143\1\164\1\156\1\145\1\154"+
        "\1\164\2\143\1\164\1\145\1\156\1\60\1\144\1\146\1\143\1\164\1\150"+
        "\1\60\1\156\1\60\1\141\1\151\1\137\1\60\1\161\1\0\11\60\1\155\1"+
        "\146\1\60\1\164\1\uffff\1\137\1\uffff\1\60\1\162\1\160\1\60\1\141"+
        "\1\60\1\160\1\164\1\60\1\143\1\157\4\0\2\uffff\2\137\1\170\1\143"+
        "\1\165\1\163\1\146\2\60\1\151\3\60\2\145\1\164\1\60\1\145\1\162"+
        "\6\60\1\145\2\154\1\164\1\60\1\0\5\60\11\uffff\1\145\1\60\1\145"+
        "\1\154\1\60\1\164\1\143\1\uffff\1\145\1\60\1\137\1\162\4\0\2\164"+
        "\1\160\1\141\1\145\2\60\1\164\2\60\1\145\1\162\1\160\1\141\1\144"+
        "\1\60\1\145\1\60\1\0\5\uffff\2\60\1\157\1\uffff\1\60\1\145\1\60"+
        "\1\143\1\60\3\0\2\60\1\162\1\163\2\60\1\144\1\60\1\162\1\163\1\141"+
        "\2\60\2\uffff\1\143\1\uffff\1\60\1\141\1\uffff\3\0\1\60\1\164\1"+
        "\60\1\145\2\163\1\141\1\163\1\0\1\60\1\164\1\145\1\164\1\154\1\164"+
        "\1\0\1\137\1\162\3\60\1\143\1\164\1\141\1\60\1\163\1\164\1\60";
    static final String DFA46_maxS =
        "\1\uffff\5\172\1\75\1\76\2\75\1\76\1\172\1\75\1\174\1\uffff\2\75"+
        "\1\uffff\1\76\1\uffff\1\51\1\135\1\71\1\172\1\uffff\1\uffff\1\172"+
        "\1\uffff\1\165\16\172\6\uffff\1\172\1\170\1\172\1\uffff\1\172\2"+
        "\uffff\1\115\2\uffff\1\171\1\160\1\155\1\162\1\154\1\157\1\162\1"+
        "\151\1\167\1\154\1\164\1\155\1\154\1\172\1\156\5\uffff\1\52\27\uffff"+
        "\4\uffff\2\uffff\1\75\7\uffff\1\56\1\uffff\1\145\1\172\1\uffff\2"+
        "\uffff\2\uffff\1\141\1\164\1\141\1\156\1\uffff\1\145\2\uffff\1\151"+
        "\1\155\1\164\1\144\1\157\1\145\1\164\1\163\1\165\2\164\1\172\1\164"+
        "\1\156\1\164\1\157\1\142\1\164\1\157\1\172\1\162\1\151\1\163\1\151"+
        "\1\42\2\uffff\1\162\1\154\1\150\1\151\1\162\1\145\1\uffff\1\170"+
        "\1\uffff\1\115\1\145\1\172\1\145\1\160\1\157\2\163\1\141\1\172\1"+
        "\145\1\172\1\154\1\170\1\172\2\145\1\154\1\141\1\142\1\uffff\1\141"+
        "\20\uffff\1\uffff\6\uffff\1\162\1\145\1\uffff\7\uffff\1\163\1\143"+
        "\1\145\1\162\1\164\1\160\1\147\1\172\1\157\1\172\1\154\1\141\1\157"+
        "\1\145\1\155\1\157\1\145\1\157\1\151\1\172\1\147\1\141\1\166\1\164"+
        "\1\154\1\151\1\156\1\165\1\162\1\156\1\145\1\164\1\165\1\164\1\157"+
        "\1\151\1\156\1\164\1\144\2\141\1\154\1\172\1\uffff\2\uffff\1\131"+
        "\1\172\1\156\1\154\1\167\1\141\1\172\1\145\1\164\1\156\1\uffff\1"+
        "\160\1\143\1\145\1\163\2\164\1\165\1\154\1\155\4\uffff\1\141\1\161"+
        "\1\uffff\1\uffff\1\170\1\uffff\1\uffff\4\uffff\1\uffff\3\uffff\1"+
        "\163\1\150\2\172\1\164\1\151\1\154\1\156\1\172\1\145\1\172\1\153"+
        "\1\156\1\162\2\172\1\151\2\162\1\172\1\156\1\172\1\142\1\141\1\145"+
        "\1\151\1\163\1\164\1\162\1\164\1\145\1\157\1\151\2\143\1\156\2\147"+
        "\1\165\1\172\1\164\1\162\2\145\1\uffff\1\71\1\uffff\1\141\1\145"+
        "\1\144\1\141\1\172\1\144\2\172\1\144\1\164\1\145\1\161\1\160\1\145"+
        "\1\171\1\154\1\145\1\151\1\164\1\172\12\uffff\2\172\1\66\1\62\1"+
        "\172\1\156\1\172\1\157\1\161\1\172\1\144\1\172\1\143\1\164\1\156"+
        "\1\145\1\154\1\164\2\143\1\164\1\145\1\156\1\172\1\144\1\146\1\143"+
        "\1\164\1\150\1\172\1\156\1\172\1\141\1\151\1\137\1\172\1\161\1\uffff"+
        "\11\172\1\155\1\146\1\172\1\164\1\uffff\1\137\1\uffff\1\172\1\162"+
        "\1\160\1\172\1\141\1\172\1\160\1\164\1\172\1\143\1\157\4\uffff\2"+
        "\uffff\2\137\1\170\1\143\1\165\1\163\1\146\2\172\1\151\3\172\2\145"+
        "\1\164\1\172\1\145\1\162\6\172\1\145\2\154\1\164\1\172\1\uffff\5"+
        "\172\11\uffff\1\145\1\172\1\145\1\154\1\172\1\164\1\143\1\uffff"+
        "\1\145\1\172\1\137\1\162\4\uffff\2\164\1\160\1\141\1\145\2\172\1"+
        "\164\2\172\1\145\1\162\1\160\1\143\1\144\1\172\1\145\1\172\1\uffff"+
        "\5\uffff\2\172\1\157\1\uffff\1\172\1\145\1\172\1\143\1\172\3\uffff"+
        "\2\172\1\162\1\163\2\172\1\144\1\172\1\162\1\163\1\141\2\172\2\uffff"+
        "\1\143\1\uffff\1\172\1\141\1\uffff\3\uffff\1\172\1\164\1\172\1\145"+
        "\2\163\1\141\1\163\1\uffff\1\172\1\164\1\145\1\164\1\154\1\164\1"+
        "\uffff\1\137\1\162\3\172\1\143\1\164\1\141\1\172\1\163\1\164\1\172";
    static final String DFA46_acceptS =
        "\16\uffff\1\33\4\uffff\1\64\4\uffff\1\75\2\uffff\1\104\17\uffff"+
        "\6\113\5\uffff\1\124\1\125\1\uffff\1\111\1\120\17\uffff\1\40\1\62"+
        "\1\23\1\41\1\63\1\uffff\1\24\1\42\1\25\1\43\1\122\1\123\1\26\1\44"+
        "\1\113\1\27\1\45\1\30\1\46\1\60\1\31\1\47\1\61\1\32\1\33\1\55\1"+
        "\34\1\54\1\35\4\uffff\1\107\1\36\1\uffff\1\57\1\37\1\64\1\67\1\103"+
        "\1\70\1\74\1\uffff\1\116\2\uffff\1\75\2\uffff\1\121\1\76\4\uffff"+
        "\1\104\1\uffff\1\110\1\114\31\uffff\1\115\1\117\10\uffff\1\124\24"+
        "\uffff\1\112\1\uffff\1\40\1\62\1\41\1\63\1\65\1\66\1\42\1\43\1\44"+
        "\1\45\1\46\1\60\1\47\1\61\1\55\1\54\1\uffff\1\50\1\56\1\52\1\51"+
        "\1\57\1\71\2\uffff\1\107\62\uffff\1\115\14\uffff\1\21\11\uffff\1"+
        "\65\1\53\1\52\1\71\2\uffff\1\117\3\uffff\1\107\4\uffff\1\107\61"+
        "\uffff\1\17\121\uffff\1\105\1\uffff\1\20\17\uffff\1\77\1\102\44"+
        "\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\7\uffff\1\22\33\uffff"+
        "\1\12\1\13\1\14\1\15\1\16\3\uffff\1\72\25\uffff\1\100\1\101\1\uffff"+
        "\1\106\2\uffff\1\73\37\uffff";
    static final String DFA46_specialS =
        "\1\10\20\uffff\1\56\7\uffff\1\3\32\uffff\1\50\62\uffff\1\43\1\57"+
        "\1\24\1\23\17\uffff\1\5\1\2\53\uffff\1\33\50\uffff\1\72\11\uffff"+
        "\1\51\1\73\1\36\1\12\1\55\1\41\1\32\54\uffff\1\0\1\1\33\uffff\1"+
        "\14\1\uffff\1\11\1\uffff\1\44\1\20\1\21\1\62\1\uffff\1\7\1\35\1"+
        "\42\54\uffff\1\30\26\uffff\1\34\1\71\1\6\1\46\1\4\1\22\1\70\1\53"+
        "\1\13\1\54\45\uffff\1\26\33\uffff\1\17\1\45\1\65\1\61\40\uffff\1"+
        "\25\32\uffff\1\16\1\31\1\27\1\67\22\uffff\1\52\16\uffff\1\15\1\60"+
        "\1\64\24\uffff\1\47\1\66\1\37\10\uffff\1\63\6\uffff\1\40\14\uffff}>";
    static final String[] DFA46_transitionS = {
            "\11\67\2\66\2\67\1\66\22\67\1\66\1\17\1\31\1\55\1\67\1\12\1"+
            "\14\1\64\1\24\1\33\1\10\1\6\1\23\1\7\1\26\1\11\1\62\11\34\1"+
            "\56\1\57\1\21\1\20\1\22\1\60\1\67\3\63\1\1\7\63\1\65\10\63\1"+
            "\61\5\63\1\25\1\67\1\30\1\13\1\63\1\67\1\35\1\36\1\32\1\5\1"+
            "\37\1\3\1\40\1\63\1\41\2\63\1\42\1\43\1\4\1\27\1\44\1\63\1\45"+
            "\1\46\1\2\1\47\1\50\1\51\1\52\2\63\1\53\1\15\1\54\1\16\uff81"+
            "\67",
            "\12\72\7\uffff\24\72\1\70\5\72\4\uffff\1\72\1\uffff\32\72",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\4\72\1\75\2\72\1"+
            "\76\11\72\1\73\6\72\1\74\1\72",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\1\77\12\72\1\100"+
            "\2\72\1\101\2\72\1\102\10\72",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\1\106\3\72\1\103"+
            "\11\72\1\105\5\72\1\104\5\72",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\4\72\1\107\11\72"+
            "\1\110\11\72\1\111\1\72",
            "\1\113\21\uffff\1\112",
            "\1\116\17\uffff\1\115\1\117",
            "\1\121",
            "\1\124\4\uffff\1\125\15\uffff\1\123",
            "\1\130\2\uffff\1\127\1\130",
            "\1\132\3\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\135\26\uffff\1\134",
            "\1\137\76\uffff\1\140",
            "",
            "\1\143",
            "\1\145",
            "\12\153\1\uffff\32\153\1\152\24\153\1\151\1\153\1\147\1\150"+
            "\1\uffff\uffc1\153",
            "\1\156\1\155",
            "",
            "\1\161",
            "\1\163",
            "\1\165\1\uffff\12\166",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\17\72\1\167\1\72"+
            "\1\170\10\72",
            "",
            "\12\172\1\174\27\172\1\174\71\172\1\173\uffa3\172",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\1\177\6\72\1\u0080"+
            "\3\72\1\176\2\72\1\u0081\13\72",
            "",
            "\1\166\1\uffff\12\u0083\13\uffff\1\166\6\uffff\1\u0085\10"+
            "\uffff\1\u0085\17\uffff\1\166\6\uffff\1\u0085\10\uffff\1\u0085",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\13\72\1\u0086\1"+
            "\72\1\u0089\4\72\1\u0087\1\72\1\u0088\5\72",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\10\72\1\u008c\5"+
            "\72\1\u008a\2\72\1\u008b\10\72",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\13\72\1\u008d\1"+
            "\72\1\u008e\11\72\1\u008f\2\72",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\16\72\1\u0090\13"+
            "\72",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\5\72\1\u0091\7\72"+
            "\1\u0092\14\72",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\16\72\1\u0093\13"+
            "\72",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\24\72\1\u0094\5"+
            "\72",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\21\72\1\u0095\2"+
            "\72\1\u0096\5\72",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\4\72\1\u0097\25"+
            "\72",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\7\72\1\u0098\1\u0099"+
            "\12\72\1\u009a\2\72\1\u009b\3\72",
            "\1\u00a0\4\uffff\1\u009f\10\uffff\10\72\1\u009e\1\72\7\uffff"+
            "\32\72\4\uffff\1\72\1\uffff\15\72\1\u009c\4\72\1\u009d\7\72",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\10\72\1\u00a1\5"+
            "\72\1\u00a2\13\72",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\2\72\1\u00a3\4\72"+
            "\1\u00a4\22\72",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\16\72\1\u00a5\13"+
            "\72",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00a0\4\uffff\1\u009f\10\uffff\12\72\7\uffff\32\72\4\uffff"+
            "\1\72\1\uffff\32\72",
            "\1\166\1\uffff\10\u00a6\2\166\13\uffff\1\166\6\uffff\1\u0085"+
            "\10\uffff\1\u0085\2\uffff\1\u0085\14\uffff\1\166\6\uffff\1\u0085"+
            "\10\uffff\1\u0085\2\uffff\1\u0085",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\12\u00a7\1\174\34\u00a7\1\174\64\u00a7\1\u00a8\uffa3\u00a7",
            "\1\u00a0\4\uffff\1\u009f\10\uffff\12\72\7\uffff\32\72\4\uffff"+
            "\1\72\1\uffff\32\72",
            "",
            "",
            "\1\u00aa",
            "",
            "",
            "\1\u00ab\3\uffff\1\u00ac",
            "\1\u00ad",
            "\1\u00ae",
            "\1\u00b0\10\uffff\1\u00af",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7\16\uffff\1\u00b8",
            "\1\u00b9",
            "\1\u00bb\2\uffff\1\u00bc\5\uffff\1\u00ba",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\24\72\1\u00bd\5"+
            "\72",
            "\1\u00bf",
            "",
            "",
            "",
            "",
            "",
            "\1\u00c4",
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
            "",
            "",
            "",
            "\12\153\1\uffff\62\153\1\u00d0\uffc2\153",
            "\12\153\1\uffff\ufff5\153",
            "\12\153\1\uffff\ufff5\153",
            "\12\153\1\uffff\ufff5\153",
            "",
            "",
            "\1\u00d3",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00d6",
            "",
            "\1\u00d7",
            "\12\72\7\uffff\32\72\4\uffff\1\u00d8\1\uffff\32\72",
            "",
            "\12\172\1\174\27\172\1\u00d9\71\172\1\173\uffa3\172",
            "\12\153\1\uffff\27\153\1\u00da\4\153\1\u00e0\10\153\10\u00df"+
            "\7\153\1\u00de\25\153\1\u00dd\6\153\1\u00e0\4\153\1\u00de\1"+
            "\u00e0\3\153\1\u00e0\7\153\1\u00e0\3\153\1\u00e0\1\153\1\u00e0"+
            "\1\u00dc\1\u00de\1\153\1\u00db\uff87\153",
            "",
            "",
            "\1\u00e1",
            "\1\u00e3\1\u00e2",
            "\1\u00e4",
            "\1\u00e6\1\u00e5",
            "",
            "\1\166\1\uffff\12\u0083\13\uffff\1\166\37\uffff\1\166",
            "",
            "",
            "\1\u00e7",
            "\1\u00e8",
            "\1\u00e9",
            "\1\u00ea",
            "\1\u00eb",
            "\1\u00ec",
            "\1\u00ed",
            "\1\u00ee",
            "\1\u00ef",
            "\1\u00f0\3\uffff\1\u00f1",
            "\1\u00f2",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u00f3\7\uffff\1\u00f4",
            "\1\u00f5",
            "\1\u00f6",
            "\1\u00f7\5\uffff\1\u00f8",
            "\1\u00f9",
            "\1\u00fa\1\uffff\1\u00fb\12\uffff\1\u00fc",
            "\1\u00fd",
            "\1\u00fe\22\uffff\1\u00ff",
            "\1\u0100\20\uffff\1\u0101",
            "\1\u0102",
            "\1\u0103\11\uffff\1\u0104",
            "\1\u0105",
            "\1\u00a0",
            "",
            "",
            "\1\u0106",
            "\1\u0107\2\uffff\1\u0108",
            "\1\u0109",
            "\1\u010a",
            "\1\u010b",
            "\1\166\1\uffff\10\u00a6\2\166\13\uffff\1\166\37\uffff\1\166",
            "\12\u00a7\1\174\34\u00a7\1\u010c\64\u00a7\1\u00a8\uffa3\u00a7",
            "\1\u010d\4\uffff\1\u010d\10\uffff\10\u009f\7\uffff\1\u009f"+
            "\25\uffff\1\u009f\6\uffff\1\u010d\4\uffff\1\u009f\1\u010d\3"+
            "\uffff\1\u010d\7\uffff\1\u010d\3\uffff\1\u010d\1\uffff\1\u010d"+
            "\1\u010e\1\u009f\1\uffff\1\u009f",
            "",
            "\1\u010f",
            "\1\u0110",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u0111",
            "\1\u0112",
            "\1\u0114\11\uffff\1\u0113",
            "\1\u0115",
            "\1\u0116",
            "\1\u0117",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u0118",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u011a",
            "\1\u011b",
            "\12\72\7\uffff\32\72\4\uffff\1\u011c\1\uffff\32\72",
            "\1\u011d",
            "\1\u011e",
            "\1\u011f",
            "\1\u0120",
            "\1\u0121",
            "",
            "\1\u0122",
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
            "\12\153\1\uffff\ufff5\153",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0127",
            "\1\u0128",
            "",
            "\12\u012a\1\174\27\u012a\1\u0129\71\u012a\1\u012b\uffa3\u012a",
            "\12\153\1\uffff\45\153\12\u012c\7\153\6\u012c\uffb9\153",
            "\12\u0130\1\174\27\u0130\1\u012d\15\u0130\12\u012e\7\u0130"+
            "\6\u012e\25\u0130\1\u012f\uffa3\u0130",
            "\12\153\1\uffff\45\153\12\u0131\7\153\6\u0131\uffb9\153",
            "\12\u0133\1\uffff\27\u0133\1\u0132\71\u0133\1\u0134\uffa3"+
            "\u0133",
            "\12\153\1\uffff\45\153\10\u0135\uffc8\153",
            "\12\172\1\174\27\172\1\u00d9\71\172\1\173\uffa3\172",
            "\1\u0136",
            "\1\u0137",
            "\1\u0138",
            "\1\u0139",
            "\1\u013a\1\u013b",
            "\1\u013c",
            "\1\u013d",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u013e",
            "\12\72\7\uffff\32\72\4\uffff\1\u013f\1\uffff\32\72",
            "\1\u0140",
            "\1\u0141",
            "\1\u0142\15\uffff\1\u0143",
            "\1\u0144",
            "\1\u0145",
            "\1\u0146\2\uffff\1\u0147",
            "\1\u0148",
            "\1\u0149",
            "\1\u014a",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
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
            "\1\u015d",
            "\1\u015e",
            "\1\u015f",
            "\1\u0160",
            "\12\72\7\uffff\32\72\4\uffff\1\u0161\1\uffff\32\72",
            "",
            "\12\u00a7\1\174\34\u00a7\1\u010c\64\u00a7\1\u00a8\uffa3\u00a7",
            "\60\174\12\u0162\7\174\6\u0162\uffb9\174",
            "\1\u0163",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u0166\4\uffff\1\u0167\4\uffff\1\u0165",
            "\1\u0168",
            "\1\u0169",
            "\1\u016a",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u016b",
            "\1\u016c",
            "\1\u016d",
            "",
            "\1\u016e",
            "\1\u016f",
            "\1\u0170",
            "\1\u0171",
            "\1\u0172",
            "\1\u0173",
            "\1\u0174",
            "\1\u0175",
            "\1\u0176",
            "",
            "",
            "",
            "",
            "\1\u0177",
            "\1\u0178",
            "",
            "\12\u012a\1\174\27\u012a\1\u0129\71\u012a\1\u012b\uffa3\u012a",
            "\1\u0179\4\uffff\1\u0179\10\uffff\10\u00a0\7\uffff\1\u00a0"+
            "\25\uffff\1\u00a0\6\uffff\1\u0179\4\uffff\1\u00a0\1\u0179\3"+
            "\uffff\1\u0179\7\uffff\1\u0179\3\uffff\1\u0179\1\uffff\1\u0179"+
            "\1\u017a\1\u00a0\1\uffff\1\u00a0",
            "\12\u0133\1\uffff\27\u0133\1\u0132\15\u0133\12\u017b\7\u0133"+
            "\6\u017b\25\u0133\1\u0134\uffa3\u0133",
            "",
            "\12\u0130\1\174\27\u0130\1\u012d\15\u0130\12\u017c\7\u0130"+
            "\6\u017c\25\u0130\1\u012f\uffa3\u0130",
            "\12\153\1\uffff\27\153\1\u017d\4\153\1\u017e\64\153\1\u017e"+
            "\5\153\1\u017e\3\153\1\u017e\7\153\1\u017e\3\153\1\u017e\1\153"+
            "\2\u017e\uff8a\153",
            "\12\u0130\1\174\27\u0130\1\u012d\71\u0130\1\u012f\uffa3\u0130",
            "\12\153\1\uffff\45\153\12\u017f\7\153\6\u017f\uffb9\153",
            "",
            "\12\u0133\1\uffff\27\u0133\1\u0132\71\u0133\1\u0134\uffa3"+
            "\u0133",
            "\12\153\1\uffff\27\153\1\u0180\4\153\1\u00de\10\153\10\u00df"+
            "\7\153\1\u00de\25\153\1\u00dd\6\153\1\u00de\4\153\2\u00de\3"+
            "\153\1\u00de\7\153\1\u00de\3\153\1\u00de\1\153\1\u00de\1\u0181"+
            "\1\u00de\1\153\1\u00db\uff87\153",
            "\12\153\1\uffff\45\153\10\u0182\uffc8\153",
            "\1\u0183",
            "\1\u0184",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\72\1\u0185\1\72\1\u0186\6\72\7\uffff\32\72\4\uffff\1\72"+
            "\1\uffff\32\72",
            "\1\u0187",
            "\1\u0188",
            "\1\u0189",
            "\1\u018a",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u018b",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u018c",
            "\1\u018d",
            "\1\u018e",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u018f",
            "\1\u0190",
            "\1\u0191",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u0192",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u0193",
            "\1\u0194",
            "\1\u0195",
            "\1\u0196",
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
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u01a4",
            "\1\u01a5",
            "\1\u01a6",
            "\1\u01a7",
            "\60\174\12\u01a8\7\174\6\u01a8\uffb9\174",
            "\1\u01a9\1\u01aa\1\u01ab\1\u01ac\1\u01ad\1\u01ae\1\u01af\1"+
            "\u01b0\1\u01b1",
            "",
            "\1\u01b2",
            "\1\u01b3",
            "\1\u01b4",
            "\1\u01b5",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u01b7",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u01b9",
            "\1\u01ba",
            "\1\u01bb",
            "\1\u01bc",
            "\1\u01bd",
            "\1\u01be",
            "\1\u01bf",
            "\1\u01c0",
            "\1\u01c1",
            "\1\u01c2",
            "\1\u01c3",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\12\u012a\1\174\27\u012a\1\u0129\71\u012a\1\u012b\uffa3\u012a",
            "\60\174\12\u01c4\7\174\6\u01c4\uffb9\174",
            "\12\u0133\1\uffff\27\u0133\1\u0132\15\u0133\12\u017b\7\u0133"+
            "\6\u017b\25\u0133\1\u0134\uffa3\u0133",
            "\12\u0130\1\174\27\u0130\1\u012d\15\u0130\12\u01c5\7\u0130"+
            "\6\u01c5\25\u0130\1\u012f\uffa3\u0130",
            "\0\174",
            "\12\u0130\1\174\27\u0130\1\u012d\71\u0130\1\u012f\uffa3\u0130",
            "\12\153\1\uffff\45\153\12\u01c6\7\153\6\u01c6\uffb9\153",
            "\12\u00a0\1\uffff\ufff5\u00a0",
            "\12\153\1\uffff\45\153\12\u01c7\7\153\6\u01c7\uffb9\153",
            "\12\u0133\1\uffff\27\u0133\1\u0132\71\u0133\1\u0134\uffa3"+
            "\u0133",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u01ca",
            "\1\u01cb",
            "\12\72\7\uffff\32\72\4\uffff\1\u01cd\1\uffff\4\72\1\u01cc"+
            "\25\72",
            "\1\u01ce",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u01cf\15\uffff\1\u01d0",
            "\1\u01d1",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u01d2",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u01d3",
            "\1\u01d4",
            "\1\u01d5",
            "\1\u01d6",
            "\1\u01d7",
            "\1\u01d8",
            "\1\u01d9",
            "\1\u01da",
            "\1\u01db",
            "\1\u01dc",
            "\1\u01dd",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u01de",
            "\1\u01df",
            "\1\u01e0",
            "\1\u01e1",
            "\1\u01e2",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u01e3",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u01e4",
            "\1\u01e5",
            "\1\u01e6",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u01e7",
            "\60\174\12\u01e8\7\174\6\u01e8\uffb9\174",
            "\1\u01e9\1\u01ea\1\u01eb\1\u01ec\1\u01ed\5\72\7\uffff\32\72"+
            "\4\uffff\1\72\1\uffff\32\72",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u01f7",
            "\1\u01f8",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u01f9",
            "",
            "\1\u01fa",
            "",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u01fb",
            "\1\u01fc",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u01fd",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u01ff",
            "\1\u0200",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u0201",
            "\1\u0202",
            "\60\174\12\u0203\7\174\6\u0203\uffb9\174",
            "\12\u0130\1\174\27\u0130\1\u012d\15\u0130\12\u0204\7\u0130"+
            "\6\u0204\25\u0130\1\u012f\uffa3\u0130",
            "\12\153\1\uffff\45\153\12\u0205\7\153\6\u0205\uffb9\153",
            "\12\153\1\uffff\45\153\12\u0206\7\153\6\u0206\uffb9\153",
            "",
            "",
            "\1\u0207",
            "\1\u0208",
            "\1\u0209",
            "\1\u020a",
            "\1\u020b",
            "\1\u020c",
            "\1\u020d",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u020e",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u020f",
            "\1\u0210",
            "\1\u0211",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u0212",
            "\1\u0213",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\12\72\7\uffff\32\72\4\uffff\1\u0214\1\uffff\32\72",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u0215",
            "\1\u0216",
            "\1\u0217",
            "\1\u0218",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\60\174\12\u0219\7\174\6\u0219\uffb9\174",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u021f",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u0220",
            "\1\u0221",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u0223",
            "\1\u0224",
            "",
            "\1\u0225",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u0226",
            "\1\u0227",
            "\60\174\12\u0228\7\174\6\u0228\uffb9\174",
            "\12\172\1\174\27\172\1\u00d9\71\172\1\173\uffa3\172",
            "\12\153\1\uffff\45\153\12\u0229\7\153\6\u0229\uffb9\153",
            "\12\153\1\uffff\45\153\12\u022a\7\153\6\u022a\uffb9\153",
            "\1\u022b",
            "\1\u022c",
            "\1\u022d",
            "\1\u022e",
            "\1\u022f",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u0230",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u0231",
            "\1\u0232",
            "\1\u0233",
            "\1\u0234\1\uffff\1\u0235",
            "\1\u0236",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u0237",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\12\u00a7\1\174\34\u00a7\1\u010c\64\u00a7\1\u00a8\uffa3\u00a7",
            "",
            "",
            "",
            "",
            "",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u023a",
            "",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u023c",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u023d",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\60\174\12\u023f\7\174\6\u023f\uffb9\174",
            "\12\153\1\uffff\45\153\12\u0240\7\153\6\u0240\uffb9\153",
            "\12\153\1\uffff\45\153\12\u0241\7\153\6\u0241\uffb9\153",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u0242",
            "\1\u0243",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u0244",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u0245",
            "\1\u0246",
            "\1\u0247",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "",
            "",
            "\1\u0248",
            "",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u0249",
            "",
            "\12\u012a\1\174\27\u012a\1\u0129\71\u012a\1\u012b\uffa3\u012a",
            "\12\153\1\uffff\45\153\12\u024a\7\153\6\u024a\uffb9\153",
            "\12\u0133\1\uffff\27\u0133\1\u0132\71\u0133\1\u0134\uffa3"+
            "\u0133",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u024b",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u024c",
            "\1\u024d",
            "\1\u024e",
            "\1\u024f",
            "\1\u0250",
            "\12\153\1\uffff\45\153\12\u0251\7\153\6\u0251\uffb9\153",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u0252",
            "\1\u0253",
            "\1\u0254",
            "\1\u0255",
            "\1\u0256",
            "\12\u0133\1\uffff\27\u0133\1\u0132\71\u0133\1\u0134\uffa3"+
            "\u0133",
            "\1\u0257",
            "\1\u0258",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u0259",
            "\1\u025a",
            "\1\u025b",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72",
            "\1\u025c",
            "\1\u025d",
            "\12\72\7\uffff\32\72\4\uffff\1\72\1\uffff\32\72"
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
            return "1:1: Tokens : ( T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | RULE_HEADER_NAME | RULE_DIGIT | RULE_NONDIGIT | RULE_KEYWORD | RULE_PREPROCESSING_OP_OR_PUNC | RULE_INT | RULE_CHARACTER_LITERAL | RULE_FLOATING_LITERAL | RULE_STRING_LITERAL | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA46_269 = input.LA(1);

                        s = -1;
                        if ( (LA46_269=='\'') ) {s = 268;}

                        else if ( ((LA46_269>='\u0000' && LA46_269<='\t')||(LA46_269>='\u000B' && LA46_269<='&')||(LA46_269>='(' && LA46_269<='[')||(LA46_269>=']' && LA46_269<='\uFFFF')) ) {s = 167;}

                        else if ( (LA46_269=='\\') ) {s = 168;}

                        else if ( (LA46_269=='\n') ) {s = 124;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA46_270 = input.LA(1);

                        s = -1;
                        if ( ((LA46_270>='\u0000' && LA46_270<='/')||(LA46_270>=':' && LA46_270<='@')||(LA46_270>='G' && LA46_270<='\uFFFF')) ) {s = 124;}

                        else if ( ((LA46_270>='0' && LA46_270<='9')||(LA46_270>='A' && LA46_270<='F')) ) {s = 354;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA46_123 = input.LA(1);

                        s = -1;
                        if ( (LA46_123=='\"') ) {s = 218;}

                        else if ( (LA46_123=='x') ) {s = 219;}

                        else if ( (LA46_123=='u') ) {s = 220;}

                        else if ( (LA46_123=='U') ) {s = 221;}

                        else if ( (LA46_123=='?'||LA46_123=='a'||LA46_123=='v') ) {s = 222;}

                        else if ( ((LA46_123>='0' && LA46_123<='7')) ) {s = 223;}

                        else if ( (LA46_123=='\''||LA46_123=='\\'||LA46_123=='b'||LA46_123=='f'||LA46_123=='n'||LA46_123=='r'||LA46_123=='t') ) {s = 224;}

                        else if ( ((LA46_123>='\u0000' && LA46_123<='\t')||(LA46_123>='\u000B' && LA46_123<='!')||(LA46_123>='#' && LA46_123<='&')||(LA46_123>='(' && LA46_123<='/')||(LA46_123>='8' && LA46_123<='>')||(LA46_123>='@' && LA46_123<='T')||(LA46_123>='V' && LA46_123<='[')||(LA46_123>=']' && LA46_123<='`')||(LA46_123>='c' && LA46_123<='e')||(LA46_123>='g' && LA46_123<='m')||(LA46_123>='o' && LA46_123<='q')||LA46_123=='s'||LA46_123=='w'||(LA46_123>='y' && LA46_123<='\uFFFF')) ) {s = 107;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA46_25 = input.LA(1);

                        s = -1;
                        if ( ((LA46_25>='\u0000' && LA46_25<='\t')||(LA46_25>='\u000B' && LA46_25<='!')||(LA46_25>='#' && LA46_25<='[')||(LA46_25>=']' && LA46_25<='\uFFFF')) ) {s = 122;}

                        else if ( (LA46_25=='\\') ) {s = 123;}

                        else if ( (LA46_25=='\n'||LA46_25=='\"') ) {s = 124;}

                        else s = 125;

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA46_381 = input.LA(1);

                        s = -1;
                        if ( ((LA46_381>='\u0000' && LA46_381<='\uFFFF')) ) {s = 124;}

                        else s = 107;

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA46_122 = input.LA(1);

                        s = -1;
                        if ( (LA46_122=='\"') ) {s = 217;}

                        else if ( (LA46_122=='\\') ) {s = 123;}

                        else if ( ((LA46_122>='\u0000' && LA46_122<='\t')||(LA46_122>='\u000B' && LA46_122<='!')||(LA46_122>='#' && LA46_122<='[')||(LA46_122>=']' && LA46_122<='\uFFFF')) ) {s = 122;}

                        else if ( (LA46_122=='\n') ) {s = 124;}

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA46_379 = input.LA(1);

                        s = -1;
                        if ( (LA46_379=='\"') ) {s = 306;}

                        else if ( ((LA46_379>='0' && LA46_379<='9')||(LA46_379>='A' && LA46_379<='F')) ) {s = 379;}

                        else if ( (LA46_379=='\\') ) {s = 308;}

                        else if ( ((LA46_379>='\u0000' && LA46_379<='\t')||(LA46_379>='\u000B' && LA46_379<='!')||(LA46_379>='#' && LA46_379<='/')||(LA46_379>=':' && LA46_379<='@')||(LA46_379>='G' && LA46_379<='[')||(LA46_379>=']' && LA46_379<='\uFFFF')) ) {s = 307;}

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA46_307 = input.LA(1);

                        s = -1;
                        if ( (LA46_307=='\"') ) {s = 306;}

                        else if ( ((LA46_307>='\u0000' && LA46_307<='\t')||(LA46_307>='\u000B' && LA46_307<='!')||(LA46_307>='#' && LA46_307<='[')||(LA46_307>=']' && LA46_307<='\uFFFF')) ) {s = 307;}

                        else if ( (LA46_307=='\\') ) {s = 308;}

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA46_0 = input.LA(1);

                        s = -1;
                        if ( (LA46_0=='D') ) {s = 1;}

                        else if ( (LA46_0=='t') ) {s = 2;}

                        else if ( (LA46_0=='f') ) {s = 3;}

                        else if ( (LA46_0=='n') ) {s = 4;}

                        else if ( (LA46_0=='d') ) {s = 5;}

                        else if ( (LA46_0=='+') ) {s = 6;}

                        else if ( (LA46_0=='-') ) {s = 7;}

                        else if ( (LA46_0=='*') ) {s = 8;}

                        else if ( (LA46_0=='/') ) {s = 9;}

                        else if ( (LA46_0=='%') ) {s = 10;}

                        else if ( (LA46_0=='^') ) {s = 11;}

                        else if ( (LA46_0=='&') ) {s = 12;}

                        else if ( (LA46_0=='|') ) {s = 13;}

                        else if ( (LA46_0=='~') ) {s = 14;}

                        else if ( (LA46_0=='!') ) {s = 15;}

                        else if ( (LA46_0=='=') ) {s = 16;}

                        else if ( (LA46_0=='<') ) {s = 17;}

                        else if ( (LA46_0=='>') ) {s = 18;}

                        else if ( (LA46_0==',') ) {s = 19;}

                        else if ( (LA46_0=='(') ) {s = 20;}

                        else if ( (LA46_0=='[') ) {s = 21;}

                        else if ( (LA46_0=='.') ) {s = 22;}

                        else if ( (LA46_0=='o') ) {s = 23;}

                        else if ( (LA46_0==']') ) {s = 24;}

                        else if ( (LA46_0=='\"') ) {s = 25;}

                        else if ( (LA46_0=='c') ) {s = 26;}

                        else if ( (LA46_0==')') ) {s = 27;}

                        else if ( ((LA46_0>='1' && LA46_0<='9')) ) {s = 28;}

                        else if ( (LA46_0=='a') ) {s = 29;}

                        else if ( (LA46_0=='b') ) {s = 30;}

                        else if ( (LA46_0=='e') ) {s = 31;}

                        else if ( (LA46_0=='g') ) {s = 32;}

                        else if ( (LA46_0=='i') ) {s = 33;}

                        else if ( (LA46_0=='l') ) {s = 34;}

                        else if ( (LA46_0=='m') ) {s = 35;}

                        else if ( (LA46_0=='p') ) {s = 36;}

                        else if ( (LA46_0=='r') ) {s = 37;}

                        else if ( (LA46_0=='s') ) {s = 38;}

                        else if ( (LA46_0=='u') ) {s = 39;}

                        else if ( (LA46_0=='v') ) {s = 40;}

                        else if ( (LA46_0=='w') ) {s = 41;}

                        else if ( (LA46_0=='x') ) {s = 42;}

                        else if ( (LA46_0=='{') ) {s = 43;}

                        else if ( (LA46_0=='}') ) {s = 44;}

                        else if ( (LA46_0=='#') ) {s = 45;}

                        else if ( (LA46_0==':') ) {s = 46;}

                        else if ( (LA46_0==';') ) {s = 47;}

                        else if ( (LA46_0=='?') ) {s = 48;}

                        else if ( (LA46_0=='U') ) {s = 49;}

                        else if ( (LA46_0=='0') ) {s = 50;}

                        else if ( ((LA46_0>='A' && LA46_0<='C')||(LA46_0>='E' && LA46_0<='K')||(LA46_0>='M' && LA46_0<='T')||(LA46_0>='V' && LA46_0<='Z')||LA46_0=='_'||LA46_0=='h'||(LA46_0>='j' && LA46_0<='k')||LA46_0=='q'||(LA46_0>='y' && LA46_0<='z')) ) {s = 51;}

                        else if ( (LA46_0=='\'') ) {s = 52;}

                        else if ( (LA46_0=='L') ) {s = 53;}

                        else if ( ((LA46_0>='\t' && LA46_0<='\n')||LA46_0=='\r'||LA46_0==' ') ) {s = 54;}

                        else if ( ((LA46_0>='\u0000' && LA46_0<='\b')||(LA46_0>='\u000B' && LA46_0<='\f')||(LA46_0>='\u000E' && LA46_0<='\u001F')||LA46_0=='$'||LA46_0=='@'||LA46_0=='\\'||LA46_0=='`'||(LA46_0>='\u007F' && LA46_0<='\uFFFF')) ) {s = 55;}

                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA46_300 = input.LA(1);

                        s = -1;
                        if ( (LA46_300=='\"') ) {s = 306;}

                        else if ( ((LA46_300>='0' && LA46_300<='9')||(LA46_300>='A' && LA46_300<='F')) ) {s = 379;}

                        else if ( (LA46_300=='\\') ) {s = 308;}

                        else if ( ((LA46_300>='\u0000' && LA46_300<='\t')||(LA46_300>='\u000B' && LA46_300<='!')||(LA46_300>='#' && LA46_300<='/')||(LA46_300>=':' && LA46_300<='@')||(LA46_300>='G' && LA46_300<='[')||(LA46_300>=']' && LA46_300<='\uFFFF')) ) {s = 307;}

                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA46_221 = input.LA(1);

                        s = -1;
                        if ( ((LA46_221>='0' && LA46_221<='9')||(LA46_221>='A' && LA46_221<='F')) ) {s = 305;}

                        else if ( ((LA46_221>='\u0000' && LA46_221<='\t')||(LA46_221>='\u000B' && LA46_221<='/')||(LA46_221>=':' && LA46_221<='@')||(LA46_221>='G' && LA46_221<='\uFFFF')) ) {s = 107;}

                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA46_385 = input.LA(1);

                        s = -1;
                        if ( ((LA46_385>='\u0000' && LA46_385<='\t')||(LA46_385>='\u000B' && LA46_385<='/')||(LA46_385>=':' && LA46_385<='@')||(LA46_385>='G' && LA46_385<='\uFFFF')) ) {s = 107;}

                        else if ( ((LA46_385>='0' && LA46_385<='9')||(LA46_385>='A' && LA46_385<='F')) ) {s = 455;}

                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA46_298 = input.LA(1);

                        s = -1;
                        if ( (LA46_298=='\"') ) {s = 297;}

                        else if ( (LA46_298=='\\') ) {s = 299;}

                        else if ( ((LA46_298>='\u0000' && LA46_298<='\t')||(LA46_298>='\u000B' && LA46_298<='!')||(LA46_298>='#' && LA46_298<='[')||(LA46_298>=']' && LA46_298<='\uFFFF')) ) {s = 298;}

                        else if ( (LA46_298=='\n') ) {s = 124;}

                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA46_552 = input.LA(1);

                        s = -1;
                        if ( ((LA46_552>='\u0000' && LA46_552<='/')||(LA46_552>=':' && LA46_552<='@')||(LA46_552>='G' && LA46_552<='\uFFFF')) ) {s = 124;}

                        else if ( ((LA46_552>='0' && LA46_552<='9')||(LA46_552>='A' && LA46_552<='F')) ) {s = 575;}

                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA46_515 = input.LA(1);

                        s = -1;
                        if ( ((LA46_515>='\u0000' && LA46_515<='/')||(LA46_515>=':' && LA46_515<='@')||(LA46_515>='G' && LA46_515<='\uFFFF')) ) {s = 124;}

                        else if ( ((LA46_515>='0' && LA46_515<='9')||(LA46_515>='A' && LA46_515<='F')) ) {s = 552;}

                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA46_452 = input.LA(1);

                        s = -1;
                        if ( ((LA46_452>='\u0000' && LA46_452<='/')||(LA46_452>=':' && LA46_452<='@')||(LA46_452>='G' && LA46_452<='\uFFFF')) ) {s = 124;}

                        else if ( ((LA46_452>='0' && LA46_452<='9')||(LA46_452>='A' && LA46_452<='F')) ) {s = 515;}

                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA46_303 = input.LA(1);

                        s = -1;
                        if ( (LA46_303=='\"') ) {s = 381;}

                        else if ( (LA46_303=='\''||LA46_303=='\\'||LA46_303=='b'||LA46_303=='f'||LA46_303=='n'||LA46_303=='r'||(LA46_303>='t' && LA46_303<='u')) ) {s = 382;}

                        else if ( ((LA46_303>='\u0000' && LA46_303<='\t')||(LA46_303>='\u000B' && LA46_303<='!')||(LA46_303>='#' && LA46_303<='&')||(LA46_303>='(' && LA46_303<='[')||(LA46_303>=']' && LA46_303<='a')||(LA46_303>='c' && LA46_303<='e')||(LA46_303>='g' && LA46_303<='m')||(LA46_303>='o' && LA46_303<='q')||LA46_303=='s'||(LA46_303>='v' && LA46_303<='\uFFFF')) ) {s = 107;}

                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA46_304 = input.LA(1);

                        s = -1;
                        if ( (LA46_304=='\"') ) {s = 301;}

                        else if ( (LA46_304=='\\') ) {s = 303;}

                        else if ( ((LA46_304>='\u0000' && LA46_304<='\t')||(LA46_304>='\u000B' && LA46_304<='!')||(LA46_304>='#' && LA46_304<='[')||(LA46_304>=']' && LA46_304<='\uFFFF')) ) {s = 304;}

                        else if ( (LA46_304=='\n') ) {s = 124;}

                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA46_382 = input.LA(1);

                        s = -1;
                        if ( (LA46_382=='\"') ) {s = 301;}

                        else if ( (LA46_382=='\\') ) {s = 303;}

                        else if ( ((LA46_382>='\u0000' && LA46_382<='\t')||(LA46_382>='\u000B' && LA46_382<='!')||(LA46_382>='#' && LA46_382<='[')||(LA46_382>=']' && LA46_382<='\uFFFF')) ) {s = 304;}

                        else if ( (LA46_382=='\n') ) {s = 124;}

                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA46_106 = input.LA(1);

                        s = -1;
                        if ( ((LA46_106>='\u0000' && LA46_106<='\t')||(LA46_106>='\u000B' && LA46_106<='\uFFFF')) ) {s = 107;}

                        else s = 88;

                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA46_105 = input.LA(1);

                        s = -1;
                        if ( ((LA46_105>='\u0000' && LA46_105<='\t')||(LA46_105>='\u000B' && LA46_105<='\uFFFF')) ) {s = 107;}

                        else s = 88;

                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA46_488 = input.LA(1);

                        s = -1;
                        if ( ((LA46_488>='\u0000' && LA46_488<='/')||(LA46_488>=':' && LA46_488<='@')||(LA46_488>='G' && LA46_488<='\uFFFF')) ) {s = 124;}

                        else if ( ((LA46_488>='0' && LA46_488<='9')||(LA46_488>='A' && LA46_488<='F')) ) {s = 537;}

                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA46_424 = input.LA(1);

                        s = -1;
                        if ( ((LA46_424>='\u0000' && LA46_424<='/')||(LA46_424>=':' && LA46_424<='@')||(LA46_424>='G' && LA46_424<='\uFFFF')) ) {s = 124;}

                        else if ( ((LA46_424>='0' && LA46_424<='9')||(LA46_424>='A' && LA46_424<='F')) ) {s = 488;}

                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA46_517 = input.LA(1);

                        s = -1;
                        if ( ((LA46_517>='0' && LA46_517<='9')||(LA46_517>='A' && LA46_517<='F')) ) {s = 553;}

                        else if ( ((LA46_517>='\u0000' && LA46_517<='\t')||(LA46_517>='\u000B' && LA46_517<='/')||(LA46_517>=':' && LA46_517<='@')||(LA46_517>='G' && LA46_517<='\uFFFF')) ) {s = 107;}

                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA46_354 = input.LA(1);

                        s = -1;
                        if ( ((LA46_354>='\u0000' && LA46_354<='/')||(LA46_354>=':' && LA46_354<='@')||(LA46_354>='G' && LA46_354<='\uFFFF')) ) {s = 124;}

                        else if ( ((LA46_354>='0' && LA46_354<='9')||(LA46_354>='A' && LA46_354<='F')) ) {s = 424;}

                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA46_516 = input.LA(1);

                        s = -1;
                        if ( (LA46_516=='\"') ) {s = 217;}

                        else if ( (LA46_516=='\\') ) {s = 123;}

                        else if ( ((LA46_516>='\u0000' && LA46_516<='\t')||(LA46_516>='\u000B' && LA46_516<='!')||(LA46_516>='#' && LA46_516<='[')||(LA46_516>=']' && LA46_516<='\uFFFF')) ) {s = 122;}

                        else if ( (LA46_516=='\n') ) {s = 124;}

                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA46_224 = input.LA(1);

                        s = -1;
                        if ( (LA46_224=='\"') ) {s = 217;}

                        else if ( ((LA46_224>='\u0000' && LA46_224<='\t')||(LA46_224>='\u000B' && LA46_224<='!')||(LA46_224>='#' && LA46_224<='[')||(LA46_224>=']' && LA46_224<='\uFFFF')) ) {s = 122;}

                        else if ( (LA46_224=='\\') ) {s = 123;}

                        else if ( (LA46_224=='\n') ) {s = 124;}

                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA46_167 = input.LA(1);

                        s = -1;
                        if ( (LA46_167=='\'') ) {s = 268;}

                        else if ( (LA46_167=='\\') ) {s = 168;}

                        else if ( ((LA46_167>='\u0000' && LA46_167<='\t')||(LA46_167>='\u000B' && LA46_167<='&')||(LA46_167>='(' && LA46_167<='[')||(LA46_167>=']' && LA46_167<='\uFFFF')) ) {s = 167;}

                        else if ( (LA46_167=='\n') ) {s = 124;}

                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA46_377 = input.LA(1);

                        s = -1;
                        if ( (LA46_377=='\"') ) {s = 297;}

                        else if ( ((LA46_377>='\u0000' && LA46_377<='\t')||(LA46_377>='\u000B' && LA46_377<='!')||(LA46_377>='#' && LA46_377<='[')||(LA46_377>=']' && LA46_377<='\uFFFF')) ) {s = 298;}

                        else if ( (LA46_377=='\\') ) {s = 299;}

                        else if ( (LA46_377=='\n') ) {s = 124;}

                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA46_308 = input.LA(1);

                        s = -1;
                        if ( (LA46_308=='\"') ) {s = 384;}

                        else if ( (LA46_308=='x') ) {s = 219;}

                        else if ( (LA46_308=='u') ) {s = 385;}

                        else if ( (LA46_308=='U') ) {s = 221;}

                        else if ( ((LA46_308>='0' && LA46_308<='7')) ) {s = 223;}

                        else if ( (LA46_308=='\''||LA46_308=='?'||LA46_308=='\\'||(LA46_308>='a' && LA46_308<='b')||LA46_308=='f'||LA46_308=='n'||LA46_308=='r'||LA46_308=='t'||LA46_308=='v') ) {s = 222;}

                        else if ( ((LA46_308>='\u0000' && LA46_308<='\t')||(LA46_308>='\u000B' && LA46_308<='!')||(LA46_308>='#' && LA46_308<='&')||(LA46_308>='(' && LA46_308<='/')||(LA46_308>='8' && LA46_308<='>')||(LA46_308>='@' && LA46_308<='T')||(LA46_308>='V' && LA46_308<='[')||(LA46_308>=']' && LA46_308<='`')||(LA46_308>='c' && LA46_308<='e')||(LA46_308>='g' && LA46_308<='m')||(LA46_308>='o' && LA46_308<='q')||LA46_308=='s'||LA46_308=='w'||(LA46_308>='y' && LA46_308<='\uFFFF')) ) {s = 107;}

                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA46_220 = input.LA(1);

                        s = -1;
                        if ( (LA46_220=='\"') ) {s = 301;}

                        else if ( ((LA46_220>='0' && LA46_220<='9')||(LA46_220>='A' && LA46_220<='F')) ) {s = 302;}

                        else if ( (LA46_220=='\\') ) {s = 303;}

                        else if ( ((LA46_220>='\u0000' && LA46_220<='\t')||(LA46_220>='\u000B' && LA46_220<='!')||(LA46_220>='#' && LA46_220<='/')||(LA46_220>=':' && LA46_220<='@')||(LA46_220>='G' && LA46_220<='[')||(LA46_220>=']' && LA46_220<='\uFFFF')) ) {s = 304;}

                        else if ( (LA46_220=='\n') ) {s = 124;}

                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA46_577 = input.LA(1);

                        s = -1;
                        if ( (LA46_577=='\"') ) {s = 306;}

                        else if ( ((LA46_577>='\u0000' && LA46_577<='\t')||(LA46_577>='\u000B' && LA46_577<='!')||(LA46_577>='#' && LA46_577<='[')||(LA46_577>=']' && LA46_577<='\uFFFF')) ) {s = 307;}

                        else if ( (LA46_577=='\\') ) {s = 308;}

                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        int LA46_593 = input.LA(1);

                        s = -1;
                        if ( (LA46_593=='\"') ) {s = 306;}

                        else if ( ((LA46_593>='\u0000' && LA46_593<='\t')||(LA46_593>='\u000B' && LA46_593<='!')||(LA46_593>='#' && LA46_593<='[')||(LA46_593>=']' && LA46_593<='\uFFFF')) ) {s = 307;}

                        else if ( (LA46_593=='\\') ) {s = 308;}

                        if ( s>=0 ) return s;
                        break;
                    case 33 : 
                        int LA46_223 = input.LA(1);

                        s = -1;
                        if ( ((LA46_223>='0' && LA46_223<='7')) ) {s = 309;}

                        else if ( ((LA46_223>='\u0000' && LA46_223<='\t')||(LA46_223>='\u000B' && LA46_223<='/')||(LA46_223>='8' && LA46_223<='\uFFFF')) ) {s = 107;}

                        if ( s>=0 ) return s;
                        break;
                    case 34 : 
                        int LA46_309 = input.LA(1);

                        s = -1;
                        if ( ((LA46_309>='0' && LA46_309<='7')) ) {s = 386;}

                        else if ( ((LA46_309>='\u0000' && LA46_309<='\t')||(LA46_309>='\u000B' && LA46_309<='/')||(LA46_309>='8' && LA46_309<='\uFFFF')) ) {s = 107;}

                        if ( s>=0 ) return s;
                        break;
                    case 35 : 
                        int LA46_103 = input.LA(1);

                        s = -1;
                        if ( (LA46_103=='=') ) {s = 208;}

                        else if ( ((LA46_103>='\u0000' && LA46_103<='\t')||(LA46_103>='\u000B' && LA46_103<='<')||(LA46_103>='>' && LA46_103<='\uFFFF')) ) {s = 107;}

                        else s = 209;

                        if ( s>=0 ) return s;
                        break;
                    case 36 : 
                        int LA46_302 = input.LA(1);

                        s = -1;
                        if ( (LA46_302=='\"') ) {s = 301;}

                        else if ( (LA46_302=='\\') ) {s = 303;}

                        else if ( ((LA46_302>='0' && LA46_302<='9')||(LA46_302>='A' && LA46_302<='F')) ) {s = 380;}

                        else if ( (LA46_302=='\n') ) {s = 124;}

                        else if ( ((LA46_302>='\u0000' && LA46_302<='\t')||(LA46_302>='\u000B' && LA46_302<='!')||(LA46_302>='#' && LA46_302<='/')||(LA46_302>=':' && LA46_302<='@')||(LA46_302>='G' && LA46_302<='[')||(LA46_302>=']' && LA46_302<='\uFFFF')) ) {s = 304;}

                        if ( s>=0 ) return s;
                        break;
                    case 37 : 
                        int LA46_453 = input.LA(1);

                        s = -1;
                        if ( (LA46_453=='\"') ) {s = 301;}

                        else if ( (LA46_453=='\\') ) {s = 303;}

                        else if ( ((LA46_453>='0' && LA46_453<='9')||(LA46_453>='A' && LA46_453<='F')) ) {s = 516;}

                        else if ( (LA46_453=='\n') ) {s = 124;}

                        else if ( ((LA46_453>='\u0000' && LA46_453<='\t')||(LA46_453>='\u000B' && LA46_453<='!')||(LA46_453>='#' && LA46_453<='/')||(LA46_453>=':' && LA46_453<='@')||(LA46_453>='G' && LA46_453<='[')||(LA46_453>=']' && LA46_453<='\uFFFF')) ) {s = 304;}

                        if ( s>=0 ) return s;
                        break;
                    case 38 : 
                        int LA46_380 = input.LA(1);

                        s = -1;
                        if ( (LA46_380=='\"') ) {s = 301;}

                        else if ( (LA46_380=='\\') ) {s = 303;}

                        else if ( ((LA46_380>='0' && LA46_380<='9')||(LA46_380>='A' && LA46_380<='F')) ) {s = 453;}

                        else if ( (LA46_380=='\n') ) {s = 124;}

                        else if ( ((LA46_380>='\u0000' && LA46_380<='\t')||(LA46_380>='\u000B' && LA46_380<='!')||(LA46_380>='#' && LA46_380<='/')||(LA46_380>=':' && LA46_380<='@')||(LA46_380>='G' && LA46_380<='[')||(LA46_380>=']' && LA46_380<='\uFFFF')) ) {s = 304;}

                        if ( s>=0 ) return s;
                        break;
                    case 39 : 
                        int LA46_575 = input.LA(1);

                        s = -1;
                        if ( (LA46_575=='\"') ) {s = 297;}

                        else if ( (LA46_575=='\\') ) {s = 299;}

                        else if ( ((LA46_575>='\u0000' && LA46_575<='\t')||(LA46_575>='\u000B' && LA46_575<='!')||(LA46_575>='#' && LA46_575<='[')||(LA46_575>=']' && LA46_575<='\uFFFF')) ) {s = 298;}

                        else if ( (LA46_575=='\n') ) {s = 124;}

                        if ( s>=0 ) return s;
                        break;
                    case 40 : 
                        int LA46_52 = input.LA(1);

                        s = -1;
                        if ( ((LA46_52>='\u0000' && LA46_52<='\t')||(LA46_52>='\u000B' && LA46_52<='&')||(LA46_52>='(' && LA46_52<='[')||(LA46_52>=']' && LA46_52<='\uFFFF')) ) {s = 167;}

                        else if ( (LA46_52=='\\') ) {s = 168;}

                        else if ( (LA46_52=='\n'||LA46_52=='\'') ) {s = 124;}

                        else s = 55;

                        if ( s>=0 ) return s;
                        break;
                    case 41 : 
                        int LA46_218 = input.LA(1);

                        s = -1;
                        if ( (LA46_218=='\"') ) {s = 297;}

                        else if ( ((LA46_218>='\u0000' && LA46_218<='\t')||(LA46_218>='\u000B' && LA46_218<='!')||(LA46_218>='#' && LA46_218<='[')||(LA46_218>=']' && LA46_218<='\uFFFF')) ) {s = 298;}

                        else if ( (LA46_218=='\\') ) {s = 299;}

                        else if ( (LA46_218=='\n') ) {s = 124;}

                        else s = 107;

                        if ( s>=0 ) return s;
                        break;
                    case 42 : 
                        int LA46_537 = input.LA(1);

                        s = -1;
                        if ( (LA46_537=='\'') ) {s = 268;}

                        else if ( ((LA46_537>='\u0000' && LA46_537<='\t')||(LA46_537>='\u000B' && LA46_537<='&')||(LA46_537>='(' && LA46_537<='[')||(LA46_537>=']' && LA46_537<='\uFFFF')) ) {s = 167;}

                        else if ( (LA46_537=='\\') ) {s = 168;}

                        else if ( (LA46_537=='\n') ) {s = 124;}

                        if ( s>=0 ) return s;
                        break;
                    case 43 : 
                        int LA46_384 = input.LA(1);

                        s = -1;
                        if ( ((LA46_384>='\u0000' && LA46_384<='\t')||(LA46_384>='\u000B' && LA46_384<='\uFFFF')) ) {s = 160;}

                        else s = 107;

                        if ( s>=0 ) return s;
                        break;
                    case 44 : 
                        int LA46_386 = input.LA(1);

                        s = -1;
                        if ( (LA46_386=='\"') ) {s = 306;}

                        else if ( ((LA46_386>='\u0000' && LA46_386<='\t')||(LA46_386>='\u000B' && LA46_386<='!')||(LA46_386>='#' && LA46_386<='[')||(LA46_386>=']' && LA46_386<='\uFFFF')) ) {s = 307;}

                        else if ( (LA46_386=='\\') ) {s = 308;}

                        if ( s>=0 ) return s;
                        break;
                    case 45 : 
                        int LA46_222 = input.LA(1);

                        s = -1;
                        if ( (LA46_222=='\"') ) {s = 306;}

                        else if ( ((LA46_222>='\u0000' && LA46_222<='\t')||(LA46_222>='\u000B' && LA46_222<='!')||(LA46_222>='#' && LA46_222<='[')||(LA46_222>=']' && LA46_222<='\uFFFF')) ) {s = 307;}

                        else if ( (LA46_222=='\\') ) {s = 308;}

                        if ( s>=0 ) return s;
                        break;
                    case 46 : 
                        int LA46_17 = input.LA(1);

                        s = -1;
                        if ( (LA46_17=='<') ) {s = 103;}

                        else if ( (LA46_17=='=') ) {s = 104;}

                        else if ( (LA46_17==':') ) {s = 105;}

                        else if ( (LA46_17=='%') ) {s = 106;}

                        else if ( ((LA46_17>='\u0000' && LA46_17<='\t')||(LA46_17>='\u000B' && LA46_17<='$')||(LA46_17>='&' && LA46_17<='9')||LA46_17==';'||(LA46_17>='?' && LA46_17<='\uFFFF')) ) {s = 107;}

                        else s = 108;

                        if ( s>=0 ) return s;
                        break;
                    case 47 : 
                        int LA46_104 = input.LA(1);

                        s = -1;
                        if ( ((LA46_104>='\u0000' && LA46_104<='\t')||(LA46_104>='\u000B' && LA46_104<='\uFFFF')) ) {s = 107;}

                        else s = 210;

                        if ( s>=0 ) return s;
                        break;
                    case 48 : 
                        int LA46_553 = input.LA(1);

                        s = -1;
                        if ( ((LA46_553>='\u0000' && LA46_553<='\t')||(LA46_553>='\u000B' && LA46_553<='/')||(LA46_553>=':' && LA46_553<='@')||(LA46_553>='G' && LA46_553<='\uFFFF')) ) {s = 107;}

                        else if ( ((LA46_553>='0' && LA46_553<='9')||(LA46_553>='A' && LA46_553<='F')) ) {s = 576;}

                        if ( s>=0 ) return s;
                        break;
                    case 49 : 
                        int LA46_455 = input.LA(1);

                        s = -1;
                        if ( ((LA46_455>='\u0000' && LA46_455<='\t')||(LA46_455>='\u000B' && LA46_455<='/')||(LA46_455>=':' && LA46_455<='@')||(LA46_455>='G' && LA46_455<='\uFFFF')) ) {s = 107;}

                        else if ( ((LA46_455>='0' && LA46_455<='9')||(LA46_455>='A' && LA46_455<='F')) ) {s = 518;}

                        if ( s>=0 ) return s;
                        break;
                    case 50 : 
                        int LA46_305 = input.LA(1);

                        s = -1;
                        if ( ((LA46_305>='\u0000' && LA46_305<='\t')||(LA46_305>='\u000B' && LA46_305<='/')||(LA46_305>=':' && LA46_305<='@')||(LA46_305>='G' && LA46_305<='\uFFFF')) ) {s = 107;}

                        else if ( ((LA46_305>='0' && LA46_305<='9')||(LA46_305>='A' && LA46_305<='F')) ) {s = 383;}

                        if ( s>=0 ) return s;
                        break;
                    case 51 : 
                        int LA46_586 = input.LA(1);

                        s = -1;
                        if ( ((LA46_586>='0' && LA46_586<='9')||(LA46_586>='A' && LA46_586<='F')) ) {s = 593;}

                        else if ( ((LA46_586>='\u0000' && LA46_586<='\t')||(LA46_586>='\u000B' && LA46_586<='/')||(LA46_586>=':' && LA46_586<='@')||(LA46_586>='G' && LA46_586<='\uFFFF')) ) {s = 107;}

                        if ( s>=0 ) return s;
                        break;
                    case 52 : 
                        int LA46_554 = input.LA(1);

                        s = -1;
                        if ( ((LA46_554>='\u0000' && LA46_554<='\t')||(LA46_554>='\u000B' && LA46_554<='/')||(LA46_554>=':' && LA46_554<='@')||(LA46_554>='G' && LA46_554<='\uFFFF')) ) {s = 107;}

                        else if ( ((LA46_554>='0' && LA46_554<='9')||(LA46_554>='A' && LA46_554<='F')) ) {s = 577;}

                        if ( s>=0 ) return s;
                        break;
                    case 53 : 
                        int LA46_454 = input.LA(1);

                        s = -1;
                        if ( ((LA46_454>='0' && LA46_454<='9')||(LA46_454>='A' && LA46_454<='F')) ) {s = 517;}

                        else if ( ((LA46_454>='\u0000' && LA46_454<='\t')||(LA46_454>='\u000B' && LA46_454<='/')||(LA46_454>=':' && LA46_454<='@')||(LA46_454>='G' && LA46_454<='\uFFFF')) ) {s = 107;}

                        if ( s>=0 ) return s;
                        break;
                    case 54 : 
                        int LA46_576 = input.LA(1);

                        s = -1;
                        if ( ((LA46_576>='0' && LA46_576<='9')||(LA46_576>='A' && LA46_576<='F')) ) {s = 586;}

                        else if ( ((LA46_576>='\u0000' && LA46_576<='\t')||(LA46_576>='\u000B' && LA46_576<='/')||(LA46_576>=':' && LA46_576<='@')||(LA46_576>='G' && LA46_576<='\uFFFF')) ) {s = 107;}

                        if ( s>=0 ) return s;
                        break;
                    case 55 : 
                        int LA46_518 = input.LA(1);

                        s = -1;
                        if ( ((LA46_518>='\u0000' && LA46_518<='\t')||(LA46_518>='\u000B' && LA46_518<='/')||(LA46_518>=':' && LA46_518<='@')||(LA46_518>='G' && LA46_518<='\uFFFF')) ) {s = 107;}

                        else if ( ((LA46_518>='0' && LA46_518<='9')||(LA46_518>='A' && LA46_518<='F')) ) {s = 554;}

                        if ( s>=0 ) return s;
                        break;
                    case 56 : 
                        int LA46_383 = input.LA(1);

                        s = -1;
                        if ( ((LA46_383>='\u0000' && LA46_383<='\t')||(LA46_383>='\u000B' && LA46_383<='/')||(LA46_383>=':' && LA46_383<='@')||(LA46_383>='G' && LA46_383<='\uFFFF')) ) {s = 107;}

                        else if ( ((LA46_383>='0' && LA46_383<='9')||(LA46_383>='A' && LA46_383<='F')) ) {s = 454;}

                        if ( s>=0 ) return s;
                        break;
                    case 57 : 
                        int LA46_378 = input.LA(1);

                        s = -1;
                        if ( ((LA46_378>='0' && LA46_378<='9')||(LA46_378>='A' && LA46_378<='F')) ) {s = 452;}

                        else if ( ((LA46_378>='\u0000' && LA46_378<='/')||(LA46_378>=':' && LA46_378<='@')||(LA46_378>='G' && LA46_378<='\uFFFF')) ) {s = 124;}

                        if ( s>=0 ) return s;
                        break;
                    case 58 : 
                        int LA46_208 = input.LA(1);

                        s = -1;
                        if ( ((LA46_208>='\u0000' && LA46_208<='\t')||(LA46_208>='\u000B' && LA46_208<='\uFFFF')) ) {s = 107;}

                        else s = 292;

                        if ( s>=0 ) return s;
                        break;
                    case 59 : 
                        int LA46_219 = input.LA(1);

                        s = -1;
                        if ( ((LA46_219>='0' && LA46_219<='9')||(LA46_219>='A' && LA46_219<='F')) ) {s = 300;}

                        else if ( ((LA46_219>='\u0000' && LA46_219<='\t')||(LA46_219>='\u000B' && LA46_219<='/')||(LA46_219>=':' && LA46_219<='@')||(LA46_219>='G' && LA46_219<='\uFFFF')) ) {s = 107;}

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