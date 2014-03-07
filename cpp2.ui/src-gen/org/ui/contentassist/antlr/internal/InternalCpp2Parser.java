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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_KEYWORD", "RULE_INT", "RULE_CHARACTER_LITERAL", "RULE_FLOATING_LITERAL", "RULE_STRING_LITERAL", "RULE_PREPROCESSING_OP_OR_PUNC", "RULE_ID", "RULE_HEXADECIMAL_DIGIT", "RULE_HEX_QUAD", "RULE_UNIVERSAL_CHARACTER_NAME", "RULE_H_CHAR", "RULE_Q_CHAR", "RULE_HEADER_NAME", "RULE_DIGIT", "RULE_NONDIGIT", "RULE_DECIMAL_LITERAL", "RULE_OCTAL_LITERAL", "RULE_HEXADECIMAL_LITERAL", "RULE_INTEGER_SUFFIX", "RULE_OCTAL_DIGIT", "RULE_C_CHAR", "RULE_ESCAPE_SEQUENCE", "RULE_SIMPLE_ESCAPE_SEQUENCE", "RULE_OCTAL_ESCAPE_SEQUENCE", "RULE_HEXADECIMAL_ESCAPE_SEQUENCE", "RULE_FRACTIONAL_CONSTANT", "RULE_EXPONENT_PART", "RULE_ENC_PREFIX", "RULE_SCHAR", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'DUMMY1'", "'DUMMY2'", "'DUMMY3'", "'DUMMY4'", "'DUMMY5'", "'DUMMY6'", "'true'", "'false'", "'new'", "'delete'", "'+'", "'-'", "'*'", "'/'", "'%'", "'^'", "'&'", "'|'", "'~'", "'!'", "'='", "'<'", "'>'", "'+='", "'-='", "'*='", "'/='", "'%='", "'^='", "'&='", "'|='", "'<<'", "'>>'", "'>>='", "'<<='", "'=='", "'!='", "'<='", "'>='", "'&&'", "'||'", "'++'", "'--'", "','", "'->*'", "'->'", "'()'", "'[]'", "'nullptr'", "'operator'", "'['", "']'", "'\"'", "'class'", "'...'", "'typename'", "'template'"
    };
    public static final int RULE_ID=10;
    public static final int RULE_FLOATING_LITERAL=7;
    public static final int RULE_ANY_OTHER=37;
    public static final int RULE_H_CHAR=14;
    public static final int EOF=-1;
    public static final int T__93=93;
    public static final int T__94=94;
    public static final int RULE_OCTAL_DIGIT=23;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int T__90=90;
    public static final int RULE_KEYWORD=4;
    public static final int RULE_DECIMAL_LITERAL=19;
    public static final int RULE_OCTAL_LITERAL=20;
    public static final int RULE_NONDIGIT=18;
    public static final int RULE_CHARACTER_LITERAL=6;
    public static final int RULE_HEX_QUAD=12;
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
    public static final int T__73=73;
    public static final int RULE_INTEGER_SUFFIX=22;
    public static final int T__79=79;
    public static final int T__78=78;
    public static final int RULE_SIMPLE_ESCAPE_SEQUENCE=26;
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
    public static final int T__59=59;
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

                if ( ((LA1_0>=RULE_KEYWORD && LA1_0<=RULE_PREPROCESSING_OP_OR_PUNC)||(LA1_0>=44 && LA1_0<=45)) ) {
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


    // $ANTLR start "entryRuleConstantExpression"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:408:1: entryRuleConstantExpression : ruleConstantExpression EOF ;
    public final void entryRuleConstantExpression() throws RecognitionException {
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:409:1: ( ruleConstantExpression EOF )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:410:1: ruleConstantExpression EOF
            {
             before(grammarAccess.getConstantExpressionRule()); 
            pushFollow(FOLLOW_ruleConstantExpression_in_entryRuleConstantExpression794);
            ruleConstantExpression();

            state._fsp--;

             after(grammarAccess.getConstantExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstantExpression801); 

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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:417:1: ruleConstantExpression : ( 'DUMMY1' ) ;
    public final void ruleConstantExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:421:2: ( ( 'DUMMY1' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:422:1: ( 'DUMMY1' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:422:1: ( 'DUMMY1' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:423:1: 'DUMMY1'
            {
             before(grammarAccess.getConstantExpressionAccess().getDUMMY1Keyword()); 
            match(input,38,FOLLOW_38_in_ruleConstantExpression828); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:438:1: entryRuleTypeId : ruleTypeId EOF ;
    public final void entryRuleTypeId() throws RecognitionException {
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:439:1: ( ruleTypeId EOF )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:440:1: ruleTypeId EOF
            {
             before(grammarAccess.getTypeIdRule()); 
            pushFollow(FOLLOW_ruleTypeId_in_entryRuleTypeId856);
            ruleTypeId();

            state._fsp--;

             after(grammarAccess.getTypeIdRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeId863); 

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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:447:1: ruleTypeId : ( 'DUMMY2' ) ;
    public final void ruleTypeId() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:451:2: ( ( 'DUMMY2' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:452:1: ( 'DUMMY2' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:452:1: ( 'DUMMY2' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:453:1: 'DUMMY2'
            {
             before(grammarAccess.getTypeIdAccess().getDUMMY2Keyword()); 
            match(input,39,FOLLOW_39_in_ruleTypeId890); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:468:1: entryRuleIdExpression : ruleIdExpression EOF ;
    public final void entryRuleIdExpression() throws RecognitionException {
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:469:1: ( ruleIdExpression EOF )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:470:1: ruleIdExpression EOF
            {
             before(grammarAccess.getIdExpressionRule()); 
            pushFollow(FOLLOW_ruleIdExpression_in_entryRuleIdExpression918);
            ruleIdExpression();

            state._fsp--;

             after(grammarAccess.getIdExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIdExpression925); 

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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:477:1: ruleIdExpression : ( 'DUMMY3' ) ;
    public final void ruleIdExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:481:2: ( ( 'DUMMY3' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:482:1: ( 'DUMMY3' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:482:1: ( 'DUMMY3' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:483:1: 'DUMMY3'
            {
             before(grammarAccess.getIdExpressionAccess().getDUMMY3Keyword()); 
            match(input,40,FOLLOW_40_in_ruleIdExpression952); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:498:1: entryRuleParameterDeclaration : ruleParameterDeclaration EOF ;
    public final void entryRuleParameterDeclaration() throws RecognitionException {
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:499:1: ( ruleParameterDeclaration EOF )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:500:1: ruleParameterDeclaration EOF
            {
             before(grammarAccess.getParameterDeclarationRule()); 
            pushFollow(FOLLOW_ruleParameterDeclaration_in_entryRuleParameterDeclaration980);
            ruleParameterDeclaration();

            state._fsp--;

             after(grammarAccess.getParameterDeclarationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterDeclaration987); 

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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:507:1: ruleParameterDeclaration : ( 'DUMMY4' ) ;
    public final void ruleParameterDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:511:2: ( ( 'DUMMY4' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:512:1: ( 'DUMMY4' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:512:1: ( 'DUMMY4' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:513:1: 'DUMMY4'
            {
             before(grammarAccess.getParameterDeclarationAccess().getDUMMY4Keyword()); 
            match(input,41,FOLLOW_41_in_ruleParameterDeclaration1014); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:528:1: entryRuleDeclaration : ruleDeclaration EOF ;
    public final void entryRuleDeclaration() throws RecognitionException {
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:529:1: ( ruleDeclaration EOF )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:530:1: ruleDeclaration EOF
            {
             before(grammarAccess.getDeclarationRule()); 
            pushFollow(FOLLOW_ruleDeclaration_in_entryRuleDeclaration1042);
            ruleDeclaration();

            state._fsp--;

             after(grammarAccess.getDeclarationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeclaration1049); 

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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:537:1: ruleDeclaration : ( 'DUMMY5' ) ;
    public final void ruleDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:541:2: ( ( 'DUMMY5' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:542:1: ( 'DUMMY5' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:542:1: ( 'DUMMY5' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:543:1: 'DUMMY5'
            {
             before(grammarAccess.getDeclarationAccess().getDUMMY5Keyword()); 
            match(input,42,FOLLOW_42_in_ruleDeclaration1076); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:558:1: entryRuleNestedNameSpecifier : ruleNestedNameSpecifier EOF ;
    public final void entryRuleNestedNameSpecifier() throws RecognitionException {
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:559:1: ( ruleNestedNameSpecifier EOF )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:560:1: ruleNestedNameSpecifier EOF
            {
             before(grammarAccess.getNestedNameSpecifierRule()); 
            pushFollow(FOLLOW_ruleNestedNameSpecifier_in_entryRuleNestedNameSpecifier1104);
            ruleNestedNameSpecifier();

            state._fsp--;

             after(grammarAccess.getNestedNameSpecifierRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNestedNameSpecifier1111); 

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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:567:1: ruleNestedNameSpecifier : ( 'DUMMY6' ) ;
    public final void ruleNestedNameSpecifier() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:571:2: ( ( 'DUMMY6' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:572:1: ( 'DUMMY6' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:572:1: ( 'DUMMY6' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:573:1: 'DUMMY6'
            {
             before(grammarAccess.getNestedNameSpecifierAccess().getDUMMY6Keyword()); 
            match(input,43,FOLLOW_43_in_ruleNestedNameSpecifier1138); 
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


    // $ANTLR start "rule__Token__Alternatives"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:593:1: rule__Token__Alternatives : ( ( RULE_KEYWORD ) | ( ruleLiteral ) | ( ( rule__Token__Group_2__0 ) ) );
    public final void rule__Token__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:597:1: ( ( RULE_KEYWORD ) | ( ruleLiteral ) | ( ( rule__Token__Group_2__0 ) ) )
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
            case 44:
            case 45:
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
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:598:1: ( RULE_KEYWORD )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:598:1: ( RULE_KEYWORD )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:599:1: RULE_KEYWORD
                    {
                     before(grammarAccess.getTokenAccess().getKEYWORDTerminalRuleCall_0()); 
                    match(input,RULE_KEYWORD,FOLLOW_RULE_KEYWORD_in_rule__Token__Alternatives1180); 
                     after(grammarAccess.getTokenAccess().getKEYWORDTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:604:6: ( ruleLiteral )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:604:6: ( ruleLiteral )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:605:1: ruleLiteral
                    {
                     before(grammarAccess.getTokenAccess().getLiteralParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleLiteral_in_rule__Token__Alternatives1197);
                    ruleLiteral();

                    state._fsp--;

                     after(grammarAccess.getTokenAccess().getLiteralParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:610:6: ( ( rule__Token__Group_2__0 ) )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:610:6: ( ( rule__Token__Group_2__0 ) )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:611:1: ( rule__Token__Group_2__0 )
                    {
                     before(grammarAccess.getTokenAccess().getGroup_2()); 
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:612:1: ( rule__Token__Group_2__0 )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:612:2: rule__Token__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Token__Group_2__0_in_rule__Token__Alternatives1214);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:621:1: rule__Literal__Alternatives : ( ( RULE_INT ) | ( RULE_CHARACTER_LITERAL ) | ( RULE_FLOATING_LITERAL ) | ( RULE_STRING_LITERAL ) | ( ( rule__Literal__Group_4__0 ) ) );
    public final void rule__Literal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:625:1: ( ( RULE_INT ) | ( RULE_CHARACTER_LITERAL ) | ( RULE_FLOATING_LITERAL ) | ( RULE_STRING_LITERAL ) | ( ( rule__Literal__Group_4__0 ) ) )
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
            case 44:
            case 45:
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
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:626:1: ( RULE_INT )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:626:1: ( RULE_INT )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:627:1: RULE_INT
                    {
                     before(grammarAccess.getLiteralAccess().getINTTerminalRuleCall_0()); 
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Literal__Alternatives1247); 
                     after(grammarAccess.getLiteralAccess().getINTTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:632:6: ( RULE_CHARACTER_LITERAL )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:632:6: ( RULE_CHARACTER_LITERAL )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:633:1: RULE_CHARACTER_LITERAL
                    {
                     before(grammarAccess.getLiteralAccess().getCHARACTER_LITERALTerminalRuleCall_1()); 
                    match(input,RULE_CHARACTER_LITERAL,FOLLOW_RULE_CHARACTER_LITERAL_in_rule__Literal__Alternatives1264); 
                     after(grammarAccess.getLiteralAccess().getCHARACTER_LITERALTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:638:6: ( RULE_FLOATING_LITERAL )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:638:6: ( RULE_FLOATING_LITERAL )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:639:1: RULE_FLOATING_LITERAL
                    {
                     before(grammarAccess.getLiteralAccess().getFLOATING_LITERALTerminalRuleCall_2()); 
                    match(input,RULE_FLOATING_LITERAL,FOLLOW_RULE_FLOATING_LITERAL_in_rule__Literal__Alternatives1281); 
                     after(grammarAccess.getLiteralAccess().getFLOATING_LITERALTerminalRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:644:6: ( RULE_STRING_LITERAL )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:644:6: ( RULE_STRING_LITERAL )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:645:1: RULE_STRING_LITERAL
                    {
                     before(grammarAccess.getLiteralAccess().getSTRING_LITERALTerminalRuleCall_3()); 
                    match(input,RULE_STRING_LITERAL,FOLLOW_RULE_STRING_LITERAL_in_rule__Literal__Alternatives1298); 
                     after(grammarAccess.getLiteralAccess().getSTRING_LITERALTerminalRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:650:6: ( ( rule__Literal__Group_4__0 ) )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:650:6: ( ( rule__Literal__Group_4__0 ) )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:651:1: ( rule__Literal__Group_4__0 )
                    {
                     before(grammarAccess.getLiteralAccess().getGroup_4()); 
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:652:1: ( rule__Literal__Group_4__0 )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:652:2: rule__Literal__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Literal__Group_4__0_in_rule__Literal__Alternatives1315);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:661:1: rule__Literal__Alternatives_4_0 : ( ( 'true' ) | ( 'false' ) );
    public final void rule__Literal__Alternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:665:1: ( ( 'true' ) | ( 'false' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==44) ) {
                alt4=1;
            }
            else if ( (LA4_0==45) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:666:1: ( 'true' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:666:1: ( 'true' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:667:1: 'true'
                    {
                     before(grammarAccess.getLiteralAccess().getTrueKeyword_4_0_0()); 
                    match(input,44,FOLLOW_44_in_rule__Literal__Alternatives_4_01349); 
                     after(grammarAccess.getLiteralAccess().getTrueKeyword_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:674:6: ( 'false' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:674:6: ( 'false' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:675:1: 'false'
                    {
                     before(grammarAccess.getLiteralAccess().getFalseKeyword_4_0_1()); 
                    match(input,45,FOLLOW_45_in_rule__Literal__Alternatives_4_01369); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:687:1: rule__OverloadableOperator__Alternatives : ( ( 'new' ) | ( 'delete' ) | ( ( rule__OverloadableOperator__Group_2__0 ) ) | ( ( rule__OverloadableOperator__Group_3__0 ) ) | ( '+' ) | ( '-' ) | ( '*' ) | ( '/' ) | ( '%' ) | ( '^' ) | ( '&' ) | ( '|' ) | ( '~' ) | ( '!' ) | ( '=' ) | ( '<' ) | ( '>' ) | ( '+=' ) | ( '-=' ) | ( '*=' ) | ( '/=' ) | ( '%=' ) | ( '^=' ) | ( '&=' ) | ( '|=' ) | ( '<<' ) | ( '>>' ) | ( '>>=' ) | ( '<<=' ) | ( '==' ) | ( '!=' ) | ( '<=' ) | ( '>=' ) | ( '&&' ) | ( '||' ) | ( '++' ) | ( '--' ) | ( ',' ) | ( '->*' ) | ( '->' ) | ( '()' ) | ( '[]' ) );
    public final void rule__OverloadableOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:691:1: ( ( 'new' ) | ( 'delete' ) | ( ( rule__OverloadableOperator__Group_2__0 ) ) | ( ( rule__OverloadableOperator__Group_3__0 ) ) | ( '+' ) | ( '-' ) | ( '*' ) | ( '/' ) | ( '%' ) | ( '^' ) | ( '&' ) | ( '|' ) | ( '~' ) | ( '!' ) | ( '=' ) | ( '<' ) | ( '>' ) | ( '+=' ) | ( '-=' ) | ( '*=' ) | ( '/=' ) | ( '%=' ) | ( '^=' ) | ( '&=' ) | ( '|=' ) | ( '<<' ) | ( '>>' ) | ( '>>=' ) | ( '<<=' ) | ( '==' ) | ( '!=' ) | ( '<=' ) | ( '>=' ) | ( '&&' ) | ( '||' ) | ( '++' ) | ( '--' ) | ( ',' ) | ( '->*' ) | ( '->' ) | ( '()' ) | ( '[]' ) )
            int alt5=42;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:692:1: ( 'new' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:692:1: ( 'new' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:693:1: 'new'
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getNewKeyword_0()); 
                    match(input,46,FOLLOW_46_in_rule__OverloadableOperator__Alternatives1404); 
                     after(grammarAccess.getOverloadableOperatorAccess().getNewKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:700:6: ( 'delete' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:700:6: ( 'delete' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:701:1: 'delete'
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getDeleteKeyword_1()); 
                    match(input,47,FOLLOW_47_in_rule__OverloadableOperator__Alternatives1424); 
                     after(grammarAccess.getOverloadableOperatorAccess().getDeleteKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:708:6: ( ( rule__OverloadableOperator__Group_2__0 ) )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:708:6: ( ( rule__OverloadableOperator__Group_2__0 ) )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:709:1: ( rule__OverloadableOperator__Group_2__0 )
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getGroup_2()); 
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:710:1: ( rule__OverloadableOperator__Group_2__0 )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:710:2: rule__OverloadableOperator__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__OverloadableOperator__Group_2__0_in_rule__OverloadableOperator__Alternatives1443);
                    rule__OverloadableOperator__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getOverloadableOperatorAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:714:6: ( ( rule__OverloadableOperator__Group_3__0 ) )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:714:6: ( ( rule__OverloadableOperator__Group_3__0 ) )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:715:1: ( rule__OverloadableOperator__Group_3__0 )
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getGroup_3()); 
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:716:1: ( rule__OverloadableOperator__Group_3__0 )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:716:2: rule__OverloadableOperator__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__OverloadableOperator__Group_3__0_in_rule__OverloadableOperator__Alternatives1461);
                    rule__OverloadableOperator__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getOverloadableOperatorAccess().getGroup_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:720:6: ( '+' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:720:6: ( '+' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:721:1: '+'
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getPlusSignKeyword_4()); 
                    match(input,48,FOLLOW_48_in_rule__OverloadableOperator__Alternatives1480); 
                     after(grammarAccess.getOverloadableOperatorAccess().getPlusSignKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:728:6: ( '-' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:728:6: ( '-' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:729:1: '-'
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getHyphenMinusKeyword_5()); 
                    match(input,49,FOLLOW_49_in_rule__OverloadableOperator__Alternatives1500); 
                     after(grammarAccess.getOverloadableOperatorAccess().getHyphenMinusKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:736:6: ( '*' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:736:6: ( '*' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:737:1: '*'
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getAsteriskKeyword_6()); 
                    match(input,50,FOLLOW_50_in_rule__OverloadableOperator__Alternatives1520); 
                     after(grammarAccess.getOverloadableOperatorAccess().getAsteriskKeyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:744:6: ( '/' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:744:6: ( '/' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:745:1: '/'
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getSolidusKeyword_7()); 
                    match(input,51,FOLLOW_51_in_rule__OverloadableOperator__Alternatives1540); 
                     after(grammarAccess.getOverloadableOperatorAccess().getSolidusKeyword_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:752:6: ( '%' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:752:6: ( '%' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:753:1: '%'
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getPercentSignKeyword_8()); 
                    match(input,52,FOLLOW_52_in_rule__OverloadableOperator__Alternatives1560); 
                     after(grammarAccess.getOverloadableOperatorAccess().getPercentSignKeyword_8()); 

                    }


                    }
                    break;
                case 10 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:760:6: ( '^' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:760:6: ( '^' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:761:1: '^'
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getCircumflexAccentKeyword_9()); 
                    match(input,53,FOLLOW_53_in_rule__OverloadableOperator__Alternatives1580); 
                     after(grammarAccess.getOverloadableOperatorAccess().getCircumflexAccentKeyword_9()); 

                    }


                    }
                    break;
                case 11 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:768:6: ( '&' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:768:6: ( '&' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:769:1: '&'
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getAmpersandKeyword_10()); 
                    match(input,54,FOLLOW_54_in_rule__OverloadableOperator__Alternatives1600); 
                     after(grammarAccess.getOverloadableOperatorAccess().getAmpersandKeyword_10()); 

                    }


                    }
                    break;
                case 12 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:776:6: ( '|' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:776:6: ( '|' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:777:1: '|'
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getVerticalLineKeyword_11()); 
                    match(input,55,FOLLOW_55_in_rule__OverloadableOperator__Alternatives1620); 
                     after(grammarAccess.getOverloadableOperatorAccess().getVerticalLineKeyword_11()); 

                    }


                    }
                    break;
                case 13 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:784:6: ( '~' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:784:6: ( '~' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:785:1: '~'
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getTildeKeyword_12()); 
                    match(input,56,FOLLOW_56_in_rule__OverloadableOperator__Alternatives1640); 
                     after(grammarAccess.getOverloadableOperatorAccess().getTildeKeyword_12()); 

                    }


                    }
                    break;
                case 14 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:792:6: ( '!' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:792:6: ( '!' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:793:1: '!'
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getExclamationMarkKeyword_13()); 
                    match(input,57,FOLLOW_57_in_rule__OverloadableOperator__Alternatives1660); 
                     after(grammarAccess.getOverloadableOperatorAccess().getExclamationMarkKeyword_13()); 

                    }


                    }
                    break;
                case 15 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:800:6: ( '=' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:800:6: ( '=' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:801:1: '='
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getEqualsSignKeyword_14()); 
                    match(input,58,FOLLOW_58_in_rule__OverloadableOperator__Alternatives1680); 
                     after(grammarAccess.getOverloadableOperatorAccess().getEqualsSignKeyword_14()); 

                    }


                    }
                    break;
                case 16 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:808:6: ( '<' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:808:6: ( '<' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:809:1: '<'
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getLessThanSignKeyword_15()); 
                    match(input,59,FOLLOW_59_in_rule__OverloadableOperator__Alternatives1700); 
                     after(grammarAccess.getOverloadableOperatorAccess().getLessThanSignKeyword_15()); 

                    }


                    }
                    break;
                case 17 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:816:6: ( '>' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:816:6: ( '>' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:817:1: '>'
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getGreaterThanSignKeyword_16()); 
                    match(input,60,FOLLOW_60_in_rule__OverloadableOperator__Alternatives1720); 
                     after(grammarAccess.getOverloadableOperatorAccess().getGreaterThanSignKeyword_16()); 

                    }


                    }
                    break;
                case 18 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:824:6: ( '+=' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:824:6: ( '+=' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:825:1: '+='
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getPlusSignEqualsSignKeyword_17()); 
                    match(input,61,FOLLOW_61_in_rule__OverloadableOperator__Alternatives1740); 
                     after(grammarAccess.getOverloadableOperatorAccess().getPlusSignEqualsSignKeyword_17()); 

                    }


                    }
                    break;
                case 19 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:832:6: ( '-=' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:832:6: ( '-=' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:833:1: '-='
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getHyphenMinusEqualsSignKeyword_18()); 
                    match(input,62,FOLLOW_62_in_rule__OverloadableOperator__Alternatives1760); 
                     after(grammarAccess.getOverloadableOperatorAccess().getHyphenMinusEqualsSignKeyword_18()); 

                    }


                    }
                    break;
                case 20 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:840:6: ( '*=' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:840:6: ( '*=' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:841:1: '*='
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getAsteriskEqualsSignKeyword_19()); 
                    match(input,63,FOLLOW_63_in_rule__OverloadableOperator__Alternatives1780); 
                     after(grammarAccess.getOverloadableOperatorAccess().getAsteriskEqualsSignKeyword_19()); 

                    }


                    }
                    break;
                case 21 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:848:6: ( '/=' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:848:6: ( '/=' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:849:1: '/='
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getSolidusEqualsSignKeyword_20()); 
                    match(input,64,FOLLOW_64_in_rule__OverloadableOperator__Alternatives1800); 
                     after(grammarAccess.getOverloadableOperatorAccess().getSolidusEqualsSignKeyword_20()); 

                    }


                    }
                    break;
                case 22 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:856:6: ( '%=' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:856:6: ( '%=' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:857:1: '%='
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getPercentSignEqualsSignKeyword_21()); 
                    match(input,65,FOLLOW_65_in_rule__OverloadableOperator__Alternatives1820); 
                     after(grammarAccess.getOverloadableOperatorAccess().getPercentSignEqualsSignKeyword_21()); 

                    }


                    }
                    break;
                case 23 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:864:6: ( '^=' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:864:6: ( '^=' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:865:1: '^='
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getCircumflexAccentEqualsSignKeyword_22()); 
                    match(input,66,FOLLOW_66_in_rule__OverloadableOperator__Alternatives1840); 
                     after(grammarAccess.getOverloadableOperatorAccess().getCircumflexAccentEqualsSignKeyword_22()); 

                    }


                    }
                    break;
                case 24 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:872:6: ( '&=' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:872:6: ( '&=' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:873:1: '&='
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getAmpersandEqualsSignKeyword_23()); 
                    match(input,67,FOLLOW_67_in_rule__OverloadableOperator__Alternatives1860); 
                     after(grammarAccess.getOverloadableOperatorAccess().getAmpersandEqualsSignKeyword_23()); 

                    }


                    }
                    break;
                case 25 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:880:6: ( '|=' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:880:6: ( '|=' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:881:1: '|='
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getVerticalLineEqualsSignKeyword_24()); 
                    match(input,68,FOLLOW_68_in_rule__OverloadableOperator__Alternatives1880); 
                     after(grammarAccess.getOverloadableOperatorAccess().getVerticalLineEqualsSignKeyword_24()); 

                    }


                    }
                    break;
                case 26 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:888:6: ( '<<' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:888:6: ( '<<' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:889:1: '<<'
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getLessThanSignLessThanSignKeyword_25()); 
                    match(input,69,FOLLOW_69_in_rule__OverloadableOperator__Alternatives1900); 
                     after(grammarAccess.getOverloadableOperatorAccess().getLessThanSignLessThanSignKeyword_25()); 

                    }


                    }
                    break;
                case 27 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:896:6: ( '>>' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:896:6: ( '>>' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:897:1: '>>'
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getGreaterThanSignGreaterThanSignKeyword_26()); 
                    match(input,70,FOLLOW_70_in_rule__OverloadableOperator__Alternatives1920); 
                     after(grammarAccess.getOverloadableOperatorAccess().getGreaterThanSignGreaterThanSignKeyword_26()); 

                    }


                    }
                    break;
                case 28 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:904:6: ( '>>=' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:904:6: ( '>>=' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:905:1: '>>='
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getGreaterThanSignGreaterThanSignEqualsSignKeyword_27()); 
                    match(input,71,FOLLOW_71_in_rule__OverloadableOperator__Alternatives1940); 
                     after(grammarAccess.getOverloadableOperatorAccess().getGreaterThanSignGreaterThanSignEqualsSignKeyword_27()); 

                    }


                    }
                    break;
                case 29 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:912:6: ( '<<=' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:912:6: ( '<<=' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:913:1: '<<='
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getLessThanSignLessThanSignEqualsSignKeyword_28()); 
                    match(input,72,FOLLOW_72_in_rule__OverloadableOperator__Alternatives1960); 
                     after(grammarAccess.getOverloadableOperatorAccess().getLessThanSignLessThanSignEqualsSignKeyword_28()); 

                    }


                    }
                    break;
                case 30 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:920:6: ( '==' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:920:6: ( '==' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:921:1: '=='
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getEqualsSignEqualsSignKeyword_29()); 
                    match(input,73,FOLLOW_73_in_rule__OverloadableOperator__Alternatives1980); 
                     after(grammarAccess.getOverloadableOperatorAccess().getEqualsSignEqualsSignKeyword_29()); 

                    }


                    }
                    break;
                case 31 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:928:6: ( '!=' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:928:6: ( '!=' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:929:1: '!='
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getExclamationMarkEqualsSignKeyword_30()); 
                    match(input,74,FOLLOW_74_in_rule__OverloadableOperator__Alternatives2000); 
                     after(grammarAccess.getOverloadableOperatorAccess().getExclamationMarkEqualsSignKeyword_30()); 

                    }


                    }
                    break;
                case 32 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:936:6: ( '<=' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:936:6: ( '<=' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:937:1: '<='
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getLessThanSignEqualsSignKeyword_31()); 
                    match(input,75,FOLLOW_75_in_rule__OverloadableOperator__Alternatives2020); 
                     after(grammarAccess.getOverloadableOperatorAccess().getLessThanSignEqualsSignKeyword_31()); 

                    }


                    }
                    break;
                case 33 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:944:6: ( '>=' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:944:6: ( '>=' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:945:1: '>='
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getGreaterThanSignEqualsSignKeyword_32()); 
                    match(input,76,FOLLOW_76_in_rule__OverloadableOperator__Alternatives2040); 
                     after(grammarAccess.getOverloadableOperatorAccess().getGreaterThanSignEqualsSignKeyword_32()); 

                    }


                    }
                    break;
                case 34 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:952:6: ( '&&' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:952:6: ( '&&' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:953:1: '&&'
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getAmpersandAmpersandKeyword_33()); 
                    match(input,77,FOLLOW_77_in_rule__OverloadableOperator__Alternatives2060); 
                     after(grammarAccess.getOverloadableOperatorAccess().getAmpersandAmpersandKeyword_33()); 

                    }


                    }
                    break;
                case 35 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:960:6: ( '||' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:960:6: ( '||' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:961:1: '||'
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getVerticalLineVerticalLineKeyword_34()); 
                    match(input,78,FOLLOW_78_in_rule__OverloadableOperator__Alternatives2080); 
                     after(grammarAccess.getOverloadableOperatorAccess().getVerticalLineVerticalLineKeyword_34()); 

                    }


                    }
                    break;
                case 36 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:968:6: ( '++' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:968:6: ( '++' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:969:1: '++'
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getPlusSignPlusSignKeyword_35()); 
                    match(input,79,FOLLOW_79_in_rule__OverloadableOperator__Alternatives2100); 
                     after(grammarAccess.getOverloadableOperatorAccess().getPlusSignPlusSignKeyword_35()); 

                    }


                    }
                    break;
                case 37 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:976:6: ( '--' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:976:6: ( '--' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:977:1: '--'
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getHyphenMinusHyphenMinusKeyword_36()); 
                    match(input,80,FOLLOW_80_in_rule__OverloadableOperator__Alternatives2120); 
                     after(grammarAccess.getOverloadableOperatorAccess().getHyphenMinusHyphenMinusKeyword_36()); 

                    }


                    }
                    break;
                case 38 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:984:6: ( ',' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:984:6: ( ',' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:985:1: ','
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getCommaKeyword_37()); 
                    match(input,81,FOLLOW_81_in_rule__OverloadableOperator__Alternatives2140); 
                     after(grammarAccess.getOverloadableOperatorAccess().getCommaKeyword_37()); 

                    }


                    }
                    break;
                case 39 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:992:6: ( '->*' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:992:6: ( '->*' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:993:1: '->*'
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getHyphenMinusGreaterThanSignAsteriskKeyword_38()); 
                    match(input,82,FOLLOW_82_in_rule__OverloadableOperator__Alternatives2160); 
                     after(grammarAccess.getOverloadableOperatorAccess().getHyphenMinusGreaterThanSignAsteriskKeyword_38()); 

                    }


                    }
                    break;
                case 40 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1000:6: ( '->' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1000:6: ( '->' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1001:1: '->'
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getHyphenMinusGreaterThanSignKeyword_39()); 
                    match(input,83,FOLLOW_83_in_rule__OverloadableOperator__Alternatives2180); 
                     after(grammarAccess.getOverloadableOperatorAccess().getHyphenMinusGreaterThanSignKeyword_39()); 

                    }


                    }
                    break;
                case 41 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1008:6: ( '()' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1008:6: ( '()' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1009:1: '()'
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getLeftParenthesisRightParenthesisKeyword_40()); 
                    match(input,84,FOLLOW_84_in_rule__OverloadableOperator__Alternatives2200); 
                     after(grammarAccess.getOverloadableOperatorAccess().getLeftParenthesisRightParenthesisKeyword_40()); 

                    }


                    }
                    break;
                case 42 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1016:6: ( '[]' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1016:6: ( '[]' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1017:1: '[]'
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getLeftSquareBracketRightSquareBracketKeyword_41()); 
                    match(input,85,FOLLOW_85_in_rule__OverloadableOperator__Alternatives2220); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1029:1: rule__TemplateParameter__Alternatives : ( ( ruleTypeParameter ) | ( ruleParameterDeclaration ) );
    public final void rule__TemplateParameter__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1033:1: ( ( ruleTypeParameter ) | ( ruleParameterDeclaration ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==91||(LA6_0>=93 && LA6_0<=94)) ) {
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
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1034:1: ( ruleTypeParameter )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1034:1: ( ruleTypeParameter )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1035:1: ruleTypeParameter
                    {
                     before(grammarAccess.getTemplateParameterAccess().getTypeParameterParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleTypeParameter_in_rule__TemplateParameter__Alternatives2254);
                    ruleTypeParameter();

                    state._fsp--;

                     after(grammarAccess.getTemplateParameterAccess().getTypeParameterParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1040:6: ( ruleParameterDeclaration )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1040:6: ( ruleParameterDeclaration )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1041:1: ruleParameterDeclaration
                    {
                     before(grammarAccess.getTemplateParameterAccess().getParameterDeclarationParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleParameterDeclaration_in_rule__TemplateParameter__Alternatives2271);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1051:1: rule__TypeParameter__Alternatives : ( ( ( rule__TypeParameter__Group_0__0 ) ) | ( ( rule__TypeParameter__Group_1__0 ) ) | ( ( rule__TypeParameter__Group_2__0 ) ) );
    public final void rule__TypeParameter__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1055:1: ( ( ( rule__TypeParameter__Group_0__0 ) ) | ( ( rule__TypeParameter__Group_1__0 ) ) | ( ( rule__TypeParameter__Group_2__0 ) ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 91:
                {
                alt7=1;
                }
                break;
            case 93:
                {
                alt7=2;
                }
                break;
            case 94:
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
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1056:1: ( ( rule__TypeParameter__Group_0__0 ) )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1056:1: ( ( rule__TypeParameter__Group_0__0 ) )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1057:1: ( rule__TypeParameter__Group_0__0 )
                    {
                     before(grammarAccess.getTypeParameterAccess().getGroup_0()); 
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1058:1: ( rule__TypeParameter__Group_0__0 )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1058:2: rule__TypeParameter__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__TypeParameter__Group_0__0_in_rule__TypeParameter__Alternatives2303);
                    rule__TypeParameter__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeParameterAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1062:6: ( ( rule__TypeParameter__Group_1__0 ) )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1062:6: ( ( rule__TypeParameter__Group_1__0 ) )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1063:1: ( rule__TypeParameter__Group_1__0 )
                    {
                     before(grammarAccess.getTypeParameterAccess().getGroup_1()); 
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1064:1: ( rule__TypeParameter__Group_1__0 )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1064:2: rule__TypeParameter__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__TypeParameter__Group_1__0_in_rule__TypeParameter__Alternatives2321);
                    rule__TypeParameter__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeParameterAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1068:6: ( ( rule__TypeParameter__Group_2__0 ) )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1068:6: ( ( rule__TypeParameter__Group_2__0 ) )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1069:1: ( rule__TypeParameter__Group_2__0 )
                    {
                     before(grammarAccess.getTypeParameterAccess().getGroup_2()); 
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1070:1: ( rule__TypeParameter__Group_2__0 )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1070:2: rule__TypeParameter__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__TypeParameter__Group_2__0_in_rule__TypeParameter__Alternatives2339);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1079:1: rule__TypeParameter__Alternatives_0_1 : ( ( ( rule__TypeParameter__Group_0_1_0__0 ) ) | ( ( rule__TypeParameter__Group_0_1_1__0 ) ) );
    public final void rule__TypeParameter__Alternatives_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1083:1: ( ( ( rule__TypeParameter__Group_0_1_0__0 ) ) | ( ( rule__TypeParameter__Group_0_1_1__0 ) ) )
            int alt8=2;
            switch ( input.LA(1) ) {
            case EOF:
            case 60:
            case 81:
            case 92:
                {
                alt8=1;
                }
                break;
            case RULE_ID:
                {
                int LA8_2 = input.LA(2);

                if ( (LA8_2==EOF||LA8_2==60||LA8_2==81) ) {
                    alt8=1;
                }
                else if ( (LA8_2==58) ) {
                    alt8=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 2, input);

                    throw nvae;
                }
                }
                break;
            case 58:
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
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1084:1: ( ( rule__TypeParameter__Group_0_1_0__0 ) )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1084:1: ( ( rule__TypeParameter__Group_0_1_0__0 ) )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1085:1: ( rule__TypeParameter__Group_0_1_0__0 )
                    {
                     before(grammarAccess.getTypeParameterAccess().getGroup_0_1_0()); 
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1086:1: ( rule__TypeParameter__Group_0_1_0__0 )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1086:2: rule__TypeParameter__Group_0_1_0__0
                    {
                    pushFollow(FOLLOW_rule__TypeParameter__Group_0_1_0__0_in_rule__TypeParameter__Alternatives_0_12372);
                    rule__TypeParameter__Group_0_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeParameterAccess().getGroup_0_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1090:6: ( ( rule__TypeParameter__Group_0_1_1__0 ) )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1090:6: ( ( rule__TypeParameter__Group_0_1_1__0 ) )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1091:1: ( rule__TypeParameter__Group_0_1_1__0 )
                    {
                     before(grammarAccess.getTypeParameterAccess().getGroup_0_1_1()); 
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1092:1: ( rule__TypeParameter__Group_0_1_1__0 )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1092:2: rule__TypeParameter__Group_0_1_1__0
                    {
                    pushFollow(FOLLOW_rule__TypeParameter__Group_0_1_1__0_in_rule__TypeParameter__Alternatives_0_12390);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1101:1: rule__TypeParameter__Alternatives_1_1 : ( ( ( rule__TypeParameter__Group_1_1_0__0 ) ) | ( ( rule__TypeParameter__Group_1_1_1__0 ) ) );
    public final void rule__TypeParameter__Alternatives_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1105:1: ( ( ( rule__TypeParameter__Group_1_1_0__0 ) ) | ( ( rule__TypeParameter__Group_1_1_1__0 ) ) )
            int alt9=2;
            switch ( input.LA(1) ) {
            case EOF:
            case 60:
            case 81:
            case 92:
                {
                alt9=1;
                }
                break;
            case RULE_ID:
                {
                int LA9_2 = input.LA(2);

                if ( (LA9_2==58) ) {
                    alt9=2;
                }
                else if ( (LA9_2==EOF||LA9_2==60||LA9_2==81) ) {
                    alt9=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 2, input);

                    throw nvae;
                }
                }
                break;
            case 58:
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
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1106:1: ( ( rule__TypeParameter__Group_1_1_0__0 ) )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1106:1: ( ( rule__TypeParameter__Group_1_1_0__0 ) )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1107:1: ( rule__TypeParameter__Group_1_1_0__0 )
                    {
                     before(grammarAccess.getTypeParameterAccess().getGroup_1_1_0()); 
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1108:1: ( rule__TypeParameter__Group_1_1_0__0 )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1108:2: rule__TypeParameter__Group_1_1_0__0
                    {
                    pushFollow(FOLLOW_rule__TypeParameter__Group_1_1_0__0_in_rule__TypeParameter__Alternatives_1_12423);
                    rule__TypeParameter__Group_1_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeParameterAccess().getGroup_1_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1112:6: ( ( rule__TypeParameter__Group_1_1_1__0 ) )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1112:6: ( ( rule__TypeParameter__Group_1_1_1__0 ) )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1113:1: ( rule__TypeParameter__Group_1_1_1__0 )
                    {
                     before(grammarAccess.getTypeParameterAccess().getGroup_1_1_1()); 
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1114:1: ( rule__TypeParameter__Group_1_1_1__0 )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1114:2: rule__TypeParameter__Group_1_1_1__0
                    {
                    pushFollow(FOLLOW_rule__TypeParameter__Group_1_1_1__0_in_rule__TypeParameter__Alternatives_1_12441);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1123:1: rule__TypeParameter__Alternatives_2_5 : ( ( ( rule__TypeParameter__Group_2_5_0__0 ) ) | ( ( rule__TypeParameter__Group_2_5_1__0 ) ) );
    public final void rule__TypeParameter__Alternatives_2_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1127:1: ( ( ( rule__TypeParameter__Group_2_5_0__0 ) ) | ( ( rule__TypeParameter__Group_2_5_1__0 ) ) )
            int alt10=2;
            switch ( input.LA(1) ) {
            case EOF:
            case 60:
            case 81:
            case 92:
                {
                alt10=1;
                }
                break;
            case RULE_ID:
                {
                int LA10_2 = input.LA(2);

                if ( (LA10_2==58) ) {
                    alt10=2;
                }
                else if ( (LA10_2==EOF||LA10_2==60||LA10_2==81) ) {
                    alt10=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 2, input);

                    throw nvae;
                }
                }
                break;
            case 58:
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
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1128:1: ( ( rule__TypeParameter__Group_2_5_0__0 ) )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1128:1: ( ( rule__TypeParameter__Group_2_5_0__0 ) )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1129:1: ( rule__TypeParameter__Group_2_5_0__0 )
                    {
                     before(grammarAccess.getTypeParameterAccess().getGroup_2_5_0()); 
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1130:1: ( rule__TypeParameter__Group_2_5_0__0 )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1130:2: rule__TypeParameter__Group_2_5_0__0
                    {
                    pushFollow(FOLLOW_rule__TypeParameter__Group_2_5_0__0_in_rule__TypeParameter__Alternatives_2_52474);
                    rule__TypeParameter__Group_2_5_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeParameterAccess().getGroup_2_5_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1134:6: ( ( rule__TypeParameter__Group_2_5_1__0 ) )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1134:6: ( ( rule__TypeParameter__Group_2_5_1__0 ) )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1135:1: ( rule__TypeParameter__Group_2_5_1__0 )
                    {
                     before(grammarAccess.getTypeParameterAccess().getGroup_2_5_1()); 
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1136:1: ( rule__TypeParameter__Group_2_5_1__0 )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1136:2: rule__TypeParameter__Group_2_5_1__0
                    {
                    pushFollow(FOLLOW_rule__TypeParameter__Group_2_5_1__0_in_rule__TypeParameter__Alternatives_2_52492);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1146:1: rule__TemplateArgument__Alternatives : ( ( ruleConstantExpression ) | ( ruleTypeId ) | ( ruleIdExpression ) );
    public final void rule__TemplateArgument__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1150:1: ( ( ruleConstantExpression ) | ( ruleTypeId ) | ( ruleIdExpression ) )
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
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1151:1: ( ruleConstantExpression )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1151:1: ( ruleConstantExpression )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1152:1: ruleConstantExpression
                    {
                     before(grammarAccess.getTemplateArgumentAccess().getConstantExpressionParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleConstantExpression_in_rule__TemplateArgument__Alternatives2526);
                    ruleConstantExpression();

                    state._fsp--;

                     after(grammarAccess.getTemplateArgumentAccess().getConstantExpressionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1157:6: ( ruleTypeId )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1157:6: ( ruleTypeId )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1158:1: ruleTypeId
                    {
                     before(grammarAccess.getTemplateArgumentAccess().getTypeIdParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleTypeId_in_rule__TemplateArgument__Alternatives2543);
                    ruleTypeId();

                    state._fsp--;

                     after(grammarAccess.getTemplateArgumentAccess().getTypeIdParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1163:6: ( ruleIdExpression )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1163:6: ( ruleIdExpression )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1164:1: ruleIdExpression
                    {
                     before(grammarAccess.getTemplateArgumentAccess().getIdExpressionParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleIdExpression_in_rule__TemplateArgument__Alternatives2560);
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


    // $ANTLR start "rule__Token__Group_2__0"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1180:1: rule__Token__Group_2__0 : rule__Token__Group_2__0__Impl rule__Token__Group_2__1 ;
    public final void rule__Token__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1184:1: ( rule__Token__Group_2__0__Impl rule__Token__Group_2__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1185:2: rule__Token__Group_2__0__Impl rule__Token__Group_2__1
            {
            pushFollow(FOLLOW_rule__Token__Group_2__0__Impl_in_rule__Token__Group_2__02594);
            rule__Token__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Token__Group_2__1_in_rule__Token__Group_2__02597);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1192:1: rule__Token__Group_2__0__Impl : ( RULE_PREPROCESSING_OP_OR_PUNC ) ;
    public final void rule__Token__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1196:1: ( ( RULE_PREPROCESSING_OP_OR_PUNC ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1197:1: ( RULE_PREPROCESSING_OP_OR_PUNC )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1197:1: ( RULE_PREPROCESSING_OP_OR_PUNC )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1198:1: RULE_PREPROCESSING_OP_OR_PUNC
            {
             before(grammarAccess.getTokenAccess().getPREPROCESSING_OP_OR_PUNCTerminalRuleCall_2_0()); 
            match(input,RULE_PREPROCESSING_OP_OR_PUNC,FOLLOW_RULE_PREPROCESSING_OP_OR_PUNC_in_rule__Token__Group_2__0__Impl2624); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1209:1: rule__Token__Group_2__1 : rule__Token__Group_2__1__Impl ;
    public final void rule__Token__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1213:1: ( rule__Token__Group_2__1__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1214:2: rule__Token__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Token__Group_2__1__Impl_in_rule__Token__Group_2__12653);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1220:1: rule__Token__Group_2__1__Impl : ( RULE_ID ) ;
    public final void rule__Token__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1224:1: ( ( RULE_ID ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1225:1: ( RULE_ID )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1225:1: ( RULE_ID )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1226:1: RULE_ID
            {
             before(grammarAccess.getTokenAccess().getIDTerminalRuleCall_2_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Token__Group_2__1__Impl2680); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1241:1: rule__Literal__Group_4__0 : rule__Literal__Group_4__0__Impl rule__Literal__Group_4__1 ;
    public final void rule__Literal__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1245:1: ( rule__Literal__Group_4__0__Impl rule__Literal__Group_4__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1246:2: rule__Literal__Group_4__0__Impl rule__Literal__Group_4__1
            {
            pushFollow(FOLLOW_rule__Literal__Group_4__0__Impl_in_rule__Literal__Group_4__02713);
            rule__Literal__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Literal__Group_4__1_in_rule__Literal__Group_4__02716);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1253:1: rule__Literal__Group_4__0__Impl : ( ( rule__Literal__Alternatives_4_0 ) ) ;
    public final void rule__Literal__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1257:1: ( ( ( rule__Literal__Alternatives_4_0 ) ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1258:1: ( ( rule__Literal__Alternatives_4_0 ) )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1258:1: ( ( rule__Literal__Alternatives_4_0 ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1259:1: ( rule__Literal__Alternatives_4_0 )
            {
             before(grammarAccess.getLiteralAccess().getAlternatives_4_0()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1260:1: ( rule__Literal__Alternatives_4_0 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1260:2: rule__Literal__Alternatives_4_0
            {
            pushFollow(FOLLOW_rule__Literal__Alternatives_4_0_in_rule__Literal__Group_4__0__Impl2743);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1270:1: rule__Literal__Group_4__1 : rule__Literal__Group_4__1__Impl ;
    public final void rule__Literal__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1274:1: ( rule__Literal__Group_4__1__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1275:2: rule__Literal__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Literal__Group_4__1__Impl_in_rule__Literal__Group_4__12773);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1281:1: rule__Literal__Group_4__1__Impl : ( 'nullptr' ) ;
    public final void rule__Literal__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1285:1: ( ( 'nullptr' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1286:1: ( 'nullptr' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1286:1: ( 'nullptr' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1287:1: 'nullptr'
            {
             before(grammarAccess.getLiteralAccess().getNullptrKeyword_4_1()); 
            match(input,86,FOLLOW_86_in_rule__Literal__Group_4__1__Impl2801); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1304:1: rule__OperatorFunctionId__Group__0 : rule__OperatorFunctionId__Group__0__Impl rule__OperatorFunctionId__Group__1 ;
    public final void rule__OperatorFunctionId__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1308:1: ( rule__OperatorFunctionId__Group__0__Impl rule__OperatorFunctionId__Group__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1309:2: rule__OperatorFunctionId__Group__0__Impl rule__OperatorFunctionId__Group__1
            {
            pushFollow(FOLLOW_rule__OperatorFunctionId__Group__0__Impl_in_rule__OperatorFunctionId__Group__02836);
            rule__OperatorFunctionId__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OperatorFunctionId__Group__1_in_rule__OperatorFunctionId__Group__02839);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1316:1: rule__OperatorFunctionId__Group__0__Impl : ( 'operator' ) ;
    public final void rule__OperatorFunctionId__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1320:1: ( ( 'operator' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1321:1: ( 'operator' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1321:1: ( 'operator' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1322:1: 'operator'
            {
             before(grammarAccess.getOperatorFunctionIdAccess().getOperatorKeyword_0()); 
            match(input,87,FOLLOW_87_in_rule__OperatorFunctionId__Group__0__Impl2867); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1335:1: rule__OperatorFunctionId__Group__1 : rule__OperatorFunctionId__Group__1__Impl rule__OperatorFunctionId__Group__2 ;
    public final void rule__OperatorFunctionId__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1339:1: ( rule__OperatorFunctionId__Group__1__Impl rule__OperatorFunctionId__Group__2 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1340:2: rule__OperatorFunctionId__Group__1__Impl rule__OperatorFunctionId__Group__2
            {
            pushFollow(FOLLOW_rule__OperatorFunctionId__Group__1__Impl_in_rule__OperatorFunctionId__Group__12898);
            rule__OperatorFunctionId__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OperatorFunctionId__Group__2_in_rule__OperatorFunctionId__Group__12901);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1347:1: rule__OperatorFunctionId__Group__1__Impl : ( ruleOverloadableOperator ) ;
    public final void rule__OperatorFunctionId__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1351:1: ( ( ruleOverloadableOperator ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1352:1: ( ruleOverloadableOperator )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1352:1: ( ruleOverloadableOperator )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1353:1: ruleOverloadableOperator
            {
             before(grammarAccess.getOperatorFunctionIdAccess().getOverloadableOperatorParserRuleCall_1()); 
            pushFollow(FOLLOW_ruleOverloadableOperator_in_rule__OperatorFunctionId__Group__1__Impl2928);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1364:1: rule__OperatorFunctionId__Group__2 : rule__OperatorFunctionId__Group__2__Impl ;
    public final void rule__OperatorFunctionId__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1368:1: ( rule__OperatorFunctionId__Group__2__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1369:2: rule__OperatorFunctionId__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__OperatorFunctionId__Group__2__Impl_in_rule__OperatorFunctionId__Group__22957);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1375:1: rule__OperatorFunctionId__Group__2__Impl : ( ( rule__OperatorFunctionId__Group_2__0 )? ) ;
    public final void rule__OperatorFunctionId__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1379:1: ( ( ( rule__OperatorFunctionId__Group_2__0 )? ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1380:1: ( ( rule__OperatorFunctionId__Group_2__0 )? )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1380:1: ( ( rule__OperatorFunctionId__Group_2__0 )? )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1381:1: ( rule__OperatorFunctionId__Group_2__0 )?
            {
             before(grammarAccess.getOperatorFunctionIdAccess().getGroup_2()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1382:1: ( rule__OperatorFunctionId__Group_2__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==59) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1382:2: rule__OperatorFunctionId__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__OperatorFunctionId__Group_2__0_in_rule__OperatorFunctionId__Group__2__Impl2984);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1398:1: rule__OperatorFunctionId__Group_2__0 : rule__OperatorFunctionId__Group_2__0__Impl rule__OperatorFunctionId__Group_2__1 ;
    public final void rule__OperatorFunctionId__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1402:1: ( rule__OperatorFunctionId__Group_2__0__Impl rule__OperatorFunctionId__Group_2__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1403:2: rule__OperatorFunctionId__Group_2__0__Impl rule__OperatorFunctionId__Group_2__1
            {
            pushFollow(FOLLOW_rule__OperatorFunctionId__Group_2__0__Impl_in_rule__OperatorFunctionId__Group_2__03021);
            rule__OperatorFunctionId__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OperatorFunctionId__Group_2__1_in_rule__OperatorFunctionId__Group_2__03024);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1410:1: rule__OperatorFunctionId__Group_2__0__Impl : ( '<' ) ;
    public final void rule__OperatorFunctionId__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1414:1: ( ( '<' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1415:1: ( '<' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1415:1: ( '<' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1416:1: '<'
            {
             before(grammarAccess.getOperatorFunctionIdAccess().getLessThanSignKeyword_2_0()); 
            match(input,59,FOLLOW_59_in_rule__OperatorFunctionId__Group_2__0__Impl3052); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1429:1: rule__OperatorFunctionId__Group_2__1 : rule__OperatorFunctionId__Group_2__1__Impl rule__OperatorFunctionId__Group_2__2 ;
    public final void rule__OperatorFunctionId__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1433:1: ( rule__OperatorFunctionId__Group_2__1__Impl rule__OperatorFunctionId__Group_2__2 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1434:2: rule__OperatorFunctionId__Group_2__1__Impl rule__OperatorFunctionId__Group_2__2
            {
            pushFollow(FOLLOW_rule__OperatorFunctionId__Group_2__1__Impl_in_rule__OperatorFunctionId__Group_2__13083);
            rule__OperatorFunctionId__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OperatorFunctionId__Group_2__2_in_rule__OperatorFunctionId__Group_2__13086);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1441:1: rule__OperatorFunctionId__Group_2__1__Impl : ( ( ruleTemplateArgument )* ) ;
    public final void rule__OperatorFunctionId__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1445:1: ( ( ( ruleTemplateArgument )* ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1446:1: ( ( ruleTemplateArgument )* )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1446:1: ( ( ruleTemplateArgument )* )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1447:1: ( ruleTemplateArgument )*
            {
             before(grammarAccess.getOperatorFunctionIdAccess().getTemplateArgumentParserRuleCall_2_1()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1448:1: ( ruleTemplateArgument )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=38 && LA13_0<=40)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1448:3: ruleTemplateArgument
            	    {
            	    pushFollow(FOLLOW_ruleTemplateArgument_in_rule__OperatorFunctionId__Group_2__1__Impl3114);
            	    ruleTemplateArgument();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1458:1: rule__OperatorFunctionId__Group_2__2 : rule__OperatorFunctionId__Group_2__2__Impl ;
    public final void rule__OperatorFunctionId__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1462:1: ( rule__OperatorFunctionId__Group_2__2__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1463:2: rule__OperatorFunctionId__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__OperatorFunctionId__Group_2__2__Impl_in_rule__OperatorFunctionId__Group_2__23145);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1469:1: rule__OperatorFunctionId__Group_2__2__Impl : ( '>' ) ;
    public final void rule__OperatorFunctionId__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1473:1: ( ( '>' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1474:1: ( '>' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1474:1: ( '>' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1475:1: '>'
            {
             before(grammarAccess.getOperatorFunctionIdAccess().getGreaterThanSignKeyword_2_2()); 
            match(input,60,FOLLOW_60_in_rule__OperatorFunctionId__Group_2__2__Impl3173); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1494:1: rule__OverloadableOperator__Group_2__0 : rule__OverloadableOperator__Group_2__0__Impl rule__OverloadableOperator__Group_2__1 ;
    public final void rule__OverloadableOperator__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1498:1: ( rule__OverloadableOperator__Group_2__0__Impl rule__OverloadableOperator__Group_2__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1499:2: rule__OverloadableOperator__Group_2__0__Impl rule__OverloadableOperator__Group_2__1
            {
            pushFollow(FOLLOW_rule__OverloadableOperator__Group_2__0__Impl_in_rule__OverloadableOperator__Group_2__03210);
            rule__OverloadableOperator__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OverloadableOperator__Group_2__1_in_rule__OverloadableOperator__Group_2__03213);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1506:1: rule__OverloadableOperator__Group_2__0__Impl : ( 'new' ) ;
    public final void rule__OverloadableOperator__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1510:1: ( ( 'new' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1511:1: ( 'new' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1511:1: ( 'new' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1512:1: 'new'
            {
             before(grammarAccess.getOverloadableOperatorAccess().getNewKeyword_2_0()); 
            match(input,46,FOLLOW_46_in_rule__OverloadableOperator__Group_2__0__Impl3241); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1525:1: rule__OverloadableOperator__Group_2__1 : rule__OverloadableOperator__Group_2__1__Impl rule__OverloadableOperator__Group_2__2 ;
    public final void rule__OverloadableOperator__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1529:1: ( rule__OverloadableOperator__Group_2__1__Impl rule__OverloadableOperator__Group_2__2 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1530:2: rule__OverloadableOperator__Group_2__1__Impl rule__OverloadableOperator__Group_2__2
            {
            pushFollow(FOLLOW_rule__OverloadableOperator__Group_2__1__Impl_in_rule__OverloadableOperator__Group_2__13272);
            rule__OverloadableOperator__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OverloadableOperator__Group_2__2_in_rule__OverloadableOperator__Group_2__13275);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1537:1: rule__OverloadableOperator__Group_2__1__Impl : ( '[' ) ;
    public final void rule__OverloadableOperator__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1541:1: ( ( '[' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1542:1: ( '[' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1542:1: ( '[' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1543:1: '['
            {
             before(grammarAccess.getOverloadableOperatorAccess().getLeftSquareBracketKeyword_2_1()); 
            match(input,88,FOLLOW_88_in_rule__OverloadableOperator__Group_2__1__Impl3303); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1556:1: rule__OverloadableOperator__Group_2__2 : rule__OverloadableOperator__Group_2__2__Impl ;
    public final void rule__OverloadableOperator__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1560:1: ( rule__OverloadableOperator__Group_2__2__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1561:2: rule__OverloadableOperator__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__OverloadableOperator__Group_2__2__Impl_in_rule__OverloadableOperator__Group_2__23334);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1567:1: rule__OverloadableOperator__Group_2__2__Impl : ( ']' ) ;
    public final void rule__OverloadableOperator__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1571:1: ( ( ']' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1572:1: ( ']' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1572:1: ( ']' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1573:1: ']'
            {
             before(grammarAccess.getOverloadableOperatorAccess().getRightSquareBracketKeyword_2_2()); 
            match(input,89,FOLLOW_89_in_rule__OverloadableOperator__Group_2__2__Impl3362); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1592:1: rule__OverloadableOperator__Group_3__0 : rule__OverloadableOperator__Group_3__0__Impl rule__OverloadableOperator__Group_3__1 ;
    public final void rule__OverloadableOperator__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1596:1: ( rule__OverloadableOperator__Group_3__0__Impl rule__OverloadableOperator__Group_3__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1597:2: rule__OverloadableOperator__Group_3__0__Impl rule__OverloadableOperator__Group_3__1
            {
            pushFollow(FOLLOW_rule__OverloadableOperator__Group_3__0__Impl_in_rule__OverloadableOperator__Group_3__03399);
            rule__OverloadableOperator__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OverloadableOperator__Group_3__1_in_rule__OverloadableOperator__Group_3__03402);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1604:1: rule__OverloadableOperator__Group_3__0__Impl : ( 'delete' ) ;
    public final void rule__OverloadableOperator__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1608:1: ( ( 'delete' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1609:1: ( 'delete' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1609:1: ( 'delete' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1610:1: 'delete'
            {
             before(grammarAccess.getOverloadableOperatorAccess().getDeleteKeyword_3_0()); 
            match(input,47,FOLLOW_47_in_rule__OverloadableOperator__Group_3__0__Impl3430); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1623:1: rule__OverloadableOperator__Group_3__1 : rule__OverloadableOperator__Group_3__1__Impl rule__OverloadableOperator__Group_3__2 ;
    public final void rule__OverloadableOperator__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1627:1: ( rule__OverloadableOperator__Group_3__1__Impl rule__OverloadableOperator__Group_3__2 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1628:2: rule__OverloadableOperator__Group_3__1__Impl rule__OverloadableOperator__Group_3__2
            {
            pushFollow(FOLLOW_rule__OverloadableOperator__Group_3__1__Impl_in_rule__OverloadableOperator__Group_3__13461);
            rule__OverloadableOperator__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OverloadableOperator__Group_3__2_in_rule__OverloadableOperator__Group_3__13464);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1635:1: rule__OverloadableOperator__Group_3__1__Impl : ( '[' ) ;
    public final void rule__OverloadableOperator__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1639:1: ( ( '[' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1640:1: ( '[' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1640:1: ( '[' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1641:1: '['
            {
             before(grammarAccess.getOverloadableOperatorAccess().getLeftSquareBracketKeyword_3_1()); 
            match(input,88,FOLLOW_88_in_rule__OverloadableOperator__Group_3__1__Impl3492); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1654:1: rule__OverloadableOperator__Group_3__2 : rule__OverloadableOperator__Group_3__2__Impl ;
    public final void rule__OverloadableOperator__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1658:1: ( rule__OverloadableOperator__Group_3__2__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1659:2: rule__OverloadableOperator__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__OverloadableOperator__Group_3__2__Impl_in_rule__OverloadableOperator__Group_3__23523);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1665:1: rule__OverloadableOperator__Group_3__2__Impl : ( ']' ) ;
    public final void rule__OverloadableOperator__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1669:1: ( ( ']' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1670:1: ( ']' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1670:1: ( ']' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1671:1: ']'
            {
             before(grammarAccess.getOverloadableOperatorAccess().getRightSquareBracketKeyword_3_2()); 
            match(input,89,FOLLOW_89_in_rule__OverloadableOperator__Group_3__2__Impl3551); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1690:1: rule__LiteralOperatorId__Group__0 : rule__LiteralOperatorId__Group__0__Impl rule__LiteralOperatorId__Group__1 ;
    public final void rule__LiteralOperatorId__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1694:1: ( rule__LiteralOperatorId__Group__0__Impl rule__LiteralOperatorId__Group__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1695:2: rule__LiteralOperatorId__Group__0__Impl rule__LiteralOperatorId__Group__1
            {
            pushFollow(FOLLOW_rule__LiteralOperatorId__Group__0__Impl_in_rule__LiteralOperatorId__Group__03588);
            rule__LiteralOperatorId__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LiteralOperatorId__Group__1_in_rule__LiteralOperatorId__Group__03591);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1702:1: rule__LiteralOperatorId__Group__0__Impl : ( 'operator' ) ;
    public final void rule__LiteralOperatorId__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1706:1: ( ( 'operator' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1707:1: ( 'operator' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1707:1: ( 'operator' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1708:1: 'operator'
            {
             before(grammarAccess.getLiteralOperatorIdAccess().getOperatorKeyword_0()); 
            match(input,87,FOLLOW_87_in_rule__LiteralOperatorId__Group__0__Impl3619); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1721:1: rule__LiteralOperatorId__Group__1 : rule__LiteralOperatorId__Group__1__Impl rule__LiteralOperatorId__Group__2 ;
    public final void rule__LiteralOperatorId__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1725:1: ( rule__LiteralOperatorId__Group__1__Impl rule__LiteralOperatorId__Group__2 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1726:2: rule__LiteralOperatorId__Group__1__Impl rule__LiteralOperatorId__Group__2
            {
            pushFollow(FOLLOW_rule__LiteralOperatorId__Group__1__Impl_in_rule__LiteralOperatorId__Group__13650);
            rule__LiteralOperatorId__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LiteralOperatorId__Group__2_in_rule__LiteralOperatorId__Group__13653);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1733:1: rule__LiteralOperatorId__Group__1__Impl : ( '\"' ) ;
    public final void rule__LiteralOperatorId__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1737:1: ( ( '\"' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1738:1: ( '\"' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1738:1: ( '\"' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1739:1: '\"'
            {
             before(grammarAccess.getLiteralOperatorIdAccess().getQuotationMarkKeyword_1()); 
            match(input,90,FOLLOW_90_in_rule__LiteralOperatorId__Group__1__Impl3681); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1752:1: rule__LiteralOperatorId__Group__2 : rule__LiteralOperatorId__Group__2__Impl ;
    public final void rule__LiteralOperatorId__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1756:1: ( rule__LiteralOperatorId__Group__2__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1757:2: rule__LiteralOperatorId__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__LiteralOperatorId__Group__2__Impl_in_rule__LiteralOperatorId__Group__23712);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1763:1: rule__LiteralOperatorId__Group__2__Impl : ( '\"' ) ;
    public final void rule__LiteralOperatorId__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1767:1: ( ( '\"' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1768:1: ( '\"' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1768:1: ( '\"' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1769:1: '\"'
            {
             before(grammarAccess.getLiteralOperatorIdAccess().getQuotationMarkKeyword_2()); 
            match(input,90,FOLLOW_90_in_rule__LiteralOperatorId__Group__2__Impl3740); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1789:1: rule__TemplateParameterList__Group__0 : rule__TemplateParameterList__Group__0__Impl rule__TemplateParameterList__Group__1 ;
    public final void rule__TemplateParameterList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1793:1: ( rule__TemplateParameterList__Group__0__Impl rule__TemplateParameterList__Group__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1794:2: rule__TemplateParameterList__Group__0__Impl rule__TemplateParameterList__Group__1
            {
            pushFollow(FOLLOW_rule__TemplateParameterList__Group__0__Impl_in_rule__TemplateParameterList__Group__03778);
            rule__TemplateParameterList__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TemplateParameterList__Group__1_in_rule__TemplateParameterList__Group__03781);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1801:1: rule__TemplateParameterList__Group__0__Impl : ( ruleTemplateParameter ) ;
    public final void rule__TemplateParameterList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1805:1: ( ( ruleTemplateParameter ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1806:1: ( ruleTemplateParameter )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1806:1: ( ruleTemplateParameter )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1807:1: ruleTemplateParameter
            {
             before(grammarAccess.getTemplateParameterListAccess().getTemplateParameterParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleTemplateParameter_in_rule__TemplateParameterList__Group__0__Impl3808);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1818:1: rule__TemplateParameterList__Group__1 : rule__TemplateParameterList__Group__1__Impl ;
    public final void rule__TemplateParameterList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1822:1: ( rule__TemplateParameterList__Group__1__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1823:2: rule__TemplateParameterList__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__TemplateParameterList__Group__1__Impl_in_rule__TemplateParameterList__Group__13837);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1829:1: rule__TemplateParameterList__Group__1__Impl : ( ( rule__TemplateParameterList__Group_1__0 )* ) ;
    public final void rule__TemplateParameterList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1833:1: ( ( ( rule__TemplateParameterList__Group_1__0 )* ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1834:1: ( ( rule__TemplateParameterList__Group_1__0 )* )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1834:1: ( ( rule__TemplateParameterList__Group_1__0 )* )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1835:1: ( rule__TemplateParameterList__Group_1__0 )*
            {
             before(grammarAccess.getTemplateParameterListAccess().getGroup_1()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1836:1: ( rule__TemplateParameterList__Group_1__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==81) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1836:2: rule__TemplateParameterList__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__TemplateParameterList__Group_1__0_in_rule__TemplateParameterList__Group__1__Impl3864);
            	    rule__TemplateParameterList__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1850:1: rule__TemplateParameterList__Group_1__0 : rule__TemplateParameterList__Group_1__0__Impl rule__TemplateParameterList__Group_1__1 ;
    public final void rule__TemplateParameterList__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1854:1: ( rule__TemplateParameterList__Group_1__0__Impl rule__TemplateParameterList__Group_1__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1855:2: rule__TemplateParameterList__Group_1__0__Impl rule__TemplateParameterList__Group_1__1
            {
            pushFollow(FOLLOW_rule__TemplateParameterList__Group_1__0__Impl_in_rule__TemplateParameterList__Group_1__03899);
            rule__TemplateParameterList__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TemplateParameterList__Group_1__1_in_rule__TemplateParameterList__Group_1__03902);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1862:1: rule__TemplateParameterList__Group_1__0__Impl : ( ',' ) ;
    public final void rule__TemplateParameterList__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1866:1: ( ( ',' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1867:1: ( ',' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1867:1: ( ',' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1868:1: ','
            {
             before(grammarAccess.getTemplateParameterListAccess().getCommaKeyword_1_0()); 
            match(input,81,FOLLOW_81_in_rule__TemplateParameterList__Group_1__0__Impl3930); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1881:1: rule__TemplateParameterList__Group_1__1 : rule__TemplateParameterList__Group_1__1__Impl ;
    public final void rule__TemplateParameterList__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1885:1: ( rule__TemplateParameterList__Group_1__1__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1886:2: rule__TemplateParameterList__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__TemplateParameterList__Group_1__1__Impl_in_rule__TemplateParameterList__Group_1__13961);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1892:1: rule__TemplateParameterList__Group_1__1__Impl : ( ruleTemplateParameter ) ;
    public final void rule__TemplateParameterList__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1896:1: ( ( ruleTemplateParameter ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1897:1: ( ruleTemplateParameter )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1897:1: ( ruleTemplateParameter )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1898:1: ruleTemplateParameter
            {
             before(grammarAccess.getTemplateParameterListAccess().getTemplateParameterParserRuleCall_1_1()); 
            pushFollow(FOLLOW_ruleTemplateParameter_in_rule__TemplateParameterList__Group_1__1__Impl3988);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1913:1: rule__TypeParameter__Group_0__0 : rule__TypeParameter__Group_0__0__Impl rule__TypeParameter__Group_0__1 ;
    public final void rule__TypeParameter__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1917:1: ( rule__TypeParameter__Group_0__0__Impl rule__TypeParameter__Group_0__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1918:2: rule__TypeParameter__Group_0__0__Impl rule__TypeParameter__Group_0__1
            {
            pushFollow(FOLLOW_rule__TypeParameter__Group_0__0__Impl_in_rule__TypeParameter__Group_0__04021);
            rule__TypeParameter__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeParameter__Group_0__1_in_rule__TypeParameter__Group_0__04024);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1925:1: rule__TypeParameter__Group_0__0__Impl : ( 'class' ) ;
    public final void rule__TypeParameter__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1929:1: ( ( 'class' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1930:1: ( 'class' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1930:1: ( 'class' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1931:1: 'class'
            {
             before(grammarAccess.getTypeParameterAccess().getClassKeyword_0_0()); 
            match(input,91,FOLLOW_91_in_rule__TypeParameter__Group_0__0__Impl4052); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1944:1: rule__TypeParameter__Group_0__1 : rule__TypeParameter__Group_0__1__Impl ;
    public final void rule__TypeParameter__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1948:1: ( rule__TypeParameter__Group_0__1__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1949:2: rule__TypeParameter__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__TypeParameter__Group_0__1__Impl_in_rule__TypeParameter__Group_0__14083);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1955:1: rule__TypeParameter__Group_0__1__Impl : ( ( rule__TypeParameter__Alternatives_0_1 ) ) ;
    public final void rule__TypeParameter__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1959:1: ( ( ( rule__TypeParameter__Alternatives_0_1 ) ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1960:1: ( ( rule__TypeParameter__Alternatives_0_1 ) )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1960:1: ( ( rule__TypeParameter__Alternatives_0_1 ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1961:1: ( rule__TypeParameter__Alternatives_0_1 )
            {
             before(grammarAccess.getTypeParameterAccess().getAlternatives_0_1()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1962:1: ( rule__TypeParameter__Alternatives_0_1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1962:2: rule__TypeParameter__Alternatives_0_1
            {
            pushFollow(FOLLOW_rule__TypeParameter__Alternatives_0_1_in_rule__TypeParameter__Group_0__1__Impl4110);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1976:1: rule__TypeParameter__Group_0_1_0__0 : rule__TypeParameter__Group_0_1_0__0__Impl rule__TypeParameter__Group_0_1_0__1 ;
    public final void rule__TypeParameter__Group_0_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1980:1: ( rule__TypeParameter__Group_0_1_0__0__Impl rule__TypeParameter__Group_0_1_0__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1981:2: rule__TypeParameter__Group_0_1_0__0__Impl rule__TypeParameter__Group_0_1_0__1
            {
            pushFollow(FOLLOW_rule__TypeParameter__Group_0_1_0__0__Impl_in_rule__TypeParameter__Group_0_1_0__04144);
            rule__TypeParameter__Group_0_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeParameter__Group_0_1_0__1_in_rule__TypeParameter__Group_0_1_0__04147);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1988:1: rule__TypeParameter__Group_0_1_0__0__Impl : ( ( '...' )? ) ;
    public final void rule__TypeParameter__Group_0_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1992:1: ( ( ( '...' )? ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1993:1: ( ( '...' )? )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1993:1: ( ( '...' )? )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1994:1: ( '...' )?
            {
             before(grammarAccess.getTypeParameterAccess().getFullStopFullStopFullStopKeyword_0_1_0_0()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1995:1: ( '...' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==92) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1996:2: '...'
                    {
                    match(input,92,FOLLOW_92_in_rule__TypeParameter__Group_0_1_0__0__Impl4176); 

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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2007:1: rule__TypeParameter__Group_0_1_0__1 : rule__TypeParameter__Group_0_1_0__1__Impl ;
    public final void rule__TypeParameter__Group_0_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2011:1: ( rule__TypeParameter__Group_0_1_0__1__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2012:2: rule__TypeParameter__Group_0_1_0__1__Impl
            {
            pushFollow(FOLLOW_rule__TypeParameter__Group_0_1_0__1__Impl_in_rule__TypeParameter__Group_0_1_0__14209);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2018:1: rule__TypeParameter__Group_0_1_0__1__Impl : ( ( RULE_ID )? ) ;
    public final void rule__TypeParameter__Group_0_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2022:1: ( ( ( RULE_ID )? ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2023:1: ( ( RULE_ID )? )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2023:1: ( ( RULE_ID )? )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2024:1: ( RULE_ID )?
            {
             before(grammarAccess.getTypeParameterAccess().getIDTerminalRuleCall_0_1_0_1()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2025:1: ( RULE_ID )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_ID) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2025:3: RULE_ID
                    {
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TypeParameter__Group_0_1_0__1__Impl4237); 

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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2039:1: rule__TypeParameter__Group_0_1_1__0 : rule__TypeParameter__Group_0_1_1__0__Impl rule__TypeParameter__Group_0_1_1__1 ;
    public final void rule__TypeParameter__Group_0_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2043:1: ( rule__TypeParameter__Group_0_1_1__0__Impl rule__TypeParameter__Group_0_1_1__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2044:2: rule__TypeParameter__Group_0_1_1__0__Impl rule__TypeParameter__Group_0_1_1__1
            {
            pushFollow(FOLLOW_rule__TypeParameter__Group_0_1_1__0__Impl_in_rule__TypeParameter__Group_0_1_1__04272);
            rule__TypeParameter__Group_0_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeParameter__Group_0_1_1__1_in_rule__TypeParameter__Group_0_1_1__04275);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2051:1: rule__TypeParameter__Group_0_1_1__0__Impl : ( ( RULE_ID )? ) ;
    public final void rule__TypeParameter__Group_0_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2055:1: ( ( ( RULE_ID )? ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2056:1: ( ( RULE_ID )? )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2056:1: ( ( RULE_ID )? )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2057:1: ( RULE_ID )?
            {
             before(grammarAccess.getTypeParameterAccess().getIDTerminalRuleCall_0_1_1_0()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2058:1: ( RULE_ID )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_ID) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2058:3: RULE_ID
                    {
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TypeParameter__Group_0_1_1__0__Impl4303); 

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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2068:1: rule__TypeParameter__Group_0_1_1__1 : rule__TypeParameter__Group_0_1_1__1__Impl rule__TypeParameter__Group_0_1_1__2 ;
    public final void rule__TypeParameter__Group_0_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2072:1: ( rule__TypeParameter__Group_0_1_1__1__Impl rule__TypeParameter__Group_0_1_1__2 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2073:2: rule__TypeParameter__Group_0_1_1__1__Impl rule__TypeParameter__Group_0_1_1__2
            {
            pushFollow(FOLLOW_rule__TypeParameter__Group_0_1_1__1__Impl_in_rule__TypeParameter__Group_0_1_1__14334);
            rule__TypeParameter__Group_0_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeParameter__Group_0_1_1__2_in_rule__TypeParameter__Group_0_1_1__14337);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2080:1: rule__TypeParameter__Group_0_1_1__1__Impl : ( '=' ) ;
    public final void rule__TypeParameter__Group_0_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2084:1: ( ( '=' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2085:1: ( '=' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2085:1: ( '=' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2086:1: '='
            {
             before(grammarAccess.getTypeParameterAccess().getEqualsSignKeyword_0_1_1_1()); 
            match(input,58,FOLLOW_58_in_rule__TypeParameter__Group_0_1_1__1__Impl4365); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2099:1: rule__TypeParameter__Group_0_1_1__2 : rule__TypeParameter__Group_0_1_1__2__Impl ;
    public final void rule__TypeParameter__Group_0_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2103:1: ( rule__TypeParameter__Group_0_1_1__2__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2104:2: rule__TypeParameter__Group_0_1_1__2__Impl
            {
            pushFollow(FOLLOW_rule__TypeParameter__Group_0_1_1__2__Impl_in_rule__TypeParameter__Group_0_1_1__24396);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2110:1: rule__TypeParameter__Group_0_1_1__2__Impl : ( ruleTypeId ) ;
    public final void rule__TypeParameter__Group_0_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2114:1: ( ( ruleTypeId ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2115:1: ( ruleTypeId )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2115:1: ( ruleTypeId )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2116:1: ruleTypeId
            {
             before(grammarAccess.getTypeParameterAccess().getTypeIdParserRuleCall_0_1_1_2()); 
            pushFollow(FOLLOW_ruleTypeId_in_rule__TypeParameter__Group_0_1_1__2__Impl4423);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2133:1: rule__TypeParameter__Group_1__0 : rule__TypeParameter__Group_1__0__Impl rule__TypeParameter__Group_1__1 ;
    public final void rule__TypeParameter__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2137:1: ( rule__TypeParameter__Group_1__0__Impl rule__TypeParameter__Group_1__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2138:2: rule__TypeParameter__Group_1__0__Impl rule__TypeParameter__Group_1__1
            {
            pushFollow(FOLLOW_rule__TypeParameter__Group_1__0__Impl_in_rule__TypeParameter__Group_1__04458);
            rule__TypeParameter__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeParameter__Group_1__1_in_rule__TypeParameter__Group_1__04461);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2145:1: rule__TypeParameter__Group_1__0__Impl : ( 'typename' ) ;
    public final void rule__TypeParameter__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2149:1: ( ( 'typename' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2150:1: ( 'typename' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2150:1: ( 'typename' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2151:1: 'typename'
            {
             before(grammarAccess.getTypeParameterAccess().getTypenameKeyword_1_0()); 
            match(input,93,FOLLOW_93_in_rule__TypeParameter__Group_1__0__Impl4489); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2164:1: rule__TypeParameter__Group_1__1 : rule__TypeParameter__Group_1__1__Impl ;
    public final void rule__TypeParameter__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2168:1: ( rule__TypeParameter__Group_1__1__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2169:2: rule__TypeParameter__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__TypeParameter__Group_1__1__Impl_in_rule__TypeParameter__Group_1__14520);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2175:1: rule__TypeParameter__Group_1__1__Impl : ( ( rule__TypeParameter__Alternatives_1_1 ) ) ;
    public final void rule__TypeParameter__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2179:1: ( ( ( rule__TypeParameter__Alternatives_1_1 ) ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2180:1: ( ( rule__TypeParameter__Alternatives_1_1 ) )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2180:1: ( ( rule__TypeParameter__Alternatives_1_1 ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2181:1: ( rule__TypeParameter__Alternatives_1_1 )
            {
             before(grammarAccess.getTypeParameterAccess().getAlternatives_1_1()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2182:1: ( rule__TypeParameter__Alternatives_1_1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2182:2: rule__TypeParameter__Alternatives_1_1
            {
            pushFollow(FOLLOW_rule__TypeParameter__Alternatives_1_1_in_rule__TypeParameter__Group_1__1__Impl4547);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2196:1: rule__TypeParameter__Group_1_1_0__0 : rule__TypeParameter__Group_1_1_0__0__Impl rule__TypeParameter__Group_1_1_0__1 ;
    public final void rule__TypeParameter__Group_1_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2200:1: ( rule__TypeParameter__Group_1_1_0__0__Impl rule__TypeParameter__Group_1_1_0__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2201:2: rule__TypeParameter__Group_1_1_0__0__Impl rule__TypeParameter__Group_1_1_0__1
            {
            pushFollow(FOLLOW_rule__TypeParameter__Group_1_1_0__0__Impl_in_rule__TypeParameter__Group_1_1_0__04581);
            rule__TypeParameter__Group_1_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeParameter__Group_1_1_0__1_in_rule__TypeParameter__Group_1_1_0__04584);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2208:1: rule__TypeParameter__Group_1_1_0__0__Impl : ( ( '...' )? ) ;
    public final void rule__TypeParameter__Group_1_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2212:1: ( ( ( '...' )? ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2213:1: ( ( '...' )? )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2213:1: ( ( '...' )? )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2214:1: ( '...' )?
            {
             before(grammarAccess.getTypeParameterAccess().getFullStopFullStopFullStopKeyword_1_1_0_0()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2215:1: ( '...' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==92) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2216:2: '...'
                    {
                    match(input,92,FOLLOW_92_in_rule__TypeParameter__Group_1_1_0__0__Impl4613); 

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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2227:1: rule__TypeParameter__Group_1_1_0__1 : rule__TypeParameter__Group_1_1_0__1__Impl ;
    public final void rule__TypeParameter__Group_1_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2231:1: ( rule__TypeParameter__Group_1_1_0__1__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2232:2: rule__TypeParameter__Group_1_1_0__1__Impl
            {
            pushFollow(FOLLOW_rule__TypeParameter__Group_1_1_0__1__Impl_in_rule__TypeParameter__Group_1_1_0__14646);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2238:1: rule__TypeParameter__Group_1_1_0__1__Impl : ( ( RULE_ID )? ) ;
    public final void rule__TypeParameter__Group_1_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2242:1: ( ( ( RULE_ID )? ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2243:1: ( ( RULE_ID )? )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2243:1: ( ( RULE_ID )? )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2244:1: ( RULE_ID )?
            {
             before(grammarAccess.getTypeParameterAccess().getIDTerminalRuleCall_1_1_0_1()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2245:1: ( RULE_ID )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_ID) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2245:3: RULE_ID
                    {
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TypeParameter__Group_1_1_0__1__Impl4674); 

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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2259:1: rule__TypeParameter__Group_1_1_1__0 : rule__TypeParameter__Group_1_1_1__0__Impl rule__TypeParameter__Group_1_1_1__1 ;
    public final void rule__TypeParameter__Group_1_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2263:1: ( rule__TypeParameter__Group_1_1_1__0__Impl rule__TypeParameter__Group_1_1_1__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2264:2: rule__TypeParameter__Group_1_1_1__0__Impl rule__TypeParameter__Group_1_1_1__1
            {
            pushFollow(FOLLOW_rule__TypeParameter__Group_1_1_1__0__Impl_in_rule__TypeParameter__Group_1_1_1__04709);
            rule__TypeParameter__Group_1_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeParameter__Group_1_1_1__1_in_rule__TypeParameter__Group_1_1_1__04712);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2271:1: rule__TypeParameter__Group_1_1_1__0__Impl : ( ( RULE_ID )? ) ;
    public final void rule__TypeParameter__Group_1_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2275:1: ( ( ( RULE_ID )? ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2276:1: ( ( RULE_ID )? )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2276:1: ( ( RULE_ID )? )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2277:1: ( RULE_ID )?
            {
             before(grammarAccess.getTypeParameterAccess().getIDTerminalRuleCall_1_1_1_0()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2278:1: ( RULE_ID )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_ID) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2278:3: RULE_ID
                    {
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TypeParameter__Group_1_1_1__0__Impl4740); 

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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2288:1: rule__TypeParameter__Group_1_1_1__1 : rule__TypeParameter__Group_1_1_1__1__Impl rule__TypeParameter__Group_1_1_1__2 ;
    public final void rule__TypeParameter__Group_1_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2292:1: ( rule__TypeParameter__Group_1_1_1__1__Impl rule__TypeParameter__Group_1_1_1__2 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2293:2: rule__TypeParameter__Group_1_1_1__1__Impl rule__TypeParameter__Group_1_1_1__2
            {
            pushFollow(FOLLOW_rule__TypeParameter__Group_1_1_1__1__Impl_in_rule__TypeParameter__Group_1_1_1__14771);
            rule__TypeParameter__Group_1_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeParameter__Group_1_1_1__2_in_rule__TypeParameter__Group_1_1_1__14774);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2300:1: rule__TypeParameter__Group_1_1_1__1__Impl : ( '=' ) ;
    public final void rule__TypeParameter__Group_1_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2304:1: ( ( '=' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2305:1: ( '=' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2305:1: ( '=' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2306:1: '='
            {
             before(grammarAccess.getTypeParameterAccess().getEqualsSignKeyword_1_1_1_1()); 
            match(input,58,FOLLOW_58_in_rule__TypeParameter__Group_1_1_1__1__Impl4802); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2319:1: rule__TypeParameter__Group_1_1_1__2 : rule__TypeParameter__Group_1_1_1__2__Impl ;
    public final void rule__TypeParameter__Group_1_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2323:1: ( rule__TypeParameter__Group_1_1_1__2__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2324:2: rule__TypeParameter__Group_1_1_1__2__Impl
            {
            pushFollow(FOLLOW_rule__TypeParameter__Group_1_1_1__2__Impl_in_rule__TypeParameter__Group_1_1_1__24833);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2330:1: rule__TypeParameter__Group_1_1_1__2__Impl : ( ruleTypeId ) ;
    public final void rule__TypeParameter__Group_1_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2334:1: ( ( ruleTypeId ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2335:1: ( ruleTypeId )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2335:1: ( ruleTypeId )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2336:1: ruleTypeId
            {
             before(grammarAccess.getTypeParameterAccess().getTypeIdParserRuleCall_1_1_1_2()); 
            pushFollow(FOLLOW_ruleTypeId_in_rule__TypeParameter__Group_1_1_1__2__Impl4860);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2353:1: rule__TypeParameter__Group_2__0 : rule__TypeParameter__Group_2__0__Impl rule__TypeParameter__Group_2__1 ;
    public final void rule__TypeParameter__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2357:1: ( rule__TypeParameter__Group_2__0__Impl rule__TypeParameter__Group_2__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2358:2: rule__TypeParameter__Group_2__0__Impl rule__TypeParameter__Group_2__1
            {
            pushFollow(FOLLOW_rule__TypeParameter__Group_2__0__Impl_in_rule__TypeParameter__Group_2__04895);
            rule__TypeParameter__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeParameter__Group_2__1_in_rule__TypeParameter__Group_2__04898);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2365:1: rule__TypeParameter__Group_2__0__Impl : ( 'template' ) ;
    public final void rule__TypeParameter__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2369:1: ( ( 'template' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2370:1: ( 'template' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2370:1: ( 'template' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2371:1: 'template'
            {
             before(grammarAccess.getTypeParameterAccess().getTemplateKeyword_2_0()); 
            match(input,94,FOLLOW_94_in_rule__TypeParameter__Group_2__0__Impl4926); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2384:1: rule__TypeParameter__Group_2__1 : rule__TypeParameter__Group_2__1__Impl rule__TypeParameter__Group_2__2 ;
    public final void rule__TypeParameter__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2388:1: ( rule__TypeParameter__Group_2__1__Impl rule__TypeParameter__Group_2__2 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2389:2: rule__TypeParameter__Group_2__1__Impl rule__TypeParameter__Group_2__2
            {
            pushFollow(FOLLOW_rule__TypeParameter__Group_2__1__Impl_in_rule__TypeParameter__Group_2__14957);
            rule__TypeParameter__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeParameter__Group_2__2_in_rule__TypeParameter__Group_2__14960);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2396:1: rule__TypeParameter__Group_2__1__Impl : ( '<' ) ;
    public final void rule__TypeParameter__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2400:1: ( ( '<' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2401:1: ( '<' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2401:1: ( '<' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2402:1: '<'
            {
             before(grammarAccess.getTypeParameterAccess().getLessThanSignKeyword_2_1()); 
            match(input,59,FOLLOW_59_in_rule__TypeParameter__Group_2__1__Impl4988); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2415:1: rule__TypeParameter__Group_2__2 : rule__TypeParameter__Group_2__2__Impl rule__TypeParameter__Group_2__3 ;
    public final void rule__TypeParameter__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2419:1: ( rule__TypeParameter__Group_2__2__Impl rule__TypeParameter__Group_2__3 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2420:2: rule__TypeParameter__Group_2__2__Impl rule__TypeParameter__Group_2__3
            {
            pushFollow(FOLLOW_rule__TypeParameter__Group_2__2__Impl_in_rule__TypeParameter__Group_2__25019);
            rule__TypeParameter__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeParameter__Group_2__3_in_rule__TypeParameter__Group_2__25022);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2427:1: rule__TypeParameter__Group_2__2__Impl : ( ruleTemplateParameterList ) ;
    public final void rule__TypeParameter__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2431:1: ( ( ruleTemplateParameterList ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2432:1: ( ruleTemplateParameterList )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2432:1: ( ruleTemplateParameterList )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2433:1: ruleTemplateParameterList
            {
             before(grammarAccess.getTypeParameterAccess().getTemplateParameterListParserRuleCall_2_2()); 
            pushFollow(FOLLOW_ruleTemplateParameterList_in_rule__TypeParameter__Group_2__2__Impl5049);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2444:1: rule__TypeParameter__Group_2__3 : rule__TypeParameter__Group_2__3__Impl rule__TypeParameter__Group_2__4 ;
    public final void rule__TypeParameter__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2448:1: ( rule__TypeParameter__Group_2__3__Impl rule__TypeParameter__Group_2__4 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2449:2: rule__TypeParameter__Group_2__3__Impl rule__TypeParameter__Group_2__4
            {
            pushFollow(FOLLOW_rule__TypeParameter__Group_2__3__Impl_in_rule__TypeParameter__Group_2__35078);
            rule__TypeParameter__Group_2__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeParameter__Group_2__4_in_rule__TypeParameter__Group_2__35081);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2456:1: rule__TypeParameter__Group_2__3__Impl : ( '>' ) ;
    public final void rule__TypeParameter__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2460:1: ( ( '>' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2461:1: ( '>' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2461:1: ( '>' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2462:1: '>'
            {
             before(grammarAccess.getTypeParameterAccess().getGreaterThanSignKeyword_2_3()); 
            match(input,60,FOLLOW_60_in_rule__TypeParameter__Group_2__3__Impl5109); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2475:1: rule__TypeParameter__Group_2__4 : rule__TypeParameter__Group_2__4__Impl rule__TypeParameter__Group_2__5 ;
    public final void rule__TypeParameter__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2479:1: ( rule__TypeParameter__Group_2__4__Impl rule__TypeParameter__Group_2__5 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2480:2: rule__TypeParameter__Group_2__4__Impl rule__TypeParameter__Group_2__5
            {
            pushFollow(FOLLOW_rule__TypeParameter__Group_2__4__Impl_in_rule__TypeParameter__Group_2__45140);
            rule__TypeParameter__Group_2__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeParameter__Group_2__5_in_rule__TypeParameter__Group_2__45143);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2487:1: rule__TypeParameter__Group_2__4__Impl : ( 'class' ) ;
    public final void rule__TypeParameter__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2491:1: ( ( 'class' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2492:1: ( 'class' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2492:1: ( 'class' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2493:1: 'class'
            {
             before(grammarAccess.getTypeParameterAccess().getClassKeyword_2_4()); 
            match(input,91,FOLLOW_91_in_rule__TypeParameter__Group_2__4__Impl5171); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2506:1: rule__TypeParameter__Group_2__5 : rule__TypeParameter__Group_2__5__Impl ;
    public final void rule__TypeParameter__Group_2__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2510:1: ( rule__TypeParameter__Group_2__5__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2511:2: rule__TypeParameter__Group_2__5__Impl
            {
            pushFollow(FOLLOW_rule__TypeParameter__Group_2__5__Impl_in_rule__TypeParameter__Group_2__55202);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2517:1: rule__TypeParameter__Group_2__5__Impl : ( ( rule__TypeParameter__Alternatives_2_5 ) ) ;
    public final void rule__TypeParameter__Group_2__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2521:1: ( ( ( rule__TypeParameter__Alternatives_2_5 ) ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2522:1: ( ( rule__TypeParameter__Alternatives_2_5 ) )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2522:1: ( ( rule__TypeParameter__Alternatives_2_5 ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2523:1: ( rule__TypeParameter__Alternatives_2_5 )
            {
             before(grammarAccess.getTypeParameterAccess().getAlternatives_2_5()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2524:1: ( rule__TypeParameter__Alternatives_2_5 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2524:2: rule__TypeParameter__Alternatives_2_5
            {
            pushFollow(FOLLOW_rule__TypeParameter__Alternatives_2_5_in_rule__TypeParameter__Group_2__5__Impl5229);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2546:1: rule__TypeParameter__Group_2_5_0__0 : rule__TypeParameter__Group_2_5_0__0__Impl rule__TypeParameter__Group_2_5_0__1 ;
    public final void rule__TypeParameter__Group_2_5_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2550:1: ( rule__TypeParameter__Group_2_5_0__0__Impl rule__TypeParameter__Group_2_5_0__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2551:2: rule__TypeParameter__Group_2_5_0__0__Impl rule__TypeParameter__Group_2_5_0__1
            {
            pushFollow(FOLLOW_rule__TypeParameter__Group_2_5_0__0__Impl_in_rule__TypeParameter__Group_2_5_0__05271);
            rule__TypeParameter__Group_2_5_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeParameter__Group_2_5_0__1_in_rule__TypeParameter__Group_2_5_0__05274);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2558:1: rule__TypeParameter__Group_2_5_0__0__Impl : ( ( '...' )? ) ;
    public final void rule__TypeParameter__Group_2_5_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2562:1: ( ( ( '...' )? ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2563:1: ( ( '...' )? )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2563:1: ( ( '...' )? )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2564:1: ( '...' )?
            {
             before(grammarAccess.getTypeParameterAccess().getFullStopFullStopFullStopKeyword_2_5_0_0()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2565:1: ( '...' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==92) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2566:2: '...'
                    {
                    match(input,92,FOLLOW_92_in_rule__TypeParameter__Group_2_5_0__0__Impl5303); 

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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2577:1: rule__TypeParameter__Group_2_5_0__1 : rule__TypeParameter__Group_2_5_0__1__Impl ;
    public final void rule__TypeParameter__Group_2_5_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2581:1: ( rule__TypeParameter__Group_2_5_0__1__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2582:2: rule__TypeParameter__Group_2_5_0__1__Impl
            {
            pushFollow(FOLLOW_rule__TypeParameter__Group_2_5_0__1__Impl_in_rule__TypeParameter__Group_2_5_0__15336);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2588:1: rule__TypeParameter__Group_2_5_0__1__Impl : ( ( RULE_ID )? ) ;
    public final void rule__TypeParameter__Group_2_5_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2592:1: ( ( ( RULE_ID )? ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2593:1: ( ( RULE_ID )? )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2593:1: ( ( RULE_ID )? )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2594:1: ( RULE_ID )?
            {
             before(grammarAccess.getTypeParameterAccess().getIDTerminalRuleCall_2_5_0_1()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2595:1: ( RULE_ID )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_ID) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2595:3: RULE_ID
                    {
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TypeParameter__Group_2_5_0__1__Impl5364); 

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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2609:1: rule__TypeParameter__Group_2_5_1__0 : rule__TypeParameter__Group_2_5_1__0__Impl rule__TypeParameter__Group_2_5_1__1 ;
    public final void rule__TypeParameter__Group_2_5_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2613:1: ( rule__TypeParameter__Group_2_5_1__0__Impl rule__TypeParameter__Group_2_5_1__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2614:2: rule__TypeParameter__Group_2_5_1__0__Impl rule__TypeParameter__Group_2_5_1__1
            {
            pushFollow(FOLLOW_rule__TypeParameter__Group_2_5_1__0__Impl_in_rule__TypeParameter__Group_2_5_1__05399);
            rule__TypeParameter__Group_2_5_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeParameter__Group_2_5_1__1_in_rule__TypeParameter__Group_2_5_1__05402);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2621:1: rule__TypeParameter__Group_2_5_1__0__Impl : ( ( RULE_ID )? ) ;
    public final void rule__TypeParameter__Group_2_5_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2625:1: ( ( ( RULE_ID )? ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2626:1: ( ( RULE_ID )? )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2626:1: ( ( RULE_ID )? )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2627:1: ( RULE_ID )?
            {
             before(grammarAccess.getTypeParameterAccess().getIDTerminalRuleCall_2_5_1_0()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2628:1: ( RULE_ID )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_ID) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2628:3: RULE_ID
                    {
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TypeParameter__Group_2_5_1__0__Impl5430); 

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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2638:1: rule__TypeParameter__Group_2_5_1__1 : rule__TypeParameter__Group_2_5_1__1__Impl rule__TypeParameter__Group_2_5_1__2 ;
    public final void rule__TypeParameter__Group_2_5_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2642:1: ( rule__TypeParameter__Group_2_5_1__1__Impl rule__TypeParameter__Group_2_5_1__2 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2643:2: rule__TypeParameter__Group_2_5_1__1__Impl rule__TypeParameter__Group_2_5_1__2
            {
            pushFollow(FOLLOW_rule__TypeParameter__Group_2_5_1__1__Impl_in_rule__TypeParameter__Group_2_5_1__15461);
            rule__TypeParameter__Group_2_5_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeParameter__Group_2_5_1__2_in_rule__TypeParameter__Group_2_5_1__15464);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2650:1: rule__TypeParameter__Group_2_5_1__1__Impl : ( '=' ) ;
    public final void rule__TypeParameter__Group_2_5_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2654:1: ( ( '=' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2655:1: ( '=' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2655:1: ( '=' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2656:1: '='
            {
             before(grammarAccess.getTypeParameterAccess().getEqualsSignKeyword_2_5_1_1()); 
            match(input,58,FOLLOW_58_in_rule__TypeParameter__Group_2_5_1__1__Impl5492); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2669:1: rule__TypeParameter__Group_2_5_1__2 : rule__TypeParameter__Group_2_5_1__2__Impl ;
    public final void rule__TypeParameter__Group_2_5_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2673:1: ( rule__TypeParameter__Group_2_5_1__2__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2674:2: rule__TypeParameter__Group_2_5_1__2__Impl
            {
            pushFollow(FOLLOW_rule__TypeParameter__Group_2_5_1__2__Impl_in_rule__TypeParameter__Group_2_5_1__25523);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2680:1: rule__TypeParameter__Group_2_5_1__2__Impl : ( ruleIdExpression ) ;
    public final void rule__TypeParameter__Group_2_5_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2684:1: ( ( ruleIdExpression ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2685:1: ( ruleIdExpression )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2685:1: ( ruleIdExpression )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2686:1: ruleIdExpression
            {
             before(grammarAccess.getTypeParameterAccess().getIdExpressionParserRuleCall_2_5_1_2()); 
            pushFollow(FOLLOW_ruleIdExpression_in_rule__TypeParameter__Group_2_5_1__2__Impl5550);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2703:1: rule__SimpleTemplateId__Group__0 : rule__SimpleTemplateId__Group__0__Impl rule__SimpleTemplateId__Group__1 ;
    public final void rule__SimpleTemplateId__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2707:1: ( rule__SimpleTemplateId__Group__0__Impl rule__SimpleTemplateId__Group__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2708:2: rule__SimpleTemplateId__Group__0__Impl rule__SimpleTemplateId__Group__1
            {
            pushFollow(FOLLOW_rule__SimpleTemplateId__Group__0__Impl_in_rule__SimpleTemplateId__Group__05585);
            rule__SimpleTemplateId__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleTemplateId__Group__1_in_rule__SimpleTemplateId__Group__05588);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2715:1: rule__SimpleTemplateId__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__SimpleTemplateId__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2719:1: ( ( RULE_ID ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2720:1: ( RULE_ID )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2720:1: ( RULE_ID )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2721:1: RULE_ID
            {
             before(grammarAccess.getSimpleTemplateIdAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SimpleTemplateId__Group__0__Impl5615); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2732:1: rule__SimpleTemplateId__Group__1 : rule__SimpleTemplateId__Group__1__Impl rule__SimpleTemplateId__Group__2 ;
    public final void rule__SimpleTemplateId__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2736:1: ( rule__SimpleTemplateId__Group__1__Impl rule__SimpleTemplateId__Group__2 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2737:2: rule__SimpleTemplateId__Group__1__Impl rule__SimpleTemplateId__Group__2
            {
            pushFollow(FOLLOW_rule__SimpleTemplateId__Group__1__Impl_in_rule__SimpleTemplateId__Group__15644);
            rule__SimpleTemplateId__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleTemplateId__Group__2_in_rule__SimpleTemplateId__Group__15647);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2744:1: rule__SimpleTemplateId__Group__1__Impl : ( '<' ) ;
    public final void rule__SimpleTemplateId__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2748:1: ( ( '<' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2749:1: ( '<' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2749:1: ( '<' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2750:1: '<'
            {
             before(grammarAccess.getSimpleTemplateIdAccess().getLessThanSignKeyword_1()); 
            match(input,59,FOLLOW_59_in_rule__SimpleTemplateId__Group__1__Impl5675); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2763:1: rule__SimpleTemplateId__Group__2 : rule__SimpleTemplateId__Group__2__Impl rule__SimpleTemplateId__Group__3 ;
    public final void rule__SimpleTemplateId__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2767:1: ( rule__SimpleTemplateId__Group__2__Impl rule__SimpleTemplateId__Group__3 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2768:2: rule__SimpleTemplateId__Group__2__Impl rule__SimpleTemplateId__Group__3
            {
            pushFollow(FOLLOW_rule__SimpleTemplateId__Group__2__Impl_in_rule__SimpleTemplateId__Group__25706);
            rule__SimpleTemplateId__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleTemplateId__Group__3_in_rule__SimpleTemplateId__Group__25709);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2775:1: rule__SimpleTemplateId__Group__2__Impl : ( ruleTemplateArgumentList ) ;
    public final void rule__SimpleTemplateId__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2779:1: ( ( ruleTemplateArgumentList ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2780:1: ( ruleTemplateArgumentList )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2780:1: ( ruleTemplateArgumentList )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2781:1: ruleTemplateArgumentList
            {
             before(grammarAccess.getSimpleTemplateIdAccess().getTemplateArgumentListParserRuleCall_2()); 
            pushFollow(FOLLOW_ruleTemplateArgumentList_in_rule__SimpleTemplateId__Group__2__Impl5736);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2792:1: rule__SimpleTemplateId__Group__3 : rule__SimpleTemplateId__Group__3__Impl ;
    public final void rule__SimpleTemplateId__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2796:1: ( rule__SimpleTemplateId__Group__3__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2797:2: rule__SimpleTemplateId__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__SimpleTemplateId__Group__3__Impl_in_rule__SimpleTemplateId__Group__35765);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2803:1: rule__SimpleTemplateId__Group__3__Impl : ( '>' ) ;
    public final void rule__SimpleTemplateId__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2807:1: ( ( '>' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2808:1: ( '>' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2808:1: ( '>' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2809:1: '>'
            {
             before(grammarAccess.getSimpleTemplateIdAccess().getGreaterThanSignKeyword_3()); 
            match(input,60,FOLLOW_60_in_rule__SimpleTemplateId__Group__3__Impl5793); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2832:1: rule__TemplateArgumentList__Group__0 : rule__TemplateArgumentList__Group__0__Impl rule__TemplateArgumentList__Group__1 ;
    public final void rule__TemplateArgumentList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2836:1: ( rule__TemplateArgumentList__Group__0__Impl rule__TemplateArgumentList__Group__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2837:2: rule__TemplateArgumentList__Group__0__Impl rule__TemplateArgumentList__Group__1
            {
            pushFollow(FOLLOW_rule__TemplateArgumentList__Group__0__Impl_in_rule__TemplateArgumentList__Group__05834);
            rule__TemplateArgumentList__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TemplateArgumentList__Group__1_in_rule__TemplateArgumentList__Group__05837);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2844:1: rule__TemplateArgumentList__Group__0__Impl : ( ruleTemplateArgument ) ;
    public final void rule__TemplateArgumentList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2848:1: ( ( ruleTemplateArgument ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2849:1: ( ruleTemplateArgument )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2849:1: ( ruleTemplateArgument )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2850:1: ruleTemplateArgument
            {
             before(grammarAccess.getTemplateArgumentListAccess().getTemplateArgumentParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleTemplateArgument_in_rule__TemplateArgumentList__Group__0__Impl5864);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2861:1: rule__TemplateArgumentList__Group__1 : rule__TemplateArgumentList__Group__1__Impl rule__TemplateArgumentList__Group__2 ;
    public final void rule__TemplateArgumentList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2865:1: ( rule__TemplateArgumentList__Group__1__Impl rule__TemplateArgumentList__Group__2 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2866:2: rule__TemplateArgumentList__Group__1__Impl rule__TemplateArgumentList__Group__2
            {
            pushFollow(FOLLOW_rule__TemplateArgumentList__Group__1__Impl_in_rule__TemplateArgumentList__Group__15893);
            rule__TemplateArgumentList__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TemplateArgumentList__Group__2_in_rule__TemplateArgumentList__Group__15896);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2873:1: rule__TemplateArgumentList__Group__1__Impl : ( ( '...' )? ) ;
    public final void rule__TemplateArgumentList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2877:1: ( ( ( '...' )? ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2878:1: ( ( '...' )? )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2878:1: ( ( '...' )? )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2879:1: ( '...' )?
            {
             before(grammarAccess.getTemplateArgumentListAccess().getFullStopFullStopFullStopKeyword_1()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2880:1: ( '...' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==92) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2881:2: '...'
                    {
                    match(input,92,FOLLOW_92_in_rule__TemplateArgumentList__Group__1__Impl5925); 

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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2892:1: rule__TemplateArgumentList__Group__2 : rule__TemplateArgumentList__Group__2__Impl ;
    public final void rule__TemplateArgumentList__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2896:1: ( rule__TemplateArgumentList__Group__2__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2897:2: rule__TemplateArgumentList__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__TemplateArgumentList__Group__2__Impl_in_rule__TemplateArgumentList__Group__25958);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2903:1: rule__TemplateArgumentList__Group__2__Impl : ( ( rule__TemplateArgumentList__Group_2__0 )* ) ;
    public final void rule__TemplateArgumentList__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2907:1: ( ( ( rule__TemplateArgumentList__Group_2__0 )* ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2908:1: ( ( rule__TemplateArgumentList__Group_2__0 )* )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2908:1: ( ( rule__TemplateArgumentList__Group_2__0 )* )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2909:1: ( rule__TemplateArgumentList__Group_2__0 )*
            {
             before(grammarAccess.getTemplateArgumentListAccess().getGroup_2()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2910:1: ( rule__TemplateArgumentList__Group_2__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==81) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2910:2: rule__TemplateArgumentList__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__TemplateArgumentList__Group_2__0_in_rule__TemplateArgumentList__Group__2__Impl5985);
            	    rule__TemplateArgumentList__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2926:1: rule__TemplateArgumentList__Group_2__0 : rule__TemplateArgumentList__Group_2__0__Impl rule__TemplateArgumentList__Group_2__1 ;
    public final void rule__TemplateArgumentList__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2930:1: ( rule__TemplateArgumentList__Group_2__0__Impl rule__TemplateArgumentList__Group_2__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2931:2: rule__TemplateArgumentList__Group_2__0__Impl rule__TemplateArgumentList__Group_2__1
            {
            pushFollow(FOLLOW_rule__TemplateArgumentList__Group_2__0__Impl_in_rule__TemplateArgumentList__Group_2__06022);
            rule__TemplateArgumentList__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TemplateArgumentList__Group_2__1_in_rule__TemplateArgumentList__Group_2__06025);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2938:1: rule__TemplateArgumentList__Group_2__0__Impl : ( ',' ) ;
    public final void rule__TemplateArgumentList__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2942:1: ( ( ',' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2943:1: ( ',' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2943:1: ( ',' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2944:1: ','
            {
             before(grammarAccess.getTemplateArgumentListAccess().getCommaKeyword_2_0()); 
            match(input,81,FOLLOW_81_in_rule__TemplateArgumentList__Group_2__0__Impl6053); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2957:1: rule__TemplateArgumentList__Group_2__1 : rule__TemplateArgumentList__Group_2__1__Impl rule__TemplateArgumentList__Group_2__2 ;
    public final void rule__TemplateArgumentList__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2961:1: ( rule__TemplateArgumentList__Group_2__1__Impl rule__TemplateArgumentList__Group_2__2 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2962:2: rule__TemplateArgumentList__Group_2__1__Impl rule__TemplateArgumentList__Group_2__2
            {
            pushFollow(FOLLOW_rule__TemplateArgumentList__Group_2__1__Impl_in_rule__TemplateArgumentList__Group_2__16084);
            rule__TemplateArgumentList__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TemplateArgumentList__Group_2__2_in_rule__TemplateArgumentList__Group_2__16087);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2969:1: rule__TemplateArgumentList__Group_2__1__Impl : ( ruleTemplateArgument ) ;
    public final void rule__TemplateArgumentList__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2973:1: ( ( ruleTemplateArgument ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2974:1: ( ruleTemplateArgument )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2974:1: ( ruleTemplateArgument )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2975:1: ruleTemplateArgument
            {
             before(grammarAccess.getTemplateArgumentListAccess().getTemplateArgumentParserRuleCall_2_1()); 
            pushFollow(FOLLOW_ruleTemplateArgument_in_rule__TemplateArgumentList__Group_2__1__Impl6114);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2986:1: rule__TemplateArgumentList__Group_2__2 : rule__TemplateArgumentList__Group_2__2__Impl ;
    public final void rule__TemplateArgumentList__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2990:1: ( rule__TemplateArgumentList__Group_2__2__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2991:2: rule__TemplateArgumentList__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__TemplateArgumentList__Group_2__2__Impl_in_rule__TemplateArgumentList__Group_2__26143);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2997:1: rule__TemplateArgumentList__Group_2__2__Impl : ( ( '...' )? ) ;
    public final void rule__TemplateArgumentList__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3001:1: ( ( ( '...' )? ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3002:1: ( ( '...' )? )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3002:1: ( ( '...' )? )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3003:1: ( '...' )?
            {
             before(grammarAccess.getTemplateArgumentListAccess().getFullStopFullStopFullStopKeyword_2_2()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3004:1: ( '...' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==92) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3005:2: '...'
                    {
                    match(input,92,FOLLOW_92_in_rule__TemplateArgumentList__Group_2__2__Impl6172); 

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


    // $ANTLR start "rule__Test__ElementsAssignment"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3027:1: rule__Test__ElementsAssignment : ( ruleToken ) ;
    public final void rule__Test__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3031:1: ( ( ruleToken ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3032:1: ( ruleToken )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3032:1: ( ruleToken )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3033:1: ruleToken
            {
             before(grammarAccess.getTestAccess().getElementsTokenParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleToken_in_rule__Test__ElementsAssignment6220);
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
        "\1\56\2\73\52\uffff";
    static final String DFA5_maxS =
        "\1\125\2\130\52\uffff";
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
            "\1\51\34\uffff\1\52",
            "\1\53\34\uffff\1\54",
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
            return "687:1: rule__OverloadableOperator__Alternatives : ( ( 'new' ) | ( 'delete' ) | ( ( rule__OverloadableOperator__Group_2__0 ) ) | ( ( rule__OverloadableOperator__Group_3__0 ) ) | ( '+' ) | ( '-' ) | ( '*' ) | ( '/' ) | ( '%' ) | ( '^' ) | ( '&' ) | ( '|' ) | ( '~' ) | ( '!' ) | ( '=' ) | ( '<' ) | ( '>' ) | ( '+=' ) | ( '-=' ) | ( '*=' ) | ( '/=' ) | ( '%=' ) | ( '^=' ) | ( '&=' ) | ( '|=' ) | ( '<<' ) | ( '>>' ) | ( '>>=' ) | ( '<<=' ) | ( '==' ) | ( '!=' ) | ( '<=' ) | ( '>=' ) | ( '&&' ) | ( '||' ) | ( '++' ) | ( '--' ) | ( ',' ) | ( '->*' ) | ( '->' ) | ( '()' ) | ( '[]' ) );";
        }
    }
 

    public static final BitSet FOLLOW_ruleTest_in_entryRuleTest61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTest68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Test__ElementsAssignment_in_ruleTest94 = new BitSet(new long[]{0x00003000000003F2L});
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
    public static final BitSet FOLLOW_ruleConstantExpression_in_entryRuleConstantExpression794 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstantExpression801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleConstantExpression828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeId_in_entryRuleTypeId856 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeId863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleTypeId890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdExpression_in_entryRuleIdExpression918 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIdExpression925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleIdExpression952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterDeclaration_in_entryRuleParameterDeclaration980 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterDeclaration987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleParameterDeclaration1014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_entryRuleDeclaration1042 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeclaration1049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleDeclaration1076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNestedNameSpecifier_in_entryRuleNestedNameSpecifier1104 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNestedNameSpecifier1111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleNestedNameSpecifier1138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_KEYWORD_in_rule__Token__Alternatives1180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_rule__Token__Alternatives1197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Token__Group_2__0_in_rule__Token__Alternatives1214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Literal__Alternatives1247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CHARACTER_LITERAL_in_rule__Literal__Alternatives1264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOATING_LITERAL_in_rule__Literal__Alternatives1281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_LITERAL_in_rule__Literal__Alternatives1298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Group_4__0_in_rule__Literal__Alternatives1315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__Literal__Alternatives_4_01349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__Literal__Alternatives_4_01369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__OverloadableOperator__Alternatives1404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__OverloadableOperator__Alternatives1424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OverloadableOperator__Group_2__0_in_rule__OverloadableOperator__Alternatives1443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OverloadableOperator__Group_3__0_in_rule__OverloadableOperator__Alternatives1461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__OverloadableOperator__Alternatives1480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__OverloadableOperator__Alternatives1500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__OverloadableOperator__Alternatives1520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__OverloadableOperator__Alternatives1540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__OverloadableOperator__Alternatives1560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rule__OverloadableOperator__Alternatives1580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rule__OverloadableOperator__Alternatives1600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rule__OverloadableOperator__Alternatives1620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_rule__OverloadableOperator__Alternatives1640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_rule__OverloadableOperator__Alternatives1660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_rule__OverloadableOperator__Alternatives1680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_rule__OverloadableOperator__Alternatives1700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_rule__OverloadableOperator__Alternatives1720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_rule__OverloadableOperator__Alternatives1740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_rule__OverloadableOperator__Alternatives1760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_rule__OverloadableOperator__Alternatives1780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_rule__OverloadableOperator__Alternatives1800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_rule__OverloadableOperator__Alternatives1820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_rule__OverloadableOperator__Alternatives1840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_rule__OverloadableOperator__Alternatives1860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_rule__OverloadableOperator__Alternatives1880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_rule__OverloadableOperator__Alternatives1900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_rule__OverloadableOperator__Alternatives1920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_rule__OverloadableOperator__Alternatives1940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_rule__OverloadableOperator__Alternatives1960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_rule__OverloadableOperator__Alternatives1980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_rule__OverloadableOperator__Alternatives2000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_rule__OverloadableOperator__Alternatives2020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_rule__OverloadableOperator__Alternatives2040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_rule__OverloadableOperator__Alternatives2060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_rule__OverloadableOperator__Alternatives2080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_rule__OverloadableOperator__Alternatives2100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_rule__OverloadableOperator__Alternatives2120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_rule__OverloadableOperator__Alternatives2140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_rule__OverloadableOperator__Alternatives2160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_rule__OverloadableOperator__Alternatives2180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_rule__OverloadableOperator__Alternatives2200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_rule__OverloadableOperator__Alternatives2220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeParameter_in_rule__TemplateParameter__Alternatives2254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterDeclaration_in_rule__TemplateParameter__Alternatives2271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_0__0_in_rule__TypeParameter__Alternatives2303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_1__0_in_rule__TypeParameter__Alternatives2321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_2__0_in_rule__TypeParameter__Alternatives2339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_0_1_0__0_in_rule__TypeParameter__Alternatives_0_12372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_0_1_1__0_in_rule__TypeParameter__Alternatives_0_12390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_1_1_0__0_in_rule__TypeParameter__Alternatives_1_12423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_1_1_1__0_in_rule__TypeParameter__Alternatives_1_12441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_2_5_0__0_in_rule__TypeParameter__Alternatives_2_52474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_2_5_1__0_in_rule__TypeParameter__Alternatives_2_52492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantExpression_in_rule__TemplateArgument__Alternatives2526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeId_in_rule__TemplateArgument__Alternatives2543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdExpression_in_rule__TemplateArgument__Alternatives2560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Token__Group_2__0__Impl_in_rule__Token__Group_2__02594 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_rule__Token__Group_2__1_in_rule__Token__Group_2__02597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PREPROCESSING_OP_OR_PUNC_in_rule__Token__Group_2__0__Impl2624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Token__Group_2__1__Impl_in_rule__Token__Group_2__12653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Token__Group_2__1__Impl2680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Group_4__0__Impl_in_rule__Literal__Group_4__02713 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Literal__Group_4__1_in_rule__Literal__Group_4__02716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Alternatives_4_0_in_rule__Literal__Group_4__0__Impl2743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Group_4__1__Impl_in_rule__Literal__Group_4__12773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_rule__Literal__Group_4__1__Impl2801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OperatorFunctionId__Group__0__Impl_in_rule__OperatorFunctionId__Group__02836 = new BitSet(new long[]{0xFFFFC00000000000L,0x00000000003FFFFFL});
    public static final BitSet FOLLOW_rule__OperatorFunctionId__Group__1_in_rule__OperatorFunctionId__Group__02839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_rule__OperatorFunctionId__Group__0__Impl2867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OperatorFunctionId__Group__1__Impl_in_rule__OperatorFunctionId__Group__12898 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_rule__OperatorFunctionId__Group__2_in_rule__OperatorFunctionId__Group__12901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOverloadableOperator_in_rule__OperatorFunctionId__Group__1__Impl2928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OperatorFunctionId__Group__2__Impl_in_rule__OperatorFunctionId__Group__22957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OperatorFunctionId__Group_2__0_in_rule__OperatorFunctionId__Group__2__Impl2984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OperatorFunctionId__Group_2__0__Impl_in_rule__OperatorFunctionId__Group_2__03021 = new BitSet(new long[]{0x100001C000000000L});
    public static final BitSet FOLLOW_rule__OperatorFunctionId__Group_2__1_in_rule__OperatorFunctionId__Group_2__03024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_rule__OperatorFunctionId__Group_2__0__Impl3052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OperatorFunctionId__Group_2__1__Impl_in_rule__OperatorFunctionId__Group_2__13083 = new BitSet(new long[]{0x100001C000000000L});
    public static final BitSet FOLLOW_rule__OperatorFunctionId__Group_2__2_in_rule__OperatorFunctionId__Group_2__13086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplateArgument_in_rule__OperatorFunctionId__Group_2__1__Impl3114 = new BitSet(new long[]{0x000001C000000002L});
    public static final BitSet FOLLOW_rule__OperatorFunctionId__Group_2__2__Impl_in_rule__OperatorFunctionId__Group_2__23145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_rule__OperatorFunctionId__Group_2__2__Impl3173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OverloadableOperator__Group_2__0__Impl_in_rule__OverloadableOperator__Group_2__03210 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_rule__OverloadableOperator__Group_2__1_in_rule__OverloadableOperator__Group_2__03213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__OverloadableOperator__Group_2__0__Impl3241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OverloadableOperator__Group_2__1__Impl_in_rule__OverloadableOperator__Group_2__13272 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_rule__OverloadableOperator__Group_2__2_in_rule__OverloadableOperator__Group_2__13275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_rule__OverloadableOperator__Group_2__1__Impl3303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OverloadableOperator__Group_2__2__Impl_in_rule__OverloadableOperator__Group_2__23334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_rule__OverloadableOperator__Group_2__2__Impl3362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OverloadableOperator__Group_3__0__Impl_in_rule__OverloadableOperator__Group_3__03399 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_rule__OverloadableOperator__Group_3__1_in_rule__OverloadableOperator__Group_3__03402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__OverloadableOperator__Group_3__0__Impl3430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OverloadableOperator__Group_3__1__Impl_in_rule__OverloadableOperator__Group_3__13461 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_rule__OverloadableOperator__Group_3__2_in_rule__OverloadableOperator__Group_3__13464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_rule__OverloadableOperator__Group_3__1__Impl3492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OverloadableOperator__Group_3__2__Impl_in_rule__OverloadableOperator__Group_3__23523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_rule__OverloadableOperator__Group_3__2__Impl3551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LiteralOperatorId__Group__0__Impl_in_rule__LiteralOperatorId__Group__03588 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_rule__LiteralOperatorId__Group__1_in_rule__LiteralOperatorId__Group__03591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_rule__LiteralOperatorId__Group__0__Impl3619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LiteralOperatorId__Group__1__Impl_in_rule__LiteralOperatorId__Group__13650 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_rule__LiteralOperatorId__Group__2_in_rule__LiteralOperatorId__Group__13653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_rule__LiteralOperatorId__Group__1__Impl3681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LiteralOperatorId__Group__2__Impl_in_rule__LiteralOperatorId__Group__23712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_rule__LiteralOperatorId__Group__2__Impl3740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemplateParameterList__Group__0__Impl_in_rule__TemplateParameterList__Group__03778 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_rule__TemplateParameterList__Group__1_in_rule__TemplateParameterList__Group__03781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplateParameter_in_rule__TemplateParameterList__Group__0__Impl3808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemplateParameterList__Group__1__Impl_in_rule__TemplateParameterList__Group__13837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemplateParameterList__Group_1__0_in_rule__TemplateParameterList__Group__1__Impl3864 = new BitSet(new long[]{0x0000000000000002L,0x0000000000020000L});
    public static final BitSet FOLLOW_rule__TemplateParameterList__Group_1__0__Impl_in_rule__TemplateParameterList__Group_1__03899 = new BitSet(new long[]{0x0000020000000000L,0x0000000068000000L});
    public static final BitSet FOLLOW_rule__TemplateParameterList__Group_1__1_in_rule__TemplateParameterList__Group_1__03902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_rule__TemplateParameterList__Group_1__0__Impl3930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemplateParameterList__Group_1__1__Impl_in_rule__TemplateParameterList__Group_1__13961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplateParameter_in_rule__TemplateParameterList__Group_1__1__Impl3988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_0__0__Impl_in_rule__TypeParameter__Group_0__04021 = new BitSet(new long[]{0x0400000000000400L,0x0000000010000000L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_0__1_in_rule__TypeParameter__Group_0__04024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_rule__TypeParameter__Group_0__0__Impl4052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_0__1__Impl_in_rule__TypeParameter__Group_0__14083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeParameter__Alternatives_0_1_in_rule__TypeParameter__Group_0__1__Impl4110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_0_1_0__0__Impl_in_rule__TypeParameter__Group_0_1_0__04144 = new BitSet(new long[]{0x0000000000000400L,0x0000000010000000L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_0_1_0__1_in_rule__TypeParameter__Group_0_1_0__04147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_rule__TypeParameter__Group_0_1_0__0__Impl4176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_0_1_0__1__Impl_in_rule__TypeParameter__Group_0_1_0__14209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TypeParameter__Group_0_1_0__1__Impl4237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_0_1_1__0__Impl_in_rule__TypeParameter__Group_0_1_1__04272 = new BitSet(new long[]{0x0400000000000400L,0x0000000010000000L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_0_1_1__1_in_rule__TypeParameter__Group_0_1_1__04275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TypeParameter__Group_0_1_1__0__Impl4303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_0_1_1__1__Impl_in_rule__TypeParameter__Group_0_1_1__14334 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_0_1_1__2_in_rule__TypeParameter__Group_0_1_1__14337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_rule__TypeParameter__Group_0_1_1__1__Impl4365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_0_1_1__2__Impl_in_rule__TypeParameter__Group_0_1_1__24396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeId_in_rule__TypeParameter__Group_0_1_1__2__Impl4423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_1__0__Impl_in_rule__TypeParameter__Group_1__04458 = new BitSet(new long[]{0x0400000000000400L,0x0000000010000000L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_1__1_in_rule__TypeParameter__Group_1__04461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_rule__TypeParameter__Group_1__0__Impl4489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_1__1__Impl_in_rule__TypeParameter__Group_1__14520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeParameter__Alternatives_1_1_in_rule__TypeParameter__Group_1__1__Impl4547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_1_1_0__0__Impl_in_rule__TypeParameter__Group_1_1_0__04581 = new BitSet(new long[]{0x0000000000000400L,0x0000000010000000L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_1_1_0__1_in_rule__TypeParameter__Group_1_1_0__04584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_rule__TypeParameter__Group_1_1_0__0__Impl4613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_1_1_0__1__Impl_in_rule__TypeParameter__Group_1_1_0__14646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TypeParameter__Group_1_1_0__1__Impl4674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_1_1_1__0__Impl_in_rule__TypeParameter__Group_1_1_1__04709 = new BitSet(new long[]{0x0400000000000400L,0x0000000010000000L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_1_1_1__1_in_rule__TypeParameter__Group_1_1_1__04712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TypeParameter__Group_1_1_1__0__Impl4740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_1_1_1__1__Impl_in_rule__TypeParameter__Group_1_1_1__14771 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_1_1_1__2_in_rule__TypeParameter__Group_1_1_1__14774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_rule__TypeParameter__Group_1_1_1__1__Impl4802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_1_1_1__2__Impl_in_rule__TypeParameter__Group_1_1_1__24833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeId_in_rule__TypeParameter__Group_1_1_1__2__Impl4860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_2__0__Impl_in_rule__TypeParameter__Group_2__04895 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_2__1_in_rule__TypeParameter__Group_2__04898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_rule__TypeParameter__Group_2__0__Impl4926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_2__1__Impl_in_rule__TypeParameter__Group_2__14957 = new BitSet(new long[]{0x0000020000000000L,0x0000000068000000L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_2__2_in_rule__TypeParameter__Group_2__14960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_rule__TypeParameter__Group_2__1__Impl4988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_2__2__Impl_in_rule__TypeParameter__Group_2__25019 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_2__3_in_rule__TypeParameter__Group_2__25022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplateParameterList_in_rule__TypeParameter__Group_2__2__Impl5049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_2__3__Impl_in_rule__TypeParameter__Group_2__35078 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_2__4_in_rule__TypeParameter__Group_2__35081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_rule__TypeParameter__Group_2__3__Impl5109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_2__4__Impl_in_rule__TypeParameter__Group_2__45140 = new BitSet(new long[]{0x0400000000000400L,0x0000000010000000L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_2__5_in_rule__TypeParameter__Group_2__45143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_rule__TypeParameter__Group_2__4__Impl5171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_2__5__Impl_in_rule__TypeParameter__Group_2__55202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeParameter__Alternatives_2_5_in_rule__TypeParameter__Group_2__5__Impl5229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_2_5_0__0__Impl_in_rule__TypeParameter__Group_2_5_0__05271 = new BitSet(new long[]{0x0000000000000400L,0x0000000010000000L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_2_5_0__1_in_rule__TypeParameter__Group_2_5_0__05274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_rule__TypeParameter__Group_2_5_0__0__Impl5303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_2_5_0__1__Impl_in_rule__TypeParameter__Group_2_5_0__15336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TypeParameter__Group_2_5_0__1__Impl5364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_2_5_1__0__Impl_in_rule__TypeParameter__Group_2_5_1__05399 = new BitSet(new long[]{0x0400000000000400L,0x0000000010000000L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_2_5_1__1_in_rule__TypeParameter__Group_2_5_1__05402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TypeParameter__Group_2_5_1__0__Impl5430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_2_5_1__1__Impl_in_rule__TypeParameter__Group_2_5_1__15461 = new BitSet(new long[]{0x000001C000000000L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_2_5_1__2_in_rule__TypeParameter__Group_2_5_1__15464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_rule__TypeParameter__Group_2_5_1__1__Impl5492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_2_5_1__2__Impl_in_rule__TypeParameter__Group_2_5_1__25523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdExpression_in_rule__TypeParameter__Group_2_5_1__2__Impl5550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleTemplateId__Group__0__Impl_in_rule__SimpleTemplateId__Group__05585 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_rule__SimpleTemplateId__Group__1_in_rule__SimpleTemplateId__Group__05588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SimpleTemplateId__Group__0__Impl5615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleTemplateId__Group__1__Impl_in_rule__SimpleTemplateId__Group__15644 = new BitSet(new long[]{0x000001C000000000L});
    public static final BitSet FOLLOW_rule__SimpleTemplateId__Group__2_in_rule__SimpleTemplateId__Group__15647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_rule__SimpleTemplateId__Group__1__Impl5675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleTemplateId__Group__2__Impl_in_rule__SimpleTemplateId__Group__25706 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_rule__SimpleTemplateId__Group__3_in_rule__SimpleTemplateId__Group__25709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplateArgumentList_in_rule__SimpleTemplateId__Group__2__Impl5736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleTemplateId__Group__3__Impl_in_rule__SimpleTemplateId__Group__35765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_rule__SimpleTemplateId__Group__3__Impl5793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemplateArgumentList__Group__0__Impl_in_rule__TemplateArgumentList__Group__05834 = new BitSet(new long[]{0x0000000000000000L,0x0000000010020000L});
    public static final BitSet FOLLOW_rule__TemplateArgumentList__Group__1_in_rule__TemplateArgumentList__Group__05837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplateArgument_in_rule__TemplateArgumentList__Group__0__Impl5864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemplateArgumentList__Group__1__Impl_in_rule__TemplateArgumentList__Group__15893 = new BitSet(new long[]{0x0000000000000000L,0x0000000010020000L});
    public static final BitSet FOLLOW_rule__TemplateArgumentList__Group__2_in_rule__TemplateArgumentList__Group__15896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_rule__TemplateArgumentList__Group__1__Impl5925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemplateArgumentList__Group__2__Impl_in_rule__TemplateArgumentList__Group__25958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemplateArgumentList__Group_2__0_in_rule__TemplateArgumentList__Group__2__Impl5985 = new BitSet(new long[]{0x0000000000000002L,0x0000000000020000L});
    public static final BitSet FOLLOW_rule__TemplateArgumentList__Group_2__0__Impl_in_rule__TemplateArgumentList__Group_2__06022 = new BitSet(new long[]{0x000001C000000000L});
    public static final BitSet FOLLOW_rule__TemplateArgumentList__Group_2__1_in_rule__TemplateArgumentList__Group_2__06025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_rule__TemplateArgumentList__Group_2__0__Impl6053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemplateArgumentList__Group_2__1__Impl_in_rule__TemplateArgumentList__Group_2__16084 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_rule__TemplateArgumentList__Group_2__2_in_rule__TemplateArgumentList__Group_2__16087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplateArgument_in_rule__TemplateArgumentList__Group_2__1__Impl6114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemplateArgumentList__Group_2__2__Impl_in_rule__TemplateArgumentList__Group_2__26143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_rule__TemplateArgumentList__Group_2__2__Impl6172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleToken_in_rule__Test__ElementsAssignment6220 = new BitSet(new long[]{0x0000000000000002L});

}