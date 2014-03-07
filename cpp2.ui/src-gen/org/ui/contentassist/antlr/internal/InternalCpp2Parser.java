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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_KEYWORD", "RULE_INT", "RULE_CHARACTER_LITERAL", "RULE_FLOATING_LITERAL", "RULE_STRING_LITERAL", "RULE_PREPROCESSING_OP_OR_PUNC", "RULE_ID", "RULE_HEXADECIMAL_DIGIT", "RULE_HEX_QUAD", "RULE_UNIVERSAL_CHARACTER_NAME", "RULE_H_CHAR", "RULE_Q_CHAR", "RULE_HEADER_NAME", "RULE_DIGIT", "RULE_NONDIGIT", "RULE_DECIMAL_LITERAL", "RULE_OCTAL_LITERAL", "RULE_HEXADECIMAL_LITERAL", "RULE_INTEGER_SUFFIX", "RULE_OCTAL_DIGIT", "RULE_C_CHAR", "RULE_ESCAPE_SEQUENCE", "RULE_SIMPLE_ESCAPE_SEQUENCE", "RULE_OCTAL_ESCAPE_SEQUENCE", "RULE_HEXADECIMAL_ESCAPE_SEQUENCE", "RULE_FRACTIONAL_CONSTANT", "RULE_EXPONENT_PART", "RULE_ENC_PREFIX", "RULE_SCHAR", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'DUMMY1'", "'DUMMY2'", "'DUMMY3'", "'DUMMY4'", "'DUMMY5'", "'DUMMY6'", "'DUMMY7'", "'DUMMY8'", "'DUMMY9'", "'DUMMY10'", "'DUMMY11'", "'DUMMY12'", "'DUMMY13'", "'DUMMY14'", "'true'", "'false'", "'new'", "'delete'", "'+'", "'-'", "'*'", "'/'", "'%'", "'^'", "'&'", "'|'", "'~'", "'!'", "'='", "'<'", "'>'", "'+='", "'-='", "'*='", "'/='", "'%='", "'^='", "'&='", "'|='", "'<<'", "'>>'", "'>>='", "'<<='", "'=='", "'!='", "'<='", "'>='", "'&&'", "'||'", "'++'", "'--'", "','", "'->*'", "'->'", "'()'", "'[]'", "'...'", "'nullptr'", "'operator'", "'['", "']'", "'\"'", "'class'", "'typename'", "'template'", "'catch'", "'('", "')'", "'throw'", "'noexcept'"
    };
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
    public static final int T__97=97;
    public static final int RULE_CHARACTER_LITERAL=6;
    public static final int T__96=96;
    public static final int RULE_HEX_QUAD=12;
    public static final int T__95=95;
    public static final int RULE_HEXADECIMAL_LITERAL=21;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_SCHAR=32;
    public static final int RULE_C_CHAR=24;
    public static final int T__85=85;
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
    public static final int T__100=100;
    public static final int RULE_PREPROCESSING_OP_OR_PUNC=9;
    public static final int RULE_SL_COMMENT=35;
    public static final int RULE_HEXADECIMAL_DIGIT=11;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_UNIVERSAL_CHARACTER_NAME=13;
    public static final int RULE_WS=36;

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

                if ( ((LA1_0>=RULE_KEYWORD && LA1_0<=RULE_PREPROCESSING_OP_OR_PUNC)||(LA1_0>=52 && LA1_0<=53)) ) {
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


    // $ANTLR start "entryRuleOperatorFunctionId"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:146:1: entryRuleOperatorFunctionId : ruleOperatorFunctionId EOF ;
    public final void entryRuleOperatorFunctionId() throws RecognitionException {
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:147:1: ( ruleOperatorFunctionId EOF )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:148:1: ruleOperatorFunctionId EOF
            {
             before(grammarAccess.getOperatorFunctionIdRule()); 
            pushFollow(FOLLOW_ruleOperatorFunctionId_in_entryRuleOperatorFunctionId244);
            ruleOperatorFunctionId();

            state._fsp--;

             after(grammarAccess.getOperatorFunctionIdRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperatorFunctionId251); 

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
    // $ANTLR end "entryRuleOperatorFunctionId"


    // $ANTLR start "ruleOperatorFunctionId"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:155:1: ruleOperatorFunctionId : ( ( rule__OperatorFunctionId__Group__0 ) ) ;
    public final void ruleOperatorFunctionId() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:159:2: ( ( ( rule__OperatorFunctionId__Group__0 ) ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:160:1: ( ( rule__OperatorFunctionId__Group__0 ) )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:160:1: ( ( rule__OperatorFunctionId__Group__0 ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:161:1: ( rule__OperatorFunctionId__Group__0 )
            {
             before(grammarAccess.getOperatorFunctionIdAccess().getGroup()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:162:1: ( rule__OperatorFunctionId__Group__0 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:162:2: rule__OperatorFunctionId__Group__0
            {
            pushFollow(FOLLOW_rule__OperatorFunctionId__Group__0_in_ruleOperatorFunctionId277);
            rule__OperatorFunctionId__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOperatorFunctionIdAccess().getGroup()); 

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
    // $ANTLR end "ruleOperatorFunctionId"


    // $ANTLR start "entryRuleOverloadableOperator"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:174:1: entryRuleOverloadableOperator : ruleOverloadableOperator EOF ;
    public final void entryRuleOverloadableOperator() throws RecognitionException {
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:175:1: ( ruleOverloadableOperator EOF )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:176:1: ruleOverloadableOperator EOF
            {
             before(grammarAccess.getOverloadableOperatorRule()); 
            pushFollow(FOLLOW_ruleOverloadableOperator_in_entryRuleOverloadableOperator304);
            ruleOverloadableOperator();

            state._fsp--;

             after(grammarAccess.getOverloadableOperatorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOverloadableOperator311); 

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
    // $ANTLR end "entryRuleOverloadableOperator"


    // $ANTLR start "ruleOverloadableOperator"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:183:1: ruleOverloadableOperator : ( ( rule__OverloadableOperator__Alternatives ) ) ;
    public final void ruleOverloadableOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:187:2: ( ( ( rule__OverloadableOperator__Alternatives ) ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:188:1: ( ( rule__OverloadableOperator__Alternatives ) )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:188:1: ( ( rule__OverloadableOperator__Alternatives ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:189:1: ( rule__OverloadableOperator__Alternatives )
            {
             before(grammarAccess.getOverloadableOperatorAccess().getAlternatives()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:190:1: ( rule__OverloadableOperator__Alternatives )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:190:2: rule__OverloadableOperator__Alternatives
            {
            pushFollow(FOLLOW_rule__OverloadableOperator__Alternatives_in_ruleOverloadableOperator337);
            rule__OverloadableOperator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOverloadableOperatorAccess().getAlternatives()); 

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
    // $ANTLR end "ruleOverloadableOperator"


    // $ANTLR start "entryRuleLiteralOperatorId"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:202:1: entryRuleLiteralOperatorId : ruleLiteralOperatorId EOF ;
    public final void entryRuleLiteralOperatorId() throws RecognitionException {
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:203:1: ( ruleLiteralOperatorId EOF )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:204:1: ruleLiteralOperatorId EOF
            {
             before(grammarAccess.getLiteralOperatorIdRule()); 
            pushFollow(FOLLOW_ruleLiteralOperatorId_in_entryRuleLiteralOperatorId364);
            ruleLiteralOperatorId();

            state._fsp--;

             after(grammarAccess.getLiteralOperatorIdRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteralOperatorId371); 

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
    // $ANTLR end "entryRuleLiteralOperatorId"


    // $ANTLR start "ruleLiteralOperatorId"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:211:1: ruleLiteralOperatorId : ( ( rule__LiteralOperatorId__Group__0 ) ) ;
    public final void ruleLiteralOperatorId() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:215:2: ( ( ( rule__LiteralOperatorId__Group__0 ) ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:216:1: ( ( rule__LiteralOperatorId__Group__0 ) )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:216:1: ( ( rule__LiteralOperatorId__Group__0 ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:217:1: ( rule__LiteralOperatorId__Group__0 )
            {
             before(grammarAccess.getLiteralOperatorIdAccess().getGroup()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:218:1: ( rule__LiteralOperatorId__Group__0 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:218:2: rule__LiteralOperatorId__Group__0
            {
            pushFollow(FOLLOW_rule__LiteralOperatorId__Group__0_in_ruleLiteralOperatorId397);
            rule__LiteralOperatorId__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLiteralOperatorIdAccess().getGroup()); 

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
    // $ANTLR end "ruleLiteralOperatorId"


    // $ANTLR start "entryRuleTemplateParameterList"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:232:1: entryRuleTemplateParameterList : ruleTemplateParameterList EOF ;
    public final void entryRuleTemplateParameterList() throws RecognitionException {
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:233:1: ( ruleTemplateParameterList EOF )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:234:1: ruleTemplateParameterList EOF
            {
             before(grammarAccess.getTemplateParameterListRule()); 
            pushFollow(FOLLOW_ruleTemplateParameterList_in_entryRuleTemplateParameterList426);
            ruleTemplateParameterList();

            state._fsp--;

             after(grammarAccess.getTemplateParameterListRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTemplateParameterList433); 

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
    // $ANTLR end "entryRuleTemplateParameterList"


    // $ANTLR start "ruleTemplateParameterList"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:241:1: ruleTemplateParameterList : ( ( rule__TemplateParameterList__Group__0 ) ) ;
    public final void ruleTemplateParameterList() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:245:2: ( ( ( rule__TemplateParameterList__Group__0 ) ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:246:1: ( ( rule__TemplateParameterList__Group__0 ) )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:246:1: ( ( rule__TemplateParameterList__Group__0 ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:247:1: ( rule__TemplateParameterList__Group__0 )
            {
             before(grammarAccess.getTemplateParameterListAccess().getGroup()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:248:1: ( rule__TemplateParameterList__Group__0 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:248:2: rule__TemplateParameterList__Group__0
            {
            pushFollow(FOLLOW_rule__TemplateParameterList__Group__0_in_ruleTemplateParameterList459);
            rule__TemplateParameterList__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTemplateParameterListAccess().getGroup()); 

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
    // $ANTLR end "ruleTemplateParameterList"


    // $ANTLR start "entryRuleTemplateParameter"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:260:1: entryRuleTemplateParameter : ruleTemplateParameter EOF ;
    public final void entryRuleTemplateParameter() throws RecognitionException {
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:261:1: ( ruleTemplateParameter EOF )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:262:1: ruleTemplateParameter EOF
            {
             before(grammarAccess.getTemplateParameterRule()); 
            pushFollow(FOLLOW_ruleTemplateParameter_in_entryRuleTemplateParameter486);
            ruleTemplateParameter();

            state._fsp--;

             after(grammarAccess.getTemplateParameterRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTemplateParameter493); 

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
    // $ANTLR end "entryRuleTemplateParameter"


    // $ANTLR start "ruleTemplateParameter"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:269:1: ruleTemplateParameter : ( ( rule__TemplateParameter__Alternatives ) ) ;
    public final void ruleTemplateParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:273:2: ( ( ( rule__TemplateParameter__Alternatives ) ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:274:1: ( ( rule__TemplateParameter__Alternatives ) )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:274:1: ( ( rule__TemplateParameter__Alternatives ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:275:1: ( rule__TemplateParameter__Alternatives )
            {
             before(grammarAccess.getTemplateParameterAccess().getAlternatives()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:276:1: ( rule__TemplateParameter__Alternatives )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:276:2: rule__TemplateParameter__Alternatives
            {
            pushFollow(FOLLOW_rule__TemplateParameter__Alternatives_in_ruleTemplateParameter519);
            rule__TemplateParameter__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTemplateParameterAccess().getAlternatives()); 

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
    // $ANTLR end "ruleTemplateParameter"


    // $ANTLR start "entryRuleTypeParameter"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:288:1: entryRuleTypeParameter : ruleTypeParameter EOF ;
    public final void entryRuleTypeParameter() throws RecognitionException {
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:289:1: ( ruleTypeParameter EOF )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:290:1: ruleTypeParameter EOF
            {
             before(grammarAccess.getTypeParameterRule()); 
            pushFollow(FOLLOW_ruleTypeParameter_in_entryRuleTypeParameter546);
            ruleTypeParameter();

            state._fsp--;

             after(grammarAccess.getTypeParameterRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeParameter553); 

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
    // $ANTLR end "entryRuleTypeParameter"


    // $ANTLR start "ruleTypeParameter"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:297:1: ruleTypeParameter : ( ( rule__TypeParameter__Alternatives ) ) ;
    public final void ruleTypeParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:301:2: ( ( ( rule__TypeParameter__Alternatives ) ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:302:1: ( ( rule__TypeParameter__Alternatives ) )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:302:1: ( ( rule__TypeParameter__Alternatives ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:303:1: ( rule__TypeParameter__Alternatives )
            {
             before(grammarAccess.getTypeParameterAccess().getAlternatives()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:304:1: ( rule__TypeParameter__Alternatives )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:304:2: rule__TypeParameter__Alternatives
            {
            pushFollow(FOLLOW_rule__TypeParameter__Alternatives_in_ruleTypeParameter579);
            rule__TypeParameter__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeParameterAccess().getAlternatives()); 

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
    // $ANTLR end "ruleTypeParameter"


    // $ANTLR start "entryRuleSimpleTemplateId"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:316:1: entryRuleSimpleTemplateId : ruleSimpleTemplateId EOF ;
    public final void entryRuleSimpleTemplateId() throws RecognitionException {
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:317:1: ( ruleSimpleTemplateId EOF )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:318:1: ruleSimpleTemplateId EOF
            {
             before(grammarAccess.getSimpleTemplateIdRule()); 
            pushFollow(FOLLOW_ruleSimpleTemplateId_in_entryRuleSimpleTemplateId606);
            ruleSimpleTemplateId();

            state._fsp--;

             after(grammarAccess.getSimpleTemplateIdRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleTemplateId613); 

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
    // $ANTLR end "entryRuleSimpleTemplateId"


    // $ANTLR start "ruleSimpleTemplateId"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:325:1: ruleSimpleTemplateId : ( ( rule__SimpleTemplateId__Group__0 ) ) ;
    public final void ruleSimpleTemplateId() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:329:2: ( ( ( rule__SimpleTemplateId__Group__0 ) ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:330:1: ( ( rule__SimpleTemplateId__Group__0 ) )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:330:1: ( ( rule__SimpleTemplateId__Group__0 ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:331:1: ( rule__SimpleTemplateId__Group__0 )
            {
             before(grammarAccess.getSimpleTemplateIdAccess().getGroup()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:332:1: ( rule__SimpleTemplateId__Group__0 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:332:2: rule__SimpleTemplateId__Group__0
            {
            pushFollow(FOLLOW_rule__SimpleTemplateId__Group__0_in_ruleSimpleTemplateId639);
            rule__SimpleTemplateId__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSimpleTemplateIdAccess().getGroup()); 

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
    // $ANTLR end "ruleSimpleTemplateId"


    // $ANTLR start "entryRuleTemplateArgumentList"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:346:1: entryRuleTemplateArgumentList : ruleTemplateArgumentList EOF ;
    public final void entryRuleTemplateArgumentList() throws RecognitionException {
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:347:1: ( ruleTemplateArgumentList EOF )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:348:1: ruleTemplateArgumentList EOF
            {
             before(grammarAccess.getTemplateArgumentListRule()); 
            pushFollow(FOLLOW_ruleTemplateArgumentList_in_entryRuleTemplateArgumentList668);
            ruleTemplateArgumentList();

            state._fsp--;

             after(grammarAccess.getTemplateArgumentListRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTemplateArgumentList675); 

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
    // $ANTLR end "entryRuleTemplateArgumentList"


    // $ANTLR start "ruleTemplateArgumentList"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:355:1: ruleTemplateArgumentList : ( ( rule__TemplateArgumentList__Group__0 ) ) ;
    public final void ruleTemplateArgumentList() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:359:2: ( ( ( rule__TemplateArgumentList__Group__0 ) ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:360:1: ( ( rule__TemplateArgumentList__Group__0 ) )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:360:1: ( ( rule__TemplateArgumentList__Group__0 ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:361:1: ( rule__TemplateArgumentList__Group__0 )
            {
             before(grammarAccess.getTemplateArgumentListAccess().getGroup()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:362:1: ( rule__TemplateArgumentList__Group__0 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:362:2: rule__TemplateArgumentList__Group__0
            {
            pushFollow(FOLLOW_rule__TemplateArgumentList__Group__0_in_ruleTemplateArgumentList701);
            rule__TemplateArgumentList__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTemplateArgumentListAccess().getGroup()); 

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
    // $ANTLR end "ruleTemplateArgumentList"


    // $ANTLR start "entryRuleTemplateArgument"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:374:1: entryRuleTemplateArgument : ruleTemplateArgument EOF ;
    public final void entryRuleTemplateArgument() throws RecognitionException {
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:375:1: ( ruleTemplateArgument EOF )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:376:1: ruleTemplateArgument EOF
            {
             before(grammarAccess.getTemplateArgumentRule()); 
            pushFollow(FOLLOW_ruleTemplateArgument_in_entryRuleTemplateArgument728);
            ruleTemplateArgument();

            state._fsp--;

             after(grammarAccess.getTemplateArgumentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTemplateArgument735); 

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
    // $ANTLR end "entryRuleTemplateArgument"


    // $ANTLR start "ruleTemplateArgument"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:383:1: ruleTemplateArgument : ( ( rule__TemplateArgument__Alternatives ) ) ;
    public final void ruleTemplateArgument() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:387:2: ( ( ( rule__TemplateArgument__Alternatives ) ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:388:1: ( ( rule__TemplateArgument__Alternatives ) )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:388:1: ( ( rule__TemplateArgument__Alternatives ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:389:1: ( rule__TemplateArgument__Alternatives )
            {
             before(grammarAccess.getTemplateArgumentAccess().getAlternatives()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:390:1: ( rule__TemplateArgument__Alternatives )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:390:2: rule__TemplateArgument__Alternatives
            {
            pushFollow(FOLLOW_rule__TemplateArgument__Alternatives_in_ruleTemplateArgument761);
            rule__TemplateArgument__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTemplateArgumentAccess().getAlternatives()); 

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
    // $ANTLR end "ruleTemplateArgument"


    // $ANTLR start "entryRuleHandler"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:412:1: entryRuleHandler : ruleHandler EOF ;
    public final void entryRuleHandler() throws RecognitionException {
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:413:1: ( ruleHandler EOF )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:414:1: ruleHandler EOF
            {
             before(grammarAccess.getHandlerRule()); 
            pushFollow(FOLLOW_ruleHandler_in_entryRuleHandler798);
            ruleHandler();

            state._fsp--;

             after(grammarAccess.getHandlerRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHandler805); 

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
    // $ANTLR end "entryRuleHandler"


    // $ANTLR start "ruleHandler"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:421:1: ruleHandler : ( ( rule__Handler__Group__0 ) ) ;
    public final void ruleHandler() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:425:2: ( ( ( rule__Handler__Group__0 ) ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:426:1: ( ( rule__Handler__Group__0 ) )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:426:1: ( ( rule__Handler__Group__0 ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:427:1: ( rule__Handler__Group__0 )
            {
             before(grammarAccess.getHandlerAccess().getGroup()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:428:1: ( rule__Handler__Group__0 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:428:2: rule__Handler__Group__0
            {
            pushFollow(FOLLOW_rule__Handler__Group__0_in_ruleHandler831);
            rule__Handler__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHandlerAccess().getGroup()); 

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
    // $ANTLR end "ruleHandler"


    // $ANTLR start "entryRuleExceptionDeclaration"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:440:1: entryRuleExceptionDeclaration : ruleExceptionDeclaration EOF ;
    public final void entryRuleExceptionDeclaration() throws RecognitionException {
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:441:1: ( ruleExceptionDeclaration EOF )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:442:1: ruleExceptionDeclaration EOF
            {
             before(grammarAccess.getExceptionDeclarationRule()); 
            pushFollow(FOLLOW_ruleExceptionDeclaration_in_entryRuleExceptionDeclaration858);
            ruleExceptionDeclaration();

            state._fsp--;

             after(grammarAccess.getExceptionDeclarationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExceptionDeclaration865); 

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
    // $ANTLR end "entryRuleExceptionDeclaration"


    // $ANTLR start "ruleExceptionDeclaration"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:449:1: ruleExceptionDeclaration : ( ( rule__ExceptionDeclaration__Alternatives ) ) ;
    public final void ruleExceptionDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:453:2: ( ( ( rule__ExceptionDeclaration__Alternatives ) ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:454:1: ( ( rule__ExceptionDeclaration__Alternatives ) )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:454:1: ( ( rule__ExceptionDeclaration__Alternatives ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:455:1: ( rule__ExceptionDeclaration__Alternatives )
            {
             before(grammarAccess.getExceptionDeclarationAccess().getAlternatives()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:456:1: ( rule__ExceptionDeclaration__Alternatives )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:456:2: rule__ExceptionDeclaration__Alternatives
            {
            pushFollow(FOLLOW_rule__ExceptionDeclaration__Alternatives_in_ruleExceptionDeclaration891);
            rule__ExceptionDeclaration__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getExceptionDeclarationAccess().getAlternatives()); 

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
    // $ANTLR end "ruleExceptionDeclaration"


    // $ANTLR start "entryRuleDynamicExceptionSpecification"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:472:1: entryRuleDynamicExceptionSpecification : ruleDynamicExceptionSpecification EOF ;
    public final void entryRuleDynamicExceptionSpecification() throws RecognitionException {
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:473:1: ( ruleDynamicExceptionSpecification EOF )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:474:1: ruleDynamicExceptionSpecification EOF
            {
             before(grammarAccess.getDynamicExceptionSpecificationRule()); 
            pushFollow(FOLLOW_ruleDynamicExceptionSpecification_in_entryRuleDynamicExceptionSpecification922);
            ruleDynamicExceptionSpecification();

            state._fsp--;

             after(grammarAccess.getDynamicExceptionSpecificationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDynamicExceptionSpecification929); 

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
    // $ANTLR end "entryRuleDynamicExceptionSpecification"


    // $ANTLR start "ruleDynamicExceptionSpecification"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:481:1: ruleDynamicExceptionSpecification : ( ( rule__DynamicExceptionSpecification__Group__0 ) ) ;
    public final void ruleDynamicExceptionSpecification() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:485:2: ( ( ( rule__DynamicExceptionSpecification__Group__0 ) ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:486:1: ( ( rule__DynamicExceptionSpecification__Group__0 ) )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:486:1: ( ( rule__DynamicExceptionSpecification__Group__0 ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:487:1: ( rule__DynamicExceptionSpecification__Group__0 )
            {
             before(grammarAccess.getDynamicExceptionSpecificationAccess().getGroup()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:488:1: ( rule__DynamicExceptionSpecification__Group__0 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:488:2: rule__DynamicExceptionSpecification__Group__0
            {
            pushFollow(FOLLOW_rule__DynamicExceptionSpecification__Group__0_in_ruleDynamicExceptionSpecification955);
            rule__DynamicExceptionSpecification__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDynamicExceptionSpecificationAccess().getGroup()); 

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
    // $ANTLR end "ruleDynamicExceptionSpecification"


    // $ANTLR start "entryRuleNoexceptSpecification"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:500:1: entryRuleNoexceptSpecification : ruleNoexceptSpecification EOF ;
    public final void entryRuleNoexceptSpecification() throws RecognitionException {
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:501:1: ( ruleNoexceptSpecification EOF )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:502:1: ruleNoexceptSpecification EOF
            {
             before(grammarAccess.getNoexceptSpecificationRule()); 
            pushFollow(FOLLOW_ruleNoexceptSpecification_in_entryRuleNoexceptSpecification982);
            ruleNoexceptSpecification();

            state._fsp--;

             after(grammarAccess.getNoexceptSpecificationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNoexceptSpecification989); 

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
    // $ANTLR end "entryRuleNoexceptSpecification"


    // $ANTLR start "ruleNoexceptSpecification"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:509:1: ruleNoexceptSpecification : ( ( rule__NoexceptSpecification__Group__0 ) ) ;
    public final void ruleNoexceptSpecification() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:513:2: ( ( ( rule__NoexceptSpecification__Group__0 ) ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:514:1: ( ( rule__NoexceptSpecification__Group__0 ) )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:514:1: ( ( rule__NoexceptSpecification__Group__0 ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:515:1: ( rule__NoexceptSpecification__Group__0 )
            {
             before(grammarAccess.getNoexceptSpecificationAccess().getGroup()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:516:1: ( rule__NoexceptSpecification__Group__0 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:516:2: rule__NoexceptSpecification__Group__0
            {
            pushFollow(FOLLOW_rule__NoexceptSpecification__Group__0_in_ruleNoexceptSpecification1015);
            rule__NoexceptSpecification__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNoexceptSpecificationAccess().getGroup()); 

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
    // $ANTLR end "ruleNoexceptSpecification"


    // $ANTLR start "entryRuleConstantExpression"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:528:1: entryRuleConstantExpression : ruleConstantExpression EOF ;
    public final void entryRuleConstantExpression() throws RecognitionException {
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:529:1: ( ruleConstantExpression EOF )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:530:1: ruleConstantExpression EOF
            {
             before(grammarAccess.getConstantExpressionRule()); 
            pushFollow(FOLLOW_ruleConstantExpression_in_entryRuleConstantExpression1042);
            ruleConstantExpression();

            state._fsp--;

             after(grammarAccess.getConstantExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstantExpression1049); 

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
    // $ANTLR end "entryRuleConstantExpression"


    // $ANTLR start "ruleConstantExpression"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:537:1: ruleConstantExpression : ( 'DUMMY1' ) ;
    public final void ruleConstantExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:541:2: ( ( 'DUMMY1' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:542:1: ( 'DUMMY1' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:542:1: ( 'DUMMY1' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:543:1: 'DUMMY1'
            {
             before(grammarAccess.getConstantExpressionAccess().getDUMMY1Keyword()); 
            match(input,38,FOLLOW_38_in_ruleConstantExpression1076); 
             after(grammarAccess.getConstantExpressionAccess().getDUMMY1Keyword()); 

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
    // $ANTLR end "ruleConstantExpression"


    // $ANTLR start "entryRuleTypeId"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:558:1: entryRuleTypeId : ruleTypeId EOF ;
    public final void entryRuleTypeId() throws RecognitionException {
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:559:1: ( ruleTypeId EOF )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:560:1: ruleTypeId EOF
            {
             before(grammarAccess.getTypeIdRule()); 
            pushFollow(FOLLOW_ruleTypeId_in_entryRuleTypeId1104);
            ruleTypeId();

            state._fsp--;

             after(grammarAccess.getTypeIdRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeId1111); 

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
    // $ANTLR end "entryRuleTypeId"


    // $ANTLR start "ruleTypeId"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:567:1: ruleTypeId : ( 'DUMMY2' ) ;
    public final void ruleTypeId() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:571:2: ( ( 'DUMMY2' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:572:1: ( 'DUMMY2' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:572:1: ( 'DUMMY2' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:573:1: 'DUMMY2'
            {
             before(grammarAccess.getTypeIdAccess().getDUMMY2Keyword()); 
            match(input,39,FOLLOW_39_in_ruleTypeId1138); 
             after(grammarAccess.getTypeIdAccess().getDUMMY2Keyword()); 

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
    // $ANTLR end "ruleTypeId"


    // $ANTLR start "entryRuleIdExpression"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:588:1: entryRuleIdExpression : ruleIdExpression EOF ;
    public final void entryRuleIdExpression() throws RecognitionException {
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:589:1: ( ruleIdExpression EOF )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:590:1: ruleIdExpression EOF
            {
             before(grammarAccess.getIdExpressionRule()); 
            pushFollow(FOLLOW_ruleIdExpression_in_entryRuleIdExpression1166);
            ruleIdExpression();

            state._fsp--;

             after(grammarAccess.getIdExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIdExpression1173); 

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
    // $ANTLR end "entryRuleIdExpression"


    // $ANTLR start "ruleIdExpression"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:597:1: ruleIdExpression : ( 'DUMMY3' ) ;
    public final void ruleIdExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:601:2: ( ( 'DUMMY3' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:602:1: ( 'DUMMY3' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:602:1: ( 'DUMMY3' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:603:1: 'DUMMY3'
            {
             before(grammarAccess.getIdExpressionAccess().getDUMMY3Keyword()); 
            match(input,40,FOLLOW_40_in_ruleIdExpression1200); 
             after(grammarAccess.getIdExpressionAccess().getDUMMY3Keyword()); 

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
    // $ANTLR end "ruleIdExpression"


    // $ANTLR start "entryRuleParameterDeclaration"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:618:1: entryRuleParameterDeclaration : ruleParameterDeclaration EOF ;
    public final void entryRuleParameterDeclaration() throws RecognitionException {
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:619:1: ( ruleParameterDeclaration EOF )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:620:1: ruleParameterDeclaration EOF
            {
             before(grammarAccess.getParameterDeclarationRule()); 
            pushFollow(FOLLOW_ruleParameterDeclaration_in_entryRuleParameterDeclaration1228);
            ruleParameterDeclaration();

            state._fsp--;

             after(grammarAccess.getParameterDeclarationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterDeclaration1235); 

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
    // $ANTLR end "entryRuleParameterDeclaration"


    // $ANTLR start "ruleParameterDeclaration"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:627:1: ruleParameterDeclaration : ( 'DUMMY4' ) ;
    public final void ruleParameterDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:631:2: ( ( 'DUMMY4' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:632:1: ( 'DUMMY4' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:632:1: ( 'DUMMY4' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:633:1: 'DUMMY4'
            {
             before(grammarAccess.getParameterDeclarationAccess().getDUMMY4Keyword()); 
            match(input,41,FOLLOW_41_in_ruleParameterDeclaration1262); 
             after(grammarAccess.getParameterDeclarationAccess().getDUMMY4Keyword()); 

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
    // $ANTLR end "ruleParameterDeclaration"


    // $ANTLR start "entryRuleDeclaration"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:648:1: entryRuleDeclaration : ruleDeclaration EOF ;
    public final void entryRuleDeclaration() throws RecognitionException {
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:649:1: ( ruleDeclaration EOF )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:650:1: ruleDeclaration EOF
            {
             before(grammarAccess.getDeclarationRule()); 
            pushFollow(FOLLOW_ruleDeclaration_in_entryRuleDeclaration1290);
            ruleDeclaration();

            state._fsp--;

             after(grammarAccess.getDeclarationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeclaration1297); 

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
    // $ANTLR end "entryRuleDeclaration"


    // $ANTLR start "ruleDeclaration"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:657:1: ruleDeclaration : ( 'DUMMY5' ) ;
    public final void ruleDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:661:2: ( ( 'DUMMY5' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:662:1: ( 'DUMMY5' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:662:1: ( 'DUMMY5' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:663:1: 'DUMMY5'
            {
             before(grammarAccess.getDeclarationAccess().getDUMMY5Keyword()); 
            match(input,42,FOLLOW_42_in_ruleDeclaration1324); 
             after(grammarAccess.getDeclarationAccess().getDUMMY5Keyword()); 

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
    // $ANTLR end "ruleDeclaration"


    // $ANTLR start "entryRuleNestedNameSpecifier"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:678:1: entryRuleNestedNameSpecifier : ruleNestedNameSpecifier EOF ;
    public final void entryRuleNestedNameSpecifier() throws RecognitionException {
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:679:1: ( ruleNestedNameSpecifier EOF )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:680:1: ruleNestedNameSpecifier EOF
            {
             before(grammarAccess.getNestedNameSpecifierRule()); 
            pushFollow(FOLLOW_ruleNestedNameSpecifier_in_entryRuleNestedNameSpecifier1352);
            ruleNestedNameSpecifier();

            state._fsp--;

             after(grammarAccess.getNestedNameSpecifierRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNestedNameSpecifier1359); 

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
    // $ANTLR end "entryRuleNestedNameSpecifier"


    // $ANTLR start "ruleNestedNameSpecifier"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:687:1: ruleNestedNameSpecifier : ( 'DUMMY6' ) ;
    public final void ruleNestedNameSpecifier() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:691:2: ( ( 'DUMMY6' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:692:1: ( 'DUMMY6' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:692:1: ( 'DUMMY6' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:693:1: 'DUMMY6'
            {
             before(grammarAccess.getNestedNameSpecifierAccess().getDUMMY6Keyword()); 
            match(input,43,FOLLOW_43_in_ruleNestedNameSpecifier1386); 
             after(grammarAccess.getNestedNameSpecifierAccess().getDUMMY6Keyword()); 

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
    // $ANTLR end "ruleNestedNameSpecifier"


    // $ANTLR start "entryRuleAssignmentExpression"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:708:1: entryRuleAssignmentExpression : ruleAssignmentExpression EOF ;
    public final void entryRuleAssignmentExpression() throws RecognitionException {
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:709:1: ( ruleAssignmentExpression EOF )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:710:1: ruleAssignmentExpression EOF
            {
             before(grammarAccess.getAssignmentExpressionRule()); 
            pushFollow(FOLLOW_ruleAssignmentExpression_in_entryRuleAssignmentExpression1414);
            ruleAssignmentExpression();

            state._fsp--;

             after(grammarAccess.getAssignmentExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignmentExpression1421); 

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
    // $ANTLR end "entryRuleAssignmentExpression"


    // $ANTLR start "ruleAssignmentExpression"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:717:1: ruleAssignmentExpression : ( 'DUMMY7' ) ;
    public final void ruleAssignmentExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:721:2: ( ( 'DUMMY7' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:722:1: ( 'DUMMY7' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:722:1: ( 'DUMMY7' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:723:1: 'DUMMY7'
            {
             before(grammarAccess.getAssignmentExpressionAccess().getDUMMY7Keyword()); 
            match(input,44,FOLLOW_44_in_ruleAssignmentExpression1448); 
             after(grammarAccess.getAssignmentExpressionAccess().getDUMMY7Keyword()); 

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
    // $ANTLR end "ruleAssignmentExpression"


    // $ANTLR start "entryRuleAttributeSpecifier"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:738:1: entryRuleAttributeSpecifier : ruleAttributeSpecifier EOF ;
    public final void entryRuleAttributeSpecifier() throws RecognitionException {
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:739:1: ( ruleAttributeSpecifier EOF )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:740:1: ruleAttributeSpecifier EOF
            {
             before(grammarAccess.getAttributeSpecifierRule()); 
            pushFollow(FOLLOW_ruleAttributeSpecifier_in_entryRuleAttributeSpecifier1476);
            ruleAttributeSpecifier();

            state._fsp--;

             after(grammarAccess.getAttributeSpecifierRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributeSpecifier1483); 

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
    // $ANTLR end "entryRuleAttributeSpecifier"


    // $ANTLR start "ruleAttributeSpecifier"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:747:1: ruleAttributeSpecifier : ( 'DUMMY8' ) ;
    public final void ruleAttributeSpecifier() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:751:2: ( ( 'DUMMY8' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:752:1: ( 'DUMMY8' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:752:1: ( 'DUMMY8' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:753:1: 'DUMMY8'
            {
             before(grammarAccess.getAttributeSpecifierAccess().getDUMMY8Keyword()); 
            match(input,45,FOLLOW_45_in_ruleAttributeSpecifier1510); 
             after(grammarAccess.getAttributeSpecifierAccess().getDUMMY8Keyword()); 

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
    // $ANTLR end "ruleAttributeSpecifier"


    // $ANTLR start "entryRuleTypeSpecifier"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:768:1: entryRuleTypeSpecifier : ruleTypeSpecifier EOF ;
    public final void entryRuleTypeSpecifier() throws RecognitionException {
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:769:1: ( ruleTypeSpecifier EOF )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:770:1: ruleTypeSpecifier EOF
            {
             before(grammarAccess.getTypeSpecifierRule()); 
            pushFollow(FOLLOW_ruleTypeSpecifier_in_entryRuleTypeSpecifier1538);
            ruleTypeSpecifier();

            state._fsp--;

             after(grammarAccess.getTypeSpecifierRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeSpecifier1545); 

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
    // $ANTLR end "entryRuleTypeSpecifier"


    // $ANTLR start "ruleTypeSpecifier"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:777:1: ruleTypeSpecifier : ( 'DUMMY9' ) ;
    public final void ruleTypeSpecifier() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:781:2: ( ( 'DUMMY9' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:782:1: ( 'DUMMY9' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:782:1: ( 'DUMMY9' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:783:1: 'DUMMY9'
            {
             before(grammarAccess.getTypeSpecifierAccess().getDUMMY9Keyword()); 
            match(input,46,FOLLOW_46_in_ruleTypeSpecifier1572); 
             after(grammarAccess.getTypeSpecifierAccess().getDUMMY9Keyword()); 

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
    // $ANTLR end "ruleTypeSpecifier"


    // $ANTLR start "entryRuleDeclarator"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:798:1: entryRuleDeclarator : ruleDeclarator EOF ;
    public final void entryRuleDeclarator() throws RecognitionException {
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:799:1: ( ruleDeclarator EOF )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:800:1: ruleDeclarator EOF
            {
             before(grammarAccess.getDeclaratorRule()); 
            pushFollow(FOLLOW_ruleDeclarator_in_entryRuleDeclarator1600);
            ruleDeclarator();

            state._fsp--;

             after(grammarAccess.getDeclaratorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeclarator1607); 

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
    // $ANTLR end "entryRuleDeclarator"


    // $ANTLR start "ruleDeclarator"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:807:1: ruleDeclarator : ( 'DUMMY10' ) ;
    public final void ruleDeclarator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:811:2: ( ( 'DUMMY10' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:812:1: ( 'DUMMY10' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:812:1: ( 'DUMMY10' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:813:1: 'DUMMY10'
            {
             before(grammarAccess.getDeclaratorAccess().getDUMMY10Keyword()); 
            match(input,47,FOLLOW_47_in_ruleDeclarator1634); 
             after(grammarAccess.getDeclaratorAccess().getDUMMY10Keyword()); 

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
    // $ANTLR end "ruleDeclarator"


    // $ANTLR start "entryRuleAbstractDeclarator"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:828:1: entryRuleAbstractDeclarator : ruleAbstractDeclarator EOF ;
    public final void entryRuleAbstractDeclarator() throws RecognitionException {
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:829:1: ( ruleAbstractDeclarator EOF )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:830:1: ruleAbstractDeclarator EOF
            {
             before(grammarAccess.getAbstractDeclaratorRule()); 
            pushFollow(FOLLOW_ruleAbstractDeclarator_in_entryRuleAbstractDeclarator1662);
            ruleAbstractDeclarator();

            state._fsp--;

             after(grammarAccess.getAbstractDeclaratorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractDeclarator1669); 

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
    // $ANTLR end "entryRuleAbstractDeclarator"


    // $ANTLR start "ruleAbstractDeclarator"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:837:1: ruleAbstractDeclarator : ( 'DUMMY11' ) ;
    public final void ruleAbstractDeclarator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:841:2: ( ( 'DUMMY11' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:842:1: ( 'DUMMY11' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:842:1: ( 'DUMMY11' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:843:1: 'DUMMY11'
            {
             before(grammarAccess.getAbstractDeclaratorAccess().getDUMMY11Keyword()); 
            match(input,48,FOLLOW_48_in_ruleAbstractDeclarator1696); 
             after(grammarAccess.getAbstractDeclaratorAccess().getDUMMY11Keyword()); 

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
    // $ANTLR end "ruleAbstractDeclarator"


    // $ANTLR start "entryRuleCompoundStatement"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:858:1: entryRuleCompoundStatement : ruleCompoundStatement EOF ;
    public final void entryRuleCompoundStatement() throws RecognitionException {
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:859:1: ( ruleCompoundStatement EOF )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:860:1: ruleCompoundStatement EOF
            {
             before(grammarAccess.getCompoundStatementRule()); 
            pushFollow(FOLLOW_ruleCompoundStatement_in_entryRuleCompoundStatement1724);
            ruleCompoundStatement();

            state._fsp--;

             after(grammarAccess.getCompoundStatementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompoundStatement1731); 

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
    // $ANTLR end "entryRuleCompoundStatement"


    // $ANTLR start "ruleCompoundStatement"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:867:1: ruleCompoundStatement : ( 'DUMMY12' ) ;
    public final void ruleCompoundStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:871:2: ( ( 'DUMMY12' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:872:1: ( 'DUMMY12' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:872:1: ( 'DUMMY12' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:873:1: 'DUMMY12'
            {
             before(grammarAccess.getCompoundStatementAccess().getDUMMY12Keyword()); 
            match(input,49,FOLLOW_49_in_ruleCompoundStatement1758); 
             after(grammarAccess.getCompoundStatementAccess().getDUMMY12Keyword()); 

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
    // $ANTLR end "ruleCompoundStatement"


    // $ANTLR start "entryRuleCtorInitializer"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:888:1: entryRuleCtorInitializer : ruleCtorInitializer EOF ;
    public final void entryRuleCtorInitializer() throws RecognitionException {
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:889:1: ( ruleCtorInitializer EOF )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:890:1: ruleCtorInitializer EOF
            {
             before(grammarAccess.getCtorInitializerRule()); 
            pushFollow(FOLLOW_ruleCtorInitializer_in_entryRuleCtorInitializer1786);
            ruleCtorInitializer();

            state._fsp--;

             after(grammarAccess.getCtorInitializerRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCtorInitializer1793); 

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
    // $ANTLR end "entryRuleCtorInitializer"


    // $ANTLR start "ruleCtorInitializer"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:897:1: ruleCtorInitializer : ( 'DUMMY13' ) ;
    public final void ruleCtorInitializer() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:901:2: ( ( 'DUMMY13' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:902:1: ( 'DUMMY13' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:902:1: ( 'DUMMY13' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:903:1: 'DUMMY13'
            {
             before(grammarAccess.getCtorInitializerAccess().getDUMMY13Keyword()); 
            match(input,50,FOLLOW_50_in_ruleCtorInitializer1820); 
             after(grammarAccess.getCtorInitializerAccess().getDUMMY13Keyword()); 

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
    // $ANTLR end "ruleCtorInitializer"


    // $ANTLR start "entryRuleTypeIdList"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:918:1: entryRuleTypeIdList : ruleTypeIdList EOF ;
    public final void entryRuleTypeIdList() throws RecognitionException {
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:919:1: ( ruleTypeIdList EOF )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:920:1: ruleTypeIdList EOF
            {
             before(grammarAccess.getTypeIdListRule()); 
            pushFollow(FOLLOW_ruleTypeIdList_in_entryRuleTypeIdList1848);
            ruleTypeIdList();

            state._fsp--;

             after(grammarAccess.getTypeIdListRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeIdList1855); 

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
    // $ANTLR end "entryRuleTypeIdList"


    // $ANTLR start "ruleTypeIdList"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:927:1: ruleTypeIdList : ( 'DUMMY14' ) ;
    public final void ruleTypeIdList() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:931:2: ( ( 'DUMMY14' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:932:1: ( 'DUMMY14' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:932:1: ( 'DUMMY14' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:933:1: 'DUMMY14'
            {
             before(grammarAccess.getTypeIdListAccess().getDUMMY14Keyword()); 
            match(input,51,FOLLOW_51_in_ruleTypeIdList1882); 
             after(grammarAccess.getTypeIdListAccess().getDUMMY14Keyword()); 

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
    // $ANTLR end "ruleTypeIdList"


    // $ANTLR start "rule__Token__Alternatives"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:953:1: rule__Token__Alternatives : ( ( RULE_KEYWORD ) | ( ruleLiteral ) | ( ( rule__Token__Group_2__0 ) ) );
    public final void rule__Token__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:957:1: ( ( RULE_KEYWORD ) | ( ruleLiteral ) | ( ( rule__Token__Group_2__0 ) ) )
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
            case 52:
            case 53:
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
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:958:1: ( RULE_KEYWORD )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:958:1: ( RULE_KEYWORD )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:959:1: RULE_KEYWORD
                    {
                     before(grammarAccess.getTokenAccess().getKEYWORDTerminalRuleCall_0()); 
                    match(input,RULE_KEYWORD,FOLLOW_RULE_KEYWORD_in_rule__Token__Alternatives1924); 
                     after(grammarAccess.getTokenAccess().getKEYWORDTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:964:6: ( ruleLiteral )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:964:6: ( ruleLiteral )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:965:1: ruleLiteral
                    {
                     before(grammarAccess.getTokenAccess().getLiteralParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleLiteral_in_rule__Token__Alternatives1941);
                    ruleLiteral();

                    state._fsp--;

                     after(grammarAccess.getTokenAccess().getLiteralParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:970:6: ( ( rule__Token__Group_2__0 ) )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:970:6: ( ( rule__Token__Group_2__0 ) )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:971:1: ( rule__Token__Group_2__0 )
                    {
                     before(grammarAccess.getTokenAccess().getGroup_2()); 
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:972:1: ( rule__Token__Group_2__0 )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:972:2: rule__Token__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Token__Group_2__0_in_rule__Token__Alternatives1958);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:981:1: rule__Literal__Alternatives : ( ( RULE_INT ) | ( RULE_CHARACTER_LITERAL ) | ( RULE_FLOATING_LITERAL ) | ( RULE_STRING_LITERAL ) | ( ( rule__Literal__Group_4__0 ) ) );
    public final void rule__Literal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:985:1: ( ( RULE_INT ) | ( RULE_CHARACTER_LITERAL ) | ( RULE_FLOATING_LITERAL ) | ( RULE_STRING_LITERAL ) | ( ( rule__Literal__Group_4__0 ) ) )
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
            case 52:
            case 53:
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
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:986:1: ( RULE_INT )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:986:1: ( RULE_INT )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:987:1: RULE_INT
                    {
                     before(grammarAccess.getLiteralAccess().getINTTerminalRuleCall_0()); 
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Literal__Alternatives1991); 
                     after(grammarAccess.getLiteralAccess().getINTTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:992:6: ( RULE_CHARACTER_LITERAL )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:992:6: ( RULE_CHARACTER_LITERAL )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:993:1: RULE_CHARACTER_LITERAL
                    {
                     before(grammarAccess.getLiteralAccess().getCHARACTER_LITERALTerminalRuleCall_1()); 
                    match(input,RULE_CHARACTER_LITERAL,FOLLOW_RULE_CHARACTER_LITERAL_in_rule__Literal__Alternatives2008); 
                     after(grammarAccess.getLiteralAccess().getCHARACTER_LITERALTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:998:6: ( RULE_FLOATING_LITERAL )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:998:6: ( RULE_FLOATING_LITERAL )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:999:1: RULE_FLOATING_LITERAL
                    {
                     before(grammarAccess.getLiteralAccess().getFLOATING_LITERALTerminalRuleCall_2()); 
                    match(input,RULE_FLOATING_LITERAL,FOLLOW_RULE_FLOATING_LITERAL_in_rule__Literal__Alternatives2025); 
                     after(grammarAccess.getLiteralAccess().getFLOATING_LITERALTerminalRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1004:6: ( RULE_STRING_LITERAL )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1004:6: ( RULE_STRING_LITERAL )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1005:1: RULE_STRING_LITERAL
                    {
                     before(grammarAccess.getLiteralAccess().getSTRING_LITERALTerminalRuleCall_3()); 
                    match(input,RULE_STRING_LITERAL,FOLLOW_RULE_STRING_LITERAL_in_rule__Literal__Alternatives2042); 
                     after(grammarAccess.getLiteralAccess().getSTRING_LITERALTerminalRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1010:6: ( ( rule__Literal__Group_4__0 ) )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1010:6: ( ( rule__Literal__Group_4__0 ) )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1011:1: ( rule__Literal__Group_4__0 )
                    {
                     before(grammarAccess.getLiteralAccess().getGroup_4()); 
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1012:1: ( rule__Literal__Group_4__0 )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1012:2: rule__Literal__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Literal__Group_4__0_in_rule__Literal__Alternatives2059);
                    rule__Literal__Group_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLiteralAccess().getGroup_4()); 

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


    // $ANTLR start "rule__Literal__Alternatives_4_0"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1021:1: rule__Literal__Alternatives_4_0 : ( ( 'true' ) | ( 'false' ) );
    public final void rule__Literal__Alternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1025:1: ( ( 'true' ) | ( 'false' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==52) ) {
                alt4=1;
            }
            else if ( (LA4_0==53) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1026:1: ( 'true' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1026:1: ( 'true' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1027:1: 'true'
                    {
                     before(grammarAccess.getLiteralAccess().getTrueKeyword_4_0_0()); 
                    match(input,52,FOLLOW_52_in_rule__Literal__Alternatives_4_02093); 
                     after(grammarAccess.getLiteralAccess().getTrueKeyword_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1034:6: ( 'false' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1034:6: ( 'false' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1035:1: 'false'
                    {
                     before(grammarAccess.getLiteralAccess().getFalseKeyword_4_0_1()); 
                    match(input,53,FOLLOW_53_in_rule__Literal__Alternatives_4_02113); 
                     after(grammarAccess.getLiteralAccess().getFalseKeyword_4_0_1()); 

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
    // $ANTLR end "rule__Literal__Alternatives_4_0"


    // $ANTLR start "rule__OverloadableOperator__Alternatives"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1047:1: rule__OverloadableOperator__Alternatives : ( ( 'new' ) | ( 'delete' ) | ( ( rule__OverloadableOperator__Group_2__0 ) ) | ( ( rule__OverloadableOperator__Group_3__0 ) ) | ( '+' ) | ( '-' ) | ( '*' ) | ( '/' ) | ( '%' ) | ( '^' ) | ( '&' ) | ( '|' ) | ( '~' ) | ( '!' ) | ( '=' ) | ( '<' ) | ( '>' ) | ( '+=' ) | ( '-=' ) | ( '*=' ) | ( '/=' ) | ( '%=' ) | ( '^=' ) | ( '&=' ) | ( '|=' ) | ( '<<' ) | ( '>>' ) | ( '>>=' ) | ( '<<=' ) | ( '==' ) | ( '!=' ) | ( '<=' ) | ( '>=' ) | ( '&&' ) | ( '||' ) | ( '++' ) | ( '--' ) | ( ',' ) | ( '->*' ) | ( '->' ) | ( '()' ) | ( '[]' ) );
    public final void rule__OverloadableOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1051:1: ( ( 'new' ) | ( 'delete' ) | ( ( rule__OverloadableOperator__Group_2__0 ) ) | ( ( rule__OverloadableOperator__Group_3__0 ) ) | ( '+' ) | ( '-' ) | ( '*' ) | ( '/' ) | ( '%' ) | ( '^' ) | ( '&' ) | ( '|' ) | ( '~' ) | ( '!' ) | ( '=' ) | ( '<' ) | ( '>' ) | ( '+=' ) | ( '-=' ) | ( '*=' ) | ( '/=' ) | ( '%=' ) | ( '^=' ) | ( '&=' ) | ( '|=' ) | ( '<<' ) | ( '>>' ) | ( '>>=' ) | ( '<<=' ) | ( '==' ) | ( '!=' ) | ( '<=' ) | ( '>=' ) | ( '&&' ) | ( '||' ) | ( '++' ) | ( '--' ) | ( ',' ) | ( '->*' ) | ( '->' ) | ( '()' ) | ( '[]' ) )
            int alt5=42;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1052:1: ( 'new' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1052:1: ( 'new' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1053:1: 'new'
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getNewKeyword_0()); 
                    match(input,54,FOLLOW_54_in_rule__OverloadableOperator__Alternatives2148); 
                     after(grammarAccess.getOverloadableOperatorAccess().getNewKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1060:6: ( 'delete' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1060:6: ( 'delete' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1061:1: 'delete'
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getDeleteKeyword_1()); 
                    match(input,55,FOLLOW_55_in_rule__OverloadableOperator__Alternatives2168); 
                     after(grammarAccess.getOverloadableOperatorAccess().getDeleteKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1068:6: ( ( rule__OverloadableOperator__Group_2__0 ) )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1068:6: ( ( rule__OverloadableOperator__Group_2__0 ) )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1069:1: ( rule__OverloadableOperator__Group_2__0 )
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getGroup_2()); 
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1070:1: ( rule__OverloadableOperator__Group_2__0 )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1070:2: rule__OverloadableOperator__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__OverloadableOperator__Group_2__0_in_rule__OverloadableOperator__Alternatives2187);
                    rule__OverloadableOperator__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getOverloadableOperatorAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1074:6: ( ( rule__OverloadableOperator__Group_3__0 ) )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1074:6: ( ( rule__OverloadableOperator__Group_3__0 ) )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1075:1: ( rule__OverloadableOperator__Group_3__0 )
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getGroup_3()); 
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1076:1: ( rule__OverloadableOperator__Group_3__0 )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1076:2: rule__OverloadableOperator__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__OverloadableOperator__Group_3__0_in_rule__OverloadableOperator__Alternatives2205);
                    rule__OverloadableOperator__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getOverloadableOperatorAccess().getGroup_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1080:6: ( '+' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1080:6: ( '+' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1081:1: '+'
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getPlusSignKeyword_4()); 
                    match(input,56,FOLLOW_56_in_rule__OverloadableOperator__Alternatives2224); 
                     after(grammarAccess.getOverloadableOperatorAccess().getPlusSignKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1088:6: ( '-' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1088:6: ( '-' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1089:1: '-'
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getHyphenMinusKeyword_5()); 
                    match(input,57,FOLLOW_57_in_rule__OverloadableOperator__Alternatives2244); 
                     after(grammarAccess.getOverloadableOperatorAccess().getHyphenMinusKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1096:6: ( '*' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1096:6: ( '*' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1097:1: '*'
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getAsteriskKeyword_6()); 
                    match(input,58,FOLLOW_58_in_rule__OverloadableOperator__Alternatives2264); 
                     after(grammarAccess.getOverloadableOperatorAccess().getAsteriskKeyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1104:6: ( '/' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1104:6: ( '/' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1105:1: '/'
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getSolidusKeyword_7()); 
                    match(input,59,FOLLOW_59_in_rule__OverloadableOperator__Alternatives2284); 
                     after(grammarAccess.getOverloadableOperatorAccess().getSolidusKeyword_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1112:6: ( '%' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1112:6: ( '%' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1113:1: '%'
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getPercentSignKeyword_8()); 
                    match(input,60,FOLLOW_60_in_rule__OverloadableOperator__Alternatives2304); 
                     after(grammarAccess.getOverloadableOperatorAccess().getPercentSignKeyword_8()); 

                    }


                    }
                    break;
                case 10 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1120:6: ( '^' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1120:6: ( '^' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1121:1: '^'
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getCircumflexAccentKeyword_9()); 
                    match(input,61,FOLLOW_61_in_rule__OverloadableOperator__Alternatives2324); 
                     after(grammarAccess.getOverloadableOperatorAccess().getCircumflexAccentKeyword_9()); 

                    }


                    }
                    break;
                case 11 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1128:6: ( '&' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1128:6: ( '&' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1129:1: '&'
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getAmpersandKeyword_10()); 
                    match(input,62,FOLLOW_62_in_rule__OverloadableOperator__Alternatives2344); 
                     after(grammarAccess.getOverloadableOperatorAccess().getAmpersandKeyword_10()); 

                    }


                    }
                    break;
                case 12 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1136:6: ( '|' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1136:6: ( '|' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1137:1: '|'
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getVerticalLineKeyword_11()); 
                    match(input,63,FOLLOW_63_in_rule__OverloadableOperator__Alternatives2364); 
                     after(grammarAccess.getOverloadableOperatorAccess().getVerticalLineKeyword_11()); 

                    }


                    }
                    break;
                case 13 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1144:6: ( '~' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1144:6: ( '~' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1145:1: '~'
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getTildeKeyword_12()); 
                    match(input,64,FOLLOW_64_in_rule__OverloadableOperator__Alternatives2384); 
                     after(grammarAccess.getOverloadableOperatorAccess().getTildeKeyword_12()); 

                    }


                    }
                    break;
                case 14 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1152:6: ( '!' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1152:6: ( '!' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1153:1: '!'
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getExclamationMarkKeyword_13()); 
                    match(input,65,FOLLOW_65_in_rule__OverloadableOperator__Alternatives2404); 
                     after(grammarAccess.getOverloadableOperatorAccess().getExclamationMarkKeyword_13()); 

                    }


                    }
                    break;
                case 15 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1160:6: ( '=' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1160:6: ( '=' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1161:1: '='
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getEqualsSignKeyword_14()); 
                    match(input,66,FOLLOW_66_in_rule__OverloadableOperator__Alternatives2424); 
                     after(grammarAccess.getOverloadableOperatorAccess().getEqualsSignKeyword_14()); 

                    }


                    }
                    break;
                case 16 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1168:6: ( '<' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1168:6: ( '<' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1169:1: '<'
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getLessThanSignKeyword_15()); 
                    match(input,67,FOLLOW_67_in_rule__OverloadableOperator__Alternatives2444); 
                     after(grammarAccess.getOverloadableOperatorAccess().getLessThanSignKeyword_15()); 

                    }


                    }
                    break;
                case 17 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1176:6: ( '>' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1176:6: ( '>' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1177:1: '>'
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getGreaterThanSignKeyword_16()); 
                    match(input,68,FOLLOW_68_in_rule__OverloadableOperator__Alternatives2464); 
                     after(grammarAccess.getOverloadableOperatorAccess().getGreaterThanSignKeyword_16()); 

                    }


                    }
                    break;
                case 18 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1184:6: ( '+=' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1184:6: ( '+=' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1185:1: '+='
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getPlusSignEqualsSignKeyword_17()); 
                    match(input,69,FOLLOW_69_in_rule__OverloadableOperator__Alternatives2484); 
                     after(grammarAccess.getOverloadableOperatorAccess().getPlusSignEqualsSignKeyword_17()); 

                    }


                    }
                    break;
                case 19 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1192:6: ( '-=' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1192:6: ( '-=' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1193:1: '-='
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getHyphenMinusEqualsSignKeyword_18()); 
                    match(input,70,FOLLOW_70_in_rule__OverloadableOperator__Alternatives2504); 
                     after(grammarAccess.getOverloadableOperatorAccess().getHyphenMinusEqualsSignKeyword_18()); 

                    }


                    }
                    break;
                case 20 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1200:6: ( '*=' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1200:6: ( '*=' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1201:1: '*='
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getAsteriskEqualsSignKeyword_19()); 
                    match(input,71,FOLLOW_71_in_rule__OverloadableOperator__Alternatives2524); 
                     after(grammarAccess.getOverloadableOperatorAccess().getAsteriskEqualsSignKeyword_19()); 

                    }


                    }
                    break;
                case 21 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1208:6: ( '/=' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1208:6: ( '/=' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1209:1: '/='
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getSolidusEqualsSignKeyword_20()); 
                    match(input,72,FOLLOW_72_in_rule__OverloadableOperator__Alternatives2544); 
                     after(grammarAccess.getOverloadableOperatorAccess().getSolidusEqualsSignKeyword_20()); 

                    }


                    }
                    break;
                case 22 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1216:6: ( '%=' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1216:6: ( '%=' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1217:1: '%='
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getPercentSignEqualsSignKeyword_21()); 
                    match(input,73,FOLLOW_73_in_rule__OverloadableOperator__Alternatives2564); 
                     after(grammarAccess.getOverloadableOperatorAccess().getPercentSignEqualsSignKeyword_21()); 

                    }


                    }
                    break;
                case 23 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1224:6: ( '^=' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1224:6: ( '^=' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1225:1: '^='
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getCircumflexAccentEqualsSignKeyword_22()); 
                    match(input,74,FOLLOW_74_in_rule__OverloadableOperator__Alternatives2584); 
                     after(grammarAccess.getOverloadableOperatorAccess().getCircumflexAccentEqualsSignKeyword_22()); 

                    }


                    }
                    break;
                case 24 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1232:6: ( '&=' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1232:6: ( '&=' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1233:1: '&='
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getAmpersandEqualsSignKeyword_23()); 
                    match(input,75,FOLLOW_75_in_rule__OverloadableOperator__Alternatives2604); 
                     after(grammarAccess.getOverloadableOperatorAccess().getAmpersandEqualsSignKeyword_23()); 

                    }


                    }
                    break;
                case 25 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1240:6: ( '|=' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1240:6: ( '|=' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1241:1: '|='
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getVerticalLineEqualsSignKeyword_24()); 
                    match(input,76,FOLLOW_76_in_rule__OverloadableOperator__Alternatives2624); 
                     after(grammarAccess.getOverloadableOperatorAccess().getVerticalLineEqualsSignKeyword_24()); 

                    }


                    }
                    break;
                case 26 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1248:6: ( '<<' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1248:6: ( '<<' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1249:1: '<<'
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getLessThanSignLessThanSignKeyword_25()); 
                    match(input,77,FOLLOW_77_in_rule__OverloadableOperator__Alternatives2644); 
                     after(grammarAccess.getOverloadableOperatorAccess().getLessThanSignLessThanSignKeyword_25()); 

                    }


                    }
                    break;
                case 27 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1256:6: ( '>>' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1256:6: ( '>>' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1257:1: '>>'
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getGreaterThanSignGreaterThanSignKeyword_26()); 
                    match(input,78,FOLLOW_78_in_rule__OverloadableOperator__Alternatives2664); 
                     after(grammarAccess.getOverloadableOperatorAccess().getGreaterThanSignGreaterThanSignKeyword_26()); 

                    }


                    }
                    break;
                case 28 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1264:6: ( '>>=' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1264:6: ( '>>=' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1265:1: '>>='
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getGreaterThanSignGreaterThanSignEqualsSignKeyword_27()); 
                    match(input,79,FOLLOW_79_in_rule__OverloadableOperator__Alternatives2684); 
                     after(grammarAccess.getOverloadableOperatorAccess().getGreaterThanSignGreaterThanSignEqualsSignKeyword_27()); 

                    }


                    }
                    break;
                case 29 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1272:6: ( '<<=' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1272:6: ( '<<=' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1273:1: '<<='
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getLessThanSignLessThanSignEqualsSignKeyword_28()); 
                    match(input,80,FOLLOW_80_in_rule__OverloadableOperator__Alternatives2704); 
                     after(grammarAccess.getOverloadableOperatorAccess().getLessThanSignLessThanSignEqualsSignKeyword_28()); 

                    }


                    }
                    break;
                case 30 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1280:6: ( '==' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1280:6: ( '==' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1281:1: '=='
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getEqualsSignEqualsSignKeyword_29()); 
                    match(input,81,FOLLOW_81_in_rule__OverloadableOperator__Alternatives2724); 
                     after(grammarAccess.getOverloadableOperatorAccess().getEqualsSignEqualsSignKeyword_29()); 

                    }


                    }
                    break;
                case 31 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1288:6: ( '!=' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1288:6: ( '!=' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1289:1: '!='
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getExclamationMarkEqualsSignKeyword_30()); 
                    match(input,82,FOLLOW_82_in_rule__OverloadableOperator__Alternatives2744); 
                     after(grammarAccess.getOverloadableOperatorAccess().getExclamationMarkEqualsSignKeyword_30()); 

                    }


                    }
                    break;
                case 32 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1296:6: ( '<=' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1296:6: ( '<=' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1297:1: '<='
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getLessThanSignEqualsSignKeyword_31()); 
                    match(input,83,FOLLOW_83_in_rule__OverloadableOperator__Alternatives2764); 
                     after(grammarAccess.getOverloadableOperatorAccess().getLessThanSignEqualsSignKeyword_31()); 

                    }


                    }
                    break;
                case 33 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1304:6: ( '>=' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1304:6: ( '>=' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1305:1: '>='
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getGreaterThanSignEqualsSignKeyword_32()); 
                    match(input,84,FOLLOW_84_in_rule__OverloadableOperator__Alternatives2784); 
                     after(grammarAccess.getOverloadableOperatorAccess().getGreaterThanSignEqualsSignKeyword_32()); 

                    }


                    }
                    break;
                case 34 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1312:6: ( '&&' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1312:6: ( '&&' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1313:1: '&&'
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getAmpersandAmpersandKeyword_33()); 
                    match(input,85,FOLLOW_85_in_rule__OverloadableOperator__Alternatives2804); 
                     after(grammarAccess.getOverloadableOperatorAccess().getAmpersandAmpersandKeyword_33()); 

                    }


                    }
                    break;
                case 35 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1320:6: ( '||' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1320:6: ( '||' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1321:1: '||'
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getVerticalLineVerticalLineKeyword_34()); 
                    match(input,86,FOLLOW_86_in_rule__OverloadableOperator__Alternatives2824); 
                     after(grammarAccess.getOverloadableOperatorAccess().getVerticalLineVerticalLineKeyword_34()); 

                    }


                    }
                    break;
                case 36 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1328:6: ( '++' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1328:6: ( '++' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1329:1: '++'
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getPlusSignPlusSignKeyword_35()); 
                    match(input,87,FOLLOW_87_in_rule__OverloadableOperator__Alternatives2844); 
                     after(grammarAccess.getOverloadableOperatorAccess().getPlusSignPlusSignKeyword_35()); 

                    }


                    }
                    break;
                case 37 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1336:6: ( '--' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1336:6: ( '--' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1337:1: '--'
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getHyphenMinusHyphenMinusKeyword_36()); 
                    match(input,88,FOLLOW_88_in_rule__OverloadableOperator__Alternatives2864); 
                     after(grammarAccess.getOverloadableOperatorAccess().getHyphenMinusHyphenMinusKeyword_36()); 

                    }


                    }
                    break;
                case 38 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1344:6: ( ',' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1344:6: ( ',' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1345:1: ','
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getCommaKeyword_37()); 
                    match(input,89,FOLLOW_89_in_rule__OverloadableOperator__Alternatives2884); 
                     after(grammarAccess.getOverloadableOperatorAccess().getCommaKeyword_37()); 

                    }


                    }
                    break;
                case 39 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1352:6: ( '->*' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1352:6: ( '->*' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1353:1: '->*'
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getHyphenMinusGreaterThanSignAsteriskKeyword_38()); 
                    match(input,90,FOLLOW_90_in_rule__OverloadableOperator__Alternatives2904); 
                     after(grammarAccess.getOverloadableOperatorAccess().getHyphenMinusGreaterThanSignAsteriskKeyword_38()); 

                    }


                    }
                    break;
                case 40 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1360:6: ( '->' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1360:6: ( '->' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1361:1: '->'
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getHyphenMinusGreaterThanSignKeyword_39()); 
                    match(input,91,FOLLOW_91_in_rule__OverloadableOperator__Alternatives2924); 
                     after(grammarAccess.getOverloadableOperatorAccess().getHyphenMinusGreaterThanSignKeyword_39()); 

                    }


                    }
                    break;
                case 41 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1368:6: ( '()' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1368:6: ( '()' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1369:1: '()'
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getLeftParenthesisRightParenthesisKeyword_40()); 
                    match(input,92,FOLLOW_92_in_rule__OverloadableOperator__Alternatives2944); 
                     after(grammarAccess.getOverloadableOperatorAccess().getLeftParenthesisRightParenthesisKeyword_40()); 

                    }


                    }
                    break;
                case 42 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1376:6: ( '[]' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1376:6: ( '[]' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1377:1: '[]'
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getLeftSquareBracketRightSquareBracketKeyword_41()); 
                    match(input,93,FOLLOW_93_in_rule__OverloadableOperator__Alternatives2964); 
                     after(grammarAccess.getOverloadableOperatorAccess().getLeftSquareBracketRightSquareBracketKeyword_41()); 

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
    // $ANTLR end "rule__OverloadableOperator__Alternatives"


    // $ANTLR start "rule__TemplateParameter__Alternatives"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1389:1: rule__TemplateParameter__Alternatives : ( ( ruleTypeParameter ) | ( ruleParameterDeclaration ) );
    public final void rule__TemplateParameter__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1393:1: ( ( ruleTypeParameter ) | ( ruleParameterDeclaration ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=100 && LA6_0<=102)) ) {
                alt6=1;
            }
            else if ( (LA6_0==41) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1394:1: ( ruleTypeParameter )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1394:1: ( ruleTypeParameter )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1395:1: ruleTypeParameter
                    {
                     before(grammarAccess.getTemplateParameterAccess().getTypeParameterParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleTypeParameter_in_rule__TemplateParameter__Alternatives2998);
                    ruleTypeParameter();

                    state._fsp--;

                     after(grammarAccess.getTemplateParameterAccess().getTypeParameterParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1400:6: ( ruleParameterDeclaration )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1400:6: ( ruleParameterDeclaration )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1401:1: ruleParameterDeclaration
                    {
                     before(grammarAccess.getTemplateParameterAccess().getParameterDeclarationParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleParameterDeclaration_in_rule__TemplateParameter__Alternatives3015);
                    ruleParameterDeclaration();

                    state._fsp--;

                     after(grammarAccess.getTemplateParameterAccess().getParameterDeclarationParserRuleCall_1()); 

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
    // $ANTLR end "rule__TemplateParameter__Alternatives"


    // $ANTLR start "rule__TypeParameter__Alternatives"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1411:1: rule__TypeParameter__Alternatives : ( ( ( rule__TypeParameter__Group_0__0 ) ) | ( ( rule__TypeParameter__Group_1__0 ) ) | ( ( rule__TypeParameter__Group_2__0 ) ) );
    public final void rule__TypeParameter__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1415:1: ( ( ( rule__TypeParameter__Group_0__0 ) ) | ( ( rule__TypeParameter__Group_1__0 ) ) | ( ( rule__TypeParameter__Group_2__0 ) ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 100:
                {
                alt7=1;
                }
                break;
            case 101:
                {
                alt7=2;
                }
                break;
            case 102:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1416:1: ( ( rule__TypeParameter__Group_0__0 ) )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1416:1: ( ( rule__TypeParameter__Group_0__0 ) )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1417:1: ( rule__TypeParameter__Group_0__0 )
                    {
                     before(grammarAccess.getTypeParameterAccess().getGroup_0()); 
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1418:1: ( rule__TypeParameter__Group_0__0 )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1418:2: rule__TypeParameter__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__TypeParameter__Group_0__0_in_rule__TypeParameter__Alternatives3047);
                    rule__TypeParameter__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeParameterAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1422:6: ( ( rule__TypeParameter__Group_1__0 ) )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1422:6: ( ( rule__TypeParameter__Group_1__0 ) )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1423:1: ( rule__TypeParameter__Group_1__0 )
                    {
                     before(grammarAccess.getTypeParameterAccess().getGroup_1()); 
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1424:1: ( rule__TypeParameter__Group_1__0 )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1424:2: rule__TypeParameter__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__TypeParameter__Group_1__0_in_rule__TypeParameter__Alternatives3065);
                    rule__TypeParameter__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeParameterAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1428:6: ( ( rule__TypeParameter__Group_2__0 ) )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1428:6: ( ( rule__TypeParameter__Group_2__0 ) )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1429:1: ( rule__TypeParameter__Group_2__0 )
                    {
                     before(grammarAccess.getTypeParameterAccess().getGroup_2()); 
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1430:1: ( rule__TypeParameter__Group_2__0 )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1430:2: rule__TypeParameter__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__TypeParameter__Group_2__0_in_rule__TypeParameter__Alternatives3083);
                    rule__TypeParameter__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeParameterAccess().getGroup_2()); 

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
    // $ANTLR end "rule__TypeParameter__Alternatives"


    // $ANTLR start "rule__TypeParameter__Alternatives_0_1"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1439:1: rule__TypeParameter__Alternatives_0_1 : ( ( ( rule__TypeParameter__Group_0_1_0__0 ) ) | ( ( rule__TypeParameter__Group_0_1_1__0 ) ) );
    public final void rule__TypeParameter__Alternatives_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1443:1: ( ( ( rule__TypeParameter__Group_0_1_0__0 ) ) | ( ( rule__TypeParameter__Group_0_1_1__0 ) ) )
            int alt8=2;
            switch ( input.LA(1) ) {
            case EOF:
            case 68:
            case 89:
            case 94:
                {
                alt8=1;
                }
                break;
            case RULE_ID:
                {
                int LA8_2 = input.LA(2);

                if ( (LA8_2==66) ) {
                    alt8=2;
                }
                else if ( (LA8_2==EOF||LA8_2==68||LA8_2==89) ) {
                    alt8=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 2, input);

                    throw nvae;
                }
                }
                break;
            case 66:
                {
                alt8=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1444:1: ( ( rule__TypeParameter__Group_0_1_0__0 ) )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1444:1: ( ( rule__TypeParameter__Group_0_1_0__0 ) )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1445:1: ( rule__TypeParameter__Group_0_1_0__0 )
                    {
                     before(grammarAccess.getTypeParameterAccess().getGroup_0_1_0()); 
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1446:1: ( rule__TypeParameter__Group_0_1_0__0 )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1446:2: rule__TypeParameter__Group_0_1_0__0
                    {
                    pushFollow(FOLLOW_rule__TypeParameter__Group_0_1_0__0_in_rule__TypeParameter__Alternatives_0_13116);
                    rule__TypeParameter__Group_0_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeParameterAccess().getGroup_0_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1450:6: ( ( rule__TypeParameter__Group_0_1_1__0 ) )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1450:6: ( ( rule__TypeParameter__Group_0_1_1__0 ) )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1451:1: ( rule__TypeParameter__Group_0_1_1__0 )
                    {
                     before(grammarAccess.getTypeParameterAccess().getGroup_0_1_1()); 
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1452:1: ( rule__TypeParameter__Group_0_1_1__0 )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1452:2: rule__TypeParameter__Group_0_1_1__0
                    {
                    pushFollow(FOLLOW_rule__TypeParameter__Group_0_1_1__0_in_rule__TypeParameter__Alternatives_0_13134);
                    rule__TypeParameter__Group_0_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeParameterAccess().getGroup_0_1_1()); 

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
    // $ANTLR end "rule__TypeParameter__Alternatives_0_1"


    // $ANTLR start "rule__TypeParameter__Alternatives_1_1"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1461:1: rule__TypeParameter__Alternatives_1_1 : ( ( ( rule__TypeParameter__Group_1_1_0__0 ) ) | ( ( rule__TypeParameter__Group_1_1_1__0 ) ) );
    public final void rule__TypeParameter__Alternatives_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1465:1: ( ( ( rule__TypeParameter__Group_1_1_0__0 ) ) | ( ( rule__TypeParameter__Group_1_1_1__0 ) ) )
            int alt9=2;
            switch ( input.LA(1) ) {
            case EOF:
            case 68:
            case 89:
            case 94:
                {
                alt9=1;
                }
                break;
            case RULE_ID:
                {
                int LA9_2 = input.LA(2);

                if ( (LA9_2==66) ) {
                    alt9=2;
                }
                else if ( (LA9_2==EOF||LA9_2==68||LA9_2==89) ) {
                    alt9=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 2, input);

                    throw nvae;
                }
                }
                break;
            case 66:
                {
                alt9=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1466:1: ( ( rule__TypeParameter__Group_1_1_0__0 ) )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1466:1: ( ( rule__TypeParameter__Group_1_1_0__0 ) )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1467:1: ( rule__TypeParameter__Group_1_1_0__0 )
                    {
                     before(grammarAccess.getTypeParameterAccess().getGroup_1_1_0()); 
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1468:1: ( rule__TypeParameter__Group_1_1_0__0 )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1468:2: rule__TypeParameter__Group_1_1_0__0
                    {
                    pushFollow(FOLLOW_rule__TypeParameter__Group_1_1_0__0_in_rule__TypeParameter__Alternatives_1_13167);
                    rule__TypeParameter__Group_1_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeParameterAccess().getGroup_1_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1472:6: ( ( rule__TypeParameter__Group_1_1_1__0 ) )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1472:6: ( ( rule__TypeParameter__Group_1_1_1__0 ) )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1473:1: ( rule__TypeParameter__Group_1_1_1__0 )
                    {
                     before(grammarAccess.getTypeParameterAccess().getGroup_1_1_1()); 
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1474:1: ( rule__TypeParameter__Group_1_1_1__0 )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1474:2: rule__TypeParameter__Group_1_1_1__0
                    {
                    pushFollow(FOLLOW_rule__TypeParameter__Group_1_1_1__0_in_rule__TypeParameter__Alternatives_1_13185);
                    rule__TypeParameter__Group_1_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeParameterAccess().getGroup_1_1_1()); 

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
    // $ANTLR end "rule__TypeParameter__Alternatives_1_1"


    // $ANTLR start "rule__TypeParameter__Alternatives_2_5"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1483:1: rule__TypeParameter__Alternatives_2_5 : ( ( ( rule__TypeParameter__Group_2_5_0__0 ) ) | ( ( rule__TypeParameter__Group_2_5_1__0 ) ) );
    public final void rule__TypeParameter__Alternatives_2_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1487:1: ( ( ( rule__TypeParameter__Group_2_5_0__0 ) ) | ( ( rule__TypeParameter__Group_2_5_1__0 ) ) )
            int alt10=2;
            switch ( input.LA(1) ) {
            case EOF:
            case 68:
            case 89:
            case 94:
                {
                alt10=1;
                }
                break;
            case RULE_ID:
                {
                int LA10_2 = input.LA(2);

                if ( (LA10_2==66) ) {
                    alt10=2;
                }
                else if ( (LA10_2==EOF||LA10_2==68||LA10_2==89) ) {
                    alt10=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 2, input);

                    throw nvae;
                }
                }
                break;
            case 66:
                {
                alt10=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1488:1: ( ( rule__TypeParameter__Group_2_5_0__0 ) )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1488:1: ( ( rule__TypeParameter__Group_2_5_0__0 ) )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1489:1: ( rule__TypeParameter__Group_2_5_0__0 )
                    {
                     before(grammarAccess.getTypeParameterAccess().getGroup_2_5_0()); 
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1490:1: ( rule__TypeParameter__Group_2_5_0__0 )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1490:2: rule__TypeParameter__Group_2_5_0__0
                    {
                    pushFollow(FOLLOW_rule__TypeParameter__Group_2_5_0__0_in_rule__TypeParameter__Alternatives_2_53218);
                    rule__TypeParameter__Group_2_5_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeParameterAccess().getGroup_2_5_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1494:6: ( ( rule__TypeParameter__Group_2_5_1__0 ) )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1494:6: ( ( rule__TypeParameter__Group_2_5_1__0 ) )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1495:1: ( rule__TypeParameter__Group_2_5_1__0 )
                    {
                     before(grammarAccess.getTypeParameterAccess().getGroup_2_5_1()); 
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1496:1: ( rule__TypeParameter__Group_2_5_1__0 )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1496:2: rule__TypeParameter__Group_2_5_1__0
                    {
                    pushFollow(FOLLOW_rule__TypeParameter__Group_2_5_1__0_in_rule__TypeParameter__Alternatives_2_53236);
                    rule__TypeParameter__Group_2_5_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeParameterAccess().getGroup_2_5_1()); 

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
    // $ANTLR end "rule__TypeParameter__Alternatives_2_5"


    // $ANTLR start "rule__TemplateArgument__Alternatives"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1506:1: rule__TemplateArgument__Alternatives : ( ( ruleConstantExpression ) | ( ruleTypeId ) | ( ruleIdExpression ) );
    public final void rule__TemplateArgument__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1510:1: ( ( ruleConstantExpression ) | ( ruleTypeId ) | ( ruleIdExpression ) )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt11=1;
                }
                break;
            case 39:
                {
                alt11=2;
                }
                break;
            case 40:
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1511:1: ( ruleConstantExpression )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1511:1: ( ruleConstantExpression )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1512:1: ruleConstantExpression
                    {
                     before(grammarAccess.getTemplateArgumentAccess().getConstantExpressionParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleConstantExpression_in_rule__TemplateArgument__Alternatives3270);
                    ruleConstantExpression();

                    state._fsp--;

                     after(grammarAccess.getTemplateArgumentAccess().getConstantExpressionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1517:6: ( ruleTypeId )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1517:6: ( ruleTypeId )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1518:1: ruleTypeId
                    {
                     before(grammarAccess.getTemplateArgumentAccess().getTypeIdParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleTypeId_in_rule__TemplateArgument__Alternatives3287);
                    ruleTypeId();

                    state._fsp--;

                     after(grammarAccess.getTemplateArgumentAccess().getTypeIdParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1523:6: ( ruleIdExpression )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1523:6: ( ruleIdExpression )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1524:1: ruleIdExpression
                    {
                     before(grammarAccess.getTemplateArgumentAccess().getIdExpressionParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleIdExpression_in_rule__TemplateArgument__Alternatives3304);
                    ruleIdExpression();

                    state._fsp--;

                     after(grammarAccess.getTemplateArgumentAccess().getIdExpressionParserRuleCall_2()); 

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
    // $ANTLR end "rule__TemplateArgument__Alternatives"


    // $ANTLR start "rule__ExceptionDeclaration__Alternatives"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1535:1: rule__ExceptionDeclaration__Alternatives : ( ( ( rule__ExceptionDeclaration__Group_0__0 ) ) | ( '...' ) );
    public final void rule__ExceptionDeclaration__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1539:1: ( ( ( rule__ExceptionDeclaration__Group_0__0 ) ) | ( '...' ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=45 && LA12_0<=46)) ) {
                alt12=1;
            }
            else if ( (LA12_0==94) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1540:1: ( ( rule__ExceptionDeclaration__Group_0__0 ) )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1540:1: ( ( rule__ExceptionDeclaration__Group_0__0 ) )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1541:1: ( rule__ExceptionDeclaration__Group_0__0 )
                    {
                     before(grammarAccess.getExceptionDeclarationAccess().getGroup_0()); 
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1542:1: ( rule__ExceptionDeclaration__Group_0__0 )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1542:2: rule__ExceptionDeclaration__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__ExceptionDeclaration__Group_0__0_in_rule__ExceptionDeclaration__Alternatives3337);
                    rule__ExceptionDeclaration__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExceptionDeclarationAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1546:6: ( '...' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1546:6: ( '...' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1547:1: '...'
                    {
                     before(grammarAccess.getExceptionDeclarationAccess().getFullStopFullStopFullStopKeyword_1()); 
                    match(input,94,FOLLOW_94_in_rule__ExceptionDeclaration__Alternatives3356); 
                     after(grammarAccess.getExceptionDeclarationAccess().getFullStopFullStopFullStopKeyword_1()); 

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
    // $ANTLR end "rule__ExceptionDeclaration__Alternatives"


    // $ANTLR start "rule__ExceptionDeclaration__Alternatives_0_2"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1559:1: rule__ExceptionDeclaration__Alternatives_0_2 : ( ( ruleDeclarator ) | ( ( ruleAbstractDeclarator )? ) );
    public final void rule__ExceptionDeclaration__Alternatives_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1563:1: ( ( ruleDeclarator ) | ( ( ruleAbstractDeclarator )? ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==47) ) {
                alt14=1;
            }
            else if ( (LA14_0==EOF||LA14_0==48||LA14_0==105) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1564:1: ( ruleDeclarator )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1564:1: ( ruleDeclarator )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1565:1: ruleDeclarator
                    {
                     before(grammarAccess.getExceptionDeclarationAccess().getDeclaratorParserRuleCall_0_2_0()); 
                    pushFollow(FOLLOW_ruleDeclarator_in_rule__ExceptionDeclaration__Alternatives_0_23390);
                    ruleDeclarator();

                    state._fsp--;

                     after(grammarAccess.getExceptionDeclarationAccess().getDeclaratorParserRuleCall_0_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1570:6: ( ( ruleAbstractDeclarator )? )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1570:6: ( ( ruleAbstractDeclarator )? )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1571:1: ( ruleAbstractDeclarator )?
                    {
                     before(grammarAccess.getExceptionDeclarationAccess().getAbstractDeclaratorParserRuleCall_0_2_1()); 
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1572:1: ( ruleAbstractDeclarator )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==48) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1572:3: ruleAbstractDeclarator
                            {
                            pushFollow(FOLLOW_ruleAbstractDeclarator_in_rule__ExceptionDeclaration__Alternatives_0_23408);
                            ruleAbstractDeclarator();

                            state._fsp--;


                            }
                            break;

                    }

                     after(grammarAccess.getExceptionDeclarationAccess().getAbstractDeclaratorParserRuleCall_0_2_1()); 

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
    // $ANTLR end "rule__ExceptionDeclaration__Alternatives_0_2"


    // $ANTLR start "rule__Token__Group_2__0"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1587:1: rule__Token__Group_2__0 : rule__Token__Group_2__0__Impl rule__Token__Group_2__1 ;
    public final void rule__Token__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1591:1: ( rule__Token__Group_2__0__Impl rule__Token__Group_2__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1592:2: rule__Token__Group_2__0__Impl rule__Token__Group_2__1
            {
            pushFollow(FOLLOW_rule__Token__Group_2__0__Impl_in_rule__Token__Group_2__03444);
            rule__Token__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Token__Group_2__1_in_rule__Token__Group_2__03447);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1599:1: rule__Token__Group_2__0__Impl : ( RULE_PREPROCESSING_OP_OR_PUNC ) ;
    public final void rule__Token__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1603:1: ( ( RULE_PREPROCESSING_OP_OR_PUNC ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1604:1: ( RULE_PREPROCESSING_OP_OR_PUNC )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1604:1: ( RULE_PREPROCESSING_OP_OR_PUNC )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1605:1: RULE_PREPROCESSING_OP_OR_PUNC
            {
             before(grammarAccess.getTokenAccess().getPREPROCESSING_OP_OR_PUNCTerminalRuleCall_2_0()); 
            match(input,RULE_PREPROCESSING_OP_OR_PUNC,FOLLOW_RULE_PREPROCESSING_OP_OR_PUNC_in_rule__Token__Group_2__0__Impl3474); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1616:1: rule__Token__Group_2__1 : rule__Token__Group_2__1__Impl ;
    public final void rule__Token__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1620:1: ( rule__Token__Group_2__1__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1621:2: rule__Token__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Token__Group_2__1__Impl_in_rule__Token__Group_2__13503);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1627:1: rule__Token__Group_2__1__Impl : ( RULE_ID ) ;
    public final void rule__Token__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1631:1: ( ( RULE_ID ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1632:1: ( RULE_ID )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1632:1: ( RULE_ID )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1633:1: RULE_ID
            {
             before(grammarAccess.getTokenAccess().getIDTerminalRuleCall_2_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Token__Group_2__1__Impl3530); 
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


    // $ANTLR start "rule__Literal__Group_4__0"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1648:1: rule__Literal__Group_4__0 : rule__Literal__Group_4__0__Impl rule__Literal__Group_4__1 ;
    public final void rule__Literal__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1652:1: ( rule__Literal__Group_4__0__Impl rule__Literal__Group_4__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1653:2: rule__Literal__Group_4__0__Impl rule__Literal__Group_4__1
            {
            pushFollow(FOLLOW_rule__Literal__Group_4__0__Impl_in_rule__Literal__Group_4__03563);
            rule__Literal__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Literal__Group_4__1_in_rule__Literal__Group_4__03566);
            rule__Literal__Group_4__1();

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
    // $ANTLR end "rule__Literal__Group_4__0"


    // $ANTLR start "rule__Literal__Group_4__0__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1660:1: rule__Literal__Group_4__0__Impl : ( ( rule__Literal__Alternatives_4_0 ) ) ;
    public final void rule__Literal__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1664:1: ( ( ( rule__Literal__Alternatives_4_0 ) ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1665:1: ( ( rule__Literal__Alternatives_4_0 ) )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1665:1: ( ( rule__Literal__Alternatives_4_0 ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1666:1: ( rule__Literal__Alternatives_4_0 )
            {
             before(grammarAccess.getLiteralAccess().getAlternatives_4_0()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1667:1: ( rule__Literal__Alternatives_4_0 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1667:2: rule__Literal__Alternatives_4_0
            {
            pushFollow(FOLLOW_rule__Literal__Alternatives_4_0_in_rule__Literal__Group_4__0__Impl3593);
            rule__Literal__Alternatives_4_0();

            state._fsp--;


            }

             after(grammarAccess.getLiteralAccess().getAlternatives_4_0()); 

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
    // $ANTLR end "rule__Literal__Group_4__0__Impl"


    // $ANTLR start "rule__Literal__Group_4__1"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1677:1: rule__Literal__Group_4__1 : rule__Literal__Group_4__1__Impl ;
    public final void rule__Literal__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1681:1: ( rule__Literal__Group_4__1__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1682:2: rule__Literal__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Literal__Group_4__1__Impl_in_rule__Literal__Group_4__13623);
            rule__Literal__Group_4__1__Impl();

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
    // $ANTLR end "rule__Literal__Group_4__1"


    // $ANTLR start "rule__Literal__Group_4__1__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1688:1: rule__Literal__Group_4__1__Impl : ( 'nullptr' ) ;
    public final void rule__Literal__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1692:1: ( ( 'nullptr' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1693:1: ( 'nullptr' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1693:1: ( 'nullptr' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1694:1: 'nullptr'
            {
             before(grammarAccess.getLiteralAccess().getNullptrKeyword_4_1()); 
            match(input,95,FOLLOW_95_in_rule__Literal__Group_4__1__Impl3651); 
             after(grammarAccess.getLiteralAccess().getNullptrKeyword_4_1()); 

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
    // $ANTLR end "rule__Literal__Group_4__1__Impl"


    // $ANTLR start "rule__OperatorFunctionId__Group__0"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1711:1: rule__OperatorFunctionId__Group__0 : rule__OperatorFunctionId__Group__0__Impl rule__OperatorFunctionId__Group__1 ;
    public final void rule__OperatorFunctionId__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1715:1: ( rule__OperatorFunctionId__Group__0__Impl rule__OperatorFunctionId__Group__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1716:2: rule__OperatorFunctionId__Group__0__Impl rule__OperatorFunctionId__Group__1
            {
            pushFollow(FOLLOW_rule__OperatorFunctionId__Group__0__Impl_in_rule__OperatorFunctionId__Group__03686);
            rule__OperatorFunctionId__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OperatorFunctionId__Group__1_in_rule__OperatorFunctionId__Group__03689);
            rule__OperatorFunctionId__Group__1();

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
    // $ANTLR end "rule__OperatorFunctionId__Group__0"


    // $ANTLR start "rule__OperatorFunctionId__Group__0__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1723:1: rule__OperatorFunctionId__Group__0__Impl : ( 'operator' ) ;
    public final void rule__OperatorFunctionId__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1727:1: ( ( 'operator' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1728:1: ( 'operator' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1728:1: ( 'operator' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1729:1: 'operator'
            {
             before(grammarAccess.getOperatorFunctionIdAccess().getOperatorKeyword_0()); 
            match(input,96,FOLLOW_96_in_rule__OperatorFunctionId__Group__0__Impl3717); 
             after(grammarAccess.getOperatorFunctionIdAccess().getOperatorKeyword_0()); 

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
    // $ANTLR end "rule__OperatorFunctionId__Group__0__Impl"


    // $ANTLR start "rule__OperatorFunctionId__Group__1"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1742:1: rule__OperatorFunctionId__Group__1 : rule__OperatorFunctionId__Group__1__Impl rule__OperatorFunctionId__Group__2 ;
    public final void rule__OperatorFunctionId__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1746:1: ( rule__OperatorFunctionId__Group__1__Impl rule__OperatorFunctionId__Group__2 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1747:2: rule__OperatorFunctionId__Group__1__Impl rule__OperatorFunctionId__Group__2
            {
            pushFollow(FOLLOW_rule__OperatorFunctionId__Group__1__Impl_in_rule__OperatorFunctionId__Group__13748);
            rule__OperatorFunctionId__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OperatorFunctionId__Group__2_in_rule__OperatorFunctionId__Group__13751);
            rule__OperatorFunctionId__Group__2();

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
    // $ANTLR end "rule__OperatorFunctionId__Group__1"


    // $ANTLR start "rule__OperatorFunctionId__Group__1__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1754:1: rule__OperatorFunctionId__Group__1__Impl : ( ruleOverloadableOperator ) ;
    public final void rule__OperatorFunctionId__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1758:1: ( ( ruleOverloadableOperator ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1759:1: ( ruleOverloadableOperator )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1759:1: ( ruleOverloadableOperator )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1760:1: ruleOverloadableOperator
            {
             before(grammarAccess.getOperatorFunctionIdAccess().getOverloadableOperatorParserRuleCall_1()); 
            pushFollow(FOLLOW_ruleOverloadableOperator_in_rule__OperatorFunctionId__Group__1__Impl3778);
            ruleOverloadableOperator();

            state._fsp--;

             after(grammarAccess.getOperatorFunctionIdAccess().getOverloadableOperatorParserRuleCall_1()); 

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
    // $ANTLR end "rule__OperatorFunctionId__Group__1__Impl"


    // $ANTLR start "rule__OperatorFunctionId__Group__2"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1771:1: rule__OperatorFunctionId__Group__2 : rule__OperatorFunctionId__Group__2__Impl ;
    public final void rule__OperatorFunctionId__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1775:1: ( rule__OperatorFunctionId__Group__2__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1776:2: rule__OperatorFunctionId__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__OperatorFunctionId__Group__2__Impl_in_rule__OperatorFunctionId__Group__23807);
            rule__OperatorFunctionId__Group__2__Impl();

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
    // $ANTLR end "rule__OperatorFunctionId__Group__2"


    // $ANTLR start "rule__OperatorFunctionId__Group__2__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1782:1: rule__OperatorFunctionId__Group__2__Impl : ( ( rule__OperatorFunctionId__Group_2__0 )? ) ;
    public final void rule__OperatorFunctionId__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1786:1: ( ( ( rule__OperatorFunctionId__Group_2__0 )? ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1787:1: ( ( rule__OperatorFunctionId__Group_2__0 )? )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1787:1: ( ( rule__OperatorFunctionId__Group_2__0 )? )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1788:1: ( rule__OperatorFunctionId__Group_2__0 )?
            {
             before(grammarAccess.getOperatorFunctionIdAccess().getGroup_2()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1789:1: ( rule__OperatorFunctionId__Group_2__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==67) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1789:2: rule__OperatorFunctionId__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__OperatorFunctionId__Group_2__0_in_rule__OperatorFunctionId__Group__2__Impl3834);
                    rule__OperatorFunctionId__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOperatorFunctionIdAccess().getGroup_2()); 

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
    // $ANTLR end "rule__OperatorFunctionId__Group__2__Impl"


    // $ANTLR start "rule__OperatorFunctionId__Group_2__0"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1805:1: rule__OperatorFunctionId__Group_2__0 : rule__OperatorFunctionId__Group_2__0__Impl rule__OperatorFunctionId__Group_2__1 ;
    public final void rule__OperatorFunctionId__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1809:1: ( rule__OperatorFunctionId__Group_2__0__Impl rule__OperatorFunctionId__Group_2__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1810:2: rule__OperatorFunctionId__Group_2__0__Impl rule__OperatorFunctionId__Group_2__1
            {
            pushFollow(FOLLOW_rule__OperatorFunctionId__Group_2__0__Impl_in_rule__OperatorFunctionId__Group_2__03871);
            rule__OperatorFunctionId__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OperatorFunctionId__Group_2__1_in_rule__OperatorFunctionId__Group_2__03874);
            rule__OperatorFunctionId__Group_2__1();

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
    // $ANTLR end "rule__OperatorFunctionId__Group_2__0"


    // $ANTLR start "rule__OperatorFunctionId__Group_2__0__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1817:1: rule__OperatorFunctionId__Group_2__0__Impl : ( '<' ) ;
    public final void rule__OperatorFunctionId__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1821:1: ( ( '<' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1822:1: ( '<' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1822:1: ( '<' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1823:1: '<'
            {
             before(grammarAccess.getOperatorFunctionIdAccess().getLessThanSignKeyword_2_0()); 
            match(input,67,FOLLOW_67_in_rule__OperatorFunctionId__Group_2__0__Impl3902); 
             after(grammarAccess.getOperatorFunctionIdAccess().getLessThanSignKeyword_2_0()); 

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
    // $ANTLR end "rule__OperatorFunctionId__Group_2__0__Impl"


    // $ANTLR start "rule__OperatorFunctionId__Group_2__1"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1836:1: rule__OperatorFunctionId__Group_2__1 : rule__OperatorFunctionId__Group_2__1__Impl rule__OperatorFunctionId__Group_2__2 ;
    public final void rule__OperatorFunctionId__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1840:1: ( rule__OperatorFunctionId__Group_2__1__Impl rule__OperatorFunctionId__Group_2__2 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1841:2: rule__OperatorFunctionId__Group_2__1__Impl rule__OperatorFunctionId__Group_2__2
            {
            pushFollow(FOLLOW_rule__OperatorFunctionId__Group_2__1__Impl_in_rule__OperatorFunctionId__Group_2__13933);
            rule__OperatorFunctionId__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OperatorFunctionId__Group_2__2_in_rule__OperatorFunctionId__Group_2__13936);
            rule__OperatorFunctionId__Group_2__2();

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
    // $ANTLR end "rule__OperatorFunctionId__Group_2__1"


    // $ANTLR start "rule__OperatorFunctionId__Group_2__1__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1848:1: rule__OperatorFunctionId__Group_2__1__Impl : ( ( ruleTemplateArgument )* ) ;
    public final void rule__OperatorFunctionId__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1852:1: ( ( ( ruleTemplateArgument )* ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1853:1: ( ( ruleTemplateArgument )* )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1853:1: ( ( ruleTemplateArgument )* )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1854:1: ( ruleTemplateArgument )*
            {
             before(grammarAccess.getOperatorFunctionIdAccess().getTemplateArgumentParserRuleCall_2_1()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1855:1: ( ruleTemplateArgument )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=38 && LA16_0<=40)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1855:3: ruleTemplateArgument
            	    {
            	    pushFollow(FOLLOW_ruleTemplateArgument_in_rule__OperatorFunctionId__Group_2__1__Impl3964);
            	    ruleTemplateArgument();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getOperatorFunctionIdAccess().getTemplateArgumentParserRuleCall_2_1()); 

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
    // $ANTLR end "rule__OperatorFunctionId__Group_2__1__Impl"


    // $ANTLR start "rule__OperatorFunctionId__Group_2__2"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1865:1: rule__OperatorFunctionId__Group_2__2 : rule__OperatorFunctionId__Group_2__2__Impl ;
    public final void rule__OperatorFunctionId__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1869:1: ( rule__OperatorFunctionId__Group_2__2__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1870:2: rule__OperatorFunctionId__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__OperatorFunctionId__Group_2__2__Impl_in_rule__OperatorFunctionId__Group_2__23995);
            rule__OperatorFunctionId__Group_2__2__Impl();

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
    // $ANTLR end "rule__OperatorFunctionId__Group_2__2"


    // $ANTLR start "rule__OperatorFunctionId__Group_2__2__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1876:1: rule__OperatorFunctionId__Group_2__2__Impl : ( '>' ) ;
    public final void rule__OperatorFunctionId__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1880:1: ( ( '>' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1881:1: ( '>' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1881:1: ( '>' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1882:1: '>'
            {
             before(grammarAccess.getOperatorFunctionIdAccess().getGreaterThanSignKeyword_2_2()); 
            match(input,68,FOLLOW_68_in_rule__OperatorFunctionId__Group_2__2__Impl4023); 
             after(grammarAccess.getOperatorFunctionIdAccess().getGreaterThanSignKeyword_2_2()); 

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
    // $ANTLR end "rule__OperatorFunctionId__Group_2__2__Impl"


    // $ANTLR start "rule__OverloadableOperator__Group_2__0"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1901:1: rule__OverloadableOperator__Group_2__0 : rule__OverloadableOperator__Group_2__0__Impl rule__OverloadableOperator__Group_2__1 ;
    public final void rule__OverloadableOperator__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1905:1: ( rule__OverloadableOperator__Group_2__0__Impl rule__OverloadableOperator__Group_2__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1906:2: rule__OverloadableOperator__Group_2__0__Impl rule__OverloadableOperator__Group_2__1
            {
            pushFollow(FOLLOW_rule__OverloadableOperator__Group_2__0__Impl_in_rule__OverloadableOperator__Group_2__04060);
            rule__OverloadableOperator__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OverloadableOperator__Group_2__1_in_rule__OverloadableOperator__Group_2__04063);
            rule__OverloadableOperator__Group_2__1();

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
    // $ANTLR end "rule__OverloadableOperator__Group_2__0"


    // $ANTLR start "rule__OverloadableOperator__Group_2__0__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1913:1: rule__OverloadableOperator__Group_2__0__Impl : ( 'new' ) ;
    public final void rule__OverloadableOperator__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1917:1: ( ( 'new' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1918:1: ( 'new' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1918:1: ( 'new' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1919:1: 'new'
            {
             before(grammarAccess.getOverloadableOperatorAccess().getNewKeyword_2_0()); 
            match(input,54,FOLLOW_54_in_rule__OverloadableOperator__Group_2__0__Impl4091); 
             after(grammarAccess.getOverloadableOperatorAccess().getNewKeyword_2_0()); 

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
    // $ANTLR end "rule__OverloadableOperator__Group_2__0__Impl"


    // $ANTLR start "rule__OverloadableOperator__Group_2__1"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1932:1: rule__OverloadableOperator__Group_2__1 : rule__OverloadableOperator__Group_2__1__Impl rule__OverloadableOperator__Group_2__2 ;
    public final void rule__OverloadableOperator__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1936:1: ( rule__OverloadableOperator__Group_2__1__Impl rule__OverloadableOperator__Group_2__2 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1937:2: rule__OverloadableOperator__Group_2__1__Impl rule__OverloadableOperator__Group_2__2
            {
            pushFollow(FOLLOW_rule__OverloadableOperator__Group_2__1__Impl_in_rule__OverloadableOperator__Group_2__14122);
            rule__OverloadableOperator__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OverloadableOperator__Group_2__2_in_rule__OverloadableOperator__Group_2__14125);
            rule__OverloadableOperator__Group_2__2();

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
    // $ANTLR end "rule__OverloadableOperator__Group_2__1"


    // $ANTLR start "rule__OverloadableOperator__Group_2__1__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1944:1: rule__OverloadableOperator__Group_2__1__Impl : ( '[' ) ;
    public final void rule__OverloadableOperator__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1948:1: ( ( '[' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1949:1: ( '[' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1949:1: ( '[' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1950:1: '['
            {
             before(grammarAccess.getOverloadableOperatorAccess().getLeftSquareBracketKeyword_2_1()); 
            match(input,97,FOLLOW_97_in_rule__OverloadableOperator__Group_2__1__Impl4153); 
             after(grammarAccess.getOverloadableOperatorAccess().getLeftSquareBracketKeyword_2_1()); 

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
    // $ANTLR end "rule__OverloadableOperator__Group_2__1__Impl"


    // $ANTLR start "rule__OverloadableOperator__Group_2__2"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1963:1: rule__OverloadableOperator__Group_2__2 : rule__OverloadableOperator__Group_2__2__Impl ;
    public final void rule__OverloadableOperator__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1967:1: ( rule__OverloadableOperator__Group_2__2__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1968:2: rule__OverloadableOperator__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__OverloadableOperator__Group_2__2__Impl_in_rule__OverloadableOperator__Group_2__24184);
            rule__OverloadableOperator__Group_2__2__Impl();

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
    // $ANTLR end "rule__OverloadableOperator__Group_2__2"


    // $ANTLR start "rule__OverloadableOperator__Group_2__2__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1974:1: rule__OverloadableOperator__Group_2__2__Impl : ( ']' ) ;
    public final void rule__OverloadableOperator__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1978:1: ( ( ']' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1979:1: ( ']' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1979:1: ( ']' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1980:1: ']'
            {
             before(grammarAccess.getOverloadableOperatorAccess().getRightSquareBracketKeyword_2_2()); 
            match(input,98,FOLLOW_98_in_rule__OverloadableOperator__Group_2__2__Impl4212); 
             after(grammarAccess.getOverloadableOperatorAccess().getRightSquareBracketKeyword_2_2()); 

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
    // $ANTLR end "rule__OverloadableOperator__Group_2__2__Impl"


    // $ANTLR start "rule__OverloadableOperator__Group_3__0"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1999:1: rule__OverloadableOperator__Group_3__0 : rule__OverloadableOperator__Group_3__0__Impl rule__OverloadableOperator__Group_3__1 ;
    public final void rule__OverloadableOperator__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2003:1: ( rule__OverloadableOperator__Group_3__0__Impl rule__OverloadableOperator__Group_3__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2004:2: rule__OverloadableOperator__Group_3__0__Impl rule__OverloadableOperator__Group_3__1
            {
            pushFollow(FOLLOW_rule__OverloadableOperator__Group_3__0__Impl_in_rule__OverloadableOperator__Group_3__04249);
            rule__OverloadableOperator__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OverloadableOperator__Group_3__1_in_rule__OverloadableOperator__Group_3__04252);
            rule__OverloadableOperator__Group_3__1();

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
    // $ANTLR end "rule__OverloadableOperator__Group_3__0"


    // $ANTLR start "rule__OverloadableOperator__Group_3__0__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2011:1: rule__OverloadableOperator__Group_3__0__Impl : ( 'delete' ) ;
    public final void rule__OverloadableOperator__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2015:1: ( ( 'delete' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2016:1: ( 'delete' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2016:1: ( 'delete' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2017:1: 'delete'
            {
             before(grammarAccess.getOverloadableOperatorAccess().getDeleteKeyword_3_0()); 
            match(input,55,FOLLOW_55_in_rule__OverloadableOperator__Group_3__0__Impl4280); 
             after(grammarAccess.getOverloadableOperatorAccess().getDeleteKeyword_3_0()); 

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
    // $ANTLR end "rule__OverloadableOperator__Group_3__0__Impl"


    // $ANTLR start "rule__OverloadableOperator__Group_3__1"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2030:1: rule__OverloadableOperator__Group_3__1 : rule__OverloadableOperator__Group_3__1__Impl rule__OverloadableOperator__Group_3__2 ;
    public final void rule__OverloadableOperator__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2034:1: ( rule__OverloadableOperator__Group_3__1__Impl rule__OverloadableOperator__Group_3__2 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2035:2: rule__OverloadableOperator__Group_3__1__Impl rule__OverloadableOperator__Group_3__2
            {
            pushFollow(FOLLOW_rule__OverloadableOperator__Group_3__1__Impl_in_rule__OverloadableOperator__Group_3__14311);
            rule__OverloadableOperator__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OverloadableOperator__Group_3__2_in_rule__OverloadableOperator__Group_3__14314);
            rule__OverloadableOperator__Group_3__2();

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
    // $ANTLR end "rule__OverloadableOperator__Group_3__1"


    // $ANTLR start "rule__OverloadableOperator__Group_3__1__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2042:1: rule__OverloadableOperator__Group_3__1__Impl : ( '[' ) ;
    public final void rule__OverloadableOperator__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2046:1: ( ( '[' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2047:1: ( '[' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2047:1: ( '[' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2048:1: '['
            {
             before(grammarAccess.getOverloadableOperatorAccess().getLeftSquareBracketKeyword_3_1()); 
            match(input,97,FOLLOW_97_in_rule__OverloadableOperator__Group_3__1__Impl4342); 
             after(grammarAccess.getOverloadableOperatorAccess().getLeftSquareBracketKeyword_3_1()); 

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
    // $ANTLR end "rule__OverloadableOperator__Group_3__1__Impl"


    // $ANTLR start "rule__OverloadableOperator__Group_3__2"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2061:1: rule__OverloadableOperator__Group_3__2 : rule__OverloadableOperator__Group_3__2__Impl ;
    public final void rule__OverloadableOperator__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2065:1: ( rule__OverloadableOperator__Group_3__2__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2066:2: rule__OverloadableOperator__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__OverloadableOperator__Group_3__2__Impl_in_rule__OverloadableOperator__Group_3__24373);
            rule__OverloadableOperator__Group_3__2__Impl();

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
    // $ANTLR end "rule__OverloadableOperator__Group_3__2"


    // $ANTLR start "rule__OverloadableOperator__Group_3__2__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2072:1: rule__OverloadableOperator__Group_3__2__Impl : ( ']' ) ;
    public final void rule__OverloadableOperator__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2076:1: ( ( ']' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2077:1: ( ']' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2077:1: ( ']' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2078:1: ']'
            {
             before(grammarAccess.getOverloadableOperatorAccess().getRightSquareBracketKeyword_3_2()); 
            match(input,98,FOLLOW_98_in_rule__OverloadableOperator__Group_3__2__Impl4401); 
             after(grammarAccess.getOverloadableOperatorAccess().getRightSquareBracketKeyword_3_2()); 

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
    // $ANTLR end "rule__OverloadableOperator__Group_3__2__Impl"


    // $ANTLR start "rule__LiteralOperatorId__Group__0"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2097:1: rule__LiteralOperatorId__Group__0 : rule__LiteralOperatorId__Group__0__Impl rule__LiteralOperatorId__Group__1 ;
    public final void rule__LiteralOperatorId__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2101:1: ( rule__LiteralOperatorId__Group__0__Impl rule__LiteralOperatorId__Group__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2102:2: rule__LiteralOperatorId__Group__0__Impl rule__LiteralOperatorId__Group__1
            {
            pushFollow(FOLLOW_rule__LiteralOperatorId__Group__0__Impl_in_rule__LiteralOperatorId__Group__04438);
            rule__LiteralOperatorId__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LiteralOperatorId__Group__1_in_rule__LiteralOperatorId__Group__04441);
            rule__LiteralOperatorId__Group__1();

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
    // $ANTLR end "rule__LiteralOperatorId__Group__0"


    // $ANTLR start "rule__LiteralOperatorId__Group__0__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2109:1: rule__LiteralOperatorId__Group__0__Impl : ( 'operator' ) ;
    public final void rule__LiteralOperatorId__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2113:1: ( ( 'operator' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2114:1: ( 'operator' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2114:1: ( 'operator' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2115:1: 'operator'
            {
             before(grammarAccess.getLiteralOperatorIdAccess().getOperatorKeyword_0()); 
            match(input,96,FOLLOW_96_in_rule__LiteralOperatorId__Group__0__Impl4469); 
             after(grammarAccess.getLiteralOperatorIdAccess().getOperatorKeyword_0()); 

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
    // $ANTLR end "rule__LiteralOperatorId__Group__0__Impl"


    // $ANTLR start "rule__LiteralOperatorId__Group__1"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2128:1: rule__LiteralOperatorId__Group__1 : rule__LiteralOperatorId__Group__1__Impl rule__LiteralOperatorId__Group__2 ;
    public final void rule__LiteralOperatorId__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2132:1: ( rule__LiteralOperatorId__Group__1__Impl rule__LiteralOperatorId__Group__2 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2133:2: rule__LiteralOperatorId__Group__1__Impl rule__LiteralOperatorId__Group__2
            {
            pushFollow(FOLLOW_rule__LiteralOperatorId__Group__1__Impl_in_rule__LiteralOperatorId__Group__14500);
            rule__LiteralOperatorId__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LiteralOperatorId__Group__2_in_rule__LiteralOperatorId__Group__14503);
            rule__LiteralOperatorId__Group__2();

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
    // $ANTLR end "rule__LiteralOperatorId__Group__1"


    // $ANTLR start "rule__LiteralOperatorId__Group__1__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2140:1: rule__LiteralOperatorId__Group__1__Impl : ( '\"' ) ;
    public final void rule__LiteralOperatorId__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2144:1: ( ( '\"' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2145:1: ( '\"' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2145:1: ( '\"' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2146:1: '\"'
            {
             before(grammarAccess.getLiteralOperatorIdAccess().getQuotationMarkKeyword_1()); 
            match(input,99,FOLLOW_99_in_rule__LiteralOperatorId__Group__1__Impl4531); 
             after(grammarAccess.getLiteralOperatorIdAccess().getQuotationMarkKeyword_1()); 

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
    // $ANTLR end "rule__LiteralOperatorId__Group__1__Impl"


    // $ANTLR start "rule__LiteralOperatorId__Group__2"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2159:1: rule__LiteralOperatorId__Group__2 : rule__LiteralOperatorId__Group__2__Impl ;
    public final void rule__LiteralOperatorId__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2163:1: ( rule__LiteralOperatorId__Group__2__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2164:2: rule__LiteralOperatorId__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__LiteralOperatorId__Group__2__Impl_in_rule__LiteralOperatorId__Group__24562);
            rule__LiteralOperatorId__Group__2__Impl();

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
    // $ANTLR end "rule__LiteralOperatorId__Group__2"


    // $ANTLR start "rule__LiteralOperatorId__Group__2__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2170:1: rule__LiteralOperatorId__Group__2__Impl : ( '\"' ) ;
    public final void rule__LiteralOperatorId__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2174:1: ( ( '\"' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2175:1: ( '\"' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2175:1: ( '\"' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2176:1: '\"'
            {
             before(grammarAccess.getLiteralOperatorIdAccess().getQuotationMarkKeyword_2()); 
            match(input,99,FOLLOW_99_in_rule__LiteralOperatorId__Group__2__Impl4590); 
             after(grammarAccess.getLiteralOperatorIdAccess().getQuotationMarkKeyword_2()); 

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
    // $ANTLR end "rule__LiteralOperatorId__Group__2__Impl"


    // $ANTLR start "rule__TemplateParameterList__Group__0"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2196:1: rule__TemplateParameterList__Group__0 : rule__TemplateParameterList__Group__0__Impl rule__TemplateParameterList__Group__1 ;
    public final void rule__TemplateParameterList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2200:1: ( rule__TemplateParameterList__Group__0__Impl rule__TemplateParameterList__Group__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2201:2: rule__TemplateParameterList__Group__0__Impl rule__TemplateParameterList__Group__1
            {
            pushFollow(FOLLOW_rule__TemplateParameterList__Group__0__Impl_in_rule__TemplateParameterList__Group__04628);
            rule__TemplateParameterList__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TemplateParameterList__Group__1_in_rule__TemplateParameterList__Group__04631);
            rule__TemplateParameterList__Group__1();

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
    // $ANTLR end "rule__TemplateParameterList__Group__0"


    // $ANTLR start "rule__TemplateParameterList__Group__0__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2208:1: rule__TemplateParameterList__Group__0__Impl : ( ruleTemplateParameter ) ;
    public final void rule__TemplateParameterList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2212:1: ( ( ruleTemplateParameter ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2213:1: ( ruleTemplateParameter )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2213:1: ( ruleTemplateParameter )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2214:1: ruleTemplateParameter
            {
             before(grammarAccess.getTemplateParameterListAccess().getTemplateParameterParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleTemplateParameter_in_rule__TemplateParameterList__Group__0__Impl4658);
            ruleTemplateParameter();

            state._fsp--;

             after(grammarAccess.getTemplateParameterListAccess().getTemplateParameterParserRuleCall_0()); 

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
    // $ANTLR end "rule__TemplateParameterList__Group__0__Impl"


    // $ANTLR start "rule__TemplateParameterList__Group__1"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2225:1: rule__TemplateParameterList__Group__1 : rule__TemplateParameterList__Group__1__Impl ;
    public final void rule__TemplateParameterList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2229:1: ( rule__TemplateParameterList__Group__1__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2230:2: rule__TemplateParameterList__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__TemplateParameterList__Group__1__Impl_in_rule__TemplateParameterList__Group__14687);
            rule__TemplateParameterList__Group__1__Impl();

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
    // $ANTLR end "rule__TemplateParameterList__Group__1"


    // $ANTLR start "rule__TemplateParameterList__Group__1__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2236:1: rule__TemplateParameterList__Group__1__Impl : ( ( rule__TemplateParameterList__Group_1__0 )* ) ;
    public final void rule__TemplateParameterList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2240:1: ( ( ( rule__TemplateParameterList__Group_1__0 )* ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2241:1: ( ( rule__TemplateParameterList__Group_1__0 )* )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2241:1: ( ( rule__TemplateParameterList__Group_1__0 )* )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2242:1: ( rule__TemplateParameterList__Group_1__0 )*
            {
             before(grammarAccess.getTemplateParameterListAccess().getGroup_1()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2243:1: ( rule__TemplateParameterList__Group_1__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==89) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2243:2: rule__TemplateParameterList__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__TemplateParameterList__Group_1__0_in_rule__TemplateParameterList__Group__1__Impl4714);
            	    rule__TemplateParameterList__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getTemplateParameterListAccess().getGroup_1()); 

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
    // $ANTLR end "rule__TemplateParameterList__Group__1__Impl"


    // $ANTLR start "rule__TemplateParameterList__Group_1__0"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2257:1: rule__TemplateParameterList__Group_1__0 : rule__TemplateParameterList__Group_1__0__Impl rule__TemplateParameterList__Group_1__1 ;
    public final void rule__TemplateParameterList__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2261:1: ( rule__TemplateParameterList__Group_1__0__Impl rule__TemplateParameterList__Group_1__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2262:2: rule__TemplateParameterList__Group_1__0__Impl rule__TemplateParameterList__Group_1__1
            {
            pushFollow(FOLLOW_rule__TemplateParameterList__Group_1__0__Impl_in_rule__TemplateParameterList__Group_1__04749);
            rule__TemplateParameterList__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TemplateParameterList__Group_1__1_in_rule__TemplateParameterList__Group_1__04752);
            rule__TemplateParameterList__Group_1__1();

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
    // $ANTLR end "rule__TemplateParameterList__Group_1__0"


    // $ANTLR start "rule__TemplateParameterList__Group_1__0__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2269:1: rule__TemplateParameterList__Group_1__0__Impl : ( ',' ) ;
    public final void rule__TemplateParameterList__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2273:1: ( ( ',' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2274:1: ( ',' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2274:1: ( ',' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2275:1: ','
            {
             before(grammarAccess.getTemplateParameterListAccess().getCommaKeyword_1_0()); 
            match(input,89,FOLLOW_89_in_rule__TemplateParameterList__Group_1__0__Impl4780); 
             after(grammarAccess.getTemplateParameterListAccess().getCommaKeyword_1_0()); 

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
    // $ANTLR end "rule__TemplateParameterList__Group_1__0__Impl"


    // $ANTLR start "rule__TemplateParameterList__Group_1__1"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2288:1: rule__TemplateParameterList__Group_1__1 : rule__TemplateParameterList__Group_1__1__Impl ;
    public final void rule__TemplateParameterList__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2292:1: ( rule__TemplateParameterList__Group_1__1__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2293:2: rule__TemplateParameterList__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__TemplateParameterList__Group_1__1__Impl_in_rule__TemplateParameterList__Group_1__14811);
            rule__TemplateParameterList__Group_1__1__Impl();

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
    // $ANTLR end "rule__TemplateParameterList__Group_1__1"


    // $ANTLR start "rule__TemplateParameterList__Group_1__1__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2299:1: rule__TemplateParameterList__Group_1__1__Impl : ( ruleTemplateParameter ) ;
    public final void rule__TemplateParameterList__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2303:1: ( ( ruleTemplateParameter ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2304:1: ( ruleTemplateParameter )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2304:1: ( ruleTemplateParameter )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2305:1: ruleTemplateParameter
            {
             before(grammarAccess.getTemplateParameterListAccess().getTemplateParameterParserRuleCall_1_1()); 
            pushFollow(FOLLOW_ruleTemplateParameter_in_rule__TemplateParameterList__Group_1__1__Impl4838);
            ruleTemplateParameter();

            state._fsp--;

             after(grammarAccess.getTemplateParameterListAccess().getTemplateParameterParserRuleCall_1_1()); 

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
    // $ANTLR end "rule__TemplateParameterList__Group_1__1__Impl"


    // $ANTLR start "rule__TypeParameter__Group_0__0"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2320:1: rule__TypeParameter__Group_0__0 : rule__TypeParameter__Group_0__0__Impl rule__TypeParameter__Group_0__1 ;
    public final void rule__TypeParameter__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2324:1: ( rule__TypeParameter__Group_0__0__Impl rule__TypeParameter__Group_0__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2325:2: rule__TypeParameter__Group_0__0__Impl rule__TypeParameter__Group_0__1
            {
            pushFollow(FOLLOW_rule__TypeParameter__Group_0__0__Impl_in_rule__TypeParameter__Group_0__04871);
            rule__TypeParameter__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeParameter__Group_0__1_in_rule__TypeParameter__Group_0__04874);
            rule__TypeParameter__Group_0__1();

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
    // $ANTLR end "rule__TypeParameter__Group_0__0"


    // $ANTLR start "rule__TypeParameter__Group_0__0__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2332:1: rule__TypeParameter__Group_0__0__Impl : ( 'class' ) ;
    public final void rule__TypeParameter__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2336:1: ( ( 'class' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2337:1: ( 'class' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2337:1: ( 'class' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2338:1: 'class'
            {
             before(grammarAccess.getTypeParameterAccess().getClassKeyword_0_0()); 
            match(input,100,FOLLOW_100_in_rule__TypeParameter__Group_0__0__Impl4902); 
             after(grammarAccess.getTypeParameterAccess().getClassKeyword_0_0()); 

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
    // $ANTLR end "rule__TypeParameter__Group_0__0__Impl"


    // $ANTLR start "rule__TypeParameter__Group_0__1"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2351:1: rule__TypeParameter__Group_0__1 : rule__TypeParameter__Group_0__1__Impl ;
    public final void rule__TypeParameter__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2355:1: ( rule__TypeParameter__Group_0__1__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2356:2: rule__TypeParameter__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__TypeParameter__Group_0__1__Impl_in_rule__TypeParameter__Group_0__14933);
            rule__TypeParameter__Group_0__1__Impl();

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
    // $ANTLR end "rule__TypeParameter__Group_0__1"


    // $ANTLR start "rule__TypeParameter__Group_0__1__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2362:1: rule__TypeParameter__Group_0__1__Impl : ( ( rule__TypeParameter__Alternatives_0_1 ) ) ;
    public final void rule__TypeParameter__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2366:1: ( ( ( rule__TypeParameter__Alternatives_0_1 ) ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2367:1: ( ( rule__TypeParameter__Alternatives_0_1 ) )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2367:1: ( ( rule__TypeParameter__Alternatives_0_1 ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2368:1: ( rule__TypeParameter__Alternatives_0_1 )
            {
             before(grammarAccess.getTypeParameterAccess().getAlternatives_0_1()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2369:1: ( rule__TypeParameter__Alternatives_0_1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2369:2: rule__TypeParameter__Alternatives_0_1
            {
            pushFollow(FOLLOW_rule__TypeParameter__Alternatives_0_1_in_rule__TypeParameter__Group_0__1__Impl4960);
            rule__TypeParameter__Alternatives_0_1();

            state._fsp--;


            }

             after(grammarAccess.getTypeParameterAccess().getAlternatives_0_1()); 

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
    // $ANTLR end "rule__TypeParameter__Group_0__1__Impl"


    // $ANTLR start "rule__TypeParameter__Group_0_1_0__0"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2383:1: rule__TypeParameter__Group_0_1_0__0 : rule__TypeParameter__Group_0_1_0__0__Impl rule__TypeParameter__Group_0_1_0__1 ;
    public final void rule__TypeParameter__Group_0_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2387:1: ( rule__TypeParameter__Group_0_1_0__0__Impl rule__TypeParameter__Group_0_1_0__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2388:2: rule__TypeParameter__Group_0_1_0__0__Impl rule__TypeParameter__Group_0_1_0__1
            {
            pushFollow(FOLLOW_rule__TypeParameter__Group_0_1_0__0__Impl_in_rule__TypeParameter__Group_0_1_0__04994);
            rule__TypeParameter__Group_0_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeParameter__Group_0_1_0__1_in_rule__TypeParameter__Group_0_1_0__04997);
            rule__TypeParameter__Group_0_1_0__1();

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
    // $ANTLR end "rule__TypeParameter__Group_0_1_0__0"


    // $ANTLR start "rule__TypeParameter__Group_0_1_0__0__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2395:1: rule__TypeParameter__Group_0_1_0__0__Impl : ( ( '...' )? ) ;
    public final void rule__TypeParameter__Group_0_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2399:1: ( ( ( '...' )? ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2400:1: ( ( '...' )? )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2400:1: ( ( '...' )? )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2401:1: ( '...' )?
            {
             before(grammarAccess.getTypeParameterAccess().getFullStopFullStopFullStopKeyword_0_1_0_0()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2402:1: ( '...' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==94) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2403:2: '...'
                    {
                    match(input,94,FOLLOW_94_in_rule__TypeParameter__Group_0_1_0__0__Impl5026); 

                    }
                    break;

            }

             after(grammarAccess.getTypeParameterAccess().getFullStopFullStopFullStopKeyword_0_1_0_0()); 

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
    // $ANTLR end "rule__TypeParameter__Group_0_1_0__0__Impl"


    // $ANTLR start "rule__TypeParameter__Group_0_1_0__1"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2414:1: rule__TypeParameter__Group_0_1_0__1 : rule__TypeParameter__Group_0_1_0__1__Impl ;
    public final void rule__TypeParameter__Group_0_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2418:1: ( rule__TypeParameter__Group_0_1_0__1__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2419:2: rule__TypeParameter__Group_0_1_0__1__Impl
            {
            pushFollow(FOLLOW_rule__TypeParameter__Group_0_1_0__1__Impl_in_rule__TypeParameter__Group_0_1_0__15059);
            rule__TypeParameter__Group_0_1_0__1__Impl();

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
    // $ANTLR end "rule__TypeParameter__Group_0_1_0__1"


    // $ANTLR start "rule__TypeParameter__Group_0_1_0__1__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2425:1: rule__TypeParameter__Group_0_1_0__1__Impl : ( ( RULE_ID )? ) ;
    public final void rule__TypeParameter__Group_0_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2429:1: ( ( ( RULE_ID )? ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2430:1: ( ( RULE_ID )? )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2430:1: ( ( RULE_ID )? )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2431:1: ( RULE_ID )?
            {
             before(grammarAccess.getTypeParameterAccess().getIDTerminalRuleCall_0_1_0_1()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2432:1: ( RULE_ID )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_ID) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2432:3: RULE_ID
                    {
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TypeParameter__Group_0_1_0__1__Impl5087); 

                    }
                    break;

            }

             after(grammarAccess.getTypeParameterAccess().getIDTerminalRuleCall_0_1_0_1()); 

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
    // $ANTLR end "rule__TypeParameter__Group_0_1_0__1__Impl"


    // $ANTLR start "rule__TypeParameter__Group_0_1_1__0"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2446:1: rule__TypeParameter__Group_0_1_1__0 : rule__TypeParameter__Group_0_1_1__0__Impl rule__TypeParameter__Group_0_1_1__1 ;
    public final void rule__TypeParameter__Group_0_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2450:1: ( rule__TypeParameter__Group_0_1_1__0__Impl rule__TypeParameter__Group_0_1_1__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2451:2: rule__TypeParameter__Group_0_1_1__0__Impl rule__TypeParameter__Group_0_1_1__1
            {
            pushFollow(FOLLOW_rule__TypeParameter__Group_0_1_1__0__Impl_in_rule__TypeParameter__Group_0_1_1__05122);
            rule__TypeParameter__Group_0_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeParameter__Group_0_1_1__1_in_rule__TypeParameter__Group_0_1_1__05125);
            rule__TypeParameter__Group_0_1_1__1();

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
    // $ANTLR end "rule__TypeParameter__Group_0_1_1__0"


    // $ANTLR start "rule__TypeParameter__Group_0_1_1__0__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2458:1: rule__TypeParameter__Group_0_1_1__0__Impl : ( ( RULE_ID )? ) ;
    public final void rule__TypeParameter__Group_0_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2462:1: ( ( ( RULE_ID )? ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2463:1: ( ( RULE_ID )? )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2463:1: ( ( RULE_ID )? )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2464:1: ( RULE_ID )?
            {
             before(grammarAccess.getTypeParameterAccess().getIDTerminalRuleCall_0_1_1_0()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2465:1: ( RULE_ID )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_ID) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2465:3: RULE_ID
                    {
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TypeParameter__Group_0_1_1__0__Impl5153); 

                    }
                    break;

            }

             after(grammarAccess.getTypeParameterAccess().getIDTerminalRuleCall_0_1_1_0()); 

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
    // $ANTLR end "rule__TypeParameter__Group_0_1_1__0__Impl"


    // $ANTLR start "rule__TypeParameter__Group_0_1_1__1"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2475:1: rule__TypeParameter__Group_0_1_1__1 : rule__TypeParameter__Group_0_1_1__1__Impl rule__TypeParameter__Group_0_1_1__2 ;
    public final void rule__TypeParameter__Group_0_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2479:1: ( rule__TypeParameter__Group_0_1_1__1__Impl rule__TypeParameter__Group_0_1_1__2 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2480:2: rule__TypeParameter__Group_0_1_1__1__Impl rule__TypeParameter__Group_0_1_1__2
            {
            pushFollow(FOLLOW_rule__TypeParameter__Group_0_1_1__1__Impl_in_rule__TypeParameter__Group_0_1_1__15184);
            rule__TypeParameter__Group_0_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeParameter__Group_0_1_1__2_in_rule__TypeParameter__Group_0_1_1__15187);
            rule__TypeParameter__Group_0_1_1__2();

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
    // $ANTLR end "rule__TypeParameter__Group_0_1_1__1"


    // $ANTLR start "rule__TypeParameter__Group_0_1_1__1__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2487:1: rule__TypeParameter__Group_0_1_1__1__Impl : ( '=' ) ;
    public final void rule__TypeParameter__Group_0_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2491:1: ( ( '=' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2492:1: ( '=' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2492:1: ( '=' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2493:1: '='
            {
             before(grammarAccess.getTypeParameterAccess().getEqualsSignKeyword_0_1_1_1()); 
            match(input,66,FOLLOW_66_in_rule__TypeParameter__Group_0_1_1__1__Impl5215); 
             after(grammarAccess.getTypeParameterAccess().getEqualsSignKeyword_0_1_1_1()); 

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
    // $ANTLR end "rule__TypeParameter__Group_0_1_1__1__Impl"


    // $ANTLR start "rule__TypeParameter__Group_0_1_1__2"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2506:1: rule__TypeParameter__Group_0_1_1__2 : rule__TypeParameter__Group_0_1_1__2__Impl ;
    public final void rule__TypeParameter__Group_0_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2510:1: ( rule__TypeParameter__Group_0_1_1__2__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2511:2: rule__TypeParameter__Group_0_1_1__2__Impl
            {
            pushFollow(FOLLOW_rule__TypeParameter__Group_0_1_1__2__Impl_in_rule__TypeParameter__Group_0_1_1__25246);
            rule__TypeParameter__Group_0_1_1__2__Impl();

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
    // $ANTLR end "rule__TypeParameter__Group_0_1_1__2"


    // $ANTLR start "rule__TypeParameter__Group_0_1_1__2__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2517:1: rule__TypeParameter__Group_0_1_1__2__Impl : ( ruleTypeId ) ;
    public final void rule__TypeParameter__Group_0_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2521:1: ( ( ruleTypeId ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2522:1: ( ruleTypeId )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2522:1: ( ruleTypeId )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2523:1: ruleTypeId
            {
             before(grammarAccess.getTypeParameterAccess().getTypeIdParserRuleCall_0_1_1_2()); 
            pushFollow(FOLLOW_ruleTypeId_in_rule__TypeParameter__Group_0_1_1__2__Impl5273);
            ruleTypeId();

            state._fsp--;

             after(grammarAccess.getTypeParameterAccess().getTypeIdParserRuleCall_0_1_1_2()); 

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
    // $ANTLR end "rule__TypeParameter__Group_0_1_1__2__Impl"


    // $ANTLR start "rule__TypeParameter__Group_1__0"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2540:1: rule__TypeParameter__Group_1__0 : rule__TypeParameter__Group_1__0__Impl rule__TypeParameter__Group_1__1 ;
    public final void rule__TypeParameter__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2544:1: ( rule__TypeParameter__Group_1__0__Impl rule__TypeParameter__Group_1__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2545:2: rule__TypeParameter__Group_1__0__Impl rule__TypeParameter__Group_1__1
            {
            pushFollow(FOLLOW_rule__TypeParameter__Group_1__0__Impl_in_rule__TypeParameter__Group_1__05308);
            rule__TypeParameter__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeParameter__Group_1__1_in_rule__TypeParameter__Group_1__05311);
            rule__TypeParameter__Group_1__1();

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
    // $ANTLR end "rule__TypeParameter__Group_1__0"


    // $ANTLR start "rule__TypeParameter__Group_1__0__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2552:1: rule__TypeParameter__Group_1__0__Impl : ( 'typename' ) ;
    public final void rule__TypeParameter__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2556:1: ( ( 'typename' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2557:1: ( 'typename' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2557:1: ( 'typename' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2558:1: 'typename'
            {
             before(grammarAccess.getTypeParameterAccess().getTypenameKeyword_1_0()); 
            match(input,101,FOLLOW_101_in_rule__TypeParameter__Group_1__0__Impl5339); 
             after(grammarAccess.getTypeParameterAccess().getTypenameKeyword_1_0()); 

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
    // $ANTLR end "rule__TypeParameter__Group_1__0__Impl"


    // $ANTLR start "rule__TypeParameter__Group_1__1"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2571:1: rule__TypeParameter__Group_1__1 : rule__TypeParameter__Group_1__1__Impl ;
    public final void rule__TypeParameter__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2575:1: ( rule__TypeParameter__Group_1__1__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2576:2: rule__TypeParameter__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__TypeParameter__Group_1__1__Impl_in_rule__TypeParameter__Group_1__15370);
            rule__TypeParameter__Group_1__1__Impl();

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
    // $ANTLR end "rule__TypeParameter__Group_1__1"


    // $ANTLR start "rule__TypeParameter__Group_1__1__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2582:1: rule__TypeParameter__Group_1__1__Impl : ( ( rule__TypeParameter__Alternatives_1_1 ) ) ;
    public final void rule__TypeParameter__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2586:1: ( ( ( rule__TypeParameter__Alternatives_1_1 ) ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2587:1: ( ( rule__TypeParameter__Alternatives_1_1 ) )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2587:1: ( ( rule__TypeParameter__Alternatives_1_1 ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2588:1: ( rule__TypeParameter__Alternatives_1_1 )
            {
             before(grammarAccess.getTypeParameterAccess().getAlternatives_1_1()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2589:1: ( rule__TypeParameter__Alternatives_1_1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2589:2: rule__TypeParameter__Alternatives_1_1
            {
            pushFollow(FOLLOW_rule__TypeParameter__Alternatives_1_1_in_rule__TypeParameter__Group_1__1__Impl5397);
            rule__TypeParameter__Alternatives_1_1();

            state._fsp--;


            }

             after(grammarAccess.getTypeParameterAccess().getAlternatives_1_1()); 

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
    // $ANTLR end "rule__TypeParameter__Group_1__1__Impl"


    // $ANTLR start "rule__TypeParameter__Group_1_1_0__0"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2603:1: rule__TypeParameter__Group_1_1_0__0 : rule__TypeParameter__Group_1_1_0__0__Impl rule__TypeParameter__Group_1_1_0__1 ;
    public final void rule__TypeParameter__Group_1_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2607:1: ( rule__TypeParameter__Group_1_1_0__0__Impl rule__TypeParameter__Group_1_1_0__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2608:2: rule__TypeParameter__Group_1_1_0__0__Impl rule__TypeParameter__Group_1_1_0__1
            {
            pushFollow(FOLLOW_rule__TypeParameter__Group_1_1_0__0__Impl_in_rule__TypeParameter__Group_1_1_0__05431);
            rule__TypeParameter__Group_1_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeParameter__Group_1_1_0__1_in_rule__TypeParameter__Group_1_1_0__05434);
            rule__TypeParameter__Group_1_1_0__1();

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
    // $ANTLR end "rule__TypeParameter__Group_1_1_0__0"


    // $ANTLR start "rule__TypeParameter__Group_1_1_0__0__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2615:1: rule__TypeParameter__Group_1_1_0__0__Impl : ( ( '...' )? ) ;
    public final void rule__TypeParameter__Group_1_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2619:1: ( ( ( '...' )? ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2620:1: ( ( '...' )? )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2620:1: ( ( '...' )? )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2621:1: ( '...' )?
            {
             before(grammarAccess.getTypeParameterAccess().getFullStopFullStopFullStopKeyword_1_1_0_0()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2622:1: ( '...' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==94) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2623:2: '...'
                    {
                    match(input,94,FOLLOW_94_in_rule__TypeParameter__Group_1_1_0__0__Impl5463); 

                    }
                    break;

            }

             after(grammarAccess.getTypeParameterAccess().getFullStopFullStopFullStopKeyword_1_1_0_0()); 

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
    // $ANTLR end "rule__TypeParameter__Group_1_1_0__0__Impl"


    // $ANTLR start "rule__TypeParameter__Group_1_1_0__1"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2634:1: rule__TypeParameter__Group_1_1_0__1 : rule__TypeParameter__Group_1_1_0__1__Impl ;
    public final void rule__TypeParameter__Group_1_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2638:1: ( rule__TypeParameter__Group_1_1_0__1__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2639:2: rule__TypeParameter__Group_1_1_0__1__Impl
            {
            pushFollow(FOLLOW_rule__TypeParameter__Group_1_1_0__1__Impl_in_rule__TypeParameter__Group_1_1_0__15496);
            rule__TypeParameter__Group_1_1_0__1__Impl();

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
    // $ANTLR end "rule__TypeParameter__Group_1_1_0__1"


    // $ANTLR start "rule__TypeParameter__Group_1_1_0__1__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2645:1: rule__TypeParameter__Group_1_1_0__1__Impl : ( ( RULE_ID )? ) ;
    public final void rule__TypeParameter__Group_1_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2649:1: ( ( ( RULE_ID )? ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2650:1: ( ( RULE_ID )? )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2650:1: ( ( RULE_ID )? )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2651:1: ( RULE_ID )?
            {
             before(grammarAccess.getTypeParameterAccess().getIDTerminalRuleCall_1_1_0_1()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2652:1: ( RULE_ID )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_ID) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2652:3: RULE_ID
                    {
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TypeParameter__Group_1_1_0__1__Impl5524); 

                    }
                    break;

            }

             after(grammarAccess.getTypeParameterAccess().getIDTerminalRuleCall_1_1_0_1()); 

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
    // $ANTLR end "rule__TypeParameter__Group_1_1_0__1__Impl"


    // $ANTLR start "rule__TypeParameter__Group_1_1_1__0"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2666:1: rule__TypeParameter__Group_1_1_1__0 : rule__TypeParameter__Group_1_1_1__0__Impl rule__TypeParameter__Group_1_1_1__1 ;
    public final void rule__TypeParameter__Group_1_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2670:1: ( rule__TypeParameter__Group_1_1_1__0__Impl rule__TypeParameter__Group_1_1_1__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2671:2: rule__TypeParameter__Group_1_1_1__0__Impl rule__TypeParameter__Group_1_1_1__1
            {
            pushFollow(FOLLOW_rule__TypeParameter__Group_1_1_1__0__Impl_in_rule__TypeParameter__Group_1_1_1__05559);
            rule__TypeParameter__Group_1_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeParameter__Group_1_1_1__1_in_rule__TypeParameter__Group_1_1_1__05562);
            rule__TypeParameter__Group_1_1_1__1();

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
    // $ANTLR end "rule__TypeParameter__Group_1_1_1__0"


    // $ANTLR start "rule__TypeParameter__Group_1_1_1__0__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2678:1: rule__TypeParameter__Group_1_1_1__0__Impl : ( ( RULE_ID )? ) ;
    public final void rule__TypeParameter__Group_1_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2682:1: ( ( ( RULE_ID )? ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2683:1: ( ( RULE_ID )? )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2683:1: ( ( RULE_ID )? )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2684:1: ( RULE_ID )?
            {
             before(grammarAccess.getTypeParameterAccess().getIDTerminalRuleCall_1_1_1_0()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2685:1: ( RULE_ID )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_ID) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2685:3: RULE_ID
                    {
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TypeParameter__Group_1_1_1__0__Impl5590); 

                    }
                    break;

            }

             after(grammarAccess.getTypeParameterAccess().getIDTerminalRuleCall_1_1_1_0()); 

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
    // $ANTLR end "rule__TypeParameter__Group_1_1_1__0__Impl"


    // $ANTLR start "rule__TypeParameter__Group_1_1_1__1"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2695:1: rule__TypeParameter__Group_1_1_1__1 : rule__TypeParameter__Group_1_1_1__1__Impl rule__TypeParameter__Group_1_1_1__2 ;
    public final void rule__TypeParameter__Group_1_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2699:1: ( rule__TypeParameter__Group_1_1_1__1__Impl rule__TypeParameter__Group_1_1_1__2 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2700:2: rule__TypeParameter__Group_1_1_1__1__Impl rule__TypeParameter__Group_1_1_1__2
            {
            pushFollow(FOLLOW_rule__TypeParameter__Group_1_1_1__1__Impl_in_rule__TypeParameter__Group_1_1_1__15621);
            rule__TypeParameter__Group_1_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeParameter__Group_1_1_1__2_in_rule__TypeParameter__Group_1_1_1__15624);
            rule__TypeParameter__Group_1_1_1__2();

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
    // $ANTLR end "rule__TypeParameter__Group_1_1_1__1"


    // $ANTLR start "rule__TypeParameter__Group_1_1_1__1__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2707:1: rule__TypeParameter__Group_1_1_1__1__Impl : ( '=' ) ;
    public final void rule__TypeParameter__Group_1_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2711:1: ( ( '=' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2712:1: ( '=' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2712:1: ( '=' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2713:1: '='
            {
             before(grammarAccess.getTypeParameterAccess().getEqualsSignKeyword_1_1_1_1()); 
            match(input,66,FOLLOW_66_in_rule__TypeParameter__Group_1_1_1__1__Impl5652); 
             after(grammarAccess.getTypeParameterAccess().getEqualsSignKeyword_1_1_1_1()); 

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
    // $ANTLR end "rule__TypeParameter__Group_1_1_1__1__Impl"


    // $ANTLR start "rule__TypeParameter__Group_1_1_1__2"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2726:1: rule__TypeParameter__Group_1_1_1__2 : rule__TypeParameter__Group_1_1_1__2__Impl ;
    public final void rule__TypeParameter__Group_1_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2730:1: ( rule__TypeParameter__Group_1_1_1__2__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2731:2: rule__TypeParameter__Group_1_1_1__2__Impl
            {
            pushFollow(FOLLOW_rule__TypeParameter__Group_1_1_1__2__Impl_in_rule__TypeParameter__Group_1_1_1__25683);
            rule__TypeParameter__Group_1_1_1__2__Impl();

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
    // $ANTLR end "rule__TypeParameter__Group_1_1_1__2"


    // $ANTLR start "rule__TypeParameter__Group_1_1_1__2__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2737:1: rule__TypeParameter__Group_1_1_1__2__Impl : ( ruleTypeId ) ;
    public final void rule__TypeParameter__Group_1_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2741:1: ( ( ruleTypeId ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2742:1: ( ruleTypeId )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2742:1: ( ruleTypeId )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2743:1: ruleTypeId
            {
             before(grammarAccess.getTypeParameterAccess().getTypeIdParserRuleCall_1_1_1_2()); 
            pushFollow(FOLLOW_ruleTypeId_in_rule__TypeParameter__Group_1_1_1__2__Impl5710);
            ruleTypeId();

            state._fsp--;

             after(grammarAccess.getTypeParameterAccess().getTypeIdParserRuleCall_1_1_1_2()); 

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
    // $ANTLR end "rule__TypeParameter__Group_1_1_1__2__Impl"


    // $ANTLR start "rule__TypeParameter__Group_2__0"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2760:1: rule__TypeParameter__Group_2__0 : rule__TypeParameter__Group_2__0__Impl rule__TypeParameter__Group_2__1 ;
    public final void rule__TypeParameter__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2764:1: ( rule__TypeParameter__Group_2__0__Impl rule__TypeParameter__Group_2__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2765:2: rule__TypeParameter__Group_2__0__Impl rule__TypeParameter__Group_2__1
            {
            pushFollow(FOLLOW_rule__TypeParameter__Group_2__0__Impl_in_rule__TypeParameter__Group_2__05745);
            rule__TypeParameter__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeParameter__Group_2__1_in_rule__TypeParameter__Group_2__05748);
            rule__TypeParameter__Group_2__1();

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
    // $ANTLR end "rule__TypeParameter__Group_2__0"


    // $ANTLR start "rule__TypeParameter__Group_2__0__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2772:1: rule__TypeParameter__Group_2__0__Impl : ( 'template' ) ;
    public final void rule__TypeParameter__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2776:1: ( ( 'template' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2777:1: ( 'template' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2777:1: ( 'template' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2778:1: 'template'
            {
             before(grammarAccess.getTypeParameterAccess().getTemplateKeyword_2_0()); 
            match(input,102,FOLLOW_102_in_rule__TypeParameter__Group_2__0__Impl5776); 
             after(grammarAccess.getTypeParameterAccess().getTemplateKeyword_2_0()); 

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
    // $ANTLR end "rule__TypeParameter__Group_2__0__Impl"


    // $ANTLR start "rule__TypeParameter__Group_2__1"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2791:1: rule__TypeParameter__Group_2__1 : rule__TypeParameter__Group_2__1__Impl rule__TypeParameter__Group_2__2 ;
    public final void rule__TypeParameter__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2795:1: ( rule__TypeParameter__Group_2__1__Impl rule__TypeParameter__Group_2__2 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2796:2: rule__TypeParameter__Group_2__1__Impl rule__TypeParameter__Group_2__2
            {
            pushFollow(FOLLOW_rule__TypeParameter__Group_2__1__Impl_in_rule__TypeParameter__Group_2__15807);
            rule__TypeParameter__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeParameter__Group_2__2_in_rule__TypeParameter__Group_2__15810);
            rule__TypeParameter__Group_2__2();

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
    // $ANTLR end "rule__TypeParameter__Group_2__1"


    // $ANTLR start "rule__TypeParameter__Group_2__1__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2803:1: rule__TypeParameter__Group_2__1__Impl : ( '<' ) ;
    public final void rule__TypeParameter__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2807:1: ( ( '<' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2808:1: ( '<' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2808:1: ( '<' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2809:1: '<'
            {
             before(grammarAccess.getTypeParameterAccess().getLessThanSignKeyword_2_1()); 
            match(input,67,FOLLOW_67_in_rule__TypeParameter__Group_2__1__Impl5838); 
             after(grammarAccess.getTypeParameterAccess().getLessThanSignKeyword_2_1()); 

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
    // $ANTLR end "rule__TypeParameter__Group_2__1__Impl"


    // $ANTLR start "rule__TypeParameter__Group_2__2"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2822:1: rule__TypeParameter__Group_2__2 : rule__TypeParameter__Group_2__2__Impl rule__TypeParameter__Group_2__3 ;
    public final void rule__TypeParameter__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2826:1: ( rule__TypeParameter__Group_2__2__Impl rule__TypeParameter__Group_2__3 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2827:2: rule__TypeParameter__Group_2__2__Impl rule__TypeParameter__Group_2__3
            {
            pushFollow(FOLLOW_rule__TypeParameter__Group_2__2__Impl_in_rule__TypeParameter__Group_2__25869);
            rule__TypeParameter__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeParameter__Group_2__3_in_rule__TypeParameter__Group_2__25872);
            rule__TypeParameter__Group_2__3();

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
    // $ANTLR end "rule__TypeParameter__Group_2__2"


    // $ANTLR start "rule__TypeParameter__Group_2__2__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2834:1: rule__TypeParameter__Group_2__2__Impl : ( ruleTemplateParameterList ) ;
    public final void rule__TypeParameter__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2838:1: ( ( ruleTemplateParameterList ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2839:1: ( ruleTemplateParameterList )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2839:1: ( ruleTemplateParameterList )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2840:1: ruleTemplateParameterList
            {
             before(grammarAccess.getTypeParameterAccess().getTemplateParameterListParserRuleCall_2_2()); 
            pushFollow(FOLLOW_ruleTemplateParameterList_in_rule__TypeParameter__Group_2__2__Impl5899);
            ruleTemplateParameterList();

            state._fsp--;

             after(grammarAccess.getTypeParameterAccess().getTemplateParameterListParserRuleCall_2_2()); 

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
    // $ANTLR end "rule__TypeParameter__Group_2__2__Impl"


    // $ANTLR start "rule__TypeParameter__Group_2__3"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2851:1: rule__TypeParameter__Group_2__3 : rule__TypeParameter__Group_2__3__Impl rule__TypeParameter__Group_2__4 ;
    public final void rule__TypeParameter__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2855:1: ( rule__TypeParameter__Group_2__3__Impl rule__TypeParameter__Group_2__4 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2856:2: rule__TypeParameter__Group_2__3__Impl rule__TypeParameter__Group_2__4
            {
            pushFollow(FOLLOW_rule__TypeParameter__Group_2__3__Impl_in_rule__TypeParameter__Group_2__35928);
            rule__TypeParameter__Group_2__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeParameter__Group_2__4_in_rule__TypeParameter__Group_2__35931);
            rule__TypeParameter__Group_2__4();

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
    // $ANTLR end "rule__TypeParameter__Group_2__3"


    // $ANTLR start "rule__TypeParameter__Group_2__3__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2863:1: rule__TypeParameter__Group_2__3__Impl : ( '>' ) ;
    public final void rule__TypeParameter__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2867:1: ( ( '>' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2868:1: ( '>' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2868:1: ( '>' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2869:1: '>'
            {
             before(grammarAccess.getTypeParameterAccess().getGreaterThanSignKeyword_2_3()); 
            match(input,68,FOLLOW_68_in_rule__TypeParameter__Group_2__3__Impl5959); 
             after(grammarAccess.getTypeParameterAccess().getGreaterThanSignKeyword_2_3()); 

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
    // $ANTLR end "rule__TypeParameter__Group_2__3__Impl"


    // $ANTLR start "rule__TypeParameter__Group_2__4"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2882:1: rule__TypeParameter__Group_2__4 : rule__TypeParameter__Group_2__4__Impl rule__TypeParameter__Group_2__5 ;
    public final void rule__TypeParameter__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2886:1: ( rule__TypeParameter__Group_2__4__Impl rule__TypeParameter__Group_2__5 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2887:2: rule__TypeParameter__Group_2__4__Impl rule__TypeParameter__Group_2__5
            {
            pushFollow(FOLLOW_rule__TypeParameter__Group_2__4__Impl_in_rule__TypeParameter__Group_2__45990);
            rule__TypeParameter__Group_2__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeParameter__Group_2__5_in_rule__TypeParameter__Group_2__45993);
            rule__TypeParameter__Group_2__5();

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
    // $ANTLR end "rule__TypeParameter__Group_2__4"


    // $ANTLR start "rule__TypeParameter__Group_2__4__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2894:1: rule__TypeParameter__Group_2__4__Impl : ( 'class' ) ;
    public final void rule__TypeParameter__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2898:1: ( ( 'class' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2899:1: ( 'class' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2899:1: ( 'class' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2900:1: 'class'
            {
             before(grammarAccess.getTypeParameterAccess().getClassKeyword_2_4()); 
            match(input,100,FOLLOW_100_in_rule__TypeParameter__Group_2__4__Impl6021); 
             after(grammarAccess.getTypeParameterAccess().getClassKeyword_2_4()); 

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
    // $ANTLR end "rule__TypeParameter__Group_2__4__Impl"


    // $ANTLR start "rule__TypeParameter__Group_2__5"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2913:1: rule__TypeParameter__Group_2__5 : rule__TypeParameter__Group_2__5__Impl ;
    public final void rule__TypeParameter__Group_2__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2917:1: ( rule__TypeParameter__Group_2__5__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2918:2: rule__TypeParameter__Group_2__5__Impl
            {
            pushFollow(FOLLOW_rule__TypeParameter__Group_2__5__Impl_in_rule__TypeParameter__Group_2__56052);
            rule__TypeParameter__Group_2__5__Impl();

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
    // $ANTLR end "rule__TypeParameter__Group_2__5"


    // $ANTLR start "rule__TypeParameter__Group_2__5__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2924:1: rule__TypeParameter__Group_2__5__Impl : ( ( rule__TypeParameter__Alternatives_2_5 ) ) ;
    public final void rule__TypeParameter__Group_2__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2928:1: ( ( ( rule__TypeParameter__Alternatives_2_5 ) ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2929:1: ( ( rule__TypeParameter__Alternatives_2_5 ) )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2929:1: ( ( rule__TypeParameter__Alternatives_2_5 ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2930:1: ( rule__TypeParameter__Alternatives_2_5 )
            {
             before(grammarAccess.getTypeParameterAccess().getAlternatives_2_5()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2931:1: ( rule__TypeParameter__Alternatives_2_5 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2931:2: rule__TypeParameter__Alternatives_2_5
            {
            pushFollow(FOLLOW_rule__TypeParameter__Alternatives_2_5_in_rule__TypeParameter__Group_2__5__Impl6079);
            rule__TypeParameter__Alternatives_2_5();

            state._fsp--;


            }

             after(grammarAccess.getTypeParameterAccess().getAlternatives_2_5()); 

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
    // $ANTLR end "rule__TypeParameter__Group_2__5__Impl"


    // $ANTLR start "rule__TypeParameter__Group_2_5_0__0"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2953:1: rule__TypeParameter__Group_2_5_0__0 : rule__TypeParameter__Group_2_5_0__0__Impl rule__TypeParameter__Group_2_5_0__1 ;
    public final void rule__TypeParameter__Group_2_5_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2957:1: ( rule__TypeParameter__Group_2_5_0__0__Impl rule__TypeParameter__Group_2_5_0__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2958:2: rule__TypeParameter__Group_2_5_0__0__Impl rule__TypeParameter__Group_2_5_0__1
            {
            pushFollow(FOLLOW_rule__TypeParameter__Group_2_5_0__0__Impl_in_rule__TypeParameter__Group_2_5_0__06121);
            rule__TypeParameter__Group_2_5_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeParameter__Group_2_5_0__1_in_rule__TypeParameter__Group_2_5_0__06124);
            rule__TypeParameter__Group_2_5_0__1();

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
    // $ANTLR end "rule__TypeParameter__Group_2_5_0__0"


    // $ANTLR start "rule__TypeParameter__Group_2_5_0__0__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2965:1: rule__TypeParameter__Group_2_5_0__0__Impl : ( ( '...' )? ) ;
    public final void rule__TypeParameter__Group_2_5_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2969:1: ( ( ( '...' )? ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2970:1: ( ( '...' )? )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2970:1: ( ( '...' )? )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2971:1: ( '...' )?
            {
             before(grammarAccess.getTypeParameterAccess().getFullStopFullStopFullStopKeyword_2_5_0_0()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2972:1: ( '...' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==94) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2973:2: '...'
                    {
                    match(input,94,FOLLOW_94_in_rule__TypeParameter__Group_2_5_0__0__Impl6153); 

                    }
                    break;

            }

             after(grammarAccess.getTypeParameterAccess().getFullStopFullStopFullStopKeyword_2_5_0_0()); 

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
    // $ANTLR end "rule__TypeParameter__Group_2_5_0__0__Impl"


    // $ANTLR start "rule__TypeParameter__Group_2_5_0__1"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2984:1: rule__TypeParameter__Group_2_5_0__1 : rule__TypeParameter__Group_2_5_0__1__Impl ;
    public final void rule__TypeParameter__Group_2_5_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2988:1: ( rule__TypeParameter__Group_2_5_0__1__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2989:2: rule__TypeParameter__Group_2_5_0__1__Impl
            {
            pushFollow(FOLLOW_rule__TypeParameter__Group_2_5_0__1__Impl_in_rule__TypeParameter__Group_2_5_0__16186);
            rule__TypeParameter__Group_2_5_0__1__Impl();

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
    // $ANTLR end "rule__TypeParameter__Group_2_5_0__1"


    // $ANTLR start "rule__TypeParameter__Group_2_5_0__1__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2995:1: rule__TypeParameter__Group_2_5_0__1__Impl : ( ( RULE_ID )? ) ;
    public final void rule__TypeParameter__Group_2_5_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2999:1: ( ( ( RULE_ID )? ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3000:1: ( ( RULE_ID )? )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3000:1: ( ( RULE_ID )? )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3001:1: ( RULE_ID )?
            {
             before(grammarAccess.getTypeParameterAccess().getIDTerminalRuleCall_2_5_0_1()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3002:1: ( RULE_ID )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_ID) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3002:3: RULE_ID
                    {
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TypeParameter__Group_2_5_0__1__Impl6214); 

                    }
                    break;

            }

             after(grammarAccess.getTypeParameterAccess().getIDTerminalRuleCall_2_5_0_1()); 

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
    // $ANTLR end "rule__TypeParameter__Group_2_5_0__1__Impl"


    // $ANTLR start "rule__TypeParameter__Group_2_5_1__0"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3016:1: rule__TypeParameter__Group_2_5_1__0 : rule__TypeParameter__Group_2_5_1__0__Impl rule__TypeParameter__Group_2_5_1__1 ;
    public final void rule__TypeParameter__Group_2_5_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3020:1: ( rule__TypeParameter__Group_2_5_1__0__Impl rule__TypeParameter__Group_2_5_1__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3021:2: rule__TypeParameter__Group_2_5_1__0__Impl rule__TypeParameter__Group_2_5_1__1
            {
            pushFollow(FOLLOW_rule__TypeParameter__Group_2_5_1__0__Impl_in_rule__TypeParameter__Group_2_5_1__06249);
            rule__TypeParameter__Group_2_5_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeParameter__Group_2_5_1__1_in_rule__TypeParameter__Group_2_5_1__06252);
            rule__TypeParameter__Group_2_5_1__1();

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
    // $ANTLR end "rule__TypeParameter__Group_2_5_1__0"


    // $ANTLR start "rule__TypeParameter__Group_2_5_1__0__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3028:1: rule__TypeParameter__Group_2_5_1__0__Impl : ( ( RULE_ID )? ) ;
    public final void rule__TypeParameter__Group_2_5_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3032:1: ( ( ( RULE_ID )? ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3033:1: ( ( RULE_ID )? )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3033:1: ( ( RULE_ID )? )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3034:1: ( RULE_ID )?
            {
             before(grammarAccess.getTypeParameterAccess().getIDTerminalRuleCall_2_5_1_0()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3035:1: ( RULE_ID )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_ID) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3035:3: RULE_ID
                    {
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TypeParameter__Group_2_5_1__0__Impl6280); 

                    }
                    break;

            }

             after(grammarAccess.getTypeParameterAccess().getIDTerminalRuleCall_2_5_1_0()); 

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
    // $ANTLR end "rule__TypeParameter__Group_2_5_1__0__Impl"


    // $ANTLR start "rule__TypeParameter__Group_2_5_1__1"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3045:1: rule__TypeParameter__Group_2_5_1__1 : rule__TypeParameter__Group_2_5_1__1__Impl rule__TypeParameter__Group_2_5_1__2 ;
    public final void rule__TypeParameter__Group_2_5_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3049:1: ( rule__TypeParameter__Group_2_5_1__1__Impl rule__TypeParameter__Group_2_5_1__2 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3050:2: rule__TypeParameter__Group_2_5_1__1__Impl rule__TypeParameter__Group_2_5_1__2
            {
            pushFollow(FOLLOW_rule__TypeParameter__Group_2_5_1__1__Impl_in_rule__TypeParameter__Group_2_5_1__16311);
            rule__TypeParameter__Group_2_5_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeParameter__Group_2_5_1__2_in_rule__TypeParameter__Group_2_5_1__16314);
            rule__TypeParameter__Group_2_5_1__2();

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
    // $ANTLR end "rule__TypeParameter__Group_2_5_1__1"


    // $ANTLR start "rule__TypeParameter__Group_2_5_1__1__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3057:1: rule__TypeParameter__Group_2_5_1__1__Impl : ( '=' ) ;
    public final void rule__TypeParameter__Group_2_5_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3061:1: ( ( '=' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3062:1: ( '=' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3062:1: ( '=' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3063:1: '='
            {
             before(grammarAccess.getTypeParameterAccess().getEqualsSignKeyword_2_5_1_1()); 
            match(input,66,FOLLOW_66_in_rule__TypeParameter__Group_2_5_1__1__Impl6342); 
             after(grammarAccess.getTypeParameterAccess().getEqualsSignKeyword_2_5_1_1()); 

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
    // $ANTLR end "rule__TypeParameter__Group_2_5_1__1__Impl"


    // $ANTLR start "rule__TypeParameter__Group_2_5_1__2"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3076:1: rule__TypeParameter__Group_2_5_1__2 : rule__TypeParameter__Group_2_5_1__2__Impl ;
    public final void rule__TypeParameter__Group_2_5_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3080:1: ( rule__TypeParameter__Group_2_5_1__2__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3081:2: rule__TypeParameter__Group_2_5_1__2__Impl
            {
            pushFollow(FOLLOW_rule__TypeParameter__Group_2_5_1__2__Impl_in_rule__TypeParameter__Group_2_5_1__26373);
            rule__TypeParameter__Group_2_5_1__2__Impl();

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
    // $ANTLR end "rule__TypeParameter__Group_2_5_1__2"


    // $ANTLR start "rule__TypeParameter__Group_2_5_1__2__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3087:1: rule__TypeParameter__Group_2_5_1__2__Impl : ( ruleIdExpression ) ;
    public final void rule__TypeParameter__Group_2_5_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3091:1: ( ( ruleIdExpression ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3092:1: ( ruleIdExpression )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3092:1: ( ruleIdExpression )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3093:1: ruleIdExpression
            {
             before(grammarAccess.getTypeParameterAccess().getIdExpressionParserRuleCall_2_5_1_2()); 
            pushFollow(FOLLOW_ruleIdExpression_in_rule__TypeParameter__Group_2_5_1__2__Impl6400);
            ruleIdExpression();

            state._fsp--;

             after(grammarAccess.getTypeParameterAccess().getIdExpressionParserRuleCall_2_5_1_2()); 

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
    // $ANTLR end "rule__TypeParameter__Group_2_5_1__2__Impl"


    // $ANTLR start "rule__SimpleTemplateId__Group__0"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3110:1: rule__SimpleTemplateId__Group__0 : rule__SimpleTemplateId__Group__0__Impl rule__SimpleTemplateId__Group__1 ;
    public final void rule__SimpleTemplateId__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3114:1: ( rule__SimpleTemplateId__Group__0__Impl rule__SimpleTemplateId__Group__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3115:2: rule__SimpleTemplateId__Group__0__Impl rule__SimpleTemplateId__Group__1
            {
            pushFollow(FOLLOW_rule__SimpleTemplateId__Group__0__Impl_in_rule__SimpleTemplateId__Group__06435);
            rule__SimpleTemplateId__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleTemplateId__Group__1_in_rule__SimpleTemplateId__Group__06438);
            rule__SimpleTemplateId__Group__1();

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
    // $ANTLR end "rule__SimpleTemplateId__Group__0"


    // $ANTLR start "rule__SimpleTemplateId__Group__0__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3122:1: rule__SimpleTemplateId__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__SimpleTemplateId__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3126:1: ( ( RULE_ID ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3127:1: ( RULE_ID )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3127:1: ( RULE_ID )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3128:1: RULE_ID
            {
             before(grammarAccess.getSimpleTemplateIdAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SimpleTemplateId__Group__0__Impl6465); 
             after(grammarAccess.getSimpleTemplateIdAccess().getIDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__SimpleTemplateId__Group__0__Impl"


    // $ANTLR start "rule__SimpleTemplateId__Group__1"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3139:1: rule__SimpleTemplateId__Group__1 : rule__SimpleTemplateId__Group__1__Impl rule__SimpleTemplateId__Group__2 ;
    public final void rule__SimpleTemplateId__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3143:1: ( rule__SimpleTemplateId__Group__1__Impl rule__SimpleTemplateId__Group__2 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3144:2: rule__SimpleTemplateId__Group__1__Impl rule__SimpleTemplateId__Group__2
            {
            pushFollow(FOLLOW_rule__SimpleTemplateId__Group__1__Impl_in_rule__SimpleTemplateId__Group__16494);
            rule__SimpleTemplateId__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleTemplateId__Group__2_in_rule__SimpleTemplateId__Group__16497);
            rule__SimpleTemplateId__Group__2();

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
    // $ANTLR end "rule__SimpleTemplateId__Group__1"


    // $ANTLR start "rule__SimpleTemplateId__Group__1__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3151:1: rule__SimpleTemplateId__Group__1__Impl : ( '<' ) ;
    public final void rule__SimpleTemplateId__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3155:1: ( ( '<' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3156:1: ( '<' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3156:1: ( '<' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3157:1: '<'
            {
             before(grammarAccess.getSimpleTemplateIdAccess().getLessThanSignKeyword_1()); 
            match(input,67,FOLLOW_67_in_rule__SimpleTemplateId__Group__1__Impl6525); 
             after(grammarAccess.getSimpleTemplateIdAccess().getLessThanSignKeyword_1()); 

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
    // $ANTLR end "rule__SimpleTemplateId__Group__1__Impl"


    // $ANTLR start "rule__SimpleTemplateId__Group__2"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3170:1: rule__SimpleTemplateId__Group__2 : rule__SimpleTemplateId__Group__2__Impl rule__SimpleTemplateId__Group__3 ;
    public final void rule__SimpleTemplateId__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3174:1: ( rule__SimpleTemplateId__Group__2__Impl rule__SimpleTemplateId__Group__3 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3175:2: rule__SimpleTemplateId__Group__2__Impl rule__SimpleTemplateId__Group__3
            {
            pushFollow(FOLLOW_rule__SimpleTemplateId__Group__2__Impl_in_rule__SimpleTemplateId__Group__26556);
            rule__SimpleTemplateId__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleTemplateId__Group__3_in_rule__SimpleTemplateId__Group__26559);
            rule__SimpleTemplateId__Group__3();

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
    // $ANTLR end "rule__SimpleTemplateId__Group__2"


    // $ANTLR start "rule__SimpleTemplateId__Group__2__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3182:1: rule__SimpleTemplateId__Group__2__Impl : ( ruleTemplateArgumentList ) ;
    public final void rule__SimpleTemplateId__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3186:1: ( ( ruleTemplateArgumentList ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3187:1: ( ruleTemplateArgumentList )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3187:1: ( ruleTemplateArgumentList )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3188:1: ruleTemplateArgumentList
            {
             before(grammarAccess.getSimpleTemplateIdAccess().getTemplateArgumentListParserRuleCall_2()); 
            pushFollow(FOLLOW_ruleTemplateArgumentList_in_rule__SimpleTemplateId__Group__2__Impl6586);
            ruleTemplateArgumentList();

            state._fsp--;

             after(grammarAccess.getSimpleTemplateIdAccess().getTemplateArgumentListParserRuleCall_2()); 

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
    // $ANTLR end "rule__SimpleTemplateId__Group__2__Impl"


    // $ANTLR start "rule__SimpleTemplateId__Group__3"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3199:1: rule__SimpleTemplateId__Group__3 : rule__SimpleTemplateId__Group__3__Impl ;
    public final void rule__SimpleTemplateId__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3203:1: ( rule__SimpleTemplateId__Group__3__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3204:2: rule__SimpleTemplateId__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__SimpleTemplateId__Group__3__Impl_in_rule__SimpleTemplateId__Group__36615);
            rule__SimpleTemplateId__Group__3__Impl();

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
    // $ANTLR end "rule__SimpleTemplateId__Group__3"


    // $ANTLR start "rule__SimpleTemplateId__Group__3__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3210:1: rule__SimpleTemplateId__Group__3__Impl : ( '>' ) ;
    public final void rule__SimpleTemplateId__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3214:1: ( ( '>' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3215:1: ( '>' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3215:1: ( '>' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3216:1: '>'
            {
             before(grammarAccess.getSimpleTemplateIdAccess().getGreaterThanSignKeyword_3()); 
            match(input,68,FOLLOW_68_in_rule__SimpleTemplateId__Group__3__Impl6643); 
             after(grammarAccess.getSimpleTemplateIdAccess().getGreaterThanSignKeyword_3()); 

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
    // $ANTLR end "rule__SimpleTemplateId__Group__3__Impl"


    // $ANTLR start "rule__TemplateArgumentList__Group__0"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3239:1: rule__TemplateArgumentList__Group__0 : rule__TemplateArgumentList__Group__0__Impl rule__TemplateArgumentList__Group__1 ;
    public final void rule__TemplateArgumentList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3243:1: ( rule__TemplateArgumentList__Group__0__Impl rule__TemplateArgumentList__Group__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3244:2: rule__TemplateArgumentList__Group__0__Impl rule__TemplateArgumentList__Group__1
            {
            pushFollow(FOLLOW_rule__TemplateArgumentList__Group__0__Impl_in_rule__TemplateArgumentList__Group__06684);
            rule__TemplateArgumentList__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TemplateArgumentList__Group__1_in_rule__TemplateArgumentList__Group__06687);
            rule__TemplateArgumentList__Group__1();

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
    // $ANTLR end "rule__TemplateArgumentList__Group__0"


    // $ANTLR start "rule__TemplateArgumentList__Group__0__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3251:1: rule__TemplateArgumentList__Group__0__Impl : ( ruleTemplateArgument ) ;
    public final void rule__TemplateArgumentList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3255:1: ( ( ruleTemplateArgument ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3256:1: ( ruleTemplateArgument )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3256:1: ( ruleTemplateArgument )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3257:1: ruleTemplateArgument
            {
             before(grammarAccess.getTemplateArgumentListAccess().getTemplateArgumentParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleTemplateArgument_in_rule__TemplateArgumentList__Group__0__Impl6714);
            ruleTemplateArgument();

            state._fsp--;

             after(grammarAccess.getTemplateArgumentListAccess().getTemplateArgumentParserRuleCall_0()); 

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
    // $ANTLR end "rule__TemplateArgumentList__Group__0__Impl"


    // $ANTLR start "rule__TemplateArgumentList__Group__1"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3268:1: rule__TemplateArgumentList__Group__1 : rule__TemplateArgumentList__Group__1__Impl rule__TemplateArgumentList__Group__2 ;
    public final void rule__TemplateArgumentList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3272:1: ( rule__TemplateArgumentList__Group__1__Impl rule__TemplateArgumentList__Group__2 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3273:2: rule__TemplateArgumentList__Group__1__Impl rule__TemplateArgumentList__Group__2
            {
            pushFollow(FOLLOW_rule__TemplateArgumentList__Group__1__Impl_in_rule__TemplateArgumentList__Group__16743);
            rule__TemplateArgumentList__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TemplateArgumentList__Group__2_in_rule__TemplateArgumentList__Group__16746);
            rule__TemplateArgumentList__Group__2();

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
    // $ANTLR end "rule__TemplateArgumentList__Group__1"


    // $ANTLR start "rule__TemplateArgumentList__Group__1__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3280:1: rule__TemplateArgumentList__Group__1__Impl : ( ( '...' )? ) ;
    public final void rule__TemplateArgumentList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3284:1: ( ( ( '...' )? ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3285:1: ( ( '...' )? )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3285:1: ( ( '...' )? )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3286:1: ( '...' )?
            {
             before(grammarAccess.getTemplateArgumentListAccess().getFullStopFullStopFullStopKeyword_1()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3287:1: ( '...' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==94) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3288:2: '...'
                    {
                    match(input,94,FOLLOW_94_in_rule__TemplateArgumentList__Group__1__Impl6775); 

                    }
                    break;

            }

             after(grammarAccess.getTemplateArgumentListAccess().getFullStopFullStopFullStopKeyword_1()); 

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
    // $ANTLR end "rule__TemplateArgumentList__Group__1__Impl"


    // $ANTLR start "rule__TemplateArgumentList__Group__2"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3299:1: rule__TemplateArgumentList__Group__2 : rule__TemplateArgumentList__Group__2__Impl ;
    public final void rule__TemplateArgumentList__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3303:1: ( rule__TemplateArgumentList__Group__2__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3304:2: rule__TemplateArgumentList__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__TemplateArgumentList__Group__2__Impl_in_rule__TemplateArgumentList__Group__26808);
            rule__TemplateArgumentList__Group__2__Impl();

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
    // $ANTLR end "rule__TemplateArgumentList__Group__2"


    // $ANTLR start "rule__TemplateArgumentList__Group__2__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3310:1: rule__TemplateArgumentList__Group__2__Impl : ( ( rule__TemplateArgumentList__Group_2__0 )* ) ;
    public final void rule__TemplateArgumentList__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3314:1: ( ( ( rule__TemplateArgumentList__Group_2__0 )* ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3315:1: ( ( rule__TemplateArgumentList__Group_2__0 )* )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3315:1: ( ( rule__TemplateArgumentList__Group_2__0 )* )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3316:1: ( rule__TemplateArgumentList__Group_2__0 )*
            {
             before(grammarAccess.getTemplateArgumentListAccess().getGroup_2()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3317:1: ( rule__TemplateArgumentList__Group_2__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==89) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3317:2: rule__TemplateArgumentList__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__TemplateArgumentList__Group_2__0_in_rule__TemplateArgumentList__Group__2__Impl6835);
            	    rule__TemplateArgumentList__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getTemplateArgumentListAccess().getGroup_2()); 

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
    // $ANTLR end "rule__TemplateArgumentList__Group__2__Impl"


    // $ANTLR start "rule__TemplateArgumentList__Group_2__0"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3333:1: rule__TemplateArgumentList__Group_2__0 : rule__TemplateArgumentList__Group_2__0__Impl rule__TemplateArgumentList__Group_2__1 ;
    public final void rule__TemplateArgumentList__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3337:1: ( rule__TemplateArgumentList__Group_2__0__Impl rule__TemplateArgumentList__Group_2__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3338:2: rule__TemplateArgumentList__Group_2__0__Impl rule__TemplateArgumentList__Group_2__1
            {
            pushFollow(FOLLOW_rule__TemplateArgumentList__Group_2__0__Impl_in_rule__TemplateArgumentList__Group_2__06872);
            rule__TemplateArgumentList__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TemplateArgumentList__Group_2__1_in_rule__TemplateArgumentList__Group_2__06875);
            rule__TemplateArgumentList__Group_2__1();

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
    // $ANTLR end "rule__TemplateArgumentList__Group_2__0"


    // $ANTLR start "rule__TemplateArgumentList__Group_2__0__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3345:1: rule__TemplateArgumentList__Group_2__0__Impl : ( ',' ) ;
    public final void rule__TemplateArgumentList__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3349:1: ( ( ',' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3350:1: ( ',' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3350:1: ( ',' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3351:1: ','
            {
             before(grammarAccess.getTemplateArgumentListAccess().getCommaKeyword_2_0()); 
            match(input,89,FOLLOW_89_in_rule__TemplateArgumentList__Group_2__0__Impl6903); 
             after(grammarAccess.getTemplateArgumentListAccess().getCommaKeyword_2_0()); 

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
    // $ANTLR end "rule__TemplateArgumentList__Group_2__0__Impl"


    // $ANTLR start "rule__TemplateArgumentList__Group_2__1"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3364:1: rule__TemplateArgumentList__Group_2__1 : rule__TemplateArgumentList__Group_2__1__Impl rule__TemplateArgumentList__Group_2__2 ;
    public final void rule__TemplateArgumentList__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3368:1: ( rule__TemplateArgumentList__Group_2__1__Impl rule__TemplateArgumentList__Group_2__2 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3369:2: rule__TemplateArgumentList__Group_2__1__Impl rule__TemplateArgumentList__Group_2__2
            {
            pushFollow(FOLLOW_rule__TemplateArgumentList__Group_2__1__Impl_in_rule__TemplateArgumentList__Group_2__16934);
            rule__TemplateArgumentList__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TemplateArgumentList__Group_2__2_in_rule__TemplateArgumentList__Group_2__16937);
            rule__TemplateArgumentList__Group_2__2();

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
    // $ANTLR end "rule__TemplateArgumentList__Group_2__1"


    // $ANTLR start "rule__TemplateArgumentList__Group_2__1__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3376:1: rule__TemplateArgumentList__Group_2__1__Impl : ( ruleTemplateArgument ) ;
    public final void rule__TemplateArgumentList__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3380:1: ( ( ruleTemplateArgument ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3381:1: ( ruleTemplateArgument )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3381:1: ( ruleTemplateArgument )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3382:1: ruleTemplateArgument
            {
             before(grammarAccess.getTemplateArgumentListAccess().getTemplateArgumentParserRuleCall_2_1()); 
            pushFollow(FOLLOW_ruleTemplateArgument_in_rule__TemplateArgumentList__Group_2__1__Impl6964);
            ruleTemplateArgument();

            state._fsp--;

             after(grammarAccess.getTemplateArgumentListAccess().getTemplateArgumentParserRuleCall_2_1()); 

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
    // $ANTLR end "rule__TemplateArgumentList__Group_2__1__Impl"


    // $ANTLR start "rule__TemplateArgumentList__Group_2__2"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3393:1: rule__TemplateArgumentList__Group_2__2 : rule__TemplateArgumentList__Group_2__2__Impl ;
    public final void rule__TemplateArgumentList__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3397:1: ( rule__TemplateArgumentList__Group_2__2__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3398:2: rule__TemplateArgumentList__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__TemplateArgumentList__Group_2__2__Impl_in_rule__TemplateArgumentList__Group_2__26993);
            rule__TemplateArgumentList__Group_2__2__Impl();

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
    // $ANTLR end "rule__TemplateArgumentList__Group_2__2"


    // $ANTLR start "rule__TemplateArgumentList__Group_2__2__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3404:1: rule__TemplateArgumentList__Group_2__2__Impl : ( ( '...' )? ) ;
    public final void rule__TemplateArgumentList__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3408:1: ( ( ( '...' )? ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3409:1: ( ( '...' )? )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3409:1: ( ( '...' )? )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3410:1: ( '...' )?
            {
             before(grammarAccess.getTemplateArgumentListAccess().getFullStopFullStopFullStopKeyword_2_2()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3411:1: ( '...' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==94) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3412:2: '...'
                    {
                    match(input,94,FOLLOW_94_in_rule__TemplateArgumentList__Group_2__2__Impl7022); 

                    }
                    break;

            }

             after(grammarAccess.getTemplateArgumentListAccess().getFullStopFullStopFullStopKeyword_2_2()); 

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
    // $ANTLR end "rule__TemplateArgumentList__Group_2__2__Impl"


    // $ANTLR start "rule__Handler__Group__0"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3435:1: rule__Handler__Group__0 : rule__Handler__Group__0__Impl rule__Handler__Group__1 ;
    public final void rule__Handler__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3439:1: ( rule__Handler__Group__0__Impl rule__Handler__Group__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3440:2: rule__Handler__Group__0__Impl rule__Handler__Group__1
            {
            pushFollow(FOLLOW_rule__Handler__Group__0__Impl_in_rule__Handler__Group__07067);
            rule__Handler__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Handler__Group__1_in_rule__Handler__Group__07070);
            rule__Handler__Group__1();

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
    // $ANTLR end "rule__Handler__Group__0"


    // $ANTLR start "rule__Handler__Group__0__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3447:1: rule__Handler__Group__0__Impl : ( 'catch' ) ;
    public final void rule__Handler__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3451:1: ( ( 'catch' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3452:1: ( 'catch' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3452:1: ( 'catch' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3453:1: 'catch'
            {
             before(grammarAccess.getHandlerAccess().getCatchKeyword_0()); 
            match(input,103,FOLLOW_103_in_rule__Handler__Group__0__Impl7098); 
             after(grammarAccess.getHandlerAccess().getCatchKeyword_0()); 

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
    // $ANTLR end "rule__Handler__Group__0__Impl"


    // $ANTLR start "rule__Handler__Group__1"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3466:1: rule__Handler__Group__1 : rule__Handler__Group__1__Impl rule__Handler__Group__2 ;
    public final void rule__Handler__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3470:1: ( rule__Handler__Group__1__Impl rule__Handler__Group__2 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3471:2: rule__Handler__Group__1__Impl rule__Handler__Group__2
            {
            pushFollow(FOLLOW_rule__Handler__Group__1__Impl_in_rule__Handler__Group__17129);
            rule__Handler__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Handler__Group__2_in_rule__Handler__Group__17132);
            rule__Handler__Group__2();

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
    // $ANTLR end "rule__Handler__Group__1"


    // $ANTLR start "rule__Handler__Group__1__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3478:1: rule__Handler__Group__1__Impl : ( '(' ) ;
    public final void rule__Handler__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3482:1: ( ( '(' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3483:1: ( '(' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3483:1: ( '(' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3484:1: '('
            {
             before(grammarAccess.getHandlerAccess().getLeftParenthesisKeyword_1()); 
            match(input,104,FOLLOW_104_in_rule__Handler__Group__1__Impl7160); 
             after(grammarAccess.getHandlerAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__Handler__Group__1__Impl"


    // $ANTLR start "rule__Handler__Group__2"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3497:1: rule__Handler__Group__2 : rule__Handler__Group__2__Impl rule__Handler__Group__3 ;
    public final void rule__Handler__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3501:1: ( rule__Handler__Group__2__Impl rule__Handler__Group__3 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3502:2: rule__Handler__Group__2__Impl rule__Handler__Group__3
            {
            pushFollow(FOLLOW_rule__Handler__Group__2__Impl_in_rule__Handler__Group__27191);
            rule__Handler__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Handler__Group__3_in_rule__Handler__Group__27194);
            rule__Handler__Group__3();

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
    // $ANTLR end "rule__Handler__Group__2"


    // $ANTLR start "rule__Handler__Group__2__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3509:1: rule__Handler__Group__2__Impl : ( ruleExceptionDeclaration ) ;
    public final void rule__Handler__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3513:1: ( ( ruleExceptionDeclaration ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3514:1: ( ruleExceptionDeclaration )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3514:1: ( ruleExceptionDeclaration )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3515:1: ruleExceptionDeclaration
            {
             before(grammarAccess.getHandlerAccess().getExceptionDeclarationParserRuleCall_2()); 
            pushFollow(FOLLOW_ruleExceptionDeclaration_in_rule__Handler__Group__2__Impl7221);
            ruleExceptionDeclaration();

            state._fsp--;

             after(grammarAccess.getHandlerAccess().getExceptionDeclarationParserRuleCall_2()); 

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
    // $ANTLR end "rule__Handler__Group__2__Impl"


    // $ANTLR start "rule__Handler__Group__3"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3526:1: rule__Handler__Group__3 : rule__Handler__Group__3__Impl rule__Handler__Group__4 ;
    public final void rule__Handler__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3530:1: ( rule__Handler__Group__3__Impl rule__Handler__Group__4 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3531:2: rule__Handler__Group__3__Impl rule__Handler__Group__4
            {
            pushFollow(FOLLOW_rule__Handler__Group__3__Impl_in_rule__Handler__Group__37250);
            rule__Handler__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Handler__Group__4_in_rule__Handler__Group__37253);
            rule__Handler__Group__4();

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
    // $ANTLR end "rule__Handler__Group__3"


    // $ANTLR start "rule__Handler__Group__3__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3538:1: rule__Handler__Group__3__Impl : ( ')' ) ;
    public final void rule__Handler__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3542:1: ( ( ')' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3543:1: ( ')' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3543:1: ( ')' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3544:1: ')'
            {
             before(grammarAccess.getHandlerAccess().getRightParenthesisKeyword_3()); 
            match(input,105,FOLLOW_105_in_rule__Handler__Group__3__Impl7281); 
             after(grammarAccess.getHandlerAccess().getRightParenthesisKeyword_3()); 

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
    // $ANTLR end "rule__Handler__Group__3__Impl"


    // $ANTLR start "rule__Handler__Group__4"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3557:1: rule__Handler__Group__4 : rule__Handler__Group__4__Impl ;
    public final void rule__Handler__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3561:1: ( rule__Handler__Group__4__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3562:2: rule__Handler__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Handler__Group__4__Impl_in_rule__Handler__Group__47312);
            rule__Handler__Group__4__Impl();

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
    // $ANTLR end "rule__Handler__Group__4"


    // $ANTLR start "rule__Handler__Group__4__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3568:1: rule__Handler__Group__4__Impl : ( ruleCompoundStatement ) ;
    public final void rule__Handler__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3572:1: ( ( ruleCompoundStatement ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3573:1: ( ruleCompoundStatement )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3573:1: ( ruleCompoundStatement )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3574:1: ruleCompoundStatement
            {
             before(grammarAccess.getHandlerAccess().getCompoundStatementParserRuleCall_4()); 
            pushFollow(FOLLOW_ruleCompoundStatement_in_rule__Handler__Group__4__Impl7339);
            ruleCompoundStatement();

            state._fsp--;

             after(grammarAccess.getHandlerAccess().getCompoundStatementParserRuleCall_4()); 

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
    // $ANTLR end "rule__Handler__Group__4__Impl"


    // $ANTLR start "rule__ExceptionDeclaration__Group_0__0"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3595:1: rule__ExceptionDeclaration__Group_0__0 : rule__ExceptionDeclaration__Group_0__0__Impl rule__ExceptionDeclaration__Group_0__1 ;
    public final void rule__ExceptionDeclaration__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3599:1: ( rule__ExceptionDeclaration__Group_0__0__Impl rule__ExceptionDeclaration__Group_0__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3600:2: rule__ExceptionDeclaration__Group_0__0__Impl rule__ExceptionDeclaration__Group_0__1
            {
            pushFollow(FOLLOW_rule__ExceptionDeclaration__Group_0__0__Impl_in_rule__ExceptionDeclaration__Group_0__07378);
            rule__ExceptionDeclaration__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExceptionDeclaration__Group_0__1_in_rule__ExceptionDeclaration__Group_0__07381);
            rule__ExceptionDeclaration__Group_0__1();

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
    // $ANTLR end "rule__ExceptionDeclaration__Group_0__0"


    // $ANTLR start "rule__ExceptionDeclaration__Group_0__0__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3607:1: rule__ExceptionDeclaration__Group_0__0__Impl : ( ( ruleAttributeSpecifier )* ) ;
    public final void rule__ExceptionDeclaration__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3611:1: ( ( ( ruleAttributeSpecifier )* ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3612:1: ( ( ruleAttributeSpecifier )* )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3612:1: ( ( ruleAttributeSpecifier )* )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3613:1: ( ruleAttributeSpecifier )*
            {
             before(grammarAccess.getExceptionDeclarationAccess().getAttributeSpecifierParserRuleCall_0_0()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3614:1: ( ruleAttributeSpecifier )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==45) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3614:3: ruleAttributeSpecifier
            	    {
            	    pushFollow(FOLLOW_ruleAttributeSpecifier_in_rule__ExceptionDeclaration__Group_0__0__Impl7409);
            	    ruleAttributeSpecifier();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

             after(grammarAccess.getExceptionDeclarationAccess().getAttributeSpecifierParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__ExceptionDeclaration__Group_0__0__Impl"


    // $ANTLR start "rule__ExceptionDeclaration__Group_0__1"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3624:1: rule__ExceptionDeclaration__Group_0__1 : rule__ExceptionDeclaration__Group_0__1__Impl rule__ExceptionDeclaration__Group_0__2 ;
    public final void rule__ExceptionDeclaration__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3628:1: ( rule__ExceptionDeclaration__Group_0__1__Impl rule__ExceptionDeclaration__Group_0__2 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3629:2: rule__ExceptionDeclaration__Group_0__1__Impl rule__ExceptionDeclaration__Group_0__2
            {
            pushFollow(FOLLOW_rule__ExceptionDeclaration__Group_0__1__Impl_in_rule__ExceptionDeclaration__Group_0__17440);
            rule__ExceptionDeclaration__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExceptionDeclaration__Group_0__2_in_rule__ExceptionDeclaration__Group_0__17443);
            rule__ExceptionDeclaration__Group_0__2();

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
    // $ANTLR end "rule__ExceptionDeclaration__Group_0__1"


    // $ANTLR start "rule__ExceptionDeclaration__Group_0__1__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3636:1: rule__ExceptionDeclaration__Group_0__1__Impl : ( ( ( ruleTypeSpecifier ) ) ( ( ruleTypeSpecifier )* ) ) ;
    public final void rule__ExceptionDeclaration__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3640:1: ( ( ( ( ruleTypeSpecifier ) ) ( ( ruleTypeSpecifier )* ) ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3641:1: ( ( ( ruleTypeSpecifier ) ) ( ( ruleTypeSpecifier )* ) )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3641:1: ( ( ( ruleTypeSpecifier ) ) ( ( ruleTypeSpecifier )* ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3642:1: ( ( ruleTypeSpecifier ) ) ( ( ruleTypeSpecifier )* )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3642:1: ( ( ruleTypeSpecifier ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3643:1: ( ruleTypeSpecifier )
            {
             before(grammarAccess.getExceptionDeclarationAccess().getTypeSpecifierParserRuleCall_0_1()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3644:1: ( ruleTypeSpecifier )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3644:3: ruleTypeSpecifier
            {
            pushFollow(FOLLOW_ruleTypeSpecifier_in_rule__ExceptionDeclaration__Group_0__1__Impl7473);
            ruleTypeSpecifier();

            state._fsp--;


            }

             after(grammarAccess.getExceptionDeclarationAccess().getTypeSpecifierParserRuleCall_0_1()); 

            }

            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3647:1: ( ( ruleTypeSpecifier )* )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3648:1: ( ruleTypeSpecifier )*
            {
             before(grammarAccess.getExceptionDeclarationAccess().getTypeSpecifierParserRuleCall_0_1()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3649:1: ( ruleTypeSpecifier )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==46) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3649:3: ruleTypeSpecifier
            	    {
            	    pushFollow(FOLLOW_ruleTypeSpecifier_in_rule__ExceptionDeclaration__Group_0__1__Impl7486);
            	    ruleTypeSpecifier();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

             after(grammarAccess.getExceptionDeclarationAccess().getTypeSpecifierParserRuleCall_0_1()); 

            }


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
    // $ANTLR end "rule__ExceptionDeclaration__Group_0__1__Impl"


    // $ANTLR start "rule__ExceptionDeclaration__Group_0__2"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3660:1: rule__ExceptionDeclaration__Group_0__2 : rule__ExceptionDeclaration__Group_0__2__Impl ;
    public final void rule__ExceptionDeclaration__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3664:1: ( rule__ExceptionDeclaration__Group_0__2__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3665:2: rule__ExceptionDeclaration__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__ExceptionDeclaration__Group_0__2__Impl_in_rule__ExceptionDeclaration__Group_0__27519);
            rule__ExceptionDeclaration__Group_0__2__Impl();

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
    // $ANTLR end "rule__ExceptionDeclaration__Group_0__2"


    // $ANTLR start "rule__ExceptionDeclaration__Group_0__2__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3671:1: rule__ExceptionDeclaration__Group_0__2__Impl : ( ( rule__ExceptionDeclaration__Alternatives_0_2 ) ) ;
    public final void rule__ExceptionDeclaration__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3675:1: ( ( ( rule__ExceptionDeclaration__Alternatives_0_2 ) ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3676:1: ( ( rule__ExceptionDeclaration__Alternatives_0_2 ) )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3676:1: ( ( rule__ExceptionDeclaration__Alternatives_0_2 ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3677:1: ( rule__ExceptionDeclaration__Alternatives_0_2 )
            {
             before(grammarAccess.getExceptionDeclarationAccess().getAlternatives_0_2()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3678:1: ( rule__ExceptionDeclaration__Alternatives_0_2 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3678:2: rule__ExceptionDeclaration__Alternatives_0_2
            {
            pushFollow(FOLLOW_rule__ExceptionDeclaration__Alternatives_0_2_in_rule__ExceptionDeclaration__Group_0__2__Impl7546);
            rule__ExceptionDeclaration__Alternatives_0_2();

            state._fsp--;


            }

             after(grammarAccess.getExceptionDeclarationAccess().getAlternatives_0_2()); 

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
    // $ANTLR end "rule__ExceptionDeclaration__Group_0__2__Impl"


    // $ANTLR start "rule__DynamicExceptionSpecification__Group__0"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3695:1: rule__DynamicExceptionSpecification__Group__0 : rule__DynamicExceptionSpecification__Group__0__Impl rule__DynamicExceptionSpecification__Group__1 ;
    public final void rule__DynamicExceptionSpecification__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3699:1: ( rule__DynamicExceptionSpecification__Group__0__Impl rule__DynamicExceptionSpecification__Group__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3700:2: rule__DynamicExceptionSpecification__Group__0__Impl rule__DynamicExceptionSpecification__Group__1
            {
            pushFollow(FOLLOW_rule__DynamicExceptionSpecification__Group__0__Impl_in_rule__DynamicExceptionSpecification__Group__07583);
            rule__DynamicExceptionSpecification__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DynamicExceptionSpecification__Group__1_in_rule__DynamicExceptionSpecification__Group__07586);
            rule__DynamicExceptionSpecification__Group__1();

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
    // $ANTLR end "rule__DynamicExceptionSpecification__Group__0"


    // $ANTLR start "rule__DynamicExceptionSpecification__Group__0__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3707:1: rule__DynamicExceptionSpecification__Group__0__Impl : ( 'throw' ) ;
    public final void rule__DynamicExceptionSpecification__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3711:1: ( ( 'throw' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3712:1: ( 'throw' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3712:1: ( 'throw' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3713:1: 'throw'
            {
             before(grammarAccess.getDynamicExceptionSpecificationAccess().getThrowKeyword_0()); 
            match(input,106,FOLLOW_106_in_rule__DynamicExceptionSpecification__Group__0__Impl7614); 
             after(grammarAccess.getDynamicExceptionSpecificationAccess().getThrowKeyword_0()); 

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
    // $ANTLR end "rule__DynamicExceptionSpecification__Group__0__Impl"


    // $ANTLR start "rule__DynamicExceptionSpecification__Group__1"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3726:1: rule__DynamicExceptionSpecification__Group__1 : rule__DynamicExceptionSpecification__Group__1__Impl rule__DynamicExceptionSpecification__Group__2 ;
    public final void rule__DynamicExceptionSpecification__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3730:1: ( rule__DynamicExceptionSpecification__Group__1__Impl rule__DynamicExceptionSpecification__Group__2 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3731:2: rule__DynamicExceptionSpecification__Group__1__Impl rule__DynamicExceptionSpecification__Group__2
            {
            pushFollow(FOLLOW_rule__DynamicExceptionSpecification__Group__1__Impl_in_rule__DynamicExceptionSpecification__Group__17645);
            rule__DynamicExceptionSpecification__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DynamicExceptionSpecification__Group__2_in_rule__DynamicExceptionSpecification__Group__17648);
            rule__DynamicExceptionSpecification__Group__2();

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
    // $ANTLR end "rule__DynamicExceptionSpecification__Group__1"


    // $ANTLR start "rule__DynamicExceptionSpecification__Group__1__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3738:1: rule__DynamicExceptionSpecification__Group__1__Impl : ( '(' ) ;
    public final void rule__DynamicExceptionSpecification__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3742:1: ( ( '(' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3743:1: ( '(' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3743:1: ( '(' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3744:1: '('
            {
             before(grammarAccess.getDynamicExceptionSpecificationAccess().getLeftParenthesisKeyword_1()); 
            match(input,104,FOLLOW_104_in_rule__DynamicExceptionSpecification__Group__1__Impl7676); 
             after(grammarAccess.getDynamicExceptionSpecificationAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__DynamicExceptionSpecification__Group__1__Impl"


    // $ANTLR start "rule__DynamicExceptionSpecification__Group__2"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3757:1: rule__DynamicExceptionSpecification__Group__2 : rule__DynamicExceptionSpecification__Group__2__Impl rule__DynamicExceptionSpecification__Group__3 ;
    public final void rule__DynamicExceptionSpecification__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3761:1: ( rule__DynamicExceptionSpecification__Group__2__Impl rule__DynamicExceptionSpecification__Group__3 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3762:2: rule__DynamicExceptionSpecification__Group__2__Impl rule__DynamicExceptionSpecification__Group__3
            {
            pushFollow(FOLLOW_rule__DynamicExceptionSpecification__Group__2__Impl_in_rule__DynamicExceptionSpecification__Group__27707);
            rule__DynamicExceptionSpecification__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DynamicExceptionSpecification__Group__3_in_rule__DynamicExceptionSpecification__Group__27710);
            rule__DynamicExceptionSpecification__Group__3();

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
    // $ANTLR end "rule__DynamicExceptionSpecification__Group__2"


    // $ANTLR start "rule__DynamicExceptionSpecification__Group__2__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3769:1: rule__DynamicExceptionSpecification__Group__2__Impl : ( ruleTypeIdList ) ;
    public final void rule__DynamicExceptionSpecification__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3773:1: ( ( ruleTypeIdList ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3774:1: ( ruleTypeIdList )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3774:1: ( ruleTypeIdList )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3775:1: ruleTypeIdList
            {
             before(grammarAccess.getDynamicExceptionSpecificationAccess().getTypeIdListParserRuleCall_2()); 
            pushFollow(FOLLOW_ruleTypeIdList_in_rule__DynamicExceptionSpecification__Group__2__Impl7737);
            ruleTypeIdList();

            state._fsp--;

             after(grammarAccess.getDynamicExceptionSpecificationAccess().getTypeIdListParserRuleCall_2()); 

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
    // $ANTLR end "rule__DynamicExceptionSpecification__Group__2__Impl"


    // $ANTLR start "rule__DynamicExceptionSpecification__Group__3"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3786:1: rule__DynamicExceptionSpecification__Group__3 : rule__DynamicExceptionSpecification__Group__3__Impl ;
    public final void rule__DynamicExceptionSpecification__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3790:1: ( rule__DynamicExceptionSpecification__Group__3__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3791:2: rule__DynamicExceptionSpecification__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__DynamicExceptionSpecification__Group__3__Impl_in_rule__DynamicExceptionSpecification__Group__37766);
            rule__DynamicExceptionSpecification__Group__3__Impl();

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
    // $ANTLR end "rule__DynamicExceptionSpecification__Group__3"


    // $ANTLR start "rule__DynamicExceptionSpecification__Group__3__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3797:1: rule__DynamicExceptionSpecification__Group__3__Impl : ( ')' ) ;
    public final void rule__DynamicExceptionSpecification__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3801:1: ( ( ')' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3802:1: ( ')' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3802:1: ( ')' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3803:1: ')'
            {
             before(grammarAccess.getDynamicExceptionSpecificationAccess().getRightParenthesisKeyword_3()); 
            match(input,105,FOLLOW_105_in_rule__DynamicExceptionSpecification__Group__3__Impl7794); 
             after(grammarAccess.getDynamicExceptionSpecificationAccess().getRightParenthesisKeyword_3()); 

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
    // $ANTLR end "rule__DynamicExceptionSpecification__Group__3__Impl"


    // $ANTLR start "rule__NoexceptSpecification__Group__0"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3824:1: rule__NoexceptSpecification__Group__0 : rule__NoexceptSpecification__Group__0__Impl rule__NoexceptSpecification__Group__1 ;
    public final void rule__NoexceptSpecification__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3828:1: ( rule__NoexceptSpecification__Group__0__Impl rule__NoexceptSpecification__Group__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3829:2: rule__NoexceptSpecification__Group__0__Impl rule__NoexceptSpecification__Group__1
            {
            pushFollow(FOLLOW_rule__NoexceptSpecification__Group__0__Impl_in_rule__NoexceptSpecification__Group__07833);
            rule__NoexceptSpecification__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NoexceptSpecification__Group__1_in_rule__NoexceptSpecification__Group__07836);
            rule__NoexceptSpecification__Group__1();

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
    // $ANTLR end "rule__NoexceptSpecification__Group__0"


    // $ANTLR start "rule__NoexceptSpecification__Group__0__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3836:1: rule__NoexceptSpecification__Group__0__Impl : ( 'noexcept' ) ;
    public final void rule__NoexceptSpecification__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3840:1: ( ( 'noexcept' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3841:1: ( 'noexcept' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3841:1: ( 'noexcept' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3842:1: 'noexcept'
            {
             before(grammarAccess.getNoexceptSpecificationAccess().getNoexceptKeyword_0()); 
            match(input,107,FOLLOW_107_in_rule__NoexceptSpecification__Group__0__Impl7864); 
             after(grammarAccess.getNoexceptSpecificationAccess().getNoexceptKeyword_0()); 

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
    // $ANTLR end "rule__NoexceptSpecification__Group__0__Impl"


    // $ANTLR start "rule__NoexceptSpecification__Group__1"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3855:1: rule__NoexceptSpecification__Group__1 : rule__NoexceptSpecification__Group__1__Impl ;
    public final void rule__NoexceptSpecification__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3859:1: ( rule__NoexceptSpecification__Group__1__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3860:2: rule__NoexceptSpecification__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__NoexceptSpecification__Group__1__Impl_in_rule__NoexceptSpecification__Group__17895);
            rule__NoexceptSpecification__Group__1__Impl();

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
    // $ANTLR end "rule__NoexceptSpecification__Group__1"


    // $ANTLR start "rule__NoexceptSpecification__Group__1__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3866:1: rule__NoexceptSpecification__Group__1__Impl : ( ( rule__NoexceptSpecification__Group_1__0 )? ) ;
    public final void rule__NoexceptSpecification__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3870:1: ( ( ( rule__NoexceptSpecification__Group_1__0 )? ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3871:1: ( ( rule__NoexceptSpecification__Group_1__0 )? )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3871:1: ( ( rule__NoexceptSpecification__Group_1__0 )? )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3872:1: ( rule__NoexceptSpecification__Group_1__0 )?
            {
             before(grammarAccess.getNoexceptSpecificationAccess().getGroup_1()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3873:1: ( rule__NoexceptSpecification__Group_1__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==104) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3873:2: rule__NoexceptSpecification__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__NoexceptSpecification__Group_1__0_in_rule__NoexceptSpecification__Group__1__Impl7922);
                    rule__NoexceptSpecification__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNoexceptSpecificationAccess().getGroup_1()); 

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
    // $ANTLR end "rule__NoexceptSpecification__Group__1__Impl"


    // $ANTLR start "rule__NoexceptSpecification__Group_1__0"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3887:1: rule__NoexceptSpecification__Group_1__0 : rule__NoexceptSpecification__Group_1__0__Impl rule__NoexceptSpecification__Group_1__1 ;
    public final void rule__NoexceptSpecification__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3891:1: ( rule__NoexceptSpecification__Group_1__0__Impl rule__NoexceptSpecification__Group_1__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3892:2: rule__NoexceptSpecification__Group_1__0__Impl rule__NoexceptSpecification__Group_1__1
            {
            pushFollow(FOLLOW_rule__NoexceptSpecification__Group_1__0__Impl_in_rule__NoexceptSpecification__Group_1__07957);
            rule__NoexceptSpecification__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NoexceptSpecification__Group_1__1_in_rule__NoexceptSpecification__Group_1__07960);
            rule__NoexceptSpecification__Group_1__1();

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
    // $ANTLR end "rule__NoexceptSpecification__Group_1__0"


    // $ANTLR start "rule__NoexceptSpecification__Group_1__0__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3899:1: rule__NoexceptSpecification__Group_1__0__Impl : ( '(' ) ;
    public final void rule__NoexceptSpecification__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3903:1: ( ( '(' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3904:1: ( '(' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3904:1: ( '(' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3905:1: '('
            {
             before(grammarAccess.getNoexceptSpecificationAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,104,FOLLOW_104_in_rule__NoexceptSpecification__Group_1__0__Impl7988); 
             after(grammarAccess.getNoexceptSpecificationAccess().getLeftParenthesisKeyword_1_0()); 

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
    // $ANTLR end "rule__NoexceptSpecification__Group_1__0__Impl"


    // $ANTLR start "rule__NoexceptSpecification__Group_1__1"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3918:1: rule__NoexceptSpecification__Group_1__1 : rule__NoexceptSpecification__Group_1__1__Impl rule__NoexceptSpecification__Group_1__2 ;
    public final void rule__NoexceptSpecification__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3922:1: ( rule__NoexceptSpecification__Group_1__1__Impl rule__NoexceptSpecification__Group_1__2 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3923:2: rule__NoexceptSpecification__Group_1__1__Impl rule__NoexceptSpecification__Group_1__2
            {
            pushFollow(FOLLOW_rule__NoexceptSpecification__Group_1__1__Impl_in_rule__NoexceptSpecification__Group_1__18019);
            rule__NoexceptSpecification__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NoexceptSpecification__Group_1__2_in_rule__NoexceptSpecification__Group_1__18022);
            rule__NoexceptSpecification__Group_1__2();

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
    // $ANTLR end "rule__NoexceptSpecification__Group_1__1"


    // $ANTLR start "rule__NoexceptSpecification__Group_1__1__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3930:1: rule__NoexceptSpecification__Group_1__1__Impl : ( ruleConstantExpression ) ;
    public final void rule__NoexceptSpecification__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3934:1: ( ( ruleConstantExpression ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3935:1: ( ruleConstantExpression )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3935:1: ( ruleConstantExpression )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3936:1: ruleConstantExpression
            {
             before(grammarAccess.getNoexceptSpecificationAccess().getConstantExpressionParserRuleCall_1_1()); 
            pushFollow(FOLLOW_ruleConstantExpression_in_rule__NoexceptSpecification__Group_1__1__Impl8049);
            ruleConstantExpression();

            state._fsp--;

             after(grammarAccess.getNoexceptSpecificationAccess().getConstantExpressionParserRuleCall_1_1()); 

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
    // $ANTLR end "rule__NoexceptSpecification__Group_1__1__Impl"


    // $ANTLR start "rule__NoexceptSpecification__Group_1__2"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3947:1: rule__NoexceptSpecification__Group_1__2 : rule__NoexceptSpecification__Group_1__2__Impl ;
    public final void rule__NoexceptSpecification__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3951:1: ( rule__NoexceptSpecification__Group_1__2__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3952:2: rule__NoexceptSpecification__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__NoexceptSpecification__Group_1__2__Impl_in_rule__NoexceptSpecification__Group_1__28078);
            rule__NoexceptSpecification__Group_1__2__Impl();

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
    // $ANTLR end "rule__NoexceptSpecification__Group_1__2"


    // $ANTLR start "rule__NoexceptSpecification__Group_1__2__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3958:1: rule__NoexceptSpecification__Group_1__2__Impl : ( ')' ) ;
    public final void rule__NoexceptSpecification__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3962:1: ( ( ')' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3963:1: ( ')' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3963:1: ( ')' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3964:1: ')'
            {
             before(grammarAccess.getNoexceptSpecificationAccess().getRightParenthesisKeyword_1_2()); 
            match(input,105,FOLLOW_105_in_rule__NoexceptSpecification__Group_1__2__Impl8106); 
             after(grammarAccess.getNoexceptSpecificationAccess().getRightParenthesisKeyword_1_2()); 

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
    // $ANTLR end "rule__NoexceptSpecification__Group_1__2__Impl"


    // $ANTLR start "rule__Test__ElementsAssignment"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3984:1: rule__Test__ElementsAssignment : ( ruleToken ) ;
    public final void rule__Test__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3988:1: ( ( ruleToken ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3989:1: ( ruleToken )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3989:1: ( ruleToken )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3990:1: ruleToken
            {
             before(grammarAccess.getTestAccess().getElementsTokenParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleToken_in_rule__Test__ElementsAssignment8148);
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


    protected DFA5 dfa5 = new DFA5(this);
    static final String DFA5_eotS =
        "\55\uffff";
    static final String DFA5_eofS =
        "\1\uffff\1\51\1\53\52\uffff";
    static final String DFA5_minS =
        "\1\66\2\103\52\uffff";
    static final String DFA5_maxS =
        "\1\135\2\141\52\uffff";
    static final String DFA5_acceptS =
        "\3\uffff\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1"+
        "\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34"+
        "\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46\1\47\1\50\1\51"+
        "\1\52\1\1\1\3\1\2\1\4";
    static final String DFA5_specialS =
        "\55\uffff}>";
    static final String[] DFA5_transitionS = {
            "\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15"+
            "\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31"+
            "\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45"+
            "\1\46\1\47\1\50",
            "\1\51\35\uffff\1\52",
            "\1\53\35\uffff\1\54",
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
            return "1047:1: rule__OverloadableOperator__Alternatives : ( ( 'new' ) | ( 'delete' ) | ( ( rule__OverloadableOperator__Group_2__0 ) ) | ( ( rule__OverloadableOperator__Group_3__0 ) ) | ( '+' ) | ( '-' ) | ( '*' ) | ( '/' ) | ( '%' ) | ( '^' ) | ( '&' ) | ( '|' ) | ( '~' ) | ( '!' ) | ( '=' ) | ( '<' ) | ( '>' ) | ( '+=' ) | ( '-=' ) | ( '*=' ) | ( '/=' ) | ( '%=' ) | ( '^=' ) | ( '&=' ) | ( '|=' ) | ( '<<' ) | ( '>>' ) | ( '>>=' ) | ( '<<=' ) | ( '==' ) | ( '!=' ) | ( '<=' ) | ( '>=' ) | ( '&&' ) | ( '||' ) | ( '++' ) | ( '--' ) | ( ',' ) | ( '->*' ) | ( '->' ) | ( '()' ) | ( '[]' ) );";
        }
    }
 

    public static final BitSet FOLLOW_ruleTest_in_entryRuleTest61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTest68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Test__ElementsAssignment_in_ruleTest94 = new BitSet(new long[]{0x00300000000003F2L});
    public static final BitSet FOLLOW_ruleToken_in_entryRuleToken124 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleToken131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Token__Alternatives_in_ruleToken157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral184 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Alternatives_in_ruleLiteral217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperatorFunctionId_in_entryRuleOperatorFunctionId244 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperatorFunctionId251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OperatorFunctionId__Group__0_in_ruleOperatorFunctionId277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOverloadableOperator_in_entryRuleOverloadableOperator304 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOverloadableOperator311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OverloadableOperator__Alternatives_in_ruleOverloadableOperator337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralOperatorId_in_entryRuleLiteralOperatorId364 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteralOperatorId371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LiteralOperatorId__Group__0_in_ruleLiteralOperatorId397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplateParameterList_in_entryRuleTemplateParameterList426 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTemplateParameterList433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemplateParameterList__Group__0_in_ruleTemplateParameterList459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplateParameter_in_entryRuleTemplateParameter486 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTemplateParameter493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemplateParameter__Alternatives_in_ruleTemplateParameter519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeParameter_in_entryRuleTypeParameter546 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeParameter553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeParameter__Alternatives_in_ruleTypeParameter579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleTemplateId_in_entryRuleSimpleTemplateId606 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleTemplateId613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleTemplateId__Group__0_in_ruleSimpleTemplateId639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplateArgumentList_in_entryRuleTemplateArgumentList668 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTemplateArgumentList675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemplateArgumentList__Group__0_in_ruleTemplateArgumentList701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplateArgument_in_entryRuleTemplateArgument728 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTemplateArgument735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemplateArgument__Alternatives_in_ruleTemplateArgument761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHandler_in_entryRuleHandler798 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHandler805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Handler__Group__0_in_ruleHandler831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExceptionDeclaration_in_entryRuleExceptionDeclaration858 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExceptionDeclaration865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExceptionDeclaration__Alternatives_in_ruleExceptionDeclaration891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDynamicExceptionSpecification_in_entryRuleDynamicExceptionSpecification922 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDynamicExceptionSpecification929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DynamicExceptionSpecification__Group__0_in_ruleDynamicExceptionSpecification955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoexceptSpecification_in_entryRuleNoexceptSpecification982 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNoexceptSpecification989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NoexceptSpecification__Group__0_in_ruleNoexceptSpecification1015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantExpression_in_entryRuleConstantExpression1042 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstantExpression1049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleConstantExpression1076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeId_in_entryRuleTypeId1104 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeId1111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleTypeId1138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdExpression_in_entryRuleIdExpression1166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIdExpression1173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleIdExpression1200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterDeclaration_in_entryRuleParameterDeclaration1228 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterDeclaration1235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleParameterDeclaration1262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_entryRuleDeclaration1290 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeclaration1297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleDeclaration1324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNestedNameSpecifier_in_entryRuleNestedNameSpecifier1352 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNestedNameSpecifier1359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleNestedNameSpecifier1386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignmentExpression_in_entryRuleAssignmentExpression1414 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignmentExpression1421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleAssignmentExpression1448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeSpecifier_in_entryRuleAttributeSpecifier1476 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttributeSpecifier1483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleAttributeSpecifier1510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeSpecifier_in_entryRuleTypeSpecifier1538 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeSpecifier1545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleTypeSpecifier1572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclarator_in_entryRuleDeclarator1600 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeclarator1607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleDeclarator1634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractDeclarator_in_entryRuleAbstractDeclarator1662 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractDeclarator1669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleAbstractDeclarator1696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompoundStatement_in_entryRuleCompoundStatement1724 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompoundStatement1731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleCompoundStatement1758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCtorInitializer_in_entryRuleCtorInitializer1786 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCtorInitializer1793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleCtorInitializer1820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeIdList_in_entryRuleTypeIdList1848 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeIdList1855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleTypeIdList1882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_KEYWORD_in_rule__Token__Alternatives1924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_rule__Token__Alternatives1941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Token__Group_2__0_in_rule__Token__Alternatives1958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Literal__Alternatives1991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CHARACTER_LITERAL_in_rule__Literal__Alternatives2008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOATING_LITERAL_in_rule__Literal__Alternatives2025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_LITERAL_in_rule__Literal__Alternatives2042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Group_4__0_in_rule__Literal__Alternatives2059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__Literal__Alternatives_4_02093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rule__Literal__Alternatives_4_02113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rule__OverloadableOperator__Alternatives2148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rule__OverloadableOperator__Alternatives2168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OverloadableOperator__Group_2__0_in_rule__OverloadableOperator__Alternatives2187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OverloadableOperator__Group_3__0_in_rule__OverloadableOperator__Alternatives2205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_rule__OverloadableOperator__Alternatives2224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_rule__OverloadableOperator__Alternatives2244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_rule__OverloadableOperator__Alternatives2264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_rule__OverloadableOperator__Alternatives2284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_rule__OverloadableOperator__Alternatives2304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_rule__OverloadableOperator__Alternatives2324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_rule__OverloadableOperator__Alternatives2344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_rule__OverloadableOperator__Alternatives2364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_rule__OverloadableOperator__Alternatives2384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_rule__OverloadableOperator__Alternatives2404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_rule__OverloadableOperator__Alternatives2424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_rule__OverloadableOperator__Alternatives2444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_rule__OverloadableOperator__Alternatives2464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_rule__OverloadableOperator__Alternatives2484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_rule__OverloadableOperator__Alternatives2504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_rule__OverloadableOperator__Alternatives2524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_rule__OverloadableOperator__Alternatives2544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_rule__OverloadableOperator__Alternatives2564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_rule__OverloadableOperator__Alternatives2584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_rule__OverloadableOperator__Alternatives2604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_rule__OverloadableOperator__Alternatives2624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_rule__OverloadableOperator__Alternatives2644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_rule__OverloadableOperator__Alternatives2664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_rule__OverloadableOperator__Alternatives2684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_rule__OverloadableOperator__Alternatives2704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_rule__OverloadableOperator__Alternatives2724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_rule__OverloadableOperator__Alternatives2744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_rule__OverloadableOperator__Alternatives2764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_rule__OverloadableOperator__Alternatives2784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_rule__OverloadableOperator__Alternatives2804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_rule__OverloadableOperator__Alternatives2824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_rule__OverloadableOperator__Alternatives2844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_rule__OverloadableOperator__Alternatives2864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_rule__OverloadableOperator__Alternatives2884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_rule__OverloadableOperator__Alternatives2904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_rule__OverloadableOperator__Alternatives2924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_rule__OverloadableOperator__Alternatives2944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_rule__OverloadableOperator__Alternatives2964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeParameter_in_rule__TemplateParameter__Alternatives2998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterDeclaration_in_rule__TemplateParameter__Alternatives3015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_0__0_in_rule__TypeParameter__Alternatives3047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_1__0_in_rule__TypeParameter__Alternatives3065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_2__0_in_rule__TypeParameter__Alternatives3083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_0_1_0__0_in_rule__TypeParameter__Alternatives_0_13116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_0_1_1__0_in_rule__TypeParameter__Alternatives_0_13134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_1_1_0__0_in_rule__TypeParameter__Alternatives_1_13167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_1_1_1__0_in_rule__TypeParameter__Alternatives_1_13185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_2_5_0__0_in_rule__TypeParameter__Alternatives_2_53218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_2_5_1__0_in_rule__TypeParameter__Alternatives_2_53236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantExpression_in_rule__TemplateArgument__Alternatives3270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeId_in_rule__TemplateArgument__Alternatives3287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdExpression_in_rule__TemplateArgument__Alternatives3304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExceptionDeclaration__Group_0__0_in_rule__ExceptionDeclaration__Alternatives3337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_rule__ExceptionDeclaration__Alternatives3356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclarator_in_rule__ExceptionDeclaration__Alternatives_0_23390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractDeclarator_in_rule__ExceptionDeclaration__Alternatives_0_23408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Token__Group_2__0__Impl_in_rule__Token__Group_2__03444 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_rule__Token__Group_2__1_in_rule__Token__Group_2__03447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PREPROCESSING_OP_OR_PUNC_in_rule__Token__Group_2__0__Impl3474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Token__Group_2__1__Impl_in_rule__Token__Group_2__13503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Token__Group_2__1__Impl3530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Group_4__0__Impl_in_rule__Literal__Group_4__03563 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Literal__Group_4__1_in_rule__Literal__Group_4__03566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Alternatives_4_0_in_rule__Literal__Group_4__0__Impl3593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Group_4__1__Impl_in_rule__Literal__Group_4__13623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_rule__Literal__Group_4__1__Impl3651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OperatorFunctionId__Group__0__Impl_in_rule__OperatorFunctionId__Group__03686 = new BitSet(new long[]{0xFFC0000000000000L,0x000000003FFFFFFFL});
    public static final BitSet FOLLOW_rule__OperatorFunctionId__Group__1_in_rule__OperatorFunctionId__Group__03689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_rule__OperatorFunctionId__Group__0__Impl3717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OperatorFunctionId__Group__1__Impl_in_rule__OperatorFunctionId__Group__13748 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_rule__OperatorFunctionId__Group__2_in_rule__OperatorFunctionId__Group__13751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOverloadableOperator_in_rule__OperatorFunctionId__Group__1__Impl3778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OperatorFunctionId__Group__2__Impl_in_rule__OperatorFunctionId__Group__23807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OperatorFunctionId__Group_2__0_in_rule__OperatorFunctionId__Group__2__Impl3834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OperatorFunctionId__Group_2__0__Impl_in_rule__OperatorFunctionId__Group_2__03871 = new BitSet(new long[]{0x000001C000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_rule__OperatorFunctionId__Group_2__1_in_rule__OperatorFunctionId__Group_2__03874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_rule__OperatorFunctionId__Group_2__0__Impl3902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OperatorFunctionId__Group_2__1__Impl_in_rule__OperatorFunctionId__Group_2__13933 = new BitSet(new long[]{0x000001C000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_rule__OperatorFunctionId__Group_2__2_in_rule__OperatorFunctionId__Group_2__13936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplateArgument_in_rule__OperatorFunctionId__Group_2__1__Impl3964 = new BitSet(new long[]{0x000001C000000002L});
    public static final BitSet FOLLOW_rule__OperatorFunctionId__Group_2__2__Impl_in_rule__OperatorFunctionId__Group_2__23995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_rule__OperatorFunctionId__Group_2__2__Impl4023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OverloadableOperator__Group_2__0__Impl_in_rule__OverloadableOperator__Group_2__04060 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_rule__OverloadableOperator__Group_2__1_in_rule__OverloadableOperator__Group_2__04063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rule__OverloadableOperator__Group_2__0__Impl4091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OverloadableOperator__Group_2__1__Impl_in_rule__OverloadableOperator__Group_2__14122 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_rule__OverloadableOperator__Group_2__2_in_rule__OverloadableOperator__Group_2__14125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_rule__OverloadableOperator__Group_2__1__Impl4153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OverloadableOperator__Group_2__2__Impl_in_rule__OverloadableOperator__Group_2__24184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_98_in_rule__OverloadableOperator__Group_2__2__Impl4212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OverloadableOperator__Group_3__0__Impl_in_rule__OverloadableOperator__Group_3__04249 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_rule__OverloadableOperator__Group_3__1_in_rule__OverloadableOperator__Group_3__04252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rule__OverloadableOperator__Group_3__0__Impl4280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OverloadableOperator__Group_3__1__Impl_in_rule__OverloadableOperator__Group_3__14311 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_rule__OverloadableOperator__Group_3__2_in_rule__OverloadableOperator__Group_3__14314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_rule__OverloadableOperator__Group_3__1__Impl4342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OverloadableOperator__Group_3__2__Impl_in_rule__OverloadableOperator__Group_3__24373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_98_in_rule__OverloadableOperator__Group_3__2__Impl4401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LiteralOperatorId__Group__0__Impl_in_rule__LiteralOperatorId__Group__04438 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_rule__LiteralOperatorId__Group__1_in_rule__LiteralOperatorId__Group__04441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_rule__LiteralOperatorId__Group__0__Impl4469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LiteralOperatorId__Group__1__Impl_in_rule__LiteralOperatorId__Group__14500 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_rule__LiteralOperatorId__Group__2_in_rule__LiteralOperatorId__Group__14503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_99_in_rule__LiteralOperatorId__Group__1__Impl4531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LiteralOperatorId__Group__2__Impl_in_rule__LiteralOperatorId__Group__24562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_99_in_rule__LiteralOperatorId__Group__2__Impl4590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemplateParameterList__Group__0__Impl_in_rule__TemplateParameterList__Group__04628 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_rule__TemplateParameterList__Group__1_in_rule__TemplateParameterList__Group__04631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplateParameter_in_rule__TemplateParameterList__Group__0__Impl4658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemplateParameterList__Group__1__Impl_in_rule__TemplateParameterList__Group__14687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemplateParameterList__Group_1__0_in_rule__TemplateParameterList__Group__1__Impl4714 = new BitSet(new long[]{0x0000000000000002L,0x0000000002000000L});
    public static final BitSet FOLLOW_rule__TemplateParameterList__Group_1__0__Impl_in_rule__TemplateParameterList__Group_1__04749 = new BitSet(new long[]{0x0000020000000000L,0x0000007000000000L});
    public static final BitSet FOLLOW_rule__TemplateParameterList__Group_1__1_in_rule__TemplateParameterList__Group_1__04752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_rule__TemplateParameterList__Group_1__0__Impl4780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemplateParameterList__Group_1__1__Impl_in_rule__TemplateParameterList__Group_1__14811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplateParameter_in_rule__TemplateParameterList__Group_1__1__Impl4838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_0__0__Impl_in_rule__TypeParameter__Group_0__04871 = new BitSet(new long[]{0x0000000000000400L,0x0000000040000004L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_0__1_in_rule__TypeParameter__Group_0__04874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_100_in_rule__TypeParameter__Group_0__0__Impl4902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_0__1__Impl_in_rule__TypeParameter__Group_0__14933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeParameter__Alternatives_0_1_in_rule__TypeParameter__Group_0__1__Impl4960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_0_1_0__0__Impl_in_rule__TypeParameter__Group_0_1_0__04994 = new BitSet(new long[]{0x0000000000000400L,0x0000000040000000L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_0_1_0__1_in_rule__TypeParameter__Group_0_1_0__04997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_rule__TypeParameter__Group_0_1_0__0__Impl5026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_0_1_0__1__Impl_in_rule__TypeParameter__Group_0_1_0__15059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TypeParameter__Group_0_1_0__1__Impl5087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_0_1_1__0__Impl_in_rule__TypeParameter__Group_0_1_1__05122 = new BitSet(new long[]{0x0000000000000400L,0x0000000040000004L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_0_1_1__1_in_rule__TypeParameter__Group_0_1_1__05125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TypeParameter__Group_0_1_1__0__Impl5153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_0_1_1__1__Impl_in_rule__TypeParameter__Group_0_1_1__15184 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_0_1_1__2_in_rule__TypeParameter__Group_0_1_1__15187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_rule__TypeParameter__Group_0_1_1__1__Impl5215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_0_1_1__2__Impl_in_rule__TypeParameter__Group_0_1_1__25246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeId_in_rule__TypeParameter__Group_0_1_1__2__Impl5273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_1__0__Impl_in_rule__TypeParameter__Group_1__05308 = new BitSet(new long[]{0x0000000000000400L,0x0000000040000004L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_1__1_in_rule__TypeParameter__Group_1__05311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_101_in_rule__TypeParameter__Group_1__0__Impl5339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_1__1__Impl_in_rule__TypeParameter__Group_1__15370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeParameter__Alternatives_1_1_in_rule__TypeParameter__Group_1__1__Impl5397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_1_1_0__0__Impl_in_rule__TypeParameter__Group_1_1_0__05431 = new BitSet(new long[]{0x0000000000000400L,0x0000000040000000L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_1_1_0__1_in_rule__TypeParameter__Group_1_1_0__05434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_rule__TypeParameter__Group_1_1_0__0__Impl5463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_1_1_0__1__Impl_in_rule__TypeParameter__Group_1_1_0__15496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TypeParameter__Group_1_1_0__1__Impl5524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_1_1_1__0__Impl_in_rule__TypeParameter__Group_1_1_1__05559 = new BitSet(new long[]{0x0000000000000400L,0x0000000040000004L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_1_1_1__1_in_rule__TypeParameter__Group_1_1_1__05562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TypeParameter__Group_1_1_1__0__Impl5590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_1_1_1__1__Impl_in_rule__TypeParameter__Group_1_1_1__15621 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_1_1_1__2_in_rule__TypeParameter__Group_1_1_1__15624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_rule__TypeParameter__Group_1_1_1__1__Impl5652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_1_1_1__2__Impl_in_rule__TypeParameter__Group_1_1_1__25683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeId_in_rule__TypeParameter__Group_1_1_1__2__Impl5710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_2__0__Impl_in_rule__TypeParameter__Group_2__05745 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_2__1_in_rule__TypeParameter__Group_2__05748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_102_in_rule__TypeParameter__Group_2__0__Impl5776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_2__1__Impl_in_rule__TypeParameter__Group_2__15807 = new BitSet(new long[]{0x0000020000000000L,0x0000007000000000L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_2__2_in_rule__TypeParameter__Group_2__15810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_rule__TypeParameter__Group_2__1__Impl5838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_2__2__Impl_in_rule__TypeParameter__Group_2__25869 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_2__3_in_rule__TypeParameter__Group_2__25872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplateParameterList_in_rule__TypeParameter__Group_2__2__Impl5899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_2__3__Impl_in_rule__TypeParameter__Group_2__35928 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_2__4_in_rule__TypeParameter__Group_2__35931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_rule__TypeParameter__Group_2__3__Impl5959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_2__4__Impl_in_rule__TypeParameter__Group_2__45990 = new BitSet(new long[]{0x0000000000000400L,0x0000000040000004L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_2__5_in_rule__TypeParameter__Group_2__45993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_100_in_rule__TypeParameter__Group_2__4__Impl6021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_2__5__Impl_in_rule__TypeParameter__Group_2__56052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeParameter__Alternatives_2_5_in_rule__TypeParameter__Group_2__5__Impl6079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_2_5_0__0__Impl_in_rule__TypeParameter__Group_2_5_0__06121 = new BitSet(new long[]{0x0000000000000400L,0x0000000040000000L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_2_5_0__1_in_rule__TypeParameter__Group_2_5_0__06124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_rule__TypeParameter__Group_2_5_0__0__Impl6153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_2_5_0__1__Impl_in_rule__TypeParameter__Group_2_5_0__16186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TypeParameter__Group_2_5_0__1__Impl6214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_2_5_1__0__Impl_in_rule__TypeParameter__Group_2_5_1__06249 = new BitSet(new long[]{0x0000000000000400L,0x0000000040000004L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_2_5_1__1_in_rule__TypeParameter__Group_2_5_1__06252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TypeParameter__Group_2_5_1__0__Impl6280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_2_5_1__1__Impl_in_rule__TypeParameter__Group_2_5_1__16311 = new BitSet(new long[]{0x000001C000000000L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_2_5_1__2_in_rule__TypeParameter__Group_2_5_1__16314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_rule__TypeParameter__Group_2_5_1__1__Impl6342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_2_5_1__2__Impl_in_rule__TypeParameter__Group_2_5_1__26373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdExpression_in_rule__TypeParameter__Group_2_5_1__2__Impl6400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleTemplateId__Group__0__Impl_in_rule__SimpleTemplateId__Group__06435 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_rule__SimpleTemplateId__Group__1_in_rule__SimpleTemplateId__Group__06438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SimpleTemplateId__Group__0__Impl6465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleTemplateId__Group__1__Impl_in_rule__SimpleTemplateId__Group__16494 = new BitSet(new long[]{0x000001C000000000L});
    public static final BitSet FOLLOW_rule__SimpleTemplateId__Group__2_in_rule__SimpleTemplateId__Group__16497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_rule__SimpleTemplateId__Group__1__Impl6525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleTemplateId__Group__2__Impl_in_rule__SimpleTemplateId__Group__26556 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SimpleTemplateId__Group__3_in_rule__SimpleTemplateId__Group__26559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplateArgumentList_in_rule__SimpleTemplateId__Group__2__Impl6586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleTemplateId__Group__3__Impl_in_rule__SimpleTemplateId__Group__36615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_rule__SimpleTemplateId__Group__3__Impl6643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemplateArgumentList__Group__0__Impl_in_rule__TemplateArgumentList__Group__06684 = new BitSet(new long[]{0x0000000000000000L,0x0000000042000000L});
    public static final BitSet FOLLOW_rule__TemplateArgumentList__Group__1_in_rule__TemplateArgumentList__Group__06687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplateArgument_in_rule__TemplateArgumentList__Group__0__Impl6714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemplateArgumentList__Group__1__Impl_in_rule__TemplateArgumentList__Group__16743 = new BitSet(new long[]{0x0000000000000000L,0x0000000042000000L});
    public static final BitSet FOLLOW_rule__TemplateArgumentList__Group__2_in_rule__TemplateArgumentList__Group__16746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_rule__TemplateArgumentList__Group__1__Impl6775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemplateArgumentList__Group__2__Impl_in_rule__TemplateArgumentList__Group__26808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemplateArgumentList__Group_2__0_in_rule__TemplateArgumentList__Group__2__Impl6835 = new BitSet(new long[]{0x0000000000000002L,0x0000000002000000L});
    public static final BitSet FOLLOW_rule__TemplateArgumentList__Group_2__0__Impl_in_rule__TemplateArgumentList__Group_2__06872 = new BitSet(new long[]{0x000001C000000000L});
    public static final BitSet FOLLOW_rule__TemplateArgumentList__Group_2__1_in_rule__TemplateArgumentList__Group_2__06875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_rule__TemplateArgumentList__Group_2__0__Impl6903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemplateArgumentList__Group_2__1__Impl_in_rule__TemplateArgumentList__Group_2__16934 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_rule__TemplateArgumentList__Group_2__2_in_rule__TemplateArgumentList__Group_2__16937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplateArgument_in_rule__TemplateArgumentList__Group_2__1__Impl6964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemplateArgumentList__Group_2__2__Impl_in_rule__TemplateArgumentList__Group_2__26993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_rule__TemplateArgumentList__Group_2__2__Impl7022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Handler__Group__0__Impl_in_rule__Handler__Group__07067 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_rule__Handler__Group__1_in_rule__Handler__Group__07070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_103_in_rule__Handler__Group__0__Impl7098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Handler__Group__1__Impl_in_rule__Handler__Group__17129 = new BitSet(new long[]{0x0000600000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Handler__Group__2_in_rule__Handler__Group__17132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_104_in_rule__Handler__Group__1__Impl7160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Handler__Group__2__Impl_in_rule__Handler__Group__27191 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_rule__Handler__Group__3_in_rule__Handler__Group__27194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExceptionDeclaration_in_rule__Handler__Group__2__Impl7221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Handler__Group__3__Impl_in_rule__Handler__Group__37250 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_rule__Handler__Group__4_in_rule__Handler__Group__37253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_105_in_rule__Handler__Group__3__Impl7281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Handler__Group__4__Impl_in_rule__Handler__Group__47312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompoundStatement_in_rule__Handler__Group__4__Impl7339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExceptionDeclaration__Group_0__0__Impl_in_rule__ExceptionDeclaration__Group_0__07378 = new BitSet(new long[]{0x0000600000000000L});
    public static final BitSet FOLLOW_rule__ExceptionDeclaration__Group_0__1_in_rule__ExceptionDeclaration__Group_0__07381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeSpecifier_in_rule__ExceptionDeclaration__Group_0__0__Impl7409 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_rule__ExceptionDeclaration__Group_0__1__Impl_in_rule__ExceptionDeclaration__Group_0__17440 = new BitSet(new long[]{0x0001800000000000L});
    public static final BitSet FOLLOW_rule__ExceptionDeclaration__Group_0__2_in_rule__ExceptionDeclaration__Group_0__17443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeSpecifier_in_rule__ExceptionDeclaration__Group_0__1__Impl7473 = new BitSet(new long[]{0x0000600000000002L});
    public static final BitSet FOLLOW_ruleTypeSpecifier_in_rule__ExceptionDeclaration__Group_0__1__Impl7486 = new BitSet(new long[]{0x0000600000000002L});
    public static final BitSet FOLLOW_rule__ExceptionDeclaration__Group_0__2__Impl_in_rule__ExceptionDeclaration__Group_0__27519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExceptionDeclaration__Alternatives_0_2_in_rule__ExceptionDeclaration__Group_0__2__Impl7546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DynamicExceptionSpecification__Group__0__Impl_in_rule__DynamicExceptionSpecification__Group__07583 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_rule__DynamicExceptionSpecification__Group__1_in_rule__DynamicExceptionSpecification__Group__07586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_106_in_rule__DynamicExceptionSpecification__Group__0__Impl7614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DynamicExceptionSpecification__Group__1__Impl_in_rule__DynamicExceptionSpecification__Group__17645 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_rule__DynamicExceptionSpecification__Group__2_in_rule__DynamicExceptionSpecification__Group__17648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_104_in_rule__DynamicExceptionSpecification__Group__1__Impl7676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DynamicExceptionSpecification__Group__2__Impl_in_rule__DynamicExceptionSpecification__Group__27707 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_rule__DynamicExceptionSpecification__Group__3_in_rule__DynamicExceptionSpecification__Group__27710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeIdList_in_rule__DynamicExceptionSpecification__Group__2__Impl7737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DynamicExceptionSpecification__Group__3__Impl_in_rule__DynamicExceptionSpecification__Group__37766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_105_in_rule__DynamicExceptionSpecification__Group__3__Impl7794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NoexceptSpecification__Group__0__Impl_in_rule__NoexceptSpecification__Group__07833 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_rule__NoexceptSpecification__Group__1_in_rule__NoexceptSpecification__Group__07836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_107_in_rule__NoexceptSpecification__Group__0__Impl7864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NoexceptSpecification__Group__1__Impl_in_rule__NoexceptSpecification__Group__17895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NoexceptSpecification__Group_1__0_in_rule__NoexceptSpecification__Group__1__Impl7922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NoexceptSpecification__Group_1__0__Impl_in_rule__NoexceptSpecification__Group_1__07957 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__NoexceptSpecification__Group_1__1_in_rule__NoexceptSpecification__Group_1__07960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_104_in_rule__NoexceptSpecification__Group_1__0__Impl7988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NoexceptSpecification__Group_1__1__Impl_in_rule__NoexceptSpecification__Group_1__18019 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_rule__NoexceptSpecification__Group_1__2_in_rule__NoexceptSpecification__Group_1__18022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantExpression_in_rule__NoexceptSpecification__Group_1__1__Impl8049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NoexceptSpecification__Group_1__2__Impl_in_rule__NoexceptSpecification__Group_1__28078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_105_in_rule__NoexceptSpecification__Group_1__2__Impl8106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleToken_in_rule__Test__ElementsAssignment8148 = new BitSet(new long[]{0x0000000000000002L});

}