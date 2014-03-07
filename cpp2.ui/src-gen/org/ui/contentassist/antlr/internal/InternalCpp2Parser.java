package org.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.services.Cpp2GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCpp2Parser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_KEYWORD", "RULE_INT", "RULE_CHARACTER_LITERAL", "RULE_FLOATING_LITERAL", "RULE_STRING_LITERAL", "RULE_PREPROCESSING_OP_OR_PUNC", "RULE_ID", "RULE_HEXADECIMAL_DIGIT", "RULE_HEX_QUAD", "RULE_UNIVERSAL_CHARACTER_NAME", "RULE_H_CHAR", "RULE_Q_CHAR", "RULE_HEADER_NAME", "RULE_DIGIT", "RULE_NONDIGIT", "RULE_DECIMAL_LITERAL", "RULE_OCTAL_LITERAL", "RULE_HEXADECIMAL_LITERAL", "RULE_INTEGER_SUFFIX", "RULE_OCTAL_DIGIT", "RULE_C_CHAR", "RULE_ESCAPE_SEQUENCE", "RULE_SIMPLE_ESCAPE_SEQUENCE", "RULE_OCTAL_ESCAPE_SEQUENCE", "RULE_HEXADECIMAL_ESCAPE_SEQUENCE", "RULE_FRACTIONAL_CONSTANT", "RULE_EXPONENT_PART", "RULE_ENC_PREFIX", "RULE_SCHAR", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'true'", "'false'"
    };
    public static final int RULE_HEXADECIMAL_LITERAL=21;
    public static final int RULE_ID=10;
    public static final int RULE_FLOATING_LITERAL=7;
    public static final int RULE_ESCAPE_SEQUENCE=25;
    public static final int RULE_HEXADECIMAL_ESCAPE_SEQUENCE=28;
    public static final int RULE_ANY_OTHER=37;
    public static final int RULE_ENC_PREFIX=31;
    public static final int RULE_H_CHAR=14;
    public static final int RULE_PREPROCESSING_OP_OR_PUNC=9;
    public static final int RULE_SCHAR=32;
    public static final int RULE_C_CHAR=24;
    public static final int RULE_SL_COMMENT=35;
    public static final int EOF=-1;
    public static final int RULE_HEXADECIMAL_DIGIT=11;
    public static final int RULE_ML_COMMENT=34;
    public static final int RULE_EXPONENT_PART=30;
    public static final int RULE_OCTAL_DIGIT=23;
    public static final int RULE_STRING=33;
    public static final int RULE_STRING_LITERAL=8;
    public static final int RULE_FRACTIONAL_CONSTANT=29;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_KEYWORD=4;
    public static final int RULE_UNIVERSAL_CHARACTER_NAME=13;
    public static final int RULE_DECIMAL_LITERAL=19;
    public static final int RULE_INT=5;
    public static final int RULE_OCTAL_LITERAL=20;
    public static final int RULE_OCTAL_ESCAPE_SEQUENCE=27;
    public static final int RULE_WS=36;
    public static final int RULE_Q_CHAR=15;
    public static final int RULE_DIGIT=17;
    public static final int RULE_NONDIGIT=18;
    public static final int RULE_INTEGER_SUFFIX=22;
    public static final int RULE_CHARACTER_LITERAL=6;
    public static final int RULE_SIMPLE_ESCAPE_SEQUENCE=26;
    public static final int RULE_HEX_QUAD=12;
    public static final int RULE_HEADER_NAME=16;

    // delegates
    // delegators


        public InternalCpp2Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalCpp2Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalCpp2Parser.tokenNames; }
    public String getGrammarFileName() { return "../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g"; }


     
     	private Cpp2GrammarAccess grammarAccess;
     	
        public void setGrammarAccess(Cpp2GrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleTest"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:60:1: entryRuleTest : ruleTest EOF ;
    public final void entryRuleTest() throws RecognitionException {
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:61:1: ( ruleTest EOF )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:62:1: ruleTest EOF
            {
             before(grammarAccess.getTestRule()); 
            pushFollow(FOLLOW_ruleTest_in_entryRuleTest61);
            ruleTest();

            state._fsp--;

             after(grammarAccess.getTestRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTest68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTest"


    // $ANTLR start "ruleTest"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:69:1: ruleTest : ( ( rule__Test__ElementsAssignment )* ) ;
    public final void ruleTest() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:73:2: ( ( ( rule__Test__ElementsAssignment )* ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:74:1: ( ( rule__Test__ElementsAssignment )* )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:74:1: ( ( rule__Test__ElementsAssignment )* )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:75:1: ( rule__Test__ElementsAssignment )*
            {
             before(grammarAccess.getTestAccess().getElementsAssignment()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:76:1: ( rule__Test__ElementsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_KEYWORD && LA1_0<=RULE_PREPROCESSING_OP_OR_PUNC)||(LA1_0>=38 && LA1_0<=39)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:76:2: rule__Test__ElementsAssignment
            	    {
            	    pushFollow(FOLLOW_rule__Test__ElementsAssignment_in_ruleTest94);
            	    rule__Test__ElementsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getTestAccess().getElementsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTest"


    // $ANTLR start "entryRuleToken"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:90:1: entryRuleToken : ruleToken EOF ;
    public final void entryRuleToken() throws RecognitionException {
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:91:1: ( ruleToken EOF )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:92:1: ruleToken EOF
            {
             before(grammarAccess.getTokenRule()); 
            pushFollow(FOLLOW_ruleToken_in_entryRuleToken124);
            ruleToken();

            state._fsp--;

             after(grammarAccess.getTokenRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleToken131); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleToken"


    // $ANTLR start "ruleToken"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:99:1: ruleToken : ( ( rule__Token__Alternatives ) ) ;
    public final void ruleToken() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:103:2: ( ( ( rule__Token__Alternatives ) ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:104:1: ( ( rule__Token__Alternatives ) )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:104:1: ( ( rule__Token__Alternatives ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:105:1: ( rule__Token__Alternatives )
            {
             before(grammarAccess.getTokenAccess().getAlternatives()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:106:1: ( rule__Token__Alternatives )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:106:2: rule__Token__Alternatives
            {
            pushFollow(FOLLOW_rule__Token__Alternatives_in_ruleToken157);
            rule__Token__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTokenAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleToken"


    // $ANTLR start "entryRuleLiteral"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:118:1: entryRuleLiteral : ruleLiteral EOF ;
    public final void entryRuleLiteral() throws RecognitionException {
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:119:1: ( ruleLiteral EOF )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:120:1: ruleLiteral EOF
            {
             before(grammarAccess.getLiteralRule()); 
            pushFollow(FOLLOW_ruleLiteral_in_entryRuleLiteral184);
            ruleLiteral();

            state._fsp--;

             after(grammarAccess.getLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteral191); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLiteral"


    // $ANTLR start "ruleLiteral"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:127:1: ruleLiteral : ( ( rule__Literal__Alternatives ) ) ;
    public final void ruleLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:131:2: ( ( ( rule__Literal__Alternatives ) ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:132:1: ( ( rule__Literal__Alternatives ) )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:132:1: ( ( rule__Literal__Alternatives ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:133:1: ( rule__Literal__Alternatives )
            {
             before(grammarAccess.getLiteralAccess().getAlternatives()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:134:1: ( rule__Literal__Alternatives )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:134:2: rule__Literal__Alternatives
            {
            pushFollow(FOLLOW_rule__Literal__Alternatives_in_ruleLiteral217);
            rule__Literal__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLiteralAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLiteral"


    // $ANTLR start "rule__Token__Alternatives"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:151:1: rule__Token__Alternatives : ( ( RULE_KEYWORD ) | ( ruleLiteral ) | ( ( rule__Token__Group_2__0 ) ) );
    public final void rule__Token__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:155:1: ( ( RULE_KEYWORD ) | ( ruleLiteral ) | ( ( rule__Token__Group_2__0 ) ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case RULE_KEYWORD:
                {
                alt2=1;
                }
                break;
            case RULE_INT:
            case RULE_CHARACTER_LITERAL:
            case RULE_FLOATING_LITERAL:
            case RULE_STRING_LITERAL:
            case 38:
            case 39:
                {
                alt2=2;
                }
                break;
            case RULE_PREPROCESSING_OP_OR_PUNC:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:156:1: ( RULE_KEYWORD )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:156:1: ( RULE_KEYWORD )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:157:1: RULE_KEYWORD
                    {
                     before(grammarAccess.getTokenAccess().getKEYWORDTerminalRuleCall_0()); 
                    match(input,RULE_KEYWORD,FOLLOW_RULE_KEYWORD_in_rule__Token__Alternatives258); 
                     after(grammarAccess.getTokenAccess().getKEYWORDTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:162:6: ( ruleLiteral )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:162:6: ( ruleLiteral )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:163:1: ruleLiteral
                    {
                     before(grammarAccess.getTokenAccess().getLiteralParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleLiteral_in_rule__Token__Alternatives275);
                    ruleLiteral();

                    state._fsp--;

                     after(grammarAccess.getTokenAccess().getLiteralParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:168:6: ( ( rule__Token__Group_2__0 ) )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:168:6: ( ( rule__Token__Group_2__0 ) )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:169:1: ( rule__Token__Group_2__0 )
                    {
                     before(grammarAccess.getTokenAccess().getGroup_2()); 
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:170:1: ( rule__Token__Group_2__0 )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:170:2: rule__Token__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Token__Group_2__0_in_rule__Token__Alternatives292);
                    rule__Token__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTokenAccess().getGroup_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Token__Alternatives"


    // $ANTLR start "rule__Literal__Alternatives"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:179:1: rule__Literal__Alternatives : ( ( RULE_INT ) | ( RULE_CHARACTER_LITERAL ) | ( RULE_FLOATING_LITERAL ) | ( RULE_STRING_LITERAL ) | ( ( rule__Literal__Alternatives_4 ) ) );
    public final void rule__Literal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:183:1: ( ( RULE_INT ) | ( RULE_CHARACTER_LITERAL ) | ( RULE_FLOATING_LITERAL ) | ( RULE_STRING_LITERAL ) | ( ( rule__Literal__Alternatives_4 ) ) )
            int alt3=5;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt3=1;
                }
                break;
            case RULE_CHARACTER_LITERAL:
                {
                alt3=2;
                }
                break;
            case RULE_FLOATING_LITERAL:
                {
                alt3=3;
                }
                break;
            case RULE_STRING_LITERAL:
                {
                alt3=4;
                }
                break;
            case 38:
            case 39:
                {
                alt3=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:184:1: ( RULE_INT )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:184:1: ( RULE_INT )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:185:1: RULE_INT
                    {
                     before(grammarAccess.getLiteralAccess().getINTTerminalRuleCall_0()); 
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Literal__Alternatives325); 
                     after(grammarAccess.getLiteralAccess().getINTTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:190:6: ( RULE_CHARACTER_LITERAL )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:190:6: ( RULE_CHARACTER_LITERAL )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:191:1: RULE_CHARACTER_LITERAL
                    {
                     before(grammarAccess.getLiteralAccess().getCHARACTER_LITERALTerminalRuleCall_1()); 
                    match(input,RULE_CHARACTER_LITERAL,FOLLOW_RULE_CHARACTER_LITERAL_in_rule__Literal__Alternatives342); 
                     after(grammarAccess.getLiteralAccess().getCHARACTER_LITERALTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:196:6: ( RULE_FLOATING_LITERAL )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:196:6: ( RULE_FLOATING_LITERAL )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:197:1: RULE_FLOATING_LITERAL
                    {
                     before(grammarAccess.getLiteralAccess().getFLOATING_LITERALTerminalRuleCall_2()); 
                    match(input,RULE_FLOATING_LITERAL,FOLLOW_RULE_FLOATING_LITERAL_in_rule__Literal__Alternatives359); 
                     after(grammarAccess.getLiteralAccess().getFLOATING_LITERALTerminalRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:202:6: ( RULE_STRING_LITERAL )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:202:6: ( RULE_STRING_LITERAL )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:203:1: RULE_STRING_LITERAL
                    {
                     before(grammarAccess.getLiteralAccess().getSTRING_LITERALTerminalRuleCall_3()); 
                    match(input,RULE_STRING_LITERAL,FOLLOW_RULE_STRING_LITERAL_in_rule__Literal__Alternatives376); 
                     after(grammarAccess.getLiteralAccess().getSTRING_LITERALTerminalRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:208:6: ( ( rule__Literal__Alternatives_4 ) )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:208:6: ( ( rule__Literal__Alternatives_4 ) )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:209:1: ( rule__Literal__Alternatives_4 )
                    {
                     before(grammarAccess.getLiteralAccess().getAlternatives_4()); 
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:210:1: ( rule__Literal__Alternatives_4 )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:210:2: rule__Literal__Alternatives_4
                    {
                    pushFollow(FOLLOW_rule__Literal__Alternatives_4_in_rule__Literal__Alternatives393);
                    rule__Literal__Alternatives_4();

                    state._fsp--;


                    }

                     after(grammarAccess.getLiteralAccess().getAlternatives_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Alternatives"


    // $ANTLR start "rule__Literal__Alternatives_4"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:219:1: rule__Literal__Alternatives_4 : ( ( 'true' ) | ( 'false' ) );
    public final void rule__Literal__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:223:1: ( ( 'true' ) | ( 'false' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==38) ) {
                alt4=1;
            }
            else if ( (LA4_0==39) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:224:1: ( 'true' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:224:1: ( 'true' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:225:1: 'true'
                    {
                     before(grammarAccess.getLiteralAccess().getTrueKeyword_4_0()); 
                    match(input,38,FOLLOW_38_in_rule__Literal__Alternatives_4427); 
                     after(grammarAccess.getLiteralAccess().getTrueKeyword_4_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:232:6: ( 'false' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:232:6: ( 'false' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:233:1: 'false'
                    {
                     before(grammarAccess.getLiteralAccess().getFalseKeyword_4_1()); 
                    match(input,39,FOLLOW_39_in_rule__Literal__Alternatives_4447); 
                     after(grammarAccess.getLiteralAccess().getFalseKeyword_4_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Alternatives_4"


    // $ANTLR start "rule__Token__Group_2__0"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:250:1: rule__Token__Group_2__0 : rule__Token__Group_2__0__Impl rule__Token__Group_2__1 ;
    public final void rule__Token__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:254:1: ( rule__Token__Group_2__0__Impl rule__Token__Group_2__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:255:2: rule__Token__Group_2__0__Impl rule__Token__Group_2__1
            {
            pushFollow(FOLLOW_rule__Token__Group_2__0__Impl_in_rule__Token__Group_2__0482);
            rule__Token__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Token__Group_2__1_in_rule__Token__Group_2__0485);
            rule__Token__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Token__Group_2__0"


    // $ANTLR start "rule__Token__Group_2__0__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:262:1: rule__Token__Group_2__0__Impl : ( RULE_PREPROCESSING_OP_OR_PUNC ) ;
    public final void rule__Token__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:266:1: ( ( RULE_PREPROCESSING_OP_OR_PUNC ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:267:1: ( RULE_PREPROCESSING_OP_OR_PUNC )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:267:1: ( RULE_PREPROCESSING_OP_OR_PUNC )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:268:1: RULE_PREPROCESSING_OP_OR_PUNC
            {
             before(grammarAccess.getTokenAccess().getPREPROCESSING_OP_OR_PUNCTerminalRuleCall_2_0()); 
            match(input,RULE_PREPROCESSING_OP_OR_PUNC,FOLLOW_RULE_PREPROCESSING_OP_OR_PUNC_in_rule__Token__Group_2__0__Impl512); 
             after(grammarAccess.getTokenAccess().getPREPROCESSING_OP_OR_PUNCTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Token__Group_2__0__Impl"


    // $ANTLR start "rule__Token__Group_2__1"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:279:1: rule__Token__Group_2__1 : rule__Token__Group_2__1__Impl ;
    public final void rule__Token__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:283:1: ( rule__Token__Group_2__1__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:284:2: rule__Token__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Token__Group_2__1__Impl_in_rule__Token__Group_2__1541);
            rule__Token__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Token__Group_2__1"


    // $ANTLR start "rule__Token__Group_2__1__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:290:1: rule__Token__Group_2__1__Impl : ( RULE_ID ) ;
    public final void rule__Token__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:294:1: ( ( RULE_ID ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:295:1: ( RULE_ID )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:295:1: ( RULE_ID )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:296:1: RULE_ID
            {
             before(grammarAccess.getTokenAccess().getIDTerminalRuleCall_2_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Token__Group_2__1__Impl568); 
             after(grammarAccess.getTokenAccess().getIDTerminalRuleCall_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Token__Group_2__1__Impl"


    // $ANTLR start "rule__Test__ElementsAssignment"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:312:1: rule__Test__ElementsAssignment : ( ruleToken ) ;
    public final void rule__Test__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:316:1: ( ( ruleToken ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:317:1: ( ruleToken )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:317:1: ( ruleToken )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:318:1: ruleToken
            {
             before(grammarAccess.getTestAccess().getElementsTokenParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleToken_in_rule__Test__ElementsAssignment606);
            ruleToken();

            state._fsp--;

             after(grammarAccess.getTestAccess().getElementsTokenParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__ElementsAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleTest_in_entryRuleTest61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTest68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Test__ElementsAssignment_in_ruleTest94 = new BitSet(new long[]{0x000000C0000003F2L});
    public static final BitSet FOLLOW_ruleToken_in_entryRuleToken124 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleToken131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Token__Alternatives_in_ruleToken157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral184 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Alternatives_in_ruleLiteral217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_KEYWORD_in_rule__Token__Alternatives258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_rule__Token__Alternatives275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Token__Group_2__0_in_rule__Token__Alternatives292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Literal__Alternatives325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CHARACTER_LITERAL_in_rule__Literal__Alternatives342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOATING_LITERAL_in_rule__Literal__Alternatives359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_LITERAL_in_rule__Literal__Alternatives376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Alternatives_4_in_rule__Literal__Alternatives393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Literal__Alternatives_4427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Literal__Alternatives_4447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Token__Group_2__0__Impl_in_rule__Token__Group_2__0482 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_rule__Token__Group_2__1_in_rule__Token__Group_2__0485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PREPROCESSING_OP_OR_PUNC_in_rule__Token__Group_2__0__Impl512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Token__Group_2__1__Impl_in_rule__Token__Group_2__1541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Token__Group_2__1__Impl568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleToken_in_rule__Test__ElementsAssignment606 = new BitSet(new long[]{0x0000000000000002L});

}