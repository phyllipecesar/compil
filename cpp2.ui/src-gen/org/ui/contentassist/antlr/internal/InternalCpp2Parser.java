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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_KEYWORD", "RULE_INT", "RULE_CHARACTER_LITERAL", "RULE_FLOATING_LITERAL", "RULE_STRING_LITERAL", "RULE_PREPROCESSING_OP_OR_PUNC", "RULE_ID", "RULE_HEXADECIMAL_DIGIT", "RULE_HEX_QUAD", "RULE_UNIVERSAL_CHARACTER_NAME", "RULE_H_CHAR", "RULE_Q_CHAR", "RULE_HEADER_NAME", "RULE_NONDIGIT", "RULE_DIGIT", "RULE_DECIMAL_LITERAL", "RULE_OCTAL_LITERAL", "RULE_HEXADECIMAL_LITERAL", "RULE_INTEGER_SUFFIX", "RULE_OCTAL_DIGIT", "RULE_C_CHAR", "RULE_ESCAPE_SEQUENCE", "RULE_SIMPLE_ESCAPE_SEQUENCE", "RULE_OCTAL_ESCAPE_SEQUENCE", "RULE_HEXADECIMAL_ESCAPE_SEQUENCE", "RULE_FRACTIONAL_CONSTANT", "RULE_EXPONENT_PART", "RULE_ENC_PREFIX", "RULE_SCHAR", "RULE_PP_NUMBER", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'ConstantExpression'", "'TypeId'", "'IdExpression'", "'ParameterDeclaration'", "'Declaration'", "'NestedNameSpecifier'", "'AssignmentExpression'", "'AlignmentExpression'", "'TypeSpecifier'", "'AbstractDeclarator'", "'CompoundStatement'", "'CtorInitializer'", "'TypeIdList'", "'UnqualifiedId'", "'ParameterDeclarationClause'", "'TrailingTypeSpecifier'", "'ClassName'", "'Initializer'", "'true'", "'false'", "'const'", "'volatile'", "'&'", "'&&'", "'new'", "'delete'", "'+'", "'-'", "'*'", "'/'", "'%'", "'^'", "'|'", "'~'", "'!'", "'='", "'<'", "'>'", "'+='", "'-='", "'*='", "'/='", "'%='", "'^='", "'&='", "'|='", "'<<'", "'>>'", "'>>='", "'<<='", "'=='", "'!='", "'<='", "'>='", "'||'", "'++'", "'--'", "','", "'->*'", "'->'", "'()'", "'[]'", "'...'", "'nullptr'", "'::'", "'['", "']'", "'alignas'", "'('", "')'", "'operator'", "'\"'", "'class'", "'typename'", "'template'", "'catch'", "'throw'", "'noexcept'"
    };
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
    public static final int T__113=113;
    public static final int RULE_INT=5;
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
    public static final int RULE_PP_NUMBER=33;
    public static final int T__102=102;
    public static final int T__101=101;
    public static final int T__100=100;
    public static final int RULE_PREPROCESSING_OP_OR_PUNC=9;
    public static final int RULE_SL_COMMENT=36;
    public static final int RULE_HEXADECIMAL_DIGIT=11;
    public static final int T__39=39;
    public static final int RULE_UNIVERSAL_CHARACTER_NAME=13;
    public static final int RULE_WS=37;

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

                if ( ((LA1_0>=RULE_KEYWORD && LA1_0<=RULE_PREPROCESSING_OP_OR_PUNC)||(LA1_0>=57 && LA1_0<=58)) ) {
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


    // $ANTLR start "entryRuleNamespaceBody"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:148:1: entryRuleNamespaceBody : ruleNamespaceBody EOF ;
    public final void entryRuleNamespaceBody() throws RecognitionException {
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:149:1: ( ruleNamespaceBody EOF )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:150:1: ruleNamespaceBody EOF
            {
             before(grammarAccess.getNamespaceBodyRule()); 
            pushFollow(FOLLOW_ruleNamespaceBody_in_entryRuleNamespaceBody246);
            ruleNamespaceBody();

            state._fsp--;

             after(grammarAccess.getNamespaceBodyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNamespaceBody253); 

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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:157:1: ruleNamespaceBody : ( ( ruleDeclaration )* ) ;
    public final void ruleNamespaceBody() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:161:2: ( ( ( ruleDeclaration )* ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:162:1: ( ( ruleDeclaration )* )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:162:1: ( ( ruleDeclaration )* )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:163:1: ( ruleDeclaration )*
            {
             before(grammarAccess.getNamespaceBodyAccess().getDeclarationParserRuleCall()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:164:1: ( ruleDeclaration )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==43) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:164:3: ruleDeclaration
            	    {
            	    pushFollow(FOLLOW_ruleDeclaration_in_ruleNamespaceBody280);
            	    ruleDeclaration();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:178:1: entryRuleQualifiedNamespaceSpecifier : ruleQualifiedNamespaceSpecifier EOF ;
    public final void entryRuleQualifiedNamespaceSpecifier() throws RecognitionException {
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:179:1: ( ruleQualifiedNamespaceSpecifier EOF )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:180:1: ruleQualifiedNamespaceSpecifier EOF
            {
             before(grammarAccess.getQualifiedNamespaceSpecifierRule()); 
            pushFollow(FOLLOW_ruleQualifiedNamespaceSpecifier_in_entryRuleQualifiedNamespaceSpecifier310);
            ruleQualifiedNamespaceSpecifier();

            state._fsp--;

             after(grammarAccess.getQualifiedNamespaceSpecifierRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNamespaceSpecifier317); 

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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:187:1: ruleQualifiedNamespaceSpecifier : ( ( rule__QualifiedNamespaceSpecifier__Group__0 ) ) ;
    public final void ruleQualifiedNamespaceSpecifier() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:191:2: ( ( ( rule__QualifiedNamespaceSpecifier__Group__0 ) ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:192:1: ( ( rule__QualifiedNamespaceSpecifier__Group__0 ) )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:192:1: ( ( rule__QualifiedNamespaceSpecifier__Group__0 ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:193:1: ( rule__QualifiedNamespaceSpecifier__Group__0 )
            {
             before(grammarAccess.getQualifiedNamespaceSpecifierAccess().getGroup()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:194:1: ( rule__QualifiedNamespaceSpecifier__Group__0 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:194:2: rule__QualifiedNamespaceSpecifier__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedNamespaceSpecifier__Group__0_in_ruleQualifiedNamespaceSpecifier343);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:214:1: entryRuleAttributeSpecifier : ruleAttributeSpecifier EOF ;
    public final void entryRuleAttributeSpecifier() throws RecognitionException {
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:215:1: ( ruleAttributeSpecifier EOF )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:216:1: ruleAttributeSpecifier EOF
            {
             before(grammarAccess.getAttributeSpecifierRule()); 
            pushFollow(FOLLOW_ruleAttributeSpecifier_in_entryRuleAttributeSpecifier378);
            ruleAttributeSpecifier();

            state._fsp--;

             after(grammarAccess.getAttributeSpecifierRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributeSpecifier385); 

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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:223:1: ruleAttributeSpecifier : ( ( rule__AttributeSpecifier__Alternatives ) ) ;
    public final void ruleAttributeSpecifier() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:227:2: ( ( ( rule__AttributeSpecifier__Alternatives ) ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:228:1: ( ( rule__AttributeSpecifier__Alternatives ) )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:228:1: ( ( rule__AttributeSpecifier__Alternatives ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:229:1: ( rule__AttributeSpecifier__Alternatives )
            {
             before(grammarAccess.getAttributeSpecifierAccess().getAlternatives()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:230:1: ( rule__AttributeSpecifier__Alternatives )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:230:2: rule__AttributeSpecifier__Alternatives
            {
            pushFollow(FOLLOW_rule__AttributeSpecifier__Alternatives_in_ruleAttributeSpecifier411);
            rule__AttributeSpecifier__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAttributeSpecifierAccess().getAlternatives()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleAlignmentSpecifier"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:242:1: entryRuleAlignmentSpecifier : ruleAlignmentSpecifier EOF ;
    public final void entryRuleAlignmentSpecifier() throws RecognitionException {
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:243:1: ( ruleAlignmentSpecifier EOF )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:244:1: ruleAlignmentSpecifier EOF
            {
             before(grammarAccess.getAlignmentSpecifierRule()); 
            pushFollow(FOLLOW_ruleAlignmentSpecifier_in_entryRuleAlignmentSpecifier438);
            ruleAlignmentSpecifier();

            state._fsp--;

             after(grammarAccess.getAlignmentSpecifierRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAlignmentSpecifier445); 

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
    // $ANTLR end "entryRuleAlignmentSpecifier"


    // $ANTLR start "ruleAlignmentSpecifier"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:251:1: ruleAlignmentSpecifier : ( ( rule__AlignmentSpecifier__Alternatives ) ) ;
    public final void ruleAlignmentSpecifier() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:255:2: ( ( ( rule__AlignmentSpecifier__Alternatives ) ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:256:1: ( ( rule__AlignmentSpecifier__Alternatives ) )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:256:1: ( ( rule__AlignmentSpecifier__Alternatives ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:257:1: ( rule__AlignmentSpecifier__Alternatives )
            {
             before(grammarAccess.getAlignmentSpecifierAccess().getAlternatives()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:258:1: ( rule__AlignmentSpecifier__Alternatives )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:258:2: rule__AlignmentSpecifier__Alternatives
            {
            pushFollow(FOLLOW_rule__AlignmentSpecifier__Alternatives_in_ruleAlignmentSpecifier471);
            rule__AlignmentSpecifier__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAlignmentSpecifierAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAlignmentSpecifier"


    // $ANTLR start "entryRuleAttributeList"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:270:1: entryRuleAttributeList : ruleAttributeList EOF ;
    public final void entryRuleAttributeList() throws RecognitionException {
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:271:1: ( ruleAttributeList EOF )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:272:1: ruleAttributeList EOF
            {
             before(grammarAccess.getAttributeListRule()); 
            pushFollow(FOLLOW_ruleAttributeList_in_entryRuleAttributeList498);
            ruleAttributeList();

            state._fsp--;

             after(grammarAccess.getAttributeListRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributeList505); 

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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:279:1: ruleAttributeList : ( ( rule__AttributeList__Group__0 ) ) ;
    public final void ruleAttributeList() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:283:2: ( ( ( rule__AttributeList__Group__0 ) ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:284:1: ( ( rule__AttributeList__Group__0 ) )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:284:1: ( ( rule__AttributeList__Group__0 ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:285:1: ( rule__AttributeList__Group__0 )
            {
             before(grammarAccess.getAttributeListAccess().getGroup()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:286:1: ( rule__AttributeList__Group__0 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:286:2: rule__AttributeList__Group__0
            {
            pushFollow(FOLLOW_rule__AttributeList__Group__0_in_ruleAttributeList531);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:298:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:299:1: ( ruleAttribute EOF )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:300:1: ruleAttribute EOF
            {
             before(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute558);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute565); 

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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:307:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:311:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:312:1: ( ( rule__Attribute__Group__0 ) )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:312:1: ( ( rule__Attribute__Group__0 ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:313:1: ( rule__Attribute__Group__0 )
            {
             before(grammarAccess.getAttributeAccess().getGroup()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:314:1: ( rule__Attribute__Group__0 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:314:2: rule__Attribute__Group__0
            {
            pushFollow(FOLLOW_rule__Attribute__Group__0_in_ruleAttribute591);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:326:1: entryRuleAttributeToken : ruleAttributeToken EOF ;
    public final void entryRuleAttributeToken() throws RecognitionException {
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:327:1: ( ruleAttributeToken EOF )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:328:1: ruleAttributeToken EOF
            {
             before(grammarAccess.getAttributeTokenRule()); 
            pushFollow(FOLLOW_ruleAttributeToken_in_entryRuleAttributeToken618);
            ruleAttributeToken();

            state._fsp--;

             after(grammarAccess.getAttributeTokenRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributeToken625); 

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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:335:1: ruleAttributeToken : ( ( rule__AttributeToken__Group__0 ) ) ;
    public final void ruleAttributeToken() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:339:2: ( ( ( rule__AttributeToken__Group__0 ) ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:340:1: ( ( rule__AttributeToken__Group__0 ) )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:340:1: ( ( rule__AttributeToken__Group__0 ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:341:1: ( rule__AttributeToken__Group__0 )
            {
             before(grammarAccess.getAttributeTokenAccess().getGroup()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:342:1: ( rule__AttributeToken__Group__0 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:342:2: rule__AttributeToken__Group__0
            {
            pushFollow(FOLLOW_rule__AttributeToken__Group__0_in_ruleAttributeToken651);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:354:1: entryRuleAttributeArgumentClause : ruleAttributeArgumentClause EOF ;
    public final void entryRuleAttributeArgumentClause() throws RecognitionException {
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:355:1: ( ruleAttributeArgumentClause EOF )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:356:1: ruleAttributeArgumentClause EOF
            {
             before(grammarAccess.getAttributeArgumentClauseRule()); 
            pushFollow(FOLLOW_ruleAttributeArgumentClause_in_entryRuleAttributeArgumentClause678);
            ruleAttributeArgumentClause();

            state._fsp--;

             after(grammarAccess.getAttributeArgumentClauseRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributeArgumentClause685); 

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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:363:1: ruleAttributeArgumentClause : ( ( rule__AttributeArgumentClause__Group__0 ) ) ;
    public final void ruleAttributeArgumentClause() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:367:2: ( ( ( rule__AttributeArgumentClause__Group__0 ) ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:368:1: ( ( rule__AttributeArgumentClause__Group__0 ) )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:368:1: ( ( rule__AttributeArgumentClause__Group__0 ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:369:1: ( rule__AttributeArgumentClause__Group__0 )
            {
             before(grammarAccess.getAttributeArgumentClauseAccess().getGroup()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:370:1: ( rule__AttributeArgumentClause__Group__0 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:370:2: rule__AttributeArgumentClause__Group__0
            {
            pushFollow(FOLLOW_rule__AttributeArgumentClause__Group__0_in_ruleAttributeArgumentClause711);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:384:1: entryRuleInitDeclarator : ruleInitDeclarator EOF ;
    public final void entryRuleInitDeclarator() throws RecognitionException {
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:385:1: ( ruleInitDeclarator EOF )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:386:1: ruleInitDeclarator EOF
            {
             before(grammarAccess.getInitDeclaratorRule()); 
            pushFollow(FOLLOW_ruleInitDeclarator_in_entryRuleInitDeclarator740);
            ruleInitDeclarator();

            state._fsp--;

             after(grammarAccess.getInitDeclaratorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInitDeclarator747); 

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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:393:1: ruleInitDeclarator : ( ( rule__InitDeclarator__Group__0 ) ) ;
    public final void ruleInitDeclarator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:397:2: ( ( ( rule__InitDeclarator__Group__0 ) ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:398:1: ( ( rule__InitDeclarator__Group__0 ) )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:398:1: ( ( rule__InitDeclarator__Group__0 ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:399:1: ( rule__InitDeclarator__Group__0 )
            {
             before(grammarAccess.getInitDeclaratorAccess().getGroup()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:400:1: ( rule__InitDeclarator__Group__0 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:400:2: rule__InitDeclarator__Group__0
            {
            pushFollow(FOLLOW_rule__InitDeclarator__Group__0_in_ruleInitDeclarator773);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:412:1: entryRuleDeclarator : ruleDeclarator EOF ;
    public final void entryRuleDeclarator() throws RecognitionException {
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:413:1: ( ruleDeclarator EOF )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:414:1: ruleDeclarator EOF
            {
             before(grammarAccess.getDeclaratorRule()); 
            pushFollow(FOLLOW_ruleDeclarator_in_entryRuleDeclarator800);
            ruleDeclarator();

            state._fsp--;

             after(grammarAccess.getDeclaratorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeclarator807); 

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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:421:1: ruleDeclarator : ( ( rule__Declarator__Alternatives ) ) ;
    public final void ruleDeclarator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:425:2: ( ( ( rule__Declarator__Alternatives ) ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:426:1: ( ( rule__Declarator__Alternatives ) )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:426:1: ( ( rule__Declarator__Alternatives ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:427:1: ( rule__Declarator__Alternatives )
            {
             before(grammarAccess.getDeclaratorAccess().getAlternatives()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:428:1: ( rule__Declarator__Alternatives )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:428:2: rule__Declarator__Alternatives
            {
            pushFollow(FOLLOW_rule__Declarator__Alternatives_in_ruleDeclarator833);
            rule__Declarator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDeclaratorAccess().getAlternatives()); 

            }


            }

        }
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


    // $ANTLR start "entryRulePtrDeclarator"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:440:1: entryRulePtrDeclarator : rulePtrDeclarator EOF ;
    public final void entryRulePtrDeclarator() throws RecognitionException {
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:441:1: ( rulePtrDeclarator EOF )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:442:1: rulePtrDeclarator EOF
            {
             before(grammarAccess.getPtrDeclaratorRule()); 
            pushFollow(FOLLOW_rulePtrDeclarator_in_entryRulePtrDeclarator860);
            rulePtrDeclarator();

            state._fsp--;

             after(grammarAccess.getPtrDeclaratorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePtrDeclarator867); 

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
    // $ANTLR end "entryRulePtrDeclarator"


    // $ANTLR start "rulePtrDeclarator"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:449:1: rulePtrDeclarator : ( ( rule__PtrDeclarator__Group__0 ) ) ;
    public final void rulePtrDeclarator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:453:2: ( ( ( rule__PtrDeclarator__Group__0 ) ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:454:1: ( ( rule__PtrDeclarator__Group__0 ) )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:454:1: ( ( rule__PtrDeclarator__Group__0 ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:455:1: ( rule__PtrDeclarator__Group__0 )
            {
             before(grammarAccess.getPtrDeclaratorAccess().getGroup()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:456:1: ( rule__PtrDeclarator__Group__0 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:456:2: rule__PtrDeclarator__Group__0
            {
            pushFollow(FOLLOW_rule__PtrDeclarator__Group__0_in_rulePtrDeclarator893);
            rule__PtrDeclarator__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPtrDeclaratorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePtrDeclarator"


    // $ANTLR start "entryRuleNoptrDeclarator"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:468:1: entryRuleNoptrDeclarator : ruleNoptrDeclarator EOF ;
    public final void entryRuleNoptrDeclarator() throws RecognitionException {
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:469:1: ( ruleNoptrDeclarator EOF )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:470:1: ruleNoptrDeclarator EOF
            {
             before(grammarAccess.getNoptrDeclaratorRule()); 
            pushFollow(FOLLOW_ruleNoptrDeclarator_in_entryRuleNoptrDeclarator920);
            ruleNoptrDeclarator();

            state._fsp--;

             after(grammarAccess.getNoptrDeclaratorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNoptrDeclarator927); 

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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:477:1: ruleNoptrDeclarator : ( ( rule__NoptrDeclarator__Group__0 ) ) ;
    public final void ruleNoptrDeclarator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:481:2: ( ( ( rule__NoptrDeclarator__Group__0 ) ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:482:1: ( ( rule__NoptrDeclarator__Group__0 ) )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:482:1: ( ( rule__NoptrDeclarator__Group__0 ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:483:1: ( rule__NoptrDeclarator__Group__0 )
            {
             before(grammarAccess.getNoptrDeclaratorAccess().getGroup()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:484:1: ( rule__NoptrDeclarator__Group__0 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:484:2: rule__NoptrDeclarator__Group__0
            {
            pushFollow(FOLLOW_rule__NoptrDeclarator__Group__0_in_ruleNoptrDeclarator953);
            rule__NoptrDeclarator__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNoptrDeclaratorAccess().getGroup()); 

            }


            }

        }
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


    // $ANTLR start "entryRule_NoptrDeclarator"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:496:1: entryRule_NoptrDeclarator : rule_NoptrDeclarator EOF ;
    public final void entryRule_NoptrDeclarator() throws RecognitionException {
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:497:1: ( rule_NoptrDeclarator EOF )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:498:1: rule_NoptrDeclarator EOF
            {
             before(grammarAccess.get_NoptrDeclaratorRule()); 
            pushFollow(FOLLOW_rule_NoptrDeclarator_in_entryRule_NoptrDeclarator980);
            rule_NoptrDeclarator();

            state._fsp--;

             after(grammarAccess.get_NoptrDeclaratorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRule_NoptrDeclarator987); 

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
    // $ANTLR end "entryRule_NoptrDeclarator"


    // $ANTLR start "rule_NoptrDeclarator"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:505:1: rule_NoptrDeclarator : ( ( rule___NoptrDeclarator__Alternatives ) ) ;
    public final void rule_NoptrDeclarator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:509:2: ( ( ( rule___NoptrDeclarator__Alternatives ) ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:510:1: ( ( rule___NoptrDeclarator__Alternatives ) )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:510:1: ( ( rule___NoptrDeclarator__Alternatives ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:511:1: ( rule___NoptrDeclarator__Alternatives )
            {
             before(grammarAccess.get_NoptrDeclaratorAccess().getAlternatives()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:512:1: ( rule___NoptrDeclarator__Alternatives )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:512:2: rule___NoptrDeclarator__Alternatives
            {
            pushFollow(FOLLOW_rule___NoptrDeclarator__Alternatives_in_rule_NoptrDeclarator1013);
            rule___NoptrDeclarator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.get_NoptrDeclaratorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule_NoptrDeclarator"


    // $ANTLR start "entryRule__NoptrDeclarator"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:524:1: entryRule__NoptrDeclarator : rule__NoptrDeclarator EOF ;
    public final void entryRule__NoptrDeclarator() throws RecognitionException {
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:525:1: ( rule__NoptrDeclarator EOF )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:526:1: rule__NoptrDeclarator EOF
            {
             before(grammarAccess.get__NoptrDeclaratorRule()); 
            pushFollow(FOLLOW_rule__NoptrDeclarator_in_entryRule__NoptrDeclarator1040);
            rule__NoptrDeclarator();

            state._fsp--;

             after(grammarAccess.get__NoptrDeclaratorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRule__NoptrDeclarator1047); 

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
    // $ANTLR end "entryRule__NoptrDeclarator"


    // $ANTLR start "rule__NoptrDeclarator"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:533:1: rule__NoptrDeclarator : ( ( rule____NoptrDeclarator__Alternatives ) ) ;
    public final void rule__NoptrDeclarator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:537:2: ( ( ( rule____NoptrDeclarator__Alternatives ) ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:538:1: ( ( rule____NoptrDeclarator__Alternatives ) )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:538:1: ( ( rule____NoptrDeclarator__Alternatives ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:539:1: ( rule____NoptrDeclarator__Alternatives )
            {
             before(grammarAccess.get__NoptrDeclaratorAccess().getAlternatives()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:540:1: ( rule____NoptrDeclarator__Alternatives )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:540:2: rule____NoptrDeclarator__Alternatives
            {
            pushFollow(FOLLOW_rule____NoptrDeclarator__Alternatives_in_rule__NoptrDeclarator1073);
            rule____NoptrDeclarator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.get__NoptrDeclaratorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NoptrDeclarator"


    // $ANTLR start "entryRuleParametersAndQualifiers"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:552:1: entryRuleParametersAndQualifiers : ruleParametersAndQualifiers EOF ;
    public final void entryRuleParametersAndQualifiers() throws RecognitionException {
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:553:1: ( ruleParametersAndQualifiers EOF )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:554:1: ruleParametersAndQualifiers EOF
            {
             before(grammarAccess.getParametersAndQualifiersRule()); 
            pushFollow(FOLLOW_ruleParametersAndQualifiers_in_entryRuleParametersAndQualifiers1100);
            ruleParametersAndQualifiers();

            state._fsp--;

             after(grammarAccess.getParametersAndQualifiersRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParametersAndQualifiers1107); 

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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:561:1: ruleParametersAndQualifiers : ( ( rule__ParametersAndQualifiers__Group__0 ) ) ;
    public final void ruleParametersAndQualifiers() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:565:2: ( ( ( rule__ParametersAndQualifiers__Group__0 ) ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:566:1: ( ( rule__ParametersAndQualifiers__Group__0 ) )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:566:1: ( ( rule__ParametersAndQualifiers__Group__0 ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:567:1: ( rule__ParametersAndQualifiers__Group__0 )
            {
             before(grammarAccess.getParametersAndQualifiersAccess().getGroup()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:568:1: ( rule__ParametersAndQualifiers__Group__0 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:568:2: rule__ParametersAndQualifiers__Group__0
            {
            pushFollow(FOLLOW_rule__ParametersAndQualifiers__Group__0_in_ruleParametersAndQualifiers1133);
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


    // $ANTLR start "entryRuleTrailingReturnType"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:580:1: entryRuleTrailingReturnType : ruleTrailingReturnType EOF ;
    public final void entryRuleTrailingReturnType() throws RecognitionException {
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:581:1: ( ruleTrailingReturnType EOF )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:582:1: ruleTrailingReturnType EOF
            {
             before(grammarAccess.getTrailingReturnTypeRule()); 
            pushFollow(FOLLOW_ruleTrailingReturnType_in_entryRuleTrailingReturnType1160);
            ruleTrailingReturnType();

            state._fsp--;

             after(grammarAccess.getTrailingReturnTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTrailingReturnType1167); 

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
    // $ANTLR end "entryRuleTrailingReturnType"


    // $ANTLR start "ruleTrailingReturnType"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:589:1: ruleTrailingReturnType : ( ( rule__TrailingReturnType__Group__0 ) ) ;
    public final void ruleTrailingReturnType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:593:2: ( ( ( rule__TrailingReturnType__Group__0 ) ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:594:1: ( ( rule__TrailingReturnType__Group__0 ) )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:594:1: ( ( rule__TrailingReturnType__Group__0 ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:595:1: ( rule__TrailingReturnType__Group__0 )
            {
             before(grammarAccess.getTrailingReturnTypeAccess().getGroup()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:596:1: ( rule__TrailingReturnType__Group__0 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:596:2: rule__TrailingReturnType__Group__0
            {
            pushFollow(FOLLOW_rule__TrailingReturnType__Group__0_in_ruleTrailingReturnType1193);
            rule__TrailingReturnType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTrailingReturnTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTrailingReturnType"


    // $ANTLR start "entryRulePtrOperator"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:608:1: entryRulePtrOperator : rulePtrOperator EOF ;
    public final void entryRulePtrOperator() throws RecognitionException {
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:609:1: ( rulePtrOperator EOF )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:610:1: rulePtrOperator EOF
            {
             before(grammarAccess.getPtrOperatorRule()); 
            pushFollow(FOLLOW_rulePtrOperator_in_entryRulePtrOperator1220);
            rulePtrOperator();

            state._fsp--;

             after(grammarAccess.getPtrOperatorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePtrOperator1227); 

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
    // $ANTLR end "entryRulePtrOperator"


    // $ANTLR start "rulePtrOperator"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:617:1: rulePtrOperator : ( ( rule__PtrOperator__Alternatives ) ) ;
    public final void rulePtrOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:621:2: ( ( ( rule__PtrOperator__Alternatives ) ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:622:1: ( ( rule__PtrOperator__Alternatives ) )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:622:1: ( ( rule__PtrOperator__Alternatives ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:623:1: ( rule__PtrOperator__Alternatives )
            {
             before(grammarAccess.getPtrOperatorAccess().getAlternatives()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:624:1: ( rule__PtrOperator__Alternatives )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:624:2: rule__PtrOperator__Alternatives
            {
            pushFollow(FOLLOW_rule__PtrOperator__Alternatives_in_rulePtrOperator1253);
            rule__PtrOperator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPtrOperatorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePtrOperator"


    // $ANTLR start "entryRuleDeclaratorId"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:636:1: entryRuleDeclaratorId : ruleDeclaratorId EOF ;
    public final void entryRuleDeclaratorId() throws RecognitionException {
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:637:1: ( ruleDeclaratorId EOF )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:638:1: ruleDeclaratorId EOF
            {
             before(grammarAccess.getDeclaratorIdRule()); 
            pushFollow(FOLLOW_ruleDeclaratorId_in_entryRuleDeclaratorId1280);
            ruleDeclaratorId();

            state._fsp--;

             after(grammarAccess.getDeclaratorIdRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeclaratorId1287); 

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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:645:1: ruleDeclaratorId : ( ( rule__DeclaratorId__Alternatives ) ) ;
    public final void ruleDeclaratorId() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:649:2: ( ( ( rule__DeclaratorId__Alternatives ) ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:650:1: ( ( rule__DeclaratorId__Alternatives ) )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:650:1: ( ( rule__DeclaratorId__Alternatives ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:651:1: ( rule__DeclaratorId__Alternatives )
            {
             before(grammarAccess.getDeclaratorIdAccess().getAlternatives()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:652:1: ( rule__DeclaratorId__Alternatives )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:652:2: rule__DeclaratorId__Alternatives
            {
            pushFollow(FOLLOW_rule__DeclaratorId__Alternatives_in_ruleDeclaratorId1313);
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


    // $ANTLR start "entryRuleOperatorFunctionId"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:664:1: entryRuleOperatorFunctionId : ruleOperatorFunctionId EOF ;
    public final void entryRuleOperatorFunctionId() throws RecognitionException {
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:665:1: ( ruleOperatorFunctionId EOF )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:666:1: ruleOperatorFunctionId EOF
            {
             before(grammarAccess.getOperatorFunctionIdRule()); 
            pushFollow(FOLLOW_ruleOperatorFunctionId_in_entryRuleOperatorFunctionId1340);
            ruleOperatorFunctionId();

            state._fsp--;

             after(grammarAccess.getOperatorFunctionIdRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOperatorFunctionId1347); 

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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:673:1: ruleOperatorFunctionId : ( ( rule__OperatorFunctionId__Group__0 ) ) ;
    public final void ruleOperatorFunctionId() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:677:2: ( ( ( rule__OperatorFunctionId__Group__0 ) ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:678:1: ( ( rule__OperatorFunctionId__Group__0 ) )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:678:1: ( ( rule__OperatorFunctionId__Group__0 ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:679:1: ( rule__OperatorFunctionId__Group__0 )
            {
             before(grammarAccess.getOperatorFunctionIdAccess().getGroup()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:680:1: ( rule__OperatorFunctionId__Group__0 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:680:2: rule__OperatorFunctionId__Group__0
            {
            pushFollow(FOLLOW_rule__OperatorFunctionId__Group__0_in_ruleOperatorFunctionId1373);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:692:1: entryRuleOverloadableOperator : ruleOverloadableOperator EOF ;
    public final void entryRuleOverloadableOperator() throws RecognitionException {
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:693:1: ( ruleOverloadableOperator EOF )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:694:1: ruleOverloadableOperator EOF
            {
             before(grammarAccess.getOverloadableOperatorRule()); 
            pushFollow(FOLLOW_ruleOverloadableOperator_in_entryRuleOverloadableOperator1400);
            ruleOverloadableOperator();

            state._fsp--;

             after(grammarAccess.getOverloadableOperatorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOverloadableOperator1407); 

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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:701:1: ruleOverloadableOperator : ( ( rule__OverloadableOperator__Alternatives ) ) ;
    public final void ruleOverloadableOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:705:2: ( ( ( rule__OverloadableOperator__Alternatives ) ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:706:1: ( ( rule__OverloadableOperator__Alternatives ) )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:706:1: ( ( rule__OverloadableOperator__Alternatives ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:707:1: ( rule__OverloadableOperator__Alternatives )
            {
             before(grammarAccess.getOverloadableOperatorAccess().getAlternatives()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:708:1: ( rule__OverloadableOperator__Alternatives )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:708:2: rule__OverloadableOperator__Alternatives
            {
            pushFollow(FOLLOW_rule__OverloadableOperator__Alternatives_in_ruleOverloadableOperator1433);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:720:1: entryRuleLiteralOperatorId : ruleLiteralOperatorId EOF ;
    public final void entryRuleLiteralOperatorId() throws RecognitionException {
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:721:1: ( ruleLiteralOperatorId EOF )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:722:1: ruleLiteralOperatorId EOF
            {
             before(grammarAccess.getLiteralOperatorIdRule()); 
            pushFollow(FOLLOW_ruleLiteralOperatorId_in_entryRuleLiteralOperatorId1460);
            ruleLiteralOperatorId();

            state._fsp--;

             after(grammarAccess.getLiteralOperatorIdRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteralOperatorId1467); 

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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:729:1: ruleLiteralOperatorId : ( ( rule__LiteralOperatorId__Group__0 ) ) ;
    public final void ruleLiteralOperatorId() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:733:2: ( ( ( rule__LiteralOperatorId__Group__0 ) ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:734:1: ( ( rule__LiteralOperatorId__Group__0 ) )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:734:1: ( ( rule__LiteralOperatorId__Group__0 ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:735:1: ( rule__LiteralOperatorId__Group__0 )
            {
             before(grammarAccess.getLiteralOperatorIdAccess().getGroup()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:736:1: ( rule__LiteralOperatorId__Group__0 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:736:2: rule__LiteralOperatorId__Group__0
            {
            pushFollow(FOLLOW_rule__LiteralOperatorId__Group__0_in_ruleLiteralOperatorId1493);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:750:1: entryRuleTemplateParameterList : ruleTemplateParameterList EOF ;
    public final void entryRuleTemplateParameterList() throws RecognitionException {
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:751:1: ( ruleTemplateParameterList EOF )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:752:1: ruleTemplateParameterList EOF
            {
             before(grammarAccess.getTemplateParameterListRule()); 
            pushFollow(FOLLOW_ruleTemplateParameterList_in_entryRuleTemplateParameterList1522);
            ruleTemplateParameterList();

            state._fsp--;

             after(grammarAccess.getTemplateParameterListRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTemplateParameterList1529); 

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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:759:1: ruleTemplateParameterList : ( ( rule__TemplateParameterList__Group__0 ) ) ;
    public final void ruleTemplateParameterList() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:763:2: ( ( ( rule__TemplateParameterList__Group__0 ) ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:764:1: ( ( rule__TemplateParameterList__Group__0 ) )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:764:1: ( ( rule__TemplateParameterList__Group__0 ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:765:1: ( rule__TemplateParameterList__Group__0 )
            {
             before(grammarAccess.getTemplateParameterListAccess().getGroup()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:766:1: ( rule__TemplateParameterList__Group__0 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:766:2: rule__TemplateParameterList__Group__0
            {
            pushFollow(FOLLOW_rule__TemplateParameterList__Group__0_in_ruleTemplateParameterList1555);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:778:1: entryRuleTemplateParameter : ruleTemplateParameter EOF ;
    public final void entryRuleTemplateParameter() throws RecognitionException {
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:779:1: ( ruleTemplateParameter EOF )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:780:1: ruleTemplateParameter EOF
            {
             before(grammarAccess.getTemplateParameterRule()); 
            pushFollow(FOLLOW_ruleTemplateParameter_in_entryRuleTemplateParameter1582);
            ruleTemplateParameter();

            state._fsp--;

             after(grammarAccess.getTemplateParameterRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTemplateParameter1589); 

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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:787:1: ruleTemplateParameter : ( ( rule__TemplateParameter__Alternatives ) ) ;
    public final void ruleTemplateParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:791:2: ( ( ( rule__TemplateParameter__Alternatives ) ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:792:1: ( ( rule__TemplateParameter__Alternatives ) )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:792:1: ( ( rule__TemplateParameter__Alternatives ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:793:1: ( rule__TemplateParameter__Alternatives )
            {
             before(grammarAccess.getTemplateParameterAccess().getAlternatives()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:794:1: ( rule__TemplateParameter__Alternatives )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:794:2: rule__TemplateParameter__Alternatives
            {
            pushFollow(FOLLOW_rule__TemplateParameter__Alternatives_in_ruleTemplateParameter1615);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:806:1: entryRuleTypeParameter : ruleTypeParameter EOF ;
    public final void entryRuleTypeParameter() throws RecognitionException {
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:807:1: ( ruleTypeParameter EOF )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:808:1: ruleTypeParameter EOF
            {
             before(grammarAccess.getTypeParameterRule()); 
            pushFollow(FOLLOW_ruleTypeParameter_in_entryRuleTypeParameter1642);
            ruleTypeParameter();

            state._fsp--;

             after(grammarAccess.getTypeParameterRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeParameter1649); 

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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:815:1: ruleTypeParameter : ( ( rule__TypeParameter__Alternatives ) ) ;
    public final void ruleTypeParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:819:2: ( ( ( rule__TypeParameter__Alternatives ) ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:820:1: ( ( rule__TypeParameter__Alternatives ) )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:820:1: ( ( rule__TypeParameter__Alternatives ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:821:1: ( rule__TypeParameter__Alternatives )
            {
             before(grammarAccess.getTypeParameterAccess().getAlternatives()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:822:1: ( rule__TypeParameter__Alternatives )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:822:2: rule__TypeParameter__Alternatives
            {
            pushFollow(FOLLOW_rule__TypeParameter__Alternatives_in_ruleTypeParameter1675);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:834:1: entryRuleSimpleTemplateId : ruleSimpleTemplateId EOF ;
    public final void entryRuleSimpleTemplateId() throws RecognitionException {
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:835:1: ( ruleSimpleTemplateId EOF )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:836:1: ruleSimpleTemplateId EOF
            {
             before(grammarAccess.getSimpleTemplateIdRule()); 
            pushFollow(FOLLOW_ruleSimpleTemplateId_in_entryRuleSimpleTemplateId1702);
            ruleSimpleTemplateId();

            state._fsp--;

             after(grammarAccess.getSimpleTemplateIdRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleTemplateId1709); 

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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:843:1: ruleSimpleTemplateId : ( ( rule__SimpleTemplateId__Group__0 ) ) ;
    public final void ruleSimpleTemplateId() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:847:2: ( ( ( rule__SimpleTemplateId__Group__0 ) ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:848:1: ( ( rule__SimpleTemplateId__Group__0 ) )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:848:1: ( ( rule__SimpleTemplateId__Group__0 ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:849:1: ( rule__SimpleTemplateId__Group__0 )
            {
             before(grammarAccess.getSimpleTemplateIdAccess().getGroup()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:850:1: ( rule__SimpleTemplateId__Group__0 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:850:2: rule__SimpleTemplateId__Group__0
            {
            pushFollow(FOLLOW_rule__SimpleTemplateId__Group__0_in_ruleSimpleTemplateId1735);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:864:1: entryRuleTemplateArgumentList : ruleTemplateArgumentList EOF ;
    public final void entryRuleTemplateArgumentList() throws RecognitionException {
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:865:1: ( ruleTemplateArgumentList EOF )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:866:1: ruleTemplateArgumentList EOF
            {
             before(grammarAccess.getTemplateArgumentListRule()); 
            pushFollow(FOLLOW_ruleTemplateArgumentList_in_entryRuleTemplateArgumentList1764);
            ruleTemplateArgumentList();

            state._fsp--;

             after(grammarAccess.getTemplateArgumentListRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTemplateArgumentList1771); 

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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:873:1: ruleTemplateArgumentList : ( ( rule__TemplateArgumentList__Group__0 ) ) ;
    public final void ruleTemplateArgumentList() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:877:2: ( ( ( rule__TemplateArgumentList__Group__0 ) ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:878:1: ( ( rule__TemplateArgumentList__Group__0 ) )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:878:1: ( ( rule__TemplateArgumentList__Group__0 ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:879:1: ( rule__TemplateArgumentList__Group__0 )
            {
             before(grammarAccess.getTemplateArgumentListAccess().getGroup()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:880:1: ( rule__TemplateArgumentList__Group__0 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:880:2: rule__TemplateArgumentList__Group__0
            {
            pushFollow(FOLLOW_rule__TemplateArgumentList__Group__0_in_ruleTemplateArgumentList1797);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:892:1: entryRuleTemplateArgument : ruleTemplateArgument EOF ;
    public final void entryRuleTemplateArgument() throws RecognitionException {
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:893:1: ( ruleTemplateArgument EOF )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:894:1: ruleTemplateArgument EOF
            {
             before(grammarAccess.getTemplateArgumentRule()); 
            pushFollow(FOLLOW_ruleTemplateArgument_in_entryRuleTemplateArgument1824);
            ruleTemplateArgument();

            state._fsp--;

             after(grammarAccess.getTemplateArgumentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTemplateArgument1831); 

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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:901:1: ruleTemplateArgument : ( ( rule__TemplateArgument__Alternatives ) ) ;
    public final void ruleTemplateArgument() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:905:2: ( ( ( rule__TemplateArgument__Alternatives ) ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:906:1: ( ( rule__TemplateArgument__Alternatives ) )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:906:1: ( ( rule__TemplateArgument__Alternatives ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:907:1: ( rule__TemplateArgument__Alternatives )
            {
             before(grammarAccess.getTemplateArgumentAccess().getAlternatives()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:908:1: ( rule__TemplateArgument__Alternatives )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:908:2: rule__TemplateArgument__Alternatives
            {
            pushFollow(FOLLOW_rule__TemplateArgument__Alternatives_in_ruleTemplateArgument1857);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:930:1: entryRuleHandler : ruleHandler EOF ;
    public final void entryRuleHandler() throws RecognitionException {
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:931:1: ( ruleHandler EOF )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:932:1: ruleHandler EOF
            {
             before(grammarAccess.getHandlerRule()); 
            pushFollow(FOLLOW_ruleHandler_in_entryRuleHandler1894);
            ruleHandler();

            state._fsp--;

             after(grammarAccess.getHandlerRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHandler1901); 

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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:939:1: ruleHandler : ( ( rule__Handler__Group__0 ) ) ;
    public final void ruleHandler() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:943:2: ( ( ( rule__Handler__Group__0 ) ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:944:1: ( ( rule__Handler__Group__0 ) )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:944:1: ( ( rule__Handler__Group__0 ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:945:1: ( rule__Handler__Group__0 )
            {
             before(grammarAccess.getHandlerAccess().getGroup()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:946:1: ( rule__Handler__Group__0 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:946:2: rule__Handler__Group__0
            {
            pushFollow(FOLLOW_rule__Handler__Group__0_in_ruleHandler1927);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:958:1: entryRuleExceptionDeclaration : ruleExceptionDeclaration EOF ;
    public final void entryRuleExceptionDeclaration() throws RecognitionException {
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:959:1: ( ruleExceptionDeclaration EOF )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:960:1: ruleExceptionDeclaration EOF
            {
             before(grammarAccess.getExceptionDeclarationRule()); 
            pushFollow(FOLLOW_ruleExceptionDeclaration_in_entryRuleExceptionDeclaration1954);
            ruleExceptionDeclaration();

            state._fsp--;

             after(grammarAccess.getExceptionDeclarationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExceptionDeclaration1961); 

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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:967:1: ruleExceptionDeclaration : ( ( rule__ExceptionDeclaration__Alternatives ) ) ;
    public final void ruleExceptionDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:971:2: ( ( ( rule__ExceptionDeclaration__Alternatives ) ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:972:1: ( ( rule__ExceptionDeclaration__Alternatives ) )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:972:1: ( ( rule__ExceptionDeclaration__Alternatives ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:973:1: ( rule__ExceptionDeclaration__Alternatives )
            {
             before(grammarAccess.getExceptionDeclarationAccess().getAlternatives()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:974:1: ( rule__ExceptionDeclaration__Alternatives )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:974:2: rule__ExceptionDeclaration__Alternatives
            {
            pushFollow(FOLLOW_rule__ExceptionDeclaration__Alternatives_in_ruleExceptionDeclaration1987);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:988:1: entryRuleExceptionSpecification : ruleExceptionSpecification EOF ;
    public final void entryRuleExceptionSpecification() throws RecognitionException {
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:989:1: ( ruleExceptionSpecification EOF )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:990:1: ruleExceptionSpecification EOF
            {
             before(grammarAccess.getExceptionSpecificationRule()); 
            pushFollow(FOLLOW_ruleExceptionSpecification_in_entryRuleExceptionSpecification2016);
            ruleExceptionSpecification();

            state._fsp--;

             after(grammarAccess.getExceptionSpecificationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExceptionSpecification2023); 

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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:997:1: ruleExceptionSpecification : ( ( rule__ExceptionSpecification__Alternatives ) ) ;
    public final void ruleExceptionSpecification() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1001:2: ( ( ( rule__ExceptionSpecification__Alternatives ) ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1002:1: ( ( rule__ExceptionSpecification__Alternatives ) )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1002:1: ( ( rule__ExceptionSpecification__Alternatives ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1003:1: ( rule__ExceptionSpecification__Alternatives )
            {
             before(grammarAccess.getExceptionSpecificationAccess().getAlternatives()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1004:1: ( rule__ExceptionSpecification__Alternatives )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1004:2: rule__ExceptionSpecification__Alternatives
            {
            pushFollow(FOLLOW_rule__ExceptionSpecification__Alternatives_in_ruleExceptionSpecification2049);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1016:1: entryRuleDynamicExceptionSpecification : ruleDynamicExceptionSpecification EOF ;
    public final void entryRuleDynamicExceptionSpecification() throws RecognitionException {
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1017:1: ( ruleDynamicExceptionSpecification EOF )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1018:1: ruleDynamicExceptionSpecification EOF
            {
             before(grammarAccess.getDynamicExceptionSpecificationRule()); 
            pushFollow(FOLLOW_ruleDynamicExceptionSpecification_in_entryRuleDynamicExceptionSpecification2076);
            ruleDynamicExceptionSpecification();

            state._fsp--;

             after(grammarAccess.getDynamicExceptionSpecificationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDynamicExceptionSpecification2083); 

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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1025:1: ruleDynamicExceptionSpecification : ( ( rule__DynamicExceptionSpecification__Group__0 ) ) ;
    public final void ruleDynamicExceptionSpecification() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1029:2: ( ( ( rule__DynamicExceptionSpecification__Group__0 ) ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1030:1: ( ( rule__DynamicExceptionSpecification__Group__0 ) )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1030:1: ( ( rule__DynamicExceptionSpecification__Group__0 ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1031:1: ( rule__DynamicExceptionSpecification__Group__0 )
            {
             before(grammarAccess.getDynamicExceptionSpecificationAccess().getGroup()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1032:1: ( rule__DynamicExceptionSpecification__Group__0 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1032:2: rule__DynamicExceptionSpecification__Group__0
            {
            pushFollow(FOLLOW_rule__DynamicExceptionSpecification__Group__0_in_ruleDynamicExceptionSpecification2109);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1044:1: entryRuleNoexceptSpecification : ruleNoexceptSpecification EOF ;
    public final void entryRuleNoexceptSpecification() throws RecognitionException {
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1045:1: ( ruleNoexceptSpecification EOF )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1046:1: ruleNoexceptSpecification EOF
            {
             before(grammarAccess.getNoexceptSpecificationRule()); 
            pushFollow(FOLLOW_ruleNoexceptSpecification_in_entryRuleNoexceptSpecification2136);
            ruleNoexceptSpecification();

            state._fsp--;

             after(grammarAccess.getNoexceptSpecificationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNoexceptSpecification2143); 

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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1053:1: ruleNoexceptSpecification : ( ( rule__NoexceptSpecification__Group__0 ) ) ;
    public final void ruleNoexceptSpecification() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1057:2: ( ( ( rule__NoexceptSpecification__Group__0 ) ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1058:1: ( ( rule__NoexceptSpecification__Group__0 ) )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1058:1: ( ( rule__NoexceptSpecification__Group__0 ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1059:1: ( rule__NoexceptSpecification__Group__0 )
            {
             before(grammarAccess.getNoexceptSpecificationAccess().getGroup()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1060:1: ( rule__NoexceptSpecification__Group__0 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1060:2: rule__NoexceptSpecification__Group__0
            {
            pushFollow(FOLLOW_rule__NoexceptSpecification__Group__0_in_ruleNoexceptSpecification2169);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1072:1: entryRuleConstantExpression : ruleConstantExpression EOF ;
    public final void entryRuleConstantExpression() throws RecognitionException {
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1073:1: ( ruleConstantExpression EOF )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1074:1: ruleConstantExpression EOF
            {
             before(grammarAccess.getConstantExpressionRule()); 
            pushFollow(FOLLOW_ruleConstantExpression_in_entryRuleConstantExpression2196);
            ruleConstantExpression();

            state._fsp--;

             after(grammarAccess.getConstantExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstantExpression2203); 

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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1081:1: ruleConstantExpression : ( 'ConstantExpression' ) ;
    public final void ruleConstantExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1085:2: ( ( 'ConstantExpression' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1086:1: ( 'ConstantExpression' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1086:1: ( 'ConstantExpression' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1087:1: 'ConstantExpression'
            {
             before(grammarAccess.getConstantExpressionAccess().getConstantExpressionKeyword()); 
            match(input,39,FOLLOW_39_in_ruleConstantExpression2230); 
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


    // $ANTLR start "entryRuleTypeId"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1102:1: entryRuleTypeId : ruleTypeId EOF ;
    public final void entryRuleTypeId() throws RecognitionException {
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1103:1: ( ruleTypeId EOF )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1104:1: ruleTypeId EOF
            {
             before(grammarAccess.getTypeIdRule()); 
            pushFollow(FOLLOW_ruleTypeId_in_entryRuleTypeId2258);
            ruleTypeId();

            state._fsp--;

             after(grammarAccess.getTypeIdRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeId2265); 

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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1111:1: ruleTypeId : ( 'TypeId' ) ;
    public final void ruleTypeId() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1115:2: ( ( 'TypeId' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1116:1: ( 'TypeId' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1116:1: ( 'TypeId' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1117:1: 'TypeId'
            {
             before(grammarAccess.getTypeIdAccess().getTypeIdKeyword()); 
            match(input,40,FOLLOW_40_in_ruleTypeId2292); 
             after(grammarAccess.getTypeIdAccess().getTypeIdKeyword()); 

            }


            }

        }
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1132:1: entryRuleIdExpression : ruleIdExpression EOF ;
    public final void entryRuleIdExpression() throws RecognitionException {
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1133:1: ( ruleIdExpression EOF )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1134:1: ruleIdExpression EOF
            {
             before(grammarAccess.getIdExpressionRule()); 
            pushFollow(FOLLOW_ruleIdExpression_in_entryRuleIdExpression2320);
            ruleIdExpression();

            state._fsp--;

             after(grammarAccess.getIdExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIdExpression2327); 

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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1141:1: ruleIdExpression : ( 'IdExpression' ) ;
    public final void ruleIdExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1145:2: ( ( 'IdExpression' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1146:1: ( 'IdExpression' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1146:1: ( 'IdExpression' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1147:1: 'IdExpression'
            {
             before(grammarAccess.getIdExpressionAccess().getIdExpressionKeyword()); 
            match(input,41,FOLLOW_41_in_ruleIdExpression2354); 
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


    // $ANTLR start "entryRuleParameterDeclaration"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1162:1: entryRuleParameterDeclaration : ruleParameterDeclaration EOF ;
    public final void entryRuleParameterDeclaration() throws RecognitionException {
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1163:1: ( ruleParameterDeclaration EOF )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1164:1: ruleParameterDeclaration EOF
            {
             before(grammarAccess.getParameterDeclarationRule()); 
            pushFollow(FOLLOW_ruleParameterDeclaration_in_entryRuleParameterDeclaration2382);
            ruleParameterDeclaration();

            state._fsp--;

             after(grammarAccess.getParameterDeclarationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterDeclaration2389); 

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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1171:1: ruleParameterDeclaration : ( 'ParameterDeclaration' ) ;
    public final void ruleParameterDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1175:2: ( ( 'ParameterDeclaration' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1176:1: ( 'ParameterDeclaration' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1176:1: ( 'ParameterDeclaration' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1177:1: 'ParameterDeclaration'
            {
             before(grammarAccess.getParameterDeclarationAccess().getParameterDeclarationKeyword()); 
            match(input,42,FOLLOW_42_in_ruleParameterDeclaration2416); 
             after(grammarAccess.getParameterDeclarationAccess().getParameterDeclarationKeyword()); 

            }


            }

        }
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1192:1: entryRuleDeclaration : ruleDeclaration EOF ;
    public final void entryRuleDeclaration() throws RecognitionException {
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1193:1: ( ruleDeclaration EOF )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1194:1: ruleDeclaration EOF
            {
             before(grammarAccess.getDeclarationRule()); 
            pushFollow(FOLLOW_ruleDeclaration_in_entryRuleDeclaration2444);
            ruleDeclaration();

            state._fsp--;

             after(grammarAccess.getDeclarationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeclaration2451); 

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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1201:1: ruleDeclaration : ( 'Declaration' ) ;
    public final void ruleDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1205:2: ( ( 'Declaration' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1206:1: ( 'Declaration' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1206:1: ( 'Declaration' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1207:1: 'Declaration'
            {
             before(grammarAccess.getDeclarationAccess().getDeclarationKeyword()); 
            match(input,43,FOLLOW_43_in_ruleDeclaration2478); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1222:1: entryRuleNestedNameSpecifier : ruleNestedNameSpecifier EOF ;
    public final void entryRuleNestedNameSpecifier() throws RecognitionException {
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1223:1: ( ruleNestedNameSpecifier EOF )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1224:1: ruleNestedNameSpecifier EOF
            {
             before(grammarAccess.getNestedNameSpecifierRule()); 
            pushFollow(FOLLOW_ruleNestedNameSpecifier_in_entryRuleNestedNameSpecifier2506);
            ruleNestedNameSpecifier();

            state._fsp--;

             after(grammarAccess.getNestedNameSpecifierRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNestedNameSpecifier2513); 

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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1231:1: ruleNestedNameSpecifier : ( 'NestedNameSpecifier' ) ;
    public final void ruleNestedNameSpecifier() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1235:2: ( ( 'NestedNameSpecifier' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1236:1: ( 'NestedNameSpecifier' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1236:1: ( 'NestedNameSpecifier' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1237:1: 'NestedNameSpecifier'
            {
             before(grammarAccess.getNestedNameSpecifierAccess().getNestedNameSpecifierKeyword()); 
            match(input,44,FOLLOW_44_in_ruleNestedNameSpecifier2540); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1252:1: entryRuleAssignmentExpression : ruleAssignmentExpression EOF ;
    public final void entryRuleAssignmentExpression() throws RecognitionException {
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1253:1: ( ruleAssignmentExpression EOF )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1254:1: ruleAssignmentExpression EOF
            {
             before(grammarAccess.getAssignmentExpressionRule()); 
            pushFollow(FOLLOW_ruleAssignmentExpression_in_entryRuleAssignmentExpression2568);
            ruleAssignmentExpression();

            state._fsp--;

             after(grammarAccess.getAssignmentExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignmentExpression2575); 

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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1261:1: ruleAssignmentExpression : ( 'AssignmentExpression' ) ;
    public final void ruleAssignmentExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1265:2: ( ( 'AssignmentExpression' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1266:1: ( 'AssignmentExpression' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1266:1: ( 'AssignmentExpression' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1267:1: 'AssignmentExpression'
            {
             before(grammarAccess.getAssignmentExpressionAccess().getAssignmentExpressionKeyword()); 
            match(input,45,FOLLOW_45_in_ruleAssignmentExpression2602); 
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


    // $ANTLR start "entryRuleAlignmentExpression"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1282:1: entryRuleAlignmentExpression : ruleAlignmentExpression EOF ;
    public final void entryRuleAlignmentExpression() throws RecognitionException {
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1283:1: ( ruleAlignmentExpression EOF )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1284:1: ruleAlignmentExpression EOF
            {
             before(grammarAccess.getAlignmentExpressionRule()); 
            pushFollow(FOLLOW_ruleAlignmentExpression_in_entryRuleAlignmentExpression2630);
            ruleAlignmentExpression();

            state._fsp--;

             after(grammarAccess.getAlignmentExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAlignmentExpression2637); 

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
    // $ANTLR end "entryRuleAlignmentExpression"


    // $ANTLR start "ruleAlignmentExpression"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1291:1: ruleAlignmentExpression : ( 'AlignmentExpression' ) ;
    public final void ruleAlignmentExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1295:2: ( ( 'AlignmentExpression' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1296:1: ( 'AlignmentExpression' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1296:1: ( 'AlignmentExpression' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1297:1: 'AlignmentExpression'
            {
             before(grammarAccess.getAlignmentExpressionAccess().getAlignmentExpressionKeyword()); 
            match(input,46,FOLLOW_46_in_ruleAlignmentExpression2664); 
             after(grammarAccess.getAlignmentExpressionAccess().getAlignmentExpressionKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAlignmentExpression"


    // $ANTLR start "entryRuleTypeSpecifier"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1312:1: entryRuleTypeSpecifier : ruleTypeSpecifier EOF ;
    public final void entryRuleTypeSpecifier() throws RecognitionException {
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1313:1: ( ruleTypeSpecifier EOF )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1314:1: ruleTypeSpecifier EOF
            {
             before(grammarAccess.getTypeSpecifierRule()); 
            pushFollow(FOLLOW_ruleTypeSpecifier_in_entryRuleTypeSpecifier2692);
            ruleTypeSpecifier();

            state._fsp--;

             after(grammarAccess.getTypeSpecifierRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeSpecifier2699); 

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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1321:1: ruleTypeSpecifier : ( 'TypeSpecifier' ) ;
    public final void ruleTypeSpecifier() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1325:2: ( ( 'TypeSpecifier' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1326:1: ( 'TypeSpecifier' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1326:1: ( 'TypeSpecifier' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1327:1: 'TypeSpecifier'
            {
             before(grammarAccess.getTypeSpecifierAccess().getTypeSpecifierKeyword()); 
            match(input,47,FOLLOW_47_in_ruleTypeSpecifier2726); 
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


    // $ANTLR start "entryRuleAbstractDeclarator"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1342:1: entryRuleAbstractDeclarator : ruleAbstractDeclarator EOF ;
    public final void entryRuleAbstractDeclarator() throws RecognitionException {
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1343:1: ( ruleAbstractDeclarator EOF )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1344:1: ruleAbstractDeclarator EOF
            {
             before(grammarAccess.getAbstractDeclaratorRule()); 
            pushFollow(FOLLOW_ruleAbstractDeclarator_in_entryRuleAbstractDeclarator2754);
            ruleAbstractDeclarator();

            state._fsp--;

             after(grammarAccess.getAbstractDeclaratorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractDeclarator2761); 

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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1351:1: ruleAbstractDeclarator : ( 'AbstractDeclarator' ) ;
    public final void ruleAbstractDeclarator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1355:2: ( ( 'AbstractDeclarator' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1356:1: ( 'AbstractDeclarator' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1356:1: ( 'AbstractDeclarator' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1357:1: 'AbstractDeclarator'
            {
             before(grammarAccess.getAbstractDeclaratorAccess().getAbstractDeclaratorKeyword()); 
            match(input,48,FOLLOW_48_in_ruleAbstractDeclarator2788); 
             after(grammarAccess.getAbstractDeclaratorAccess().getAbstractDeclaratorKeyword()); 

            }


            }

        }
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1372:1: entryRuleCompoundStatement : ruleCompoundStatement EOF ;
    public final void entryRuleCompoundStatement() throws RecognitionException {
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1373:1: ( ruleCompoundStatement EOF )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1374:1: ruleCompoundStatement EOF
            {
             before(grammarAccess.getCompoundStatementRule()); 
            pushFollow(FOLLOW_ruleCompoundStatement_in_entryRuleCompoundStatement2816);
            ruleCompoundStatement();

            state._fsp--;

             after(grammarAccess.getCompoundStatementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompoundStatement2823); 

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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1381:1: ruleCompoundStatement : ( 'CompoundStatement' ) ;
    public final void ruleCompoundStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1385:2: ( ( 'CompoundStatement' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1386:1: ( 'CompoundStatement' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1386:1: ( 'CompoundStatement' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1387:1: 'CompoundStatement'
            {
             before(grammarAccess.getCompoundStatementAccess().getCompoundStatementKeyword()); 
            match(input,49,FOLLOW_49_in_ruleCompoundStatement2850); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1402:1: entryRuleCtorInitializer : ruleCtorInitializer EOF ;
    public final void entryRuleCtorInitializer() throws RecognitionException {
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1403:1: ( ruleCtorInitializer EOF )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1404:1: ruleCtorInitializer EOF
            {
             before(grammarAccess.getCtorInitializerRule()); 
            pushFollow(FOLLOW_ruleCtorInitializer_in_entryRuleCtorInitializer2878);
            ruleCtorInitializer();

            state._fsp--;

             after(grammarAccess.getCtorInitializerRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCtorInitializer2885); 

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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1411:1: ruleCtorInitializer : ( 'CtorInitializer' ) ;
    public final void ruleCtorInitializer() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1415:2: ( ( 'CtorInitializer' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1416:1: ( 'CtorInitializer' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1416:1: ( 'CtorInitializer' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1417:1: 'CtorInitializer'
            {
             before(grammarAccess.getCtorInitializerAccess().getCtorInitializerKeyword()); 
            match(input,50,FOLLOW_50_in_ruleCtorInitializer2912); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1432:1: entryRuleTypeIdList : ruleTypeIdList EOF ;
    public final void entryRuleTypeIdList() throws RecognitionException {
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1433:1: ( ruleTypeIdList EOF )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1434:1: ruleTypeIdList EOF
            {
             before(grammarAccess.getTypeIdListRule()); 
            pushFollow(FOLLOW_ruleTypeIdList_in_entryRuleTypeIdList2940);
            ruleTypeIdList();

            state._fsp--;

             after(grammarAccess.getTypeIdListRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeIdList2947); 

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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1441:1: ruleTypeIdList : ( 'TypeIdList' ) ;
    public final void ruleTypeIdList() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1445:2: ( ( 'TypeIdList' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1446:1: ( 'TypeIdList' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1446:1: ( 'TypeIdList' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1447:1: 'TypeIdList'
            {
             before(grammarAccess.getTypeIdListAccess().getTypeIdListKeyword()); 
            match(input,51,FOLLOW_51_in_ruleTypeIdList2974); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1462:1: entryRuleUnqualifiedId : ruleUnqualifiedId EOF ;
    public final void entryRuleUnqualifiedId() throws RecognitionException {
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1463:1: ( ruleUnqualifiedId EOF )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1464:1: ruleUnqualifiedId EOF
            {
             before(grammarAccess.getUnqualifiedIdRule()); 
            pushFollow(FOLLOW_ruleUnqualifiedId_in_entryRuleUnqualifiedId3002);
            ruleUnqualifiedId();

            state._fsp--;

             after(grammarAccess.getUnqualifiedIdRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnqualifiedId3009); 

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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1471:1: ruleUnqualifiedId : ( 'UnqualifiedId' ) ;
    public final void ruleUnqualifiedId() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1475:2: ( ( 'UnqualifiedId' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1476:1: ( 'UnqualifiedId' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1476:1: ( 'UnqualifiedId' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1477:1: 'UnqualifiedId'
            {
             before(grammarAccess.getUnqualifiedIdAccess().getUnqualifiedIdKeyword()); 
            match(input,52,FOLLOW_52_in_ruleUnqualifiedId3036); 
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


    // $ANTLR start "entryRuleParameterDeclarationClause"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1492:1: entryRuleParameterDeclarationClause : ruleParameterDeclarationClause EOF ;
    public final void entryRuleParameterDeclarationClause() throws RecognitionException {
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1493:1: ( ruleParameterDeclarationClause EOF )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1494:1: ruleParameterDeclarationClause EOF
            {
             before(grammarAccess.getParameterDeclarationClauseRule()); 
            pushFollow(FOLLOW_ruleParameterDeclarationClause_in_entryRuleParameterDeclarationClause3064);
            ruleParameterDeclarationClause();

            state._fsp--;

             after(grammarAccess.getParameterDeclarationClauseRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterDeclarationClause3071); 

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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1501:1: ruleParameterDeclarationClause : ( 'ParameterDeclarationClause' ) ;
    public final void ruleParameterDeclarationClause() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1505:2: ( ( 'ParameterDeclarationClause' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1506:1: ( 'ParameterDeclarationClause' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1506:1: ( 'ParameterDeclarationClause' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1507:1: 'ParameterDeclarationClause'
            {
             before(grammarAccess.getParameterDeclarationClauseAccess().getParameterDeclarationClauseKeyword()); 
            match(input,53,FOLLOW_53_in_ruleParameterDeclarationClause3098); 
             after(grammarAccess.getParameterDeclarationClauseAccess().getParameterDeclarationClauseKeyword()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleTrailingTypeSpecifier"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1522:1: entryRuleTrailingTypeSpecifier : ruleTrailingTypeSpecifier EOF ;
    public final void entryRuleTrailingTypeSpecifier() throws RecognitionException {
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1523:1: ( ruleTrailingTypeSpecifier EOF )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1524:1: ruleTrailingTypeSpecifier EOF
            {
             before(grammarAccess.getTrailingTypeSpecifierRule()); 
            pushFollow(FOLLOW_ruleTrailingTypeSpecifier_in_entryRuleTrailingTypeSpecifier3126);
            ruleTrailingTypeSpecifier();

            state._fsp--;

             after(grammarAccess.getTrailingTypeSpecifierRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTrailingTypeSpecifier3133); 

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
    // $ANTLR end "entryRuleTrailingTypeSpecifier"


    // $ANTLR start "ruleTrailingTypeSpecifier"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1531:1: ruleTrailingTypeSpecifier : ( 'TrailingTypeSpecifier' ) ;
    public final void ruleTrailingTypeSpecifier() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1535:2: ( ( 'TrailingTypeSpecifier' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1536:1: ( 'TrailingTypeSpecifier' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1536:1: ( 'TrailingTypeSpecifier' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1537:1: 'TrailingTypeSpecifier'
            {
             before(grammarAccess.getTrailingTypeSpecifierAccess().getTrailingTypeSpecifierKeyword()); 
            match(input,54,FOLLOW_54_in_ruleTrailingTypeSpecifier3160); 
             after(grammarAccess.getTrailingTypeSpecifierAccess().getTrailingTypeSpecifierKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTrailingTypeSpecifier"


    // $ANTLR start "entryRuleClassName"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1552:1: entryRuleClassName : ruleClassName EOF ;
    public final void entryRuleClassName() throws RecognitionException {
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1553:1: ( ruleClassName EOF )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1554:1: ruleClassName EOF
            {
             before(grammarAccess.getClassNameRule()); 
            pushFollow(FOLLOW_ruleClassName_in_entryRuleClassName3188);
            ruleClassName();

            state._fsp--;

             after(grammarAccess.getClassNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClassName3195); 

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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1561:1: ruleClassName : ( 'ClassName' ) ;
    public final void ruleClassName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1565:2: ( ( 'ClassName' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1566:1: ( 'ClassName' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1566:1: ( 'ClassName' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1567:1: 'ClassName'
            {
             before(grammarAccess.getClassNameAccess().getClassNameKeyword()); 
            match(input,55,FOLLOW_55_in_ruleClassName3222); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1582:1: entryRuleInitializer : ruleInitializer EOF ;
    public final void entryRuleInitializer() throws RecognitionException {
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1583:1: ( ruleInitializer EOF )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1584:1: ruleInitializer EOF
            {
             before(grammarAccess.getInitializerRule()); 
            pushFollow(FOLLOW_ruleInitializer_in_entryRuleInitializer3250);
            ruleInitializer();

            state._fsp--;

             after(grammarAccess.getInitializerRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInitializer3257); 

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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1591:1: ruleInitializer : ( 'Initializer' ) ;
    public final void ruleInitializer() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1595:2: ( ( 'Initializer' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1596:1: ( 'Initializer' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1596:1: ( 'Initializer' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1597:1: 'Initializer'
            {
             before(grammarAccess.getInitializerAccess().getInitializerKeyword()); 
            match(input,56,FOLLOW_56_in_ruleInitializer3284); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1613:1: rule__Token__Alternatives : ( ( RULE_KEYWORD ) | ( ruleLiteral ) | ( ( rule__Token__Group_2__0 ) ) );
    public final void rule__Token__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1617:1: ( ( RULE_KEYWORD ) | ( ruleLiteral ) | ( ( rule__Token__Group_2__0 ) ) )
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
            case 57:
            case 58:
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
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1618:1: ( RULE_KEYWORD )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1618:1: ( RULE_KEYWORD )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1619:1: RULE_KEYWORD
                    {
                     before(grammarAccess.getTokenAccess().getKEYWORDTerminalRuleCall_0()); 
                    match(input,RULE_KEYWORD,FOLLOW_RULE_KEYWORD_in_rule__Token__Alternatives3322); 
                     after(grammarAccess.getTokenAccess().getKEYWORDTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1624:6: ( ruleLiteral )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1624:6: ( ruleLiteral )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1625:1: ruleLiteral
                    {
                     before(grammarAccess.getTokenAccess().getLiteralParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleLiteral_in_rule__Token__Alternatives3339);
                    ruleLiteral();

                    state._fsp--;

                     after(grammarAccess.getTokenAccess().getLiteralParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1630:6: ( ( rule__Token__Group_2__0 ) )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1630:6: ( ( rule__Token__Group_2__0 ) )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1631:1: ( rule__Token__Group_2__0 )
                    {
                     before(grammarAccess.getTokenAccess().getGroup_2()); 
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1632:1: ( rule__Token__Group_2__0 )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1632:2: rule__Token__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Token__Group_2__0_in_rule__Token__Alternatives3356);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1641:1: rule__Literal__Alternatives : ( ( RULE_INT ) | ( RULE_CHARACTER_LITERAL ) | ( RULE_FLOATING_LITERAL ) | ( RULE_STRING_LITERAL ) | ( ( rule__Literal__Group_4__0 ) ) );
    public final void rule__Literal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1645:1: ( ( RULE_INT ) | ( RULE_CHARACTER_LITERAL ) | ( RULE_FLOATING_LITERAL ) | ( RULE_STRING_LITERAL ) | ( ( rule__Literal__Group_4__0 ) ) )
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
            case 57:
            case 58:
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
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1646:1: ( RULE_INT )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1646:1: ( RULE_INT )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1647:1: RULE_INT
                    {
                     before(grammarAccess.getLiteralAccess().getINTTerminalRuleCall_0()); 
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Literal__Alternatives3389); 
                     after(grammarAccess.getLiteralAccess().getINTTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1652:6: ( RULE_CHARACTER_LITERAL )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1652:6: ( RULE_CHARACTER_LITERAL )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1653:1: RULE_CHARACTER_LITERAL
                    {
                     before(grammarAccess.getLiteralAccess().getCHARACTER_LITERALTerminalRuleCall_1()); 
                    match(input,RULE_CHARACTER_LITERAL,FOLLOW_RULE_CHARACTER_LITERAL_in_rule__Literal__Alternatives3406); 
                     after(grammarAccess.getLiteralAccess().getCHARACTER_LITERALTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1658:6: ( RULE_FLOATING_LITERAL )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1658:6: ( RULE_FLOATING_LITERAL )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1659:1: RULE_FLOATING_LITERAL
                    {
                     before(grammarAccess.getLiteralAccess().getFLOATING_LITERALTerminalRuleCall_2()); 
                    match(input,RULE_FLOATING_LITERAL,FOLLOW_RULE_FLOATING_LITERAL_in_rule__Literal__Alternatives3423); 
                     after(grammarAccess.getLiteralAccess().getFLOATING_LITERALTerminalRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1664:6: ( RULE_STRING_LITERAL )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1664:6: ( RULE_STRING_LITERAL )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1665:1: RULE_STRING_LITERAL
                    {
                     before(grammarAccess.getLiteralAccess().getSTRING_LITERALTerminalRuleCall_3()); 
                    match(input,RULE_STRING_LITERAL,FOLLOW_RULE_STRING_LITERAL_in_rule__Literal__Alternatives3440); 
                     after(grammarAccess.getLiteralAccess().getSTRING_LITERALTerminalRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1670:6: ( ( rule__Literal__Group_4__0 ) )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1670:6: ( ( rule__Literal__Group_4__0 ) )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1671:1: ( rule__Literal__Group_4__0 )
                    {
                     before(grammarAccess.getLiteralAccess().getGroup_4()); 
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1672:1: ( rule__Literal__Group_4__0 )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1672:2: rule__Literal__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Literal__Group_4__0_in_rule__Literal__Alternatives3457);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1681:1: rule__Literal__Alternatives_4_0 : ( ( 'true' ) | ( 'false' ) );
    public final void rule__Literal__Alternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1685:1: ( ( 'true' ) | ( 'false' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==57) ) {
                alt5=1;
            }
            else if ( (LA5_0==58) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1686:1: ( 'true' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1686:1: ( 'true' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1687:1: 'true'
                    {
                     before(grammarAccess.getLiteralAccess().getTrueKeyword_4_0_0()); 
                    match(input,57,FOLLOW_57_in_rule__Literal__Alternatives_4_03491); 
                     after(grammarAccess.getLiteralAccess().getTrueKeyword_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1694:6: ( 'false' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1694:6: ( 'false' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1695:1: 'false'
                    {
                     before(grammarAccess.getLiteralAccess().getFalseKeyword_4_0_1()); 
                    match(input,58,FOLLOW_58_in_rule__Literal__Alternatives_4_03511); 
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


    // $ANTLR start "rule__AttributeSpecifier__Alternatives"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1709:1: rule__AttributeSpecifier__Alternatives : ( ( ( rule__AttributeSpecifier__Group_0__0 ) ) | ( ruleAlignmentSpecifier ) );
    public final void rule__AttributeSpecifier__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1713:1: ( ( ( rule__AttributeSpecifier__Group_0__0 ) ) | ( ruleAlignmentSpecifier ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==104) ) {
                alt6=1;
            }
            else if ( (LA6_0==106) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1714:1: ( ( rule__AttributeSpecifier__Group_0__0 ) )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1714:1: ( ( rule__AttributeSpecifier__Group_0__0 ) )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1715:1: ( rule__AttributeSpecifier__Group_0__0 )
                    {
                     before(grammarAccess.getAttributeSpecifierAccess().getGroup_0()); 
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1716:1: ( rule__AttributeSpecifier__Group_0__0 )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1716:2: rule__AttributeSpecifier__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__AttributeSpecifier__Group_0__0_in_rule__AttributeSpecifier__Alternatives3547);
                    rule__AttributeSpecifier__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAttributeSpecifierAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1720:6: ( ruleAlignmentSpecifier )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1720:6: ( ruleAlignmentSpecifier )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1721:1: ruleAlignmentSpecifier
                    {
                     before(grammarAccess.getAttributeSpecifierAccess().getAlignmentSpecifierParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleAlignmentSpecifier_in_rule__AttributeSpecifier__Alternatives3565);
                    ruleAlignmentSpecifier();

                    state._fsp--;

                     after(grammarAccess.getAttributeSpecifierAccess().getAlignmentSpecifierParserRuleCall_1()); 

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
    // $ANTLR end "rule__AttributeSpecifier__Alternatives"


    // $ANTLR start "rule__AlignmentSpecifier__Alternatives"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1731:1: rule__AlignmentSpecifier__Alternatives : ( ( ( rule__AlignmentSpecifier__Group_0__0 ) ) | ( ( rule__AlignmentSpecifier__Group_1__0 ) ) );
    public final void rule__AlignmentSpecifier__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1735:1: ( ( ( rule__AlignmentSpecifier__Group_0__0 ) ) | ( ( rule__AlignmentSpecifier__Group_1__0 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==106) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==107) ) {
                    int LA7_2 = input.LA(3);

                    if ( (LA7_2==46) ) {
                        alt7=2;
                    }
                    else if ( (LA7_2==40) ) {
                        alt7=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 7, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1736:1: ( ( rule__AlignmentSpecifier__Group_0__0 ) )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1736:1: ( ( rule__AlignmentSpecifier__Group_0__0 ) )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1737:1: ( rule__AlignmentSpecifier__Group_0__0 )
                    {
                     before(grammarAccess.getAlignmentSpecifierAccess().getGroup_0()); 
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1738:1: ( rule__AlignmentSpecifier__Group_0__0 )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1738:2: rule__AlignmentSpecifier__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__AlignmentSpecifier__Group_0__0_in_rule__AlignmentSpecifier__Alternatives3597);
                    rule__AlignmentSpecifier__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAlignmentSpecifierAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1742:6: ( ( rule__AlignmentSpecifier__Group_1__0 ) )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1742:6: ( ( rule__AlignmentSpecifier__Group_1__0 ) )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1743:1: ( rule__AlignmentSpecifier__Group_1__0 )
                    {
                     before(grammarAccess.getAlignmentSpecifierAccess().getGroup_1()); 
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1744:1: ( rule__AlignmentSpecifier__Group_1__0 )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1744:2: rule__AlignmentSpecifier__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__AlignmentSpecifier__Group_1__0_in_rule__AlignmentSpecifier__Alternatives3615);
                    rule__AlignmentSpecifier__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAlignmentSpecifierAccess().getGroup_1()); 

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
    // $ANTLR end "rule__AlignmentSpecifier__Alternatives"


    // $ANTLR start "rule__Declarator__Alternatives"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1753:1: rule__Declarator__Alternatives : ( ( ( rule__Declarator__Group_0__0 ) ) | ( ( rule__Declarator__Group_1__0 ) ) );
    public final void rule__Declarator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1757:1: ( ( ( rule__Declarator__Group_0__0 ) ) | ( ( rule__Declarator__Group_1__0 ) ) )
            int alt8=2;
            switch ( input.LA(1) ) {
            case 61:
            case 62:
            case 67:
                {
                alt8=1;
                }
                break;
            case 103:
                {
                int LA8_2 = input.LA(2);

                if ( (LA8_2==44) ) {
                    int LA8_3 = input.LA(3);

                    if ( (LA8_3==67) ) {
                        alt8=1;
                    }
                    else if ( (LA8_3==55) ) {
                        alt8=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 3, input);

                        throw nvae;
                    }
                }
                else if ( (LA8_2==55) ) {
                    alt8=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 2, input);

                    throw nvae;
                }
                }
                break;
            case 44:
                {
                int LA8_3 = input.LA(2);

                if ( (LA8_3==67) ) {
                    alt8=1;
                }
                else if ( (LA8_3==55) ) {
                    alt8=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 3, input);

                    throw nvae;
                }
                }
                break;
            case 41:
            case 55:
            case 101:
            case 107:
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
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1758:1: ( ( rule__Declarator__Group_0__0 ) )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1758:1: ( ( rule__Declarator__Group_0__0 ) )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1759:1: ( rule__Declarator__Group_0__0 )
                    {
                     before(grammarAccess.getDeclaratorAccess().getGroup_0()); 
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1760:1: ( rule__Declarator__Group_0__0 )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1760:2: rule__Declarator__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Declarator__Group_0__0_in_rule__Declarator__Alternatives3648);
                    rule__Declarator__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDeclaratorAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1764:6: ( ( rule__Declarator__Group_1__0 ) )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1764:6: ( ( rule__Declarator__Group_1__0 ) )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1765:1: ( rule__Declarator__Group_1__0 )
                    {
                     before(grammarAccess.getDeclaratorAccess().getGroup_1()); 
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1766:1: ( rule__Declarator__Group_1__0 )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1766:2: rule__Declarator__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Declarator__Group_1__0_in_rule__Declarator__Alternatives3666);
                    rule__Declarator__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDeclaratorAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Declarator__Alternatives"


    // $ANTLR start "rule___NoptrDeclarator__Alternatives"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1775:1: rule___NoptrDeclarator__Alternatives : ( ( ( rule___NoptrDeclarator__Group_0__0 ) ) | ( ( rule___NoptrDeclarator__Group_1__0 ) ) );
    public final void rule___NoptrDeclarator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1779:1: ( ( ( rule___NoptrDeclarator__Group_0__0 ) ) | ( ( rule___NoptrDeclarator__Group_1__0 ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==41||LA9_0==44||LA9_0==55||LA9_0==101||LA9_0==103) ) {
                alt9=1;
            }
            else if ( (LA9_0==107) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1780:1: ( ( rule___NoptrDeclarator__Group_0__0 ) )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1780:1: ( ( rule___NoptrDeclarator__Group_0__0 ) )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1781:1: ( rule___NoptrDeclarator__Group_0__0 )
                    {
                     before(grammarAccess.get_NoptrDeclaratorAccess().getGroup_0()); 
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1782:1: ( rule___NoptrDeclarator__Group_0__0 )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1782:2: rule___NoptrDeclarator__Group_0__0
                    {
                    pushFollow(FOLLOW_rule___NoptrDeclarator__Group_0__0_in_rule___NoptrDeclarator__Alternatives3699);
                    rule___NoptrDeclarator__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.get_NoptrDeclaratorAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1786:6: ( ( rule___NoptrDeclarator__Group_1__0 ) )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1786:6: ( ( rule___NoptrDeclarator__Group_1__0 ) )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1787:1: ( rule___NoptrDeclarator__Group_1__0 )
                    {
                     before(grammarAccess.get_NoptrDeclaratorAccess().getGroup_1()); 
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1788:1: ( rule___NoptrDeclarator__Group_1__0 )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1788:2: rule___NoptrDeclarator__Group_1__0
                    {
                    pushFollow(FOLLOW_rule___NoptrDeclarator__Group_1__0_in_rule___NoptrDeclarator__Alternatives3717);
                    rule___NoptrDeclarator__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.get_NoptrDeclaratorAccess().getGroup_1()); 

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
    // $ANTLR end "rule___NoptrDeclarator__Alternatives"


    // $ANTLR start "rule____NoptrDeclarator__Alternatives"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1797:1: rule____NoptrDeclarator__Alternatives : ( ( ruleParametersAndQualifiers ) | ( ( rule____NoptrDeclarator__Group_1__0 ) ) );
    public final void rule____NoptrDeclarator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1801:1: ( ( ruleParametersAndQualifiers ) | ( ( rule____NoptrDeclarator__Group_1__0 ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==107) ) {
                alt10=1;
            }
            else if ( (LA10_0==104) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1802:1: ( ruleParametersAndQualifiers )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1802:1: ( ruleParametersAndQualifiers )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1803:1: ruleParametersAndQualifiers
                    {
                     before(grammarAccess.get__NoptrDeclaratorAccess().getParametersAndQualifiersParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleParametersAndQualifiers_in_rule____NoptrDeclarator__Alternatives3750);
                    ruleParametersAndQualifiers();

                    state._fsp--;

                     after(grammarAccess.get__NoptrDeclaratorAccess().getParametersAndQualifiersParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1808:6: ( ( rule____NoptrDeclarator__Group_1__0 ) )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1808:6: ( ( rule____NoptrDeclarator__Group_1__0 ) )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1809:1: ( rule____NoptrDeclarator__Group_1__0 )
                    {
                     before(grammarAccess.get__NoptrDeclaratorAccess().getGroup_1()); 
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1810:1: ( rule____NoptrDeclarator__Group_1__0 )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1810:2: rule____NoptrDeclarator__Group_1__0
                    {
                    pushFollow(FOLLOW_rule____NoptrDeclarator__Group_1__0_in_rule____NoptrDeclarator__Alternatives3767);
                    rule____NoptrDeclarator__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.get__NoptrDeclaratorAccess().getGroup_1()); 

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
    // $ANTLR end "rule____NoptrDeclarator__Alternatives"


    // $ANTLR start "rule__ParametersAndQualifiers__Alternatives_4"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1819:1: rule__ParametersAndQualifiers__Alternatives_4 : ( ( 'const' ) | ( 'volatile' ) );
    public final void rule__ParametersAndQualifiers__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1823:1: ( ( 'const' ) | ( 'volatile' ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==59) ) {
                alt11=1;
            }
            else if ( (LA11_0==60) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1824:1: ( 'const' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1824:1: ( 'const' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1825:1: 'const'
                    {
                     before(grammarAccess.getParametersAndQualifiersAccess().getConstKeyword_4_0()); 
                    match(input,59,FOLLOW_59_in_rule__ParametersAndQualifiers__Alternatives_43801); 
                     after(grammarAccess.getParametersAndQualifiersAccess().getConstKeyword_4_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1832:6: ( 'volatile' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1832:6: ( 'volatile' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1833:1: 'volatile'
                    {
                     before(grammarAccess.getParametersAndQualifiersAccess().getVolatileKeyword_4_1()); 
                    match(input,60,FOLLOW_60_in_rule__ParametersAndQualifiers__Alternatives_43821); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1845:1: rule__ParametersAndQualifiers__Alternatives_5 : ( ( '&' ) | ( '&&' ) );
    public final void rule__ParametersAndQualifiers__Alternatives_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1849:1: ( ( '&' ) | ( '&&' ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==61) ) {
                alt12=1;
            }
            else if ( (LA12_0==62) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1850:1: ( '&' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1850:1: ( '&' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1851:1: '&'
                    {
                     before(grammarAccess.getParametersAndQualifiersAccess().getAmpersandKeyword_5_0()); 
                    match(input,61,FOLLOW_61_in_rule__ParametersAndQualifiers__Alternatives_53856); 
                     after(grammarAccess.getParametersAndQualifiersAccess().getAmpersandKeyword_5_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1858:6: ( '&&' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1858:6: ( '&&' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1859:1: '&&'
                    {
                     before(grammarAccess.getParametersAndQualifiersAccess().getAmpersandAmpersandKeyword_5_1()); 
                    match(input,62,FOLLOW_62_in_rule__ParametersAndQualifiers__Alternatives_53876); 
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


    // $ANTLR start "rule__PtrOperator__Alternatives"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1871:1: rule__PtrOperator__Alternatives : ( ( ( rule__PtrOperator__Group_0__0 ) ) | ( ( rule__PtrOperator__Group_1__0 ) ) | ( ( rule__PtrOperator__Group_2__0 ) ) | ( ( rule__PtrOperator__Group_3__0 ) ) );
    public final void rule__PtrOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1875:1: ( ( ( rule__PtrOperator__Group_0__0 ) ) | ( ( rule__PtrOperator__Group_1__0 ) ) | ( ( rule__PtrOperator__Group_2__0 ) ) | ( ( rule__PtrOperator__Group_3__0 ) ) )
            int alt13=4;
            switch ( input.LA(1) ) {
            case 67:
                {
                alt13=1;
                }
                break;
            case 61:
                {
                alt13=2;
                }
                break;
            case 62:
                {
                alt13=3;
                }
                break;
            case 44:
            case 103:
                {
                alt13=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1876:1: ( ( rule__PtrOperator__Group_0__0 ) )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1876:1: ( ( rule__PtrOperator__Group_0__0 ) )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1877:1: ( rule__PtrOperator__Group_0__0 )
                    {
                     before(grammarAccess.getPtrOperatorAccess().getGroup_0()); 
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1878:1: ( rule__PtrOperator__Group_0__0 )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1878:2: rule__PtrOperator__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__PtrOperator__Group_0__0_in_rule__PtrOperator__Alternatives3910);
                    rule__PtrOperator__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPtrOperatorAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1882:6: ( ( rule__PtrOperator__Group_1__0 ) )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1882:6: ( ( rule__PtrOperator__Group_1__0 ) )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1883:1: ( rule__PtrOperator__Group_1__0 )
                    {
                     before(grammarAccess.getPtrOperatorAccess().getGroup_1()); 
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1884:1: ( rule__PtrOperator__Group_1__0 )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1884:2: rule__PtrOperator__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__PtrOperator__Group_1__0_in_rule__PtrOperator__Alternatives3928);
                    rule__PtrOperator__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPtrOperatorAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1888:6: ( ( rule__PtrOperator__Group_2__0 ) )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1888:6: ( ( rule__PtrOperator__Group_2__0 ) )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1889:1: ( rule__PtrOperator__Group_2__0 )
                    {
                     before(grammarAccess.getPtrOperatorAccess().getGroup_2()); 
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1890:1: ( rule__PtrOperator__Group_2__0 )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1890:2: rule__PtrOperator__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__PtrOperator__Group_2__0_in_rule__PtrOperator__Alternatives3946);
                    rule__PtrOperator__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPtrOperatorAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1894:6: ( ( rule__PtrOperator__Group_3__0 ) )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1894:6: ( ( rule__PtrOperator__Group_3__0 ) )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1895:1: ( rule__PtrOperator__Group_3__0 )
                    {
                     before(grammarAccess.getPtrOperatorAccess().getGroup_3()); 
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1896:1: ( rule__PtrOperator__Group_3__0 )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1896:2: rule__PtrOperator__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__PtrOperator__Group_3__0_in_rule__PtrOperator__Alternatives3964);
                    rule__PtrOperator__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPtrOperatorAccess().getGroup_3()); 

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
    // $ANTLR end "rule__PtrOperator__Alternatives"


    // $ANTLR start "rule__PtrOperator__Alternatives_0_2"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1905:1: rule__PtrOperator__Alternatives_0_2 : ( ( 'const' ) | ( 'volatile' ) );
    public final void rule__PtrOperator__Alternatives_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1909:1: ( ( 'const' ) | ( 'volatile' ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==59) ) {
                alt14=1;
            }
            else if ( (LA14_0==60) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1910:1: ( 'const' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1910:1: ( 'const' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1911:1: 'const'
                    {
                     before(grammarAccess.getPtrOperatorAccess().getConstKeyword_0_2_0()); 
                    match(input,59,FOLLOW_59_in_rule__PtrOperator__Alternatives_0_23998); 
                     after(grammarAccess.getPtrOperatorAccess().getConstKeyword_0_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1918:6: ( 'volatile' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1918:6: ( 'volatile' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1919:1: 'volatile'
                    {
                     before(grammarAccess.getPtrOperatorAccess().getVolatileKeyword_0_2_1()); 
                    match(input,60,FOLLOW_60_in_rule__PtrOperator__Alternatives_0_24018); 
                     after(grammarAccess.getPtrOperatorAccess().getVolatileKeyword_0_2_1()); 

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
    // $ANTLR end "rule__PtrOperator__Alternatives_0_2"


    // $ANTLR start "rule__PtrOperator__Alternatives_3_4"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1931:1: rule__PtrOperator__Alternatives_3_4 : ( ( 'const' ) | ( 'volatile' ) );
    public final void rule__PtrOperator__Alternatives_3_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1935:1: ( ( 'const' ) | ( 'volatile' ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==59) ) {
                alt15=1;
            }
            else if ( (LA15_0==60) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1936:1: ( 'const' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1936:1: ( 'const' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1937:1: 'const'
                    {
                     before(grammarAccess.getPtrOperatorAccess().getConstKeyword_3_4_0()); 
                    match(input,59,FOLLOW_59_in_rule__PtrOperator__Alternatives_3_44053); 
                     after(grammarAccess.getPtrOperatorAccess().getConstKeyword_3_4_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1944:6: ( 'volatile' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1944:6: ( 'volatile' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1945:1: 'volatile'
                    {
                     before(grammarAccess.getPtrOperatorAccess().getVolatileKeyword_3_4_1()); 
                    match(input,60,FOLLOW_60_in_rule__PtrOperator__Alternatives_3_44073); 
                     after(grammarAccess.getPtrOperatorAccess().getVolatileKeyword_3_4_1()); 

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
    // $ANTLR end "rule__PtrOperator__Alternatives_3_4"


    // $ANTLR start "rule__DeclaratorId__Alternatives"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1957:1: rule__DeclaratorId__Alternatives : ( ( ( rule__DeclaratorId__Group_0__0 ) ) | ( ( rule__DeclaratorId__Group_1__0 ) ) );
    public final void rule__DeclaratorId__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1961:1: ( ( ( rule__DeclaratorId__Group_0__0 ) ) | ( ( rule__DeclaratorId__Group_1__0 ) ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==41||LA16_0==101) ) {
                alt16=1;
            }
            else if ( (LA16_0==44||LA16_0==55||LA16_0==103) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1962:1: ( ( rule__DeclaratorId__Group_0__0 ) )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1962:1: ( ( rule__DeclaratorId__Group_0__0 ) )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1963:1: ( rule__DeclaratorId__Group_0__0 )
                    {
                     before(grammarAccess.getDeclaratorIdAccess().getGroup_0()); 
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1964:1: ( rule__DeclaratorId__Group_0__0 )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1964:2: rule__DeclaratorId__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__DeclaratorId__Group_0__0_in_rule__DeclaratorId__Alternatives4107);
                    rule__DeclaratorId__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDeclaratorIdAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1968:6: ( ( rule__DeclaratorId__Group_1__0 ) )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1968:6: ( ( rule__DeclaratorId__Group_1__0 ) )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1969:1: ( rule__DeclaratorId__Group_1__0 )
                    {
                     before(grammarAccess.getDeclaratorIdAccess().getGroup_1()); 
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1970:1: ( rule__DeclaratorId__Group_1__0 )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1970:2: rule__DeclaratorId__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__DeclaratorId__Group_1__0_in_rule__DeclaratorId__Alternatives4125);
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


    // $ANTLR start "rule__OverloadableOperator__Alternatives"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1979:1: rule__OverloadableOperator__Alternatives : ( ( 'new' ) | ( 'delete' ) | ( ( rule__OverloadableOperator__Group_2__0 ) ) | ( ( rule__OverloadableOperator__Group_3__0 ) ) | ( '+' ) | ( '-' ) | ( '*' ) | ( '/' ) | ( '%' ) | ( '^' ) | ( '&' ) | ( '|' ) | ( '~' ) | ( '!' ) | ( '=' ) | ( '<' ) | ( '>' ) | ( '+=' ) | ( '-=' ) | ( '*=' ) | ( '/=' ) | ( '%=' ) | ( '^=' ) | ( '&=' ) | ( '|=' ) | ( '<<' ) | ( '>>' ) | ( '>>=' ) | ( '<<=' ) | ( '==' ) | ( '!=' ) | ( '<=' ) | ( '>=' ) | ( '&&' ) | ( '||' ) | ( '++' ) | ( '--' ) | ( ',' ) | ( '->*' ) | ( '->' ) | ( '()' ) | ( '[]' ) );
    public final void rule__OverloadableOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1983:1: ( ( 'new' ) | ( 'delete' ) | ( ( rule__OverloadableOperator__Group_2__0 ) ) | ( ( rule__OverloadableOperator__Group_3__0 ) ) | ( '+' ) | ( '-' ) | ( '*' ) | ( '/' ) | ( '%' ) | ( '^' ) | ( '&' ) | ( '|' ) | ( '~' ) | ( '!' ) | ( '=' ) | ( '<' ) | ( '>' ) | ( '+=' ) | ( '-=' ) | ( '*=' ) | ( '/=' ) | ( '%=' ) | ( '^=' ) | ( '&=' ) | ( '|=' ) | ( '<<' ) | ( '>>' ) | ( '>>=' ) | ( '<<=' ) | ( '==' ) | ( '!=' ) | ( '<=' ) | ( '>=' ) | ( '&&' ) | ( '||' ) | ( '++' ) | ( '--' ) | ( ',' ) | ( '->*' ) | ( '->' ) | ( '()' ) | ( '[]' ) )
            int alt17=42;
            alt17 = dfa17.predict(input);
            switch (alt17) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1984:1: ( 'new' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1984:1: ( 'new' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1985:1: 'new'
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getNewKeyword_0()); 
                    match(input,63,FOLLOW_63_in_rule__OverloadableOperator__Alternatives4159); 
                     after(grammarAccess.getOverloadableOperatorAccess().getNewKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1992:6: ( 'delete' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1992:6: ( 'delete' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1993:1: 'delete'
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getDeleteKeyword_1()); 
                    match(input,64,FOLLOW_64_in_rule__OverloadableOperator__Alternatives4179); 
                     after(grammarAccess.getOverloadableOperatorAccess().getDeleteKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2000:6: ( ( rule__OverloadableOperator__Group_2__0 ) )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2000:6: ( ( rule__OverloadableOperator__Group_2__0 ) )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2001:1: ( rule__OverloadableOperator__Group_2__0 )
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getGroup_2()); 
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2002:1: ( rule__OverloadableOperator__Group_2__0 )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2002:2: rule__OverloadableOperator__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__OverloadableOperator__Group_2__0_in_rule__OverloadableOperator__Alternatives4198);
                    rule__OverloadableOperator__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getOverloadableOperatorAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2006:6: ( ( rule__OverloadableOperator__Group_3__0 ) )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2006:6: ( ( rule__OverloadableOperator__Group_3__0 ) )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2007:1: ( rule__OverloadableOperator__Group_3__0 )
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getGroup_3()); 
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2008:1: ( rule__OverloadableOperator__Group_3__0 )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2008:2: rule__OverloadableOperator__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__OverloadableOperator__Group_3__0_in_rule__OverloadableOperator__Alternatives4216);
                    rule__OverloadableOperator__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getOverloadableOperatorAccess().getGroup_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2012:6: ( '+' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2012:6: ( '+' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2013:1: '+'
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getPlusSignKeyword_4()); 
                    match(input,65,FOLLOW_65_in_rule__OverloadableOperator__Alternatives4235); 
                     after(grammarAccess.getOverloadableOperatorAccess().getPlusSignKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2020:6: ( '-' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2020:6: ( '-' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2021:1: '-'
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getHyphenMinusKeyword_5()); 
                    match(input,66,FOLLOW_66_in_rule__OverloadableOperator__Alternatives4255); 
                     after(grammarAccess.getOverloadableOperatorAccess().getHyphenMinusKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2028:6: ( '*' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2028:6: ( '*' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2029:1: '*'
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getAsteriskKeyword_6()); 
                    match(input,67,FOLLOW_67_in_rule__OverloadableOperator__Alternatives4275); 
                     after(grammarAccess.getOverloadableOperatorAccess().getAsteriskKeyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2036:6: ( '/' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2036:6: ( '/' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2037:1: '/'
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getSolidusKeyword_7()); 
                    match(input,68,FOLLOW_68_in_rule__OverloadableOperator__Alternatives4295); 
                     after(grammarAccess.getOverloadableOperatorAccess().getSolidusKeyword_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2044:6: ( '%' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2044:6: ( '%' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2045:1: '%'
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getPercentSignKeyword_8()); 
                    match(input,69,FOLLOW_69_in_rule__OverloadableOperator__Alternatives4315); 
                     after(grammarAccess.getOverloadableOperatorAccess().getPercentSignKeyword_8()); 

                    }


                    }
                    break;
                case 10 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2052:6: ( '^' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2052:6: ( '^' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2053:1: '^'
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getCircumflexAccentKeyword_9()); 
                    match(input,70,FOLLOW_70_in_rule__OverloadableOperator__Alternatives4335); 
                     after(grammarAccess.getOverloadableOperatorAccess().getCircumflexAccentKeyword_9()); 

                    }


                    }
                    break;
                case 11 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2060:6: ( '&' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2060:6: ( '&' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2061:1: '&'
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getAmpersandKeyword_10()); 
                    match(input,61,FOLLOW_61_in_rule__OverloadableOperator__Alternatives4355); 
                     after(grammarAccess.getOverloadableOperatorAccess().getAmpersandKeyword_10()); 

                    }


                    }
                    break;
                case 12 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2068:6: ( '|' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2068:6: ( '|' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2069:1: '|'
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getVerticalLineKeyword_11()); 
                    match(input,71,FOLLOW_71_in_rule__OverloadableOperator__Alternatives4375); 
                     after(grammarAccess.getOverloadableOperatorAccess().getVerticalLineKeyword_11()); 

                    }


                    }
                    break;
                case 13 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2076:6: ( '~' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2076:6: ( '~' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2077:1: '~'
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getTildeKeyword_12()); 
                    match(input,72,FOLLOW_72_in_rule__OverloadableOperator__Alternatives4395); 
                     after(grammarAccess.getOverloadableOperatorAccess().getTildeKeyword_12()); 

                    }


                    }
                    break;
                case 14 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2084:6: ( '!' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2084:6: ( '!' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2085:1: '!'
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getExclamationMarkKeyword_13()); 
                    match(input,73,FOLLOW_73_in_rule__OverloadableOperator__Alternatives4415); 
                     after(grammarAccess.getOverloadableOperatorAccess().getExclamationMarkKeyword_13()); 

                    }


                    }
                    break;
                case 15 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2092:6: ( '=' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2092:6: ( '=' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2093:1: '='
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getEqualsSignKeyword_14()); 
                    match(input,74,FOLLOW_74_in_rule__OverloadableOperator__Alternatives4435); 
                     after(grammarAccess.getOverloadableOperatorAccess().getEqualsSignKeyword_14()); 

                    }


                    }
                    break;
                case 16 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2100:6: ( '<' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2100:6: ( '<' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2101:1: '<'
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getLessThanSignKeyword_15()); 
                    match(input,75,FOLLOW_75_in_rule__OverloadableOperator__Alternatives4455); 
                     after(grammarAccess.getOverloadableOperatorAccess().getLessThanSignKeyword_15()); 

                    }


                    }
                    break;
                case 17 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2108:6: ( '>' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2108:6: ( '>' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2109:1: '>'
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getGreaterThanSignKeyword_16()); 
                    match(input,76,FOLLOW_76_in_rule__OverloadableOperator__Alternatives4475); 
                     after(grammarAccess.getOverloadableOperatorAccess().getGreaterThanSignKeyword_16()); 

                    }


                    }
                    break;
                case 18 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2116:6: ( '+=' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2116:6: ( '+=' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2117:1: '+='
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getPlusSignEqualsSignKeyword_17()); 
                    match(input,77,FOLLOW_77_in_rule__OverloadableOperator__Alternatives4495); 
                     after(grammarAccess.getOverloadableOperatorAccess().getPlusSignEqualsSignKeyword_17()); 

                    }


                    }
                    break;
                case 19 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2124:6: ( '-=' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2124:6: ( '-=' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2125:1: '-='
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getHyphenMinusEqualsSignKeyword_18()); 
                    match(input,78,FOLLOW_78_in_rule__OverloadableOperator__Alternatives4515); 
                     after(grammarAccess.getOverloadableOperatorAccess().getHyphenMinusEqualsSignKeyword_18()); 

                    }


                    }
                    break;
                case 20 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2132:6: ( '*=' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2132:6: ( '*=' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2133:1: '*='
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getAsteriskEqualsSignKeyword_19()); 
                    match(input,79,FOLLOW_79_in_rule__OverloadableOperator__Alternatives4535); 
                     after(grammarAccess.getOverloadableOperatorAccess().getAsteriskEqualsSignKeyword_19()); 

                    }


                    }
                    break;
                case 21 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2140:6: ( '/=' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2140:6: ( '/=' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2141:1: '/='
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getSolidusEqualsSignKeyword_20()); 
                    match(input,80,FOLLOW_80_in_rule__OverloadableOperator__Alternatives4555); 
                     after(grammarAccess.getOverloadableOperatorAccess().getSolidusEqualsSignKeyword_20()); 

                    }


                    }
                    break;
                case 22 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2148:6: ( '%=' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2148:6: ( '%=' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2149:1: '%='
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getPercentSignEqualsSignKeyword_21()); 
                    match(input,81,FOLLOW_81_in_rule__OverloadableOperator__Alternatives4575); 
                     after(grammarAccess.getOverloadableOperatorAccess().getPercentSignEqualsSignKeyword_21()); 

                    }


                    }
                    break;
                case 23 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2156:6: ( '^=' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2156:6: ( '^=' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2157:1: '^='
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getCircumflexAccentEqualsSignKeyword_22()); 
                    match(input,82,FOLLOW_82_in_rule__OverloadableOperator__Alternatives4595); 
                     after(grammarAccess.getOverloadableOperatorAccess().getCircumflexAccentEqualsSignKeyword_22()); 

                    }


                    }
                    break;
                case 24 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2164:6: ( '&=' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2164:6: ( '&=' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2165:1: '&='
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getAmpersandEqualsSignKeyword_23()); 
                    match(input,83,FOLLOW_83_in_rule__OverloadableOperator__Alternatives4615); 
                     after(grammarAccess.getOverloadableOperatorAccess().getAmpersandEqualsSignKeyword_23()); 

                    }


                    }
                    break;
                case 25 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2172:6: ( '|=' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2172:6: ( '|=' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2173:1: '|='
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getVerticalLineEqualsSignKeyword_24()); 
                    match(input,84,FOLLOW_84_in_rule__OverloadableOperator__Alternatives4635); 
                     after(grammarAccess.getOverloadableOperatorAccess().getVerticalLineEqualsSignKeyword_24()); 

                    }


                    }
                    break;
                case 26 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2180:6: ( '<<' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2180:6: ( '<<' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2181:1: '<<'
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getLessThanSignLessThanSignKeyword_25()); 
                    match(input,85,FOLLOW_85_in_rule__OverloadableOperator__Alternatives4655); 
                     after(grammarAccess.getOverloadableOperatorAccess().getLessThanSignLessThanSignKeyword_25()); 

                    }


                    }
                    break;
                case 27 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2188:6: ( '>>' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2188:6: ( '>>' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2189:1: '>>'
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getGreaterThanSignGreaterThanSignKeyword_26()); 
                    match(input,86,FOLLOW_86_in_rule__OverloadableOperator__Alternatives4675); 
                     after(grammarAccess.getOverloadableOperatorAccess().getGreaterThanSignGreaterThanSignKeyword_26()); 

                    }


                    }
                    break;
                case 28 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2196:6: ( '>>=' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2196:6: ( '>>=' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2197:1: '>>='
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getGreaterThanSignGreaterThanSignEqualsSignKeyword_27()); 
                    match(input,87,FOLLOW_87_in_rule__OverloadableOperator__Alternatives4695); 
                     after(grammarAccess.getOverloadableOperatorAccess().getGreaterThanSignGreaterThanSignEqualsSignKeyword_27()); 

                    }


                    }
                    break;
                case 29 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2204:6: ( '<<=' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2204:6: ( '<<=' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2205:1: '<<='
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getLessThanSignLessThanSignEqualsSignKeyword_28()); 
                    match(input,88,FOLLOW_88_in_rule__OverloadableOperator__Alternatives4715); 
                     after(grammarAccess.getOverloadableOperatorAccess().getLessThanSignLessThanSignEqualsSignKeyword_28()); 

                    }


                    }
                    break;
                case 30 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2212:6: ( '==' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2212:6: ( '==' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2213:1: '=='
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getEqualsSignEqualsSignKeyword_29()); 
                    match(input,89,FOLLOW_89_in_rule__OverloadableOperator__Alternatives4735); 
                     after(grammarAccess.getOverloadableOperatorAccess().getEqualsSignEqualsSignKeyword_29()); 

                    }


                    }
                    break;
                case 31 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2220:6: ( '!=' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2220:6: ( '!=' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2221:1: '!='
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getExclamationMarkEqualsSignKeyword_30()); 
                    match(input,90,FOLLOW_90_in_rule__OverloadableOperator__Alternatives4755); 
                     after(grammarAccess.getOverloadableOperatorAccess().getExclamationMarkEqualsSignKeyword_30()); 

                    }


                    }
                    break;
                case 32 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2228:6: ( '<=' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2228:6: ( '<=' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2229:1: '<='
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getLessThanSignEqualsSignKeyword_31()); 
                    match(input,91,FOLLOW_91_in_rule__OverloadableOperator__Alternatives4775); 
                     after(grammarAccess.getOverloadableOperatorAccess().getLessThanSignEqualsSignKeyword_31()); 

                    }


                    }
                    break;
                case 33 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2236:6: ( '>=' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2236:6: ( '>=' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2237:1: '>='
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getGreaterThanSignEqualsSignKeyword_32()); 
                    match(input,92,FOLLOW_92_in_rule__OverloadableOperator__Alternatives4795); 
                     after(grammarAccess.getOverloadableOperatorAccess().getGreaterThanSignEqualsSignKeyword_32()); 

                    }


                    }
                    break;
                case 34 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2244:6: ( '&&' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2244:6: ( '&&' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2245:1: '&&'
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getAmpersandAmpersandKeyword_33()); 
                    match(input,62,FOLLOW_62_in_rule__OverloadableOperator__Alternatives4815); 
                     after(grammarAccess.getOverloadableOperatorAccess().getAmpersandAmpersandKeyword_33()); 

                    }


                    }
                    break;
                case 35 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2252:6: ( '||' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2252:6: ( '||' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2253:1: '||'
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getVerticalLineVerticalLineKeyword_34()); 
                    match(input,93,FOLLOW_93_in_rule__OverloadableOperator__Alternatives4835); 
                     after(grammarAccess.getOverloadableOperatorAccess().getVerticalLineVerticalLineKeyword_34()); 

                    }


                    }
                    break;
                case 36 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2260:6: ( '++' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2260:6: ( '++' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2261:1: '++'
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getPlusSignPlusSignKeyword_35()); 
                    match(input,94,FOLLOW_94_in_rule__OverloadableOperator__Alternatives4855); 
                     after(grammarAccess.getOverloadableOperatorAccess().getPlusSignPlusSignKeyword_35()); 

                    }


                    }
                    break;
                case 37 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2268:6: ( '--' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2268:6: ( '--' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2269:1: '--'
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getHyphenMinusHyphenMinusKeyword_36()); 
                    match(input,95,FOLLOW_95_in_rule__OverloadableOperator__Alternatives4875); 
                     after(grammarAccess.getOverloadableOperatorAccess().getHyphenMinusHyphenMinusKeyword_36()); 

                    }


                    }
                    break;
                case 38 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2276:6: ( ',' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2276:6: ( ',' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2277:1: ','
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getCommaKeyword_37()); 
                    match(input,96,FOLLOW_96_in_rule__OverloadableOperator__Alternatives4895); 
                     after(grammarAccess.getOverloadableOperatorAccess().getCommaKeyword_37()); 

                    }


                    }
                    break;
                case 39 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2284:6: ( '->*' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2284:6: ( '->*' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2285:1: '->*'
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getHyphenMinusGreaterThanSignAsteriskKeyword_38()); 
                    match(input,97,FOLLOW_97_in_rule__OverloadableOperator__Alternatives4915); 
                     after(grammarAccess.getOverloadableOperatorAccess().getHyphenMinusGreaterThanSignAsteriskKeyword_38()); 

                    }


                    }
                    break;
                case 40 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2292:6: ( '->' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2292:6: ( '->' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2293:1: '->'
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getHyphenMinusGreaterThanSignKeyword_39()); 
                    match(input,98,FOLLOW_98_in_rule__OverloadableOperator__Alternatives4935); 
                     after(grammarAccess.getOverloadableOperatorAccess().getHyphenMinusGreaterThanSignKeyword_39()); 

                    }


                    }
                    break;
                case 41 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2300:6: ( '()' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2300:6: ( '()' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2301:1: '()'
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getLeftParenthesisRightParenthesisKeyword_40()); 
                    match(input,99,FOLLOW_99_in_rule__OverloadableOperator__Alternatives4955); 
                     after(grammarAccess.getOverloadableOperatorAccess().getLeftParenthesisRightParenthesisKeyword_40()); 

                    }


                    }
                    break;
                case 42 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2308:6: ( '[]' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2308:6: ( '[]' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2309:1: '[]'
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getLeftSquareBracketRightSquareBracketKeyword_41()); 
                    match(input,100,FOLLOW_100_in_rule__OverloadableOperator__Alternatives4975); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2321:1: rule__TemplateParameter__Alternatives : ( ( ruleTypeParameter ) | ( ruleParameterDeclaration ) );
    public final void rule__TemplateParameter__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2325:1: ( ( ruleTypeParameter ) | ( ruleParameterDeclaration ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=111 && LA18_0<=113)) ) {
                alt18=1;
            }
            else if ( (LA18_0==42) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2326:1: ( ruleTypeParameter )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2326:1: ( ruleTypeParameter )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2327:1: ruleTypeParameter
                    {
                     before(grammarAccess.getTemplateParameterAccess().getTypeParameterParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleTypeParameter_in_rule__TemplateParameter__Alternatives5009);
                    ruleTypeParameter();

                    state._fsp--;

                     after(grammarAccess.getTemplateParameterAccess().getTypeParameterParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2332:6: ( ruleParameterDeclaration )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2332:6: ( ruleParameterDeclaration )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2333:1: ruleParameterDeclaration
                    {
                     before(grammarAccess.getTemplateParameterAccess().getParameterDeclarationParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleParameterDeclaration_in_rule__TemplateParameter__Alternatives5026);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2343:1: rule__TypeParameter__Alternatives : ( ( ( rule__TypeParameter__Group_0__0 ) ) | ( ( rule__TypeParameter__Group_1__0 ) ) | ( ( rule__TypeParameter__Group_2__0 ) ) );
    public final void rule__TypeParameter__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2347:1: ( ( ( rule__TypeParameter__Group_0__0 ) ) | ( ( rule__TypeParameter__Group_1__0 ) ) | ( ( rule__TypeParameter__Group_2__0 ) ) )
            int alt19=3;
            switch ( input.LA(1) ) {
            case 111:
                {
                alt19=1;
                }
                break;
            case 112:
                {
                alt19=2;
                }
                break;
            case 113:
                {
                alt19=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2348:1: ( ( rule__TypeParameter__Group_0__0 ) )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2348:1: ( ( rule__TypeParameter__Group_0__0 ) )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2349:1: ( rule__TypeParameter__Group_0__0 )
                    {
                     before(grammarAccess.getTypeParameterAccess().getGroup_0()); 
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2350:1: ( rule__TypeParameter__Group_0__0 )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2350:2: rule__TypeParameter__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__TypeParameter__Group_0__0_in_rule__TypeParameter__Alternatives5058);
                    rule__TypeParameter__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeParameterAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2354:6: ( ( rule__TypeParameter__Group_1__0 ) )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2354:6: ( ( rule__TypeParameter__Group_1__0 ) )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2355:1: ( rule__TypeParameter__Group_1__0 )
                    {
                     before(grammarAccess.getTypeParameterAccess().getGroup_1()); 
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2356:1: ( rule__TypeParameter__Group_1__0 )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2356:2: rule__TypeParameter__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__TypeParameter__Group_1__0_in_rule__TypeParameter__Alternatives5076);
                    rule__TypeParameter__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeParameterAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2360:6: ( ( rule__TypeParameter__Group_2__0 ) )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2360:6: ( ( rule__TypeParameter__Group_2__0 ) )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2361:1: ( rule__TypeParameter__Group_2__0 )
                    {
                     before(grammarAccess.getTypeParameterAccess().getGroup_2()); 
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2362:1: ( rule__TypeParameter__Group_2__0 )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2362:2: rule__TypeParameter__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__TypeParameter__Group_2__0_in_rule__TypeParameter__Alternatives5094);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2371:1: rule__TypeParameter__Alternatives_0_1 : ( ( ( rule__TypeParameter__Group_0_1_0__0 ) ) | ( ( rule__TypeParameter__Group_0_1_1__0 ) ) );
    public final void rule__TypeParameter__Alternatives_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2375:1: ( ( ( rule__TypeParameter__Group_0_1_0__0 ) ) | ( ( rule__TypeParameter__Group_0_1_1__0 ) ) )
            int alt20=2;
            switch ( input.LA(1) ) {
            case EOF:
            case 76:
            case 96:
            case 101:
                {
                alt20=1;
                }
                break;
            case RULE_ID:
                {
                int LA20_2 = input.LA(2);

                if ( (LA20_2==74) ) {
                    alt20=2;
                }
                else if ( (LA20_2==EOF||LA20_2==76||LA20_2==96) ) {
                    alt20=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 2, input);

                    throw nvae;
                }
                }
                break;
            case 74:
                {
                alt20=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2376:1: ( ( rule__TypeParameter__Group_0_1_0__0 ) )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2376:1: ( ( rule__TypeParameter__Group_0_1_0__0 ) )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2377:1: ( rule__TypeParameter__Group_0_1_0__0 )
                    {
                     before(grammarAccess.getTypeParameterAccess().getGroup_0_1_0()); 
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2378:1: ( rule__TypeParameter__Group_0_1_0__0 )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2378:2: rule__TypeParameter__Group_0_1_0__0
                    {
                    pushFollow(FOLLOW_rule__TypeParameter__Group_0_1_0__0_in_rule__TypeParameter__Alternatives_0_15127);
                    rule__TypeParameter__Group_0_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeParameterAccess().getGroup_0_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2382:6: ( ( rule__TypeParameter__Group_0_1_1__0 ) )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2382:6: ( ( rule__TypeParameter__Group_0_1_1__0 ) )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2383:1: ( rule__TypeParameter__Group_0_1_1__0 )
                    {
                     before(grammarAccess.getTypeParameterAccess().getGroup_0_1_1()); 
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2384:1: ( rule__TypeParameter__Group_0_1_1__0 )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2384:2: rule__TypeParameter__Group_0_1_1__0
                    {
                    pushFollow(FOLLOW_rule__TypeParameter__Group_0_1_1__0_in_rule__TypeParameter__Alternatives_0_15145);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2393:1: rule__TypeParameter__Alternatives_1_1 : ( ( ( rule__TypeParameter__Group_1_1_0__0 ) ) | ( ( rule__TypeParameter__Group_1_1_1__0 ) ) );
    public final void rule__TypeParameter__Alternatives_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2397:1: ( ( ( rule__TypeParameter__Group_1_1_0__0 ) ) | ( ( rule__TypeParameter__Group_1_1_1__0 ) ) )
            int alt21=2;
            switch ( input.LA(1) ) {
            case EOF:
            case 76:
            case 96:
            case 101:
                {
                alt21=1;
                }
                break;
            case RULE_ID:
                {
                int LA21_2 = input.LA(2);

                if ( (LA21_2==74) ) {
                    alt21=2;
                }
                else if ( (LA21_2==EOF||LA21_2==76||LA21_2==96) ) {
                    alt21=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 21, 2, input);

                    throw nvae;
                }
                }
                break;
            case 74:
                {
                alt21=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2398:1: ( ( rule__TypeParameter__Group_1_1_0__0 ) )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2398:1: ( ( rule__TypeParameter__Group_1_1_0__0 ) )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2399:1: ( rule__TypeParameter__Group_1_1_0__0 )
                    {
                     before(grammarAccess.getTypeParameterAccess().getGroup_1_1_0()); 
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2400:1: ( rule__TypeParameter__Group_1_1_0__0 )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2400:2: rule__TypeParameter__Group_1_1_0__0
                    {
                    pushFollow(FOLLOW_rule__TypeParameter__Group_1_1_0__0_in_rule__TypeParameter__Alternatives_1_15178);
                    rule__TypeParameter__Group_1_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeParameterAccess().getGroup_1_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2404:6: ( ( rule__TypeParameter__Group_1_1_1__0 ) )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2404:6: ( ( rule__TypeParameter__Group_1_1_1__0 ) )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2405:1: ( rule__TypeParameter__Group_1_1_1__0 )
                    {
                     before(grammarAccess.getTypeParameterAccess().getGroup_1_1_1()); 
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2406:1: ( rule__TypeParameter__Group_1_1_1__0 )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2406:2: rule__TypeParameter__Group_1_1_1__0
                    {
                    pushFollow(FOLLOW_rule__TypeParameter__Group_1_1_1__0_in_rule__TypeParameter__Alternatives_1_15196);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2415:1: rule__TypeParameter__Alternatives_2_5 : ( ( ( rule__TypeParameter__Group_2_5_0__0 ) ) | ( ( rule__TypeParameter__Group_2_5_1__0 ) ) );
    public final void rule__TypeParameter__Alternatives_2_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2419:1: ( ( ( rule__TypeParameter__Group_2_5_0__0 ) ) | ( ( rule__TypeParameter__Group_2_5_1__0 ) ) )
            int alt22=2;
            switch ( input.LA(1) ) {
            case EOF:
            case 76:
            case 96:
            case 101:
                {
                alt22=1;
                }
                break;
            case RULE_ID:
                {
                int LA22_2 = input.LA(2);

                if ( (LA22_2==EOF||LA22_2==76||LA22_2==96) ) {
                    alt22=1;
                }
                else if ( (LA22_2==74) ) {
                    alt22=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 22, 2, input);

                    throw nvae;
                }
                }
                break;
            case 74:
                {
                alt22=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2420:1: ( ( rule__TypeParameter__Group_2_5_0__0 ) )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2420:1: ( ( rule__TypeParameter__Group_2_5_0__0 ) )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2421:1: ( rule__TypeParameter__Group_2_5_0__0 )
                    {
                     before(grammarAccess.getTypeParameterAccess().getGroup_2_5_0()); 
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2422:1: ( rule__TypeParameter__Group_2_5_0__0 )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2422:2: rule__TypeParameter__Group_2_5_0__0
                    {
                    pushFollow(FOLLOW_rule__TypeParameter__Group_2_5_0__0_in_rule__TypeParameter__Alternatives_2_55229);
                    rule__TypeParameter__Group_2_5_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeParameterAccess().getGroup_2_5_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2426:6: ( ( rule__TypeParameter__Group_2_5_1__0 ) )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2426:6: ( ( rule__TypeParameter__Group_2_5_1__0 ) )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2427:1: ( rule__TypeParameter__Group_2_5_1__0 )
                    {
                     before(grammarAccess.getTypeParameterAccess().getGroup_2_5_1()); 
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2428:1: ( rule__TypeParameter__Group_2_5_1__0 )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2428:2: rule__TypeParameter__Group_2_5_1__0
                    {
                    pushFollow(FOLLOW_rule__TypeParameter__Group_2_5_1__0_in_rule__TypeParameter__Alternatives_2_55247);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2438:1: rule__TemplateArgument__Alternatives : ( ( ruleConstantExpression ) | ( ruleTypeId ) | ( ruleIdExpression ) );
    public final void rule__TemplateArgument__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2442:1: ( ( ruleConstantExpression ) | ( ruleTypeId ) | ( ruleIdExpression ) )
            int alt23=3;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt23=1;
                }
                break;
            case 40:
                {
                alt23=2;
                }
                break;
            case 41:
                {
                alt23=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2443:1: ( ruleConstantExpression )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2443:1: ( ruleConstantExpression )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2444:1: ruleConstantExpression
                    {
                     before(grammarAccess.getTemplateArgumentAccess().getConstantExpressionParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleConstantExpression_in_rule__TemplateArgument__Alternatives5281);
                    ruleConstantExpression();

                    state._fsp--;

                     after(grammarAccess.getTemplateArgumentAccess().getConstantExpressionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2449:6: ( ruleTypeId )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2449:6: ( ruleTypeId )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2450:1: ruleTypeId
                    {
                     before(grammarAccess.getTemplateArgumentAccess().getTypeIdParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleTypeId_in_rule__TemplateArgument__Alternatives5298);
                    ruleTypeId();

                    state._fsp--;

                     after(grammarAccess.getTemplateArgumentAccess().getTypeIdParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2455:6: ( ruleIdExpression )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2455:6: ( ruleIdExpression )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2456:1: ruleIdExpression
                    {
                     before(grammarAccess.getTemplateArgumentAccess().getIdExpressionParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleIdExpression_in_rule__TemplateArgument__Alternatives5315);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2467:1: rule__ExceptionDeclaration__Alternatives : ( ( ( rule__ExceptionDeclaration__Group_0__0 ) ) | ( '...' ) );
    public final void rule__ExceptionDeclaration__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2471:1: ( ( ( rule__ExceptionDeclaration__Group_0__0 ) ) | ( '...' ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==47||LA24_0==104||LA24_0==106) ) {
                alt24=1;
            }
            else if ( (LA24_0==101) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2472:1: ( ( rule__ExceptionDeclaration__Group_0__0 ) )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2472:1: ( ( rule__ExceptionDeclaration__Group_0__0 ) )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2473:1: ( rule__ExceptionDeclaration__Group_0__0 )
                    {
                     before(grammarAccess.getExceptionDeclarationAccess().getGroup_0()); 
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2474:1: ( rule__ExceptionDeclaration__Group_0__0 )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2474:2: rule__ExceptionDeclaration__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__ExceptionDeclaration__Group_0__0_in_rule__ExceptionDeclaration__Alternatives5348);
                    rule__ExceptionDeclaration__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExceptionDeclarationAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2478:6: ( '...' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2478:6: ( '...' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2479:1: '...'
                    {
                     before(grammarAccess.getExceptionDeclarationAccess().getFullStopFullStopFullStopKeyword_1()); 
                    match(input,101,FOLLOW_101_in_rule__ExceptionDeclaration__Alternatives5367); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2491:1: rule__ExceptionDeclaration__Alternatives_0_2 : ( ( ruleDeclarator ) | ( ( ruleAbstractDeclarator )? ) );
    public final void rule__ExceptionDeclaration__Alternatives_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2495:1: ( ( ruleDeclarator ) | ( ( ruleAbstractDeclarator )? ) )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==41||LA26_0==44||LA26_0==55||(LA26_0>=61 && LA26_0<=62)||LA26_0==67||LA26_0==101||LA26_0==103||LA26_0==107) ) {
                alt26=1;
            }
            else if ( (LA26_0==EOF||LA26_0==48||LA26_0==108) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2496:1: ( ruleDeclarator )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2496:1: ( ruleDeclarator )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2497:1: ruleDeclarator
                    {
                     before(grammarAccess.getExceptionDeclarationAccess().getDeclaratorParserRuleCall_0_2_0()); 
                    pushFollow(FOLLOW_ruleDeclarator_in_rule__ExceptionDeclaration__Alternatives_0_25401);
                    ruleDeclarator();

                    state._fsp--;

                     after(grammarAccess.getExceptionDeclarationAccess().getDeclaratorParserRuleCall_0_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2502:6: ( ( ruleAbstractDeclarator )? )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2502:6: ( ( ruleAbstractDeclarator )? )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2503:1: ( ruleAbstractDeclarator )?
                    {
                     before(grammarAccess.getExceptionDeclarationAccess().getAbstractDeclaratorParserRuleCall_0_2_1()); 
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2504:1: ( ruleAbstractDeclarator )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==48) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2504:3: ruleAbstractDeclarator
                            {
                            pushFollow(FOLLOW_ruleAbstractDeclarator_in_rule__ExceptionDeclaration__Alternatives_0_25419);
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


    // $ANTLR start "rule__ExceptionSpecification__Alternatives"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2513:1: rule__ExceptionSpecification__Alternatives : ( ( ruleDynamicExceptionSpecification ) | ( ruleNoexceptSpecification ) );
    public final void rule__ExceptionSpecification__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2517:1: ( ( ruleDynamicExceptionSpecification ) | ( ruleNoexceptSpecification ) )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==115) ) {
                alt27=1;
            }
            else if ( (LA27_0==116) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2518:1: ( ruleDynamicExceptionSpecification )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2518:1: ( ruleDynamicExceptionSpecification )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2519:1: ruleDynamicExceptionSpecification
                    {
                     before(grammarAccess.getExceptionSpecificationAccess().getDynamicExceptionSpecificationParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleDynamicExceptionSpecification_in_rule__ExceptionSpecification__Alternatives5453);
                    ruleDynamicExceptionSpecification();

                    state._fsp--;

                     after(grammarAccess.getExceptionSpecificationAccess().getDynamicExceptionSpecificationParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2524:6: ( ruleNoexceptSpecification )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2524:6: ( ruleNoexceptSpecification )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2525:1: ruleNoexceptSpecification
                    {
                     before(grammarAccess.getExceptionSpecificationAccess().getNoexceptSpecificationParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleNoexceptSpecification_in_rule__ExceptionSpecification__Alternatives5470);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2537:1: rule__Token__Group_2__0 : rule__Token__Group_2__0__Impl rule__Token__Group_2__1 ;
    public final void rule__Token__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2541:1: ( rule__Token__Group_2__0__Impl rule__Token__Group_2__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2542:2: rule__Token__Group_2__0__Impl rule__Token__Group_2__1
            {
            pushFollow(FOLLOW_rule__Token__Group_2__0__Impl_in_rule__Token__Group_2__05500);
            rule__Token__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Token__Group_2__1_in_rule__Token__Group_2__05503);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2549:1: rule__Token__Group_2__0__Impl : ( RULE_PREPROCESSING_OP_OR_PUNC ) ;
    public final void rule__Token__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2553:1: ( ( RULE_PREPROCESSING_OP_OR_PUNC ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2554:1: ( RULE_PREPROCESSING_OP_OR_PUNC )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2554:1: ( RULE_PREPROCESSING_OP_OR_PUNC )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2555:1: RULE_PREPROCESSING_OP_OR_PUNC
            {
             before(grammarAccess.getTokenAccess().getPREPROCESSING_OP_OR_PUNCTerminalRuleCall_2_0()); 
            match(input,RULE_PREPROCESSING_OP_OR_PUNC,FOLLOW_RULE_PREPROCESSING_OP_OR_PUNC_in_rule__Token__Group_2__0__Impl5530); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2566:1: rule__Token__Group_2__1 : rule__Token__Group_2__1__Impl ;
    public final void rule__Token__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2570:1: ( rule__Token__Group_2__1__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2571:2: rule__Token__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Token__Group_2__1__Impl_in_rule__Token__Group_2__15559);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2577:1: rule__Token__Group_2__1__Impl : ( RULE_ID ) ;
    public final void rule__Token__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2581:1: ( ( RULE_ID ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2582:1: ( RULE_ID )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2582:1: ( RULE_ID )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2583:1: RULE_ID
            {
             before(grammarAccess.getTokenAccess().getIDTerminalRuleCall_2_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Token__Group_2__1__Impl5586); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2598:1: rule__Literal__Group_4__0 : rule__Literal__Group_4__0__Impl rule__Literal__Group_4__1 ;
    public final void rule__Literal__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2602:1: ( rule__Literal__Group_4__0__Impl rule__Literal__Group_4__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2603:2: rule__Literal__Group_4__0__Impl rule__Literal__Group_4__1
            {
            pushFollow(FOLLOW_rule__Literal__Group_4__0__Impl_in_rule__Literal__Group_4__05619);
            rule__Literal__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Literal__Group_4__1_in_rule__Literal__Group_4__05622);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2610:1: rule__Literal__Group_4__0__Impl : ( ( rule__Literal__Alternatives_4_0 ) ) ;
    public final void rule__Literal__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2614:1: ( ( ( rule__Literal__Alternatives_4_0 ) ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2615:1: ( ( rule__Literal__Alternatives_4_0 ) )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2615:1: ( ( rule__Literal__Alternatives_4_0 ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2616:1: ( rule__Literal__Alternatives_4_0 )
            {
             before(grammarAccess.getLiteralAccess().getAlternatives_4_0()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2617:1: ( rule__Literal__Alternatives_4_0 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2617:2: rule__Literal__Alternatives_4_0
            {
            pushFollow(FOLLOW_rule__Literal__Alternatives_4_0_in_rule__Literal__Group_4__0__Impl5649);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2627:1: rule__Literal__Group_4__1 : rule__Literal__Group_4__1__Impl ;
    public final void rule__Literal__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2631:1: ( rule__Literal__Group_4__1__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2632:2: rule__Literal__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Literal__Group_4__1__Impl_in_rule__Literal__Group_4__15679);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2638:1: rule__Literal__Group_4__1__Impl : ( 'nullptr' ) ;
    public final void rule__Literal__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2642:1: ( ( 'nullptr' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2643:1: ( 'nullptr' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2643:1: ( 'nullptr' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2644:1: 'nullptr'
            {
             before(grammarAccess.getLiteralAccess().getNullptrKeyword_4_1()); 
            match(input,102,FOLLOW_102_in_rule__Literal__Group_4__1__Impl5707); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2663:1: rule__QualifiedNamespaceSpecifier__Group__0 : rule__QualifiedNamespaceSpecifier__Group__0__Impl rule__QualifiedNamespaceSpecifier__Group__1 ;
    public final void rule__QualifiedNamespaceSpecifier__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2667:1: ( rule__QualifiedNamespaceSpecifier__Group__0__Impl rule__QualifiedNamespaceSpecifier__Group__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2668:2: rule__QualifiedNamespaceSpecifier__Group__0__Impl rule__QualifiedNamespaceSpecifier__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedNamespaceSpecifier__Group__0__Impl_in_rule__QualifiedNamespaceSpecifier__Group__05744);
            rule__QualifiedNamespaceSpecifier__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedNamespaceSpecifier__Group__1_in_rule__QualifiedNamespaceSpecifier__Group__05747);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2675:1: rule__QualifiedNamespaceSpecifier__Group__0__Impl : ( ( '::' )? ) ;
    public final void rule__QualifiedNamespaceSpecifier__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2679:1: ( ( ( '::' )? ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2680:1: ( ( '::' )? )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2680:1: ( ( '::' )? )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2681:1: ( '::' )?
            {
             before(grammarAccess.getQualifiedNamespaceSpecifierAccess().getColonColonKeyword_0()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2682:1: ( '::' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==103) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2683:2: '::'
                    {
                    match(input,103,FOLLOW_103_in_rule__QualifiedNamespaceSpecifier__Group__0__Impl5776); 

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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2694:1: rule__QualifiedNamespaceSpecifier__Group__1 : rule__QualifiedNamespaceSpecifier__Group__1__Impl rule__QualifiedNamespaceSpecifier__Group__2 ;
    public final void rule__QualifiedNamespaceSpecifier__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2698:1: ( rule__QualifiedNamespaceSpecifier__Group__1__Impl rule__QualifiedNamespaceSpecifier__Group__2 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2699:2: rule__QualifiedNamespaceSpecifier__Group__1__Impl rule__QualifiedNamespaceSpecifier__Group__2
            {
            pushFollow(FOLLOW_rule__QualifiedNamespaceSpecifier__Group__1__Impl_in_rule__QualifiedNamespaceSpecifier__Group__15809);
            rule__QualifiedNamespaceSpecifier__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedNamespaceSpecifier__Group__2_in_rule__QualifiedNamespaceSpecifier__Group__15812);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2706:1: rule__QualifiedNamespaceSpecifier__Group__1__Impl : ( ( ruleNestedNameSpecifier )? ) ;
    public final void rule__QualifiedNamespaceSpecifier__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2710:1: ( ( ( ruleNestedNameSpecifier )? ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2711:1: ( ( ruleNestedNameSpecifier )? )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2711:1: ( ( ruleNestedNameSpecifier )? )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2712:1: ( ruleNestedNameSpecifier )?
            {
             before(grammarAccess.getQualifiedNamespaceSpecifierAccess().getNestedNameSpecifierParserRuleCall_1()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2713:1: ( ruleNestedNameSpecifier )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==44) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2713:3: ruleNestedNameSpecifier
                    {
                    pushFollow(FOLLOW_ruleNestedNameSpecifier_in_rule__QualifiedNamespaceSpecifier__Group__1__Impl5840);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2723:1: rule__QualifiedNamespaceSpecifier__Group__2 : rule__QualifiedNamespaceSpecifier__Group__2__Impl ;
    public final void rule__QualifiedNamespaceSpecifier__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2727:1: ( rule__QualifiedNamespaceSpecifier__Group__2__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2728:2: rule__QualifiedNamespaceSpecifier__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedNamespaceSpecifier__Group__2__Impl_in_rule__QualifiedNamespaceSpecifier__Group__25871);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2734:1: rule__QualifiedNamespaceSpecifier__Group__2__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedNamespaceSpecifier__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2738:1: ( ( RULE_ID ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2739:1: ( RULE_ID )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2739:1: ( RULE_ID )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2740:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNamespaceSpecifierAccess().getIDTerminalRuleCall_2()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedNamespaceSpecifier__Group__2__Impl5898); 
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


    // $ANTLR start "rule__AttributeSpecifier__Group_0__0"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2763:1: rule__AttributeSpecifier__Group_0__0 : rule__AttributeSpecifier__Group_0__0__Impl rule__AttributeSpecifier__Group_0__1 ;
    public final void rule__AttributeSpecifier__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2767:1: ( rule__AttributeSpecifier__Group_0__0__Impl rule__AttributeSpecifier__Group_0__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2768:2: rule__AttributeSpecifier__Group_0__0__Impl rule__AttributeSpecifier__Group_0__1
            {
            pushFollow(FOLLOW_rule__AttributeSpecifier__Group_0__0__Impl_in_rule__AttributeSpecifier__Group_0__05939);
            rule__AttributeSpecifier__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AttributeSpecifier__Group_0__1_in_rule__AttributeSpecifier__Group_0__05942);
            rule__AttributeSpecifier__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeSpecifier__Group_0__0"


    // $ANTLR start "rule__AttributeSpecifier__Group_0__0__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2775:1: rule__AttributeSpecifier__Group_0__0__Impl : ( '[' ) ;
    public final void rule__AttributeSpecifier__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2779:1: ( ( '[' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2780:1: ( '[' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2780:1: ( '[' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2781:1: '['
            {
             before(grammarAccess.getAttributeSpecifierAccess().getLeftSquareBracketKeyword_0_0()); 
            match(input,104,FOLLOW_104_in_rule__AttributeSpecifier__Group_0__0__Impl5970); 
             after(grammarAccess.getAttributeSpecifierAccess().getLeftSquareBracketKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeSpecifier__Group_0__0__Impl"


    // $ANTLR start "rule__AttributeSpecifier__Group_0__1"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2794:1: rule__AttributeSpecifier__Group_0__1 : rule__AttributeSpecifier__Group_0__1__Impl rule__AttributeSpecifier__Group_0__2 ;
    public final void rule__AttributeSpecifier__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2798:1: ( rule__AttributeSpecifier__Group_0__1__Impl rule__AttributeSpecifier__Group_0__2 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2799:2: rule__AttributeSpecifier__Group_0__1__Impl rule__AttributeSpecifier__Group_0__2
            {
            pushFollow(FOLLOW_rule__AttributeSpecifier__Group_0__1__Impl_in_rule__AttributeSpecifier__Group_0__16001);
            rule__AttributeSpecifier__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AttributeSpecifier__Group_0__2_in_rule__AttributeSpecifier__Group_0__16004);
            rule__AttributeSpecifier__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeSpecifier__Group_0__1"


    // $ANTLR start "rule__AttributeSpecifier__Group_0__1__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2806:1: rule__AttributeSpecifier__Group_0__1__Impl : ( '[' ) ;
    public final void rule__AttributeSpecifier__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2810:1: ( ( '[' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2811:1: ( '[' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2811:1: ( '[' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2812:1: '['
            {
             before(grammarAccess.getAttributeSpecifierAccess().getLeftSquareBracketKeyword_0_1()); 
            match(input,104,FOLLOW_104_in_rule__AttributeSpecifier__Group_0__1__Impl6032); 
             after(grammarAccess.getAttributeSpecifierAccess().getLeftSquareBracketKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeSpecifier__Group_0__1__Impl"


    // $ANTLR start "rule__AttributeSpecifier__Group_0__2"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2825:1: rule__AttributeSpecifier__Group_0__2 : rule__AttributeSpecifier__Group_0__2__Impl rule__AttributeSpecifier__Group_0__3 ;
    public final void rule__AttributeSpecifier__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2829:1: ( rule__AttributeSpecifier__Group_0__2__Impl rule__AttributeSpecifier__Group_0__3 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2830:2: rule__AttributeSpecifier__Group_0__2__Impl rule__AttributeSpecifier__Group_0__3
            {
            pushFollow(FOLLOW_rule__AttributeSpecifier__Group_0__2__Impl_in_rule__AttributeSpecifier__Group_0__26063);
            rule__AttributeSpecifier__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AttributeSpecifier__Group_0__3_in_rule__AttributeSpecifier__Group_0__26066);
            rule__AttributeSpecifier__Group_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeSpecifier__Group_0__2"


    // $ANTLR start "rule__AttributeSpecifier__Group_0__2__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2837:1: rule__AttributeSpecifier__Group_0__2__Impl : ( ruleAttributeList ) ;
    public final void rule__AttributeSpecifier__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2841:1: ( ( ruleAttributeList ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2842:1: ( ruleAttributeList )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2842:1: ( ruleAttributeList )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2843:1: ruleAttributeList
            {
             before(grammarAccess.getAttributeSpecifierAccess().getAttributeListParserRuleCall_0_2()); 
            pushFollow(FOLLOW_ruleAttributeList_in_rule__AttributeSpecifier__Group_0__2__Impl6093);
            ruleAttributeList();

            state._fsp--;

             after(grammarAccess.getAttributeSpecifierAccess().getAttributeListParserRuleCall_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeSpecifier__Group_0__2__Impl"


    // $ANTLR start "rule__AttributeSpecifier__Group_0__3"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2854:1: rule__AttributeSpecifier__Group_0__3 : rule__AttributeSpecifier__Group_0__3__Impl rule__AttributeSpecifier__Group_0__4 ;
    public final void rule__AttributeSpecifier__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2858:1: ( rule__AttributeSpecifier__Group_0__3__Impl rule__AttributeSpecifier__Group_0__4 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2859:2: rule__AttributeSpecifier__Group_0__3__Impl rule__AttributeSpecifier__Group_0__4
            {
            pushFollow(FOLLOW_rule__AttributeSpecifier__Group_0__3__Impl_in_rule__AttributeSpecifier__Group_0__36122);
            rule__AttributeSpecifier__Group_0__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AttributeSpecifier__Group_0__4_in_rule__AttributeSpecifier__Group_0__36125);
            rule__AttributeSpecifier__Group_0__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeSpecifier__Group_0__3"


    // $ANTLR start "rule__AttributeSpecifier__Group_0__3__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2866:1: rule__AttributeSpecifier__Group_0__3__Impl : ( ']' ) ;
    public final void rule__AttributeSpecifier__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2870:1: ( ( ']' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2871:1: ( ']' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2871:1: ( ']' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2872:1: ']'
            {
             before(grammarAccess.getAttributeSpecifierAccess().getRightSquareBracketKeyword_0_3()); 
            match(input,105,FOLLOW_105_in_rule__AttributeSpecifier__Group_0__3__Impl6153); 
             after(grammarAccess.getAttributeSpecifierAccess().getRightSquareBracketKeyword_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeSpecifier__Group_0__3__Impl"


    // $ANTLR start "rule__AttributeSpecifier__Group_0__4"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2885:1: rule__AttributeSpecifier__Group_0__4 : rule__AttributeSpecifier__Group_0__4__Impl ;
    public final void rule__AttributeSpecifier__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2889:1: ( rule__AttributeSpecifier__Group_0__4__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2890:2: rule__AttributeSpecifier__Group_0__4__Impl
            {
            pushFollow(FOLLOW_rule__AttributeSpecifier__Group_0__4__Impl_in_rule__AttributeSpecifier__Group_0__46184);
            rule__AttributeSpecifier__Group_0__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeSpecifier__Group_0__4"


    // $ANTLR start "rule__AttributeSpecifier__Group_0__4__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2896:1: rule__AttributeSpecifier__Group_0__4__Impl : ( ']' ) ;
    public final void rule__AttributeSpecifier__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2900:1: ( ( ']' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2901:1: ( ']' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2901:1: ( ']' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2902:1: ']'
            {
             before(grammarAccess.getAttributeSpecifierAccess().getRightSquareBracketKeyword_0_4()); 
            match(input,105,FOLLOW_105_in_rule__AttributeSpecifier__Group_0__4__Impl6212); 
             after(grammarAccess.getAttributeSpecifierAccess().getRightSquareBracketKeyword_0_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeSpecifier__Group_0__4__Impl"


    // $ANTLR start "rule__AlignmentSpecifier__Group_0__0"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2925:1: rule__AlignmentSpecifier__Group_0__0 : rule__AlignmentSpecifier__Group_0__0__Impl rule__AlignmentSpecifier__Group_0__1 ;
    public final void rule__AlignmentSpecifier__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2929:1: ( rule__AlignmentSpecifier__Group_0__0__Impl rule__AlignmentSpecifier__Group_0__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2930:2: rule__AlignmentSpecifier__Group_0__0__Impl rule__AlignmentSpecifier__Group_0__1
            {
            pushFollow(FOLLOW_rule__AlignmentSpecifier__Group_0__0__Impl_in_rule__AlignmentSpecifier__Group_0__06253);
            rule__AlignmentSpecifier__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AlignmentSpecifier__Group_0__1_in_rule__AlignmentSpecifier__Group_0__06256);
            rule__AlignmentSpecifier__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlignmentSpecifier__Group_0__0"


    // $ANTLR start "rule__AlignmentSpecifier__Group_0__0__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2937:1: rule__AlignmentSpecifier__Group_0__0__Impl : ( 'alignas' ) ;
    public final void rule__AlignmentSpecifier__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2941:1: ( ( 'alignas' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2942:1: ( 'alignas' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2942:1: ( 'alignas' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2943:1: 'alignas'
            {
             before(grammarAccess.getAlignmentSpecifierAccess().getAlignasKeyword_0_0()); 
            match(input,106,FOLLOW_106_in_rule__AlignmentSpecifier__Group_0__0__Impl6284); 
             after(grammarAccess.getAlignmentSpecifierAccess().getAlignasKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlignmentSpecifier__Group_0__0__Impl"


    // $ANTLR start "rule__AlignmentSpecifier__Group_0__1"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2956:1: rule__AlignmentSpecifier__Group_0__1 : rule__AlignmentSpecifier__Group_0__1__Impl rule__AlignmentSpecifier__Group_0__2 ;
    public final void rule__AlignmentSpecifier__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2960:1: ( rule__AlignmentSpecifier__Group_0__1__Impl rule__AlignmentSpecifier__Group_0__2 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2961:2: rule__AlignmentSpecifier__Group_0__1__Impl rule__AlignmentSpecifier__Group_0__2
            {
            pushFollow(FOLLOW_rule__AlignmentSpecifier__Group_0__1__Impl_in_rule__AlignmentSpecifier__Group_0__16315);
            rule__AlignmentSpecifier__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AlignmentSpecifier__Group_0__2_in_rule__AlignmentSpecifier__Group_0__16318);
            rule__AlignmentSpecifier__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlignmentSpecifier__Group_0__1"


    // $ANTLR start "rule__AlignmentSpecifier__Group_0__1__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2968:1: rule__AlignmentSpecifier__Group_0__1__Impl : ( '(' ) ;
    public final void rule__AlignmentSpecifier__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2972:1: ( ( '(' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2973:1: ( '(' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2973:1: ( '(' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2974:1: '('
            {
             before(grammarAccess.getAlignmentSpecifierAccess().getLeftParenthesisKeyword_0_1()); 
            match(input,107,FOLLOW_107_in_rule__AlignmentSpecifier__Group_0__1__Impl6346); 
             after(grammarAccess.getAlignmentSpecifierAccess().getLeftParenthesisKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlignmentSpecifier__Group_0__1__Impl"


    // $ANTLR start "rule__AlignmentSpecifier__Group_0__2"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2987:1: rule__AlignmentSpecifier__Group_0__2 : rule__AlignmentSpecifier__Group_0__2__Impl rule__AlignmentSpecifier__Group_0__3 ;
    public final void rule__AlignmentSpecifier__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2991:1: ( rule__AlignmentSpecifier__Group_0__2__Impl rule__AlignmentSpecifier__Group_0__3 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2992:2: rule__AlignmentSpecifier__Group_0__2__Impl rule__AlignmentSpecifier__Group_0__3
            {
            pushFollow(FOLLOW_rule__AlignmentSpecifier__Group_0__2__Impl_in_rule__AlignmentSpecifier__Group_0__26377);
            rule__AlignmentSpecifier__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AlignmentSpecifier__Group_0__3_in_rule__AlignmentSpecifier__Group_0__26380);
            rule__AlignmentSpecifier__Group_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlignmentSpecifier__Group_0__2"


    // $ANTLR start "rule__AlignmentSpecifier__Group_0__2__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2999:1: rule__AlignmentSpecifier__Group_0__2__Impl : ( ruleTypeId ) ;
    public final void rule__AlignmentSpecifier__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3003:1: ( ( ruleTypeId ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3004:1: ( ruleTypeId )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3004:1: ( ruleTypeId )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3005:1: ruleTypeId
            {
             before(grammarAccess.getAlignmentSpecifierAccess().getTypeIdParserRuleCall_0_2()); 
            pushFollow(FOLLOW_ruleTypeId_in_rule__AlignmentSpecifier__Group_0__2__Impl6407);
            ruleTypeId();

            state._fsp--;

             after(grammarAccess.getAlignmentSpecifierAccess().getTypeIdParserRuleCall_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlignmentSpecifier__Group_0__2__Impl"


    // $ANTLR start "rule__AlignmentSpecifier__Group_0__3"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3016:1: rule__AlignmentSpecifier__Group_0__3 : rule__AlignmentSpecifier__Group_0__3__Impl rule__AlignmentSpecifier__Group_0__4 ;
    public final void rule__AlignmentSpecifier__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3020:1: ( rule__AlignmentSpecifier__Group_0__3__Impl rule__AlignmentSpecifier__Group_0__4 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3021:2: rule__AlignmentSpecifier__Group_0__3__Impl rule__AlignmentSpecifier__Group_0__4
            {
            pushFollow(FOLLOW_rule__AlignmentSpecifier__Group_0__3__Impl_in_rule__AlignmentSpecifier__Group_0__36436);
            rule__AlignmentSpecifier__Group_0__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AlignmentSpecifier__Group_0__4_in_rule__AlignmentSpecifier__Group_0__36439);
            rule__AlignmentSpecifier__Group_0__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlignmentSpecifier__Group_0__3"


    // $ANTLR start "rule__AlignmentSpecifier__Group_0__3__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3028:1: rule__AlignmentSpecifier__Group_0__3__Impl : ( ( '...' )? ) ;
    public final void rule__AlignmentSpecifier__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3032:1: ( ( ( '...' )? ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3033:1: ( ( '...' )? )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3033:1: ( ( '...' )? )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3034:1: ( '...' )?
            {
             before(grammarAccess.getAlignmentSpecifierAccess().getFullStopFullStopFullStopKeyword_0_3()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3035:1: ( '...' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==101) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3036:2: '...'
                    {
                    match(input,101,FOLLOW_101_in_rule__AlignmentSpecifier__Group_0__3__Impl6468); 

                    }
                    break;

            }

             after(grammarAccess.getAlignmentSpecifierAccess().getFullStopFullStopFullStopKeyword_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlignmentSpecifier__Group_0__3__Impl"


    // $ANTLR start "rule__AlignmentSpecifier__Group_0__4"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3047:1: rule__AlignmentSpecifier__Group_0__4 : rule__AlignmentSpecifier__Group_0__4__Impl ;
    public final void rule__AlignmentSpecifier__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3051:1: ( rule__AlignmentSpecifier__Group_0__4__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3052:2: rule__AlignmentSpecifier__Group_0__4__Impl
            {
            pushFollow(FOLLOW_rule__AlignmentSpecifier__Group_0__4__Impl_in_rule__AlignmentSpecifier__Group_0__46501);
            rule__AlignmentSpecifier__Group_0__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlignmentSpecifier__Group_0__4"


    // $ANTLR start "rule__AlignmentSpecifier__Group_0__4__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3058:1: rule__AlignmentSpecifier__Group_0__4__Impl : ( ')' ) ;
    public final void rule__AlignmentSpecifier__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3062:1: ( ( ')' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3063:1: ( ')' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3063:1: ( ')' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3064:1: ')'
            {
             before(grammarAccess.getAlignmentSpecifierAccess().getRightParenthesisKeyword_0_4()); 
            match(input,108,FOLLOW_108_in_rule__AlignmentSpecifier__Group_0__4__Impl6529); 
             after(grammarAccess.getAlignmentSpecifierAccess().getRightParenthesisKeyword_0_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlignmentSpecifier__Group_0__4__Impl"


    // $ANTLR start "rule__AlignmentSpecifier__Group_1__0"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3087:1: rule__AlignmentSpecifier__Group_1__0 : rule__AlignmentSpecifier__Group_1__0__Impl rule__AlignmentSpecifier__Group_1__1 ;
    public final void rule__AlignmentSpecifier__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3091:1: ( rule__AlignmentSpecifier__Group_1__0__Impl rule__AlignmentSpecifier__Group_1__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3092:2: rule__AlignmentSpecifier__Group_1__0__Impl rule__AlignmentSpecifier__Group_1__1
            {
            pushFollow(FOLLOW_rule__AlignmentSpecifier__Group_1__0__Impl_in_rule__AlignmentSpecifier__Group_1__06570);
            rule__AlignmentSpecifier__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AlignmentSpecifier__Group_1__1_in_rule__AlignmentSpecifier__Group_1__06573);
            rule__AlignmentSpecifier__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlignmentSpecifier__Group_1__0"


    // $ANTLR start "rule__AlignmentSpecifier__Group_1__0__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3099:1: rule__AlignmentSpecifier__Group_1__0__Impl : ( 'alignas' ) ;
    public final void rule__AlignmentSpecifier__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3103:1: ( ( 'alignas' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3104:1: ( 'alignas' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3104:1: ( 'alignas' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3105:1: 'alignas'
            {
             before(grammarAccess.getAlignmentSpecifierAccess().getAlignasKeyword_1_0()); 
            match(input,106,FOLLOW_106_in_rule__AlignmentSpecifier__Group_1__0__Impl6601); 
             after(grammarAccess.getAlignmentSpecifierAccess().getAlignasKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlignmentSpecifier__Group_1__0__Impl"


    // $ANTLR start "rule__AlignmentSpecifier__Group_1__1"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3118:1: rule__AlignmentSpecifier__Group_1__1 : rule__AlignmentSpecifier__Group_1__1__Impl rule__AlignmentSpecifier__Group_1__2 ;
    public final void rule__AlignmentSpecifier__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3122:1: ( rule__AlignmentSpecifier__Group_1__1__Impl rule__AlignmentSpecifier__Group_1__2 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3123:2: rule__AlignmentSpecifier__Group_1__1__Impl rule__AlignmentSpecifier__Group_1__2
            {
            pushFollow(FOLLOW_rule__AlignmentSpecifier__Group_1__1__Impl_in_rule__AlignmentSpecifier__Group_1__16632);
            rule__AlignmentSpecifier__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AlignmentSpecifier__Group_1__2_in_rule__AlignmentSpecifier__Group_1__16635);
            rule__AlignmentSpecifier__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlignmentSpecifier__Group_1__1"


    // $ANTLR start "rule__AlignmentSpecifier__Group_1__1__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3130:1: rule__AlignmentSpecifier__Group_1__1__Impl : ( '(' ) ;
    public final void rule__AlignmentSpecifier__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3134:1: ( ( '(' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3135:1: ( '(' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3135:1: ( '(' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3136:1: '('
            {
             before(grammarAccess.getAlignmentSpecifierAccess().getLeftParenthesisKeyword_1_1()); 
            match(input,107,FOLLOW_107_in_rule__AlignmentSpecifier__Group_1__1__Impl6663); 
             after(grammarAccess.getAlignmentSpecifierAccess().getLeftParenthesisKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlignmentSpecifier__Group_1__1__Impl"


    // $ANTLR start "rule__AlignmentSpecifier__Group_1__2"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3149:1: rule__AlignmentSpecifier__Group_1__2 : rule__AlignmentSpecifier__Group_1__2__Impl rule__AlignmentSpecifier__Group_1__3 ;
    public final void rule__AlignmentSpecifier__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3153:1: ( rule__AlignmentSpecifier__Group_1__2__Impl rule__AlignmentSpecifier__Group_1__3 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3154:2: rule__AlignmentSpecifier__Group_1__2__Impl rule__AlignmentSpecifier__Group_1__3
            {
            pushFollow(FOLLOW_rule__AlignmentSpecifier__Group_1__2__Impl_in_rule__AlignmentSpecifier__Group_1__26694);
            rule__AlignmentSpecifier__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AlignmentSpecifier__Group_1__3_in_rule__AlignmentSpecifier__Group_1__26697);
            rule__AlignmentSpecifier__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlignmentSpecifier__Group_1__2"


    // $ANTLR start "rule__AlignmentSpecifier__Group_1__2__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3161:1: rule__AlignmentSpecifier__Group_1__2__Impl : ( ruleAlignmentExpression ) ;
    public final void rule__AlignmentSpecifier__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3165:1: ( ( ruleAlignmentExpression ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3166:1: ( ruleAlignmentExpression )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3166:1: ( ruleAlignmentExpression )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3167:1: ruleAlignmentExpression
            {
             before(grammarAccess.getAlignmentSpecifierAccess().getAlignmentExpressionParserRuleCall_1_2()); 
            pushFollow(FOLLOW_ruleAlignmentExpression_in_rule__AlignmentSpecifier__Group_1__2__Impl6724);
            ruleAlignmentExpression();

            state._fsp--;

             after(grammarAccess.getAlignmentSpecifierAccess().getAlignmentExpressionParserRuleCall_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlignmentSpecifier__Group_1__2__Impl"


    // $ANTLR start "rule__AlignmentSpecifier__Group_1__3"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3178:1: rule__AlignmentSpecifier__Group_1__3 : rule__AlignmentSpecifier__Group_1__3__Impl rule__AlignmentSpecifier__Group_1__4 ;
    public final void rule__AlignmentSpecifier__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3182:1: ( rule__AlignmentSpecifier__Group_1__3__Impl rule__AlignmentSpecifier__Group_1__4 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3183:2: rule__AlignmentSpecifier__Group_1__3__Impl rule__AlignmentSpecifier__Group_1__4
            {
            pushFollow(FOLLOW_rule__AlignmentSpecifier__Group_1__3__Impl_in_rule__AlignmentSpecifier__Group_1__36753);
            rule__AlignmentSpecifier__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AlignmentSpecifier__Group_1__4_in_rule__AlignmentSpecifier__Group_1__36756);
            rule__AlignmentSpecifier__Group_1__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlignmentSpecifier__Group_1__3"


    // $ANTLR start "rule__AlignmentSpecifier__Group_1__3__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3190:1: rule__AlignmentSpecifier__Group_1__3__Impl : ( ( '...' )? ) ;
    public final void rule__AlignmentSpecifier__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3194:1: ( ( ( '...' )? ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3195:1: ( ( '...' )? )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3195:1: ( ( '...' )? )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3196:1: ( '...' )?
            {
             before(grammarAccess.getAlignmentSpecifierAccess().getFullStopFullStopFullStopKeyword_1_3()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3197:1: ( '...' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==101) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3198:2: '...'
                    {
                    match(input,101,FOLLOW_101_in_rule__AlignmentSpecifier__Group_1__3__Impl6785); 

                    }
                    break;

            }

             after(grammarAccess.getAlignmentSpecifierAccess().getFullStopFullStopFullStopKeyword_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlignmentSpecifier__Group_1__3__Impl"


    // $ANTLR start "rule__AlignmentSpecifier__Group_1__4"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3209:1: rule__AlignmentSpecifier__Group_1__4 : rule__AlignmentSpecifier__Group_1__4__Impl ;
    public final void rule__AlignmentSpecifier__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3213:1: ( rule__AlignmentSpecifier__Group_1__4__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3214:2: rule__AlignmentSpecifier__Group_1__4__Impl
            {
            pushFollow(FOLLOW_rule__AlignmentSpecifier__Group_1__4__Impl_in_rule__AlignmentSpecifier__Group_1__46818);
            rule__AlignmentSpecifier__Group_1__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlignmentSpecifier__Group_1__4"


    // $ANTLR start "rule__AlignmentSpecifier__Group_1__4__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3220:1: rule__AlignmentSpecifier__Group_1__4__Impl : ( ')' ) ;
    public final void rule__AlignmentSpecifier__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3224:1: ( ( ')' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3225:1: ( ')' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3225:1: ( ')' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3226:1: ')'
            {
             before(grammarAccess.getAlignmentSpecifierAccess().getRightParenthesisKeyword_1_4()); 
            match(input,108,FOLLOW_108_in_rule__AlignmentSpecifier__Group_1__4__Impl6846); 
             after(grammarAccess.getAlignmentSpecifierAccess().getRightParenthesisKeyword_1_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlignmentSpecifier__Group_1__4__Impl"


    // $ANTLR start "rule__AttributeList__Group__0"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3249:1: rule__AttributeList__Group__0 : rule__AttributeList__Group__0__Impl rule__AttributeList__Group__1 ;
    public final void rule__AttributeList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3253:1: ( rule__AttributeList__Group__0__Impl rule__AttributeList__Group__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3254:2: rule__AttributeList__Group__0__Impl rule__AttributeList__Group__1
            {
            pushFollow(FOLLOW_rule__AttributeList__Group__0__Impl_in_rule__AttributeList__Group__06887);
            rule__AttributeList__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AttributeList__Group__1_in_rule__AttributeList__Group__06890);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3261:1: rule__AttributeList__Group__0__Impl : ( ( rule__AttributeList__Group_0__0 ) ) ;
    public final void rule__AttributeList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3265:1: ( ( ( rule__AttributeList__Group_0__0 ) ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3266:1: ( ( rule__AttributeList__Group_0__0 ) )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3266:1: ( ( rule__AttributeList__Group_0__0 ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3267:1: ( rule__AttributeList__Group_0__0 )
            {
             before(grammarAccess.getAttributeListAccess().getGroup_0()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3268:1: ( rule__AttributeList__Group_0__0 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3268:2: rule__AttributeList__Group_0__0
            {
            pushFollow(FOLLOW_rule__AttributeList__Group_0__0_in_rule__AttributeList__Group__0__Impl6917);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3278:1: rule__AttributeList__Group__1 : rule__AttributeList__Group__1__Impl ;
    public final void rule__AttributeList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3282:1: ( rule__AttributeList__Group__1__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3283:2: rule__AttributeList__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__AttributeList__Group__1__Impl_in_rule__AttributeList__Group__16947);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3289:1: rule__AttributeList__Group__1__Impl : ( ( rule__AttributeList__Group_1__0 )* ) ;
    public final void rule__AttributeList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3293:1: ( ( ( rule__AttributeList__Group_1__0 )* ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3294:1: ( ( rule__AttributeList__Group_1__0 )* )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3294:1: ( ( rule__AttributeList__Group_1__0 )* )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3295:1: ( rule__AttributeList__Group_1__0 )*
            {
             before(grammarAccess.getAttributeListAccess().getGroup_1()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3296:1: ( rule__AttributeList__Group_1__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==96) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3296:2: rule__AttributeList__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__AttributeList__Group_1__0_in_rule__AttributeList__Group__1__Impl6974);
            	    rule__AttributeList__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3310:1: rule__AttributeList__Group_0__0 : rule__AttributeList__Group_0__0__Impl rule__AttributeList__Group_0__1 ;
    public final void rule__AttributeList__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3314:1: ( rule__AttributeList__Group_0__0__Impl rule__AttributeList__Group_0__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3315:2: rule__AttributeList__Group_0__0__Impl rule__AttributeList__Group_0__1
            {
            pushFollow(FOLLOW_rule__AttributeList__Group_0__0__Impl_in_rule__AttributeList__Group_0__07009);
            rule__AttributeList__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AttributeList__Group_0__1_in_rule__AttributeList__Group_0__07012);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3322:1: rule__AttributeList__Group_0__0__Impl : ( ruleAttribute ) ;
    public final void rule__AttributeList__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3326:1: ( ( ruleAttribute ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3327:1: ( ruleAttribute )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3327:1: ( ruleAttribute )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3328:1: ruleAttribute
            {
             before(grammarAccess.getAttributeListAccess().getAttributeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleAttribute_in_rule__AttributeList__Group_0__0__Impl7039);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3339:1: rule__AttributeList__Group_0__1 : rule__AttributeList__Group_0__1__Impl ;
    public final void rule__AttributeList__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3343:1: ( rule__AttributeList__Group_0__1__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3344:2: rule__AttributeList__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__AttributeList__Group_0__1__Impl_in_rule__AttributeList__Group_0__17068);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3350:1: rule__AttributeList__Group_0__1__Impl : ( ( '...' )? ) ;
    public final void rule__AttributeList__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3354:1: ( ( ( '...' )? ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3355:1: ( ( '...' )? )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3355:1: ( ( '...' )? )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3356:1: ( '...' )?
            {
             before(grammarAccess.getAttributeListAccess().getFullStopFullStopFullStopKeyword_0_1()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3357:1: ( '...' )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==101) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3358:2: '...'
                    {
                    match(input,101,FOLLOW_101_in_rule__AttributeList__Group_0__1__Impl7097); 

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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3373:1: rule__AttributeList__Group_1__0 : rule__AttributeList__Group_1__0__Impl rule__AttributeList__Group_1__1 ;
    public final void rule__AttributeList__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3377:1: ( rule__AttributeList__Group_1__0__Impl rule__AttributeList__Group_1__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3378:2: rule__AttributeList__Group_1__0__Impl rule__AttributeList__Group_1__1
            {
            pushFollow(FOLLOW_rule__AttributeList__Group_1__0__Impl_in_rule__AttributeList__Group_1__07134);
            rule__AttributeList__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AttributeList__Group_1__1_in_rule__AttributeList__Group_1__07137);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3385:1: rule__AttributeList__Group_1__0__Impl : ( ',' ) ;
    public final void rule__AttributeList__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3389:1: ( ( ',' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3390:1: ( ',' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3390:1: ( ',' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3391:1: ','
            {
             before(grammarAccess.getAttributeListAccess().getCommaKeyword_1_0()); 
            match(input,96,FOLLOW_96_in_rule__AttributeList__Group_1__0__Impl7165); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3404:1: rule__AttributeList__Group_1__1 : rule__AttributeList__Group_1__1__Impl ;
    public final void rule__AttributeList__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3408:1: ( rule__AttributeList__Group_1__1__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3409:2: rule__AttributeList__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__AttributeList__Group_1__1__Impl_in_rule__AttributeList__Group_1__17196);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3415:1: rule__AttributeList__Group_1__1__Impl : ( ( rule__AttributeList__Group_1_1__0 )? ) ;
    public final void rule__AttributeList__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3419:1: ( ( ( rule__AttributeList__Group_1_1__0 )? ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3420:1: ( ( rule__AttributeList__Group_1_1__0 )? )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3420:1: ( ( rule__AttributeList__Group_1_1__0 )? )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3421:1: ( rule__AttributeList__Group_1_1__0 )?
            {
             before(grammarAccess.getAttributeListAccess().getGroup_1_1()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3422:1: ( rule__AttributeList__Group_1_1__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_ID) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3422:2: rule__AttributeList__Group_1_1__0
                    {
                    pushFollow(FOLLOW_rule__AttributeList__Group_1_1__0_in_rule__AttributeList__Group_1__1__Impl7223);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3436:1: rule__AttributeList__Group_1_1__0 : rule__AttributeList__Group_1_1__0__Impl rule__AttributeList__Group_1_1__1 ;
    public final void rule__AttributeList__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3440:1: ( rule__AttributeList__Group_1_1__0__Impl rule__AttributeList__Group_1_1__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3441:2: rule__AttributeList__Group_1_1__0__Impl rule__AttributeList__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__AttributeList__Group_1_1__0__Impl_in_rule__AttributeList__Group_1_1__07258);
            rule__AttributeList__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AttributeList__Group_1_1__1_in_rule__AttributeList__Group_1_1__07261);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3448:1: rule__AttributeList__Group_1_1__0__Impl : ( ruleAttribute ) ;
    public final void rule__AttributeList__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3452:1: ( ( ruleAttribute ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3453:1: ( ruleAttribute )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3453:1: ( ruleAttribute )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3454:1: ruleAttribute
            {
             before(grammarAccess.getAttributeListAccess().getAttributeParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleAttribute_in_rule__AttributeList__Group_1_1__0__Impl7288);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3465:1: rule__AttributeList__Group_1_1__1 : rule__AttributeList__Group_1_1__1__Impl ;
    public final void rule__AttributeList__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3469:1: ( rule__AttributeList__Group_1_1__1__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3470:2: rule__AttributeList__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__AttributeList__Group_1_1__1__Impl_in_rule__AttributeList__Group_1_1__17317);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3476:1: rule__AttributeList__Group_1_1__1__Impl : ( ( '...' )? ) ;
    public final void rule__AttributeList__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3480:1: ( ( ( '...' )? ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3481:1: ( ( '...' )? )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3481:1: ( ( '...' )? )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3482:1: ( '...' )?
            {
             before(grammarAccess.getAttributeListAccess().getFullStopFullStopFullStopKeyword_1_1_1()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3483:1: ( '...' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==101) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3484:2: '...'
                    {
                    match(input,101,FOLLOW_101_in_rule__AttributeList__Group_1_1__1__Impl7346); 

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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3499:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3503:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3504:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_rule__Attribute__Group__0__Impl_in_rule__Attribute__Group__07383);
            rule__Attribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group__1_in_rule__Attribute__Group__07386);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3511:1: rule__Attribute__Group__0__Impl : ( ruleAttributeToken ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3515:1: ( ( ruleAttributeToken ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3516:1: ( ruleAttributeToken )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3516:1: ( ruleAttributeToken )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3517:1: ruleAttributeToken
            {
             before(grammarAccess.getAttributeAccess().getAttributeTokenParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleAttributeToken_in_rule__Attribute__Group__0__Impl7413);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3528:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3532:1: ( rule__Attribute__Group__1__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3533:2: rule__Attribute__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Attribute__Group__1__Impl_in_rule__Attribute__Group__17442);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3539:1: rule__Attribute__Group__1__Impl : ( ( ruleAttributeArgumentClause )? ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3543:1: ( ( ( ruleAttributeArgumentClause )? ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3544:1: ( ( ruleAttributeArgumentClause )? )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3544:1: ( ( ruleAttributeArgumentClause )? )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3545:1: ( ruleAttributeArgumentClause )?
            {
             before(grammarAccess.getAttributeAccess().getAttributeArgumentClauseParserRuleCall_1()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3546:1: ( ruleAttributeArgumentClause )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==107) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3546:3: ruleAttributeArgumentClause
                    {
                    pushFollow(FOLLOW_ruleAttributeArgumentClause_in_rule__Attribute__Group__1__Impl7470);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3560:1: rule__AttributeToken__Group__0 : rule__AttributeToken__Group__0__Impl rule__AttributeToken__Group__1 ;
    public final void rule__AttributeToken__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3564:1: ( rule__AttributeToken__Group__0__Impl rule__AttributeToken__Group__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3565:2: rule__AttributeToken__Group__0__Impl rule__AttributeToken__Group__1
            {
            pushFollow(FOLLOW_rule__AttributeToken__Group__0__Impl_in_rule__AttributeToken__Group__07505);
            rule__AttributeToken__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AttributeToken__Group__1_in_rule__AttributeToken__Group__07508);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3572:1: rule__AttributeToken__Group__0__Impl : ( ( rule__AttributeToken__Group_0__0 )? ) ;
    public final void rule__AttributeToken__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3576:1: ( ( ( rule__AttributeToken__Group_0__0 )? ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3577:1: ( ( rule__AttributeToken__Group_0__0 )? )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3577:1: ( ( rule__AttributeToken__Group_0__0 )? )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3578:1: ( rule__AttributeToken__Group_0__0 )?
            {
             before(grammarAccess.getAttributeTokenAccess().getGroup_0()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3579:1: ( rule__AttributeToken__Group_0__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_ID) ) {
                int LA37_1 = input.LA(2);

                if ( (LA37_1==103) ) {
                    alt37=1;
                }
            }
            switch (alt37) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3579:2: rule__AttributeToken__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__AttributeToken__Group_0__0_in_rule__AttributeToken__Group__0__Impl7535);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3589:1: rule__AttributeToken__Group__1 : rule__AttributeToken__Group__1__Impl ;
    public final void rule__AttributeToken__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3593:1: ( rule__AttributeToken__Group__1__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3594:2: rule__AttributeToken__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__AttributeToken__Group__1__Impl_in_rule__AttributeToken__Group__17566);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3600:1: rule__AttributeToken__Group__1__Impl : ( RULE_ID ) ;
    public final void rule__AttributeToken__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3604:1: ( ( RULE_ID ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3605:1: ( RULE_ID )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3605:1: ( RULE_ID )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3606:1: RULE_ID
            {
             before(grammarAccess.getAttributeTokenAccess().getIDTerminalRuleCall_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__AttributeToken__Group__1__Impl7593); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3621:1: rule__AttributeToken__Group_0__0 : rule__AttributeToken__Group_0__0__Impl rule__AttributeToken__Group_0__1 ;
    public final void rule__AttributeToken__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3625:1: ( rule__AttributeToken__Group_0__0__Impl rule__AttributeToken__Group_0__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3626:2: rule__AttributeToken__Group_0__0__Impl rule__AttributeToken__Group_0__1
            {
            pushFollow(FOLLOW_rule__AttributeToken__Group_0__0__Impl_in_rule__AttributeToken__Group_0__07626);
            rule__AttributeToken__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AttributeToken__Group_0__1_in_rule__AttributeToken__Group_0__07629);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3633:1: rule__AttributeToken__Group_0__0__Impl : ( RULE_ID ) ;
    public final void rule__AttributeToken__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3637:1: ( ( RULE_ID ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3638:1: ( RULE_ID )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3638:1: ( RULE_ID )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3639:1: RULE_ID
            {
             before(grammarAccess.getAttributeTokenAccess().getIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__AttributeToken__Group_0__0__Impl7656); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3650:1: rule__AttributeToken__Group_0__1 : rule__AttributeToken__Group_0__1__Impl ;
    public final void rule__AttributeToken__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3654:1: ( rule__AttributeToken__Group_0__1__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3655:2: rule__AttributeToken__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__AttributeToken__Group_0__1__Impl_in_rule__AttributeToken__Group_0__17685);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3661:1: rule__AttributeToken__Group_0__1__Impl : ( '::' ) ;
    public final void rule__AttributeToken__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3665:1: ( ( '::' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3666:1: ( '::' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3666:1: ( '::' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3667:1: '::'
            {
             before(grammarAccess.getAttributeTokenAccess().getColonColonKeyword_0_1()); 
            match(input,103,FOLLOW_103_in_rule__AttributeToken__Group_0__1__Impl7713); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3684:1: rule__AttributeArgumentClause__Group__0 : rule__AttributeArgumentClause__Group__0__Impl rule__AttributeArgumentClause__Group__1 ;
    public final void rule__AttributeArgumentClause__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3688:1: ( rule__AttributeArgumentClause__Group__0__Impl rule__AttributeArgumentClause__Group__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3689:2: rule__AttributeArgumentClause__Group__0__Impl rule__AttributeArgumentClause__Group__1
            {
            pushFollow(FOLLOW_rule__AttributeArgumentClause__Group__0__Impl_in_rule__AttributeArgumentClause__Group__07748);
            rule__AttributeArgumentClause__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AttributeArgumentClause__Group__1_in_rule__AttributeArgumentClause__Group__07751);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3696:1: rule__AttributeArgumentClause__Group__0__Impl : ( '(' ) ;
    public final void rule__AttributeArgumentClause__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3700:1: ( ( '(' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3701:1: ( '(' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3701:1: ( '(' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3702:1: '('
            {
             before(grammarAccess.getAttributeArgumentClauseAccess().getLeftParenthesisKeyword_0()); 
            match(input,107,FOLLOW_107_in_rule__AttributeArgumentClause__Group__0__Impl7779); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3715:1: rule__AttributeArgumentClause__Group__1 : rule__AttributeArgumentClause__Group__1__Impl rule__AttributeArgumentClause__Group__2 ;
    public final void rule__AttributeArgumentClause__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3719:1: ( rule__AttributeArgumentClause__Group__1__Impl rule__AttributeArgumentClause__Group__2 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3720:2: rule__AttributeArgumentClause__Group__1__Impl rule__AttributeArgumentClause__Group__2
            {
            pushFollow(FOLLOW_rule__AttributeArgumentClause__Group__1__Impl_in_rule__AttributeArgumentClause__Group__17810);
            rule__AttributeArgumentClause__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AttributeArgumentClause__Group__2_in_rule__AttributeArgumentClause__Group__17813);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3727:1: rule__AttributeArgumentClause__Group__1__Impl : ( ruleToken ) ;
    public final void rule__AttributeArgumentClause__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3731:1: ( ( ruleToken ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3732:1: ( ruleToken )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3732:1: ( ruleToken )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3733:1: ruleToken
            {
             before(grammarAccess.getAttributeArgumentClauseAccess().getTokenParserRuleCall_1()); 
            pushFollow(FOLLOW_ruleToken_in_rule__AttributeArgumentClause__Group__1__Impl7840);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3744:1: rule__AttributeArgumentClause__Group__2 : rule__AttributeArgumentClause__Group__2__Impl ;
    public final void rule__AttributeArgumentClause__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3748:1: ( rule__AttributeArgumentClause__Group__2__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3749:2: rule__AttributeArgumentClause__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__AttributeArgumentClause__Group__2__Impl_in_rule__AttributeArgumentClause__Group__27869);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3755:1: rule__AttributeArgumentClause__Group__2__Impl : ( ')' ) ;
    public final void rule__AttributeArgumentClause__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3759:1: ( ( ')' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3760:1: ( ')' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3760:1: ( ')' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3761:1: ')'
            {
             before(grammarAccess.getAttributeArgumentClauseAccess().getRightParenthesisKeyword_2()); 
            match(input,108,FOLLOW_108_in_rule__AttributeArgumentClause__Group__2__Impl7897); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3782:1: rule__InitDeclarator__Group__0 : rule__InitDeclarator__Group__0__Impl rule__InitDeclarator__Group__1 ;
    public final void rule__InitDeclarator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3786:1: ( rule__InitDeclarator__Group__0__Impl rule__InitDeclarator__Group__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3787:2: rule__InitDeclarator__Group__0__Impl rule__InitDeclarator__Group__1
            {
            pushFollow(FOLLOW_rule__InitDeclarator__Group__0__Impl_in_rule__InitDeclarator__Group__07936);
            rule__InitDeclarator__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InitDeclarator__Group__1_in_rule__InitDeclarator__Group__07939);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3794:1: rule__InitDeclarator__Group__0__Impl : ( ruleDeclarator ) ;
    public final void rule__InitDeclarator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3798:1: ( ( ruleDeclarator ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3799:1: ( ruleDeclarator )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3799:1: ( ruleDeclarator )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3800:1: ruleDeclarator
            {
             before(grammarAccess.getInitDeclaratorAccess().getDeclaratorParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleDeclarator_in_rule__InitDeclarator__Group__0__Impl7966);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3811:1: rule__InitDeclarator__Group__1 : rule__InitDeclarator__Group__1__Impl ;
    public final void rule__InitDeclarator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3815:1: ( rule__InitDeclarator__Group__1__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3816:2: rule__InitDeclarator__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__InitDeclarator__Group__1__Impl_in_rule__InitDeclarator__Group__17995);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3822:1: rule__InitDeclarator__Group__1__Impl : ( ( ruleInitializer )? ) ;
    public final void rule__InitDeclarator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3826:1: ( ( ( ruleInitializer )? ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3827:1: ( ( ruleInitializer )? )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3827:1: ( ( ruleInitializer )? )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3828:1: ( ruleInitializer )?
            {
             before(grammarAccess.getInitDeclaratorAccess().getInitializerParserRuleCall_1()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3829:1: ( ruleInitializer )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==56) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3829:3: ruleInitializer
                    {
                    pushFollow(FOLLOW_ruleInitializer_in_rule__InitDeclarator__Group__1__Impl8023);
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


    // $ANTLR start "rule__Declarator__Group_0__0"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3843:1: rule__Declarator__Group_0__0 : rule__Declarator__Group_0__0__Impl rule__Declarator__Group_0__1 ;
    public final void rule__Declarator__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3847:1: ( rule__Declarator__Group_0__0__Impl rule__Declarator__Group_0__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3848:2: rule__Declarator__Group_0__0__Impl rule__Declarator__Group_0__1
            {
            pushFollow(FOLLOW_rule__Declarator__Group_0__0__Impl_in_rule__Declarator__Group_0__08058);
            rule__Declarator__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Declarator__Group_0__1_in_rule__Declarator__Group_0__08061);
            rule__Declarator__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declarator__Group_0__0"


    // $ANTLR start "rule__Declarator__Group_0__0__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3855:1: rule__Declarator__Group_0__0__Impl : ( ( ( rulePtrOperator ) ) ( ( rulePtrOperator )* ) ) ;
    public final void rule__Declarator__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3859:1: ( ( ( ( rulePtrOperator ) ) ( ( rulePtrOperator )* ) ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3860:1: ( ( ( rulePtrOperator ) ) ( ( rulePtrOperator )* ) )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3860:1: ( ( ( rulePtrOperator ) ) ( ( rulePtrOperator )* ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3861:1: ( ( rulePtrOperator ) ) ( ( rulePtrOperator )* )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3861:1: ( ( rulePtrOperator ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3862:1: ( rulePtrOperator )
            {
             before(grammarAccess.getDeclaratorAccess().getPtrOperatorParserRuleCall_0_0()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3863:1: ( rulePtrOperator )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3863:3: rulePtrOperator
            {
            pushFollow(FOLLOW_rulePtrOperator_in_rule__Declarator__Group_0__0__Impl8091);
            rulePtrOperator();

            state._fsp--;


            }

             after(grammarAccess.getDeclaratorAccess().getPtrOperatorParserRuleCall_0_0()); 

            }

            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3866:1: ( ( rulePtrOperator )* )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3867:1: ( rulePtrOperator )*
            {
             before(grammarAccess.getDeclaratorAccess().getPtrOperatorParserRuleCall_0_0()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3868:1: ( rulePtrOperator )*
            loop39:
            do {
                int alt39=2;
                switch ( input.LA(1) ) {
                case 103:
                    {
                    int LA39_2 = input.LA(2);

                    if ( (LA39_2==44) ) {
                        int LA39_3 = input.LA(3);

                        if ( (LA39_3==67) ) {
                            alt39=1;
                        }


                    }


                    }
                    break;
                case 44:
                    {
                    int LA39_3 = input.LA(2);

                    if ( (LA39_3==67) ) {
                        alt39=1;
                    }


                    }
                    break;
                case 61:
                case 62:
                case 67:
                    {
                    alt39=1;
                    }
                    break;

                }

                switch (alt39) {
            	case 1 :
            	    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3868:3: rulePtrOperator
            	    {
            	    pushFollow(FOLLOW_rulePtrOperator_in_rule__Declarator__Group_0__0__Impl8104);
            	    rulePtrOperator();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

             after(grammarAccess.getDeclaratorAccess().getPtrOperatorParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Declarator__Group_0__0__Impl"


    // $ANTLR start "rule__Declarator__Group_0__1"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3879:1: rule__Declarator__Group_0__1 : rule__Declarator__Group_0__1__Impl ;
    public final void rule__Declarator__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3883:1: ( rule__Declarator__Group_0__1__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3884:2: rule__Declarator__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Declarator__Group_0__1__Impl_in_rule__Declarator__Group_0__18137);
            rule__Declarator__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declarator__Group_0__1"


    // $ANTLR start "rule__Declarator__Group_0__1__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3890:1: rule__Declarator__Group_0__1__Impl : ( ruleNoptrDeclarator ) ;
    public final void rule__Declarator__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3894:1: ( ( ruleNoptrDeclarator ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3895:1: ( ruleNoptrDeclarator )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3895:1: ( ruleNoptrDeclarator )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3896:1: ruleNoptrDeclarator
            {
             before(grammarAccess.getDeclaratorAccess().getNoptrDeclaratorParserRuleCall_0_1()); 
            pushFollow(FOLLOW_ruleNoptrDeclarator_in_rule__Declarator__Group_0__1__Impl8164);
            ruleNoptrDeclarator();

            state._fsp--;

             after(grammarAccess.getDeclaratorAccess().getNoptrDeclaratorParserRuleCall_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declarator__Group_0__1__Impl"


    // $ANTLR start "rule__Declarator__Group_1__0"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3911:1: rule__Declarator__Group_1__0 : rule__Declarator__Group_1__0__Impl rule__Declarator__Group_1__1 ;
    public final void rule__Declarator__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3915:1: ( rule__Declarator__Group_1__0__Impl rule__Declarator__Group_1__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3916:2: rule__Declarator__Group_1__0__Impl rule__Declarator__Group_1__1
            {
            pushFollow(FOLLOW_rule__Declarator__Group_1__0__Impl_in_rule__Declarator__Group_1__08197);
            rule__Declarator__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Declarator__Group_1__1_in_rule__Declarator__Group_1__08200);
            rule__Declarator__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declarator__Group_1__0"


    // $ANTLR start "rule__Declarator__Group_1__0__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3923:1: rule__Declarator__Group_1__0__Impl : ( ruleNoptrDeclarator ) ;
    public final void rule__Declarator__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3927:1: ( ( ruleNoptrDeclarator ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3928:1: ( ruleNoptrDeclarator )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3928:1: ( ruleNoptrDeclarator )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3929:1: ruleNoptrDeclarator
            {
             before(grammarAccess.getDeclaratorAccess().getNoptrDeclaratorParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleNoptrDeclarator_in_rule__Declarator__Group_1__0__Impl8227);
            ruleNoptrDeclarator();

            state._fsp--;

             after(grammarAccess.getDeclaratorAccess().getNoptrDeclaratorParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declarator__Group_1__0__Impl"


    // $ANTLR start "rule__Declarator__Group_1__1"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3940:1: rule__Declarator__Group_1__1 : rule__Declarator__Group_1__1__Impl ;
    public final void rule__Declarator__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3944:1: ( rule__Declarator__Group_1__1__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3945:2: rule__Declarator__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Declarator__Group_1__1__Impl_in_rule__Declarator__Group_1__18256);
            rule__Declarator__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declarator__Group_1__1"


    // $ANTLR start "rule__Declarator__Group_1__1__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3951:1: rule__Declarator__Group_1__1__Impl : ( ( rule__Declarator__Group_1_1__0 )? ) ;
    public final void rule__Declarator__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3955:1: ( ( ( rule__Declarator__Group_1_1__0 )? ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3956:1: ( ( rule__Declarator__Group_1_1__0 )? )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3956:1: ( ( rule__Declarator__Group_1_1__0 )? )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3957:1: ( rule__Declarator__Group_1_1__0 )?
            {
             before(grammarAccess.getDeclaratorAccess().getGroup_1_1()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3958:1: ( rule__Declarator__Group_1_1__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==107) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3958:2: rule__Declarator__Group_1_1__0
                    {
                    pushFollow(FOLLOW_rule__Declarator__Group_1_1__0_in_rule__Declarator__Group_1__1__Impl8283);
                    rule__Declarator__Group_1_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDeclaratorAccess().getGroup_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declarator__Group_1__1__Impl"


    // $ANTLR start "rule__Declarator__Group_1_1__0"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3972:1: rule__Declarator__Group_1_1__0 : rule__Declarator__Group_1_1__0__Impl rule__Declarator__Group_1_1__1 ;
    public final void rule__Declarator__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3976:1: ( rule__Declarator__Group_1_1__0__Impl rule__Declarator__Group_1_1__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3977:2: rule__Declarator__Group_1_1__0__Impl rule__Declarator__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__Declarator__Group_1_1__0__Impl_in_rule__Declarator__Group_1_1__08318);
            rule__Declarator__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Declarator__Group_1_1__1_in_rule__Declarator__Group_1_1__08321);
            rule__Declarator__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declarator__Group_1_1__0"


    // $ANTLR start "rule__Declarator__Group_1_1__0__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3984:1: rule__Declarator__Group_1_1__0__Impl : ( ruleParametersAndQualifiers ) ;
    public final void rule__Declarator__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3988:1: ( ( ruleParametersAndQualifiers ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3989:1: ( ruleParametersAndQualifiers )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3989:1: ( ruleParametersAndQualifiers )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3990:1: ruleParametersAndQualifiers
            {
             before(grammarAccess.getDeclaratorAccess().getParametersAndQualifiersParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleParametersAndQualifiers_in_rule__Declarator__Group_1_1__0__Impl8348);
            ruleParametersAndQualifiers();

            state._fsp--;

             after(grammarAccess.getDeclaratorAccess().getParametersAndQualifiersParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declarator__Group_1_1__0__Impl"


    // $ANTLR start "rule__Declarator__Group_1_1__1"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4001:1: rule__Declarator__Group_1_1__1 : rule__Declarator__Group_1_1__1__Impl ;
    public final void rule__Declarator__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4005:1: ( rule__Declarator__Group_1_1__1__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4006:2: rule__Declarator__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Declarator__Group_1_1__1__Impl_in_rule__Declarator__Group_1_1__18377);
            rule__Declarator__Group_1_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declarator__Group_1_1__1"


    // $ANTLR start "rule__Declarator__Group_1_1__1__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4012:1: rule__Declarator__Group_1_1__1__Impl : ( ruleTrailingReturnType ) ;
    public final void rule__Declarator__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4016:1: ( ( ruleTrailingReturnType ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4017:1: ( ruleTrailingReturnType )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4017:1: ( ruleTrailingReturnType )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4018:1: ruleTrailingReturnType
            {
             before(grammarAccess.getDeclaratorAccess().getTrailingReturnTypeParserRuleCall_1_1_1()); 
            pushFollow(FOLLOW_ruleTrailingReturnType_in_rule__Declarator__Group_1_1__1__Impl8404);
            ruleTrailingReturnType();

            state._fsp--;

             after(grammarAccess.getDeclaratorAccess().getTrailingReturnTypeParserRuleCall_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Declarator__Group_1_1__1__Impl"


    // $ANTLR start "rule__PtrDeclarator__Group__0"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4033:1: rule__PtrDeclarator__Group__0 : rule__PtrDeclarator__Group__0__Impl rule__PtrDeclarator__Group__1 ;
    public final void rule__PtrDeclarator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4037:1: ( rule__PtrDeclarator__Group__0__Impl rule__PtrDeclarator__Group__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4038:2: rule__PtrDeclarator__Group__0__Impl rule__PtrDeclarator__Group__1
            {
            pushFollow(FOLLOW_rule__PtrDeclarator__Group__0__Impl_in_rule__PtrDeclarator__Group__08437);
            rule__PtrDeclarator__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PtrDeclarator__Group__1_in_rule__PtrDeclarator__Group__08440);
            rule__PtrDeclarator__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PtrDeclarator__Group__0"


    // $ANTLR start "rule__PtrDeclarator__Group__0__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4045:1: rule__PtrDeclarator__Group__0__Impl : ( ( rulePtrOperator )* ) ;
    public final void rule__PtrDeclarator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4049:1: ( ( ( rulePtrOperator )* ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4050:1: ( ( rulePtrOperator )* )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4050:1: ( ( rulePtrOperator )* )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4051:1: ( rulePtrOperator )*
            {
             before(grammarAccess.getPtrDeclaratorAccess().getPtrOperatorParserRuleCall_0()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4052:1: ( rulePtrOperator )*
            loop41:
            do {
                int alt41=2;
                switch ( input.LA(1) ) {
                case 103:
                    {
                    int LA41_2 = input.LA(2);

                    if ( (LA41_2==44) ) {
                        int LA41_3 = input.LA(3);

                        if ( (LA41_3==67) ) {
                            alt41=1;
                        }


                    }


                    }
                    break;
                case 44:
                    {
                    int LA41_3 = input.LA(2);

                    if ( (LA41_3==67) ) {
                        alt41=1;
                    }


                    }
                    break;
                case 61:
                case 62:
                case 67:
                    {
                    alt41=1;
                    }
                    break;

                }

                switch (alt41) {
            	case 1 :
            	    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4052:3: rulePtrOperator
            	    {
            	    pushFollow(FOLLOW_rulePtrOperator_in_rule__PtrDeclarator__Group__0__Impl8468);
            	    rulePtrOperator();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

             after(grammarAccess.getPtrDeclaratorAccess().getPtrOperatorParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PtrDeclarator__Group__0__Impl"


    // $ANTLR start "rule__PtrDeclarator__Group__1"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4062:1: rule__PtrDeclarator__Group__1 : rule__PtrDeclarator__Group__1__Impl ;
    public final void rule__PtrDeclarator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4066:1: ( rule__PtrDeclarator__Group__1__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4067:2: rule__PtrDeclarator__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__PtrDeclarator__Group__1__Impl_in_rule__PtrDeclarator__Group__18499);
            rule__PtrDeclarator__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PtrDeclarator__Group__1"


    // $ANTLR start "rule__PtrDeclarator__Group__1__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4073:1: rule__PtrDeclarator__Group__1__Impl : ( ruleNoptrDeclarator ) ;
    public final void rule__PtrDeclarator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4077:1: ( ( ruleNoptrDeclarator ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4078:1: ( ruleNoptrDeclarator )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4078:1: ( ruleNoptrDeclarator )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4079:1: ruleNoptrDeclarator
            {
             before(grammarAccess.getPtrDeclaratorAccess().getNoptrDeclaratorParserRuleCall_1()); 
            pushFollow(FOLLOW_ruleNoptrDeclarator_in_rule__PtrDeclarator__Group__1__Impl8526);
            ruleNoptrDeclarator();

            state._fsp--;

             after(grammarAccess.getPtrDeclaratorAccess().getNoptrDeclaratorParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PtrDeclarator__Group__1__Impl"


    // $ANTLR start "rule__NoptrDeclarator__Group__0"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4094:1: rule__NoptrDeclarator__Group__0 : rule__NoptrDeclarator__Group__0__Impl rule__NoptrDeclarator__Group__1 ;
    public final void rule__NoptrDeclarator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4098:1: ( rule__NoptrDeclarator__Group__0__Impl rule__NoptrDeclarator__Group__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4099:2: rule__NoptrDeclarator__Group__0__Impl rule__NoptrDeclarator__Group__1
            {
            pushFollow(FOLLOW_rule__NoptrDeclarator__Group__0__Impl_in_rule__NoptrDeclarator__Group__08559);
            rule__NoptrDeclarator__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NoptrDeclarator__Group__1_in_rule__NoptrDeclarator__Group__08562);
            rule__NoptrDeclarator__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NoptrDeclarator__Group__0"


    // $ANTLR start "rule__NoptrDeclarator__Group__0__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4106:1: rule__NoptrDeclarator__Group__0__Impl : ( rule_NoptrDeclarator ) ;
    public final void rule__NoptrDeclarator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4110:1: ( ( rule_NoptrDeclarator ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4111:1: ( rule_NoptrDeclarator )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4111:1: ( rule_NoptrDeclarator )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4112:1: rule_NoptrDeclarator
            {
             before(grammarAccess.getNoptrDeclaratorAccess().get_NoptrDeclaratorParserRuleCall_0()); 
            pushFollow(FOLLOW_rule_NoptrDeclarator_in_rule__NoptrDeclarator__Group__0__Impl8589);
            rule_NoptrDeclarator();

            state._fsp--;

             after(grammarAccess.getNoptrDeclaratorAccess().get_NoptrDeclaratorParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NoptrDeclarator__Group__0__Impl"


    // $ANTLR start "rule__NoptrDeclarator__Group__1"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4123:1: rule__NoptrDeclarator__Group__1 : rule__NoptrDeclarator__Group__1__Impl ;
    public final void rule__NoptrDeclarator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4127:1: ( rule__NoptrDeclarator__Group__1__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4128:2: rule__NoptrDeclarator__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__NoptrDeclarator__Group__1__Impl_in_rule__NoptrDeclarator__Group__18618);
            rule__NoptrDeclarator__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NoptrDeclarator__Group__1"


    // $ANTLR start "rule__NoptrDeclarator__Group__1__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4134:1: rule__NoptrDeclarator__Group__1__Impl : ( ( rule__NoptrDeclarator )* ) ;
    public final void rule__NoptrDeclarator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4138:1: ( ( ( rule__NoptrDeclarator )* ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4139:1: ( ( rule__NoptrDeclarator )* )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4139:1: ( ( rule__NoptrDeclarator )* )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4140:1: ( rule__NoptrDeclarator )*
            {
             before(grammarAccess.getNoptrDeclaratorAccess().get__NoptrDeclaratorParserRuleCall_1()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4141:1: ( rule__NoptrDeclarator )*
            loop42:
            do {
                int alt42=2;
                alt42 = dfa42.predict(input);
                switch (alt42) {
            	case 1 :
            	    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4141:3: rule__NoptrDeclarator
            	    {
            	    pushFollow(FOLLOW_rule__NoptrDeclarator_in_rule__NoptrDeclarator__Group__1__Impl8646);
            	    rule__NoptrDeclarator();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);

             after(grammarAccess.getNoptrDeclaratorAccess().get__NoptrDeclaratorParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NoptrDeclarator__Group__1__Impl"


    // $ANTLR start "rule___NoptrDeclarator__Group_0__0"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4155:1: rule___NoptrDeclarator__Group_0__0 : rule___NoptrDeclarator__Group_0__0__Impl rule___NoptrDeclarator__Group_0__1 ;
    public final void rule___NoptrDeclarator__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4159:1: ( rule___NoptrDeclarator__Group_0__0__Impl rule___NoptrDeclarator__Group_0__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4160:2: rule___NoptrDeclarator__Group_0__0__Impl rule___NoptrDeclarator__Group_0__1
            {
            pushFollow(FOLLOW_rule___NoptrDeclarator__Group_0__0__Impl_in_rule___NoptrDeclarator__Group_0__08681);
            rule___NoptrDeclarator__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule___NoptrDeclarator__Group_0__1_in_rule___NoptrDeclarator__Group_0__08684);
            rule___NoptrDeclarator__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule___NoptrDeclarator__Group_0__0"


    // $ANTLR start "rule___NoptrDeclarator__Group_0__0__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4167:1: rule___NoptrDeclarator__Group_0__0__Impl : ( ruleDeclaratorId ) ;
    public final void rule___NoptrDeclarator__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4171:1: ( ( ruleDeclaratorId ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4172:1: ( ruleDeclaratorId )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4172:1: ( ruleDeclaratorId )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4173:1: ruleDeclaratorId
            {
             before(grammarAccess.get_NoptrDeclaratorAccess().getDeclaratorIdParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleDeclaratorId_in_rule___NoptrDeclarator__Group_0__0__Impl8711);
            ruleDeclaratorId();

            state._fsp--;

             after(grammarAccess.get_NoptrDeclaratorAccess().getDeclaratorIdParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule___NoptrDeclarator__Group_0__0__Impl"


    // $ANTLR start "rule___NoptrDeclarator__Group_0__1"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4184:1: rule___NoptrDeclarator__Group_0__1 : rule___NoptrDeclarator__Group_0__1__Impl ;
    public final void rule___NoptrDeclarator__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4188:1: ( rule___NoptrDeclarator__Group_0__1__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4189:2: rule___NoptrDeclarator__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule___NoptrDeclarator__Group_0__1__Impl_in_rule___NoptrDeclarator__Group_0__18740);
            rule___NoptrDeclarator__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule___NoptrDeclarator__Group_0__1"


    // $ANTLR start "rule___NoptrDeclarator__Group_0__1__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4195:1: rule___NoptrDeclarator__Group_0__1__Impl : ( ( ruleAttributeSpecifier )* ) ;
    public final void rule___NoptrDeclarator__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4199:1: ( ( ( ruleAttributeSpecifier )* ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4200:1: ( ( ruleAttributeSpecifier )* )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4200:1: ( ( ruleAttributeSpecifier )* )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4201:1: ( ruleAttributeSpecifier )*
            {
             before(grammarAccess.get_NoptrDeclaratorAccess().getAttributeSpecifierParserRuleCall_0_1()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4202:1: ( ruleAttributeSpecifier )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==104) ) {
                    int LA43_2 = input.LA(2);

                    if ( (LA43_2==104) ) {
                        alt43=1;
                    }


                }
                else if ( (LA43_0==106) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4202:3: ruleAttributeSpecifier
            	    {
            	    pushFollow(FOLLOW_ruleAttributeSpecifier_in_rule___NoptrDeclarator__Group_0__1__Impl8768);
            	    ruleAttributeSpecifier();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);

             after(grammarAccess.get_NoptrDeclaratorAccess().getAttributeSpecifierParserRuleCall_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule___NoptrDeclarator__Group_0__1__Impl"


    // $ANTLR start "rule___NoptrDeclarator__Group_1__0"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4216:1: rule___NoptrDeclarator__Group_1__0 : rule___NoptrDeclarator__Group_1__0__Impl rule___NoptrDeclarator__Group_1__1 ;
    public final void rule___NoptrDeclarator__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4220:1: ( rule___NoptrDeclarator__Group_1__0__Impl rule___NoptrDeclarator__Group_1__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4221:2: rule___NoptrDeclarator__Group_1__0__Impl rule___NoptrDeclarator__Group_1__1
            {
            pushFollow(FOLLOW_rule___NoptrDeclarator__Group_1__0__Impl_in_rule___NoptrDeclarator__Group_1__08803);
            rule___NoptrDeclarator__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule___NoptrDeclarator__Group_1__1_in_rule___NoptrDeclarator__Group_1__08806);
            rule___NoptrDeclarator__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule___NoptrDeclarator__Group_1__0"


    // $ANTLR start "rule___NoptrDeclarator__Group_1__0__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4228:1: rule___NoptrDeclarator__Group_1__0__Impl : ( '(' ) ;
    public final void rule___NoptrDeclarator__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4232:1: ( ( '(' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4233:1: ( '(' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4233:1: ( '(' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4234:1: '('
            {
             before(grammarAccess.get_NoptrDeclaratorAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,107,FOLLOW_107_in_rule___NoptrDeclarator__Group_1__0__Impl8834); 
             after(grammarAccess.get_NoptrDeclaratorAccess().getLeftParenthesisKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule___NoptrDeclarator__Group_1__0__Impl"


    // $ANTLR start "rule___NoptrDeclarator__Group_1__1"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4247:1: rule___NoptrDeclarator__Group_1__1 : rule___NoptrDeclarator__Group_1__1__Impl rule___NoptrDeclarator__Group_1__2 ;
    public final void rule___NoptrDeclarator__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4251:1: ( rule___NoptrDeclarator__Group_1__1__Impl rule___NoptrDeclarator__Group_1__2 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4252:2: rule___NoptrDeclarator__Group_1__1__Impl rule___NoptrDeclarator__Group_1__2
            {
            pushFollow(FOLLOW_rule___NoptrDeclarator__Group_1__1__Impl_in_rule___NoptrDeclarator__Group_1__18865);
            rule___NoptrDeclarator__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule___NoptrDeclarator__Group_1__2_in_rule___NoptrDeclarator__Group_1__18868);
            rule___NoptrDeclarator__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule___NoptrDeclarator__Group_1__1"


    // $ANTLR start "rule___NoptrDeclarator__Group_1__1__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4259:1: rule___NoptrDeclarator__Group_1__1__Impl : ( rulePtrDeclarator ) ;
    public final void rule___NoptrDeclarator__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4263:1: ( ( rulePtrDeclarator ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4264:1: ( rulePtrDeclarator )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4264:1: ( rulePtrDeclarator )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4265:1: rulePtrDeclarator
            {
             before(grammarAccess.get_NoptrDeclaratorAccess().getPtrDeclaratorParserRuleCall_1_1()); 
            pushFollow(FOLLOW_rulePtrDeclarator_in_rule___NoptrDeclarator__Group_1__1__Impl8895);
            rulePtrDeclarator();

            state._fsp--;

             after(grammarAccess.get_NoptrDeclaratorAccess().getPtrDeclaratorParserRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule___NoptrDeclarator__Group_1__1__Impl"


    // $ANTLR start "rule___NoptrDeclarator__Group_1__2"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4276:1: rule___NoptrDeclarator__Group_1__2 : rule___NoptrDeclarator__Group_1__2__Impl ;
    public final void rule___NoptrDeclarator__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4280:1: ( rule___NoptrDeclarator__Group_1__2__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4281:2: rule___NoptrDeclarator__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule___NoptrDeclarator__Group_1__2__Impl_in_rule___NoptrDeclarator__Group_1__28924);
            rule___NoptrDeclarator__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule___NoptrDeclarator__Group_1__2"


    // $ANTLR start "rule___NoptrDeclarator__Group_1__2__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4287:1: rule___NoptrDeclarator__Group_1__2__Impl : ( ')' ) ;
    public final void rule___NoptrDeclarator__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4291:1: ( ( ')' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4292:1: ( ')' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4292:1: ( ')' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4293:1: ')'
            {
             before(grammarAccess.get_NoptrDeclaratorAccess().getRightParenthesisKeyword_1_2()); 
            match(input,108,FOLLOW_108_in_rule___NoptrDeclarator__Group_1__2__Impl8952); 
             after(grammarAccess.get_NoptrDeclaratorAccess().getRightParenthesisKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule___NoptrDeclarator__Group_1__2__Impl"


    // $ANTLR start "rule____NoptrDeclarator__Group_1__0"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4312:1: rule____NoptrDeclarator__Group_1__0 : rule____NoptrDeclarator__Group_1__0__Impl rule____NoptrDeclarator__Group_1__1 ;
    public final void rule____NoptrDeclarator__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4316:1: ( rule____NoptrDeclarator__Group_1__0__Impl rule____NoptrDeclarator__Group_1__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4317:2: rule____NoptrDeclarator__Group_1__0__Impl rule____NoptrDeclarator__Group_1__1
            {
            pushFollow(FOLLOW_rule____NoptrDeclarator__Group_1__0__Impl_in_rule____NoptrDeclarator__Group_1__08989);
            rule____NoptrDeclarator__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule____NoptrDeclarator__Group_1__1_in_rule____NoptrDeclarator__Group_1__08992);
            rule____NoptrDeclarator__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule____NoptrDeclarator__Group_1__0"


    // $ANTLR start "rule____NoptrDeclarator__Group_1__0__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4324:1: rule____NoptrDeclarator__Group_1__0__Impl : ( '[' ) ;
    public final void rule____NoptrDeclarator__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4328:1: ( ( '[' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4329:1: ( '[' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4329:1: ( '[' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4330:1: '['
            {
             before(grammarAccess.get__NoptrDeclaratorAccess().getLeftSquareBracketKeyword_1_0()); 
            match(input,104,FOLLOW_104_in_rule____NoptrDeclarator__Group_1__0__Impl9020); 
             after(grammarAccess.get__NoptrDeclaratorAccess().getLeftSquareBracketKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule____NoptrDeclarator__Group_1__0__Impl"


    // $ANTLR start "rule____NoptrDeclarator__Group_1__1"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4343:1: rule____NoptrDeclarator__Group_1__1 : rule____NoptrDeclarator__Group_1__1__Impl rule____NoptrDeclarator__Group_1__2 ;
    public final void rule____NoptrDeclarator__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4347:1: ( rule____NoptrDeclarator__Group_1__1__Impl rule____NoptrDeclarator__Group_1__2 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4348:2: rule____NoptrDeclarator__Group_1__1__Impl rule____NoptrDeclarator__Group_1__2
            {
            pushFollow(FOLLOW_rule____NoptrDeclarator__Group_1__1__Impl_in_rule____NoptrDeclarator__Group_1__19051);
            rule____NoptrDeclarator__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule____NoptrDeclarator__Group_1__2_in_rule____NoptrDeclarator__Group_1__19054);
            rule____NoptrDeclarator__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule____NoptrDeclarator__Group_1__1"


    // $ANTLR start "rule____NoptrDeclarator__Group_1__1__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4355:1: rule____NoptrDeclarator__Group_1__1__Impl : ( ruleConstantExpression ) ;
    public final void rule____NoptrDeclarator__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4359:1: ( ( ruleConstantExpression ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4360:1: ( ruleConstantExpression )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4360:1: ( ruleConstantExpression )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4361:1: ruleConstantExpression
            {
             before(grammarAccess.get__NoptrDeclaratorAccess().getConstantExpressionParserRuleCall_1_1()); 
            pushFollow(FOLLOW_ruleConstantExpression_in_rule____NoptrDeclarator__Group_1__1__Impl9081);
            ruleConstantExpression();

            state._fsp--;

             after(grammarAccess.get__NoptrDeclaratorAccess().getConstantExpressionParserRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule____NoptrDeclarator__Group_1__1__Impl"


    // $ANTLR start "rule____NoptrDeclarator__Group_1__2"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4372:1: rule____NoptrDeclarator__Group_1__2 : rule____NoptrDeclarator__Group_1__2__Impl rule____NoptrDeclarator__Group_1__3 ;
    public final void rule____NoptrDeclarator__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4376:1: ( rule____NoptrDeclarator__Group_1__2__Impl rule____NoptrDeclarator__Group_1__3 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4377:2: rule____NoptrDeclarator__Group_1__2__Impl rule____NoptrDeclarator__Group_1__3
            {
            pushFollow(FOLLOW_rule____NoptrDeclarator__Group_1__2__Impl_in_rule____NoptrDeclarator__Group_1__29110);
            rule____NoptrDeclarator__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule____NoptrDeclarator__Group_1__3_in_rule____NoptrDeclarator__Group_1__29113);
            rule____NoptrDeclarator__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule____NoptrDeclarator__Group_1__2"


    // $ANTLR start "rule____NoptrDeclarator__Group_1__2__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4384:1: rule____NoptrDeclarator__Group_1__2__Impl : ( ']' ) ;
    public final void rule____NoptrDeclarator__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4388:1: ( ( ']' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4389:1: ( ']' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4389:1: ( ']' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4390:1: ']'
            {
             before(grammarAccess.get__NoptrDeclaratorAccess().getRightSquareBracketKeyword_1_2()); 
            match(input,105,FOLLOW_105_in_rule____NoptrDeclarator__Group_1__2__Impl9141); 
             after(grammarAccess.get__NoptrDeclaratorAccess().getRightSquareBracketKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule____NoptrDeclarator__Group_1__2__Impl"


    // $ANTLR start "rule____NoptrDeclarator__Group_1__3"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4403:1: rule____NoptrDeclarator__Group_1__3 : rule____NoptrDeclarator__Group_1__3__Impl ;
    public final void rule____NoptrDeclarator__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4407:1: ( rule____NoptrDeclarator__Group_1__3__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4408:2: rule____NoptrDeclarator__Group_1__3__Impl
            {
            pushFollow(FOLLOW_rule____NoptrDeclarator__Group_1__3__Impl_in_rule____NoptrDeclarator__Group_1__39172);
            rule____NoptrDeclarator__Group_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule____NoptrDeclarator__Group_1__3"


    // $ANTLR start "rule____NoptrDeclarator__Group_1__3__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4414:1: rule____NoptrDeclarator__Group_1__3__Impl : ( ( ruleAttributeSpecifier )* ) ;
    public final void rule____NoptrDeclarator__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4418:1: ( ( ( ruleAttributeSpecifier )* ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4419:1: ( ( ruleAttributeSpecifier )* )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4419:1: ( ( ruleAttributeSpecifier )* )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4420:1: ( ruleAttributeSpecifier )*
            {
             before(grammarAccess.get__NoptrDeclaratorAccess().getAttributeSpecifierParserRuleCall_1_3()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4421:1: ( ruleAttributeSpecifier )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==104) ) {
                    int LA44_2 = input.LA(2);

                    if ( (LA44_2==104) ) {
                        alt44=1;
                    }


                }
                else if ( (LA44_0==106) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4421:3: ruleAttributeSpecifier
            	    {
            	    pushFollow(FOLLOW_ruleAttributeSpecifier_in_rule____NoptrDeclarator__Group_1__3__Impl9200);
            	    ruleAttributeSpecifier();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);

             after(grammarAccess.get__NoptrDeclaratorAccess().getAttributeSpecifierParserRuleCall_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule____NoptrDeclarator__Group_1__3__Impl"


    // $ANTLR start "rule__ParametersAndQualifiers__Group__0"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4439:1: rule__ParametersAndQualifiers__Group__0 : rule__ParametersAndQualifiers__Group__0__Impl rule__ParametersAndQualifiers__Group__1 ;
    public final void rule__ParametersAndQualifiers__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4443:1: ( rule__ParametersAndQualifiers__Group__0__Impl rule__ParametersAndQualifiers__Group__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4444:2: rule__ParametersAndQualifiers__Group__0__Impl rule__ParametersAndQualifiers__Group__1
            {
            pushFollow(FOLLOW_rule__ParametersAndQualifiers__Group__0__Impl_in_rule__ParametersAndQualifiers__Group__09239);
            rule__ParametersAndQualifiers__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParametersAndQualifiers__Group__1_in_rule__ParametersAndQualifiers__Group__09242);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4451:1: rule__ParametersAndQualifiers__Group__0__Impl : ( '(' ) ;
    public final void rule__ParametersAndQualifiers__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4455:1: ( ( '(' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4456:1: ( '(' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4456:1: ( '(' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4457:1: '('
            {
             before(grammarAccess.getParametersAndQualifiersAccess().getLeftParenthesisKeyword_0()); 
            match(input,107,FOLLOW_107_in_rule__ParametersAndQualifiers__Group__0__Impl9270); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4470:1: rule__ParametersAndQualifiers__Group__1 : rule__ParametersAndQualifiers__Group__1__Impl rule__ParametersAndQualifiers__Group__2 ;
    public final void rule__ParametersAndQualifiers__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4474:1: ( rule__ParametersAndQualifiers__Group__1__Impl rule__ParametersAndQualifiers__Group__2 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4475:2: rule__ParametersAndQualifiers__Group__1__Impl rule__ParametersAndQualifiers__Group__2
            {
            pushFollow(FOLLOW_rule__ParametersAndQualifiers__Group__1__Impl_in_rule__ParametersAndQualifiers__Group__19301);
            rule__ParametersAndQualifiers__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParametersAndQualifiers__Group__2_in_rule__ParametersAndQualifiers__Group__19304);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4482:1: rule__ParametersAndQualifiers__Group__1__Impl : ( ruleParameterDeclarationClause ) ;
    public final void rule__ParametersAndQualifiers__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4486:1: ( ( ruleParameterDeclarationClause ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4487:1: ( ruleParameterDeclarationClause )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4487:1: ( ruleParameterDeclarationClause )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4488:1: ruleParameterDeclarationClause
            {
             before(grammarAccess.getParametersAndQualifiersAccess().getParameterDeclarationClauseParserRuleCall_1()); 
            pushFollow(FOLLOW_ruleParameterDeclarationClause_in_rule__ParametersAndQualifiers__Group__1__Impl9331);
            ruleParameterDeclarationClause();

            state._fsp--;

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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4499:1: rule__ParametersAndQualifiers__Group__2 : rule__ParametersAndQualifiers__Group__2__Impl rule__ParametersAndQualifiers__Group__3 ;
    public final void rule__ParametersAndQualifiers__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4503:1: ( rule__ParametersAndQualifiers__Group__2__Impl rule__ParametersAndQualifiers__Group__3 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4504:2: rule__ParametersAndQualifiers__Group__2__Impl rule__ParametersAndQualifiers__Group__3
            {
            pushFollow(FOLLOW_rule__ParametersAndQualifiers__Group__2__Impl_in_rule__ParametersAndQualifiers__Group__29360);
            rule__ParametersAndQualifiers__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParametersAndQualifiers__Group__3_in_rule__ParametersAndQualifiers__Group__29363);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4511:1: rule__ParametersAndQualifiers__Group__2__Impl : ( ')' ) ;
    public final void rule__ParametersAndQualifiers__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4515:1: ( ( ')' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4516:1: ( ')' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4516:1: ( ')' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4517:1: ')'
            {
             before(grammarAccess.getParametersAndQualifiersAccess().getRightParenthesisKeyword_2()); 
            match(input,108,FOLLOW_108_in_rule__ParametersAndQualifiers__Group__2__Impl9391); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4530:1: rule__ParametersAndQualifiers__Group__3 : rule__ParametersAndQualifiers__Group__3__Impl rule__ParametersAndQualifiers__Group__4 ;
    public final void rule__ParametersAndQualifiers__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4534:1: ( rule__ParametersAndQualifiers__Group__3__Impl rule__ParametersAndQualifiers__Group__4 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4535:2: rule__ParametersAndQualifiers__Group__3__Impl rule__ParametersAndQualifiers__Group__4
            {
            pushFollow(FOLLOW_rule__ParametersAndQualifiers__Group__3__Impl_in_rule__ParametersAndQualifiers__Group__39422);
            rule__ParametersAndQualifiers__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParametersAndQualifiers__Group__4_in_rule__ParametersAndQualifiers__Group__39425);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4542:1: rule__ParametersAndQualifiers__Group__3__Impl : ( ( ruleAttributeSpecifier )* ) ;
    public final void rule__ParametersAndQualifiers__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4546:1: ( ( ( ruleAttributeSpecifier )* ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4547:1: ( ( ruleAttributeSpecifier )* )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4547:1: ( ( ruleAttributeSpecifier )* )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4548:1: ( ruleAttributeSpecifier )*
            {
             before(grammarAccess.getParametersAndQualifiersAccess().getAttributeSpecifierParserRuleCall_3()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4549:1: ( ruleAttributeSpecifier )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==104) ) {
                    int LA45_2 = input.LA(2);

                    if ( (LA45_2==104) ) {
                        alt45=1;
                    }


                }
                else if ( (LA45_0==106) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4549:3: ruleAttributeSpecifier
            	    {
            	    pushFollow(FOLLOW_ruleAttributeSpecifier_in_rule__ParametersAndQualifiers__Group__3__Impl9453);
            	    ruleAttributeSpecifier();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop45;
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4559:1: rule__ParametersAndQualifiers__Group__4 : rule__ParametersAndQualifiers__Group__4__Impl rule__ParametersAndQualifiers__Group__5 ;
    public final void rule__ParametersAndQualifiers__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4563:1: ( rule__ParametersAndQualifiers__Group__4__Impl rule__ParametersAndQualifiers__Group__5 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4564:2: rule__ParametersAndQualifiers__Group__4__Impl rule__ParametersAndQualifiers__Group__5
            {
            pushFollow(FOLLOW_rule__ParametersAndQualifiers__Group__4__Impl_in_rule__ParametersAndQualifiers__Group__49484);
            rule__ParametersAndQualifiers__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParametersAndQualifiers__Group__5_in_rule__ParametersAndQualifiers__Group__49487);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4571:1: rule__ParametersAndQualifiers__Group__4__Impl : ( ( rule__ParametersAndQualifiers__Alternatives_4 )* ) ;
    public final void rule__ParametersAndQualifiers__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4575:1: ( ( ( rule__ParametersAndQualifiers__Alternatives_4 )* ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4576:1: ( ( rule__ParametersAndQualifiers__Alternatives_4 )* )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4576:1: ( ( rule__ParametersAndQualifiers__Alternatives_4 )* )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4577:1: ( rule__ParametersAndQualifiers__Alternatives_4 )*
            {
             before(grammarAccess.getParametersAndQualifiersAccess().getAlternatives_4()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4578:1: ( rule__ParametersAndQualifiers__Alternatives_4 )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( ((LA46_0>=59 && LA46_0<=60)) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4578:2: rule__ParametersAndQualifiers__Alternatives_4
            	    {
            	    pushFollow(FOLLOW_rule__ParametersAndQualifiers__Alternatives_4_in_rule__ParametersAndQualifiers__Group__4__Impl9514);
            	    rule__ParametersAndQualifiers__Alternatives_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);

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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4588:1: rule__ParametersAndQualifiers__Group__5 : rule__ParametersAndQualifiers__Group__5__Impl rule__ParametersAndQualifiers__Group__6 ;
    public final void rule__ParametersAndQualifiers__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4592:1: ( rule__ParametersAndQualifiers__Group__5__Impl rule__ParametersAndQualifiers__Group__6 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4593:2: rule__ParametersAndQualifiers__Group__5__Impl rule__ParametersAndQualifiers__Group__6
            {
            pushFollow(FOLLOW_rule__ParametersAndQualifiers__Group__5__Impl_in_rule__ParametersAndQualifiers__Group__59545);
            rule__ParametersAndQualifiers__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParametersAndQualifiers__Group__6_in_rule__ParametersAndQualifiers__Group__59548);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4600:1: rule__ParametersAndQualifiers__Group__5__Impl : ( ( rule__ParametersAndQualifiers__Alternatives_5 )* ) ;
    public final void rule__ParametersAndQualifiers__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4604:1: ( ( ( rule__ParametersAndQualifiers__Alternatives_5 )* ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4605:1: ( ( rule__ParametersAndQualifiers__Alternatives_5 )* )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4605:1: ( ( rule__ParametersAndQualifiers__Alternatives_5 )* )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4606:1: ( rule__ParametersAndQualifiers__Alternatives_5 )*
            {
             before(grammarAccess.getParametersAndQualifiersAccess().getAlternatives_5()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4607:1: ( rule__ParametersAndQualifiers__Alternatives_5 )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( ((LA47_0>=61 && LA47_0<=62)) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4607:2: rule__ParametersAndQualifiers__Alternatives_5
            	    {
            	    pushFollow(FOLLOW_rule__ParametersAndQualifiers__Alternatives_5_in_rule__ParametersAndQualifiers__Group__5__Impl9575);
            	    rule__ParametersAndQualifiers__Alternatives_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);

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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4617:1: rule__ParametersAndQualifiers__Group__6 : rule__ParametersAndQualifiers__Group__6__Impl ;
    public final void rule__ParametersAndQualifiers__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4621:1: ( rule__ParametersAndQualifiers__Group__6__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4622:2: rule__ParametersAndQualifiers__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__ParametersAndQualifiers__Group__6__Impl_in_rule__ParametersAndQualifiers__Group__69606);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4628:1: rule__ParametersAndQualifiers__Group__6__Impl : ( ( ruleExceptionSpecification )? ) ;
    public final void rule__ParametersAndQualifiers__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4632:1: ( ( ( ruleExceptionSpecification )? ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4633:1: ( ( ruleExceptionSpecification )? )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4633:1: ( ( ruleExceptionSpecification )? )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4634:1: ( ruleExceptionSpecification )?
            {
             before(grammarAccess.getParametersAndQualifiersAccess().getExceptionSpecificationParserRuleCall_6()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4635:1: ( ruleExceptionSpecification )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( ((LA48_0>=115 && LA48_0<=116)) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4635:3: ruleExceptionSpecification
                    {
                    pushFollow(FOLLOW_ruleExceptionSpecification_in_rule__ParametersAndQualifiers__Group__6__Impl9634);
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


    // $ANTLR start "rule__TrailingReturnType__Group__0"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4659:1: rule__TrailingReturnType__Group__0 : rule__TrailingReturnType__Group__0__Impl rule__TrailingReturnType__Group__1 ;
    public final void rule__TrailingReturnType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4663:1: ( rule__TrailingReturnType__Group__0__Impl rule__TrailingReturnType__Group__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4664:2: rule__TrailingReturnType__Group__0__Impl rule__TrailingReturnType__Group__1
            {
            pushFollow(FOLLOW_rule__TrailingReturnType__Group__0__Impl_in_rule__TrailingReturnType__Group__09679);
            rule__TrailingReturnType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TrailingReturnType__Group__1_in_rule__TrailingReturnType__Group__09682);
            rule__TrailingReturnType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrailingReturnType__Group__0"


    // $ANTLR start "rule__TrailingReturnType__Group__0__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4671:1: rule__TrailingReturnType__Group__0__Impl : ( '->' ) ;
    public final void rule__TrailingReturnType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4675:1: ( ( '->' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4676:1: ( '->' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4676:1: ( '->' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4677:1: '->'
            {
             before(grammarAccess.getTrailingReturnTypeAccess().getHyphenMinusGreaterThanSignKeyword_0()); 
            match(input,98,FOLLOW_98_in_rule__TrailingReturnType__Group__0__Impl9710); 
             after(grammarAccess.getTrailingReturnTypeAccess().getHyphenMinusGreaterThanSignKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrailingReturnType__Group__0__Impl"


    // $ANTLR start "rule__TrailingReturnType__Group__1"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4690:1: rule__TrailingReturnType__Group__1 : rule__TrailingReturnType__Group__1__Impl rule__TrailingReturnType__Group__2 ;
    public final void rule__TrailingReturnType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4694:1: ( rule__TrailingReturnType__Group__1__Impl rule__TrailingReturnType__Group__2 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4695:2: rule__TrailingReturnType__Group__1__Impl rule__TrailingReturnType__Group__2
            {
            pushFollow(FOLLOW_rule__TrailingReturnType__Group__1__Impl_in_rule__TrailingReturnType__Group__19741);
            rule__TrailingReturnType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TrailingReturnType__Group__2_in_rule__TrailingReturnType__Group__19744);
            rule__TrailingReturnType__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrailingReturnType__Group__1"


    // $ANTLR start "rule__TrailingReturnType__Group__1__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4702:1: rule__TrailingReturnType__Group__1__Impl : ( ( ( ruleTrailingTypeSpecifier ) ) ( ( ruleTrailingTypeSpecifier )* ) ) ;
    public final void rule__TrailingReturnType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4706:1: ( ( ( ( ruleTrailingTypeSpecifier ) ) ( ( ruleTrailingTypeSpecifier )* ) ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4707:1: ( ( ( ruleTrailingTypeSpecifier ) ) ( ( ruleTrailingTypeSpecifier )* ) )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4707:1: ( ( ( ruleTrailingTypeSpecifier ) ) ( ( ruleTrailingTypeSpecifier )* ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4708:1: ( ( ruleTrailingTypeSpecifier ) ) ( ( ruleTrailingTypeSpecifier )* )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4708:1: ( ( ruleTrailingTypeSpecifier ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4709:1: ( ruleTrailingTypeSpecifier )
            {
             before(grammarAccess.getTrailingReturnTypeAccess().getTrailingTypeSpecifierParserRuleCall_1()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4710:1: ( ruleTrailingTypeSpecifier )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4710:3: ruleTrailingTypeSpecifier
            {
            pushFollow(FOLLOW_ruleTrailingTypeSpecifier_in_rule__TrailingReturnType__Group__1__Impl9774);
            ruleTrailingTypeSpecifier();

            state._fsp--;


            }

             after(grammarAccess.getTrailingReturnTypeAccess().getTrailingTypeSpecifierParserRuleCall_1()); 

            }

            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4713:1: ( ( ruleTrailingTypeSpecifier )* )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4714:1: ( ruleTrailingTypeSpecifier )*
            {
             before(grammarAccess.getTrailingReturnTypeAccess().getTrailingTypeSpecifierParserRuleCall_1()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4715:1: ( ruleTrailingTypeSpecifier )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==54) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4715:3: ruleTrailingTypeSpecifier
            	    {
            	    pushFollow(FOLLOW_ruleTrailingTypeSpecifier_in_rule__TrailingReturnType__Group__1__Impl9787);
            	    ruleTrailingTypeSpecifier();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);

             after(grammarAccess.getTrailingReturnTypeAccess().getTrailingTypeSpecifierParserRuleCall_1()); 

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
    // $ANTLR end "rule__TrailingReturnType__Group__1__Impl"


    // $ANTLR start "rule__TrailingReturnType__Group__2"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4726:1: rule__TrailingReturnType__Group__2 : rule__TrailingReturnType__Group__2__Impl ;
    public final void rule__TrailingReturnType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4730:1: ( rule__TrailingReturnType__Group__2__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4731:2: rule__TrailingReturnType__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__TrailingReturnType__Group__2__Impl_in_rule__TrailingReturnType__Group__29820);
            rule__TrailingReturnType__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrailingReturnType__Group__2"


    // $ANTLR start "rule__TrailingReturnType__Group__2__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4737:1: rule__TrailingReturnType__Group__2__Impl : ( ( ruleAbstractDeclarator )? ) ;
    public final void rule__TrailingReturnType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4741:1: ( ( ( ruleAbstractDeclarator )? ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4742:1: ( ( ruleAbstractDeclarator )? )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4742:1: ( ( ruleAbstractDeclarator )? )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4743:1: ( ruleAbstractDeclarator )?
            {
             before(grammarAccess.getTrailingReturnTypeAccess().getAbstractDeclaratorParserRuleCall_2()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4744:1: ( ruleAbstractDeclarator )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==48) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4744:3: ruleAbstractDeclarator
                    {
                    pushFollow(FOLLOW_ruleAbstractDeclarator_in_rule__TrailingReturnType__Group__2__Impl9848);
                    ruleAbstractDeclarator();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTrailingReturnTypeAccess().getAbstractDeclaratorParserRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrailingReturnType__Group__2__Impl"


    // $ANTLR start "rule__PtrOperator__Group_0__0"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4760:1: rule__PtrOperator__Group_0__0 : rule__PtrOperator__Group_0__0__Impl rule__PtrOperator__Group_0__1 ;
    public final void rule__PtrOperator__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4764:1: ( rule__PtrOperator__Group_0__0__Impl rule__PtrOperator__Group_0__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4765:2: rule__PtrOperator__Group_0__0__Impl rule__PtrOperator__Group_0__1
            {
            pushFollow(FOLLOW_rule__PtrOperator__Group_0__0__Impl_in_rule__PtrOperator__Group_0__09885);
            rule__PtrOperator__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PtrOperator__Group_0__1_in_rule__PtrOperator__Group_0__09888);
            rule__PtrOperator__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PtrOperator__Group_0__0"


    // $ANTLR start "rule__PtrOperator__Group_0__0__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4772:1: rule__PtrOperator__Group_0__0__Impl : ( '*' ) ;
    public final void rule__PtrOperator__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4776:1: ( ( '*' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4777:1: ( '*' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4777:1: ( '*' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4778:1: '*'
            {
             before(grammarAccess.getPtrOperatorAccess().getAsteriskKeyword_0_0()); 
            match(input,67,FOLLOW_67_in_rule__PtrOperator__Group_0__0__Impl9916); 
             after(grammarAccess.getPtrOperatorAccess().getAsteriskKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PtrOperator__Group_0__0__Impl"


    // $ANTLR start "rule__PtrOperator__Group_0__1"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4791:1: rule__PtrOperator__Group_0__1 : rule__PtrOperator__Group_0__1__Impl rule__PtrOperator__Group_0__2 ;
    public final void rule__PtrOperator__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4795:1: ( rule__PtrOperator__Group_0__1__Impl rule__PtrOperator__Group_0__2 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4796:2: rule__PtrOperator__Group_0__1__Impl rule__PtrOperator__Group_0__2
            {
            pushFollow(FOLLOW_rule__PtrOperator__Group_0__1__Impl_in_rule__PtrOperator__Group_0__19947);
            rule__PtrOperator__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PtrOperator__Group_0__2_in_rule__PtrOperator__Group_0__19950);
            rule__PtrOperator__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PtrOperator__Group_0__1"


    // $ANTLR start "rule__PtrOperator__Group_0__1__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4803:1: rule__PtrOperator__Group_0__1__Impl : ( ( ruleAttributeSpecifier )* ) ;
    public final void rule__PtrOperator__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4807:1: ( ( ( ruleAttributeSpecifier )* ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4808:1: ( ( ruleAttributeSpecifier )* )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4808:1: ( ( ruleAttributeSpecifier )* )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4809:1: ( ruleAttributeSpecifier )*
            {
             before(grammarAccess.getPtrOperatorAccess().getAttributeSpecifierParserRuleCall_0_1()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4810:1: ( ruleAttributeSpecifier )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==104||LA51_0==106) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4810:3: ruleAttributeSpecifier
            	    {
            	    pushFollow(FOLLOW_ruleAttributeSpecifier_in_rule__PtrOperator__Group_0__1__Impl9978);
            	    ruleAttributeSpecifier();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop51;
                }
            } while (true);

             after(grammarAccess.getPtrOperatorAccess().getAttributeSpecifierParserRuleCall_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PtrOperator__Group_0__1__Impl"


    // $ANTLR start "rule__PtrOperator__Group_0__2"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4820:1: rule__PtrOperator__Group_0__2 : rule__PtrOperator__Group_0__2__Impl ;
    public final void rule__PtrOperator__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4824:1: ( rule__PtrOperator__Group_0__2__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4825:2: rule__PtrOperator__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__PtrOperator__Group_0__2__Impl_in_rule__PtrOperator__Group_0__210009);
            rule__PtrOperator__Group_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PtrOperator__Group_0__2"


    // $ANTLR start "rule__PtrOperator__Group_0__2__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4831:1: rule__PtrOperator__Group_0__2__Impl : ( ( rule__PtrOperator__Alternatives_0_2 )* ) ;
    public final void rule__PtrOperator__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4835:1: ( ( ( rule__PtrOperator__Alternatives_0_2 )* ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4836:1: ( ( rule__PtrOperator__Alternatives_0_2 )* )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4836:1: ( ( rule__PtrOperator__Alternatives_0_2 )* )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4837:1: ( rule__PtrOperator__Alternatives_0_2 )*
            {
             before(grammarAccess.getPtrOperatorAccess().getAlternatives_0_2()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4838:1: ( rule__PtrOperator__Alternatives_0_2 )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( ((LA52_0>=59 && LA52_0<=60)) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4838:2: rule__PtrOperator__Alternatives_0_2
            	    {
            	    pushFollow(FOLLOW_rule__PtrOperator__Alternatives_0_2_in_rule__PtrOperator__Group_0__2__Impl10036);
            	    rule__PtrOperator__Alternatives_0_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);

             after(grammarAccess.getPtrOperatorAccess().getAlternatives_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PtrOperator__Group_0__2__Impl"


    // $ANTLR start "rule__PtrOperator__Group_1__0"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4854:1: rule__PtrOperator__Group_1__0 : rule__PtrOperator__Group_1__0__Impl rule__PtrOperator__Group_1__1 ;
    public final void rule__PtrOperator__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4858:1: ( rule__PtrOperator__Group_1__0__Impl rule__PtrOperator__Group_1__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4859:2: rule__PtrOperator__Group_1__0__Impl rule__PtrOperator__Group_1__1
            {
            pushFollow(FOLLOW_rule__PtrOperator__Group_1__0__Impl_in_rule__PtrOperator__Group_1__010073);
            rule__PtrOperator__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PtrOperator__Group_1__1_in_rule__PtrOperator__Group_1__010076);
            rule__PtrOperator__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PtrOperator__Group_1__0"


    // $ANTLR start "rule__PtrOperator__Group_1__0__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4866:1: rule__PtrOperator__Group_1__0__Impl : ( '&' ) ;
    public final void rule__PtrOperator__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4870:1: ( ( '&' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4871:1: ( '&' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4871:1: ( '&' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4872:1: '&'
            {
             before(grammarAccess.getPtrOperatorAccess().getAmpersandKeyword_1_0()); 
            match(input,61,FOLLOW_61_in_rule__PtrOperator__Group_1__0__Impl10104); 
             after(grammarAccess.getPtrOperatorAccess().getAmpersandKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PtrOperator__Group_1__0__Impl"


    // $ANTLR start "rule__PtrOperator__Group_1__1"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4885:1: rule__PtrOperator__Group_1__1 : rule__PtrOperator__Group_1__1__Impl ;
    public final void rule__PtrOperator__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4889:1: ( rule__PtrOperator__Group_1__1__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4890:2: rule__PtrOperator__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__PtrOperator__Group_1__1__Impl_in_rule__PtrOperator__Group_1__110135);
            rule__PtrOperator__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PtrOperator__Group_1__1"


    // $ANTLR start "rule__PtrOperator__Group_1__1__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4896:1: rule__PtrOperator__Group_1__1__Impl : ( ( ruleAttributeSpecifier )* ) ;
    public final void rule__PtrOperator__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4900:1: ( ( ( ruleAttributeSpecifier )* ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4901:1: ( ( ruleAttributeSpecifier )* )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4901:1: ( ( ruleAttributeSpecifier )* )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4902:1: ( ruleAttributeSpecifier )*
            {
             before(grammarAccess.getPtrOperatorAccess().getAttributeSpecifierParserRuleCall_1_1()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4903:1: ( ruleAttributeSpecifier )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==104||LA53_0==106) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4903:3: ruleAttributeSpecifier
            	    {
            	    pushFollow(FOLLOW_ruleAttributeSpecifier_in_rule__PtrOperator__Group_1__1__Impl10163);
            	    ruleAttributeSpecifier();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop53;
                }
            } while (true);

             after(grammarAccess.getPtrOperatorAccess().getAttributeSpecifierParserRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PtrOperator__Group_1__1__Impl"


    // $ANTLR start "rule__PtrOperator__Group_2__0"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4917:1: rule__PtrOperator__Group_2__0 : rule__PtrOperator__Group_2__0__Impl rule__PtrOperator__Group_2__1 ;
    public final void rule__PtrOperator__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4921:1: ( rule__PtrOperator__Group_2__0__Impl rule__PtrOperator__Group_2__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4922:2: rule__PtrOperator__Group_2__0__Impl rule__PtrOperator__Group_2__1
            {
            pushFollow(FOLLOW_rule__PtrOperator__Group_2__0__Impl_in_rule__PtrOperator__Group_2__010198);
            rule__PtrOperator__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PtrOperator__Group_2__1_in_rule__PtrOperator__Group_2__010201);
            rule__PtrOperator__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PtrOperator__Group_2__0"


    // $ANTLR start "rule__PtrOperator__Group_2__0__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4929:1: rule__PtrOperator__Group_2__0__Impl : ( '&&' ) ;
    public final void rule__PtrOperator__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4933:1: ( ( '&&' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4934:1: ( '&&' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4934:1: ( '&&' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4935:1: '&&'
            {
             before(grammarAccess.getPtrOperatorAccess().getAmpersandAmpersandKeyword_2_0()); 
            match(input,62,FOLLOW_62_in_rule__PtrOperator__Group_2__0__Impl10229); 
             after(grammarAccess.getPtrOperatorAccess().getAmpersandAmpersandKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PtrOperator__Group_2__0__Impl"


    // $ANTLR start "rule__PtrOperator__Group_2__1"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4948:1: rule__PtrOperator__Group_2__1 : rule__PtrOperator__Group_2__1__Impl ;
    public final void rule__PtrOperator__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4952:1: ( rule__PtrOperator__Group_2__1__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4953:2: rule__PtrOperator__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__PtrOperator__Group_2__1__Impl_in_rule__PtrOperator__Group_2__110260);
            rule__PtrOperator__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PtrOperator__Group_2__1"


    // $ANTLR start "rule__PtrOperator__Group_2__1__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4959:1: rule__PtrOperator__Group_2__1__Impl : ( ( ruleAttributeSpecifier )* ) ;
    public final void rule__PtrOperator__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4963:1: ( ( ( ruleAttributeSpecifier )* ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4964:1: ( ( ruleAttributeSpecifier )* )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4964:1: ( ( ruleAttributeSpecifier )* )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4965:1: ( ruleAttributeSpecifier )*
            {
             before(grammarAccess.getPtrOperatorAccess().getAttributeSpecifierParserRuleCall_2_1()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4966:1: ( ruleAttributeSpecifier )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==104||LA54_0==106) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4966:3: ruleAttributeSpecifier
            	    {
            	    pushFollow(FOLLOW_ruleAttributeSpecifier_in_rule__PtrOperator__Group_2__1__Impl10288);
            	    ruleAttributeSpecifier();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop54;
                }
            } while (true);

             after(grammarAccess.getPtrOperatorAccess().getAttributeSpecifierParserRuleCall_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PtrOperator__Group_2__1__Impl"


    // $ANTLR start "rule__PtrOperator__Group_3__0"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4980:1: rule__PtrOperator__Group_3__0 : rule__PtrOperator__Group_3__0__Impl rule__PtrOperator__Group_3__1 ;
    public final void rule__PtrOperator__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4984:1: ( rule__PtrOperator__Group_3__0__Impl rule__PtrOperator__Group_3__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4985:2: rule__PtrOperator__Group_3__0__Impl rule__PtrOperator__Group_3__1
            {
            pushFollow(FOLLOW_rule__PtrOperator__Group_3__0__Impl_in_rule__PtrOperator__Group_3__010323);
            rule__PtrOperator__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PtrOperator__Group_3__1_in_rule__PtrOperator__Group_3__010326);
            rule__PtrOperator__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PtrOperator__Group_3__0"


    // $ANTLR start "rule__PtrOperator__Group_3__0__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4992:1: rule__PtrOperator__Group_3__0__Impl : ( ( '::' )? ) ;
    public final void rule__PtrOperator__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4996:1: ( ( ( '::' )? ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4997:1: ( ( '::' )? )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4997:1: ( ( '::' )? )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4998:1: ( '::' )?
            {
             before(grammarAccess.getPtrOperatorAccess().getColonColonKeyword_3_0()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4999:1: ( '::' )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==103) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5000:2: '::'
                    {
                    match(input,103,FOLLOW_103_in_rule__PtrOperator__Group_3__0__Impl10355); 

                    }
                    break;

            }

             after(grammarAccess.getPtrOperatorAccess().getColonColonKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PtrOperator__Group_3__0__Impl"


    // $ANTLR start "rule__PtrOperator__Group_3__1"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5011:1: rule__PtrOperator__Group_3__1 : rule__PtrOperator__Group_3__1__Impl rule__PtrOperator__Group_3__2 ;
    public final void rule__PtrOperator__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5015:1: ( rule__PtrOperator__Group_3__1__Impl rule__PtrOperator__Group_3__2 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5016:2: rule__PtrOperator__Group_3__1__Impl rule__PtrOperator__Group_3__2
            {
            pushFollow(FOLLOW_rule__PtrOperator__Group_3__1__Impl_in_rule__PtrOperator__Group_3__110388);
            rule__PtrOperator__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PtrOperator__Group_3__2_in_rule__PtrOperator__Group_3__110391);
            rule__PtrOperator__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PtrOperator__Group_3__1"


    // $ANTLR start "rule__PtrOperator__Group_3__1__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5023:1: rule__PtrOperator__Group_3__1__Impl : ( ruleNestedNameSpecifier ) ;
    public final void rule__PtrOperator__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5027:1: ( ( ruleNestedNameSpecifier ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5028:1: ( ruleNestedNameSpecifier )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5028:1: ( ruleNestedNameSpecifier )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5029:1: ruleNestedNameSpecifier
            {
             before(grammarAccess.getPtrOperatorAccess().getNestedNameSpecifierParserRuleCall_3_1()); 
            pushFollow(FOLLOW_ruleNestedNameSpecifier_in_rule__PtrOperator__Group_3__1__Impl10418);
            ruleNestedNameSpecifier();

            state._fsp--;

             after(grammarAccess.getPtrOperatorAccess().getNestedNameSpecifierParserRuleCall_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PtrOperator__Group_3__1__Impl"


    // $ANTLR start "rule__PtrOperator__Group_3__2"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5040:1: rule__PtrOperator__Group_3__2 : rule__PtrOperator__Group_3__2__Impl rule__PtrOperator__Group_3__3 ;
    public final void rule__PtrOperator__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5044:1: ( rule__PtrOperator__Group_3__2__Impl rule__PtrOperator__Group_3__3 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5045:2: rule__PtrOperator__Group_3__2__Impl rule__PtrOperator__Group_3__3
            {
            pushFollow(FOLLOW_rule__PtrOperator__Group_3__2__Impl_in_rule__PtrOperator__Group_3__210447);
            rule__PtrOperator__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PtrOperator__Group_3__3_in_rule__PtrOperator__Group_3__210450);
            rule__PtrOperator__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PtrOperator__Group_3__2"


    // $ANTLR start "rule__PtrOperator__Group_3__2__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5052:1: rule__PtrOperator__Group_3__2__Impl : ( '*' ) ;
    public final void rule__PtrOperator__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5056:1: ( ( '*' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5057:1: ( '*' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5057:1: ( '*' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5058:1: '*'
            {
             before(grammarAccess.getPtrOperatorAccess().getAsteriskKeyword_3_2()); 
            match(input,67,FOLLOW_67_in_rule__PtrOperator__Group_3__2__Impl10478); 
             after(grammarAccess.getPtrOperatorAccess().getAsteriskKeyword_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PtrOperator__Group_3__2__Impl"


    // $ANTLR start "rule__PtrOperator__Group_3__3"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5071:1: rule__PtrOperator__Group_3__3 : rule__PtrOperator__Group_3__3__Impl rule__PtrOperator__Group_3__4 ;
    public final void rule__PtrOperator__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5075:1: ( rule__PtrOperator__Group_3__3__Impl rule__PtrOperator__Group_3__4 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5076:2: rule__PtrOperator__Group_3__3__Impl rule__PtrOperator__Group_3__4
            {
            pushFollow(FOLLOW_rule__PtrOperator__Group_3__3__Impl_in_rule__PtrOperator__Group_3__310509);
            rule__PtrOperator__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PtrOperator__Group_3__4_in_rule__PtrOperator__Group_3__310512);
            rule__PtrOperator__Group_3__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PtrOperator__Group_3__3"


    // $ANTLR start "rule__PtrOperator__Group_3__3__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5083:1: rule__PtrOperator__Group_3__3__Impl : ( ( ruleAttributeSpecifier )* ) ;
    public final void rule__PtrOperator__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5087:1: ( ( ( ruleAttributeSpecifier )* ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5088:1: ( ( ruleAttributeSpecifier )* )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5088:1: ( ( ruleAttributeSpecifier )* )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5089:1: ( ruleAttributeSpecifier )*
            {
             before(grammarAccess.getPtrOperatorAccess().getAttributeSpecifierParserRuleCall_3_3()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5090:1: ( ruleAttributeSpecifier )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==104||LA56_0==106) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5090:3: ruleAttributeSpecifier
            	    {
            	    pushFollow(FOLLOW_ruleAttributeSpecifier_in_rule__PtrOperator__Group_3__3__Impl10540);
            	    ruleAttributeSpecifier();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop56;
                }
            } while (true);

             after(grammarAccess.getPtrOperatorAccess().getAttributeSpecifierParserRuleCall_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PtrOperator__Group_3__3__Impl"


    // $ANTLR start "rule__PtrOperator__Group_3__4"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5100:1: rule__PtrOperator__Group_3__4 : rule__PtrOperator__Group_3__4__Impl ;
    public final void rule__PtrOperator__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5104:1: ( rule__PtrOperator__Group_3__4__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5105:2: rule__PtrOperator__Group_3__4__Impl
            {
            pushFollow(FOLLOW_rule__PtrOperator__Group_3__4__Impl_in_rule__PtrOperator__Group_3__410571);
            rule__PtrOperator__Group_3__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PtrOperator__Group_3__4"


    // $ANTLR start "rule__PtrOperator__Group_3__4__Impl"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5111:1: rule__PtrOperator__Group_3__4__Impl : ( ( rule__PtrOperator__Alternatives_3_4 )* ) ;
    public final void rule__PtrOperator__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5115:1: ( ( ( rule__PtrOperator__Alternatives_3_4 )* ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5116:1: ( ( rule__PtrOperator__Alternatives_3_4 )* )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5116:1: ( ( rule__PtrOperator__Alternatives_3_4 )* )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5117:1: ( rule__PtrOperator__Alternatives_3_4 )*
            {
             before(grammarAccess.getPtrOperatorAccess().getAlternatives_3_4()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5118:1: ( rule__PtrOperator__Alternatives_3_4 )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( ((LA57_0>=59 && LA57_0<=60)) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5118:2: rule__PtrOperator__Alternatives_3_4
            	    {
            	    pushFollow(FOLLOW_rule__PtrOperator__Alternatives_3_4_in_rule__PtrOperator__Group_3__4__Impl10598);
            	    rule__PtrOperator__Alternatives_3_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop57;
                }
            } while (true);

             after(grammarAccess.getPtrOperatorAccess().getAlternatives_3_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PtrOperator__Group_3__4__Impl"


    // $ANTLR start "rule__DeclaratorId__Group_0__0"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5138:1: rule__DeclaratorId__Group_0__0 : rule__DeclaratorId__Group_0__0__Impl rule__DeclaratorId__Group_0__1 ;
    public final void rule__DeclaratorId__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5142:1: ( rule__DeclaratorId__Group_0__0__Impl rule__DeclaratorId__Group_0__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5143:2: rule__DeclaratorId__Group_0__0__Impl rule__DeclaratorId__Group_0__1
            {
            pushFollow(FOLLOW_rule__DeclaratorId__Group_0__0__Impl_in_rule__DeclaratorId__Group_0__010639);
            rule__DeclaratorId__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DeclaratorId__Group_0__1_in_rule__DeclaratorId__Group_0__010642);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5150:1: rule__DeclaratorId__Group_0__0__Impl : ( ( '...' )? ) ;
    public final void rule__DeclaratorId__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5154:1: ( ( ( '...' )? ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5155:1: ( ( '...' )? )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5155:1: ( ( '...' )? )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5156:1: ( '...' )?
            {
             before(grammarAccess.getDeclaratorIdAccess().getFullStopFullStopFullStopKeyword_0_0()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5157:1: ( '...' )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==101) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5158:2: '...'
                    {
                    match(input,101,FOLLOW_101_in_rule__DeclaratorId__Group_0__0__Impl10671); 

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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5169:1: rule__DeclaratorId__Group_0__1 : rule__DeclaratorId__Group_0__1__Impl ;
    public final void rule__DeclaratorId__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5173:1: ( rule__DeclaratorId__Group_0__1__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5174:2: rule__DeclaratorId__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__DeclaratorId__Group_0__1__Impl_in_rule__DeclaratorId__Group_0__110704);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5180:1: rule__DeclaratorId__Group_0__1__Impl : ( ruleIdExpression ) ;
    public final void rule__DeclaratorId__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5184:1: ( ( ruleIdExpression ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5185:1: ( ruleIdExpression )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5185:1: ( ruleIdExpression )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5186:1: ruleIdExpression
            {
             before(grammarAccess.getDeclaratorIdAccess().getIdExpressionParserRuleCall_0_1()); 
            pushFollow(FOLLOW_ruleIdExpression_in_rule__DeclaratorId__Group_0__1__Impl10731);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5201:1: rule__DeclaratorId__Group_1__0 : rule__DeclaratorId__Group_1__0__Impl rule__DeclaratorId__Group_1__1 ;
    public final void rule__DeclaratorId__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5205:1: ( rule__DeclaratorId__Group_1__0__Impl rule__DeclaratorId__Group_1__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5206:2: rule__DeclaratorId__Group_1__0__Impl rule__DeclaratorId__Group_1__1
            {
            pushFollow(FOLLOW_rule__DeclaratorId__Group_1__0__Impl_in_rule__DeclaratorId__Group_1__010764);
            rule__DeclaratorId__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DeclaratorId__Group_1__1_in_rule__DeclaratorId__Group_1__010767);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5213:1: rule__DeclaratorId__Group_1__0__Impl : ( ( '::' )? ) ;
    public final void rule__DeclaratorId__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5217:1: ( ( ( '::' )? ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5218:1: ( ( '::' )? )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5218:1: ( ( '::' )? )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5219:1: ( '::' )?
            {
             before(grammarAccess.getDeclaratorIdAccess().getColonColonKeyword_1_0()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5220:1: ( '::' )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==103) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5221:2: '::'
                    {
                    match(input,103,FOLLOW_103_in_rule__DeclaratorId__Group_1__0__Impl10796); 

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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5232:1: rule__DeclaratorId__Group_1__1 : rule__DeclaratorId__Group_1__1__Impl rule__DeclaratorId__Group_1__2 ;
    public final void rule__DeclaratorId__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5236:1: ( rule__DeclaratorId__Group_1__1__Impl rule__DeclaratorId__Group_1__2 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5237:2: rule__DeclaratorId__Group_1__1__Impl rule__DeclaratorId__Group_1__2
            {
            pushFollow(FOLLOW_rule__DeclaratorId__Group_1__1__Impl_in_rule__DeclaratorId__Group_1__110829);
            rule__DeclaratorId__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DeclaratorId__Group_1__2_in_rule__DeclaratorId__Group_1__110832);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5244:1: rule__DeclaratorId__Group_1__1__Impl : ( ( ruleNestedNameSpecifier )? ) ;
    public final void rule__DeclaratorId__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5248:1: ( ( ( ruleNestedNameSpecifier )? ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5249:1: ( ( ruleNestedNameSpecifier )? )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5249:1: ( ( ruleNestedNameSpecifier )? )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5250:1: ( ruleNestedNameSpecifier )?
            {
             before(grammarAccess.getDeclaratorIdAccess().getNestedNameSpecifierParserRuleCall_1_1()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5251:1: ( ruleNestedNameSpecifier )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==44) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5251:3: ruleNestedNameSpecifier
                    {
                    pushFollow(FOLLOW_ruleNestedNameSpecifier_in_rule__DeclaratorId__Group_1__1__Impl10860);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5261:1: rule__DeclaratorId__Group_1__2 : rule__DeclaratorId__Group_1__2__Impl ;
    public final void rule__DeclaratorId__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5265:1: ( rule__DeclaratorId__Group_1__2__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5266:2: rule__DeclaratorId__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__DeclaratorId__Group_1__2__Impl_in_rule__DeclaratorId__Group_1__210891);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5272:1: rule__DeclaratorId__Group_1__2__Impl : ( ruleClassName ) ;
    public final void rule__DeclaratorId__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5276:1: ( ( ruleClassName ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5277:1: ( ruleClassName )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5277:1: ( ruleClassName )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5278:1: ruleClassName
            {
             before(grammarAccess.getDeclaratorIdAccess().getClassNameParserRuleCall_1_2()); 
            pushFollow(FOLLOW_ruleClassName_in_rule__DeclaratorId__Group_1__2__Impl10918);
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


    // $ANTLR start "rule__OperatorFunctionId__Group__0"
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5295:1: rule__OperatorFunctionId__Group__0 : rule__OperatorFunctionId__Group__0__Impl rule__OperatorFunctionId__Group__1 ;
    public final void rule__OperatorFunctionId__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5299:1: ( rule__OperatorFunctionId__Group__0__Impl rule__OperatorFunctionId__Group__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5300:2: rule__OperatorFunctionId__Group__0__Impl rule__OperatorFunctionId__Group__1
            {
            pushFollow(FOLLOW_rule__OperatorFunctionId__Group__0__Impl_in_rule__OperatorFunctionId__Group__010953);
            rule__OperatorFunctionId__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OperatorFunctionId__Group__1_in_rule__OperatorFunctionId__Group__010956);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5307:1: rule__OperatorFunctionId__Group__0__Impl : ( 'operator' ) ;
    public final void rule__OperatorFunctionId__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5311:1: ( ( 'operator' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5312:1: ( 'operator' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5312:1: ( 'operator' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5313:1: 'operator'
            {
             before(grammarAccess.getOperatorFunctionIdAccess().getOperatorKeyword_0()); 
            match(input,109,FOLLOW_109_in_rule__OperatorFunctionId__Group__0__Impl10984); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5326:1: rule__OperatorFunctionId__Group__1 : rule__OperatorFunctionId__Group__1__Impl rule__OperatorFunctionId__Group__2 ;
    public final void rule__OperatorFunctionId__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5330:1: ( rule__OperatorFunctionId__Group__1__Impl rule__OperatorFunctionId__Group__2 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5331:2: rule__OperatorFunctionId__Group__1__Impl rule__OperatorFunctionId__Group__2
            {
            pushFollow(FOLLOW_rule__OperatorFunctionId__Group__1__Impl_in_rule__OperatorFunctionId__Group__111015);
            rule__OperatorFunctionId__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OperatorFunctionId__Group__2_in_rule__OperatorFunctionId__Group__111018);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5338:1: rule__OperatorFunctionId__Group__1__Impl : ( ruleOverloadableOperator ) ;
    public final void rule__OperatorFunctionId__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5342:1: ( ( ruleOverloadableOperator ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5343:1: ( ruleOverloadableOperator )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5343:1: ( ruleOverloadableOperator )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5344:1: ruleOverloadableOperator
            {
             before(grammarAccess.getOperatorFunctionIdAccess().getOverloadableOperatorParserRuleCall_1()); 
            pushFollow(FOLLOW_ruleOverloadableOperator_in_rule__OperatorFunctionId__Group__1__Impl11045);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5355:1: rule__OperatorFunctionId__Group__2 : rule__OperatorFunctionId__Group__2__Impl ;
    public final void rule__OperatorFunctionId__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5359:1: ( rule__OperatorFunctionId__Group__2__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5360:2: rule__OperatorFunctionId__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__OperatorFunctionId__Group__2__Impl_in_rule__OperatorFunctionId__Group__211074);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5366:1: rule__OperatorFunctionId__Group__2__Impl : ( ( rule__OperatorFunctionId__Group_2__0 )? ) ;
    public final void rule__OperatorFunctionId__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5370:1: ( ( ( rule__OperatorFunctionId__Group_2__0 )? ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5371:1: ( ( rule__OperatorFunctionId__Group_2__0 )? )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5371:1: ( ( rule__OperatorFunctionId__Group_2__0 )? )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5372:1: ( rule__OperatorFunctionId__Group_2__0 )?
            {
             before(grammarAccess.getOperatorFunctionIdAccess().getGroup_2()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5373:1: ( rule__OperatorFunctionId__Group_2__0 )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==75) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5373:2: rule__OperatorFunctionId__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__OperatorFunctionId__Group_2__0_in_rule__OperatorFunctionId__Group__2__Impl11101);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5389:1: rule__OperatorFunctionId__Group_2__0 : rule__OperatorFunctionId__Group_2__0__Impl rule__OperatorFunctionId__Group_2__1 ;
    public final void rule__OperatorFunctionId__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5393:1: ( rule__OperatorFunctionId__Group_2__0__Impl rule__OperatorFunctionId__Group_2__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5394:2: rule__OperatorFunctionId__Group_2__0__Impl rule__OperatorFunctionId__Group_2__1
            {
            pushFollow(FOLLOW_rule__OperatorFunctionId__Group_2__0__Impl_in_rule__OperatorFunctionId__Group_2__011138);
            rule__OperatorFunctionId__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OperatorFunctionId__Group_2__1_in_rule__OperatorFunctionId__Group_2__011141);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5401:1: rule__OperatorFunctionId__Group_2__0__Impl : ( '<' ) ;
    public final void rule__OperatorFunctionId__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5405:1: ( ( '<' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5406:1: ( '<' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5406:1: ( '<' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5407:1: '<'
            {
             before(grammarAccess.getOperatorFunctionIdAccess().getLessThanSignKeyword_2_0()); 
            match(input,75,FOLLOW_75_in_rule__OperatorFunctionId__Group_2__0__Impl11169); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5420:1: rule__OperatorFunctionId__Group_2__1 : rule__OperatorFunctionId__Group_2__1__Impl rule__OperatorFunctionId__Group_2__2 ;
    public final void rule__OperatorFunctionId__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5424:1: ( rule__OperatorFunctionId__Group_2__1__Impl rule__OperatorFunctionId__Group_2__2 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5425:2: rule__OperatorFunctionId__Group_2__1__Impl rule__OperatorFunctionId__Group_2__2
            {
            pushFollow(FOLLOW_rule__OperatorFunctionId__Group_2__1__Impl_in_rule__OperatorFunctionId__Group_2__111200);
            rule__OperatorFunctionId__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OperatorFunctionId__Group_2__2_in_rule__OperatorFunctionId__Group_2__111203);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5432:1: rule__OperatorFunctionId__Group_2__1__Impl : ( ( ruleTemplateArgument )* ) ;
    public final void rule__OperatorFunctionId__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5436:1: ( ( ( ruleTemplateArgument )* ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5437:1: ( ( ruleTemplateArgument )* )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5437:1: ( ( ruleTemplateArgument )* )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5438:1: ( ruleTemplateArgument )*
            {
             before(grammarAccess.getOperatorFunctionIdAccess().getTemplateArgumentParserRuleCall_2_1()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5439:1: ( ruleTemplateArgument )*
            loop62:
            do {
                int alt62=2;
                int LA62_0 = input.LA(1);

                if ( ((LA62_0>=39 && LA62_0<=41)) ) {
                    alt62=1;
                }


                switch (alt62) {
            	case 1 :
            	    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5439:3: ruleTemplateArgument
            	    {
            	    pushFollow(FOLLOW_ruleTemplateArgument_in_rule__OperatorFunctionId__Group_2__1__Impl11231);
            	    ruleTemplateArgument();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop62;
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5449:1: rule__OperatorFunctionId__Group_2__2 : rule__OperatorFunctionId__Group_2__2__Impl ;
    public final void rule__OperatorFunctionId__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5453:1: ( rule__OperatorFunctionId__Group_2__2__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5454:2: rule__OperatorFunctionId__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__OperatorFunctionId__Group_2__2__Impl_in_rule__OperatorFunctionId__Group_2__211262);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5460:1: rule__OperatorFunctionId__Group_2__2__Impl : ( '>' ) ;
    public final void rule__OperatorFunctionId__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5464:1: ( ( '>' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5465:1: ( '>' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5465:1: ( '>' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5466:1: '>'
            {
             before(grammarAccess.getOperatorFunctionIdAccess().getGreaterThanSignKeyword_2_2()); 
            match(input,76,FOLLOW_76_in_rule__OperatorFunctionId__Group_2__2__Impl11290); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5485:1: rule__OverloadableOperator__Group_2__0 : rule__OverloadableOperator__Group_2__0__Impl rule__OverloadableOperator__Group_2__1 ;
    public final void rule__OverloadableOperator__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5489:1: ( rule__OverloadableOperator__Group_2__0__Impl rule__OverloadableOperator__Group_2__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5490:2: rule__OverloadableOperator__Group_2__0__Impl rule__OverloadableOperator__Group_2__1
            {
            pushFollow(FOLLOW_rule__OverloadableOperator__Group_2__0__Impl_in_rule__OverloadableOperator__Group_2__011327);
            rule__OverloadableOperator__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OverloadableOperator__Group_2__1_in_rule__OverloadableOperator__Group_2__011330);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5497:1: rule__OverloadableOperator__Group_2__0__Impl : ( 'new' ) ;
    public final void rule__OverloadableOperator__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5501:1: ( ( 'new' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5502:1: ( 'new' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5502:1: ( 'new' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5503:1: 'new'
            {
             before(grammarAccess.getOverloadableOperatorAccess().getNewKeyword_2_0()); 
            match(input,63,FOLLOW_63_in_rule__OverloadableOperator__Group_2__0__Impl11358); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5516:1: rule__OverloadableOperator__Group_2__1 : rule__OverloadableOperator__Group_2__1__Impl rule__OverloadableOperator__Group_2__2 ;
    public final void rule__OverloadableOperator__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5520:1: ( rule__OverloadableOperator__Group_2__1__Impl rule__OverloadableOperator__Group_2__2 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5521:2: rule__OverloadableOperator__Group_2__1__Impl rule__OverloadableOperator__Group_2__2
            {
            pushFollow(FOLLOW_rule__OverloadableOperator__Group_2__1__Impl_in_rule__OverloadableOperator__Group_2__111389);
            rule__OverloadableOperator__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OverloadableOperator__Group_2__2_in_rule__OverloadableOperator__Group_2__111392);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5528:1: rule__OverloadableOperator__Group_2__1__Impl : ( '[' ) ;
    public final void rule__OverloadableOperator__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5532:1: ( ( '[' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5533:1: ( '[' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5533:1: ( '[' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5534:1: '['
            {
             before(grammarAccess.getOverloadableOperatorAccess().getLeftSquareBracketKeyword_2_1()); 
            match(input,104,FOLLOW_104_in_rule__OverloadableOperator__Group_2__1__Impl11420); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5547:1: rule__OverloadableOperator__Group_2__2 : rule__OverloadableOperator__Group_2__2__Impl ;
    public final void rule__OverloadableOperator__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5551:1: ( rule__OverloadableOperator__Group_2__2__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5552:2: rule__OverloadableOperator__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__OverloadableOperator__Group_2__2__Impl_in_rule__OverloadableOperator__Group_2__211451);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5558:1: rule__OverloadableOperator__Group_2__2__Impl : ( ']' ) ;
    public final void rule__OverloadableOperator__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5562:1: ( ( ']' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5563:1: ( ']' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5563:1: ( ']' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5564:1: ']'
            {
             before(grammarAccess.getOverloadableOperatorAccess().getRightSquareBracketKeyword_2_2()); 
            match(input,105,FOLLOW_105_in_rule__OverloadableOperator__Group_2__2__Impl11479); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5583:1: rule__OverloadableOperator__Group_3__0 : rule__OverloadableOperator__Group_3__0__Impl rule__OverloadableOperator__Group_3__1 ;
    public final void rule__OverloadableOperator__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5587:1: ( rule__OverloadableOperator__Group_3__0__Impl rule__OverloadableOperator__Group_3__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5588:2: rule__OverloadableOperator__Group_3__0__Impl rule__OverloadableOperator__Group_3__1
            {
            pushFollow(FOLLOW_rule__OverloadableOperator__Group_3__0__Impl_in_rule__OverloadableOperator__Group_3__011516);
            rule__OverloadableOperator__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OverloadableOperator__Group_3__1_in_rule__OverloadableOperator__Group_3__011519);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5595:1: rule__OverloadableOperator__Group_3__0__Impl : ( 'delete' ) ;
    public final void rule__OverloadableOperator__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5599:1: ( ( 'delete' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5600:1: ( 'delete' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5600:1: ( 'delete' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5601:1: 'delete'
            {
             before(grammarAccess.getOverloadableOperatorAccess().getDeleteKeyword_3_0()); 
            match(input,64,FOLLOW_64_in_rule__OverloadableOperator__Group_3__0__Impl11547); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5614:1: rule__OverloadableOperator__Group_3__1 : rule__OverloadableOperator__Group_3__1__Impl rule__OverloadableOperator__Group_3__2 ;
    public final void rule__OverloadableOperator__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5618:1: ( rule__OverloadableOperator__Group_3__1__Impl rule__OverloadableOperator__Group_3__2 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5619:2: rule__OverloadableOperator__Group_3__1__Impl rule__OverloadableOperator__Group_3__2
            {
            pushFollow(FOLLOW_rule__OverloadableOperator__Group_3__1__Impl_in_rule__OverloadableOperator__Group_3__111578);
            rule__OverloadableOperator__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OverloadableOperator__Group_3__2_in_rule__OverloadableOperator__Group_3__111581);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5626:1: rule__OverloadableOperator__Group_3__1__Impl : ( '[' ) ;
    public final void rule__OverloadableOperator__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5630:1: ( ( '[' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5631:1: ( '[' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5631:1: ( '[' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5632:1: '['
            {
             before(grammarAccess.getOverloadableOperatorAccess().getLeftSquareBracketKeyword_3_1()); 
            match(input,104,FOLLOW_104_in_rule__OverloadableOperator__Group_3__1__Impl11609); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5645:1: rule__OverloadableOperator__Group_3__2 : rule__OverloadableOperator__Group_3__2__Impl ;
    public final void rule__OverloadableOperator__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5649:1: ( rule__OverloadableOperator__Group_3__2__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5650:2: rule__OverloadableOperator__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__OverloadableOperator__Group_3__2__Impl_in_rule__OverloadableOperator__Group_3__211640);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5656:1: rule__OverloadableOperator__Group_3__2__Impl : ( ']' ) ;
    public final void rule__OverloadableOperator__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5660:1: ( ( ']' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5661:1: ( ']' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5661:1: ( ']' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5662:1: ']'
            {
             before(grammarAccess.getOverloadableOperatorAccess().getRightSquareBracketKeyword_3_2()); 
            match(input,105,FOLLOW_105_in_rule__OverloadableOperator__Group_3__2__Impl11668); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5681:1: rule__LiteralOperatorId__Group__0 : rule__LiteralOperatorId__Group__0__Impl rule__LiteralOperatorId__Group__1 ;
    public final void rule__LiteralOperatorId__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5685:1: ( rule__LiteralOperatorId__Group__0__Impl rule__LiteralOperatorId__Group__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5686:2: rule__LiteralOperatorId__Group__0__Impl rule__LiteralOperatorId__Group__1
            {
            pushFollow(FOLLOW_rule__LiteralOperatorId__Group__0__Impl_in_rule__LiteralOperatorId__Group__011705);
            rule__LiteralOperatorId__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LiteralOperatorId__Group__1_in_rule__LiteralOperatorId__Group__011708);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5693:1: rule__LiteralOperatorId__Group__0__Impl : ( 'operator' ) ;
    public final void rule__LiteralOperatorId__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5697:1: ( ( 'operator' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5698:1: ( 'operator' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5698:1: ( 'operator' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5699:1: 'operator'
            {
             before(grammarAccess.getLiteralOperatorIdAccess().getOperatorKeyword_0()); 
            match(input,109,FOLLOW_109_in_rule__LiteralOperatorId__Group__0__Impl11736); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5712:1: rule__LiteralOperatorId__Group__1 : rule__LiteralOperatorId__Group__1__Impl rule__LiteralOperatorId__Group__2 ;
    public final void rule__LiteralOperatorId__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5716:1: ( rule__LiteralOperatorId__Group__1__Impl rule__LiteralOperatorId__Group__2 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5717:2: rule__LiteralOperatorId__Group__1__Impl rule__LiteralOperatorId__Group__2
            {
            pushFollow(FOLLOW_rule__LiteralOperatorId__Group__1__Impl_in_rule__LiteralOperatorId__Group__111767);
            rule__LiteralOperatorId__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LiteralOperatorId__Group__2_in_rule__LiteralOperatorId__Group__111770);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5724:1: rule__LiteralOperatorId__Group__1__Impl : ( '\"' ) ;
    public final void rule__LiteralOperatorId__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5728:1: ( ( '\"' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5729:1: ( '\"' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5729:1: ( '\"' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5730:1: '\"'
            {
             before(grammarAccess.getLiteralOperatorIdAccess().getQuotationMarkKeyword_1()); 
            match(input,110,FOLLOW_110_in_rule__LiteralOperatorId__Group__1__Impl11798); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5743:1: rule__LiteralOperatorId__Group__2 : rule__LiteralOperatorId__Group__2__Impl ;
    public final void rule__LiteralOperatorId__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5747:1: ( rule__LiteralOperatorId__Group__2__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5748:2: rule__LiteralOperatorId__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__LiteralOperatorId__Group__2__Impl_in_rule__LiteralOperatorId__Group__211829);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5754:1: rule__LiteralOperatorId__Group__2__Impl : ( '\"' ) ;
    public final void rule__LiteralOperatorId__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5758:1: ( ( '\"' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5759:1: ( '\"' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5759:1: ( '\"' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5760:1: '\"'
            {
             before(grammarAccess.getLiteralOperatorIdAccess().getQuotationMarkKeyword_2()); 
            match(input,110,FOLLOW_110_in_rule__LiteralOperatorId__Group__2__Impl11857); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5780:1: rule__TemplateParameterList__Group__0 : rule__TemplateParameterList__Group__0__Impl rule__TemplateParameterList__Group__1 ;
    public final void rule__TemplateParameterList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5784:1: ( rule__TemplateParameterList__Group__0__Impl rule__TemplateParameterList__Group__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5785:2: rule__TemplateParameterList__Group__0__Impl rule__TemplateParameterList__Group__1
            {
            pushFollow(FOLLOW_rule__TemplateParameterList__Group__0__Impl_in_rule__TemplateParameterList__Group__011895);
            rule__TemplateParameterList__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TemplateParameterList__Group__1_in_rule__TemplateParameterList__Group__011898);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5792:1: rule__TemplateParameterList__Group__0__Impl : ( ruleTemplateParameter ) ;
    public final void rule__TemplateParameterList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5796:1: ( ( ruleTemplateParameter ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5797:1: ( ruleTemplateParameter )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5797:1: ( ruleTemplateParameter )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5798:1: ruleTemplateParameter
            {
             before(grammarAccess.getTemplateParameterListAccess().getTemplateParameterParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleTemplateParameter_in_rule__TemplateParameterList__Group__0__Impl11925);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5809:1: rule__TemplateParameterList__Group__1 : rule__TemplateParameterList__Group__1__Impl ;
    public final void rule__TemplateParameterList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5813:1: ( rule__TemplateParameterList__Group__1__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5814:2: rule__TemplateParameterList__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__TemplateParameterList__Group__1__Impl_in_rule__TemplateParameterList__Group__111954);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5820:1: rule__TemplateParameterList__Group__1__Impl : ( ( rule__TemplateParameterList__Group_1__0 )* ) ;
    public final void rule__TemplateParameterList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5824:1: ( ( ( rule__TemplateParameterList__Group_1__0 )* ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5825:1: ( ( rule__TemplateParameterList__Group_1__0 )* )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5825:1: ( ( rule__TemplateParameterList__Group_1__0 )* )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5826:1: ( rule__TemplateParameterList__Group_1__0 )*
            {
             before(grammarAccess.getTemplateParameterListAccess().getGroup_1()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5827:1: ( rule__TemplateParameterList__Group_1__0 )*
            loop63:
            do {
                int alt63=2;
                int LA63_0 = input.LA(1);

                if ( (LA63_0==96) ) {
                    alt63=1;
                }


                switch (alt63) {
            	case 1 :
            	    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5827:2: rule__TemplateParameterList__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__TemplateParameterList__Group_1__0_in_rule__TemplateParameterList__Group__1__Impl11981);
            	    rule__TemplateParameterList__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop63;
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5841:1: rule__TemplateParameterList__Group_1__0 : rule__TemplateParameterList__Group_1__0__Impl rule__TemplateParameterList__Group_1__1 ;
    public final void rule__TemplateParameterList__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5845:1: ( rule__TemplateParameterList__Group_1__0__Impl rule__TemplateParameterList__Group_1__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5846:2: rule__TemplateParameterList__Group_1__0__Impl rule__TemplateParameterList__Group_1__1
            {
            pushFollow(FOLLOW_rule__TemplateParameterList__Group_1__0__Impl_in_rule__TemplateParameterList__Group_1__012016);
            rule__TemplateParameterList__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TemplateParameterList__Group_1__1_in_rule__TemplateParameterList__Group_1__012019);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5853:1: rule__TemplateParameterList__Group_1__0__Impl : ( ',' ) ;
    public final void rule__TemplateParameterList__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5857:1: ( ( ',' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5858:1: ( ',' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5858:1: ( ',' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5859:1: ','
            {
             before(grammarAccess.getTemplateParameterListAccess().getCommaKeyword_1_0()); 
            match(input,96,FOLLOW_96_in_rule__TemplateParameterList__Group_1__0__Impl12047); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5872:1: rule__TemplateParameterList__Group_1__1 : rule__TemplateParameterList__Group_1__1__Impl ;
    public final void rule__TemplateParameterList__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5876:1: ( rule__TemplateParameterList__Group_1__1__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5877:2: rule__TemplateParameterList__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__TemplateParameterList__Group_1__1__Impl_in_rule__TemplateParameterList__Group_1__112078);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5883:1: rule__TemplateParameterList__Group_1__1__Impl : ( ruleTemplateParameter ) ;
    public final void rule__TemplateParameterList__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5887:1: ( ( ruleTemplateParameter ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5888:1: ( ruleTemplateParameter )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5888:1: ( ruleTemplateParameter )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5889:1: ruleTemplateParameter
            {
             before(grammarAccess.getTemplateParameterListAccess().getTemplateParameterParserRuleCall_1_1()); 
            pushFollow(FOLLOW_ruleTemplateParameter_in_rule__TemplateParameterList__Group_1__1__Impl12105);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5904:1: rule__TypeParameter__Group_0__0 : rule__TypeParameter__Group_0__0__Impl rule__TypeParameter__Group_0__1 ;
    public final void rule__TypeParameter__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5908:1: ( rule__TypeParameter__Group_0__0__Impl rule__TypeParameter__Group_0__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5909:2: rule__TypeParameter__Group_0__0__Impl rule__TypeParameter__Group_0__1
            {
            pushFollow(FOLLOW_rule__TypeParameter__Group_0__0__Impl_in_rule__TypeParameter__Group_0__012138);
            rule__TypeParameter__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeParameter__Group_0__1_in_rule__TypeParameter__Group_0__012141);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5916:1: rule__TypeParameter__Group_0__0__Impl : ( 'class' ) ;
    public final void rule__TypeParameter__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5920:1: ( ( 'class' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5921:1: ( 'class' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5921:1: ( 'class' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5922:1: 'class'
            {
             before(grammarAccess.getTypeParameterAccess().getClassKeyword_0_0()); 
            match(input,111,FOLLOW_111_in_rule__TypeParameter__Group_0__0__Impl12169); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5935:1: rule__TypeParameter__Group_0__1 : rule__TypeParameter__Group_0__1__Impl ;
    public final void rule__TypeParameter__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5939:1: ( rule__TypeParameter__Group_0__1__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5940:2: rule__TypeParameter__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__TypeParameter__Group_0__1__Impl_in_rule__TypeParameter__Group_0__112200);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5946:1: rule__TypeParameter__Group_0__1__Impl : ( ( rule__TypeParameter__Alternatives_0_1 ) ) ;
    public final void rule__TypeParameter__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5950:1: ( ( ( rule__TypeParameter__Alternatives_0_1 ) ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5951:1: ( ( rule__TypeParameter__Alternatives_0_1 ) )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5951:1: ( ( rule__TypeParameter__Alternatives_0_1 ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5952:1: ( rule__TypeParameter__Alternatives_0_1 )
            {
             before(grammarAccess.getTypeParameterAccess().getAlternatives_0_1()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5953:1: ( rule__TypeParameter__Alternatives_0_1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5953:2: rule__TypeParameter__Alternatives_0_1
            {
            pushFollow(FOLLOW_rule__TypeParameter__Alternatives_0_1_in_rule__TypeParameter__Group_0__1__Impl12227);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5967:1: rule__TypeParameter__Group_0_1_0__0 : rule__TypeParameter__Group_0_1_0__0__Impl rule__TypeParameter__Group_0_1_0__1 ;
    public final void rule__TypeParameter__Group_0_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5971:1: ( rule__TypeParameter__Group_0_1_0__0__Impl rule__TypeParameter__Group_0_1_0__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5972:2: rule__TypeParameter__Group_0_1_0__0__Impl rule__TypeParameter__Group_0_1_0__1
            {
            pushFollow(FOLLOW_rule__TypeParameter__Group_0_1_0__0__Impl_in_rule__TypeParameter__Group_0_1_0__012261);
            rule__TypeParameter__Group_0_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeParameter__Group_0_1_0__1_in_rule__TypeParameter__Group_0_1_0__012264);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5979:1: rule__TypeParameter__Group_0_1_0__0__Impl : ( ( '...' )? ) ;
    public final void rule__TypeParameter__Group_0_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5983:1: ( ( ( '...' )? ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5984:1: ( ( '...' )? )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5984:1: ( ( '...' )? )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5985:1: ( '...' )?
            {
             before(grammarAccess.getTypeParameterAccess().getFullStopFullStopFullStopKeyword_0_1_0_0()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5986:1: ( '...' )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==101) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5987:2: '...'
                    {
                    match(input,101,FOLLOW_101_in_rule__TypeParameter__Group_0_1_0__0__Impl12293); 

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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5998:1: rule__TypeParameter__Group_0_1_0__1 : rule__TypeParameter__Group_0_1_0__1__Impl ;
    public final void rule__TypeParameter__Group_0_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6002:1: ( rule__TypeParameter__Group_0_1_0__1__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6003:2: rule__TypeParameter__Group_0_1_0__1__Impl
            {
            pushFollow(FOLLOW_rule__TypeParameter__Group_0_1_0__1__Impl_in_rule__TypeParameter__Group_0_1_0__112326);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6009:1: rule__TypeParameter__Group_0_1_0__1__Impl : ( ( RULE_ID )? ) ;
    public final void rule__TypeParameter__Group_0_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6013:1: ( ( ( RULE_ID )? ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6014:1: ( ( RULE_ID )? )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6014:1: ( ( RULE_ID )? )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6015:1: ( RULE_ID )?
            {
             before(grammarAccess.getTypeParameterAccess().getIDTerminalRuleCall_0_1_0_1()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6016:1: ( RULE_ID )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==RULE_ID) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6016:3: RULE_ID
                    {
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TypeParameter__Group_0_1_0__1__Impl12354); 

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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6030:1: rule__TypeParameter__Group_0_1_1__0 : rule__TypeParameter__Group_0_1_1__0__Impl rule__TypeParameter__Group_0_1_1__1 ;
    public final void rule__TypeParameter__Group_0_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6034:1: ( rule__TypeParameter__Group_0_1_1__0__Impl rule__TypeParameter__Group_0_1_1__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6035:2: rule__TypeParameter__Group_0_1_1__0__Impl rule__TypeParameter__Group_0_1_1__1
            {
            pushFollow(FOLLOW_rule__TypeParameter__Group_0_1_1__0__Impl_in_rule__TypeParameter__Group_0_1_1__012389);
            rule__TypeParameter__Group_0_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeParameter__Group_0_1_1__1_in_rule__TypeParameter__Group_0_1_1__012392);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6042:1: rule__TypeParameter__Group_0_1_1__0__Impl : ( ( RULE_ID )? ) ;
    public final void rule__TypeParameter__Group_0_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6046:1: ( ( ( RULE_ID )? ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6047:1: ( ( RULE_ID )? )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6047:1: ( ( RULE_ID )? )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6048:1: ( RULE_ID )?
            {
             before(grammarAccess.getTypeParameterAccess().getIDTerminalRuleCall_0_1_1_0()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6049:1: ( RULE_ID )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==RULE_ID) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6049:3: RULE_ID
                    {
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TypeParameter__Group_0_1_1__0__Impl12420); 

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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6059:1: rule__TypeParameter__Group_0_1_1__1 : rule__TypeParameter__Group_0_1_1__1__Impl rule__TypeParameter__Group_0_1_1__2 ;
    public final void rule__TypeParameter__Group_0_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6063:1: ( rule__TypeParameter__Group_0_1_1__1__Impl rule__TypeParameter__Group_0_1_1__2 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6064:2: rule__TypeParameter__Group_0_1_1__1__Impl rule__TypeParameter__Group_0_1_1__2
            {
            pushFollow(FOLLOW_rule__TypeParameter__Group_0_1_1__1__Impl_in_rule__TypeParameter__Group_0_1_1__112451);
            rule__TypeParameter__Group_0_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeParameter__Group_0_1_1__2_in_rule__TypeParameter__Group_0_1_1__112454);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6071:1: rule__TypeParameter__Group_0_1_1__1__Impl : ( '=' ) ;
    public final void rule__TypeParameter__Group_0_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6075:1: ( ( '=' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6076:1: ( '=' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6076:1: ( '=' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6077:1: '='
            {
             before(grammarAccess.getTypeParameterAccess().getEqualsSignKeyword_0_1_1_1()); 
            match(input,74,FOLLOW_74_in_rule__TypeParameter__Group_0_1_1__1__Impl12482); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6090:1: rule__TypeParameter__Group_0_1_1__2 : rule__TypeParameter__Group_0_1_1__2__Impl ;
    public final void rule__TypeParameter__Group_0_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6094:1: ( rule__TypeParameter__Group_0_1_1__2__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6095:2: rule__TypeParameter__Group_0_1_1__2__Impl
            {
            pushFollow(FOLLOW_rule__TypeParameter__Group_0_1_1__2__Impl_in_rule__TypeParameter__Group_0_1_1__212513);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6101:1: rule__TypeParameter__Group_0_1_1__2__Impl : ( ruleTypeId ) ;
    public final void rule__TypeParameter__Group_0_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6105:1: ( ( ruleTypeId ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6106:1: ( ruleTypeId )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6106:1: ( ruleTypeId )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6107:1: ruleTypeId
            {
             before(grammarAccess.getTypeParameterAccess().getTypeIdParserRuleCall_0_1_1_2()); 
            pushFollow(FOLLOW_ruleTypeId_in_rule__TypeParameter__Group_0_1_1__2__Impl12540);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6124:1: rule__TypeParameter__Group_1__0 : rule__TypeParameter__Group_1__0__Impl rule__TypeParameter__Group_1__1 ;
    public final void rule__TypeParameter__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6128:1: ( rule__TypeParameter__Group_1__0__Impl rule__TypeParameter__Group_1__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6129:2: rule__TypeParameter__Group_1__0__Impl rule__TypeParameter__Group_1__1
            {
            pushFollow(FOLLOW_rule__TypeParameter__Group_1__0__Impl_in_rule__TypeParameter__Group_1__012575);
            rule__TypeParameter__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeParameter__Group_1__1_in_rule__TypeParameter__Group_1__012578);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6136:1: rule__TypeParameter__Group_1__0__Impl : ( 'typename' ) ;
    public final void rule__TypeParameter__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6140:1: ( ( 'typename' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6141:1: ( 'typename' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6141:1: ( 'typename' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6142:1: 'typename'
            {
             before(grammarAccess.getTypeParameterAccess().getTypenameKeyword_1_0()); 
            match(input,112,FOLLOW_112_in_rule__TypeParameter__Group_1__0__Impl12606); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6155:1: rule__TypeParameter__Group_1__1 : rule__TypeParameter__Group_1__1__Impl ;
    public final void rule__TypeParameter__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6159:1: ( rule__TypeParameter__Group_1__1__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6160:2: rule__TypeParameter__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__TypeParameter__Group_1__1__Impl_in_rule__TypeParameter__Group_1__112637);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6166:1: rule__TypeParameter__Group_1__1__Impl : ( ( rule__TypeParameter__Alternatives_1_1 ) ) ;
    public final void rule__TypeParameter__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6170:1: ( ( ( rule__TypeParameter__Alternatives_1_1 ) ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6171:1: ( ( rule__TypeParameter__Alternatives_1_1 ) )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6171:1: ( ( rule__TypeParameter__Alternatives_1_1 ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6172:1: ( rule__TypeParameter__Alternatives_1_1 )
            {
             before(grammarAccess.getTypeParameterAccess().getAlternatives_1_1()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6173:1: ( rule__TypeParameter__Alternatives_1_1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6173:2: rule__TypeParameter__Alternatives_1_1
            {
            pushFollow(FOLLOW_rule__TypeParameter__Alternatives_1_1_in_rule__TypeParameter__Group_1__1__Impl12664);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6187:1: rule__TypeParameter__Group_1_1_0__0 : rule__TypeParameter__Group_1_1_0__0__Impl rule__TypeParameter__Group_1_1_0__1 ;
    public final void rule__TypeParameter__Group_1_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6191:1: ( rule__TypeParameter__Group_1_1_0__0__Impl rule__TypeParameter__Group_1_1_0__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6192:2: rule__TypeParameter__Group_1_1_0__0__Impl rule__TypeParameter__Group_1_1_0__1
            {
            pushFollow(FOLLOW_rule__TypeParameter__Group_1_1_0__0__Impl_in_rule__TypeParameter__Group_1_1_0__012698);
            rule__TypeParameter__Group_1_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeParameter__Group_1_1_0__1_in_rule__TypeParameter__Group_1_1_0__012701);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6199:1: rule__TypeParameter__Group_1_1_0__0__Impl : ( ( '...' )? ) ;
    public final void rule__TypeParameter__Group_1_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6203:1: ( ( ( '...' )? ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6204:1: ( ( '...' )? )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6204:1: ( ( '...' )? )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6205:1: ( '...' )?
            {
             before(grammarAccess.getTypeParameterAccess().getFullStopFullStopFullStopKeyword_1_1_0_0()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6206:1: ( '...' )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==101) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6207:2: '...'
                    {
                    match(input,101,FOLLOW_101_in_rule__TypeParameter__Group_1_1_0__0__Impl12730); 

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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6218:1: rule__TypeParameter__Group_1_1_0__1 : rule__TypeParameter__Group_1_1_0__1__Impl ;
    public final void rule__TypeParameter__Group_1_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6222:1: ( rule__TypeParameter__Group_1_1_0__1__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6223:2: rule__TypeParameter__Group_1_1_0__1__Impl
            {
            pushFollow(FOLLOW_rule__TypeParameter__Group_1_1_0__1__Impl_in_rule__TypeParameter__Group_1_1_0__112763);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6229:1: rule__TypeParameter__Group_1_1_0__1__Impl : ( ( RULE_ID )? ) ;
    public final void rule__TypeParameter__Group_1_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6233:1: ( ( ( RULE_ID )? ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6234:1: ( ( RULE_ID )? )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6234:1: ( ( RULE_ID )? )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6235:1: ( RULE_ID )?
            {
             before(grammarAccess.getTypeParameterAccess().getIDTerminalRuleCall_1_1_0_1()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6236:1: ( RULE_ID )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==RULE_ID) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6236:3: RULE_ID
                    {
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TypeParameter__Group_1_1_0__1__Impl12791); 

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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6250:1: rule__TypeParameter__Group_1_1_1__0 : rule__TypeParameter__Group_1_1_1__0__Impl rule__TypeParameter__Group_1_1_1__1 ;
    public final void rule__TypeParameter__Group_1_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6254:1: ( rule__TypeParameter__Group_1_1_1__0__Impl rule__TypeParameter__Group_1_1_1__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6255:2: rule__TypeParameter__Group_1_1_1__0__Impl rule__TypeParameter__Group_1_1_1__1
            {
            pushFollow(FOLLOW_rule__TypeParameter__Group_1_1_1__0__Impl_in_rule__TypeParameter__Group_1_1_1__012826);
            rule__TypeParameter__Group_1_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeParameter__Group_1_1_1__1_in_rule__TypeParameter__Group_1_1_1__012829);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6262:1: rule__TypeParameter__Group_1_1_1__0__Impl : ( ( RULE_ID )? ) ;
    public final void rule__TypeParameter__Group_1_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6266:1: ( ( ( RULE_ID )? ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6267:1: ( ( RULE_ID )? )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6267:1: ( ( RULE_ID )? )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6268:1: ( RULE_ID )?
            {
             before(grammarAccess.getTypeParameterAccess().getIDTerminalRuleCall_1_1_1_0()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6269:1: ( RULE_ID )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==RULE_ID) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6269:3: RULE_ID
                    {
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TypeParameter__Group_1_1_1__0__Impl12857); 

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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6279:1: rule__TypeParameter__Group_1_1_1__1 : rule__TypeParameter__Group_1_1_1__1__Impl rule__TypeParameter__Group_1_1_1__2 ;
    public final void rule__TypeParameter__Group_1_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6283:1: ( rule__TypeParameter__Group_1_1_1__1__Impl rule__TypeParameter__Group_1_1_1__2 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6284:2: rule__TypeParameter__Group_1_1_1__1__Impl rule__TypeParameter__Group_1_1_1__2
            {
            pushFollow(FOLLOW_rule__TypeParameter__Group_1_1_1__1__Impl_in_rule__TypeParameter__Group_1_1_1__112888);
            rule__TypeParameter__Group_1_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeParameter__Group_1_1_1__2_in_rule__TypeParameter__Group_1_1_1__112891);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6291:1: rule__TypeParameter__Group_1_1_1__1__Impl : ( '=' ) ;
    public final void rule__TypeParameter__Group_1_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6295:1: ( ( '=' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6296:1: ( '=' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6296:1: ( '=' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6297:1: '='
            {
             before(grammarAccess.getTypeParameterAccess().getEqualsSignKeyword_1_1_1_1()); 
            match(input,74,FOLLOW_74_in_rule__TypeParameter__Group_1_1_1__1__Impl12919); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6310:1: rule__TypeParameter__Group_1_1_1__2 : rule__TypeParameter__Group_1_1_1__2__Impl ;
    public final void rule__TypeParameter__Group_1_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6314:1: ( rule__TypeParameter__Group_1_1_1__2__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6315:2: rule__TypeParameter__Group_1_1_1__2__Impl
            {
            pushFollow(FOLLOW_rule__TypeParameter__Group_1_1_1__2__Impl_in_rule__TypeParameter__Group_1_1_1__212950);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6321:1: rule__TypeParameter__Group_1_1_1__2__Impl : ( ruleTypeId ) ;
    public final void rule__TypeParameter__Group_1_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6325:1: ( ( ruleTypeId ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6326:1: ( ruleTypeId )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6326:1: ( ruleTypeId )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6327:1: ruleTypeId
            {
             before(grammarAccess.getTypeParameterAccess().getTypeIdParserRuleCall_1_1_1_2()); 
            pushFollow(FOLLOW_ruleTypeId_in_rule__TypeParameter__Group_1_1_1__2__Impl12977);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6344:1: rule__TypeParameter__Group_2__0 : rule__TypeParameter__Group_2__0__Impl rule__TypeParameter__Group_2__1 ;
    public final void rule__TypeParameter__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6348:1: ( rule__TypeParameter__Group_2__0__Impl rule__TypeParameter__Group_2__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6349:2: rule__TypeParameter__Group_2__0__Impl rule__TypeParameter__Group_2__1
            {
            pushFollow(FOLLOW_rule__TypeParameter__Group_2__0__Impl_in_rule__TypeParameter__Group_2__013012);
            rule__TypeParameter__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeParameter__Group_2__1_in_rule__TypeParameter__Group_2__013015);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6356:1: rule__TypeParameter__Group_2__0__Impl : ( 'template' ) ;
    public final void rule__TypeParameter__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6360:1: ( ( 'template' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6361:1: ( 'template' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6361:1: ( 'template' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6362:1: 'template'
            {
             before(grammarAccess.getTypeParameterAccess().getTemplateKeyword_2_0()); 
            match(input,113,FOLLOW_113_in_rule__TypeParameter__Group_2__0__Impl13043); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6375:1: rule__TypeParameter__Group_2__1 : rule__TypeParameter__Group_2__1__Impl rule__TypeParameter__Group_2__2 ;
    public final void rule__TypeParameter__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6379:1: ( rule__TypeParameter__Group_2__1__Impl rule__TypeParameter__Group_2__2 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6380:2: rule__TypeParameter__Group_2__1__Impl rule__TypeParameter__Group_2__2
            {
            pushFollow(FOLLOW_rule__TypeParameter__Group_2__1__Impl_in_rule__TypeParameter__Group_2__113074);
            rule__TypeParameter__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeParameter__Group_2__2_in_rule__TypeParameter__Group_2__113077);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6387:1: rule__TypeParameter__Group_2__1__Impl : ( '<' ) ;
    public final void rule__TypeParameter__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6391:1: ( ( '<' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6392:1: ( '<' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6392:1: ( '<' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6393:1: '<'
            {
             before(grammarAccess.getTypeParameterAccess().getLessThanSignKeyword_2_1()); 
            match(input,75,FOLLOW_75_in_rule__TypeParameter__Group_2__1__Impl13105); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6406:1: rule__TypeParameter__Group_2__2 : rule__TypeParameter__Group_2__2__Impl rule__TypeParameter__Group_2__3 ;
    public final void rule__TypeParameter__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6410:1: ( rule__TypeParameter__Group_2__2__Impl rule__TypeParameter__Group_2__3 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6411:2: rule__TypeParameter__Group_2__2__Impl rule__TypeParameter__Group_2__3
            {
            pushFollow(FOLLOW_rule__TypeParameter__Group_2__2__Impl_in_rule__TypeParameter__Group_2__213136);
            rule__TypeParameter__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeParameter__Group_2__3_in_rule__TypeParameter__Group_2__213139);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6418:1: rule__TypeParameter__Group_2__2__Impl : ( ruleTemplateParameterList ) ;
    public final void rule__TypeParameter__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6422:1: ( ( ruleTemplateParameterList ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6423:1: ( ruleTemplateParameterList )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6423:1: ( ruleTemplateParameterList )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6424:1: ruleTemplateParameterList
            {
             before(grammarAccess.getTypeParameterAccess().getTemplateParameterListParserRuleCall_2_2()); 
            pushFollow(FOLLOW_ruleTemplateParameterList_in_rule__TypeParameter__Group_2__2__Impl13166);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6435:1: rule__TypeParameter__Group_2__3 : rule__TypeParameter__Group_2__3__Impl rule__TypeParameter__Group_2__4 ;
    public final void rule__TypeParameter__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6439:1: ( rule__TypeParameter__Group_2__3__Impl rule__TypeParameter__Group_2__4 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6440:2: rule__TypeParameter__Group_2__3__Impl rule__TypeParameter__Group_2__4
            {
            pushFollow(FOLLOW_rule__TypeParameter__Group_2__3__Impl_in_rule__TypeParameter__Group_2__313195);
            rule__TypeParameter__Group_2__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeParameter__Group_2__4_in_rule__TypeParameter__Group_2__313198);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6447:1: rule__TypeParameter__Group_2__3__Impl : ( '>' ) ;
    public final void rule__TypeParameter__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6451:1: ( ( '>' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6452:1: ( '>' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6452:1: ( '>' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6453:1: '>'
            {
             before(grammarAccess.getTypeParameterAccess().getGreaterThanSignKeyword_2_3()); 
            match(input,76,FOLLOW_76_in_rule__TypeParameter__Group_2__3__Impl13226); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6466:1: rule__TypeParameter__Group_2__4 : rule__TypeParameter__Group_2__4__Impl rule__TypeParameter__Group_2__5 ;
    public final void rule__TypeParameter__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6470:1: ( rule__TypeParameter__Group_2__4__Impl rule__TypeParameter__Group_2__5 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6471:2: rule__TypeParameter__Group_2__4__Impl rule__TypeParameter__Group_2__5
            {
            pushFollow(FOLLOW_rule__TypeParameter__Group_2__4__Impl_in_rule__TypeParameter__Group_2__413257);
            rule__TypeParameter__Group_2__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeParameter__Group_2__5_in_rule__TypeParameter__Group_2__413260);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6478:1: rule__TypeParameter__Group_2__4__Impl : ( 'class' ) ;
    public final void rule__TypeParameter__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6482:1: ( ( 'class' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6483:1: ( 'class' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6483:1: ( 'class' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6484:1: 'class'
            {
             before(grammarAccess.getTypeParameterAccess().getClassKeyword_2_4()); 
            match(input,111,FOLLOW_111_in_rule__TypeParameter__Group_2__4__Impl13288); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6497:1: rule__TypeParameter__Group_2__5 : rule__TypeParameter__Group_2__5__Impl ;
    public final void rule__TypeParameter__Group_2__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6501:1: ( rule__TypeParameter__Group_2__5__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6502:2: rule__TypeParameter__Group_2__5__Impl
            {
            pushFollow(FOLLOW_rule__TypeParameter__Group_2__5__Impl_in_rule__TypeParameter__Group_2__513319);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6508:1: rule__TypeParameter__Group_2__5__Impl : ( ( rule__TypeParameter__Alternatives_2_5 ) ) ;
    public final void rule__TypeParameter__Group_2__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6512:1: ( ( ( rule__TypeParameter__Alternatives_2_5 ) ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6513:1: ( ( rule__TypeParameter__Alternatives_2_5 ) )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6513:1: ( ( rule__TypeParameter__Alternatives_2_5 ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6514:1: ( rule__TypeParameter__Alternatives_2_5 )
            {
             before(grammarAccess.getTypeParameterAccess().getAlternatives_2_5()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6515:1: ( rule__TypeParameter__Alternatives_2_5 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6515:2: rule__TypeParameter__Alternatives_2_5
            {
            pushFollow(FOLLOW_rule__TypeParameter__Alternatives_2_5_in_rule__TypeParameter__Group_2__5__Impl13346);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6537:1: rule__TypeParameter__Group_2_5_0__0 : rule__TypeParameter__Group_2_5_0__0__Impl rule__TypeParameter__Group_2_5_0__1 ;
    public final void rule__TypeParameter__Group_2_5_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6541:1: ( rule__TypeParameter__Group_2_5_0__0__Impl rule__TypeParameter__Group_2_5_0__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6542:2: rule__TypeParameter__Group_2_5_0__0__Impl rule__TypeParameter__Group_2_5_0__1
            {
            pushFollow(FOLLOW_rule__TypeParameter__Group_2_5_0__0__Impl_in_rule__TypeParameter__Group_2_5_0__013388);
            rule__TypeParameter__Group_2_5_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeParameter__Group_2_5_0__1_in_rule__TypeParameter__Group_2_5_0__013391);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6549:1: rule__TypeParameter__Group_2_5_0__0__Impl : ( ( '...' )? ) ;
    public final void rule__TypeParameter__Group_2_5_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6553:1: ( ( ( '...' )? ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6554:1: ( ( '...' )? )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6554:1: ( ( '...' )? )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6555:1: ( '...' )?
            {
             before(grammarAccess.getTypeParameterAccess().getFullStopFullStopFullStopKeyword_2_5_0_0()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6556:1: ( '...' )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==101) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6557:2: '...'
                    {
                    match(input,101,FOLLOW_101_in_rule__TypeParameter__Group_2_5_0__0__Impl13420); 

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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6568:1: rule__TypeParameter__Group_2_5_0__1 : rule__TypeParameter__Group_2_5_0__1__Impl ;
    public final void rule__TypeParameter__Group_2_5_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6572:1: ( rule__TypeParameter__Group_2_5_0__1__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6573:2: rule__TypeParameter__Group_2_5_0__1__Impl
            {
            pushFollow(FOLLOW_rule__TypeParameter__Group_2_5_0__1__Impl_in_rule__TypeParameter__Group_2_5_0__113453);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6579:1: rule__TypeParameter__Group_2_5_0__1__Impl : ( ( RULE_ID )? ) ;
    public final void rule__TypeParameter__Group_2_5_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6583:1: ( ( ( RULE_ID )? ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6584:1: ( ( RULE_ID )? )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6584:1: ( ( RULE_ID )? )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6585:1: ( RULE_ID )?
            {
             before(grammarAccess.getTypeParameterAccess().getIDTerminalRuleCall_2_5_0_1()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6586:1: ( RULE_ID )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==RULE_ID) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6586:3: RULE_ID
                    {
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TypeParameter__Group_2_5_0__1__Impl13481); 

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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6600:1: rule__TypeParameter__Group_2_5_1__0 : rule__TypeParameter__Group_2_5_1__0__Impl rule__TypeParameter__Group_2_5_1__1 ;
    public final void rule__TypeParameter__Group_2_5_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6604:1: ( rule__TypeParameter__Group_2_5_1__0__Impl rule__TypeParameter__Group_2_5_1__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6605:2: rule__TypeParameter__Group_2_5_1__0__Impl rule__TypeParameter__Group_2_5_1__1
            {
            pushFollow(FOLLOW_rule__TypeParameter__Group_2_5_1__0__Impl_in_rule__TypeParameter__Group_2_5_1__013516);
            rule__TypeParameter__Group_2_5_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeParameter__Group_2_5_1__1_in_rule__TypeParameter__Group_2_5_1__013519);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6612:1: rule__TypeParameter__Group_2_5_1__0__Impl : ( ( RULE_ID )? ) ;
    public final void rule__TypeParameter__Group_2_5_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6616:1: ( ( ( RULE_ID )? ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6617:1: ( ( RULE_ID )? )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6617:1: ( ( RULE_ID )? )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6618:1: ( RULE_ID )?
            {
             before(grammarAccess.getTypeParameterAccess().getIDTerminalRuleCall_2_5_1_0()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6619:1: ( RULE_ID )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==RULE_ID) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6619:3: RULE_ID
                    {
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TypeParameter__Group_2_5_1__0__Impl13547); 

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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6629:1: rule__TypeParameter__Group_2_5_1__1 : rule__TypeParameter__Group_2_5_1__1__Impl rule__TypeParameter__Group_2_5_1__2 ;
    public final void rule__TypeParameter__Group_2_5_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6633:1: ( rule__TypeParameter__Group_2_5_1__1__Impl rule__TypeParameter__Group_2_5_1__2 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6634:2: rule__TypeParameter__Group_2_5_1__1__Impl rule__TypeParameter__Group_2_5_1__2
            {
            pushFollow(FOLLOW_rule__TypeParameter__Group_2_5_1__1__Impl_in_rule__TypeParameter__Group_2_5_1__113578);
            rule__TypeParameter__Group_2_5_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeParameter__Group_2_5_1__2_in_rule__TypeParameter__Group_2_5_1__113581);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6641:1: rule__TypeParameter__Group_2_5_1__1__Impl : ( '=' ) ;
    public final void rule__TypeParameter__Group_2_5_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6645:1: ( ( '=' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6646:1: ( '=' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6646:1: ( '=' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6647:1: '='
            {
             before(grammarAccess.getTypeParameterAccess().getEqualsSignKeyword_2_5_1_1()); 
            match(input,74,FOLLOW_74_in_rule__TypeParameter__Group_2_5_1__1__Impl13609); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6660:1: rule__TypeParameter__Group_2_5_1__2 : rule__TypeParameter__Group_2_5_1__2__Impl ;
    public final void rule__TypeParameter__Group_2_5_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6664:1: ( rule__TypeParameter__Group_2_5_1__2__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6665:2: rule__TypeParameter__Group_2_5_1__2__Impl
            {
            pushFollow(FOLLOW_rule__TypeParameter__Group_2_5_1__2__Impl_in_rule__TypeParameter__Group_2_5_1__213640);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6671:1: rule__TypeParameter__Group_2_5_1__2__Impl : ( ruleIdExpression ) ;
    public final void rule__TypeParameter__Group_2_5_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6675:1: ( ( ruleIdExpression ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6676:1: ( ruleIdExpression )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6676:1: ( ruleIdExpression )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6677:1: ruleIdExpression
            {
             before(grammarAccess.getTypeParameterAccess().getIdExpressionParserRuleCall_2_5_1_2()); 
            pushFollow(FOLLOW_ruleIdExpression_in_rule__TypeParameter__Group_2_5_1__2__Impl13667);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6694:1: rule__SimpleTemplateId__Group__0 : rule__SimpleTemplateId__Group__0__Impl rule__SimpleTemplateId__Group__1 ;
    public final void rule__SimpleTemplateId__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6698:1: ( rule__SimpleTemplateId__Group__0__Impl rule__SimpleTemplateId__Group__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6699:2: rule__SimpleTemplateId__Group__0__Impl rule__SimpleTemplateId__Group__1
            {
            pushFollow(FOLLOW_rule__SimpleTemplateId__Group__0__Impl_in_rule__SimpleTemplateId__Group__013702);
            rule__SimpleTemplateId__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleTemplateId__Group__1_in_rule__SimpleTemplateId__Group__013705);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6706:1: rule__SimpleTemplateId__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__SimpleTemplateId__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6710:1: ( ( RULE_ID ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6711:1: ( RULE_ID )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6711:1: ( RULE_ID )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6712:1: RULE_ID
            {
             before(grammarAccess.getSimpleTemplateIdAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SimpleTemplateId__Group__0__Impl13732); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6723:1: rule__SimpleTemplateId__Group__1 : rule__SimpleTemplateId__Group__1__Impl rule__SimpleTemplateId__Group__2 ;
    public final void rule__SimpleTemplateId__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6727:1: ( rule__SimpleTemplateId__Group__1__Impl rule__SimpleTemplateId__Group__2 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6728:2: rule__SimpleTemplateId__Group__1__Impl rule__SimpleTemplateId__Group__2
            {
            pushFollow(FOLLOW_rule__SimpleTemplateId__Group__1__Impl_in_rule__SimpleTemplateId__Group__113761);
            rule__SimpleTemplateId__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleTemplateId__Group__2_in_rule__SimpleTemplateId__Group__113764);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6735:1: rule__SimpleTemplateId__Group__1__Impl : ( '<' ) ;
    public final void rule__SimpleTemplateId__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6739:1: ( ( '<' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6740:1: ( '<' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6740:1: ( '<' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6741:1: '<'
            {
             before(grammarAccess.getSimpleTemplateIdAccess().getLessThanSignKeyword_1()); 
            match(input,75,FOLLOW_75_in_rule__SimpleTemplateId__Group__1__Impl13792); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6754:1: rule__SimpleTemplateId__Group__2 : rule__SimpleTemplateId__Group__2__Impl rule__SimpleTemplateId__Group__3 ;
    public final void rule__SimpleTemplateId__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6758:1: ( rule__SimpleTemplateId__Group__2__Impl rule__SimpleTemplateId__Group__3 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6759:2: rule__SimpleTemplateId__Group__2__Impl rule__SimpleTemplateId__Group__3
            {
            pushFollow(FOLLOW_rule__SimpleTemplateId__Group__2__Impl_in_rule__SimpleTemplateId__Group__213823);
            rule__SimpleTemplateId__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleTemplateId__Group__3_in_rule__SimpleTemplateId__Group__213826);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6766:1: rule__SimpleTemplateId__Group__2__Impl : ( ruleTemplateArgumentList ) ;
    public final void rule__SimpleTemplateId__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6770:1: ( ( ruleTemplateArgumentList ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6771:1: ( ruleTemplateArgumentList )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6771:1: ( ruleTemplateArgumentList )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6772:1: ruleTemplateArgumentList
            {
             before(grammarAccess.getSimpleTemplateIdAccess().getTemplateArgumentListParserRuleCall_2()); 
            pushFollow(FOLLOW_ruleTemplateArgumentList_in_rule__SimpleTemplateId__Group__2__Impl13853);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6783:1: rule__SimpleTemplateId__Group__3 : rule__SimpleTemplateId__Group__3__Impl ;
    public final void rule__SimpleTemplateId__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6787:1: ( rule__SimpleTemplateId__Group__3__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6788:2: rule__SimpleTemplateId__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__SimpleTemplateId__Group__3__Impl_in_rule__SimpleTemplateId__Group__313882);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6794:1: rule__SimpleTemplateId__Group__3__Impl : ( '>' ) ;
    public final void rule__SimpleTemplateId__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6798:1: ( ( '>' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6799:1: ( '>' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6799:1: ( '>' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6800:1: '>'
            {
             before(grammarAccess.getSimpleTemplateIdAccess().getGreaterThanSignKeyword_3()); 
            match(input,76,FOLLOW_76_in_rule__SimpleTemplateId__Group__3__Impl13910); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6823:1: rule__TemplateArgumentList__Group__0 : rule__TemplateArgumentList__Group__0__Impl rule__TemplateArgumentList__Group__1 ;
    public final void rule__TemplateArgumentList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6827:1: ( rule__TemplateArgumentList__Group__0__Impl rule__TemplateArgumentList__Group__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6828:2: rule__TemplateArgumentList__Group__0__Impl rule__TemplateArgumentList__Group__1
            {
            pushFollow(FOLLOW_rule__TemplateArgumentList__Group__0__Impl_in_rule__TemplateArgumentList__Group__013951);
            rule__TemplateArgumentList__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TemplateArgumentList__Group__1_in_rule__TemplateArgumentList__Group__013954);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6835:1: rule__TemplateArgumentList__Group__0__Impl : ( ruleTemplateArgument ) ;
    public final void rule__TemplateArgumentList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6839:1: ( ( ruleTemplateArgument ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6840:1: ( ruleTemplateArgument )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6840:1: ( ruleTemplateArgument )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6841:1: ruleTemplateArgument
            {
             before(grammarAccess.getTemplateArgumentListAccess().getTemplateArgumentParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleTemplateArgument_in_rule__TemplateArgumentList__Group__0__Impl13981);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6852:1: rule__TemplateArgumentList__Group__1 : rule__TemplateArgumentList__Group__1__Impl rule__TemplateArgumentList__Group__2 ;
    public final void rule__TemplateArgumentList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6856:1: ( rule__TemplateArgumentList__Group__1__Impl rule__TemplateArgumentList__Group__2 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6857:2: rule__TemplateArgumentList__Group__1__Impl rule__TemplateArgumentList__Group__2
            {
            pushFollow(FOLLOW_rule__TemplateArgumentList__Group__1__Impl_in_rule__TemplateArgumentList__Group__114010);
            rule__TemplateArgumentList__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TemplateArgumentList__Group__2_in_rule__TemplateArgumentList__Group__114013);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6864:1: rule__TemplateArgumentList__Group__1__Impl : ( ( '...' )? ) ;
    public final void rule__TemplateArgumentList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6868:1: ( ( ( '...' )? ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6869:1: ( ( '...' )? )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6869:1: ( ( '...' )? )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6870:1: ( '...' )?
            {
             before(grammarAccess.getTemplateArgumentListAccess().getFullStopFullStopFullStopKeyword_1()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6871:1: ( '...' )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==101) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6872:2: '...'
                    {
                    match(input,101,FOLLOW_101_in_rule__TemplateArgumentList__Group__1__Impl14042); 

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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6883:1: rule__TemplateArgumentList__Group__2 : rule__TemplateArgumentList__Group__2__Impl ;
    public final void rule__TemplateArgumentList__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6887:1: ( rule__TemplateArgumentList__Group__2__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6888:2: rule__TemplateArgumentList__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__TemplateArgumentList__Group__2__Impl_in_rule__TemplateArgumentList__Group__214075);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6894:1: rule__TemplateArgumentList__Group__2__Impl : ( ( rule__TemplateArgumentList__Group_2__0 )* ) ;
    public final void rule__TemplateArgumentList__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6898:1: ( ( ( rule__TemplateArgumentList__Group_2__0 )* ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6899:1: ( ( rule__TemplateArgumentList__Group_2__0 )* )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6899:1: ( ( rule__TemplateArgumentList__Group_2__0 )* )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6900:1: ( rule__TemplateArgumentList__Group_2__0 )*
            {
             before(grammarAccess.getTemplateArgumentListAccess().getGroup_2()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6901:1: ( rule__TemplateArgumentList__Group_2__0 )*
            loop74:
            do {
                int alt74=2;
                int LA74_0 = input.LA(1);

                if ( (LA74_0==96) ) {
                    alt74=1;
                }


                switch (alt74) {
            	case 1 :
            	    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6901:2: rule__TemplateArgumentList__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__TemplateArgumentList__Group_2__0_in_rule__TemplateArgumentList__Group__2__Impl14102);
            	    rule__TemplateArgumentList__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop74;
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6917:1: rule__TemplateArgumentList__Group_2__0 : rule__TemplateArgumentList__Group_2__0__Impl rule__TemplateArgumentList__Group_2__1 ;
    public final void rule__TemplateArgumentList__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6921:1: ( rule__TemplateArgumentList__Group_2__0__Impl rule__TemplateArgumentList__Group_2__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6922:2: rule__TemplateArgumentList__Group_2__0__Impl rule__TemplateArgumentList__Group_2__1
            {
            pushFollow(FOLLOW_rule__TemplateArgumentList__Group_2__0__Impl_in_rule__TemplateArgumentList__Group_2__014139);
            rule__TemplateArgumentList__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TemplateArgumentList__Group_2__1_in_rule__TemplateArgumentList__Group_2__014142);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6929:1: rule__TemplateArgumentList__Group_2__0__Impl : ( ',' ) ;
    public final void rule__TemplateArgumentList__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6933:1: ( ( ',' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6934:1: ( ',' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6934:1: ( ',' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6935:1: ','
            {
             before(grammarAccess.getTemplateArgumentListAccess().getCommaKeyword_2_0()); 
            match(input,96,FOLLOW_96_in_rule__TemplateArgumentList__Group_2__0__Impl14170); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6948:1: rule__TemplateArgumentList__Group_2__1 : rule__TemplateArgumentList__Group_2__1__Impl rule__TemplateArgumentList__Group_2__2 ;
    public final void rule__TemplateArgumentList__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6952:1: ( rule__TemplateArgumentList__Group_2__1__Impl rule__TemplateArgumentList__Group_2__2 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6953:2: rule__TemplateArgumentList__Group_2__1__Impl rule__TemplateArgumentList__Group_2__2
            {
            pushFollow(FOLLOW_rule__TemplateArgumentList__Group_2__1__Impl_in_rule__TemplateArgumentList__Group_2__114201);
            rule__TemplateArgumentList__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TemplateArgumentList__Group_2__2_in_rule__TemplateArgumentList__Group_2__114204);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6960:1: rule__TemplateArgumentList__Group_2__1__Impl : ( ruleTemplateArgument ) ;
    public final void rule__TemplateArgumentList__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6964:1: ( ( ruleTemplateArgument ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6965:1: ( ruleTemplateArgument )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6965:1: ( ruleTemplateArgument )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6966:1: ruleTemplateArgument
            {
             before(grammarAccess.getTemplateArgumentListAccess().getTemplateArgumentParserRuleCall_2_1()); 
            pushFollow(FOLLOW_ruleTemplateArgument_in_rule__TemplateArgumentList__Group_2__1__Impl14231);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6977:1: rule__TemplateArgumentList__Group_2__2 : rule__TemplateArgumentList__Group_2__2__Impl ;
    public final void rule__TemplateArgumentList__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6981:1: ( rule__TemplateArgumentList__Group_2__2__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6982:2: rule__TemplateArgumentList__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__TemplateArgumentList__Group_2__2__Impl_in_rule__TemplateArgumentList__Group_2__214260);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6988:1: rule__TemplateArgumentList__Group_2__2__Impl : ( ( '...' )? ) ;
    public final void rule__TemplateArgumentList__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6992:1: ( ( ( '...' )? ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6993:1: ( ( '...' )? )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6993:1: ( ( '...' )? )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6994:1: ( '...' )?
            {
             before(grammarAccess.getTemplateArgumentListAccess().getFullStopFullStopFullStopKeyword_2_2()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6995:1: ( '...' )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==101) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6996:2: '...'
                    {
                    match(input,101,FOLLOW_101_in_rule__TemplateArgumentList__Group_2__2__Impl14289); 

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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7019:1: rule__Handler__Group__0 : rule__Handler__Group__0__Impl rule__Handler__Group__1 ;
    public final void rule__Handler__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7023:1: ( rule__Handler__Group__0__Impl rule__Handler__Group__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7024:2: rule__Handler__Group__0__Impl rule__Handler__Group__1
            {
            pushFollow(FOLLOW_rule__Handler__Group__0__Impl_in_rule__Handler__Group__014334);
            rule__Handler__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Handler__Group__1_in_rule__Handler__Group__014337);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7031:1: rule__Handler__Group__0__Impl : ( 'catch' ) ;
    public final void rule__Handler__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7035:1: ( ( 'catch' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7036:1: ( 'catch' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7036:1: ( 'catch' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7037:1: 'catch'
            {
             before(grammarAccess.getHandlerAccess().getCatchKeyword_0()); 
            match(input,114,FOLLOW_114_in_rule__Handler__Group__0__Impl14365); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7050:1: rule__Handler__Group__1 : rule__Handler__Group__1__Impl rule__Handler__Group__2 ;
    public final void rule__Handler__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7054:1: ( rule__Handler__Group__1__Impl rule__Handler__Group__2 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7055:2: rule__Handler__Group__1__Impl rule__Handler__Group__2
            {
            pushFollow(FOLLOW_rule__Handler__Group__1__Impl_in_rule__Handler__Group__114396);
            rule__Handler__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Handler__Group__2_in_rule__Handler__Group__114399);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7062:1: rule__Handler__Group__1__Impl : ( '(' ) ;
    public final void rule__Handler__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7066:1: ( ( '(' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7067:1: ( '(' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7067:1: ( '(' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7068:1: '('
            {
             before(grammarAccess.getHandlerAccess().getLeftParenthesisKeyword_1()); 
            match(input,107,FOLLOW_107_in_rule__Handler__Group__1__Impl14427); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7081:1: rule__Handler__Group__2 : rule__Handler__Group__2__Impl rule__Handler__Group__3 ;
    public final void rule__Handler__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7085:1: ( rule__Handler__Group__2__Impl rule__Handler__Group__3 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7086:2: rule__Handler__Group__2__Impl rule__Handler__Group__3
            {
            pushFollow(FOLLOW_rule__Handler__Group__2__Impl_in_rule__Handler__Group__214458);
            rule__Handler__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Handler__Group__3_in_rule__Handler__Group__214461);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7093:1: rule__Handler__Group__2__Impl : ( ruleExceptionDeclaration ) ;
    public final void rule__Handler__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7097:1: ( ( ruleExceptionDeclaration ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7098:1: ( ruleExceptionDeclaration )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7098:1: ( ruleExceptionDeclaration )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7099:1: ruleExceptionDeclaration
            {
             before(grammarAccess.getHandlerAccess().getExceptionDeclarationParserRuleCall_2()); 
            pushFollow(FOLLOW_ruleExceptionDeclaration_in_rule__Handler__Group__2__Impl14488);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7110:1: rule__Handler__Group__3 : rule__Handler__Group__3__Impl rule__Handler__Group__4 ;
    public final void rule__Handler__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7114:1: ( rule__Handler__Group__3__Impl rule__Handler__Group__4 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7115:2: rule__Handler__Group__3__Impl rule__Handler__Group__4
            {
            pushFollow(FOLLOW_rule__Handler__Group__3__Impl_in_rule__Handler__Group__314517);
            rule__Handler__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Handler__Group__4_in_rule__Handler__Group__314520);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7122:1: rule__Handler__Group__3__Impl : ( ')' ) ;
    public final void rule__Handler__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7126:1: ( ( ')' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7127:1: ( ')' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7127:1: ( ')' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7128:1: ')'
            {
             before(grammarAccess.getHandlerAccess().getRightParenthesisKeyword_3()); 
            match(input,108,FOLLOW_108_in_rule__Handler__Group__3__Impl14548); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7141:1: rule__Handler__Group__4 : rule__Handler__Group__4__Impl ;
    public final void rule__Handler__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7145:1: ( rule__Handler__Group__4__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7146:2: rule__Handler__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Handler__Group__4__Impl_in_rule__Handler__Group__414579);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7152:1: rule__Handler__Group__4__Impl : ( ruleCompoundStatement ) ;
    public final void rule__Handler__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7156:1: ( ( ruleCompoundStatement ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7157:1: ( ruleCompoundStatement )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7157:1: ( ruleCompoundStatement )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7158:1: ruleCompoundStatement
            {
             before(grammarAccess.getHandlerAccess().getCompoundStatementParserRuleCall_4()); 
            pushFollow(FOLLOW_ruleCompoundStatement_in_rule__Handler__Group__4__Impl14606);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7179:1: rule__ExceptionDeclaration__Group_0__0 : rule__ExceptionDeclaration__Group_0__0__Impl rule__ExceptionDeclaration__Group_0__1 ;
    public final void rule__ExceptionDeclaration__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7183:1: ( rule__ExceptionDeclaration__Group_0__0__Impl rule__ExceptionDeclaration__Group_0__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7184:2: rule__ExceptionDeclaration__Group_0__0__Impl rule__ExceptionDeclaration__Group_0__1
            {
            pushFollow(FOLLOW_rule__ExceptionDeclaration__Group_0__0__Impl_in_rule__ExceptionDeclaration__Group_0__014645);
            rule__ExceptionDeclaration__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExceptionDeclaration__Group_0__1_in_rule__ExceptionDeclaration__Group_0__014648);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7191:1: rule__ExceptionDeclaration__Group_0__0__Impl : ( ( ruleAttributeSpecifier )* ) ;
    public final void rule__ExceptionDeclaration__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7195:1: ( ( ( ruleAttributeSpecifier )* ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7196:1: ( ( ruleAttributeSpecifier )* )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7196:1: ( ( ruleAttributeSpecifier )* )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7197:1: ( ruleAttributeSpecifier )*
            {
             before(grammarAccess.getExceptionDeclarationAccess().getAttributeSpecifierParserRuleCall_0_0()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7198:1: ( ruleAttributeSpecifier )*
            loop76:
            do {
                int alt76=2;
                int LA76_0 = input.LA(1);

                if ( (LA76_0==104||LA76_0==106) ) {
                    alt76=1;
                }


                switch (alt76) {
            	case 1 :
            	    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7198:3: ruleAttributeSpecifier
            	    {
            	    pushFollow(FOLLOW_ruleAttributeSpecifier_in_rule__ExceptionDeclaration__Group_0__0__Impl14676);
            	    ruleAttributeSpecifier();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop76;
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7208:1: rule__ExceptionDeclaration__Group_0__1 : rule__ExceptionDeclaration__Group_0__1__Impl rule__ExceptionDeclaration__Group_0__2 ;
    public final void rule__ExceptionDeclaration__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7212:1: ( rule__ExceptionDeclaration__Group_0__1__Impl rule__ExceptionDeclaration__Group_0__2 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7213:2: rule__ExceptionDeclaration__Group_0__1__Impl rule__ExceptionDeclaration__Group_0__2
            {
            pushFollow(FOLLOW_rule__ExceptionDeclaration__Group_0__1__Impl_in_rule__ExceptionDeclaration__Group_0__114707);
            rule__ExceptionDeclaration__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExceptionDeclaration__Group_0__2_in_rule__ExceptionDeclaration__Group_0__114710);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7220:1: rule__ExceptionDeclaration__Group_0__1__Impl : ( ( ( ruleTypeSpecifier ) ) ( ( ruleTypeSpecifier )* ) ) ;
    public final void rule__ExceptionDeclaration__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7224:1: ( ( ( ( ruleTypeSpecifier ) ) ( ( ruleTypeSpecifier )* ) ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7225:1: ( ( ( ruleTypeSpecifier ) ) ( ( ruleTypeSpecifier )* ) )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7225:1: ( ( ( ruleTypeSpecifier ) ) ( ( ruleTypeSpecifier )* ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7226:1: ( ( ruleTypeSpecifier ) ) ( ( ruleTypeSpecifier )* )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7226:1: ( ( ruleTypeSpecifier ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7227:1: ( ruleTypeSpecifier )
            {
             before(grammarAccess.getExceptionDeclarationAccess().getTypeSpecifierParserRuleCall_0_1()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7228:1: ( ruleTypeSpecifier )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7228:3: ruleTypeSpecifier
            {
            pushFollow(FOLLOW_ruleTypeSpecifier_in_rule__ExceptionDeclaration__Group_0__1__Impl14740);
            ruleTypeSpecifier();

            state._fsp--;


            }

             after(grammarAccess.getExceptionDeclarationAccess().getTypeSpecifierParserRuleCall_0_1()); 

            }

            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7231:1: ( ( ruleTypeSpecifier )* )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7232:1: ( ruleTypeSpecifier )*
            {
             before(grammarAccess.getExceptionDeclarationAccess().getTypeSpecifierParserRuleCall_0_1()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7233:1: ( ruleTypeSpecifier )*
            loop77:
            do {
                int alt77=2;
                int LA77_0 = input.LA(1);

                if ( (LA77_0==47) ) {
                    alt77=1;
                }


                switch (alt77) {
            	case 1 :
            	    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7233:3: ruleTypeSpecifier
            	    {
            	    pushFollow(FOLLOW_ruleTypeSpecifier_in_rule__ExceptionDeclaration__Group_0__1__Impl14753);
            	    ruleTypeSpecifier();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop77;
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7244:1: rule__ExceptionDeclaration__Group_0__2 : rule__ExceptionDeclaration__Group_0__2__Impl ;
    public final void rule__ExceptionDeclaration__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7248:1: ( rule__ExceptionDeclaration__Group_0__2__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7249:2: rule__ExceptionDeclaration__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__ExceptionDeclaration__Group_0__2__Impl_in_rule__ExceptionDeclaration__Group_0__214786);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7255:1: rule__ExceptionDeclaration__Group_0__2__Impl : ( ( rule__ExceptionDeclaration__Alternatives_0_2 ) ) ;
    public final void rule__ExceptionDeclaration__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7259:1: ( ( ( rule__ExceptionDeclaration__Alternatives_0_2 ) ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7260:1: ( ( rule__ExceptionDeclaration__Alternatives_0_2 ) )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7260:1: ( ( rule__ExceptionDeclaration__Alternatives_0_2 ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7261:1: ( rule__ExceptionDeclaration__Alternatives_0_2 )
            {
             before(grammarAccess.getExceptionDeclarationAccess().getAlternatives_0_2()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7262:1: ( rule__ExceptionDeclaration__Alternatives_0_2 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7262:2: rule__ExceptionDeclaration__Alternatives_0_2
            {
            pushFollow(FOLLOW_rule__ExceptionDeclaration__Alternatives_0_2_in_rule__ExceptionDeclaration__Group_0__2__Impl14813);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7279:1: rule__DynamicExceptionSpecification__Group__0 : rule__DynamicExceptionSpecification__Group__0__Impl rule__DynamicExceptionSpecification__Group__1 ;
    public final void rule__DynamicExceptionSpecification__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7283:1: ( rule__DynamicExceptionSpecification__Group__0__Impl rule__DynamicExceptionSpecification__Group__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7284:2: rule__DynamicExceptionSpecification__Group__0__Impl rule__DynamicExceptionSpecification__Group__1
            {
            pushFollow(FOLLOW_rule__DynamicExceptionSpecification__Group__0__Impl_in_rule__DynamicExceptionSpecification__Group__014850);
            rule__DynamicExceptionSpecification__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DynamicExceptionSpecification__Group__1_in_rule__DynamicExceptionSpecification__Group__014853);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7291:1: rule__DynamicExceptionSpecification__Group__0__Impl : ( 'throw' ) ;
    public final void rule__DynamicExceptionSpecification__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7295:1: ( ( 'throw' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7296:1: ( 'throw' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7296:1: ( 'throw' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7297:1: 'throw'
            {
             before(grammarAccess.getDynamicExceptionSpecificationAccess().getThrowKeyword_0()); 
            match(input,115,FOLLOW_115_in_rule__DynamicExceptionSpecification__Group__0__Impl14881); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7310:1: rule__DynamicExceptionSpecification__Group__1 : rule__DynamicExceptionSpecification__Group__1__Impl rule__DynamicExceptionSpecification__Group__2 ;
    public final void rule__DynamicExceptionSpecification__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7314:1: ( rule__DynamicExceptionSpecification__Group__1__Impl rule__DynamicExceptionSpecification__Group__2 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7315:2: rule__DynamicExceptionSpecification__Group__1__Impl rule__DynamicExceptionSpecification__Group__2
            {
            pushFollow(FOLLOW_rule__DynamicExceptionSpecification__Group__1__Impl_in_rule__DynamicExceptionSpecification__Group__114912);
            rule__DynamicExceptionSpecification__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DynamicExceptionSpecification__Group__2_in_rule__DynamicExceptionSpecification__Group__114915);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7322:1: rule__DynamicExceptionSpecification__Group__1__Impl : ( '(' ) ;
    public final void rule__DynamicExceptionSpecification__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7326:1: ( ( '(' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7327:1: ( '(' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7327:1: ( '(' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7328:1: '('
            {
             before(grammarAccess.getDynamicExceptionSpecificationAccess().getLeftParenthesisKeyword_1()); 
            match(input,107,FOLLOW_107_in_rule__DynamicExceptionSpecification__Group__1__Impl14943); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7341:1: rule__DynamicExceptionSpecification__Group__2 : rule__DynamicExceptionSpecification__Group__2__Impl rule__DynamicExceptionSpecification__Group__3 ;
    public final void rule__DynamicExceptionSpecification__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7345:1: ( rule__DynamicExceptionSpecification__Group__2__Impl rule__DynamicExceptionSpecification__Group__3 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7346:2: rule__DynamicExceptionSpecification__Group__2__Impl rule__DynamicExceptionSpecification__Group__3
            {
            pushFollow(FOLLOW_rule__DynamicExceptionSpecification__Group__2__Impl_in_rule__DynamicExceptionSpecification__Group__214974);
            rule__DynamicExceptionSpecification__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DynamicExceptionSpecification__Group__3_in_rule__DynamicExceptionSpecification__Group__214977);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7353:1: rule__DynamicExceptionSpecification__Group__2__Impl : ( ruleTypeIdList ) ;
    public final void rule__DynamicExceptionSpecification__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7357:1: ( ( ruleTypeIdList ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7358:1: ( ruleTypeIdList )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7358:1: ( ruleTypeIdList )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7359:1: ruleTypeIdList
            {
             before(grammarAccess.getDynamicExceptionSpecificationAccess().getTypeIdListParserRuleCall_2()); 
            pushFollow(FOLLOW_ruleTypeIdList_in_rule__DynamicExceptionSpecification__Group__2__Impl15004);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7370:1: rule__DynamicExceptionSpecification__Group__3 : rule__DynamicExceptionSpecification__Group__3__Impl ;
    public final void rule__DynamicExceptionSpecification__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7374:1: ( rule__DynamicExceptionSpecification__Group__3__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7375:2: rule__DynamicExceptionSpecification__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__DynamicExceptionSpecification__Group__3__Impl_in_rule__DynamicExceptionSpecification__Group__315033);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7381:1: rule__DynamicExceptionSpecification__Group__3__Impl : ( ')' ) ;
    public final void rule__DynamicExceptionSpecification__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7385:1: ( ( ')' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7386:1: ( ')' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7386:1: ( ')' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7387:1: ')'
            {
             before(grammarAccess.getDynamicExceptionSpecificationAccess().getRightParenthesisKeyword_3()); 
            match(input,108,FOLLOW_108_in_rule__DynamicExceptionSpecification__Group__3__Impl15061); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7408:1: rule__NoexceptSpecification__Group__0 : rule__NoexceptSpecification__Group__0__Impl rule__NoexceptSpecification__Group__1 ;
    public final void rule__NoexceptSpecification__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7412:1: ( rule__NoexceptSpecification__Group__0__Impl rule__NoexceptSpecification__Group__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7413:2: rule__NoexceptSpecification__Group__0__Impl rule__NoexceptSpecification__Group__1
            {
            pushFollow(FOLLOW_rule__NoexceptSpecification__Group__0__Impl_in_rule__NoexceptSpecification__Group__015100);
            rule__NoexceptSpecification__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NoexceptSpecification__Group__1_in_rule__NoexceptSpecification__Group__015103);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7420:1: rule__NoexceptSpecification__Group__0__Impl : ( 'noexcept' ) ;
    public final void rule__NoexceptSpecification__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7424:1: ( ( 'noexcept' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7425:1: ( 'noexcept' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7425:1: ( 'noexcept' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7426:1: 'noexcept'
            {
             before(grammarAccess.getNoexceptSpecificationAccess().getNoexceptKeyword_0()); 
            match(input,116,FOLLOW_116_in_rule__NoexceptSpecification__Group__0__Impl15131); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7439:1: rule__NoexceptSpecification__Group__1 : rule__NoexceptSpecification__Group__1__Impl ;
    public final void rule__NoexceptSpecification__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7443:1: ( rule__NoexceptSpecification__Group__1__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7444:2: rule__NoexceptSpecification__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__NoexceptSpecification__Group__1__Impl_in_rule__NoexceptSpecification__Group__115162);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7450:1: rule__NoexceptSpecification__Group__1__Impl : ( ( rule__NoexceptSpecification__Group_1__0 )? ) ;
    public final void rule__NoexceptSpecification__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7454:1: ( ( ( rule__NoexceptSpecification__Group_1__0 )? ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7455:1: ( ( rule__NoexceptSpecification__Group_1__0 )? )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7455:1: ( ( rule__NoexceptSpecification__Group_1__0 )? )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7456:1: ( rule__NoexceptSpecification__Group_1__0 )?
            {
             before(grammarAccess.getNoexceptSpecificationAccess().getGroup_1()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7457:1: ( rule__NoexceptSpecification__Group_1__0 )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==107) ) {
                int LA78_1 = input.LA(2);

                if ( (LA78_1==39) ) {
                    alt78=1;
                }
            }
            switch (alt78) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7457:2: rule__NoexceptSpecification__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__NoexceptSpecification__Group_1__0_in_rule__NoexceptSpecification__Group__1__Impl15189);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7471:1: rule__NoexceptSpecification__Group_1__0 : rule__NoexceptSpecification__Group_1__0__Impl rule__NoexceptSpecification__Group_1__1 ;
    public final void rule__NoexceptSpecification__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7475:1: ( rule__NoexceptSpecification__Group_1__0__Impl rule__NoexceptSpecification__Group_1__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7476:2: rule__NoexceptSpecification__Group_1__0__Impl rule__NoexceptSpecification__Group_1__1
            {
            pushFollow(FOLLOW_rule__NoexceptSpecification__Group_1__0__Impl_in_rule__NoexceptSpecification__Group_1__015224);
            rule__NoexceptSpecification__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NoexceptSpecification__Group_1__1_in_rule__NoexceptSpecification__Group_1__015227);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7483:1: rule__NoexceptSpecification__Group_1__0__Impl : ( '(' ) ;
    public final void rule__NoexceptSpecification__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7487:1: ( ( '(' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7488:1: ( '(' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7488:1: ( '(' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7489:1: '('
            {
             before(grammarAccess.getNoexceptSpecificationAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,107,FOLLOW_107_in_rule__NoexceptSpecification__Group_1__0__Impl15255); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7502:1: rule__NoexceptSpecification__Group_1__1 : rule__NoexceptSpecification__Group_1__1__Impl rule__NoexceptSpecification__Group_1__2 ;
    public final void rule__NoexceptSpecification__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7506:1: ( rule__NoexceptSpecification__Group_1__1__Impl rule__NoexceptSpecification__Group_1__2 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7507:2: rule__NoexceptSpecification__Group_1__1__Impl rule__NoexceptSpecification__Group_1__2
            {
            pushFollow(FOLLOW_rule__NoexceptSpecification__Group_1__1__Impl_in_rule__NoexceptSpecification__Group_1__115286);
            rule__NoexceptSpecification__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NoexceptSpecification__Group_1__2_in_rule__NoexceptSpecification__Group_1__115289);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7514:1: rule__NoexceptSpecification__Group_1__1__Impl : ( ruleConstantExpression ) ;
    public final void rule__NoexceptSpecification__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7518:1: ( ( ruleConstantExpression ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7519:1: ( ruleConstantExpression )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7519:1: ( ruleConstantExpression )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7520:1: ruleConstantExpression
            {
             before(grammarAccess.getNoexceptSpecificationAccess().getConstantExpressionParserRuleCall_1_1()); 
            pushFollow(FOLLOW_ruleConstantExpression_in_rule__NoexceptSpecification__Group_1__1__Impl15316);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7531:1: rule__NoexceptSpecification__Group_1__2 : rule__NoexceptSpecification__Group_1__2__Impl ;
    public final void rule__NoexceptSpecification__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7535:1: ( rule__NoexceptSpecification__Group_1__2__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7536:2: rule__NoexceptSpecification__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__NoexceptSpecification__Group_1__2__Impl_in_rule__NoexceptSpecification__Group_1__215345);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7542:1: rule__NoexceptSpecification__Group_1__2__Impl : ( ')' ) ;
    public final void rule__NoexceptSpecification__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7546:1: ( ( ')' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7547:1: ( ')' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7547:1: ( ')' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7548:1: ')'
            {
             before(grammarAccess.getNoexceptSpecificationAccess().getRightParenthesisKeyword_1_2()); 
            match(input,108,FOLLOW_108_in_rule__NoexceptSpecification__Group_1__2__Impl15373); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7568:1: rule__Test__ElementsAssignment : ( ruleToken ) ;
    public final void rule__Test__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7572:1: ( ( ruleToken ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7573:1: ( ruleToken )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7573:1: ( ruleToken )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7574:1: ruleToken
            {
             before(grammarAccess.getTestAccess().getElementsTokenParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleToken_in_rule__Test__ElementsAssignment15415);
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


    protected DFA17 dfa17 = new DFA17(this);
    protected DFA42 dfa42 = new DFA42(this);
    static final String DFA17_eotS =
        "\55\uffff";
    static final String DFA17_eofS =
        "\1\uffff\1\52\1\54\52\uffff";
    static final String DFA17_minS =
        "\1\75\2\113\52\uffff";
    static final String DFA17_maxS =
        "\1\144\2\150\52\uffff";
    static final String DFA17_acceptS =
        "\3\uffff\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1"+
        "\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34"+
        "\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46\1\47\1\50\1\51"+
        "\1\52\1\3\1\1\1\4\1\2";
    static final String DFA17_specialS =
        "\55\uffff}>";
    static final String[] DFA17_transitionS = {
            "\1\11\1\40\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\12\1\13\1\14"+
            "\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30"+
            "\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\41\1\42\1\43\1\44\1\45"+
            "\1\46\1\47\1\50",
            "\1\52\34\uffff\1\51",
            "\1\54\34\uffff\1\53",
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

    static final short[] DFA17_eot = DFA.unpackEncodedString(DFA17_eotS);
    static final short[] DFA17_eof = DFA.unpackEncodedString(DFA17_eofS);
    static final char[] DFA17_min = DFA.unpackEncodedStringToUnsignedChars(DFA17_minS);
    static final char[] DFA17_max = DFA.unpackEncodedStringToUnsignedChars(DFA17_maxS);
    static final short[] DFA17_accept = DFA.unpackEncodedString(DFA17_acceptS);
    static final short[] DFA17_special = DFA.unpackEncodedString(DFA17_specialS);
    static final short[][] DFA17_transition;

    static {
        int numStates = DFA17_transitionS.length;
        DFA17_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA17_transition[i] = DFA.unpackEncodedString(DFA17_transitionS[i]);
        }
    }

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = DFA17_eot;
            this.eof = DFA17_eof;
            this.min = DFA17_min;
            this.max = DFA17_max;
            this.accept = DFA17_accept;
            this.special = DFA17_special;
            this.transition = DFA17_transition;
        }
        public String getDescription() {
            return "1979:1: rule__OverloadableOperator__Alternatives : ( ( 'new' ) | ( 'delete' ) | ( ( rule__OverloadableOperator__Group_2__0 ) ) | ( ( rule__OverloadableOperator__Group_3__0 ) ) | ( '+' ) | ( '-' ) | ( '*' ) | ( '/' ) | ( '%' ) | ( '^' ) | ( '&' ) | ( '|' ) | ( '~' ) | ( '!' ) | ( '=' ) | ( '<' ) | ( '>' ) | ( '+=' ) | ( '-=' ) | ( '*=' ) | ( '/=' ) | ( '%=' ) | ( '^=' ) | ( '&=' ) | ( '|=' ) | ( '<<' ) | ( '>>' ) | ( '>>=' ) | ( '<<=' ) | ( '==' ) | ( '!=' ) | ( '<=' ) | ( '>=' ) | ( '&&' ) | ( '||' ) | ( '++' ) | ( '--' ) | ( ',' ) | ( '->*' ) | ( '->' ) | ( '()' ) | ( '[]' ) );";
        }
    }
    static final String DFA42_eotS =
        "\77\uffff";
    static final String DFA42_eofS =
        "\1\1\4\uffff\1\3\2\uffff\4\3\1\uffff\1\3\17\uffff\1\3\1\uffff\3"+
        "\3\11\uffff\1\3\23\uffff";
    static final String DFA42_minS =
        "\1\70\1\uffff\1\65\1\uffff\1\154\1\70\1\47\1\153\4\70\1\153\1\70"+
        "\1\12\1\50\1\63\1\47\1\140\2\145\2\154\1\4\1\140\1\12\1\151\1\12"+
        "\1\154\1\70\1\154\3\70\5\154\2\146\1\12\1\140\1\70\2\140\2\154\1"+
        "\12\1\4\2\140\5\154\2\146\1\12\1\140\2\154";
    static final String DFA42_maxS =
        "\1\154\1\uffff\1\65\1\uffff\1\154\1\164\1\150\1\153\4\164\1\153"+
        "\1\154\1\12\1\56\1\63\1\65\1\153\4\154\1\72\3\151\1\12\1\154\1\164"+
        "\1\154\1\164\7\154\2\146\1\12\1\153\1\164\1\153\1\151\2\154\1\12"+
        "\1\72\1\151\1\153\5\154\2\146\1\12\1\151\2\154";
    static final String DFA42_acceptS =
        "\1\uffff\1\2\1\uffff\1\1\73\uffff";
    static final String DFA42_specialS =
        "\77\uffff}>";
    static final String[] DFA42_transitionS = {
            "\1\1\57\uffff\1\3\2\uffff\1\2\1\1",
            "",
            "\1\4",
            "",
            "\1\5",
            "\1\3\2\uffff\1\10\1\11\1\12\1\13\43\uffff\1\1\5\uffff\1\6"+
            "\1\uffff\1\7\2\3\6\uffff\1\14\1\15",
            "\1\3\100\uffff\1\16",
            "\1\17",
            "\1\3\2\uffff\1\10\1\11\1\12\1\13\43\uffff\1\1\5\uffff\1\3"+
            "\2\uffff\2\3\6\uffff\1\14\1\15",
            "\1\3\2\uffff\1\10\1\11\1\12\1\13\43\uffff\1\1\5\uffff\1\3"+
            "\2\uffff\2\3\6\uffff\1\14\1\15",
            "\1\3\4\uffff\1\12\1\13\43\uffff\1\1\5\uffff\1\3\2\uffff\2"+
            "\3\6\uffff\1\14\1\15",
            "\1\3\4\uffff\1\12\1\13\43\uffff\1\1\5\uffff\1\3\2\uffff\2"+
            "\3\6\uffff\1\14\1\15",
            "\1\20",
            "\1\3\51\uffff\1\1\5\uffff\1\3\2\uffff\1\21\1\3",
            "\1\22",
            "\1\24\5\uffff\1\23",
            "\1\25",
            "\1\26\15\uffff\1\3",
            "\1\31\4\uffff\1\30\1\uffff\1\33\1\uffff\1\32\1\uffff\1\27",
            "\1\34\6\uffff\1\35",
            "\1\36\6\uffff\1\37",
            "\1\40",
            "\1\41",
            "\1\42\1\43\1\44\1\45\1\46\1\51\57\uffff\1\47\1\50",
            "\1\31\10\uffff\1\32",
            "\1\52\125\uffff\1\31\10\uffff\1\32",
            "\1\53",
            "\1\54",
            "\1\35",
            "\1\3\2\uffff\1\10\1\11\1\12\1\13\43\uffff\1\1\5\uffff\1\6"+
            "\1\uffff\1\7\2\3\6\uffff\1\14\1\15",
            "\1\37",
            "\1\3\2\uffff\1\10\1\11\1\12\1\13\43\uffff\1\1\5\uffff\1\6"+
            "\1\uffff\1\7\2\3\6\uffff\1\14\1\15",
            "\1\3\51\uffff\1\1\5\uffff\1\3\2\uffff\2\3",
            "\1\3\51\uffff\1\1\5\uffff\1\3\2\uffff\2\3",
            "\1\55",
            "\1\55",
            "\1\55",
            "\1\55",
            "\1\55",
            "\1\56",
            "\1\56",
            "\1\57",
            "\1\31\4\uffff\1\62\1\uffff\1\60\1\uffff\1\32\1\uffff\1\61",
            "\1\3\2\uffff\1\10\1\11\1\12\1\13\43\uffff\1\1\5\uffff\1\6"+
            "\1\uffff\1\7\2\3\6\uffff\1\14\1\15",
            "\1\31\4\uffff\1\30\3\uffff\1\32\1\uffff\1\27",
            "\1\31\4\uffff\1\30\3\uffff\1\32",
            "\1\55",
            "\1\55",
            "\1\63",
            "\1\64\1\65\1\66\1\67\1\70\1\73\57\uffff\1\71\1\72",
            "\1\31\10\uffff\1\32",
            "\1\31\4\uffff\1\62\3\uffff\1\32\1\uffff\1\61",
            "\1\74",
            "\1\74",
            "\1\74",
            "\1\74",
            "\1\74",
            "\1\75",
            "\1\75",
            "\1\76",
            "\1\31\4\uffff\1\62\3\uffff\1\32",
            "\1\74",
            "\1\74"
    };

    static final short[] DFA42_eot = DFA.unpackEncodedString(DFA42_eotS);
    static final short[] DFA42_eof = DFA.unpackEncodedString(DFA42_eofS);
    static final char[] DFA42_min = DFA.unpackEncodedStringToUnsignedChars(DFA42_minS);
    static final char[] DFA42_max = DFA.unpackEncodedStringToUnsignedChars(DFA42_maxS);
    static final short[] DFA42_accept = DFA.unpackEncodedString(DFA42_acceptS);
    static final short[] DFA42_special = DFA.unpackEncodedString(DFA42_specialS);
    static final short[][] DFA42_transition;

    static {
        int numStates = DFA42_transitionS.length;
        DFA42_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA42_transition[i] = DFA.unpackEncodedString(DFA42_transitionS[i]);
        }
    }

    class DFA42 extends DFA {

        public DFA42(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 42;
            this.eot = DFA42_eot;
            this.eof = DFA42_eof;
            this.min = DFA42_min;
            this.max = DFA42_max;
            this.accept = DFA42_accept;
            this.special = DFA42_special;
            this.transition = DFA42_transition;
        }
        public String getDescription() {
            return "()* loopback of 4141:1: ( rule__NoptrDeclarator )*";
        }
    }
 

    public static final BitSet FOLLOW_ruleTest_in_entryRuleTest61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTest68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Test__ElementsAssignment_in_ruleTest94 = new BitSet(new long[]{0x06000000000003F2L});
    public static final BitSet FOLLOW_ruleToken_in_entryRuleToken124 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleToken131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Token__Alternatives_in_ruleToken157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral184 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Alternatives_in_ruleLiteral217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamespaceBody_in_entryRuleNamespaceBody246 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNamespaceBody253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_ruleNamespaceBody280 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNamespaceSpecifier_in_entryRuleQualifiedNamespaceSpecifier310 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNamespaceSpecifier317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNamespaceSpecifier__Group__0_in_ruleQualifiedNamespaceSpecifier343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeSpecifier_in_entryRuleAttributeSpecifier378 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttributeSpecifier385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeSpecifier__Alternatives_in_ruleAttributeSpecifier411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlignmentSpecifier_in_entryRuleAlignmentSpecifier438 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAlignmentSpecifier445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AlignmentSpecifier__Alternatives_in_ruleAlignmentSpecifier471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeList_in_entryRuleAttributeList498 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttributeList505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeList__Group__0_in_ruleAttributeList531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute558 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__0_in_ruleAttribute591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeToken_in_entryRuleAttributeToken618 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttributeToken625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeToken__Group__0_in_ruleAttributeToken651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeArgumentClause_in_entryRuleAttributeArgumentClause678 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttributeArgumentClause685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeArgumentClause__Group__0_in_ruleAttributeArgumentClause711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInitDeclarator_in_entryRuleInitDeclarator740 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInitDeclarator747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InitDeclarator__Group__0_in_ruleInitDeclarator773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclarator_in_entryRuleDeclarator800 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeclarator807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declarator__Alternatives_in_ruleDeclarator833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePtrDeclarator_in_entryRulePtrDeclarator860 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePtrDeclarator867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PtrDeclarator__Group__0_in_rulePtrDeclarator893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoptrDeclarator_in_entryRuleNoptrDeclarator920 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNoptrDeclarator927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NoptrDeclarator__Group__0_in_ruleNoptrDeclarator953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule_NoptrDeclarator_in_entryRule_NoptrDeclarator980 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRule_NoptrDeclarator987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule___NoptrDeclarator__Alternatives_in_rule_NoptrDeclarator1013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NoptrDeclarator_in_entryRule__NoptrDeclarator1040 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRule__NoptrDeclarator1047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule____NoptrDeclarator__Alternatives_in_rule__NoptrDeclarator1073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParametersAndQualifiers_in_entryRuleParametersAndQualifiers1100 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParametersAndQualifiers1107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParametersAndQualifiers__Group__0_in_ruleParametersAndQualifiers1133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTrailingReturnType_in_entryRuleTrailingReturnType1160 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTrailingReturnType1167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TrailingReturnType__Group__0_in_ruleTrailingReturnType1193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePtrOperator_in_entryRulePtrOperator1220 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePtrOperator1227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PtrOperator__Alternatives_in_rulePtrOperator1253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaratorId_in_entryRuleDeclaratorId1280 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeclaratorId1287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeclaratorId__Alternatives_in_ruleDeclaratorId1313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperatorFunctionId_in_entryRuleOperatorFunctionId1340 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOperatorFunctionId1347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OperatorFunctionId__Group__0_in_ruleOperatorFunctionId1373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOverloadableOperator_in_entryRuleOverloadableOperator1400 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOverloadableOperator1407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OverloadableOperator__Alternatives_in_ruleOverloadableOperator1433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralOperatorId_in_entryRuleLiteralOperatorId1460 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteralOperatorId1467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LiteralOperatorId__Group__0_in_ruleLiteralOperatorId1493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplateParameterList_in_entryRuleTemplateParameterList1522 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTemplateParameterList1529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemplateParameterList__Group__0_in_ruleTemplateParameterList1555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplateParameter_in_entryRuleTemplateParameter1582 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTemplateParameter1589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemplateParameter__Alternatives_in_ruleTemplateParameter1615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeParameter_in_entryRuleTypeParameter1642 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeParameter1649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeParameter__Alternatives_in_ruleTypeParameter1675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleTemplateId_in_entryRuleSimpleTemplateId1702 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleTemplateId1709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleTemplateId__Group__0_in_ruleSimpleTemplateId1735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplateArgumentList_in_entryRuleTemplateArgumentList1764 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTemplateArgumentList1771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemplateArgumentList__Group__0_in_ruleTemplateArgumentList1797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplateArgument_in_entryRuleTemplateArgument1824 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTemplateArgument1831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemplateArgument__Alternatives_in_ruleTemplateArgument1857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHandler_in_entryRuleHandler1894 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHandler1901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Handler__Group__0_in_ruleHandler1927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExceptionDeclaration_in_entryRuleExceptionDeclaration1954 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExceptionDeclaration1961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExceptionDeclaration__Alternatives_in_ruleExceptionDeclaration1987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExceptionSpecification_in_entryRuleExceptionSpecification2016 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExceptionSpecification2023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExceptionSpecification__Alternatives_in_ruleExceptionSpecification2049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDynamicExceptionSpecification_in_entryRuleDynamicExceptionSpecification2076 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDynamicExceptionSpecification2083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DynamicExceptionSpecification__Group__0_in_ruleDynamicExceptionSpecification2109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoexceptSpecification_in_entryRuleNoexceptSpecification2136 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNoexceptSpecification2143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NoexceptSpecification__Group__0_in_ruleNoexceptSpecification2169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantExpression_in_entryRuleConstantExpression2196 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstantExpression2203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleConstantExpression2230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeId_in_entryRuleTypeId2258 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeId2265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleTypeId2292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdExpression_in_entryRuleIdExpression2320 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIdExpression2327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleIdExpression2354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterDeclaration_in_entryRuleParameterDeclaration2382 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterDeclaration2389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleParameterDeclaration2416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_entryRuleDeclaration2444 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeclaration2451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleDeclaration2478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNestedNameSpecifier_in_entryRuleNestedNameSpecifier2506 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNestedNameSpecifier2513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleNestedNameSpecifier2540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignmentExpression_in_entryRuleAssignmentExpression2568 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignmentExpression2575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleAssignmentExpression2602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlignmentExpression_in_entryRuleAlignmentExpression2630 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAlignmentExpression2637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleAlignmentExpression2664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeSpecifier_in_entryRuleTypeSpecifier2692 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeSpecifier2699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleTypeSpecifier2726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractDeclarator_in_entryRuleAbstractDeclarator2754 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractDeclarator2761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleAbstractDeclarator2788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompoundStatement_in_entryRuleCompoundStatement2816 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompoundStatement2823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleCompoundStatement2850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCtorInitializer_in_entryRuleCtorInitializer2878 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCtorInitializer2885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleCtorInitializer2912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeIdList_in_entryRuleTypeIdList2940 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeIdList2947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleTypeIdList2974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnqualifiedId_in_entryRuleUnqualifiedId3002 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnqualifiedId3009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleUnqualifiedId3036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterDeclarationClause_in_entryRuleParameterDeclarationClause3064 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterDeclarationClause3071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleParameterDeclarationClause3098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTrailingTypeSpecifier_in_entryRuleTrailingTypeSpecifier3126 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTrailingTypeSpecifier3133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleTrailingTypeSpecifier3160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassName_in_entryRuleClassName3188 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClassName3195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleClassName3222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInitializer_in_entryRuleInitializer3250 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInitializer3257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleInitializer3284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_KEYWORD_in_rule__Token__Alternatives3322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_rule__Token__Alternatives3339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Token__Group_2__0_in_rule__Token__Alternatives3356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Literal__Alternatives3389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CHARACTER_LITERAL_in_rule__Literal__Alternatives3406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOATING_LITERAL_in_rule__Literal__Alternatives3423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_LITERAL_in_rule__Literal__Alternatives3440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Group_4__0_in_rule__Literal__Alternatives3457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_rule__Literal__Alternatives_4_03491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_rule__Literal__Alternatives_4_03511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeSpecifier__Group_0__0_in_rule__AttributeSpecifier__Alternatives3547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlignmentSpecifier_in_rule__AttributeSpecifier__Alternatives3565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AlignmentSpecifier__Group_0__0_in_rule__AlignmentSpecifier__Alternatives3597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AlignmentSpecifier__Group_1__0_in_rule__AlignmentSpecifier__Alternatives3615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declarator__Group_0__0_in_rule__Declarator__Alternatives3648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declarator__Group_1__0_in_rule__Declarator__Alternatives3666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule___NoptrDeclarator__Group_0__0_in_rule___NoptrDeclarator__Alternatives3699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule___NoptrDeclarator__Group_1__0_in_rule___NoptrDeclarator__Alternatives3717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParametersAndQualifiers_in_rule____NoptrDeclarator__Alternatives3750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule____NoptrDeclarator__Group_1__0_in_rule____NoptrDeclarator__Alternatives3767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_rule__ParametersAndQualifiers__Alternatives_43801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_rule__ParametersAndQualifiers__Alternatives_43821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_rule__ParametersAndQualifiers__Alternatives_53856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_rule__ParametersAndQualifiers__Alternatives_53876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PtrOperator__Group_0__0_in_rule__PtrOperator__Alternatives3910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PtrOperator__Group_1__0_in_rule__PtrOperator__Alternatives3928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PtrOperator__Group_2__0_in_rule__PtrOperator__Alternatives3946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PtrOperator__Group_3__0_in_rule__PtrOperator__Alternatives3964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_rule__PtrOperator__Alternatives_0_23998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_rule__PtrOperator__Alternatives_0_24018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_rule__PtrOperator__Alternatives_3_44053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_rule__PtrOperator__Alternatives_3_44073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeclaratorId__Group_0__0_in_rule__DeclaratorId__Alternatives4107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeclaratorId__Group_1__0_in_rule__DeclaratorId__Alternatives4125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_rule__OverloadableOperator__Alternatives4159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_rule__OverloadableOperator__Alternatives4179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OverloadableOperator__Group_2__0_in_rule__OverloadableOperator__Alternatives4198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OverloadableOperator__Group_3__0_in_rule__OverloadableOperator__Alternatives4216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_rule__OverloadableOperator__Alternatives4235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_rule__OverloadableOperator__Alternatives4255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_rule__OverloadableOperator__Alternatives4275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_rule__OverloadableOperator__Alternatives4295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_rule__OverloadableOperator__Alternatives4315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_rule__OverloadableOperator__Alternatives4335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_rule__OverloadableOperator__Alternatives4355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_rule__OverloadableOperator__Alternatives4375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_rule__OverloadableOperator__Alternatives4395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_rule__OverloadableOperator__Alternatives4415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_rule__OverloadableOperator__Alternatives4435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_rule__OverloadableOperator__Alternatives4455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_rule__OverloadableOperator__Alternatives4475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_rule__OverloadableOperator__Alternatives4495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_rule__OverloadableOperator__Alternatives4515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_rule__OverloadableOperator__Alternatives4535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_rule__OverloadableOperator__Alternatives4555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_rule__OverloadableOperator__Alternatives4575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_rule__OverloadableOperator__Alternatives4595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_rule__OverloadableOperator__Alternatives4615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_rule__OverloadableOperator__Alternatives4635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_rule__OverloadableOperator__Alternatives4655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_rule__OverloadableOperator__Alternatives4675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_rule__OverloadableOperator__Alternatives4695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_rule__OverloadableOperator__Alternatives4715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_rule__OverloadableOperator__Alternatives4735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_rule__OverloadableOperator__Alternatives4755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_rule__OverloadableOperator__Alternatives4775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_rule__OverloadableOperator__Alternatives4795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_rule__OverloadableOperator__Alternatives4815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_rule__OverloadableOperator__Alternatives4835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_rule__OverloadableOperator__Alternatives4855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_rule__OverloadableOperator__Alternatives4875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_rule__OverloadableOperator__Alternatives4895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_rule__OverloadableOperator__Alternatives4915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_98_in_rule__OverloadableOperator__Alternatives4935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_99_in_rule__OverloadableOperator__Alternatives4955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_100_in_rule__OverloadableOperator__Alternatives4975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeParameter_in_rule__TemplateParameter__Alternatives5009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterDeclaration_in_rule__TemplateParameter__Alternatives5026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_0__0_in_rule__TypeParameter__Alternatives5058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_1__0_in_rule__TypeParameter__Alternatives5076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_2__0_in_rule__TypeParameter__Alternatives5094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_0_1_0__0_in_rule__TypeParameter__Alternatives_0_15127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_0_1_1__0_in_rule__TypeParameter__Alternatives_0_15145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_1_1_0__0_in_rule__TypeParameter__Alternatives_1_15178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_1_1_1__0_in_rule__TypeParameter__Alternatives_1_15196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_2_5_0__0_in_rule__TypeParameter__Alternatives_2_55229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_2_5_1__0_in_rule__TypeParameter__Alternatives_2_55247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantExpression_in_rule__TemplateArgument__Alternatives5281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeId_in_rule__TemplateArgument__Alternatives5298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdExpression_in_rule__TemplateArgument__Alternatives5315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExceptionDeclaration__Group_0__0_in_rule__ExceptionDeclaration__Alternatives5348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_101_in_rule__ExceptionDeclaration__Alternatives5367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclarator_in_rule__ExceptionDeclaration__Alternatives_0_25401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractDeclarator_in_rule__ExceptionDeclaration__Alternatives_0_25419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDynamicExceptionSpecification_in_rule__ExceptionSpecification__Alternatives5453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoexceptSpecification_in_rule__ExceptionSpecification__Alternatives5470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Token__Group_2__0__Impl_in_rule__Token__Group_2__05500 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_rule__Token__Group_2__1_in_rule__Token__Group_2__05503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PREPROCESSING_OP_OR_PUNC_in_rule__Token__Group_2__0__Impl5530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Token__Group_2__1__Impl_in_rule__Token__Group_2__15559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Token__Group_2__1__Impl5586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Group_4__0__Impl_in_rule__Literal__Group_4__05619 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_rule__Literal__Group_4__1_in_rule__Literal__Group_4__05622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Alternatives_4_0_in_rule__Literal__Group_4__0__Impl5649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Group_4__1__Impl_in_rule__Literal__Group_4__15679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_102_in_rule__Literal__Group_4__1__Impl5707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNamespaceSpecifier__Group__0__Impl_in_rule__QualifiedNamespaceSpecifier__Group__05744 = new BitSet(new long[]{0x0000100000000400L});
    public static final BitSet FOLLOW_rule__QualifiedNamespaceSpecifier__Group__1_in_rule__QualifiedNamespaceSpecifier__Group__05747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_103_in_rule__QualifiedNamespaceSpecifier__Group__0__Impl5776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNamespaceSpecifier__Group__1__Impl_in_rule__QualifiedNamespaceSpecifier__Group__15809 = new BitSet(new long[]{0x0000100000000400L});
    public static final BitSet FOLLOW_rule__QualifiedNamespaceSpecifier__Group__2_in_rule__QualifiedNamespaceSpecifier__Group__15812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNestedNameSpecifier_in_rule__QualifiedNamespaceSpecifier__Group__1__Impl5840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNamespaceSpecifier__Group__2__Impl_in_rule__QualifiedNamespaceSpecifier__Group__25871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedNamespaceSpecifier__Group__2__Impl5898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeSpecifier__Group_0__0__Impl_in_rule__AttributeSpecifier__Group_0__05939 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_rule__AttributeSpecifier__Group_0__1_in_rule__AttributeSpecifier__Group_0__05942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_104_in_rule__AttributeSpecifier__Group_0__0__Impl5970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeSpecifier__Group_0__1__Impl_in_rule__AttributeSpecifier__Group_0__16001 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_rule__AttributeSpecifier__Group_0__2_in_rule__AttributeSpecifier__Group_0__16004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_104_in_rule__AttributeSpecifier__Group_0__1__Impl6032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeSpecifier__Group_0__2__Impl_in_rule__AttributeSpecifier__Group_0__26063 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_rule__AttributeSpecifier__Group_0__3_in_rule__AttributeSpecifier__Group_0__26066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeList_in_rule__AttributeSpecifier__Group_0__2__Impl6093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeSpecifier__Group_0__3__Impl_in_rule__AttributeSpecifier__Group_0__36122 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_rule__AttributeSpecifier__Group_0__4_in_rule__AttributeSpecifier__Group_0__36125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_105_in_rule__AttributeSpecifier__Group_0__3__Impl6153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeSpecifier__Group_0__4__Impl_in_rule__AttributeSpecifier__Group_0__46184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_105_in_rule__AttributeSpecifier__Group_0__4__Impl6212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AlignmentSpecifier__Group_0__0__Impl_in_rule__AlignmentSpecifier__Group_0__06253 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_rule__AlignmentSpecifier__Group_0__1_in_rule__AlignmentSpecifier__Group_0__06256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_106_in_rule__AlignmentSpecifier__Group_0__0__Impl6284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AlignmentSpecifier__Group_0__1__Impl_in_rule__AlignmentSpecifier__Group_0__16315 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__AlignmentSpecifier__Group_0__2_in_rule__AlignmentSpecifier__Group_0__16318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_107_in_rule__AlignmentSpecifier__Group_0__1__Impl6346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AlignmentSpecifier__Group_0__2__Impl_in_rule__AlignmentSpecifier__Group_0__26377 = new BitSet(new long[]{0x0000000000000000L,0x0000102000000000L});
    public static final BitSet FOLLOW_rule__AlignmentSpecifier__Group_0__3_in_rule__AlignmentSpecifier__Group_0__26380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeId_in_rule__AlignmentSpecifier__Group_0__2__Impl6407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AlignmentSpecifier__Group_0__3__Impl_in_rule__AlignmentSpecifier__Group_0__36436 = new BitSet(new long[]{0x0000000000000000L,0x0000102000000000L});
    public static final BitSet FOLLOW_rule__AlignmentSpecifier__Group_0__4_in_rule__AlignmentSpecifier__Group_0__36439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_101_in_rule__AlignmentSpecifier__Group_0__3__Impl6468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AlignmentSpecifier__Group_0__4__Impl_in_rule__AlignmentSpecifier__Group_0__46501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_108_in_rule__AlignmentSpecifier__Group_0__4__Impl6529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AlignmentSpecifier__Group_1__0__Impl_in_rule__AlignmentSpecifier__Group_1__06570 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_rule__AlignmentSpecifier__Group_1__1_in_rule__AlignmentSpecifier__Group_1__06573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_106_in_rule__AlignmentSpecifier__Group_1__0__Impl6601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AlignmentSpecifier__Group_1__1__Impl_in_rule__AlignmentSpecifier__Group_1__16632 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_rule__AlignmentSpecifier__Group_1__2_in_rule__AlignmentSpecifier__Group_1__16635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_107_in_rule__AlignmentSpecifier__Group_1__1__Impl6663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AlignmentSpecifier__Group_1__2__Impl_in_rule__AlignmentSpecifier__Group_1__26694 = new BitSet(new long[]{0x0000000000000000L,0x0000102000000000L});
    public static final BitSet FOLLOW_rule__AlignmentSpecifier__Group_1__3_in_rule__AlignmentSpecifier__Group_1__26697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlignmentExpression_in_rule__AlignmentSpecifier__Group_1__2__Impl6724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AlignmentSpecifier__Group_1__3__Impl_in_rule__AlignmentSpecifier__Group_1__36753 = new BitSet(new long[]{0x0000000000000000L,0x0000102000000000L});
    public static final BitSet FOLLOW_rule__AlignmentSpecifier__Group_1__4_in_rule__AlignmentSpecifier__Group_1__36756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_101_in_rule__AlignmentSpecifier__Group_1__3__Impl6785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AlignmentSpecifier__Group_1__4__Impl_in_rule__AlignmentSpecifier__Group_1__46818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_108_in_rule__AlignmentSpecifier__Group_1__4__Impl6846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeList__Group__0__Impl_in_rule__AttributeList__Group__06887 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_rule__AttributeList__Group__1_in_rule__AttributeList__Group__06890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeList__Group_0__0_in_rule__AttributeList__Group__0__Impl6917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeList__Group__1__Impl_in_rule__AttributeList__Group__16947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeList__Group_1__0_in_rule__AttributeList__Group__1__Impl6974 = new BitSet(new long[]{0x0000000000000002L,0x0000000100000000L});
    public static final BitSet FOLLOW_rule__AttributeList__Group_0__0__Impl_in_rule__AttributeList__Group_0__07009 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_rule__AttributeList__Group_0__1_in_rule__AttributeList__Group_0__07012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_rule__AttributeList__Group_0__0__Impl7039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeList__Group_0__1__Impl_in_rule__AttributeList__Group_0__17068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_101_in_rule__AttributeList__Group_0__1__Impl7097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeList__Group_1__0__Impl_in_rule__AttributeList__Group_1__07134 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_rule__AttributeList__Group_1__1_in_rule__AttributeList__Group_1__07137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_rule__AttributeList__Group_1__0__Impl7165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeList__Group_1__1__Impl_in_rule__AttributeList__Group_1__17196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeList__Group_1_1__0_in_rule__AttributeList__Group_1__1__Impl7223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeList__Group_1_1__0__Impl_in_rule__AttributeList__Group_1_1__07258 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_rule__AttributeList__Group_1_1__1_in_rule__AttributeList__Group_1_1__07261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_rule__AttributeList__Group_1_1__0__Impl7288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeList__Group_1_1__1__Impl_in_rule__AttributeList__Group_1_1__17317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_101_in_rule__AttributeList__Group_1_1__1__Impl7346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__0__Impl_in_rule__Attribute__Group__07383 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_rule__Attribute__Group__1_in_rule__Attribute__Group__07386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeToken_in_rule__Attribute__Group__0__Impl7413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__1__Impl_in_rule__Attribute__Group__17442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeArgumentClause_in_rule__Attribute__Group__1__Impl7470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeToken__Group__0__Impl_in_rule__AttributeToken__Group__07505 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_rule__AttributeToken__Group__1_in_rule__AttributeToken__Group__07508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeToken__Group_0__0_in_rule__AttributeToken__Group__0__Impl7535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeToken__Group__1__Impl_in_rule__AttributeToken__Group__17566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__AttributeToken__Group__1__Impl7593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeToken__Group_0__0__Impl_in_rule__AttributeToken__Group_0__07626 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_rule__AttributeToken__Group_0__1_in_rule__AttributeToken__Group_0__07629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__AttributeToken__Group_0__0__Impl7656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeToken__Group_0__1__Impl_in_rule__AttributeToken__Group_0__17685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_103_in_rule__AttributeToken__Group_0__1__Impl7713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeArgumentClause__Group__0__Impl_in_rule__AttributeArgumentClause__Group__07748 = new BitSet(new long[]{0x06000000000003F0L});
    public static final BitSet FOLLOW_rule__AttributeArgumentClause__Group__1_in_rule__AttributeArgumentClause__Group__07751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_107_in_rule__AttributeArgumentClause__Group__0__Impl7779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeArgumentClause__Group__1__Impl_in_rule__AttributeArgumentClause__Group__17810 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_rule__AttributeArgumentClause__Group__2_in_rule__AttributeArgumentClause__Group__17813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleToken_in_rule__AttributeArgumentClause__Group__1__Impl7840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeArgumentClause__Group__2__Impl_in_rule__AttributeArgumentClause__Group__27869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_108_in_rule__AttributeArgumentClause__Group__2__Impl7897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InitDeclarator__Group__0__Impl_in_rule__InitDeclarator__Group__07936 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_rule__InitDeclarator__Group__1_in_rule__InitDeclarator__Group__07939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclarator_in_rule__InitDeclarator__Group__0__Impl7966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InitDeclarator__Group__1__Impl_in_rule__InitDeclarator__Group__17995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInitializer_in_rule__InitDeclarator__Group__1__Impl8023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declarator__Group_0__0__Impl_in_rule__Declarator__Group_0__08058 = new BitSet(new long[]{0x0080120000000000L,0x000008A000000000L});
    public static final BitSet FOLLOW_rule__Declarator__Group_0__1_in_rule__Declarator__Group_0__08061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePtrOperator_in_rule__Declarator__Group_0__0__Impl8091 = new BitSet(new long[]{0x6000100000000002L,0x0000008000000008L});
    public static final BitSet FOLLOW_rulePtrOperator_in_rule__Declarator__Group_0__0__Impl8104 = new BitSet(new long[]{0x6000100000000002L,0x0000008000000008L});
    public static final BitSet FOLLOW_rule__Declarator__Group_0__1__Impl_in_rule__Declarator__Group_0__18137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoptrDeclarator_in_rule__Declarator__Group_0__1__Impl8164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declarator__Group_1__0__Impl_in_rule__Declarator__Group_1__08197 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_rule__Declarator__Group_1__1_in_rule__Declarator__Group_1__08200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoptrDeclarator_in_rule__Declarator__Group_1__0__Impl8227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declarator__Group_1__1__Impl_in_rule__Declarator__Group_1__18256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declarator__Group_1_1__0_in_rule__Declarator__Group_1__1__Impl8283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declarator__Group_1_1__0__Impl_in_rule__Declarator__Group_1_1__08318 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_rule__Declarator__Group_1_1__1_in_rule__Declarator__Group_1_1__08321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParametersAndQualifiers_in_rule__Declarator__Group_1_1__0__Impl8348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declarator__Group_1_1__1__Impl_in_rule__Declarator__Group_1_1__18377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTrailingReturnType_in_rule__Declarator__Group_1_1__1__Impl8404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PtrDeclarator__Group__0__Impl_in_rule__PtrDeclarator__Group__08437 = new BitSet(new long[]{0x0080120000000000L,0x000008A000000000L});
    public static final BitSet FOLLOW_rule__PtrDeclarator__Group__1_in_rule__PtrDeclarator__Group__08440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePtrOperator_in_rule__PtrDeclarator__Group__0__Impl8468 = new BitSet(new long[]{0x6000100000000002L,0x0000008000000008L});
    public static final BitSet FOLLOW_rule__PtrDeclarator__Group__1__Impl_in_rule__PtrDeclarator__Group__18499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoptrDeclarator_in_rule__PtrDeclarator__Group__1__Impl8526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NoptrDeclarator__Group__0__Impl_in_rule__NoptrDeclarator__Group__08559 = new BitSet(new long[]{0x0000000000000000L,0x0000090000000000L});
    public static final BitSet FOLLOW_rule__NoptrDeclarator__Group__1_in_rule__NoptrDeclarator__Group__08562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule_NoptrDeclarator_in_rule__NoptrDeclarator__Group__0__Impl8589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NoptrDeclarator__Group__1__Impl_in_rule__NoptrDeclarator__Group__18618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NoptrDeclarator_in_rule__NoptrDeclarator__Group__1__Impl8646 = new BitSet(new long[]{0x0000000000000002L,0x0000090000000000L});
    public static final BitSet FOLLOW_rule___NoptrDeclarator__Group_0__0__Impl_in_rule___NoptrDeclarator__Group_0__08681 = new BitSet(new long[]{0x0000000000000000L,0x0000050000000000L});
    public static final BitSet FOLLOW_rule___NoptrDeclarator__Group_0__1_in_rule___NoptrDeclarator__Group_0__08684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaratorId_in_rule___NoptrDeclarator__Group_0__0__Impl8711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule___NoptrDeclarator__Group_0__1__Impl_in_rule___NoptrDeclarator__Group_0__18740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeSpecifier_in_rule___NoptrDeclarator__Group_0__1__Impl8768 = new BitSet(new long[]{0x0000000000000002L,0x0000050000000000L});
    public static final BitSet FOLLOW_rule___NoptrDeclarator__Group_1__0__Impl_in_rule___NoptrDeclarator__Group_1__08803 = new BitSet(new long[]{0x6080120000000000L,0x000008A000000008L});
    public static final BitSet FOLLOW_rule___NoptrDeclarator__Group_1__1_in_rule___NoptrDeclarator__Group_1__08806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_107_in_rule___NoptrDeclarator__Group_1__0__Impl8834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule___NoptrDeclarator__Group_1__1__Impl_in_rule___NoptrDeclarator__Group_1__18865 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_rule___NoptrDeclarator__Group_1__2_in_rule___NoptrDeclarator__Group_1__18868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePtrDeclarator_in_rule___NoptrDeclarator__Group_1__1__Impl8895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule___NoptrDeclarator__Group_1__2__Impl_in_rule___NoptrDeclarator__Group_1__28924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_108_in_rule___NoptrDeclarator__Group_1__2__Impl8952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule____NoptrDeclarator__Group_1__0__Impl_in_rule____NoptrDeclarator__Group_1__08989 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule____NoptrDeclarator__Group_1__1_in_rule____NoptrDeclarator__Group_1__08992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_104_in_rule____NoptrDeclarator__Group_1__0__Impl9020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule____NoptrDeclarator__Group_1__1__Impl_in_rule____NoptrDeclarator__Group_1__19051 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_rule____NoptrDeclarator__Group_1__2_in_rule____NoptrDeclarator__Group_1__19054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantExpression_in_rule____NoptrDeclarator__Group_1__1__Impl9081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule____NoptrDeclarator__Group_1__2__Impl_in_rule____NoptrDeclarator__Group_1__29110 = new BitSet(new long[]{0x0000000000000000L,0x0000050000000000L});
    public static final BitSet FOLLOW_rule____NoptrDeclarator__Group_1__3_in_rule____NoptrDeclarator__Group_1__29113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_105_in_rule____NoptrDeclarator__Group_1__2__Impl9141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule____NoptrDeclarator__Group_1__3__Impl_in_rule____NoptrDeclarator__Group_1__39172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeSpecifier_in_rule____NoptrDeclarator__Group_1__3__Impl9200 = new BitSet(new long[]{0x0000000000000002L,0x0000050000000000L});
    public static final BitSet FOLLOW_rule__ParametersAndQualifiers__Group__0__Impl_in_rule__ParametersAndQualifiers__Group__09239 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_rule__ParametersAndQualifiers__Group__1_in_rule__ParametersAndQualifiers__Group__09242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_107_in_rule__ParametersAndQualifiers__Group__0__Impl9270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParametersAndQualifiers__Group__1__Impl_in_rule__ParametersAndQualifiers__Group__19301 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_rule__ParametersAndQualifiers__Group__2_in_rule__ParametersAndQualifiers__Group__19304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterDeclarationClause_in_rule__ParametersAndQualifiers__Group__1__Impl9331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParametersAndQualifiers__Group__2__Impl_in_rule__ParametersAndQualifiers__Group__29360 = new BitSet(new long[]{0x7800000000000000L,0x0018050000000000L});
    public static final BitSet FOLLOW_rule__ParametersAndQualifiers__Group__3_in_rule__ParametersAndQualifiers__Group__29363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_108_in_rule__ParametersAndQualifiers__Group__2__Impl9391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParametersAndQualifiers__Group__3__Impl_in_rule__ParametersAndQualifiers__Group__39422 = new BitSet(new long[]{0x7800000000000000L,0x0018050000000000L});
    public static final BitSet FOLLOW_rule__ParametersAndQualifiers__Group__4_in_rule__ParametersAndQualifiers__Group__39425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeSpecifier_in_rule__ParametersAndQualifiers__Group__3__Impl9453 = new BitSet(new long[]{0x0000000000000002L,0x0000050000000000L});
    public static final BitSet FOLLOW_rule__ParametersAndQualifiers__Group__4__Impl_in_rule__ParametersAndQualifiers__Group__49484 = new BitSet(new long[]{0x7800000000000000L,0x0018050000000000L});
    public static final BitSet FOLLOW_rule__ParametersAndQualifiers__Group__5_in_rule__ParametersAndQualifiers__Group__49487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParametersAndQualifiers__Alternatives_4_in_rule__ParametersAndQualifiers__Group__4__Impl9514 = new BitSet(new long[]{0x1800000000000002L});
    public static final BitSet FOLLOW_rule__ParametersAndQualifiers__Group__5__Impl_in_rule__ParametersAndQualifiers__Group__59545 = new BitSet(new long[]{0x7800000000000000L,0x0018050000000000L});
    public static final BitSet FOLLOW_rule__ParametersAndQualifiers__Group__6_in_rule__ParametersAndQualifiers__Group__59548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParametersAndQualifiers__Alternatives_5_in_rule__ParametersAndQualifiers__Group__5__Impl9575 = new BitSet(new long[]{0x6000000000000002L});
    public static final BitSet FOLLOW_rule__ParametersAndQualifiers__Group__6__Impl_in_rule__ParametersAndQualifiers__Group__69606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExceptionSpecification_in_rule__ParametersAndQualifiers__Group__6__Impl9634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TrailingReturnType__Group__0__Impl_in_rule__TrailingReturnType__Group__09679 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_rule__TrailingReturnType__Group__1_in_rule__TrailingReturnType__Group__09682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_98_in_rule__TrailingReturnType__Group__0__Impl9710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TrailingReturnType__Group__1__Impl_in_rule__TrailingReturnType__Group__19741 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_rule__TrailingReturnType__Group__2_in_rule__TrailingReturnType__Group__19744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTrailingTypeSpecifier_in_rule__TrailingReturnType__Group__1__Impl9774 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_ruleTrailingTypeSpecifier_in_rule__TrailingReturnType__Group__1__Impl9787 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_rule__TrailingReturnType__Group__2__Impl_in_rule__TrailingReturnType__Group__29820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractDeclarator_in_rule__TrailingReturnType__Group__2__Impl9848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PtrOperator__Group_0__0__Impl_in_rule__PtrOperator__Group_0__09885 = new BitSet(new long[]{0x1800000000000000L,0x0000050000000000L});
    public static final BitSet FOLLOW_rule__PtrOperator__Group_0__1_in_rule__PtrOperator__Group_0__09888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_rule__PtrOperator__Group_0__0__Impl9916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PtrOperator__Group_0__1__Impl_in_rule__PtrOperator__Group_0__19947 = new BitSet(new long[]{0x1800000000000000L,0x0000050000000000L});
    public static final BitSet FOLLOW_rule__PtrOperator__Group_0__2_in_rule__PtrOperator__Group_0__19950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeSpecifier_in_rule__PtrOperator__Group_0__1__Impl9978 = new BitSet(new long[]{0x0000000000000002L,0x0000050000000000L});
    public static final BitSet FOLLOW_rule__PtrOperator__Group_0__2__Impl_in_rule__PtrOperator__Group_0__210009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PtrOperator__Alternatives_0_2_in_rule__PtrOperator__Group_0__2__Impl10036 = new BitSet(new long[]{0x1800000000000002L});
    public static final BitSet FOLLOW_rule__PtrOperator__Group_1__0__Impl_in_rule__PtrOperator__Group_1__010073 = new BitSet(new long[]{0x0000000000000000L,0x0000050000000000L});
    public static final BitSet FOLLOW_rule__PtrOperator__Group_1__1_in_rule__PtrOperator__Group_1__010076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_rule__PtrOperator__Group_1__0__Impl10104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PtrOperator__Group_1__1__Impl_in_rule__PtrOperator__Group_1__110135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeSpecifier_in_rule__PtrOperator__Group_1__1__Impl10163 = new BitSet(new long[]{0x0000000000000002L,0x0000050000000000L});
    public static final BitSet FOLLOW_rule__PtrOperator__Group_2__0__Impl_in_rule__PtrOperator__Group_2__010198 = new BitSet(new long[]{0x0000000000000000L,0x0000050000000000L});
    public static final BitSet FOLLOW_rule__PtrOperator__Group_2__1_in_rule__PtrOperator__Group_2__010201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_rule__PtrOperator__Group_2__0__Impl10229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PtrOperator__Group_2__1__Impl_in_rule__PtrOperator__Group_2__110260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeSpecifier_in_rule__PtrOperator__Group_2__1__Impl10288 = new BitSet(new long[]{0x0000000000000002L,0x0000050000000000L});
    public static final BitSet FOLLOW_rule__PtrOperator__Group_3__0__Impl_in_rule__PtrOperator__Group_3__010323 = new BitSet(new long[]{0x6000100000000000L,0x0000008000000008L});
    public static final BitSet FOLLOW_rule__PtrOperator__Group_3__1_in_rule__PtrOperator__Group_3__010326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_103_in_rule__PtrOperator__Group_3__0__Impl10355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PtrOperator__Group_3__1__Impl_in_rule__PtrOperator__Group_3__110388 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_rule__PtrOperator__Group_3__2_in_rule__PtrOperator__Group_3__110391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNestedNameSpecifier_in_rule__PtrOperator__Group_3__1__Impl10418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PtrOperator__Group_3__2__Impl_in_rule__PtrOperator__Group_3__210447 = new BitSet(new long[]{0x1800000000000000L,0x0000050000000000L});
    public static final BitSet FOLLOW_rule__PtrOperator__Group_3__3_in_rule__PtrOperator__Group_3__210450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_rule__PtrOperator__Group_3__2__Impl10478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PtrOperator__Group_3__3__Impl_in_rule__PtrOperator__Group_3__310509 = new BitSet(new long[]{0x1800000000000000L,0x0000050000000000L});
    public static final BitSet FOLLOW_rule__PtrOperator__Group_3__4_in_rule__PtrOperator__Group_3__310512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeSpecifier_in_rule__PtrOperator__Group_3__3__Impl10540 = new BitSet(new long[]{0x0000000000000002L,0x0000050000000000L});
    public static final BitSet FOLLOW_rule__PtrOperator__Group_3__4__Impl_in_rule__PtrOperator__Group_3__410571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PtrOperator__Alternatives_3_4_in_rule__PtrOperator__Group_3__4__Impl10598 = new BitSet(new long[]{0x1800000000000002L});
    public static final BitSet FOLLOW_rule__DeclaratorId__Group_0__0__Impl_in_rule__DeclaratorId__Group_0__010639 = new BitSet(new long[]{0x0000020000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_rule__DeclaratorId__Group_0__1_in_rule__DeclaratorId__Group_0__010642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_101_in_rule__DeclaratorId__Group_0__0__Impl10671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeclaratorId__Group_0__1__Impl_in_rule__DeclaratorId__Group_0__110704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdExpression_in_rule__DeclaratorId__Group_0__1__Impl10731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeclaratorId__Group_1__0__Impl_in_rule__DeclaratorId__Group_1__010764 = new BitSet(new long[]{0x0080120000000000L,0x000000A000000000L});
    public static final BitSet FOLLOW_rule__DeclaratorId__Group_1__1_in_rule__DeclaratorId__Group_1__010767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_103_in_rule__DeclaratorId__Group_1__0__Impl10796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeclaratorId__Group_1__1__Impl_in_rule__DeclaratorId__Group_1__110829 = new BitSet(new long[]{0x0080120000000000L,0x000000A000000000L});
    public static final BitSet FOLLOW_rule__DeclaratorId__Group_1__2_in_rule__DeclaratorId__Group_1__110832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNestedNameSpecifier_in_rule__DeclaratorId__Group_1__1__Impl10860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeclaratorId__Group_1__2__Impl_in_rule__DeclaratorId__Group_1__210891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassName_in_rule__DeclaratorId__Group_1__2__Impl10918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OperatorFunctionId__Group__0__Impl_in_rule__OperatorFunctionId__Group__010953 = new BitSet(new long[]{0xE000000000000000L,0x0000001FFFFFFFFFL});
    public static final BitSet FOLLOW_rule__OperatorFunctionId__Group__1_in_rule__OperatorFunctionId__Group__010956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_109_in_rule__OperatorFunctionId__Group__0__Impl10984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OperatorFunctionId__Group__1__Impl_in_rule__OperatorFunctionId__Group__111015 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_rule__OperatorFunctionId__Group__2_in_rule__OperatorFunctionId__Group__111018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOverloadableOperator_in_rule__OperatorFunctionId__Group__1__Impl11045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OperatorFunctionId__Group__2__Impl_in_rule__OperatorFunctionId__Group__211074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OperatorFunctionId__Group_2__0_in_rule__OperatorFunctionId__Group__2__Impl11101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OperatorFunctionId__Group_2__0__Impl_in_rule__OperatorFunctionId__Group_2__011138 = new BitSet(new long[]{0x0000038000000000L,0x0000002000001000L});
    public static final BitSet FOLLOW_rule__OperatorFunctionId__Group_2__1_in_rule__OperatorFunctionId__Group_2__011141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_rule__OperatorFunctionId__Group_2__0__Impl11169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OperatorFunctionId__Group_2__1__Impl_in_rule__OperatorFunctionId__Group_2__111200 = new BitSet(new long[]{0x0000038000000000L,0x0000002000001000L});
    public static final BitSet FOLLOW_rule__OperatorFunctionId__Group_2__2_in_rule__OperatorFunctionId__Group_2__111203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplateArgument_in_rule__OperatorFunctionId__Group_2__1__Impl11231 = new BitSet(new long[]{0x0000038000000002L,0x0000002000000000L});
    public static final BitSet FOLLOW_rule__OperatorFunctionId__Group_2__2__Impl_in_rule__OperatorFunctionId__Group_2__211262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_rule__OperatorFunctionId__Group_2__2__Impl11290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OverloadableOperator__Group_2__0__Impl_in_rule__OverloadableOperator__Group_2__011327 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_rule__OverloadableOperator__Group_2__1_in_rule__OverloadableOperator__Group_2__011330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_rule__OverloadableOperator__Group_2__0__Impl11358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OverloadableOperator__Group_2__1__Impl_in_rule__OverloadableOperator__Group_2__111389 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_rule__OverloadableOperator__Group_2__2_in_rule__OverloadableOperator__Group_2__111392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_104_in_rule__OverloadableOperator__Group_2__1__Impl11420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OverloadableOperator__Group_2__2__Impl_in_rule__OverloadableOperator__Group_2__211451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_105_in_rule__OverloadableOperator__Group_2__2__Impl11479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OverloadableOperator__Group_3__0__Impl_in_rule__OverloadableOperator__Group_3__011516 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_rule__OverloadableOperator__Group_3__1_in_rule__OverloadableOperator__Group_3__011519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_rule__OverloadableOperator__Group_3__0__Impl11547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OverloadableOperator__Group_3__1__Impl_in_rule__OverloadableOperator__Group_3__111578 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_rule__OverloadableOperator__Group_3__2_in_rule__OverloadableOperator__Group_3__111581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_104_in_rule__OverloadableOperator__Group_3__1__Impl11609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OverloadableOperator__Group_3__2__Impl_in_rule__OverloadableOperator__Group_3__211640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_105_in_rule__OverloadableOperator__Group_3__2__Impl11668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LiteralOperatorId__Group__0__Impl_in_rule__LiteralOperatorId__Group__011705 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_rule__LiteralOperatorId__Group__1_in_rule__LiteralOperatorId__Group__011708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_109_in_rule__LiteralOperatorId__Group__0__Impl11736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LiteralOperatorId__Group__1__Impl_in_rule__LiteralOperatorId__Group__111767 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_rule__LiteralOperatorId__Group__2_in_rule__LiteralOperatorId__Group__111770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_110_in_rule__LiteralOperatorId__Group__1__Impl11798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LiteralOperatorId__Group__2__Impl_in_rule__LiteralOperatorId__Group__211829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_110_in_rule__LiteralOperatorId__Group__2__Impl11857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemplateParameterList__Group__0__Impl_in_rule__TemplateParameterList__Group__011895 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_rule__TemplateParameterList__Group__1_in_rule__TemplateParameterList__Group__011898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplateParameter_in_rule__TemplateParameterList__Group__0__Impl11925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemplateParameterList__Group__1__Impl_in_rule__TemplateParameterList__Group__111954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemplateParameterList__Group_1__0_in_rule__TemplateParameterList__Group__1__Impl11981 = new BitSet(new long[]{0x0000000000000002L,0x0000000100000000L});
    public static final BitSet FOLLOW_rule__TemplateParameterList__Group_1__0__Impl_in_rule__TemplateParameterList__Group_1__012016 = new BitSet(new long[]{0x0000040000000000L,0x0003800000000000L});
    public static final BitSet FOLLOW_rule__TemplateParameterList__Group_1__1_in_rule__TemplateParameterList__Group_1__012019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_rule__TemplateParameterList__Group_1__0__Impl12047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemplateParameterList__Group_1__1__Impl_in_rule__TemplateParameterList__Group_1__112078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplateParameter_in_rule__TemplateParameterList__Group_1__1__Impl12105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_0__0__Impl_in_rule__TypeParameter__Group_0__012138 = new BitSet(new long[]{0x0000000000000400L,0x0000002000000400L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_0__1_in_rule__TypeParameter__Group_0__012141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_111_in_rule__TypeParameter__Group_0__0__Impl12169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_0__1__Impl_in_rule__TypeParameter__Group_0__112200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeParameter__Alternatives_0_1_in_rule__TypeParameter__Group_0__1__Impl12227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_0_1_0__0__Impl_in_rule__TypeParameter__Group_0_1_0__012261 = new BitSet(new long[]{0x0000000000000400L,0x0000002000000000L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_0_1_0__1_in_rule__TypeParameter__Group_0_1_0__012264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_101_in_rule__TypeParameter__Group_0_1_0__0__Impl12293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_0_1_0__1__Impl_in_rule__TypeParameter__Group_0_1_0__112326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TypeParameter__Group_0_1_0__1__Impl12354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_0_1_1__0__Impl_in_rule__TypeParameter__Group_0_1_1__012389 = new BitSet(new long[]{0x0000000000000400L,0x0000002000000400L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_0_1_1__1_in_rule__TypeParameter__Group_0_1_1__012392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TypeParameter__Group_0_1_1__0__Impl12420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_0_1_1__1__Impl_in_rule__TypeParameter__Group_0_1_1__112451 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_0_1_1__2_in_rule__TypeParameter__Group_0_1_1__112454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_rule__TypeParameter__Group_0_1_1__1__Impl12482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_0_1_1__2__Impl_in_rule__TypeParameter__Group_0_1_1__212513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeId_in_rule__TypeParameter__Group_0_1_1__2__Impl12540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_1__0__Impl_in_rule__TypeParameter__Group_1__012575 = new BitSet(new long[]{0x0000000000000400L,0x0000002000000400L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_1__1_in_rule__TypeParameter__Group_1__012578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_112_in_rule__TypeParameter__Group_1__0__Impl12606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_1__1__Impl_in_rule__TypeParameter__Group_1__112637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeParameter__Alternatives_1_1_in_rule__TypeParameter__Group_1__1__Impl12664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_1_1_0__0__Impl_in_rule__TypeParameter__Group_1_1_0__012698 = new BitSet(new long[]{0x0000000000000400L,0x0000002000000000L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_1_1_0__1_in_rule__TypeParameter__Group_1_1_0__012701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_101_in_rule__TypeParameter__Group_1_1_0__0__Impl12730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_1_1_0__1__Impl_in_rule__TypeParameter__Group_1_1_0__112763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TypeParameter__Group_1_1_0__1__Impl12791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_1_1_1__0__Impl_in_rule__TypeParameter__Group_1_1_1__012826 = new BitSet(new long[]{0x0000000000000400L,0x0000002000000400L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_1_1_1__1_in_rule__TypeParameter__Group_1_1_1__012829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TypeParameter__Group_1_1_1__0__Impl12857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_1_1_1__1__Impl_in_rule__TypeParameter__Group_1_1_1__112888 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_1_1_1__2_in_rule__TypeParameter__Group_1_1_1__112891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_rule__TypeParameter__Group_1_1_1__1__Impl12919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_1_1_1__2__Impl_in_rule__TypeParameter__Group_1_1_1__212950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeId_in_rule__TypeParameter__Group_1_1_1__2__Impl12977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_2__0__Impl_in_rule__TypeParameter__Group_2__013012 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_2__1_in_rule__TypeParameter__Group_2__013015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_113_in_rule__TypeParameter__Group_2__0__Impl13043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_2__1__Impl_in_rule__TypeParameter__Group_2__113074 = new BitSet(new long[]{0x0000040000000000L,0x0003800000000000L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_2__2_in_rule__TypeParameter__Group_2__113077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_rule__TypeParameter__Group_2__1__Impl13105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_2__2__Impl_in_rule__TypeParameter__Group_2__213136 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_2__3_in_rule__TypeParameter__Group_2__213139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplateParameterList_in_rule__TypeParameter__Group_2__2__Impl13166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_2__3__Impl_in_rule__TypeParameter__Group_2__313195 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_2__4_in_rule__TypeParameter__Group_2__313198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_rule__TypeParameter__Group_2__3__Impl13226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_2__4__Impl_in_rule__TypeParameter__Group_2__413257 = new BitSet(new long[]{0x0000000000000400L,0x0000002000000400L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_2__5_in_rule__TypeParameter__Group_2__413260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_111_in_rule__TypeParameter__Group_2__4__Impl13288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_2__5__Impl_in_rule__TypeParameter__Group_2__513319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeParameter__Alternatives_2_5_in_rule__TypeParameter__Group_2__5__Impl13346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_2_5_0__0__Impl_in_rule__TypeParameter__Group_2_5_0__013388 = new BitSet(new long[]{0x0000000000000400L,0x0000002000000000L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_2_5_0__1_in_rule__TypeParameter__Group_2_5_0__013391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_101_in_rule__TypeParameter__Group_2_5_0__0__Impl13420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_2_5_0__1__Impl_in_rule__TypeParameter__Group_2_5_0__113453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TypeParameter__Group_2_5_0__1__Impl13481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_2_5_1__0__Impl_in_rule__TypeParameter__Group_2_5_1__013516 = new BitSet(new long[]{0x0000000000000400L,0x0000002000000400L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_2_5_1__1_in_rule__TypeParameter__Group_2_5_1__013519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TypeParameter__Group_2_5_1__0__Impl13547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_2_5_1__1__Impl_in_rule__TypeParameter__Group_2_5_1__113578 = new BitSet(new long[]{0x0000020000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_2_5_1__2_in_rule__TypeParameter__Group_2_5_1__113581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_rule__TypeParameter__Group_2_5_1__1__Impl13609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_2_5_1__2__Impl_in_rule__TypeParameter__Group_2_5_1__213640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdExpression_in_rule__TypeParameter__Group_2_5_1__2__Impl13667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleTemplateId__Group__0__Impl_in_rule__SimpleTemplateId__Group__013702 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_rule__SimpleTemplateId__Group__1_in_rule__SimpleTemplateId__Group__013705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SimpleTemplateId__Group__0__Impl13732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleTemplateId__Group__1__Impl_in_rule__SimpleTemplateId__Group__113761 = new BitSet(new long[]{0x0000038000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_rule__SimpleTemplateId__Group__2_in_rule__SimpleTemplateId__Group__113764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_rule__SimpleTemplateId__Group__1__Impl13792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleTemplateId__Group__2__Impl_in_rule__SimpleTemplateId__Group__213823 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_rule__SimpleTemplateId__Group__3_in_rule__SimpleTemplateId__Group__213826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplateArgumentList_in_rule__SimpleTemplateId__Group__2__Impl13853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleTemplateId__Group__3__Impl_in_rule__SimpleTemplateId__Group__313882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_rule__SimpleTemplateId__Group__3__Impl13910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemplateArgumentList__Group__0__Impl_in_rule__TemplateArgumentList__Group__013951 = new BitSet(new long[]{0x0000000000000000L,0x0000002100000000L});
    public static final BitSet FOLLOW_rule__TemplateArgumentList__Group__1_in_rule__TemplateArgumentList__Group__013954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplateArgument_in_rule__TemplateArgumentList__Group__0__Impl13981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemplateArgumentList__Group__1__Impl_in_rule__TemplateArgumentList__Group__114010 = new BitSet(new long[]{0x0000000000000000L,0x0000002100000000L});
    public static final BitSet FOLLOW_rule__TemplateArgumentList__Group__2_in_rule__TemplateArgumentList__Group__114013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_101_in_rule__TemplateArgumentList__Group__1__Impl14042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemplateArgumentList__Group__2__Impl_in_rule__TemplateArgumentList__Group__214075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemplateArgumentList__Group_2__0_in_rule__TemplateArgumentList__Group__2__Impl14102 = new BitSet(new long[]{0x0000000000000002L,0x0000000100000000L});
    public static final BitSet FOLLOW_rule__TemplateArgumentList__Group_2__0__Impl_in_rule__TemplateArgumentList__Group_2__014139 = new BitSet(new long[]{0x0000038000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_rule__TemplateArgumentList__Group_2__1_in_rule__TemplateArgumentList__Group_2__014142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_rule__TemplateArgumentList__Group_2__0__Impl14170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemplateArgumentList__Group_2__1__Impl_in_rule__TemplateArgumentList__Group_2__114201 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_rule__TemplateArgumentList__Group_2__2_in_rule__TemplateArgumentList__Group_2__114204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplateArgument_in_rule__TemplateArgumentList__Group_2__1__Impl14231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemplateArgumentList__Group_2__2__Impl_in_rule__TemplateArgumentList__Group_2__214260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_101_in_rule__TemplateArgumentList__Group_2__2__Impl14289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Handler__Group__0__Impl_in_rule__Handler__Group__014334 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_rule__Handler__Group__1_in_rule__Handler__Group__014337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_114_in_rule__Handler__Group__0__Impl14365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Handler__Group__1__Impl_in_rule__Handler__Group__114396 = new BitSet(new long[]{0x0000800000000000L,0x0000052000000000L});
    public static final BitSet FOLLOW_rule__Handler__Group__2_in_rule__Handler__Group__114399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_107_in_rule__Handler__Group__1__Impl14427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Handler__Group__2__Impl_in_rule__Handler__Group__214458 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_rule__Handler__Group__3_in_rule__Handler__Group__214461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExceptionDeclaration_in_rule__Handler__Group__2__Impl14488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Handler__Group__3__Impl_in_rule__Handler__Group__314517 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_rule__Handler__Group__4_in_rule__Handler__Group__314520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_108_in_rule__Handler__Group__3__Impl14548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Handler__Group__4__Impl_in_rule__Handler__Group__414579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompoundStatement_in_rule__Handler__Group__4__Impl14606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExceptionDeclaration__Group_0__0__Impl_in_rule__ExceptionDeclaration__Group_0__014645 = new BitSet(new long[]{0x0000800000000000L,0x0000050000000000L});
    public static final BitSet FOLLOW_rule__ExceptionDeclaration__Group_0__1_in_rule__ExceptionDeclaration__Group_0__014648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeSpecifier_in_rule__ExceptionDeclaration__Group_0__0__Impl14676 = new BitSet(new long[]{0x0000000000000002L,0x0000050000000000L});
    public static final BitSet FOLLOW_rule__ExceptionDeclaration__Group_0__1__Impl_in_rule__ExceptionDeclaration__Group_0__114707 = new BitSet(new long[]{0x6081120000000000L,0x000008A000000008L});
    public static final BitSet FOLLOW_rule__ExceptionDeclaration__Group_0__2_in_rule__ExceptionDeclaration__Group_0__114710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeSpecifier_in_rule__ExceptionDeclaration__Group_0__1__Impl14740 = new BitSet(new long[]{0x0000800000000002L,0x0000050000000000L});
    public static final BitSet FOLLOW_ruleTypeSpecifier_in_rule__ExceptionDeclaration__Group_0__1__Impl14753 = new BitSet(new long[]{0x0000800000000002L,0x0000050000000000L});
    public static final BitSet FOLLOW_rule__ExceptionDeclaration__Group_0__2__Impl_in_rule__ExceptionDeclaration__Group_0__214786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExceptionDeclaration__Alternatives_0_2_in_rule__ExceptionDeclaration__Group_0__2__Impl14813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DynamicExceptionSpecification__Group__0__Impl_in_rule__DynamicExceptionSpecification__Group__014850 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_rule__DynamicExceptionSpecification__Group__1_in_rule__DynamicExceptionSpecification__Group__014853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_115_in_rule__DynamicExceptionSpecification__Group__0__Impl14881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DynamicExceptionSpecification__Group__1__Impl_in_rule__DynamicExceptionSpecification__Group__114912 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_rule__DynamicExceptionSpecification__Group__2_in_rule__DynamicExceptionSpecification__Group__114915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_107_in_rule__DynamicExceptionSpecification__Group__1__Impl14943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DynamicExceptionSpecification__Group__2__Impl_in_rule__DynamicExceptionSpecification__Group__214974 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_rule__DynamicExceptionSpecification__Group__3_in_rule__DynamicExceptionSpecification__Group__214977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeIdList_in_rule__DynamicExceptionSpecification__Group__2__Impl15004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DynamicExceptionSpecification__Group__3__Impl_in_rule__DynamicExceptionSpecification__Group__315033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_108_in_rule__DynamicExceptionSpecification__Group__3__Impl15061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NoexceptSpecification__Group__0__Impl_in_rule__NoexceptSpecification__Group__015100 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_rule__NoexceptSpecification__Group__1_in_rule__NoexceptSpecification__Group__015103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_116_in_rule__NoexceptSpecification__Group__0__Impl15131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NoexceptSpecification__Group__1__Impl_in_rule__NoexceptSpecification__Group__115162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NoexceptSpecification__Group_1__0_in_rule__NoexceptSpecification__Group__1__Impl15189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NoexceptSpecification__Group_1__0__Impl_in_rule__NoexceptSpecification__Group_1__015224 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__NoexceptSpecification__Group_1__1_in_rule__NoexceptSpecification__Group_1__015227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_107_in_rule__NoexceptSpecification__Group_1__0__Impl15255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NoexceptSpecification__Group_1__1__Impl_in_rule__NoexceptSpecification__Group_1__115286 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_rule__NoexceptSpecification__Group_1__2_in_rule__NoexceptSpecification__Group_1__115289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantExpression_in_rule__NoexceptSpecification__Group_1__1__Impl15316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NoexceptSpecification__Group_1__2__Impl_in_rule__NoexceptSpecification__Group_1__215345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_108_in_rule__NoexceptSpecification__Group_1__2__Impl15373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleToken_in_rule__Test__ElementsAssignment15415 = new BitSet(new long[]{0x0000000000000002L});

}