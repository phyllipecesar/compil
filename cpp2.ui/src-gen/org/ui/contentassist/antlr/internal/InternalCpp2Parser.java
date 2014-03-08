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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_KEYWORD", "RULE_INT", "RULE_CHARACTER_LITERAL", "RULE_FLOATING_LITERAL", "RULE_STRING_LITERAL", "RULE_PREPROCESSING_OP_OR_PUNC", "RULE_ID", "RULE_HEXADECIMAL_DIGIT", "RULE_HEX_QUAD", "RULE_UNIVERSAL_CHARACTER_NAME", "RULE_NONDIGIT", "RULE_DIGIT", "RULE_DECIMAL_LITERAL", "RULE_OCTAL_LITERAL", "RULE_HEXADECIMAL_LITERAL", "RULE_INTEGER_SUFFIX", "RULE_OCTAL_DIGIT", "RULE_C_CHAR", "RULE_ESCAPE_SEQUENCE", "RULE_SIMPLE_ESCAPE_SEQUENCE", "RULE_OCTAL_ESCAPE_SEQUENCE", "RULE_HEXADECIMAL_ESCAPE_SEQUENCE", "RULE_FRACTIONAL_CONSTANT", "RULE_EXPONENT_PART", "RULE_ENC_PREFIX", "RULE_SCHAR", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'ConstantExpression'", "'IdExpression'", "'DeclarationSpecifier'", "'Declaration'", "'NestedNameSpecifier'", "'AssignmentExpression'", "'TypeSpecifier'", "'CompoundStatement'", "'CtorInitializer'", "'TypeIdList'", "'UnqualifiedId'", "'ClassName'", "'Initializer'", "'true'", "'false'", "'const'", "'volatile'", "'&'", "'&&'", "'...'", "'new'", "'delete'", "'+'", "'-'", "'*'", "'/'", "'%'", "'^'", "'|'", "'~'", "'!'", "'='", "'<'", "'>'", "'+='", "'-='", "'*='", "'/='", "'%='", "'^='", "'&='", "'|='", "'<<'", "'>>'", "'>>='", "'<<='", "'=='", "'!='", "'<='", "'>='", "'||'", "'++'", "'--'", "','", "'->*'", "'->'", "'()'", "'[]'", "'class'", "'typename'", "'nullptr'", "'::'", "'['", "']'", "'('", "')'", "'default'", "';'", "'operator'", "'\"'", "'template'", "'try'", "'catch'", "'throw'", "'noexcept'"
    };
    public static final int RULE_ID=10;
    public static final int RULE_FLOATING_LITERAL=7;
    public static final int RULE_ANY_OTHER=34;
    public static final int EOF=-1;
    public static final int T__93=93;
    public static final int RULE_OCTAL_DIGIT=20;
    public static final int T__94=94;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int T__90=90;
    public static final int RULE_KEYWORD=4;
    public static final int RULE_DECIMAL_LITERAL=16;
    public static final int RULE_OCTAL_LITERAL=17;
    public static final int RULE_NONDIGIT=14;
    public static final int T__99=99;
    public static final int T__98=98;
    public static final int T__97=97;
    public static final int RULE_CHARACTER_LITERAL=6;
    public static final int T__96=96;
    public static final int RULE_HEX_QUAD=12;
    public static final int T__95=95;
    public static final int RULE_HEXADECIMAL_LITERAL=18;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_SCHAR=29;
    public static final int RULE_C_CHAR=21;
    public static final int T__85=85;
    public static final int T__84=84;
    public static final int T__87=87;
    public static final int T__86=86;
    public static final int T__89=89;
    public static final int T__88=88;
    public static final int RULE_ML_COMMENT=31;
    public static final int RULE_STRING=30;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int T__70=70;
    public static final int RULE_OCTAL_ESCAPE_SEQUENCE=24;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int RULE_DIGIT=15;
    public static final int T__74=74;
    public static final int RULE_INTEGER_SUFFIX=19;
    public static final int T__73=73;
    public static final int T__79=79;
    public static final int RULE_SIMPLE_ESCAPE_SEQUENCE=23;
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
    public static final int RULE_ESCAPE_SEQUENCE=22;
    public static final int RULE_HEXADECIMAL_ESCAPE_SEQUENCE=25;
    public static final int RULE_ENC_PREFIX=28;
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
    public static final int RULE_STRING_LITERAL=8;
    public static final int RULE_FRACTIONAL_CONSTANT=26;
    public static final int T__107=107;
    public static final int T__108=108;
    public static final int T__109=109;
    public static final int T__59=59;
    public static final int T__103=103;
    public static final int T__104=104;
    public static final int T__105=105;
    public static final int T__106=106;
    public static final int RULE_INT=5;
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
    public static final int RULE_PREPROCESSING_OP_OR_PUNC=9;
    public static final int RULE_SL_COMMENT=32;
    public static final int RULE_HEXADECIMAL_DIGIT=11;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_UNIVERSAL_CHARACTER_NAME=13;
    public static final int RULE_WS=33;

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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:69:1: ruleTest : ( ( rule__Test__ElementsAssignment ) ) ;
    public final void ruleTest() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:73:2: ( ( ( rule__Test__ElementsAssignment ) ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:74:1: ( ( rule__Test__ElementsAssignment ) )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:74:1: ( ( rule__Test__ElementsAssignment ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:75:1: ( rule__Test__ElementsAssignment )
            {
             before(grammarAccess.getTestAccess().getElementsAssignment()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:76:1: ( rule__Test__ElementsAssignment )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:76:2: rule__Test__ElementsAssignment
            {
            pushFollow(FOLLOW_rule__Test__ElementsAssignment_in_ruleTest94);
            rule__Test__ElementsAssignment();

            state._fsp--;


            }

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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:88:1: entryRuleToken : ruleToken EOF ;
    public final void entryRuleToken() throws RecognitionException {
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:89:1: ( ruleToken EOF )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:90:1: ruleToken EOF
            {
             before(grammarAccess.getTokenRule()); 
            pushFollow(FOLLOW_ruleToken_in_entryRuleToken121);
            ruleToken();

            state._fsp--;

             after(grammarAccess.getTokenRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleToken128); 

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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:97:1: ruleToken : ( ( rule__Token__Alternatives ) ) ;
    public final void ruleToken() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:101:2: ( ( ( rule__Token__Alternatives ) ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:102:1: ( ( rule__Token__Alternatives ) )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:102:1: ( ( rule__Token__Alternatives ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:103:1: ( rule__Token__Alternatives )
            {
             before(grammarAccess.getTokenAccess().getAlternatives()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:104:1: ( rule__Token__Alternatives )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:104:2: rule__Token__Alternatives
            {
            pushFollow(FOLLOW_rule__Token__Alternatives_in_ruleToken154);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:116:1: entryRuleLiteral : ruleLiteral EOF ;
    public final void entryRuleLiteral() throws RecognitionException {
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:117:1: ( ruleLiteral EOF )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:118:1: ruleLiteral EOF
            {
             before(grammarAccess.getLiteralRule()); 
            pushFollow(FOLLOW_ruleLiteral_in_entryRuleLiteral181);
            ruleLiteral();

            state._fsp--;

             after(grammarAccess.getLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteral188); 

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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:125:1: ruleLiteral : ( ( rule__Literal__Alternatives ) ) ;
    public final void ruleLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:129:2: ( ( ( rule__Literal__Alternatives ) ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:130:1: ( ( rule__Literal__Alternatives ) )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:130:1: ( ( rule__Literal__Alternatives ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:131:1: ( rule__Literal__Alternatives )
            {
             before(grammarAccess.getLiteralAccess().getAlternatives()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:132:1: ( rule__Literal__Alternatives )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:132:2: rule__Literal__Alternatives
            {
            pushFollow(FOLLOW_rule__Literal__Alternatives_in_ruleLiteral214);
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


    // $ANTLR start "entryRuleNamespaceBody"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:146:1: entryRuleNamespaceBody : ruleNamespaceBody EOF ;
    public final void entryRuleNamespaceBody() throws RecognitionException {
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:147:1: ( ruleNamespaceBody EOF )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:148:1: ruleNamespaceBody EOF
            {
             before(grammarAccess.getNamespaceBodyRule()); 
            pushFollow(FOLLOW_ruleNamespaceBody_in_entryRuleNamespaceBody243);
            ruleNamespaceBody();

            state._fsp--;

             after(grammarAccess.getNamespaceBodyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNamespaceBody250); 

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
    // $ANTLR end "entryRuleNamespaceBody"


    // $ANTLR start "ruleNamespaceBody"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:155:1: ruleNamespaceBody : ( ( ruleDeclaration )* ) ;
    public final void ruleNamespaceBody() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:159:2: ( ( ( ruleDeclaration )* ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:160:1: ( ( ruleDeclaration )* )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:160:1: ( ( ruleDeclaration )* )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:161:1: ( ruleDeclaration )*
            {
             before(grammarAccess.getNamespaceBodyAccess().getDeclarationParserRuleCall()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:162:1: ( ruleDeclaration )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==38) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:162:3: ruleDeclaration
            	    {
            	    pushFollow(FOLLOW_ruleDeclaration_in_ruleNamespaceBody277);
            	    ruleDeclaration();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getNamespaceBodyAccess().getDeclarationParserRuleCall()); 

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
    // $ANTLR end "ruleNamespaceBody"


    // $ANTLR start "entryRuleQualifiedNamespaceSpecifier"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:176:1: entryRuleQualifiedNamespaceSpecifier : ruleQualifiedNamespaceSpecifier EOF ;
    public final void entryRuleQualifiedNamespaceSpecifier() throws RecognitionException {
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:177:1: ( ruleQualifiedNamespaceSpecifier EOF )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:178:1: ruleQualifiedNamespaceSpecifier EOF
            {
             before(grammarAccess.getQualifiedNamespaceSpecifierRule()); 
            pushFollow(FOLLOW_ruleQualifiedNamespaceSpecifier_in_entryRuleQualifiedNamespaceSpecifier307);
            ruleQualifiedNamespaceSpecifier();

            state._fsp--;

             after(grammarAccess.getQualifiedNamespaceSpecifierRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNamespaceSpecifier314); 

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
    // $ANTLR end "entryRuleQualifiedNamespaceSpecifier"


    // $ANTLR start "ruleQualifiedNamespaceSpecifier"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:185:1: ruleQualifiedNamespaceSpecifier : ( ( rule__QualifiedNamespaceSpecifier__Group__0 ) ) ;
    public final void ruleQualifiedNamespaceSpecifier() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:189:2: ( ( ( rule__QualifiedNamespaceSpecifier__Group__0 ) ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:190:1: ( ( rule__QualifiedNamespaceSpecifier__Group__0 ) )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:190:1: ( ( rule__QualifiedNamespaceSpecifier__Group__0 ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:191:1: ( rule__QualifiedNamespaceSpecifier__Group__0 )
            {
             before(grammarAccess.getQualifiedNamespaceSpecifierAccess().getGroup()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:192:1: ( rule__QualifiedNamespaceSpecifier__Group__0 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:192:2: rule__QualifiedNamespaceSpecifier__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedNamespaceSpecifier__Group__0_in_ruleQualifiedNamespaceSpecifier340);
            rule__QualifiedNamespaceSpecifier__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNamespaceSpecifierAccess().getGroup()); 

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
    // $ANTLR end "ruleQualifiedNamespaceSpecifier"


    // $ANTLR start "entryRuleAttributeSpecifier"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:212:1: entryRuleAttributeSpecifier : ruleAttributeSpecifier EOF ;
    public final void entryRuleAttributeSpecifier() throws RecognitionException {
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:213:1: ( ruleAttributeSpecifier EOF )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:214:1: ruleAttributeSpecifier EOF
            {
             before(grammarAccess.getAttributeSpecifierRule()); 
            pushFollow(FOLLOW_ruleAttributeSpecifier_in_entryRuleAttributeSpecifier375);
            ruleAttributeSpecifier();

            state._fsp--;

             after(grammarAccess.getAttributeSpecifierRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributeSpecifier382); 

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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:221:1: ruleAttributeSpecifier : ( ( rule__AttributeSpecifier__Group__0 ) ) ;
    public final void ruleAttributeSpecifier() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:225:2: ( ( ( rule__AttributeSpecifier__Group__0 ) ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:226:1: ( ( rule__AttributeSpecifier__Group__0 ) )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:226:1: ( ( rule__AttributeSpecifier__Group__0 ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:227:1: ( rule__AttributeSpecifier__Group__0 )
            {
             before(grammarAccess.getAttributeSpecifierAccess().getGroup()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:228:1: ( rule__AttributeSpecifier__Group__0 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:228:2: rule__AttributeSpecifier__Group__0
            {
            pushFollow(FOLLOW_rule__AttributeSpecifier__Group__0_in_ruleAttributeSpecifier408);
            rule__AttributeSpecifier__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeSpecifierAccess().getGroup()); 

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


    // $ANTLR start "entryRuleAttributeList"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:240:1: entryRuleAttributeList : ruleAttributeList EOF ;
    public final void entryRuleAttributeList() throws RecognitionException {
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:241:1: ( ruleAttributeList EOF )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:242:1: ruleAttributeList EOF
            {
             before(grammarAccess.getAttributeListRule()); 
            pushFollow(FOLLOW_ruleAttributeList_in_entryRuleAttributeList435);
            ruleAttributeList();

            state._fsp--;

             after(grammarAccess.getAttributeListRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributeList442); 

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
    // $ANTLR end "entryRuleAttributeList"


    // $ANTLR start "ruleAttributeList"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:249:1: ruleAttributeList : ( ( rule__AttributeList__Group__0 ) ) ;
    public final void ruleAttributeList() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:253:2: ( ( ( rule__AttributeList__Group__0 ) ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:254:1: ( ( rule__AttributeList__Group__0 ) )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:254:1: ( ( rule__AttributeList__Group__0 ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:255:1: ( rule__AttributeList__Group__0 )
            {
             before(grammarAccess.getAttributeListAccess().getGroup()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:256:1: ( rule__AttributeList__Group__0 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:256:2: rule__AttributeList__Group__0
            {
            pushFollow(FOLLOW_rule__AttributeList__Group__0_in_ruleAttributeList468);
            rule__AttributeList__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeListAccess().getGroup()); 

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
    // $ANTLR end "ruleAttributeList"


    // $ANTLR start "entryRuleAttribute"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:268:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:269:1: ( ruleAttribute EOF )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:270:1: ruleAttribute EOF
            {
             before(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute495);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute502); 

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
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:277:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:281:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:282:1: ( ( rule__Attribute__Group__0 ) )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:282:1: ( ( rule__Attribute__Group__0 ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:283:1: ( rule__Attribute__Group__0 )
            {
             before(grammarAccess.getAttributeAccess().getGroup()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:284:1: ( rule__Attribute__Group__0 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:284:2: rule__Attribute__Group__0
            {
            pushFollow(FOLLOW_rule__Attribute__Group__0_in_ruleAttribute528);
            rule__Attribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getGroup()); 

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
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleAttributeToken"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:296:1: entryRuleAttributeToken : ruleAttributeToken EOF ;
    public final void entryRuleAttributeToken() throws RecognitionException {
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:297:1: ( ruleAttributeToken EOF )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:298:1: ruleAttributeToken EOF
            {
             before(grammarAccess.getAttributeTokenRule()); 
            pushFollow(FOLLOW_ruleAttributeToken_in_entryRuleAttributeToken555);
            ruleAttributeToken();

            state._fsp--;

             after(grammarAccess.getAttributeTokenRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributeToken562); 

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
    // $ANTLR end "entryRuleAttributeToken"


    // $ANTLR start "ruleAttributeToken"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:305:1: ruleAttributeToken : ( ( rule__AttributeToken__Group__0 ) ) ;
    public final void ruleAttributeToken() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:309:2: ( ( ( rule__AttributeToken__Group__0 ) ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:310:1: ( ( rule__AttributeToken__Group__0 ) )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:310:1: ( ( rule__AttributeToken__Group__0 ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:311:1: ( rule__AttributeToken__Group__0 )
            {
             before(grammarAccess.getAttributeTokenAccess().getGroup()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:312:1: ( rule__AttributeToken__Group__0 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:312:2: rule__AttributeToken__Group__0
            {
            pushFollow(FOLLOW_rule__AttributeToken__Group__0_in_ruleAttributeToken588);
            rule__AttributeToken__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeTokenAccess().getGroup()); 

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
    // $ANTLR end "ruleAttributeToken"


    // $ANTLR start "entryRuleAttributeArgumentClause"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:324:1: entryRuleAttributeArgumentClause : ruleAttributeArgumentClause EOF ;
    public final void entryRuleAttributeArgumentClause() throws RecognitionException {
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:325:1: ( ruleAttributeArgumentClause EOF )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:326:1: ruleAttributeArgumentClause EOF
            {
             before(grammarAccess.getAttributeArgumentClauseRule()); 
            pushFollow(FOLLOW_ruleAttributeArgumentClause_in_entryRuleAttributeArgumentClause615);
            ruleAttributeArgumentClause();

            state._fsp--;

             after(grammarAccess.getAttributeArgumentClauseRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributeArgumentClause622); 

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
    // $ANTLR end "entryRuleAttributeArgumentClause"


    // $ANTLR start "ruleAttributeArgumentClause"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:333:1: ruleAttributeArgumentClause : ( ( rule__AttributeArgumentClause__Group__0 ) ) ;
    public final void ruleAttributeArgumentClause() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:337:2: ( ( ( rule__AttributeArgumentClause__Group__0 ) ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:338:1: ( ( rule__AttributeArgumentClause__Group__0 ) )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:338:1: ( ( rule__AttributeArgumentClause__Group__0 ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:339:1: ( rule__AttributeArgumentClause__Group__0 )
            {
             before(grammarAccess.getAttributeArgumentClauseAccess().getGroup()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:340:1: ( rule__AttributeArgumentClause__Group__0 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:340:2: rule__AttributeArgumentClause__Group__0
            {
            pushFollow(FOLLOW_rule__AttributeArgumentClause__Group__0_in_ruleAttributeArgumentClause648);
            rule__AttributeArgumentClause__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeArgumentClauseAccess().getGroup()); 

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
    // $ANTLR end "ruleAttributeArgumentClause"


    // $ANTLR start "entryRuleInitDeclarator"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:352:1: entryRuleInitDeclarator : ruleInitDeclarator EOF ;
    public final void entryRuleInitDeclarator() throws RecognitionException {
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:353:1: ( ruleInitDeclarator EOF )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:354:1: ruleInitDeclarator EOF
            {
             before(grammarAccess.getInitDeclaratorRule()); 
            pushFollow(FOLLOW_ruleInitDeclarator_in_entryRuleInitDeclarator675);
            ruleInitDeclarator();

            state._fsp--;

             after(grammarAccess.getInitDeclaratorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInitDeclarator682); 

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
    // $ANTLR end "entryRuleInitDeclarator"


    // $ANTLR start "ruleInitDeclarator"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:361:1: ruleInitDeclarator : ( ( rule__InitDeclarator__Group__0 ) ) ;
    public final void ruleInitDeclarator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:365:2: ( ( ( rule__InitDeclarator__Group__0 ) ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:366:1: ( ( rule__InitDeclarator__Group__0 ) )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:366:1: ( ( rule__InitDeclarator__Group__0 ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:367:1: ( rule__InitDeclarator__Group__0 )
            {
             before(grammarAccess.getInitDeclaratorAccess().getGroup()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:368:1: ( rule__InitDeclarator__Group__0 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:368:2: rule__InitDeclarator__Group__0
            {
            pushFollow(FOLLOW_rule__InitDeclarator__Group__0_in_ruleInitDeclarator708);
            rule__InitDeclarator__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInitDeclaratorAccess().getGroup()); 

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
    // $ANTLR end "ruleInitDeclarator"


    // $ANTLR start "entryRuleDeclarator"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:380:1: entryRuleDeclarator : ruleDeclarator EOF ;
    public final void entryRuleDeclarator() throws RecognitionException {
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:381:1: ( ruleDeclarator EOF )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:382:1: ruleDeclarator EOF
            {
             before(grammarAccess.getDeclaratorRule()); 
            pushFollow(FOLLOW_ruleDeclarator_in_entryRuleDeclarator735);
            ruleDeclarator();

            state._fsp--;

             after(grammarAccess.getDeclaratorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeclarator742); 

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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:389:1: ruleDeclarator : ( ruleNoptrDeclarator ) ;
    public final void ruleDeclarator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:393:2: ( ( ruleNoptrDeclarator ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:394:1: ( ruleNoptrDeclarator )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:394:1: ( ruleNoptrDeclarator )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:395:1: ruleNoptrDeclarator
            {
             before(grammarAccess.getDeclaratorAccess().getNoptrDeclaratorParserRuleCall()); 
            pushFollow(FOLLOW_ruleNoptrDeclarator_in_ruleDeclarator768);
            ruleNoptrDeclarator();

            state._fsp--;

             after(grammarAccess.getDeclaratorAccess().getNoptrDeclaratorParserRuleCall()); 

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


    // $ANTLR start "entryRuleFunctionDeclarator"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:408:1: entryRuleFunctionDeclarator : ruleFunctionDeclarator EOF ;
    public final void entryRuleFunctionDeclarator() throws RecognitionException {
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:409:1: ( ruleFunctionDeclarator EOF )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:410:1: ruleFunctionDeclarator EOF
            {
             before(grammarAccess.getFunctionDeclaratorRule()); 
            pushFollow(FOLLOW_ruleFunctionDeclarator_in_entryRuleFunctionDeclarator794);
            ruleFunctionDeclarator();

            state._fsp--;

             after(grammarAccess.getFunctionDeclaratorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionDeclarator801); 

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
    // $ANTLR end "entryRuleFunctionDeclarator"


    // $ANTLR start "ruleFunctionDeclarator"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:417:1: ruleFunctionDeclarator : ( ( rule__FunctionDeclarator__Group__0 ) ) ;
    public final void ruleFunctionDeclarator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:421:2: ( ( ( rule__FunctionDeclarator__Group__0 ) ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:422:1: ( ( rule__FunctionDeclarator__Group__0 ) )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:422:1: ( ( rule__FunctionDeclarator__Group__0 ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:423:1: ( rule__FunctionDeclarator__Group__0 )
            {
             before(grammarAccess.getFunctionDeclaratorAccess().getGroup()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:424:1: ( rule__FunctionDeclarator__Group__0 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:424:2: rule__FunctionDeclarator__Group__0
            {
            pushFollow(FOLLOW_rule__FunctionDeclarator__Group__0_in_ruleFunctionDeclarator827);
            rule__FunctionDeclarator__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFunctionDeclaratorAccess().getGroup()); 

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
    // $ANTLR end "ruleFunctionDeclarator"


    // $ANTLR start "entryRuleNoptrDeclarator"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:436:1: entryRuleNoptrDeclarator : ruleNoptrDeclarator EOF ;
    public final void entryRuleNoptrDeclarator() throws RecognitionException {
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:437:1: ( ruleNoptrDeclarator EOF )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:438:1: ruleNoptrDeclarator EOF
            {
             before(grammarAccess.getNoptrDeclaratorRule()); 
            pushFollow(FOLLOW_ruleNoptrDeclarator_in_entryRuleNoptrDeclarator854);
            ruleNoptrDeclarator();

            state._fsp--;

             after(grammarAccess.getNoptrDeclaratorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNoptrDeclarator861); 

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
    // $ANTLR end "entryRuleNoptrDeclarator"


    // $ANTLR start "ruleNoptrDeclarator"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:445:1: ruleNoptrDeclarator : ( ruleDeclaratorId ) ;
    public final void ruleNoptrDeclarator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:449:2: ( ( ruleDeclaratorId ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:450:1: ( ruleDeclaratorId )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:450:1: ( ruleDeclaratorId )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:451:1: ruleDeclaratorId
            {
             before(grammarAccess.getNoptrDeclaratorAccess().getDeclaratorIdParserRuleCall()); 
            pushFollow(FOLLOW_ruleDeclaratorId_in_ruleNoptrDeclarator887);
            ruleDeclaratorId();

            state._fsp--;

             after(grammarAccess.getNoptrDeclaratorAccess().getDeclaratorIdParserRuleCall()); 

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
    // $ANTLR end "ruleNoptrDeclarator"


    // $ANTLR start "entryRuleParametersAndQualifiers"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:464:1: entryRuleParametersAndQualifiers : ruleParametersAndQualifiers EOF ;
    public final void entryRuleParametersAndQualifiers() throws RecognitionException {
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:465:1: ( ruleParametersAndQualifiers EOF )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:466:1: ruleParametersAndQualifiers EOF
            {
             before(grammarAccess.getParametersAndQualifiersRule()); 
            pushFollow(FOLLOW_ruleParametersAndQualifiers_in_entryRuleParametersAndQualifiers913);
            ruleParametersAndQualifiers();

            state._fsp--;

             after(grammarAccess.getParametersAndQualifiersRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParametersAndQualifiers920); 

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
    // $ANTLR end "entryRuleParametersAndQualifiers"


    // $ANTLR start "ruleParametersAndQualifiers"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:473:1: ruleParametersAndQualifiers : ( ( rule__ParametersAndQualifiers__Group__0 ) ) ;
    public final void ruleParametersAndQualifiers() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:477:2: ( ( ( rule__ParametersAndQualifiers__Group__0 ) ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:478:1: ( ( rule__ParametersAndQualifiers__Group__0 ) )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:478:1: ( ( rule__ParametersAndQualifiers__Group__0 ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:479:1: ( rule__ParametersAndQualifiers__Group__0 )
            {
             before(grammarAccess.getParametersAndQualifiersAccess().getGroup()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:480:1: ( rule__ParametersAndQualifiers__Group__0 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:480:2: rule__ParametersAndQualifiers__Group__0
            {
            pushFollow(FOLLOW_rule__ParametersAndQualifiers__Group__0_in_ruleParametersAndQualifiers946);
            rule__ParametersAndQualifiers__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParametersAndQualifiersAccess().getGroup()); 

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
    // $ANTLR end "ruleParametersAndQualifiers"


    // $ANTLR start "entryRuleDeclaratorId"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:492:1: entryRuleDeclaratorId : ruleDeclaratorId EOF ;
    public final void entryRuleDeclaratorId() throws RecognitionException {
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:493:1: ( ruleDeclaratorId EOF )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:494:1: ruleDeclaratorId EOF
            {
             before(grammarAccess.getDeclaratorIdRule()); 
            pushFollow(FOLLOW_ruleDeclaratorId_in_entryRuleDeclaratorId973);
            ruleDeclaratorId();

            state._fsp--;

             after(grammarAccess.getDeclaratorIdRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeclaratorId980); 

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
    // $ANTLR end "entryRuleDeclaratorId"


    // $ANTLR start "ruleDeclaratorId"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:501:1: ruleDeclaratorId : ( ( rule__DeclaratorId__Alternatives ) ) ;
    public final void ruleDeclaratorId() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:505:2: ( ( ( rule__DeclaratorId__Alternatives ) ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:506:1: ( ( rule__DeclaratorId__Alternatives ) )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:506:1: ( ( rule__DeclaratorId__Alternatives ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:507:1: ( rule__DeclaratorId__Alternatives )
            {
             before(grammarAccess.getDeclaratorIdAccess().getAlternatives()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:508:1: ( rule__DeclaratorId__Alternatives )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:508:2: rule__DeclaratorId__Alternatives
            {
            pushFollow(FOLLOW_rule__DeclaratorId__Alternatives_in_ruleDeclaratorId1006);
            rule__DeclaratorId__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDeclaratorIdAccess().getAlternatives()); 

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
    // $ANTLR end "ruleDeclaratorId"


    // $ANTLR start "entryRuleTypeId"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:520:1: entryRuleTypeId : ruleTypeId EOF ;
    public final void entryRuleTypeId() throws RecognitionException {
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:521:1: ( ruleTypeId EOF )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:522:1: ruleTypeId EOF
            {
             before(grammarAccess.getTypeIdRule()); 
            pushFollow(FOLLOW_ruleTypeId_in_entryRuleTypeId1033);
            ruleTypeId();

            state._fsp--;

             after(grammarAccess.getTypeIdRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeId1040); 

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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:529:1: ruleTypeId : ( ( ( ruleTypeSpecifier ) ) ( ( ruleTypeSpecifier )* ) ) ;
    public final void ruleTypeId() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:533:2: ( ( ( ( ruleTypeSpecifier ) ) ( ( ruleTypeSpecifier )* ) ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:534:1: ( ( ( ruleTypeSpecifier ) ) ( ( ruleTypeSpecifier )* ) )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:534:1: ( ( ( ruleTypeSpecifier ) ) ( ( ruleTypeSpecifier )* ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:535:1: ( ( ruleTypeSpecifier ) ) ( ( ruleTypeSpecifier )* )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:535:1: ( ( ruleTypeSpecifier ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:536:1: ( ruleTypeSpecifier )
            {
             before(grammarAccess.getTypeIdAccess().getTypeSpecifierParserRuleCall()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:537:1: ( ruleTypeSpecifier )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:537:3: ruleTypeSpecifier
            {
            pushFollow(FOLLOW_ruleTypeSpecifier_in_ruleTypeId1069);
            ruleTypeSpecifier();

            state._fsp--;


            }

             after(grammarAccess.getTypeIdAccess().getTypeSpecifierParserRuleCall()); 

            }

            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:540:1: ( ( ruleTypeSpecifier )* )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:541:1: ( ruleTypeSpecifier )*
            {
             before(grammarAccess.getTypeIdAccess().getTypeSpecifierParserRuleCall()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:542:1: ( ruleTypeSpecifier )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==41) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:542:3: ruleTypeSpecifier
            	    {
            	    pushFollow(FOLLOW_ruleTypeSpecifier_in_ruleTypeId1082);
            	    ruleTypeSpecifier();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getTypeIdAccess().getTypeSpecifierParserRuleCall()); 

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
    // $ANTLR end "ruleTypeId"


    // $ANTLR start "entryRuleParameterDeclarationClause"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:555:1: entryRuleParameterDeclarationClause : ruleParameterDeclarationClause EOF ;
    public final void entryRuleParameterDeclarationClause() throws RecognitionException {
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:556:1: ( ruleParameterDeclarationClause EOF )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:557:1: ruleParameterDeclarationClause EOF
            {
             before(grammarAccess.getParameterDeclarationClauseRule()); 
            pushFollow(FOLLOW_ruleParameterDeclarationClause_in_entryRuleParameterDeclarationClause1112);
            ruleParameterDeclarationClause();

            state._fsp--;

             after(grammarAccess.getParameterDeclarationClauseRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterDeclarationClause1119); 

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
    // $ANTLR end "entryRuleParameterDeclarationClause"


    // $ANTLR start "ruleParameterDeclarationClause"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:564:1: ruleParameterDeclarationClause : ( ( rule__ParameterDeclarationClause__Alternatives ) ) ;
    public final void ruleParameterDeclarationClause() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:568:2: ( ( ( rule__ParameterDeclarationClause__Alternatives ) ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:569:1: ( ( rule__ParameterDeclarationClause__Alternatives ) )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:569:1: ( ( rule__ParameterDeclarationClause__Alternatives ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:570:1: ( rule__ParameterDeclarationClause__Alternatives )
            {
             before(grammarAccess.getParameterDeclarationClauseAccess().getAlternatives()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:571:1: ( rule__ParameterDeclarationClause__Alternatives )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:571:2: rule__ParameterDeclarationClause__Alternatives
            {
            pushFollow(FOLLOW_rule__ParameterDeclarationClause__Alternatives_in_ruleParameterDeclarationClause1145);
            rule__ParameterDeclarationClause__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getParameterDeclarationClauseAccess().getAlternatives()); 

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
    // $ANTLR end "ruleParameterDeclarationClause"


    // $ANTLR start "entryRuleParameterDeclarationList"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:583:1: entryRuleParameterDeclarationList : ruleParameterDeclarationList EOF ;
    public final void entryRuleParameterDeclarationList() throws RecognitionException {
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:584:1: ( ruleParameterDeclarationList EOF )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:585:1: ruleParameterDeclarationList EOF
            {
             before(grammarAccess.getParameterDeclarationListRule()); 
            pushFollow(FOLLOW_ruleParameterDeclarationList_in_entryRuleParameterDeclarationList1172);
            ruleParameterDeclarationList();

            state._fsp--;

             after(grammarAccess.getParameterDeclarationListRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterDeclarationList1179); 

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
    // $ANTLR end "entryRuleParameterDeclarationList"


    // $ANTLR start "ruleParameterDeclarationList"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:592:1: ruleParameterDeclarationList : ( ( rule__ParameterDeclarationList__Group__0 ) ) ;
    public final void ruleParameterDeclarationList() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:596:2: ( ( ( rule__ParameterDeclarationList__Group__0 ) ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:597:1: ( ( rule__ParameterDeclarationList__Group__0 ) )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:597:1: ( ( rule__ParameterDeclarationList__Group__0 ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:598:1: ( rule__ParameterDeclarationList__Group__0 )
            {
             before(grammarAccess.getParameterDeclarationListAccess().getGroup()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:599:1: ( rule__ParameterDeclarationList__Group__0 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:599:2: rule__ParameterDeclarationList__Group__0
            {
            pushFollow(FOLLOW_rule__ParameterDeclarationList__Group__0_in_ruleParameterDeclarationList1205);
            rule__ParameterDeclarationList__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParameterDeclarationListAccess().getGroup()); 

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
    // $ANTLR end "ruleParameterDeclarationList"


    // $ANTLR start "entryRuleParameterDeclaration"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:611:1: entryRuleParameterDeclaration : ruleParameterDeclaration EOF ;
    public final void entryRuleParameterDeclaration() throws RecognitionException {
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:612:1: ( ruleParameterDeclaration EOF )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:613:1: ruleParameterDeclaration EOF
            {
             before(grammarAccess.getParameterDeclarationRule()); 
            pushFollow(FOLLOW_ruleParameterDeclaration_in_entryRuleParameterDeclaration1232);
            ruleParameterDeclaration();

            state._fsp--;

             after(grammarAccess.getParameterDeclarationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterDeclaration1239); 

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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:620:1: ruleParameterDeclaration : ( ( rule__ParameterDeclaration__Group__0 ) ) ;
    public final void ruleParameterDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:624:2: ( ( ( rule__ParameterDeclaration__Group__0 ) ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:625:1: ( ( rule__ParameterDeclaration__Group__0 ) )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:625:1: ( ( rule__ParameterDeclaration__Group__0 ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:626:1: ( rule__ParameterDeclaration__Group__0 )
            {
             before(grammarAccess.getParameterDeclarationAccess().getGroup()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:627:1: ( rule__ParameterDeclaration__Group__0 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:627:2: rule__ParameterDeclaration__Group__0
            {
            pushFollow(FOLLOW_rule__ParameterDeclaration__Group__0_in_ruleParameterDeclaration1265);
            rule__ParameterDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParameterDeclarationAccess().getGroup()); 

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


    // $ANTLR start "entryRuleFunctionDefinition"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:639:1: entryRuleFunctionDefinition : ruleFunctionDefinition EOF ;
    public final void entryRuleFunctionDefinition() throws RecognitionException {
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:640:1: ( ruleFunctionDefinition EOF )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:641:1: ruleFunctionDefinition EOF
            {
             before(grammarAccess.getFunctionDefinitionRule()); 
            pushFollow(FOLLOW_ruleFunctionDefinition_in_entryRuleFunctionDefinition1292);
            ruleFunctionDefinition();

            state._fsp--;

             after(grammarAccess.getFunctionDefinitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionDefinition1299); 

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
    // $ANTLR end "entryRuleFunctionDefinition"


    // $ANTLR start "ruleFunctionDefinition"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:648:1: ruleFunctionDefinition : ( ( rule__FunctionDefinition__Group__0 ) ) ;
    public final void ruleFunctionDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:652:2: ( ( ( rule__FunctionDefinition__Group__0 ) ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:653:1: ( ( rule__FunctionDefinition__Group__0 ) )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:653:1: ( ( rule__FunctionDefinition__Group__0 ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:654:1: ( rule__FunctionDefinition__Group__0 )
            {
             before(grammarAccess.getFunctionDefinitionAccess().getGroup()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:655:1: ( rule__FunctionDefinition__Group__0 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:655:2: rule__FunctionDefinition__Group__0
            {
            pushFollow(FOLLOW_rule__FunctionDefinition__Group__0_in_ruleFunctionDefinition1325);
            rule__FunctionDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFunctionDefinitionAccess().getGroup()); 

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
    // $ANTLR end "ruleFunctionDefinition"


    // $ANTLR start "entryRuleFunctionBody"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:667:1: entryRuleFunctionBody : ruleFunctionBody EOF ;
    public final void entryRuleFunctionBody() throws RecognitionException {
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:668:1: ( ruleFunctionBody EOF )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:669:1: ruleFunctionBody EOF
            {
             before(grammarAccess.getFunctionBodyRule()); 
            pushFollow(FOLLOW_ruleFunctionBody_in_entryRuleFunctionBody1352);
            ruleFunctionBody();

            state._fsp--;

             after(grammarAccess.getFunctionBodyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionBody1359); 

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
    // $ANTLR end "entryRuleFunctionBody"


    // $ANTLR start "ruleFunctionBody"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:676:1: ruleFunctionBody : ( ( rule__FunctionBody__Alternatives ) ) ;
    public final void ruleFunctionBody() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:680:2: ( ( ( rule__FunctionBody__Alternatives ) ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:681:1: ( ( rule__FunctionBody__Alternatives ) )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:681:1: ( ( rule__FunctionBody__Alternatives ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:682:1: ( rule__FunctionBody__Alternatives )
            {
             before(grammarAccess.getFunctionBodyAccess().getAlternatives()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:683:1: ( rule__FunctionBody__Alternatives )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:683:2: rule__FunctionBody__Alternatives
            {
            pushFollow(FOLLOW_rule__FunctionBody__Alternatives_in_ruleFunctionBody1385);
            rule__FunctionBody__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFunctionBodyAccess().getAlternatives()); 

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
    // $ANTLR end "ruleFunctionBody"


    // $ANTLR start "entryRuleOperatorFunctionId"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:695:1: entryRuleOperatorFunctionId : ruleOperatorFunctionId EOF ;
    public final void entryRuleOperatorFunctionId() throws RecognitionException {
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:696:1: ( ruleOperatorFunctionId EOF )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:697:1: ruleOperatorFunctionId EOF
            {
             before(grammarAccess.getOperatorFunctionIdRule()); 
            pushFollow(FOLLOW_ruleOperatorFunctionId_in_entryRuleOperatorFunctionId1412);
            ruleOperatorFunctionId();

            state._fsp--;

             after(grammarAccess.getOperatorFunctionIdRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperatorFunctionId1419); 

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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:704:1: ruleOperatorFunctionId : ( ( rule__OperatorFunctionId__Group__0 ) ) ;
    public final void ruleOperatorFunctionId() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:708:2: ( ( ( rule__OperatorFunctionId__Group__0 ) ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:709:1: ( ( rule__OperatorFunctionId__Group__0 ) )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:709:1: ( ( rule__OperatorFunctionId__Group__0 ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:710:1: ( rule__OperatorFunctionId__Group__0 )
            {
             before(grammarAccess.getOperatorFunctionIdAccess().getGroup()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:711:1: ( rule__OperatorFunctionId__Group__0 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:711:2: rule__OperatorFunctionId__Group__0
            {
            pushFollow(FOLLOW_rule__OperatorFunctionId__Group__0_in_ruleOperatorFunctionId1445);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:723:1: entryRuleOverloadableOperator : ruleOverloadableOperator EOF ;
    public final void entryRuleOverloadableOperator() throws RecognitionException {
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:724:1: ( ruleOverloadableOperator EOF )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:725:1: ruleOverloadableOperator EOF
            {
             before(grammarAccess.getOverloadableOperatorRule()); 
            pushFollow(FOLLOW_ruleOverloadableOperator_in_entryRuleOverloadableOperator1472);
            ruleOverloadableOperator();

            state._fsp--;

             after(grammarAccess.getOverloadableOperatorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOverloadableOperator1479); 

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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:732:1: ruleOverloadableOperator : ( ( rule__OverloadableOperator__Alternatives ) ) ;
    public final void ruleOverloadableOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:736:2: ( ( ( rule__OverloadableOperator__Alternatives ) ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:737:1: ( ( rule__OverloadableOperator__Alternatives ) )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:737:1: ( ( rule__OverloadableOperator__Alternatives ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:738:1: ( rule__OverloadableOperator__Alternatives )
            {
             before(grammarAccess.getOverloadableOperatorAccess().getAlternatives()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:739:1: ( rule__OverloadableOperator__Alternatives )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:739:2: rule__OverloadableOperator__Alternatives
            {
            pushFollow(FOLLOW_rule__OverloadableOperator__Alternatives_in_ruleOverloadableOperator1505);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:751:1: entryRuleLiteralOperatorId : ruleLiteralOperatorId EOF ;
    public final void entryRuleLiteralOperatorId() throws RecognitionException {
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:752:1: ( ruleLiteralOperatorId EOF )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:753:1: ruleLiteralOperatorId EOF
            {
             before(grammarAccess.getLiteralOperatorIdRule()); 
            pushFollow(FOLLOW_ruleLiteralOperatorId_in_entryRuleLiteralOperatorId1532);
            ruleLiteralOperatorId();

            state._fsp--;

             after(grammarAccess.getLiteralOperatorIdRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteralOperatorId1539); 

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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:760:1: ruleLiteralOperatorId : ( ( rule__LiteralOperatorId__Group__0 ) ) ;
    public final void ruleLiteralOperatorId() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:764:2: ( ( ( rule__LiteralOperatorId__Group__0 ) ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:765:1: ( ( rule__LiteralOperatorId__Group__0 ) )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:765:1: ( ( rule__LiteralOperatorId__Group__0 ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:766:1: ( rule__LiteralOperatorId__Group__0 )
            {
             before(grammarAccess.getLiteralOperatorIdAccess().getGroup()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:767:1: ( rule__LiteralOperatorId__Group__0 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:767:2: rule__LiteralOperatorId__Group__0
            {
            pushFollow(FOLLOW_rule__LiteralOperatorId__Group__0_in_ruleLiteralOperatorId1565);
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


    // $ANTLR start "entryRuleTemplateDeclaration"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:779:1: entryRuleTemplateDeclaration : ruleTemplateDeclaration EOF ;
    public final void entryRuleTemplateDeclaration() throws RecognitionException {
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:780:1: ( ruleTemplateDeclaration EOF )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:781:1: ruleTemplateDeclaration EOF
            {
             before(grammarAccess.getTemplateDeclarationRule()); 
            pushFollow(FOLLOW_ruleTemplateDeclaration_in_entryRuleTemplateDeclaration1592);
            ruleTemplateDeclaration();

            state._fsp--;

             after(grammarAccess.getTemplateDeclarationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTemplateDeclaration1599); 

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
    // $ANTLR end "entryRuleTemplateDeclaration"


    // $ANTLR start "ruleTemplateDeclaration"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:788:1: ruleTemplateDeclaration : ( ( rule__TemplateDeclaration__Group__0 ) ) ;
    public final void ruleTemplateDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:792:2: ( ( ( rule__TemplateDeclaration__Group__0 ) ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:793:1: ( ( rule__TemplateDeclaration__Group__0 ) )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:793:1: ( ( rule__TemplateDeclaration__Group__0 ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:794:1: ( rule__TemplateDeclaration__Group__0 )
            {
             before(grammarAccess.getTemplateDeclarationAccess().getGroup()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:795:1: ( rule__TemplateDeclaration__Group__0 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:795:2: rule__TemplateDeclaration__Group__0
            {
            pushFollow(FOLLOW_rule__TemplateDeclaration__Group__0_in_ruleTemplateDeclaration1625);
            rule__TemplateDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTemplateDeclarationAccess().getGroup()); 

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
    // $ANTLR end "ruleTemplateDeclaration"


    // $ANTLR start "entryRuleTemplateParameterList"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:807:1: entryRuleTemplateParameterList : ruleTemplateParameterList EOF ;
    public final void entryRuleTemplateParameterList() throws RecognitionException {
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:808:1: ( ruleTemplateParameterList EOF )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:809:1: ruleTemplateParameterList EOF
            {
             before(grammarAccess.getTemplateParameterListRule()); 
            pushFollow(FOLLOW_ruleTemplateParameterList_in_entryRuleTemplateParameterList1652);
            ruleTemplateParameterList();

            state._fsp--;

             after(grammarAccess.getTemplateParameterListRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTemplateParameterList1659); 

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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:816:1: ruleTemplateParameterList : ( ( rule__TemplateParameterList__Group__0 ) ) ;
    public final void ruleTemplateParameterList() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:820:2: ( ( ( rule__TemplateParameterList__Group__0 ) ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:821:1: ( ( rule__TemplateParameterList__Group__0 ) )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:821:1: ( ( rule__TemplateParameterList__Group__0 ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:822:1: ( rule__TemplateParameterList__Group__0 )
            {
             before(grammarAccess.getTemplateParameterListAccess().getGroup()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:823:1: ( rule__TemplateParameterList__Group__0 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:823:2: rule__TemplateParameterList__Group__0
            {
            pushFollow(FOLLOW_rule__TemplateParameterList__Group__0_in_ruleTemplateParameterList1685);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:835:1: entryRuleTemplateParameter : ruleTemplateParameter EOF ;
    public final void entryRuleTemplateParameter() throws RecognitionException {
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:836:1: ( ruleTemplateParameter EOF )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:837:1: ruleTemplateParameter EOF
            {
             before(grammarAccess.getTemplateParameterRule()); 
            pushFollow(FOLLOW_ruleTemplateParameter_in_entryRuleTemplateParameter1712);
            ruleTemplateParameter();

            state._fsp--;

             after(grammarAccess.getTemplateParameterRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTemplateParameter1719); 

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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:844:1: ruleTemplateParameter : ( ( rule__TemplateParameter__Alternatives ) ) ;
    public final void ruleTemplateParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:848:2: ( ( ( rule__TemplateParameter__Alternatives ) ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:849:1: ( ( rule__TemplateParameter__Alternatives ) )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:849:1: ( ( rule__TemplateParameter__Alternatives ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:850:1: ( rule__TemplateParameter__Alternatives )
            {
             before(grammarAccess.getTemplateParameterAccess().getAlternatives()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:851:1: ( rule__TemplateParameter__Alternatives )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:851:2: rule__TemplateParameter__Alternatives
            {
            pushFollow(FOLLOW_rule__TemplateParameter__Alternatives_in_ruleTemplateParameter1745);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:863:1: entryRuleTypeParameter : ruleTypeParameter EOF ;
    public final void entryRuleTypeParameter() throws RecognitionException {
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:864:1: ( ruleTypeParameter EOF )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:865:1: ruleTypeParameter EOF
            {
             before(grammarAccess.getTypeParameterRule()); 
            pushFollow(FOLLOW_ruleTypeParameter_in_entryRuleTypeParameter1772);
            ruleTypeParameter();

            state._fsp--;

             after(grammarAccess.getTypeParameterRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeParameter1779); 

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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:872:1: ruleTypeParameter : ( ( rule__TypeParameter__Group__0 ) ) ;
    public final void ruleTypeParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:876:2: ( ( ( rule__TypeParameter__Group__0 ) ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:877:1: ( ( rule__TypeParameter__Group__0 ) )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:877:1: ( ( rule__TypeParameter__Group__0 ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:878:1: ( rule__TypeParameter__Group__0 )
            {
             before(grammarAccess.getTypeParameterAccess().getGroup()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:879:1: ( rule__TypeParameter__Group__0 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:879:2: rule__TypeParameter__Group__0
            {
            pushFollow(FOLLOW_rule__TypeParameter__Group__0_in_ruleTypeParameter1805);
            rule__TypeParameter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTypeParameterAccess().getGroup()); 

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


    // $ANTLR start "entryRuleTemplateArgumentList"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:893:1: entryRuleTemplateArgumentList : ruleTemplateArgumentList EOF ;
    public final void entryRuleTemplateArgumentList() throws RecognitionException {
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:894:1: ( ruleTemplateArgumentList EOF )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:895:1: ruleTemplateArgumentList EOF
            {
             before(grammarAccess.getTemplateArgumentListRule()); 
            pushFollow(FOLLOW_ruleTemplateArgumentList_in_entryRuleTemplateArgumentList1834);
            ruleTemplateArgumentList();

            state._fsp--;

             after(grammarAccess.getTemplateArgumentListRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTemplateArgumentList1841); 

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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:902:1: ruleTemplateArgumentList : ( ( rule__TemplateArgumentList__Group__0 ) ) ;
    public final void ruleTemplateArgumentList() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:906:2: ( ( ( rule__TemplateArgumentList__Group__0 ) ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:907:1: ( ( rule__TemplateArgumentList__Group__0 ) )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:907:1: ( ( rule__TemplateArgumentList__Group__0 ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:908:1: ( rule__TemplateArgumentList__Group__0 )
            {
             before(grammarAccess.getTemplateArgumentListAccess().getGroup()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:909:1: ( rule__TemplateArgumentList__Group__0 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:909:2: rule__TemplateArgumentList__Group__0
            {
            pushFollow(FOLLOW_rule__TemplateArgumentList__Group__0_in_ruleTemplateArgumentList1867);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:921:1: entryRuleTemplateArgument : ruleTemplateArgument EOF ;
    public final void entryRuleTemplateArgument() throws RecognitionException {
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:922:1: ( ruleTemplateArgument EOF )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:923:1: ruleTemplateArgument EOF
            {
             before(grammarAccess.getTemplateArgumentRule()); 
            pushFollow(FOLLOW_ruleTemplateArgument_in_entryRuleTemplateArgument1894);
            ruleTemplateArgument();

            state._fsp--;

             after(grammarAccess.getTemplateArgumentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTemplateArgument1901); 

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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:930:1: ruleTemplateArgument : ( ( rule__TemplateArgument__Alternatives ) ) ;
    public final void ruleTemplateArgument() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:934:2: ( ( ( rule__TemplateArgument__Alternatives ) ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:935:1: ( ( rule__TemplateArgument__Alternatives ) )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:935:1: ( ( rule__TemplateArgument__Alternatives ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:936:1: ( rule__TemplateArgument__Alternatives )
            {
             before(grammarAccess.getTemplateArgumentAccess().getAlternatives()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:937:1: ( rule__TemplateArgument__Alternatives )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:937:2: rule__TemplateArgument__Alternatives
            {
            pushFollow(FOLLOW_rule__TemplateArgument__Alternatives_in_ruleTemplateArgument1927);
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


    // $ANTLR start "entryRuleFunctionTryBlock"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:953:1: entryRuleFunctionTryBlock : ruleFunctionTryBlock EOF ;
    public final void entryRuleFunctionTryBlock() throws RecognitionException {
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:954:1: ( ruleFunctionTryBlock EOF )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:955:1: ruleFunctionTryBlock EOF
            {
             before(grammarAccess.getFunctionTryBlockRule()); 
            pushFollow(FOLLOW_ruleFunctionTryBlock_in_entryRuleFunctionTryBlock1958);
            ruleFunctionTryBlock();

            state._fsp--;

             after(grammarAccess.getFunctionTryBlockRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionTryBlock1965); 

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
    // $ANTLR end "entryRuleFunctionTryBlock"


    // $ANTLR start "ruleFunctionTryBlock"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:962:1: ruleFunctionTryBlock : ( ( rule__FunctionTryBlock__Group__0 ) ) ;
    public final void ruleFunctionTryBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:966:2: ( ( ( rule__FunctionTryBlock__Group__0 ) ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:967:1: ( ( rule__FunctionTryBlock__Group__0 ) )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:967:1: ( ( rule__FunctionTryBlock__Group__0 ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:968:1: ( rule__FunctionTryBlock__Group__0 )
            {
             before(grammarAccess.getFunctionTryBlockAccess().getGroup()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:969:1: ( rule__FunctionTryBlock__Group__0 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:969:2: rule__FunctionTryBlock__Group__0
            {
            pushFollow(FOLLOW_rule__FunctionTryBlock__Group__0_in_ruleFunctionTryBlock1991);
            rule__FunctionTryBlock__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFunctionTryBlockAccess().getGroup()); 

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
    // $ANTLR end "ruleFunctionTryBlock"


    // $ANTLR start "entryRuleHandler"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:981:1: entryRuleHandler : ruleHandler EOF ;
    public final void entryRuleHandler() throws RecognitionException {
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:982:1: ( ruleHandler EOF )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:983:1: ruleHandler EOF
            {
             before(grammarAccess.getHandlerRule()); 
            pushFollow(FOLLOW_ruleHandler_in_entryRuleHandler2018);
            ruleHandler();

            state._fsp--;

             after(grammarAccess.getHandlerRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHandler2025); 

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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:990:1: ruleHandler : ( ( rule__Handler__Group__0 ) ) ;
    public final void ruleHandler() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:994:2: ( ( ( rule__Handler__Group__0 ) ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:995:1: ( ( rule__Handler__Group__0 ) )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:995:1: ( ( rule__Handler__Group__0 ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:996:1: ( rule__Handler__Group__0 )
            {
             before(grammarAccess.getHandlerAccess().getGroup()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:997:1: ( rule__Handler__Group__0 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:997:2: rule__Handler__Group__0
            {
            pushFollow(FOLLOW_rule__Handler__Group__0_in_ruleHandler2051);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1009:1: entryRuleExceptionDeclaration : ruleExceptionDeclaration EOF ;
    public final void entryRuleExceptionDeclaration() throws RecognitionException {
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1010:1: ( ruleExceptionDeclaration EOF )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1011:1: ruleExceptionDeclaration EOF
            {
             before(grammarAccess.getExceptionDeclarationRule()); 
            pushFollow(FOLLOW_ruleExceptionDeclaration_in_entryRuleExceptionDeclaration2078);
            ruleExceptionDeclaration();

            state._fsp--;

             after(grammarAccess.getExceptionDeclarationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExceptionDeclaration2085); 

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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1018:1: ruleExceptionDeclaration : ( ( rule__ExceptionDeclaration__Alternatives ) ) ;
    public final void ruleExceptionDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1022:2: ( ( ( rule__ExceptionDeclaration__Alternatives ) ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1023:1: ( ( rule__ExceptionDeclaration__Alternatives ) )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1023:1: ( ( rule__ExceptionDeclaration__Alternatives ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1024:1: ( rule__ExceptionDeclaration__Alternatives )
            {
             before(grammarAccess.getExceptionDeclarationAccess().getAlternatives()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1025:1: ( rule__ExceptionDeclaration__Alternatives )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1025:2: rule__ExceptionDeclaration__Alternatives
            {
            pushFollow(FOLLOW_rule__ExceptionDeclaration__Alternatives_in_ruleExceptionDeclaration2111);
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


    // $ANTLR start "entryRuleExceptionSpecification"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1039:1: entryRuleExceptionSpecification : ruleExceptionSpecification EOF ;
    public final void entryRuleExceptionSpecification() throws RecognitionException {
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1040:1: ( ruleExceptionSpecification EOF )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1041:1: ruleExceptionSpecification EOF
            {
             before(grammarAccess.getExceptionSpecificationRule()); 
            pushFollow(FOLLOW_ruleExceptionSpecification_in_entryRuleExceptionSpecification2140);
            ruleExceptionSpecification();

            state._fsp--;

             after(grammarAccess.getExceptionSpecificationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExceptionSpecification2147); 

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
    // $ANTLR end "entryRuleExceptionSpecification"


    // $ANTLR start "ruleExceptionSpecification"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1048:1: ruleExceptionSpecification : ( ( rule__ExceptionSpecification__Alternatives ) ) ;
    public final void ruleExceptionSpecification() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1052:2: ( ( ( rule__ExceptionSpecification__Alternatives ) ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1053:1: ( ( rule__ExceptionSpecification__Alternatives ) )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1053:1: ( ( rule__ExceptionSpecification__Alternatives ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1054:1: ( rule__ExceptionSpecification__Alternatives )
            {
             before(grammarAccess.getExceptionSpecificationAccess().getAlternatives()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1055:1: ( rule__ExceptionSpecification__Alternatives )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1055:2: rule__ExceptionSpecification__Alternatives
            {
            pushFollow(FOLLOW_rule__ExceptionSpecification__Alternatives_in_ruleExceptionSpecification2173);
            rule__ExceptionSpecification__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getExceptionSpecificationAccess().getAlternatives()); 

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
    // $ANTLR end "ruleExceptionSpecification"


    // $ANTLR start "entryRuleDynamicExceptionSpecification"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1067:1: entryRuleDynamicExceptionSpecification : ruleDynamicExceptionSpecification EOF ;
    public final void entryRuleDynamicExceptionSpecification() throws RecognitionException {
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1068:1: ( ruleDynamicExceptionSpecification EOF )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1069:1: ruleDynamicExceptionSpecification EOF
            {
             before(grammarAccess.getDynamicExceptionSpecificationRule()); 
            pushFollow(FOLLOW_ruleDynamicExceptionSpecification_in_entryRuleDynamicExceptionSpecification2200);
            ruleDynamicExceptionSpecification();

            state._fsp--;

             after(grammarAccess.getDynamicExceptionSpecificationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDynamicExceptionSpecification2207); 

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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1076:1: ruleDynamicExceptionSpecification : ( ( rule__DynamicExceptionSpecification__Group__0 ) ) ;
    public final void ruleDynamicExceptionSpecification() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1080:2: ( ( ( rule__DynamicExceptionSpecification__Group__0 ) ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1081:1: ( ( rule__DynamicExceptionSpecification__Group__0 ) )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1081:1: ( ( rule__DynamicExceptionSpecification__Group__0 ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1082:1: ( rule__DynamicExceptionSpecification__Group__0 )
            {
             before(grammarAccess.getDynamicExceptionSpecificationAccess().getGroup()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1083:1: ( rule__DynamicExceptionSpecification__Group__0 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1083:2: rule__DynamicExceptionSpecification__Group__0
            {
            pushFollow(FOLLOW_rule__DynamicExceptionSpecification__Group__0_in_ruleDynamicExceptionSpecification2233);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1095:1: entryRuleNoexceptSpecification : ruleNoexceptSpecification EOF ;
    public final void entryRuleNoexceptSpecification() throws RecognitionException {
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1096:1: ( ruleNoexceptSpecification EOF )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1097:1: ruleNoexceptSpecification EOF
            {
             before(grammarAccess.getNoexceptSpecificationRule()); 
            pushFollow(FOLLOW_ruleNoexceptSpecification_in_entryRuleNoexceptSpecification2260);
            ruleNoexceptSpecification();

            state._fsp--;

             after(grammarAccess.getNoexceptSpecificationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNoexceptSpecification2267); 

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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1104:1: ruleNoexceptSpecification : ( ( rule__NoexceptSpecification__Group__0 ) ) ;
    public final void ruleNoexceptSpecification() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1108:2: ( ( ( rule__NoexceptSpecification__Group__0 ) ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1109:1: ( ( rule__NoexceptSpecification__Group__0 ) )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1109:1: ( ( rule__NoexceptSpecification__Group__0 ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1110:1: ( rule__NoexceptSpecification__Group__0 )
            {
             before(grammarAccess.getNoexceptSpecificationAccess().getGroup()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1111:1: ( rule__NoexceptSpecification__Group__0 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1111:2: rule__NoexceptSpecification__Group__0
            {
            pushFollow(FOLLOW_rule__NoexceptSpecification__Group__0_in_ruleNoexceptSpecification2293);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1123:1: entryRuleConstantExpression : ruleConstantExpression EOF ;
    public final void entryRuleConstantExpression() throws RecognitionException {
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1124:1: ( ruleConstantExpression EOF )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1125:1: ruleConstantExpression EOF
            {
             before(grammarAccess.getConstantExpressionRule()); 
            pushFollow(FOLLOW_ruleConstantExpression_in_entryRuleConstantExpression2320);
            ruleConstantExpression();

            state._fsp--;

             after(grammarAccess.getConstantExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstantExpression2327); 

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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1132:1: ruleConstantExpression : ( 'ConstantExpression' ) ;
    public final void ruleConstantExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1136:2: ( ( 'ConstantExpression' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1137:1: ( 'ConstantExpression' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1137:1: ( 'ConstantExpression' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1138:1: 'ConstantExpression'
            {
             before(grammarAccess.getConstantExpressionAccess().getConstantExpressionKeyword()); 
            match(input,35,FOLLOW_35_in_ruleConstantExpression2354); 
             after(grammarAccess.getConstantExpressionAccess().getConstantExpressionKeyword()); 

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


    // $ANTLR start "entryRuleIdExpression"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1153:1: entryRuleIdExpression : ruleIdExpression EOF ;
    public final void entryRuleIdExpression() throws RecognitionException {
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1154:1: ( ruleIdExpression EOF )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1155:1: ruleIdExpression EOF
            {
             before(grammarAccess.getIdExpressionRule()); 
            pushFollow(FOLLOW_ruleIdExpression_in_entryRuleIdExpression2382);
            ruleIdExpression();

            state._fsp--;

             after(grammarAccess.getIdExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIdExpression2389); 

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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1162:1: ruleIdExpression : ( 'IdExpression' ) ;
    public final void ruleIdExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1166:2: ( ( 'IdExpression' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1167:1: ( 'IdExpression' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1167:1: ( 'IdExpression' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1168:1: 'IdExpression'
            {
             before(grammarAccess.getIdExpressionAccess().getIdExpressionKeyword()); 
            match(input,36,FOLLOW_36_in_ruleIdExpression2416); 
             after(grammarAccess.getIdExpressionAccess().getIdExpressionKeyword()); 

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


    // $ANTLR start "entryRuleDeclarationSpecifier"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1183:1: entryRuleDeclarationSpecifier : ruleDeclarationSpecifier EOF ;
    public final void entryRuleDeclarationSpecifier() throws RecognitionException {
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1184:1: ( ruleDeclarationSpecifier EOF )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1185:1: ruleDeclarationSpecifier EOF
            {
             before(grammarAccess.getDeclarationSpecifierRule()); 
            pushFollow(FOLLOW_ruleDeclarationSpecifier_in_entryRuleDeclarationSpecifier2444);
            ruleDeclarationSpecifier();

            state._fsp--;

             after(grammarAccess.getDeclarationSpecifierRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeclarationSpecifier2451); 

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
    // $ANTLR end "entryRuleDeclarationSpecifier"


    // $ANTLR start "ruleDeclarationSpecifier"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1192:1: ruleDeclarationSpecifier : ( 'DeclarationSpecifier' ) ;
    public final void ruleDeclarationSpecifier() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1196:2: ( ( 'DeclarationSpecifier' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1197:1: ( 'DeclarationSpecifier' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1197:1: ( 'DeclarationSpecifier' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1198:1: 'DeclarationSpecifier'
            {
             before(grammarAccess.getDeclarationSpecifierAccess().getDeclarationSpecifierKeyword()); 
            match(input,37,FOLLOW_37_in_ruleDeclarationSpecifier2478); 
             after(grammarAccess.getDeclarationSpecifierAccess().getDeclarationSpecifierKeyword()); 

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
    // $ANTLR end "ruleDeclarationSpecifier"


    // $ANTLR start "entryRuleDeclaration"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1213:1: entryRuleDeclaration : ruleDeclaration EOF ;
    public final void entryRuleDeclaration() throws RecognitionException {
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1214:1: ( ruleDeclaration EOF )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1215:1: ruleDeclaration EOF
            {
             before(grammarAccess.getDeclarationRule()); 
            pushFollow(FOLLOW_ruleDeclaration_in_entryRuleDeclaration2506);
            ruleDeclaration();

            state._fsp--;

             after(grammarAccess.getDeclarationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeclaration2513); 

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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1222:1: ruleDeclaration : ( 'Declaration' ) ;
    public final void ruleDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1226:2: ( ( 'Declaration' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1227:1: ( 'Declaration' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1227:1: ( 'Declaration' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1228:1: 'Declaration'
            {
             before(grammarAccess.getDeclarationAccess().getDeclarationKeyword()); 
            match(input,38,FOLLOW_38_in_ruleDeclaration2540); 
             after(grammarAccess.getDeclarationAccess().getDeclarationKeyword()); 

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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1243:1: entryRuleNestedNameSpecifier : ruleNestedNameSpecifier EOF ;
    public final void entryRuleNestedNameSpecifier() throws RecognitionException {
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1244:1: ( ruleNestedNameSpecifier EOF )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1245:1: ruleNestedNameSpecifier EOF
            {
             before(grammarAccess.getNestedNameSpecifierRule()); 
            pushFollow(FOLLOW_ruleNestedNameSpecifier_in_entryRuleNestedNameSpecifier2568);
            ruleNestedNameSpecifier();

            state._fsp--;

             after(grammarAccess.getNestedNameSpecifierRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNestedNameSpecifier2575); 

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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1252:1: ruleNestedNameSpecifier : ( 'NestedNameSpecifier' ) ;
    public final void ruleNestedNameSpecifier() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1256:2: ( ( 'NestedNameSpecifier' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1257:1: ( 'NestedNameSpecifier' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1257:1: ( 'NestedNameSpecifier' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1258:1: 'NestedNameSpecifier'
            {
             before(grammarAccess.getNestedNameSpecifierAccess().getNestedNameSpecifierKeyword()); 
            match(input,39,FOLLOW_39_in_ruleNestedNameSpecifier2602); 
             after(grammarAccess.getNestedNameSpecifierAccess().getNestedNameSpecifierKeyword()); 

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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1273:1: entryRuleAssignmentExpression : ruleAssignmentExpression EOF ;
    public final void entryRuleAssignmentExpression() throws RecognitionException {
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1274:1: ( ruleAssignmentExpression EOF )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1275:1: ruleAssignmentExpression EOF
            {
             before(grammarAccess.getAssignmentExpressionRule()); 
            pushFollow(FOLLOW_ruleAssignmentExpression_in_entryRuleAssignmentExpression2630);
            ruleAssignmentExpression();

            state._fsp--;

             after(grammarAccess.getAssignmentExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignmentExpression2637); 

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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1282:1: ruleAssignmentExpression : ( 'AssignmentExpression' ) ;
    public final void ruleAssignmentExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1286:2: ( ( 'AssignmentExpression' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1287:1: ( 'AssignmentExpression' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1287:1: ( 'AssignmentExpression' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1288:1: 'AssignmentExpression'
            {
             before(grammarAccess.getAssignmentExpressionAccess().getAssignmentExpressionKeyword()); 
            match(input,40,FOLLOW_40_in_ruleAssignmentExpression2664); 
             after(grammarAccess.getAssignmentExpressionAccess().getAssignmentExpressionKeyword()); 

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


    // $ANTLR start "entryRuleTypeSpecifier"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1305:1: entryRuleTypeSpecifier : ruleTypeSpecifier EOF ;
    public final void entryRuleTypeSpecifier() throws RecognitionException {
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1306:1: ( ruleTypeSpecifier EOF )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1307:1: ruleTypeSpecifier EOF
            {
             before(grammarAccess.getTypeSpecifierRule()); 
            pushFollow(FOLLOW_ruleTypeSpecifier_in_entryRuleTypeSpecifier2694);
            ruleTypeSpecifier();

            state._fsp--;

             after(grammarAccess.getTypeSpecifierRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeSpecifier2701); 

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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1314:1: ruleTypeSpecifier : ( 'TypeSpecifier' ) ;
    public final void ruleTypeSpecifier() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1318:2: ( ( 'TypeSpecifier' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1319:1: ( 'TypeSpecifier' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1319:1: ( 'TypeSpecifier' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1320:1: 'TypeSpecifier'
            {
             before(grammarAccess.getTypeSpecifierAccess().getTypeSpecifierKeyword()); 
            match(input,41,FOLLOW_41_in_ruleTypeSpecifier2728); 
             after(grammarAccess.getTypeSpecifierAccess().getTypeSpecifierKeyword()); 

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


    // $ANTLR start "entryRuleCompoundStatement"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1335:1: entryRuleCompoundStatement : ruleCompoundStatement EOF ;
    public final void entryRuleCompoundStatement() throws RecognitionException {
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1336:1: ( ruleCompoundStatement EOF )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1337:1: ruleCompoundStatement EOF
            {
             before(grammarAccess.getCompoundStatementRule()); 
            pushFollow(FOLLOW_ruleCompoundStatement_in_entryRuleCompoundStatement2756);
            ruleCompoundStatement();

            state._fsp--;

             after(grammarAccess.getCompoundStatementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompoundStatement2763); 

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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1344:1: ruleCompoundStatement : ( 'CompoundStatement' ) ;
    public final void ruleCompoundStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1348:2: ( ( 'CompoundStatement' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1349:1: ( 'CompoundStatement' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1349:1: ( 'CompoundStatement' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1350:1: 'CompoundStatement'
            {
             before(grammarAccess.getCompoundStatementAccess().getCompoundStatementKeyword()); 
            match(input,42,FOLLOW_42_in_ruleCompoundStatement2790); 
             after(grammarAccess.getCompoundStatementAccess().getCompoundStatementKeyword()); 

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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1365:1: entryRuleCtorInitializer : ruleCtorInitializer EOF ;
    public final void entryRuleCtorInitializer() throws RecognitionException {
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1366:1: ( ruleCtorInitializer EOF )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1367:1: ruleCtorInitializer EOF
            {
             before(grammarAccess.getCtorInitializerRule()); 
            pushFollow(FOLLOW_ruleCtorInitializer_in_entryRuleCtorInitializer2818);
            ruleCtorInitializer();

            state._fsp--;

             after(grammarAccess.getCtorInitializerRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCtorInitializer2825); 

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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1374:1: ruleCtorInitializer : ( 'CtorInitializer' ) ;
    public final void ruleCtorInitializer() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1378:2: ( ( 'CtorInitializer' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1379:1: ( 'CtorInitializer' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1379:1: ( 'CtorInitializer' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1380:1: 'CtorInitializer'
            {
             before(grammarAccess.getCtorInitializerAccess().getCtorInitializerKeyword()); 
            match(input,43,FOLLOW_43_in_ruleCtorInitializer2852); 
             after(grammarAccess.getCtorInitializerAccess().getCtorInitializerKeyword()); 

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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1395:1: entryRuleTypeIdList : ruleTypeIdList EOF ;
    public final void entryRuleTypeIdList() throws RecognitionException {
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1396:1: ( ruleTypeIdList EOF )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1397:1: ruleTypeIdList EOF
            {
             before(grammarAccess.getTypeIdListRule()); 
            pushFollow(FOLLOW_ruleTypeIdList_in_entryRuleTypeIdList2880);
            ruleTypeIdList();

            state._fsp--;

             after(grammarAccess.getTypeIdListRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeIdList2887); 

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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1404:1: ruleTypeIdList : ( 'TypeIdList' ) ;
    public final void ruleTypeIdList() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1408:2: ( ( 'TypeIdList' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1409:1: ( 'TypeIdList' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1409:1: ( 'TypeIdList' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1410:1: 'TypeIdList'
            {
             before(grammarAccess.getTypeIdListAccess().getTypeIdListKeyword()); 
            match(input,44,FOLLOW_44_in_ruleTypeIdList2914); 
             after(grammarAccess.getTypeIdListAccess().getTypeIdListKeyword()); 

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


    // $ANTLR start "entryRuleUnqualifiedId"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1425:1: entryRuleUnqualifiedId : ruleUnqualifiedId EOF ;
    public final void entryRuleUnqualifiedId() throws RecognitionException {
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1426:1: ( ruleUnqualifiedId EOF )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1427:1: ruleUnqualifiedId EOF
            {
             before(grammarAccess.getUnqualifiedIdRule()); 
            pushFollow(FOLLOW_ruleUnqualifiedId_in_entryRuleUnqualifiedId2942);
            ruleUnqualifiedId();

            state._fsp--;

             after(grammarAccess.getUnqualifiedIdRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnqualifiedId2949); 

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
    // $ANTLR end "entryRuleUnqualifiedId"


    // $ANTLR start "ruleUnqualifiedId"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1434:1: ruleUnqualifiedId : ( 'UnqualifiedId' ) ;
    public final void ruleUnqualifiedId() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1438:2: ( ( 'UnqualifiedId' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1439:1: ( 'UnqualifiedId' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1439:1: ( 'UnqualifiedId' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1440:1: 'UnqualifiedId'
            {
             before(grammarAccess.getUnqualifiedIdAccess().getUnqualifiedIdKeyword()); 
            match(input,45,FOLLOW_45_in_ruleUnqualifiedId2976); 
             after(grammarAccess.getUnqualifiedIdAccess().getUnqualifiedIdKeyword()); 

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
    // $ANTLR end "ruleUnqualifiedId"


    // $ANTLR start "entryRuleClassName"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1455:1: entryRuleClassName : ruleClassName EOF ;
    public final void entryRuleClassName() throws RecognitionException {
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1456:1: ( ruleClassName EOF )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1457:1: ruleClassName EOF
            {
             before(grammarAccess.getClassNameRule()); 
            pushFollow(FOLLOW_ruleClassName_in_entryRuleClassName3004);
            ruleClassName();

            state._fsp--;

             after(grammarAccess.getClassNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClassName3011); 

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
    // $ANTLR end "entryRuleClassName"


    // $ANTLR start "ruleClassName"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1464:1: ruleClassName : ( 'ClassName' ) ;
    public final void ruleClassName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1468:2: ( ( 'ClassName' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1469:1: ( 'ClassName' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1469:1: ( 'ClassName' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1470:1: 'ClassName'
            {
             before(grammarAccess.getClassNameAccess().getClassNameKeyword()); 
            match(input,46,FOLLOW_46_in_ruleClassName3038); 
             after(grammarAccess.getClassNameAccess().getClassNameKeyword()); 

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
    // $ANTLR end "ruleClassName"


    // $ANTLR start "entryRuleInitializer"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1485:1: entryRuleInitializer : ruleInitializer EOF ;
    public final void entryRuleInitializer() throws RecognitionException {
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1486:1: ( ruleInitializer EOF )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1487:1: ruleInitializer EOF
            {
             before(grammarAccess.getInitializerRule()); 
            pushFollow(FOLLOW_ruleInitializer_in_entryRuleInitializer3066);
            ruleInitializer();

            state._fsp--;

             after(grammarAccess.getInitializerRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInitializer3073); 

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
    // $ANTLR end "entryRuleInitializer"


    // $ANTLR start "ruleInitializer"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1494:1: ruleInitializer : ( 'Initializer' ) ;
    public final void ruleInitializer() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1498:2: ( ( 'Initializer' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1499:1: ( 'Initializer' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1499:1: ( 'Initializer' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1500:1: 'Initializer'
            {
             before(grammarAccess.getInitializerAccess().getInitializerKeyword()); 
            match(input,47,FOLLOW_47_in_ruleInitializer3100); 
             after(grammarAccess.getInitializerAccess().getInitializerKeyword()); 

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
    // $ANTLR end "ruleInitializer"


    // $ANTLR start "rule__Token__Alternatives"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1515:1: rule__Token__Alternatives : ( ( RULE_KEYWORD ) | ( ruleLiteral ) | ( ( rule__Token__Group_2__0 ) ) );
    public final void rule__Token__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1519:1: ( ( RULE_KEYWORD ) | ( ruleLiteral ) | ( ( rule__Token__Group_2__0 ) ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case RULE_KEYWORD:
                {
                alt3=1;
                }
                break;
            case RULE_INT:
            case RULE_CHARACTER_LITERAL:
            case RULE_FLOATING_LITERAL:
            case RULE_STRING_LITERAL:
            case 48:
            case 49:
                {
                alt3=2;
                }
                break;
            case RULE_PREPROCESSING_OP_OR_PUNC:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1520:1: ( RULE_KEYWORD )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1520:1: ( RULE_KEYWORD )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1521:1: RULE_KEYWORD
                    {
                     before(grammarAccess.getTokenAccess().getKEYWORDTerminalRuleCall_0()); 
                    match(input,RULE_KEYWORD,FOLLOW_RULE_KEYWORD_in_rule__Token__Alternatives3137); 
                     after(grammarAccess.getTokenAccess().getKEYWORDTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1526:6: ( ruleLiteral )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1526:6: ( ruleLiteral )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1527:1: ruleLiteral
                    {
                     before(grammarAccess.getTokenAccess().getLiteralParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleLiteral_in_rule__Token__Alternatives3154);
                    ruleLiteral();

                    state._fsp--;

                     after(grammarAccess.getTokenAccess().getLiteralParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1532:6: ( ( rule__Token__Group_2__0 ) )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1532:6: ( ( rule__Token__Group_2__0 ) )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1533:1: ( rule__Token__Group_2__0 )
                    {
                     before(grammarAccess.getTokenAccess().getGroup_2()); 
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1534:1: ( rule__Token__Group_2__0 )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1534:2: rule__Token__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Token__Group_2__0_in_rule__Token__Alternatives3171);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1543:1: rule__Literal__Alternatives : ( ( RULE_INT ) | ( RULE_CHARACTER_LITERAL ) | ( RULE_FLOATING_LITERAL ) | ( RULE_STRING_LITERAL ) | ( ( rule__Literal__Group_4__0 ) ) );
    public final void rule__Literal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1547:1: ( ( RULE_INT ) | ( RULE_CHARACTER_LITERAL ) | ( RULE_FLOATING_LITERAL ) | ( RULE_STRING_LITERAL ) | ( ( rule__Literal__Group_4__0 ) ) )
            int alt4=5;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt4=1;
                }
                break;
            case RULE_CHARACTER_LITERAL:
                {
                alt4=2;
                }
                break;
            case RULE_FLOATING_LITERAL:
                {
                alt4=3;
                }
                break;
            case RULE_STRING_LITERAL:
                {
                alt4=4;
                }
                break;
            case 48:
            case 49:
                {
                alt4=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1548:1: ( RULE_INT )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1548:1: ( RULE_INT )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1549:1: RULE_INT
                    {
                     before(grammarAccess.getLiteralAccess().getINTTerminalRuleCall_0()); 
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Literal__Alternatives3204); 
                     after(grammarAccess.getLiteralAccess().getINTTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1554:6: ( RULE_CHARACTER_LITERAL )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1554:6: ( RULE_CHARACTER_LITERAL )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1555:1: RULE_CHARACTER_LITERAL
                    {
                     before(grammarAccess.getLiteralAccess().getCHARACTER_LITERALTerminalRuleCall_1()); 
                    match(input,RULE_CHARACTER_LITERAL,FOLLOW_RULE_CHARACTER_LITERAL_in_rule__Literal__Alternatives3221); 
                     after(grammarAccess.getLiteralAccess().getCHARACTER_LITERALTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1560:6: ( RULE_FLOATING_LITERAL )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1560:6: ( RULE_FLOATING_LITERAL )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1561:1: RULE_FLOATING_LITERAL
                    {
                     before(grammarAccess.getLiteralAccess().getFLOATING_LITERALTerminalRuleCall_2()); 
                    match(input,RULE_FLOATING_LITERAL,FOLLOW_RULE_FLOATING_LITERAL_in_rule__Literal__Alternatives3238); 
                     after(grammarAccess.getLiteralAccess().getFLOATING_LITERALTerminalRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1566:6: ( RULE_STRING_LITERAL )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1566:6: ( RULE_STRING_LITERAL )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1567:1: RULE_STRING_LITERAL
                    {
                     before(grammarAccess.getLiteralAccess().getSTRING_LITERALTerminalRuleCall_3()); 
                    match(input,RULE_STRING_LITERAL,FOLLOW_RULE_STRING_LITERAL_in_rule__Literal__Alternatives3255); 
                     after(grammarAccess.getLiteralAccess().getSTRING_LITERALTerminalRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1572:6: ( ( rule__Literal__Group_4__0 ) )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1572:6: ( ( rule__Literal__Group_4__0 ) )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1573:1: ( rule__Literal__Group_4__0 )
                    {
                     before(grammarAccess.getLiteralAccess().getGroup_4()); 
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1574:1: ( rule__Literal__Group_4__0 )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1574:2: rule__Literal__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Literal__Group_4__0_in_rule__Literal__Alternatives3272);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1583:1: rule__Literal__Alternatives_4_0 : ( ( 'true' ) | ( 'false' ) );
    public final void rule__Literal__Alternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1587:1: ( ( 'true' ) | ( 'false' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==48) ) {
                alt5=1;
            }
            else if ( (LA5_0==49) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1588:1: ( 'true' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1588:1: ( 'true' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1589:1: 'true'
                    {
                     before(grammarAccess.getLiteralAccess().getTrueKeyword_4_0_0()); 
                    match(input,48,FOLLOW_48_in_rule__Literal__Alternatives_4_03306); 
                     after(grammarAccess.getLiteralAccess().getTrueKeyword_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1596:6: ( 'false' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1596:6: ( 'false' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1597:1: 'false'
                    {
                     before(grammarAccess.getLiteralAccess().getFalseKeyword_4_0_1()); 
                    match(input,49,FOLLOW_49_in_rule__Literal__Alternatives_4_03326); 
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


    // $ANTLR start "rule__ParametersAndQualifiers__Alternatives_4"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1611:1: rule__ParametersAndQualifiers__Alternatives_4 : ( ( 'const' ) | ( 'volatile' ) );
    public final void rule__ParametersAndQualifiers__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1615:1: ( ( 'const' ) | ( 'volatile' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==50) ) {
                alt6=1;
            }
            else if ( (LA6_0==51) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1616:1: ( 'const' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1616:1: ( 'const' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1617:1: 'const'
                    {
                     before(grammarAccess.getParametersAndQualifiersAccess().getConstKeyword_4_0()); 
                    match(input,50,FOLLOW_50_in_rule__ParametersAndQualifiers__Alternatives_43363); 
                     after(grammarAccess.getParametersAndQualifiersAccess().getConstKeyword_4_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1624:6: ( 'volatile' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1624:6: ( 'volatile' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1625:1: 'volatile'
                    {
                     before(grammarAccess.getParametersAndQualifiersAccess().getVolatileKeyword_4_1()); 
                    match(input,51,FOLLOW_51_in_rule__ParametersAndQualifiers__Alternatives_43383); 
                     after(grammarAccess.getParametersAndQualifiersAccess().getVolatileKeyword_4_1()); 

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
    // $ANTLR end "rule__ParametersAndQualifiers__Alternatives_4"


    // $ANTLR start "rule__ParametersAndQualifiers__Alternatives_5"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1637:1: rule__ParametersAndQualifiers__Alternatives_5 : ( ( '&' ) | ( '&&' ) );
    public final void rule__ParametersAndQualifiers__Alternatives_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1641:1: ( ( '&' ) | ( '&&' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==52) ) {
                alt7=1;
            }
            else if ( (LA7_0==53) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1642:1: ( '&' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1642:1: ( '&' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1643:1: '&'
                    {
                     before(grammarAccess.getParametersAndQualifiersAccess().getAmpersandKeyword_5_0()); 
                    match(input,52,FOLLOW_52_in_rule__ParametersAndQualifiers__Alternatives_53418); 
                     after(grammarAccess.getParametersAndQualifiersAccess().getAmpersandKeyword_5_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1650:6: ( '&&' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1650:6: ( '&&' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1651:1: '&&'
                    {
                     before(grammarAccess.getParametersAndQualifiersAccess().getAmpersandAmpersandKeyword_5_1()); 
                    match(input,53,FOLLOW_53_in_rule__ParametersAndQualifiers__Alternatives_53438); 
                     after(grammarAccess.getParametersAndQualifiersAccess().getAmpersandAmpersandKeyword_5_1()); 

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
    // $ANTLR end "rule__ParametersAndQualifiers__Alternatives_5"


    // $ANTLR start "rule__DeclaratorId__Alternatives"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1663:1: rule__DeclaratorId__Alternatives : ( ( ( rule__DeclaratorId__Group_0__0 ) ) | ( ( rule__DeclaratorId__Group_1__0 ) ) );
    public final void rule__DeclaratorId__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1667:1: ( ( ( rule__DeclaratorId__Group_0__0 ) ) | ( ( rule__DeclaratorId__Group_1__0 ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==36||LA8_0==54) ) {
                alt8=1;
            }
            else if ( (LA8_0==39||LA8_0==46||LA8_0==96) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1668:1: ( ( rule__DeclaratorId__Group_0__0 ) )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1668:1: ( ( rule__DeclaratorId__Group_0__0 ) )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1669:1: ( rule__DeclaratorId__Group_0__0 )
                    {
                     before(grammarAccess.getDeclaratorIdAccess().getGroup_0()); 
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1670:1: ( rule__DeclaratorId__Group_0__0 )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1670:2: rule__DeclaratorId__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__DeclaratorId__Group_0__0_in_rule__DeclaratorId__Alternatives3472);
                    rule__DeclaratorId__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDeclaratorIdAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1674:6: ( ( rule__DeclaratorId__Group_1__0 ) )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1674:6: ( ( rule__DeclaratorId__Group_1__0 ) )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1675:1: ( rule__DeclaratorId__Group_1__0 )
                    {
                     before(grammarAccess.getDeclaratorIdAccess().getGroup_1()); 
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1676:1: ( rule__DeclaratorId__Group_1__0 )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1676:2: rule__DeclaratorId__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__DeclaratorId__Group_1__0_in_rule__DeclaratorId__Alternatives3490);
                    rule__DeclaratorId__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDeclaratorIdAccess().getGroup_1()); 

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
    // $ANTLR end "rule__DeclaratorId__Alternatives"


    // $ANTLR start "rule__ParameterDeclarationClause__Alternatives"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1685:1: rule__ParameterDeclarationClause__Alternatives : ( ( '...' ) | ( ( rule__ParameterDeclarationClause__Group_1__0 ) ) );
    public final void rule__ParameterDeclarationClause__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1689:1: ( ( '...' ) | ( ( rule__ParameterDeclarationClause__Group_1__0 ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==54) ) {
                alt9=1;
            }
            else if ( (LA9_0==37||LA9_0==97) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1690:1: ( '...' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1690:1: ( '...' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1691:1: '...'
                    {
                     before(grammarAccess.getParameterDeclarationClauseAccess().getFullStopFullStopFullStopKeyword_0()); 
                    match(input,54,FOLLOW_54_in_rule__ParameterDeclarationClause__Alternatives3524); 
                     after(grammarAccess.getParameterDeclarationClauseAccess().getFullStopFullStopFullStopKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1698:6: ( ( rule__ParameterDeclarationClause__Group_1__0 ) )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1698:6: ( ( rule__ParameterDeclarationClause__Group_1__0 ) )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1699:1: ( rule__ParameterDeclarationClause__Group_1__0 )
                    {
                     before(grammarAccess.getParameterDeclarationClauseAccess().getGroup_1()); 
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1700:1: ( rule__ParameterDeclarationClause__Group_1__0 )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1700:2: rule__ParameterDeclarationClause__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__ParameterDeclarationClause__Group_1__0_in_rule__ParameterDeclarationClause__Alternatives3543);
                    rule__ParameterDeclarationClause__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getParameterDeclarationClauseAccess().getGroup_1()); 

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
    // $ANTLR end "rule__ParameterDeclarationClause__Alternatives"


    // $ANTLR start "rule__FunctionDefinition__Alternatives_3"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1709:1: rule__FunctionDefinition__Alternatives_3 : ( ( ruleFunctionBody ) | ( ( rule__FunctionDefinition__Group_3_1__0 ) ) | ( ( rule__FunctionDefinition__Group_3_2__0 ) ) );
    public final void rule__FunctionDefinition__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1713:1: ( ( ruleFunctionBody ) | ( ( rule__FunctionDefinition__Group_3_1__0 ) ) | ( ( rule__FunctionDefinition__Group_3_2__0 ) ) )
            int alt10=3;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=42 && LA10_0<=43)||LA10_0==106) ) {
                alt10=1;
            }
            else if ( (LA10_0==66) ) {
                int LA10_2 = input.LA(2);

                if ( (LA10_2==101) ) {
                    alt10=2;
                }
                else if ( (LA10_2==56) ) {
                    alt10=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 2, input);

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
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1714:1: ( ruleFunctionBody )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1714:1: ( ruleFunctionBody )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1715:1: ruleFunctionBody
                    {
                     before(grammarAccess.getFunctionDefinitionAccess().getFunctionBodyParserRuleCall_3_0()); 
                    pushFollow(FOLLOW_ruleFunctionBody_in_rule__FunctionDefinition__Alternatives_33576);
                    ruleFunctionBody();

                    state._fsp--;

                     after(grammarAccess.getFunctionDefinitionAccess().getFunctionBodyParserRuleCall_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1720:6: ( ( rule__FunctionDefinition__Group_3_1__0 ) )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1720:6: ( ( rule__FunctionDefinition__Group_3_1__0 ) )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1721:1: ( rule__FunctionDefinition__Group_3_1__0 )
                    {
                     before(grammarAccess.getFunctionDefinitionAccess().getGroup_3_1()); 
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1722:1: ( rule__FunctionDefinition__Group_3_1__0 )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1722:2: rule__FunctionDefinition__Group_3_1__0
                    {
                    pushFollow(FOLLOW_rule__FunctionDefinition__Group_3_1__0_in_rule__FunctionDefinition__Alternatives_33593);
                    rule__FunctionDefinition__Group_3_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFunctionDefinitionAccess().getGroup_3_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1726:6: ( ( rule__FunctionDefinition__Group_3_2__0 ) )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1726:6: ( ( rule__FunctionDefinition__Group_3_2__0 ) )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1727:1: ( rule__FunctionDefinition__Group_3_2__0 )
                    {
                     before(grammarAccess.getFunctionDefinitionAccess().getGroup_3_2()); 
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1728:1: ( rule__FunctionDefinition__Group_3_2__0 )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1728:2: rule__FunctionDefinition__Group_3_2__0
                    {
                    pushFollow(FOLLOW_rule__FunctionDefinition__Group_3_2__0_in_rule__FunctionDefinition__Alternatives_33611);
                    rule__FunctionDefinition__Group_3_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFunctionDefinitionAccess().getGroup_3_2()); 

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
    // $ANTLR end "rule__FunctionDefinition__Alternatives_3"


    // $ANTLR start "rule__FunctionBody__Alternatives"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1737:1: rule__FunctionBody__Alternatives : ( ( ( rule__FunctionBody__Group_0__0 ) ) | ( ruleFunctionTryBlock ) );
    public final void rule__FunctionBody__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1741:1: ( ( ( rule__FunctionBody__Group_0__0 ) ) | ( ruleFunctionTryBlock ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=42 && LA11_0<=43)) ) {
                alt11=1;
            }
            else if ( (LA11_0==106) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1742:1: ( ( rule__FunctionBody__Group_0__0 ) )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1742:1: ( ( rule__FunctionBody__Group_0__0 ) )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1743:1: ( rule__FunctionBody__Group_0__0 )
                    {
                     before(grammarAccess.getFunctionBodyAccess().getGroup_0()); 
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1744:1: ( rule__FunctionBody__Group_0__0 )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1744:2: rule__FunctionBody__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__FunctionBody__Group_0__0_in_rule__FunctionBody__Alternatives3644);
                    rule__FunctionBody__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFunctionBodyAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1748:6: ( ruleFunctionTryBlock )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1748:6: ( ruleFunctionTryBlock )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1749:1: ruleFunctionTryBlock
                    {
                     before(grammarAccess.getFunctionBodyAccess().getFunctionTryBlockParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleFunctionTryBlock_in_rule__FunctionBody__Alternatives3662);
                    ruleFunctionTryBlock();

                    state._fsp--;

                     after(grammarAccess.getFunctionBodyAccess().getFunctionTryBlockParserRuleCall_1()); 

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
    // $ANTLR end "rule__FunctionBody__Alternatives"


    // $ANTLR start "rule__OperatorFunctionId__Alternatives_2_1"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1759:1: rule__OperatorFunctionId__Alternatives_2_1 : ( ( ruleConstantExpression ) | ( ruleTypeSpecifier ) | ( ruleIdExpression ) );
    public final void rule__OperatorFunctionId__Alternatives_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1763:1: ( ( ruleConstantExpression ) | ( ruleTypeSpecifier ) | ( ruleIdExpression ) )
            int alt12=3;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt12=1;
                }
                break;
            case 41:
                {
                alt12=2;
                }
                break;
            case 36:
                {
                alt12=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1764:1: ( ruleConstantExpression )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1764:1: ( ruleConstantExpression )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1765:1: ruleConstantExpression
                    {
                     before(grammarAccess.getOperatorFunctionIdAccess().getConstantExpressionParserRuleCall_2_1_0()); 
                    pushFollow(FOLLOW_ruleConstantExpression_in_rule__OperatorFunctionId__Alternatives_2_13694);
                    ruleConstantExpression();

                    state._fsp--;

                     after(grammarAccess.getOperatorFunctionIdAccess().getConstantExpressionParserRuleCall_2_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1770:6: ( ruleTypeSpecifier )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1770:6: ( ruleTypeSpecifier )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1771:1: ruleTypeSpecifier
                    {
                     before(grammarAccess.getOperatorFunctionIdAccess().getTypeSpecifierParserRuleCall_2_1_1()); 
                    pushFollow(FOLLOW_ruleTypeSpecifier_in_rule__OperatorFunctionId__Alternatives_2_13711);
                    ruleTypeSpecifier();

                    state._fsp--;

                     after(grammarAccess.getOperatorFunctionIdAccess().getTypeSpecifierParserRuleCall_2_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1776:6: ( ruleIdExpression )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1776:6: ( ruleIdExpression )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1777:1: ruleIdExpression
                    {
                     before(grammarAccess.getOperatorFunctionIdAccess().getIdExpressionParserRuleCall_2_1_2()); 
                    pushFollow(FOLLOW_ruleIdExpression_in_rule__OperatorFunctionId__Alternatives_2_13728);
                    ruleIdExpression();

                    state._fsp--;

                     after(grammarAccess.getOperatorFunctionIdAccess().getIdExpressionParserRuleCall_2_1_2()); 

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
    // $ANTLR end "rule__OperatorFunctionId__Alternatives_2_1"


    // $ANTLR start "rule__OverloadableOperator__Alternatives"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1787:1: rule__OverloadableOperator__Alternatives : ( ( 'new' ) | ( 'delete' ) | ( ( rule__OverloadableOperator__Group_2__0 ) ) | ( ( rule__OverloadableOperator__Group_3__0 ) ) | ( '+' ) | ( '-' ) | ( '*' ) | ( '/' ) | ( '%' ) | ( '^' ) | ( '&' ) | ( '|' ) | ( '~' ) | ( '!' ) | ( '=' ) | ( '<' ) | ( '>' ) | ( '+=' ) | ( '-=' ) | ( '*=' ) | ( '/=' ) | ( '%=' ) | ( '^=' ) | ( '&=' ) | ( '|=' ) | ( '<<' ) | ( '>>' ) | ( '>>=' ) | ( '<<=' ) | ( '==' ) | ( '!=' ) | ( '<=' ) | ( '>=' ) | ( '&&' ) | ( '||' ) | ( '++' ) | ( '--' ) | ( ',' ) | ( '->*' ) | ( '->' ) | ( '()' ) | ( '[]' ) );
    public final void rule__OverloadableOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1791:1: ( ( 'new' ) | ( 'delete' ) | ( ( rule__OverloadableOperator__Group_2__0 ) ) | ( ( rule__OverloadableOperator__Group_3__0 ) ) | ( '+' ) | ( '-' ) | ( '*' ) | ( '/' ) | ( '%' ) | ( '^' ) | ( '&' ) | ( '|' ) | ( '~' ) | ( '!' ) | ( '=' ) | ( '<' ) | ( '>' ) | ( '+=' ) | ( '-=' ) | ( '*=' ) | ( '/=' ) | ( '%=' ) | ( '^=' ) | ( '&=' ) | ( '|=' ) | ( '<<' ) | ( '>>' ) | ( '>>=' ) | ( '<<=' ) | ( '==' ) | ( '!=' ) | ( '<=' ) | ( '>=' ) | ( '&&' ) | ( '||' ) | ( '++' ) | ( '--' ) | ( ',' ) | ( '->*' ) | ( '->' ) | ( '()' ) | ( '[]' ) )
            int alt13=42;
            alt13 = dfa13.predict(input);
            switch (alt13) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1792:1: ( 'new' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1792:1: ( 'new' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1793:1: 'new'
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getNewKeyword_0()); 
                    match(input,55,FOLLOW_55_in_rule__OverloadableOperator__Alternatives3761); 
                     after(grammarAccess.getOverloadableOperatorAccess().getNewKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1800:6: ( 'delete' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1800:6: ( 'delete' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1801:1: 'delete'
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getDeleteKeyword_1()); 
                    match(input,56,FOLLOW_56_in_rule__OverloadableOperator__Alternatives3781); 
                     after(grammarAccess.getOverloadableOperatorAccess().getDeleteKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1808:6: ( ( rule__OverloadableOperator__Group_2__0 ) )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1808:6: ( ( rule__OverloadableOperator__Group_2__0 ) )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1809:1: ( rule__OverloadableOperator__Group_2__0 )
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getGroup_2()); 
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1810:1: ( rule__OverloadableOperator__Group_2__0 )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1810:2: rule__OverloadableOperator__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__OverloadableOperator__Group_2__0_in_rule__OverloadableOperator__Alternatives3800);
                    rule__OverloadableOperator__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getOverloadableOperatorAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1814:6: ( ( rule__OverloadableOperator__Group_3__0 ) )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1814:6: ( ( rule__OverloadableOperator__Group_3__0 ) )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1815:1: ( rule__OverloadableOperator__Group_3__0 )
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getGroup_3()); 
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1816:1: ( rule__OverloadableOperator__Group_3__0 )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1816:2: rule__OverloadableOperator__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__OverloadableOperator__Group_3__0_in_rule__OverloadableOperator__Alternatives3818);
                    rule__OverloadableOperator__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getOverloadableOperatorAccess().getGroup_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1820:6: ( '+' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1820:6: ( '+' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1821:1: '+'
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getPlusSignKeyword_4()); 
                    match(input,57,FOLLOW_57_in_rule__OverloadableOperator__Alternatives3837); 
                     after(grammarAccess.getOverloadableOperatorAccess().getPlusSignKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1828:6: ( '-' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1828:6: ( '-' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1829:1: '-'
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getHyphenMinusKeyword_5()); 
                    match(input,58,FOLLOW_58_in_rule__OverloadableOperator__Alternatives3857); 
                     after(grammarAccess.getOverloadableOperatorAccess().getHyphenMinusKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1836:6: ( '*' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1836:6: ( '*' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1837:1: '*'
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getAsteriskKeyword_6()); 
                    match(input,59,FOLLOW_59_in_rule__OverloadableOperator__Alternatives3877); 
                     after(grammarAccess.getOverloadableOperatorAccess().getAsteriskKeyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1844:6: ( '/' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1844:6: ( '/' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1845:1: '/'
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getSolidusKeyword_7()); 
                    match(input,60,FOLLOW_60_in_rule__OverloadableOperator__Alternatives3897); 
                     after(grammarAccess.getOverloadableOperatorAccess().getSolidusKeyword_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1852:6: ( '%' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1852:6: ( '%' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1853:1: '%'
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getPercentSignKeyword_8()); 
                    match(input,61,FOLLOW_61_in_rule__OverloadableOperator__Alternatives3917); 
                     after(grammarAccess.getOverloadableOperatorAccess().getPercentSignKeyword_8()); 

                    }


                    }
                    break;
                case 10 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1860:6: ( '^' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1860:6: ( '^' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1861:1: '^'
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getCircumflexAccentKeyword_9()); 
                    match(input,62,FOLLOW_62_in_rule__OverloadableOperator__Alternatives3937); 
                     after(grammarAccess.getOverloadableOperatorAccess().getCircumflexAccentKeyword_9()); 

                    }


                    }
                    break;
                case 11 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1868:6: ( '&' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1868:6: ( '&' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1869:1: '&'
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getAmpersandKeyword_10()); 
                    match(input,52,FOLLOW_52_in_rule__OverloadableOperator__Alternatives3957); 
                     after(grammarAccess.getOverloadableOperatorAccess().getAmpersandKeyword_10()); 

                    }


                    }
                    break;
                case 12 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1876:6: ( '|' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1876:6: ( '|' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1877:1: '|'
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getVerticalLineKeyword_11()); 
                    match(input,63,FOLLOW_63_in_rule__OverloadableOperator__Alternatives3977); 
                     after(grammarAccess.getOverloadableOperatorAccess().getVerticalLineKeyword_11()); 

                    }


                    }
                    break;
                case 13 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1884:6: ( '~' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1884:6: ( '~' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1885:1: '~'
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getTildeKeyword_12()); 
                    match(input,64,FOLLOW_64_in_rule__OverloadableOperator__Alternatives3997); 
                     after(grammarAccess.getOverloadableOperatorAccess().getTildeKeyword_12()); 

                    }


                    }
                    break;
                case 14 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1892:6: ( '!' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1892:6: ( '!' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1893:1: '!'
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getExclamationMarkKeyword_13()); 
                    match(input,65,FOLLOW_65_in_rule__OverloadableOperator__Alternatives4017); 
                     after(grammarAccess.getOverloadableOperatorAccess().getExclamationMarkKeyword_13()); 

                    }


                    }
                    break;
                case 15 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1900:6: ( '=' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1900:6: ( '=' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1901:1: '='
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getEqualsSignKeyword_14()); 
                    match(input,66,FOLLOW_66_in_rule__OverloadableOperator__Alternatives4037); 
                     after(grammarAccess.getOverloadableOperatorAccess().getEqualsSignKeyword_14()); 

                    }


                    }
                    break;
                case 16 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1908:6: ( '<' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1908:6: ( '<' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1909:1: '<'
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getLessThanSignKeyword_15()); 
                    match(input,67,FOLLOW_67_in_rule__OverloadableOperator__Alternatives4057); 
                     after(grammarAccess.getOverloadableOperatorAccess().getLessThanSignKeyword_15()); 

                    }


                    }
                    break;
                case 17 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1916:6: ( '>' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1916:6: ( '>' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1917:1: '>'
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getGreaterThanSignKeyword_16()); 
                    match(input,68,FOLLOW_68_in_rule__OverloadableOperator__Alternatives4077); 
                     after(grammarAccess.getOverloadableOperatorAccess().getGreaterThanSignKeyword_16()); 

                    }


                    }
                    break;
                case 18 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1924:6: ( '+=' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1924:6: ( '+=' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1925:1: '+='
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getPlusSignEqualsSignKeyword_17()); 
                    match(input,69,FOLLOW_69_in_rule__OverloadableOperator__Alternatives4097); 
                     after(grammarAccess.getOverloadableOperatorAccess().getPlusSignEqualsSignKeyword_17()); 

                    }


                    }
                    break;
                case 19 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1932:6: ( '-=' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1932:6: ( '-=' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1933:1: '-='
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getHyphenMinusEqualsSignKeyword_18()); 
                    match(input,70,FOLLOW_70_in_rule__OverloadableOperator__Alternatives4117); 
                     after(grammarAccess.getOverloadableOperatorAccess().getHyphenMinusEqualsSignKeyword_18()); 

                    }


                    }
                    break;
                case 20 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1940:6: ( '*=' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1940:6: ( '*=' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1941:1: '*='
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getAsteriskEqualsSignKeyword_19()); 
                    match(input,71,FOLLOW_71_in_rule__OverloadableOperator__Alternatives4137); 
                     after(grammarAccess.getOverloadableOperatorAccess().getAsteriskEqualsSignKeyword_19()); 

                    }


                    }
                    break;
                case 21 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1948:6: ( '/=' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1948:6: ( '/=' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1949:1: '/='
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getSolidusEqualsSignKeyword_20()); 
                    match(input,72,FOLLOW_72_in_rule__OverloadableOperator__Alternatives4157); 
                     after(grammarAccess.getOverloadableOperatorAccess().getSolidusEqualsSignKeyword_20()); 

                    }


                    }
                    break;
                case 22 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1956:6: ( '%=' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1956:6: ( '%=' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1957:1: '%='
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getPercentSignEqualsSignKeyword_21()); 
                    match(input,73,FOLLOW_73_in_rule__OverloadableOperator__Alternatives4177); 
                     after(grammarAccess.getOverloadableOperatorAccess().getPercentSignEqualsSignKeyword_21()); 

                    }


                    }
                    break;
                case 23 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1964:6: ( '^=' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1964:6: ( '^=' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1965:1: '^='
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getCircumflexAccentEqualsSignKeyword_22()); 
                    match(input,74,FOLLOW_74_in_rule__OverloadableOperator__Alternatives4197); 
                     after(grammarAccess.getOverloadableOperatorAccess().getCircumflexAccentEqualsSignKeyword_22()); 

                    }


                    }
                    break;
                case 24 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1972:6: ( '&=' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1972:6: ( '&=' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1973:1: '&='
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getAmpersandEqualsSignKeyword_23()); 
                    match(input,75,FOLLOW_75_in_rule__OverloadableOperator__Alternatives4217); 
                     after(grammarAccess.getOverloadableOperatorAccess().getAmpersandEqualsSignKeyword_23()); 

                    }


                    }
                    break;
                case 25 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1980:6: ( '|=' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1980:6: ( '|=' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1981:1: '|='
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getVerticalLineEqualsSignKeyword_24()); 
                    match(input,76,FOLLOW_76_in_rule__OverloadableOperator__Alternatives4237); 
                     after(grammarAccess.getOverloadableOperatorAccess().getVerticalLineEqualsSignKeyword_24()); 

                    }


                    }
                    break;
                case 26 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1988:6: ( '<<' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1988:6: ( '<<' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1989:1: '<<'
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getLessThanSignLessThanSignKeyword_25()); 
                    match(input,77,FOLLOW_77_in_rule__OverloadableOperator__Alternatives4257); 
                     after(grammarAccess.getOverloadableOperatorAccess().getLessThanSignLessThanSignKeyword_25()); 

                    }


                    }
                    break;
                case 27 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1996:6: ( '>>' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1996:6: ( '>>' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1997:1: '>>'
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getGreaterThanSignGreaterThanSignKeyword_26()); 
                    match(input,78,FOLLOW_78_in_rule__OverloadableOperator__Alternatives4277); 
                     after(grammarAccess.getOverloadableOperatorAccess().getGreaterThanSignGreaterThanSignKeyword_26()); 

                    }


                    }
                    break;
                case 28 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2004:6: ( '>>=' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2004:6: ( '>>=' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2005:1: '>>='
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getGreaterThanSignGreaterThanSignEqualsSignKeyword_27()); 
                    match(input,79,FOLLOW_79_in_rule__OverloadableOperator__Alternatives4297); 
                     after(grammarAccess.getOverloadableOperatorAccess().getGreaterThanSignGreaterThanSignEqualsSignKeyword_27()); 

                    }


                    }
                    break;
                case 29 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2012:6: ( '<<=' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2012:6: ( '<<=' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2013:1: '<<='
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getLessThanSignLessThanSignEqualsSignKeyword_28()); 
                    match(input,80,FOLLOW_80_in_rule__OverloadableOperator__Alternatives4317); 
                     after(grammarAccess.getOverloadableOperatorAccess().getLessThanSignLessThanSignEqualsSignKeyword_28()); 

                    }


                    }
                    break;
                case 30 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2020:6: ( '==' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2020:6: ( '==' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2021:1: '=='
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getEqualsSignEqualsSignKeyword_29()); 
                    match(input,81,FOLLOW_81_in_rule__OverloadableOperator__Alternatives4337); 
                     after(grammarAccess.getOverloadableOperatorAccess().getEqualsSignEqualsSignKeyword_29()); 

                    }


                    }
                    break;
                case 31 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2028:6: ( '!=' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2028:6: ( '!=' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2029:1: '!='
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getExclamationMarkEqualsSignKeyword_30()); 
                    match(input,82,FOLLOW_82_in_rule__OverloadableOperator__Alternatives4357); 
                     after(grammarAccess.getOverloadableOperatorAccess().getExclamationMarkEqualsSignKeyword_30()); 

                    }


                    }
                    break;
                case 32 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2036:6: ( '<=' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2036:6: ( '<=' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2037:1: '<='
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getLessThanSignEqualsSignKeyword_31()); 
                    match(input,83,FOLLOW_83_in_rule__OverloadableOperator__Alternatives4377); 
                     after(grammarAccess.getOverloadableOperatorAccess().getLessThanSignEqualsSignKeyword_31()); 

                    }


                    }
                    break;
                case 33 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2044:6: ( '>=' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2044:6: ( '>=' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2045:1: '>='
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getGreaterThanSignEqualsSignKeyword_32()); 
                    match(input,84,FOLLOW_84_in_rule__OverloadableOperator__Alternatives4397); 
                     after(grammarAccess.getOverloadableOperatorAccess().getGreaterThanSignEqualsSignKeyword_32()); 

                    }


                    }
                    break;
                case 34 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2052:6: ( '&&' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2052:6: ( '&&' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2053:1: '&&'
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getAmpersandAmpersandKeyword_33()); 
                    match(input,53,FOLLOW_53_in_rule__OverloadableOperator__Alternatives4417); 
                     after(grammarAccess.getOverloadableOperatorAccess().getAmpersandAmpersandKeyword_33()); 

                    }


                    }
                    break;
                case 35 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2060:6: ( '||' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2060:6: ( '||' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2061:1: '||'
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getVerticalLineVerticalLineKeyword_34()); 
                    match(input,85,FOLLOW_85_in_rule__OverloadableOperator__Alternatives4437); 
                     after(grammarAccess.getOverloadableOperatorAccess().getVerticalLineVerticalLineKeyword_34()); 

                    }


                    }
                    break;
                case 36 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2068:6: ( '++' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2068:6: ( '++' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2069:1: '++'
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getPlusSignPlusSignKeyword_35()); 
                    match(input,86,FOLLOW_86_in_rule__OverloadableOperator__Alternatives4457); 
                     after(grammarAccess.getOverloadableOperatorAccess().getPlusSignPlusSignKeyword_35()); 

                    }


                    }
                    break;
                case 37 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2076:6: ( '--' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2076:6: ( '--' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2077:1: '--'
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getHyphenMinusHyphenMinusKeyword_36()); 
                    match(input,87,FOLLOW_87_in_rule__OverloadableOperator__Alternatives4477); 
                     after(grammarAccess.getOverloadableOperatorAccess().getHyphenMinusHyphenMinusKeyword_36()); 

                    }


                    }
                    break;
                case 38 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2084:6: ( ',' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2084:6: ( ',' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2085:1: ','
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getCommaKeyword_37()); 
                    match(input,88,FOLLOW_88_in_rule__OverloadableOperator__Alternatives4497); 
                     after(grammarAccess.getOverloadableOperatorAccess().getCommaKeyword_37()); 

                    }


                    }
                    break;
                case 39 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2092:6: ( '->*' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2092:6: ( '->*' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2093:1: '->*'
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getHyphenMinusGreaterThanSignAsteriskKeyword_38()); 
                    match(input,89,FOLLOW_89_in_rule__OverloadableOperator__Alternatives4517); 
                     after(grammarAccess.getOverloadableOperatorAccess().getHyphenMinusGreaterThanSignAsteriskKeyword_38()); 

                    }


                    }
                    break;
                case 40 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2100:6: ( '->' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2100:6: ( '->' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2101:1: '->'
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getHyphenMinusGreaterThanSignKeyword_39()); 
                    match(input,90,FOLLOW_90_in_rule__OverloadableOperator__Alternatives4537); 
                     after(grammarAccess.getOverloadableOperatorAccess().getHyphenMinusGreaterThanSignKeyword_39()); 

                    }


                    }
                    break;
                case 41 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2108:6: ( '()' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2108:6: ( '()' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2109:1: '()'
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getLeftParenthesisRightParenthesisKeyword_40()); 
                    match(input,91,FOLLOW_91_in_rule__OverloadableOperator__Alternatives4557); 
                     after(grammarAccess.getOverloadableOperatorAccess().getLeftParenthesisRightParenthesisKeyword_40()); 

                    }


                    }
                    break;
                case 42 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2116:6: ( '[]' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2116:6: ( '[]' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2117:1: '[]'
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getLeftSquareBracketRightSquareBracketKeyword_41()); 
                    match(input,92,FOLLOW_92_in_rule__OverloadableOperator__Alternatives4577); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2129:1: rule__TemplateParameter__Alternatives : ( ( ruleTypeParameter ) | ( ruleParameterDeclaration ) );
    public final void rule__TemplateParameter__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2133:1: ( ( ruleTypeParameter ) | ( ruleParameterDeclaration ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=93 && LA14_0<=94)) ) {
                alt14=1;
            }
            else if ( (LA14_0==37||LA14_0==97) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2134:1: ( ruleTypeParameter )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2134:1: ( ruleTypeParameter )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2135:1: ruleTypeParameter
                    {
                     before(grammarAccess.getTemplateParameterAccess().getTypeParameterParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleTypeParameter_in_rule__TemplateParameter__Alternatives4611);
                    ruleTypeParameter();

                    state._fsp--;

                     after(grammarAccess.getTemplateParameterAccess().getTypeParameterParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2140:6: ( ruleParameterDeclaration )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2140:6: ( ruleParameterDeclaration )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2141:1: ruleParameterDeclaration
                    {
                     before(grammarAccess.getTemplateParameterAccess().getParameterDeclarationParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleParameterDeclaration_in_rule__TemplateParameter__Alternatives4628);
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


    // $ANTLR start "rule__TypeParameter__Alternatives_0"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2151:1: rule__TypeParameter__Alternatives_0 : ( ( 'class' ) | ( 'typename' ) );
    public final void rule__TypeParameter__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2155:1: ( ( 'class' ) | ( 'typename' ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==93) ) {
                alt15=1;
            }
            else if ( (LA15_0==94) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2156:1: ( 'class' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2156:1: ( 'class' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2157:1: 'class'
                    {
                     before(grammarAccess.getTypeParameterAccess().getClassKeyword_0_0()); 
                    match(input,93,FOLLOW_93_in_rule__TypeParameter__Alternatives_04661); 
                     after(grammarAccess.getTypeParameterAccess().getClassKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2164:6: ( 'typename' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2164:6: ( 'typename' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2165:1: 'typename'
                    {
                     before(grammarAccess.getTypeParameterAccess().getTypenameKeyword_0_1()); 
                    match(input,94,FOLLOW_94_in_rule__TypeParameter__Alternatives_04681); 
                     after(grammarAccess.getTypeParameterAccess().getTypenameKeyword_0_1()); 

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
    // $ANTLR end "rule__TypeParameter__Alternatives_0"


    // $ANTLR start "rule__TypeParameter__Alternatives_1"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2177:1: rule__TypeParameter__Alternatives_1 : ( ( ( rule__TypeParameter__Group_1_0__0 ) ) | ( ( rule__TypeParameter__Group_1_1__0 ) ) );
    public final void rule__TypeParameter__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2181:1: ( ( ( rule__TypeParameter__Group_1_0__0 ) ) | ( ( rule__TypeParameter__Group_1_1__0 ) ) )
            int alt16=2;
            switch ( input.LA(1) ) {
            case EOF:
            case 54:
            case 68:
            case 88:
                {
                alt16=1;
                }
                break;
            case RULE_ID:
                {
                int LA16_2 = input.LA(2);

                if ( (LA16_2==66) ) {
                    alt16=2;
                }
                else if ( (LA16_2==EOF||LA16_2==68||LA16_2==88) ) {
                    alt16=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 2, input);

                    throw nvae;
                }
                }
                break;
            case 66:
                {
                alt16=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2182:1: ( ( rule__TypeParameter__Group_1_0__0 ) )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2182:1: ( ( rule__TypeParameter__Group_1_0__0 ) )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2183:1: ( rule__TypeParameter__Group_1_0__0 )
                    {
                     before(grammarAccess.getTypeParameterAccess().getGroup_1_0()); 
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2184:1: ( rule__TypeParameter__Group_1_0__0 )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2184:2: rule__TypeParameter__Group_1_0__0
                    {
                    pushFollow(FOLLOW_rule__TypeParameter__Group_1_0__0_in_rule__TypeParameter__Alternatives_14715);
                    rule__TypeParameter__Group_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeParameterAccess().getGroup_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2188:6: ( ( rule__TypeParameter__Group_1_1__0 ) )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2188:6: ( ( rule__TypeParameter__Group_1_1__0 ) )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2189:1: ( rule__TypeParameter__Group_1_1__0 )
                    {
                     before(grammarAccess.getTypeParameterAccess().getGroup_1_1()); 
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2190:1: ( rule__TypeParameter__Group_1_1__0 )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2190:2: rule__TypeParameter__Group_1_1__0
                    {
                    pushFollow(FOLLOW_rule__TypeParameter__Group_1_1__0_in_rule__TypeParameter__Alternatives_14733);
                    rule__TypeParameter__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeParameterAccess().getGroup_1_1()); 

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
    // $ANTLR end "rule__TypeParameter__Alternatives_1"


    // $ANTLR start "rule__TemplateArgument__Alternatives"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2200:1: rule__TemplateArgument__Alternatives : ( ( ruleConstantExpression ) | ( ruleTypeId ) | ( ruleIdExpression ) );
    public final void rule__TemplateArgument__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2204:1: ( ( ruleConstantExpression ) | ( ruleTypeId ) | ( ruleIdExpression ) )
            int alt17=3;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt17=1;
                }
                break;
            case 41:
                {
                alt17=2;
                }
                break;
            case 36:
                {
                alt17=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2205:1: ( ruleConstantExpression )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2205:1: ( ruleConstantExpression )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2206:1: ruleConstantExpression
                    {
                     before(grammarAccess.getTemplateArgumentAccess().getConstantExpressionParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleConstantExpression_in_rule__TemplateArgument__Alternatives4767);
                    ruleConstantExpression();

                    state._fsp--;

                     after(grammarAccess.getTemplateArgumentAccess().getConstantExpressionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2211:6: ( ruleTypeId )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2211:6: ( ruleTypeId )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2212:1: ruleTypeId
                    {
                     before(grammarAccess.getTemplateArgumentAccess().getTypeIdParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleTypeId_in_rule__TemplateArgument__Alternatives4784);
                    ruleTypeId();

                    state._fsp--;

                     after(grammarAccess.getTemplateArgumentAccess().getTypeIdParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2217:6: ( ruleIdExpression )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2217:6: ( ruleIdExpression )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2218:1: ruleIdExpression
                    {
                     before(grammarAccess.getTemplateArgumentAccess().getIdExpressionParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleIdExpression_in_rule__TemplateArgument__Alternatives4801);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2229:1: rule__ExceptionDeclaration__Alternatives : ( ( ( rule__ExceptionDeclaration__Group_0__0 ) ) | ( '...' ) );
    public final void rule__ExceptionDeclaration__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2233:1: ( ( ( rule__ExceptionDeclaration__Group_0__0 ) ) | ( '...' ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==41||LA18_0==97) ) {
                alt18=1;
            }
            else if ( (LA18_0==54) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2234:1: ( ( rule__ExceptionDeclaration__Group_0__0 ) )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2234:1: ( ( rule__ExceptionDeclaration__Group_0__0 ) )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2235:1: ( rule__ExceptionDeclaration__Group_0__0 )
                    {
                     before(grammarAccess.getExceptionDeclarationAccess().getGroup_0()); 
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2236:1: ( rule__ExceptionDeclaration__Group_0__0 )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2236:2: rule__ExceptionDeclaration__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__ExceptionDeclaration__Group_0__0_in_rule__ExceptionDeclaration__Alternatives4834);
                    rule__ExceptionDeclaration__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExceptionDeclarationAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2240:6: ( '...' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2240:6: ( '...' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2241:1: '...'
                    {
                     before(grammarAccess.getExceptionDeclarationAccess().getFullStopFullStopFullStopKeyword_1()); 
                    match(input,54,FOLLOW_54_in_rule__ExceptionDeclaration__Alternatives4853); 
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


    // $ANTLR start "rule__ExceptionSpecification__Alternatives"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2253:1: rule__ExceptionSpecification__Alternatives : ( ( ruleDynamicExceptionSpecification ) | ( ruleNoexceptSpecification ) );
    public final void rule__ExceptionSpecification__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2257:1: ( ( ruleDynamicExceptionSpecification ) | ( ruleNoexceptSpecification ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==108) ) {
                alt19=1;
            }
            else if ( (LA19_0==109) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2258:1: ( ruleDynamicExceptionSpecification )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2258:1: ( ruleDynamicExceptionSpecification )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2259:1: ruleDynamicExceptionSpecification
                    {
                     before(grammarAccess.getExceptionSpecificationAccess().getDynamicExceptionSpecificationParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleDynamicExceptionSpecification_in_rule__ExceptionSpecification__Alternatives4887);
                    ruleDynamicExceptionSpecification();

                    state._fsp--;

                     after(grammarAccess.getExceptionSpecificationAccess().getDynamicExceptionSpecificationParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2264:6: ( ruleNoexceptSpecification )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2264:6: ( ruleNoexceptSpecification )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2265:1: ruleNoexceptSpecification
                    {
                     before(grammarAccess.getExceptionSpecificationAccess().getNoexceptSpecificationParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleNoexceptSpecification_in_rule__ExceptionSpecification__Alternatives4904);
                    ruleNoexceptSpecification();

                    state._fsp--;

                     after(grammarAccess.getExceptionSpecificationAccess().getNoexceptSpecificationParserRuleCall_1()); 

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
    // $ANTLR end "rule__ExceptionSpecification__Alternatives"


    // $ANTLR start "rule__Token__Group_2__0"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2277:1: rule__Token__Group_2__0 : rule__Token__Group_2__0__Impl rule__Token__Group_2__1 ;
    public final void rule__Token__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2281:1: ( rule__Token__Group_2__0__Impl rule__Token__Group_2__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2282:2: rule__Token__Group_2__0__Impl rule__Token__Group_2__1
            {
            pushFollow(FOLLOW_rule__Token__Group_2__0__Impl_in_rule__Token__Group_2__04934);
            rule__Token__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Token__Group_2__1_in_rule__Token__Group_2__04937);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2289:1: rule__Token__Group_2__0__Impl : ( RULE_PREPROCESSING_OP_OR_PUNC ) ;
    public final void rule__Token__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2293:1: ( ( RULE_PREPROCESSING_OP_OR_PUNC ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2294:1: ( RULE_PREPROCESSING_OP_OR_PUNC )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2294:1: ( RULE_PREPROCESSING_OP_OR_PUNC )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2295:1: RULE_PREPROCESSING_OP_OR_PUNC
            {
             before(grammarAccess.getTokenAccess().getPREPROCESSING_OP_OR_PUNCTerminalRuleCall_2_0()); 
            match(input,RULE_PREPROCESSING_OP_OR_PUNC,FOLLOW_RULE_PREPROCESSING_OP_OR_PUNC_in_rule__Token__Group_2__0__Impl4964); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2306:1: rule__Token__Group_2__1 : rule__Token__Group_2__1__Impl ;
    public final void rule__Token__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2310:1: ( rule__Token__Group_2__1__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2311:2: rule__Token__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Token__Group_2__1__Impl_in_rule__Token__Group_2__14993);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2317:1: rule__Token__Group_2__1__Impl : ( RULE_ID ) ;
    public final void rule__Token__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2321:1: ( ( RULE_ID ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2322:1: ( RULE_ID )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2322:1: ( RULE_ID )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2323:1: RULE_ID
            {
             before(grammarAccess.getTokenAccess().getIDTerminalRuleCall_2_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Token__Group_2__1__Impl5020); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2338:1: rule__Literal__Group_4__0 : rule__Literal__Group_4__0__Impl rule__Literal__Group_4__1 ;
    public final void rule__Literal__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2342:1: ( rule__Literal__Group_4__0__Impl rule__Literal__Group_4__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2343:2: rule__Literal__Group_4__0__Impl rule__Literal__Group_4__1
            {
            pushFollow(FOLLOW_rule__Literal__Group_4__0__Impl_in_rule__Literal__Group_4__05053);
            rule__Literal__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Literal__Group_4__1_in_rule__Literal__Group_4__05056);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2350:1: rule__Literal__Group_4__0__Impl : ( ( rule__Literal__Alternatives_4_0 ) ) ;
    public final void rule__Literal__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2354:1: ( ( ( rule__Literal__Alternatives_4_0 ) ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2355:1: ( ( rule__Literal__Alternatives_4_0 ) )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2355:1: ( ( rule__Literal__Alternatives_4_0 ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2356:1: ( rule__Literal__Alternatives_4_0 )
            {
             before(grammarAccess.getLiteralAccess().getAlternatives_4_0()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2357:1: ( rule__Literal__Alternatives_4_0 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2357:2: rule__Literal__Alternatives_4_0
            {
            pushFollow(FOLLOW_rule__Literal__Alternatives_4_0_in_rule__Literal__Group_4__0__Impl5083);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2367:1: rule__Literal__Group_4__1 : rule__Literal__Group_4__1__Impl ;
    public final void rule__Literal__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2371:1: ( rule__Literal__Group_4__1__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2372:2: rule__Literal__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Literal__Group_4__1__Impl_in_rule__Literal__Group_4__15113);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2378:1: rule__Literal__Group_4__1__Impl : ( 'nullptr' ) ;
    public final void rule__Literal__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2382:1: ( ( 'nullptr' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2383:1: ( 'nullptr' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2383:1: ( 'nullptr' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2384:1: 'nullptr'
            {
             before(grammarAccess.getLiteralAccess().getNullptrKeyword_4_1()); 
            match(input,95,FOLLOW_95_in_rule__Literal__Group_4__1__Impl5141); 
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


    // $ANTLR start "rule__QualifiedNamespaceSpecifier__Group__0"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2403:1: rule__QualifiedNamespaceSpecifier__Group__0 : rule__QualifiedNamespaceSpecifier__Group__0__Impl rule__QualifiedNamespaceSpecifier__Group__1 ;
    public final void rule__QualifiedNamespaceSpecifier__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2407:1: ( rule__QualifiedNamespaceSpecifier__Group__0__Impl rule__QualifiedNamespaceSpecifier__Group__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2408:2: rule__QualifiedNamespaceSpecifier__Group__0__Impl rule__QualifiedNamespaceSpecifier__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedNamespaceSpecifier__Group__0__Impl_in_rule__QualifiedNamespaceSpecifier__Group__05178);
            rule__QualifiedNamespaceSpecifier__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedNamespaceSpecifier__Group__1_in_rule__QualifiedNamespaceSpecifier__Group__05181);
            rule__QualifiedNamespaceSpecifier__Group__1();

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
    // $ANTLR end "rule__QualifiedNamespaceSpecifier__Group__0"


    // $ANTLR start "rule__QualifiedNamespaceSpecifier__Group__0__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2415:1: rule__QualifiedNamespaceSpecifier__Group__0__Impl : ( ( '::' )? ) ;
    public final void rule__QualifiedNamespaceSpecifier__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2419:1: ( ( ( '::' )? ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2420:1: ( ( '::' )? )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2420:1: ( ( '::' )? )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2421:1: ( '::' )?
            {
             before(grammarAccess.getQualifiedNamespaceSpecifierAccess().getColonColonKeyword_0()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2422:1: ( '::' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==96) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2423:2: '::'
                    {
                    match(input,96,FOLLOW_96_in_rule__QualifiedNamespaceSpecifier__Group__0__Impl5210); 

                    }
                    break;

            }

             after(grammarAccess.getQualifiedNamespaceSpecifierAccess().getColonColonKeyword_0()); 

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
    // $ANTLR end "rule__QualifiedNamespaceSpecifier__Group__0__Impl"


    // $ANTLR start "rule__QualifiedNamespaceSpecifier__Group__1"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2434:1: rule__QualifiedNamespaceSpecifier__Group__1 : rule__QualifiedNamespaceSpecifier__Group__1__Impl rule__QualifiedNamespaceSpecifier__Group__2 ;
    public final void rule__QualifiedNamespaceSpecifier__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2438:1: ( rule__QualifiedNamespaceSpecifier__Group__1__Impl rule__QualifiedNamespaceSpecifier__Group__2 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2439:2: rule__QualifiedNamespaceSpecifier__Group__1__Impl rule__QualifiedNamespaceSpecifier__Group__2
            {
            pushFollow(FOLLOW_rule__QualifiedNamespaceSpecifier__Group__1__Impl_in_rule__QualifiedNamespaceSpecifier__Group__15243);
            rule__QualifiedNamespaceSpecifier__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedNamespaceSpecifier__Group__2_in_rule__QualifiedNamespaceSpecifier__Group__15246);
            rule__QualifiedNamespaceSpecifier__Group__2();

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
    // $ANTLR end "rule__QualifiedNamespaceSpecifier__Group__1"


    // $ANTLR start "rule__QualifiedNamespaceSpecifier__Group__1__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2446:1: rule__QualifiedNamespaceSpecifier__Group__1__Impl : ( ( ruleNestedNameSpecifier )? ) ;
    public final void rule__QualifiedNamespaceSpecifier__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2450:1: ( ( ( ruleNestedNameSpecifier )? ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2451:1: ( ( ruleNestedNameSpecifier )? )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2451:1: ( ( ruleNestedNameSpecifier )? )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2452:1: ( ruleNestedNameSpecifier )?
            {
             before(grammarAccess.getQualifiedNamespaceSpecifierAccess().getNestedNameSpecifierParserRuleCall_1()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2453:1: ( ruleNestedNameSpecifier )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==39) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2453:3: ruleNestedNameSpecifier
                    {
                    pushFollow(FOLLOW_ruleNestedNameSpecifier_in_rule__QualifiedNamespaceSpecifier__Group__1__Impl5274);
                    ruleNestedNameSpecifier();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQualifiedNamespaceSpecifierAccess().getNestedNameSpecifierParserRuleCall_1()); 

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
    // $ANTLR end "rule__QualifiedNamespaceSpecifier__Group__1__Impl"


    // $ANTLR start "rule__QualifiedNamespaceSpecifier__Group__2"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2463:1: rule__QualifiedNamespaceSpecifier__Group__2 : rule__QualifiedNamespaceSpecifier__Group__2__Impl ;
    public final void rule__QualifiedNamespaceSpecifier__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2467:1: ( rule__QualifiedNamespaceSpecifier__Group__2__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2468:2: rule__QualifiedNamespaceSpecifier__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedNamespaceSpecifier__Group__2__Impl_in_rule__QualifiedNamespaceSpecifier__Group__25305);
            rule__QualifiedNamespaceSpecifier__Group__2__Impl();

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
    // $ANTLR end "rule__QualifiedNamespaceSpecifier__Group__2"


    // $ANTLR start "rule__QualifiedNamespaceSpecifier__Group__2__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2474:1: rule__QualifiedNamespaceSpecifier__Group__2__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedNamespaceSpecifier__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2478:1: ( ( RULE_ID ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2479:1: ( RULE_ID )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2479:1: ( RULE_ID )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2480:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNamespaceSpecifierAccess().getIDTerminalRuleCall_2()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedNamespaceSpecifier__Group__2__Impl5332); 
             after(grammarAccess.getQualifiedNamespaceSpecifierAccess().getIDTerminalRuleCall_2()); 

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
    // $ANTLR end "rule__QualifiedNamespaceSpecifier__Group__2__Impl"


    // $ANTLR start "rule__AttributeSpecifier__Group__0"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2503:1: rule__AttributeSpecifier__Group__0 : rule__AttributeSpecifier__Group__0__Impl rule__AttributeSpecifier__Group__1 ;
    public final void rule__AttributeSpecifier__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2507:1: ( rule__AttributeSpecifier__Group__0__Impl rule__AttributeSpecifier__Group__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2508:2: rule__AttributeSpecifier__Group__0__Impl rule__AttributeSpecifier__Group__1
            {
            pushFollow(FOLLOW_rule__AttributeSpecifier__Group__0__Impl_in_rule__AttributeSpecifier__Group__05373);
            rule__AttributeSpecifier__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AttributeSpecifier__Group__1_in_rule__AttributeSpecifier__Group__05376);
            rule__AttributeSpecifier__Group__1();

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
    // $ANTLR end "rule__AttributeSpecifier__Group__0"


    // $ANTLR start "rule__AttributeSpecifier__Group__0__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2515:1: rule__AttributeSpecifier__Group__0__Impl : ( '[' ) ;
    public final void rule__AttributeSpecifier__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2519:1: ( ( '[' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2520:1: ( '[' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2520:1: ( '[' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2521:1: '['
            {
             before(grammarAccess.getAttributeSpecifierAccess().getLeftSquareBracketKeyword_0()); 
            match(input,97,FOLLOW_97_in_rule__AttributeSpecifier__Group__0__Impl5404); 
             after(grammarAccess.getAttributeSpecifierAccess().getLeftSquareBracketKeyword_0()); 

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
    // $ANTLR end "rule__AttributeSpecifier__Group__0__Impl"


    // $ANTLR start "rule__AttributeSpecifier__Group__1"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2534:1: rule__AttributeSpecifier__Group__1 : rule__AttributeSpecifier__Group__1__Impl rule__AttributeSpecifier__Group__2 ;
    public final void rule__AttributeSpecifier__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2538:1: ( rule__AttributeSpecifier__Group__1__Impl rule__AttributeSpecifier__Group__2 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2539:2: rule__AttributeSpecifier__Group__1__Impl rule__AttributeSpecifier__Group__2
            {
            pushFollow(FOLLOW_rule__AttributeSpecifier__Group__1__Impl_in_rule__AttributeSpecifier__Group__15435);
            rule__AttributeSpecifier__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AttributeSpecifier__Group__2_in_rule__AttributeSpecifier__Group__15438);
            rule__AttributeSpecifier__Group__2();

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
    // $ANTLR end "rule__AttributeSpecifier__Group__1"


    // $ANTLR start "rule__AttributeSpecifier__Group__1__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2546:1: rule__AttributeSpecifier__Group__1__Impl : ( '[' ) ;
    public final void rule__AttributeSpecifier__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2550:1: ( ( '[' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2551:1: ( '[' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2551:1: ( '[' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2552:1: '['
            {
             before(grammarAccess.getAttributeSpecifierAccess().getLeftSquareBracketKeyword_1()); 
            match(input,97,FOLLOW_97_in_rule__AttributeSpecifier__Group__1__Impl5466); 
             after(grammarAccess.getAttributeSpecifierAccess().getLeftSquareBracketKeyword_1()); 

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
    // $ANTLR end "rule__AttributeSpecifier__Group__1__Impl"


    // $ANTLR start "rule__AttributeSpecifier__Group__2"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2565:1: rule__AttributeSpecifier__Group__2 : rule__AttributeSpecifier__Group__2__Impl rule__AttributeSpecifier__Group__3 ;
    public final void rule__AttributeSpecifier__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2569:1: ( rule__AttributeSpecifier__Group__2__Impl rule__AttributeSpecifier__Group__3 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2570:2: rule__AttributeSpecifier__Group__2__Impl rule__AttributeSpecifier__Group__3
            {
            pushFollow(FOLLOW_rule__AttributeSpecifier__Group__2__Impl_in_rule__AttributeSpecifier__Group__25497);
            rule__AttributeSpecifier__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AttributeSpecifier__Group__3_in_rule__AttributeSpecifier__Group__25500);
            rule__AttributeSpecifier__Group__3();

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
    // $ANTLR end "rule__AttributeSpecifier__Group__2"


    // $ANTLR start "rule__AttributeSpecifier__Group__2__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2577:1: rule__AttributeSpecifier__Group__2__Impl : ( ruleAttributeList ) ;
    public final void rule__AttributeSpecifier__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2581:1: ( ( ruleAttributeList ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2582:1: ( ruleAttributeList )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2582:1: ( ruleAttributeList )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2583:1: ruleAttributeList
            {
             before(grammarAccess.getAttributeSpecifierAccess().getAttributeListParserRuleCall_2()); 
            pushFollow(FOLLOW_ruleAttributeList_in_rule__AttributeSpecifier__Group__2__Impl5527);
            ruleAttributeList();

            state._fsp--;

             after(grammarAccess.getAttributeSpecifierAccess().getAttributeListParserRuleCall_2()); 

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
    // $ANTLR end "rule__AttributeSpecifier__Group__2__Impl"


    // $ANTLR start "rule__AttributeSpecifier__Group__3"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2594:1: rule__AttributeSpecifier__Group__3 : rule__AttributeSpecifier__Group__3__Impl rule__AttributeSpecifier__Group__4 ;
    public final void rule__AttributeSpecifier__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2598:1: ( rule__AttributeSpecifier__Group__3__Impl rule__AttributeSpecifier__Group__4 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2599:2: rule__AttributeSpecifier__Group__3__Impl rule__AttributeSpecifier__Group__4
            {
            pushFollow(FOLLOW_rule__AttributeSpecifier__Group__3__Impl_in_rule__AttributeSpecifier__Group__35556);
            rule__AttributeSpecifier__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AttributeSpecifier__Group__4_in_rule__AttributeSpecifier__Group__35559);
            rule__AttributeSpecifier__Group__4();

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
    // $ANTLR end "rule__AttributeSpecifier__Group__3"


    // $ANTLR start "rule__AttributeSpecifier__Group__3__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2606:1: rule__AttributeSpecifier__Group__3__Impl : ( ']' ) ;
    public final void rule__AttributeSpecifier__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2610:1: ( ( ']' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2611:1: ( ']' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2611:1: ( ']' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2612:1: ']'
            {
             before(grammarAccess.getAttributeSpecifierAccess().getRightSquareBracketKeyword_3()); 
            match(input,98,FOLLOW_98_in_rule__AttributeSpecifier__Group__3__Impl5587); 
             after(grammarAccess.getAttributeSpecifierAccess().getRightSquareBracketKeyword_3()); 

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
    // $ANTLR end "rule__AttributeSpecifier__Group__3__Impl"


    // $ANTLR start "rule__AttributeSpecifier__Group__4"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2625:1: rule__AttributeSpecifier__Group__4 : rule__AttributeSpecifier__Group__4__Impl ;
    public final void rule__AttributeSpecifier__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2629:1: ( rule__AttributeSpecifier__Group__4__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2630:2: rule__AttributeSpecifier__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__AttributeSpecifier__Group__4__Impl_in_rule__AttributeSpecifier__Group__45618);
            rule__AttributeSpecifier__Group__4__Impl();

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
    // $ANTLR end "rule__AttributeSpecifier__Group__4"


    // $ANTLR start "rule__AttributeSpecifier__Group__4__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2636:1: rule__AttributeSpecifier__Group__4__Impl : ( ']' ) ;
    public final void rule__AttributeSpecifier__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2640:1: ( ( ']' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2641:1: ( ']' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2641:1: ( ']' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2642:1: ']'
            {
             before(grammarAccess.getAttributeSpecifierAccess().getRightSquareBracketKeyword_4()); 
            match(input,98,FOLLOW_98_in_rule__AttributeSpecifier__Group__4__Impl5646); 
             after(grammarAccess.getAttributeSpecifierAccess().getRightSquareBracketKeyword_4()); 

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
    // $ANTLR end "rule__AttributeSpecifier__Group__4__Impl"


    // $ANTLR start "rule__AttributeList__Group__0"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2665:1: rule__AttributeList__Group__0 : rule__AttributeList__Group__0__Impl rule__AttributeList__Group__1 ;
    public final void rule__AttributeList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2669:1: ( rule__AttributeList__Group__0__Impl rule__AttributeList__Group__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2670:2: rule__AttributeList__Group__0__Impl rule__AttributeList__Group__1
            {
            pushFollow(FOLLOW_rule__AttributeList__Group__0__Impl_in_rule__AttributeList__Group__05687);
            rule__AttributeList__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AttributeList__Group__1_in_rule__AttributeList__Group__05690);
            rule__AttributeList__Group__1();

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
    // $ANTLR end "rule__AttributeList__Group__0"


    // $ANTLR start "rule__AttributeList__Group__0__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2677:1: rule__AttributeList__Group__0__Impl : ( ( rule__AttributeList__Group_0__0 ) ) ;
    public final void rule__AttributeList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2681:1: ( ( ( rule__AttributeList__Group_0__0 ) ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2682:1: ( ( rule__AttributeList__Group_0__0 ) )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2682:1: ( ( rule__AttributeList__Group_0__0 ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2683:1: ( rule__AttributeList__Group_0__0 )
            {
             before(grammarAccess.getAttributeListAccess().getGroup_0()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2684:1: ( rule__AttributeList__Group_0__0 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2684:2: rule__AttributeList__Group_0__0
            {
            pushFollow(FOLLOW_rule__AttributeList__Group_0__0_in_rule__AttributeList__Group__0__Impl5717);
            rule__AttributeList__Group_0__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeListAccess().getGroup_0()); 

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
    // $ANTLR end "rule__AttributeList__Group__0__Impl"


    // $ANTLR start "rule__AttributeList__Group__1"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2694:1: rule__AttributeList__Group__1 : rule__AttributeList__Group__1__Impl ;
    public final void rule__AttributeList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2698:1: ( rule__AttributeList__Group__1__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2699:2: rule__AttributeList__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__AttributeList__Group__1__Impl_in_rule__AttributeList__Group__15747);
            rule__AttributeList__Group__1__Impl();

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
    // $ANTLR end "rule__AttributeList__Group__1"


    // $ANTLR start "rule__AttributeList__Group__1__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2705:1: rule__AttributeList__Group__1__Impl : ( ( rule__AttributeList__Group_1__0 )* ) ;
    public final void rule__AttributeList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2709:1: ( ( ( rule__AttributeList__Group_1__0 )* ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2710:1: ( ( rule__AttributeList__Group_1__0 )* )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2710:1: ( ( rule__AttributeList__Group_1__0 )* )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2711:1: ( rule__AttributeList__Group_1__0 )*
            {
             before(grammarAccess.getAttributeListAccess().getGroup_1()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2712:1: ( rule__AttributeList__Group_1__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==88) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2712:2: rule__AttributeList__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__AttributeList__Group_1__0_in_rule__AttributeList__Group__1__Impl5774);
            	    rule__AttributeList__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getAttributeListAccess().getGroup_1()); 

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
    // $ANTLR end "rule__AttributeList__Group__1__Impl"


    // $ANTLR start "rule__AttributeList__Group_0__0"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2726:1: rule__AttributeList__Group_0__0 : rule__AttributeList__Group_0__0__Impl rule__AttributeList__Group_0__1 ;
    public final void rule__AttributeList__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2730:1: ( rule__AttributeList__Group_0__0__Impl rule__AttributeList__Group_0__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2731:2: rule__AttributeList__Group_0__0__Impl rule__AttributeList__Group_0__1
            {
            pushFollow(FOLLOW_rule__AttributeList__Group_0__0__Impl_in_rule__AttributeList__Group_0__05809);
            rule__AttributeList__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AttributeList__Group_0__1_in_rule__AttributeList__Group_0__05812);
            rule__AttributeList__Group_0__1();

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
    // $ANTLR end "rule__AttributeList__Group_0__0"


    // $ANTLR start "rule__AttributeList__Group_0__0__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2738:1: rule__AttributeList__Group_0__0__Impl : ( ruleAttribute ) ;
    public final void rule__AttributeList__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2742:1: ( ( ruleAttribute ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2743:1: ( ruleAttribute )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2743:1: ( ruleAttribute )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2744:1: ruleAttribute
            {
             before(grammarAccess.getAttributeListAccess().getAttributeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleAttribute_in_rule__AttributeList__Group_0__0__Impl5839);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getAttributeListAccess().getAttributeParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__AttributeList__Group_0__0__Impl"


    // $ANTLR start "rule__AttributeList__Group_0__1"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2755:1: rule__AttributeList__Group_0__1 : rule__AttributeList__Group_0__1__Impl ;
    public final void rule__AttributeList__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2759:1: ( rule__AttributeList__Group_0__1__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2760:2: rule__AttributeList__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__AttributeList__Group_0__1__Impl_in_rule__AttributeList__Group_0__15868);
            rule__AttributeList__Group_0__1__Impl();

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
    // $ANTLR end "rule__AttributeList__Group_0__1"


    // $ANTLR start "rule__AttributeList__Group_0__1__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2766:1: rule__AttributeList__Group_0__1__Impl : ( ( '...' )? ) ;
    public final void rule__AttributeList__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2770:1: ( ( ( '...' )? ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2771:1: ( ( '...' )? )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2771:1: ( ( '...' )? )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2772:1: ( '...' )?
            {
             before(grammarAccess.getAttributeListAccess().getFullStopFullStopFullStopKeyword_0_1()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2773:1: ( '...' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==54) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2774:2: '...'
                    {
                    match(input,54,FOLLOW_54_in_rule__AttributeList__Group_0__1__Impl5897); 

                    }
                    break;

            }

             after(grammarAccess.getAttributeListAccess().getFullStopFullStopFullStopKeyword_0_1()); 

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
    // $ANTLR end "rule__AttributeList__Group_0__1__Impl"


    // $ANTLR start "rule__AttributeList__Group_1__0"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2789:1: rule__AttributeList__Group_1__0 : rule__AttributeList__Group_1__0__Impl rule__AttributeList__Group_1__1 ;
    public final void rule__AttributeList__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2793:1: ( rule__AttributeList__Group_1__0__Impl rule__AttributeList__Group_1__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2794:2: rule__AttributeList__Group_1__0__Impl rule__AttributeList__Group_1__1
            {
            pushFollow(FOLLOW_rule__AttributeList__Group_1__0__Impl_in_rule__AttributeList__Group_1__05934);
            rule__AttributeList__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AttributeList__Group_1__1_in_rule__AttributeList__Group_1__05937);
            rule__AttributeList__Group_1__1();

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
    // $ANTLR end "rule__AttributeList__Group_1__0"


    // $ANTLR start "rule__AttributeList__Group_1__0__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2801:1: rule__AttributeList__Group_1__0__Impl : ( ',' ) ;
    public final void rule__AttributeList__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2805:1: ( ( ',' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2806:1: ( ',' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2806:1: ( ',' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2807:1: ','
            {
             before(grammarAccess.getAttributeListAccess().getCommaKeyword_1_0()); 
            match(input,88,FOLLOW_88_in_rule__AttributeList__Group_1__0__Impl5965); 
             after(grammarAccess.getAttributeListAccess().getCommaKeyword_1_0()); 

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
    // $ANTLR end "rule__AttributeList__Group_1__0__Impl"


    // $ANTLR start "rule__AttributeList__Group_1__1"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2820:1: rule__AttributeList__Group_1__1 : rule__AttributeList__Group_1__1__Impl ;
    public final void rule__AttributeList__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2824:1: ( rule__AttributeList__Group_1__1__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2825:2: rule__AttributeList__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__AttributeList__Group_1__1__Impl_in_rule__AttributeList__Group_1__15996);
            rule__AttributeList__Group_1__1__Impl();

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
    // $ANTLR end "rule__AttributeList__Group_1__1"


    // $ANTLR start "rule__AttributeList__Group_1__1__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2831:1: rule__AttributeList__Group_1__1__Impl : ( ( rule__AttributeList__Group_1_1__0 )? ) ;
    public final void rule__AttributeList__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2835:1: ( ( ( rule__AttributeList__Group_1_1__0 )? ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2836:1: ( ( rule__AttributeList__Group_1_1__0 )? )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2836:1: ( ( rule__AttributeList__Group_1_1__0 )? )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2837:1: ( rule__AttributeList__Group_1_1__0 )?
            {
             before(grammarAccess.getAttributeListAccess().getGroup_1_1()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2838:1: ( rule__AttributeList__Group_1_1__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_ID) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2838:2: rule__AttributeList__Group_1_1__0
                    {
                    pushFollow(FOLLOW_rule__AttributeList__Group_1_1__0_in_rule__AttributeList__Group_1__1__Impl6023);
                    rule__AttributeList__Group_1_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttributeListAccess().getGroup_1_1()); 

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
    // $ANTLR end "rule__AttributeList__Group_1__1__Impl"


    // $ANTLR start "rule__AttributeList__Group_1_1__0"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2852:1: rule__AttributeList__Group_1_1__0 : rule__AttributeList__Group_1_1__0__Impl rule__AttributeList__Group_1_1__1 ;
    public final void rule__AttributeList__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2856:1: ( rule__AttributeList__Group_1_1__0__Impl rule__AttributeList__Group_1_1__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2857:2: rule__AttributeList__Group_1_1__0__Impl rule__AttributeList__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__AttributeList__Group_1_1__0__Impl_in_rule__AttributeList__Group_1_1__06058);
            rule__AttributeList__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AttributeList__Group_1_1__1_in_rule__AttributeList__Group_1_1__06061);
            rule__AttributeList__Group_1_1__1();

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
    // $ANTLR end "rule__AttributeList__Group_1_1__0"


    // $ANTLR start "rule__AttributeList__Group_1_1__0__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2864:1: rule__AttributeList__Group_1_1__0__Impl : ( ruleAttribute ) ;
    public final void rule__AttributeList__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2868:1: ( ( ruleAttribute ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2869:1: ( ruleAttribute )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2869:1: ( ruleAttribute )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2870:1: ruleAttribute
            {
             before(grammarAccess.getAttributeListAccess().getAttributeParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleAttribute_in_rule__AttributeList__Group_1_1__0__Impl6088);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getAttributeListAccess().getAttributeParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__AttributeList__Group_1_1__0__Impl"


    // $ANTLR start "rule__AttributeList__Group_1_1__1"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2881:1: rule__AttributeList__Group_1_1__1 : rule__AttributeList__Group_1_1__1__Impl ;
    public final void rule__AttributeList__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2885:1: ( rule__AttributeList__Group_1_1__1__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2886:2: rule__AttributeList__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__AttributeList__Group_1_1__1__Impl_in_rule__AttributeList__Group_1_1__16117);
            rule__AttributeList__Group_1_1__1__Impl();

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
    // $ANTLR end "rule__AttributeList__Group_1_1__1"


    // $ANTLR start "rule__AttributeList__Group_1_1__1__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2892:1: rule__AttributeList__Group_1_1__1__Impl : ( ( '...' )? ) ;
    public final void rule__AttributeList__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2896:1: ( ( ( '...' )? ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2897:1: ( ( '...' )? )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2897:1: ( ( '...' )? )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2898:1: ( '...' )?
            {
             before(grammarAccess.getAttributeListAccess().getFullStopFullStopFullStopKeyword_1_1_1()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2899:1: ( '...' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==54) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2900:2: '...'
                    {
                    match(input,54,FOLLOW_54_in_rule__AttributeList__Group_1_1__1__Impl6146); 

                    }
                    break;

            }

             after(grammarAccess.getAttributeListAccess().getFullStopFullStopFullStopKeyword_1_1_1()); 

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
    // $ANTLR end "rule__AttributeList__Group_1_1__1__Impl"


    // $ANTLR start "rule__Attribute__Group__0"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2915:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2919:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2920:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_rule__Attribute__Group__0__Impl_in_rule__Attribute__Group__06183);
            rule__Attribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group__1_in_rule__Attribute__Group__06186);
            rule__Attribute__Group__1();

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
    // $ANTLR end "rule__Attribute__Group__0"


    // $ANTLR start "rule__Attribute__Group__0__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2927:1: rule__Attribute__Group__0__Impl : ( ruleAttributeToken ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2931:1: ( ( ruleAttributeToken ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2932:1: ( ruleAttributeToken )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2932:1: ( ruleAttributeToken )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2933:1: ruleAttributeToken
            {
             before(grammarAccess.getAttributeAccess().getAttributeTokenParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleAttributeToken_in_rule__Attribute__Group__0__Impl6213);
            ruleAttributeToken();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getAttributeTokenParserRuleCall_0()); 

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
    // $ANTLR end "rule__Attribute__Group__0__Impl"


    // $ANTLR start "rule__Attribute__Group__1"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2944:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2948:1: ( rule__Attribute__Group__1__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2949:2: rule__Attribute__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Attribute__Group__1__Impl_in_rule__Attribute__Group__16242);
            rule__Attribute__Group__1__Impl();

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
    // $ANTLR end "rule__Attribute__Group__1"


    // $ANTLR start "rule__Attribute__Group__1__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2955:1: rule__Attribute__Group__1__Impl : ( ( ruleAttributeArgumentClause )? ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2959:1: ( ( ( ruleAttributeArgumentClause )? ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2960:1: ( ( ruleAttributeArgumentClause )? )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2960:1: ( ( ruleAttributeArgumentClause )? )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2961:1: ( ruleAttributeArgumentClause )?
            {
             before(grammarAccess.getAttributeAccess().getAttributeArgumentClauseParserRuleCall_1()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2962:1: ( ruleAttributeArgumentClause )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==99) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2962:3: ruleAttributeArgumentClause
                    {
                    pushFollow(FOLLOW_ruleAttributeArgumentClause_in_rule__Attribute__Group__1__Impl6270);
                    ruleAttributeArgumentClause();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttributeAccess().getAttributeArgumentClauseParserRuleCall_1()); 

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
    // $ANTLR end "rule__Attribute__Group__1__Impl"


    // $ANTLR start "rule__AttributeToken__Group__0"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2976:1: rule__AttributeToken__Group__0 : rule__AttributeToken__Group__0__Impl rule__AttributeToken__Group__1 ;
    public final void rule__AttributeToken__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2980:1: ( rule__AttributeToken__Group__0__Impl rule__AttributeToken__Group__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2981:2: rule__AttributeToken__Group__0__Impl rule__AttributeToken__Group__1
            {
            pushFollow(FOLLOW_rule__AttributeToken__Group__0__Impl_in_rule__AttributeToken__Group__06305);
            rule__AttributeToken__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AttributeToken__Group__1_in_rule__AttributeToken__Group__06308);
            rule__AttributeToken__Group__1();

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
    // $ANTLR end "rule__AttributeToken__Group__0"


    // $ANTLR start "rule__AttributeToken__Group__0__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2988:1: rule__AttributeToken__Group__0__Impl : ( ( rule__AttributeToken__Group_0__0 )? ) ;
    public final void rule__AttributeToken__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2992:1: ( ( ( rule__AttributeToken__Group_0__0 )? ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2993:1: ( ( rule__AttributeToken__Group_0__0 )? )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2993:1: ( ( rule__AttributeToken__Group_0__0 )? )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2994:1: ( rule__AttributeToken__Group_0__0 )?
            {
             before(grammarAccess.getAttributeTokenAccess().getGroup_0()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2995:1: ( rule__AttributeToken__Group_0__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_ID) ) {
                int LA27_1 = input.LA(2);

                if ( (LA27_1==96) ) {
                    alt27=1;
                }
            }
            switch (alt27) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2995:2: rule__AttributeToken__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__AttributeToken__Group_0__0_in_rule__AttributeToken__Group__0__Impl6335);
                    rule__AttributeToken__Group_0__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttributeTokenAccess().getGroup_0()); 

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
    // $ANTLR end "rule__AttributeToken__Group__0__Impl"


    // $ANTLR start "rule__AttributeToken__Group__1"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3005:1: rule__AttributeToken__Group__1 : rule__AttributeToken__Group__1__Impl ;
    public final void rule__AttributeToken__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3009:1: ( rule__AttributeToken__Group__1__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3010:2: rule__AttributeToken__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__AttributeToken__Group__1__Impl_in_rule__AttributeToken__Group__16366);
            rule__AttributeToken__Group__1__Impl();

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
    // $ANTLR end "rule__AttributeToken__Group__1"


    // $ANTLR start "rule__AttributeToken__Group__1__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3016:1: rule__AttributeToken__Group__1__Impl : ( RULE_ID ) ;
    public final void rule__AttributeToken__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3020:1: ( ( RULE_ID ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3021:1: ( RULE_ID )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3021:1: ( RULE_ID )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3022:1: RULE_ID
            {
             before(grammarAccess.getAttributeTokenAccess().getIDTerminalRuleCall_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__AttributeToken__Group__1__Impl6393); 
             after(grammarAccess.getAttributeTokenAccess().getIDTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__AttributeToken__Group__1__Impl"


    // $ANTLR start "rule__AttributeToken__Group_0__0"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3037:1: rule__AttributeToken__Group_0__0 : rule__AttributeToken__Group_0__0__Impl rule__AttributeToken__Group_0__1 ;
    public final void rule__AttributeToken__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3041:1: ( rule__AttributeToken__Group_0__0__Impl rule__AttributeToken__Group_0__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3042:2: rule__AttributeToken__Group_0__0__Impl rule__AttributeToken__Group_0__1
            {
            pushFollow(FOLLOW_rule__AttributeToken__Group_0__0__Impl_in_rule__AttributeToken__Group_0__06426);
            rule__AttributeToken__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AttributeToken__Group_0__1_in_rule__AttributeToken__Group_0__06429);
            rule__AttributeToken__Group_0__1();

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
    // $ANTLR end "rule__AttributeToken__Group_0__0"


    // $ANTLR start "rule__AttributeToken__Group_0__0__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3049:1: rule__AttributeToken__Group_0__0__Impl : ( RULE_ID ) ;
    public final void rule__AttributeToken__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3053:1: ( ( RULE_ID ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3054:1: ( RULE_ID )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3054:1: ( RULE_ID )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3055:1: RULE_ID
            {
             before(grammarAccess.getAttributeTokenAccess().getIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__AttributeToken__Group_0__0__Impl6456); 
             after(grammarAccess.getAttributeTokenAccess().getIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__AttributeToken__Group_0__0__Impl"


    // $ANTLR start "rule__AttributeToken__Group_0__1"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3066:1: rule__AttributeToken__Group_0__1 : rule__AttributeToken__Group_0__1__Impl ;
    public final void rule__AttributeToken__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3070:1: ( rule__AttributeToken__Group_0__1__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3071:2: rule__AttributeToken__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__AttributeToken__Group_0__1__Impl_in_rule__AttributeToken__Group_0__16485);
            rule__AttributeToken__Group_0__1__Impl();

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
    // $ANTLR end "rule__AttributeToken__Group_0__1"


    // $ANTLR start "rule__AttributeToken__Group_0__1__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3077:1: rule__AttributeToken__Group_0__1__Impl : ( '::' ) ;
    public final void rule__AttributeToken__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3081:1: ( ( '::' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3082:1: ( '::' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3082:1: ( '::' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3083:1: '::'
            {
             before(grammarAccess.getAttributeTokenAccess().getColonColonKeyword_0_1()); 
            match(input,96,FOLLOW_96_in_rule__AttributeToken__Group_0__1__Impl6513); 
             after(grammarAccess.getAttributeTokenAccess().getColonColonKeyword_0_1()); 

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
    // $ANTLR end "rule__AttributeToken__Group_0__1__Impl"


    // $ANTLR start "rule__AttributeArgumentClause__Group__0"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3100:1: rule__AttributeArgumentClause__Group__0 : rule__AttributeArgumentClause__Group__0__Impl rule__AttributeArgumentClause__Group__1 ;
    public final void rule__AttributeArgumentClause__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3104:1: ( rule__AttributeArgumentClause__Group__0__Impl rule__AttributeArgumentClause__Group__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3105:2: rule__AttributeArgumentClause__Group__0__Impl rule__AttributeArgumentClause__Group__1
            {
            pushFollow(FOLLOW_rule__AttributeArgumentClause__Group__0__Impl_in_rule__AttributeArgumentClause__Group__06548);
            rule__AttributeArgumentClause__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AttributeArgumentClause__Group__1_in_rule__AttributeArgumentClause__Group__06551);
            rule__AttributeArgumentClause__Group__1();

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
    // $ANTLR end "rule__AttributeArgumentClause__Group__0"


    // $ANTLR start "rule__AttributeArgumentClause__Group__0__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3112:1: rule__AttributeArgumentClause__Group__0__Impl : ( '(' ) ;
    public final void rule__AttributeArgumentClause__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3116:1: ( ( '(' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3117:1: ( '(' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3117:1: ( '(' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3118:1: '('
            {
             before(grammarAccess.getAttributeArgumentClauseAccess().getLeftParenthesisKeyword_0()); 
            match(input,99,FOLLOW_99_in_rule__AttributeArgumentClause__Group__0__Impl6579); 
             after(grammarAccess.getAttributeArgumentClauseAccess().getLeftParenthesisKeyword_0()); 

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
    // $ANTLR end "rule__AttributeArgumentClause__Group__0__Impl"


    // $ANTLR start "rule__AttributeArgumentClause__Group__1"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3131:1: rule__AttributeArgumentClause__Group__1 : rule__AttributeArgumentClause__Group__1__Impl rule__AttributeArgumentClause__Group__2 ;
    public final void rule__AttributeArgumentClause__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3135:1: ( rule__AttributeArgumentClause__Group__1__Impl rule__AttributeArgumentClause__Group__2 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3136:2: rule__AttributeArgumentClause__Group__1__Impl rule__AttributeArgumentClause__Group__2
            {
            pushFollow(FOLLOW_rule__AttributeArgumentClause__Group__1__Impl_in_rule__AttributeArgumentClause__Group__16610);
            rule__AttributeArgumentClause__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AttributeArgumentClause__Group__2_in_rule__AttributeArgumentClause__Group__16613);
            rule__AttributeArgumentClause__Group__2();

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
    // $ANTLR end "rule__AttributeArgumentClause__Group__1"


    // $ANTLR start "rule__AttributeArgumentClause__Group__1__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3143:1: rule__AttributeArgumentClause__Group__1__Impl : ( ruleToken ) ;
    public final void rule__AttributeArgumentClause__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3147:1: ( ( ruleToken ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3148:1: ( ruleToken )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3148:1: ( ruleToken )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3149:1: ruleToken
            {
             before(grammarAccess.getAttributeArgumentClauseAccess().getTokenParserRuleCall_1()); 
            pushFollow(FOLLOW_ruleToken_in_rule__AttributeArgumentClause__Group__1__Impl6640);
            ruleToken();

            state._fsp--;

             after(grammarAccess.getAttributeArgumentClauseAccess().getTokenParserRuleCall_1()); 

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
    // $ANTLR end "rule__AttributeArgumentClause__Group__1__Impl"


    // $ANTLR start "rule__AttributeArgumentClause__Group__2"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3160:1: rule__AttributeArgumentClause__Group__2 : rule__AttributeArgumentClause__Group__2__Impl ;
    public final void rule__AttributeArgumentClause__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3164:1: ( rule__AttributeArgumentClause__Group__2__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3165:2: rule__AttributeArgumentClause__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__AttributeArgumentClause__Group__2__Impl_in_rule__AttributeArgumentClause__Group__26669);
            rule__AttributeArgumentClause__Group__2__Impl();

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
    // $ANTLR end "rule__AttributeArgumentClause__Group__2"


    // $ANTLR start "rule__AttributeArgumentClause__Group__2__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3171:1: rule__AttributeArgumentClause__Group__2__Impl : ( ')' ) ;
    public final void rule__AttributeArgumentClause__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3175:1: ( ( ')' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3176:1: ( ')' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3176:1: ( ')' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3177:1: ')'
            {
             before(grammarAccess.getAttributeArgumentClauseAccess().getRightParenthesisKeyword_2()); 
            match(input,100,FOLLOW_100_in_rule__AttributeArgumentClause__Group__2__Impl6697); 
             after(grammarAccess.getAttributeArgumentClauseAccess().getRightParenthesisKeyword_2()); 

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
    // $ANTLR end "rule__AttributeArgumentClause__Group__2__Impl"


    // $ANTLR start "rule__InitDeclarator__Group__0"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3196:1: rule__InitDeclarator__Group__0 : rule__InitDeclarator__Group__0__Impl rule__InitDeclarator__Group__1 ;
    public final void rule__InitDeclarator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3200:1: ( rule__InitDeclarator__Group__0__Impl rule__InitDeclarator__Group__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3201:2: rule__InitDeclarator__Group__0__Impl rule__InitDeclarator__Group__1
            {
            pushFollow(FOLLOW_rule__InitDeclarator__Group__0__Impl_in_rule__InitDeclarator__Group__06734);
            rule__InitDeclarator__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InitDeclarator__Group__1_in_rule__InitDeclarator__Group__06737);
            rule__InitDeclarator__Group__1();

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
    // $ANTLR end "rule__InitDeclarator__Group__0"


    // $ANTLR start "rule__InitDeclarator__Group__0__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3208:1: rule__InitDeclarator__Group__0__Impl : ( ruleDeclarator ) ;
    public final void rule__InitDeclarator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3212:1: ( ( ruleDeclarator ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3213:1: ( ruleDeclarator )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3213:1: ( ruleDeclarator )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3214:1: ruleDeclarator
            {
             before(grammarAccess.getInitDeclaratorAccess().getDeclaratorParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleDeclarator_in_rule__InitDeclarator__Group__0__Impl6764);
            ruleDeclarator();

            state._fsp--;

             after(grammarAccess.getInitDeclaratorAccess().getDeclaratorParserRuleCall_0()); 

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
    // $ANTLR end "rule__InitDeclarator__Group__0__Impl"


    // $ANTLR start "rule__InitDeclarator__Group__1"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3225:1: rule__InitDeclarator__Group__1 : rule__InitDeclarator__Group__1__Impl ;
    public final void rule__InitDeclarator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3229:1: ( rule__InitDeclarator__Group__1__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3230:2: rule__InitDeclarator__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__InitDeclarator__Group__1__Impl_in_rule__InitDeclarator__Group__16793);
            rule__InitDeclarator__Group__1__Impl();

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
    // $ANTLR end "rule__InitDeclarator__Group__1"


    // $ANTLR start "rule__InitDeclarator__Group__1__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3236:1: rule__InitDeclarator__Group__1__Impl : ( ( ruleInitializer )? ) ;
    public final void rule__InitDeclarator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3240:1: ( ( ( ruleInitializer )? ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3241:1: ( ( ruleInitializer )? )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3241:1: ( ( ruleInitializer )? )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3242:1: ( ruleInitializer )?
            {
             before(grammarAccess.getInitDeclaratorAccess().getInitializerParserRuleCall_1()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3243:1: ( ruleInitializer )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==47) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3243:3: ruleInitializer
                    {
                    pushFollow(FOLLOW_ruleInitializer_in_rule__InitDeclarator__Group__1__Impl6821);
                    ruleInitializer();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInitDeclaratorAccess().getInitializerParserRuleCall_1()); 

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
    // $ANTLR end "rule__InitDeclarator__Group__1__Impl"


    // $ANTLR start "rule__FunctionDeclarator__Group__0"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3257:1: rule__FunctionDeclarator__Group__0 : rule__FunctionDeclarator__Group__0__Impl rule__FunctionDeclarator__Group__1 ;
    public final void rule__FunctionDeclarator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3261:1: ( rule__FunctionDeclarator__Group__0__Impl rule__FunctionDeclarator__Group__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3262:2: rule__FunctionDeclarator__Group__0__Impl rule__FunctionDeclarator__Group__1
            {
            pushFollow(FOLLOW_rule__FunctionDeclarator__Group__0__Impl_in_rule__FunctionDeclarator__Group__06856);
            rule__FunctionDeclarator__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FunctionDeclarator__Group__1_in_rule__FunctionDeclarator__Group__06859);
            rule__FunctionDeclarator__Group__1();

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
    // $ANTLR end "rule__FunctionDeclarator__Group__0"


    // $ANTLR start "rule__FunctionDeclarator__Group__0__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3269:1: rule__FunctionDeclarator__Group__0__Impl : ( ( ruleTemplateDeclaration )? ) ;
    public final void rule__FunctionDeclarator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3273:1: ( ( ( ruleTemplateDeclaration )? ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3274:1: ( ( ruleTemplateDeclaration )? )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3274:1: ( ( ruleTemplateDeclaration )? )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3275:1: ( ruleTemplateDeclaration )?
            {
             before(grammarAccess.getFunctionDeclaratorAccess().getTemplateDeclarationParserRuleCall_0()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3276:1: ( ruleTemplateDeclaration )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==105) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3276:3: ruleTemplateDeclaration
                    {
                    pushFollow(FOLLOW_ruleTemplateDeclaration_in_rule__FunctionDeclarator__Group__0__Impl6887);
                    ruleTemplateDeclaration();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFunctionDeclaratorAccess().getTemplateDeclarationParserRuleCall_0()); 

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
    // $ANTLR end "rule__FunctionDeclarator__Group__0__Impl"


    // $ANTLR start "rule__FunctionDeclarator__Group__1"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3286:1: rule__FunctionDeclarator__Group__1 : rule__FunctionDeclarator__Group__1__Impl rule__FunctionDeclarator__Group__2 ;
    public final void rule__FunctionDeclarator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3290:1: ( rule__FunctionDeclarator__Group__1__Impl rule__FunctionDeclarator__Group__2 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3291:2: rule__FunctionDeclarator__Group__1__Impl rule__FunctionDeclarator__Group__2
            {
            pushFollow(FOLLOW_rule__FunctionDeclarator__Group__1__Impl_in_rule__FunctionDeclarator__Group__16918);
            rule__FunctionDeclarator__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FunctionDeclarator__Group__2_in_rule__FunctionDeclarator__Group__16921);
            rule__FunctionDeclarator__Group__2();

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
    // $ANTLR end "rule__FunctionDeclarator__Group__1"


    // $ANTLR start "rule__FunctionDeclarator__Group__1__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3298:1: rule__FunctionDeclarator__Group__1__Impl : ( ruleNoptrDeclarator ) ;
    public final void rule__FunctionDeclarator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3302:1: ( ( ruleNoptrDeclarator ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3303:1: ( ruleNoptrDeclarator )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3303:1: ( ruleNoptrDeclarator )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3304:1: ruleNoptrDeclarator
            {
             before(grammarAccess.getFunctionDeclaratorAccess().getNoptrDeclaratorParserRuleCall_1()); 
            pushFollow(FOLLOW_ruleNoptrDeclarator_in_rule__FunctionDeclarator__Group__1__Impl6948);
            ruleNoptrDeclarator();

            state._fsp--;

             after(grammarAccess.getFunctionDeclaratorAccess().getNoptrDeclaratorParserRuleCall_1()); 

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
    // $ANTLR end "rule__FunctionDeclarator__Group__1__Impl"


    // $ANTLR start "rule__FunctionDeclarator__Group__2"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3315:1: rule__FunctionDeclarator__Group__2 : rule__FunctionDeclarator__Group__2__Impl ;
    public final void rule__FunctionDeclarator__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3319:1: ( rule__FunctionDeclarator__Group__2__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3320:2: rule__FunctionDeclarator__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__FunctionDeclarator__Group__2__Impl_in_rule__FunctionDeclarator__Group__26977);
            rule__FunctionDeclarator__Group__2__Impl();

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
    // $ANTLR end "rule__FunctionDeclarator__Group__2"


    // $ANTLR start "rule__FunctionDeclarator__Group__2__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3326:1: rule__FunctionDeclarator__Group__2__Impl : ( ruleParametersAndQualifiers ) ;
    public final void rule__FunctionDeclarator__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3330:1: ( ( ruleParametersAndQualifiers ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3331:1: ( ruleParametersAndQualifiers )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3331:1: ( ruleParametersAndQualifiers )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3332:1: ruleParametersAndQualifiers
            {
             before(grammarAccess.getFunctionDeclaratorAccess().getParametersAndQualifiersParserRuleCall_2()); 
            pushFollow(FOLLOW_ruleParametersAndQualifiers_in_rule__FunctionDeclarator__Group__2__Impl7004);
            ruleParametersAndQualifiers();

            state._fsp--;

             after(grammarAccess.getFunctionDeclaratorAccess().getParametersAndQualifiersParserRuleCall_2()); 

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
    // $ANTLR end "rule__FunctionDeclarator__Group__2__Impl"


    // $ANTLR start "rule__ParametersAndQualifiers__Group__0"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3349:1: rule__ParametersAndQualifiers__Group__0 : rule__ParametersAndQualifiers__Group__0__Impl rule__ParametersAndQualifiers__Group__1 ;
    public final void rule__ParametersAndQualifiers__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3353:1: ( rule__ParametersAndQualifiers__Group__0__Impl rule__ParametersAndQualifiers__Group__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3354:2: rule__ParametersAndQualifiers__Group__0__Impl rule__ParametersAndQualifiers__Group__1
            {
            pushFollow(FOLLOW_rule__ParametersAndQualifiers__Group__0__Impl_in_rule__ParametersAndQualifiers__Group__07039);
            rule__ParametersAndQualifiers__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParametersAndQualifiers__Group__1_in_rule__ParametersAndQualifiers__Group__07042);
            rule__ParametersAndQualifiers__Group__1();

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
    // $ANTLR end "rule__ParametersAndQualifiers__Group__0"


    // $ANTLR start "rule__ParametersAndQualifiers__Group__0__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3361:1: rule__ParametersAndQualifiers__Group__0__Impl : ( '(' ) ;
    public final void rule__ParametersAndQualifiers__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3365:1: ( ( '(' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3366:1: ( '(' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3366:1: ( '(' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3367:1: '('
            {
             before(grammarAccess.getParametersAndQualifiersAccess().getLeftParenthesisKeyword_0()); 
            match(input,99,FOLLOW_99_in_rule__ParametersAndQualifiers__Group__0__Impl7070); 
             after(grammarAccess.getParametersAndQualifiersAccess().getLeftParenthesisKeyword_0()); 

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
    // $ANTLR end "rule__ParametersAndQualifiers__Group__0__Impl"


    // $ANTLR start "rule__ParametersAndQualifiers__Group__1"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3380:1: rule__ParametersAndQualifiers__Group__1 : rule__ParametersAndQualifiers__Group__1__Impl rule__ParametersAndQualifiers__Group__2 ;
    public final void rule__ParametersAndQualifiers__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3384:1: ( rule__ParametersAndQualifiers__Group__1__Impl rule__ParametersAndQualifiers__Group__2 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3385:2: rule__ParametersAndQualifiers__Group__1__Impl rule__ParametersAndQualifiers__Group__2
            {
            pushFollow(FOLLOW_rule__ParametersAndQualifiers__Group__1__Impl_in_rule__ParametersAndQualifiers__Group__17101);
            rule__ParametersAndQualifiers__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParametersAndQualifiers__Group__2_in_rule__ParametersAndQualifiers__Group__17104);
            rule__ParametersAndQualifiers__Group__2();

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
    // $ANTLR end "rule__ParametersAndQualifiers__Group__1"


    // $ANTLR start "rule__ParametersAndQualifiers__Group__1__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3392:1: rule__ParametersAndQualifiers__Group__1__Impl : ( ( ruleParameterDeclarationClause )? ) ;
    public final void rule__ParametersAndQualifiers__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3396:1: ( ( ( ruleParameterDeclarationClause )? ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3397:1: ( ( ruleParameterDeclarationClause )? )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3397:1: ( ( ruleParameterDeclarationClause )? )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3398:1: ( ruleParameterDeclarationClause )?
            {
             before(grammarAccess.getParametersAndQualifiersAccess().getParameterDeclarationClauseParserRuleCall_1()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3399:1: ( ruleParameterDeclarationClause )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==37||LA30_0==54||LA30_0==97) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3399:3: ruleParameterDeclarationClause
                    {
                    pushFollow(FOLLOW_ruleParameterDeclarationClause_in_rule__ParametersAndQualifiers__Group__1__Impl7132);
                    ruleParameterDeclarationClause();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getParametersAndQualifiersAccess().getParameterDeclarationClauseParserRuleCall_1()); 

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
    // $ANTLR end "rule__ParametersAndQualifiers__Group__1__Impl"


    // $ANTLR start "rule__ParametersAndQualifiers__Group__2"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3409:1: rule__ParametersAndQualifiers__Group__2 : rule__ParametersAndQualifiers__Group__2__Impl rule__ParametersAndQualifiers__Group__3 ;
    public final void rule__ParametersAndQualifiers__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3413:1: ( rule__ParametersAndQualifiers__Group__2__Impl rule__ParametersAndQualifiers__Group__3 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3414:2: rule__ParametersAndQualifiers__Group__2__Impl rule__ParametersAndQualifiers__Group__3
            {
            pushFollow(FOLLOW_rule__ParametersAndQualifiers__Group__2__Impl_in_rule__ParametersAndQualifiers__Group__27163);
            rule__ParametersAndQualifiers__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParametersAndQualifiers__Group__3_in_rule__ParametersAndQualifiers__Group__27166);
            rule__ParametersAndQualifiers__Group__3();

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
    // $ANTLR end "rule__ParametersAndQualifiers__Group__2"


    // $ANTLR start "rule__ParametersAndQualifiers__Group__2__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3421:1: rule__ParametersAndQualifiers__Group__2__Impl : ( ')' ) ;
    public final void rule__ParametersAndQualifiers__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3425:1: ( ( ')' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3426:1: ( ')' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3426:1: ( ')' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3427:1: ')'
            {
             before(grammarAccess.getParametersAndQualifiersAccess().getRightParenthesisKeyword_2()); 
            match(input,100,FOLLOW_100_in_rule__ParametersAndQualifiers__Group__2__Impl7194); 
             after(grammarAccess.getParametersAndQualifiersAccess().getRightParenthesisKeyword_2()); 

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
    // $ANTLR end "rule__ParametersAndQualifiers__Group__2__Impl"


    // $ANTLR start "rule__ParametersAndQualifiers__Group__3"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3440:1: rule__ParametersAndQualifiers__Group__3 : rule__ParametersAndQualifiers__Group__3__Impl rule__ParametersAndQualifiers__Group__4 ;
    public final void rule__ParametersAndQualifiers__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3444:1: ( rule__ParametersAndQualifiers__Group__3__Impl rule__ParametersAndQualifiers__Group__4 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3445:2: rule__ParametersAndQualifiers__Group__3__Impl rule__ParametersAndQualifiers__Group__4
            {
            pushFollow(FOLLOW_rule__ParametersAndQualifiers__Group__3__Impl_in_rule__ParametersAndQualifiers__Group__37225);
            rule__ParametersAndQualifiers__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParametersAndQualifiers__Group__4_in_rule__ParametersAndQualifiers__Group__37228);
            rule__ParametersAndQualifiers__Group__4();

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
    // $ANTLR end "rule__ParametersAndQualifiers__Group__3"


    // $ANTLR start "rule__ParametersAndQualifiers__Group__3__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3452:1: rule__ParametersAndQualifiers__Group__3__Impl : ( ( ruleAttributeSpecifier )* ) ;
    public final void rule__ParametersAndQualifiers__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3456:1: ( ( ( ruleAttributeSpecifier )* ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3457:1: ( ( ruleAttributeSpecifier )* )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3457:1: ( ( ruleAttributeSpecifier )* )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3458:1: ( ruleAttributeSpecifier )*
            {
             before(grammarAccess.getParametersAndQualifiersAccess().getAttributeSpecifierParserRuleCall_3()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3459:1: ( ruleAttributeSpecifier )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==97) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3459:3: ruleAttributeSpecifier
            	    {
            	    pushFollow(FOLLOW_ruleAttributeSpecifier_in_rule__ParametersAndQualifiers__Group__3__Impl7256);
            	    ruleAttributeSpecifier();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

             after(grammarAccess.getParametersAndQualifiersAccess().getAttributeSpecifierParserRuleCall_3()); 

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
    // $ANTLR end "rule__ParametersAndQualifiers__Group__3__Impl"


    // $ANTLR start "rule__ParametersAndQualifiers__Group__4"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3469:1: rule__ParametersAndQualifiers__Group__4 : rule__ParametersAndQualifiers__Group__4__Impl rule__ParametersAndQualifiers__Group__5 ;
    public final void rule__ParametersAndQualifiers__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3473:1: ( rule__ParametersAndQualifiers__Group__4__Impl rule__ParametersAndQualifiers__Group__5 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3474:2: rule__ParametersAndQualifiers__Group__4__Impl rule__ParametersAndQualifiers__Group__5
            {
            pushFollow(FOLLOW_rule__ParametersAndQualifiers__Group__4__Impl_in_rule__ParametersAndQualifiers__Group__47287);
            rule__ParametersAndQualifiers__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParametersAndQualifiers__Group__5_in_rule__ParametersAndQualifiers__Group__47290);
            rule__ParametersAndQualifiers__Group__5();

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
    // $ANTLR end "rule__ParametersAndQualifiers__Group__4"


    // $ANTLR start "rule__ParametersAndQualifiers__Group__4__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3481:1: rule__ParametersAndQualifiers__Group__4__Impl : ( ( rule__ParametersAndQualifiers__Alternatives_4 )? ) ;
    public final void rule__ParametersAndQualifiers__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3485:1: ( ( ( rule__ParametersAndQualifiers__Alternatives_4 )? ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3486:1: ( ( rule__ParametersAndQualifiers__Alternatives_4 )? )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3486:1: ( ( rule__ParametersAndQualifiers__Alternatives_4 )? )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3487:1: ( rule__ParametersAndQualifiers__Alternatives_4 )?
            {
             before(grammarAccess.getParametersAndQualifiersAccess().getAlternatives_4()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3488:1: ( rule__ParametersAndQualifiers__Alternatives_4 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( ((LA32_0>=50 && LA32_0<=51)) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3488:2: rule__ParametersAndQualifiers__Alternatives_4
                    {
                    pushFollow(FOLLOW_rule__ParametersAndQualifiers__Alternatives_4_in_rule__ParametersAndQualifiers__Group__4__Impl7317);
                    rule__ParametersAndQualifiers__Alternatives_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getParametersAndQualifiersAccess().getAlternatives_4()); 

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
    // $ANTLR end "rule__ParametersAndQualifiers__Group__4__Impl"


    // $ANTLR start "rule__ParametersAndQualifiers__Group__5"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3498:1: rule__ParametersAndQualifiers__Group__5 : rule__ParametersAndQualifiers__Group__5__Impl rule__ParametersAndQualifiers__Group__6 ;
    public final void rule__ParametersAndQualifiers__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3502:1: ( rule__ParametersAndQualifiers__Group__5__Impl rule__ParametersAndQualifiers__Group__6 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3503:2: rule__ParametersAndQualifiers__Group__5__Impl rule__ParametersAndQualifiers__Group__6
            {
            pushFollow(FOLLOW_rule__ParametersAndQualifiers__Group__5__Impl_in_rule__ParametersAndQualifiers__Group__57348);
            rule__ParametersAndQualifiers__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParametersAndQualifiers__Group__6_in_rule__ParametersAndQualifiers__Group__57351);
            rule__ParametersAndQualifiers__Group__6();

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
    // $ANTLR end "rule__ParametersAndQualifiers__Group__5"


    // $ANTLR start "rule__ParametersAndQualifiers__Group__5__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3510:1: rule__ParametersAndQualifiers__Group__5__Impl : ( ( rule__ParametersAndQualifiers__Alternatives_5 )? ) ;
    public final void rule__ParametersAndQualifiers__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3514:1: ( ( ( rule__ParametersAndQualifiers__Alternatives_5 )? ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3515:1: ( ( rule__ParametersAndQualifiers__Alternatives_5 )? )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3515:1: ( ( rule__ParametersAndQualifiers__Alternatives_5 )? )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3516:1: ( rule__ParametersAndQualifiers__Alternatives_5 )?
            {
             before(grammarAccess.getParametersAndQualifiersAccess().getAlternatives_5()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3517:1: ( rule__ParametersAndQualifiers__Alternatives_5 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( ((LA33_0>=52 && LA33_0<=53)) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3517:2: rule__ParametersAndQualifiers__Alternatives_5
                    {
                    pushFollow(FOLLOW_rule__ParametersAndQualifiers__Alternatives_5_in_rule__ParametersAndQualifiers__Group__5__Impl7378);
                    rule__ParametersAndQualifiers__Alternatives_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getParametersAndQualifiersAccess().getAlternatives_5()); 

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
    // $ANTLR end "rule__ParametersAndQualifiers__Group__5__Impl"


    // $ANTLR start "rule__ParametersAndQualifiers__Group__6"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3527:1: rule__ParametersAndQualifiers__Group__6 : rule__ParametersAndQualifiers__Group__6__Impl ;
    public final void rule__ParametersAndQualifiers__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3531:1: ( rule__ParametersAndQualifiers__Group__6__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3532:2: rule__ParametersAndQualifiers__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__ParametersAndQualifiers__Group__6__Impl_in_rule__ParametersAndQualifiers__Group__67409);
            rule__ParametersAndQualifiers__Group__6__Impl();

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
    // $ANTLR end "rule__ParametersAndQualifiers__Group__6"


    // $ANTLR start "rule__ParametersAndQualifiers__Group__6__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3538:1: rule__ParametersAndQualifiers__Group__6__Impl : ( ( ruleExceptionSpecification )? ) ;
    public final void rule__ParametersAndQualifiers__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3542:1: ( ( ( ruleExceptionSpecification )? ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3543:1: ( ( ruleExceptionSpecification )? )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3543:1: ( ( ruleExceptionSpecification )? )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3544:1: ( ruleExceptionSpecification )?
            {
             before(grammarAccess.getParametersAndQualifiersAccess().getExceptionSpecificationParserRuleCall_6()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3545:1: ( ruleExceptionSpecification )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( ((LA34_0>=108 && LA34_0<=109)) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3545:3: ruleExceptionSpecification
                    {
                    pushFollow(FOLLOW_ruleExceptionSpecification_in_rule__ParametersAndQualifiers__Group__6__Impl7437);
                    ruleExceptionSpecification();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getParametersAndQualifiersAccess().getExceptionSpecificationParserRuleCall_6()); 

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
    // $ANTLR end "rule__ParametersAndQualifiers__Group__6__Impl"


    // $ANTLR start "rule__DeclaratorId__Group_0__0"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3569:1: rule__DeclaratorId__Group_0__0 : rule__DeclaratorId__Group_0__0__Impl rule__DeclaratorId__Group_0__1 ;
    public final void rule__DeclaratorId__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3573:1: ( rule__DeclaratorId__Group_0__0__Impl rule__DeclaratorId__Group_0__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3574:2: rule__DeclaratorId__Group_0__0__Impl rule__DeclaratorId__Group_0__1
            {
            pushFollow(FOLLOW_rule__DeclaratorId__Group_0__0__Impl_in_rule__DeclaratorId__Group_0__07482);
            rule__DeclaratorId__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DeclaratorId__Group_0__1_in_rule__DeclaratorId__Group_0__07485);
            rule__DeclaratorId__Group_0__1();

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
    // $ANTLR end "rule__DeclaratorId__Group_0__0"


    // $ANTLR start "rule__DeclaratorId__Group_0__0__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3581:1: rule__DeclaratorId__Group_0__0__Impl : ( ( '...' )? ) ;
    public final void rule__DeclaratorId__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3585:1: ( ( ( '...' )? ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3586:1: ( ( '...' )? )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3586:1: ( ( '...' )? )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3587:1: ( '...' )?
            {
             before(grammarAccess.getDeclaratorIdAccess().getFullStopFullStopFullStopKeyword_0_0()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3588:1: ( '...' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==54) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3589:2: '...'
                    {
                    match(input,54,FOLLOW_54_in_rule__DeclaratorId__Group_0__0__Impl7514); 

                    }
                    break;

            }

             after(grammarAccess.getDeclaratorIdAccess().getFullStopFullStopFullStopKeyword_0_0()); 

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
    // $ANTLR end "rule__DeclaratorId__Group_0__0__Impl"


    // $ANTLR start "rule__DeclaratorId__Group_0__1"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3600:1: rule__DeclaratorId__Group_0__1 : rule__DeclaratorId__Group_0__1__Impl ;
    public final void rule__DeclaratorId__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3604:1: ( rule__DeclaratorId__Group_0__1__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3605:2: rule__DeclaratorId__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__DeclaratorId__Group_0__1__Impl_in_rule__DeclaratorId__Group_0__17547);
            rule__DeclaratorId__Group_0__1__Impl();

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
    // $ANTLR end "rule__DeclaratorId__Group_0__1"


    // $ANTLR start "rule__DeclaratorId__Group_0__1__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3611:1: rule__DeclaratorId__Group_0__1__Impl : ( ruleIdExpression ) ;
    public final void rule__DeclaratorId__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3615:1: ( ( ruleIdExpression ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3616:1: ( ruleIdExpression )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3616:1: ( ruleIdExpression )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3617:1: ruleIdExpression
            {
             before(grammarAccess.getDeclaratorIdAccess().getIdExpressionParserRuleCall_0_1()); 
            pushFollow(FOLLOW_ruleIdExpression_in_rule__DeclaratorId__Group_0__1__Impl7574);
            ruleIdExpression();

            state._fsp--;

             after(grammarAccess.getDeclaratorIdAccess().getIdExpressionParserRuleCall_0_1()); 

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
    // $ANTLR end "rule__DeclaratorId__Group_0__1__Impl"


    // $ANTLR start "rule__DeclaratorId__Group_1__0"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3632:1: rule__DeclaratorId__Group_1__0 : rule__DeclaratorId__Group_1__0__Impl rule__DeclaratorId__Group_1__1 ;
    public final void rule__DeclaratorId__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3636:1: ( rule__DeclaratorId__Group_1__0__Impl rule__DeclaratorId__Group_1__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3637:2: rule__DeclaratorId__Group_1__0__Impl rule__DeclaratorId__Group_1__1
            {
            pushFollow(FOLLOW_rule__DeclaratorId__Group_1__0__Impl_in_rule__DeclaratorId__Group_1__07607);
            rule__DeclaratorId__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DeclaratorId__Group_1__1_in_rule__DeclaratorId__Group_1__07610);
            rule__DeclaratorId__Group_1__1();

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
    // $ANTLR end "rule__DeclaratorId__Group_1__0"


    // $ANTLR start "rule__DeclaratorId__Group_1__0__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3644:1: rule__DeclaratorId__Group_1__0__Impl : ( ( '::' )? ) ;
    public final void rule__DeclaratorId__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3648:1: ( ( ( '::' )? ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3649:1: ( ( '::' )? )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3649:1: ( ( '::' )? )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3650:1: ( '::' )?
            {
             before(grammarAccess.getDeclaratorIdAccess().getColonColonKeyword_1_0()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3651:1: ( '::' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==96) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3652:2: '::'
                    {
                    match(input,96,FOLLOW_96_in_rule__DeclaratorId__Group_1__0__Impl7639); 

                    }
                    break;

            }

             after(grammarAccess.getDeclaratorIdAccess().getColonColonKeyword_1_0()); 

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
    // $ANTLR end "rule__DeclaratorId__Group_1__0__Impl"


    // $ANTLR start "rule__DeclaratorId__Group_1__1"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3663:1: rule__DeclaratorId__Group_1__1 : rule__DeclaratorId__Group_1__1__Impl rule__DeclaratorId__Group_1__2 ;
    public final void rule__DeclaratorId__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3667:1: ( rule__DeclaratorId__Group_1__1__Impl rule__DeclaratorId__Group_1__2 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3668:2: rule__DeclaratorId__Group_1__1__Impl rule__DeclaratorId__Group_1__2
            {
            pushFollow(FOLLOW_rule__DeclaratorId__Group_1__1__Impl_in_rule__DeclaratorId__Group_1__17672);
            rule__DeclaratorId__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DeclaratorId__Group_1__2_in_rule__DeclaratorId__Group_1__17675);
            rule__DeclaratorId__Group_1__2();

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
    // $ANTLR end "rule__DeclaratorId__Group_1__1"


    // $ANTLR start "rule__DeclaratorId__Group_1__1__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3675:1: rule__DeclaratorId__Group_1__1__Impl : ( ( ruleNestedNameSpecifier )? ) ;
    public final void rule__DeclaratorId__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3679:1: ( ( ( ruleNestedNameSpecifier )? ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3680:1: ( ( ruleNestedNameSpecifier )? )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3680:1: ( ( ruleNestedNameSpecifier )? )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3681:1: ( ruleNestedNameSpecifier )?
            {
             before(grammarAccess.getDeclaratorIdAccess().getNestedNameSpecifierParserRuleCall_1_1()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3682:1: ( ruleNestedNameSpecifier )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==39) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3682:3: ruleNestedNameSpecifier
                    {
                    pushFollow(FOLLOW_ruleNestedNameSpecifier_in_rule__DeclaratorId__Group_1__1__Impl7703);
                    ruleNestedNameSpecifier();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDeclaratorIdAccess().getNestedNameSpecifierParserRuleCall_1_1()); 

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
    // $ANTLR end "rule__DeclaratorId__Group_1__1__Impl"


    // $ANTLR start "rule__DeclaratorId__Group_1__2"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3692:1: rule__DeclaratorId__Group_1__2 : rule__DeclaratorId__Group_1__2__Impl ;
    public final void rule__DeclaratorId__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3696:1: ( rule__DeclaratorId__Group_1__2__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3697:2: rule__DeclaratorId__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__DeclaratorId__Group_1__2__Impl_in_rule__DeclaratorId__Group_1__27734);
            rule__DeclaratorId__Group_1__2__Impl();

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
    // $ANTLR end "rule__DeclaratorId__Group_1__2"


    // $ANTLR start "rule__DeclaratorId__Group_1__2__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3703:1: rule__DeclaratorId__Group_1__2__Impl : ( ruleClassName ) ;
    public final void rule__DeclaratorId__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3707:1: ( ( ruleClassName ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3708:1: ( ruleClassName )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3708:1: ( ruleClassName )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3709:1: ruleClassName
            {
             before(grammarAccess.getDeclaratorIdAccess().getClassNameParserRuleCall_1_2()); 
            pushFollow(FOLLOW_ruleClassName_in_rule__DeclaratorId__Group_1__2__Impl7761);
            ruleClassName();

            state._fsp--;

             after(grammarAccess.getDeclaratorIdAccess().getClassNameParserRuleCall_1_2()); 

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
    // $ANTLR end "rule__DeclaratorId__Group_1__2__Impl"


    // $ANTLR start "rule__ParameterDeclarationClause__Group_1__0"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3726:1: rule__ParameterDeclarationClause__Group_1__0 : rule__ParameterDeclarationClause__Group_1__0__Impl rule__ParameterDeclarationClause__Group_1__1 ;
    public final void rule__ParameterDeclarationClause__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3730:1: ( rule__ParameterDeclarationClause__Group_1__0__Impl rule__ParameterDeclarationClause__Group_1__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3731:2: rule__ParameterDeclarationClause__Group_1__0__Impl rule__ParameterDeclarationClause__Group_1__1
            {
            pushFollow(FOLLOW_rule__ParameterDeclarationClause__Group_1__0__Impl_in_rule__ParameterDeclarationClause__Group_1__07796);
            rule__ParameterDeclarationClause__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParameterDeclarationClause__Group_1__1_in_rule__ParameterDeclarationClause__Group_1__07799);
            rule__ParameterDeclarationClause__Group_1__1();

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
    // $ANTLR end "rule__ParameterDeclarationClause__Group_1__0"


    // $ANTLR start "rule__ParameterDeclarationClause__Group_1__0__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3738:1: rule__ParameterDeclarationClause__Group_1__0__Impl : ( ruleParameterDeclarationList ) ;
    public final void rule__ParameterDeclarationClause__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3742:1: ( ( ruleParameterDeclarationList ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3743:1: ( ruleParameterDeclarationList )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3743:1: ( ruleParameterDeclarationList )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3744:1: ruleParameterDeclarationList
            {
             before(grammarAccess.getParameterDeclarationClauseAccess().getParameterDeclarationListParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleParameterDeclarationList_in_rule__ParameterDeclarationClause__Group_1__0__Impl7826);
            ruleParameterDeclarationList();

            state._fsp--;

             after(grammarAccess.getParameterDeclarationClauseAccess().getParameterDeclarationListParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__ParameterDeclarationClause__Group_1__0__Impl"


    // $ANTLR start "rule__ParameterDeclarationClause__Group_1__1"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3755:1: rule__ParameterDeclarationClause__Group_1__1 : rule__ParameterDeclarationClause__Group_1__1__Impl ;
    public final void rule__ParameterDeclarationClause__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3759:1: ( rule__ParameterDeclarationClause__Group_1__1__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3760:2: rule__ParameterDeclarationClause__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__ParameterDeclarationClause__Group_1__1__Impl_in_rule__ParameterDeclarationClause__Group_1__17855);
            rule__ParameterDeclarationClause__Group_1__1__Impl();

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
    // $ANTLR end "rule__ParameterDeclarationClause__Group_1__1"


    // $ANTLR start "rule__ParameterDeclarationClause__Group_1__1__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3766:1: rule__ParameterDeclarationClause__Group_1__1__Impl : ( ( rule__ParameterDeclarationClause__Group_1_1__0 )? ) ;
    public final void rule__ParameterDeclarationClause__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3770:1: ( ( ( rule__ParameterDeclarationClause__Group_1_1__0 )? ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3771:1: ( ( rule__ParameterDeclarationClause__Group_1_1__0 )? )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3771:1: ( ( rule__ParameterDeclarationClause__Group_1_1__0 )? )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3772:1: ( rule__ParameterDeclarationClause__Group_1_1__0 )?
            {
             before(grammarAccess.getParameterDeclarationClauseAccess().getGroup_1_1()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3773:1: ( rule__ParameterDeclarationClause__Group_1_1__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==54||LA38_0==88) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3773:2: rule__ParameterDeclarationClause__Group_1_1__0
                    {
                    pushFollow(FOLLOW_rule__ParameterDeclarationClause__Group_1_1__0_in_rule__ParameterDeclarationClause__Group_1__1__Impl7882);
                    rule__ParameterDeclarationClause__Group_1_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getParameterDeclarationClauseAccess().getGroup_1_1()); 

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
    // $ANTLR end "rule__ParameterDeclarationClause__Group_1__1__Impl"


    // $ANTLR start "rule__ParameterDeclarationClause__Group_1_1__0"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3787:1: rule__ParameterDeclarationClause__Group_1_1__0 : rule__ParameterDeclarationClause__Group_1_1__0__Impl rule__ParameterDeclarationClause__Group_1_1__1 ;
    public final void rule__ParameterDeclarationClause__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3791:1: ( rule__ParameterDeclarationClause__Group_1_1__0__Impl rule__ParameterDeclarationClause__Group_1_1__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3792:2: rule__ParameterDeclarationClause__Group_1_1__0__Impl rule__ParameterDeclarationClause__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__ParameterDeclarationClause__Group_1_1__0__Impl_in_rule__ParameterDeclarationClause__Group_1_1__07917);
            rule__ParameterDeclarationClause__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParameterDeclarationClause__Group_1_1__1_in_rule__ParameterDeclarationClause__Group_1_1__07920);
            rule__ParameterDeclarationClause__Group_1_1__1();

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
    // $ANTLR end "rule__ParameterDeclarationClause__Group_1_1__0"


    // $ANTLR start "rule__ParameterDeclarationClause__Group_1_1__0__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3799:1: rule__ParameterDeclarationClause__Group_1_1__0__Impl : ( ( ',' )? ) ;
    public final void rule__ParameterDeclarationClause__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3803:1: ( ( ( ',' )? ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3804:1: ( ( ',' )? )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3804:1: ( ( ',' )? )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3805:1: ( ',' )?
            {
             before(grammarAccess.getParameterDeclarationClauseAccess().getCommaKeyword_1_1_0()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3806:1: ( ',' )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==88) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3807:2: ','
                    {
                    match(input,88,FOLLOW_88_in_rule__ParameterDeclarationClause__Group_1_1__0__Impl7949); 

                    }
                    break;

            }

             after(grammarAccess.getParameterDeclarationClauseAccess().getCommaKeyword_1_1_0()); 

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
    // $ANTLR end "rule__ParameterDeclarationClause__Group_1_1__0__Impl"


    // $ANTLR start "rule__ParameterDeclarationClause__Group_1_1__1"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3818:1: rule__ParameterDeclarationClause__Group_1_1__1 : rule__ParameterDeclarationClause__Group_1_1__1__Impl ;
    public final void rule__ParameterDeclarationClause__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3822:1: ( rule__ParameterDeclarationClause__Group_1_1__1__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3823:2: rule__ParameterDeclarationClause__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__ParameterDeclarationClause__Group_1_1__1__Impl_in_rule__ParameterDeclarationClause__Group_1_1__17982);
            rule__ParameterDeclarationClause__Group_1_1__1__Impl();

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
    // $ANTLR end "rule__ParameterDeclarationClause__Group_1_1__1"


    // $ANTLR start "rule__ParameterDeclarationClause__Group_1_1__1__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3829:1: rule__ParameterDeclarationClause__Group_1_1__1__Impl : ( '...' ) ;
    public final void rule__ParameterDeclarationClause__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3833:1: ( ( '...' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3834:1: ( '...' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3834:1: ( '...' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3835:1: '...'
            {
             before(grammarAccess.getParameterDeclarationClauseAccess().getFullStopFullStopFullStopKeyword_1_1_1()); 
            match(input,54,FOLLOW_54_in_rule__ParameterDeclarationClause__Group_1_1__1__Impl8010); 
             after(grammarAccess.getParameterDeclarationClauseAccess().getFullStopFullStopFullStopKeyword_1_1_1()); 

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
    // $ANTLR end "rule__ParameterDeclarationClause__Group_1_1__1__Impl"


    // $ANTLR start "rule__ParameterDeclarationList__Group__0"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3852:1: rule__ParameterDeclarationList__Group__0 : rule__ParameterDeclarationList__Group__0__Impl rule__ParameterDeclarationList__Group__1 ;
    public final void rule__ParameterDeclarationList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3856:1: ( rule__ParameterDeclarationList__Group__0__Impl rule__ParameterDeclarationList__Group__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3857:2: rule__ParameterDeclarationList__Group__0__Impl rule__ParameterDeclarationList__Group__1
            {
            pushFollow(FOLLOW_rule__ParameterDeclarationList__Group__0__Impl_in_rule__ParameterDeclarationList__Group__08045);
            rule__ParameterDeclarationList__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParameterDeclarationList__Group__1_in_rule__ParameterDeclarationList__Group__08048);
            rule__ParameterDeclarationList__Group__1();

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
    // $ANTLR end "rule__ParameterDeclarationList__Group__0"


    // $ANTLR start "rule__ParameterDeclarationList__Group__0__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3864:1: rule__ParameterDeclarationList__Group__0__Impl : ( ruleParameterDeclaration ) ;
    public final void rule__ParameterDeclarationList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3868:1: ( ( ruleParameterDeclaration ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3869:1: ( ruleParameterDeclaration )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3869:1: ( ruleParameterDeclaration )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3870:1: ruleParameterDeclaration
            {
             before(grammarAccess.getParameterDeclarationListAccess().getParameterDeclarationParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleParameterDeclaration_in_rule__ParameterDeclarationList__Group__0__Impl8075);
            ruleParameterDeclaration();

            state._fsp--;

             after(grammarAccess.getParameterDeclarationListAccess().getParameterDeclarationParserRuleCall_0()); 

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
    // $ANTLR end "rule__ParameterDeclarationList__Group__0__Impl"


    // $ANTLR start "rule__ParameterDeclarationList__Group__1"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3881:1: rule__ParameterDeclarationList__Group__1 : rule__ParameterDeclarationList__Group__1__Impl ;
    public final void rule__ParameterDeclarationList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3885:1: ( rule__ParameterDeclarationList__Group__1__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3886:2: rule__ParameterDeclarationList__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ParameterDeclarationList__Group__1__Impl_in_rule__ParameterDeclarationList__Group__18104);
            rule__ParameterDeclarationList__Group__1__Impl();

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
    // $ANTLR end "rule__ParameterDeclarationList__Group__1"


    // $ANTLR start "rule__ParameterDeclarationList__Group__1__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3892:1: rule__ParameterDeclarationList__Group__1__Impl : ( ( rule__ParameterDeclarationList__Group_1__0 )* ) ;
    public final void rule__ParameterDeclarationList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3896:1: ( ( ( rule__ParameterDeclarationList__Group_1__0 )* ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3897:1: ( ( rule__ParameterDeclarationList__Group_1__0 )* )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3897:1: ( ( rule__ParameterDeclarationList__Group_1__0 )* )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3898:1: ( rule__ParameterDeclarationList__Group_1__0 )*
            {
             before(grammarAccess.getParameterDeclarationListAccess().getGroup_1()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3899:1: ( rule__ParameterDeclarationList__Group_1__0 )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==88) ) {
                    int LA40_2 = input.LA(2);

                    if ( (LA40_2==37||LA40_2==97) ) {
                        alt40=1;
                    }


                }


                switch (alt40) {
            	case 1 :
            	    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3899:2: rule__ParameterDeclarationList__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__ParameterDeclarationList__Group_1__0_in_rule__ParameterDeclarationList__Group__1__Impl8131);
            	    rule__ParameterDeclarationList__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

             after(grammarAccess.getParameterDeclarationListAccess().getGroup_1()); 

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
    // $ANTLR end "rule__ParameterDeclarationList__Group__1__Impl"


    // $ANTLR start "rule__ParameterDeclarationList__Group_1__0"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3913:1: rule__ParameterDeclarationList__Group_1__0 : rule__ParameterDeclarationList__Group_1__0__Impl rule__ParameterDeclarationList__Group_1__1 ;
    public final void rule__ParameterDeclarationList__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3917:1: ( rule__ParameterDeclarationList__Group_1__0__Impl rule__ParameterDeclarationList__Group_1__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3918:2: rule__ParameterDeclarationList__Group_1__0__Impl rule__ParameterDeclarationList__Group_1__1
            {
            pushFollow(FOLLOW_rule__ParameterDeclarationList__Group_1__0__Impl_in_rule__ParameterDeclarationList__Group_1__08166);
            rule__ParameterDeclarationList__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParameterDeclarationList__Group_1__1_in_rule__ParameterDeclarationList__Group_1__08169);
            rule__ParameterDeclarationList__Group_1__1();

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
    // $ANTLR end "rule__ParameterDeclarationList__Group_1__0"


    // $ANTLR start "rule__ParameterDeclarationList__Group_1__0__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3925:1: rule__ParameterDeclarationList__Group_1__0__Impl : ( ',' ) ;
    public final void rule__ParameterDeclarationList__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3929:1: ( ( ',' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3930:1: ( ',' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3930:1: ( ',' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3931:1: ','
            {
             before(grammarAccess.getParameterDeclarationListAccess().getCommaKeyword_1_0()); 
            match(input,88,FOLLOW_88_in_rule__ParameterDeclarationList__Group_1__0__Impl8197); 
             after(grammarAccess.getParameterDeclarationListAccess().getCommaKeyword_1_0()); 

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
    // $ANTLR end "rule__ParameterDeclarationList__Group_1__0__Impl"


    // $ANTLR start "rule__ParameterDeclarationList__Group_1__1"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3944:1: rule__ParameterDeclarationList__Group_1__1 : rule__ParameterDeclarationList__Group_1__1__Impl ;
    public final void rule__ParameterDeclarationList__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3948:1: ( rule__ParameterDeclarationList__Group_1__1__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3949:2: rule__ParameterDeclarationList__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__ParameterDeclarationList__Group_1__1__Impl_in_rule__ParameterDeclarationList__Group_1__18228);
            rule__ParameterDeclarationList__Group_1__1__Impl();

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
    // $ANTLR end "rule__ParameterDeclarationList__Group_1__1"


    // $ANTLR start "rule__ParameterDeclarationList__Group_1__1__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3955:1: rule__ParameterDeclarationList__Group_1__1__Impl : ( ruleParameterDeclaration ) ;
    public final void rule__ParameterDeclarationList__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3959:1: ( ( ruleParameterDeclaration ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3960:1: ( ruleParameterDeclaration )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3960:1: ( ruleParameterDeclaration )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3961:1: ruleParameterDeclaration
            {
             before(grammarAccess.getParameterDeclarationListAccess().getParameterDeclarationParserRuleCall_1_1()); 
            pushFollow(FOLLOW_ruleParameterDeclaration_in_rule__ParameterDeclarationList__Group_1__1__Impl8255);
            ruleParameterDeclaration();

            state._fsp--;

             after(grammarAccess.getParameterDeclarationListAccess().getParameterDeclarationParserRuleCall_1_1()); 

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
    // $ANTLR end "rule__ParameterDeclarationList__Group_1__1__Impl"


    // $ANTLR start "rule__ParameterDeclaration__Group__0"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3976:1: rule__ParameterDeclaration__Group__0 : rule__ParameterDeclaration__Group__0__Impl rule__ParameterDeclaration__Group__1 ;
    public final void rule__ParameterDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3980:1: ( rule__ParameterDeclaration__Group__0__Impl rule__ParameterDeclaration__Group__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3981:2: rule__ParameterDeclaration__Group__0__Impl rule__ParameterDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__ParameterDeclaration__Group__0__Impl_in_rule__ParameterDeclaration__Group__08288);
            rule__ParameterDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParameterDeclaration__Group__1_in_rule__ParameterDeclaration__Group__08291);
            rule__ParameterDeclaration__Group__1();

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
    // $ANTLR end "rule__ParameterDeclaration__Group__0"


    // $ANTLR start "rule__ParameterDeclaration__Group__0__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3988:1: rule__ParameterDeclaration__Group__0__Impl : ( ( ruleAttributeSpecifier )* ) ;
    public final void rule__ParameterDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3992:1: ( ( ( ruleAttributeSpecifier )* ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3993:1: ( ( ruleAttributeSpecifier )* )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3993:1: ( ( ruleAttributeSpecifier )* )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3994:1: ( ruleAttributeSpecifier )*
            {
             before(grammarAccess.getParameterDeclarationAccess().getAttributeSpecifierParserRuleCall_0()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3995:1: ( ruleAttributeSpecifier )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==97) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3995:3: ruleAttributeSpecifier
            	    {
            	    pushFollow(FOLLOW_ruleAttributeSpecifier_in_rule__ParameterDeclaration__Group__0__Impl8319);
            	    ruleAttributeSpecifier();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

             after(grammarAccess.getParameterDeclarationAccess().getAttributeSpecifierParserRuleCall_0()); 

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
    // $ANTLR end "rule__ParameterDeclaration__Group__0__Impl"


    // $ANTLR start "rule__ParameterDeclaration__Group__1"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4005:1: rule__ParameterDeclaration__Group__1 : rule__ParameterDeclaration__Group__1__Impl rule__ParameterDeclaration__Group__2 ;
    public final void rule__ParameterDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4009:1: ( rule__ParameterDeclaration__Group__1__Impl rule__ParameterDeclaration__Group__2 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4010:2: rule__ParameterDeclaration__Group__1__Impl rule__ParameterDeclaration__Group__2
            {
            pushFollow(FOLLOW_rule__ParameterDeclaration__Group__1__Impl_in_rule__ParameterDeclaration__Group__18350);
            rule__ParameterDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParameterDeclaration__Group__2_in_rule__ParameterDeclaration__Group__18353);
            rule__ParameterDeclaration__Group__2();

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
    // $ANTLR end "rule__ParameterDeclaration__Group__1"


    // $ANTLR start "rule__ParameterDeclaration__Group__1__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4017:1: rule__ParameterDeclaration__Group__1__Impl : ( ( ( ruleDeclarationSpecifier ) ) ( ( ruleDeclarationSpecifier )* ) ) ;
    public final void rule__ParameterDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4021:1: ( ( ( ( ruleDeclarationSpecifier ) ) ( ( ruleDeclarationSpecifier )* ) ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4022:1: ( ( ( ruleDeclarationSpecifier ) ) ( ( ruleDeclarationSpecifier )* ) )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4022:1: ( ( ( ruleDeclarationSpecifier ) ) ( ( ruleDeclarationSpecifier )* ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4023:1: ( ( ruleDeclarationSpecifier ) ) ( ( ruleDeclarationSpecifier )* )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4023:1: ( ( ruleDeclarationSpecifier ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4024:1: ( ruleDeclarationSpecifier )
            {
             before(grammarAccess.getParameterDeclarationAccess().getDeclarationSpecifierParserRuleCall_1()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4025:1: ( ruleDeclarationSpecifier )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4025:3: ruleDeclarationSpecifier
            {
            pushFollow(FOLLOW_ruleDeclarationSpecifier_in_rule__ParameterDeclaration__Group__1__Impl8383);
            ruleDeclarationSpecifier();

            state._fsp--;


            }

             after(grammarAccess.getParameterDeclarationAccess().getDeclarationSpecifierParserRuleCall_1()); 

            }

            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4028:1: ( ( ruleDeclarationSpecifier )* )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4029:1: ( ruleDeclarationSpecifier )*
            {
             before(grammarAccess.getParameterDeclarationAccess().getDeclarationSpecifierParserRuleCall_1()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4030:1: ( ruleDeclarationSpecifier )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==37) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4030:3: ruleDeclarationSpecifier
            	    {
            	    pushFollow(FOLLOW_ruleDeclarationSpecifier_in_rule__ParameterDeclaration__Group__1__Impl8396);
            	    ruleDeclarationSpecifier();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);

             after(grammarAccess.getParameterDeclarationAccess().getDeclarationSpecifierParserRuleCall_1()); 

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
    // $ANTLR end "rule__ParameterDeclaration__Group__1__Impl"


    // $ANTLR start "rule__ParameterDeclaration__Group__2"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4041:1: rule__ParameterDeclaration__Group__2 : rule__ParameterDeclaration__Group__2__Impl ;
    public final void rule__ParameterDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4045:1: ( rule__ParameterDeclaration__Group__2__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4046:2: rule__ParameterDeclaration__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ParameterDeclaration__Group__2__Impl_in_rule__ParameterDeclaration__Group__28429);
            rule__ParameterDeclaration__Group__2__Impl();

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
    // $ANTLR end "rule__ParameterDeclaration__Group__2"


    // $ANTLR start "rule__ParameterDeclaration__Group__2__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4052:1: rule__ParameterDeclaration__Group__2__Impl : ( ruleInitDeclarator ) ;
    public final void rule__ParameterDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4056:1: ( ( ruleInitDeclarator ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4057:1: ( ruleInitDeclarator )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4057:1: ( ruleInitDeclarator )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4058:1: ruleInitDeclarator
            {
             before(grammarAccess.getParameterDeclarationAccess().getInitDeclaratorParserRuleCall_2()); 
            pushFollow(FOLLOW_ruleInitDeclarator_in_rule__ParameterDeclaration__Group__2__Impl8456);
            ruleInitDeclarator();

            state._fsp--;

             after(grammarAccess.getParameterDeclarationAccess().getInitDeclaratorParserRuleCall_2()); 

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
    // $ANTLR end "rule__ParameterDeclaration__Group__2__Impl"


    // $ANTLR start "rule__FunctionDefinition__Group__0"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4075:1: rule__FunctionDefinition__Group__0 : rule__FunctionDefinition__Group__0__Impl rule__FunctionDefinition__Group__1 ;
    public final void rule__FunctionDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4079:1: ( rule__FunctionDefinition__Group__0__Impl rule__FunctionDefinition__Group__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4080:2: rule__FunctionDefinition__Group__0__Impl rule__FunctionDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__FunctionDefinition__Group__0__Impl_in_rule__FunctionDefinition__Group__08491);
            rule__FunctionDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FunctionDefinition__Group__1_in_rule__FunctionDefinition__Group__08494);
            rule__FunctionDefinition__Group__1();

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
    // $ANTLR end "rule__FunctionDefinition__Group__0"


    // $ANTLR start "rule__FunctionDefinition__Group__0__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4087:1: rule__FunctionDefinition__Group__0__Impl : ( ( ruleAttributeSpecifier )* ) ;
    public final void rule__FunctionDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4091:1: ( ( ( ruleAttributeSpecifier )* ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4092:1: ( ( ruleAttributeSpecifier )* )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4092:1: ( ( ruleAttributeSpecifier )* )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4093:1: ( ruleAttributeSpecifier )*
            {
             before(grammarAccess.getFunctionDefinitionAccess().getAttributeSpecifierParserRuleCall_0()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4094:1: ( ruleAttributeSpecifier )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==97) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4094:3: ruleAttributeSpecifier
            	    {
            	    pushFollow(FOLLOW_ruleAttributeSpecifier_in_rule__FunctionDefinition__Group__0__Impl8522);
            	    ruleAttributeSpecifier();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);

             after(grammarAccess.getFunctionDefinitionAccess().getAttributeSpecifierParserRuleCall_0()); 

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
    // $ANTLR end "rule__FunctionDefinition__Group__0__Impl"


    // $ANTLR start "rule__FunctionDefinition__Group__1"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4104:1: rule__FunctionDefinition__Group__1 : rule__FunctionDefinition__Group__1__Impl rule__FunctionDefinition__Group__2 ;
    public final void rule__FunctionDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4108:1: ( rule__FunctionDefinition__Group__1__Impl rule__FunctionDefinition__Group__2 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4109:2: rule__FunctionDefinition__Group__1__Impl rule__FunctionDefinition__Group__2
            {
            pushFollow(FOLLOW_rule__FunctionDefinition__Group__1__Impl_in_rule__FunctionDefinition__Group__18553);
            rule__FunctionDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FunctionDefinition__Group__2_in_rule__FunctionDefinition__Group__18556);
            rule__FunctionDefinition__Group__2();

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
    // $ANTLR end "rule__FunctionDefinition__Group__1"


    // $ANTLR start "rule__FunctionDefinition__Group__1__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4116:1: rule__FunctionDefinition__Group__1__Impl : ( ( ruleDeclarationSpecifier )* ) ;
    public final void rule__FunctionDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4120:1: ( ( ( ruleDeclarationSpecifier )* ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4121:1: ( ( ruleDeclarationSpecifier )* )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4121:1: ( ( ruleDeclarationSpecifier )* )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4122:1: ( ruleDeclarationSpecifier )*
            {
             before(grammarAccess.getFunctionDefinitionAccess().getDeclarationSpecifierParserRuleCall_1()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4123:1: ( ruleDeclarationSpecifier )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==37) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4123:3: ruleDeclarationSpecifier
            	    {
            	    pushFollow(FOLLOW_ruleDeclarationSpecifier_in_rule__FunctionDefinition__Group__1__Impl8584);
            	    ruleDeclarationSpecifier();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);

             after(grammarAccess.getFunctionDefinitionAccess().getDeclarationSpecifierParserRuleCall_1()); 

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
    // $ANTLR end "rule__FunctionDefinition__Group__1__Impl"


    // $ANTLR start "rule__FunctionDefinition__Group__2"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4133:1: rule__FunctionDefinition__Group__2 : rule__FunctionDefinition__Group__2__Impl rule__FunctionDefinition__Group__3 ;
    public final void rule__FunctionDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4137:1: ( rule__FunctionDefinition__Group__2__Impl rule__FunctionDefinition__Group__3 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4138:2: rule__FunctionDefinition__Group__2__Impl rule__FunctionDefinition__Group__3
            {
            pushFollow(FOLLOW_rule__FunctionDefinition__Group__2__Impl_in_rule__FunctionDefinition__Group__28615);
            rule__FunctionDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FunctionDefinition__Group__3_in_rule__FunctionDefinition__Group__28618);
            rule__FunctionDefinition__Group__3();

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
    // $ANTLR end "rule__FunctionDefinition__Group__2"


    // $ANTLR start "rule__FunctionDefinition__Group__2__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4145:1: rule__FunctionDefinition__Group__2__Impl : ( ruleFunctionDeclarator ) ;
    public final void rule__FunctionDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4149:1: ( ( ruleFunctionDeclarator ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4150:1: ( ruleFunctionDeclarator )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4150:1: ( ruleFunctionDeclarator )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4151:1: ruleFunctionDeclarator
            {
             before(grammarAccess.getFunctionDefinitionAccess().getFunctionDeclaratorParserRuleCall_2()); 
            pushFollow(FOLLOW_ruleFunctionDeclarator_in_rule__FunctionDefinition__Group__2__Impl8645);
            ruleFunctionDeclarator();

            state._fsp--;

             after(grammarAccess.getFunctionDefinitionAccess().getFunctionDeclaratorParserRuleCall_2()); 

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
    // $ANTLR end "rule__FunctionDefinition__Group__2__Impl"


    // $ANTLR start "rule__FunctionDefinition__Group__3"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4162:1: rule__FunctionDefinition__Group__3 : rule__FunctionDefinition__Group__3__Impl ;
    public final void rule__FunctionDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4166:1: ( rule__FunctionDefinition__Group__3__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4167:2: rule__FunctionDefinition__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__FunctionDefinition__Group__3__Impl_in_rule__FunctionDefinition__Group__38674);
            rule__FunctionDefinition__Group__3__Impl();

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
    // $ANTLR end "rule__FunctionDefinition__Group__3"


    // $ANTLR start "rule__FunctionDefinition__Group__3__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4173:1: rule__FunctionDefinition__Group__3__Impl : ( ( rule__FunctionDefinition__Alternatives_3 ) ) ;
    public final void rule__FunctionDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4177:1: ( ( ( rule__FunctionDefinition__Alternatives_3 ) ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4178:1: ( ( rule__FunctionDefinition__Alternatives_3 ) )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4178:1: ( ( rule__FunctionDefinition__Alternatives_3 ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4179:1: ( rule__FunctionDefinition__Alternatives_3 )
            {
             before(grammarAccess.getFunctionDefinitionAccess().getAlternatives_3()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4180:1: ( rule__FunctionDefinition__Alternatives_3 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4180:2: rule__FunctionDefinition__Alternatives_3
            {
            pushFollow(FOLLOW_rule__FunctionDefinition__Alternatives_3_in_rule__FunctionDefinition__Group__3__Impl8701);
            rule__FunctionDefinition__Alternatives_3();

            state._fsp--;


            }

             after(grammarAccess.getFunctionDefinitionAccess().getAlternatives_3()); 

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
    // $ANTLR end "rule__FunctionDefinition__Group__3__Impl"


    // $ANTLR start "rule__FunctionDefinition__Group_3_1__0"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4198:1: rule__FunctionDefinition__Group_3_1__0 : rule__FunctionDefinition__Group_3_1__0__Impl rule__FunctionDefinition__Group_3_1__1 ;
    public final void rule__FunctionDefinition__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4202:1: ( rule__FunctionDefinition__Group_3_1__0__Impl rule__FunctionDefinition__Group_3_1__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4203:2: rule__FunctionDefinition__Group_3_1__0__Impl rule__FunctionDefinition__Group_3_1__1
            {
            pushFollow(FOLLOW_rule__FunctionDefinition__Group_3_1__0__Impl_in_rule__FunctionDefinition__Group_3_1__08739);
            rule__FunctionDefinition__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FunctionDefinition__Group_3_1__1_in_rule__FunctionDefinition__Group_3_1__08742);
            rule__FunctionDefinition__Group_3_1__1();

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
    // $ANTLR end "rule__FunctionDefinition__Group_3_1__0"


    // $ANTLR start "rule__FunctionDefinition__Group_3_1__0__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4210:1: rule__FunctionDefinition__Group_3_1__0__Impl : ( '=' ) ;
    public final void rule__FunctionDefinition__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4214:1: ( ( '=' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4215:1: ( '=' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4215:1: ( '=' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4216:1: '='
            {
             before(grammarAccess.getFunctionDefinitionAccess().getEqualsSignKeyword_3_1_0()); 
            match(input,66,FOLLOW_66_in_rule__FunctionDefinition__Group_3_1__0__Impl8770); 
             after(grammarAccess.getFunctionDefinitionAccess().getEqualsSignKeyword_3_1_0()); 

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
    // $ANTLR end "rule__FunctionDefinition__Group_3_1__0__Impl"


    // $ANTLR start "rule__FunctionDefinition__Group_3_1__1"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4229:1: rule__FunctionDefinition__Group_3_1__1 : rule__FunctionDefinition__Group_3_1__1__Impl rule__FunctionDefinition__Group_3_1__2 ;
    public final void rule__FunctionDefinition__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4233:1: ( rule__FunctionDefinition__Group_3_1__1__Impl rule__FunctionDefinition__Group_3_1__2 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4234:2: rule__FunctionDefinition__Group_3_1__1__Impl rule__FunctionDefinition__Group_3_1__2
            {
            pushFollow(FOLLOW_rule__FunctionDefinition__Group_3_1__1__Impl_in_rule__FunctionDefinition__Group_3_1__18801);
            rule__FunctionDefinition__Group_3_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FunctionDefinition__Group_3_1__2_in_rule__FunctionDefinition__Group_3_1__18804);
            rule__FunctionDefinition__Group_3_1__2();

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
    // $ANTLR end "rule__FunctionDefinition__Group_3_1__1"


    // $ANTLR start "rule__FunctionDefinition__Group_3_1__1__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4241:1: rule__FunctionDefinition__Group_3_1__1__Impl : ( 'default' ) ;
    public final void rule__FunctionDefinition__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4245:1: ( ( 'default' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4246:1: ( 'default' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4246:1: ( 'default' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4247:1: 'default'
            {
             before(grammarAccess.getFunctionDefinitionAccess().getDefaultKeyword_3_1_1()); 
            match(input,101,FOLLOW_101_in_rule__FunctionDefinition__Group_3_1__1__Impl8832); 
             after(grammarAccess.getFunctionDefinitionAccess().getDefaultKeyword_3_1_1()); 

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
    // $ANTLR end "rule__FunctionDefinition__Group_3_1__1__Impl"


    // $ANTLR start "rule__FunctionDefinition__Group_3_1__2"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4260:1: rule__FunctionDefinition__Group_3_1__2 : rule__FunctionDefinition__Group_3_1__2__Impl ;
    public final void rule__FunctionDefinition__Group_3_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4264:1: ( rule__FunctionDefinition__Group_3_1__2__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4265:2: rule__FunctionDefinition__Group_3_1__2__Impl
            {
            pushFollow(FOLLOW_rule__FunctionDefinition__Group_3_1__2__Impl_in_rule__FunctionDefinition__Group_3_1__28863);
            rule__FunctionDefinition__Group_3_1__2__Impl();

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
    // $ANTLR end "rule__FunctionDefinition__Group_3_1__2"


    // $ANTLR start "rule__FunctionDefinition__Group_3_1__2__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4271:1: rule__FunctionDefinition__Group_3_1__2__Impl : ( ';' ) ;
    public final void rule__FunctionDefinition__Group_3_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4275:1: ( ( ';' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4276:1: ( ';' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4276:1: ( ';' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4277:1: ';'
            {
             before(grammarAccess.getFunctionDefinitionAccess().getSemicolonKeyword_3_1_2()); 
            match(input,102,FOLLOW_102_in_rule__FunctionDefinition__Group_3_1__2__Impl8891); 
             after(grammarAccess.getFunctionDefinitionAccess().getSemicolonKeyword_3_1_2()); 

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
    // $ANTLR end "rule__FunctionDefinition__Group_3_1__2__Impl"


    // $ANTLR start "rule__FunctionDefinition__Group_3_2__0"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4296:1: rule__FunctionDefinition__Group_3_2__0 : rule__FunctionDefinition__Group_3_2__0__Impl rule__FunctionDefinition__Group_3_2__1 ;
    public final void rule__FunctionDefinition__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4300:1: ( rule__FunctionDefinition__Group_3_2__0__Impl rule__FunctionDefinition__Group_3_2__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4301:2: rule__FunctionDefinition__Group_3_2__0__Impl rule__FunctionDefinition__Group_3_2__1
            {
            pushFollow(FOLLOW_rule__FunctionDefinition__Group_3_2__0__Impl_in_rule__FunctionDefinition__Group_3_2__08928);
            rule__FunctionDefinition__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FunctionDefinition__Group_3_2__1_in_rule__FunctionDefinition__Group_3_2__08931);
            rule__FunctionDefinition__Group_3_2__1();

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
    // $ANTLR end "rule__FunctionDefinition__Group_3_2__0"


    // $ANTLR start "rule__FunctionDefinition__Group_3_2__0__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4308:1: rule__FunctionDefinition__Group_3_2__0__Impl : ( '=' ) ;
    public final void rule__FunctionDefinition__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4312:1: ( ( '=' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4313:1: ( '=' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4313:1: ( '=' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4314:1: '='
            {
             before(grammarAccess.getFunctionDefinitionAccess().getEqualsSignKeyword_3_2_0()); 
            match(input,66,FOLLOW_66_in_rule__FunctionDefinition__Group_3_2__0__Impl8959); 
             after(grammarAccess.getFunctionDefinitionAccess().getEqualsSignKeyword_3_2_0()); 

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
    // $ANTLR end "rule__FunctionDefinition__Group_3_2__0__Impl"


    // $ANTLR start "rule__FunctionDefinition__Group_3_2__1"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4327:1: rule__FunctionDefinition__Group_3_2__1 : rule__FunctionDefinition__Group_3_2__1__Impl rule__FunctionDefinition__Group_3_2__2 ;
    public final void rule__FunctionDefinition__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4331:1: ( rule__FunctionDefinition__Group_3_2__1__Impl rule__FunctionDefinition__Group_3_2__2 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4332:2: rule__FunctionDefinition__Group_3_2__1__Impl rule__FunctionDefinition__Group_3_2__2
            {
            pushFollow(FOLLOW_rule__FunctionDefinition__Group_3_2__1__Impl_in_rule__FunctionDefinition__Group_3_2__18990);
            rule__FunctionDefinition__Group_3_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FunctionDefinition__Group_3_2__2_in_rule__FunctionDefinition__Group_3_2__18993);
            rule__FunctionDefinition__Group_3_2__2();

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
    // $ANTLR end "rule__FunctionDefinition__Group_3_2__1"


    // $ANTLR start "rule__FunctionDefinition__Group_3_2__1__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4339:1: rule__FunctionDefinition__Group_3_2__1__Impl : ( 'delete' ) ;
    public final void rule__FunctionDefinition__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4343:1: ( ( 'delete' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4344:1: ( 'delete' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4344:1: ( 'delete' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4345:1: 'delete'
            {
             before(grammarAccess.getFunctionDefinitionAccess().getDeleteKeyword_3_2_1()); 
            match(input,56,FOLLOW_56_in_rule__FunctionDefinition__Group_3_2__1__Impl9021); 
             after(grammarAccess.getFunctionDefinitionAccess().getDeleteKeyword_3_2_1()); 

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
    // $ANTLR end "rule__FunctionDefinition__Group_3_2__1__Impl"


    // $ANTLR start "rule__FunctionDefinition__Group_3_2__2"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4358:1: rule__FunctionDefinition__Group_3_2__2 : rule__FunctionDefinition__Group_3_2__2__Impl ;
    public final void rule__FunctionDefinition__Group_3_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4362:1: ( rule__FunctionDefinition__Group_3_2__2__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4363:2: rule__FunctionDefinition__Group_3_2__2__Impl
            {
            pushFollow(FOLLOW_rule__FunctionDefinition__Group_3_2__2__Impl_in_rule__FunctionDefinition__Group_3_2__29052);
            rule__FunctionDefinition__Group_3_2__2__Impl();

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
    // $ANTLR end "rule__FunctionDefinition__Group_3_2__2"


    // $ANTLR start "rule__FunctionDefinition__Group_3_2__2__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4369:1: rule__FunctionDefinition__Group_3_2__2__Impl : ( ';' ) ;
    public final void rule__FunctionDefinition__Group_3_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4373:1: ( ( ';' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4374:1: ( ';' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4374:1: ( ';' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4375:1: ';'
            {
             before(grammarAccess.getFunctionDefinitionAccess().getSemicolonKeyword_3_2_2()); 
            match(input,102,FOLLOW_102_in_rule__FunctionDefinition__Group_3_2__2__Impl9080); 
             after(grammarAccess.getFunctionDefinitionAccess().getSemicolonKeyword_3_2_2()); 

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
    // $ANTLR end "rule__FunctionDefinition__Group_3_2__2__Impl"


    // $ANTLR start "rule__FunctionBody__Group_0__0"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4394:1: rule__FunctionBody__Group_0__0 : rule__FunctionBody__Group_0__0__Impl rule__FunctionBody__Group_0__1 ;
    public final void rule__FunctionBody__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4398:1: ( rule__FunctionBody__Group_0__0__Impl rule__FunctionBody__Group_0__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4399:2: rule__FunctionBody__Group_0__0__Impl rule__FunctionBody__Group_0__1
            {
            pushFollow(FOLLOW_rule__FunctionBody__Group_0__0__Impl_in_rule__FunctionBody__Group_0__09117);
            rule__FunctionBody__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FunctionBody__Group_0__1_in_rule__FunctionBody__Group_0__09120);
            rule__FunctionBody__Group_0__1();

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
    // $ANTLR end "rule__FunctionBody__Group_0__0"


    // $ANTLR start "rule__FunctionBody__Group_0__0__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4406:1: rule__FunctionBody__Group_0__0__Impl : ( ( ruleCtorInitializer )? ) ;
    public final void rule__FunctionBody__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4410:1: ( ( ( ruleCtorInitializer )? ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4411:1: ( ( ruleCtorInitializer )? )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4411:1: ( ( ruleCtorInitializer )? )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4412:1: ( ruleCtorInitializer )?
            {
             before(grammarAccess.getFunctionBodyAccess().getCtorInitializerParserRuleCall_0_0()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4413:1: ( ruleCtorInitializer )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==43) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4413:3: ruleCtorInitializer
                    {
                    pushFollow(FOLLOW_ruleCtorInitializer_in_rule__FunctionBody__Group_0__0__Impl9148);
                    ruleCtorInitializer();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFunctionBodyAccess().getCtorInitializerParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__FunctionBody__Group_0__0__Impl"


    // $ANTLR start "rule__FunctionBody__Group_0__1"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4423:1: rule__FunctionBody__Group_0__1 : rule__FunctionBody__Group_0__1__Impl ;
    public final void rule__FunctionBody__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4427:1: ( rule__FunctionBody__Group_0__1__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4428:2: rule__FunctionBody__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__FunctionBody__Group_0__1__Impl_in_rule__FunctionBody__Group_0__19179);
            rule__FunctionBody__Group_0__1__Impl();

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
    // $ANTLR end "rule__FunctionBody__Group_0__1"


    // $ANTLR start "rule__FunctionBody__Group_0__1__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4434:1: rule__FunctionBody__Group_0__1__Impl : ( ruleCompoundStatement ) ;
    public final void rule__FunctionBody__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4438:1: ( ( ruleCompoundStatement ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4439:1: ( ruleCompoundStatement )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4439:1: ( ruleCompoundStatement )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4440:1: ruleCompoundStatement
            {
             before(grammarAccess.getFunctionBodyAccess().getCompoundStatementParserRuleCall_0_1()); 
            pushFollow(FOLLOW_ruleCompoundStatement_in_rule__FunctionBody__Group_0__1__Impl9206);
            ruleCompoundStatement();

            state._fsp--;

             after(grammarAccess.getFunctionBodyAccess().getCompoundStatementParserRuleCall_0_1()); 

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
    // $ANTLR end "rule__FunctionBody__Group_0__1__Impl"


    // $ANTLR start "rule__OperatorFunctionId__Group__0"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4455:1: rule__OperatorFunctionId__Group__0 : rule__OperatorFunctionId__Group__0__Impl rule__OperatorFunctionId__Group__1 ;
    public final void rule__OperatorFunctionId__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4459:1: ( rule__OperatorFunctionId__Group__0__Impl rule__OperatorFunctionId__Group__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4460:2: rule__OperatorFunctionId__Group__0__Impl rule__OperatorFunctionId__Group__1
            {
            pushFollow(FOLLOW_rule__OperatorFunctionId__Group__0__Impl_in_rule__OperatorFunctionId__Group__09239);
            rule__OperatorFunctionId__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OperatorFunctionId__Group__1_in_rule__OperatorFunctionId__Group__09242);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4467:1: rule__OperatorFunctionId__Group__0__Impl : ( 'operator' ) ;
    public final void rule__OperatorFunctionId__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4471:1: ( ( 'operator' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4472:1: ( 'operator' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4472:1: ( 'operator' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4473:1: 'operator'
            {
             before(grammarAccess.getOperatorFunctionIdAccess().getOperatorKeyword_0()); 
            match(input,103,FOLLOW_103_in_rule__OperatorFunctionId__Group__0__Impl9270); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4486:1: rule__OperatorFunctionId__Group__1 : rule__OperatorFunctionId__Group__1__Impl rule__OperatorFunctionId__Group__2 ;
    public final void rule__OperatorFunctionId__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4490:1: ( rule__OperatorFunctionId__Group__1__Impl rule__OperatorFunctionId__Group__2 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4491:2: rule__OperatorFunctionId__Group__1__Impl rule__OperatorFunctionId__Group__2
            {
            pushFollow(FOLLOW_rule__OperatorFunctionId__Group__1__Impl_in_rule__OperatorFunctionId__Group__19301);
            rule__OperatorFunctionId__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OperatorFunctionId__Group__2_in_rule__OperatorFunctionId__Group__19304);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4498:1: rule__OperatorFunctionId__Group__1__Impl : ( ruleOverloadableOperator ) ;
    public final void rule__OperatorFunctionId__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4502:1: ( ( ruleOverloadableOperator ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4503:1: ( ruleOverloadableOperator )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4503:1: ( ruleOverloadableOperator )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4504:1: ruleOverloadableOperator
            {
             before(grammarAccess.getOperatorFunctionIdAccess().getOverloadableOperatorParserRuleCall_1()); 
            pushFollow(FOLLOW_ruleOverloadableOperator_in_rule__OperatorFunctionId__Group__1__Impl9331);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4515:1: rule__OperatorFunctionId__Group__2 : rule__OperatorFunctionId__Group__2__Impl ;
    public final void rule__OperatorFunctionId__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4519:1: ( rule__OperatorFunctionId__Group__2__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4520:2: rule__OperatorFunctionId__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__OperatorFunctionId__Group__2__Impl_in_rule__OperatorFunctionId__Group__29360);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4526:1: rule__OperatorFunctionId__Group__2__Impl : ( ( rule__OperatorFunctionId__Group_2__0 )? ) ;
    public final void rule__OperatorFunctionId__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4530:1: ( ( ( rule__OperatorFunctionId__Group_2__0 )? ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4531:1: ( ( rule__OperatorFunctionId__Group_2__0 )? )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4531:1: ( ( rule__OperatorFunctionId__Group_2__0 )? )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4532:1: ( rule__OperatorFunctionId__Group_2__0 )?
            {
             before(grammarAccess.getOperatorFunctionIdAccess().getGroup_2()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4533:1: ( rule__OperatorFunctionId__Group_2__0 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==67) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4533:2: rule__OperatorFunctionId__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__OperatorFunctionId__Group_2__0_in_rule__OperatorFunctionId__Group__2__Impl9387);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4549:1: rule__OperatorFunctionId__Group_2__0 : rule__OperatorFunctionId__Group_2__0__Impl rule__OperatorFunctionId__Group_2__1 ;
    public final void rule__OperatorFunctionId__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4553:1: ( rule__OperatorFunctionId__Group_2__0__Impl rule__OperatorFunctionId__Group_2__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4554:2: rule__OperatorFunctionId__Group_2__0__Impl rule__OperatorFunctionId__Group_2__1
            {
            pushFollow(FOLLOW_rule__OperatorFunctionId__Group_2__0__Impl_in_rule__OperatorFunctionId__Group_2__09424);
            rule__OperatorFunctionId__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OperatorFunctionId__Group_2__1_in_rule__OperatorFunctionId__Group_2__09427);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4561:1: rule__OperatorFunctionId__Group_2__0__Impl : ( '<' ) ;
    public final void rule__OperatorFunctionId__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4565:1: ( ( '<' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4566:1: ( '<' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4566:1: ( '<' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4567:1: '<'
            {
             before(grammarAccess.getOperatorFunctionIdAccess().getLessThanSignKeyword_2_0()); 
            match(input,67,FOLLOW_67_in_rule__OperatorFunctionId__Group_2__0__Impl9455); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4580:1: rule__OperatorFunctionId__Group_2__1 : rule__OperatorFunctionId__Group_2__1__Impl rule__OperatorFunctionId__Group_2__2 ;
    public final void rule__OperatorFunctionId__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4584:1: ( rule__OperatorFunctionId__Group_2__1__Impl rule__OperatorFunctionId__Group_2__2 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4585:2: rule__OperatorFunctionId__Group_2__1__Impl rule__OperatorFunctionId__Group_2__2
            {
            pushFollow(FOLLOW_rule__OperatorFunctionId__Group_2__1__Impl_in_rule__OperatorFunctionId__Group_2__19486);
            rule__OperatorFunctionId__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OperatorFunctionId__Group_2__2_in_rule__OperatorFunctionId__Group_2__19489);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4592:1: rule__OperatorFunctionId__Group_2__1__Impl : ( ( rule__OperatorFunctionId__Alternatives_2_1 )* ) ;
    public final void rule__OperatorFunctionId__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4596:1: ( ( ( rule__OperatorFunctionId__Alternatives_2_1 )* ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4597:1: ( ( rule__OperatorFunctionId__Alternatives_2_1 )* )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4597:1: ( ( rule__OperatorFunctionId__Alternatives_2_1 )* )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4598:1: ( rule__OperatorFunctionId__Alternatives_2_1 )*
            {
             before(grammarAccess.getOperatorFunctionIdAccess().getAlternatives_2_1()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4599:1: ( rule__OperatorFunctionId__Alternatives_2_1 )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( ((LA47_0>=35 && LA47_0<=36)||LA47_0==41) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4599:2: rule__OperatorFunctionId__Alternatives_2_1
            	    {
            	    pushFollow(FOLLOW_rule__OperatorFunctionId__Alternatives_2_1_in_rule__OperatorFunctionId__Group_2__1__Impl9516);
            	    rule__OperatorFunctionId__Alternatives_2_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);

             after(grammarAccess.getOperatorFunctionIdAccess().getAlternatives_2_1()); 

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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4609:1: rule__OperatorFunctionId__Group_2__2 : rule__OperatorFunctionId__Group_2__2__Impl ;
    public final void rule__OperatorFunctionId__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4613:1: ( rule__OperatorFunctionId__Group_2__2__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4614:2: rule__OperatorFunctionId__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__OperatorFunctionId__Group_2__2__Impl_in_rule__OperatorFunctionId__Group_2__29547);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4620:1: rule__OperatorFunctionId__Group_2__2__Impl : ( '>' ) ;
    public final void rule__OperatorFunctionId__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4624:1: ( ( '>' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4625:1: ( '>' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4625:1: ( '>' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4626:1: '>'
            {
             before(grammarAccess.getOperatorFunctionIdAccess().getGreaterThanSignKeyword_2_2()); 
            match(input,68,FOLLOW_68_in_rule__OperatorFunctionId__Group_2__2__Impl9575); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4645:1: rule__OverloadableOperator__Group_2__0 : rule__OverloadableOperator__Group_2__0__Impl rule__OverloadableOperator__Group_2__1 ;
    public final void rule__OverloadableOperator__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4649:1: ( rule__OverloadableOperator__Group_2__0__Impl rule__OverloadableOperator__Group_2__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4650:2: rule__OverloadableOperator__Group_2__0__Impl rule__OverloadableOperator__Group_2__1
            {
            pushFollow(FOLLOW_rule__OverloadableOperator__Group_2__0__Impl_in_rule__OverloadableOperator__Group_2__09612);
            rule__OverloadableOperator__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OverloadableOperator__Group_2__1_in_rule__OverloadableOperator__Group_2__09615);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4657:1: rule__OverloadableOperator__Group_2__0__Impl : ( 'new' ) ;
    public final void rule__OverloadableOperator__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4661:1: ( ( 'new' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4662:1: ( 'new' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4662:1: ( 'new' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4663:1: 'new'
            {
             before(grammarAccess.getOverloadableOperatorAccess().getNewKeyword_2_0()); 
            match(input,55,FOLLOW_55_in_rule__OverloadableOperator__Group_2__0__Impl9643); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4676:1: rule__OverloadableOperator__Group_2__1 : rule__OverloadableOperator__Group_2__1__Impl rule__OverloadableOperator__Group_2__2 ;
    public final void rule__OverloadableOperator__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4680:1: ( rule__OverloadableOperator__Group_2__1__Impl rule__OverloadableOperator__Group_2__2 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4681:2: rule__OverloadableOperator__Group_2__1__Impl rule__OverloadableOperator__Group_2__2
            {
            pushFollow(FOLLOW_rule__OverloadableOperator__Group_2__1__Impl_in_rule__OverloadableOperator__Group_2__19674);
            rule__OverloadableOperator__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OverloadableOperator__Group_2__2_in_rule__OverloadableOperator__Group_2__19677);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4688:1: rule__OverloadableOperator__Group_2__1__Impl : ( '[' ) ;
    public final void rule__OverloadableOperator__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4692:1: ( ( '[' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4693:1: ( '[' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4693:1: ( '[' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4694:1: '['
            {
             before(grammarAccess.getOverloadableOperatorAccess().getLeftSquareBracketKeyword_2_1()); 
            match(input,97,FOLLOW_97_in_rule__OverloadableOperator__Group_2__1__Impl9705); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4707:1: rule__OverloadableOperator__Group_2__2 : rule__OverloadableOperator__Group_2__2__Impl ;
    public final void rule__OverloadableOperator__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4711:1: ( rule__OverloadableOperator__Group_2__2__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4712:2: rule__OverloadableOperator__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__OverloadableOperator__Group_2__2__Impl_in_rule__OverloadableOperator__Group_2__29736);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4718:1: rule__OverloadableOperator__Group_2__2__Impl : ( ']' ) ;
    public final void rule__OverloadableOperator__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4722:1: ( ( ']' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4723:1: ( ']' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4723:1: ( ']' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4724:1: ']'
            {
             before(grammarAccess.getOverloadableOperatorAccess().getRightSquareBracketKeyword_2_2()); 
            match(input,98,FOLLOW_98_in_rule__OverloadableOperator__Group_2__2__Impl9764); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4743:1: rule__OverloadableOperator__Group_3__0 : rule__OverloadableOperator__Group_3__0__Impl rule__OverloadableOperator__Group_3__1 ;
    public final void rule__OverloadableOperator__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4747:1: ( rule__OverloadableOperator__Group_3__0__Impl rule__OverloadableOperator__Group_3__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4748:2: rule__OverloadableOperator__Group_3__0__Impl rule__OverloadableOperator__Group_3__1
            {
            pushFollow(FOLLOW_rule__OverloadableOperator__Group_3__0__Impl_in_rule__OverloadableOperator__Group_3__09801);
            rule__OverloadableOperator__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OverloadableOperator__Group_3__1_in_rule__OverloadableOperator__Group_3__09804);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4755:1: rule__OverloadableOperator__Group_3__0__Impl : ( 'delete' ) ;
    public final void rule__OverloadableOperator__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4759:1: ( ( 'delete' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4760:1: ( 'delete' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4760:1: ( 'delete' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4761:1: 'delete'
            {
             before(grammarAccess.getOverloadableOperatorAccess().getDeleteKeyword_3_0()); 
            match(input,56,FOLLOW_56_in_rule__OverloadableOperator__Group_3__0__Impl9832); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4774:1: rule__OverloadableOperator__Group_3__1 : rule__OverloadableOperator__Group_3__1__Impl rule__OverloadableOperator__Group_3__2 ;
    public final void rule__OverloadableOperator__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4778:1: ( rule__OverloadableOperator__Group_3__1__Impl rule__OverloadableOperator__Group_3__2 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4779:2: rule__OverloadableOperator__Group_3__1__Impl rule__OverloadableOperator__Group_3__2
            {
            pushFollow(FOLLOW_rule__OverloadableOperator__Group_3__1__Impl_in_rule__OverloadableOperator__Group_3__19863);
            rule__OverloadableOperator__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OverloadableOperator__Group_3__2_in_rule__OverloadableOperator__Group_3__19866);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4786:1: rule__OverloadableOperator__Group_3__1__Impl : ( '[' ) ;
    public final void rule__OverloadableOperator__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4790:1: ( ( '[' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4791:1: ( '[' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4791:1: ( '[' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4792:1: '['
            {
             before(grammarAccess.getOverloadableOperatorAccess().getLeftSquareBracketKeyword_3_1()); 
            match(input,97,FOLLOW_97_in_rule__OverloadableOperator__Group_3__1__Impl9894); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4805:1: rule__OverloadableOperator__Group_3__2 : rule__OverloadableOperator__Group_3__2__Impl ;
    public final void rule__OverloadableOperator__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4809:1: ( rule__OverloadableOperator__Group_3__2__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4810:2: rule__OverloadableOperator__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__OverloadableOperator__Group_3__2__Impl_in_rule__OverloadableOperator__Group_3__29925);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4816:1: rule__OverloadableOperator__Group_3__2__Impl : ( ']' ) ;
    public final void rule__OverloadableOperator__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4820:1: ( ( ']' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4821:1: ( ']' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4821:1: ( ']' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4822:1: ']'
            {
             before(grammarAccess.getOverloadableOperatorAccess().getRightSquareBracketKeyword_3_2()); 
            match(input,98,FOLLOW_98_in_rule__OverloadableOperator__Group_3__2__Impl9953); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4841:1: rule__LiteralOperatorId__Group__0 : rule__LiteralOperatorId__Group__0__Impl rule__LiteralOperatorId__Group__1 ;
    public final void rule__LiteralOperatorId__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4845:1: ( rule__LiteralOperatorId__Group__0__Impl rule__LiteralOperatorId__Group__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4846:2: rule__LiteralOperatorId__Group__0__Impl rule__LiteralOperatorId__Group__1
            {
            pushFollow(FOLLOW_rule__LiteralOperatorId__Group__0__Impl_in_rule__LiteralOperatorId__Group__09990);
            rule__LiteralOperatorId__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LiteralOperatorId__Group__1_in_rule__LiteralOperatorId__Group__09993);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4853:1: rule__LiteralOperatorId__Group__0__Impl : ( 'operator' ) ;
    public final void rule__LiteralOperatorId__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4857:1: ( ( 'operator' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4858:1: ( 'operator' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4858:1: ( 'operator' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4859:1: 'operator'
            {
             before(grammarAccess.getLiteralOperatorIdAccess().getOperatorKeyword_0()); 
            match(input,103,FOLLOW_103_in_rule__LiteralOperatorId__Group__0__Impl10021); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4872:1: rule__LiteralOperatorId__Group__1 : rule__LiteralOperatorId__Group__1__Impl rule__LiteralOperatorId__Group__2 ;
    public final void rule__LiteralOperatorId__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4876:1: ( rule__LiteralOperatorId__Group__1__Impl rule__LiteralOperatorId__Group__2 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4877:2: rule__LiteralOperatorId__Group__1__Impl rule__LiteralOperatorId__Group__2
            {
            pushFollow(FOLLOW_rule__LiteralOperatorId__Group__1__Impl_in_rule__LiteralOperatorId__Group__110052);
            rule__LiteralOperatorId__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LiteralOperatorId__Group__2_in_rule__LiteralOperatorId__Group__110055);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4884:1: rule__LiteralOperatorId__Group__1__Impl : ( '\"' ) ;
    public final void rule__LiteralOperatorId__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4888:1: ( ( '\"' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4889:1: ( '\"' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4889:1: ( '\"' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4890:1: '\"'
            {
             before(grammarAccess.getLiteralOperatorIdAccess().getQuotationMarkKeyword_1()); 
            match(input,104,FOLLOW_104_in_rule__LiteralOperatorId__Group__1__Impl10083); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4903:1: rule__LiteralOperatorId__Group__2 : rule__LiteralOperatorId__Group__2__Impl ;
    public final void rule__LiteralOperatorId__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4907:1: ( rule__LiteralOperatorId__Group__2__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4908:2: rule__LiteralOperatorId__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__LiteralOperatorId__Group__2__Impl_in_rule__LiteralOperatorId__Group__210114);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4914:1: rule__LiteralOperatorId__Group__2__Impl : ( '\"' ) ;
    public final void rule__LiteralOperatorId__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4918:1: ( ( '\"' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4919:1: ( '\"' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4919:1: ( '\"' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4920:1: '\"'
            {
             before(grammarAccess.getLiteralOperatorIdAccess().getQuotationMarkKeyword_2()); 
            match(input,104,FOLLOW_104_in_rule__LiteralOperatorId__Group__2__Impl10142); 
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


    // $ANTLR start "rule__TemplateDeclaration__Group__0"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4939:1: rule__TemplateDeclaration__Group__0 : rule__TemplateDeclaration__Group__0__Impl rule__TemplateDeclaration__Group__1 ;
    public final void rule__TemplateDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4943:1: ( rule__TemplateDeclaration__Group__0__Impl rule__TemplateDeclaration__Group__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4944:2: rule__TemplateDeclaration__Group__0__Impl rule__TemplateDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__TemplateDeclaration__Group__0__Impl_in_rule__TemplateDeclaration__Group__010179);
            rule__TemplateDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TemplateDeclaration__Group__1_in_rule__TemplateDeclaration__Group__010182);
            rule__TemplateDeclaration__Group__1();

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
    // $ANTLR end "rule__TemplateDeclaration__Group__0"


    // $ANTLR start "rule__TemplateDeclaration__Group__0__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4951:1: rule__TemplateDeclaration__Group__0__Impl : ( 'template' ) ;
    public final void rule__TemplateDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4955:1: ( ( 'template' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4956:1: ( 'template' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4956:1: ( 'template' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4957:1: 'template'
            {
             before(grammarAccess.getTemplateDeclarationAccess().getTemplateKeyword_0()); 
            match(input,105,FOLLOW_105_in_rule__TemplateDeclaration__Group__0__Impl10210); 
             after(grammarAccess.getTemplateDeclarationAccess().getTemplateKeyword_0()); 

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
    // $ANTLR end "rule__TemplateDeclaration__Group__0__Impl"


    // $ANTLR start "rule__TemplateDeclaration__Group__1"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4970:1: rule__TemplateDeclaration__Group__1 : rule__TemplateDeclaration__Group__1__Impl rule__TemplateDeclaration__Group__2 ;
    public final void rule__TemplateDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4974:1: ( rule__TemplateDeclaration__Group__1__Impl rule__TemplateDeclaration__Group__2 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4975:2: rule__TemplateDeclaration__Group__1__Impl rule__TemplateDeclaration__Group__2
            {
            pushFollow(FOLLOW_rule__TemplateDeclaration__Group__1__Impl_in_rule__TemplateDeclaration__Group__110241);
            rule__TemplateDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TemplateDeclaration__Group__2_in_rule__TemplateDeclaration__Group__110244);
            rule__TemplateDeclaration__Group__2();

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
    // $ANTLR end "rule__TemplateDeclaration__Group__1"


    // $ANTLR start "rule__TemplateDeclaration__Group__1__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4982:1: rule__TemplateDeclaration__Group__1__Impl : ( '<' ) ;
    public final void rule__TemplateDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4986:1: ( ( '<' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4987:1: ( '<' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4987:1: ( '<' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4988:1: '<'
            {
             before(grammarAccess.getTemplateDeclarationAccess().getLessThanSignKeyword_1()); 
            match(input,67,FOLLOW_67_in_rule__TemplateDeclaration__Group__1__Impl10272); 
             after(grammarAccess.getTemplateDeclarationAccess().getLessThanSignKeyword_1()); 

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
    // $ANTLR end "rule__TemplateDeclaration__Group__1__Impl"


    // $ANTLR start "rule__TemplateDeclaration__Group__2"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5001:1: rule__TemplateDeclaration__Group__2 : rule__TemplateDeclaration__Group__2__Impl rule__TemplateDeclaration__Group__3 ;
    public final void rule__TemplateDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5005:1: ( rule__TemplateDeclaration__Group__2__Impl rule__TemplateDeclaration__Group__3 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5006:2: rule__TemplateDeclaration__Group__2__Impl rule__TemplateDeclaration__Group__3
            {
            pushFollow(FOLLOW_rule__TemplateDeclaration__Group__2__Impl_in_rule__TemplateDeclaration__Group__210303);
            rule__TemplateDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TemplateDeclaration__Group__3_in_rule__TemplateDeclaration__Group__210306);
            rule__TemplateDeclaration__Group__3();

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
    // $ANTLR end "rule__TemplateDeclaration__Group__2"


    // $ANTLR start "rule__TemplateDeclaration__Group__2__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5013:1: rule__TemplateDeclaration__Group__2__Impl : ( ruleTemplateParameterList ) ;
    public final void rule__TemplateDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5017:1: ( ( ruleTemplateParameterList ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5018:1: ( ruleTemplateParameterList )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5018:1: ( ruleTemplateParameterList )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5019:1: ruleTemplateParameterList
            {
             before(grammarAccess.getTemplateDeclarationAccess().getTemplateParameterListParserRuleCall_2()); 
            pushFollow(FOLLOW_ruleTemplateParameterList_in_rule__TemplateDeclaration__Group__2__Impl10333);
            ruleTemplateParameterList();

            state._fsp--;

             after(grammarAccess.getTemplateDeclarationAccess().getTemplateParameterListParserRuleCall_2()); 

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
    // $ANTLR end "rule__TemplateDeclaration__Group__2__Impl"


    // $ANTLR start "rule__TemplateDeclaration__Group__3"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5030:1: rule__TemplateDeclaration__Group__3 : rule__TemplateDeclaration__Group__3__Impl ;
    public final void rule__TemplateDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5034:1: ( rule__TemplateDeclaration__Group__3__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5035:2: rule__TemplateDeclaration__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__TemplateDeclaration__Group__3__Impl_in_rule__TemplateDeclaration__Group__310362);
            rule__TemplateDeclaration__Group__3__Impl();

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
    // $ANTLR end "rule__TemplateDeclaration__Group__3"


    // $ANTLR start "rule__TemplateDeclaration__Group__3__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5041:1: rule__TemplateDeclaration__Group__3__Impl : ( '>' ) ;
    public final void rule__TemplateDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5045:1: ( ( '>' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5046:1: ( '>' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5046:1: ( '>' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5047:1: '>'
            {
             before(grammarAccess.getTemplateDeclarationAccess().getGreaterThanSignKeyword_3()); 
            match(input,68,FOLLOW_68_in_rule__TemplateDeclaration__Group__3__Impl10390); 
             after(grammarAccess.getTemplateDeclarationAccess().getGreaterThanSignKeyword_3()); 

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
    // $ANTLR end "rule__TemplateDeclaration__Group__3__Impl"


    // $ANTLR start "rule__TemplateParameterList__Group__0"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5068:1: rule__TemplateParameterList__Group__0 : rule__TemplateParameterList__Group__0__Impl rule__TemplateParameterList__Group__1 ;
    public final void rule__TemplateParameterList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5072:1: ( rule__TemplateParameterList__Group__0__Impl rule__TemplateParameterList__Group__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5073:2: rule__TemplateParameterList__Group__0__Impl rule__TemplateParameterList__Group__1
            {
            pushFollow(FOLLOW_rule__TemplateParameterList__Group__0__Impl_in_rule__TemplateParameterList__Group__010429);
            rule__TemplateParameterList__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TemplateParameterList__Group__1_in_rule__TemplateParameterList__Group__010432);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5080:1: rule__TemplateParameterList__Group__0__Impl : ( ruleTemplateParameter ) ;
    public final void rule__TemplateParameterList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5084:1: ( ( ruleTemplateParameter ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5085:1: ( ruleTemplateParameter )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5085:1: ( ruleTemplateParameter )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5086:1: ruleTemplateParameter
            {
             before(grammarAccess.getTemplateParameterListAccess().getTemplateParameterParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleTemplateParameter_in_rule__TemplateParameterList__Group__0__Impl10459);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5097:1: rule__TemplateParameterList__Group__1 : rule__TemplateParameterList__Group__1__Impl ;
    public final void rule__TemplateParameterList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5101:1: ( rule__TemplateParameterList__Group__1__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5102:2: rule__TemplateParameterList__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__TemplateParameterList__Group__1__Impl_in_rule__TemplateParameterList__Group__110488);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5108:1: rule__TemplateParameterList__Group__1__Impl : ( ( rule__TemplateParameterList__Group_1__0 )* ) ;
    public final void rule__TemplateParameterList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5112:1: ( ( ( rule__TemplateParameterList__Group_1__0 )* ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5113:1: ( ( rule__TemplateParameterList__Group_1__0 )* )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5113:1: ( ( rule__TemplateParameterList__Group_1__0 )* )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5114:1: ( rule__TemplateParameterList__Group_1__0 )*
            {
             before(grammarAccess.getTemplateParameterListAccess().getGroup_1()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5115:1: ( rule__TemplateParameterList__Group_1__0 )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==88) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5115:2: rule__TemplateParameterList__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__TemplateParameterList__Group_1__0_in_rule__TemplateParameterList__Group__1__Impl10515);
            	    rule__TemplateParameterList__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop48;
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5129:1: rule__TemplateParameterList__Group_1__0 : rule__TemplateParameterList__Group_1__0__Impl rule__TemplateParameterList__Group_1__1 ;
    public final void rule__TemplateParameterList__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5133:1: ( rule__TemplateParameterList__Group_1__0__Impl rule__TemplateParameterList__Group_1__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5134:2: rule__TemplateParameterList__Group_1__0__Impl rule__TemplateParameterList__Group_1__1
            {
            pushFollow(FOLLOW_rule__TemplateParameterList__Group_1__0__Impl_in_rule__TemplateParameterList__Group_1__010550);
            rule__TemplateParameterList__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TemplateParameterList__Group_1__1_in_rule__TemplateParameterList__Group_1__010553);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5141:1: rule__TemplateParameterList__Group_1__0__Impl : ( ',' ) ;
    public final void rule__TemplateParameterList__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5145:1: ( ( ',' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5146:1: ( ',' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5146:1: ( ',' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5147:1: ','
            {
             before(grammarAccess.getTemplateParameterListAccess().getCommaKeyword_1_0()); 
            match(input,88,FOLLOW_88_in_rule__TemplateParameterList__Group_1__0__Impl10581); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5160:1: rule__TemplateParameterList__Group_1__1 : rule__TemplateParameterList__Group_1__1__Impl ;
    public final void rule__TemplateParameterList__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5164:1: ( rule__TemplateParameterList__Group_1__1__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5165:2: rule__TemplateParameterList__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__TemplateParameterList__Group_1__1__Impl_in_rule__TemplateParameterList__Group_1__110612);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5171:1: rule__TemplateParameterList__Group_1__1__Impl : ( ruleTemplateParameter ) ;
    public final void rule__TemplateParameterList__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5175:1: ( ( ruleTemplateParameter ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5176:1: ( ruleTemplateParameter )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5176:1: ( ruleTemplateParameter )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5177:1: ruleTemplateParameter
            {
             before(grammarAccess.getTemplateParameterListAccess().getTemplateParameterParserRuleCall_1_1()); 
            pushFollow(FOLLOW_ruleTemplateParameter_in_rule__TemplateParameterList__Group_1__1__Impl10639);
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


    // $ANTLR start "rule__TypeParameter__Group__0"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5192:1: rule__TypeParameter__Group__0 : rule__TypeParameter__Group__0__Impl rule__TypeParameter__Group__1 ;
    public final void rule__TypeParameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5196:1: ( rule__TypeParameter__Group__0__Impl rule__TypeParameter__Group__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5197:2: rule__TypeParameter__Group__0__Impl rule__TypeParameter__Group__1
            {
            pushFollow(FOLLOW_rule__TypeParameter__Group__0__Impl_in_rule__TypeParameter__Group__010672);
            rule__TypeParameter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeParameter__Group__1_in_rule__TypeParameter__Group__010675);
            rule__TypeParameter__Group__1();

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
    // $ANTLR end "rule__TypeParameter__Group__0"


    // $ANTLR start "rule__TypeParameter__Group__0__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5204:1: rule__TypeParameter__Group__0__Impl : ( ( rule__TypeParameter__Alternatives_0 ) ) ;
    public final void rule__TypeParameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5208:1: ( ( ( rule__TypeParameter__Alternatives_0 ) ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5209:1: ( ( rule__TypeParameter__Alternatives_0 ) )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5209:1: ( ( rule__TypeParameter__Alternatives_0 ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5210:1: ( rule__TypeParameter__Alternatives_0 )
            {
             before(grammarAccess.getTypeParameterAccess().getAlternatives_0()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5211:1: ( rule__TypeParameter__Alternatives_0 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5211:2: rule__TypeParameter__Alternatives_0
            {
            pushFollow(FOLLOW_rule__TypeParameter__Alternatives_0_in_rule__TypeParameter__Group__0__Impl10702);
            rule__TypeParameter__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getTypeParameterAccess().getAlternatives_0()); 

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
    // $ANTLR end "rule__TypeParameter__Group__0__Impl"


    // $ANTLR start "rule__TypeParameter__Group__1"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5221:1: rule__TypeParameter__Group__1 : rule__TypeParameter__Group__1__Impl ;
    public final void rule__TypeParameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5225:1: ( rule__TypeParameter__Group__1__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5226:2: rule__TypeParameter__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__TypeParameter__Group__1__Impl_in_rule__TypeParameter__Group__110732);
            rule__TypeParameter__Group__1__Impl();

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
    // $ANTLR end "rule__TypeParameter__Group__1"


    // $ANTLR start "rule__TypeParameter__Group__1__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5232:1: rule__TypeParameter__Group__1__Impl : ( ( rule__TypeParameter__Alternatives_1 ) ) ;
    public final void rule__TypeParameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5236:1: ( ( ( rule__TypeParameter__Alternatives_1 ) ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5237:1: ( ( rule__TypeParameter__Alternatives_1 ) )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5237:1: ( ( rule__TypeParameter__Alternatives_1 ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5238:1: ( rule__TypeParameter__Alternatives_1 )
            {
             before(grammarAccess.getTypeParameterAccess().getAlternatives_1()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5239:1: ( rule__TypeParameter__Alternatives_1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5239:2: rule__TypeParameter__Alternatives_1
            {
            pushFollow(FOLLOW_rule__TypeParameter__Alternatives_1_in_rule__TypeParameter__Group__1__Impl10759);
            rule__TypeParameter__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getTypeParameterAccess().getAlternatives_1()); 

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
    // $ANTLR end "rule__TypeParameter__Group__1__Impl"


    // $ANTLR start "rule__TypeParameter__Group_1_0__0"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5253:1: rule__TypeParameter__Group_1_0__0 : rule__TypeParameter__Group_1_0__0__Impl rule__TypeParameter__Group_1_0__1 ;
    public final void rule__TypeParameter__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5257:1: ( rule__TypeParameter__Group_1_0__0__Impl rule__TypeParameter__Group_1_0__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5258:2: rule__TypeParameter__Group_1_0__0__Impl rule__TypeParameter__Group_1_0__1
            {
            pushFollow(FOLLOW_rule__TypeParameter__Group_1_0__0__Impl_in_rule__TypeParameter__Group_1_0__010793);
            rule__TypeParameter__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeParameter__Group_1_0__1_in_rule__TypeParameter__Group_1_0__010796);
            rule__TypeParameter__Group_1_0__1();

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
    // $ANTLR end "rule__TypeParameter__Group_1_0__0"


    // $ANTLR start "rule__TypeParameter__Group_1_0__0__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5265:1: rule__TypeParameter__Group_1_0__0__Impl : ( ( '...' )? ) ;
    public final void rule__TypeParameter__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5269:1: ( ( ( '...' )? ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5270:1: ( ( '...' )? )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5270:1: ( ( '...' )? )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5271:1: ( '...' )?
            {
             before(grammarAccess.getTypeParameterAccess().getFullStopFullStopFullStopKeyword_1_0_0()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5272:1: ( '...' )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==54) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5273:2: '...'
                    {
                    match(input,54,FOLLOW_54_in_rule__TypeParameter__Group_1_0__0__Impl10825); 

                    }
                    break;

            }

             after(grammarAccess.getTypeParameterAccess().getFullStopFullStopFullStopKeyword_1_0_0()); 

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
    // $ANTLR end "rule__TypeParameter__Group_1_0__0__Impl"


    // $ANTLR start "rule__TypeParameter__Group_1_0__1"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5284:1: rule__TypeParameter__Group_1_0__1 : rule__TypeParameter__Group_1_0__1__Impl ;
    public final void rule__TypeParameter__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5288:1: ( rule__TypeParameter__Group_1_0__1__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5289:2: rule__TypeParameter__Group_1_0__1__Impl
            {
            pushFollow(FOLLOW_rule__TypeParameter__Group_1_0__1__Impl_in_rule__TypeParameter__Group_1_0__110858);
            rule__TypeParameter__Group_1_0__1__Impl();

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
    // $ANTLR end "rule__TypeParameter__Group_1_0__1"


    // $ANTLR start "rule__TypeParameter__Group_1_0__1__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5295:1: rule__TypeParameter__Group_1_0__1__Impl : ( ( RULE_ID )? ) ;
    public final void rule__TypeParameter__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5299:1: ( ( ( RULE_ID )? ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5300:1: ( ( RULE_ID )? )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5300:1: ( ( RULE_ID )? )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5301:1: ( RULE_ID )?
            {
             before(grammarAccess.getTypeParameterAccess().getIDTerminalRuleCall_1_0_1()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5302:1: ( RULE_ID )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==RULE_ID) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5302:3: RULE_ID
                    {
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TypeParameter__Group_1_0__1__Impl10886); 

                    }
                    break;

            }

             after(grammarAccess.getTypeParameterAccess().getIDTerminalRuleCall_1_0_1()); 

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
    // $ANTLR end "rule__TypeParameter__Group_1_0__1__Impl"


    // $ANTLR start "rule__TypeParameter__Group_1_1__0"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5316:1: rule__TypeParameter__Group_1_1__0 : rule__TypeParameter__Group_1_1__0__Impl rule__TypeParameter__Group_1_1__1 ;
    public final void rule__TypeParameter__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5320:1: ( rule__TypeParameter__Group_1_1__0__Impl rule__TypeParameter__Group_1_1__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5321:2: rule__TypeParameter__Group_1_1__0__Impl rule__TypeParameter__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__TypeParameter__Group_1_1__0__Impl_in_rule__TypeParameter__Group_1_1__010921);
            rule__TypeParameter__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeParameter__Group_1_1__1_in_rule__TypeParameter__Group_1_1__010924);
            rule__TypeParameter__Group_1_1__1();

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
    // $ANTLR end "rule__TypeParameter__Group_1_1__0"


    // $ANTLR start "rule__TypeParameter__Group_1_1__0__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5328:1: rule__TypeParameter__Group_1_1__0__Impl : ( ( RULE_ID )? ) ;
    public final void rule__TypeParameter__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5332:1: ( ( ( RULE_ID )? ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5333:1: ( ( RULE_ID )? )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5333:1: ( ( RULE_ID )? )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5334:1: ( RULE_ID )?
            {
             before(grammarAccess.getTypeParameterAccess().getIDTerminalRuleCall_1_1_0()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5335:1: ( RULE_ID )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==RULE_ID) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5335:3: RULE_ID
                    {
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TypeParameter__Group_1_1__0__Impl10952); 

                    }
                    break;

            }

             after(grammarAccess.getTypeParameterAccess().getIDTerminalRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__TypeParameter__Group_1_1__0__Impl"


    // $ANTLR start "rule__TypeParameter__Group_1_1__1"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5345:1: rule__TypeParameter__Group_1_1__1 : rule__TypeParameter__Group_1_1__1__Impl rule__TypeParameter__Group_1_1__2 ;
    public final void rule__TypeParameter__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5349:1: ( rule__TypeParameter__Group_1_1__1__Impl rule__TypeParameter__Group_1_1__2 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5350:2: rule__TypeParameter__Group_1_1__1__Impl rule__TypeParameter__Group_1_1__2
            {
            pushFollow(FOLLOW_rule__TypeParameter__Group_1_1__1__Impl_in_rule__TypeParameter__Group_1_1__110983);
            rule__TypeParameter__Group_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeParameter__Group_1_1__2_in_rule__TypeParameter__Group_1_1__110986);
            rule__TypeParameter__Group_1_1__2();

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
    // $ANTLR end "rule__TypeParameter__Group_1_1__1"


    // $ANTLR start "rule__TypeParameter__Group_1_1__1__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5357:1: rule__TypeParameter__Group_1_1__1__Impl : ( '=' ) ;
    public final void rule__TypeParameter__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5361:1: ( ( '=' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5362:1: ( '=' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5362:1: ( '=' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5363:1: '='
            {
             before(grammarAccess.getTypeParameterAccess().getEqualsSignKeyword_1_1_1()); 
            match(input,66,FOLLOW_66_in_rule__TypeParameter__Group_1_1__1__Impl11014); 
             after(grammarAccess.getTypeParameterAccess().getEqualsSignKeyword_1_1_1()); 

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
    // $ANTLR end "rule__TypeParameter__Group_1_1__1__Impl"


    // $ANTLR start "rule__TypeParameter__Group_1_1__2"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5376:1: rule__TypeParameter__Group_1_1__2 : rule__TypeParameter__Group_1_1__2__Impl ;
    public final void rule__TypeParameter__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5380:1: ( rule__TypeParameter__Group_1_1__2__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5381:2: rule__TypeParameter__Group_1_1__2__Impl
            {
            pushFollow(FOLLOW_rule__TypeParameter__Group_1_1__2__Impl_in_rule__TypeParameter__Group_1_1__211045);
            rule__TypeParameter__Group_1_1__2__Impl();

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
    // $ANTLR end "rule__TypeParameter__Group_1_1__2"


    // $ANTLR start "rule__TypeParameter__Group_1_1__2__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5387:1: rule__TypeParameter__Group_1_1__2__Impl : ( ruleTypeId ) ;
    public final void rule__TypeParameter__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5391:1: ( ( ruleTypeId ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5392:1: ( ruleTypeId )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5392:1: ( ruleTypeId )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5393:1: ruleTypeId
            {
             before(grammarAccess.getTypeParameterAccess().getTypeIdParserRuleCall_1_1_2()); 
            pushFollow(FOLLOW_ruleTypeId_in_rule__TypeParameter__Group_1_1__2__Impl11072);
            ruleTypeId();

            state._fsp--;

             after(grammarAccess.getTypeParameterAccess().getTypeIdParserRuleCall_1_1_2()); 

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
    // $ANTLR end "rule__TypeParameter__Group_1_1__2__Impl"


    // $ANTLR start "rule__TemplateArgumentList__Group__0"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5411:1: rule__TemplateArgumentList__Group__0 : rule__TemplateArgumentList__Group__0__Impl rule__TemplateArgumentList__Group__1 ;
    public final void rule__TemplateArgumentList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5415:1: ( rule__TemplateArgumentList__Group__0__Impl rule__TemplateArgumentList__Group__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5416:2: rule__TemplateArgumentList__Group__0__Impl rule__TemplateArgumentList__Group__1
            {
            pushFollow(FOLLOW_rule__TemplateArgumentList__Group__0__Impl_in_rule__TemplateArgumentList__Group__011108);
            rule__TemplateArgumentList__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TemplateArgumentList__Group__1_in_rule__TemplateArgumentList__Group__011111);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5423:1: rule__TemplateArgumentList__Group__0__Impl : ( ruleTemplateArgument ) ;
    public final void rule__TemplateArgumentList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5427:1: ( ( ruleTemplateArgument ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5428:1: ( ruleTemplateArgument )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5428:1: ( ruleTemplateArgument )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5429:1: ruleTemplateArgument
            {
             before(grammarAccess.getTemplateArgumentListAccess().getTemplateArgumentParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleTemplateArgument_in_rule__TemplateArgumentList__Group__0__Impl11138);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5440:1: rule__TemplateArgumentList__Group__1 : rule__TemplateArgumentList__Group__1__Impl rule__TemplateArgumentList__Group__2 ;
    public final void rule__TemplateArgumentList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5444:1: ( rule__TemplateArgumentList__Group__1__Impl rule__TemplateArgumentList__Group__2 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5445:2: rule__TemplateArgumentList__Group__1__Impl rule__TemplateArgumentList__Group__2
            {
            pushFollow(FOLLOW_rule__TemplateArgumentList__Group__1__Impl_in_rule__TemplateArgumentList__Group__111167);
            rule__TemplateArgumentList__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TemplateArgumentList__Group__2_in_rule__TemplateArgumentList__Group__111170);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5452:1: rule__TemplateArgumentList__Group__1__Impl : ( ( '...' )? ) ;
    public final void rule__TemplateArgumentList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5456:1: ( ( ( '...' )? ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5457:1: ( ( '...' )? )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5457:1: ( ( '...' )? )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5458:1: ( '...' )?
            {
             before(grammarAccess.getTemplateArgumentListAccess().getFullStopFullStopFullStopKeyword_1()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5459:1: ( '...' )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==54) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5460:2: '...'
                    {
                    match(input,54,FOLLOW_54_in_rule__TemplateArgumentList__Group__1__Impl11199); 

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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5471:1: rule__TemplateArgumentList__Group__2 : rule__TemplateArgumentList__Group__2__Impl ;
    public final void rule__TemplateArgumentList__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5475:1: ( rule__TemplateArgumentList__Group__2__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5476:2: rule__TemplateArgumentList__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__TemplateArgumentList__Group__2__Impl_in_rule__TemplateArgumentList__Group__211232);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5482:1: rule__TemplateArgumentList__Group__2__Impl : ( ( rule__TemplateArgumentList__Group_2__0 )* ) ;
    public final void rule__TemplateArgumentList__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5486:1: ( ( ( rule__TemplateArgumentList__Group_2__0 )* ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5487:1: ( ( rule__TemplateArgumentList__Group_2__0 )* )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5487:1: ( ( rule__TemplateArgumentList__Group_2__0 )* )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5488:1: ( rule__TemplateArgumentList__Group_2__0 )*
            {
             before(grammarAccess.getTemplateArgumentListAccess().getGroup_2()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5489:1: ( rule__TemplateArgumentList__Group_2__0 )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==88) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5489:2: rule__TemplateArgumentList__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__TemplateArgumentList__Group_2__0_in_rule__TemplateArgumentList__Group__2__Impl11259);
            	    rule__TemplateArgumentList__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop53;
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5505:1: rule__TemplateArgumentList__Group_2__0 : rule__TemplateArgumentList__Group_2__0__Impl rule__TemplateArgumentList__Group_2__1 ;
    public final void rule__TemplateArgumentList__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5509:1: ( rule__TemplateArgumentList__Group_2__0__Impl rule__TemplateArgumentList__Group_2__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5510:2: rule__TemplateArgumentList__Group_2__0__Impl rule__TemplateArgumentList__Group_2__1
            {
            pushFollow(FOLLOW_rule__TemplateArgumentList__Group_2__0__Impl_in_rule__TemplateArgumentList__Group_2__011296);
            rule__TemplateArgumentList__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TemplateArgumentList__Group_2__1_in_rule__TemplateArgumentList__Group_2__011299);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5517:1: rule__TemplateArgumentList__Group_2__0__Impl : ( ',' ) ;
    public final void rule__TemplateArgumentList__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5521:1: ( ( ',' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5522:1: ( ',' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5522:1: ( ',' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5523:1: ','
            {
             before(grammarAccess.getTemplateArgumentListAccess().getCommaKeyword_2_0()); 
            match(input,88,FOLLOW_88_in_rule__TemplateArgumentList__Group_2__0__Impl11327); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5536:1: rule__TemplateArgumentList__Group_2__1 : rule__TemplateArgumentList__Group_2__1__Impl rule__TemplateArgumentList__Group_2__2 ;
    public final void rule__TemplateArgumentList__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5540:1: ( rule__TemplateArgumentList__Group_2__1__Impl rule__TemplateArgumentList__Group_2__2 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5541:2: rule__TemplateArgumentList__Group_2__1__Impl rule__TemplateArgumentList__Group_2__2
            {
            pushFollow(FOLLOW_rule__TemplateArgumentList__Group_2__1__Impl_in_rule__TemplateArgumentList__Group_2__111358);
            rule__TemplateArgumentList__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TemplateArgumentList__Group_2__2_in_rule__TemplateArgumentList__Group_2__111361);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5548:1: rule__TemplateArgumentList__Group_2__1__Impl : ( ruleTemplateArgument ) ;
    public final void rule__TemplateArgumentList__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5552:1: ( ( ruleTemplateArgument ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5553:1: ( ruleTemplateArgument )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5553:1: ( ruleTemplateArgument )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5554:1: ruleTemplateArgument
            {
             before(grammarAccess.getTemplateArgumentListAccess().getTemplateArgumentParserRuleCall_2_1()); 
            pushFollow(FOLLOW_ruleTemplateArgument_in_rule__TemplateArgumentList__Group_2__1__Impl11388);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5565:1: rule__TemplateArgumentList__Group_2__2 : rule__TemplateArgumentList__Group_2__2__Impl ;
    public final void rule__TemplateArgumentList__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5569:1: ( rule__TemplateArgumentList__Group_2__2__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5570:2: rule__TemplateArgumentList__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__TemplateArgumentList__Group_2__2__Impl_in_rule__TemplateArgumentList__Group_2__211417);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5576:1: rule__TemplateArgumentList__Group_2__2__Impl : ( ( '...' )? ) ;
    public final void rule__TemplateArgumentList__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5580:1: ( ( ( '...' )? ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5581:1: ( ( '...' )? )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5581:1: ( ( '...' )? )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5582:1: ( '...' )?
            {
             before(grammarAccess.getTemplateArgumentListAccess().getFullStopFullStopFullStopKeyword_2_2()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5583:1: ( '...' )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==54) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5584:2: '...'
                    {
                    match(input,54,FOLLOW_54_in_rule__TemplateArgumentList__Group_2__2__Impl11446); 

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


    // $ANTLR start "rule__FunctionTryBlock__Group__0"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5604:1: rule__FunctionTryBlock__Group__0 : rule__FunctionTryBlock__Group__0__Impl rule__FunctionTryBlock__Group__1 ;
    public final void rule__FunctionTryBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5608:1: ( rule__FunctionTryBlock__Group__0__Impl rule__FunctionTryBlock__Group__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5609:2: rule__FunctionTryBlock__Group__0__Impl rule__FunctionTryBlock__Group__1
            {
            pushFollow(FOLLOW_rule__FunctionTryBlock__Group__0__Impl_in_rule__FunctionTryBlock__Group__011488);
            rule__FunctionTryBlock__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FunctionTryBlock__Group__1_in_rule__FunctionTryBlock__Group__011491);
            rule__FunctionTryBlock__Group__1();

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
    // $ANTLR end "rule__FunctionTryBlock__Group__0"


    // $ANTLR start "rule__FunctionTryBlock__Group__0__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5616:1: rule__FunctionTryBlock__Group__0__Impl : ( 'try' ) ;
    public final void rule__FunctionTryBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5620:1: ( ( 'try' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5621:1: ( 'try' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5621:1: ( 'try' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5622:1: 'try'
            {
             before(grammarAccess.getFunctionTryBlockAccess().getTryKeyword_0()); 
            match(input,106,FOLLOW_106_in_rule__FunctionTryBlock__Group__0__Impl11519); 
             after(grammarAccess.getFunctionTryBlockAccess().getTryKeyword_0()); 

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
    // $ANTLR end "rule__FunctionTryBlock__Group__0__Impl"


    // $ANTLR start "rule__FunctionTryBlock__Group__1"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5635:1: rule__FunctionTryBlock__Group__1 : rule__FunctionTryBlock__Group__1__Impl rule__FunctionTryBlock__Group__2 ;
    public final void rule__FunctionTryBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5639:1: ( rule__FunctionTryBlock__Group__1__Impl rule__FunctionTryBlock__Group__2 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5640:2: rule__FunctionTryBlock__Group__1__Impl rule__FunctionTryBlock__Group__2
            {
            pushFollow(FOLLOW_rule__FunctionTryBlock__Group__1__Impl_in_rule__FunctionTryBlock__Group__111550);
            rule__FunctionTryBlock__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FunctionTryBlock__Group__2_in_rule__FunctionTryBlock__Group__111553);
            rule__FunctionTryBlock__Group__2();

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
    // $ANTLR end "rule__FunctionTryBlock__Group__1"


    // $ANTLR start "rule__FunctionTryBlock__Group__1__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5647:1: rule__FunctionTryBlock__Group__1__Impl : ( ( ruleCtorInitializer )? ) ;
    public final void rule__FunctionTryBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5651:1: ( ( ( ruleCtorInitializer )? ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5652:1: ( ( ruleCtorInitializer )? )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5652:1: ( ( ruleCtorInitializer )? )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5653:1: ( ruleCtorInitializer )?
            {
             before(grammarAccess.getFunctionTryBlockAccess().getCtorInitializerParserRuleCall_1()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5654:1: ( ruleCtorInitializer )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==43) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5654:3: ruleCtorInitializer
                    {
                    pushFollow(FOLLOW_ruleCtorInitializer_in_rule__FunctionTryBlock__Group__1__Impl11581);
                    ruleCtorInitializer();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFunctionTryBlockAccess().getCtorInitializerParserRuleCall_1()); 

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
    // $ANTLR end "rule__FunctionTryBlock__Group__1__Impl"


    // $ANTLR start "rule__FunctionTryBlock__Group__2"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5664:1: rule__FunctionTryBlock__Group__2 : rule__FunctionTryBlock__Group__2__Impl rule__FunctionTryBlock__Group__3 ;
    public final void rule__FunctionTryBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5668:1: ( rule__FunctionTryBlock__Group__2__Impl rule__FunctionTryBlock__Group__3 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5669:2: rule__FunctionTryBlock__Group__2__Impl rule__FunctionTryBlock__Group__3
            {
            pushFollow(FOLLOW_rule__FunctionTryBlock__Group__2__Impl_in_rule__FunctionTryBlock__Group__211612);
            rule__FunctionTryBlock__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FunctionTryBlock__Group__3_in_rule__FunctionTryBlock__Group__211615);
            rule__FunctionTryBlock__Group__3();

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
    // $ANTLR end "rule__FunctionTryBlock__Group__2"


    // $ANTLR start "rule__FunctionTryBlock__Group__2__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5676:1: rule__FunctionTryBlock__Group__2__Impl : ( ruleCompoundStatement ) ;
    public final void rule__FunctionTryBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5680:1: ( ( ruleCompoundStatement ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5681:1: ( ruleCompoundStatement )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5681:1: ( ruleCompoundStatement )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5682:1: ruleCompoundStatement
            {
             before(grammarAccess.getFunctionTryBlockAccess().getCompoundStatementParserRuleCall_2()); 
            pushFollow(FOLLOW_ruleCompoundStatement_in_rule__FunctionTryBlock__Group__2__Impl11642);
            ruleCompoundStatement();

            state._fsp--;

             after(grammarAccess.getFunctionTryBlockAccess().getCompoundStatementParserRuleCall_2()); 

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
    // $ANTLR end "rule__FunctionTryBlock__Group__2__Impl"


    // $ANTLR start "rule__FunctionTryBlock__Group__3"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5693:1: rule__FunctionTryBlock__Group__3 : rule__FunctionTryBlock__Group__3__Impl ;
    public final void rule__FunctionTryBlock__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5697:1: ( rule__FunctionTryBlock__Group__3__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5698:2: rule__FunctionTryBlock__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__FunctionTryBlock__Group__3__Impl_in_rule__FunctionTryBlock__Group__311671);
            rule__FunctionTryBlock__Group__3__Impl();

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
    // $ANTLR end "rule__FunctionTryBlock__Group__3"


    // $ANTLR start "rule__FunctionTryBlock__Group__3__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5704:1: rule__FunctionTryBlock__Group__3__Impl : ( ( ( ruleHandler ) ) ( ( ruleHandler )* ) ) ;
    public final void rule__FunctionTryBlock__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5708:1: ( ( ( ( ruleHandler ) ) ( ( ruleHandler )* ) ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5709:1: ( ( ( ruleHandler ) ) ( ( ruleHandler )* ) )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5709:1: ( ( ( ruleHandler ) ) ( ( ruleHandler )* ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5710:1: ( ( ruleHandler ) ) ( ( ruleHandler )* )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5710:1: ( ( ruleHandler ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5711:1: ( ruleHandler )
            {
             before(grammarAccess.getFunctionTryBlockAccess().getHandlerParserRuleCall_3()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5712:1: ( ruleHandler )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5712:3: ruleHandler
            {
            pushFollow(FOLLOW_ruleHandler_in_rule__FunctionTryBlock__Group__3__Impl11701);
            ruleHandler();

            state._fsp--;


            }

             after(grammarAccess.getFunctionTryBlockAccess().getHandlerParserRuleCall_3()); 

            }

            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5715:1: ( ( ruleHandler )* )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5716:1: ( ruleHandler )*
            {
             before(grammarAccess.getFunctionTryBlockAccess().getHandlerParserRuleCall_3()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5717:1: ( ruleHandler )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==107) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5717:3: ruleHandler
            	    {
            	    pushFollow(FOLLOW_ruleHandler_in_rule__FunctionTryBlock__Group__3__Impl11714);
            	    ruleHandler();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop56;
                }
            } while (true);

             after(grammarAccess.getFunctionTryBlockAccess().getHandlerParserRuleCall_3()); 

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
    // $ANTLR end "rule__FunctionTryBlock__Group__3__Impl"


    // $ANTLR start "rule__Handler__Group__0"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5736:1: rule__Handler__Group__0 : rule__Handler__Group__0__Impl rule__Handler__Group__1 ;
    public final void rule__Handler__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5740:1: ( rule__Handler__Group__0__Impl rule__Handler__Group__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5741:2: rule__Handler__Group__0__Impl rule__Handler__Group__1
            {
            pushFollow(FOLLOW_rule__Handler__Group__0__Impl_in_rule__Handler__Group__011755);
            rule__Handler__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Handler__Group__1_in_rule__Handler__Group__011758);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5748:1: rule__Handler__Group__0__Impl : ( 'catch' ) ;
    public final void rule__Handler__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5752:1: ( ( 'catch' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5753:1: ( 'catch' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5753:1: ( 'catch' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5754:1: 'catch'
            {
             before(grammarAccess.getHandlerAccess().getCatchKeyword_0()); 
            match(input,107,FOLLOW_107_in_rule__Handler__Group__0__Impl11786); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5767:1: rule__Handler__Group__1 : rule__Handler__Group__1__Impl rule__Handler__Group__2 ;
    public final void rule__Handler__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5771:1: ( rule__Handler__Group__1__Impl rule__Handler__Group__2 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5772:2: rule__Handler__Group__1__Impl rule__Handler__Group__2
            {
            pushFollow(FOLLOW_rule__Handler__Group__1__Impl_in_rule__Handler__Group__111817);
            rule__Handler__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Handler__Group__2_in_rule__Handler__Group__111820);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5779:1: rule__Handler__Group__1__Impl : ( '(' ) ;
    public final void rule__Handler__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5783:1: ( ( '(' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5784:1: ( '(' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5784:1: ( '(' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5785:1: '('
            {
             before(grammarAccess.getHandlerAccess().getLeftParenthesisKeyword_1()); 
            match(input,99,FOLLOW_99_in_rule__Handler__Group__1__Impl11848); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5798:1: rule__Handler__Group__2 : rule__Handler__Group__2__Impl rule__Handler__Group__3 ;
    public final void rule__Handler__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5802:1: ( rule__Handler__Group__2__Impl rule__Handler__Group__3 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5803:2: rule__Handler__Group__2__Impl rule__Handler__Group__3
            {
            pushFollow(FOLLOW_rule__Handler__Group__2__Impl_in_rule__Handler__Group__211879);
            rule__Handler__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Handler__Group__3_in_rule__Handler__Group__211882);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5810:1: rule__Handler__Group__2__Impl : ( ruleExceptionDeclaration ) ;
    public final void rule__Handler__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5814:1: ( ( ruleExceptionDeclaration ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5815:1: ( ruleExceptionDeclaration )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5815:1: ( ruleExceptionDeclaration )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5816:1: ruleExceptionDeclaration
            {
             before(grammarAccess.getHandlerAccess().getExceptionDeclarationParserRuleCall_2()); 
            pushFollow(FOLLOW_ruleExceptionDeclaration_in_rule__Handler__Group__2__Impl11909);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5827:1: rule__Handler__Group__3 : rule__Handler__Group__3__Impl rule__Handler__Group__4 ;
    public final void rule__Handler__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5831:1: ( rule__Handler__Group__3__Impl rule__Handler__Group__4 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5832:2: rule__Handler__Group__3__Impl rule__Handler__Group__4
            {
            pushFollow(FOLLOW_rule__Handler__Group__3__Impl_in_rule__Handler__Group__311938);
            rule__Handler__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Handler__Group__4_in_rule__Handler__Group__311941);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5839:1: rule__Handler__Group__3__Impl : ( ')' ) ;
    public final void rule__Handler__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5843:1: ( ( ')' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5844:1: ( ')' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5844:1: ( ')' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5845:1: ')'
            {
             before(grammarAccess.getHandlerAccess().getRightParenthesisKeyword_3()); 
            match(input,100,FOLLOW_100_in_rule__Handler__Group__3__Impl11969); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5858:1: rule__Handler__Group__4 : rule__Handler__Group__4__Impl ;
    public final void rule__Handler__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5862:1: ( rule__Handler__Group__4__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5863:2: rule__Handler__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Handler__Group__4__Impl_in_rule__Handler__Group__412000);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5869:1: rule__Handler__Group__4__Impl : ( ruleCompoundStatement ) ;
    public final void rule__Handler__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5873:1: ( ( ruleCompoundStatement ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5874:1: ( ruleCompoundStatement )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5874:1: ( ruleCompoundStatement )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5875:1: ruleCompoundStatement
            {
             before(grammarAccess.getHandlerAccess().getCompoundStatementParserRuleCall_4()); 
            pushFollow(FOLLOW_ruleCompoundStatement_in_rule__Handler__Group__4__Impl12027);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5896:1: rule__ExceptionDeclaration__Group_0__0 : rule__ExceptionDeclaration__Group_0__0__Impl rule__ExceptionDeclaration__Group_0__1 ;
    public final void rule__ExceptionDeclaration__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5900:1: ( rule__ExceptionDeclaration__Group_0__0__Impl rule__ExceptionDeclaration__Group_0__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5901:2: rule__ExceptionDeclaration__Group_0__0__Impl rule__ExceptionDeclaration__Group_0__1
            {
            pushFollow(FOLLOW_rule__ExceptionDeclaration__Group_0__0__Impl_in_rule__ExceptionDeclaration__Group_0__012066);
            rule__ExceptionDeclaration__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExceptionDeclaration__Group_0__1_in_rule__ExceptionDeclaration__Group_0__012069);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5908:1: rule__ExceptionDeclaration__Group_0__0__Impl : ( ( ruleAttributeSpecifier )* ) ;
    public final void rule__ExceptionDeclaration__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5912:1: ( ( ( ruleAttributeSpecifier )* ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5913:1: ( ( ruleAttributeSpecifier )* )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5913:1: ( ( ruleAttributeSpecifier )* )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5914:1: ( ruleAttributeSpecifier )*
            {
             before(grammarAccess.getExceptionDeclarationAccess().getAttributeSpecifierParserRuleCall_0_0()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5915:1: ( ruleAttributeSpecifier )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==97) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5915:3: ruleAttributeSpecifier
            	    {
            	    pushFollow(FOLLOW_ruleAttributeSpecifier_in_rule__ExceptionDeclaration__Group_0__0__Impl12097);
            	    ruleAttributeSpecifier();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop57;
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5925:1: rule__ExceptionDeclaration__Group_0__1 : rule__ExceptionDeclaration__Group_0__1__Impl rule__ExceptionDeclaration__Group_0__2 ;
    public final void rule__ExceptionDeclaration__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5929:1: ( rule__ExceptionDeclaration__Group_0__1__Impl rule__ExceptionDeclaration__Group_0__2 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5930:2: rule__ExceptionDeclaration__Group_0__1__Impl rule__ExceptionDeclaration__Group_0__2
            {
            pushFollow(FOLLOW_rule__ExceptionDeclaration__Group_0__1__Impl_in_rule__ExceptionDeclaration__Group_0__112128);
            rule__ExceptionDeclaration__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExceptionDeclaration__Group_0__2_in_rule__ExceptionDeclaration__Group_0__112131);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5937:1: rule__ExceptionDeclaration__Group_0__1__Impl : ( ( ( ruleTypeSpecifier ) ) ( ( ruleTypeSpecifier )* ) ) ;
    public final void rule__ExceptionDeclaration__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5941:1: ( ( ( ( ruleTypeSpecifier ) ) ( ( ruleTypeSpecifier )* ) ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5942:1: ( ( ( ruleTypeSpecifier ) ) ( ( ruleTypeSpecifier )* ) )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5942:1: ( ( ( ruleTypeSpecifier ) ) ( ( ruleTypeSpecifier )* ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5943:1: ( ( ruleTypeSpecifier ) ) ( ( ruleTypeSpecifier )* )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5943:1: ( ( ruleTypeSpecifier ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5944:1: ( ruleTypeSpecifier )
            {
             before(grammarAccess.getExceptionDeclarationAccess().getTypeSpecifierParserRuleCall_0_1()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5945:1: ( ruleTypeSpecifier )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5945:3: ruleTypeSpecifier
            {
            pushFollow(FOLLOW_ruleTypeSpecifier_in_rule__ExceptionDeclaration__Group_0__1__Impl12161);
            ruleTypeSpecifier();

            state._fsp--;


            }

             after(grammarAccess.getExceptionDeclarationAccess().getTypeSpecifierParserRuleCall_0_1()); 

            }

            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5948:1: ( ( ruleTypeSpecifier )* )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5949:1: ( ruleTypeSpecifier )*
            {
             before(grammarAccess.getExceptionDeclarationAccess().getTypeSpecifierParserRuleCall_0_1()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5950:1: ( ruleTypeSpecifier )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( (LA58_0==41) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5950:3: ruleTypeSpecifier
            	    {
            	    pushFollow(FOLLOW_ruleTypeSpecifier_in_rule__ExceptionDeclaration__Group_0__1__Impl12174);
            	    ruleTypeSpecifier();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop58;
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5961:1: rule__ExceptionDeclaration__Group_0__2 : rule__ExceptionDeclaration__Group_0__2__Impl ;
    public final void rule__ExceptionDeclaration__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5965:1: ( rule__ExceptionDeclaration__Group_0__2__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5966:2: rule__ExceptionDeclaration__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__ExceptionDeclaration__Group_0__2__Impl_in_rule__ExceptionDeclaration__Group_0__212207);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5972:1: rule__ExceptionDeclaration__Group_0__2__Impl : ( ( ruleDeclarator )? ) ;
    public final void rule__ExceptionDeclaration__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5976:1: ( ( ( ruleDeclarator )? ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5977:1: ( ( ruleDeclarator )? )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5977:1: ( ( ruleDeclarator )? )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5978:1: ( ruleDeclarator )?
            {
             before(grammarAccess.getExceptionDeclarationAccess().getDeclaratorParserRuleCall_0_2()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5979:1: ( ruleDeclarator )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==36||LA59_0==39||LA59_0==46||LA59_0==54||LA59_0==96) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5979:3: ruleDeclarator
                    {
                    pushFollow(FOLLOW_ruleDeclarator_in_rule__ExceptionDeclaration__Group_0__2__Impl12235);
                    ruleDeclarator();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExceptionDeclarationAccess().getDeclaratorParserRuleCall_0_2()); 

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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5996:1: rule__DynamicExceptionSpecification__Group__0 : rule__DynamicExceptionSpecification__Group__0__Impl rule__DynamicExceptionSpecification__Group__1 ;
    public final void rule__DynamicExceptionSpecification__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6000:1: ( rule__DynamicExceptionSpecification__Group__0__Impl rule__DynamicExceptionSpecification__Group__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6001:2: rule__DynamicExceptionSpecification__Group__0__Impl rule__DynamicExceptionSpecification__Group__1
            {
            pushFollow(FOLLOW_rule__DynamicExceptionSpecification__Group__0__Impl_in_rule__DynamicExceptionSpecification__Group__012273);
            rule__DynamicExceptionSpecification__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DynamicExceptionSpecification__Group__1_in_rule__DynamicExceptionSpecification__Group__012276);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6008:1: rule__DynamicExceptionSpecification__Group__0__Impl : ( 'throw' ) ;
    public final void rule__DynamicExceptionSpecification__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6012:1: ( ( 'throw' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6013:1: ( 'throw' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6013:1: ( 'throw' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6014:1: 'throw'
            {
             before(grammarAccess.getDynamicExceptionSpecificationAccess().getThrowKeyword_0()); 
            match(input,108,FOLLOW_108_in_rule__DynamicExceptionSpecification__Group__0__Impl12304); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6027:1: rule__DynamicExceptionSpecification__Group__1 : rule__DynamicExceptionSpecification__Group__1__Impl rule__DynamicExceptionSpecification__Group__2 ;
    public final void rule__DynamicExceptionSpecification__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6031:1: ( rule__DynamicExceptionSpecification__Group__1__Impl rule__DynamicExceptionSpecification__Group__2 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6032:2: rule__DynamicExceptionSpecification__Group__1__Impl rule__DynamicExceptionSpecification__Group__2
            {
            pushFollow(FOLLOW_rule__DynamicExceptionSpecification__Group__1__Impl_in_rule__DynamicExceptionSpecification__Group__112335);
            rule__DynamicExceptionSpecification__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DynamicExceptionSpecification__Group__2_in_rule__DynamicExceptionSpecification__Group__112338);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6039:1: rule__DynamicExceptionSpecification__Group__1__Impl : ( '(' ) ;
    public final void rule__DynamicExceptionSpecification__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6043:1: ( ( '(' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6044:1: ( '(' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6044:1: ( '(' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6045:1: '('
            {
             before(grammarAccess.getDynamicExceptionSpecificationAccess().getLeftParenthesisKeyword_1()); 
            match(input,99,FOLLOW_99_in_rule__DynamicExceptionSpecification__Group__1__Impl12366); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6058:1: rule__DynamicExceptionSpecification__Group__2 : rule__DynamicExceptionSpecification__Group__2__Impl rule__DynamicExceptionSpecification__Group__3 ;
    public final void rule__DynamicExceptionSpecification__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6062:1: ( rule__DynamicExceptionSpecification__Group__2__Impl rule__DynamicExceptionSpecification__Group__3 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6063:2: rule__DynamicExceptionSpecification__Group__2__Impl rule__DynamicExceptionSpecification__Group__3
            {
            pushFollow(FOLLOW_rule__DynamicExceptionSpecification__Group__2__Impl_in_rule__DynamicExceptionSpecification__Group__212397);
            rule__DynamicExceptionSpecification__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DynamicExceptionSpecification__Group__3_in_rule__DynamicExceptionSpecification__Group__212400);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6070:1: rule__DynamicExceptionSpecification__Group__2__Impl : ( ruleTypeIdList ) ;
    public final void rule__DynamicExceptionSpecification__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6074:1: ( ( ruleTypeIdList ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6075:1: ( ruleTypeIdList )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6075:1: ( ruleTypeIdList )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6076:1: ruleTypeIdList
            {
             before(grammarAccess.getDynamicExceptionSpecificationAccess().getTypeIdListParserRuleCall_2()); 
            pushFollow(FOLLOW_ruleTypeIdList_in_rule__DynamicExceptionSpecification__Group__2__Impl12427);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6087:1: rule__DynamicExceptionSpecification__Group__3 : rule__DynamicExceptionSpecification__Group__3__Impl ;
    public final void rule__DynamicExceptionSpecification__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6091:1: ( rule__DynamicExceptionSpecification__Group__3__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6092:2: rule__DynamicExceptionSpecification__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__DynamicExceptionSpecification__Group__3__Impl_in_rule__DynamicExceptionSpecification__Group__312456);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6098:1: rule__DynamicExceptionSpecification__Group__3__Impl : ( ')' ) ;
    public final void rule__DynamicExceptionSpecification__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6102:1: ( ( ')' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6103:1: ( ')' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6103:1: ( ')' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6104:1: ')'
            {
             before(grammarAccess.getDynamicExceptionSpecificationAccess().getRightParenthesisKeyword_3()); 
            match(input,100,FOLLOW_100_in_rule__DynamicExceptionSpecification__Group__3__Impl12484); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6125:1: rule__NoexceptSpecification__Group__0 : rule__NoexceptSpecification__Group__0__Impl rule__NoexceptSpecification__Group__1 ;
    public final void rule__NoexceptSpecification__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6129:1: ( rule__NoexceptSpecification__Group__0__Impl rule__NoexceptSpecification__Group__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6130:2: rule__NoexceptSpecification__Group__0__Impl rule__NoexceptSpecification__Group__1
            {
            pushFollow(FOLLOW_rule__NoexceptSpecification__Group__0__Impl_in_rule__NoexceptSpecification__Group__012523);
            rule__NoexceptSpecification__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NoexceptSpecification__Group__1_in_rule__NoexceptSpecification__Group__012526);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6137:1: rule__NoexceptSpecification__Group__0__Impl : ( 'noexcept' ) ;
    public final void rule__NoexceptSpecification__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6141:1: ( ( 'noexcept' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6142:1: ( 'noexcept' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6142:1: ( 'noexcept' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6143:1: 'noexcept'
            {
             before(grammarAccess.getNoexceptSpecificationAccess().getNoexceptKeyword_0()); 
            match(input,109,FOLLOW_109_in_rule__NoexceptSpecification__Group__0__Impl12554); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6156:1: rule__NoexceptSpecification__Group__1 : rule__NoexceptSpecification__Group__1__Impl ;
    public final void rule__NoexceptSpecification__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6160:1: ( rule__NoexceptSpecification__Group__1__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6161:2: rule__NoexceptSpecification__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__NoexceptSpecification__Group__1__Impl_in_rule__NoexceptSpecification__Group__112585);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6167:1: rule__NoexceptSpecification__Group__1__Impl : ( ( rule__NoexceptSpecification__Group_1__0 )? ) ;
    public final void rule__NoexceptSpecification__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6171:1: ( ( ( rule__NoexceptSpecification__Group_1__0 )? ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6172:1: ( ( rule__NoexceptSpecification__Group_1__0 )? )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6172:1: ( ( rule__NoexceptSpecification__Group_1__0 )? )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6173:1: ( rule__NoexceptSpecification__Group_1__0 )?
            {
             before(grammarAccess.getNoexceptSpecificationAccess().getGroup_1()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6174:1: ( rule__NoexceptSpecification__Group_1__0 )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==99) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6174:2: rule__NoexceptSpecification__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__NoexceptSpecification__Group_1__0_in_rule__NoexceptSpecification__Group__1__Impl12612);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6188:1: rule__NoexceptSpecification__Group_1__0 : rule__NoexceptSpecification__Group_1__0__Impl rule__NoexceptSpecification__Group_1__1 ;
    public final void rule__NoexceptSpecification__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6192:1: ( rule__NoexceptSpecification__Group_1__0__Impl rule__NoexceptSpecification__Group_1__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6193:2: rule__NoexceptSpecification__Group_1__0__Impl rule__NoexceptSpecification__Group_1__1
            {
            pushFollow(FOLLOW_rule__NoexceptSpecification__Group_1__0__Impl_in_rule__NoexceptSpecification__Group_1__012647);
            rule__NoexceptSpecification__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NoexceptSpecification__Group_1__1_in_rule__NoexceptSpecification__Group_1__012650);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6200:1: rule__NoexceptSpecification__Group_1__0__Impl : ( '(' ) ;
    public final void rule__NoexceptSpecification__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6204:1: ( ( '(' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6205:1: ( '(' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6205:1: ( '(' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6206:1: '('
            {
             before(grammarAccess.getNoexceptSpecificationAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,99,FOLLOW_99_in_rule__NoexceptSpecification__Group_1__0__Impl12678); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6219:1: rule__NoexceptSpecification__Group_1__1 : rule__NoexceptSpecification__Group_1__1__Impl rule__NoexceptSpecification__Group_1__2 ;
    public final void rule__NoexceptSpecification__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6223:1: ( rule__NoexceptSpecification__Group_1__1__Impl rule__NoexceptSpecification__Group_1__2 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6224:2: rule__NoexceptSpecification__Group_1__1__Impl rule__NoexceptSpecification__Group_1__2
            {
            pushFollow(FOLLOW_rule__NoexceptSpecification__Group_1__1__Impl_in_rule__NoexceptSpecification__Group_1__112709);
            rule__NoexceptSpecification__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NoexceptSpecification__Group_1__2_in_rule__NoexceptSpecification__Group_1__112712);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6231:1: rule__NoexceptSpecification__Group_1__1__Impl : ( ruleConstantExpression ) ;
    public final void rule__NoexceptSpecification__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6235:1: ( ( ruleConstantExpression ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6236:1: ( ruleConstantExpression )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6236:1: ( ruleConstantExpression )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6237:1: ruleConstantExpression
            {
             before(grammarAccess.getNoexceptSpecificationAccess().getConstantExpressionParserRuleCall_1_1()); 
            pushFollow(FOLLOW_ruleConstantExpression_in_rule__NoexceptSpecification__Group_1__1__Impl12739);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6248:1: rule__NoexceptSpecification__Group_1__2 : rule__NoexceptSpecification__Group_1__2__Impl ;
    public final void rule__NoexceptSpecification__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6252:1: ( rule__NoexceptSpecification__Group_1__2__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6253:2: rule__NoexceptSpecification__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__NoexceptSpecification__Group_1__2__Impl_in_rule__NoexceptSpecification__Group_1__212768);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6259:1: rule__NoexceptSpecification__Group_1__2__Impl : ( ')' ) ;
    public final void rule__NoexceptSpecification__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6263:1: ( ( ')' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6264:1: ( ')' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6264:1: ( ')' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6265:1: ')'
            {
             before(grammarAccess.getNoexceptSpecificationAccess().getRightParenthesisKeyword_1_2()); 
            match(input,100,FOLLOW_100_in_rule__NoexceptSpecification__Group_1__2__Impl12796); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6285:1: rule__Test__ElementsAssignment : ( ruleFunctionDefinition ) ;
    public final void rule__Test__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6289:1: ( ( ruleFunctionDefinition ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6290:1: ( ruleFunctionDefinition )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6290:1: ( ruleFunctionDefinition )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6291:1: ruleFunctionDefinition
            {
             before(grammarAccess.getTestAccess().getElementsFunctionDefinitionParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleFunctionDefinition_in_rule__Test__ElementsAssignment12838);
            ruleFunctionDefinition();

            state._fsp--;

             after(grammarAccess.getTestAccess().getElementsFunctionDefinitionParserRuleCall_0()); 

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


    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA13_eotS =
        "\55\uffff";
    static final String DFA13_eofS =
        "\1\uffff\1\51\1\53\52\uffff";
    static final String DFA13_minS =
        "\1\64\2\103\52\uffff";
    static final String DFA13_maxS =
        "\1\134\2\141\52\uffff";
    static final String DFA13_acceptS =
        "\3\uffff\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1"+
        "\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34"+
        "\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46\1\47\1\50\1\51"+
        "\1\52\1\1\1\3\1\2\1\4";
    static final String DFA13_specialS =
        "\55\uffff}>";
    static final String[] DFA13_transitionS = {
            "\1\11\1\40\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\12\1"+
            "\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1"+
            "\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\41\1\42\1\43\1"+
            "\44\1\45\1\46\1\47\1\50",
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

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "1787:1: rule__OverloadableOperator__Alternatives : ( ( 'new' ) | ( 'delete' ) | ( ( rule__OverloadableOperator__Group_2__0 ) ) | ( ( rule__OverloadableOperator__Group_3__0 ) ) | ( '+' ) | ( '-' ) | ( '*' ) | ( '/' ) | ( '%' ) | ( '^' ) | ( '&' ) | ( '|' ) | ( '~' ) | ( '!' ) | ( '=' ) | ( '<' ) | ( '>' ) | ( '+=' ) | ( '-=' ) | ( '*=' ) | ( '/=' ) | ( '%=' ) | ( '^=' ) | ( '&=' ) | ( '|=' ) | ( '<<' ) | ( '>>' ) | ( '>>=' ) | ( '<<=' ) | ( '==' ) | ( '!=' ) | ( '<=' ) | ( '>=' ) | ( '&&' ) | ( '||' ) | ( '++' ) | ( '--' ) | ( ',' ) | ( '->*' ) | ( '->' ) | ( '()' ) | ( '[]' ) );";
        }
    }
 

    public static final BitSet FOLLOW_ruleTest_in_entryRuleTest61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTest68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Test__ElementsAssignment_in_ruleTest94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleToken_in_entryRuleToken121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleToken128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Token__Alternatives_in_ruleToken154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Alternatives_in_ruleLiteral214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamespaceBody_in_entryRuleNamespaceBody243 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNamespaceBody250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_ruleNamespaceBody277 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNamespaceSpecifier_in_entryRuleQualifiedNamespaceSpecifier307 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNamespaceSpecifier314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNamespaceSpecifier__Group__0_in_ruleQualifiedNamespaceSpecifier340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeSpecifier_in_entryRuleAttributeSpecifier375 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttributeSpecifier382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeSpecifier__Group__0_in_ruleAttributeSpecifier408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeList_in_entryRuleAttributeList435 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttributeList442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeList__Group__0_in_ruleAttributeList468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute495 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__0_in_ruleAttribute528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeToken_in_entryRuleAttributeToken555 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttributeToken562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeToken__Group__0_in_ruleAttributeToken588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeArgumentClause_in_entryRuleAttributeArgumentClause615 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttributeArgumentClause622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeArgumentClause__Group__0_in_ruleAttributeArgumentClause648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInitDeclarator_in_entryRuleInitDeclarator675 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInitDeclarator682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InitDeclarator__Group__0_in_ruleInitDeclarator708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclarator_in_entryRuleDeclarator735 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeclarator742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoptrDeclarator_in_ruleDeclarator768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionDeclarator_in_entryRuleFunctionDeclarator794 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionDeclarator801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDeclarator__Group__0_in_ruleFunctionDeclarator827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoptrDeclarator_in_entryRuleNoptrDeclarator854 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNoptrDeclarator861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaratorId_in_ruleNoptrDeclarator887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParametersAndQualifiers_in_entryRuleParametersAndQualifiers913 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParametersAndQualifiers920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParametersAndQualifiers__Group__0_in_ruleParametersAndQualifiers946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaratorId_in_entryRuleDeclaratorId973 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeclaratorId980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeclaratorId__Alternatives_in_ruleDeclaratorId1006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeId_in_entryRuleTypeId1033 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeId1040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeSpecifier_in_ruleTypeId1069 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_ruleTypeSpecifier_in_ruleTypeId1082 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_ruleParameterDeclarationClause_in_entryRuleParameterDeclarationClause1112 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterDeclarationClause1119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterDeclarationClause__Alternatives_in_ruleParameterDeclarationClause1145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterDeclarationList_in_entryRuleParameterDeclarationList1172 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterDeclarationList1179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterDeclarationList__Group__0_in_ruleParameterDeclarationList1205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterDeclaration_in_entryRuleParameterDeclaration1232 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterDeclaration1239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterDeclaration__Group__0_in_ruleParameterDeclaration1265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionDefinition_in_entryRuleFunctionDefinition1292 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionDefinition1299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group__0_in_ruleFunctionDefinition1325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionBody_in_entryRuleFunctionBody1352 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionBody1359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionBody__Alternatives_in_ruleFunctionBody1385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperatorFunctionId_in_entryRuleOperatorFunctionId1412 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperatorFunctionId1419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OperatorFunctionId__Group__0_in_ruleOperatorFunctionId1445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOverloadableOperator_in_entryRuleOverloadableOperator1472 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOverloadableOperator1479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OverloadableOperator__Alternatives_in_ruleOverloadableOperator1505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralOperatorId_in_entryRuleLiteralOperatorId1532 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteralOperatorId1539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LiteralOperatorId__Group__0_in_ruleLiteralOperatorId1565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplateDeclaration_in_entryRuleTemplateDeclaration1592 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTemplateDeclaration1599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemplateDeclaration__Group__0_in_ruleTemplateDeclaration1625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplateParameterList_in_entryRuleTemplateParameterList1652 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTemplateParameterList1659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemplateParameterList__Group__0_in_ruleTemplateParameterList1685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplateParameter_in_entryRuleTemplateParameter1712 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTemplateParameter1719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemplateParameter__Alternatives_in_ruleTemplateParameter1745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeParameter_in_entryRuleTypeParameter1772 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeParameter1779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group__0_in_ruleTypeParameter1805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplateArgumentList_in_entryRuleTemplateArgumentList1834 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTemplateArgumentList1841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemplateArgumentList__Group__0_in_ruleTemplateArgumentList1867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplateArgument_in_entryRuleTemplateArgument1894 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTemplateArgument1901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemplateArgument__Alternatives_in_ruleTemplateArgument1927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionTryBlock_in_entryRuleFunctionTryBlock1958 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionTryBlock1965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionTryBlock__Group__0_in_ruleFunctionTryBlock1991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHandler_in_entryRuleHandler2018 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHandler2025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Handler__Group__0_in_ruleHandler2051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExceptionDeclaration_in_entryRuleExceptionDeclaration2078 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExceptionDeclaration2085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExceptionDeclaration__Alternatives_in_ruleExceptionDeclaration2111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExceptionSpecification_in_entryRuleExceptionSpecification2140 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExceptionSpecification2147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExceptionSpecification__Alternatives_in_ruleExceptionSpecification2173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDynamicExceptionSpecification_in_entryRuleDynamicExceptionSpecification2200 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDynamicExceptionSpecification2207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DynamicExceptionSpecification__Group__0_in_ruleDynamicExceptionSpecification2233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoexceptSpecification_in_entryRuleNoexceptSpecification2260 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNoexceptSpecification2267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NoexceptSpecification__Group__0_in_ruleNoexceptSpecification2293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantExpression_in_entryRuleConstantExpression2320 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstantExpression2327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleConstantExpression2354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdExpression_in_entryRuleIdExpression2382 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIdExpression2389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleIdExpression2416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclarationSpecifier_in_entryRuleDeclarationSpecifier2444 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeclarationSpecifier2451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleDeclarationSpecifier2478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_entryRuleDeclaration2506 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeclaration2513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleDeclaration2540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNestedNameSpecifier_in_entryRuleNestedNameSpecifier2568 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNestedNameSpecifier2575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleNestedNameSpecifier2602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignmentExpression_in_entryRuleAssignmentExpression2630 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignmentExpression2637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleAssignmentExpression2664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeSpecifier_in_entryRuleTypeSpecifier2694 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeSpecifier2701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleTypeSpecifier2728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompoundStatement_in_entryRuleCompoundStatement2756 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompoundStatement2763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleCompoundStatement2790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCtorInitializer_in_entryRuleCtorInitializer2818 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCtorInitializer2825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleCtorInitializer2852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeIdList_in_entryRuleTypeIdList2880 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeIdList2887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleTypeIdList2914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnqualifiedId_in_entryRuleUnqualifiedId2942 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnqualifiedId2949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleUnqualifiedId2976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassName_in_entryRuleClassName3004 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClassName3011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleClassName3038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInitializer_in_entryRuleInitializer3066 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInitializer3073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleInitializer3100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_KEYWORD_in_rule__Token__Alternatives3137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_rule__Token__Alternatives3154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Token__Group_2__0_in_rule__Token__Alternatives3171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Literal__Alternatives3204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CHARACTER_LITERAL_in_rule__Literal__Alternatives3221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOATING_LITERAL_in_rule__Literal__Alternatives3238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_LITERAL_in_rule__Literal__Alternatives3255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Group_4__0_in_rule__Literal__Alternatives3272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__Literal__Alternatives_4_03306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__Literal__Alternatives_4_03326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__ParametersAndQualifiers__Alternatives_43363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__ParametersAndQualifiers__Alternatives_43383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__ParametersAndQualifiers__Alternatives_53418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rule__ParametersAndQualifiers__Alternatives_53438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeclaratorId__Group_0__0_in_rule__DeclaratorId__Alternatives3472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeclaratorId__Group_1__0_in_rule__DeclaratorId__Alternatives3490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rule__ParameterDeclarationClause__Alternatives3524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterDeclarationClause__Group_1__0_in_rule__ParameterDeclarationClause__Alternatives3543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionBody_in_rule__FunctionDefinition__Alternatives_33576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group_3_1__0_in_rule__FunctionDefinition__Alternatives_33593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group_3_2__0_in_rule__FunctionDefinition__Alternatives_33611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionBody__Group_0__0_in_rule__FunctionBody__Alternatives3644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionTryBlock_in_rule__FunctionBody__Alternatives3662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantExpression_in_rule__OperatorFunctionId__Alternatives_2_13694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeSpecifier_in_rule__OperatorFunctionId__Alternatives_2_13711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdExpression_in_rule__OperatorFunctionId__Alternatives_2_13728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rule__OverloadableOperator__Alternatives3761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_rule__OverloadableOperator__Alternatives3781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OverloadableOperator__Group_2__0_in_rule__OverloadableOperator__Alternatives3800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OverloadableOperator__Group_3__0_in_rule__OverloadableOperator__Alternatives3818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_rule__OverloadableOperator__Alternatives3837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_rule__OverloadableOperator__Alternatives3857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_rule__OverloadableOperator__Alternatives3877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_rule__OverloadableOperator__Alternatives3897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_rule__OverloadableOperator__Alternatives3917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_rule__OverloadableOperator__Alternatives3937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__OverloadableOperator__Alternatives3957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_rule__OverloadableOperator__Alternatives3977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_rule__OverloadableOperator__Alternatives3997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_rule__OverloadableOperator__Alternatives4017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_rule__OverloadableOperator__Alternatives4037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_rule__OverloadableOperator__Alternatives4057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_rule__OverloadableOperator__Alternatives4077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_rule__OverloadableOperator__Alternatives4097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_rule__OverloadableOperator__Alternatives4117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_rule__OverloadableOperator__Alternatives4137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_rule__OverloadableOperator__Alternatives4157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_rule__OverloadableOperator__Alternatives4177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_rule__OverloadableOperator__Alternatives4197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_rule__OverloadableOperator__Alternatives4217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_rule__OverloadableOperator__Alternatives4237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_rule__OverloadableOperator__Alternatives4257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_rule__OverloadableOperator__Alternatives4277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_rule__OverloadableOperator__Alternatives4297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_rule__OverloadableOperator__Alternatives4317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_rule__OverloadableOperator__Alternatives4337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_rule__OverloadableOperator__Alternatives4357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_rule__OverloadableOperator__Alternatives4377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_rule__OverloadableOperator__Alternatives4397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rule__OverloadableOperator__Alternatives4417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_rule__OverloadableOperator__Alternatives4437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_rule__OverloadableOperator__Alternatives4457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_rule__OverloadableOperator__Alternatives4477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_rule__OverloadableOperator__Alternatives4497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_rule__OverloadableOperator__Alternatives4517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_rule__OverloadableOperator__Alternatives4537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_rule__OverloadableOperator__Alternatives4557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_rule__OverloadableOperator__Alternatives4577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeParameter_in_rule__TemplateParameter__Alternatives4611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterDeclaration_in_rule__TemplateParameter__Alternatives4628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_rule__TypeParameter__Alternatives_04661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_rule__TypeParameter__Alternatives_04681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_1_0__0_in_rule__TypeParameter__Alternatives_14715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_1_1__0_in_rule__TypeParameter__Alternatives_14733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantExpression_in_rule__TemplateArgument__Alternatives4767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeId_in_rule__TemplateArgument__Alternatives4784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdExpression_in_rule__TemplateArgument__Alternatives4801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExceptionDeclaration__Group_0__0_in_rule__ExceptionDeclaration__Alternatives4834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rule__ExceptionDeclaration__Alternatives4853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDynamicExceptionSpecification_in_rule__ExceptionSpecification__Alternatives4887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoexceptSpecification_in_rule__ExceptionSpecification__Alternatives4904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Token__Group_2__0__Impl_in_rule__Token__Group_2__04934 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_rule__Token__Group_2__1_in_rule__Token__Group_2__04937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PREPROCESSING_OP_OR_PUNC_in_rule__Token__Group_2__0__Impl4964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Token__Group_2__1__Impl_in_rule__Token__Group_2__14993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Token__Group_2__1__Impl5020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Group_4__0__Impl_in_rule__Literal__Group_4__05053 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Literal__Group_4__1_in_rule__Literal__Group_4__05056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Alternatives_4_0_in_rule__Literal__Group_4__0__Impl5083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Group_4__1__Impl_in_rule__Literal__Group_4__15113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_rule__Literal__Group_4__1__Impl5141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNamespaceSpecifier__Group__0__Impl_in_rule__QualifiedNamespaceSpecifier__Group__05178 = new BitSet(new long[]{0x0000008000000400L});
    public static final BitSet FOLLOW_rule__QualifiedNamespaceSpecifier__Group__1_in_rule__QualifiedNamespaceSpecifier__Group__05181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_rule__QualifiedNamespaceSpecifier__Group__0__Impl5210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNamespaceSpecifier__Group__1__Impl_in_rule__QualifiedNamespaceSpecifier__Group__15243 = new BitSet(new long[]{0x0000008000000400L});
    public static final BitSet FOLLOW_rule__QualifiedNamespaceSpecifier__Group__2_in_rule__QualifiedNamespaceSpecifier__Group__15246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNestedNameSpecifier_in_rule__QualifiedNamespaceSpecifier__Group__1__Impl5274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNamespaceSpecifier__Group__2__Impl_in_rule__QualifiedNamespaceSpecifier__Group__25305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedNamespaceSpecifier__Group__2__Impl5332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeSpecifier__Group__0__Impl_in_rule__AttributeSpecifier__Group__05373 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_rule__AttributeSpecifier__Group__1_in_rule__AttributeSpecifier__Group__05376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_rule__AttributeSpecifier__Group__0__Impl5404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeSpecifier__Group__1__Impl_in_rule__AttributeSpecifier__Group__15435 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_rule__AttributeSpecifier__Group__2_in_rule__AttributeSpecifier__Group__15438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_rule__AttributeSpecifier__Group__1__Impl5466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeSpecifier__Group__2__Impl_in_rule__AttributeSpecifier__Group__25497 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_rule__AttributeSpecifier__Group__3_in_rule__AttributeSpecifier__Group__25500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeList_in_rule__AttributeSpecifier__Group__2__Impl5527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeSpecifier__Group__3__Impl_in_rule__AttributeSpecifier__Group__35556 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_rule__AttributeSpecifier__Group__4_in_rule__AttributeSpecifier__Group__35559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_98_in_rule__AttributeSpecifier__Group__3__Impl5587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeSpecifier__Group__4__Impl_in_rule__AttributeSpecifier__Group__45618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_98_in_rule__AttributeSpecifier__Group__4__Impl5646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeList__Group__0__Impl_in_rule__AttributeList__Group__05687 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_rule__AttributeList__Group__1_in_rule__AttributeList__Group__05690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeList__Group_0__0_in_rule__AttributeList__Group__0__Impl5717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeList__Group__1__Impl_in_rule__AttributeList__Group__15747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeList__Group_1__0_in_rule__AttributeList__Group__1__Impl5774 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
    public static final BitSet FOLLOW_rule__AttributeList__Group_0__0__Impl_in_rule__AttributeList__Group_0__05809 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_rule__AttributeList__Group_0__1_in_rule__AttributeList__Group_0__05812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_rule__AttributeList__Group_0__0__Impl5839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeList__Group_0__1__Impl_in_rule__AttributeList__Group_0__15868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rule__AttributeList__Group_0__1__Impl5897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeList__Group_1__0__Impl_in_rule__AttributeList__Group_1__05934 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_rule__AttributeList__Group_1__1_in_rule__AttributeList__Group_1__05937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_rule__AttributeList__Group_1__0__Impl5965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeList__Group_1__1__Impl_in_rule__AttributeList__Group_1__15996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeList__Group_1_1__0_in_rule__AttributeList__Group_1__1__Impl6023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeList__Group_1_1__0__Impl_in_rule__AttributeList__Group_1_1__06058 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_rule__AttributeList__Group_1_1__1_in_rule__AttributeList__Group_1_1__06061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_rule__AttributeList__Group_1_1__0__Impl6088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeList__Group_1_1__1__Impl_in_rule__AttributeList__Group_1_1__16117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rule__AttributeList__Group_1_1__1__Impl6146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__0__Impl_in_rule__Attribute__Group__06183 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_rule__Attribute__Group__1_in_rule__Attribute__Group__06186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeToken_in_rule__Attribute__Group__0__Impl6213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__1__Impl_in_rule__Attribute__Group__16242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeArgumentClause_in_rule__Attribute__Group__1__Impl6270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeToken__Group__0__Impl_in_rule__AttributeToken__Group__06305 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_rule__AttributeToken__Group__1_in_rule__AttributeToken__Group__06308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeToken__Group_0__0_in_rule__AttributeToken__Group__0__Impl6335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeToken__Group__1__Impl_in_rule__AttributeToken__Group__16366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__AttributeToken__Group__1__Impl6393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeToken__Group_0__0__Impl_in_rule__AttributeToken__Group_0__06426 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_rule__AttributeToken__Group_0__1_in_rule__AttributeToken__Group_0__06429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__AttributeToken__Group_0__0__Impl6456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeToken__Group_0__1__Impl_in_rule__AttributeToken__Group_0__16485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_rule__AttributeToken__Group_0__1__Impl6513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeArgumentClause__Group__0__Impl_in_rule__AttributeArgumentClause__Group__06548 = new BitSet(new long[]{0x00030000000003F0L});
    public static final BitSet FOLLOW_rule__AttributeArgumentClause__Group__1_in_rule__AttributeArgumentClause__Group__06551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_99_in_rule__AttributeArgumentClause__Group__0__Impl6579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeArgumentClause__Group__1__Impl_in_rule__AttributeArgumentClause__Group__16610 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_rule__AttributeArgumentClause__Group__2_in_rule__AttributeArgumentClause__Group__16613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleToken_in_rule__AttributeArgumentClause__Group__1__Impl6640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeArgumentClause__Group__2__Impl_in_rule__AttributeArgumentClause__Group__26669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_100_in_rule__AttributeArgumentClause__Group__2__Impl6697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InitDeclarator__Group__0__Impl_in_rule__InitDeclarator__Group__06734 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_rule__InitDeclarator__Group__1_in_rule__InitDeclarator__Group__06737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclarator_in_rule__InitDeclarator__Group__0__Impl6764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InitDeclarator__Group__1__Impl_in_rule__InitDeclarator__Group__16793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInitializer_in_rule__InitDeclarator__Group__1__Impl6821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDeclarator__Group__0__Impl_in_rule__FunctionDeclarator__Group__06856 = new BitSet(new long[]{0x0040409000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_rule__FunctionDeclarator__Group__1_in_rule__FunctionDeclarator__Group__06859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplateDeclaration_in_rule__FunctionDeclarator__Group__0__Impl6887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDeclarator__Group__1__Impl_in_rule__FunctionDeclarator__Group__16918 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_rule__FunctionDeclarator__Group__2_in_rule__FunctionDeclarator__Group__16921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoptrDeclarator_in_rule__FunctionDeclarator__Group__1__Impl6948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDeclarator__Group__2__Impl_in_rule__FunctionDeclarator__Group__26977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParametersAndQualifiers_in_rule__FunctionDeclarator__Group__2__Impl7004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParametersAndQualifiers__Group__0__Impl_in_rule__ParametersAndQualifiers__Group__07039 = new BitSet(new long[]{0x0040002000000000L,0x0000001200000000L});
    public static final BitSet FOLLOW_rule__ParametersAndQualifiers__Group__1_in_rule__ParametersAndQualifiers__Group__07042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_99_in_rule__ParametersAndQualifiers__Group__0__Impl7070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParametersAndQualifiers__Group__1__Impl_in_rule__ParametersAndQualifiers__Group__17101 = new BitSet(new long[]{0x0040002000000000L,0x0000001200000000L});
    public static final BitSet FOLLOW_rule__ParametersAndQualifiers__Group__2_in_rule__ParametersAndQualifiers__Group__17104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterDeclarationClause_in_rule__ParametersAndQualifiers__Group__1__Impl7132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParametersAndQualifiers__Group__2__Impl_in_rule__ParametersAndQualifiers__Group__27163 = new BitSet(new long[]{0x003C000000000000L,0x0000300200000000L});
    public static final BitSet FOLLOW_rule__ParametersAndQualifiers__Group__3_in_rule__ParametersAndQualifiers__Group__27166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_100_in_rule__ParametersAndQualifiers__Group__2__Impl7194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParametersAndQualifiers__Group__3__Impl_in_rule__ParametersAndQualifiers__Group__37225 = new BitSet(new long[]{0x003C000000000000L,0x0000300200000000L});
    public static final BitSet FOLLOW_rule__ParametersAndQualifiers__Group__4_in_rule__ParametersAndQualifiers__Group__37228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeSpecifier_in_rule__ParametersAndQualifiers__Group__3__Impl7256 = new BitSet(new long[]{0x0000000000000002L,0x0000000200000000L});
    public static final BitSet FOLLOW_rule__ParametersAndQualifiers__Group__4__Impl_in_rule__ParametersAndQualifiers__Group__47287 = new BitSet(new long[]{0x003C000000000000L,0x0000300200000000L});
    public static final BitSet FOLLOW_rule__ParametersAndQualifiers__Group__5_in_rule__ParametersAndQualifiers__Group__47290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParametersAndQualifiers__Alternatives_4_in_rule__ParametersAndQualifiers__Group__4__Impl7317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParametersAndQualifiers__Group__5__Impl_in_rule__ParametersAndQualifiers__Group__57348 = new BitSet(new long[]{0x003C000000000000L,0x0000300200000000L});
    public static final BitSet FOLLOW_rule__ParametersAndQualifiers__Group__6_in_rule__ParametersAndQualifiers__Group__57351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParametersAndQualifiers__Alternatives_5_in_rule__ParametersAndQualifiers__Group__5__Impl7378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParametersAndQualifiers__Group__6__Impl_in_rule__ParametersAndQualifiers__Group__67409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExceptionSpecification_in_rule__ParametersAndQualifiers__Group__6__Impl7437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeclaratorId__Group_0__0__Impl_in_rule__DeclaratorId__Group_0__07482 = new BitSet(new long[]{0x0040001000000000L});
    public static final BitSet FOLLOW_rule__DeclaratorId__Group_0__1_in_rule__DeclaratorId__Group_0__07485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rule__DeclaratorId__Group_0__0__Impl7514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeclaratorId__Group_0__1__Impl_in_rule__DeclaratorId__Group_0__17547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdExpression_in_rule__DeclaratorId__Group_0__1__Impl7574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeclaratorId__Group_1__0__Impl_in_rule__DeclaratorId__Group_1__07607 = new BitSet(new long[]{0x0040409000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_rule__DeclaratorId__Group_1__1_in_rule__DeclaratorId__Group_1__07610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_rule__DeclaratorId__Group_1__0__Impl7639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeclaratorId__Group_1__1__Impl_in_rule__DeclaratorId__Group_1__17672 = new BitSet(new long[]{0x0040409000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_rule__DeclaratorId__Group_1__2_in_rule__DeclaratorId__Group_1__17675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNestedNameSpecifier_in_rule__DeclaratorId__Group_1__1__Impl7703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeclaratorId__Group_1__2__Impl_in_rule__DeclaratorId__Group_1__27734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassName_in_rule__DeclaratorId__Group_1__2__Impl7761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterDeclarationClause__Group_1__0__Impl_in_rule__ParameterDeclarationClause__Group_1__07796 = new BitSet(new long[]{0x0040000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_rule__ParameterDeclarationClause__Group_1__1_in_rule__ParameterDeclarationClause__Group_1__07799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterDeclarationList_in_rule__ParameterDeclarationClause__Group_1__0__Impl7826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterDeclarationClause__Group_1__1__Impl_in_rule__ParameterDeclarationClause__Group_1__17855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterDeclarationClause__Group_1_1__0_in_rule__ParameterDeclarationClause__Group_1__1__Impl7882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterDeclarationClause__Group_1_1__0__Impl_in_rule__ParameterDeclarationClause__Group_1_1__07917 = new BitSet(new long[]{0x0040000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_rule__ParameterDeclarationClause__Group_1_1__1_in_rule__ParameterDeclarationClause__Group_1_1__07920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_rule__ParameterDeclarationClause__Group_1_1__0__Impl7949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterDeclarationClause__Group_1_1__1__Impl_in_rule__ParameterDeclarationClause__Group_1_1__17982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rule__ParameterDeclarationClause__Group_1_1__1__Impl8010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterDeclarationList__Group__0__Impl_in_rule__ParameterDeclarationList__Group__08045 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_rule__ParameterDeclarationList__Group__1_in_rule__ParameterDeclarationList__Group__08048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterDeclaration_in_rule__ParameterDeclarationList__Group__0__Impl8075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterDeclarationList__Group__1__Impl_in_rule__ParameterDeclarationList__Group__18104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterDeclarationList__Group_1__0_in_rule__ParameterDeclarationList__Group__1__Impl8131 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
    public static final BitSet FOLLOW_rule__ParameterDeclarationList__Group_1__0__Impl_in_rule__ParameterDeclarationList__Group_1__08166 = new BitSet(new long[]{0x0040002000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_rule__ParameterDeclarationList__Group_1__1_in_rule__ParameterDeclarationList__Group_1__08169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_rule__ParameterDeclarationList__Group_1__0__Impl8197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterDeclarationList__Group_1__1__Impl_in_rule__ParameterDeclarationList__Group_1__18228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterDeclaration_in_rule__ParameterDeclarationList__Group_1__1__Impl8255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterDeclaration__Group__0__Impl_in_rule__ParameterDeclaration__Group__08288 = new BitSet(new long[]{0x0040002000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_rule__ParameterDeclaration__Group__1_in_rule__ParameterDeclaration__Group__08291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeSpecifier_in_rule__ParameterDeclaration__Group__0__Impl8319 = new BitSet(new long[]{0x0000000000000002L,0x0000000200000000L});
    public static final BitSet FOLLOW_rule__ParameterDeclaration__Group__1__Impl_in_rule__ParameterDeclaration__Group__18350 = new BitSet(new long[]{0x0040409000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_rule__ParameterDeclaration__Group__2_in_rule__ParameterDeclaration__Group__18353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclarationSpecifier_in_rule__ParameterDeclaration__Group__1__Impl8383 = new BitSet(new long[]{0x0040002000000002L,0x0000000200000000L});
    public static final BitSet FOLLOW_ruleDeclarationSpecifier_in_rule__ParameterDeclaration__Group__1__Impl8396 = new BitSet(new long[]{0x0040002000000002L,0x0000000200000000L});
    public static final BitSet FOLLOW_rule__ParameterDeclaration__Group__2__Impl_in_rule__ParameterDeclaration__Group__28429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInitDeclarator_in_rule__ParameterDeclaration__Group__2__Impl8456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group__0__Impl_in_rule__FunctionDefinition__Group__08491 = new BitSet(new long[]{0x004040B000000000L,0x0000020300000000L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group__1_in_rule__FunctionDefinition__Group__08494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeSpecifier_in_rule__FunctionDefinition__Group__0__Impl8522 = new BitSet(new long[]{0x0000000000000002L,0x0000000200000000L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group__1__Impl_in_rule__FunctionDefinition__Group__18553 = new BitSet(new long[]{0x004040B000000000L,0x0000020300000000L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group__2_in_rule__FunctionDefinition__Group__18556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclarationSpecifier_in_rule__FunctionDefinition__Group__1__Impl8584 = new BitSet(new long[]{0x0040002000000002L,0x0000000200000000L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group__2__Impl_in_rule__FunctionDefinition__Group__28615 = new BitSet(new long[]{0x00000C0000000000L,0x0000040000000004L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group__3_in_rule__FunctionDefinition__Group__28618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionDeclarator_in_rule__FunctionDefinition__Group__2__Impl8645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group__3__Impl_in_rule__FunctionDefinition__Group__38674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Alternatives_3_in_rule__FunctionDefinition__Group__3__Impl8701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group_3_1__0__Impl_in_rule__FunctionDefinition__Group_3_1__08739 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group_3_1__1_in_rule__FunctionDefinition__Group_3_1__08742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_rule__FunctionDefinition__Group_3_1__0__Impl8770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group_3_1__1__Impl_in_rule__FunctionDefinition__Group_3_1__18801 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group_3_1__2_in_rule__FunctionDefinition__Group_3_1__18804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_101_in_rule__FunctionDefinition__Group_3_1__1__Impl8832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group_3_1__2__Impl_in_rule__FunctionDefinition__Group_3_1__28863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_102_in_rule__FunctionDefinition__Group_3_1__2__Impl8891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group_3_2__0__Impl_in_rule__FunctionDefinition__Group_3_2__08928 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group_3_2__1_in_rule__FunctionDefinition__Group_3_2__08931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_rule__FunctionDefinition__Group_3_2__0__Impl8959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group_3_2__1__Impl_in_rule__FunctionDefinition__Group_3_2__18990 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group_3_2__2_in_rule__FunctionDefinition__Group_3_2__18993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_rule__FunctionDefinition__Group_3_2__1__Impl9021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group_3_2__2__Impl_in_rule__FunctionDefinition__Group_3_2__29052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_102_in_rule__FunctionDefinition__Group_3_2__2__Impl9080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionBody__Group_0__0__Impl_in_rule__FunctionBody__Group_0__09117 = new BitSet(new long[]{0x00000C0000000000L});
    public static final BitSet FOLLOW_rule__FunctionBody__Group_0__1_in_rule__FunctionBody__Group_0__09120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCtorInitializer_in_rule__FunctionBody__Group_0__0__Impl9148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionBody__Group_0__1__Impl_in_rule__FunctionBody__Group_0__19179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompoundStatement_in_rule__FunctionBody__Group_0__1__Impl9206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OperatorFunctionId__Group__0__Impl_in_rule__OperatorFunctionId__Group__09239 = new BitSet(new long[]{0xFFB0000000000000L,0x000000001FFFFFFFL});
    public static final BitSet FOLLOW_rule__OperatorFunctionId__Group__1_in_rule__OperatorFunctionId__Group__09242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_103_in_rule__OperatorFunctionId__Group__0__Impl9270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OperatorFunctionId__Group__1__Impl_in_rule__OperatorFunctionId__Group__19301 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_rule__OperatorFunctionId__Group__2_in_rule__OperatorFunctionId__Group__19304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOverloadableOperator_in_rule__OperatorFunctionId__Group__1__Impl9331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OperatorFunctionId__Group__2__Impl_in_rule__OperatorFunctionId__Group__29360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OperatorFunctionId__Group_2__0_in_rule__OperatorFunctionId__Group__2__Impl9387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OperatorFunctionId__Group_2__0__Impl_in_rule__OperatorFunctionId__Group_2__09424 = new BitSet(new long[]{0x0040021800000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_rule__OperatorFunctionId__Group_2__1_in_rule__OperatorFunctionId__Group_2__09427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_rule__OperatorFunctionId__Group_2__0__Impl9455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OperatorFunctionId__Group_2__1__Impl_in_rule__OperatorFunctionId__Group_2__19486 = new BitSet(new long[]{0x0040021800000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_rule__OperatorFunctionId__Group_2__2_in_rule__OperatorFunctionId__Group_2__19489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OperatorFunctionId__Alternatives_2_1_in_rule__OperatorFunctionId__Group_2__1__Impl9516 = new BitSet(new long[]{0x0040021800000002L});
    public static final BitSet FOLLOW_rule__OperatorFunctionId__Group_2__2__Impl_in_rule__OperatorFunctionId__Group_2__29547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_rule__OperatorFunctionId__Group_2__2__Impl9575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OverloadableOperator__Group_2__0__Impl_in_rule__OverloadableOperator__Group_2__09612 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_rule__OverloadableOperator__Group_2__1_in_rule__OverloadableOperator__Group_2__09615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rule__OverloadableOperator__Group_2__0__Impl9643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OverloadableOperator__Group_2__1__Impl_in_rule__OverloadableOperator__Group_2__19674 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_rule__OverloadableOperator__Group_2__2_in_rule__OverloadableOperator__Group_2__19677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_rule__OverloadableOperator__Group_2__1__Impl9705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OverloadableOperator__Group_2__2__Impl_in_rule__OverloadableOperator__Group_2__29736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_98_in_rule__OverloadableOperator__Group_2__2__Impl9764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OverloadableOperator__Group_3__0__Impl_in_rule__OverloadableOperator__Group_3__09801 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_rule__OverloadableOperator__Group_3__1_in_rule__OverloadableOperator__Group_3__09804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_rule__OverloadableOperator__Group_3__0__Impl9832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OverloadableOperator__Group_3__1__Impl_in_rule__OverloadableOperator__Group_3__19863 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_rule__OverloadableOperator__Group_3__2_in_rule__OverloadableOperator__Group_3__19866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_rule__OverloadableOperator__Group_3__1__Impl9894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OverloadableOperator__Group_3__2__Impl_in_rule__OverloadableOperator__Group_3__29925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_98_in_rule__OverloadableOperator__Group_3__2__Impl9953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LiteralOperatorId__Group__0__Impl_in_rule__LiteralOperatorId__Group__09990 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_rule__LiteralOperatorId__Group__1_in_rule__LiteralOperatorId__Group__09993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_103_in_rule__LiteralOperatorId__Group__0__Impl10021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LiteralOperatorId__Group__1__Impl_in_rule__LiteralOperatorId__Group__110052 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_rule__LiteralOperatorId__Group__2_in_rule__LiteralOperatorId__Group__110055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_104_in_rule__LiteralOperatorId__Group__1__Impl10083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LiteralOperatorId__Group__2__Impl_in_rule__LiteralOperatorId__Group__210114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_104_in_rule__LiteralOperatorId__Group__2__Impl10142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemplateDeclaration__Group__0__Impl_in_rule__TemplateDeclaration__Group__010179 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_rule__TemplateDeclaration__Group__1_in_rule__TemplateDeclaration__Group__010182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_105_in_rule__TemplateDeclaration__Group__0__Impl10210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemplateDeclaration__Group__1__Impl_in_rule__TemplateDeclaration__Group__110241 = new BitSet(new long[]{0x0040002000000000L,0x0000000260000000L});
    public static final BitSet FOLLOW_rule__TemplateDeclaration__Group__2_in_rule__TemplateDeclaration__Group__110244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_rule__TemplateDeclaration__Group__1__Impl10272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemplateDeclaration__Group__2__Impl_in_rule__TemplateDeclaration__Group__210303 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TemplateDeclaration__Group__3_in_rule__TemplateDeclaration__Group__210306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplateParameterList_in_rule__TemplateDeclaration__Group__2__Impl10333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemplateDeclaration__Group__3__Impl_in_rule__TemplateDeclaration__Group__310362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_rule__TemplateDeclaration__Group__3__Impl10390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemplateParameterList__Group__0__Impl_in_rule__TemplateParameterList__Group__010429 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_rule__TemplateParameterList__Group__1_in_rule__TemplateParameterList__Group__010432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplateParameter_in_rule__TemplateParameterList__Group__0__Impl10459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemplateParameterList__Group__1__Impl_in_rule__TemplateParameterList__Group__110488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemplateParameterList__Group_1__0_in_rule__TemplateParameterList__Group__1__Impl10515 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
    public static final BitSet FOLLOW_rule__TemplateParameterList__Group_1__0__Impl_in_rule__TemplateParameterList__Group_1__010550 = new BitSet(new long[]{0x0040002000000000L,0x0000000260000000L});
    public static final BitSet FOLLOW_rule__TemplateParameterList__Group_1__1_in_rule__TemplateParameterList__Group_1__010553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_rule__TemplateParameterList__Group_1__0__Impl10581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemplateParameterList__Group_1__1__Impl_in_rule__TemplateParameterList__Group_1__110612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplateParameter_in_rule__TemplateParameterList__Group_1__1__Impl10639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group__0__Impl_in_rule__TypeParameter__Group__010672 = new BitSet(new long[]{0x0040000000000400L,0x0000000000000004L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group__1_in_rule__TypeParameter__Group__010675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeParameter__Alternatives_0_in_rule__TypeParameter__Group__0__Impl10702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group__1__Impl_in_rule__TypeParameter__Group__110732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeParameter__Alternatives_1_in_rule__TypeParameter__Group__1__Impl10759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_1_0__0__Impl_in_rule__TypeParameter__Group_1_0__010793 = new BitSet(new long[]{0x0040000000000400L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_1_0__1_in_rule__TypeParameter__Group_1_0__010796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rule__TypeParameter__Group_1_0__0__Impl10825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_1_0__1__Impl_in_rule__TypeParameter__Group_1_0__110858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TypeParameter__Group_1_0__1__Impl10886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_1_1__0__Impl_in_rule__TypeParameter__Group_1_1__010921 = new BitSet(new long[]{0x0040000000000400L,0x0000000000000004L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_1_1__1_in_rule__TypeParameter__Group_1_1__010924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TypeParameter__Group_1_1__0__Impl10952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_1_1__1__Impl_in_rule__TypeParameter__Group_1_1__110983 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_1_1__2_in_rule__TypeParameter__Group_1_1__110986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_rule__TypeParameter__Group_1_1__1__Impl11014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_1_1__2__Impl_in_rule__TypeParameter__Group_1_1__211045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeId_in_rule__TypeParameter__Group_1_1__2__Impl11072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemplateArgumentList__Group__0__Impl_in_rule__TemplateArgumentList__Group__011108 = new BitSet(new long[]{0x0040000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_rule__TemplateArgumentList__Group__1_in_rule__TemplateArgumentList__Group__011111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplateArgument_in_rule__TemplateArgumentList__Group__0__Impl11138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemplateArgumentList__Group__1__Impl_in_rule__TemplateArgumentList__Group__111167 = new BitSet(new long[]{0x0040000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_rule__TemplateArgumentList__Group__2_in_rule__TemplateArgumentList__Group__111170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rule__TemplateArgumentList__Group__1__Impl11199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemplateArgumentList__Group__2__Impl_in_rule__TemplateArgumentList__Group__211232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemplateArgumentList__Group_2__0_in_rule__TemplateArgumentList__Group__2__Impl11259 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
    public static final BitSet FOLLOW_rule__TemplateArgumentList__Group_2__0__Impl_in_rule__TemplateArgumentList__Group_2__011296 = new BitSet(new long[]{0x0040021800000000L});
    public static final BitSet FOLLOW_rule__TemplateArgumentList__Group_2__1_in_rule__TemplateArgumentList__Group_2__011299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_rule__TemplateArgumentList__Group_2__0__Impl11327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemplateArgumentList__Group_2__1__Impl_in_rule__TemplateArgumentList__Group_2__111358 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_rule__TemplateArgumentList__Group_2__2_in_rule__TemplateArgumentList__Group_2__111361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplateArgument_in_rule__TemplateArgumentList__Group_2__1__Impl11388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemplateArgumentList__Group_2__2__Impl_in_rule__TemplateArgumentList__Group_2__211417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rule__TemplateArgumentList__Group_2__2__Impl11446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionTryBlock__Group__0__Impl_in_rule__FunctionTryBlock__Group__011488 = new BitSet(new long[]{0x00000C0000000000L});
    public static final BitSet FOLLOW_rule__FunctionTryBlock__Group__1_in_rule__FunctionTryBlock__Group__011491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_106_in_rule__FunctionTryBlock__Group__0__Impl11519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionTryBlock__Group__1__Impl_in_rule__FunctionTryBlock__Group__111550 = new BitSet(new long[]{0x00000C0000000000L});
    public static final BitSet FOLLOW_rule__FunctionTryBlock__Group__2_in_rule__FunctionTryBlock__Group__111553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCtorInitializer_in_rule__FunctionTryBlock__Group__1__Impl11581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionTryBlock__Group__2__Impl_in_rule__FunctionTryBlock__Group__211612 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_rule__FunctionTryBlock__Group__3_in_rule__FunctionTryBlock__Group__211615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompoundStatement_in_rule__FunctionTryBlock__Group__2__Impl11642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionTryBlock__Group__3__Impl_in_rule__FunctionTryBlock__Group__311671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHandler_in_rule__FunctionTryBlock__Group__3__Impl11701 = new BitSet(new long[]{0x0000000000000002L,0x0000080000000000L});
    public static final BitSet FOLLOW_ruleHandler_in_rule__FunctionTryBlock__Group__3__Impl11714 = new BitSet(new long[]{0x0000000000000002L,0x0000080000000000L});
    public static final BitSet FOLLOW_rule__Handler__Group__0__Impl_in_rule__Handler__Group__011755 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_rule__Handler__Group__1_in_rule__Handler__Group__011758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_107_in_rule__Handler__Group__0__Impl11786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Handler__Group__1__Impl_in_rule__Handler__Group__111817 = new BitSet(new long[]{0x0040020000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Handler__Group__2_in_rule__Handler__Group__111820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_99_in_rule__Handler__Group__1__Impl11848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Handler__Group__2__Impl_in_rule__Handler__Group__211879 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_rule__Handler__Group__3_in_rule__Handler__Group__211882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExceptionDeclaration_in_rule__Handler__Group__2__Impl11909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Handler__Group__3__Impl_in_rule__Handler__Group__311938 = new BitSet(new long[]{0x00000C0000000000L});
    public static final BitSet FOLLOW_rule__Handler__Group__4_in_rule__Handler__Group__311941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_100_in_rule__Handler__Group__3__Impl11969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Handler__Group__4__Impl_in_rule__Handler__Group__412000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompoundStatement_in_rule__Handler__Group__4__Impl12027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExceptionDeclaration__Group_0__0__Impl_in_rule__ExceptionDeclaration__Group_0__012066 = new BitSet(new long[]{0x0000020000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_rule__ExceptionDeclaration__Group_0__1_in_rule__ExceptionDeclaration__Group_0__012069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeSpecifier_in_rule__ExceptionDeclaration__Group_0__0__Impl12097 = new BitSet(new long[]{0x0000000000000002L,0x0000000200000000L});
    public static final BitSet FOLLOW_rule__ExceptionDeclaration__Group_0__1__Impl_in_rule__ExceptionDeclaration__Group_0__112128 = new BitSet(new long[]{0x0040409000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_rule__ExceptionDeclaration__Group_0__2_in_rule__ExceptionDeclaration__Group_0__112131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeSpecifier_in_rule__ExceptionDeclaration__Group_0__1__Impl12161 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_ruleTypeSpecifier_in_rule__ExceptionDeclaration__Group_0__1__Impl12174 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_rule__ExceptionDeclaration__Group_0__2__Impl_in_rule__ExceptionDeclaration__Group_0__212207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclarator_in_rule__ExceptionDeclaration__Group_0__2__Impl12235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DynamicExceptionSpecification__Group__0__Impl_in_rule__DynamicExceptionSpecification__Group__012273 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_rule__DynamicExceptionSpecification__Group__1_in_rule__DynamicExceptionSpecification__Group__012276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_108_in_rule__DynamicExceptionSpecification__Group__0__Impl12304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DynamicExceptionSpecification__Group__1__Impl_in_rule__DynamicExceptionSpecification__Group__112335 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__DynamicExceptionSpecification__Group__2_in_rule__DynamicExceptionSpecification__Group__112338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_99_in_rule__DynamicExceptionSpecification__Group__1__Impl12366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DynamicExceptionSpecification__Group__2__Impl_in_rule__DynamicExceptionSpecification__Group__212397 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_rule__DynamicExceptionSpecification__Group__3_in_rule__DynamicExceptionSpecification__Group__212400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeIdList_in_rule__DynamicExceptionSpecification__Group__2__Impl12427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DynamicExceptionSpecification__Group__3__Impl_in_rule__DynamicExceptionSpecification__Group__312456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_100_in_rule__DynamicExceptionSpecification__Group__3__Impl12484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NoexceptSpecification__Group__0__Impl_in_rule__NoexceptSpecification__Group__012523 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_rule__NoexceptSpecification__Group__1_in_rule__NoexceptSpecification__Group__012526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_109_in_rule__NoexceptSpecification__Group__0__Impl12554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NoexceptSpecification__Group__1__Impl_in_rule__NoexceptSpecification__Group__112585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NoexceptSpecification__Group_1__0_in_rule__NoexceptSpecification__Group__1__Impl12612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NoexceptSpecification__Group_1__0__Impl_in_rule__NoexceptSpecification__Group_1__012647 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__NoexceptSpecification__Group_1__1_in_rule__NoexceptSpecification__Group_1__012650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_99_in_rule__NoexceptSpecification__Group_1__0__Impl12678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NoexceptSpecification__Group_1__1__Impl_in_rule__NoexceptSpecification__Group_1__112709 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_rule__NoexceptSpecification__Group_1__2_in_rule__NoexceptSpecification__Group_1__112712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantExpression_in_rule__NoexceptSpecification__Group_1__1__Impl12739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NoexceptSpecification__Group_1__2__Impl_in_rule__NoexceptSpecification__Group_1__212768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_100_in_rule__NoexceptSpecification__Group_1__2__Impl12796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionDefinition_in_rule__Test__ElementsAssignment12838 = new BitSet(new long[]{0x0000000000000002L});

}