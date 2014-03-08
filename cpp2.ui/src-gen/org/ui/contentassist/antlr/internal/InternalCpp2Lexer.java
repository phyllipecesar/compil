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
    public static final int RULE_STRING_LITERAL=8;
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
    public static final int RULE_INT=5;
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
    public static final int RULE_PREPROCESSING_OP_OR_PUNC=9;
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
    public String getGrammarFileName() { return "../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g"; }

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:11:7: ( 'ConstantExpression' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:11:9: 'ConstantExpression'
            {
            match("ConstantExpression"); 


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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:12:7: ( 'TypeId' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:12:9: 'TypeId'
            {
            match("TypeId"); 


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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:13:7: ( 'IdExpression' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:13:9: 'IdExpression'
            {
            match("IdExpression"); 


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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:14:7: ( 'ParameterDeclaration' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:14:9: 'ParameterDeclaration'
            {
            match("ParameterDeclaration"); 


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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:15:7: ( 'Declaration' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:15:9: 'Declaration'
            {
            match("Declaration"); 


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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:16:7: ( 'NestedNameSpecifier' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:16:9: 'NestedNameSpecifier'
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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:17:7: ( 'AssignmentExpression' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:17:9: 'AssignmentExpression'
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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:18:7: ( 'AlignmentExpression' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:18:9: 'AlignmentExpression'
            {
            match("AlignmentExpression"); 


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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:19:7: ( 'TypeSpecifier' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:19:9: 'TypeSpecifier'
            {
            match("TypeSpecifier"); 


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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:20:7: ( 'AbstractDeclarator' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:20:9: 'AbstractDeclarator'
            {
            match("AbstractDeclarator"); 


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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:21:7: ( 'CompoundStatement' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:21:9: 'CompoundStatement'
            {
            match("CompoundStatement"); 


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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:22:7: ( 'CtorInitializer' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:22:9: 'CtorInitializer'
            {
            match("CtorInitializer"); 


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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:23:7: ( 'TypeIdList' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:23:9: 'TypeIdList'
            {
            match("TypeIdList"); 


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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:24:7: ( 'UnqualifiedId' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:24:9: 'UnqualifiedId'
            {
            match("UnqualifiedId"); 


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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:25:7: ( 'ParameterDeclarationClause' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:25:9: 'ParameterDeclarationClause'
            {
            match("ParameterDeclarationClause"); 


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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:26:7: ( 'TrailingTypeSpecifier' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:26:9: 'TrailingTypeSpecifier'
            {
            match("TrailingTypeSpecifier"); 


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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:27:7: ( 'ClassName' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:27:9: 'ClassName'
            {
            match("ClassName"); 


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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:28:7: ( 'Initializer' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:28:9: 'Initializer'
            {
            match("Initializer"); 


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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:29:7: ( 'true' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:29:9: 'true'
            {
            match("true"); 


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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:30:7: ( 'false' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:30:9: 'false'
            {
            match("false"); 


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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:31:7: ( 'const' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:31:9: 'const'
            {
            match("const"); 


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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:32:7: ( 'volatile' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:32:9: 'volatile'
            {
            match("volatile"); 


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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:33:7: ( '&' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:33:9: '&'
            {
            match('&'); 

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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:34:7: ( '&&' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:34:9: '&&'
            {
            match("&&"); 


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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:35:7: ( 'new' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:35:9: 'new'
            {
            match("new"); 


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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:36:7: ( 'delete' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:36:9: 'delete'
            {
            match("delete"); 


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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:37:7: ( '+' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:37:9: '+'
            {
            match('+'); 

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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:38:7: ( '-' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:38:9: '-'
            {
            match('-'); 

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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:39:7: ( '*' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:39:9: '*'
            {
            match('*'); 

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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:40:7: ( '/' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:40:9: '/'
            {
            match('/'); 

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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:41:7: ( '%' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:41:9: '%'
            {
            match('%'); 

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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:42:7: ( '^' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:42:9: '^'
            {
            match('^'); 

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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:43:7: ( '|' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:43:9: '|'
            {
            match('|'); 

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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:44:7: ( '~' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:44:9: '~'
            {
            match('~'); 

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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:45:7: ( '!' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:45:9: '!'
            {
            match('!'); 

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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:46:7: ( '=' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:46:9: '='
            {
            match('='); 

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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:47:7: ( '<' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:47:9: '<'
            {
            match('<'); 

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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:48:7: ( '>' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:48:9: '>'
            {
            match('>'); 

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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:49:7: ( '+=' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:49:9: '+='
            {
            match("+="); 


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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:50:7: ( '-=' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:50:9: '-='
            {
            match("-="); 


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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:51:7: ( '*=' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:51:9: '*='
            {
            match("*="); 


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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:52:7: ( '/=' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:52:9: '/='
            {
            match("/="); 


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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:53:7: ( '%=' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:53:9: '%='
            {
            match("%="); 


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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:54:7: ( '^=' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:54:9: '^='
            {
            match("^="); 


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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:55:7: ( '&=' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:55:9: '&='
            {
            match("&="); 


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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:56:7: ( '|=' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:56:9: '|='
            {
            match("|="); 


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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:57:7: ( '<<' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:57:9: '<<'
            {
            match("<<"); 


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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:58:7: ( '>>' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:58:9: '>>'
            {
            match(">>"); 


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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:59:7: ( '>>=' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:59:9: '>>='
            {
            match(">>="); 


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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:60:7: ( '<<=' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:60:9: '<<='
            {
            match("<<="); 


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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:61:7: ( '==' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:61:9: '=='
            {
            match("=="); 


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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:62:7: ( '!=' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:62:9: '!='
            {
            match("!="); 


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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:63:7: ( '<=' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:63:9: '<='
            {
            match("<="); 


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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:64:7: ( '>=' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:64:9: '>='
            {
            match(">="); 


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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:65:7: ( '||' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:65:9: '||'
            {
            match("||"); 


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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:66:7: ( '++' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:66:9: '++'
            {
            match("++"); 


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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:67:7: ( '--' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:67:9: '--'
            {
            match("--"); 


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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:68:7: ( ',' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:68:9: ','
            {
            match(','); 

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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:69:7: ( '->*' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:69:9: '->*'
            {
            match("->*"); 


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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:70:7: ( '->' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:70:9: '->'
            {
            match("->"); 


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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:71:7: ( '()' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:71:9: '()'
            {
            match("()"); 


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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:72:8: ( '[]' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:72:10: '[]'
            {
            match("[]"); 


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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:73:8: ( '...' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:73:10: '...'
            {
            match("..."); 


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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:74:8: ( 'nullptr' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:74:10: 'nullptr'
            {
            match("nullptr"); 


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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:75:8: ( '::' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:75:10: '::'
            {
            match("::"); 


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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:76:8: ( '[' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:76:10: '['
            {
            match('['); 

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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:77:8: ( ']' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:77:10: ']'
            {
            match(']'); 

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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:78:8: ( 'alignas' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:78:10: 'alignas'
            {
            match("alignas"); 


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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:79:8: ( '(' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:79:10: '('
            {
            match('('); 

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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:80:8: ( ')' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:80:10: ')'
            {
            match(')'); 

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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:81:8: ( 'operator' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:81:10: 'operator'
            {
            match("operator"); 


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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:82:8: ( '\"' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:82:10: '\"'
            {
            match('\"'); 

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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:83:8: ( 'class' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:83:10: 'class'
            {
            match("class"); 


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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:84:8: ( 'typename' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:84:10: 'typename'
            {
            match("typename"); 


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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:85:8: ( 'template' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:85:10: 'template'
            {
            match("template"); 


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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:86:8: ( 'catch' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:86:10: 'catch'
            {
            match("catch"); 


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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:87:8: ( 'throw' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:87:10: 'throw'
            {
            match("throw"); 


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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:88:8: ( 'noexcept' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:88:10: 'noexcept'
            {
            match("noexcept"); 


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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7584:24: ( RULE_HEXADECIMAL_DIGIT RULE_HEXADECIMAL_DIGIT RULE_HEXADECIMAL_DIGIT RULE_HEXADECIMAL_DIGIT )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7584:26: RULE_HEXADECIMAL_DIGIT RULE_HEXADECIMAL_DIGIT RULE_HEXADECIMAL_DIGIT RULE_HEXADECIMAL_DIGIT
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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7586:40: ( ( '\\\\u' RULE_HEX_QUAD | '\\\\U' RULE_HEX_QUAD RULE_HEX_QUAD ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7586:42: ( '\\\\u' RULE_HEX_QUAD | '\\\\U' RULE_HEX_QUAD RULE_HEX_QUAD )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7586:42: ( '\\\\u' RULE_HEX_QUAD | '\\\\U' RULE_HEX_QUAD RULE_HEX_QUAD )
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
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7586:43: '\\\\u' RULE_HEX_QUAD
                    {
                    match("\\u"); 

                    mRULE_HEX_QUAD(); 

                    }
                    break;
                case 2 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7586:63: '\\\\U' RULE_HEX_QUAD RULE_HEX_QUAD
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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7588:18: ( ( '<' ( RULE_H_CHAR )+ '>' | '\"' ( RULE_Q_CHAR )+ '\"' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7588:20: ( '<' ( RULE_H_CHAR )+ '>' | '\"' ( RULE_Q_CHAR )+ '\"' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7588:20: ( '<' ( RULE_H_CHAR )+ '>' | '\"' ( RULE_Q_CHAR )+ '\"' )
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
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7588:21: '<' ( RULE_H_CHAR )+ '>'
                    {
                    match('<'); 
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7588:25: ( RULE_H_CHAR )+
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
                    	    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7588:25: RULE_H_CHAR
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
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7588:42: '\"' ( RULE_Q_CHAR )+ '\"'
                    {
                    match('\"'); 
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7588:46: ( RULE_Q_CHAR )+
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
                    	    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7588:46: RULE_Q_CHAR
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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7590:22: (~ ( ( '\\n' | '>' ) ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7590:24: ~ ( ( '\\n' | '>' ) )
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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7592:22: (~ ( ( '\\n' | '\"' ) ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7592:24: ~ ( ( '\\n' | '\"' ) )
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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7594:14: ( ( 'alignas' | 'alignof' | 'asm' | 'auto' | 'bool' | 'break' | 'case' | 'catch' | 'char' | 'char16_t' | 'char32_t' | 'class' | 'const' | 'constexpr' | 'const_cast' | 'continue' | 'decltype' | 'default' | 'delete' | 'do' | 'double' | 'dynamic_cast' | 'else' | 'enum' | 'explicit' | 'export' | 'extern' | 'false' | 'float' | 'for' | 'friend' | 'goto' | 'if' | 'inline' | 'int' | 'long' | 'mutable' | 'namespace' | 'new' | 'noexcept' | 'nullptr' | 'operator' | 'private' | 'protected' | 'public' | 'register' | 'reinterpret_cast' | 'return' | 'short' | 'signed' | 'sizeof' | 'static' | 'static_assert' | 'static_cast' | 'struct' | 'switch' | 'template' | 'this' | 'thread_local' | 'throw' | 'true' | 'try' | 'typedef' | 'typeid' | 'typename' | 'union' | 'unsigned' | 'using' | 'virtual' | 'void' | 'volatile' | 'wchar_t' | 'while' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7594:16: ( 'alignas' | 'alignof' | 'asm' | 'auto' | 'bool' | 'break' | 'case' | 'catch' | 'char' | 'char16_t' | 'char32_t' | 'class' | 'const' | 'constexpr' | 'const_cast' | 'continue' | 'decltype' | 'default' | 'delete' | 'do' | 'double' | 'dynamic_cast' | 'else' | 'enum' | 'explicit' | 'export' | 'extern' | 'false' | 'float' | 'for' | 'friend' | 'goto' | 'if' | 'inline' | 'int' | 'long' | 'mutable' | 'namespace' | 'new' | 'noexcept' | 'nullptr' | 'operator' | 'private' | 'protected' | 'public' | 'register' | 'reinterpret_cast' | 'return' | 'short' | 'signed' | 'sizeof' | 'static' | 'static_assert' | 'static_cast' | 'struct' | 'switch' | 'template' | 'this' | 'thread_local' | 'throw' | 'true' | 'try' | 'typedef' | 'typeid' | 'typename' | 'union' | 'unsigned' | 'using' | 'virtual' | 'void' | 'volatile' | 'wchar_t' | 'while' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7594:16: ( 'alignas' | 'alignof' | 'asm' | 'auto' | 'bool' | 'break' | 'case' | 'catch' | 'char' | 'char16_t' | 'char32_t' | 'class' | 'const' | 'constexpr' | 'const_cast' | 'continue' | 'decltype' | 'default' | 'delete' | 'do' | 'double' | 'dynamic_cast' | 'else' | 'enum' | 'explicit' | 'export' | 'extern' | 'false' | 'float' | 'for' | 'friend' | 'goto' | 'if' | 'inline' | 'int' | 'long' | 'mutable' | 'namespace' | 'new' | 'noexcept' | 'nullptr' | 'operator' | 'private' | 'protected' | 'public' | 'register' | 'reinterpret_cast' | 'return' | 'short' | 'signed' | 'sizeof' | 'static' | 'static_assert' | 'static_cast' | 'struct' | 'switch' | 'template' | 'this' | 'thread_local' | 'throw' | 'true' | 'try' | 'typedef' | 'typeid' | 'typename' | 'union' | 'unsigned' | 'using' | 'virtual' | 'void' | 'volatile' | 'wchar_t' | 'while' )
            int alt5=73;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7594:17: 'alignas'
                    {
                    match("alignas"); 


                    }
                    break;
                case 2 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7594:27: 'alignof'
                    {
                    match("alignof"); 


                    }
                    break;
                case 3 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7594:37: 'asm'
                    {
                    match("asm"); 


                    }
                    break;
                case 4 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7594:43: 'auto'
                    {
                    match("auto"); 


                    }
                    break;
                case 5 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7594:50: 'bool'
                    {
                    match("bool"); 


                    }
                    break;
                case 6 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7594:57: 'break'
                    {
                    match("break"); 


                    }
                    break;
                case 7 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7594:65: 'case'
                    {
                    match("case"); 


                    }
                    break;
                case 8 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7594:72: 'catch'
                    {
                    match("catch"); 


                    }
                    break;
                case 9 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7594:80: 'char'
                    {
                    match("char"); 


                    }
                    break;
                case 10 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7594:87: 'char16_t'
                    {
                    match("char16_t"); 


                    }
                    break;
                case 11 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7594:98: 'char32_t'
                    {
                    match("char32_t"); 


                    }
                    break;
                case 12 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7594:109: 'class'
                    {
                    match("class"); 


                    }
                    break;
                case 13 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7594:117: 'const'
                    {
                    match("const"); 


                    }
                    break;
                case 14 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7594:125: 'constexpr'
                    {
                    match("constexpr"); 


                    }
                    break;
                case 15 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7594:137: 'const_cast'
                    {
                    match("const_cast"); 


                    }
                    break;
                case 16 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7594:150: 'continue'
                    {
                    match("continue"); 


                    }
                    break;
                case 17 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7594:161: 'decltype'
                    {
                    match("decltype"); 


                    }
                    break;
                case 18 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7594:172: 'default'
                    {
                    match("default"); 


                    }
                    break;
                case 19 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7594:182: 'delete'
                    {
                    match("delete"); 


                    }
                    break;
                case 20 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7594:191: 'do'
                    {
                    match("do"); 


                    }
                    break;
                case 21 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7594:196: 'double'
                    {
                    match("double"); 


                    }
                    break;
                case 22 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7594:205: 'dynamic_cast'
                    {
                    match("dynamic_cast"); 


                    }
                    break;
                case 23 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7594:220: 'else'
                    {
                    match("else"); 


                    }
                    break;
                case 24 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7594:227: 'enum'
                    {
                    match("enum"); 


                    }
                    break;
                case 25 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7594:234: 'explicit'
                    {
                    match("explicit"); 


                    }
                    break;
                case 26 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7594:245: 'export'
                    {
                    match("export"); 


                    }
                    break;
                case 27 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7594:254: 'extern'
                    {
                    match("extern"); 


                    }
                    break;
                case 28 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7594:263: 'false'
                    {
                    match("false"); 


                    }
                    break;
                case 29 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7594:271: 'float'
                    {
                    match("float"); 


                    }
                    break;
                case 30 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7594:279: 'for'
                    {
                    match("for"); 


                    }
                    break;
                case 31 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7594:285: 'friend'
                    {
                    match("friend"); 


                    }
                    break;
                case 32 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7594:294: 'goto'
                    {
                    match("goto"); 


                    }
                    break;
                case 33 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7594:301: 'if'
                    {
                    match("if"); 


                    }
                    break;
                case 34 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7594:306: 'inline'
                    {
                    match("inline"); 


                    }
                    break;
                case 35 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7594:315: 'int'
                    {
                    match("int"); 


                    }
                    break;
                case 36 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7594:321: 'long'
                    {
                    match("long"); 


                    }
                    break;
                case 37 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7594:328: 'mutable'
                    {
                    match("mutable"); 


                    }
                    break;
                case 38 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7594:338: 'namespace'
                    {
                    match("namespace"); 


                    }
                    break;
                case 39 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7594:350: 'new'
                    {
                    match("new"); 


                    }
                    break;
                case 40 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7594:356: 'noexcept'
                    {
                    match("noexcept"); 


                    }
                    break;
                case 41 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7594:367: 'nullptr'
                    {
                    match("nullptr"); 


                    }
                    break;
                case 42 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7594:377: 'operator'
                    {
                    match("operator"); 


                    }
                    break;
                case 43 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7594:388: 'private'
                    {
                    match("private"); 


                    }
                    break;
                case 44 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7594:398: 'protected'
                    {
                    match("protected"); 


                    }
                    break;
                case 45 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7594:410: 'public'
                    {
                    match("public"); 


                    }
                    break;
                case 46 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7594:419: 'register'
                    {
                    match("register"); 


                    }
                    break;
                case 47 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7594:430: 'reinterpret_cast'
                    {
                    match("reinterpret_cast"); 


                    }
                    break;
                case 48 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7594:449: 'return'
                    {
                    match("return"); 


                    }
                    break;
                case 49 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7594:458: 'short'
                    {
                    match("short"); 


                    }
                    break;
                case 50 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7594:466: 'signed'
                    {
                    match("signed"); 


                    }
                    break;
                case 51 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7594:475: 'sizeof'
                    {
                    match("sizeof"); 


                    }
                    break;
                case 52 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7594:484: 'static'
                    {
                    match("static"); 


                    }
                    break;
                case 53 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7594:493: 'static_assert'
                    {
                    match("static_assert"); 


                    }
                    break;
                case 54 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7594:509: 'static_cast'
                    {
                    match("static_cast"); 


                    }
                    break;
                case 55 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7594:523: 'struct'
                    {
                    match("struct"); 


                    }
                    break;
                case 56 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7594:532: 'switch'
                    {
                    match("switch"); 


                    }
                    break;
                case 57 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7594:541: 'template'
                    {
                    match("template"); 


                    }
                    break;
                case 58 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7594:552: 'this'
                    {
                    match("this"); 


                    }
                    break;
                case 59 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7594:559: 'thread_local'
                    {
                    match("thread_local"); 


                    }
                    break;
                case 60 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7594:574: 'throw'
                    {
                    match("throw"); 


                    }
                    break;
                case 61 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7594:582: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 62 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7594:589: 'try'
                    {
                    match("try"); 


                    }
                    break;
                case 63 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7594:595: 'typedef'
                    {
                    match("typedef"); 


                    }
                    break;
                case 64 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7594:605: 'typeid'
                    {
                    match("typeid"); 


                    }
                    break;
                case 65 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7594:614: 'typename'
                    {
                    match("typename"); 


                    }
                    break;
                case 66 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7594:625: 'union'
                    {
                    match("union"); 


                    }
                    break;
                case 67 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7594:633: 'unsigned'
                    {
                    match("unsigned"); 


                    }
                    break;
                case 68 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7594:644: 'using'
                    {
                    match("using"); 


                    }
                    break;
                case 69 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7594:652: 'virtual'
                    {
                    match("virtual"); 


                    }
                    break;
                case 70 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7594:662: 'void'
                    {
                    match("void"); 


                    }
                    break;
                case 71 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7594:669: 'volatile'
                    {
                    match("volatile"); 


                    }
                    break;
                case 72 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7594:680: 'wchar_t'
                    {
                    match("wchar_t"); 


                    }
                    break;
                case 73 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7594:690: 'while'
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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7596:31: ( ( '{' | '}' | '[' | ']' | '#' | '##' | '(' | ')' | '<:' | ':>' | '<%' | '%>' | '%:' | '%:%:' | ';' | ':' | '...' | 'new' | 'delete' | '?' | '::' | '.' | '.*' | '+' | '-' | '*' | '/' | '%' | '^' | '&' | '|' | '~' | '!' | '=' | '<' | '>' | '+=' | '-=' | '*=' | '/=' | '%=' | '^=' | '&=' | '|=' | '<<' | '>>' | '<<=' | '>>=' | '==' | '!=' | '<=' | '>=' | '&&' | '||' | '++' | '--' | ',' | '->*' | '->' | 'and' | 'and_eq' | 'bitand' | 'bitor' | 'compl' | 'not' | 'not_eq' | 'or' | 'or_eq' | 'xor' | 'xor_eq' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7596:33: ( '{' | '}' | '[' | ']' | '#' | '##' | '(' | ')' | '<:' | ':>' | '<%' | '%>' | '%:' | '%:%:' | ';' | ':' | '...' | 'new' | 'delete' | '?' | '::' | '.' | '.*' | '+' | '-' | '*' | '/' | '%' | '^' | '&' | '|' | '~' | '!' | '=' | '<' | '>' | '+=' | '-=' | '*=' | '/=' | '%=' | '^=' | '&=' | '|=' | '<<' | '>>' | '<<=' | '>>=' | '==' | '!=' | '<=' | '>=' | '&&' | '||' | '++' | '--' | ',' | '->*' | '->' | 'and' | 'and_eq' | 'bitand' | 'bitor' | 'compl' | 'not' | 'not_eq' | 'or' | 'or_eq' | 'xor' | 'xor_eq' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7596:33: ( '{' | '}' | '[' | ']' | '#' | '##' | '(' | ')' | '<:' | ':>' | '<%' | '%>' | '%:' | '%:%:' | ';' | ':' | '...' | 'new' | 'delete' | '?' | '::' | '.' | '.*' | '+' | '-' | '*' | '/' | '%' | '^' | '&' | '|' | '~' | '!' | '=' | '<' | '>' | '+=' | '-=' | '*=' | '/=' | '%=' | '^=' | '&=' | '|=' | '<<' | '>>' | '<<=' | '>>=' | '==' | '!=' | '<=' | '>=' | '&&' | '||' | '++' | '--' | ',' | '->*' | '->' | 'and' | 'and_eq' | 'bitand' | 'bitor' | 'compl' | 'not' | 'not_eq' | 'or' | 'or_eq' | 'xor' | 'xor_eq' )
            int alt6=70;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7596:34: '{'
                    {
                    match('{'); 

                    }
                    break;
                case 2 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7596:38: '}'
                    {
                    match('}'); 

                    }
                    break;
                case 3 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7596:42: '['
                    {
                    match('['); 

                    }
                    break;
                case 4 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7596:46: ']'
                    {
                    match(']'); 

                    }
                    break;
                case 5 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7596:50: '#'
                    {
                    match('#'); 

                    }
                    break;
                case 6 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7596:54: '##'
                    {
                    match("##"); 


                    }
                    break;
                case 7 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7596:59: '('
                    {
                    match('('); 

                    }
                    break;
                case 8 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7596:63: ')'
                    {
                    match(')'); 

                    }
                    break;
                case 9 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7596:67: '<:'
                    {
                    match("<:"); 


                    }
                    break;
                case 10 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7596:72: ':>'
                    {
                    match(":>"); 


                    }
                    break;
                case 11 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7596:77: '<%'
                    {
                    match("<%"); 


                    }
                    break;
                case 12 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7596:82: '%>'
                    {
                    match("%>"); 


                    }
                    break;
                case 13 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7596:87: '%:'
                    {
                    match("%:"); 


                    }
                    break;
                case 14 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7596:92: '%:%:'
                    {
                    match("%:%:"); 


                    }
                    break;
                case 15 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7596:99: ';'
                    {
                    match(';'); 

                    }
                    break;
                case 16 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7596:103: ':'
                    {
                    match(':'); 

                    }
                    break;
                case 17 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7596:107: '...'
                    {
                    match("..."); 


                    }
                    break;
                case 18 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7596:113: 'new'
                    {
                    match("new"); 


                    }
                    break;
                case 19 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7596:119: 'delete'
                    {
                    match("delete"); 


                    }
                    break;
                case 20 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7596:128: '?'
                    {
                    match('?'); 

                    }
                    break;
                case 21 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7596:132: '::'
                    {
                    match("::"); 


                    }
                    break;
                case 22 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7596:137: '.'
                    {
                    match('.'); 

                    }
                    break;
                case 23 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7596:141: '.*'
                    {
                    match(".*"); 


                    }
                    break;
                case 24 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7596:146: '+'
                    {
                    match('+'); 

                    }
                    break;
                case 25 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7596:150: '-'
                    {
                    match('-'); 

                    }
                    break;
                case 26 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7596:154: '*'
                    {
                    match('*'); 

                    }
                    break;
                case 27 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7596:158: '/'
                    {
                    match('/'); 

                    }
                    break;
                case 28 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7596:162: '%'
                    {
                    match('%'); 

                    }
                    break;
                case 29 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7596:166: '^'
                    {
                    match('^'); 

                    }
                    break;
                case 30 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7596:170: '&'
                    {
                    match('&'); 

                    }
                    break;
                case 31 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7596:174: '|'
                    {
                    match('|'); 

                    }
                    break;
                case 32 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7596:178: '~'
                    {
                    match('~'); 

                    }
                    break;
                case 33 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7596:182: '!'
                    {
                    match('!'); 

                    }
                    break;
                case 34 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7596:186: '='
                    {
                    match('='); 

                    }
                    break;
                case 35 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7596:190: '<'
                    {
                    match('<'); 

                    }
                    break;
                case 36 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7596:194: '>'
                    {
                    match('>'); 

                    }
                    break;
                case 37 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7596:198: '+='
                    {
                    match("+="); 


                    }
                    break;
                case 38 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7596:203: '-='
                    {
                    match("-="); 


                    }
                    break;
                case 39 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7596:208: '*='
                    {
                    match("*="); 


                    }
                    break;
                case 40 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7596:213: '/='
                    {
                    match("/="); 


                    }
                    break;
                case 41 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7596:218: '%='
                    {
                    match("%="); 


                    }
                    break;
                case 42 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7596:223: '^='
                    {
                    match("^="); 


                    }
                    break;
                case 43 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7596:228: '&='
                    {
                    match("&="); 


                    }
                    break;
                case 44 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7596:233: '|='
                    {
                    match("|="); 


                    }
                    break;
                case 45 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7596:238: '<<'
                    {
                    match("<<"); 


                    }
                    break;
                case 46 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7596:243: '>>'
                    {
                    match(">>"); 


                    }
                    break;
                case 47 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7596:248: '<<='
                    {
                    match("<<="); 


                    }
                    break;
                case 48 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7596:254: '>>='
                    {
                    match(">>="); 


                    }
                    break;
                case 49 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7596:260: '=='
                    {
                    match("=="); 


                    }
                    break;
                case 50 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7596:265: '!='
                    {
                    match("!="); 


                    }
                    break;
                case 51 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7596:270: '<='
                    {
                    match("<="); 


                    }
                    break;
                case 52 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7596:275: '>='
                    {
                    match(">="); 


                    }
                    break;
                case 53 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7596:280: '&&'
                    {
                    match("&&"); 


                    }
                    break;
                case 54 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7596:285: '||'
                    {
                    match("||"); 


                    }
                    break;
                case 55 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7596:290: '++'
                    {
                    match("++"); 


                    }
                    break;
                case 56 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7596:295: '--'
                    {
                    match("--"); 


                    }
                    break;
                case 57 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7596:300: ','
                    {
                    match(','); 

                    }
                    break;
                case 58 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7596:304: '->*'
                    {
                    match("->*"); 


                    }
                    break;
                case 59 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7596:310: '->'
                    {
                    match("->"); 


                    }
                    break;
                case 60 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7596:315: 'and'
                    {
                    match("and"); 


                    }
                    break;
                case 61 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7596:321: 'and_eq'
                    {
                    match("and_eq"); 


                    }
                    break;
                case 62 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7596:330: 'bitand'
                    {
                    match("bitand"); 


                    }
                    break;
                case 63 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7596:339: 'bitor'
                    {
                    match("bitor"); 


                    }
                    break;
                case 64 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7596:347: 'compl'
                    {
                    match("compl"); 


                    }
                    break;
                case 65 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7596:355: 'not'
                    {
                    match("not"); 


                    }
                    break;
                case 66 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7596:361: 'not_eq'
                    {
                    match("not_eq"); 


                    }
                    break;
                case 67 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7596:370: 'or'
                    {
                    match("or"); 


                    }
                    break;
                case 68 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7596:375: 'or_eq'
                    {
                    match("or_eq"); 


                    }
                    break;
                case 69 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7596:383: 'xor'
                    {
                    match("xor"); 


                    }
                    break;
                case 70 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7596:389: 'xor_eq'
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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7598:9: ( ( RULE_NONDIGIT | RULE_UNIVERSAL_CHARACTER_NAME ) ( RULE_DIGIT | RULE_NONDIGIT | RULE_UNIVERSAL_CHARACTER_NAME )* )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7598:11: ( RULE_NONDIGIT | RULE_UNIVERSAL_CHARACTER_NAME ) ( RULE_DIGIT | RULE_NONDIGIT | RULE_UNIVERSAL_CHARACTER_NAME )*
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7598:11: ( RULE_NONDIGIT | RULE_UNIVERSAL_CHARACTER_NAME )
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
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7598:12: RULE_NONDIGIT
                    {
                    mRULE_NONDIGIT(); 

                    }
                    break;
                case 2 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7598:26: RULE_UNIVERSAL_CHARACTER_NAME
                    {
                    mRULE_UNIVERSAL_CHARACTER_NAME(); 

                    }
                    break;

            }

            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7598:57: ( RULE_DIGIT | RULE_NONDIGIT | RULE_UNIVERSAL_CHARACTER_NAME )*
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
            	    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7598:58: RULE_DIGIT
            	    {
            	    mRULE_DIGIT(); 

            	    }
            	    break;
            	case 2 :
            	    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7598:69: RULE_NONDIGIT
            	    {
            	    mRULE_NONDIGIT(); 

            	    }
            	    break;
            	case 3 :
            	    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7598:83: RULE_UNIVERSAL_CHARACTER_NAME
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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7600:24: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7600:26: ( 'a' .. 'z' | 'A' .. 'Z' | '_' )
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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7602:21: ( '0' .. '9' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7602:23: '0' .. '9'
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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7604:10: ( ( RULE_DECIMAL_LITERAL | RULE_OCTAL_LITERAL | RULE_HEXADECIMAL_LITERAL ) ( RULE_INTEGER_SUFFIX )? )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7604:12: ( RULE_DECIMAL_LITERAL | RULE_OCTAL_LITERAL | RULE_HEXADECIMAL_LITERAL ) ( RULE_INTEGER_SUFFIX )?
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7604:12: ( RULE_DECIMAL_LITERAL | RULE_OCTAL_LITERAL | RULE_HEXADECIMAL_LITERAL )
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
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7604:13: RULE_DECIMAL_LITERAL
                    {
                    mRULE_DECIMAL_LITERAL(); 

                    }
                    break;
                case 2 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7604:34: RULE_OCTAL_LITERAL
                    {
                    mRULE_OCTAL_LITERAL(); 

                    }
                    break;
                case 3 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7604:53: RULE_HEXADECIMAL_LITERAL
                    {
                    mRULE_HEXADECIMAL_LITERAL(); 

                    }
                    break;

            }

            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7604:79: ( RULE_INTEGER_SUFFIX )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='L'||LA10_0=='U'||LA10_0=='l'||LA10_0=='u') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7604:79: RULE_INTEGER_SUFFIX
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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7606:31: ( '1' .. '9' ( RULE_DIGIT )* )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7606:33: '1' .. '9' ( RULE_DIGIT )*
            {
            matchRange('1','9'); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7606:42: ( RULE_DIGIT )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='0' && LA11_0<='9')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7606:42: RULE_DIGIT
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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7608:29: ( '0' ( RULE_OCTAL_DIGIT )* )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7608:31: '0' ( RULE_OCTAL_DIGIT )*
            {
            match('0'); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7608:35: ( RULE_OCTAL_DIGIT )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='0' && LA12_0<='7')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7608:35: RULE_OCTAL_DIGIT
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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7610:35: ( ( '0x' | '0X' ) ( RULE_HEXADECIMAL_DIGIT )+ )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7610:37: ( '0x' | '0X' ) ( RULE_HEXADECIMAL_DIGIT )+
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7610:37: ( '0x' | '0X' )
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
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7610:38: '0x'
                    {
                    match("0x"); 


                    }
                    break;
                case 2 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7610:43: '0X'
                    {
                    match("0X"); 


                    }
                    break;

            }

            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7610:49: ( RULE_HEXADECIMAL_DIGIT )+
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
            	    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7610:49: RULE_HEXADECIMAL_DIGIT
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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7612:27: ( '0' .. '7' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7612:29: '0' .. '7'
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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7614:33: ( ( '0' .. '9' | 'A' .. 'F' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7614:35: ( '0' .. '9' | 'A' .. 'F' )
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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7616:30: ( ( ( 'u' | 'U' ) ( 'l' | 'L' | 'll' | 'LL' )? | ( 'l' | 'L' | 'll' | 'LL' ) ( 'u' | 'U' )? ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7616:32: ( ( 'u' | 'U' ) ( 'l' | 'L' | 'll' | 'LL' )? | ( 'l' | 'L' | 'll' | 'LL' ) ( 'u' | 'U' )? )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7616:32: ( ( 'u' | 'U' ) ( 'l' | 'L' | 'll' | 'LL' )? | ( 'l' | 'L' | 'll' | 'LL' ) ( 'u' | 'U' )? )
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
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7616:33: ( 'u' | 'U' ) ( 'l' | 'L' | 'll' | 'LL' )?
                    {
                    if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7616:43: ( 'l' | 'L' | 'll' | 'LL' )?
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
                            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7616:44: 'l'
                            {
                            match('l'); 

                            }
                            break;
                        case 2 :
                            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7616:48: 'L'
                            {
                            match('L'); 

                            }
                            break;
                        case 3 :
                            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7616:52: 'll'
                            {
                            match("ll"); 


                            }
                            break;
                        case 4 :
                            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7616:57: 'LL'
                            {
                            match("LL"); 


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7616:64: ( 'l' | 'L' | 'll' | 'LL' ) ( 'u' | 'U' )?
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7616:64: ( 'l' | 'L' | 'll' | 'LL' )
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
                            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7616:65: 'l'
                            {
                            match('l'); 

                            }
                            break;
                        case 2 :
                            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7616:69: 'L'
                            {
                            match('L'); 

                            }
                            break;
                        case 3 :
                            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7616:73: 'll'
                            {
                            match("ll"); 


                            }
                            break;
                        case 4 :
                            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7616:78: 'LL'
                            {
                            match("LL"); 


                            }
                            break;

                    }

                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7616:84: ( 'u' | 'U' )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0=='U'||LA17_0=='u') ) {
                        alt17=1;
                    }
                    switch (alt17) {
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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7618:24: ( ( 'u' | 'U' | 'L' )? '\\'' ( RULE_C_CHAR )+ '\\'' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7618:26: ( 'u' | 'U' | 'L' )? '\\'' ( RULE_C_CHAR )+ '\\''
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7618:26: ( 'u' | 'U' | 'L' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0=='L'||LA19_0=='U'||LA19_0=='u') ) {
                alt19=1;
            }
            switch (alt19) {
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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7618:46: ( RULE_C_CHAR )+
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
            	    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7618:46: RULE_C_CHAR
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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7620:22: ( (~ ( ( '\\'' | '\\\\' | '\\n' ) ) | RULE_ESCAPE_SEQUENCE | RULE_UNIVERSAL_CHARACTER_NAME ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7620:24: (~ ( ( '\\'' | '\\\\' | '\\n' ) ) | RULE_ESCAPE_SEQUENCE | RULE_UNIVERSAL_CHARACTER_NAME )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7620:24: (~ ( ( '\\'' | '\\\\' | '\\n' ) ) | RULE_ESCAPE_SEQUENCE | RULE_UNIVERSAL_CHARACTER_NAME )
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
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7620:25: ~ ( ( '\\'' | '\\\\' | '\\n' ) )
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
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7620:45: RULE_ESCAPE_SEQUENCE
                    {
                    mRULE_ESCAPE_SEQUENCE(); 

                    }
                    break;
                case 3 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7620:66: RULE_UNIVERSAL_CHARACTER_NAME
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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7622:31: ( ( RULE_SIMPLE_ESCAPE_SEQUENCE | RULE_OCTAL_ESCAPE_SEQUENCE | RULE_HEXADECIMAL_ESCAPE_SEQUENCE ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7622:33: ( RULE_SIMPLE_ESCAPE_SEQUENCE | RULE_OCTAL_ESCAPE_SEQUENCE | RULE_HEXADECIMAL_ESCAPE_SEQUENCE )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7622:33: ( RULE_SIMPLE_ESCAPE_SEQUENCE | RULE_OCTAL_ESCAPE_SEQUENCE | RULE_HEXADECIMAL_ESCAPE_SEQUENCE )
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
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7622:34: RULE_SIMPLE_ESCAPE_SEQUENCE
                    {
                    mRULE_SIMPLE_ESCAPE_SEQUENCE(); 

                    }
                    break;
                case 2 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7622:62: RULE_OCTAL_ESCAPE_SEQUENCE
                    {
                    mRULE_OCTAL_ESCAPE_SEQUENCE(); 

                    }
                    break;
                case 3 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7622:89: RULE_HEXADECIMAL_ESCAPE_SEQUENCE
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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7624:38: ( '\\\\' ( '\\'' | '\"' | '?' | '\\\\' | 'a' | 'b' | 'f' | 'n' | 'r' | 't' | 'v' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7624:40: '\\\\' ( '\\'' | '\"' | '?' | '\\\\' | 'a' | 'b' | 'f' | 'n' | 'r' | 't' | 'v' )
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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7626:37: ( '\\\\' RULE_OCTAL_DIGIT RULE_OCTAL_DIGIT RULE_OCTAL_DIGIT )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7626:39: '\\\\' RULE_OCTAL_DIGIT RULE_OCTAL_DIGIT RULE_OCTAL_DIGIT
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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7628:43: ( '\\\\x' ( RULE_HEXADECIMAL_DIGIT )+ )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7628:45: '\\\\x' ( RULE_HEXADECIMAL_DIGIT )+
            {
            match("\\x"); 

            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7628:51: ( RULE_HEXADECIMAL_DIGIT )+
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
            	    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7628:51: RULE_HEXADECIMAL_DIGIT
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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7630:23: ( ( RULE_FRACTIONAL_CONSTANT ( RULE_EXPONENT_PART )? | ( RULE_DIGIT )+ RULE_EXPONENT_PART ) ( 'f' | 'l' | 'F' | 'L' )? )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7630:25: ( RULE_FRACTIONAL_CONSTANT ( RULE_EXPONENT_PART )? | ( RULE_DIGIT )+ RULE_EXPONENT_PART ) ( 'f' | 'l' | 'F' | 'L' )?
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7630:25: ( RULE_FRACTIONAL_CONSTANT ( RULE_EXPONENT_PART )? | ( RULE_DIGIT )+ RULE_EXPONENT_PART )
            int alt26=2;
            alt26 = dfa26.predict(input);
            switch (alt26) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7630:26: RULE_FRACTIONAL_CONSTANT ( RULE_EXPONENT_PART )?
                    {
                    mRULE_FRACTIONAL_CONSTANT(); 
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7630:51: ( RULE_EXPONENT_PART )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0=='E'||LA24_0=='e') ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7630:51: RULE_EXPONENT_PART
                            {
                            mRULE_EXPONENT_PART(); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7630:71: ( RULE_DIGIT )+ RULE_EXPONENT_PART
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7630:71: ( RULE_DIGIT )+
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
                    	    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7630:71: RULE_DIGIT
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

            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7630:103: ( 'f' | 'l' | 'F' | 'L' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0=='F'||LA27_0=='L'||LA27_0=='f'||LA27_0=='l') ) {
                alt27=1;
            }
            switch (alt27) {
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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7632:35: ( ( ( RULE_DIGIT )* '.' ( RULE_DIGIT )+ | ( RULE_DIGIT )+ '.' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7632:37: ( ( RULE_DIGIT )* '.' ( RULE_DIGIT )+ | ( RULE_DIGIT )+ '.' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7632:37: ( ( RULE_DIGIT )* '.' ( RULE_DIGIT )+ | ( RULE_DIGIT )+ '.' )
            int alt31=2;
            alt31 = dfa31.predict(input);
            switch (alt31) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7632:38: ( RULE_DIGIT )* '.' ( RULE_DIGIT )+
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7632:38: ( RULE_DIGIT )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( ((LA28_0>='0' && LA28_0<='9')) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7632:38: RULE_DIGIT
                    	    {
                    	    mRULE_DIGIT(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop28;
                        }
                    } while (true);

                    match('.'); 
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7632:54: ( RULE_DIGIT )+
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
                    	    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7632:54: RULE_DIGIT
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
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7632:66: ( RULE_DIGIT )+ '.'
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7632:66: ( RULE_DIGIT )+
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
                    	    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7632:66: RULE_DIGIT
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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7634:29: ( ( 'e' | 'E' ) ( '+' | '-' )? ( RULE_DIGIT )+ )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7634:31: ( 'e' | 'E' ) ( '+' | '-' )? ( RULE_DIGIT )+
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7634:41: ( '+' | '-' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0=='+'||LA32_0=='-') ) {
                alt32=1;
            }
            switch (alt32) {
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

            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7634:52: ( RULE_DIGIT )+
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
            	    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7634:52: RULE_DIGIT
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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7636:21: ( ( RULE_ENC_PREFIX )? '\"' ( RULE_SCHAR )+ '\"' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7636:23: ( RULE_ENC_PREFIX )? '\"' ( RULE_SCHAR )+ '\"'
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7636:23: ( RULE_ENC_PREFIX )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0=='L'||LA34_0=='U'||LA34_0=='u') ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7636:23: RULE_ENC_PREFIX
                    {
                    mRULE_ENC_PREFIX(); 

                    }
                    break;

            }

            match('\"'); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7636:44: ( RULE_SCHAR )+
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
            	    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7636:44: RULE_SCHAR
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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7638:26: ( ( 'u8' | 'u' | 'U' | 'L' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7638:28: ( 'u8' | 'u' | 'U' | 'L' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7638:28: ( 'u8' | 'u' | 'U' | 'L' )
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
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7638:29: 'u8'
                    {
                    match("u8"); 


                    }
                    break;
                case 2 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7638:34: 'u'
                    {
                    match('u'); 

                    }
                    break;
                case 3 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7638:38: 'U'
                    {
                    match('U'); 

                    }
                    break;
                case 4 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7638:42: 'L'
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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7640:21: ( (~ ( ( '\"' | '\\\\' | '\\n' ) ) | RULE_ESCAPE_SEQUENCE | RULE_UNIVERSAL_CHARACTER_NAME ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7640:23: (~ ( ( '\"' | '\\\\' | '\\n' ) ) | RULE_ESCAPE_SEQUENCE | RULE_UNIVERSAL_CHARACTER_NAME )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7640:23: (~ ( ( '\"' | '\\\\' | '\\n' ) ) | RULE_ESCAPE_SEQUENCE | RULE_UNIVERSAL_CHARACTER_NAME )
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
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7640:24: ~ ( ( '\"' | '\\\\' | '\\n' ) )
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
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7640:43: RULE_ESCAPE_SEQUENCE
                    {
                    mRULE_ESCAPE_SEQUENCE(); 

                    }
                    break;
                case 3 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7640:64: RULE_UNIVERSAL_CHARACTER_NAME
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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7642:16: ( ( RULE_DIGIT | '.' RULE_DIGIT ) ( RULE_DIGIT | RULE_NONDIGIT | RULE_UNIVERSAL_CHARACTER_NAME | ( 'e' | 'E' ) ( '+' | '-' ) | '.' )* )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7642:18: ( RULE_DIGIT | '.' RULE_DIGIT ) ( RULE_DIGIT | RULE_NONDIGIT | RULE_UNIVERSAL_CHARACTER_NAME | ( 'e' | 'E' ) ( '+' | '-' ) | '.' )*
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7642:18: ( RULE_DIGIT | '.' RULE_DIGIT )
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
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7642:19: RULE_DIGIT
                    {
                    mRULE_DIGIT(); 

                    }
                    break;
                case 2 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7642:30: '.' RULE_DIGIT
                    {
                    match('.'); 
                    mRULE_DIGIT(); 

                    }
                    break;

            }

            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7642:46: ( RULE_DIGIT | RULE_NONDIGIT | RULE_UNIVERSAL_CHARACTER_NAME | ( 'e' | 'E' ) ( '+' | '-' ) | '.' )*
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
            	    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7642:47: RULE_DIGIT
            	    {
            	    mRULE_DIGIT(); 

            	    }
            	    break;
            	case 2 :
            	    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7642:58: RULE_NONDIGIT
            	    {
            	    mRULE_NONDIGIT(); 

            	    }
            	    break;
            	case 3 :
            	    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7642:72: RULE_UNIVERSAL_CHARACTER_NAME
            	    {
            	    mRULE_UNIVERSAL_CHARACTER_NAME(); 

            	    }
            	    break;
            	case 4 :
            	    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7642:102: ( 'e' | 'E' ) ( '+' | '-' )
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
            	    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7642:122: '.'
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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7644:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7644:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7644:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7644:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7644:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7644:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7644:66: ~ ( ( '\\\\' | '\"' ) )
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
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7644:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7644:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7644:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7644:137: ~ ( ( '\\\\' | '\\'' ) )
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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7646:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7646:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7646:24: ( options {greedy=false; } : . )*
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
            	    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7646:52: .
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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7648:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7648:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7648:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( ((LA44_0>='\u0000' && LA44_0<='\t')||(LA44_0>='\u000B' && LA44_0<='\f')||(LA44_0>='\u000E' && LA44_0<='\uFFFF')) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7648:24: ~ ( ( '\\n' | '\\r' ) )
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

            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7648:40: ( ( '\\r' )? '\\n' )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0=='\n'||LA46_0=='\r') ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7648:41: ( '\\r' )? '\\n'
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7648:41: ( '\\r' )?
                    int alt45=2;
                    int LA45_0 = input.LA(1);

                    if ( (LA45_0=='\r') ) {
                        alt45=1;
                    }
                    switch (alt45) {
                        case 1 :
                            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7648:41: '\\r'
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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7650:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7650:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7650:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7652:16: ( . )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7652:18: .
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
        // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1:8: ( T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | T__114 | T__115 | T__116 | RULE_HEADER_NAME | RULE_KEYWORD | RULE_PREPROCESSING_OP_OR_PUNC | RULE_ID | RULE_INT | RULE_CHARACTER_LITERAL | RULE_FLOATING_LITERAL | RULE_STRING_LITERAL | RULE_PP_NUMBER | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt48=92;
        alt48 = dfa48.predict(input);
        switch (alt48) {
            case 1 :
                // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1:10: T__39
                {
                mT__39(); 

                }
                break;
            case 2 :
                // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1:16: T__40
                {
                mT__40(); 

                }
                break;
            case 3 :
                // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1:22: T__41
                {
                mT__41(); 

                }
                break;
            case 4 :
                // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1:28: T__42
                {
                mT__42(); 

                }
                break;
            case 5 :
                // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1:34: T__43
                {
                mT__43(); 

                }
                break;
            case 6 :
                // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1:40: T__44
                {
                mT__44(); 

                }
                break;
            case 7 :
                // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1:46: T__45
                {
                mT__45(); 

                }
                break;
            case 8 :
                // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1:52: T__46
                {
                mT__46(); 

                }
                break;
            case 9 :
                // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1:58: T__47
                {
                mT__47(); 

                }
                break;
            case 10 :
                // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1:64: T__48
                {
                mT__48(); 

                }
                break;
            case 11 :
                // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1:70: T__49
                {
                mT__49(); 

                }
                break;
            case 12 :
                // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1:76: T__50
                {
                mT__50(); 

                }
                break;
            case 13 :
                // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1:82: T__51
                {
                mT__51(); 

                }
                break;
            case 14 :
                // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1:88: T__52
                {
                mT__52(); 

                }
                break;
            case 15 :
                // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1:94: T__53
                {
                mT__53(); 

                }
                break;
            case 16 :
                // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1:100: T__54
                {
                mT__54(); 

                }
                break;
            case 17 :
                // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1:106: T__55
                {
                mT__55(); 

                }
                break;
            case 18 :
                // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1:112: T__56
                {
                mT__56(); 

                }
                break;
            case 19 :
                // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1:118: T__57
                {
                mT__57(); 

                }
                break;
            case 20 :
                // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1:124: T__58
                {
                mT__58(); 

                }
                break;
            case 21 :
                // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1:130: T__59
                {
                mT__59(); 

                }
                break;
            case 22 :
                // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1:136: T__60
                {
                mT__60(); 

                }
                break;
            case 23 :
                // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1:142: T__61
                {
                mT__61(); 

                }
                break;
            case 24 :
                // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1:148: T__62
                {
                mT__62(); 

                }
                break;
            case 25 :
                // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1:154: T__63
                {
                mT__63(); 

                }
                break;
            case 26 :
                // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1:160: T__64
                {
                mT__64(); 

                }
                break;
            case 27 :
                // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1:166: T__65
                {
                mT__65(); 

                }
                break;
            case 28 :
                // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1:172: T__66
                {
                mT__66(); 

                }
                break;
            case 29 :
                // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1:178: T__67
                {
                mT__67(); 

                }
                break;
            case 30 :
                // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1:184: T__68
                {
                mT__68(); 

                }
                break;
            case 31 :
                // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1:190: T__69
                {
                mT__69(); 

                }
                break;
            case 32 :
                // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1:196: T__70
                {
                mT__70(); 

                }
                break;
            case 33 :
                // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1:202: T__71
                {
                mT__71(); 

                }
                break;
            case 34 :
                // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1:208: T__72
                {
                mT__72(); 

                }
                break;
            case 35 :
                // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1:214: T__73
                {
                mT__73(); 

                }
                break;
            case 36 :
                // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1:220: T__74
                {
                mT__74(); 

                }
                break;
            case 37 :
                // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1:226: T__75
                {
                mT__75(); 

                }
                break;
            case 38 :
                // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1:232: T__76
                {
                mT__76(); 

                }
                break;
            case 39 :
                // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1:238: T__77
                {
                mT__77(); 

                }
                break;
            case 40 :
                // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1:244: T__78
                {
                mT__78(); 

                }
                break;
            case 41 :
                // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1:250: T__79
                {
                mT__79(); 

                }
                break;
            case 42 :
                // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1:256: T__80
                {
                mT__80(); 

                }
                break;
            case 43 :
                // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1:262: T__81
                {
                mT__81(); 

                }
                break;
            case 44 :
                // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1:268: T__82
                {
                mT__82(); 

                }
                break;
            case 45 :
                // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1:274: T__83
                {
                mT__83(); 

                }
                break;
            case 46 :
                // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1:280: T__84
                {
                mT__84(); 

                }
                break;
            case 47 :
                // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1:286: T__85
                {
                mT__85(); 

                }
                break;
            case 48 :
                // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1:292: T__86
                {
                mT__86(); 

                }
                break;
            case 49 :
                // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1:298: T__87
                {
                mT__87(); 

                }
                break;
            case 50 :
                // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1:304: T__88
                {
                mT__88(); 

                }
                break;
            case 51 :
                // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1:310: T__89
                {
                mT__89(); 

                }
                break;
            case 52 :
                // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1:316: T__90
                {
                mT__90(); 

                }
                break;
            case 53 :
                // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1:322: T__91
                {
                mT__91(); 

                }
                break;
            case 54 :
                // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1:328: T__92
                {
                mT__92(); 

                }
                break;
            case 55 :
                // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1:334: T__93
                {
                mT__93(); 

                }
                break;
            case 56 :
                // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1:340: T__94
                {
                mT__94(); 

                }
                break;
            case 57 :
                // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1:346: T__95
                {
                mT__95(); 

                }
                break;
            case 58 :
                // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1:352: T__96
                {
                mT__96(); 

                }
                break;
            case 59 :
                // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1:358: T__97
                {
                mT__97(); 

                }
                break;
            case 60 :
                // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1:364: T__98
                {
                mT__98(); 

                }
                break;
            case 61 :
                // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1:370: T__99
                {
                mT__99(); 

                }
                break;
            case 62 :
                // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1:376: T__100
                {
                mT__100(); 

                }
                break;
            case 63 :
                // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1:383: T__101
                {
                mT__101(); 

                }
                break;
            case 64 :
                // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1:390: T__102
                {
                mT__102(); 

                }
                break;
            case 65 :
                // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1:397: T__103
                {
                mT__103(); 

                }
                break;
            case 66 :
                // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1:404: T__104
                {
                mT__104(); 

                }
                break;
            case 67 :
                // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1:411: T__105
                {
                mT__105(); 

                }
                break;
            case 68 :
                // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1:418: T__106
                {
                mT__106(); 

                }
                break;
            case 69 :
                // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1:425: T__107
                {
                mT__107(); 

                }
                break;
            case 70 :
                // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1:432: T__108
                {
                mT__108(); 

                }
                break;
            case 71 :
                // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1:439: T__109
                {
                mT__109(); 

                }
                break;
            case 72 :
                // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1:446: T__110
                {
                mT__110(); 

                }
                break;
            case 73 :
                // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1:453: T__111
                {
                mT__111(); 

                }
                break;
            case 74 :
                // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1:460: T__112
                {
                mT__112(); 

                }
                break;
            case 75 :
                // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1:467: T__113
                {
                mT__113(); 

                }
                break;
            case 76 :
                // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1:474: T__114
                {
                mT__114(); 

                }
                break;
            case 77 :
                // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1:481: T__115
                {
                mT__115(); 

                }
                break;
            case 78 :
                // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1:488: T__116
                {
                mT__116(); 

                }
                break;
            case 79 :
                // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1:495: RULE_HEADER_NAME
                {
                mRULE_HEADER_NAME(); 

                }
                break;
            case 80 :
                // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1:512: RULE_KEYWORD
                {
                mRULE_KEYWORD(); 

                }
                break;
            case 81 :
                // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1:525: RULE_PREPROCESSING_OP_OR_PUNC
                {
                mRULE_PREPROCESSING_OP_OR_PUNC(); 

                }
                break;
            case 82 :
                // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1:555: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 83 :
                // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1:563: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 84 :
                // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1:572: RULE_CHARACTER_LITERAL
                {
                mRULE_CHARACTER_LITERAL(); 

                }
                break;
            case 85 :
                // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1:595: RULE_FLOATING_LITERAL
                {
                mRULE_FLOATING_LITERAL(); 

                }
                break;
            case 86 :
                // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1:617: RULE_STRING_LITERAL
                {
                mRULE_STRING_LITERAL(); 

                }
                break;
            case 87 :
                // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1:637: RULE_PP_NUMBER
                {
                mRULE_PP_NUMBER(); 

                }
                break;
            case 88 :
                // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1:652: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 89 :
                // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1:664: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 90 :
                // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1:680: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 91 :
                // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1:696: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 92 :
                // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1:704: RULE_ANY_OTHER
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
            return "7594:16: ( 'alignas' | 'alignof' | 'asm' | 'auto' | 'bool' | 'break' | 'case' | 'catch' | 'char' | 'char16_t' | 'char32_t' | 'class' | 'const' | 'constexpr' | 'const_cast' | 'continue' | 'decltype' | 'default' | 'delete' | 'do' | 'double' | 'dynamic_cast' | 'else' | 'enum' | 'explicit' | 'export' | 'extern' | 'false' | 'float' | 'for' | 'friend' | 'goto' | 'if' | 'inline' | 'int' | 'long' | 'mutable' | 'namespace' | 'new' | 'noexcept' | 'nullptr' | 'operator' | 'private' | 'protected' | 'public' | 'register' | 'reinterpret_cast' | 'return' | 'short' | 'signed' | 'sizeof' | 'static' | 'static_assert' | 'static_cast' | 'struct' | 'switch' | 'template' | 'this' | 'thread_local' | 'throw' | 'true' | 'try' | 'typedef' | 'typeid' | 'typename' | 'union' | 'unsigned' | 'using' | 'virtual' | 'void' | 'volatile' | 'wchar_t' | 'while' )";
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
            return "7596:33: ( '{' | '}' | '[' | ']' | '#' | '##' | '(' | ')' | '<:' | ':>' | '<%' | '%>' | '%:' | '%:%:' | ';' | ':' | '...' | 'new' | 'delete' | '?' | '::' | '.' | '.*' | '+' | '-' | '*' | '/' | '%' | '^' | '&' | '|' | '~' | '!' | '=' | '<' | '>' | '+=' | '-=' | '*=' | '/=' | '%=' | '^=' | '&=' | '|=' | '<<' | '>>' | '<<=' | '>>=' | '==' | '!=' | '<=' | '>=' | '&&' | '||' | '++' | '--' | ',' | '->*' | '->' | 'and' | 'and_eq' | 'bitand' | 'bitor' | 'compl' | 'not' | 'not_eq' | 'or' | 'or_eq' | 'xor' | 'xor_eq' )";
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
            return "7630:25: ( RULE_FRACTIONAL_CONSTANT ( RULE_EXPONENT_PART )? | ( RULE_DIGIT )+ RULE_EXPONENT_PART )";
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
            return "7632:37: ( ( RULE_DIGIT )* '.' ( RULE_DIGIT )+ | ( RULE_DIGIT )+ '.' )";
        }
    }
    static final String DFA48_eotS =
        "\1\uffff\14\102\1\140\2\102\1\152\1\156\1\160\1\164\1\167\1\171"+
        "\1\174\1\uffff\1\177\1\u0081\1\u0087\1\u008a\1\uffff\1\u008d\1\u008f"+
        "\2\166\1\uffff\1\102\1\uffff\1\102\1\u009b\13\102\5\uffff\2\102"+
        "\1\76\2\u00b7\1\uffff\1\76\2\uffff\3\102\1\uffff\13\102\2\uffff"+
        "\16\102\3\uffff\5\102\1\u00f3\1\102\5\uffff\1\u00fa\24\uffff\1\u0104"+
        "\1\u0105\2\166\2\uffff\1\u0107\10\uffff\1\u010a\2\uffff\4\102\1"+
        "\uffff\1\102\1\166\4\uffff\7\102\1\u00f3\20\102\1\uffff\1\u010a"+
        "\1\u00b7\1\u00bb\1\uffff\3\u00b7\2\u00bb\1\u00b7\1\u00bb\3\uffff"+
        "\20\102\1\u00f3\6\102\1\u00f3\12\102\2\uffff\1\u016a\2\102\1\166"+
        "\5\102\1\uffff\1\102\16\uffff\1\u0175\7\uffff\1\u010a\1\u00bb\1"+
        "\u010a\1\uffff\1\102\1\u00f3\1\102\1\166\2\102\1\u0086\7\uffff\11"+
        "\102\1\u00f3\23\102\1\166\1\u00bb\1\u010a\10\u00b7\3\uffff\17\102"+
        "\1\u01be\4\102\1\u00f3\10\102\2\u00f3\1\102\1\u00f3\1\102\1\uffff"+
        "\11\102\4\uffff\1\u00bb\1\u010a\1\102\1\u00f3\3\102\15\uffff\1\u00f3"+
        "\3\102\2\u00f3\3\102\1\u00f3\1\102\1\u00f3\23\102\2\u00b7\1\uffff"+
        "\20\102\1\uffff\4\102\1\u0217\1\102\1\u0219\1\u00f3\1\102\1\u021d"+
        "\1\102\1\166\1\u021f\1\u0220\20\102\1\166\3\uffff\1\u0086\1\uffff"+
        "\1\u0086\4\uffff\1\u00f3\1\102\1\166\13\102\1\u00f3\5\102\1\u00f3"+
        "\1\102\1\u00f3\1\102\1\u00f3\1\102\1\uffff\4\102\1\u0250\15\102"+
        "\1\u00f3\1\102\1\uffff\1\102\1\uffff\1\u00f3\2\102\1\uffff\1\102"+
        "\2\uffff\6\102\1\166\1\102\1\u026a\2\102\1\u00f3\3\102\1\166\1\102"+
        "\4\uffff\1\166\1\102\3\u00f3\3\102\1\u00f3\2\102\6\u00f3\2\102\1"+
        "\166\1\uffff\5\102\1\uffff\14\102\1\u00f3\10\102\1\u00f3\1\u0298"+
        "\2\102\1\uffff\1\102\1\u00f3\1\102\1\u029d\1\u00f3\1\102\4\uffff"+
        "\1\102\2\u00f3\5\102\1\u00f3\1\uffff\20\102\1\u02b9\1\u02ba\3\102"+
        "\3\u00f3\1\u02be\1\uffff\1\u02bf\1\102\1\u00f3\1\102\1\uffff\1\u02c2"+
        "\3\uffff\1\u00f3\1\102\1\u00f3\3\102\1\u00f3\3\102\1\u02cd\14\102"+
        "\2\uffff\1\102\1\u00f3\1\102\2\uffff\1\u00f3\1\102\4\uffff\1\u00f3"+
        "\6\102\1\uffff\1\u02e4\14\102\1\u00f3\1\102\1\uffff\6\102\1\uffff"+
        "\3\102\1\u02fc\1\102\1\u02fe\7\102\1\uffff\2\102\1\u00f3\5\102\1"+
        "\u030d\1\uffff\1\102\1\uffff\5\102\2\u00f3\5\102\1\u0319\1\102\1"+
        "\uffff\5\102\1\u0320\1\102\1\u00f3\3\102\1\uffff\6\102\1\uffff\3"+
        "\102\1\u032e\11\102\1\uffff\6\102\1\u00f3\1\102\1\u033f\6\102\1"+
        "\u0346\1\uffff\5\102\1\u034c\1\uffff\2\102\1\u034f\1\102\1\u0351"+
        "\1\uffff\1\102\1\u0354\1\uffff\1\u0355\1\uffff\1\u0356\1\102\3\uffff"+
        "\4\102\1\u035c\1\uffff";
    static final String DFA48_eofS =
        "\u035d\uffff";
    static final String DFA48_minS =
        "\1\0\1\154\1\162\1\144\1\141\2\145\1\142\1\42\1\145\2\141\1\151"+
        "\1\46\1\141\1\145\1\53\1\55\1\75\1\52\1\72\2\75\1\uffff\2\75\1\0"+
        "\1\75\1\uffff\1\51\1\135\1\56\1\72\1\uffff\1\154\1\uffff\1\160\1"+
        "\0\1\151\1\154\1\157\1\146\1\157\1\165\1\162\1\145\1\150\1\42\1"+
        "\143\5\uffff\1\157\1\42\1\125\2\56\1\uffff\1\0\2\uffff\1\155\1\157"+
        "\1\141\1\uffff\1\160\1\141\1\105\1\151\1\162\1\143\2\163\1\151\1"+
        "\163\1\161\2\uffff\1\165\1\160\1\155\1\151\1\154\1\157\1\162\1\151"+
        "\1\155\1\141\1\163\1\141\1\151\1\162\3\uffff\1\167\1\154\1\145\1"+
        "\155\1\143\1\60\1\156\5\uffff\1\52\24\uffff\4\0\2\uffff\1\75\7\uffff"+
        "\2\56\2\uffff\1\151\1\155\1\164\1\144\1\uffff\1\145\1\60\1\uffff"+
        "\2\0\1\uffff\1\157\1\145\1\164\1\163\1\165\1\160\1\164\1\60\1\154"+
        "\1\156\1\164\1\151\1\142\1\147\1\157\1\147\1\141\3\151\1\42\1\150"+
        "\1\151\1\162\1\uffff\2\56\1\53\1\uffff\3\56\2\60\2\56\1\42\1\0\1"+
        "\uffff\1\163\1\160\1\162\1\163\1\145\1\151\1\170\1\164\1\141\1\154"+
        "\1\164\1\151\1\147\1\164\1\165\1\145\1\60\1\145\1\160\1\145\2\163"+
        "\1\141\1\60\1\145\1\163\1\160\1\163\1\143\1\145\1\162\1\141\1\144"+
        "\1\164\2\uffff\1\60\1\154\1\170\1\60\2\145\1\154\1\141\1\142\1\uffff"+
        "\1\141\16\uffff\1\0\7\uffff\1\56\1\53\1\56\1\uffff\1\147\1\60\1"+
        "\157\1\60\1\162\1\145\7\0\1\uffff\1\154\2\141\1\145\1\155\1\154"+
        "\1\145\1\157\1\151\1\60\1\147\1\141\1\166\1\164\1\154\1\151\1\156"+
        "\1\165\1\162\1\156\1\145\1\164\1\165\1\164\1\157\1\151\1\156\1\141"+
        "\1\154\2\60\7\56\1\53\1\56\2\0\1\uffff\1\164\1\157\1\111\1\163\1"+
        "\111\1\154\1\160\1\151\1\155\1\141\1\145\1\147\1\156\1\162\1\141"+
        "\1\60\1\144\1\154\1\167\1\141\1\60\1\145\1\164\1\156\1\164\1\151"+
        "\1\154\1\163\1\150\2\60\1\164\1\60\1\165\1\uffff\1\160\1\143\1\145"+
        "\1\163\2\164\1\165\1\154\1\155\4\uffff\1\60\1\56\1\156\1\60\1\145"+
        "\1\141\1\161\1\uffff\1\42\1\0\1\uffff\3\0\1\uffff\5\0\1\60\1\153"+
        "\1\156\1\162\2\60\1\151\2\162\1\60\1\156\1\60\1\142\1\141\1\145"+
        "\1\151\1\163\1\164\1\162\1\164\1\145\1\157\1\151\2\143\1\156\2\147"+
        "\1\162\2\145\2\56\1\0\1\141\1\165\1\156\1\116\1\144\1\160\1\151"+
        "\1\162\1\141\1\145\1\162\1\144\1\156\1\155\1\141\1\154\1\uffff\1"+
        "\141\1\145\1\144\1\141\1\60\1\144\2\60\1\144\1\60\1\156\3\60\1\66"+
        "\1\62\1\151\1\141\1\164\1\145\1\161\1\160\1\145\1\171\1\154\1\145"+
        "\1\151\1\141\1\161\1\164\1\60\12\0\1\60\1\144\1\60\1\143\1\164\1"+
        "\156\1\145\1\154\1\164\2\143\1\164\1\145\1\156\1\60\1\144\1\146"+
        "\1\143\1\164\1\150\1\60\1\156\1\60\1\137\1\60\1\161\1\0\2\156\1"+
        "\151\1\141\1\60\1\145\1\156\1\145\1\154\1\164\1\141\1\116\1\155"+
        "\1\145\1\143\1\151\1\155\1\146\1\60\1\164\1\uffff\1\137\1\uffff"+
        "\1\60\1\170\1\143\1\uffff\1\165\2\uffff\2\137\2\154\1\162\1\160"+
        "\1\60\1\141\1\60\1\160\1\164\1\60\1\143\1\163\1\146\1\60\1\157\4"+
        "\0\1\60\1\151\3\60\2\145\1\164\1\60\1\145\1\162\6\60\1\145\1\164"+
        "\1\60\1\0\1\164\1\144\1\164\1\155\1\151\1\uffff\1\143\1\147\1\163"+
        "\1\151\1\145\1\164\1\141\1\145\1\156\1\164\1\146\1\145\1\60\1\145"+
        "\1\154\1\160\1\141\1\145\2\164\1\145\2\60\1\164\1\143\1\uffff\1"+
        "\145\1\60\1\137\2\60\1\162\4\0\1\164\2\60\1\145\1\162\1\160\1\141"+
        "\1\144\1\60\1\0\1\105\1\123\1\151\1\145\1\163\1\151\1\124\1\163"+
        "\1\172\1\162\1\151\1\155\1\156\1\164\1\104\1\151\2\60\1\157\1\162"+
        "\1\163\4\60\1\uffff\1\60\1\145\1\60\1\143\1\uffff\1\60\3\0\1\60"+
        "\1\144\1\60\1\162\1\163\1\141\1\60\1\170\1\164\1\141\1\60\1\164"+
        "\1\146\1\171\1\151\1\145\1\104\1\157\1\145\1\164\1\105\2\145\2\uffff"+
        "\1\143\1\60\1\164\2\uffff\1\60\1\141\1\uffff\3\0\1\60\1\145\2\163"+
        "\1\160\1\141\1\154\1\uffff\1\60\1\151\1\160\1\157\1\162\1\145\1"+
        "\156\1\123\1\105\1\170\1\143\1\144\1\141\1\60\1\163\1\0\1\164\1"+
        "\145\1\164\1\162\1\164\1\151\1\uffff\2\145\1\156\1\60\1\143\1\60"+
        "\1\160\1\170\1\160\1\154\1\111\1\154\1\164\1\0\1\137\1\162\1\60"+
        "\2\145\1\172\1\162\1\123\1\60\1\uffff\1\154\1\uffff\1\145\1\160"+
        "\1\162\1\141\1\144\2\60\1\143\1\164\1\163\1\155\1\145\1\60\1\160"+
        "\1\uffff\1\141\1\143\1\162\1\145\1\162\1\60\1\141\1\60\1\163\1\145"+
        "\1\162\1\uffff\1\145\1\162\1\151\1\145\1\163\1\141\1\uffff\1\163"+
        "\1\151\1\156\1\60\1\143\1\141\1\146\2\163\2\164\1\157\1\164\1\uffff"+
        "\1\151\1\164\1\151\1\163\1\151\1\157\1\60\1\156\1\60\1\146\1\151"+
        "\1\145\1\151\1\157\1\162\1\60\1\uffff\1\151\1\157\1\162\1\157\1"+
        "\156\1\60\1\uffff\1\145\1\156\1\60\1\156\1\60\1\uffff\1\162\1\60"+
        "\1\uffff\1\60\1\uffff\1\60\1\154\3\uffff\1\141\1\165\1\163\1\145"+
        "\1\60\1\uffff";
    static final String DFA48_maxS =
        "\1\uffff\1\164\1\171\1\156\1\141\2\145\1\163\1\156\1\171\1\162"+
        "\2\157\1\75\1\165\1\171\1\75\1\76\2\75\1\76\1\75\1\174\1\uffff\2"+
        "\75\1\uffff\1\76\1\uffff\1\51\1\135\1\71\1\72\1\uffff\1\165\1\uffff"+
        "\1\162\1\uffff\1\162\1\170\1\157\1\156\1\157\2\165\1\145\1\167\1"+
        "\163\1\150\5\uffff\1\157\1\47\1\165\2\172\1\uffff\1\uffff\2\uffff"+
        "\1\156\1\157\1\141\1\uffff\1\160\1\141\1\105\1\151\1\162\1\143\2"+
        "\163\1\151\1\163\1\161\2\uffff\1\171\1\160\1\155\1\162\1\154\1\157"+
        "\1\162\1\151\1\156\1\141\1\164\1\141\1\154\1\162\3\uffff\1\167\1"+
        "\154\1\164\1\155\1\154\1\172\1\156\5\uffff\1\52\24\uffff\4\uffff"+
        "\2\uffff\1\75\7\uffff\1\56\1\172\2\uffff\1\151\1\155\1\164\1\144"+
        "\1\uffff\1\145\1\172\1\uffff\2\uffff\1\uffff\1\157\1\145\1\164\1"+
        "\163\1\165\2\164\1\172\1\164\1\156\1\164\1\157\1\142\1\164\1\157"+
        "\1\172\1\162\1\151\1\163\1\151\1\42\1\150\1\151\1\162\1\uffff\2"+
        "\172\1\71\1\uffff\3\172\2\106\1\172\1\145\1\170\1\uffff\1\uffff"+
        "\1\163\1\160\1\162\1\163\1\145\1\151\1\170\1\164\1\141\1\154\1\164"+
        "\1\151\1\147\1\164\1\165\1\145\1\172\1\145\1\160\1\157\2\163\1\141"+
        "\1\172\1\145\1\164\1\160\1\163\1\143\1\145\1\162\1\141\1\144\1\164"+
        "\2\uffff\1\172\1\154\1\170\1\172\2\145\1\154\1\141\1\142\1\uffff"+
        "\1\141\16\uffff\1\uffff\7\uffff\1\172\1\71\1\172\1\uffff\1\147\1"+
        "\172\1\157\1\172\1\162\1\145\7\uffff\1\uffff\1\154\1\141\1\157\1"+
        "\145\1\155\1\157\1\145\1\157\1\151\1\172\1\147\1\141\1\166\1\164"+
        "\1\154\1\151\1\156\1\165\1\162\1\156\1\145\1\164\1\165\1\164\1\157"+
        "\1\151\1\156\1\141\1\154\1\172\1\71\11\172\2\uffff\1\uffff\1\164"+
        "\1\157\1\111\1\163\1\123\1\154\1\160\1\151\1\155\1\141\1\145\1\147"+
        "\1\156\1\162\1\141\1\172\1\156\1\154\1\167\1\141\1\172\1\145\1\164"+
        "\1\156\1\164\1\151\1\154\1\163\1\150\2\172\1\164\1\172\1\165\1\uffff"+
        "\1\160\1\143\1\145\1\163\2\164\1\165\1\154\1\155\4\uffff\1\71\1"+
        "\172\1\156\1\172\1\145\1\141\1\161\1\uffff\1\170\1\uffff\1\uffff"+
        "\3\uffff\1\uffff\5\uffff\1\172\1\153\1\156\1\162\2\172\1\151\2\162"+
        "\1\172\1\156\1\172\1\142\1\141\1\145\1\151\1\163\1\164\1\162\1\164"+
        "\1\145\1\157\1\151\2\143\1\156\2\147\1\162\2\145\2\172\1\uffff\1"+
        "\141\1\165\1\156\1\116\1\144\1\160\1\151\1\162\1\141\1\145\1\162"+
        "\1\144\1\156\1\155\1\141\1\154\1\uffff\1\141\1\145\1\144\1\141\1"+
        "\172\1\144\2\172\1\144\1\172\1\156\3\172\1\66\1\62\1\151\1\141\1"+
        "\164\1\145\1\161\1\160\1\145\1\171\1\154\1\145\1\151\1\157\1\161"+
        "\1\164\1\172\12\uffff\1\172\1\144\1\172\1\143\1\164\1\156\1\145"+
        "\1\154\1\164\2\143\1\164\1\145\1\156\1\172\1\144\1\146\1\143\1\164"+
        "\1\150\1\172\1\156\1\172\1\137\1\172\1\161\1\uffff\2\156\1\151\1"+
        "\141\1\172\1\145\1\156\1\145\1\154\1\164\1\141\1\116\1\155\1\145"+
        "\1\143\1\151\1\155\1\146\1\172\1\164\1\uffff\1\137\1\uffff\1\172"+
        "\1\170\1\143\1\uffff\1\165\2\uffff\2\137\2\154\1\162\1\160\1\172"+
        "\1\141\1\172\1\160\1\164\1\172\1\143\1\163\1\146\1\172\1\157\4\uffff"+
        "\1\172\1\151\3\172\2\145\1\164\1\172\1\145\1\162\6\172\1\145\1\164"+
        "\1\172\1\uffff\1\164\1\144\1\164\1\155\1\151\1\uffff\1\143\1\147"+
        "\1\163\1\151\1\145\1\164\1\141\1\145\1\156\1\164\1\146\1\145\1\172"+
        "\1\145\1\154\1\160\1\141\1\145\2\164\1\145\2\172\1\164\1\143\1\uffff"+
        "\1\145\1\172\1\137\2\172\1\162\4\uffff\1\164\2\172\1\145\1\162\1"+
        "\160\1\143\1\144\1\172\1\uffff\1\105\1\123\1\151\1\145\1\163\1\151"+
        "\1\124\1\163\1\172\1\162\1\151\1\155\1\156\1\164\1\104\1\151\2\172"+
        "\1\157\1\162\1\163\4\172\1\uffff\1\172\1\145\1\172\1\143\1\uffff"+
        "\1\172\3\uffff\1\172\1\144\1\172\1\162\1\163\1\141\1\172\1\170\1"+
        "\164\1\141\1\172\1\164\1\146\1\171\1\151\1\145\1\104\1\157\1\145"+
        "\1\164\1\105\2\145\2\uffff\1\143\1\172\1\164\2\uffff\1\172\1\141"+
        "\1\uffff\3\uffff\1\172\1\145\2\163\1\160\1\141\1\154\1\uffff\1\172"+
        "\1\151\1\160\1\157\1\162\1\145\1\156\1\123\1\105\1\170\1\143\1\144"+
        "\1\141\1\172\1\163\1\uffff\1\164\1\145\1\164\1\162\1\164\1\151\1"+
        "\uffff\2\145\1\156\1\172\1\143\1\172\1\160\1\170\1\160\1\154\1\111"+
        "\1\154\1\164\1\uffff\1\137\1\162\1\172\2\145\1\172\1\162\1\123\1"+
        "\172\1\uffff\1\154\1\uffff\1\145\1\160\1\162\1\141\1\144\2\172\1"+
        "\143\1\164\1\163\1\155\1\145\1\172\1\160\1\uffff\1\141\1\143\1\162"+
        "\1\145\1\162\1\172\1\141\1\172\1\163\1\145\1\162\1\uffff\1\145\1"+
        "\162\1\151\1\145\1\163\1\141\1\uffff\1\163\1\151\1\156\1\172\1\143"+
        "\1\141\1\146\2\163\2\164\1\157\1\164\1\uffff\1\151\1\164\1\151\1"+
        "\163\1\151\1\157\1\172\1\156\1\172\1\146\1\151\1\145\1\151\1\157"+
        "\1\162\1\172\1\uffff\1\151\1\157\1\162\1\157\1\156\1\172\1\uffff"+
        "\1\145\1\156\1\172\1\156\1\172\1\uffff\1\162\1\172\1\uffff\1\172"+
        "\1\uffff\1\172\1\154\3\uffff\1\141\1\165\1\163\1\145\1\172\1\uffff";
    static final String DFA48_acceptS =
        "\27\uffff\1\42\4\uffff\1\72\4\uffff\1\103\1\uffff\1\106\15\uffff"+
        "\5\121\5\uffff\1\122\1\uffff\1\133\1\134\3\uffff\1\122\13\uffff"+
        "\1\126\1\124\16\uffff\1\30\1\55\1\27\7\uffff\1\47\1\70\1\33\1\50"+
        "\1\71\1\uffff\1\34\1\51\1\35\1\52\1\131\1\132\1\36\1\53\1\121\1"+
        "\37\1\54\1\40\1\56\1\67\1\41\1\42\1\64\1\43\1\63\1\44\4\uffff\1"+
        "\117\1\45\1\uffff\1\66\1\46\1\72\1\75\1\105\1\76\1\102\2\uffff\1"+
        "\101\1\103\4\uffff\1\106\2\uffff\1\110\2\uffff\1\130\30\uffff\1"+
        "\123\3\uffff\1\127\11\uffff\1\133\42\uffff\1\30\1\55\11\uffff\1"+
        "\120\1\uffff\1\47\1\70\1\50\1\71\1\73\1\74\1\51\1\52\1\53\1\54\1"+
        "\56\1\67\1\64\1\63\1\uffff\1\57\1\65\1\61\1\60\1\66\1\77\1\125\3"+
        "\uffff\1\101\15\uffff\1\117\52\uffff\1\124\42\uffff\1\31\11\uffff"+
        "\1\73\1\62\1\61\1\77\7\uffff\1\126\2\uffff\1\117\3\uffff\1\117\67"+
        "\uffff\1\23\130\uffff\1\115\1\uffff\1\24\3\uffff\1\25\1\uffff\1"+
        "\111\1\114\57\uffff\1\2\31\uffff\1\32\55\uffff\1\100\4\uffff\1\104"+
        "\33\uffff\1\112\1\113\3\uffff\1\26\1\116\2\uffff\1\107\12\uffff"+
        "\1\21\26\uffff\1\15\27\uffff\1\22\1\uffff\1\5\16\uffff\1\3\13\uffff"+
        "\1\11\6\uffff\1\16\15\uffff\1\14\20\uffff\1\13\6\uffff\1\1\5\uffff"+
        "\1\12\2\uffff\1\6\1\uffff\1\10\2\uffff\1\4\1\7\1\20\5\uffff\1\17";
    static final String DFA48_specialS =
        "\1\70\31\uffff\1\43\12\uffff\1\11\26\uffff\1\52\105\uffff\1\12"+
        "\1\32\1\51\1\50\26\uffff\1\10\1\62\46\uffff\1\55\76\uffff\1\35\21"+
        "\uffff\1\73\1\31\1\56\1\0\1\34\1\63\1\66\51\uffff\1\60\1\42\72\uffff"+
        "\1\47\1\uffff\1\17\1\65\1\53\1\uffff\1\4\1\72\1\3\1\26\1\67\41\uffff"+
        "\1\44\60\uffff\1\1\1\57\1\16\1\41\1\54\1\64\1\33\1\2\1\20\1\61\32"+
        "\uffff\1\45\57\uffff\1\36\1\15\1\27\1\23\24\uffff\1\46\46\uffff"+
        "\1\37\1\13\1\21\1\7\11\uffff\1\14\40\uffff\1\40\1\24\1\30\41\uffff"+
        "\1\71\1\5\1\22\27\uffff\1\25\24\uffff\1\6\152\uffff}>";
    static final String[] DFA48_transitionS = {
            "\11\76\2\75\2\76\1\75\22\76\1\75\1\30\1\45\1\63\1\76\1\24\1"+
            "\15\1\74\1\35\1\43\1\22\1\20\1\34\1\21\1\37\1\23\1\72\11\71"+
            "\1\40\1\64\1\32\1\31\1\33\1\65\1\76\1\7\1\73\1\1\1\5\4\73\1"+
            "\3\2\73\1\67\1\73\1\6\1\73\1\4\3\73\1\2\1\10\5\73\1\36\1\70"+
            "\1\41\1\25\1\73\1\76\1\42\1\46\1\13\1\17\1\47\1\12\1\50\1\73"+
            "\1\51\2\73\1\52\1\53\1\16\1\44\1\54\1\73\1\55\1\56\1\11\1\57"+
            "\1\14\1\60\1\66\2\73\1\61\1\26\1\62\1\27\uff81\76",
            "\1\101\2\uffff\1\77\4\uffff\1\100",
            "\1\104\6\uffff\1\103",
            "\1\105\11\uffff\1\106",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\114\11\uffff\1\113\6\uffff\1\112",
            "\1\116\4\uffff\1\117\106\uffff\1\115",
            "\1\122\2\uffff\1\123\11\uffff\1\120\6\uffff\1\121",
            "\1\124\12\uffff\1\125\2\uffff\1\126\2\uffff\1\127",
            "\1\132\6\uffff\1\133\3\uffff\1\131\2\uffff\1\130",
            "\1\135\5\uffff\1\134",
            "\1\136\26\uffff\1\137",
            "\1\144\3\uffff\1\141\11\uffff\1\143\5\uffff\1\142",
            "\1\145\11\uffff\1\146\11\uffff\1\147",
            "\1\151\21\uffff\1\150",
            "\1\154\17\uffff\1\153\1\155",
            "\1\157",
            "\1\162\4\uffff\1\163\15\uffff\1\161",
            "\1\166\2\uffff\1\165\1\166",
            "\1\170",
            "\1\172\76\uffff\1\173",
            "",
            "\1\176",
            "\1\u0080",
            "\12\u0086\1\uffff\32\u0086\1\u0085\24\u0086\1\u0084\1\u0086"+
            "\1\u0082\1\u0083\1\uffff\uffc1\u0086",
            "\1\u0089\1\u0088",
            "",
            "\1\u008c",
            "\1\u008e",
            "\1\u0090\1\uffff\12\u0091",
            "\1\u0092",
            "",
            "\1\u0094\1\uffff\1\u0097\4\uffff\1\u0095\1\uffff\1\u0096",
            "",
            "\1\u0099\1\uffff\1\u009a",
            "\12\u009d\1\u009e\27\u009d\1\u009e\71\u009d\1\u009c\uffa3"+
            "\u009d",
            "\1\u00a1\5\uffff\1\u009f\2\uffff\1\u00a0",
            "\1\u00a2\1\uffff\1\u00a3\11\uffff\1\u00a4",
            "\1\u00a5",
            "\1\u00a6\7\uffff\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa\2\uffff\1\u00ab",
            "\1\u00ac",
            "\1\u00ad\1\u00ae\12\uffff\1\u00af\2\uffff\1\u00b0",
            "\1\116\4\uffff\1\117\20\uffff\1\u00b3\65\uffff\1\u00b1\4\uffff"+
            "\1\u00b2",
            "\1\u00b4\4\uffff\1\u00b5",
            "",
            "",
            "",
            "",
            "",
            "\1\u00b6",
            "\1\116\4\uffff\1\117",
            "\1\102\37\uffff\1\102",
            "\1\u00b8\1\uffff\12\u00b9\7\uffff\4\u00bb\1\u00ba\6\u00bb"+
            "\1\u00be\10\u00bb\1\u00bc\5\u00bb\1\uffff\1\u00bb\2\uffff\1"+
            "\u00bb\1\uffff\4\u00bb\1\u00ba\6\u00bb\1\u00bd\10\u00bb\1\u00bc"+
            "\5\u00bb",
            "\1\u00b8\1\uffff\10\u00c1\2\u00c2\7\uffff\4\u00bb\1\u00ba"+
            "\6\u00bb\1\u00be\10\u00bb\1\u00bc\2\u00bb\1\u00c0\2\u00bb\1"+
            "\uffff\1\u00bb\2\uffff\1\u00bb\1\uffff\4\u00bb\1\u00ba\6\u00bb"+
            "\1\u00bd\10\u00bb\1\u00bc\2\u00bb\1\u00bf\2\u00bb",
            "",
            "\12\u00c4\1\u009e\34\u00c4\1\u009e\64\u00c4\1\u00c3\uffa3"+
            "\u00c4",
            "",
            "",
            "\1\u00c7\1\u00c6",
            "\1\u00c8",
            "\1\u00c9",
            "",
            "\1\u00ca",
            "\1\u00cb",
            "\1\u00cc",
            "\1\u00cd",
            "\1\u00ce",
            "\1\u00cf",
            "\1\u00d0",
            "\1\u00d1",
            "\1\u00d2",
            "\1\u00d3",
            "\1\u00d4",
            "",
            "",
            "\1\u00d5\3\uffff\1\u00d6",
            "\1\u00d7",
            "\1\u00d8",
            "\1\u00da\10\uffff\1\u00d9",
            "\1\u00db",
            "\1\u00dc",
            "\1\u00dd",
            "\1\u00de",
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
            "\1\u00eb",
            "\1\u00ec\16\uffff\1\u00ed",
            "\1\u00ee",
            "\1\u00f0\2\uffff\1\u00f1\5\uffff\1\u00ef",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\102\1\uffff"+
            "\24\102\1\u00f2\5\102",
            "\1\u00f4",
            "",
            "",
            "",
            "",
            "",
            "\1\u00f9",
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
            "\12\u0086\1\uffff\62\u0086\1\u0103\uffc2\u0086",
            "\12\u0086\1\uffff\ufff5\u0086",
            "\12\u0086\1\uffff\ufff5\u0086",
            "\12\u0086\1\uffff\ufff5\u0086",
            "",
            "",
            "\1\u0106",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0109",
            "\1\u00bb\1\uffff\12\u010b\7\uffff\4\u00bb\1\u010c\1\u010d"+
            "\5\u00bb\1\u010d\16\u00bb\1\uffff\1\u00bb\2\uffff\1\u00bb\1"+
            "\uffff\4\u00bb\1\u010c\1\u010d\5\u00bb\1\u010d\16\u00bb",
            "",
            "",
            "\1\u010f",
            "\1\u0110",
            "\1\u0111",
            "\1\u0112",
            "",
            "\1\u0113",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\u0114\1\uffff"+
            "\32\102",
            "",
            "\12\u0086\1\uffff\27\u0086\1\u0115\4\u0086\1\u011a\10\u0086"+
            "\10\u011b\7\u0086\1\u0117\25\u0086\1\u0119\6\u0086\1\u011a\4"+
            "\u0086\1\u0117\1\u011a\3\u0086\1\u011a\7\u0086\1\u011a\3\u0086"+
            "\1\u011a\1\u0086\1\u011a\1\u0116\1\u0117\1\u0086\1\u0118\uff87"+
            "\u0086",
            "\12\u009d\1\u009e\27\u009d\1\u011c\71\u009d\1\u009c\uffa3"+
            "\u009d",
            "",
            "\1\u011d",
            "\1\u011e",
            "\1\u011f",
            "\1\u0120",
            "\1\u0121",
            "\1\u0122\3\uffff\1\u0123",
            "\1\u0124",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\102\1\uffff"+
            "\32\102",
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
            "\1\116",
            "\1\u0138",
            "\1\u0139",
            "\1\u013a",
            "",
            "\1\u00bb\1\uffff\12\u010b\7\uffff\4\u00bb\1\u010c\1\u010d"+
            "\5\u00bb\1\u010d\16\u00bb\1\uffff\1\u00bb\2\uffff\1\u00bb\1"+
            "\uffff\4\u00bb\1\u010c\1\u010d\5\u00bb\1\u010d\16\u00bb",
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
            "\1\u0145\4\uffff\1\u0145\10\uffff\10\117\7\uffff\1\117\25"+
            "\uffff\1\117\6\uffff\1\u0145\4\uffff\1\117\1\u0145\3\uffff\1"+
            "\u0145\7\uffff\1\u0145\3\uffff\1\u0145\1\uffff\1\u0145\1\u0146"+
            "\1\117\1\uffff\1\117",
            "\12\u00c4\1\u009e\34\u00c4\1\u0147\64\u00c4\1\u00c3\uffa3"+
            "\u00c4",
            "",
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
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\102\1\uffff"+
            "\32\102",
            "\1\u0158",
            "\1\u0159",
            "\1\u015b\11\uffff\1\u015a",
            "\1\u015c",
            "\1\u015d",
            "\1\u015e",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\102\1\uffff"+
            "\32\102",
            "\1\u015f",
            "\1\u0160\1\u0161",
            "\1\u0162",
            "\1\u0163",
            "\1\u0164",
            "\1\u0165",
            "\1\u0166",
            "\1\u0167",
            "\1\u0168",
            "\1\u0169",
            "",
            "",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\102\1\uffff"+
            "\32\102",
            "\1\u016b",
            "\1\u016c",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\u016d\1\uffff"+
            "\32\102",
            "\1\u016e",
            "\1\u016f",
            "\1\u0170",
            "\1\u0171",
            "\1\u0172",
            "",
            "\1\u0173",
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
            "\12\u0086\1\uffff\ufff5\u0086",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00bb\1\uffff\12\u010b\7\uffff\4\u00bb\1\u010c\1\u010d"+
            "\5\u00bb\1\u010d\16\u00bb\1\uffff\1\u00bb\2\uffff\1\u00bb\1"+
            "\uffff\4\u00bb\1\u010c\1\u010d\5\u00bb\1\u010d\16\u00bb",
            "\1\u0178\1\uffff\1\u0178\2\uffff\12\u0179",
            "\1\u00bb\1\uffff\12\u00bb\7\uffff\32\u00bb\1\uffff\1\u00bb"+
            "\2\uffff\1\u00bb\1\uffff\32\u00bb",
            "",
            "\1\u017a",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\102\1\uffff"+
            "\32\102",
            "\1\u017b",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\u017c\1\uffff"+
            "\32\102",
            "\1\u017d",
            "\1\u017e",
            "\12\u0181\1\u009e\27\u0181\1\u017f\71\u0181\1\u0180\uffa3"+
            "\u0181",
            "\12\u0185\1\u009e\27\u0185\1\u0182\15\u0185\12\u0183\7\u0185"+
            "\6\u0183\25\u0185\1\u0184\uffa3\u0185",
            "\12\u0187\1\uffff\27\u0187\1\u0186\71\u0187\1\u0188\uffa3"+
            "\u0187",
            "\12\u0086\1\uffff\45\u0086\12\u0189\7\u0086\6\u0189\uffb9"+
            "\u0086",
            "\12\u0086\1\uffff\45\u0086\12\u018a\7\u0086\6\u018a\uffb9"+
            "\u0086",
            "\12\u009d\1\u009e\27\u009d\1\u011c\71\u009d\1\u009c\uffa3"+
            "\u009d",
            "\12\u0086\1\uffff\45\u0086\10\u018b\uffc8\u0086",
            "",
            "\1\u018c",
            "\1\u018d",
            "\1\u018e\15\uffff\1\u018f",
            "\1\u0190",
            "\1\u0191",
            "\1\u0192\2\uffff\1\u0193",
            "\1\u0194",
            "\1\u0195",
            "\1\u0196",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\102\1\uffff"+
            "\32\102",
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
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\u01aa\1\uffff"+
            "\32\102",
            "\12\u013c",
            "\1\u00bb\1\uffff\12\u013c\7\uffff\5\u00bb\1\u010d\5\u00bb"+
            "\1\u010d\16\u00bb\1\uffff\1\u00bb\2\uffff\1\u00bb\1\uffff\5"+
            "\u00bb\1\u010d\5\u00bb\1\u010d\16\u00bb",
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
            "\12\u00c4\1\u009e\34\u00c4\1\u0147\64\u00c4\1\u00c3\uffa3"+
            "\u00c4",
            "\60\u009e\12\u01ad\7\u009e\6\u01ad\uffb9\u009e",
            "",
            "\1\u01ae",
            "\1\u01af",
            "\1\u01b0",
            "\1\u01b1",
            "\1\u01b2\11\uffff\1\u01b3",
            "\1\u01b4",
            "\1\u01b5",
            "\1\u01b6",
            "\1\u01b7",
            "\1\u01b8",
            "\1\u01b9",
            "\1\u01ba",
            "\1\u01bb",
            "\1\u01bc",
            "\1\u01bd",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\102\1\uffff"+
            "\32\102",
            "\1\u01c0\4\uffff\1\u01c1\4\uffff\1\u01bf",
            "\1\u01c2",
            "\1\u01c3",
            "\1\u01c4",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\102\1\uffff"+
            "\32\102",
            "\1\u01c5",
            "\1\u01c6",
            "\1\u01c7",
            "\1\u01c8",
            "\1\u01c9",
            "\1\u01ca",
            "\1\u01cb",
            "\1\u01cc",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\102\1\uffff"+
            "\32\102",
            "\1\102\1\u01cd\1\102\1\u01ce\6\102\7\uffff\32\102\1\uffff"+
            "\1\102\2\uffff\1\102\1\uffff\32\102",
            "\1\u01cf",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\102\1\uffff"+
            "\32\102",
            "\1\u01d0",
            "",
            "\1\u01d1",
            "\1\u01d2",
            "\1\u01d3",
            "\1\u01d4",
            "\1\u01d5",
            "\1\u01d6",
            "\1\u01d7",
            "\1\u01d8",
            "\1\u01d9",
            "",
            "",
            "",
            "",
            "\12\u0179",
            "\1\u00bb\1\uffff\12\u0179\7\uffff\5\u00bb\1\u010d\5\u00bb"+
            "\1\u010d\16\u00bb\1\uffff\1\u00bb\2\uffff\1\u00bb\1\uffff\5"+
            "\u00bb\1\u010d\5\u00bb\1\u010d\16\u00bb",
            "\1\u01da",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\102\1\uffff"+
            "\32\102",
            "\1\u01db",
            "\1\u01dc",
            "\1\u01dd",
            "",
            "\1\u01de\4\uffff\1\u01de\10\uffff\10\116\7\uffff\1\116\25"+
            "\uffff\1\116\6\uffff\1\u01de\4\uffff\1\116\1\u01de\3\uffff\1"+
            "\u01de\7\uffff\1\u01de\3\uffff\1\u01de\1\uffff\1\u01de\1\u01df"+
            "\1\116\1\uffff\1\116",
            "\12\u0181\1\u009e\27\u0181\1\u017f\71\u0181\1\u0180\uffa3"+
            "\u0181",
            "",
            "\12\u0185\1\u009e\27\u0185\1\u0182\15\u0185\12\u01e0\7\u0185"+
            "\6\u01e0\25\u0185\1\u0184\uffa3\u0185",
            "\12\u0086\1\uffff\27\u0086\1\u01e1\4\u0086\1\u01e2\64\u0086"+
            "\1\u01e2\5\u0086\1\u01e2\3\u0086\1\u01e2\7\u0086\1\u01e2\3\u0086"+
            "\1\u01e2\1\u0086\2\u01e2\uff8a\u0086",
            "\12\u0185\1\u009e\27\u0185\1\u0182\71\u0185\1\u0184\uffa3"+
            "\u0185",
            "",
            "\12\u0187\1\uffff\27\u0187\1\u0186\71\u0187\1\u0188\uffa3"+
            "\u0187",
            "\12\u0086\1\uffff\27\u0086\1\u01e3\4\u0086\1\u0117\10\u0086"+
            "\10\u011b\7\u0086\1\u0117\25\u0086\1\u0119\6\u0086\1\u0117\4"+
            "\u0086\2\u0117\3\u0086\1\u0117\7\u0086\1\u0117\3\u0086\1\u0117"+
            "\1\u0086\1\u0117\1\u01e4\1\u0117\1\u0086\1\u0118\uff87\u0086",
            "\12\u0187\1\uffff\27\u0187\1\u0186\15\u0187\12\u01e5\7\u0187"+
            "\6\u01e5\25\u0187\1\u0188\uffa3\u0187",
            "\12\u0086\1\uffff\45\u0086\12\u01e6\7\u0086\6\u01e6\uffb9"+
            "\u0086",
            "\12\u0086\1\uffff\45\u0086\10\u01e7\uffc8\u0086",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\102\1\uffff"+
            "\32\102",
            "\1\u01e8",
            "\1\u01e9",
            "\1\u01ea",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\102\1\uffff"+
            "\32\102",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\102\1\uffff"+
            "\32\102",
            "\1\u01eb",
            "\1\u01ec",
            "\1\u01ed",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\102\1\uffff"+
            "\32\102",
            "\1\u01ee",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\102\1\uffff"+
            "\32\102",
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
            "\60\u009e\12\u0202\7\u009e\6\u0202\uffb9\u009e",
            "\1\u0203",
            "\1\u0204",
            "\1\u0205",
            "\1\u0206",
            "\1\u0207",
            "\1\u0208",
            "\1\u0209",
            "\1\u020a",
            "\1\u020b",
            "\1\u020c",
            "\1\u020d",
            "\1\u020e",
            "\1\u020f",
            "\1\u0210",
            "\1\u0211",
            "\1\u0212",
            "",
            "\1\u0213",
            "\1\u0214",
            "\1\u0215",
            "\1\u0216",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\102\1\uffff"+
            "\32\102",
            "\1\u0218",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\102\1\uffff"+
            "\32\102",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\102\1\uffff"+
            "\32\102",
            "\1\u021a",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\u021c\1\uffff"+
            "\4\102\1\u021b\25\102",
            "\1\u021e",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\102\1\uffff"+
            "\32\102",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\102\1\uffff"+
            "\32\102",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\102\1\uffff"+
            "\32\102",
            "\1\u0221",
            "\1\u0222",
            "\1\u0223",
            "\1\u0224",
            "\1\u0225",
            "\1\u0226",
            "\1\u0227",
            "\1\u0228",
            "\1\u0229",
            "\1\u022a",
            "\1\u022b",
            "\1\u022c",
            "\1\u022d",
            "\1\u022e\15\uffff\1\u022f",
            "\1\u0230",
            "\1\u0231",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\102\1\uffff"+
            "\32\102",
            "\12\u0181\1\u009e\27\u0181\1\u017f\71\u0181\1\u0180\uffa3"+
            "\u0181",
            "\60\u009e\12\u0232\7\u009e\6\u0232\uffb9\u009e",
            "\12\u0185\1\u009e\27\u0185\1\u0182\15\u0185\12\u0233\7\u0185"+
            "\6\u0233\25\u0185\1\u0184\uffa3\u0185",
            "\0\u009e",
            "\12\u0185\1\u009e\27\u0185\1\u0182\71\u0185\1\u0184\uffa3"+
            "\u0185",
            "\12\116\1\uffff\ufff5\116",
            "\12\u0086\1\uffff\45\u0086\12\u0234\7\u0086\6\u0234\uffb9"+
            "\u0086",
            "\12\u0187\1\uffff\27\u0187\1\u0186\15\u0187\12\u01e5\7\u0187"+
            "\6\u01e5\25\u0187\1\u0188\uffa3\u0187",
            "\12\u0086\1\uffff\45\u0086\12\u0235\7\u0086\6\u0235\uffb9"+
            "\u0086",
            "\12\u0187\1\uffff\27\u0187\1\u0186\71\u0187\1\u0188\uffa3"+
            "\u0187",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\102\1\uffff"+
            "\32\102",
            "\1\u0236",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\102\1\uffff"+
            "\32\102",
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
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\102\1\uffff"+
            "\32\102",
            "\1\u0242",
            "\1\u0243",
            "\1\u0244",
            "\1\u0245",
            "\1\u0246",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\102\1\uffff"+
            "\32\102",
            "\1\u0247",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\102\1\uffff"+
            "\32\102",
            "\1\u0248",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\102\1\uffff"+
            "\32\102",
            "\1\u0249",
            "\60\u009e\12\u024a\7\u009e\6\u024a\uffb9\u009e",
            "\1\u024b",
            "\1\u024c",
            "\1\u024d",
            "\1\u024e",
            "\12\102\7\uffff\13\102\1\u024f\16\102\1\uffff\1\102\2\uffff"+
            "\1\102\1\uffff\32\102",
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
            "\1\u025c",
            "\1\u025d",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\102\1\uffff"+
            "\32\102",
            "\1\u025e",
            "",
            "\1\u025f",
            "",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\102\1\uffff"+
            "\32\102",
            "\1\u0260",
            "\1\u0261",
            "",
            "\1\u0262",
            "",
            "",
            "\1\u0263",
            "\1\u0264",
            "\1\u0265",
            "\1\u0266",
            "\1\u0267",
            "\1\u0268",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\102\1\uffff"+
            "\32\102",
            "\1\u0269",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\102\1\uffff"+
            "\32\102",
            "\1\u026b",
            "\1\u026c",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\102\1\uffff"+
            "\32\102",
            "\1\u026d",
            "\1\u026e",
            "\1\u026f",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\102\1\uffff"+
            "\32\102",
            "\1\u0270",
            "\60\u009e\12\u0271\7\u009e\6\u0271\uffb9\u009e",
            "\12\u0185\1\u009e\27\u0185\1\u0182\15\u0185\12\u0272\7\u0185"+
            "\6\u0272\25\u0185\1\u0184\uffa3\u0185",
            "\12\u0086\1\uffff\45\u0086\12\u0273\7\u0086\6\u0273\uffb9"+
            "\u0086",
            "\12\u0086\1\uffff\45\u0086\12\u0274\7\u0086\6\u0274\uffb9"+
            "\u0086",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\102\1\uffff"+
            "\32\102",
            "\1\u0275",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\102\1\uffff"+
            "\32\102",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\102\1\uffff"+
            "\32\102",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\102\1\uffff"+
            "\32\102",
            "\1\u0276",
            "\1\u0277",
            "\1\u0278",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\102\1\uffff"+
            "\32\102",
            "\1\u0279",
            "\1\u027a",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\102\1\uffff"+
            "\32\102",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\102\1\uffff"+
            "\32\102",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\102\1\uffff"+
            "\32\102",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\u027b\1\uffff"+
            "\32\102",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\102\1\uffff"+
            "\32\102",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\102\1\uffff"+
            "\32\102",
            "\1\u027c",
            "\1\u027d",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\102\1\uffff"+
            "\32\102",
            "\60\u009e\12\u027e\7\u009e\6\u027e\uffb9\u009e",
            "\1\u027f",
            "\1\u0280",
            "\1\u0281",
            "\1\u0282",
            "\1\u0283",
            "",
            "\1\u0284",
            "\1\u0285",
            "\1\u0286",
            "\1\u0287",
            "\1\u0288",
            "\1\u0289",
            "\1\u028a",
            "\1\u028b",
            "\1\u028c",
            "\1\u028d",
            "\1\u028e",
            "\1\u028f",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\102\1\uffff"+
            "\32\102",
            "\1\u0290",
            "\1\u0291",
            "\1\u0292",
            "\1\u0293",
            "\1\u0294",
            "\1\u0295",
            "\1\u0296",
            "\1\u0297",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\102\1\uffff"+
            "\32\102",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\102\1\uffff"+
            "\32\102",
            "\1\u0299",
            "\1\u029a",
            "",
            "\1\u029b",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\102\1\uffff"+
            "\32\102",
            "\1\u029c",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\102\1\uffff"+
            "\32\102",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\102\1\uffff"+
            "\32\102",
            "\1\u029e",
            "\60\u009e\12\u029f\7\u009e\6\u029f\uffb9\u009e",
            "\12\u009d\1\u009e\27\u009d\1\u011c\71\u009d\1\u009c\uffa3"+
            "\u009d",
            "\12\u0086\1\uffff\45\u0086\12\u02a0\7\u0086\6\u02a0\uffb9"+
            "\u0086",
            "\12\u0086\1\uffff\45\u0086\12\u02a1\7\u0086\6\u02a1\uffb9"+
            "\u0086",
            "\1\u02a2",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\102\1\uffff"+
            "\32\102",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\102\1\uffff"+
            "\32\102",
            "\1\u02a3",
            "\1\u02a4",
            "\1\u02a5",
            "\1\u02a6\1\uffff\1\u02a7",
            "\1\u02a8",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\102\1\uffff"+
            "\32\102",
            "\12\u00c4\1\u009e\34\u00c4\1\u0147\64\u00c4\1\u00c3\uffa3"+
            "\u00c4",
            "\1\u02a9",
            "\1\u02aa",
            "\1\u02ab",
            "\1\u02ac",
            "\1\u02ad",
            "\1\u02ae",
            "\1\u02af",
            "\1\u02b0",
            "\1\u02b1",
            "\1\u02b2",
            "\1\u02b3",
            "\1\u02b4",
            "\1\u02b5",
            "\1\u02b6",
            "\1\u02b7",
            "\1\u02b8",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\102\1\uffff"+
            "\32\102",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\102\1\uffff"+
            "\32\102",
            "\1\u02bb",
            "\1\u02bc",
            "\1\u02bd",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\102\1\uffff"+
            "\32\102",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\102\1\uffff"+
            "\32\102",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\102\1\uffff"+
            "\32\102",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\102\1\uffff"+
            "\32\102",
            "",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\102\1\uffff"+
            "\32\102",
            "\1\u02c0",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\102\1\uffff"+
            "\32\102",
            "\1\u02c1",
            "",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\102\1\uffff"+
            "\32\102",
            "\60\u009e\12\u02c3\7\u009e\6\u02c3\uffb9\u009e",
            "\12\u0086\1\uffff\45\u0086\12\u02c4\7\u0086\6\u02c4\uffb9"+
            "\u0086",
            "\12\u0086\1\uffff\45\u0086\12\u02c5\7\u0086\6\u02c5\uffb9"+
            "\u0086",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\102\1\uffff"+
            "\32\102",
            "\1\u02c6",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\102\1\uffff"+
            "\32\102",
            "\1\u02c7",
            "\1\u02c8",
            "\1\u02c9",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\102\1\uffff"+
            "\32\102",
            "\1\u02ca",
            "\1\u02cb",
            "\1\u02cc",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\102\1\uffff"+
            "\32\102",
            "\1\u02ce",
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
            "",
            "",
            "\1\u02da",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\102\1\uffff"+
            "\32\102",
            "\1\u02db",
            "",
            "",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\102\1\uffff"+
            "\32\102",
            "\1\u02dc",
            "",
            "\12\u0181\1\u009e\27\u0181\1\u017f\71\u0181\1\u0180\uffa3"+
            "\u0181",
            "\12\u0187\1\uffff\27\u0187\1\u0186\71\u0187\1\u0188\uffa3"+
            "\u0187",
            "\12\u0086\1\uffff\45\u0086\12\u02dd\7\u0086\6\u02dd\uffb9"+
            "\u0086",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\102\1\uffff"+
            "\32\102",
            "\1\u02de",
            "\1\u02df",
            "\1\u02e0",
            "\1\u02e1",
            "\1\u02e2",
            "\1\u02e3",
            "",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\102\1\uffff"+
            "\32\102",
            "\1\u02e5",
            "\1\u02e6",
            "\1\u02e7",
            "\1\u02e8",
            "\1\u02e9",
            "\1\u02ea",
            "\1\u02eb",
            "\1\u02ec",
            "\1\u02ed",
            "\1\u02ee",
            "\1\u02ef",
            "\1\u02f0",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\102\1\uffff"+
            "\32\102",
            "\1\u02f1",
            "\12\u0086\1\uffff\45\u0086\12\u02f2\7\u0086\6\u02f2\uffb9"+
            "\u0086",
            "\1\u02f3",
            "\1\u02f4",
            "\1\u02f5",
            "\1\u02f6",
            "\1\u02f7",
            "\1\u02f8",
            "",
            "\1\u02f9",
            "\1\u02fa",
            "\1\u02fb",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\102\1\uffff"+
            "\32\102",
            "\1\u02fd",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\102\1\uffff"+
            "\32\102",
            "\1\u02ff",
            "\1\u0300",
            "\1\u0301",
            "\1\u0302",
            "\1\u0303",
            "\1\u0304",
            "\1\u0305",
            "\12\u0187\1\uffff\27\u0187\1\u0186\71\u0187\1\u0188\uffa3"+
            "\u0187",
            "\1\u0306",
            "\1\u0307",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\102\1\uffff"+
            "\32\102",
            "\1\u0308",
            "\1\u0309",
            "\1\u030a",
            "\1\u030b",
            "\1\u030c",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\102\1\uffff"+
            "\32\102",
            "",
            "\1\u030e",
            "",
            "\1\u030f",
            "\1\u0310",
            "\1\u0311",
            "\1\u0312",
            "\1\u0313",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\102\1\uffff"+
            "\32\102",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\102\1\uffff"+
            "\32\102",
            "\1\u0314",
            "\1\u0315",
            "\1\u0316",
            "\1\u0317",
            "\1\u0318",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\102\1\uffff"+
            "\32\102",
            "\1\u031a",
            "",
            "\1\u031b",
            "\1\u031c",
            "\1\u031d",
            "\1\u031e",
            "\1\u031f",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\102\1\uffff"+
            "\32\102",
            "\1\u0321",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\102\1\uffff"+
            "\32\102",
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
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\102\1\uffff"+
            "\32\102",
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
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\102\1\uffff"+
            "\32\102",
            "\1\u033e",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\102\1\uffff"+
            "\32\102",
            "\1\u0340",
            "\1\u0341",
            "\1\u0342",
            "\1\u0343",
            "\1\u0344",
            "\1\u0345",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\102\1\uffff"+
            "\32\102",
            "",
            "\1\u0347",
            "\1\u0348",
            "\1\u0349",
            "\1\u034a",
            "\1\u034b",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\102\1\uffff"+
            "\32\102",
            "",
            "\1\u034d",
            "\1\u034e",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\102\1\uffff"+
            "\32\102",
            "\1\u0350",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\102\1\uffff"+
            "\32\102",
            "",
            "\1\u0352",
            "\12\102\7\uffff\2\102\1\u0353\27\102\1\uffff\1\102\2\uffff"+
            "\1\102\1\uffff\32\102",
            "",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\102\1\uffff"+
            "\32\102",
            "",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\102\1\uffff"+
            "\32\102",
            "\1\u0357",
            "",
            "",
            "",
            "\1\u0358",
            "\1\u0359",
            "\1\u035a",
            "\1\u035b",
            "\12\102\7\uffff\32\102\1\uffff\1\102\2\uffff\1\102\1\uffff"+
            "\32\102",
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
                        int LA48_280 = input.LA(1);

                        s = -1;
                        if ( ((LA48_280>='\u0000' && LA48_280<='\t')||(LA48_280>='\u000B' && LA48_280<='/')||(LA48_280>=':' && LA48_280<='@')||(LA48_280>='G' && LA48_280<='\uFFFF')) ) {s = 134;}

                        else if ( ((LA48_280>='0' && LA48_280<='9')||(LA48_280>='A' && LA48_280<='F')) ) {s = 393;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA48_478 = input.LA(1);

                        s = -1;
                        if ( (LA48_478=='\"') ) {s = 383;}

                        else if ( (LA48_478=='\\') ) {s = 384;}

                        else if ( ((LA48_478>='\u0000' && LA48_478<='\t')||(LA48_478>='\u000B' && LA48_478<='!')||(LA48_478>='#' && LA48_478<='[')||(LA48_478>=']' && LA48_478<='\uFFFF')) ) {s = 385;}

                        else if ( (LA48_478=='\n') ) {s = 158;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA48_485 = input.LA(1);

                        s = -1;
                        if ( (LA48_485=='\"') ) {s = 390;}

                        else if ( ((LA48_485>='0' && LA48_485<='9')||(LA48_485>='A' && LA48_485<='F')) ) {s = 485;}

                        else if ( (LA48_485=='\\') ) {s = 392;}

                        else if ( ((LA48_485>='\u0000' && LA48_485<='\t')||(LA48_485>='\u000B' && LA48_485<='!')||(LA48_485>='#' && LA48_485<='/')||(LA48_485>=':' && LA48_485<='@')||(LA48_485>='G' && LA48_485<='[')||(LA48_485>=']' && LA48_485<='\uFFFF')) ) {s = 391;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA48_393 = input.LA(1);

                        s = -1;
                        if ( (LA48_393=='\"') ) {s = 390;}

                        else if ( ((LA48_393>='0' && LA48_393<='9')||(LA48_393>='A' && LA48_393<='F')) ) {s = 485;}

                        else if ( (LA48_393=='\\') ) {s = 392;}

                        else if ( ((LA48_393>='\u0000' && LA48_393<='\t')||(LA48_393>='\u000B' && LA48_393<='!')||(LA48_393>='#' && LA48_393<='/')||(LA48_393>=':' && LA48_393<='@')||(LA48_393>='G' && LA48_393<='[')||(LA48_393>=']' && LA48_393<='\uFFFF')) ) {s = 391;}

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA48_391 = input.LA(1);

                        s = -1;
                        if ( (LA48_391=='\"') ) {s = 390;}

                        else if ( ((LA48_391>='\u0000' && LA48_391<='\t')||(LA48_391>='\u000B' && LA48_391<='!')||(LA48_391>='#' && LA48_391<='[')||(LA48_391>=']' && LA48_391<='\uFFFF')) ) {s = 391;}

                        else if ( (LA48_391=='\\') ) {s = 392;}

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA48_708 = input.LA(1);

                        s = -1;
                        if ( (LA48_708=='\"') ) {s = 390;}

                        else if ( ((LA48_708>='\u0000' && LA48_708<='\t')||(LA48_708>='\u000B' && LA48_708<='!')||(LA48_708>='#' && LA48_708<='[')||(LA48_708>=']' && LA48_708<='\uFFFF')) ) {s = 391;}

                        else if ( (LA48_708=='\\') ) {s = 392;}

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA48_754 = input.LA(1);

                        s = -1;
                        if ( (LA48_754=='\"') ) {s = 390;}

                        else if ( ((LA48_754>='\u0000' && LA48_754<='\t')||(LA48_754>='\u000B' && LA48_754<='!')||(LA48_754>='#' && LA48_754<='[')||(LA48_754>=']' && LA48_754<='\uFFFF')) ) {s = 391;}

                        else if ( (LA48_754=='\\') ) {s = 392;}

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA48_628 = input.LA(1);

                        s = -1;
                        if ( ((LA48_628>='\u0000' && LA48_628<='\t')||(LA48_628>='\u000B' && LA48_628<='/')||(LA48_628>=':' && LA48_628<='@')||(LA48_628>='G' && LA48_628<='\uFFFF')) ) {s = 134;}

                        else if ( ((LA48_628>='0' && LA48_628<='9')||(LA48_628>='A' && LA48_628<='F')) ) {s = 673;}

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA48_156 = input.LA(1);

                        s = -1;
                        if ( (LA48_156=='\"') ) {s = 277;}

                        else if ( (LA48_156=='u') ) {s = 278;}

                        else if ( (LA48_156=='?'||LA48_156=='a'||LA48_156=='v') ) {s = 279;}

                        else if ( (LA48_156=='x') ) {s = 280;}

                        else if ( (LA48_156=='U') ) {s = 281;}

                        else if ( (LA48_156=='\''||LA48_156=='\\'||LA48_156=='b'||LA48_156=='f'||LA48_156=='n'||LA48_156=='r'||LA48_156=='t') ) {s = 282;}

                        else if ( ((LA48_156>='0' && LA48_156<='7')) ) {s = 283;}

                        else if ( ((LA48_156>='\u0000' && LA48_156<='\t')||(LA48_156>='\u000B' && LA48_156<='!')||(LA48_156>='#' && LA48_156<='&')||(LA48_156>='(' && LA48_156<='/')||(LA48_156>='8' && LA48_156<='>')||(LA48_156>='@' && LA48_156<='T')||(LA48_156>='V' && LA48_156<='[')||(LA48_156>=']' && LA48_156<='`')||(LA48_156>='c' && LA48_156<='e')||(LA48_156>='g' && LA48_156<='m')||(LA48_156>='o' && LA48_156<='q')||LA48_156=='s'||LA48_156=='w'||(LA48_156>='y' && LA48_156<='\uFFFF')) ) {s = 134;}

                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA48_37 = input.LA(1);

                        s = -1;
                        if ( (LA48_37=='\\') ) {s = 156;}

                        else if ( ((LA48_37>='\u0000' && LA48_37<='\t')||(LA48_37>='\u000B' && LA48_37<='!')||(LA48_37>='#' && LA48_37<='[')||(LA48_37>=']' && LA48_37<='\uFFFF')) ) {s = 157;}

                        else if ( (LA48_37=='\n'||LA48_37=='\"') ) {s = 158;}

                        else s = 155;

                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA48_130 = input.LA(1);

                        s = -1;
                        if ( (LA48_130=='=') ) {s = 259;}

                        else if ( ((LA48_130>='\u0000' && LA48_130<='\t')||(LA48_130>='\u000B' && LA48_130<='<')||(LA48_130>='>' && LA48_130<='\uFFFF')) ) {s = 134;}

                        else s = 260;

                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA48_626 = input.LA(1);

                        s = -1;
                        if ( (LA48_626=='\"') ) {s = 284;}

                        else if ( ((LA48_626>='\u0000' && LA48_626<='\t')||(LA48_626>='\u000B' && LA48_626<='!')||(LA48_626>='#' && LA48_626<='[')||(LA48_626>=']' && LA48_626<='\uFFFF')) ) {s = 157;}

                        else if ( (LA48_626=='\\') ) {s = 156;}

                        else if ( (LA48_626=='\n') ) {s = 158;}

                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA48_638 = input.LA(1);

                        s = -1;
                        if ( (LA48_638=='\'') ) {s = 327;}

                        else if ( (LA48_638=='\\') ) {s = 195;}

                        else if ( ((LA48_638>='\u0000' && LA48_638<='\t')||(LA48_638>='\u000B' && LA48_638<='&')||(LA48_638>='(' && LA48_638<='[')||(LA48_638>=']' && LA48_638<='\uFFFF')) ) {s = 196;}

                        else if ( (LA48_638=='\n') ) {s = 158;}

                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA48_563 = input.LA(1);

                        s = -1;
                        if ( (LA48_563=='\"') ) {s = 386;}

                        else if ( ((LA48_563>='0' && LA48_563<='9')||(LA48_563>='A' && LA48_563<='F')) ) {s = 626;}

                        else if ( (LA48_563=='\\') ) {s = 388;}

                        else if ( ((LA48_563>='\u0000' && LA48_563<='\t')||(LA48_563>='\u000B' && LA48_563<='!')||(LA48_563>='#' && LA48_563<='/')||(LA48_563>=':' && LA48_563<='@')||(LA48_563>='G' && LA48_563<='[')||(LA48_563>=']' && LA48_563<='\uFFFF')) ) {s = 389;}

                        else if ( (LA48_563=='\n') ) {s = 158;}

                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA48_480 = input.LA(1);

                        s = -1;
                        if ( (LA48_480=='\"') ) {s = 386;}

                        else if ( ((LA48_480>='0' && LA48_480<='9')||(LA48_480>='A' && LA48_480<='F')) ) {s = 563;}

                        else if ( (LA48_480=='\\') ) {s = 388;}

                        else if ( ((LA48_480>='\u0000' && LA48_480<='\t')||(LA48_480>='\u000B' && LA48_480<='!')||(LA48_480>='#' && LA48_480<='/')||(LA48_480>=':' && LA48_480<='@')||(LA48_480>='G' && LA48_480<='[')||(LA48_480>=']' && LA48_480<='\uFFFF')) ) {s = 389;}

                        else if ( (LA48_480=='\n') ) {s = 158;}

                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA48_387 = input.LA(1);

                        s = -1;
                        if ( (LA48_387=='\"') ) {s = 386;}

                        else if ( (LA48_387=='\\') ) {s = 388;}

                        else if ( ((LA48_387>='0' && LA48_387<='9')||(LA48_387>='A' && LA48_387<='F')) ) {s = 480;}

                        else if ( (LA48_387=='\n') ) {s = 158;}

                        else if ( ((LA48_387>='\u0000' && LA48_387<='\t')||(LA48_387>='\u000B' && LA48_387<='!')||(LA48_387>='#' && LA48_387<='/')||(LA48_387>=':' && LA48_387<='@')||(LA48_387>='G' && LA48_387<='[')||(LA48_387>=']' && LA48_387<='\uFFFF')) ) {s = 389;}

                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA48_486 = input.LA(1);

                        s = -1;
                        if ( ((LA48_486>='0' && LA48_486<='9')||(LA48_486>='A' && LA48_486<='F')) ) {s = 565;}

                        else if ( ((LA48_486>='\u0000' && LA48_486<='\t')||(LA48_486>='\u000B' && LA48_486<='/')||(LA48_486>=':' && LA48_486<='@')||(LA48_486>='G' && LA48_486<='\uFFFF')) ) {s = 134;}

                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA48_627 = input.LA(1);

                        s = -1;
                        if ( ((LA48_627>='\u0000' && LA48_627<='\t')||(LA48_627>='\u000B' && LA48_627<='/')||(LA48_627>=':' && LA48_627<='@')||(LA48_627>='G' && LA48_627<='\uFFFF')) ) {s = 134;}

                        else if ( ((LA48_627>='0' && LA48_627<='9')||(LA48_627>='A' && LA48_627<='F')) ) {s = 672;}

                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA48_709 = input.LA(1);

                        s = -1;
                        if ( ((LA48_709>='\u0000' && LA48_709<='\t')||(LA48_709>='\u000B' && LA48_709<='/')||(LA48_709>=':' && LA48_709<='@')||(LA48_709>='G' && LA48_709<='\uFFFF')) ) {s = 134;}

                        else if ( ((LA48_709>='0' && LA48_709<='9')||(LA48_709>='A' && LA48_709<='F')) ) {s = 733;}

                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA48_565 = input.LA(1);

                        s = -1;
                        if ( ((LA48_565>='\u0000' && LA48_565<='\t')||(LA48_565>='\u000B' && LA48_565<='/')||(LA48_565>=':' && LA48_565<='@')||(LA48_565>='G' && LA48_565<='\uFFFF')) ) {s = 134;}

                        else if ( ((LA48_565>='0' && LA48_565<='9')||(LA48_565>='A' && LA48_565<='F')) ) {s = 628;}

                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA48_672 = input.LA(1);

                        s = -1;
                        if ( ((LA48_672>='\u0000' && LA48_672<='\t')||(LA48_672>='\u000B' && LA48_672<='/')||(LA48_672>=':' && LA48_672<='@')||(LA48_672>='G' && LA48_672<='\uFFFF')) ) {s = 134;}

                        else if ( ((LA48_672>='0' && LA48_672<='9')||(LA48_672>='A' && LA48_672<='F')) ) {s = 708;}

                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA48_733 = input.LA(1);

                        s = -1;
                        if ( ((LA48_733>='\u0000' && LA48_733<='\t')||(LA48_733>='\u000B' && LA48_733<='/')||(LA48_733>=':' && LA48_733<='@')||(LA48_733>='G' && LA48_733<='\uFFFF')) ) {s = 134;}

                        else if ( ((LA48_733>='0' && LA48_733<='9')||(LA48_733>='A' && LA48_733<='F')) ) {s = 754;}

                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA48_394 = input.LA(1);

                        s = -1;
                        if ( ((LA48_394>='\u0000' && LA48_394<='\t')||(LA48_394>='\u000B' && LA48_394<='/')||(LA48_394>=':' && LA48_394<='@')||(LA48_394>='G' && LA48_394<='\uFFFF')) ) {s = 134;}

                        else if ( ((LA48_394>='0' && LA48_394<='9')||(LA48_394>='A' && LA48_394<='F')) ) {s = 486;}

                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA48_564 = input.LA(1);

                        s = -1;
                        if ( ((LA48_564>='\u0000' && LA48_564<='\t')||(LA48_564>='\u000B' && LA48_564<='/')||(LA48_564>=':' && LA48_564<='@')||(LA48_564>='G' && LA48_564<='\uFFFF')) ) {s = 134;}

                        else if ( ((LA48_564>='0' && LA48_564<='9')||(LA48_564>='A' && LA48_564<='F')) ) {s = 627;}

                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA48_673 = input.LA(1);

                        s = -1;
                        if ( ((LA48_673>='0' && LA48_673<='9')||(LA48_673>='A' && LA48_673<='F')) ) {s = 709;}

                        else if ( ((LA48_673>='\u0000' && LA48_673<='\t')||(LA48_673>='\u000B' && LA48_673<='/')||(LA48_673>=':' && LA48_673<='@')||(LA48_673>='G' && LA48_673<='\uFFFF')) ) {s = 134;}

                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA48_278 = input.LA(1);

                        s = -1;
                        if ( (LA48_278=='\"') ) {s = 386;}

                        else if ( ((LA48_278>='0' && LA48_278<='9')||(LA48_278>='A' && LA48_278<='F')) ) {s = 387;}

                        else if ( (LA48_278=='\\') ) {s = 388;}

                        else if ( ((LA48_278>='\u0000' && LA48_278<='\t')||(LA48_278>='\u000B' && LA48_278<='!')||(LA48_278>='#' && LA48_278<='/')||(LA48_278>=':' && LA48_278<='@')||(LA48_278>='G' && LA48_278<='[')||(LA48_278>=']' && LA48_278<='\uFFFF')) ) {s = 389;}

                        else if ( (LA48_278=='\n') ) {s = 158;}

                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA48_131 = input.LA(1);

                        s = -1;
                        if ( ((LA48_131>='\u0000' && LA48_131<='\t')||(LA48_131>='\u000B' && LA48_131<='\uFFFF')) ) {s = 134;}

                        else s = 261;

                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA48_484 = input.LA(1);

                        s = -1;
                        if ( ((LA48_484>='\u0000' && LA48_484<='\t')||(LA48_484>='\u000B' && LA48_484<='/')||(LA48_484>=':' && LA48_484<='@')||(LA48_484>='G' && LA48_484<='\uFFFF')) ) {s = 134;}

                        else if ( ((LA48_484>='0' && LA48_484<='9')||(LA48_484>='A' && LA48_484<='F')) ) {s = 564;}

                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA48_281 = input.LA(1);

                        s = -1;
                        if ( ((LA48_281>='\u0000' && LA48_281<='\t')||(LA48_281>='\u000B' && LA48_281<='/')||(LA48_281>=':' && LA48_281<='@')||(LA48_281>='G' && LA48_281<='\uFFFF')) ) {s = 134;}

                        else if ( ((LA48_281>='0' && LA48_281<='9')||(LA48_281>='A' && LA48_281<='F')) ) {s = 394;}

                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA48_259 = input.LA(1);

                        s = -1;
                        if ( ((LA48_259>='\u0000' && LA48_259<='\t')||(LA48_259>='\u000B' && LA48_259<='\uFFFF')) ) {s = 134;}

                        else s = 373;

                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA48_562 = input.LA(1);

                        s = -1;
                        if ( ((LA48_562>='\u0000' && LA48_562<='/')||(LA48_562>=':' && LA48_562<='@')||(LA48_562>='G' && LA48_562<='\uFFFF')) ) {s = 158;}

                        else if ( ((LA48_562>='0' && LA48_562<='9')||(LA48_562>='A' && LA48_562<='F')) ) {s = 625;}

                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA48_625 = input.LA(1);

                        s = -1;
                        if ( ((LA48_625>='0' && LA48_625<='9')||(LA48_625>='A' && LA48_625<='F')) ) {s = 671;}

                        else if ( ((LA48_625>='\u0000' && LA48_625<='/')||(LA48_625>=':' && LA48_625<='@')||(LA48_625>='G' && LA48_625<='\uFFFF')) ) {s = 158;}

                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        int LA48_671 = input.LA(1);

                        s = -1;
                        if ( ((LA48_671>='0' && LA48_671<='9')||(LA48_671>='A' && LA48_671<='F')) ) {s = 707;}

                        else if ( ((LA48_671>='\u0000' && LA48_671<='/')||(LA48_671>=':' && LA48_671<='@')||(LA48_671>='G' && LA48_671<='\uFFFF')) ) {s = 158;}

                        if ( s>=0 ) return s;
                        break;
                    case 33 : 
                        int LA48_481 = input.LA(1);

                        s = -1;
                        if ( ((LA48_481>='\u0000' && LA48_481<='\uFFFF')) ) {s = 158;}

                        else s = 134;

                        if ( s>=0 ) return s;
                        break;
                    case 34 : 
                        int LA48_326 = input.LA(1);

                        s = -1;
                        if ( ((LA48_326>='0' && LA48_326<='9')||(LA48_326>='A' && LA48_326<='F')) ) {s = 429;}

                        else if ( ((LA48_326>='\u0000' && LA48_326<='/')||(LA48_326>=':' && LA48_326<='@')||(LA48_326>='G' && LA48_326<='\uFFFF')) ) {s = 158;}

                        if ( s>=0 ) return s;
                        break;
                    case 35 : 
                        int LA48_26 = input.LA(1);

                        s = -1;
                        if ( (LA48_26=='<') ) {s = 130;}

                        else if ( (LA48_26=='=') ) {s = 131;}

                        else if ( (LA48_26==':') ) {s = 132;}

                        else if ( (LA48_26=='%') ) {s = 133;}

                        else if ( ((LA48_26>='\u0000' && LA48_26<='\t')||(LA48_26>='\u000B' && LA48_26<='$')||(LA48_26>='&' && LA48_26<='9')||LA48_26==';'||(LA48_26>='?' && LA48_26<='\uFFFF')) ) {s = 134;}

                        else s = 135;

                        if ( s>=0 ) return s;
                        break;
                    case 36 : 
                        int LA48_429 = input.LA(1);

                        s = -1;
                        if ( ((LA48_429>='0' && LA48_429<='9')||(LA48_429>='A' && LA48_429<='F')) ) {s = 514;}

                        else if ( ((LA48_429>='\u0000' && LA48_429<='/')||(LA48_429>=':' && LA48_429<='@')||(LA48_429>='G' && LA48_429<='\uFFFF')) ) {s = 158;}

                        if ( s>=0 ) return s;
                        break;
                    case 37 : 
                        int LA48_514 = input.LA(1);

                        s = -1;
                        if ( ((LA48_514>='0' && LA48_514<='9')||(LA48_514>='A' && LA48_514<='F')) ) {s = 586;}

                        else if ( ((LA48_514>='\u0000' && LA48_514<='/')||(LA48_514>=':' && LA48_514<='@')||(LA48_514>='G' && LA48_514<='\uFFFF')) ) {s = 158;}

                        if ( s>=0 ) return s;
                        break;
                    case 38 : 
                        int LA48_586 = input.LA(1);

                        s = -1;
                        if ( ((LA48_586>='0' && LA48_586<='9')||(LA48_586>='A' && LA48_586<='F')) ) {s = 638;}

                        else if ( ((LA48_586>='\u0000' && LA48_586<='/')||(LA48_586>=':' && LA48_586<='@')||(LA48_586>='G' && LA48_586<='\uFFFF')) ) {s = 158;}

                        if ( s>=0 ) return s;
                        break;
                    case 39 : 
                        int LA48_385 = input.LA(1);

                        s = -1;
                        if ( (LA48_385=='\"') ) {s = 383;}

                        else if ( (LA48_385=='\\') ) {s = 384;}

                        else if ( ((LA48_385>='\u0000' && LA48_385<='\t')||(LA48_385>='\u000B' && LA48_385<='!')||(LA48_385>='#' && LA48_385<='[')||(LA48_385>=']' && LA48_385<='\uFFFF')) ) {s = 385;}

                        else if ( (LA48_385=='\n') ) {s = 158;}

                        if ( s>=0 ) return s;
                        break;
                    case 40 : 
                        int LA48_133 = input.LA(1);

                        s = -1;
                        if ( ((LA48_133>='\u0000' && LA48_133<='\t')||(LA48_133>='\u000B' && LA48_133<='\uFFFF')) ) {s = 134;}

                        else s = 118;

                        if ( s>=0 ) return s;
                        break;
                    case 41 : 
                        int LA48_132 = input.LA(1);

                        s = -1;
                        if ( ((LA48_132>='\u0000' && LA48_132<='\t')||(LA48_132>='\u000B' && LA48_132<='\uFFFF')) ) {s = 134;}

                        else s = 118;

                        if ( s>=0 ) return s;
                        break;
                    case 42 : 
                        int LA48_60 = input.LA(1);

                        s = -1;
                        if ( (LA48_60=='\\') ) {s = 195;}

                        else if ( ((LA48_60>='\u0000' && LA48_60<='\t')||(LA48_60>='\u000B' && LA48_60<='&')||(LA48_60>='(' && LA48_60<='[')||(LA48_60>=']' && LA48_60<='\uFFFF')) ) {s = 196;}

                        else if ( (LA48_60=='\n'||LA48_60=='\'') ) {s = 158;}

                        else s = 62;

                        if ( s>=0 ) return s;
                        break;
                    case 43 : 
                        int LA48_389 = input.LA(1);

                        s = -1;
                        if ( (LA48_389=='\"') ) {s = 386;}

                        else if ( (LA48_389=='\\') ) {s = 388;}

                        else if ( ((LA48_389>='\u0000' && LA48_389<='\t')||(LA48_389>='\u000B' && LA48_389<='!')||(LA48_389>='#' && LA48_389<='[')||(LA48_389>=']' && LA48_389<='\uFFFF')) ) {s = 389;}

                        else if ( (LA48_389=='\n') ) {s = 158;}

                        if ( s>=0 ) return s;
                        break;
                    case 44 : 
                        int LA48_482 = input.LA(1);

                        s = -1;
                        if ( (LA48_482=='\"') ) {s = 386;}

                        else if ( (LA48_482=='\\') ) {s = 388;}

                        else if ( ((LA48_482>='\u0000' && LA48_482<='\t')||(LA48_482>='\u000B' && LA48_482<='!')||(LA48_482>='#' && LA48_482<='[')||(LA48_482>=']' && LA48_482<='\uFFFF')) ) {s = 389;}

                        else if ( (LA48_482=='\n') ) {s = 158;}

                        if ( s>=0 ) return s;
                        break;
                    case 45 : 
                        int LA48_196 = input.LA(1);

                        s = -1;
                        if ( (LA48_196=='\'') ) {s = 327;}

                        else if ( (LA48_196=='\\') ) {s = 195;}

                        else if ( ((LA48_196>='\u0000' && LA48_196<='\t')||(LA48_196>='\u000B' && LA48_196<='&')||(LA48_196>='(' && LA48_196<='[')||(LA48_196>=']' && LA48_196<='\uFFFF')) ) {s = 196;}

                        else if ( (LA48_196=='\n') ) {s = 158;}

                        if ( s>=0 ) return s;
                        break;
                    case 46 : 
                        int LA48_279 = input.LA(1);

                        s = -1;
                        if ( (LA48_279=='\"') ) {s = 390;}

                        else if ( ((LA48_279>='\u0000' && LA48_279<='\t')||(LA48_279>='\u000B' && LA48_279<='!')||(LA48_279>='#' && LA48_279<='[')||(LA48_279>=']' && LA48_279<='\uFFFF')) ) {s = 391;}

                        else if ( (LA48_279=='\\') ) {s = 392;}

                        if ( s>=0 ) return s;
                        break;
                    case 47 : 
                        int LA48_479 = input.LA(1);

                        s = -1;
                        if ( ((LA48_479>='0' && LA48_479<='9')||(LA48_479>='A' && LA48_479<='F')) ) {s = 562;}

                        else if ( ((LA48_479>='\u0000' && LA48_479<='/')||(LA48_479>=':' && LA48_479<='@')||(LA48_479>='G' && LA48_479<='\uFFFF')) ) {s = 158;}

                        if ( s>=0 ) return s;
                        break;
                    case 48 : 
                        int LA48_325 = input.LA(1);

                        s = -1;
                        if ( (LA48_325=='\'') ) {s = 327;}

                        else if ( ((LA48_325>='\u0000' && LA48_325<='\t')||(LA48_325>='\u000B' && LA48_325<='&')||(LA48_325>='(' && LA48_325<='[')||(LA48_325>=']' && LA48_325<='\uFFFF')) ) {s = 196;}

                        else if ( (LA48_325=='\\') ) {s = 195;}

                        else if ( (LA48_325=='\n') ) {s = 158;}

                        if ( s>=0 ) return s;
                        break;
                    case 49 : 
                        int LA48_487 = input.LA(1);

                        s = -1;
                        if ( (LA48_487=='\"') ) {s = 390;}

                        else if ( ((LA48_487>='\u0000' && LA48_487<='\t')||(LA48_487>='\u000B' && LA48_487<='!')||(LA48_487>='#' && LA48_487<='[')||(LA48_487>=']' && LA48_487<='\uFFFF')) ) {s = 391;}

                        else if ( (LA48_487=='\\') ) {s = 392;}

                        if ( s>=0 ) return s;
                        break;
                    case 50 : 
                        int LA48_157 = input.LA(1);

                        s = -1;
                        if ( (LA48_157=='\"') ) {s = 284;}

                        else if ( (LA48_157=='\\') ) {s = 156;}

                        else if ( ((LA48_157>='\u0000' && LA48_157<='\t')||(LA48_157>='\u000B' && LA48_157<='!')||(LA48_157>='#' && LA48_157<='[')||(LA48_157>=']' && LA48_157<='\uFFFF')) ) {s = 157;}

                        else if ( (LA48_157=='\n') ) {s = 158;}

                        if ( s>=0 ) return s;
                        break;
                    case 51 : 
                        int LA48_282 = input.LA(1);

                        s = -1;
                        if ( (LA48_282=='\"') ) {s = 284;}

                        else if ( (LA48_282=='\\') ) {s = 156;}

                        else if ( ((LA48_282>='\u0000' && LA48_282<='\t')||(LA48_282>='\u000B' && LA48_282<='!')||(LA48_282>='#' && LA48_282<='[')||(LA48_282>=']' && LA48_282<='\uFFFF')) ) {s = 157;}

                        else if ( (LA48_282=='\n') ) {s = 158;}

                        if ( s>=0 ) return s;
                        break;
                    case 52 : 
                        int LA48_483 = input.LA(1);

                        s = -1;
                        if ( ((LA48_483>='\u0000' && LA48_483<='\t')||(LA48_483>='\u000B' && LA48_483<='\uFFFF')) ) {s = 78;}

                        else s = 134;

                        if ( s>=0 ) return s;
                        break;
                    case 53 : 
                        int LA48_388 = input.LA(1);

                        s = -1;
                        if ( (LA48_388=='\"') ) {s = 481;}

                        else if ( (LA48_388=='\''||LA48_388=='\\'||LA48_388=='b'||LA48_388=='f'||LA48_388=='n'||LA48_388=='r'||(LA48_388>='t' && LA48_388<='u')) ) {s = 482;}

                        else if ( ((LA48_388>='\u0000' && LA48_388<='\t')||(LA48_388>='\u000B' && LA48_388<='!')||(LA48_388>='#' && LA48_388<='&')||(LA48_388>='(' && LA48_388<='[')||(LA48_388>=']' && LA48_388<='a')||(LA48_388>='c' && LA48_388<='e')||(LA48_388>='g' && LA48_388<='m')||(LA48_388>='o' && LA48_388<='q')||LA48_388=='s'||(LA48_388>='v' && LA48_388<='\uFFFF')) ) {s = 134;}

                        if ( s>=0 ) return s;
                        break;
                    case 54 : 
                        int LA48_283 = input.LA(1);

                        s = -1;
                        if ( ((LA48_283>='0' && LA48_283<='7')) ) {s = 395;}

                        else if ( ((LA48_283>='\u0000' && LA48_283<='\t')||(LA48_283>='\u000B' && LA48_283<='/')||(LA48_283>='8' && LA48_283<='\uFFFF')) ) {s = 134;}

                        if ( s>=0 ) return s;
                        break;
                    case 55 : 
                        int LA48_395 = input.LA(1);

                        s = -1;
                        if ( ((LA48_395>='\u0000' && LA48_395<='\t')||(LA48_395>='\u000B' && LA48_395<='/')||(LA48_395>='8' && LA48_395<='\uFFFF')) ) {s = 134;}

                        else if ( ((LA48_395>='0' && LA48_395<='7')) ) {s = 487;}

                        if ( s>=0 ) return s;
                        break;
                    case 56 : 
                        int LA48_0 = input.LA(1);

                        s = -1;
                        if ( (LA48_0=='C') ) {s = 1;}

                        else if ( (LA48_0=='T') ) {s = 2;}

                        else if ( (LA48_0=='I') ) {s = 3;}

                        else if ( (LA48_0=='P') ) {s = 4;}

                        else if ( (LA48_0=='D') ) {s = 5;}

                        else if ( (LA48_0=='N') ) {s = 6;}

                        else if ( (LA48_0=='A') ) {s = 7;}

                        else if ( (LA48_0=='U') ) {s = 8;}

                        else if ( (LA48_0=='t') ) {s = 9;}

                        else if ( (LA48_0=='f') ) {s = 10;}

                        else if ( (LA48_0=='c') ) {s = 11;}

                        else if ( (LA48_0=='v') ) {s = 12;}

                        else if ( (LA48_0=='&') ) {s = 13;}

                        else if ( (LA48_0=='n') ) {s = 14;}

                        else if ( (LA48_0=='d') ) {s = 15;}

                        else if ( (LA48_0=='+') ) {s = 16;}

                        else if ( (LA48_0=='-') ) {s = 17;}

                        else if ( (LA48_0=='*') ) {s = 18;}

                        else if ( (LA48_0=='/') ) {s = 19;}

                        else if ( (LA48_0=='%') ) {s = 20;}

                        else if ( (LA48_0=='^') ) {s = 21;}

                        else if ( (LA48_0=='|') ) {s = 22;}

                        else if ( (LA48_0=='~') ) {s = 23;}

                        else if ( (LA48_0=='!') ) {s = 24;}

                        else if ( (LA48_0=='=') ) {s = 25;}

                        else if ( (LA48_0=='<') ) {s = 26;}

                        else if ( (LA48_0=='>') ) {s = 27;}

                        else if ( (LA48_0==',') ) {s = 28;}

                        else if ( (LA48_0=='(') ) {s = 29;}

                        else if ( (LA48_0=='[') ) {s = 30;}

                        else if ( (LA48_0=='.') ) {s = 31;}

                        else if ( (LA48_0==':') ) {s = 32;}

                        else if ( (LA48_0==']') ) {s = 33;}

                        else if ( (LA48_0=='a') ) {s = 34;}

                        else if ( (LA48_0==')') ) {s = 35;}

                        else if ( (LA48_0=='o') ) {s = 36;}

                        else if ( (LA48_0=='\"') ) {s = 37;}

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
                    case 57 : 
                        int LA48_707 = input.LA(1);

                        s = -1;
                        if ( (LA48_707=='\"') ) {s = 383;}

                        else if ( ((LA48_707>='\u0000' && LA48_707<='\t')||(LA48_707>='\u000B' && LA48_707<='!')||(LA48_707>='#' && LA48_707<='[')||(LA48_707>=']' && LA48_707<='\uFFFF')) ) {s = 385;}

                        else if ( (LA48_707=='\\') ) {s = 384;}

                        else if ( (LA48_707=='\n') ) {s = 158;}

                        if ( s>=0 ) return s;
                        break;
                    case 58 : 
                        int LA48_392 = input.LA(1);

                        s = -1;
                        if ( (LA48_392=='\"') ) {s = 483;}

                        else if ( (LA48_392=='x') ) {s = 280;}

                        else if ( (LA48_392=='u') ) {s = 484;}

                        else if ( (LA48_392=='U') ) {s = 281;}

                        else if ( (LA48_392=='\''||LA48_392=='?'||LA48_392=='\\'||(LA48_392>='a' && LA48_392<='b')||LA48_392=='f'||LA48_392=='n'||LA48_392=='r'||LA48_392=='t'||LA48_392=='v') ) {s = 279;}

                        else if ( ((LA48_392>='0' && LA48_392<='7')) ) {s = 283;}

                        else if ( ((LA48_392>='\u0000' && LA48_392<='\t')||(LA48_392>='\u000B' && LA48_392<='!')||(LA48_392>='#' && LA48_392<='&')||(LA48_392>='(' && LA48_392<='/')||(LA48_392>='8' && LA48_392<='>')||(LA48_392>='@' && LA48_392<='T')||(LA48_392>='V' && LA48_392<='[')||(LA48_392>=']' && LA48_392<='`')||(LA48_392>='c' && LA48_392<='e')||(LA48_392>='g' && LA48_392<='m')||(LA48_392>='o' && LA48_392<='q')||LA48_392=='s'||LA48_392=='w'||(LA48_392>='y' && LA48_392<='\uFFFF')) ) {s = 134;}

                        if ( s>=0 ) return s;
                        break;
                    case 59 : 
                        int LA48_277 = input.LA(1);

                        s = -1;
                        if ( (LA48_277=='\"') ) {s = 383;}

                        else if ( (LA48_277=='\\') ) {s = 384;}

                        else if ( ((LA48_277>='\u0000' && LA48_277<='\t')||(LA48_277>='\u000B' && LA48_277<='!')||(LA48_277>='#' && LA48_277<='[')||(LA48_277>=']' && LA48_277<='\uFFFF')) ) {s = 385;}

                        else if ( (LA48_277=='\n') ) {s = 158;}

                        else s = 134;

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