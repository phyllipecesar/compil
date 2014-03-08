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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_KEYWORD", "RULE_INT", "RULE_CHARACTER_LITERAL", "RULE_FLOATING_LITERAL", "RULE_STRING_LITERAL", "RULE_PREPROCESSING_OP_OR_PUNC", "RULE_ID", "RULE_HEXADECIMAL_DIGIT", "RULE_HEX_QUAD", "RULE_UNIVERSAL_CHARACTER_NAME", "RULE_H_CHAR", "RULE_Q_CHAR", "RULE_HEADER_NAME", "RULE_NONDIGIT", "RULE_DIGIT", "RULE_DECIMAL_LITERAL", "RULE_OCTAL_LITERAL", "RULE_HEXADECIMAL_LITERAL", "RULE_INTEGER_SUFFIX", "RULE_OCTAL_DIGIT", "RULE_C_CHAR", "RULE_ESCAPE_SEQUENCE", "RULE_SIMPLE_ESCAPE_SEQUENCE", "RULE_OCTAL_ESCAPE_SEQUENCE", "RULE_HEXADECIMAL_ESCAPE_SEQUENCE", "RULE_FRACTIONAL_CONSTANT", "RULE_EXPONENT_PART", "RULE_ENC_PREFIX", "RULE_SCHAR", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'ConstantExpression'", "'TypeId'", "'IdExpression'", "'ParameterDeclaration'", "'Declaration'", "'NestedNameSpecifier'", "'AssignmentExpression'", "'AlignmentExpression'", "'TypeSpecifier'", "'AbstractDeclarator'", "'CompoundStatement'", "'CtorInitializer'", "'TypeIdList'", "'UnqualifiedId'", "'ParameterDeclarationClause'", "'TrailingTypeSpecifier'", "'ClassName'", "'Initializer'", "'true'", "'false'", "'const'", "'volatile'", "'&'", "'&&'", "'new'", "'delete'", "'+'", "'-'", "'*'", "'/'", "'%'", "'^'", "'|'", "'~'", "'!'", "'='", "'<'", "'>'", "'+='", "'-='", "'*='", "'/='", "'%='", "'^='", "'&='", "'|='", "'<<'", "'>>'", "'>>='", "'<<='", "'=='", "'!='", "'<='", "'>='", "'||'", "'++'", "'--'", "','", "'->*'", "'->'", "'()'", "'[]'", "'...'", "'nullptr'", "'::'", "'['", "']'", "'alignas'", "'('", "')'", "'operator'", "'\"'", "'class'", "'typename'", "'template'", "'catch'", "'throw'", "'noexcept'"
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

                if ( ((LA1_0>=RULE_KEYWORD && LA1_0<=RULE_PREPROCESSING_OP_OR_PUNC)||(LA1_0>=56 && LA1_0<=57)) ) {
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

                if ( (LA2_0==42) ) {
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
            match(input,38,FOLLOW_38_in_ruleConstantExpression2230); 
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
            match(input,39,FOLLOW_39_in_ruleTypeId2292); 
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
            match(input,40,FOLLOW_40_in_ruleIdExpression2354); 
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
            match(input,41,FOLLOW_41_in_ruleParameterDeclaration2416); 
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
            match(input,42,FOLLOW_42_in_ruleDeclaration2478); 
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
            match(input,43,FOLLOW_43_in_ruleNestedNameSpecifier2540); 
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
            match(input,44,FOLLOW_44_in_ruleAssignmentExpression2602); 
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
            match(input,45,FOLLOW_45_in_ruleAlignmentExpression2664); 
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
            match(input,46,FOLLOW_46_in_ruleTypeSpecifier2726); 
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
            match(input,47,FOLLOW_47_in_ruleAbstractDeclarator2788); 
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
            match(input,48,FOLLOW_48_in_ruleCompoundStatement2850); 
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
            match(input,49,FOLLOW_49_in_ruleCtorInitializer2912); 
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
            match(input,50,FOLLOW_50_in_ruleTypeIdList2974); 
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
            match(input,51,FOLLOW_51_in_ruleUnqualifiedId3036); 
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
            match(input,52,FOLLOW_52_in_ruleParameterDeclarationClause3098); 
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
            match(input,53,FOLLOW_53_in_ruleTrailingTypeSpecifier3160); 
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
            match(input,54,FOLLOW_54_in_ruleClassName3222); 
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
            match(input,55,FOLLOW_55_in_ruleInitializer3284); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1617:1: rule__Token__Alternatives : ( ( RULE_KEYWORD ) | ( ruleLiteral ) | ( ( rule__Token__Group_2__0 ) ) );
    public final void rule__Token__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1621:1: ( ( RULE_KEYWORD ) | ( ruleLiteral ) | ( ( rule__Token__Group_2__0 ) ) )
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
            case 56:
            case 57:
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
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1622:1: ( RULE_KEYWORD )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1622:1: ( RULE_KEYWORD )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1623:1: RULE_KEYWORD
                    {
                     before(grammarAccess.getTokenAccess().getKEYWORDTerminalRuleCall_0()); 
                    match(input,RULE_KEYWORD,FOLLOW_RULE_KEYWORD_in_rule__Token__Alternatives3326); 
                     after(grammarAccess.getTokenAccess().getKEYWORDTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1628:6: ( ruleLiteral )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1628:6: ( ruleLiteral )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1629:1: ruleLiteral
                    {
                     before(grammarAccess.getTokenAccess().getLiteralParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleLiteral_in_rule__Token__Alternatives3343);
                    ruleLiteral();

                    state._fsp--;

                     after(grammarAccess.getTokenAccess().getLiteralParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1634:6: ( ( rule__Token__Group_2__0 ) )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1634:6: ( ( rule__Token__Group_2__0 ) )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1635:1: ( rule__Token__Group_2__0 )
                    {
                     before(grammarAccess.getTokenAccess().getGroup_2()); 
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1636:1: ( rule__Token__Group_2__0 )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1636:2: rule__Token__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Token__Group_2__0_in_rule__Token__Alternatives3360);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1645:1: rule__Literal__Alternatives : ( ( RULE_INT ) | ( RULE_CHARACTER_LITERAL ) | ( RULE_FLOATING_LITERAL ) | ( RULE_STRING_LITERAL ) | ( ( rule__Literal__Group_4__0 ) ) );
    public final void rule__Literal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1649:1: ( ( RULE_INT ) | ( RULE_CHARACTER_LITERAL ) | ( RULE_FLOATING_LITERAL ) | ( RULE_STRING_LITERAL ) | ( ( rule__Literal__Group_4__0 ) ) )
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
            case 56:
            case 57:
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
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1650:1: ( RULE_INT )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1650:1: ( RULE_INT )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1651:1: RULE_INT
                    {
                     before(grammarAccess.getLiteralAccess().getINTTerminalRuleCall_0()); 
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Literal__Alternatives3393); 
                     after(grammarAccess.getLiteralAccess().getINTTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1656:6: ( RULE_CHARACTER_LITERAL )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1656:6: ( RULE_CHARACTER_LITERAL )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1657:1: RULE_CHARACTER_LITERAL
                    {
                     before(grammarAccess.getLiteralAccess().getCHARACTER_LITERALTerminalRuleCall_1()); 
                    match(input,RULE_CHARACTER_LITERAL,FOLLOW_RULE_CHARACTER_LITERAL_in_rule__Literal__Alternatives3410); 
                     after(grammarAccess.getLiteralAccess().getCHARACTER_LITERALTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1662:6: ( RULE_FLOATING_LITERAL )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1662:6: ( RULE_FLOATING_LITERAL )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1663:1: RULE_FLOATING_LITERAL
                    {
                     before(grammarAccess.getLiteralAccess().getFLOATING_LITERALTerminalRuleCall_2()); 
                    match(input,RULE_FLOATING_LITERAL,FOLLOW_RULE_FLOATING_LITERAL_in_rule__Literal__Alternatives3427); 
                     after(grammarAccess.getLiteralAccess().getFLOATING_LITERALTerminalRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1668:6: ( RULE_STRING_LITERAL )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1668:6: ( RULE_STRING_LITERAL )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1669:1: RULE_STRING_LITERAL
                    {
                     before(grammarAccess.getLiteralAccess().getSTRING_LITERALTerminalRuleCall_3()); 
                    match(input,RULE_STRING_LITERAL,FOLLOW_RULE_STRING_LITERAL_in_rule__Literal__Alternatives3444); 
                     after(grammarAccess.getLiteralAccess().getSTRING_LITERALTerminalRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1674:6: ( ( rule__Literal__Group_4__0 ) )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1674:6: ( ( rule__Literal__Group_4__0 ) )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1675:1: ( rule__Literal__Group_4__0 )
                    {
                     before(grammarAccess.getLiteralAccess().getGroup_4()); 
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1676:1: ( rule__Literal__Group_4__0 )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1676:2: rule__Literal__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Literal__Group_4__0_in_rule__Literal__Alternatives3461);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1685:1: rule__Literal__Alternatives_4_0 : ( ( 'true' ) | ( 'false' ) );
    public final void rule__Literal__Alternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1689:1: ( ( 'true' ) | ( 'false' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==56) ) {
                alt5=1;
            }
            else if ( (LA5_0==57) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1690:1: ( 'true' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1690:1: ( 'true' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1691:1: 'true'
                    {
                     before(grammarAccess.getLiteralAccess().getTrueKeyword_4_0_0()); 
                    match(input,56,FOLLOW_56_in_rule__Literal__Alternatives_4_03495); 
                     after(grammarAccess.getLiteralAccess().getTrueKeyword_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1698:6: ( 'false' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1698:6: ( 'false' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1699:1: 'false'
                    {
                     before(grammarAccess.getLiteralAccess().getFalseKeyword_4_0_1()); 
                    match(input,57,FOLLOW_57_in_rule__Literal__Alternatives_4_03515); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1713:1: rule__AttributeSpecifier__Alternatives : ( ( ( rule__AttributeSpecifier__Group_0__0 ) ) | ( ruleAlignmentSpecifier ) );
    public final void rule__AttributeSpecifier__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1717:1: ( ( ( rule__AttributeSpecifier__Group_0__0 ) ) | ( ruleAlignmentSpecifier ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==103) ) {
                alt6=1;
            }
            else if ( (LA6_0==105) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1718:1: ( ( rule__AttributeSpecifier__Group_0__0 ) )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1718:1: ( ( rule__AttributeSpecifier__Group_0__0 ) )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1719:1: ( rule__AttributeSpecifier__Group_0__0 )
                    {
                     before(grammarAccess.getAttributeSpecifierAccess().getGroup_0()); 
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1720:1: ( rule__AttributeSpecifier__Group_0__0 )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1720:2: rule__AttributeSpecifier__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__AttributeSpecifier__Group_0__0_in_rule__AttributeSpecifier__Alternatives3551);
                    rule__AttributeSpecifier__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAttributeSpecifierAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1724:6: ( ruleAlignmentSpecifier )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1724:6: ( ruleAlignmentSpecifier )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1725:1: ruleAlignmentSpecifier
                    {
                     before(grammarAccess.getAttributeSpecifierAccess().getAlignmentSpecifierParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleAlignmentSpecifier_in_rule__AttributeSpecifier__Alternatives3569);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1735:1: rule__AlignmentSpecifier__Alternatives : ( ( ( rule__AlignmentSpecifier__Group_0__0 ) ) | ( ( rule__AlignmentSpecifier__Group_1__0 ) ) );
    public final void rule__AlignmentSpecifier__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1739:1: ( ( ( rule__AlignmentSpecifier__Group_0__0 ) ) | ( ( rule__AlignmentSpecifier__Group_1__0 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==105) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==106) ) {
                    int LA7_2 = input.LA(3);

                    if ( (LA7_2==45) ) {
                        alt7=2;
                    }
                    else if ( (LA7_2==39) ) {
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
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1740:1: ( ( rule__AlignmentSpecifier__Group_0__0 ) )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1740:1: ( ( rule__AlignmentSpecifier__Group_0__0 ) )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1741:1: ( rule__AlignmentSpecifier__Group_0__0 )
                    {
                     before(grammarAccess.getAlignmentSpecifierAccess().getGroup_0()); 
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1742:1: ( rule__AlignmentSpecifier__Group_0__0 )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1742:2: rule__AlignmentSpecifier__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__AlignmentSpecifier__Group_0__0_in_rule__AlignmentSpecifier__Alternatives3601);
                    rule__AlignmentSpecifier__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAlignmentSpecifierAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1746:6: ( ( rule__AlignmentSpecifier__Group_1__0 ) )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1746:6: ( ( rule__AlignmentSpecifier__Group_1__0 ) )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1747:1: ( rule__AlignmentSpecifier__Group_1__0 )
                    {
                     before(grammarAccess.getAlignmentSpecifierAccess().getGroup_1()); 
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1748:1: ( rule__AlignmentSpecifier__Group_1__0 )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1748:2: rule__AlignmentSpecifier__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__AlignmentSpecifier__Group_1__0_in_rule__AlignmentSpecifier__Alternatives3619);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1757:1: rule__Declarator__Alternatives : ( ( ( rule__Declarator__Group_0__0 ) ) | ( ( rule__Declarator__Group_1__0 ) ) );
    public final void rule__Declarator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1761:1: ( ( ( rule__Declarator__Group_0__0 ) ) | ( ( rule__Declarator__Group_1__0 ) ) )
            int alt8=2;
            switch ( input.LA(1) ) {
            case 60:
            case 61:
            case 66:
                {
                alt8=1;
                }
                break;
            case 102:
                {
                int LA8_2 = input.LA(2);

                if ( (LA8_2==43) ) {
                    int LA8_3 = input.LA(3);

                    if ( (LA8_3==66) ) {
                        alt8=1;
                    }
                    else if ( (LA8_3==54) ) {
                        alt8=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 3, input);

                        throw nvae;
                    }
                }
                else if ( (LA8_2==54) ) {
                    alt8=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 2, input);

                    throw nvae;
                }
                }
                break;
            case 43:
                {
                int LA8_3 = input.LA(2);

                if ( (LA8_3==66) ) {
                    alt8=1;
                }
                else if ( (LA8_3==54) ) {
                    alt8=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 3, input);

                    throw nvae;
                }
                }
                break;
            case 40:
            case 54:
            case 100:
            case 106:
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
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1762:1: ( ( rule__Declarator__Group_0__0 ) )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1762:1: ( ( rule__Declarator__Group_0__0 ) )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1763:1: ( rule__Declarator__Group_0__0 )
                    {
                     before(grammarAccess.getDeclaratorAccess().getGroup_0()); 
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1764:1: ( rule__Declarator__Group_0__0 )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1764:2: rule__Declarator__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Declarator__Group_0__0_in_rule__Declarator__Alternatives3652);
                    rule__Declarator__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDeclaratorAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1768:6: ( ( rule__Declarator__Group_1__0 ) )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1768:6: ( ( rule__Declarator__Group_1__0 ) )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1769:1: ( rule__Declarator__Group_1__0 )
                    {
                     before(grammarAccess.getDeclaratorAccess().getGroup_1()); 
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1770:1: ( rule__Declarator__Group_1__0 )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1770:2: rule__Declarator__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Declarator__Group_1__0_in_rule__Declarator__Alternatives3670);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1779:1: rule___NoptrDeclarator__Alternatives : ( ( ( rule___NoptrDeclarator__Group_0__0 ) ) | ( ( rule___NoptrDeclarator__Group_1__0 ) ) );
    public final void rule___NoptrDeclarator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1783:1: ( ( ( rule___NoptrDeclarator__Group_0__0 ) ) | ( ( rule___NoptrDeclarator__Group_1__0 ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==40||LA9_0==43||LA9_0==54||LA9_0==100||LA9_0==102) ) {
                alt9=1;
            }
            else if ( (LA9_0==106) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1784:1: ( ( rule___NoptrDeclarator__Group_0__0 ) )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1784:1: ( ( rule___NoptrDeclarator__Group_0__0 ) )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1785:1: ( rule___NoptrDeclarator__Group_0__0 )
                    {
                     before(grammarAccess.get_NoptrDeclaratorAccess().getGroup_0()); 
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1786:1: ( rule___NoptrDeclarator__Group_0__0 )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1786:2: rule___NoptrDeclarator__Group_0__0
                    {
                    pushFollow(FOLLOW_rule___NoptrDeclarator__Group_0__0_in_rule___NoptrDeclarator__Alternatives3703);
                    rule___NoptrDeclarator__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.get_NoptrDeclaratorAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1790:6: ( ( rule___NoptrDeclarator__Group_1__0 ) )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1790:6: ( ( rule___NoptrDeclarator__Group_1__0 ) )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1791:1: ( rule___NoptrDeclarator__Group_1__0 )
                    {
                     before(grammarAccess.get_NoptrDeclaratorAccess().getGroup_1()); 
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1792:1: ( rule___NoptrDeclarator__Group_1__0 )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1792:2: rule___NoptrDeclarator__Group_1__0
                    {
                    pushFollow(FOLLOW_rule___NoptrDeclarator__Group_1__0_in_rule___NoptrDeclarator__Alternatives3721);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1801:1: rule____NoptrDeclarator__Alternatives : ( ( ruleParametersAndQualifiers ) | ( ( rule____NoptrDeclarator__Group_1__0 ) ) );
    public final void rule____NoptrDeclarator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1805:1: ( ( ruleParametersAndQualifiers ) | ( ( rule____NoptrDeclarator__Group_1__0 ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==106) ) {
                alt10=1;
            }
            else if ( (LA10_0==103) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1806:1: ( ruleParametersAndQualifiers )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1806:1: ( ruleParametersAndQualifiers )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1807:1: ruleParametersAndQualifiers
                    {
                     before(grammarAccess.get__NoptrDeclaratorAccess().getParametersAndQualifiersParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleParametersAndQualifiers_in_rule____NoptrDeclarator__Alternatives3754);
                    ruleParametersAndQualifiers();

                    state._fsp--;

                     after(grammarAccess.get__NoptrDeclaratorAccess().getParametersAndQualifiersParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1812:6: ( ( rule____NoptrDeclarator__Group_1__0 ) )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1812:6: ( ( rule____NoptrDeclarator__Group_1__0 ) )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1813:1: ( rule____NoptrDeclarator__Group_1__0 )
                    {
                     before(grammarAccess.get__NoptrDeclaratorAccess().getGroup_1()); 
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1814:1: ( rule____NoptrDeclarator__Group_1__0 )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1814:2: rule____NoptrDeclarator__Group_1__0
                    {
                    pushFollow(FOLLOW_rule____NoptrDeclarator__Group_1__0_in_rule____NoptrDeclarator__Alternatives3771);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1823:1: rule__ParametersAndQualifiers__Alternatives_4 : ( ( 'const' ) | ( 'volatile' ) );
    public final void rule__ParametersAndQualifiers__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1827:1: ( ( 'const' ) | ( 'volatile' ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==58) ) {
                alt11=1;
            }
            else if ( (LA11_0==59) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1828:1: ( 'const' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1828:1: ( 'const' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1829:1: 'const'
                    {
                     before(grammarAccess.getParametersAndQualifiersAccess().getConstKeyword_4_0()); 
                    match(input,58,FOLLOW_58_in_rule__ParametersAndQualifiers__Alternatives_43805); 
                     after(grammarAccess.getParametersAndQualifiersAccess().getConstKeyword_4_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1836:6: ( 'volatile' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1836:6: ( 'volatile' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1837:1: 'volatile'
                    {
                     before(grammarAccess.getParametersAndQualifiersAccess().getVolatileKeyword_4_1()); 
                    match(input,59,FOLLOW_59_in_rule__ParametersAndQualifiers__Alternatives_43825); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1849:1: rule__ParametersAndQualifiers__Alternatives_5 : ( ( '&' ) | ( '&&' ) );
    public final void rule__ParametersAndQualifiers__Alternatives_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1853:1: ( ( '&' ) | ( '&&' ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==60) ) {
                alt12=1;
            }
            else if ( (LA12_0==61) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1854:1: ( '&' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1854:1: ( '&' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1855:1: '&'
                    {
                     before(grammarAccess.getParametersAndQualifiersAccess().getAmpersandKeyword_5_0()); 
                    match(input,60,FOLLOW_60_in_rule__ParametersAndQualifiers__Alternatives_53860); 
                     after(grammarAccess.getParametersAndQualifiersAccess().getAmpersandKeyword_5_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1862:6: ( '&&' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1862:6: ( '&&' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1863:1: '&&'
                    {
                     before(grammarAccess.getParametersAndQualifiersAccess().getAmpersandAmpersandKeyword_5_1()); 
                    match(input,61,FOLLOW_61_in_rule__ParametersAndQualifiers__Alternatives_53880); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1875:1: rule__PtrOperator__Alternatives : ( ( ( rule__PtrOperator__Group_0__0 ) ) | ( ( rule__PtrOperator__Group_1__0 ) ) | ( ( rule__PtrOperator__Group_2__0 ) ) | ( ( rule__PtrOperator__Group_3__0 ) ) );
    public final void rule__PtrOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1879:1: ( ( ( rule__PtrOperator__Group_0__0 ) ) | ( ( rule__PtrOperator__Group_1__0 ) ) | ( ( rule__PtrOperator__Group_2__0 ) ) | ( ( rule__PtrOperator__Group_3__0 ) ) )
            int alt13=4;
            switch ( input.LA(1) ) {
            case 66:
                {
                alt13=1;
                }
                break;
            case 60:
                {
                alt13=2;
                }
                break;
            case 61:
                {
                alt13=3;
                }
                break;
            case 43:
            case 102:
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
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1880:1: ( ( rule__PtrOperator__Group_0__0 ) )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1880:1: ( ( rule__PtrOperator__Group_0__0 ) )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1881:1: ( rule__PtrOperator__Group_0__0 )
                    {
                     before(grammarAccess.getPtrOperatorAccess().getGroup_0()); 
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1882:1: ( rule__PtrOperator__Group_0__0 )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1882:2: rule__PtrOperator__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__PtrOperator__Group_0__0_in_rule__PtrOperator__Alternatives3914);
                    rule__PtrOperator__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPtrOperatorAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1886:6: ( ( rule__PtrOperator__Group_1__0 ) )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1886:6: ( ( rule__PtrOperator__Group_1__0 ) )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1887:1: ( rule__PtrOperator__Group_1__0 )
                    {
                     before(grammarAccess.getPtrOperatorAccess().getGroup_1()); 
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1888:1: ( rule__PtrOperator__Group_1__0 )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1888:2: rule__PtrOperator__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__PtrOperator__Group_1__0_in_rule__PtrOperator__Alternatives3932);
                    rule__PtrOperator__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPtrOperatorAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1892:6: ( ( rule__PtrOperator__Group_2__0 ) )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1892:6: ( ( rule__PtrOperator__Group_2__0 ) )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1893:1: ( rule__PtrOperator__Group_2__0 )
                    {
                     before(grammarAccess.getPtrOperatorAccess().getGroup_2()); 
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1894:1: ( rule__PtrOperator__Group_2__0 )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1894:2: rule__PtrOperator__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__PtrOperator__Group_2__0_in_rule__PtrOperator__Alternatives3950);
                    rule__PtrOperator__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPtrOperatorAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1898:6: ( ( rule__PtrOperator__Group_3__0 ) )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1898:6: ( ( rule__PtrOperator__Group_3__0 ) )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1899:1: ( rule__PtrOperator__Group_3__0 )
                    {
                     before(grammarAccess.getPtrOperatorAccess().getGroup_3()); 
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1900:1: ( rule__PtrOperator__Group_3__0 )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1900:2: rule__PtrOperator__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__PtrOperator__Group_3__0_in_rule__PtrOperator__Alternatives3968);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1909:1: rule__PtrOperator__Alternatives_0_2 : ( ( 'const' ) | ( 'volatile' ) );
    public final void rule__PtrOperator__Alternatives_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1913:1: ( ( 'const' ) | ( 'volatile' ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==58) ) {
                alt14=1;
            }
            else if ( (LA14_0==59) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1914:1: ( 'const' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1914:1: ( 'const' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1915:1: 'const'
                    {
                     before(grammarAccess.getPtrOperatorAccess().getConstKeyword_0_2_0()); 
                    match(input,58,FOLLOW_58_in_rule__PtrOperator__Alternatives_0_24002); 
                     after(grammarAccess.getPtrOperatorAccess().getConstKeyword_0_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1922:6: ( 'volatile' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1922:6: ( 'volatile' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1923:1: 'volatile'
                    {
                     before(grammarAccess.getPtrOperatorAccess().getVolatileKeyword_0_2_1()); 
                    match(input,59,FOLLOW_59_in_rule__PtrOperator__Alternatives_0_24022); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1935:1: rule__PtrOperator__Alternatives_3_4 : ( ( 'const' ) | ( 'volatile' ) );
    public final void rule__PtrOperator__Alternatives_3_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1939:1: ( ( 'const' ) | ( 'volatile' ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==58) ) {
                alt15=1;
            }
            else if ( (LA15_0==59) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1940:1: ( 'const' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1940:1: ( 'const' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1941:1: 'const'
                    {
                     before(grammarAccess.getPtrOperatorAccess().getConstKeyword_3_4_0()); 
                    match(input,58,FOLLOW_58_in_rule__PtrOperator__Alternatives_3_44057); 
                     after(grammarAccess.getPtrOperatorAccess().getConstKeyword_3_4_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1948:6: ( 'volatile' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1948:6: ( 'volatile' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1949:1: 'volatile'
                    {
                     before(grammarAccess.getPtrOperatorAccess().getVolatileKeyword_3_4_1()); 
                    match(input,59,FOLLOW_59_in_rule__PtrOperator__Alternatives_3_44077); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1961:1: rule__DeclaratorId__Alternatives : ( ( ( rule__DeclaratorId__Group_0__0 ) ) | ( ( rule__DeclaratorId__Group_1__0 ) ) );
    public final void rule__DeclaratorId__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1965:1: ( ( ( rule__DeclaratorId__Group_0__0 ) ) | ( ( rule__DeclaratorId__Group_1__0 ) ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==40||LA16_0==100) ) {
                alt16=1;
            }
            else if ( (LA16_0==43||LA16_0==54||LA16_0==102) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1966:1: ( ( rule__DeclaratorId__Group_0__0 ) )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1966:1: ( ( rule__DeclaratorId__Group_0__0 ) )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1967:1: ( rule__DeclaratorId__Group_0__0 )
                    {
                     before(grammarAccess.getDeclaratorIdAccess().getGroup_0()); 
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1968:1: ( rule__DeclaratorId__Group_0__0 )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1968:2: rule__DeclaratorId__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__DeclaratorId__Group_0__0_in_rule__DeclaratorId__Alternatives4111);
                    rule__DeclaratorId__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDeclaratorIdAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1972:6: ( ( rule__DeclaratorId__Group_1__0 ) )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1972:6: ( ( rule__DeclaratorId__Group_1__0 ) )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1973:1: ( rule__DeclaratorId__Group_1__0 )
                    {
                     before(grammarAccess.getDeclaratorIdAccess().getGroup_1()); 
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1974:1: ( rule__DeclaratorId__Group_1__0 )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1974:2: rule__DeclaratorId__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__DeclaratorId__Group_1__0_in_rule__DeclaratorId__Alternatives4129);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1983:1: rule__OverloadableOperator__Alternatives : ( ( 'new' ) | ( 'delete' ) | ( ( rule__OverloadableOperator__Group_2__0 ) ) | ( ( rule__OverloadableOperator__Group_3__0 ) ) | ( '+' ) | ( '-' ) | ( '*' ) | ( '/' ) | ( '%' ) | ( '^' ) | ( '&' ) | ( '|' ) | ( '~' ) | ( '!' ) | ( '=' ) | ( '<' ) | ( '>' ) | ( '+=' ) | ( '-=' ) | ( '*=' ) | ( '/=' ) | ( '%=' ) | ( '^=' ) | ( '&=' ) | ( '|=' ) | ( '<<' ) | ( '>>' ) | ( '>>=' ) | ( '<<=' ) | ( '==' ) | ( '!=' ) | ( '<=' ) | ( '>=' ) | ( '&&' ) | ( '||' ) | ( '++' ) | ( '--' ) | ( ',' ) | ( '->*' ) | ( '->' ) | ( '()' ) | ( '[]' ) );
    public final void rule__OverloadableOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1987:1: ( ( 'new' ) | ( 'delete' ) | ( ( rule__OverloadableOperator__Group_2__0 ) ) | ( ( rule__OverloadableOperator__Group_3__0 ) ) | ( '+' ) | ( '-' ) | ( '*' ) | ( '/' ) | ( '%' ) | ( '^' ) | ( '&' ) | ( '|' ) | ( '~' ) | ( '!' ) | ( '=' ) | ( '<' ) | ( '>' ) | ( '+=' ) | ( '-=' ) | ( '*=' ) | ( '/=' ) | ( '%=' ) | ( '^=' ) | ( '&=' ) | ( '|=' ) | ( '<<' ) | ( '>>' ) | ( '>>=' ) | ( '<<=' ) | ( '==' ) | ( '!=' ) | ( '<=' ) | ( '>=' ) | ( '&&' ) | ( '||' ) | ( '++' ) | ( '--' ) | ( ',' ) | ( '->*' ) | ( '->' ) | ( '()' ) | ( '[]' ) )
            int alt17=42;
            alt17 = dfa17.predict(input);
            switch (alt17) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1988:1: ( 'new' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1988:1: ( 'new' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1989:1: 'new'
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getNewKeyword_0()); 
                    match(input,62,FOLLOW_62_in_rule__OverloadableOperator__Alternatives4163); 
                     after(grammarAccess.getOverloadableOperatorAccess().getNewKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1996:6: ( 'delete' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1996:6: ( 'delete' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:1997:1: 'delete'
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getDeleteKeyword_1()); 
                    match(input,63,FOLLOW_63_in_rule__OverloadableOperator__Alternatives4183); 
                     after(grammarAccess.getOverloadableOperatorAccess().getDeleteKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2004:6: ( ( rule__OverloadableOperator__Group_2__0 ) )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2004:6: ( ( rule__OverloadableOperator__Group_2__0 ) )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2005:1: ( rule__OverloadableOperator__Group_2__0 )
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getGroup_2()); 
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2006:1: ( rule__OverloadableOperator__Group_2__0 )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2006:2: rule__OverloadableOperator__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__OverloadableOperator__Group_2__0_in_rule__OverloadableOperator__Alternatives4202);
                    rule__OverloadableOperator__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getOverloadableOperatorAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2010:6: ( ( rule__OverloadableOperator__Group_3__0 ) )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2010:6: ( ( rule__OverloadableOperator__Group_3__0 ) )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2011:1: ( rule__OverloadableOperator__Group_3__0 )
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getGroup_3()); 
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2012:1: ( rule__OverloadableOperator__Group_3__0 )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2012:2: rule__OverloadableOperator__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__OverloadableOperator__Group_3__0_in_rule__OverloadableOperator__Alternatives4220);
                    rule__OverloadableOperator__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getOverloadableOperatorAccess().getGroup_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2016:6: ( '+' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2016:6: ( '+' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2017:1: '+'
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getPlusSignKeyword_4()); 
                    match(input,64,FOLLOW_64_in_rule__OverloadableOperator__Alternatives4239); 
                     after(grammarAccess.getOverloadableOperatorAccess().getPlusSignKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2024:6: ( '-' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2024:6: ( '-' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2025:1: '-'
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getHyphenMinusKeyword_5()); 
                    match(input,65,FOLLOW_65_in_rule__OverloadableOperator__Alternatives4259); 
                     after(grammarAccess.getOverloadableOperatorAccess().getHyphenMinusKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2032:6: ( '*' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2032:6: ( '*' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2033:1: '*'
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getAsteriskKeyword_6()); 
                    match(input,66,FOLLOW_66_in_rule__OverloadableOperator__Alternatives4279); 
                     after(grammarAccess.getOverloadableOperatorAccess().getAsteriskKeyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2040:6: ( '/' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2040:6: ( '/' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2041:1: '/'
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getSolidusKeyword_7()); 
                    match(input,67,FOLLOW_67_in_rule__OverloadableOperator__Alternatives4299); 
                     after(grammarAccess.getOverloadableOperatorAccess().getSolidusKeyword_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2048:6: ( '%' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2048:6: ( '%' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2049:1: '%'
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getPercentSignKeyword_8()); 
                    match(input,68,FOLLOW_68_in_rule__OverloadableOperator__Alternatives4319); 
                     after(grammarAccess.getOverloadableOperatorAccess().getPercentSignKeyword_8()); 

                    }


                    }
                    break;
                case 10 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2056:6: ( '^' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2056:6: ( '^' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2057:1: '^'
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getCircumflexAccentKeyword_9()); 
                    match(input,69,FOLLOW_69_in_rule__OverloadableOperator__Alternatives4339); 
                     after(grammarAccess.getOverloadableOperatorAccess().getCircumflexAccentKeyword_9()); 

                    }


                    }
                    break;
                case 11 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2064:6: ( '&' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2064:6: ( '&' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2065:1: '&'
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getAmpersandKeyword_10()); 
                    match(input,60,FOLLOW_60_in_rule__OverloadableOperator__Alternatives4359); 
                     after(grammarAccess.getOverloadableOperatorAccess().getAmpersandKeyword_10()); 

                    }


                    }
                    break;
                case 12 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2072:6: ( '|' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2072:6: ( '|' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2073:1: '|'
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getVerticalLineKeyword_11()); 
                    match(input,70,FOLLOW_70_in_rule__OverloadableOperator__Alternatives4379); 
                     after(grammarAccess.getOverloadableOperatorAccess().getVerticalLineKeyword_11()); 

                    }


                    }
                    break;
                case 13 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2080:6: ( '~' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2080:6: ( '~' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2081:1: '~'
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getTildeKeyword_12()); 
                    match(input,71,FOLLOW_71_in_rule__OverloadableOperator__Alternatives4399); 
                     after(grammarAccess.getOverloadableOperatorAccess().getTildeKeyword_12()); 

                    }


                    }
                    break;
                case 14 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2088:6: ( '!' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2088:6: ( '!' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2089:1: '!'
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getExclamationMarkKeyword_13()); 
                    match(input,72,FOLLOW_72_in_rule__OverloadableOperator__Alternatives4419); 
                     after(grammarAccess.getOverloadableOperatorAccess().getExclamationMarkKeyword_13()); 

                    }


                    }
                    break;
                case 15 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2096:6: ( '=' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2096:6: ( '=' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2097:1: '='
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getEqualsSignKeyword_14()); 
                    match(input,73,FOLLOW_73_in_rule__OverloadableOperator__Alternatives4439); 
                     after(grammarAccess.getOverloadableOperatorAccess().getEqualsSignKeyword_14()); 

                    }


                    }
                    break;
                case 16 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2104:6: ( '<' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2104:6: ( '<' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2105:1: '<'
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getLessThanSignKeyword_15()); 
                    match(input,74,FOLLOW_74_in_rule__OverloadableOperator__Alternatives4459); 
                     after(grammarAccess.getOverloadableOperatorAccess().getLessThanSignKeyword_15()); 

                    }


                    }
                    break;
                case 17 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2112:6: ( '>' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2112:6: ( '>' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2113:1: '>'
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getGreaterThanSignKeyword_16()); 
                    match(input,75,FOLLOW_75_in_rule__OverloadableOperator__Alternatives4479); 
                     after(grammarAccess.getOverloadableOperatorAccess().getGreaterThanSignKeyword_16()); 

                    }


                    }
                    break;
                case 18 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2120:6: ( '+=' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2120:6: ( '+=' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2121:1: '+='
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getPlusSignEqualsSignKeyword_17()); 
                    match(input,76,FOLLOW_76_in_rule__OverloadableOperator__Alternatives4499); 
                     after(grammarAccess.getOverloadableOperatorAccess().getPlusSignEqualsSignKeyword_17()); 

                    }


                    }
                    break;
                case 19 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2128:6: ( '-=' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2128:6: ( '-=' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2129:1: '-='
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getHyphenMinusEqualsSignKeyword_18()); 
                    match(input,77,FOLLOW_77_in_rule__OverloadableOperator__Alternatives4519); 
                     after(grammarAccess.getOverloadableOperatorAccess().getHyphenMinusEqualsSignKeyword_18()); 

                    }


                    }
                    break;
                case 20 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2136:6: ( '*=' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2136:6: ( '*=' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2137:1: '*='
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getAsteriskEqualsSignKeyword_19()); 
                    match(input,78,FOLLOW_78_in_rule__OverloadableOperator__Alternatives4539); 
                     after(grammarAccess.getOverloadableOperatorAccess().getAsteriskEqualsSignKeyword_19()); 

                    }


                    }
                    break;
                case 21 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2144:6: ( '/=' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2144:6: ( '/=' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2145:1: '/='
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getSolidusEqualsSignKeyword_20()); 
                    match(input,79,FOLLOW_79_in_rule__OverloadableOperator__Alternatives4559); 
                     after(grammarAccess.getOverloadableOperatorAccess().getSolidusEqualsSignKeyword_20()); 

                    }


                    }
                    break;
                case 22 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2152:6: ( '%=' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2152:6: ( '%=' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2153:1: '%='
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getPercentSignEqualsSignKeyword_21()); 
                    match(input,80,FOLLOW_80_in_rule__OverloadableOperator__Alternatives4579); 
                     after(grammarAccess.getOverloadableOperatorAccess().getPercentSignEqualsSignKeyword_21()); 

                    }


                    }
                    break;
                case 23 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2160:6: ( '^=' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2160:6: ( '^=' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2161:1: '^='
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getCircumflexAccentEqualsSignKeyword_22()); 
                    match(input,81,FOLLOW_81_in_rule__OverloadableOperator__Alternatives4599); 
                     after(grammarAccess.getOverloadableOperatorAccess().getCircumflexAccentEqualsSignKeyword_22()); 

                    }


                    }
                    break;
                case 24 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2168:6: ( '&=' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2168:6: ( '&=' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2169:1: '&='
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getAmpersandEqualsSignKeyword_23()); 
                    match(input,82,FOLLOW_82_in_rule__OverloadableOperator__Alternatives4619); 
                     after(grammarAccess.getOverloadableOperatorAccess().getAmpersandEqualsSignKeyword_23()); 

                    }


                    }
                    break;
                case 25 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2176:6: ( '|=' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2176:6: ( '|=' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2177:1: '|='
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getVerticalLineEqualsSignKeyword_24()); 
                    match(input,83,FOLLOW_83_in_rule__OverloadableOperator__Alternatives4639); 
                     after(grammarAccess.getOverloadableOperatorAccess().getVerticalLineEqualsSignKeyword_24()); 

                    }


                    }
                    break;
                case 26 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2184:6: ( '<<' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2184:6: ( '<<' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2185:1: '<<'
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getLessThanSignLessThanSignKeyword_25()); 
                    match(input,84,FOLLOW_84_in_rule__OverloadableOperator__Alternatives4659); 
                     after(grammarAccess.getOverloadableOperatorAccess().getLessThanSignLessThanSignKeyword_25()); 

                    }


                    }
                    break;
                case 27 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2192:6: ( '>>' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2192:6: ( '>>' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2193:1: '>>'
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getGreaterThanSignGreaterThanSignKeyword_26()); 
                    match(input,85,FOLLOW_85_in_rule__OverloadableOperator__Alternatives4679); 
                     after(grammarAccess.getOverloadableOperatorAccess().getGreaterThanSignGreaterThanSignKeyword_26()); 

                    }


                    }
                    break;
                case 28 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2200:6: ( '>>=' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2200:6: ( '>>=' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2201:1: '>>='
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getGreaterThanSignGreaterThanSignEqualsSignKeyword_27()); 
                    match(input,86,FOLLOW_86_in_rule__OverloadableOperator__Alternatives4699); 
                     after(grammarAccess.getOverloadableOperatorAccess().getGreaterThanSignGreaterThanSignEqualsSignKeyword_27()); 

                    }


                    }
                    break;
                case 29 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2208:6: ( '<<=' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2208:6: ( '<<=' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2209:1: '<<='
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getLessThanSignLessThanSignEqualsSignKeyword_28()); 
                    match(input,87,FOLLOW_87_in_rule__OverloadableOperator__Alternatives4719); 
                     after(grammarAccess.getOverloadableOperatorAccess().getLessThanSignLessThanSignEqualsSignKeyword_28()); 

                    }


                    }
                    break;
                case 30 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2216:6: ( '==' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2216:6: ( '==' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2217:1: '=='
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getEqualsSignEqualsSignKeyword_29()); 
                    match(input,88,FOLLOW_88_in_rule__OverloadableOperator__Alternatives4739); 
                     after(grammarAccess.getOverloadableOperatorAccess().getEqualsSignEqualsSignKeyword_29()); 

                    }


                    }
                    break;
                case 31 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2224:6: ( '!=' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2224:6: ( '!=' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2225:1: '!='
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getExclamationMarkEqualsSignKeyword_30()); 
                    match(input,89,FOLLOW_89_in_rule__OverloadableOperator__Alternatives4759); 
                     after(grammarAccess.getOverloadableOperatorAccess().getExclamationMarkEqualsSignKeyword_30()); 

                    }


                    }
                    break;
                case 32 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2232:6: ( '<=' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2232:6: ( '<=' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2233:1: '<='
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getLessThanSignEqualsSignKeyword_31()); 
                    match(input,90,FOLLOW_90_in_rule__OverloadableOperator__Alternatives4779); 
                     after(grammarAccess.getOverloadableOperatorAccess().getLessThanSignEqualsSignKeyword_31()); 

                    }


                    }
                    break;
                case 33 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2240:6: ( '>=' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2240:6: ( '>=' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2241:1: '>='
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getGreaterThanSignEqualsSignKeyword_32()); 
                    match(input,91,FOLLOW_91_in_rule__OverloadableOperator__Alternatives4799); 
                     after(grammarAccess.getOverloadableOperatorAccess().getGreaterThanSignEqualsSignKeyword_32()); 

                    }


                    }
                    break;
                case 34 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2248:6: ( '&&' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2248:6: ( '&&' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2249:1: '&&'
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getAmpersandAmpersandKeyword_33()); 
                    match(input,61,FOLLOW_61_in_rule__OverloadableOperator__Alternatives4819); 
                     after(grammarAccess.getOverloadableOperatorAccess().getAmpersandAmpersandKeyword_33()); 

                    }


                    }
                    break;
                case 35 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2256:6: ( '||' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2256:6: ( '||' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2257:1: '||'
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getVerticalLineVerticalLineKeyword_34()); 
                    match(input,92,FOLLOW_92_in_rule__OverloadableOperator__Alternatives4839); 
                     after(grammarAccess.getOverloadableOperatorAccess().getVerticalLineVerticalLineKeyword_34()); 

                    }


                    }
                    break;
                case 36 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2264:6: ( '++' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2264:6: ( '++' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2265:1: '++'
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getPlusSignPlusSignKeyword_35()); 
                    match(input,93,FOLLOW_93_in_rule__OverloadableOperator__Alternatives4859); 
                     after(grammarAccess.getOverloadableOperatorAccess().getPlusSignPlusSignKeyword_35()); 

                    }


                    }
                    break;
                case 37 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2272:6: ( '--' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2272:6: ( '--' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2273:1: '--'
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getHyphenMinusHyphenMinusKeyword_36()); 
                    match(input,94,FOLLOW_94_in_rule__OverloadableOperator__Alternatives4879); 
                     after(grammarAccess.getOverloadableOperatorAccess().getHyphenMinusHyphenMinusKeyword_36()); 

                    }


                    }
                    break;
                case 38 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2280:6: ( ',' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2280:6: ( ',' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2281:1: ','
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getCommaKeyword_37()); 
                    match(input,95,FOLLOW_95_in_rule__OverloadableOperator__Alternatives4899); 
                     after(grammarAccess.getOverloadableOperatorAccess().getCommaKeyword_37()); 

                    }


                    }
                    break;
                case 39 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2288:6: ( '->*' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2288:6: ( '->*' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2289:1: '->*'
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getHyphenMinusGreaterThanSignAsteriskKeyword_38()); 
                    match(input,96,FOLLOW_96_in_rule__OverloadableOperator__Alternatives4919); 
                     after(grammarAccess.getOverloadableOperatorAccess().getHyphenMinusGreaterThanSignAsteriskKeyword_38()); 

                    }


                    }
                    break;
                case 40 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2296:6: ( '->' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2296:6: ( '->' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2297:1: '->'
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getHyphenMinusGreaterThanSignKeyword_39()); 
                    match(input,97,FOLLOW_97_in_rule__OverloadableOperator__Alternatives4939); 
                     after(grammarAccess.getOverloadableOperatorAccess().getHyphenMinusGreaterThanSignKeyword_39()); 

                    }


                    }
                    break;
                case 41 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2304:6: ( '()' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2304:6: ( '()' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2305:1: '()'
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getLeftParenthesisRightParenthesisKeyword_40()); 
                    match(input,98,FOLLOW_98_in_rule__OverloadableOperator__Alternatives4959); 
                     after(grammarAccess.getOverloadableOperatorAccess().getLeftParenthesisRightParenthesisKeyword_40()); 

                    }


                    }
                    break;
                case 42 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2312:6: ( '[]' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2312:6: ( '[]' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2313:1: '[]'
                    {
                     before(grammarAccess.getOverloadableOperatorAccess().getLeftSquareBracketRightSquareBracketKeyword_41()); 
                    match(input,99,FOLLOW_99_in_rule__OverloadableOperator__Alternatives4979); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2325:1: rule__TemplateParameter__Alternatives : ( ( ruleTypeParameter ) | ( ruleParameterDeclaration ) );
    public final void rule__TemplateParameter__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2329:1: ( ( ruleTypeParameter ) | ( ruleParameterDeclaration ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=110 && LA18_0<=112)) ) {
                alt18=1;
            }
            else if ( (LA18_0==41) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2330:1: ( ruleTypeParameter )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2330:1: ( ruleTypeParameter )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2331:1: ruleTypeParameter
                    {
                     before(grammarAccess.getTemplateParameterAccess().getTypeParameterParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleTypeParameter_in_rule__TemplateParameter__Alternatives5013);
                    ruleTypeParameter();

                    state._fsp--;

                     after(grammarAccess.getTemplateParameterAccess().getTypeParameterParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2336:6: ( ruleParameterDeclaration )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2336:6: ( ruleParameterDeclaration )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2337:1: ruleParameterDeclaration
                    {
                     before(grammarAccess.getTemplateParameterAccess().getParameterDeclarationParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleParameterDeclaration_in_rule__TemplateParameter__Alternatives5030);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2347:1: rule__TypeParameter__Alternatives : ( ( ( rule__TypeParameter__Group_0__0 ) ) | ( ( rule__TypeParameter__Group_1__0 ) ) | ( ( rule__TypeParameter__Group_2__0 ) ) );
    public final void rule__TypeParameter__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2351:1: ( ( ( rule__TypeParameter__Group_0__0 ) ) | ( ( rule__TypeParameter__Group_1__0 ) ) | ( ( rule__TypeParameter__Group_2__0 ) ) )
            int alt19=3;
            switch ( input.LA(1) ) {
            case 110:
                {
                alt19=1;
                }
                break;
            case 111:
                {
                alt19=2;
                }
                break;
            case 112:
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
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2352:1: ( ( rule__TypeParameter__Group_0__0 ) )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2352:1: ( ( rule__TypeParameter__Group_0__0 ) )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2353:1: ( rule__TypeParameter__Group_0__0 )
                    {
                     before(grammarAccess.getTypeParameterAccess().getGroup_0()); 
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2354:1: ( rule__TypeParameter__Group_0__0 )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2354:2: rule__TypeParameter__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__TypeParameter__Group_0__0_in_rule__TypeParameter__Alternatives5062);
                    rule__TypeParameter__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeParameterAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2358:6: ( ( rule__TypeParameter__Group_1__0 ) )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2358:6: ( ( rule__TypeParameter__Group_1__0 ) )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2359:1: ( rule__TypeParameter__Group_1__0 )
                    {
                     before(grammarAccess.getTypeParameterAccess().getGroup_1()); 
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2360:1: ( rule__TypeParameter__Group_1__0 )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2360:2: rule__TypeParameter__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__TypeParameter__Group_1__0_in_rule__TypeParameter__Alternatives5080);
                    rule__TypeParameter__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeParameterAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2364:6: ( ( rule__TypeParameter__Group_2__0 ) )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2364:6: ( ( rule__TypeParameter__Group_2__0 ) )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2365:1: ( rule__TypeParameter__Group_2__0 )
                    {
                     before(grammarAccess.getTypeParameterAccess().getGroup_2()); 
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2366:1: ( rule__TypeParameter__Group_2__0 )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2366:2: rule__TypeParameter__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__TypeParameter__Group_2__0_in_rule__TypeParameter__Alternatives5098);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2375:1: rule__TypeParameter__Alternatives_0_1 : ( ( ( rule__TypeParameter__Group_0_1_0__0 ) ) | ( ( rule__TypeParameter__Group_0_1_1__0 ) ) );
    public final void rule__TypeParameter__Alternatives_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2379:1: ( ( ( rule__TypeParameter__Group_0_1_0__0 ) ) | ( ( rule__TypeParameter__Group_0_1_1__0 ) ) )
            int alt20=2;
            switch ( input.LA(1) ) {
            case EOF:
            case 75:
            case 95:
            case 100:
                {
                alt20=1;
                }
                break;
            case RULE_ID:
                {
                int LA20_2 = input.LA(2);

                if ( (LA20_2==73) ) {
                    alt20=2;
                }
                else if ( (LA20_2==EOF||LA20_2==75||LA20_2==95) ) {
                    alt20=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 2, input);

                    throw nvae;
                }
                }
                break;
            case 73:
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
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2380:1: ( ( rule__TypeParameter__Group_0_1_0__0 ) )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2380:1: ( ( rule__TypeParameter__Group_0_1_0__0 ) )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2381:1: ( rule__TypeParameter__Group_0_1_0__0 )
                    {
                     before(grammarAccess.getTypeParameterAccess().getGroup_0_1_0()); 
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2382:1: ( rule__TypeParameter__Group_0_1_0__0 )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2382:2: rule__TypeParameter__Group_0_1_0__0
                    {
                    pushFollow(FOLLOW_rule__TypeParameter__Group_0_1_0__0_in_rule__TypeParameter__Alternatives_0_15131);
                    rule__TypeParameter__Group_0_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeParameterAccess().getGroup_0_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2386:6: ( ( rule__TypeParameter__Group_0_1_1__0 ) )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2386:6: ( ( rule__TypeParameter__Group_0_1_1__0 ) )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2387:1: ( rule__TypeParameter__Group_0_1_1__0 )
                    {
                     before(grammarAccess.getTypeParameterAccess().getGroup_0_1_1()); 
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2388:1: ( rule__TypeParameter__Group_0_1_1__0 )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2388:2: rule__TypeParameter__Group_0_1_1__0
                    {
                    pushFollow(FOLLOW_rule__TypeParameter__Group_0_1_1__0_in_rule__TypeParameter__Alternatives_0_15149);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2397:1: rule__TypeParameter__Alternatives_1_1 : ( ( ( rule__TypeParameter__Group_1_1_0__0 ) ) | ( ( rule__TypeParameter__Group_1_1_1__0 ) ) );
    public final void rule__TypeParameter__Alternatives_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2401:1: ( ( ( rule__TypeParameter__Group_1_1_0__0 ) ) | ( ( rule__TypeParameter__Group_1_1_1__0 ) ) )
            int alt21=2;
            switch ( input.LA(1) ) {
            case EOF:
            case 75:
            case 95:
            case 100:
                {
                alt21=1;
                }
                break;
            case RULE_ID:
                {
                int LA21_2 = input.LA(2);

                if ( (LA21_2==73) ) {
                    alt21=2;
                }
                else if ( (LA21_2==EOF||LA21_2==75||LA21_2==95) ) {
                    alt21=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 21, 2, input);

                    throw nvae;
                }
                }
                break;
            case 73:
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
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2402:1: ( ( rule__TypeParameter__Group_1_1_0__0 ) )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2402:1: ( ( rule__TypeParameter__Group_1_1_0__0 ) )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2403:1: ( rule__TypeParameter__Group_1_1_0__0 )
                    {
                     before(grammarAccess.getTypeParameterAccess().getGroup_1_1_0()); 
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2404:1: ( rule__TypeParameter__Group_1_1_0__0 )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2404:2: rule__TypeParameter__Group_1_1_0__0
                    {
                    pushFollow(FOLLOW_rule__TypeParameter__Group_1_1_0__0_in_rule__TypeParameter__Alternatives_1_15182);
                    rule__TypeParameter__Group_1_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeParameterAccess().getGroup_1_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2408:6: ( ( rule__TypeParameter__Group_1_1_1__0 ) )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2408:6: ( ( rule__TypeParameter__Group_1_1_1__0 ) )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2409:1: ( rule__TypeParameter__Group_1_1_1__0 )
                    {
                     before(grammarAccess.getTypeParameterAccess().getGroup_1_1_1()); 
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2410:1: ( rule__TypeParameter__Group_1_1_1__0 )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2410:2: rule__TypeParameter__Group_1_1_1__0
                    {
                    pushFollow(FOLLOW_rule__TypeParameter__Group_1_1_1__0_in_rule__TypeParameter__Alternatives_1_15200);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2419:1: rule__TypeParameter__Alternatives_2_5 : ( ( ( rule__TypeParameter__Group_2_5_0__0 ) ) | ( ( rule__TypeParameter__Group_2_5_1__0 ) ) );
    public final void rule__TypeParameter__Alternatives_2_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2423:1: ( ( ( rule__TypeParameter__Group_2_5_0__0 ) ) | ( ( rule__TypeParameter__Group_2_5_1__0 ) ) )
            int alt22=2;
            switch ( input.LA(1) ) {
            case EOF:
            case 75:
            case 95:
            case 100:
                {
                alt22=1;
                }
                break;
            case RULE_ID:
                {
                int LA22_2 = input.LA(2);

                if ( (LA22_2==EOF||LA22_2==75||LA22_2==95) ) {
                    alt22=1;
                }
                else if ( (LA22_2==73) ) {
                    alt22=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 22, 2, input);

                    throw nvae;
                }
                }
                break;
            case 73:
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
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2424:1: ( ( rule__TypeParameter__Group_2_5_0__0 ) )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2424:1: ( ( rule__TypeParameter__Group_2_5_0__0 ) )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2425:1: ( rule__TypeParameter__Group_2_5_0__0 )
                    {
                     before(grammarAccess.getTypeParameterAccess().getGroup_2_5_0()); 
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2426:1: ( rule__TypeParameter__Group_2_5_0__0 )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2426:2: rule__TypeParameter__Group_2_5_0__0
                    {
                    pushFollow(FOLLOW_rule__TypeParameter__Group_2_5_0__0_in_rule__TypeParameter__Alternatives_2_55233);
                    rule__TypeParameter__Group_2_5_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeParameterAccess().getGroup_2_5_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2430:6: ( ( rule__TypeParameter__Group_2_5_1__0 ) )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2430:6: ( ( rule__TypeParameter__Group_2_5_1__0 ) )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2431:1: ( rule__TypeParameter__Group_2_5_1__0 )
                    {
                     before(grammarAccess.getTypeParameterAccess().getGroup_2_5_1()); 
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2432:1: ( rule__TypeParameter__Group_2_5_1__0 )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2432:2: rule__TypeParameter__Group_2_5_1__0
                    {
                    pushFollow(FOLLOW_rule__TypeParameter__Group_2_5_1__0_in_rule__TypeParameter__Alternatives_2_55251);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2442:1: rule__TemplateArgument__Alternatives : ( ( ruleConstantExpression ) | ( ruleTypeId ) | ( ruleIdExpression ) );
    public final void rule__TemplateArgument__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2446:1: ( ( ruleConstantExpression ) | ( ruleTypeId ) | ( ruleIdExpression ) )
            int alt23=3;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt23=1;
                }
                break;
            case 39:
                {
                alt23=2;
                }
                break;
            case 40:
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
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2447:1: ( ruleConstantExpression )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2447:1: ( ruleConstantExpression )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2448:1: ruleConstantExpression
                    {
                     before(grammarAccess.getTemplateArgumentAccess().getConstantExpressionParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleConstantExpression_in_rule__TemplateArgument__Alternatives5285);
                    ruleConstantExpression();

                    state._fsp--;

                     after(grammarAccess.getTemplateArgumentAccess().getConstantExpressionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2453:6: ( ruleTypeId )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2453:6: ( ruleTypeId )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2454:1: ruleTypeId
                    {
                     before(grammarAccess.getTemplateArgumentAccess().getTypeIdParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleTypeId_in_rule__TemplateArgument__Alternatives5302);
                    ruleTypeId();

                    state._fsp--;

                     after(grammarAccess.getTemplateArgumentAccess().getTypeIdParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2459:6: ( ruleIdExpression )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2459:6: ( ruleIdExpression )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2460:1: ruleIdExpression
                    {
                     before(grammarAccess.getTemplateArgumentAccess().getIdExpressionParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleIdExpression_in_rule__TemplateArgument__Alternatives5319);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2471:1: rule__ExceptionDeclaration__Alternatives : ( ( ( rule__ExceptionDeclaration__Group_0__0 ) ) | ( '...' ) );
    public final void rule__ExceptionDeclaration__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2475:1: ( ( ( rule__ExceptionDeclaration__Group_0__0 ) ) | ( '...' ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==46||LA24_0==103||LA24_0==105) ) {
                alt24=1;
            }
            else if ( (LA24_0==100) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2476:1: ( ( rule__ExceptionDeclaration__Group_0__0 ) )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2476:1: ( ( rule__ExceptionDeclaration__Group_0__0 ) )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2477:1: ( rule__ExceptionDeclaration__Group_0__0 )
                    {
                     before(grammarAccess.getExceptionDeclarationAccess().getGroup_0()); 
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2478:1: ( rule__ExceptionDeclaration__Group_0__0 )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2478:2: rule__ExceptionDeclaration__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__ExceptionDeclaration__Group_0__0_in_rule__ExceptionDeclaration__Alternatives5352);
                    rule__ExceptionDeclaration__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExceptionDeclarationAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2482:6: ( '...' )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2482:6: ( '...' )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2483:1: '...'
                    {
                     before(grammarAccess.getExceptionDeclarationAccess().getFullStopFullStopFullStopKeyword_1()); 
                    match(input,100,FOLLOW_100_in_rule__ExceptionDeclaration__Alternatives5371); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2495:1: rule__ExceptionDeclaration__Alternatives_0_2 : ( ( ruleDeclarator ) | ( ( ruleAbstractDeclarator )? ) );
    public final void rule__ExceptionDeclaration__Alternatives_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2499:1: ( ( ruleDeclarator ) | ( ( ruleAbstractDeclarator )? ) )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==40||LA26_0==43||LA26_0==54||(LA26_0>=60 && LA26_0<=61)||LA26_0==66||LA26_0==100||LA26_0==102||LA26_0==106) ) {
                alt26=1;
            }
            else if ( (LA26_0==EOF||LA26_0==47||LA26_0==107) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2500:1: ( ruleDeclarator )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2500:1: ( ruleDeclarator )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2501:1: ruleDeclarator
                    {
                     before(grammarAccess.getExceptionDeclarationAccess().getDeclaratorParserRuleCall_0_2_0()); 
                    pushFollow(FOLLOW_ruleDeclarator_in_rule__ExceptionDeclaration__Alternatives_0_25405);
                    ruleDeclarator();

                    state._fsp--;

                     after(grammarAccess.getExceptionDeclarationAccess().getDeclaratorParserRuleCall_0_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2506:6: ( ( ruleAbstractDeclarator )? )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2506:6: ( ( ruleAbstractDeclarator )? )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2507:1: ( ruleAbstractDeclarator )?
                    {
                     before(grammarAccess.getExceptionDeclarationAccess().getAbstractDeclaratorParserRuleCall_0_2_1()); 
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2508:1: ( ruleAbstractDeclarator )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==47) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2508:3: ruleAbstractDeclarator
                            {
                            pushFollow(FOLLOW_ruleAbstractDeclarator_in_rule__ExceptionDeclaration__Alternatives_0_25423);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2517:1: rule__ExceptionSpecification__Alternatives : ( ( ruleDynamicExceptionSpecification ) | ( ruleNoexceptSpecification ) );
    public final void rule__ExceptionSpecification__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2521:1: ( ( ruleDynamicExceptionSpecification ) | ( ruleNoexceptSpecification ) )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==114) ) {
                alt27=1;
            }
            else if ( (LA27_0==115) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2522:1: ( ruleDynamicExceptionSpecification )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2522:1: ( ruleDynamicExceptionSpecification )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2523:1: ruleDynamicExceptionSpecification
                    {
                     before(grammarAccess.getExceptionSpecificationAccess().getDynamicExceptionSpecificationParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleDynamicExceptionSpecification_in_rule__ExceptionSpecification__Alternatives5457);
                    ruleDynamicExceptionSpecification();

                    state._fsp--;

                     after(grammarAccess.getExceptionSpecificationAccess().getDynamicExceptionSpecificationParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2528:6: ( ruleNoexceptSpecification )
                    {
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2528:6: ( ruleNoexceptSpecification )
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2529:1: ruleNoexceptSpecification
                    {
                     before(grammarAccess.getExceptionSpecificationAccess().getNoexceptSpecificationParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleNoexceptSpecification_in_rule__ExceptionSpecification__Alternatives5474);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2544:1: rule__Token__Group_2__0 : rule__Token__Group_2__0__Impl rule__Token__Group_2__1 ;
    public final void rule__Token__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2548:1: ( rule__Token__Group_2__0__Impl rule__Token__Group_2__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2549:2: rule__Token__Group_2__0__Impl rule__Token__Group_2__1
            {
            pushFollow(FOLLOW_rule__Token__Group_2__0__Impl_in_rule__Token__Group_2__05507);
            rule__Token__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Token__Group_2__1_in_rule__Token__Group_2__05510);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2556:1: rule__Token__Group_2__0__Impl : ( RULE_PREPROCESSING_OP_OR_PUNC ) ;
    public final void rule__Token__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2560:1: ( ( RULE_PREPROCESSING_OP_OR_PUNC ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2561:1: ( RULE_PREPROCESSING_OP_OR_PUNC )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2561:1: ( RULE_PREPROCESSING_OP_OR_PUNC )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2562:1: RULE_PREPROCESSING_OP_OR_PUNC
            {
             before(grammarAccess.getTokenAccess().getPREPROCESSING_OP_OR_PUNCTerminalRuleCall_2_0()); 
            match(input,RULE_PREPROCESSING_OP_OR_PUNC,FOLLOW_RULE_PREPROCESSING_OP_OR_PUNC_in_rule__Token__Group_2__0__Impl5537); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2573:1: rule__Token__Group_2__1 : rule__Token__Group_2__1__Impl ;
    public final void rule__Token__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2577:1: ( rule__Token__Group_2__1__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2578:2: rule__Token__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Token__Group_2__1__Impl_in_rule__Token__Group_2__15566);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2584:1: rule__Token__Group_2__1__Impl : ( RULE_ID ) ;
    public final void rule__Token__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2588:1: ( ( RULE_ID ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2589:1: ( RULE_ID )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2589:1: ( RULE_ID )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2590:1: RULE_ID
            {
             before(grammarAccess.getTokenAccess().getIDTerminalRuleCall_2_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Token__Group_2__1__Impl5593); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2605:1: rule__Literal__Group_4__0 : rule__Literal__Group_4__0__Impl rule__Literal__Group_4__1 ;
    public final void rule__Literal__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2609:1: ( rule__Literal__Group_4__0__Impl rule__Literal__Group_4__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2610:2: rule__Literal__Group_4__0__Impl rule__Literal__Group_4__1
            {
            pushFollow(FOLLOW_rule__Literal__Group_4__0__Impl_in_rule__Literal__Group_4__05626);
            rule__Literal__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Literal__Group_4__1_in_rule__Literal__Group_4__05629);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2617:1: rule__Literal__Group_4__0__Impl : ( ( rule__Literal__Alternatives_4_0 ) ) ;
    public final void rule__Literal__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2621:1: ( ( ( rule__Literal__Alternatives_4_0 ) ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2622:1: ( ( rule__Literal__Alternatives_4_0 ) )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2622:1: ( ( rule__Literal__Alternatives_4_0 ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2623:1: ( rule__Literal__Alternatives_4_0 )
            {
             before(grammarAccess.getLiteralAccess().getAlternatives_4_0()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2624:1: ( rule__Literal__Alternatives_4_0 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2624:2: rule__Literal__Alternatives_4_0
            {
            pushFollow(FOLLOW_rule__Literal__Alternatives_4_0_in_rule__Literal__Group_4__0__Impl5656);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2634:1: rule__Literal__Group_4__1 : rule__Literal__Group_4__1__Impl ;
    public final void rule__Literal__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2638:1: ( rule__Literal__Group_4__1__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2639:2: rule__Literal__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Literal__Group_4__1__Impl_in_rule__Literal__Group_4__15686);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2645:1: rule__Literal__Group_4__1__Impl : ( 'nullptr' ) ;
    public final void rule__Literal__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2649:1: ( ( 'nullptr' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2650:1: ( 'nullptr' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2650:1: ( 'nullptr' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2651:1: 'nullptr'
            {
             before(grammarAccess.getLiteralAccess().getNullptrKeyword_4_1()); 
            match(input,101,FOLLOW_101_in_rule__Literal__Group_4__1__Impl5714); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2670:1: rule__QualifiedNamespaceSpecifier__Group__0 : rule__QualifiedNamespaceSpecifier__Group__0__Impl rule__QualifiedNamespaceSpecifier__Group__1 ;
    public final void rule__QualifiedNamespaceSpecifier__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2674:1: ( rule__QualifiedNamespaceSpecifier__Group__0__Impl rule__QualifiedNamespaceSpecifier__Group__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2675:2: rule__QualifiedNamespaceSpecifier__Group__0__Impl rule__QualifiedNamespaceSpecifier__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedNamespaceSpecifier__Group__0__Impl_in_rule__QualifiedNamespaceSpecifier__Group__05751);
            rule__QualifiedNamespaceSpecifier__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedNamespaceSpecifier__Group__1_in_rule__QualifiedNamespaceSpecifier__Group__05754);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2682:1: rule__QualifiedNamespaceSpecifier__Group__0__Impl : ( ( '::' )? ) ;
    public final void rule__QualifiedNamespaceSpecifier__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2686:1: ( ( ( '::' )? ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2687:1: ( ( '::' )? )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2687:1: ( ( '::' )? )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2688:1: ( '::' )?
            {
             before(grammarAccess.getQualifiedNamespaceSpecifierAccess().getColonColonKeyword_0()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2689:1: ( '::' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==102) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2690:2: '::'
                    {
                    match(input,102,FOLLOW_102_in_rule__QualifiedNamespaceSpecifier__Group__0__Impl5783); 

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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2701:1: rule__QualifiedNamespaceSpecifier__Group__1 : rule__QualifiedNamespaceSpecifier__Group__1__Impl rule__QualifiedNamespaceSpecifier__Group__2 ;
    public final void rule__QualifiedNamespaceSpecifier__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2705:1: ( rule__QualifiedNamespaceSpecifier__Group__1__Impl rule__QualifiedNamespaceSpecifier__Group__2 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2706:2: rule__QualifiedNamespaceSpecifier__Group__1__Impl rule__QualifiedNamespaceSpecifier__Group__2
            {
            pushFollow(FOLLOW_rule__QualifiedNamespaceSpecifier__Group__1__Impl_in_rule__QualifiedNamespaceSpecifier__Group__15816);
            rule__QualifiedNamespaceSpecifier__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedNamespaceSpecifier__Group__2_in_rule__QualifiedNamespaceSpecifier__Group__15819);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2713:1: rule__QualifiedNamespaceSpecifier__Group__1__Impl : ( ( ruleNestedNameSpecifier )? ) ;
    public final void rule__QualifiedNamespaceSpecifier__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2717:1: ( ( ( ruleNestedNameSpecifier )? ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2718:1: ( ( ruleNestedNameSpecifier )? )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2718:1: ( ( ruleNestedNameSpecifier )? )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2719:1: ( ruleNestedNameSpecifier )?
            {
             before(grammarAccess.getQualifiedNamespaceSpecifierAccess().getNestedNameSpecifierParserRuleCall_1()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2720:1: ( ruleNestedNameSpecifier )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==43) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2720:3: ruleNestedNameSpecifier
                    {
                    pushFollow(FOLLOW_ruleNestedNameSpecifier_in_rule__QualifiedNamespaceSpecifier__Group__1__Impl5847);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2730:1: rule__QualifiedNamespaceSpecifier__Group__2 : rule__QualifiedNamespaceSpecifier__Group__2__Impl ;
    public final void rule__QualifiedNamespaceSpecifier__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2734:1: ( rule__QualifiedNamespaceSpecifier__Group__2__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2735:2: rule__QualifiedNamespaceSpecifier__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedNamespaceSpecifier__Group__2__Impl_in_rule__QualifiedNamespaceSpecifier__Group__25878);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2741:1: rule__QualifiedNamespaceSpecifier__Group__2__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedNamespaceSpecifier__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2745:1: ( ( RULE_ID ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2746:1: ( RULE_ID )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2746:1: ( RULE_ID )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2747:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNamespaceSpecifierAccess().getIDTerminalRuleCall_2()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedNamespaceSpecifier__Group__2__Impl5905); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2770:1: rule__AttributeSpecifier__Group_0__0 : rule__AttributeSpecifier__Group_0__0__Impl rule__AttributeSpecifier__Group_0__1 ;
    public final void rule__AttributeSpecifier__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2774:1: ( rule__AttributeSpecifier__Group_0__0__Impl rule__AttributeSpecifier__Group_0__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2775:2: rule__AttributeSpecifier__Group_0__0__Impl rule__AttributeSpecifier__Group_0__1
            {
            pushFollow(FOLLOW_rule__AttributeSpecifier__Group_0__0__Impl_in_rule__AttributeSpecifier__Group_0__05946);
            rule__AttributeSpecifier__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AttributeSpecifier__Group_0__1_in_rule__AttributeSpecifier__Group_0__05949);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2782:1: rule__AttributeSpecifier__Group_0__0__Impl : ( '[' ) ;
    public final void rule__AttributeSpecifier__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2786:1: ( ( '[' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2787:1: ( '[' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2787:1: ( '[' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2788:1: '['
            {
             before(grammarAccess.getAttributeSpecifierAccess().getLeftSquareBracketKeyword_0_0()); 
            match(input,103,FOLLOW_103_in_rule__AttributeSpecifier__Group_0__0__Impl5977); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2801:1: rule__AttributeSpecifier__Group_0__1 : rule__AttributeSpecifier__Group_0__1__Impl rule__AttributeSpecifier__Group_0__2 ;
    public final void rule__AttributeSpecifier__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2805:1: ( rule__AttributeSpecifier__Group_0__1__Impl rule__AttributeSpecifier__Group_0__2 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2806:2: rule__AttributeSpecifier__Group_0__1__Impl rule__AttributeSpecifier__Group_0__2
            {
            pushFollow(FOLLOW_rule__AttributeSpecifier__Group_0__1__Impl_in_rule__AttributeSpecifier__Group_0__16008);
            rule__AttributeSpecifier__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AttributeSpecifier__Group_0__2_in_rule__AttributeSpecifier__Group_0__16011);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2813:1: rule__AttributeSpecifier__Group_0__1__Impl : ( '[' ) ;
    public final void rule__AttributeSpecifier__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2817:1: ( ( '[' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2818:1: ( '[' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2818:1: ( '[' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2819:1: '['
            {
             before(grammarAccess.getAttributeSpecifierAccess().getLeftSquareBracketKeyword_0_1()); 
            match(input,103,FOLLOW_103_in_rule__AttributeSpecifier__Group_0__1__Impl6039); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2832:1: rule__AttributeSpecifier__Group_0__2 : rule__AttributeSpecifier__Group_0__2__Impl rule__AttributeSpecifier__Group_0__3 ;
    public final void rule__AttributeSpecifier__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2836:1: ( rule__AttributeSpecifier__Group_0__2__Impl rule__AttributeSpecifier__Group_0__3 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2837:2: rule__AttributeSpecifier__Group_0__2__Impl rule__AttributeSpecifier__Group_0__3
            {
            pushFollow(FOLLOW_rule__AttributeSpecifier__Group_0__2__Impl_in_rule__AttributeSpecifier__Group_0__26070);
            rule__AttributeSpecifier__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AttributeSpecifier__Group_0__3_in_rule__AttributeSpecifier__Group_0__26073);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2844:1: rule__AttributeSpecifier__Group_0__2__Impl : ( ruleAttributeList ) ;
    public final void rule__AttributeSpecifier__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2848:1: ( ( ruleAttributeList ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2849:1: ( ruleAttributeList )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2849:1: ( ruleAttributeList )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2850:1: ruleAttributeList
            {
             before(grammarAccess.getAttributeSpecifierAccess().getAttributeListParserRuleCall_0_2()); 
            pushFollow(FOLLOW_ruleAttributeList_in_rule__AttributeSpecifier__Group_0__2__Impl6100);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2861:1: rule__AttributeSpecifier__Group_0__3 : rule__AttributeSpecifier__Group_0__3__Impl rule__AttributeSpecifier__Group_0__4 ;
    public final void rule__AttributeSpecifier__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2865:1: ( rule__AttributeSpecifier__Group_0__3__Impl rule__AttributeSpecifier__Group_0__4 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2866:2: rule__AttributeSpecifier__Group_0__3__Impl rule__AttributeSpecifier__Group_0__4
            {
            pushFollow(FOLLOW_rule__AttributeSpecifier__Group_0__3__Impl_in_rule__AttributeSpecifier__Group_0__36129);
            rule__AttributeSpecifier__Group_0__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AttributeSpecifier__Group_0__4_in_rule__AttributeSpecifier__Group_0__36132);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2873:1: rule__AttributeSpecifier__Group_0__3__Impl : ( ']' ) ;
    public final void rule__AttributeSpecifier__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2877:1: ( ( ']' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2878:1: ( ']' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2878:1: ( ']' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2879:1: ']'
            {
             before(grammarAccess.getAttributeSpecifierAccess().getRightSquareBracketKeyword_0_3()); 
            match(input,104,FOLLOW_104_in_rule__AttributeSpecifier__Group_0__3__Impl6160); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2892:1: rule__AttributeSpecifier__Group_0__4 : rule__AttributeSpecifier__Group_0__4__Impl ;
    public final void rule__AttributeSpecifier__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2896:1: ( rule__AttributeSpecifier__Group_0__4__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2897:2: rule__AttributeSpecifier__Group_0__4__Impl
            {
            pushFollow(FOLLOW_rule__AttributeSpecifier__Group_0__4__Impl_in_rule__AttributeSpecifier__Group_0__46191);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2903:1: rule__AttributeSpecifier__Group_0__4__Impl : ( ']' ) ;
    public final void rule__AttributeSpecifier__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2907:1: ( ( ']' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2908:1: ( ']' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2908:1: ( ']' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2909:1: ']'
            {
             before(grammarAccess.getAttributeSpecifierAccess().getRightSquareBracketKeyword_0_4()); 
            match(input,104,FOLLOW_104_in_rule__AttributeSpecifier__Group_0__4__Impl6219); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2932:1: rule__AlignmentSpecifier__Group_0__0 : rule__AlignmentSpecifier__Group_0__0__Impl rule__AlignmentSpecifier__Group_0__1 ;
    public final void rule__AlignmentSpecifier__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2936:1: ( rule__AlignmentSpecifier__Group_0__0__Impl rule__AlignmentSpecifier__Group_0__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2937:2: rule__AlignmentSpecifier__Group_0__0__Impl rule__AlignmentSpecifier__Group_0__1
            {
            pushFollow(FOLLOW_rule__AlignmentSpecifier__Group_0__0__Impl_in_rule__AlignmentSpecifier__Group_0__06260);
            rule__AlignmentSpecifier__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AlignmentSpecifier__Group_0__1_in_rule__AlignmentSpecifier__Group_0__06263);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2944:1: rule__AlignmentSpecifier__Group_0__0__Impl : ( 'alignas' ) ;
    public final void rule__AlignmentSpecifier__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2948:1: ( ( 'alignas' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2949:1: ( 'alignas' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2949:1: ( 'alignas' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2950:1: 'alignas'
            {
             before(grammarAccess.getAlignmentSpecifierAccess().getAlignasKeyword_0_0()); 
            match(input,105,FOLLOW_105_in_rule__AlignmentSpecifier__Group_0__0__Impl6291); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2963:1: rule__AlignmentSpecifier__Group_0__1 : rule__AlignmentSpecifier__Group_0__1__Impl rule__AlignmentSpecifier__Group_0__2 ;
    public final void rule__AlignmentSpecifier__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2967:1: ( rule__AlignmentSpecifier__Group_0__1__Impl rule__AlignmentSpecifier__Group_0__2 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2968:2: rule__AlignmentSpecifier__Group_0__1__Impl rule__AlignmentSpecifier__Group_0__2
            {
            pushFollow(FOLLOW_rule__AlignmentSpecifier__Group_0__1__Impl_in_rule__AlignmentSpecifier__Group_0__16322);
            rule__AlignmentSpecifier__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AlignmentSpecifier__Group_0__2_in_rule__AlignmentSpecifier__Group_0__16325);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2975:1: rule__AlignmentSpecifier__Group_0__1__Impl : ( '(' ) ;
    public final void rule__AlignmentSpecifier__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2979:1: ( ( '(' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2980:1: ( '(' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2980:1: ( '(' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2981:1: '('
            {
             before(grammarAccess.getAlignmentSpecifierAccess().getLeftParenthesisKeyword_0_1()); 
            match(input,106,FOLLOW_106_in_rule__AlignmentSpecifier__Group_0__1__Impl6353); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2994:1: rule__AlignmentSpecifier__Group_0__2 : rule__AlignmentSpecifier__Group_0__2__Impl rule__AlignmentSpecifier__Group_0__3 ;
    public final void rule__AlignmentSpecifier__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2998:1: ( rule__AlignmentSpecifier__Group_0__2__Impl rule__AlignmentSpecifier__Group_0__3 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:2999:2: rule__AlignmentSpecifier__Group_0__2__Impl rule__AlignmentSpecifier__Group_0__3
            {
            pushFollow(FOLLOW_rule__AlignmentSpecifier__Group_0__2__Impl_in_rule__AlignmentSpecifier__Group_0__26384);
            rule__AlignmentSpecifier__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AlignmentSpecifier__Group_0__3_in_rule__AlignmentSpecifier__Group_0__26387);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3006:1: rule__AlignmentSpecifier__Group_0__2__Impl : ( ruleTypeId ) ;
    public final void rule__AlignmentSpecifier__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3010:1: ( ( ruleTypeId ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3011:1: ( ruleTypeId )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3011:1: ( ruleTypeId )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3012:1: ruleTypeId
            {
             before(grammarAccess.getAlignmentSpecifierAccess().getTypeIdParserRuleCall_0_2()); 
            pushFollow(FOLLOW_ruleTypeId_in_rule__AlignmentSpecifier__Group_0__2__Impl6414);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3023:1: rule__AlignmentSpecifier__Group_0__3 : rule__AlignmentSpecifier__Group_0__3__Impl rule__AlignmentSpecifier__Group_0__4 ;
    public final void rule__AlignmentSpecifier__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3027:1: ( rule__AlignmentSpecifier__Group_0__3__Impl rule__AlignmentSpecifier__Group_0__4 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3028:2: rule__AlignmentSpecifier__Group_0__3__Impl rule__AlignmentSpecifier__Group_0__4
            {
            pushFollow(FOLLOW_rule__AlignmentSpecifier__Group_0__3__Impl_in_rule__AlignmentSpecifier__Group_0__36443);
            rule__AlignmentSpecifier__Group_0__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AlignmentSpecifier__Group_0__4_in_rule__AlignmentSpecifier__Group_0__36446);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3035:1: rule__AlignmentSpecifier__Group_0__3__Impl : ( ( '...' )? ) ;
    public final void rule__AlignmentSpecifier__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3039:1: ( ( ( '...' )? ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3040:1: ( ( '...' )? )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3040:1: ( ( '...' )? )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3041:1: ( '...' )?
            {
             before(grammarAccess.getAlignmentSpecifierAccess().getFullStopFullStopFullStopKeyword_0_3()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3042:1: ( '...' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==100) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3043:2: '...'
                    {
                    match(input,100,FOLLOW_100_in_rule__AlignmentSpecifier__Group_0__3__Impl6475); 

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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3054:1: rule__AlignmentSpecifier__Group_0__4 : rule__AlignmentSpecifier__Group_0__4__Impl ;
    public final void rule__AlignmentSpecifier__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3058:1: ( rule__AlignmentSpecifier__Group_0__4__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3059:2: rule__AlignmentSpecifier__Group_0__4__Impl
            {
            pushFollow(FOLLOW_rule__AlignmentSpecifier__Group_0__4__Impl_in_rule__AlignmentSpecifier__Group_0__46508);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3065:1: rule__AlignmentSpecifier__Group_0__4__Impl : ( ')' ) ;
    public final void rule__AlignmentSpecifier__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3069:1: ( ( ')' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3070:1: ( ')' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3070:1: ( ')' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3071:1: ')'
            {
             before(grammarAccess.getAlignmentSpecifierAccess().getRightParenthesisKeyword_0_4()); 
            match(input,107,FOLLOW_107_in_rule__AlignmentSpecifier__Group_0__4__Impl6536); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3094:1: rule__AlignmentSpecifier__Group_1__0 : rule__AlignmentSpecifier__Group_1__0__Impl rule__AlignmentSpecifier__Group_1__1 ;
    public final void rule__AlignmentSpecifier__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3098:1: ( rule__AlignmentSpecifier__Group_1__0__Impl rule__AlignmentSpecifier__Group_1__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3099:2: rule__AlignmentSpecifier__Group_1__0__Impl rule__AlignmentSpecifier__Group_1__1
            {
            pushFollow(FOLLOW_rule__AlignmentSpecifier__Group_1__0__Impl_in_rule__AlignmentSpecifier__Group_1__06577);
            rule__AlignmentSpecifier__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AlignmentSpecifier__Group_1__1_in_rule__AlignmentSpecifier__Group_1__06580);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3106:1: rule__AlignmentSpecifier__Group_1__0__Impl : ( 'alignas' ) ;
    public final void rule__AlignmentSpecifier__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3110:1: ( ( 'alignas' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3111:1: ( 'alignas' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3111:1: ( 'alignas' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3112:1: 'alignas'
            {
             before(grammarAccess.getAlignmentSpecifierAccess().getAlignasKeyword_1_0()); 
            match(input,105,FOLLOW_105_in_rule__AlignmentSpecifier__Group_1__0__Impl6608); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3125:1: rule__AlignmentSpecifier__Group_1__1 : rule__AlignmentSpecifier__Group_1__1__Impl rule__AlignmentSpecifier__Group_1__2 ;
    public final void rule__AlignmentSpecifier__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3129:1: ( rule__AlignmentSpecifier__Group_1__1__Impl rule__AlignmentSpecifier__Group_1__2 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3130:2: rule__AlignmentSpecifier__Group_1__1__Impl rule__AlignmentSpecifier__Group_1__2
            {
            pushFollow(FOLLOW_rule__AlignmentSpecifier__Group_1__1__Impl_in_rule__AlignmentSpecifier__Group_1__16639);
            rule__AlignmentSpecifier__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AlignmentSpecifier__Group_1__2_in_rule__AlignmentSpecifier__Group_1__16642);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3137:1: rule__AlignmentSpecifier__Group_1__1__Impl : ( '(' ) ;
    public final void rule__AlignmentSpecifier__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3141:1: ( ( '(' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3142:1: ( '(' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3142:1: ( '(' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3143:1: '('
            {
             before(grammarAccess.getAlignmentSpecifierAccess().getLeftParenthesisKeyword_1_1()); 
            match(input,106,FOLLOW_106_in_rule__AlignmentSpecifier__Group_1__1__Impl6670); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3156:1: rule__AlignmentSpecifier__Group_1__2 : rule__AlignmentSpecifier__Group_1__2__Impl rule__AlignmentSpecifier__Group_1__3 ;
    public final void rule__AlignmentSpecifier__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3160:1: ( rule__AlignmentSpecifier__Group_1__2__Impl rule__AlignmentSpecifier__Group_1__3 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3161:2: rule__AlignmentSpecifier__Group_1__2__Impl rule__AlignmentSpecifier__Group_1__3
            {
            pushFollow(FOLLOW_rule__AlignmentSpecifier__Group_1__2__Impl_in_rule__AlignmentSpecifier__Group_1__26701);
            rule__AlignmentSpecifier__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AlignmentSpecifier__Group_1__3_in_rule__AlignmentSpecifier__Group_1__26704);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3168:1: rule__AlignmentSpecifier__Group_1__2__Impl : ( ruleAlignmentExpression ) ;
    public final void rule__AlignmentSpecifier__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3172:1: ( ( ruleAlignmentExpression ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3173:1: ( ruleAlignmentExpression )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3173:1: ( ruleAlignmentExpression )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3174:1: ruleAlignmentExpression
            {
             before(grammarAccess.getAlignmentSpecifierAccess().getAlignmentExpressionParserRuleCall_1_2()); 
            pushFollow(FOLLOW_ruleAlignmentExpression_in_rule__AlignmentSpecifier__Group_1__2__Impl6731);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3185:1: rule__AlignmentSpecifier__Group_1__3 : rule__AlignmentSpecifier__Group_1__3__Impl rule__AlignmentSpecifier__Group_1__4 ;
    public final void rule__AlignmentSpecifier__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3189:1: ( rule__AlignmentSpecifier__Group_1__3__Impl rule__AlignmentSpecifier__Group_1__4 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3190:2: rule__AlignmentSpecifier__Group_1__3__Impl rule__AlignmentSpecifier__Group_1__4
            {
            pushFollow(FOLLOW_rule__AlignmentSpecifier__Group_1__3__Impl_in_rule__AlignmentSpecifier__Group_1__36760);
            rule__AlignmentSpecifier__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AlignmentSpecifier__Group_1__4_in_rule__AlignmentSpecifier__Group_1__36763);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3197:1: rule__AlignmentSpecifier__Group_1__3__Impl : ( ( '...' )? ) ;
    public final void rule__AlignmentSpecifier__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3201:1: ( ( ( '...' )? ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3202:1: ( ( '...' )? )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3202:1: ( ( '...' )? )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3203:1: ( '...' )?
            {
             before(grammarAccess.getAlignmentSpecifierAccess().getFullStopFullStopFullStopKeyword_1_3()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3204:1: ( '...' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==100) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3205:2: '...'
                    {
                    match(input,100,FOLLOW_100_in_rule__AlignmentSpecifier__Group_1__3__Impl6792); 

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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3216:1: rule__AlignmentSpecifier__Group_1__4 : rule__AlignmentSpecifier__Group_1__4__Impl ;
    public final void rule__AlignmentSpecifier__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3220:1: ( rule__AlignmentSpecifier__Group_1__4__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3221:2: rule__AlignmentSpecifier__Group_1__4__Impl
            {
            pushFollow(FOLLOW_rule__AlignmentSpecifier__Group_1__4__Impl_in_rule__AlignmentSpecifier__Group_1__46825);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3227:1: rule__AlignmentSpecifier__Group_1__4__Impl : ( ')' ) ;
    public final void rule__AlignmentSpecifier__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3231:1: ( ( ')' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3232:1: ( ')' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3232:1: ( ')' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3233:1: ')'
            {
             before(grammarAccess.getAlignmentSpecifierAccess().getRightParenthesisKeyword_1_4()); 
            match(input,107,FOLLOW_107_in_rule__AlignmentSpecifier__Group_1__4__Impl6853); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3256:1: rule__AttributeList__Group__0 : rule__AttributeList__Group__0__Impl rule__AttributeList__Group__1 ;
    public final void rule__AttributeList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3260:1: ( rule__AttributeList__Group__0__Impl rule__AttributeList__Group__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3261:2: rule__AttributeList__Group__0__Impl rule__AttributeList__Group__1
            {
            pushFollow(FOLLOW_rule__AttributeList__Group__0__Impl_in_rule__AttributeList__Group__06894);
            rule__AttributeList__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AttributeList__Group__1_in_rule__AttributeList__Group__06897);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3268:1: rule__AttributeList__Group__0__Impl : ( ( rule__AttributeList__Group_0__0 ) ) ;
    public final void rule__AttributeList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3272:1: ( ( ( rule__AttributeList__Group_0__0 ) ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3273:1: ( ( rule__AttributeList__Group_0__0 ) )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3273:1: ( ( rule__AttributeList__Group_0__0 ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3274:1: ( rule__AttributeList__Group_0__0 )
            {
             before(grammarAccess.getAttributeListAccess().getGroup_0()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3275:1: ( rule__AttributeList__Group_0__0 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3275:2: rule__AttributeList__Group_0__0
            {
            pushFollow(FOLLOW_rule__AttributeList__Group_0__0_in_rule__AttributeList__Group__0__Impl6924);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3285:1: rule__AttributeList__Group__1 : rule__AttributeList__Group__1__Impl ;
    public final void rule__AttributeList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3289:1: ( rule__AttributeList__Group__1__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3290:2: rule__AttributeList__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__AttributeList__Group__1__Impl_in_rule__AttributeList__Group__16954);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3296:1: rule__AttributeList__Group__1__Impl : ( ( rule__AttributeList__Group_1__0 )* ) ;
    public final void rule__AttributeList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3300:1: ( ( ( rule__AttributeList__Group_1__0 )* ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3301:1: ( ( rule__AttributeList__Group_1__0 )* )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3301:1: ( ( rule__AttributeList__Group_1__0 )* )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3302:1: ( rule__AttributeList__Group_1__0 )*
            {
             before(grammarAccess.getAttributeListAccess().getGroup_1()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3303:1: ( rule__AttributeList__Group_1__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==95) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3303:2: rule__AttributeList__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__AttributeList__Group_1__0_in_rule__AttributeList__Group__1__Impl6981);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3317:1: rule__AttributeList__Group_0__0 : rule__AttributeList__Group_0__0__Impl rule__AttributeList__Group_0__1 ;
    public final void rule__AttributeList__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3321:1: ( rule__AttributeList__Group_0__0__Impl rule__AttributeList__Group_0__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3322:2: rule__AttributeList__Group_0__0__Impl rule__AttributeList__Group_0__1
            {
            pushFollow(FOLLOW_rule__AttributeList__Group_0__0__Impl_in_rule__AttributeList__Group_0__07016);
            rule__AttributeList__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AttributeList__Group_0__1_in_rule__AttributeList__Group_0__07019);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3329:1: rule__AttributeList__Group_0__0__Impl : ( ruleAttribute ) ;
    public final void rule__AttributeList__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3333:1: ( ( ruleAttribute ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3334:1: ( ruleAttribute )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3334:1: ( ruleAttribute )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3335:1: ruleAttribute
            {
             before(grammarAccess.getAttributeListAccess().getAttributeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleAttribute_in_rule__AttributeList__Group_0__0__Impl7046);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3346:1: rule__AttributeList__Group_0__1 : rule__AttributeList__Group_0__1__Impl ;
    public final void rule__AttributeList__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3350:1: ( rule__AttributeList__Group_0__1__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3351:2: rule__AttributeList__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__AttributeList__Group_0__1__Impl_in_rule__AttributeList__Group_0__17075);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3357:1: rule__AttributeList__Group_0__1__Impl : ( ( '...' )? ) ;
    public final void rule__AttributeList__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3361:1: ( ( ( '...' )? ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3362:1: ( ( '...' )? )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3362:1: ( ( '...' )? )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3363:1: ( '...' )?
            {
             before(grammarAccess.getAttributeListAccess().getFullStopFullStopFullStopKeyword_0_1()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3364:1: ( '...' )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==100) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3365:2: '...'
                    {
                    match(input,100,FOLLOW_100_in_rule__AttributeList__Group_0__1__Impl7104); 

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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3380:1: rule__AttributeList__Group_1__0 : rule__AttributeList__Group_1__0__Impl rule__AttributeList__Group_1__1 ;
    public final void rule__AttributeList__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3384:1: ( rule__AttributeList__Group_1__0__Impl rule__AttributeList__Group_1__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3385:2: rule__AttributeList__Group_1__0__Impl rule__AttributeList__Group_1__1
            {
            pushFollow(FOLLOW_rule__AttributeList__Group_1__0__Impl_in_rule__AttributeList__Group_1__07141);
            rule__AttributeList__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AttributeList__Group_1__1_in_rule__AttributeList__Group_1__07144);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3392:1: rule__AttributeList__Group_1__0__Impl : ( ',' ) ;
    public final void rule__AttributeList__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3396:1: ( ( ',' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3397:1: ( ',' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3397:1: ( ',' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3398:1: ','
            {
             before(grammarAccess.getAttributeListAccess().getCommaKeyword_1_0()); 
            match(input,95,FOLLOW_95_in_rule__AttributeList__Group_1__0__Impl7172); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3411:1: rule__AttributeList__Group_1__1 : rule__AttributeList__Group_1__1__Impl ;
    public final void rule__AttributeList__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3415:1: ( rule__AttributeList__Group_1__1__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3416:2: rule__AttributeList__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__AttributeList__Group_1__1__Impl_in_rule__AttributeList__Group_1__17203);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3422:1: rule__AttributeList__Group_1__1__Impl : ( ( rule__AttributeList__Group_1_1__0 )? ) ;
    public final void rule__AttributeList__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3426:1: ( ( ( rule__AttributeList__Group_1_1__0 )? ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3427:1: ( ( rule__AttributeList__Group_1_1__0 )? )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3427:1: ( ( rule__AttributeList__Group_1_1__0 )? )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3428:1: ( rule__AttributeList__Group_1_1__0 )?
            {
             before(grammarAccess.getAttributeListAccess().getGroup_1_1()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3429:1: ( rule__AttributeList__Group_1_1__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_ID) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3429:2: rule__AttributeList__Group_1_1__0
                    {
                    pushFollow(FOLLOW_rule__AttributeList__Group_1_1__0_in_rule__AttributeList__Group_1__1__Impl7230);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3443:1: rule__AttributeList__Group_1_1__0 : rule__AttributeList__Group_1_1__0__Impl rule__AttributeList__Group_1_1__1 ;
    public final void rule__AttributeList__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3447:1: ( rule__AttributeList__Group_1_1__0__Impl rule__AttributeList__Group_1_1__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3448:2: rule__AttributeList__Group_1_1__0__Impl rule__AttributeList__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__AttributeList__Group_1_1__0__Impl_in_rule__AttributeList__Group_1_1__07265);
            rule__AttributeList__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AttributeList__Group_1_1__1_in_rule__AttributeList__Group_1_1__07268);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3455:1: rule__AttributeList__Group_1_1__0__Impl : ( ruleAttribute ) ;
    public final void rule__AttributeList__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3459:1: ( ( ruleAttribute ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3460:1: ( ruleAttribute )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3460:1: ( ruleAttribute )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3461:1: ruleAttribute
            {
             before(grammarAccess.getAttributeListAccess().getAttributeParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleAttribute_in_rule__AttributeList__Group_1_1__0__Impl7295);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3472:1: rule__AttributeList__Group_1_1__1 : rule__AttributeList__Group_1_1__1__Impl ;
    public final void rule__AttributeList__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3476:1: ( rule__AttributeList__Group_1_1__1__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3477:2: rule__AttributeList__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__AttributeList__Group_1_1__1__Impl_in_rule__AttributeList__Group_1_1__17324);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3483:1: rule__AttributeList__Group_1_1__1__Impl : ( ( '...' )? ) ;
    public final void rule__AttributeList__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3487:1: ( ( ( '...' )? ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3488:1: ( ( '...' )? )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3488:1: ( ( '...' )? )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3489:1: ( '...' )?
            {
             before(grammarAccess.getAttributeListAccess().getFullStopFullStopFullStopKeyword_1_1_1()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3490:1: ( '...' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==100) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3491:2: '...'
                    {
                    match(input,100,FOLLOW_100_in_rule__AttributeList__Group_1_1__1__Impl7353); 

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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3506:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3510:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3511:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_rule__Attribute__Group__0__Impl_in_rule__Attribute__Group__07390);
            rule__Attribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group__1_in_rule__Attribute__Group__07393);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3518:1: rule__Attribute__Group__0__Impl : ( ruleAttributeToken ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3522:1: ( ( ruleAttributeToken ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3523:1: ( ruleAttributeToken )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3523:1: ( ruleAttributeToken )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3524:1: ruleAttributeToken
            {
             before(grammarAccess.getAttributeAccess().getAttributeTokenParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleAttributeToken_in_rule__Attribute__Group__0__Impl7420);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3535:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3539:1: ( rule__Attribute__Group__1__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3540:2: rule__Attribute__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Attribute__Group__1__Impl_in_rule__Attribute__Group__17449);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3546:1: rule__Attribute__Group__1__Impl : ( ( ruleAttributeArgumentClause )? ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3550:1: ( ( ( ruleAttributeArgumentClause )? ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3551:1: ( ( ruleAttributeArgumentClause )? )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3551:1: ( ( ruleAttributeArgumentClause )? )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3552:1: ( ruleAttributeArgumentClause )?
            {
             before(grammarAccess.getAttributeAccess().getAttributeArgumentClauseParserRuleCall_1()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3553:1: ( ruleAttributeArgumentClause )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==106) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3553:3: ruleAttributeArgumentClause
                    {
                    pushFollow(FOLLOW_ruleAttributeArgumentClause_in_rule__Attribute__Group__1__Impl7477);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3567:1: rule__AttributeToken__Group__0 : rule__AttributeToken__Group__0__Impl rule__AttributeToken__Group__1 ;
    public final void rule__AttributeToken__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3571:1: ( rule__AttributeToken__Group__0__Impl rule__AttributeToken__Group__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3572:2: rule__AttributeToken__Group__0__Impl rule__AttributeToken__Group__1
            {
            pushFollow(FOLLOW_rule__AttributeToken__Group__0__Impl_in_rule__AttributeToken__Group__07512);
            rule__AttributeToken__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AttributeToken__Group__1_in_rule__AttributeToken__Group__07515);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3579:1: rule__AttributeToken__Group__0__Impl : ( ( rule__AttributeToken__Group_0__0 )? ) ;
    public final void rule__AttributeToken__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3583:1: ( ( ( rule__AttributeToken__Group_0__0 )? ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3584:1: ( ( rule__AttributeToken__Group_0__0 )? )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3584:1: ( ( rule__AttributeToken__Group_0__0 )? )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3585:1: ( rule__AttributeToken__Group_0__0 )?
            {
             before(grammarAccess.getAttributeTokenAccess().getGroup_0()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3586:1: ( rule__AttributeToken__Group_0__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_ID) ) {
                int LA37_1 = input.LA(2);

                if ( (LA37_1==102) ) {
                    alt37=1;
                }
            }
            switch (alt37) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3586:2: rule__AttributeToken__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__AttributeToken__Group_0__0_in_rule__AttributeToken__Group__0__Impl7542);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3596:1: rule__AttributeToken__Group__1 : rule__AttributeToken__Group__1__Impl ;
    public final void rule__AttributeToken__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3600:1: ( rule__AttributeToken__Group__1__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3601:2: rule__AttributeToken__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__AttributeToken__Group__1__Impl_in_rule__AttributeToken__Group__17573);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3607:1: rule__AttributeToken__Group__1__Impl : ( RULE_ID ) ;
    public final void rule__AttributeToken__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3611:1: ( ( RULE_ID ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3612:1: ( RULE_ID )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3612:1: ( RULE_ID )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3613:1: RULE_ID
            {
             before(grammarAccess.getAttributeTokenAccess().getIDTerminalRuleCall_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__AttributeToken__Group__1__Impl7600); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3628:1: rule__AttributeToken__Group_0__0 : rule__AttributeToken__Group_0__0__Impl rule__AttributeToken__Group_0__1 ;
    public final void rule__AttributeToken__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3632:1: ( rule__AttributeToken__Group_0__0__Impl rule__AttributeToken__Group_0__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3633:2: rule__AttributeToken__Group_0__0__Impl rule__AttributeToken__Group_0__1
            {
            pushFollow(FOLLOW_rule__AttributeToken__Group_0__0__Impl_in_rule__AttributeToken__Group_0__07633);
            rule__AttributeToken__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AttributeToken__Group_0__1_in_rule__AttributeToken__Group_0__07636);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3640:1: rule__AttributeToken__Group_0__0__Impl : ( RULE_ID ) ;
    public final void rule__AttributeToken__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3644:1: ( ( RULE_ID ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3645:1: ( RULE_ID )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3645:1: ( RULE_ID )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3646:1: RULE_ID
            {
             before(grammarAccess.getAttributeTokenAccess().getIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__AttributeToken__Group_0__0__Impl7663); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3657:1: rule__AttributeToken__Group_0__1 : rule__AttributeToken__Group_0__1__Impl ;
    public final void rule__AttributeToken__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3661:1: ( rule__AttributeToken__Group_0__1__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3662:2: rule__AttributeToken__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__AttributeToken__Group_0__1__Impl_in_rule__AttributeToken__Group_0__17692);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3668:1: rule__AttributeToken__Group_0__1__Impl : ( '::' ) ;
    public final void rule__AttributeToken__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3672:1: ( ( '::' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3673:1: ( '::' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3673:1: ( '::' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3674:1: '::'
            {
             before(grammarAccess.getAttributeTokenAccess().getColonColonKeyword_0_1()); 
            match(input,102,FOLLOW_102_in_rule__AttributeToken__Group_0__1__Impl7720); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3691:1: rule__AttributeArgumentClause__Group__0 : rule__AttributeArgumentClause__Group__0__Impl rule__AttributeArgumentClause__Group__1 ;
    public final void rule__AttributeArgumentClause__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3695:1: ( rule__AttributeArgumentClause__Group__0__Impl rule__AttributeArgumentClause__Group__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3696:2: rule__AttributeArgumentClause__Group__0__Impl rule__AttributeArgumentClause__Group__1
            {
            pushFollow(FOLLOW_rule__AttributeArgumentClause__Group__0__Impl_in_rule__AttributeArgumentClause__Group__07755);
            rule__AttributeArgumentClause__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AttributeArgumentClause__Group__1_in_rule__AttributeArgumentClause__Group__07758);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3703:1: rule__AttributeArgumentClause__Group__0__Impl : ( '(' ) ;
    public final void rule__AttributeArgumentClause__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3707:1: ( ( '(' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3708:1: ( '(' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3708:1: ( '(' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3709:1: '('
            {
             before(grammarAccess.getAttributeArgumentClauseAccess().getLeftParenthesisKeyword_0()); 
            match(input,106,FOLLOW_106_in_rule__AttributeArgumentClause__Group__0__Impl7786); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3722:1: rule__AttributeArgumentClause__Group__1 : rule__AttributeArgumentClause__Group__1__Impl rule__AttributeArgumentClause__Group__2 ;
    public final void rule__AttributeArgumentClause__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3726:1: ( rule__AttributeArgumentClause__Group__1__Impl rule__AttributeArgumentClause__Group__2 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3727:2: rule__AttributeArgumentClause__Group__1__Impl rule__AttributeArgumentClause__Group__2
            {
            pushFollow(FOLLOW_rule__AttributeArgumentClause__Group__1__Impl_in_rule__AttributeArgumentClause__Group__17817);
            rule__AttributeArgumentClause__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AttributeArgumentClause__Group__2_in_rule__AttributeArgumentClause__Group__17820);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3734:1: rule__AttributeArgumentClause__Group__1__Impl : ( ruleToken ) ;
    public final void rule__AttributeArgumentClause__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3738:1: ( ( ruleToken ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3739:1: ( ruleToken )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3739:1: ( ruleToken )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3740:1: ruleToken
            {
             before(grammarAccess.getAttributeArgumentClauseAccess().getTokenParserRuleCall_1()); 
            pushFollow(FOLLOW_ruleToken_in_rule__AttributeArgumentClause__Group__1__Impl7847);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3751:1: rule__AttributeArgumentClause__Group__2 : rule__AttributeArgumentClause__Group__2__Impl ;
    public final void rule__AttributeArgumentClause__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3755:1: ( rule__AttributeArgumentClause__Group__2__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3756:2: rule__AttributeArgumentClause__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__AttributeArgumentClause__Group__2__Impl_in_rule__AttributeArgumentClause__Group__27876);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3762:1: rule__AttributeArgumentClause__Group__2__Impl : ( ')' ) ;
    public final void rule__AttributeArgumentClause__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3766:1: ( ( ')' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3767:1: ( ')' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3767:1: ( ')' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3768:1: ')'
            {
             before(grammarAccess.getAttributeArgumentClauseAccess().getRightParenthesisKeyword_2()); 
            match(input,107,FOLLOW_107_in_rule__AttributeArgumentClause__Group__2__Impl7904); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3789:1: rule__InitDeclarator__Group__0 : rule__InitDeclarator__Group__0__Impl rule__InitDeclarator__Group__1 ;
    public final void rule__InitDeclarator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3793:1: ( rule__InitDeclarator__Group__0__Impl rule__InitDeclarator__Group__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3794:2: rule__InitDeclarator__Group__0__Impl rule__InitDeclarator__Group__1
            {
            pushFollow(FOLLOW_rule__InitDeclarator__Group__0__Impl_in_rule__InitDeclarator__Group__07943);
            rule__InitDeclarator__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__InitDeclarator__Group__1_in_rule__InitDeclarator__Group__07946);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3801:1: rule__InitDeclarator__Group__0__Impl : ( ruleDeclarator ) ;
    public final void rule__InitDeclarator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3805:1: ( ( ruleDeclarator ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3806:1: ( ruleDeclarator )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3806:1: ( ruleDeclarator )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3807:1: ruleDeclarator
            {
             before(grammarAccess.getInitDeclaratorAccess().getDeclaratorParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleDeclarator_in_rule__InitDeclarator__Group__0__Impl7973);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3818:1: rule__InitDeclarator__Group__1 : rule__InitDeclarator__Group__1__Impl ;
    public final void rule__InitDeclarator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3822:1: ( rule__InitDeclarator__Group__1__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3823:2: rule__InitDeclarator__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__InitDeclarator__Group__1__Impl_in_rule__InitDeclarator__Group__18002);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3829:1: rule__InitDeclarator__Group__1__Impl : ( ( ruleInitializer )? ) ;
    public final void rule__InitDeclarator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3833:1: ( ( ( ruleInitializer )? ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3834:1: ( ( ruleInitializer )? )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3834:1: ( ( ruleInitializer )? )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3835:1: ( ruleInitializer )?
            {
             before(grammarAccess.getInitDeclaratorAccess().getInitializerParserRuleCall_1()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3836:1: ( ruleInitializer )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==55) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3836:3: ruleInitializer
                    {
                    pushFollow(FOLLOW_ruleInitializer_in_rule__InitDeclarator__Group__1__Impl8030);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3850:1: rule__Declarator__Group_0__0 : rule__Declarator__Group_0__0__Impl rule__Declarator__Group_0__1 ;
    public final void rule__Declarator__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3854:1: ( rule__Declarator__Group_0__0__Impl rule__Declarator__Group_0__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3855:2: rule__Declarator__Group_0__0__Impl rule__Declarator__Group_0__1
            {
            pushFollow(FOLLOW_rule__Declarator__Group_0__0__Impl_in_rule__Declarator__Group_0__08065);
            rule__Declarator__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Declarator__Group_0__1_in_rule__Declarator__Group_0__08068);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3862:1: rule__Declarator__Group_0__0__Impl : ( ( ( rulePtrOperator ) ) ( ( rulePtrOperator )* ) ) ;
    public final void rule__Declarator__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3866:1: ( ( ( ( rulePtrOperator ) ) ( ( rulePtrOperator )* ) ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3867:1: ( ( ( rulePtrOperator ) ) ( ( rulePtrOperator )* ) )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3867:1: ( ( ( rulePtrOperator ) ) ( ( rulePtrOperator )* ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3868:1: ( ( rulePtrOperator ) ) ( ( rulePtrOperator )* )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3868:1: ( ( rulePtrOperator ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3869:1: ( rulePtrOperator )
            {
             before(grammarAccess.getDeclaratorAccess().getPtrOperatorParserRuleCall_0_0()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3870:1: ( rulePtrOperator )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3870:3: rulePtrOperator
            {
            pushFollow(FOLLOW_rulePtrOperator_in_rule__Declarator__Group_0__0__Impl8098);
            rulePtrOperator();

            state._fsp--;


            }

             after(grammarAccess.getDeclaratorAccess().getPtrOperatorParserRuleCall_0_0()); 

            }

            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3873:1: ( ( rulePtrOperator )* )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3874:1: ( rulePtrOperator )*
            {
             before(grammarAccess.getDeclaratorAccess().getPtrOperatorParserRuleCall_0_0()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3875:1: ( rulePtrOperator )*
            loop39:
            do {
                int alt39=2;
                switch ( input.LA(1) ) {
                case 102:
                    {
                    int LA39_2 = input.LA(2);

                    if ( (LA39_2==43) ) {
                        int LA39_3 = input.LA(3);

                        if ( (LA39_3==66) ) {
                            alt39=1;
                        }


                    }


                    }
                    break;
                case 43:
                    {
                    int LA39_3 = input.LA(2);

                    if ( (LA39_3==66) ) {
                        alt39=1;
                    }


                    }
                    break;
                case 60:
                case 61:
                case 66:
                    {
                    alt39=1;
                    }
                    break;

                }

                switch (alt39) {
            	case 1 :
            	    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3875:3: rulePtrOperator
            	    {
            	    pushFollow(FOLLOW_rulePtrOperator_in_rule__Declarator__Group_0__0__Impl8111);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3886:1: rule__Declarator__Group_0__1 : rule__Declarator__Group_0__1__Impl ;
    public final void rule__Declarator__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3890:1: ( rule__Declarator__Group_0__1__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3891:2: rule__Declarator__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Declarator__Group_0__1__Impl_in_rule__Declarator__Group_0__18144);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3897:1: rule__Declarator__Group_0__1__Impl : ( ruleNoptrDeclarator ) ;
    public final void rule__Declarator__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3901:1: ( ( ruleNoptrDeclarator ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3902:1: ( ruleNoptrDeclarator )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3902:1: ( ruleNoptrDeclarator )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3903:1: ruleNoptrDeclarator
            {
             before(grammarAccess.getDeclaratorAccess().getNoptrDeclaratorParserRuleCall_0_1()); 
            pushFollow(FOLLOW_ruleNoptrDeclarator_in_rule__Declarator__Group_0__1__Impl8171);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3918:1: rule__Declarator__Group_1__0 : rule__Declarator__Group_1__0__Impl rule__Declarator__Group_1__1 ;
    public final void rule__Declarator__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3922:1: ( rule__Declarator__Group_1__0__Impl rule__Declarator__Group_1__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3923:2: rule__Declarator__Group_1__0__Impl rule__Declarator__Group_1__1
            {
            pushFollow(FOLLOW_rule__Declarator__Group_1__0__Impl_in_rule__Declarator__Group_1__08204);
            rule__Declarator__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Declarator__Group_1__1_in_rule__Declarator__Group_1__08207);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3930:1: rule__Declarator__Group_1__0__Impl : ( ruleNoptrDeclarator ) ;
    public final void rule__Declarator__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3934:1: ( ( ruleNoptrDeclarator ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3935:1: ( ruleNoptrDeclarator )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3935:1: ( ruleNoptrDeclarator )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3936:1: ruleNoptrDeclarator
            {
             before(grammarAccess.getDeclaratorAccess().getNoptrDeclaratorParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleNoptrDeclarator_in_rule__Declarator__Group_1__0__Impl8234);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3947:1: rule__Declarator__Group_1__1 : rule__Declarator__Group_1__1__Impl ;
    public final void rule__Declarator__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3951:1: ( rule__Declarator__Group_1__1__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3952:2: rule__Declarator__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Declarator__Group_1__1__Impl_in_rule__Declarator__Group_1__18263);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3958:1: rule__Declarator__Group_1__1__Impl : ( ( rule__Declarator__Group_1_1__0 )? ) ;
    public final void rule__Declarator__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3962:1: ( ( ( rule__Declarator__Group_1_1__0 )? ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3963:1: ( ( rule__Declarator__Group_1_1__0 )? )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3963:1: ( ( rule__Declarator__Group_1_1__0 )? )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3964:1: ( rule__Declarator__Group_1_1__0 )?
            {
             before(grammarAccess.getDeclaratorAccess().getGroup_1_1()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3965:1: ( rule__Declarator__Group_1_1__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==106) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3965:2: rule__Declarator__Group_1_1__0
                    {
                    pushFollow(FOLLOW_rule__Declarator__Group_1_1__0_in_rule__Declarator__Group_1__1__Impl8290);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3979:1: rule__Declarator__Group_1_1__0 : rule__Declarator__Group_1_1__0__Impl rule__Declarator__Group_1_1__1 ;
    public final void rule__Declarator__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3983:1: ( rule__Declarator__Group_1_1__0__Impl rule__Declarator__Group_1_1__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3984:2: rule__Declarator__Group_1_1__0__Impl rule__Declarator__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__Declarator__Group_1_1__0__Impl_in_rule__Declarator__Group_1_1__08325);
            rule__Declarator__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Declarator__Group_1_1__1_in_rule__Declarator__Group_1_1__08328);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3991:1: rule__Declarator__Group_1_1__0__Impl : ( ruleParametersAndQualifiers ) ;
    public final void rule__Declarator__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3995:1: ( ( ruleParametersAndQualifiers ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3996:1: ( ruleParametersAndQualifiers )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3996:1: ( ruleParametersAndQualifiers )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:3997:1: ruleParametersAndQualifiers
            {
             before(grammarAccess.getDeclaratorAccess().getParametersAndQualifiersParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleParametersAndQualifiers_in_rule__Declarator__Group_1_1__0__Impl8355);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4008:1: rule__Declarator__Group_1_1__1 : rule__Declarator__Group_1_1__1__Impl ;
    public final void rule__Declarator__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4012:1: ( rule__Declarator__Group_1_1__1__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4013:2: rule__Declarator__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Declarator__Group_1_1__1__Impl_in_rule__Declarator__Group_1_1__18384);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4019:1: rule__Declarator__Group_1_1__1__Impl : ( ruleTrailingReturnType ) ;
    public final void rule__Declarator__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4023:1: ( ( ruleTrailingReturnType ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4024:1: ( ruleTrailingReturnType )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4024:1: ( ruleTrailingReturnType )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4025:1: ruleTrailingReturnType
            {
             before(grammarAccess.getDeclaratorAccess().getTrailingReturnTypeParserRuleCall_1_1_1()); 
            pushFollow(FOLLOW_ruleTrailingReturnType_in_rule__Declarator__Group_1_1__1__Impl8411);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4040:1: rule__PtrDeclarator__Group__0 : rule__PtrDeclarator__Group__0__Impl rule__PtrDeclarator__Group__1 ;
    public final void rule__PtrDeclarator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4044:1: ( rule__PtrDeclarator__Group__0__Impl rule__PtrDeclarator__Group__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4045:2: rule__PtrDeclarator__Group__0__Impl rule__PtrDeclarator__Group__1
            {
            pushFollow(FOLLOW_rule__PtrDeclarator__Group__0__Impl_in_rule__PtrDeclarator__Group__08444);
            rule__PtrDeclarator__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PtrDeclarator__Group__1_in_rule__PtrDeclarator__Group__08447);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4052:1: rule__PtrDeclarator__Group__0__Impl : ( ( rulePtrOperator )* ) ;
    public final void rule__PtrDeclarator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4056:1: ( ( ( rulePtrOperator )* ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4057:1: ( ( rulePtrOperator )* )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4057:1: ( ( rulePtrOperator )* )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4058:1: ( rulePtrOperator )*
            {
             before(grammarAccess.getPtrDeclaratorAccess().getPtrOperatorParserRuleCall_0()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4059:1: ( rulePtrOperator )*
            loop41:
            do {
                int alt41=2;
                switch ( input.LA(1) ) {
                case 102:
                    {
                    int LA41_2 = input.LA(2);

                    if ( (LA41_2==43) ) {
                        int LA41_3 = input.LA(3);

                        if ( (LA41_3==66) ) {
                            alt41=1;
                        }


                    }


                    }
                    break;
                case 43:
                    {
                    int LA41_3 = input.LA(2);

                    if ( (LA41_3==66) ) {
                        alt41=1;
                    }


                    }
                    break;
                case 60:
                case 61:
                case 66:
                    {
                    alt41=1;
                    }
                    break;

                }

                switch (alt41) {
            	case 1 :
            	    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4059:3: rulePtrOperator
            	    {
            	    pushFollow(FOLLOW_rulePtrOperator_in_rule__PtrDeclarator__Group__0__Impl8475);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4069:1: rule__PtrDeclarator__Group__1 : rule__PtrDeclarator__Group__1__Impl ;
    public final void rule__PtrDeclarator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4073:1: ( rule__PtrDeclarator__Group__1__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4074:2: rule__PtrDeclarator__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__PtrDeclarator__Group__1__Impl_in_rule__PtrDeclarator__Group__18506);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4080:1: rule__PtrDeclarator__Group__1__Impl : ( ruleNoptrDeclarator ) ;
    public final void rule__PtrDeclarator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4084:1: ( ( ruleNoptrDeclarator ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4085:1: ( ruleNoptrDeclarator )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4085:1: ( ruleNoptrDeclarator )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4086:1: ruleNoptrDeclarator
            {
             before(grammarAccess.getPtrDeclaratorAccess().getNoptrDeclaratorParserRuleCall_1()); 
            pushFollow(FOLLOW_ruleNoptrDeclarator_in_rule__PtrDeclarator__Group__1__Impl8533);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4101:1: rule__NoptrDeclarator__Group__0 : rule__NoptrDeclarator__Group__0__Impl rule__NoptrDeclarator__Group__1 ;
    public final void rule__NoptrDeclarator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4105:1: ( rule__NoptrDeclarator__Group__0__Impl rule__NoptrDeclarator__Group__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4106:2: rule__NoptrDeclarator__Group__0__Impl rule__NoptrDeclarator__Group__1
            {
            pushFollow(FOLLOW_rule__NoptrDeclarator__Group__0__Impl_in_rule__NoptrDeclarator__Group__08566);
            rule__NoptrDeclarator__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NoptrDeclarator__Group__1_in_rule__NoptrDeclarator__Group__08569);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4113:1: rule__NoptrDeclarator__Group__0__Impl : ( rule_NoptrDeclarator ) ;
    public final void rule__NoptrDeclarator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4117:1: ( ( rule_NoptrDeclarator ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4118:1: ( rule_NoptrDeclarator )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4118:1: ( rule_NoptrDeclarator )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4119:1: rule_NoptrDeclarator
            {
             before(grammarAccess.getNoptrDeclaratorAccess().get_NoptrDeclaratorParserRuleCall_0()); 
            pushFollow(FOLLOW_rule_NoptrDeclarator_in_rule__NoptrDeclarator__Group__0__Impl8596);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4130:1: rule__NoptrDeclarator__Group__1 : rule__NoptrDeclarator__Group__1__Impl ;
    public final void rule__NoptrDeclarator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4134:1: ( rule__NoptrDeclarator__Group__1__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4135:2: rule__NoptrDeclarator__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__NoptrDeclarator__Group__1__Impl_in_rule__NoptrDeclarator__Group__18625);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4141:1: rule__NoptrDeclarator__Group__1__Impl : ( ( rule__NoptrDeclarator )* ) ;
    public final void rule__NoptrDeclarator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4145:1: ( ( ( rule__NoptrDeclarator )* ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4146:1: ( ( rule__NoptrDeclarator )* )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4146:1: ( ( rule__NoptrDeclarator )* )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4147:1: ( rule__NoptrDeclarator )*
            {
             before(grammarAccess.getNoptrDeclaratorAccess().get__NoptrDeclaratorParserRuleCall_1()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4148:1: ( rule__NoptrDeclarator )*
            loop42:
            do {
                int alt42=2;
                alt42 = dfa42.predict(input);
                switch (alt42) {
            	case 1 :
            	    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4148:3: rule__NoptrDeclarator
            	    {
            	    pushFollow(FOLLOW_rule__NoptrDeclarator_in_rule__NoptrDeclarator__Group__1__Impl8653);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4162:1: rule___NoptrDeclarator__Group_0__0 : rule___NoptrDeclarator__Group_0__0__Impl rule___NoptrDeclarator__Group_0__1 ;
    public final void rule___NoptrDeclarator__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4166:1: ( rule___NoptrDeclarator__Group_0__0__Impl rule___NoptrDeclarator__Group_0__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4167:2: rule___NoptrDeclarator__Group_0__0__Impl rule___NoptrDeclarator__Group_0__1
            {
            pushFollow(FOLLOW_rule___NoptrDeclarator__Group_0__0__Impl_in_rule___NoptrDeclarator__Group_0__08688);
            rule___NoptrDeclarator__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule___NoptrDeclarator__Group_0__1_in_rule___NoptrDeclarator__Group_0__08691);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4174:1: rule___NoptrDeclarator__Group_0__0__Impl : ( ruleDeclaratorId ) ;
    public final void rule___NoptrDeclarator__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4178:1: ( ( ruleDeclaratorId ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4179:1: ( ruleDeclaratorId )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4179:1: ( ruleDeclaratorId )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4180:1: ruleDeclaratorId
            {
             before(grammarAccess.get_NoptrDeclaratorAccess().getDeclaratorIdParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleDeclaratorId_in_rule___NoptrDeclarator__Group_0__0__Impl8718);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4191:1: rule___NoptrDeclarator__Group_0__1 : rule___NoptrDeclarator__Group_0__1__Impl ;
    public final void rule___NoptrDeclarator__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4195:1: ( rule___NoptrDeclarator__Group_0__1__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4196:2: rule___NoptrDeclarator__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule___NoptrDeclarator__Group_0__1__Impl_in_rule___NoptrDeclarator__Group_0__18747);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4202:1: rule___NoptrDeclarator__Group_0__1__Impl : ( ( ruleAttributeSpecifier )* ) ;
    public final void rule___NoptrDeclarator__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4206:1: ( ( ( ruleAttributeSpecifier )* ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4207:1: ( ( ruleAttributeSpecifier )* )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4207:1: ( ( ruleAttributeSpecifier )* )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4208:1: ( ruleAttributeSpecifier )*
            {
             before(grammarAccess.get_NoptrDeclaratorAccess().getAttributeSpecifierParserRuleCall_0_1()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4209:1: ( ruleAttributeSpecifier )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==103) ) {
                    int LA43_2 = input.LA(2);

                    if ( (LA43_2==103) ) {
                        alt43=1;
                    }


                }
                else if ( (LA43_0==105) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4209:3: ruleAttributeSpecifier
            	    {
            	    pushFollow(FOLLOW_ruleAttributeSpecifier_in_rule___NoptrDeclarator__Group_0__1__Impl8775);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4223:1: rule___NoptrDeclarator__Group_1__0 : rule___NoptrDeclarator__Group_1__0__Impl rule___NoptrDeclarator__Group_1__1 ;
    public final void rule___NoptrDeclarator__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4227:1: ( rule___NoptrDeclarator__Group_1__0__Impl rule___NoptrDeclarator__Group_1__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4228:2: rule___NoptrDeclarator__Group_1__0__Impl rule___NoptrDeclarator__Group_1__1
            {
            pushFollow(FOLLOW_rule___NoptrDeclarator__Group_1__0__Impl_in_rule___NoptrDeclarator__Group_1__08810);
            rule___NoptrDeclarator__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule___NoptrDeclarator__Group_1__1_in_rule___NoptrDeclarator__Group_1__08813);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4235:1: rule___NoptrDeclarator__Group_1__0__Impl : ( '(' ) ;
    public final void rule___NoptrDeclarator__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4239:1: ( ( '(' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4240:1: ( '(' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4240:1: ( '(' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4241:1: '('
            {
             before(grammarAccess.get_NoptrDeclaratorAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,106,FOLLOW_106_in_rule___NoptrDeclarator__Group_1__0__Impl8841); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4254:1: rule___NoptrDeclarator__Group_1__1 : rule___NoptrDeclarator__Group_1__1__Impl rule___NoptrDeclarator__Group_1__2 ;
    public final void rule___NoptrDeclarator__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4258:1: ( rule___NoptrDeclarator__Group_1__1__Impl rule___NoptrDeclarator__Group_1__2 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4259:2: rule___NoptrDeclarator__Group_1__1__Impl rule___NoptrDeclarator__Group_1__2
            {
            pushFollow(FOLLOW_rule___NoptrDeclarator__Group_1__1__Impl_in_rule___NoptrDeclarator__Group_1__18872);
            rule___NoptrDeclarator__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule___NoptrDeclarator__Group_1__2_in_rule___NoptrDeclarator__Group_1__18875);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4266:1: rule___NoptrDeclarator__Group_1__1__Impl : ( rulePtrDeclarator ) ;
    public final void rule___NoptrDeclarator__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4270:1: ( ( rulePtrDeclarator ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4271:1: ( rulePtrDeclarator )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4271:1: ( rulePtrDeclarator )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4272:1: rulePtrDeclarator
            {
             before(grammarAccess.get_NoptrDeclaratorAccess().getPtrDeclaratorParserRuleCall_1_1()); 
            pushFollow(FOLLOW_rulePtrDeclarator_in_rule___NoptrDeclarator__Group_1__1__Impl8902);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4283:1: rule___NoptrDeclarator__Group_1__2 : rule___NoptrDeclarator__Group_1__2__Impl ;
    public final void rule___NoptrDeclarator__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4287:1: ( rule___NoptrDeclarator__Group_1__2__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4288:2: rule___NoptrDeclarator__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule___NoptrDeclarator__Group_1__2__Impl_in_rule___NoptrDeclarator__Group_1__28931);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4294:1: rule___NoptrDeclarator__Group_1__2__Impl : ( ')' ) ;
    public final void rule___NoptrDeclarator__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4298:1: ( ( ')' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4299:1: ( ')' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4299:1: ( ')' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4300:1: ')'
            {
             before(grammarAccess.get_NoptrDeclaratorAccess().getRightParenthesisKeyword_1_2()); 
            match(input,107,FOLLOW_107_in_rule___NoptrDeclarator__Group_1__2__Impl8959); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4319:1: rule____NoptrDeclarator__Group_1__0 : rule____NoptrDeclarator__Group_1__0__Impl rule____NoptrDeclarator__Group_1__1 ;
    public final void rule____NoptrDeclarator__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4323:1: ( rule____NoptrDeclarator__Group_1__0__Impl rule____NoptrDeclarator__Group_1__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4324:2: rule____NoptrDeclarator__Group_1__0__Impl rule____NoptrDeclarator__Group_1__1
            {
            pushFollow(FOLLOW_rule____NoptrDeclarator__Group_1__0__Impl_in_rule____NoptrDeclarator__Group_1__08996);
            rule____NoptrDeclarator__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule____NoptrDeclarator__Group_1__1_in_rule____NoptrDeclarator__Group_1__08999);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4331:1: rule____NoptrDeclarator__Group_1__0__Impl : ( '[' ) ;
    public final void rule____NoptrDeclarator__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4335:1: ( ( '[' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4336:1: ( '[' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4336:1: ( '[' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4337:1: '['
            {
             before(grammarAccess.get__NoptrDeclaratorAccess().getLeftSquareBracketKeyword_1_0()); 
            match(input,103,FOLLOW_103_in_rule____NoptrDeclarator__Group_1__0__Impl9027); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4350:1: rule____NoptrDeclarator__Group_1__1 : rule____NoptrDeclarator__Group_1__1__Impl rule____NoptrDeclarator__Group_1__2 ;
    public final void rule____NoptrDeclarator__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4354:1: ( rule____NoptrDeclarator__Group_1__1__Impl rule____NoptrDeclarator__Group_1__2 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4355:2: rule____NoptrDeclarator__Group_1__1__Impl rule____NoptrDeclarator__Group_1__2
            {
            pushFollow(FOLLOW_rule____NoptrDeclarator__Group_1__1__Impl_in_rule____NoptrDeclarator__Group_1__19058);
            rule____NoptrDeclarator__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule____NoptrDeclarator__Group_1__2_in_rule____NoptrDeclarator__Group_1__19061);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4362:1: rule____NoptrDeclarator__Group_1__1__Impl : ( ruleConstantExpression ) ;
    public final void rule____NoptrDeclarator__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4366:1: ( ( ruleConstantExpression ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4367:1: ( ruleConstantExpression )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4367:1: ( ruleConstantExpression )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4368:1: ruleConstantExpression
            {
             before(grammarAccess.get__NoptrDeclaratorAccess().getConstantExpressionParserRuleCall_1_1()); 
            pushFollow(FOLLOW_ruleConstantExpression_in_rule____NoptrDeclarator__Group_1__1__Impl9088);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4379:1: rule____NoptrDeclarator__Group_1__2 : rule____NoptrDeclarator__Group_1__2__Impl rule____NoptrDeclarator__Group_1__3 ;
    public final void rule____NoptrDeclarator__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4383:1: ( rule____NoptrDeclarator__Group_1__2__Impl rule____NoptrDeclarator__Group_1__3 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4384:2: rule____NoptrDeclarator__Group_1__2__Impl rule____NoptrDeclarator__Group_1__3
            {
            pushFollow(FOLLOW_rule____NoptrDeclarator__Group_1__2__Impl_in_rule____NoptrDeclarator__Group_1__29117);
            rule____NoptrDeclarator__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule____NoptrDeclarator__Group_1__3_in_rule____NoptrDeclarator__Group_1__29120);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4391:1: rule____NoptrDeclarator__Group_1__2__Impl : ( ']' ) ;
    public final void rule____NoptrDeclarator__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4395:1: ( ( ']' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4396:1: ( ']' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4396:1: ( ']' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4397:1: ']'
            {
             before(grammarAccess.get__NoptrDeclaratorAccess().getRightSquareBracketKeyword_1_2()); 
            match(input,104,FOLLOW_104_in_rule____NoptrDeclarator__Group_1__2__Impl9148); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4410:1: rule____NoptrDeclarator__Group_1__3 : rule____NoptrDeclarator__Group_1__3__Impl ;
    public final void rule____NoptrDeclarator__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4414:1: ( rule____NoptrDeclarator__Group_1__3__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4415:2: rule____NoptrDeclarator__Group_1__3__Impl
            {
            pushFollow(FOLLOW_rule____NoptrDeclarator__Group_1__3__Impl_in_rule____NoptrDeclarator__Group_1__39179);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4421:1: rule____NoptrDeclarator__Group_1__3__Impl : ( ( ruleAttributeSpecifier )* ) ;
    public final void rule____NoptrDeclarator__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4425:1: ( ( ( ruleAttributeSpecifier )* ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4426:1: ( ( ruleAttributeSpecifier )* )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4426:1: ( ( ruleAttributeSpecifier )* )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4427:1: ( ruleAttributeSpecifier )*
            {
             before(grammarAccess.get__NoptrDeclaratorAccess().getAttributeSpecifierParserRuleCall_1_3()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4428:1: ( ruleAttributeSpecifier )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==103) ) {
                    int LA44_2 = input.LA(2);

                    if ( (LA44_2==103) ) {
                        alt44=1;
                    }


                }
                else if ( (LA44_0==105) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4428:3: ruleAttributeSpecifier
            	    {
            	    pushFollow(FOLLOW_ruleAttributeSpecifier_in_rule____NoptrDeclarator__Group_1__3__Impl9207);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4446:1: rule__ParametersAndQualifiers__Group__0 : rule__ParametersAndQualifiers__Group__0__Impl rule__ParametersAndQualifiers__Group__1 ;
    public final void rule__ParametersAndQualifiers__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4450:1: ( rule__ParametersAndQualifiers__Group__0__Impl rule__ParametersAndQualifiers__Group__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4451:2: rule__ParametersAndQualifiers__Group__0__Impl rule__ParametersAndQualifiers__Group__1
            {
            pushFollow(FOLLOW_rule__ParametersAndQualifiers__Group__0__Impl_in_rule__ParametersAndQualifiers__Group__09246);
            rule__ParametersAndQualifiers__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParametersAndQualifiers__Group__1_in_rule__ParametersAndQualifiers__Group__09249);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4458:1: rule__ParametersAndQualifiers__Group__0__Impl : ( '(' ) ;
    public final void rule__ParametersAndQualifiers__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4462:1: ( ( '(' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4463:1: ( '(' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4463:1: ( '(' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4464:1: '('
            {
             before(grammarAccess.getParametersAndQualifiersAccess().getLeftParenthesisKeyword_0()); 
            match(input,106,FOLLOW_106_in_rule__ParametersAndQualifiers__Group__0__Impl9277); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4477:1: rule__ParametersAndQualifiers__Group__1 : rule__ParametersAndQualifiers__Group__1__Impl rule__ParametersAndQualifiers__Group__2 ;
    public final void rule__ParametersAndQualifiers__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4481:1: ( rule__ParametersAndQualifiers__Group__1__Impl rule__ParametersAndQualifiers__Group__2 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4482:2: rule__ParametersAndQualifiers__Group__1__Impl rule__ParametersAndQualifiers__Group__2
            {
            pushFollow(FOLLOW_rule__ParametersAndQualifiers__Group__1__Impl_in_rule__ParametersAndQualifiers__Group__19308);
            rule__ParametersAndQualifiers__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParametersAndQualifiers__Group__2_in_rule__ParametersAndQualifiers__Group__19311);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4489:1: rule__ParametersAndQualifiers__Group__1__Impl : ( ruleParameterDeclarationClause ) ;
    public final void rule__ParametersAndQualifiers__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4493:1: ( ( ruleParameterDeclarationClause ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4494:1: ( ruleParameterDeclarationClause )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4494:1: ( ruleParameterDeclarationClause )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4495:1: ruleParameterDeclarationClause
            {
             before(grammarAccess.getParametersAndQualifiersAccess().getParameterDeclarationClauseParserRuleCall_1()); 
            pushFollow(FOLLOW_ruleParameterDeclarationClause_in_rule__ParametersAndQualifiers__Group__1__Impl9338);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4506:1: rule__ParametersAndQualifiers__Group__2 : rule__ParametersAndQualifiers__Group__2__Impl rule__ParametersAndQualifiers__Group__3 ;
    public final void rule__ParametersAndQualifiers__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4510:1: ( rule__ParametersAndQualifiers__Group__2__Impl rule__ParametersAndQualifiers__Group__3 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4511:2: rule__ParametersAndQualifiers__Group__2__Impl rule__ParametersAndQualifiers__Group__3
            {
            pushFollow(FOLLOW_rule__ParametersAndQualifiers__Group__2__Impl_in_rule__ParametersAndQualifiers__Group__29367);
            rule__ParametersAndQualifiers__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParametersAndQualifiers__Group__3_in_rule__ParametersAndQualifiers__Group__29370);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4518:1: rule__ParametersAndQualifiers__Group__2__Impl : ( ')' ) ;
    public final void rule__ParametersAndQualifiers__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4522:1: ( ( ')' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4523:1: ( ')' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4523:1: ( ')' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4524:1: ')'
            {
             before(grammarAccess.getParametersAndQualifiersAccess().getRightParenthesisKeyword_2()); 
            match(input,107,FOLLOW_107_in_rule__ParametersAndQualifiers__Group__2__Impl9398); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4537:1: rule__ParametersAndQualifiers__Group__3 : rule__ParametersAndQualifiers__Group__3__Impl rule__ParametersAndQualifiers__Group__4 ;
    public final void rule__ParametersAndQualifiers__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4541:1: ( rule__ParametersAndQualifiers__Group__3__Impl rule__ParametersAndQualifiers__Group__4 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4542:2: rule__ParametersAndQualifiers__Group__3__Impl rule__ParametersAndQualifiers__Group__4
            {
            pushFollow(FOLLOW_rule__ParametersAndQualifiers__Group__3__Impl_in_rule__ParametersAndQualifiers__Group__39429);
            rule__ParametersAndQualifiers__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParametersAndQualifiers__Group__4_in_rule__ParametersAndQualifiers__Group__39432);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4549:1: rule__ParametersAndQualifiers__Group__3__Impl : ( ( ruleAttributeSpecifier )* ) ;
    public final void rule__ParametersAndQualifiers__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4553:1: ( ( ( ruleAttributeSpecifier )* ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4554:1: ( ( ruleAttributeSpecifier )* )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4554:1: ( ( ruleAttributeSpecifier )* )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4555:1: ( ruleAttributeSpecifier )*
            {
             before(grammarAccess.getParametersAndQualifiersAccess().getAttributeSpecifierParserRuleCall_3()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4556:1: ( ruleAttributeSpecifier )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==103) ) {
                    int LA45_2 = input.LA(2);

                    if ( (LA45_2==103) ) {
                        alt45=1;
                    }


                }
                else if ( (LA45_0==105) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4556:3: ruleAttributeSpecifier
            	    {
            	    pushFollow(FOLLOW_ruleAttributeSpecifier_in_rule__ParametersAndQualifiers__Group__3__Impl9460);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4566:1: rule__ParametersAndQualifiers__Group__4 : rule__ParametersAndQualifiers__Group__4__Impl rule__ParametersAndQualifiers__Group__5 ;
    public final void rule__ParametersAndQualifiers__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4570:1: ( rule__ParametersAndQualifiers__Group__4__Impl rule__ParametersAndQualifiers__Group__5 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4571:2: rule__ParametersAndQualifiers__Group__4__Impl rule__ParametersAndQualifiers__Group__5
            {
            pushFollow(FOLLOW_rule__ParametersAndQualifiers__Group__4__Impl_in_rule__ParametersAndQualifiers__Group__49491);
            rule__ParametersAndQualifiers__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParametersAndQualifiers__Group__5_in_rule__ParametersAndQualifiers__Group__49494);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4578:1: rule__ParametersAndQualifiers__Group__4__Impl : ( ( rule__ParametersAndQualifiers__Alternatives_4 )* ) ;
    public final void rule__ParametersAndQualifiers__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4582:1: ( ( ( rule__ParametersAndQualifiers__Alternatives_4 )* ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4583:1: ( ( rule__ParametersAndQualifiers__Alternatives_4 )* )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4583:1: ( ( rule__ParametersAndQualifiers__Alternatives_4 )* )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4584:1: ( rule__ParametersAndQualifiers__Alternatives_4 )*
            {
             before(grammarAccess.getParametersAndQualifiersAccess().getAlternatives_4()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4585:1: ( rule__ParametersAndQualifiers__Alternatives_4 )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( ((LA46_0>=58 && LA46_0<=59)) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4585:2: rule__ParametersAndQualifiers__Alternatives_4
            	    {
            	    pushFollow(FOLLOW_rule__ParametersAndQualifiers__Alternatives_4_in_rule__ParametersAndQualifiers__Group__4__Impl9521);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4595:1: rule__ParametersAndQualifiers__Group__5 : rule__ParametersAndQualifiers__Group__5__Impl rule__ParametersAndQualifiers__Group__6 ;
    public final void rule__ParametersAndQualifiers__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4599:1: ( rule__ParametersAndQualifiers__Group__5__Impl rule__ParametersAndQualifiers__Group__6 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4600:2: rule__ParametersAndQualifiers__Group__5__Impl rule__ParametersAndQualifiers__Group__6
            {
            pushFollow(FOLLOW_rule__ParametersAndQualifiers__Group__5__Impl_in_rule__ParametersAndQualifiers__Group__59552);
            rule__ParametersAndQualifiers__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParametersAndQualifiers__Group__6_in_rule__ParametersAndQualifiers__Group__59555);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4607:1: rule__ParametersAndQualifiers__Group__5__Impl : ( ( rule__ParametersAndQualifiers__Alternatives_5 )* ) ;
    public final void rule__ParametersAndQualifiers__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4611:1: ( ( ( rule__ParametersAndQualifiers__Alternatives_5 )* ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4612:1: ( ( rule__ParametersAndQualifiers__Alternatives_5 )* )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4612:1: ( ( rule__ParametersAndQualifiers__Alternatives_5 )* )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4613:1: ( rule__ParametersAndQualifiers__Alternatives_5 )*
            {
             before(grammarAccess.getParametersAndQualifiersAccess().getAlternatives_5()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4614:1: ( rule__ParametersAndQualifiers__Alternatives_5 )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( ((LA47_0>=60 && LA47_0<=61)) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4614:2: rule__ParametersAndQualifiers__Alternatives_5
            	    {
            	    pushFollow(FOLLOW_rule__ParametersAndQualifiers__Alternatives_5_in_rule__ParametersAndQualifiers__Group__5__Impl9582);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4624:1: rule__ParametersAndQualifiers__Group__6 : rule__ParametersAndQualifiers__Group__6__Impl ;
    public final void rule__ParametersAndQualifiers__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4628:1: ( rule__ParametersAndQualifiers__Group__6__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4629:2: rule__ParametersAndQualifiers__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__ParametersAndQualifiers__Group__6__Impl_in_rule__ParametersAndQualifiers__Group__69613);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4635:1: rule__ParametersAndQualifiers__Group__6__Impl : ( ( ruleExceptionSpecification )? ) ;
    public final void rule__ParametersAndQualifiers__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4639:1: ( ( ( ruleExceptionSpecification )? ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4640:1: ( ( ruleExceptionSpecification )? )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4640:1: ( ( ruleExceptionSpecification )? )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4641:1: ( ruleExceptionSpecification )?
            {
             before(grammarAccess.getParametersAndQualifiersAccess().getExceptionSpecificationParserRuleCall_6()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4642:1: ( ruleExceptionSpecification )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( ((LA48_0>=114 && LA48_0<=115)) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4642:3: ruleExceptionSpecification
                    {
                    pushFollow(FOLLOW_ruleExceptionSpecification_in_rule__ParametersAndQualifiers__Group__6__Impl9641);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4666:1: rule__TrailingReturnType__Group__0 : rule__TrailingReturnType__Group__0__Impl rule__TrailingReturnType__Group__1 ;
    public final void rule__TrailingReturnType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4670:1: ( rule__TrailingReturnType__Group__0__Impl rule__TrailingReturnType__Group__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4671:2: rule__TrailingReturnType__Group__0__Impl rule__TrailingReturnType__Group__1
            {
            pushFollow(FOLLOW_rule__TrailingReturnType__Group__0__Impl_in_rule__TrailingReturnType__Group__09686);
            rule__TrailingReturnType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TrailingReturnType__Group__1_in_rule__TrailingReturnType__Group__09689);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4678:1: rule__TrailingReturnType__Group__0__Impl : ( '->' ) ;
    public final void rule__TrailingReturnType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4682:1: ( ( '->' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4683:1: ( '->' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4683:1: ( '->' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4684:1: '->'
            {
             before(grammarAccess.getTrailingReturnTypeAccess().getHyphenMinusGreaterThanSignKeyword_0()); 
            match(input,97,FOLLOW_97_in_rule__TrailingReturnType__Group__0__Impl9717); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4697:1: rule__TrailingReturnType__Group__1 : rule__TrailingReturnType__Group__1__Impl rule__TrailingReturnType__Group__2 ;
    public final void rule__TrailingReturnType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4701:1: ( rule__TrailingReturnType__Group__1__Impl rule__TrailingReturnType__Group__2 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4702:2: rule__TrailingReturnType__Group__1__Impl rule__TrailingReturnType__Group__2
            {
            pushFollow(FOLLOW_rule__TrailingReturnType__Group__1__Impl_in_rule__TrailingReturnType__Group__19748);
            rule__TrailingReturnType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TrailingReturnType__Group__2_in_rule__TrailingReturnType__Group__19751);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4709:1: rule__TrailingReturnType__Group__1__Impl : ( ( ( ruleTrailingTypeSpecifier ) ) ( ( ruleTrailingTypeSpecifier )* ) ) ;
    public final void rule__TrailingReturnType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4713:1: ( ( ( ( ruleTrailingTypeSpecifier ) ) ( ( ruleTrailingTypeSpecifier )* ) ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4714:1: ( ( ( ruleTrailingTypeSpecifier ) ) ( ( ruleTrailingTypeSpecifier )* ) )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4714:1: ( ( ( ruleTrailingTypeSpecifier ) ) ( ( ruleTrailingTypeSpecifier )* ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4715:1: ( ( ruleTrailingTypeSpecifier ) ) ( ( ruleTrailingTypeSpecifier )* )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4715:1: ( ( ruleTrailingTypeSpecifier ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4716:1: ( ruleTrailingTypeSpecifier )
            {
             before(grammarAccess.getTrailingReturnTypeAccess().getTrailingTypeSpecifierParserRuleCall_1()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4717:1: ( ruleTrailingTypeSpecifier )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4717:3: ruleTrailingTypeSpecifier
            {
            pushFollow(FOLLOW_ruleTrailingTypeSpecifier_in_rule__TrailingReturnType__Group__1__Impl9781);
            ruleTrailingTypeSpecifier();

            state._fsp--;


            }

             after(grammarAccess.getTrailingReturnTypeAccess().getTrailingTypeSpecifierParserRuleCall_1()); 

            }

            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4720:1: ( ( ruleTrailingTypeSpecifier )* )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4721:1: ( ruleTrailingTypeSpecifier )*
            {
             before(grammarAccess.getTrailingReturnTypeAccess().getTrailingTypeSpecifierParserRuleCall_1()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4722:1: ( ruleTrailingTypeSpecifier )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==53) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4722:3: ruleTrailingTypeSpecifier
            	    {
            	    pushFollow(FOLLOW_ruleTrailingTypeSpecifier_in_rule__TrailingReturnType__Group__1__Impl9794);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4733:1: rule__TrailingReturnType__Group__2 : rule__TrailingReturnType__Group__2__Impl ;
    public final void rule__TrailingReturnType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4737:1: ( rule__TrailingReturnType__Group__2__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4738:2: rule__TrailingReturnType__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__TrailingReturnType__Group__2__Impl_in_rule__TrailingReturnType__Group__29827);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4744:1: rule__TrailingReturnType__Group__2__Impl : ( ( ruleAbstractDeclarator )? ) ;
    public final void rule__TrailingReturnType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4748:1: ( ( ( ruleAbstractDeclarator )? ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4749:1: ( ( ruleAbstractDeclarator )? )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4749:1: ( ( ruleAbstractDeclarator )? )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4750:1: ( ruleAbstractDeclarator )?
            {
             before(grammarAccess.getTrailingReturnTypeAccess().getAbstractDeclaratorParserRuleCall_2()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4751:1: ( ruleAbstractDeclarator )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==47) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4751:3: ruleAbstractDeclarator
                    {
                    pushFollow(FOLLOW_ruleAbstractDeclarator_in_rule__TrailingReturnType__Group__2__Impl9855);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4767:1: rule__PtrOperator__Group_0__0 : rule__PtrOperator__Group_0__0__Impl rule__PtrOperator__Group_0__1 ;
    public final void rule__PtrOperator__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4771:1: ( rule__PtrOperator__Group_0__0__Impl rule__PtrOperator__Group_0__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4772:2: rule__PtrOperator__Group_0__0__Impl rule__PtrOperator__Group_0__1
            {
            pushFollow(FOLLOW_rule__PtrOperator__Group_0__0__Impl_in_rule__PtrOperator__Group_0__09892);
            rule__PtrOperator__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PtrOperator__Group_0__1_in_rule__PtrOperator__Group_0__09895);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4779:1: rule__PtrOperator__Group_0__0__Impl : ( '*' ) ;
    public final void rule__PtrOperator__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4783:1: ( ( '*' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4784:1: ( '*' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4784:1: ( '*' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4785:1: '*'
            {
             before(grammarAccess.getPtrOperatorAccess().getAsteriskKeyword_0_0()); 
            match(input,66,FOLLOW_66_in_rule__PtrOperator__Group_0__0__Impl9923); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4798:1: rule__PtrOperator__Group_0__1 : rule__PtrOperator__Group_0__1__Impl rule__PtrOperator__Group_0__2 ;
    public final void rule__PtrOperator__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4802:1: ( rule__PtrOperator__Group_0__1__Impl rule__PtrOperator__Group_0__2 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4803:2: rule__PtrOperator__Group_0__1__Impl rule__PtrOperator__Group_0__2
            {
            pushFollow(FOLLOW_rule__PtrOperator__Group_0__1__Impl_in_rule__PtrOperator__Group_0__19954);
            rule__PtrOperator__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PtrOperator__Group_0__2_in_rule__PtrOperator__Group_0__19957);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4810:1: rule__PtrOperator__Group_0__1__Impl : ( ( ruleAttributeSpecifier )* ) ;
    public final void rule__PtrOperator__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4814:1: ( ( ( ruleAttributeSpecifier )* ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4815:1: ( ( ruleAttributeSpecifier )* )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4815:1: ( ( ruleAttributeSpecifier )* )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4816:1: ( ruleAttributeSpecifier )*
            {
             before(grammarAccess.getPtrOperatorAccess().getAttributeSpecifierParserRuleCall_0_1()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4817:1: ( ruleAttributeSpecifier )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==103||LA51_0==105) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4817:3: ruleAttributeSpecifier
            	    {
            	    pushFollow(FOLLOW_ruleAttributeSpecifier_in_rule__PtrOperator__Group_0__1__Impl9985);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4827:1: rule__PtrOperator__Group_0__2 : rule__PtrOperator__Group_0__2__Impl ;
    public final void rule__PtrOperator__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4831:1: ( rule__PtrOperator__Group_0__2__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4832:2: rule__PtrOperator__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__PtrOperator__Group_0__2__Impl_in_rule__PtrOperator__Group_0__210016);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4838:1: rule__PtrOperator__Group_0__2__Impl : ( ( rule__PtrOperator__Alternatives_0_2 )* ) ;
    public final void rule__PtrOperator__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4842:1: ( ( ( rule__PtrOperator__Alternatives_0_2 )* ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4843:1: ( ( rule__PtrOperator__Alternatives_0_2 )* )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4843:1: ( ( rule__PtrOperator__Alternatives_0_2 )* )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4844:1: ( rule__PtrOperator__Alternatives_0_2 )*
            {
             before(grammarAccess.getPtrOperatorAccess().getAlternatives_0_2()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4845:1: ( rule__PtrOperator__Alternatives_0_2 )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( ((LA52_0>=58 && LA52_0<=59)) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4845:2: rule__PtrOperator__Alternatives_0_2
            	    {
            	    pushFollow(FOLLOW_rule__PtrOperator__Alternatives_0_2_in_rule__PtrOperator__Group_0__2__Impl10043);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4861:1: rule__PtrOperator__Group_1__0 : rule__PtrOperator__Group_1__0__Impl rule__PtrOperator__Group_1__1 ;
    public final void rule__PtrOperator__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4865:1: ( rule__PtrOperator__Group_1__0__Impl rule__PtrOperator__Group_1__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4866:2: rule__PtrOperator__Group_1__0__Impl rule__PtrOperator__Group_1__1
            {
            pushFollow(FOLLOW_rule__PtrOperator__Group_1__0__Impl_in_rule__PtrOperator__Group_1__010080);
            rule__PtrOperator__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PtrOperator__Group_1__1_in_rule__PtrOperator__Group_1__010083);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4873:1: rule__PtrOperator__Group_1__0__Impl : ( '&' ) ;
    public final void rule__PtrOperator__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4877:1: ( ( '&' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4878:1: ( '&' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4878:1: ( '&' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4879:1: '&'
            {
             before(grammarAccess.getPtrOperatorAccess().getAmpersandKeyword_1_0()); 
            match(input,60,FOLLOW_60_in_rule__PtrOperator__Group_1__0__Impl10111); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4892:1: rule__PtrOperator__Group_1__1 : rule__PtrOperator__Group_1__1__Impl ;
    public final void rule__PtrOperator__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4896:1: ( rule__PtrOperator__Group_1__1__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4897:2: rule__PtrOperator__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__PtrOperator__Group_1__1__Impl_in_rule__PtrOperator__Group_1__110142);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4903:1: rule__PtrOperator__Group_1__1__Impl : ( ( ruleAttributeSpecifier )* ) ;
    public final void rule__PtrOperator__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4907:1: ( ( ( ruleAttributeSpecifier )* ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4908:1: ( ( ruleAttributeSpecifier )* )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4908:1: ( ( ruleAttributeSpecifier )* )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4909:1: ( ruleAttributeSpecifier )*
            {
             before(grammarAccess.getPtrOperatorAccess().getAttributeSpecifierParserRuleCall_1_1()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4910:1: ( ruleAttributeSpecifier )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==103||LA53_0==105) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4910:3: ruleAttributeSpecifier
            	    {
            	    pushFollow(FOLLOW_ruleAttributeSpecifier_in_rule__PtrOperator__Group_1__1__Impl10170);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4924:1: rule__PtrOperator__Group_2__0 : rule__PtrOperator__Group_2__0__Impl rule__PtrOperator__Group_2__1 ;
    public final void rule__PtrOperator__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4928:1: ( rule__PtrOperator__Group_2__0__Impl rule__PtrOperator__Group_2__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4929:2: rule__PtrOperator__Group_2__0__Impl rule__PtrOperator__Group_2__1
            {
            pushFollow(FOLLOW_rule__PtrOperator__Group_2__0__Impl_in_rule__PtrOperator__Group_2__010205);
            rule__PtrOperator__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PtrOperator__Group_2__1_in_rule__PtrOperator__Group_2__010208);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4936:1: rule__PtrOperator__Group_2__0__Impl : ( '&&' ) ;
    public final void rule__PtrOperator__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4940:1: ( ( '&&' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4941:1: ( '&&' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4941:1: ( '&&' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4942:1: '&&'
            {
             before(grammarAccess.getPtrOperatorAccess().getAmpersandAmpersandKeyword_2_0()); 
            match(input,61,FOLLOW_61_in_rule__PtrOperator__Group_2__0__Impl10236); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4955:1: rule__PtrOperator__Group_2__1 : rule__PtrOperator__Group_2__1__Impl ;
    public final void rule__PtrOperator__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4959:1: ( rule__PtrOperator__Group_2__1__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4960:2: rule__PtrOperator__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__PtrOperator__Group_2__1__Impl_in_rule__PtrOperator__Group_2__110267);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4966:1: rule__PtrOperator__Group_2__1__Impl : ( ( ruleAttributeSpecifier )* ) ;
    public final void rule__PtrOperator__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4970:1: ( ( ( ruleAttributeSpecifier )* ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4971:1: ( ( ruleAttributeSpecifier )* )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4971:1: ( ( ruleAttributeSpecifier )* )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4972:1: ( ruleAttributeSpecifier )*
            {
             before(grammarAccess.getPtrOperatorAccess().getAttributeSpecifierParserRuleCall_2_1()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4973:1: ( ruleAttributeSpecifier )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==103||LA54_0==105) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4973:3: ruleAttributeSpecifier
            	    {
            	    pushFollow(FOLLOW_ruleAttributeSpecifier_in_rule__PtrOperator__Group_2__1__Impl10295);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4987:1: rule__PtrOperator__Group_3__0 : rule__PtrOperator__Group_3__0__Impl rule__PtrOperator__Group_3__1 ;
    public final void rule__PtrOperator__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4991:1: ( rule__PtrOperator__Group_3__0__Impl rule__PtrOperator__Group_3__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4992:2: rule__PtrOperator__Group_3__0__Impl rule__PtrOperator__Group_3__1
            {
            pushFollow(FOLLOW_rule__PtrOperator__Group_3__0__Impl_in_rule__PtrOperator__Group_3__010330);
            rule__PtrOperator__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PtrOperator__Group_3__1_in_rule__PtrOperator__Group_3__010333);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:4999:1: rule__PtrOperator__Group_3__0__Impl : ( ( '::' )? ) ;
    public final void rule__PtrOperator__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5003:1: ( ( ( '::' )? ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5004:1: ( ( '::' )? )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5004:1: ( ( '::' )? )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5005:1: ( '::' )?
            {
             before(grammarAccess.getPtrOperatorAccess().getColonColonKeyword_3_0()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5006:1: ( '::' )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==102) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5007:2: '::'
                    {
                    match(input,102,FOLLOW_102_in_rule__PtrOperator__Group_3__0__Impl10362); 

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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5018:1: rule__PtrOperator__Group_3__1 : rule__PtrOperator__Group_3__1__Impl rule__PtrOperator__Group_3__2 ;
    public final void rule__PtrOperator__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5022:1: ( rule__PtrOperator__Group_3__1__Impl rule__PtrOperator__Group_3__2 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5023:2: rule__PtrOperator__Group_3__1__Impl rule__PtrOperator__Group_3__2
            {
            pushFollow(FOLLOW_rule__PtrOperator__Group_3__1__Impl_in_rule__PtrOperator__Group_3__110395);
            rule__PtrOperator__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PtrOperator__Group_3__2_in_rule__PtrOperator__Group_3__110398);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5030:1: rule__PtrOperator__Group_3__1__Impl : ( ruleNestedNameSpecifier ) ;
    public final void rule__PtrOperator__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5034:1: ( ( ruleNestedNameSpecifier ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5035:1: ( ruleNestedNameSpecifier )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5035:1: ( ruleNestedNameSpecifier )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5036:1: ruleNestedNameSpecifier
            {
             before(grammarAccess.getPtrOperatorAccess().getNestedNameSpecifierParserRuleCall_3_1()); 
            pushFollow(FOLLOW_ruleNestedNameSpecifier_in_rule__PtrOperator__Group_3__1__Impl10425);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5047:1: rule__PtrOperator__Group_3__2 : rule__PtrOperator__Group_3__2__Impl rule__PtrOperator__Group_3__3 ;
    public final void rule__PtrOperator__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5051:1: ( rule__PtrOperator__Group_3__2__Impl rule__PtrOperator__Group_3__3 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5052:2: rule__PtrOperator__Group_3__2__Impl rule__PtrOperator__Group_3__3
            {
            pushFollow(FOLLOW_rule__PtrOperator__Group_3__2__Impl_in_rule__PtrOperator__Group_3__210454);
            rule__PtrOperator__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PtrOperator__Group_3__3_in_rule__PtrOperator__Group_3__210457);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5059:1: rule__PtrOperator__Group_3__2__Impl : ( '*' ) ;
    public final void rule__PtrOperator__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5063:1: ( ( '*' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5064:1: ( '*' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5064:1: ( '*' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5065:1: '*'
            {
             before(grammarAccess.getPtrOperatorAccess().getAsteriskKeyword_3_2()); 
            match(input,66,FOLLOW_66_in_rule__PtrOperator__Group_3__2__Impl10485); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5078:1: rule__PtrOperator__Group_3__3 : rule__PtrOperator__Group_3__3__Impl rule__PtrOperator__Group_3__4 ;
    public final void rule__PtrOperator__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5082:1: ( rule__PtrOperator__Group_3__3__Impl rule__PtrOperator__Group_3__4 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5083:2: rule__PtrOperator__Group_3__3__Impl rule__PtrOperator__Group_3__4
            {
            pushFollow(FOLLOW_rule__PtrOperator__Group_3__3__Impl_in_rule__PtrOperator__Group_3__310516);
            rule__PtrOperator__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PtrOperator__Group_3__4_in_rule__PtrOperator__Group_3__310519);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5090:1: rule__PtrOperator__Group_3__3__Impl : ( ( ruleAttributeSpecifier )* ) ;
    public final void rule__PtrOperator__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5094:1: ( ( ( ruleAttributeSpecifier )* ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5095:1: ( ( ruleAttributeSpecifier )* )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5095:1: ( ( ruleAttributeSpecifier )* )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5096:1: ( ruleAttributeSpecifier )*
            {
             before(grammarAccess.getPtrOperatorAccess().getAttributeSpecifierParserRuleCall_3_3()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5097:1: ( ruleAttributeSpecifier )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==103||LA56_0==105) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5097:3: ruleAttributeSpecifier
            	    {
            	    pushFollow(FOLLOW_ruleAttributeSpecifier_in_rule__PtrOperator__Group_3__3__Impl10547);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5107:1: rule__PtrOperator__Group_3__4 : rule__PtrOperator__Group_3__4__Impl ;
    public final void rule__PtrOperator__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5111:1: ( rule__PtrOperator__Group_3__4__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5112:2: rule__PtrOperator__Group_3__4__Impl
            {
            pushFollow(FOLLOW_rule__PtrOperator__Group_3__4__Impl_in_rule__PtrOperator__Group_3__410578);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5118:1: rule__PtrOperator__Group_3__4__Impl : ( ( rule__PtrOperator__Alternatives_3_4 )* ) ;
    public final void rule__PtrOperator__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5122:1: ( ( ( rule__PtrOperator__Alternatives_3_4 )* ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5123:1: ( ( rule__PtrOperator__Alternatives_3_4 )* )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5123:1: ( ( rule__PtrOperator__Alternatives_3_4 )* )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5124:1: ( rule__PtrOperator__Alternatives_3_4 )*
            {
             before(grammarAccess.getPtrOperatorAccess().getAlternatives_3_4()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5125:1: ( rule__PtrOperator__Alternatives_3_4 )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( ((LA57_0>=58 && LA57_0<=59)) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5125:2: rule__PtrOperator__Alternatives_3_4
            	    {
            	    pushFollow(FOLLOW_rule__PtrOperator__Alternatives_3_4_in_rule__PtrOperator__Group_3__4__Impl10605);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5145:1: rule__DeclaratorId__Group_0__0 : rule__DeclaratorId__Group_0__0__Impl rule__DeclaratorId__Group_0__1 ;
    public final void rule__DeclaratorId__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5149:1: ( rule__DeclaratorId__Group_0__0__Impl rule__DeclaratorId__Group_0__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5150:2: rule__DeclaratorId__Group_0__0__Impl rule__DeclaratorId__Group_0__1
            {
            pushFollow(FOLLOW_rule__DeclaratorId__Group_0__0__Impl_in_rule__DeclaratorId__Group_0__010646);
            rule__DeclaratorId__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DeclaratorId__Group_0__1_in_rule__DeclaratorId__Group_0__010649);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5157:1: rule__DeclaratorId__Group_0__0__Impl : ( ( '...' )? ) ;
    public final void rule__DeclaratorId__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5161:1: ( ( ( '...' )? ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5162:1: ( ( '...' )? )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5162:1: ( ( '...' )? )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5163:1: ( '...' )?
            {
             before(grammarAccess.getDeclaratorIdAccess().getFullStopFullStopFullStopKeyword_0_0()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5164:1: ( '...' )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==100) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5165:2: '...'
                    {
                    match(input,100,FOLLOW_100_in_rule__DeclaratorId__Group_0__0__Impl10678); 

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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5176:1: rule__DeclaratorId__Group_0__1 : rule__DeclaratorId__Group_0__1__Impl ;
    public final void rule__DeclaratorId__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5180:1: ( rule__DeclaratorId__Group_0__1__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5181:2: rule__DeclaratorId__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__DeclaratorId__Group_0__1__Impl_in_rule__DeclaratorId__Group_0__110711);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5187:1: rule__DeclaratorId__Group_0__1__Impl : ( ruleIdExpression ) ;
    public final void rule__DeclaratorId__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5191:1: ( ( ruleIdExpression ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5192:1: ( ruleIdExpression )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5192:1: ( ruleIdExpression )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5193:1: ruleIdExpression
            {
             before(grammarAccess.getDeclaratorIdAccess().getIdExpressionParserRuleCall_0_1()); 
            pushFollow(FOLLOW_ruleIdExpression_in_rule__DeclaratorId__Group_0__1__Impl10738);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5208:1: rule__DeclaratorId__Group_1__0 : rule__DeclaratorId__Group_1__0__Impl rule__DeclaratorId__Group_1__1 ;
    public final void rule__DeclaratorId__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5212:1: ( rule__DeclaratorId__Group_1__0__Impl rule__DeclaratorId__Group_1__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5213:2: rule__DeclaratorId__Group_1__0__Impl rule__DeclaratorId__Group_1__1
            {
            pushFollow(FOLLOW_rule__DeclaratorId__Group_1__0__Impl_in_rule__DeclaratorId__Group_1__010771);
            rule__DeclaratorId__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DeclaratorId__Group_1__1_in_rule__DeclaratorId__Group_1__010774);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5220:1: rule__DeclaratorId__Group_1__0__Impl : ( ( '::' )? ) ;
    public final void rule__DeclaratorId__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5224:1: ( ( ( '::' )? ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5225:1: ( ( '::' )? )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5225:1: ( ( '::' )? )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5226:1: ( '::' )?
            {
             before(grammarAccess.getDeclaratorIdAccess().getColonColonKeyword_1_0()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5227:1: ( '::' )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==102) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5228:2: '::'
                    {
                    match(input,102,FOLLOW_102_in_rule__DeclaratorId__Group_1__0__Impl10803); 

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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5239:1: rule__DeclaratorId__Group_1__1 : rule__DeclaratorId__Group_1__1__Impl rule__DeclaratorId__Group_1__2 ;
    public final void rule__DeclaratorId__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5243:1: ( rule__DeclaratorId__Group_1__1__Impl rule__DeclaratorId__Group_1__2 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5244:2: rule__DeclaratorId__Group_1__1__Impl rule__DeclaratorId__Group_1__2
            {
            pushFollow(FOLLOW_rule__DeclaratorId__Group_1__1__Impl_in_rule__DeclaratorId__Group_1__110836);
            rule__DeclaratorId__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DeclaratorId__Group_1__2_in_rule__DeclaratorId__Group_1__110839);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5251:1: rule__DeclaratorId__Group_1__1__Impl : ( ( ruleNestedNameSpecifier )? ) ;
    public final void rule__DeclaratorId__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5255:1: ( ( ( ruleNestedNameSpecifier )? ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5256:1: ( ( ruleNestedNameSpecifier )? )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5256:1: ( ( ruleNestedNameSpecifier )? )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5257:1: ( ruleNestedNameSpecifier )?
            {
             before(grammarAccess.getDeclaratorIdAccess().getNestedNameSpecifierParserRuleCall_1_1()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5258:1: ( ruleNestedNameSpecifier )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==43) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5258:3: ruleNestedNameSpecifier
                    {
                    pushFollow(FOLLOW_ruleNestedNameSpecifier_in_rule__DeclaratorId__Group_1__1__Impl10867);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5268:1: rule__DeclaratorId__Group_1__2 : rule__DeclaratorId__Group_1__2__Impl ;
    public final void rule__DeclaratorId__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5272:1: ( rule__DeclaratorId__Group_1__2__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5273:2: rule__DeclaratorId__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__DeclaratorId__Group_1__2__Impl_in_rule__DeclaratorId__Group_1__210898);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5279:1: rule__DeclaratorId__Group_1__2__Impl : ( ruleClassName ) ;
    public final void rule__DeclaratorId__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5283:1: ( ( ruleClassName ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5284:1: ( ruleClassName )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5284:1: ( ruleClassName )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5285:1: ruleClassName
            {
             before(grammarAccess.getDeclaratorIdAccess().getClassNameParserRuleCall_1_2()); 
            pushFollow(FOLLOW_ruleClassName_in_rule__DeclaratorId__Group_1__2__Impl10925);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5302:1: rule__OperatorFunctionId__Group__0 : rule__OperatorFunctionId__Group__0__Impl rule__OperatorFunctionId__Group__1 ;
    public final void rule__OperatorFunctionId__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5306:1: ( rule__OperatorFunctionId__Group__0__Impl rule__OperatorFunctionId__Group__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5307:2: rule__OperatorFunctionId__Group__0__Impl rule__OperatorFunctionId__Group__1
            {
            pushFollow(FOLLOW_rule__OperatorFunctionId__Group__0__Impl_in_rule__OperatorFunctionId__Group__010960);
            rule__OperatorFunctionId__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OperatorFunctionId__Group__1_in_rule__OperatorFunctionId__Group__010963);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5314:1: rule__OperatorFunctionId__Group__0__Impl : ( 'operator' ) ;
    public final void rule__OperatorFunctionId__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5318:1: ( ( 'operator' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5319:1: ( 'operator' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5319:1: ( 'operator' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5320:1: 'operator'
            {
             before(grammarAccess.getOperatorFunctionIdAccess().getOperatorKeyword_0()); 
            match(input,108,FOLLOW_108_in_rule__OperatorFunctionId__Group__0__Impl10991); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5333:1: rule__OperatorFunctionId__Group__1 : rule__OperatorFunctionId__Group__1__Impl rule__OperatorFunctionId__Group__2 ;
    public final void rule__OperatorFunctionId__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5337:1: ( rule__OperatorFunctionId__Group__1__Impl rule__OperatorFunctionId__Group__2 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5338:2: rule__OperatorFunctionId__Group__1__Impl rule__OperatorFunctionId__Group__2
            {
            pushFollow(FOLLOW_rule__OperatorFunctionId__Group__1__Impl_in_rule__OperatorFunctionId__Group__111022);
            rule__OperatorFunctionId__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OperatorFunctionId__Group__2_in_rule__OperatorFunctionId__Group__111025);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5345:1: rule__OperatorFunctionId__Group__1__Impl : ( ruleOverloadableOperator ) ;
    public final void rule__OperatorFunctionId__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5349:1: ( ( ruleOverloadableOperator ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5350:1: ( ruleOverloadableOperator )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5350:1: ( ruleOverloadableOperator )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5351:1: ruleOverloadableOperator
            {
             before(grammarAccess.getOperatorFunctionIdAccess().getOverloadableOperatorParserRuleCall_1()); 
            pushFollow(FOLLOW_ruleOverloadableOperator_in_rule__OperatorFunctionId__Group__1__Impl11052);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5362:1: rule__OperatorFunctionId__Group__2 : rule__OperatorFunctionId__Group__2__Impl ;
    public final void rule__OperatorFunctionId__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5366:1: ( rule__OperatorFunctionId__Group__2__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5367:2: rule__OperatorFunctionId__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__OperatorFunctionId__Group__2__Impl_in_rule__OperatorFunctionId__Group__211081);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5373:1: rule__OperatorFunctionId__Group__2__Impl : ( ( rule__OperatorFunctionId__Group_2__0 )? ) ;
    public final void rule__OperatorFunctionId__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5377:1: ( ( ( rule__OperatorFunctionId__Group_2__0 )? ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5378:1: ( ( rule__OperatorFunctionId__Group_2__0 )? )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5378:1: ( ( rule__OperatorFunctionId__Group_2__0 )? )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5379:1: ( rule__OperatorFunctionId__Group_2__0 )?
            {
             before(grammarAccess.getOperatorFunctionIdAccess().getGroup_2()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5380:1: ( rule__OperatorFunctionId__Group_2__0 )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==74) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5380:2: rule__OperatorFunctionId__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__OperatorFunctionId__Group_2__0_in_rule__OperatorFunctionId__Group__2__Impl11108);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5396:1: rule__OperatorFunctionId__Group_2__0 : rule__OperatorFunctionId__Group_2__0__Impl rule__OperatorFunctionId__Group_2__1 ;
    public final void rule__OperatorFunctionId__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5400:1: ( rule__OperatorFunctionId__Group_2__0__Impl rule__OperatorFunctionId__Group_2__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5401:2: rule__OperatorFunctionId__Group_2__0__Impl rule__OperatorFunctionId__Group_2__1
            {
            pushFollow(FOLLOW_rule__OperatorFunctionId__Group_2__0__Impl_in_rule__OperatorFunctionId__Group_2__011145);
            rule__OperatorFunctionId__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OperatorFunctionId__Group_2__1_in_rule__OperatorFunctionId__Group_2__011148);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5408:1: rule__OperatorFunctionId__Group_2__0__Impl : ( '<' ) ;
    public final void rule__OperatorFunctionId__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5412:1: ( ( '<' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5413:1: ( '<' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5413:1: ( '<' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5414:1: '<'
            {
             before(grammarAccess.getOperatorFunctionIdAccess().getLessThanSignKeyword_2_0()); 
            match(input,74,FOLLOW_74_in_rule__OperatorFunctionId__Group_2__0__Impl11176); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5427:1: rule__OperatorFunctionId__Group_2__1 : rule__OperatorFunctionId__Group_2__1__Impl rule__OperatorFunctionId__Group_2__2 ;
    public final void rule__OperatorFunctionId__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5431:1: ( rule__OperatorFunctionId__Group_2__1__Impl rule__OperatorFunctionId__Group_2__2 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5432:2: rule__OperatorFunctionId__Group_2__1__Impl rule__OperatorFunctionId__Group_2__2
            {
            pushFollow(FOLLOW_rule__OperatorFunctionId__Group_2__1__Impl_in_rule__OperatorFunctionId__Group_2__111207);
            rule__OperatorFunctionId__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OperatorFunctionId__Group_2__2_in_rule__OperatorFunctionId__Group_2__111210);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5439:1: rule__OperatorFunctionId__Group_2__1__Impl : ( ( ruleTemplateArgument )* ) ;
    public final void rule__OperatorFunctionId__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5443:1: ( ( ( ruleTemplateArgument )* ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5444:1: ( ( ruleTemplateArgument )* )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5444:1: ( ( ruleTemplateArgument )* )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5445:1: ( ruleTemplateArgument )*
            {
             before(grammarAccess.getOperatorFunctionIdAccess().getTemplateArgumentParserRuleCall_2_1()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5446:1: ( ruleTemplateArgument )*
            loop62:
            do {
                int alt62=2;
                int LA62_0 = input.LA(1);

                if ( ((LA62_0>=38 && LA62_0<=40)) ) {
                    alt62=1;
                }


                switch (alt62) {
            	case 1 :
            	    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5446:3: ruleTemplateArgument
            	    {
            	    pushFollow(FOLLOW_ruleTemplateArgument_in_rule__OperatorFunctionId__Group_2__1__Impl11238);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5456:1: rule__OperatorFunctionId__Group_2__2 : rule__OperatorFunctionId__Group_2__2__Impl ;
    public final void rule__OperatorFunctionId__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5460:1: ( rule__OperatorFunctionId__Group_2__2__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5461:2: rule__OperatorFunctionId__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__OperatorFunctionId__Group_2__2__Impl_in_rule__OperatorFunctionId__Group_2__211269);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5467:1: rule__OperatorFunctionId__Group_2__2__Impl : ( '>' ) ;
    public final void rule__OperatorFunctionId__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5471:1: ( ( '>' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5472:1: ( '>' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5472:1: ( '>' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5473:1: '>'
            {
             before(grammarAccess.getOperatorFunctionIdAccess().getGreaterThanSignKeyword_2_2()); 
            match(input,75,FOLLOW_75_in_rule__OperatorFunctionId__Group_2__2__Impl11297); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5492:1: rule__OverloadableOperator__Group_2__0 : rule__OverloadableOperator__Group_2__0__Impl rule__OverloadableOperator__Group_2__1 ;
    public final void rule__OverloadableOperator__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5496:1: ( rule__OverloadableOperator__Group_2__0__Impl rule__OverloadableOperator__Group_2__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5497:2: rule__OverloadableOperator__Group_2__0__Impl rule__OverloadableOperator__Group_2__1
            {
            pushFollow(FOLLOW_rule__OverloadableOperator__Group_2__0__Impl_in_rule__OverloadableOperator__Group_2__011334);
            rule__OverloadableOperator__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OverloadableOperator__Group_2__1_in_rule__OverloadableOperator__Group_2__011337);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5504:1: rule__OverloadableOperator__Group_2__0__Impl : ( 'new' ) ;
    public final void rule__OverloadableOperator__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5508:1: ( ( 'new' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5509:1: ( 'new' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5509:1: ( 'new' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5510:1: 'new'
            {
             before(grammarAccess.getOverloadableOperatorAccess().getNewKeyword_2_0()); 
            match(input,62,FOLLOW_62_in_rule__OverloadableOperator__Group_2__0__Impl11365); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5523:1: rule__OverloadableOperator__Group_2__1 : rule__OverloadableOperator__Group_2__1__Impl rule__OverloadableOperator__Group_2__2 ;
    public final void rule__OverloadableOperator__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5527:1: ( rule__OverloadableOperator__Group_2__1__Impl rule__OverloadableOperator__Group_2__2 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5528:2: rule__OverloadableOperator__Group_2__1__Impl rule__OverloadableOperator__Group_2__2
            {
            pushFollow(FOLLOW_rule__OverloadableOperator__Group_2__1__Impl_in_rule__OverloadableOperator__Group_2__111396);
            rule__OverloadableOperator__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OverloadableOperator__Group_2__2_in_rule__OverloadableOperator__Group_2__111399);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5535:1: rule__OverloadableOperator__Group_2__1__Impl : ( '[' ) ;
    public final void rule__OverloadableOperator__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5539:1: ( ( '[' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5540:1: ( '[' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5540:1: ( '[' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5541:1: '['
            {
             before(grammarAccess.getOverloadableOperatorAccess().getLeftSquareBracketKeyword_2_1()); 
            match(input,103,FOLLOW_103_in_rule__OverloadableOperator__Group_2__1__Impl11427); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5554:1: rule__OverloadableOperator__Group_2__2 : rule__OverloadableOperator__Group_2__2__Impl ;
    public final void rule__OverloadableOperator__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5558:1: ( rule__OverloadableOperator__Group_2__2__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5559:2: rule__OverloadableOperator__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__OverloadableOperator__Group_2__2__Impl_in_rule__OverloadableOperator__Group_2__211458);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5565:1: rule__OverloadableOperator__Group_2__2__Impl : ( ']' ) ;
    public final void rule__OverloadableOperator__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5569:1: ( ( ']' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5570:1: ( ']' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5570:1: ( ']' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5571:1: ']'
            {
             before(grammarAccess.getOverloadableOperatorAccess().getRightSquareBracketKeyword_2_2()); 
            match(input,104,FOLLOW_104_in_rule__OverloadableOperator__Group_2__2__Impl11486); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5590:1: rule__OverloadableOperator__Group_3__0 : rule__OverloadableOperator__Group_3__0__Impl rule__OverloadableOperator__Group_3__1 ;
    public final void rule__OverloadableOperator__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5594:1: ( rule__OverloadableOperator__Group_3__0__Impl rule__OverloadableOperator__Group_3__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5595:2: rule__OverloadableOperator__Group_3__0__Impl rule__OverloadableOperator__Group_3__1
            {
            pushFollow(FOLLOW_rule__OverloadableOperator__Group_3__0__Impl_in_rule__OverloadableOperator__Group_3__011523);
            rule__OverloadableOperator__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OverloadableOperator__Group_3__1_in_rule__OverloadableOperator__Group_3__011526);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5602:1: rule__OverloadableOperator__Group_3__0__Impl : ( 'delete' ) ;
    public final void rule__OverloadableOperator__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5606:1: ( ( 'delete' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5607:1: ( 'delete' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5607:1: ( 'delete' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5608:1: 'delete'
            {
             before(grammarAccess.getOverloadableOperatorAccess().getDeleteKeyword_3_0()); 
            match(input,63,FOLLOW_63_in_rule__OverloadableOperator__Group_3__0__Impl11554); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5621:1: rule__OverloadableOperator__Group_3__1 : rule__OverloadableOperator__Group_3__1__Impl rule__OverloadableOperator__Group_3__2 ;
    public final void rule__OverloadableOperator__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5625:1: ( rule__OverloadableOperator__Group_3__1__Impl rule__OverloadableOperator__Group_3__2 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5626:2: rule__OverloadableOperator__Group_3__1__Impl rule__OverloadableOperator__Group_3__2
            {
            pushFollow(FOLLOW_rule__OverloadableOperator__Group_3__1__Impl_in_rule__OverloadableOperator__Group_3__111585);
            rule__OverloadableOperator__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OverloadableOperator__Group_3__2_in_rule__OverloadableOperator__Group_3__111588);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5633:1: rule__OverloadableOperator__Group_3__1__Impl : ( '[' ) ;
    public final void rule__OverloadableOperator__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5637:1: ( ( '[' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5638:1: ( '[' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5638:1: ( '[' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5639:1: '['
            {
             before(grammarAccess.getOverloadableOperatorAccess().getLeftSquareBracketKeyword_3_1()); 
            match(input,103,FOLLOW_103_in_rule__OverloadableOperator__Group_3__1__Impl11616); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5652:1: rule__OverloadableOperator__Group_3__2 : rule__OverloadableOperator__Group_3__2__Impl ;
    public final void rule__OverloadableOperator__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5656:1: ( rule__OverloadableOperator__Group_3__2__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5657:2: rule__OverloadableOperator__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__OverloadableOperator__Group_3__2__Impl_in_rule__OverloadableOperator__Group_3__211647);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5663:1: rule__OverloadableOperator__Group_3__2__Impl : ( ']' ) ;
    public final void rule__OverloadableOperator__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5667:1: ( ( ']' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5668:1: ( ']' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5668:1: ( ']' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5669:1: ']'
            {
             before(grammarAccess.getOverloadableOperatorAccess().getRightSquareBracketKeyword_3_2()); 
            match(input,104,FOLLOW_104_in_rule__OverloadableOperator__Group_3__2__Impl11675); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5688:1: rule__LiteralOperatorId__Group__0 : rule__LiteralOperatorId__Group__0__Impl rule__LiteralOperatorId__Group__1 ;
    public final void rule__LiteralOperatorId__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5692:1: ( rule__LiteralOperatorId__Group__0__Impl rule__LiteralOperatorId__Group__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5693:2: rule__LiteralOperatorId__Group__0__Impl rule__LiteralOperatorId__Group__1
            {
            pushFollow(FOLLOW_rule__LiteralOperatorId__Group__0__Impl_in_rule__LiteralOperatorId__Group__011712);
            rule__LiteralOperatorId__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LiteralOperatorId__Group__1_in_rule__LiteralOperatorId__Group__011715);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5700:1: rule__LiteralOperatorId__Group__0__Impl : ( 'operator' ) ;
    public final void rule__LiteralOperatorId__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5704:1: ( ( 'operator' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5705:1: ( 'operator' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5705:1: ( 'operator' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5706:1: 'operator'
            {
             before(grammarAccess.getLiteralOperatorIdAccess().getOperatorKeyword_0()); 
            match(input,108,FOLLOW_108_in_rule__LiteralOperatorId__Group__0__Impl11743); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5719:1: rule__LiteralOperatorId__Group__1 : rule__LiteralOperatorId__Group__1__Impl rule__LiteralOperatorId__Group__2 ;
    public final void rule__LiteralOperatorId__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5723:1: ( rule__LiteralOperatorId__Group__1__Impl rule__LiteralOperatorId__Group__2 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5724:2: rule__LiteralOperatorId__Group__1__Impl rule__LiteralOperatorId__Group__2
            {
            pushFollow(FOLLOW_rule__LiteralOperatorId__Group__1__Impl_in_rule__LiteralOperatorId__Group__111774);
            rule__LiteralOperatorId__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LiteralOperatorId__Group__2_in_rule__LiteralOperatorId__Group__111777);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5731:1: rule__LiteralOperatorId__Group__1__Impl : ( '\"' ) ;
    public final void rule__LiteralOperatorId__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5735:1: ( ( '\"' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5736:1: ( '\"' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5736:1: ( '\"' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5737:1: '\"'
            {
             before(grammarAccess.getLiteralOperatorIdAccess().getQuotationMarkKeyword_1()); 
            match(input,109,FOLLOW_109_in_rule__LiteralOperatorId__Group__1__Impl11805); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5750:1: rule__LiteralOperatorId__Group__2 : rule__LiteralOperatorId__Group__2__Impl ;
    public final void rule__LiteralOperatorId__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5754:1: ( rule__LiteralOperatorId__Group__2__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5755:2: rule__LiteralOperatorId__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__LiteralOperatorId__Group__2__Impl_in_rule__LiteralOperatorId__Group__211836);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5761:1: rule__LiteralOperatorId__Group__2__Impl : ( '\"' ) ;
    public final void rule__LiteralOperatorId__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5765:1: ( ( '\"' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5766:1: ( '\"' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5766:1: ( '\"' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5767:1: '\"'
            {
             before(grammarAccess.getLiteralOperatorIdAccess().getQuotationMarkKeyword_2()); 
            match(input,109,FOLLOW_109_in_rule__LiteralOperatorId__Group__2__Impl11864); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5787:1: rule__TemplateParameterList__Group__0 : rule__TemplateParameterList__Group__0__Impl rule__TemplateParameterList__Group__1 ;
    public final void rule__TemplateParameterList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5791:1: ( rule__TemplateParameterList__Group__0__Impl rule__TemplateParameterList__Group__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5792:2: rule__TemplateParameterList__Group__0__Impl rule__TemplateParameterList__Group__1
            {
            pushFollow(FOLLOW_rule__TemplateParameterList__Group__0__Impl_in_rule__TemplateParameterList__Group__011902);
            rule__TemplateParameterList__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TemplateParameterList__Group__1_in_rule__TemplateParameterList__Group__011905);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5799:1: rule__TemplateParameterList__Group__0__Impl : ( ruleTemplateParameter ) ;
    public final void rule__TemplateParameterList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5803:1: ( ( ruleTemplateParameter ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5804:1: ( ruleTemplateParameter )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5804:1: ( ruleTemplateParameter )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5805:1: ruleTemplateParameter
            {
             before(grammarAccess.getTemplateParameterListAccess().getTemplateParameterParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleTemplateParameter_in_rule__TemplateParameterList__Group__0__Impl11932);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5816:1: rule__TemplateParameterList__Group__1 : rule__TemplateParameterList__Group__1__Impl ;
    public final void rule__TemplateParameterList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5820:1: ( rule__TemplateParameterList__Group__1__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5821:2: rule__TemplateParameterList__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__TemplateParameterList__Group__1__Impl_in_rule__TemplateParameterList__Group__111961);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5827:1: rule__TemplateParameterList__Group__1__Impl : ( ( rule__TemplateParameterList__Group_1__0 )* ) ;
    public final void rule__TemplateParameterList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5831:1: ( ( ( rule__TemplateParameterList__Group_1__0 )* ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5832:1: ( ( rule__TemplateParameterList__Group_1__0 )* )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5832:1: ( ( rule__TemplateParameterList__Group_1__0 )* )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5833:1: ( rule__TemplateParameterList__Group_1__0 )*
            {
             before(grammarAccess.getTemplateParameterListAccess().getGroup_1()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5834:1: ( rule__TemplateParameterList__Group_1__0 )*
            loop63:
            do {
                int alt63=2;
                int LA63_0 = input.LA(1);

                if ( (LA63_0==95) ) {
                    alt63=1;
                }


                switch (alt63) {
            	case 1 :
            	    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5834:2: rule__TemplateParameterList__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__TemplateParameterList__Group_1__0_in_rule__TemplateParameterList__Group__1__Impl11988);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5848:1: rule__TemplateParameterList__Group_1__0 : rule__TemplateParameterList__Group_1__0__Impl rule__TemplateParameterList__Group_1__1 ;
    public final void rule__TemplateParameterList__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5852:1: ( rule__TemplateParameterList__Group_1__0__Impl rule__TemplateParameterList__Group_1__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5853:2: rule__TemplateParameterList__Group_1__0__Impl rule__TemplateParameterList__Group_1__1
            {
            pushFollow(FOLLOW_rule__TemplateParameterList__Group_1__0__Impl_in_rule__TemplateParameterList__Group_1__012023);
            rule__TemplateParameterList__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TemplateParameterList__Group_1__1_in_rule__TemplateParameterList__Group_1__012026);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5860:1: rule__TemplateParameterList__Group_1__0__Impl : ( ',' ) ;
    public final void rule__TemplateParameterList__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5864:1: ( ( ',' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5865:1: ( ',' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5865:1: ( ',' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5866:1: ','
            {
             before(grammarAccess.getTemplateParameterListAccess().getCommaKeyword_1_0()); 
            match(input,95,FOLLOW_95_in_rule__TemplateParameterList__Group_1__0__Impl12054); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5879:1: rule__TemplateParameterList__Group_1__1 : rule__TemplateParameterList__Group_1__1__Impl ;
    public final void rule__TemplateParameterList__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5883:1: ( rule__TemplateParameterList__Group_1__1__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5884:2: rule__TemplateParameterList__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__TemplateParameterList__Group_1__1__Impl_in_rule__TemplateParameterList__Group_1__112085);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5890:1: rule__TemplateParameterList__Group_1__1__Impl : ( ruleTemplateParameter ) ;
    public final void rule__TemplateParameterList__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5894:1: ( ( ruleTemplateParameter ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5895:1: ( ruleTemplateParameter )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5895:1: ( ruleTemplateParameter )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5896:1: ruleTemplateParameter
            {
             before(grammarAccess.getTemplateParameterListAccess().getTemplateParameterParserRuleCall_1_1()); 
            pushFollow(FOLLOW_ruleTemplateParameter_in_rule__TemplateParameterList__Group_1__1__Impl12112);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5911:1: rule__TypeParameter__Group_0__0 : rule__TypeParameter__Group_0__0__Impl rule__TypeParameter__Group_0__1 ;
    public final void rule__TypeParameter__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5915:1: ( rule__TypeParameter__Group_0__0__Impl rule__TypeParameter__Group_0__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5916:2: rule__TypeParameter__Group_0__0__Impl rule__TypeParameter__Group_0__1
            {
            pushFollow(FOLLOW_rule__TypeParameter__Group_0__0__Impl_in_rule__TypeParameter__Group_0__012145);
            rule__TypeParameter__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeParameter__Group_0__1_in_rule__TypeParameter__Group_0__012148);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5923:1: rule__TypeParameter__Group_0__0__Impl : ( 'class' ) ;
    public final void rule__TypeParameter__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5927:1: ( ( 'class' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5928:1: ( 'class' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5928:1: ( 'class' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5929:1: 'class'
            {
             before(grammarAccess.getTypeParameterAccess().getClassKeyword_0_0()); 
            match(input,110,FOLLOW_110_in_rule__TypeParameter__Group_0__0__Impl12176); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5942:1: rule__TypeParameter__Group_0__1 : rule__TypeParameter__Group_0__1__Impl ;
    public final void rule__TypeParameter__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5946:1: ( rule__TypeParameter__Group_0__1__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5947:2: rule__TypeParameter__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__TypeParameter__Group_0__1__Impl_in_rule__TypeParameter__Group_0__112207);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5953:1: rule__TypeParameter__Group_0__1__Impl : ( ( rule__TypeParameter__Alternatives_0_1 ) ) ;
    public final void rule__TypeParameter__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5957:1: ( ( ( rule__TypeParameter__Alternatives_0_1 ) ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5958:1: ( ( rule__TypeParameter__Alternatives_0_1 ) )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5958:1: ( ( rule__TypeParameter__Alternatives_0_1 ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5959:1: ( rule__TypeParameter__Alternatives_0_1 )
            {
             before(grammarAccess.getTypeParameterAccess().getAlternatives_0_1()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5960:1: ( rule__TypeParameter__Alternatives_0_1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5960:2: rule__TypeParameter__Alternatives_0_1
            {
            pushFollow(FOLLOW_rule__TypeParameter__Alternatives_0_1_in_rule__TypeParameter__Group_0__1__Impl12234);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5974:1: rule__TypeParameter__Group_0_1_0__0 : rule__TypeParameter__Group_0_1_0__0__Impl rule__TypeParameter__Group_0_1_0__1 ;
    public final void rule__TypeParameter__Group_0_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5978:1: ( rule__TypeParameter__Group_0_1_0__0__Impl rule__TypeParameter__Group_0_1_0__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5979:2: rule__TypeParameter__Group_0_1_0__0__Impl rule__TypeParameter__Group_0_1_0__1
            {
            pushFollow(FOLLOW_rule__TypeParameter__Group_0_1_0__0__Impl_in_rule__TypeParameter__Group_0_1_0__012268);
            rule__TypeParameter__Group_0_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeParameter__Group_0_1_0__1_in_rule__TypeParameter__Group_0_1_0__012271);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5986:1: rule__TypeParameter__Group_0_1_0__0__Impl : ( ( '...' )? ) ;
    public final void rule__TypeParameter__Group_0_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5990:1: ( ( ( '...' )? ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5991:1: ( ( '...' )? )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5991:1: ( ( '...' )? )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5992:1: ( '...' )?
            {
             before(grammarAccess.getTypeParameterAccess().getFullStopFullStopFullStopKeyword_0_1_0_0()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5993:1: ( '...' )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==100) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:5994:2: '...'
                    {
                    match(input,100,FOLLOW_100_in_rule__TypeParameter__Group_0_1_0__0__Impl12300); 

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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6005:1: rule__TypeParameter__Group_0_1_0__1 : rule__TypeParameter__Group_0_1_0__1__Impl ;
    public final void rule__TypeParameter__Group_0_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6009:1: ( rule__TypeParameter__Group_0_1_0__1__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6010:2: rule__TypeParameter__Group_0_1_0__1__Impl
            {
            pushFollow(FOLLOW_rule__TypeParameter__Group_0_1_0__1__Impl_in_rule__TypeParameter__Group_0_1_0__112333);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6016:1: rule__TypeParameter__Group_0_1_0__1__Impl : ( ( RULE_ID )? ) ;
    public final void rule__TypeParameter__Group_0_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6020:1: ( ( ( RULE_ID )? ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6021:1: ( ( RULE_ID )? )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6021:1: ( ( RULE_ID )? )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6022:1: ( RULE_ID )?
            {
             before(grammarAccess.getTypeParameterAccess().getIDTerminalRuleCall_0_1_0_1()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6023:1: ( RULE_ID )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==RULE_ID) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6023:3: RULE_ID
                    {
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TypeParameter__Group_0_1_0__1__Impl12361); 

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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6037:1: rule__TypeParameter__Group_0_1_1__0 : rule__TypeParameter__Group_0_1_1__0__Impl rule__TypeParameter__Group_0_1_1__1 ;
    public final void rule__TypeParameter__Group_0_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6041:1: ( rule__TypeParameter__Group_0_1_1__0__Impl rule__TypeParameter__Group_0_1_1__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6042:2: rule__TypeParameter__Group_0_1_1__0__Impl rule__TypeParameter__Group_0_1_1__1
            {
            pushFollow(FOLLOW_rule__TypeParameter__Group_0_1_1__0__Impl_in_rule__TypeParameter__Group_0_1_1__012396);
            rule__TypeParameter__Group_0_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeParameter__Group_0_1_1__1_in_rule__TypeParameter__Group_0_1_1__012399);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6049:1: rule__TypeParameter__Group_0_1_1__0__Impl : ( ( RULE_ID )? ) ;
    public final void rule__TypeParameter__Group_0_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6053:1: ( ( ( RULE_ID )? ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6054:1: ( ( RULE_ID )? )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6054:1: ( ( RULE_ID )? )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6055:1: ( RULE_ID )?
            {
             before(grammarAccess.getTypeParameterAccess().getIDTerminalRuleCall_0_1_1_0()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6056:1: ( RULE_ID )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==RULE_ID) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6056:3: RULE_ID
                    {
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TypeParameter__Group_0_1_1__0__Impl12427); 

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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6066:1: rule__TypeParameter__Group_0_1_1__1 : rule__TypeParameter__Group_0_1_1__1__Impl rule__TypeParameter__Group_0_1_1__2 ;
    public final void rule__TypeParameter__Group_0_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6070:1: ( rule__TypeParameter__Group_0_1_1__1__Impl rule__TypeParameter__Group_0_1_1__2 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6071:2: rule__TypeParameter__Group_0_1_1__1__Impl rule__TypeParameter__Group_0_1_1__2
            {
            pushFollow(FOLLOW_rule__TypeParameter__Group_0_1_1__1__Impl_in_rule__TypeParameter__Group_0_1_1__112458);
            rule__TypeParameter__Group_0_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeParameter__Group_0_1_1__2_in_rule__TypeParameter__Group_0_1_1__112461);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6078:1: rule__TypeParameter__Group_0_1_1__1__Impl : ( '=' ) ;
    public final void rule__TypeParameter__Group_0_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6082:1: ( ( '=' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6083:1: ( '=' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6083:1: ( '=' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6084:1: '='
            {
             before(grammarAccess.getTypeParameterAccess().getEqualsSignKeyword_0_1_1_1()); 
            match(input,73,FOLLOW_73_in_rule__TypeParameter__Group_0_1_1__1__Impl12489); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6097:1: rule__TypeParameter__Group_0_1_1__2 : rule__TypeParameter__Group_0_1_1__2__Impl ;
    public final void rule__TypeParameter__Group_0_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6101:1: ( rule__TypeParameter__Group_0_1_1__2__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6102:2: rule__TypeParameter__Group_0_1_1__2__Impl
            {
            pushFollow(FOLLOW_rule__TypeParameter__Group_0_1_1__2__Impl_in_rule__TypeParameter__Group_0_1_1__212520);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6108:1: rule__TypeParameter__Group_0_1_1__2__Impl : ( ruleTypeId ) ;
    public final void rule__TypeParameter__Group_0_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6112:1: ( ( ruleTypeId ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6113:1: ( ruleTypeId )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6113:1: ( ruleTypeId )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6114:1: ruleTypeId
            {
             before(grammarAccess.getTypeParameterAccess().getTypeIdParserRuleCall_0_1_1_2()); 
            pushFollow(FOLLOW_ruleTypeId_in_rule__TypeParameter__Group_0_1_1__2__Impl12547);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6131:1: rule__TypeParameter__Group_1__0 : rule__TypeParameter__Group_1__0__Impl rule__TypeParameter__Group_1__1 ;
    public final void rule__TypeParameter__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6135:1: ( rule__TypeParameter__Group_1__0__Impl rule__TypeParameter__Group_1__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6136:2: rule__TypeParameter__Group_1__0__Impl rule__TypeParameter__Group_1__1
            {
            pushFollow(FOLLOW_rule__TypeParameter__Group_1__0__Impl_in_rule__TypeParameter__Group_1__012582);
            rule__TypeParameter__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeParameter__Group_1__1_in_rule__TypeParameter__Group_1__012585);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6143:1: rule__TypeParameter__Group_1__0__Impl : ( 'typename' ) ;
    public final void rule__TypeParameter__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6147:1: ( ( 'typename' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6148:1: ( 'typename' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6148:1: ( 'typename' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6149:1: 'typename'
            {
             before(grammarAccess.getTypeParameterAccess().getTypenameKeyword_1_0()); 
            match(input,111,FOLLOW_111_in_rule__TypeParameter__Group_1__0__Impl12613); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6162:1: rule__TypeParameter__Group_1__1 : rule__TypeParameter__Group_1__1__Impl ;
    public final void rule__TypeParameter__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6166:1: ( rule__TypeParameter__Group_1__1__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6167:2: rule__TypeParameter__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__TypeParameter__Group_1__1__Impl_in_rule__TypeParameter__Group_1__112644);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6173:1: rule__TypeParameter__Group_1__1__Impl : ( ( rule__TypeParameter__Alternatives_1_1 ) ) ;
    public final void rule__TypeParameter__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6177:1: ( ( ( rule__TypeParameter__Alternatives_1_1 ) ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6178:1: ( ( rule__TypeParameter__Alternatives_1_1 ) )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6178:1: ( ( rule__TypeParameter__Alternatives_1_1 ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6179:1: ( rule__TypeParameter__Alternatives_1_1 )
            {
             before(grammarAccess.getTypeParameterAccess().getAlternatives_1_1()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6180:1: ( rule__TypeParameter__Alternatives_1_1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6180:2: rule__TypeParameter__Alternatives_1_1
            {
            pushFollow(FOLLOW_rule__TypeParameter__Alternatives_1_1_in_rule__TypeParameter__Group_1__1__Impl12671);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6194:1: rule__TypeParameter__Group_1_1_0__0 : rule__TypeParameter__Group_1_1_0__0__Impl rule__TypeParameter__Group_1_1_0__1 ;
    public final void rule__TypeParameter__Group_1_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6198:1: ( rule__TypeParameter__Group_1_1_0__0__Impl rule__TypeParameter__Group_1_1_0__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6199:2: rule__TypeParameter__Group_1_1_0__0__Impl rule__TypeParameter__Group_1_1_0__1
            {
            pushFollow(FOLLOW_rule__TypeParameter__Group_1_1_0__0__Impl_in_rule__TypeParameter__Group_1_1_0__012705);
            rule__TypeParameter__Group_1_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeParameter__Group_1_1_0__1_in_rule__TypeParameter__Group_1_1_0__012708);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6206:1: rule__TypeParameter__Group_1_1_0__0__Impl : ( ( '...' )? ) ;
    public final void rule__TypeParameter__Group_1_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6210:1: ( ( ( '...' )? ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6211:1: ( ( '...' )? )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6211:1: ( ( '...' )? )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6212:1: ( '...' )?
            {
             before(grammarAccess.getTypeParameterAccess().getFullStopFullStopFullStopKeyword_1_1_0_0()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6213:1: ( '...' )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==100) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6214:2: '...'
                    {
                    match(input,100,FOLLOW_100_in_rule__TypeParameter__Group_1_1_0__0__Impl12737); 

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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6225:1: rule__TypeParameter__Group_1_1_0__1 : rule__TypeParameter__Group_1_1_0__1__Impl ;
    public final void rule__TypeParameter__Group_1_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6229:1: ( rule__TypeParameter__Group_1_1_0__1__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6230:2: rule__TypeParameter__Group_1_1_0__1__Impl
            {
            pushFollow(FOLLOW_rule__TypeParameter__Group_1_1_0__1__Impl_in_rule__TypeParameter__Group_1_1_0__112770);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6236:1: rule__TypeParameter__Group_1_1_0__1__Impl : ( ( RULE_ID )? ) ;
    public final void rule__TypeParameter__Group_1_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6240:1: ( ( ( RULE_ID )? ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6241:1: ( ( RULE_ID )? )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6241:1: ( ( RULE_ID )? )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6242:1: ( RULE_ID )?
            {
             before(grammarAccess.getTypeParameterAccess().getIDTerminalRuleCall_1_1_0_1()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6243:1: ( RULE_ID )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==RULE_ID) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6243:3: RULE_ID
                    {
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TypeParameter__Group_1_1_0__1__Impl12798); 

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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6257:1: rule__TypeParameter__Group_1_1_1__0 : rule__TypeParameter__Group_1_1_1__0__Impl rule__TypeParameter__Group_1_1_1__1 ;
    public final void rule__TypeParameter__Group_1_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6261:1: ( rule__TypeParameter__Group_1_1_1__0__Impl rule__TypeParameter__Group_1_1_1__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6262:2: rule__TypeParameter__Group_1_1_1__0__Impl rule__TypeParameter__Group_1_1_1__1
            {
            pushFollow(FOLLOW_rule__TypeParameter__Group_1_1_1__0__Impl_in_rule__TypeParameter__Group_1_1_1__012833);
            rule__TypeParameter__Group_1_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeParameter__Group_1_1_1__1_in_rule__TypeParameter__Group_1_1_1__012836);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6269:1: rule__TypeParameter__Group_1_1_1__0__Impl : ( ( RULE_ID )? ) ;
    public final void rule__TypeParameter__Group_1_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6273:1: ( ( ( RULE_ID )? ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6274:1: ( ( RULE_ID )? )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6274:1: ( ( RULE_ID )? )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6275:1: ( RULE_ID )?
            {
             before(grammarAccess.getTypeParameterAccess().getIDTerminalRuleCall_1_1_1_0()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6276:1: ( RULE_ID )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==RULE_ID) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6276:3: RULE_ID
                    {
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TypeParameter__Group_1_1_1__0__Impl12864); 

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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6286:1: rule__TypeParameter__Group_1_1_1__1 : rule__TypeParameter__Group_1_1_1__1__Impl rule__TypeParameter__Group_1_1_1__2 ;
    public final void rule__TypeParameter__Group_1_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6290:1: ( rule__TypeParameter__Group_1_1_1__1__Impl rule__TypeParameter__Group_1_1_1__2 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6291:2: rule__TypeParameter__Group_1_1_1__1__Impl rule__TypeParameter__Group_1_1_1__2
            {
            pushFollow(FOLLOW_rule__TypeParameter__Group_1_1_1__1__Impl_in_rule__TypeParameter__Group_1_1_1__112895);
            rule__TypeParameter__Group_1_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeParameter__Group_1_1_1__2_in_rule__TypeParameter__Group_1_1_1__112898);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6298:1: rule__TypeParameter__Group_1_1_1__1__Impl : ( '=' ) ;
    public final void rule__TypeParameter__Group_1_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6302:1: ( ( '=' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6303:1: ( '=' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6303:1: ( '=' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6304:1: '='
            {
             before(grammarAccess.getTypeParameterAccess().getEqualsSignKeyword_1_1_1_1()); 
            match(input,73,FOLLOW_73_in_rule__TypeParameter__Group_1_1_1__1__Impl12926); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6317:1: rule__TypeParameter__Group_1_1_1__2 : rule__TypeParameter__Group_1_1_1__2__Impl ;
    public final void rule__TypeParameter__Group_1_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6321:1: ( rule__TypeParameter__Group_1_1_1__2__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6322:2: rule__TypeParameter__Group_1_1_1__2__Impl
            {
            pushFollow(FOLLOW_rule__TypeParameter__Group_1_1_1__2__Impl_in_rule__TypeParameter__Group_1_1_1__212957);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6328:1: rule__TypeParameter__Group_1_1_1__2__Impl : ( ruleTypeId ) ;
    public final void rule__TypeParameter__Group_1_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6332:1: ( ( ruleTypeId ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6333:1: ( ruleTypeId )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6333:1: ( ruleTypeId )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6334:1: ruleTypeId
            {
             before(grammarAccess.getTypeParameterAccess().getTypeIdParserRuleCall_1_1_1_2()); 
            pushFollow(FOLLOW_ruleTypeId_in_rule__TypeParameter__Group_1_1_1__2__Impl12984);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6351:1: rule__TypeParameter__Group_2__0 : rule__TypeParameter__Group_2__0__Impl rule__TypeParameter__Group_2__1 ;
    public final void rule__TypeParameter__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6355:1: ( rule__TypeParameter__Group_2__0__Impl rule__TypeParameter__Group_2__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6356:2: rule__TypeParameter__Group_2__0__Impl rule__TypeParameter__Group_2__1
            {
            pushFollow(FOLLOW_rule__TypeParameter__Group_2__0__Impl_in_rule__TypeParameter__Group_2__013019);
            rule__TypeParameter__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeParameter__Group_2__1_in_rule__TypeParameter__Group_2__013022);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6363:1: rule__TypeParameter__Group_2__0__Impl : ( 'template' ) ;
    public final void rule__TypeParameter__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6367:1: ( ( 'template' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6368:1: ( 'template' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6368:1: ( 'template' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6369:1: 'template'
            {
             before(grammarAccess.getTypeParameterAccess().getTemplateKeyword_2_0()); 
            match(input,112,FOLLOW_112_in_rule__TypeParameter__Group_2__0__Impl13050); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6382:1: rule__TypeParameter__Group_2__1 : rule__TypeParameter__Group_2__1__Impl rule__TypeParameter__Group_2__2 ;
    public final void rule__TypeParameter__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6386:1: ( rule__TypeParameter__Group_2__1__Impl rule__TypeParameter__Group_2__2 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6387:2: rule__TypeParameter__Group_2__1__Impl rule__TypeParameter__Group_2__2
            {
            pushFollow(FOLLOW_rule__TypeParameter__Group_2__1__Impl_in_rule__TypeParameter__Group_2__113081);
            rule__TypeParameter__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeParameter__Group_2__2_in_rule__TypeParameter__Group_2__113084);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6394:1: rule__TypeParameter__Group_2__1__Impl : ( '<' ) ;
    public final void rule__TypeParameter__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6398:1: ( ( '<' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6399:1: ( '<' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6399:1: ( '<' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6400:1: '<'
            {
             before(grammarAccess.getTypeParameterAccess().getLessThanSignKeyword_2_1()); 
            match(input,74,FOLLOW_74_in_rule__TypeParameter__Group_2__1__Impl13112); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6413:1: rule__TypeParameter__Group_2__2 : rule__TypeParameter__Group_2__2__Impl rule__TypeParameter__Group_2__3 ;
    public final void rule__TypeParameter__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6417:1: ( rule__TypeParameter__Group_2__2__Impl rule__TypeParameter__Group_2__3 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6418:2: rule__TypeParameter__Group_2__2__Impl rule__TypeParameter__Group_2__3
            {
            pushFollow(FOLLOW_rule__TypeParameter__Group_2__2__Impl_in_rule__TypeParameter__Group_2__213143);
            rule__TypeParameter__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeParameter__Group_2__3_in_rule__TypeParameter__Group_2__213146);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6425:1: rule__TypeParameter__Group_2__2__Impl : ( ruleTemplateParameterList ) ;
    public final void rule__TypeParameter__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6429:1: ( ( ruleTemplateParameterList ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6430:1: ( ruleTemplateParameterList )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6430:1: ( ruleTemplateParameterList )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6431:1: ruleTemplateParameterList
            {
             before(grammarAccess.getTypeParameterAccess().getTemplateParameterListParserRuleCall_2_2()); 
            pushFollow(FOLLOW_ruleTemplateParameterList_in_rule__TypeParameter__Group_2__2__Impl13173);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6442:1: rule__TypeParameter__Group_2__3 : rule__TypeParameter__Group_2__3__Impl rule__TypeParameter__Group_2__4 ;
    public final void rule__TypeParameter__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6446:1: ( rule__TypeParameter__Group_2__3__Impl rule__TypeParameter__Group_2__4 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6447:2: rule__TypeParameter__Group_2__3__Impl rule__TypeParameter__Group_2__4
            {
            pushFollow(FOLLOW_rule__TypeParameter__Group_2__3__Impl_in_rule__TypeParameter__Group_2__313202);
            rule__TypeParameter__Group_2__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeParameter__Group_2__4_in_rule__TypeParameter__Group_2__313205);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6454:1: rule__TypeParameter__Group_2__3__Impl : ( '>' ) ;
    public final void rule__TypeParameter__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6458:1: ( ( '>' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6459:1: ( '>' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6459:1: ( '>' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6460:1: '>'
            {
             before(grammarAccess.getTypeParameterAccess().getGreaterThanSignKeyword_2_3()); 
            match(input,75,FOLLOW_75_in_rule__TypeParameter__Group_2__3__Impl13233); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6473:1: rule__TypeParameter__Group_2__4 : rule__TypeParameter__Group_2__4__Impl rule__TypeParameter__Group_2__5 ;
    public final void rule__TypeParameter__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6477:1: ( rule__TypeParameter__Group_2__4__Impl rule__TypeParameter__Group_2__5 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6478:2: rule__TypeParameter__Group_2__4__Impl rule__TypeParameter__Group_2__5
            {
            pushFollow(FOLLOW_rule__TypeParameter__Group_2__4__Impl_in_rule__TypeParameter__Group_2__413264);
            rule__TypeParameter__Group_2__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeParameter__Group_2__5_in_rule__TypeParameter__Group_2__413267);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6485:1: rule__TypeParameter__Group_2__4__Impl : ( 'class' ) ;
    public final void rule__TypeParameter__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6489:1: ( ( 'class' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6490:1: ( 'class' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6490:1: ( 'class' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6491:1: 'class'
            {
             before(grammarAccess.getTypeParameterAccess().getClassKeyword_2_4()); 
            match(input,110,FOLLOW_110_in_rule__TypeParameter__Group_2__4__Impl13295); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6504:1: rule__TypeParameter__Group_2__5 : rule__TypeParameter__Group_2__5__Impl ;
    public final void rule__TypeParameter__Group_2__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6508:1: ( rule__TypeParameter__Group_2__5__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6509:2: rule__TypeParameter__Group_2__5__Impl
            {
            pushFollow(FOLLOW_rule__TypeParameter__Group_2__5__Impl_in_rule__TypeParameter__Group_2__513326);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6515:1: rule__TypeParameter__Group_2__5__Impl : ( ( rule__TypeParameter__Alternatives_2_5 ) ) ;
    public final void rule__TypeParameter__Group_2__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6519:1: ( ( ( rule__TypeParameter__Alternatives_2_5 ) ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6520:1: ( ( rule__TypeParameter__Alternatives_2_5 ) )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6520:1: ( ( rule__TypeParameter__Alternatives_2_5 ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6521:1: ( rule__TypeParameter__Alternatives_2_5 )
            {
             before(grammarAccess.getTypeParameterAccess().getAlternatives_2_5()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6522:1: ( rule__TypeParameter__Alternatives_2_5 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6522:2: rule__TypeParameter__Alternatives_2_5
            {
            pushFollow(FOLLOW_rule__TypeParameter__Alternatives_2_5_in_rule__TypeParameter__Group_2__5__Impl13353);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6544:1: rule__TypeParameter__Group_2_5_0__0 : rule__TypeParameter__Group_2_5_0__0__Impl rule__TypeParameter__Group_2_5_0__1 ;
    public final void rule__TypeParameter__Group_2_5_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6548:1: ( rule__TypeParameter__Group_2_5_0__0__Impl rule__TypeParameter__Group_2_5_0__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6549:2: rule__TypeParameter__Group_2_5_0__0__Impl rule__TypeParameter__Group_2_5_0__1
            {
            pushFollow(FOLLOW_rule__TypeParameter__Group_2_5_0__0__Impl_in_rule__TypeParameter__Group_2_5_0__013395);
            rule__TypeParameter__Group_2_5_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeParameter__Group_2_5_0__1_in_rule__TypeParameter__Group_2_5_0__013398);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6556:1: rule__TypeParameter__Group_2_5_0__0__Impl : ( ( '...' )? ) ;
    public final void rule__TypeParameter__Group_2_5_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6560:1: ( ( ( '...' )? ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6561:1: ( ( '...' )? )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6561:1: ( ( '...' )? )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6562:1: ( '...' )?
            {
             before(grammarAccess.getTypeParameterAccess().getFullStopFullStopFullStopKeyword_2_5_0_0()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6563:1: ( '...' )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==100) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6564:2: '...'
                    {
                    match(input,100,FOLLOW_100_in_rule__TypeParameter__Group_2_5_0__0__Impl13427); 

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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6575:1: rule__TypeParameter__Group_2_5_0__1 : rule__TypeParameter__Group_2_5_0__1__Impl ;
    public final void rule__TypeParameter__Group_2_5_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6579:1: ( rule__TypeParameter__Group_2_5_0__1__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6580:2: rule__TypeParameter__Group_2_5_0__1__Impl
            {
            pushFollow(FOLLOW_rule__TypeParameter__Group_2_5_0__1__Impl_in_rule__TypeParameter__Group_2_5_0__113460);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6586:1: rule__TypeParameter__Group_2_5_0__1__Impl : ( ( RULE_ID )? ) ;
    public final void rule__TypeParameter__Group_2_5_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6590:1: ( ( ( RULE_ID )? ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6591:1: ( ( RULE_ID )? )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6591:1: ( ( RULE_ID )? )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6592:1: ( RULE_ID )?
            {
             before(grammarAccess.getTypeParameterAccess().getIDTerminalRuleCall_2_5_0_1()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6593:1: ( RULE_ID )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==RULE_ID) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6593:3: RULE_ID
                    {
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TypeParameter__Group_2_5_0__1__Impl13488); 

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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6607:1: rule__TypeParameter__Group_2_5_1__0 : rule__TypeParameter__Group_2_5_1__0__Impl rule__TypeParameter__Group_2_5_1__1 ;
    public final void rule__TypeParameter__Group_2_5_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6611:1: ( rule__TypeParameter__Group_2_5_1__0__Impl rule__TypeParameter__Group_2_5_1__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6612:2: rule__TypeParameter__Group_2_5_1__0__Impl rule__TypeParameter__Group_2_5_1__1
            {
            pushFollow(FOLLOW_rule__TypeParameter__Group_2_5_1__0__Impl_in_rule__TypeParameter__Group_2_5_1__013523);
            rule__TypeParameter__Group_2_5_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeParameter__Group_2_5_1__1_in_rule__TypeParameter__Group_2_5_1__013526);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6619:1: rule__TypeParameter__Group_2_5_1__0__Impl : ( ( RULE_ID )? ) ;
    public final void rule__TypeParameter__Group_2_5_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6623:1: ( ( ( RULE_ID )? ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6624:1: ( ( RULE_ID )? )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6624:1: ( ( RULE_ID )? )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6625:1: ( RULE_ID )?
            {
             before(grammarAccess.getTypeParameterAccess().getIDTerminalRuleCall_2_5_1_0()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6626:1: ( RULE_ID )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==RULE_ID) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6626:3: RULE_ID
                    {
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TypeParameter__Group_2_5_1__0__Impl13554); 

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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6636:1: rule__TypeParameter__Group_2_5_1__1 : rule__TypeParameter__Group_2_5_1__1__Impl rule__TypeParameter__Group_2_5_1__2 ;
    public final void rule__TypeParameter__Group_2_5_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6640:1: ( rule__TypeParameter__Group_2_5_1__1__Impl rule__TypeParameter__Group_2_5_1__2 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6641:2: rule__TypeParameter__Group_2_5_1__1__Impl rule__TypeParameter__Group_2_5_1__2
            {
            pushFollow(FOLLOW_rule__TypeParameter__Group_2_5_1__1__Impl_in_rule__TypeParameter__Group_2_5_1__113585);
            rule__TypeParameter__Group_2_5_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TypeParameter__Group_2_5_1__2_in_rule__TypeParameter__Group_2_5_1__113588);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6648:1: rule__TypeParameter__Group_2_5_1__1__Impl : ( '=' ) ;
    public final void rule__TypeParameter__Group_2_5_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6652:1: ( ( '=' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6653:1: ( '=' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6653:1: ( '=' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6654:1: '='
            {
             before(grammarAccess.getTypeParameterAccess().getEqualsSignKeyword_2_5_1_1()); 
            match(input,73,FOLLOW_73_in_rule__TypeParameter__Group_2_5_1__1__Impl13616); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6667:1: rule__TypeParameter__Group_2_5_1__2 : rule__TypeParameter__Group_2_5_1__2__Impl ;
    public final void rule__TypeParameter__Group_2_5_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6671:1: ( rule__TypeParameter__Group_2_5_1__2__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6672:2: rule__TypeParameter__Group_2_5_1__2__Impl
            {
            pushFollow(FOLLOW_rule__TypeParameter__Group_2_5_1__2__Impl_in_rule__TypeParameter__Group_2_5_1__213647);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6678:1: rule__TypeParameter__Group_2_5_1__2__Impl : ( ruleIdExpression ) ;
    public final void rule__TypeParameter__Group_2_5_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6682:1: ( ( ruleIdExpression ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6683:1: ( ruleIdExpression )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6683:1: ( ruleIdExpression )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6684:1: ruleIdExpression
            {
             before(grammarAccess.getTypeParameterAccess().getIdExpressionParserRuleCall_2_5_1_2()); 
            pushFollow(FOLLOW_ruleIdExpression_in_rule__TypeParameter__Group_2_5_1__2__Impl13674);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6701:1: rule__SimpleTemplateId__Group__0 : rule__SimpleTemplateId__Group__0__Impl rule__SimpleTemplateId__Group__1 ;
    public final void rule__SimpleTemplateId__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6705:1: ( rule__SimpleTemplateId__Group__0__Impl rule__SimpleTemplateId__Group__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6706:2: rule__SimpleTemplateId__Group__0__Impl rule__SimpleTemplateId__Group__1
            {
            pushFollow(FOLLOW_rule__SimpleTemplateId__Group__0__Impl_in_rule__SimpleTemplateId__Group__013709);
            rule__SimpleTemplateId__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleTemplateId__Group__1_in_rule__SimpleTemplateId__Group__013712);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6713:1: rule__SimpleTemplateId__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__SimpleTemplateId__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6717:1: ( ( RULE_ID ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6718:1: ( RULE_ID )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6718:1: ( RULE_ID )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6719:1: RULE_ID
            {
             before(grammarAccess.getSimpleTemplateIdAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SimpleTemplateId__Group__0__Impl13739); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6730:1: rule__SimpleTemplateId__Group__1 : rule__SimpleTemplateId__Group__1__Impl rule__SimpleTemplateId__Group__2 ;
    public final void rule__SimpleTemplateId__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6734:1: ( rule__SimpleTemplateId__Group__1__Impl rule__SimpleTemplateId__Group__2 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6735:2: rule__SimpleTemplateId__Group__1__Impl rule__SimpleTemplateId__Group__2
            {
            pushFollow(FOLLOW_rule__SimpleTemplateId__Group__1__Impl_in_rule__SimpleTemplateId__Group__113768);
            rule__SimpleTemplateId__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleTemplateId__Group__2_in_rule__SimpleTemplateId__Group__113771);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6742:1: rule__SimpleTemplateId__Group__1__Impl : ( '<' ) ;
    public final void rule__SimpleTemplateId__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6746:1: ( ( '<' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6747:1: ( '<' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6747:1: ( '<' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6748:1: '<'
            {
             before(grammarAccess.getSimpleTemplateIdAccess().getLessThanSignKeyword_1()); 
            match(input,74,FOLLOW_74_in_rule__SimpleTemplateId__Group__1__Impl13799); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6761:1: rule__SimpleTemplateId__Group__2 : rule__SimpleTemplateId__Group__2__Impl rule__SimpleTemplateId__Group__3 ;
    public final void rule__SimpleTemplateId__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6765:1: ( rule__SimpleTemplateId__Group__2__Impl rule__SimpleTemplateId__Group__3 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6766:2: rule__SimpleTemplateId__Group__2__Impl rule__SimpleTemplateId__Group__3
            {
            pushFollow(FOLLOW_rule__SimpleTemplateId__Group__2__Impl_in_rule__SimpleTemplateId__Group__213830);
            rule__SimpleTemplateId__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SimpleTemplateId__Group__3_in_rule__SimpleTemplateId__Group__213833);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6773:1: rule__SimpleTemplateId__Group__2__Impl : ( ruleTemplateArgumentList ) ;
    public final void rule__SimpleTemplateId__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6777:1: ( ( ruleTemplateArgumentList ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6778:1: ( ruleTemplateArgumentList )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6778:1: ( ruleTemplateArgumentList )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6779:1: ruleTemplateArgumentList
            {
             before(grammarAccess.getSimpleTemplateIdAccess().getTemplateArgumentListParserRuleCall_2()); 
            pushFollow(FOLLOW_ruleTemplateArgumentList_in_rule__SimpleTemplateId__Group__2__Impl13860);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6790:1: rule__SimpleTemplateId__Group__3 : rule__SimpleTemplateId__Group__3__Impl ;
    public final void rule__SimpleTemplateId__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6794:1: ( rule__SimpleTemplateId__Group__3__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6795:2: rule__SimpleTemplateId__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__SimpleTemplateId__Group__3__Impl_in_rule__SimpleTemplateId__Group__313889);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6801:1: rule__SimpleTemplateId__Group__3__Impl : ( '>' ) ;
    public final void rule__SimpleTemplateId__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6805:1: ( ( '>' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6806:1: ( '>' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6806:1: ( '>' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6807:1: '>'
            {
             before(grammarAccess.getSimpleTemplateIdAccess().getGreaterThanSignKeyword_3()); 
            match(input,75,FOLLOW_75_in_rule__SimpleTemplateId__Group__3__Impl13917); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6830:1: rule__TemplateArgumentList__Group__0 : rule__TemplateArgumentList__Group__0__Impl rule__TemplateArgumentList__Group__1 ;
    public final void rule__TemplateArgumentList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6834:1: ( rule__TemplateArgumentList__Group__0__Impl rule__TemplateArgumentList__Group__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6835:2: rule__TemplateArgumentList__Group__0__Impl rule__TemplateArgumentList__Group__1
            {
            pushFollow(FOLLOW_rule__TemplateArgumentList__Group__0__Impl_in_rule__TemplateArgumentList__Group__013958);
            rule__TemplateArgumentList__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TemplateArgumentList__Group__1_in_rule__TemplateArgumentList__Group__013961);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6842:1: rule__TemplateArgumentList__Group__0__Impl : ( ruleTemplateArgument ) ;
    public final void rule__TemplateArgumentList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6846:1: ( ( ruleTemplateArgument ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6847:1: ( ruleTemplateArgument )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6847:1: ( ruleTemplateArgument )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6848:1: ruleTemplateArgument
            {
             before(grammarAccess.getTemplateArgumentListAccess().getTemplateArgumentParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleTemplateArgument_in_rule__TemplateArgumentList__Group__0__Impl13988);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6859:1: rule__TemplateArgumentList__Group__1 : rule__TemplateArgumentList__Group__1__Impl rule__TemplateArgumentList__Group__2 ;
    public final void rule__TemplateArgumentList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6863:1: ( rule__TemplateArgumentList__Group__1__Impl rule__TemplateArgumentList__Group__2 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6864:2: rule__TemplateArgumentList__Group__1__Impl rule__TemplateArgumentList__Group__2
            {
            pushFollow(FOLLOW_rule__TemplateArgumentList__Group__1__Impl_in_rule__TemplateArgumentList__Group__114017);
            rule__TemplateArgumentList__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TemplateArgumentList__Group__2_in_rule__TemplateArgumentList__Group__114020);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6871:1: rule__TemplateArgumentList__Group__1__Impl : ( ( '...' )? ) ;
    public final void rule__TemplateArgumentList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6875:1: ( ( ( '...' )? ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6876:1: ( ( '...' )? )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6876:1: ( ( '...' )? )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6877:1: ( '...' )?
            {
             before(grammarAccess.getTemplateArgumentListAccess().getFullStopFullStopFullStopKeyword_1()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6878:1: ( '...' )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==100) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6879:2: '...'
                    {
                    match(input,100,FOLLOW_100_in_rule__TemplateArgumentList__Group__1__Impl14049); 

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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6890:1: rule__TemplateArgumentList__Group__2 : rule__TemplateArgumentList__Group__2__Impl ;
    public final void rule__TemplateArgumentList__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6894:1: ( rule__TemplateArgumentList__Group__2__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6895:2: rule__TemplateArgumentList__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__TemplateArgumentList__Group__2__Impl_in_rule__TemplateArgumentList__Group__214082);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6901:1: rule__TemplateArgumentList__Group__2__Impl : ( ( rule__TemplateArgumentList__Group_2__0 )* ) ;
    public final void rule__TemplateArgumentList__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6905:1: ( ( ( rule__TemplateArgumentList__Group_2__0 )* ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6906:1: ( ( rule__TemplateArgumentList__Group_2__0 )* )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6906:1: ( ( rule__TemplateArgumentList__Group_2__0 )* )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6907:1: ( rule__TemplateArgumentList__Group_2__0 )*
            {
             before(grammarAccess.getTemplateArgumentListAccess().getGroup_2()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6908:1: ( rule__TemplateArgumentList__Group_2__0 )*
            loop74:
            do {
                int alt74=2;
                int LA74_0 = input.LA(1);

                if ( (LA74_0==95) ) {
                    alt74=1;
                }


                switch (alt74) {
            	case 1 :
            	    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6908:2: rule__TemplateArgumentList__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__TemplateArgumentList__Group_2__0_in_rule__TemplateArgumentList__Group__2__Impl14109);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6924:1: rule__TemplateArgumentList__Group_2__0 : rule__TemplateArgumentList__Group_2__0__Impl rule__TemplateArgumentList__Group_2__1 ;
    public final void rule__TemplateArgumentList__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6928:1: ( rule__TemplateArgumentList__Group_2__0__Impl rule__TemplateArgumentList__Group_2__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6929:2: rule__TemplateArgumentList__Group_2__0__Impl rule__TemplateArgumentList__Group_2__1
            {
            pushFollow(FOLLOW_rule__TemplateArgumentList__Group_2__0__Impl_in_rule__TemplateArgumentList__Group_2__014146);
            rule__TemplateArgumentList__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TemplateArgumentList__Group_2__1_in_rule__TemplateArgumentList__Group_2__014149);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6936:1: rule__TemplateArgumentList__Group_2__0__Impl : ( ',' ) ;
    public final void rule__TemplateArgumentList__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6940:1: ( ( ',' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6941:1: ( ',' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6941:1: ( ',' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6942:1: ','
            {
             before(grammarAccess.getTemplateArgumentListAccess().getCommaKeyword_2_0()); 
            match(input,95,FOLLOW_95_in_rule__TemplateArgumentList__Group_2__0__Impl14177); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6955:1: rule__TemplateArgumentList__Group_2__1 : rule__TemplateArgumentList__Group_2__1__Impl rule__TemplateArgumentList__Group_2__2 ;
    public final void rule__TemplateArgumentList__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6959:1: ( rule__TemplateArgumentList__Group_2__1__Impl rule__TemplateArgumentList__Group_2__2 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6960:2: rule__TemplateArgumentList__Group_2__1__Impl rule__TemplateArgumentList__Group_2__2
            {
            pushFollow(FOLLOW_rule__TemplateArgumentList__Group_2__1__Impl_in_rule__TemplateArgumentList__Group_2__114208);
            rule__TemplateArgumentList__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TemplateArgumentList__Group_2__2_in_rule__TemplateArgumentList__Group_2__114211);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6967:1: rule__TemplateArgumentList__Group_2__1__Impl : ( ruleTemplateArgument ) ;
    public final void rule__TemplateArgumentList__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6971:1: ( ( ruleTemplateArgument ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6972:1: ( ruleTemplateArgument )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6972:1: ( ruleTemplateArgument )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6973:1: ruleTemplateArgument
            {
             before(grammarAccess.getTemplateArgumentListAccess().getTemplateArgumentParserRuleCall_2_1()); 
            pushFollow(FOLLOW_ruleTemplateArgument_in_rule__TemplateArgumentList__Group_2__1__Impl14238);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6984:1: rule__TemplateArgumentList__Group_2__2 : rule__TemplateArgumentList__Group_2__2__Impl ;
    public final void rule__TemplateArgumentList__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6988:1: ( rule__TemplateArgumentList__Group_2__2__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6989:2: rule__TemplateArgumentList__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__TemplateArgumentList__Group_2__2__Impl_in_rule__TemplateArgumentList__Group_2__214267);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6995:1: rule__TemplateArgumentList__Group_2__2__Impl : ( ( '...' )? ) ;
    public final void rule__TemplateArgumentList__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:6999:1: ( ( ( '...' )? ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7000:1: ( ( '...' )? )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7000:1: ( ( '...' )? )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7001:1: ( '...' )?
            {
             before(grammarAccess.getTemplateArgumentListAccess().getFullStopFullStopFullStopKeyword_2_2()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7002:1: ( '...' )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==100) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7003:2: '...'
                    {
                    match(input,100,FOLLOW_100_in_rule__TemplateArgumentList__Group_2__2__Impl14296); 

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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7026:1: rule__Handler__Group__0 : rule__Handler__Group__0__Impl rule__Handler__Group__1 ;
    public final void rule__Handler__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7030:1: ( rule__Handler__Group__0__Impl rule__Handler__Group__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7031:2: rule__Handler__Group__0__Impl rule__Handler__Group__1
            {
            pushFollow(FOLLOW_rule__Handler__Group__0__Impl_in_rule__Handler__Group__014341);
            rule__Handler__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Handler__Group__1_in_rule__Handler__Group__014344);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7038:1: rule__Handler__Group__0__Impl : ( 'catch' ) ;
    public final void rule__Handler__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7042:1: ( ( 'catch' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7043:1: ( 'catch' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7043:1: ( 'catch' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7044:1: 'catch'
            {
             before(grammarAccess.getHandlerAccess().getCatchKeyword_0()); 
            match(input,113,FOLLOW_113_in_rule__Handler__Group__0__Impl14372); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7057:1: rule__Handler__Group__1 : rule__Handler__Group__1__Impl rule__Handler__Group__2 ;
    public final void rule__Handler__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7061:1: ( rule__Handler__Group__1__Impl rule__Handler__Group__2 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7062:2: rule__Handler__Group__1__Impl rule__Handler__Group__2
            {
            pushFollow(FOLLOW_rule__Handler__Group__1__Impl_in_rule__Handler__Group__114403);
            rule__Handler__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Handler__Group__2_in_rule__Handler__Group__114406);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7069:1: rule__Handler__Group__1__Impl : ( '(' ) ;
    public final void rule__Handler__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7073:1: ( ( '(' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7074:1: ( '(' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7074:1: ( '(' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7075:1: '('
            {
             before(grammarAccess.getHandlerAccess().getLeftParenthesisKeyword_1()); 
            match(input,106,FOLLOW_106_in_rule__Handler__Group__1__Impl14434); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7088:1: rule__Handler__Group__2 : rule__Handler__Group__2__Impl rule__Handler__Group__3 ;
    public final void rule__Handler__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7092:1: ( rule__Handler__Group__2__Impl rule__Handler__Group__3 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7093:2: rule__Handler__Group__2__Impl rule__Handler__Group__3
            {
            pushFollow(FOLLOW_rule__Handler__Group__2__Impl_in_rule__Handler__Group__214465);
            rule__Handler__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Handler__Group__3_in_rule__Handler__Group__214468);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7100:1: rule__Handler__Group__2__Impl : ( ruleExceptionDeclaration ) ;
    public final void rule__Handler__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7104:1: ( ( ruleExceptionDeclaration ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7105:1: ( ruleExceptionDeclaration )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7105:1: ( ruleExceptionDeclaration )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7106:1: ruleExceptionDeclaration
            {
             before(grammarAccess.getHandlerAccess().getExceptionDeclarationParserRuleCall_2()); 
            pushFollow(FOLLOW_ruleExceptionDeclaration_in_rule__Handler__Group__2__Impl14495);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7117:1: rule__Handler__Group__3 : rule__Handler__Group__3__Impl rule__Handler__Group__4 ;
    public final void rule__Handler__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7121:1: ( rule__Handler__Group__3__Impl rule__Handler__Group__4 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7122:2: rule__Handler__Group__3__Impl rule__Handler__Group__4
            {
            pushFollow(FOLLOW_rule__Handler__Group__3__Impl_in_rule__Handler__Group__314524);
            rule__Handler__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Handler__Group__4_in_rule__Handler__Group__314527);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7129:1: rule__Handler__Group__3__Impl : ( ')' ) ;
    public final void rule__Handler__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7133:1: ( ( ')' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7134:1: ( ')' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7134:1: ( ')' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7135:1: ')'
            {
             before(grammarAccess.getHandlerAccess().getRightParenthesisKeyword_3()); 
            match(input,107,FOLLOW_107_in_rule__Handler__Group__3__Impl14555); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7148:1: rule__Handler__Group__4 : rule__Handler__Group__4__Impl ;
    public final void rule__Handler__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7152:1: ( rule__Handler__Group__4__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7153:2: rule__Handler__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Handler__Group__4__Impl_in_rule__Handler__Group__414586);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7159:1: rule__Handler__Group__4__Impl : ( ruleCompoundStatement ) ;
    public final void rule__Handler__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7163:1: ( ( ruleCompoundStatement ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7164:1: ( ruleCompoundStatement )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7164:1: ( ruleCompoundStatement )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7165:1: ruleCompoundStatement
            {
             before(grammarAccess.getHandlerAccess().getCompoundStatementParserRuleCall_4()); 
            pushFollow(FOLLOW_ruleCompoundStatement_in_rule__Handler__Group__4__Impl14613);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7186:1: rule__ExceptionDeclaration__Group_0__0 : rule__ExceptionDeclaration__Group_0__0__Impl rule__ExceptionDeclaration__Group_0__1 ;
    public final void rule__ExceptionDeclaration__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7190:1: ( rule__ExceptionDeclaration__Group_0__0__Impl rule__ExceptionDeclaration__Group_0__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7191:2: rule__ExceptionDeclaration__Group_0__0__Impl rule__ExceptionDeclaration__Group_0__1
            {
            pushFollow(FOLLOW_rule__ExceptionDeclaration__Group_0__0__Impl_in_rule__ExceptionDeclaration__Group_0__014652);
            rule__ExceptionDeclaration__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExceptionDeclaration__Group_0__1_in_rule__ExceptionDeclaration__Group_0__014655);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7198:1: rule__ExceptionDeclaration__Group_0__0__Impl : ( ( ruleAttributeSpecifier )* ) ;
    public final void rule__ExceptionDeclaration__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7202:1: ( ( ( ruleAttributeSpecifier )* ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7203:1: ( ( ruleAttributeSpecifier )* )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7203:1: ( ( ruleAttributeSpecifier )* )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7204:1: ( ruleAttributeSpecifier )*
            {
             before(grammarAccess.getExceptionDeclarationAccess().getAttributeSpecifierParserRuleCall_0_0()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7205:1: ( ruleAttributeSpecifier )*
            loop76:
            do {
                int alt76=2;
                int LA76_0 = input.LA(1);

                if ( (LA76_0==103||LA76_0==105) ) {
                    alt76=1;
                }


                switch (alt76) {
            	case 1 :
            	    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7205:3: ruleAttributeSpecifier
            	    {
            	    pushFollow(FOLLOW_ruleAttributeSpecifier_in_rule__ExceptionDeclaration__Group_0__0__Impl14683);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7215:1: rule__ExceptionDeclaration__Group_0__1 : rule__ExceptionDeclaration__Group_0__1__Impl rule__ExceptionDeclaration__Group_0__2 ;
    public final void rule__ExceptionDeclaration__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7219:1: ( rule__ExceptionDeclaration__Group_0__1__Impl rule__ExceptionDeclaration__Group_0__2 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7220:2: rule__ExceptionDeclaration__Group_0__1__Impl rule__ExceptionDeclaration__Group_0__2
            {
            pushFollow(FOLLOW_rule__ExceptionDeclaration__Group_0__1__Impl_in_rule__ExceptionDeclaration__Group_0__114714);
            rule__ExceptionDeclaration__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExceptionDeclaration__Group_0__2_in_rule__ExceptionDeclaration__Group_0__114717);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7227:1: rule__ExceptionDeclaration__Group_0__1__Impl : ( ( ( ruleTypeSpecifier ) ) ( ( ruleTypeSpecifier )* ) ) ;
    public final void rule__ExceptionDeclaration__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7231:1: ( ( ( ( ruleTypeSpecifier ) ) ( ( ruleTypeSpecifier )* ) ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7232:1: ( ( ( ruleTypeSpecifier ) ) ( ( ruleTypeSpecifier )* ) )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7232:1: ( ( ( ruleTypeSpecifier ) ) ( ( ruleTypeSpecifier )* ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7233:1: ( ( ruleTypeSpecifier ) ) ( ( ruleTypeSpecifier )* )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7233:1: ( ( ruleTypeSpecifier ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7234:1: ( ruleTypeSpecifier )
            {
             before(grammarAccess.getExceptionDeclarationAccess().getTypeSpecifierParserRuleCall_0_1()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7235:1: ( ruleTypeSpecifier )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7235:3: ruleTypeSpecifier
            {
            pushFollow(FOLLOW_ruleTypeSpecifier_in_rule__ExceptionDeclaration__Group_0__1__Impl14747);
            ruleTypeSpecifier();

            state._fsp--;


            }

             after(grammarAccess.getExceptionDeclarationAccess().getTypeSpecifierParserRuleCall_0_1()); 

            }

            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7238:1: ( ( ruleTypeSpecifier )* )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7239:1: ( ruleTypeSpecifier )*
            {
             before(grammarAccess.getExceptionDeclarationAccess().getTypeSpecifierParserRuleCall_0_1()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7240:1: ( ruleTypeSpecifier )*
            loop77:
            do {
                int alt77=2;
                int LA77_0 = input.LA(1);

                if ( (LA77_0==46) ) {
                    alt77=1;
                }


                switch (alt77) {
            	case 1 :
            	    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7240:3: ruleTypeSpecifier
            	    {
            	    pushFollow(FOLLOW_ruleTypeSpecifier_in_rule__ExceptionDeclaration__Group_0__1__Impl14760);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7251:1: rule__ExceptionDeclaration__Group_0__2 : rule__ExceptionDeclaration__Group_0__2__Impl ;
    public final void rule__ExceptionDeclaration__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7255:1: ( rule__ExceptionDeclaration__Group_0__2__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7256:2: rule__ExceptionDeclaration__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__ExceptionDeclaration__Group_0__2__Impl_in_rule__ExceptionDeclaration__Group_0__214793);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7262:1: rule__ExceptionDeclaration__Group_0__2__Impl : ( ( rule__ExceptionDeclaration__Alternatives_0_2 ) ) ;
    public final void rule__ExceptionDeclaration__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7266:1: ( ( ( rule__ExceptionDeclaration__Alternatives_0_2 ) ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7267:1: ( ( rule__ExceptionDeclaration__Alternatives_0_2 ) )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7267:1: ( ( rule__ExceptionDeclaration__Alternatives_0_2 ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7268:1: ( rule__ExceptionDeclaration__Alternatives_0_2 )
            {
             before(grammarAccess.getExceptionDeclarationAccess().getAlternatives_0_2()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7269:1: ( rule__ExceptionDeclaration__Alternatives_0_2 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7269:2: rule__ExceptionDeclaration__Alternatives_0_2
            {
            pushFollow(FOLLOW_rule__ExceptionDeclaration__Alternatives_0_2_in_rule__ExceptionDeclaration__Group_0__2__Impl14820);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7286:1: rule__DynamicExceptionSpecification__Group__0 : rule__DynamicExceptionSpecification__Group__0__Impl rule__DynamicExceptionSpecification__Group__1 ;
    public final void rule__DynamicExceptionSpecification__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7290:1: ( rule__DynamicExceptionSpecification__Group__0__Impl rule__DynamicExceptionSpecification__Group__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7291:2: rule__DynamicExceptionSpecification__Group__0__Impl rule__DynamicExceptionSpecification__Group__1
            {
            pushFollow(FOLLOW_rule__DynamicExceptionSpecification__Group__0__Impl_in_rule__DynamicExceptionSpecification__Group__014857);
            rule__DynamicExceptionSpecification__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DynamicExceptionSpecification__Group__1_in_rule__DynamicExceptionSpecification__Group__014860);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7298:1: rule__DynamicExceptionSpecification__Group__0__Impl : ( 'throw' ) ;
    public final void rule__DynamicExceptionSpecification__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7302:1: ( ( 'throw' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7303:1: ( 'throw' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7303:1: ( 'throw' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7304:1: 'throw'
            {
             before(grammarAccess.getDynamicExceptionSpecificationAccess().getThrowKeyword_0()); 
            match(input,114,FOLLOW_114_in_rule__DynamicExceptionSpecification__Group__0__Impl14888); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7317:1: rule__DynamicExceptionSpecification__Group__1 : rule__DynamicExceptionSpecification__Group__1__Impl rule__DynamicExceptionSpecification__Group__2 ;
    public final void rule__DynamicExceptionSpecification__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7321:1: ( rule__DynamicExceptionSpecification__Group__1__Impl rule__DynamicExceptionSpecification__Group__2 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7322:2: rule__DynamicExceptionSpecification__Group__1__Impl rule__DynamicExceptionSpecification__Group__2
            {
            pushFollow(FOLLOW_rule__DynamicExceptionSpecification__Group__1__Impl_in_rule__DynamicExceptionSpecification__Group__114919);
            rule__DynamicExceptionSpecification__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DynamicExceptionSpecification__Group__2_in_rule__DynamicExceptionSpecification__Group__114922);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7329:1: rule__DynamicExceptionSpecification__Group__1__Impl : ( '(' ) ;
    public final void rule__DynamicExceptionSpecification__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7333:1: ( ( '(' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7334:1: ( '(' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7334:1: ( '(' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7335:1: '('
            {
             before(grammarAccess.getDynamicExceptionSpecificationAccess().getLeftParenthesisKeyword_1()); 
            match(input,106,FOLLOW_106_in_rule__DynamicExceptionSpecification__Group__1__Impl14950); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7348:1: rule__DynamicExceptionSpecification__Group__2 : rule__DynamicExceptionSpecification__Group__2__Impl rule__DynamicExceptionSpecification__Group__3 ;
    public final void rule__DynamicExceptionSpecification__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7352:1: ( rule__DynamicExceptionSpecification__Group__2__Impl rule__DynamicExceptionSpecification__Group__3 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7353:2: rule__DynamicExceptionSpecification__Group__2__Impl rule__DynamicExceptionSpecification__Group__3
            {
            pushFollow(FOLLOW_rule__DynamicExceptionSpecification__Group__2__Impl_in_rule__DynamicExceptionSpecification__Group__214981);
            rule__DynamicExceptionSpecification__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DynamicExceptionSpecification__Group__3_in_rule__DynamicExceptionSpecification__Group__214984);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7360:1: rule__DynamicExceptionSpecification__Group__2__Impl : ( ruleTypeIdList ) ;
    public final void rule__DynamicExceptionSpecification__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7364:1: ( ( ruleTypeIdList ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7365:1: ( ruleTypeIdList )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7365:1: ( ruleTypeIdList )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7366:1: ruleTypeIdList
            {
             before(grammarAccess.getDynamicExceptionSpecificationAccess().getTypeIdListParserRuleCall_2()); 
            pushFollow(FOLLOW_ruleTypeIdList_in_rule__DynamicExceptionSpecification__Group__2__Impl15011);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7377:1: rule__DynamicExceptionSpecification__Group__3 : rule__DynamicExceptionSpecification__Group__3__Impl ;
    public final void rule__DynamicExceptionSpecification__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7381:1: ( rule__DynamicExceptionSpecification__Group__3__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7382:2: rule__DynamicExceptionSpecification__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__DynamicExceptionSpecification__Group__3__Impl_in_rule__DynamicExceptionSpecification__Group__315040);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7388:1: rule__DynamicExceptionSpecification__Group__3__Impl : ( ')' ) ;
    public final void rule__DynamicExceptionSpecification__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7392:1: ( ( ')' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7393:1: ( ')' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7393:1: ( ')' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7394:1: ')'
            {
             before(grammarAccess.getDynamicExceptionSpecificationAccess().getRightParenthesisKeyword_3()); 
            match(input,107,FOLLOW_107_in_rule__DynamicExceptionSpecification__Group__3__Impl15068); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7415:1: rule__NoexceptSpecification__Group__0 : rule__NoexceptSpecification__Group__0__Impl rule__NoexceptSpecification__Group__1 ;
    public final void rule__NoexceptSpecification__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7419:1: ( rule__NoexceptSpecification__Group__0__Impl rule__NoexceptSpecification__Group__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7420:2: rule__NoexceptSpecification__Group__0__Impl rule__NoexceptSpecification__Group__1
            {
            pushFollow(FOLLOW_rule__NoexceptSpecification__Group__0__Impl_in_rule__NoexceptSpecification__Group__015107);
            rule__NoexceptSpecification__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NoexceptSpecification__Group__1_in_rule__NoexceptSpecification__Group__015110);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7427:1: rule__NoexceptSpecification__Group__0__Impl : ( 'noexcept' ) ;
    public final void rule__NoexceptSpecification__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7431:1: ( ( 'noexcept' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7432:1: ( 'noexcept' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7432:1: ( 'noexcept' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7433:1: 'noexcept'
            {
             before(grammarAccess.getNoexceptSpecificationAccess().getNoexceptKeyword_0()); 
            match(input,115,FOLLOW_115_in_rule__NoexceptSpecification__Group__0__Impl15138); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7446:1: rule__NoexceptSpecification__Group__1 : rule__NoexceptSpecification__Group__1__Impl ;
    public final void rule__NoexceptSpecification__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7450:1: ( rule__NoexceptSpecification__Group__1__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7451:2: rule__NoexceptSpecification__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__NoexceptSpecification__Group__1__Impl_in_rule__NoexceptSpecification__Group__115169);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7457:1: rule__NoexceptSpecification__Group__1__Impl : ( ( rule__NoexceptSpecification__Group_1__0 )? ) ;
    public final void rule__NoexceptSpecification__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7461:1: ( ( ( rule__NoexceptSpecification__Group_1__0 )? ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7462:1: ( ( rule__NoexceptSpecification__Group_1__0 )? )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7462:1: ( ( rule__NoexceptSpecification__Group_1__0 )? )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7463:1: ( rule__NoexceptSpecification__Group_1__0 )?
            {
             before(grammarAccess.getNoexceptSpecificationAccess().getGroup_1()); 
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7464:1: ( rule__NoexceptSpecification__Group_1__0 )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==106) ) {
                int LA78_1 = input.LA(2);

                if ( (LA78_1==38) ) {
                    alt78=1;
                }
            }
            switch (alt78) {
                case 1 :
                    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7464:2: rule__NoexceptSpecification__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__NoexceptSpecification__Group_1__0_in_rule__NoexceptSpecification__Group__1__Impl15196);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7478:1: rule__NoexceptSpecification__Group_1__0 : rule__NoexceptSpecification__Group_1__0__Impl rule__NoexceptSpecification__Group_1__1 ;
    public final void rule__NoexceptSpecification__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7482:1: ( rule__NoexceptSpecification__Group_1__0__Impl rule__NoexceptSpecification__Group_1__1 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7483:2: rule__NoexceptSpecification__Group_1__0__Impl rule__NoexceptSpecification__Group_1__1
            {
            pushFollow(FOLLOW_rule__NoexceptSpecification__Group_1__0__Impl_in_rule__NoexceptSpecification__Group_1__015231);
            rule__NoexceptSpecification__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NoexceptSpecification__Group_1__1_in_rule__NoexceptSpecification__Group_1__015234);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7490:1: rule__NoexceptSpecification__Group_1__0__Impl : ( '(' ) ;
    public final void rule__NoexceptSpecification__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7494:1: ( ( '(' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7495:1: ( '(' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7495:1: ( '(' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7496:1: '('
            {
             before(grammarAccess.getNoexceptSpecificationAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,106,FOLLOW_106_in_rule__NoexceptSpecification__Group_1__0__Impl15262); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7509:1: rule__NoexceptSpecification__Group_1__1 : rule__NoexceptSpecification__Group_1__1__Impl rule__NoexceptSpecification__Group_1__2 ;
    public final void rule__NoexceptSpecification__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7513:1: ( rule__NoexceptSpecification__Group_1__1__Impl rule__NoexceptSpecification__Group_1__2 )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7514:2: rule__NoexceptSpecification__Group_1__1__Impl rule__NoexceptSpecification__Group_1__2
            {
            pushFollow(FOLLOW_rule__NoexceptSpecification__Group_1__1__Impl_in_rule__NoexceptSpecification__Group_1__115293);
            rule__NoexceptSpecification__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NoexceptSpecification__Group_1__2_in_rule__NoexceptSpecification__Group_1__115296);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7521:1: rule__NoexceptSpecification__Group_1__1__Impl : ( ruleConstantExpression ) ;
    public final void rule__NoexceptSpecification__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7525:1: ( ( ruleConstantExpression ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7526:1: ( ruleConstantExpression )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7526:1: ( ruleConstantExpression )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7527:1: ruleConstantExpression
            {
             before(grammarAccess.getNoexceptSpecificationAccess().getConstantExpressionParserRuleCall_1_1()); 
            pushFollow(FOLLOW_ruleConstantExpression_in_rule__NoexceptSpecification__Group_1__1__Impl15323);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7538:1: rule__NoexceptSpecification__Group_1__2 : rule__NoexceptSpecification__Group_1__2__Impl ;
    public final void rule__NoexceptSpecification__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7542:1: ( rule__NoexceptSpecification__Group_1__2__Impl )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7543:2: rule__NoexceptSpecification__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__NoexceptSpecification__Group_1__2__Impl_in_rule__NoexceptSpecification__Group_1__215352);
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7549:1: rule__NoexceptSpecification__Group_1__2__Impl : ( ')' ) ;
    public final void rule__NoexceptSpecification__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7553:1: ( ( ')' ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7554:1: ( ')' )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7554:1: ( ')' )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7555:1: ')'
            {
             before(grammarAccess.getNoexceptSpecificationAccess().getRightParenthesisKeyword_1_2()); 
            match(input,107,FOLLOW_107_in_rule__NoexceptSpecification__Group_1__2__Impl15380); 
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
    // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7575:1: rule__Test__ElementsAssignment : ( ruleToken ) ;
    public final void rule__Test__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7579:1: ( ( ruleToken ) )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7580:1: ( ruleToken )
            {
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7580:1: ( ruleToken )
            // ../cpp2.ui/src-gen/org/ui/contentassist/antlr/internal/InternalCpp2.g:7581:1: ruleToken
            {
             before(grammarAccess.getTestAccess().getElementsTokenParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleToken_in_rule__Test__ElementsAssignment15422);
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
        "\1\74\2\112\52\uffff";
    static final String DFA17_maxS =
        "\1\143\2\147\52\uffff";
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
            return "1983:1: rule__OverloadableOperator__Alternatives : ( ( 'new' ) | ( 'delete' ) | ( ( rule__OverloadableOperator__Group_2__0 ) ) | ( ( rule__OverloadableOperator__Group_3__0 ) ) | ( '+' ) | ( '-' ) | ( '*' ) | ( '/' ) | ( '%' ) | ( '^' ) | ( '&' ) | ( '|' ) | ( '~' ) | ( '!' ) | ( '=' ) | ( '<' ) | ( '>' ) | ( '+=' ) | ( '-=' ) | ( '*=' ) | ( '/=' ) | ( '%=' ) | ( '^=' ) | ( '&=' ) | ( '|=' ) | ( '<<' ) | ( '>>' ) | ( '>>=' ) | ( '<<=' ) | ( '==' ) | ( '!=' ) | ( '<=' ) | ( '>=' ) | ( '&&' ) | ( '||' ) | ( '++' ) | ( '--' ) | ( ',' ) | ( '->*' ) | ( '->' ) | ( '()' ) | ( '[]' ) );";
        }
    }
    static final String DFA42_eotS =
        "\77\uffff";
    static final String DFA42_eofS =
        "\1\1\4\uffff\1\3\2\uffff\4\3\1\uffff\1\3\17\uffff\1\3\1\uffff\3"+
        "\3\11\uffff\1\3\23\uffff";
    static final String DFA42_minS =
        "\1\67\1\uffff\1\64\1\uffff\1\153\1\67\1\46\1\152\4\67\1\152\1\67"+
        "\1\12\1\47\1\62\1\46\1\137\2\144\2\153\1\4\1\137\1\12\1\150\1\12"+
        "\1\153\1\67\1\153\3\67\5\153\2\145\1\12\1\137\1\67\2\137\2\153\1"+
        "\12\1\4\2\137\5\153\2\145\1\12\1\137\2\153";
    static final String DFA42_maxS =
        "\1\153\1\uffff\1\64\1\uffff\1\153\1\163\1\147\1\152\4\163\1\152"+
        "\1\153\1\12\1\55\1\62\1\64\1\152\4\153\1\71\3\150\1\12\1\153\1\163"+
        "\1\153\1\163\7\153\2\145\1\12\1\152\1\163\1\152\1\150\2\153\1\12"+
        "\1\71\1\150\1\152\5\153\2\145\1\12\1\150\2\153";
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
            "\1\42\1\43\1\44\1\45\1\46\1\51\56\uffff\1\47\1\50",
            "\1\31\10\uffff\1\32",
            "\1\52\124\uffff\1\31\10\uffff\1\32",
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
            "\1\64\1\65\1\66\1\67\1\70\1\73\56\uffff\1\71\1\72",
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
            return "()* loopback of 4148:1: ( rule__NoptrDeclarator )*";
        }
    }
 

    public static final BitSet FOLLOW_ruleTest_in_entryRuleTest61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTest68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Test__ElementsAssignment_in_ruleTest94 = new BitSet(new long[]{0x03000000000003F2L});
    public static final BitSet FOLLOW_ruleToken_in_entryRuleToken124 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleToken131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Token__Alternatives_in_ruleToken157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral184 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Alternatives_in_ruleLiteral217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamespaceBody_in_entryRuleNamespaceBody246 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNamespaceBody253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_ruleNamespaceBody280 = new BitSet(new long[]{0x0000040000000002L});
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
    public static final BitSet FOLLOW_38_in_ruleConstantExpression2230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeId_in_entryRuleTypeId2258 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeId2265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleTypeId2292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdExpression_in_entryRuleIdExpression2320 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIdExpression2327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleIdExpression2354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterDeclaration_in_entryRuleParameterDeclaration2382 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterDeclaration2389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleParameterDeclaration2416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_entryRuleDeclaration2444 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeclaration2451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleDeclaration2478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNestedNameSpecifier_in_entryRuleNestedNameSpecifier2506 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNestedNameSpecifier2513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleNestedNameSpecifier2540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignmentExpression_in_entryRuleAssignmentExpression2568 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignmentExpression2575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleAssignmentExpression2602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlignmentExpression_in_entryRuleAlignmentExpression2630 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAlignmentExpression2637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleAlignmentExpression2664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeSpecifier_in_entryRuleTypeSpecifier2692 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeSpecifier2699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleTypeSpecifier2726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractDeclarator_in_entryRuleAbstractDeclarator2754 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractDeclarator2761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleAbstractDeclarator2788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompoundStatement_in_entryRuleCompoundStatement2816 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompoundStatement2823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleCompoundStatement2850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCtorInitializer_in_entryRuleCtorInitializer2878 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCtorInitializer2885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleCtorInitializer2912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeIdList_in_entryRuleTypeIdList2940 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeIdList2947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleTypeIdList2974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnqualifiedId_in_entryRuleUnqualifiedId3002 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnqualifiedId3009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleUnqualifiedId3036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterDeclarationClause_in_entryRuleParameterDeclarationClause3064 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterDeclarationClause3071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleParameterDeclarationClause3098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTrailingTypeSpecifier_in_entryRuleTrailingTypeSpecifier3126 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTrailingTypeSpecifier3133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleTrailingTypeSpecifier3160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassName_in_entryRuleClassName3188 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClassName3195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleClassName3222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInitializer_in_entryRuleInitializer3250 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInitializer3257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleInitializer3284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_KEYWORD_in_rule__Token__Alternatives3326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_rule__Token__Alternatives3343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Token__Group_2__0_in_rule__Token__Alternatives3360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Literal__Alternatives3393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CHARACTER_LITERAL_in_rule__Literal__Alternatives3410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOATING_LITERAL_in_rule__Literal__Alternatives3427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_LITERAL_in_rule__Literal__Alternatives3444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Group_4__0_in_rule__Literal__Alternatives3461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_rule__Literal__Alternatives_4_03495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_rule__Literal__Alternatives_4_03515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeSpecifier__Group_0__0_in_rule__AttributeSpecifier__Alternatives3551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlignmentSpecifier_in_rule__AttributeSpecifier__Alternatives3569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AlignmentSpecifier__Group_0__0_in_rule__AlignmentSpecifier__Alternatives3601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AlignmentSpecifier__Group_1__0_in_rule__AlignmentSpecifier__Alternatives3619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declarator__Group_0__0_in_rule__Declarator__Alternatives3652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declarator__Group_1__0_in_rule__Declarator__Alternatives3670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule___NoptrDeclarator__Group_0__0_in_rule___NoptrDeclarator__Alternatives3703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule___NoptrDeclarator__Group_1__0_in_rule___NoptrDeclarator__Alternatives3721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParametersAndQualifiers_in_rule____NoptrDeclarator__Alternatives3754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule____NoptrDeclarator__Group_1__0_in_rule____NoptrDeclarator__Alternatives3771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_rule__ParametersAndQualifiers__Alternatives_43805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_rule__ParametersAndQualifiers__Alternatives_43825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_rule__ParametersAndQualifiers__Alternatives_53860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_rule__ParametersAndQualifiers__Alternatives_53880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PtrOperator__Group_0__0_in_rule__PtrOperator__Alternatives3914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PtrOperator__Group_1__0_in_rule__PtrOperator__Alternatives3932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PtrOperator__Group_2__0_in_rule__PtrOperator__Alternatives3950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PtrOperator__Group_3__0_in_rule__PtrOperator__Alternatives3968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_rule__PtrOperator__Alternatives_0_24002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_rule__PtrOperator__Alternatives_0_24022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_rule__PtrOperator__Alternatives_3_44057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_rule__PtrOperator__Alternatives_3_44077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeclaratorId__Group_0__0_in_rule__DeclaratorId__Alternatives4111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeclaratorId__Group_1__0_in_rule__DeclaratorId__Alternatives4129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_rule__OverloadableOperator__Alternatives4163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_rule__OverloadableOperator__Alternatives4183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OverloadableOperator__Group_2__0_in_rule__OverloadableOperator__Alternatives4202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OverloadableOperator__Group_3__0_in_rule__OverloadableOperator__Alternatives4220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_rule__OverloadableOperator__Alternatives4239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_rule__OverloadableOperator__Alternatives4259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_rule__OverloadableOperator__Alternatives4279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_rule__OverloadableOperator__Alternatives4299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_rule__OverloadableOperator__Alternatives4319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_rule__OverloadableOperator__Alternatives4339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_rule__OverloadableOperator__Alternatives4359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_rule__OverloadableOperator__Alternatives4379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_rule__OverloadableOperator__Alternatives4399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_rule__OverloadableOperator__Alternatives4419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_rule__OverloadableOperator__Alternatives4439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_rule__OverloadableOperator__Alternatives4459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_rule__OverloadableOperator__Alternatives4479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_rule__OverloadableOperator__Alternatives4499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_rule__OverloadableOperator__Alternatives4519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_rule__OverloadableOperator__Alternatives4539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_rule__OverloadableOperator__Alternatives4559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_rule__OverloadableOperator__Alternatives4579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_rule__OverloadableOperator__Alternatives4599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_rule__OverloadableOperator__Alternatives4619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_rule__OverloadableOperator__Alternatives4639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_rule__OverloadableOperator__Alternatives4659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_rule__OverloadableOperator__Alternatives4679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_rule__OverloadableOperator__Alternatives4699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_rule__OverloadableOperator__Alternatives4719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_rule__OverloadableOperator__Alternatives4739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_rule__OverloadableOperator__Alternatives4759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_rule__OverloadableOperator__Alternatives4779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_rule__OverloadableOperator__Alternatives4799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_rule__OverloadableOperator__Alternatives4819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_rule__OverloadableOperator__Alternatives4839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_rule__OverloadableOperator__Alternatives4859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_rule__OverloadableOperator__Alternatives4879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_rule__OverloadableOperator__Alternatives4899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_rule__OverloadableOperator__Alternatives4919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_rule__OverloadableOperator__Alternatives4939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_98_in_rule__OverloadableOperator__Alternatives4959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_99_in_rule__OverloadableOperator__Alternatives4979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeParameter_in_rule__TemplateParameter__Alternatives5013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterDeclaration_in_rule__TemplateParameter__Alternatives5030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_0__0_in_rule__TypeParameter__Alternatives5062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_1__0_in_rule__TypeParameter__Alternatives5080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_2__0_in_rule__TypeParameter__Alternatives5098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_0_1_0__0_in_rule__TypeParameter__Alternatives_0_15131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_0_1_1__0_in_rule__TypeParameter__Alternatives_0_15149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_1_1_0__0_in_rule__TypeParameter__Alternatives_1_15182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_1_1_1__0_in_rule__TypeParameter__Alternatives_1_15200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_2_5_0__0_in_rule__TypeParameter__Alternatives_2_55233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_2_5_1__0_in_rule__TypeParameter__Alternatives_2_55251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantExpression_in_rule__TemplateArgument__Alternatives5285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeId_in_rule__TemplateArgument__Alternatives5302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdExpression_in_rule__TemplateArgument__Alternatives5319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExceptionDeclaration__Group_0__0_in_rule__ExceptionDeclaration__Alternatives5352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_100_in_rule__ExceptionDeclaration__Alternatives5371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclarator_in_rule__ExceptionDeclaration__Alternatives_0_25405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractDeclarator_in_rule__ExceptionDeclaration__Alternatives_0_25423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDynamicExceptionSpecification_in_rule__ExceptionSpecification__Alternatives5457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoexceptSpecification_in_rule__ExceptionSpecification__Alternatives5474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Token__Group_2__0__Impl_in_rule__Token__Group_2__05507 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_rule__Token__Group_2__1_in_rule__Token__Group_2__05510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PREPROCESSING_OP_OR_PUNC_in_rule__Token__Group_2__0__Impl5537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Token__Group_2__1__Impl_in_rule__Token__Group_2__15566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Token__Group_2__1__Impl5593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Group_4__0__Impl_in_rule__Literal__Group_4__05626 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_rule__Literal__Group_4__1_in_rule__Literal__Group_4__05629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Alternatives_4_0_in_rule__Literal__Group_4__0__Impl5656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Group_4__1__Impl_in_rule__Literal__Group_4__15686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_101_in_rule__Literal__Group_4__1__Impl5714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNamespaceSpecifier__Group__0__Impl_in_rule__QualifiedNamespaceSpecifier__Group__05751 = new BitSet(new long[]{0x0000080000000400L});
    public static final BitSet FOLLOW_rule__QualifiedNamespaceSpecifier__Group__1_in_rule__QualifiedNamespaceSpecifier__Group__05754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_102_in_rule__QualifiedNamespaceSpecifier__Group__0__Impl5783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNamespaceSpecifier__Group__1__Impl_in_rule__QualifiedNamespaceSpecifier__Group__15816 = new BitSet(new long[]{0x0000080000000400L});
    public static final BitSet FOLLOW_rule__QualifiedNamespaceSpecifier__Group__2_in_rule__QualifiedNamespaceSpecifier__Group__15819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNestedNameSpecifier_in_rule__QualifiedNamespaceSpecifier__Group__1__Impl5847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNamespaceSpecifier__Group__2__Impl_in_rule__QualifiedNamespaceSpecifier__Group__25878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedNamespaceSpecifier__Group__2__Impl5905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeSpecifier__Group_0__0__Impl_in_rule__AttributeSpecifier__Group_0__05946 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_rule__AttributeSpecifier__Group_0__1_in_rule__AttributeSpecifier__Group_0__05949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_103_in_rule__AttributeSpecifier__Group_0__0__Impl5977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeSpecifier__Group_0__1__Impl_in_rule__AttributeSpecifier__Group_0__16008 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_rule__AttributeSpecifier__Group_0__2_in_rule__AttributeSpecifier__Group_0__16011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_103_in_rule__AttributeSpecifier__Group_0__1__Impl6039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeSpecifier__Group_0__2__Impl_in_rule__AttributeSpecifier__Group_0__26070 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_rule__AttributeSpecifier__Group_0__3_in_rule__AttributeSpecifier__Group_0__26073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeList_in_rule__AttributeSpecifier__Group_0__2__Impl6100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeSpecifier__Group_0__3__Impl_in_rule__AttributeSpecifier__Group_0__36129 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_rule__AttributeSpecifier__Group_0__4_in_rule__AttributeSpecifier__Group_0__36132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_104_in_rule__AttributeSpecifier__Group_0__3__Impl6160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeSpecifier__Group_0__4__Impl_in_rule__AttributeSpecifier__Group_0__46191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_104_in_rule__AttributeSpecifier__Group_0__4__Impl6219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AlignmentSpecifier__Group_0__0__Impl_in_rule__AlignmentSpecifier__Group_0__06260 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_rule__AlignmentSpecifier__Group_0__1_in_rule__AlignmentSpecifier__Group_0__06263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_105_in_rule__AlignmentSpecifier__Group_0__0__Impl6291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AlignmentSpecifier__Group_0__1__Impl_in_rule__AlignmentSpecifier__Group_0__16322 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__AlignmentSpecifier__Group_0__2_in_rule__AlignmentSpecifier__Group_0__16325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_106_in_rule__AlignmentSpecifier__Group_0__1__Impl6353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AlignmentSpecifier__Group_0__2__Impl_in_rule__AlignmentSpecifier__Group_0__26384 = new BitSet(new long[]{0x0000000000000000L,0x0000081000000000L});
    public static final BitSet FOLLOW_rule__AlignmentSpecifier__Group_0__3_in_rule__AlignmentSpecifier__Group_0__26387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeId_in_rule__AlignmentSpecifier__Group_0__2__Impl6414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AlignmentSpecifier__Group_0__3__Impl_in_rule__AlignmentSpecifier__Group_0__36443 = new BitSet(new long[]{0x0000000000000000L,0x0000081000000000L});
    public static final BitSet FOLLOW_rule__AlignmentSpecifier__Group_0__4_in_rule__AlignmentSpecifier__Group_0__36446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_100_in_rule__AlignmentSpecifier__Group_0__3__Impl6475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AlignmentSpecifier__Group_0__4__Impl_in_rule__AlignmentSpecifier__Group_0__46508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_107_in_rule__AlignmentSpecifier__Group_0__4__Impl6536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AlignmentSpecifier__Group_1__0__Impl_in_rule__AlignmentSpecifier__Group_1__06577 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_rule__AlignmentSpecifier__Group_1__1_in_rule__AlignmentSpecifier__Group_1__06580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_105_in_rule__AlignmentSpecifier__Group_1__0__Impl6608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AlignmentSpecifier__Group_1__1__Impl_in_rule__AlignmentSpecifier__Group_1__16639 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_rule__AlignmentSpecifier__Group_1__2_in_rule__AlignmentSpecifier__Group_1__16642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_106_in_rule__AlignmentSpecifier__Group_1__1__Impl6670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AlignmentSpecifier__Group_1__2__Impl_in_rule__AlignmentSpecifier__Group_1__26701 = new BitSet(new long[]{0x0000000000000000L,0x0000081000000000L});
    public static final BitSet FOLLOW_rule__AlignmentSpecifier__Group_1__3_in_rule__AlignmentSpecifier__Group_1__26704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlignmentExpression_in_rule__AlignmentSpecifier__Group_1__2__Impl6731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AlignmentSpecifier__Group_1__3__Impl_in_rule__AlignmentSpecifier__Group_1__36760 = new BitSet(new long[]{0x0000000000000000L,0x0000081000000000L});
    public static final BitSet FOLLOW_rule__AlignmentSpecifier__Group_1__4_in_rule__AlignmentSpecifier__Group_1__36763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_100_in_rule__AlignmentSpecifier__Group_1__3__Impl6792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AlignmentSpecifier__Group_1__4__Impl_in_rule__AlignmentSpecifier__Group_1__46825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_107_in_rule__AlignmentSpecifier__Group_1__4__Impl6853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeList__Group__0__Impl_in_rule__AttributeList__Group__06894 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_rule__AttributeList__Group__1_in_rule__AttributeList__Group__06897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeList__Group_0__0_in_rule__AttributeList__Group__0__Impl6924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeList__Group__1__Impl_in_rule__AttributeList__Group__16954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeList__Group_1__0_in_rule__AttributeList__Group__1__Impl6981 = new BitSet(new long[]{0x0000000000000002L,0x0000000080000000L});
    public static final BitSet FOLLOW_rule__AttributeList__Group_0__0__Impl_in_rule__AttributeList__Group_0__07016 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_rule__AttributeList__Group_0__1_in_rule__AttributeList__Group_0__07019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_rule__AttributeList__Group_0__0__Impl7046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeList__Group_0__1__Impl_in_rule__AttributeList__Group_0__17075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_100_in_rule__AttributeList__Group_0__1__Impl7104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeList__Group_1__0__Impl_in_rule__AttributeList__Group_1__07141 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_rule__AttributeList__Group_1__1_in_rule__AttributeList__Group_1__07144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_rule__AttributeList__Group_1__0__Impl7172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeList__Group_1__1__Impl_in_rule__AttributeList__Group_1__17203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeList__Group_1_1__0_in_rule__AttributeList__Group_1__1__Impl7230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeList__Group_1_1__0__Impl_in_rule__AttributeList__Group_1_1__07265 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_rule__AttributeList__Group_1_1__1_in_rule__AttributeList__Group_1_1__07268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_rule__AttributeList__Group_1_1__0__Impl7295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeList__Group_1_1__1__Impl_in_rule__AttributeList__Group_1_1__17324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_100_in_rule__AttributeList__Group_1_1__1__Impl7353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__0__Impl_in_rule__Attribute__Group__07390 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_rule__Attribute__Group__1_in_rule__Attribute__Group__07393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeToken_in_rule__Attribute__Group__0__Impl7420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__1__Impl_in_rule__Attribute__Group__17449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeArgumentClause_in_rule__Attribute__Group__1__Impl7477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeToken__Group__0__Impl_in_rule__AttributeToken__Group__07512 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_rule__AttributeToken__Group__1_in_rule__AttributeToken__Group__07515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeToken__Group_0__0_in_rule__AttributeToken__Group__0__Impl7542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeToken__Group__1__Impl_in_rule__AttributeToken__Group__17573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__AttributeToken__Group__1__Impl7600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeToken__Group_0__0__Impl_in_rule__AttributeToken__Group_0__07633 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_rule__AttributeToken__Group_0__1_in_rule__AttributeToken__Group_0__07636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__AttributeToken__Group_0__0__Impl7663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeToken__Group_0__1__Impl_in_rule__AttributeToken__Group_0__17692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_102_in_rule__AttributeToken__Group_0__1__Impl7720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeArgumentClause__Group__0__Impl_in_rule__AttributeArgumentClause__Group__07755 = new BitSet(new long[]{0x03000000000003F0L});
    public static final BitSet FOLLOW_rule__AttributeArgumentClause__Group__1_in_rule__AttributeArgumentClause__Group__07758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_106_in_rule__AttributeArgumentClause__Group__0__Impl7786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeArgumentClause__Group__1__Impl_in_rule__AttributeArgumentClause__Group__17817 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_rule__AttributeArgumentClause__Group__2_in_rule__AttributeArgumentClause__Group__17820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleToken_in_rule__AttributeArgumentClause__Group__1__Impl7847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeArgumentClause__Group__2__Impl_in_rule__AttributeArgumentClause__Group__27876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_107_in_rule__AttributeArgumentClause__Group__2__Impl7904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InitDeclarator__Group__0__Impl_in_rule__InitDeclarator__Group__07943 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_rule__InitDeclarator__Group__1_in_rule__InitDeclarator__Group__07946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclarator_in_rule__InitDeclarator__Group__0__Impl7973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InitDeclarator__Group__1__Impl_in_rule__InitDeclarator__Group__18002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInitializer_in_rule__InitDeclarator__Group__1__Impl8030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declarator__Group_0__0__Impl_in_rule__Declarator__Group_0__08065 = new BitSet(new long[]{0x0040090000000000L,0x0000045000000000L});
    public static final BitSet FOLLOW_rule__Declarator__Group_0__1_in_rule__Declarator__Group_0__08068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePtrOperator_in_rule__Declarator__Group_0__0__Impl8098 = new BitSet(new long[]{0x3000080000000002L,0x0000004000000004L});
    public static final BitSet FOLLOW_rulePtrOperator_in_rule__Declarator__Group_0__0__Impl8111 = new BitSet(new long[]{0x3000080000000002L,0x0000004000000004L});
    public static final BitSet FOLLOW_rule__Declarator__Group_0__1__Impl_in_rule__Declarator__Group_0__18144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoptrDeclarator_in_rule__Declarator__Group_0__1__Impl8171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declarator__Group_1__0__Impl_in_rule__Declarator__Group_1__08204 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_rule__Declarator__Group_1__1_in_rule__Declarator__Group_1__08207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoptrDeclarator_in_rule__Declarator__Group_1__0__Impl8234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declarator__Group_1__1__Impl_in_rule__Declarator__Group_1__18263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declarator__Group_1_1__0_in_rule__Declarator__Group_1__1__Impl8290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declarator__Group_1_1__0__Impl_in_rule__Declarator__Group_1_1__08325 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Declarator__Group_1_1__1_in_rule__Declarator__Group_1_1__08328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParametersAndQualifiers_in_rule__Declarator__Group_1_1__0__Impl8355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declarator__Group_1_1__1__Impl_in_rule__Declarator__Group_1_1__18384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTrailingReturnType_in_rule__Declarator__Group_1_1__1__Impl8411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PtrDeclarator__Group__0__Impl_in_rule__PtrDeclarator__Group__08444 = new BitSet(new long[]{0x0040090000000000L,0x0000045000000000L});
    public static final BitSet FOLLOW_rule__PtrDeclarator__Group__1_in_rule__PtrDeclarator__Group__08447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePtrOperator_in_rule__PtrDeclarator__Group__0__Impl8475 = new BitSet(new long[]{0x3000080000000002L,0x0000004000000004L});
    public static final BitSet FOLLOW_rule__PtrDeclarator__Group__1__Impl_in_rule__PtrDeclarator__Group__18506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoptrDeclarator_in_rule__PtrDeclarator__Group__1__Impl8533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NoptrDeclarator__Group__0__Impl_in_rule__NoptrDeclarator__Group__08566 = new BitSet(new long[]{0x0000000000000000L,0x0000048000000000L});
    public static final BitSet FOLLOW_rule__NoptrDeclarator__Group__1_in_rule__NoptrDeclarator__Group__08569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule_NoptrDeclarator_in_rule__NoptrDeclarator__Group__0__Impl8596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NoptrDeclarator__Group__1__Impl_in_rule__NoptrDeclarator__Group__18625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NoptrDeclarator_in_rule__NoptrDeclarator__Group__1__Impl8653 = new BitSet(new long[]{0x0000000000000002L,0x0000048000000000L});
    public static final BitSet FOLLOW_rule___NoptrDeclarator__Group_0__0__Impl_in_rule___NoptrDeclarator__Group_0__08688 = new BitSet(new long[]{0x0000000000000000L,0x0000028000000000L});
    public static final BitSet FOLLOW_rule___NoptrDeclarator__Group_0__1_in_rule___NoptrDeclarator__Group_0__08691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaratorId_in_rule___NoptrDeclarator__Group_0__0__Impl8718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule___NoptrDeclarator__Group_0__1__Impl_in_rule___NoptrDeclarator__Group_0__18747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeSpecifier_in_rule___NoptrDeclarator__Group_0__1__Impl8775 = new BitSet(new long[]{0x0000000000000002L,0x0000028000000000L});
    public static final BitSet FOLLOW_rule___NoptrDeclarator__Group_1__0__Impl_in_rule___NoptrDeclarator__Group_1__08810 = new BitSet(new long[]{0x3040090000000000L,0x0000045000000004L});
    public static final BitSet FOLLOW_rule___NoptrDeclarator__Group_1__1_in_rule___NoptrDeclarator__Group_1__08813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_106_in_rule___NoptrDeclarator__Group_1__0__Impl8841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule___NoptrDeclarator__Group_1__1__Impl_in_rule___NoptrDeclarator__Group_1__18872 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_rule___NoptrDeclarator__Group_1__2_in_rule___NoptrDeclarator__Group_1__18875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePtrDeclarator_in_rule___NoptrDeclarator__Group_1__1__Impl8902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule___NoptrDeclarator__Group_1__2__Impl_in_rule___NoptrDeclarator__Group_1__28931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_107_in_rule___NoptrDeclarator__Group_1__2__Impl8959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule____NoptrDeclarator__Group_1__0__Impl_in_rule____NoptrDeclarator__Group_1__08996 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule____NoptrDeclarator__Group_1__1_in_rule____NoptrDeclarator__Group_1__08999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_103_in_rule____NoptrDeclarator__Group_1__0__Impl9027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule____NoptrDeclarator__Group_1__1__Impl_in_rule____NoptrDeclarator__Group_1__19058 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_rule____NoptrDeclarator__Group_1__2_in_rule____NoptrDeclarator__Group_1__19061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantExpression_in_rule____NoptrDeclarator__Group_1__1__Impl9088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule____NoptrDeclarator__Group_1__2__Impl_in_rule____NoptrDeclarator__Group_1__29117 = new BitSet(new long[]{0x0000000000000000L,0x0000028000000000L});
    public static final BitSet FOLLOW_rule____NoptrDeclarator__Group_1__3_in_rule____NoptrDeclarator__Group_1__29120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_104_in_rule____NoptrDeclarator__Group_1__2__Impl9148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule____NoptrDeclarator__Group_1__3__Impl_in_rule____NoptrDeclarator__Group_1__39179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeSpecifier_in_rule____NoptrDeclarator__Group_1__3__Impl9207 = new BitSet(new long[]{0x0000000000000002L,0x0000028000000000L});
    public static final BitSet FOLLOW_rule__ParametersAndQualifiers__Group__0__Impl_in_rule__ParametersAndQualifiers__Group__09246 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_rule__ParametersAndQualifiers__Group__1_in_rule__ParametersAndQualifiers__Group__09249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_106_in_rule__ParametersAndQualifiers__Group__0__Impl9277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParametersAndQualifiers__Group__1__Impl_in_rule__ParametersAndQualifiers__Group__19308 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_rule__ParametersAndQualifiers__Group__2_in_rule__ParametersAndQualifiers__Group__19311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterDeclarationClause_in_rule__ParametersAndQualifiers__Group__1__Impl9338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParametersAndQualifiers__Group__2__Impl_in_rule__ParametersAndQualifiers__Group__29367 = new BitSet(new long[]{0x3C00000000000000L,0x000C028000000000L});
    public static final BitSet FOLLOW_rule__ParametersAndQualifiers__Group__3_in_rule__ParametersAndQualifiers__Group__29370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_107_in_rule__ParametersAndQualifiers__Group__2__Impl9398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParametersAndQualifiers__Group__3__Impl_in_rule__ParametersAndQualifiers__Group__39429 = new BitSet(new long[]{0x3C00000000000000L,0x000C028000000000L});
    public static final BitSet FOLLOW_rule__ParametersAndQualifiers__Group__4_in_rule__ParametersAndQualifiers__Group__39432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeSpecifier_in_rule__ParametersAndQualifiers__Group__3__Impl9460 = new BitSet(new long[]{0x0000000000000002L,0x0000028000000000L});
    public static final BitSet FOLLOW_rule__ParametersAndQualifiers__Group__4__Impl_in_rule__ParametersAndQualifiers__Group__49491 = new BitSet(new long[]{0x3C00000000000000L,0x000C028000000000L});
    public static final BitSet FOLLOW_rule__ParametersAndQualifiers__Group__5_in_rule__ParametersAndQualifiers__Group__49494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParametersAndQualifiers__Alternatives_4_in_rule__ParametersAndQualifiers__Group__4__Impl9521 = new BitSet(new long[]{0x0C00000000000002L});
    public static final BitSet FOLLOW_rule__ParametersAndQualifiers__Group__5__Impl_in_rule__ParametersAndQualifiers__Group__59552 = new BitSet(new long[]{0x3C00000000000000L,0x000C028000000000L});
    public static final BitSet FOLLOW_rule__ParametersAndQualifiers__Group__6_in_rule__ParametersAndQualifiers__Group__59555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParametersAndQualifiers__Alternatives_5_in_rule__ParametersAndQualifiers__Group__5__Impl9582 = new BitSet(new long[]{0x3000000000000002L});
    public static final BitSet FOLLOW_rule__ParametersAndQualifiers__Group__6__Impl_in_rule__ParametersAndQualifiers__Group__69613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExceptionSpecification_in_rule__ParametersAndQualifiers__Group__6__Impl9641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TrailingReturnType__Group__0__Impl_in_rule__TrailingReturnType__Group__09686 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_rule__TrailingReturnType__Group__1_in_rule__TrailingReturnType__Group__09689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_rule__TrailingReturnType__Group__0__Impl9717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TrailingReturnType__Group__1__Impl_in_rule__TrailingReturnType__Group__19748 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_rule__TrailingReturnType__Group__2_in_rule__TrailingReturnType__Group__19751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTrailingTypeSpecifier_in_rule__TrailingReturnType__Group__1__Impl9781 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_ruleTrailingTypeSpecifier_in_rule__TrailingReturnType__Group__1__Impl9794 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_rule__TrailingReturnType__Group__2__Impl_in_rule__TrailingReturnType__Group__29827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractDeclarator_in_rule__TrailingReturnType__Group__2__Impl9855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PtrOperator__Group_0__0__Impl_in_rule__PtrOperator__Group_0__09892 = new BitSet(new long[]{0x0C00000000000000L,0x0000028000000000L});
    public static final BitSet FOLLOW_rule__PtrOperator__Group_0__1_in_rule__PtrOperator__Group_0__09895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_rule__PtrOperator__Group_0__0__Impl9923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PtrOperator__Group_0__1__Impl_in_rule__PtrOperator__Group_0__19954 = new BitSet(new long[]{0x0C00000000000000L,0x0000028000000000L});
    public static final BitSet FOLLOW_rule__PtrOperator__Group_0__2_in_rule__PtrOperator__Group_0__19957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeSpecifier_in_rule__PtrOperator__Group_0__1__Impl9985 = new BitSet(new long[]{0x0000000000000002L,0x0000028000000000L});
    public static final BitSet FOLLOW_rule__PtrOperator__Group_0__2__Impl_in_rule__PtrOperator__Group_0__210016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PtrOperator__Alternatives_0_2_in_rule__PtrOperator__Group_0__2__Impl10043 = new BitSet(new long[]{0x0C00000000000002L});
    public static final BitSet FOLLOW_rule__PtrOperator__Group_1__0__Impl_in_rule__PtrOperator__Group_1__010080 = new BitSet(new long[]{0x0000000000000000L,0x0000028000000000L});
    public static final BitSet FOLLOW_rule__PtrOperator__Group_1__1_in_rule__PtrOperator__Group_1__010083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_rule__PtrOperator__Group_1__0__Impl10111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PtrOperator__Group_1__1__Impl_in_rule__PtrOperator__Group_1__110142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeSpecifier_in_rule__PtrOperator__Group_1__1__Impl10170 = new BitSet(new long[]{0x0000000000000002L,0x0000028000000000L});
    public static final BitSet FOLLOW_rule__PtrOperator__Group_2__0__Impl_in_rule__PtrOperator__Group_2__010205 = new BitSet(new long[]{0x0000000000000000L,0x0000028000000000L});
    public static final BitSet FOLLOW_rule__PtrOperator__Group_2__1_in_rule__PtrOperator__Group_2__010208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_rule__PtrOperator__Group_2__0__Impl10236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PtrOperator__Group_2__1__Impl_in_rule__PtrOperator__Group_2__110267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeSpecifier_in_rule__PtrOperator__Group_2__1__Impl10295 = new BitSet(new long[]{0x0000000000000002L,0x0000028000000000L});
    public static final BitSet FOLLOW_rule__PtrOperator__Group_3__0__Impl_in_rule__PtrOperator__Group_3__010330 = new BitSet(new long[]{0x3000080000000000L,0x0000004000000004L});
    public static final BitSet FOLLOW_rule__PtrOperator__Group_3__1_in_rule__PtrOperator__Group_3__010333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_102_in_rule__PtrOperator__Group_3__0__Impl10362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PtrOperator__Group_3__1__Impl_in_rule__PtrOperator__Group_3__110395 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_rule__PtrOperator__Group_3__2_in_rule__PtrOperator__Group_3__110398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNestedNameSpecifier_in_rule__PtrOperator__Group_3__1__Impl10425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PtrOperator__Group_3__2__Impl_in_rule__PtrOperator__Group_3__210454 = new BitSet(new long[]{0x0C00000000000000L,0x0000028000000000L});
    public static final BitSet FOLLOW_rule__PtrOperator__Group_3__3_in_rule__PtrOperator__Group_3__210457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_rule__PtrOperator__Group_3__2__Impl10485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PtrOperator__Group_3__3__Impl_in_rule__PtrOperator__Group_3__310516 = new BitSet(new long[]{0x0C00000000000000L,0x0000028000000000L});
    public static final BitSet FOLLOW_rule__PtrOperator__Group_3__4_in_rule__PtrOperator__Group_3__310519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeSpecifier_in_rule__PtrOperator__Group_3__3__Impl10547 = new BitSet(new long[]{0x0000000000000002L,0x0000028000000000L});
    public static final BitSet FOLLOW_rule__PtrOperator__Group_3__4__Impl_in_rule__PtrOperator__Group_3__410578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PtrOperator__Alternatives_3_4_in_rule__PtrOperator__Group_3__4__Impl10605 = new BitSet(new long[]{0x0C00000000000002L});
    public static final BitSet FOLLOW_rule__DeclaratorId__Group_0__0__Impl_in_rule__DeclaratorId__Group_0__010646 = new BitSet(new long[]{0x0000010000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_rule__DeclaratorId__Group_0__1_in_rule__DeclaratorId__Group_0__010649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_100_in_rule__DeclaratorId__Group_0__0__Impl10678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeclaratorId__Group_0__1__Impl_in_rule__DeclaratorId__Group_0__110711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdExpression_in_rule__DeclaratorId__Group_0__1__Impl10738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeclaratorId__Group_1__0__Impl_in_rule__DeclaratorId__Group_1__010771 = new BitSet(new long[]{0x0040090000000000L,0x0000005000000000L});
    public static final BitSet FOLLOW_rule__DeclaratorId__Group_1__1_in_rule__DeclaratorId__Group_1__010774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_102_in_rule__DeclaratorId__Group_1__0__Impl10803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeclaratorId__Group_1__1__Impl_in_rule__DeclaratorId__Group_1__110836 = new BitSet(new long[]{0x0040090000000000L,0x0000005000000000L});
    public static final BitSet FOLLOW_rule__DeclaratorId__Group_1__2_in_rule__DeclaratorId__Group_1__110839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNestedNameSpecifier_in_rule__DeclaratorId__Group_1__1__Impl10867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeclaratorId__Group_1__2__Impl_in_rule__DeclaratorId__Group_1__210898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassName_in_rule__DeclaratorId__Group_1__2__Impl10925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OperatorFunctionId__Group__0__Impl_in_rule__OperatorFunctionId__Group__010960 = new BitSet(new long[]{0xF000000000000000L,0x0000000FFFFFFFFFL});
    public static final BitSet FOLLOW_rule__OperatorFunctionId__Group__1_in_rule__OperatorFunctionId__Group__010963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_108_in_rule__OperatorFunctionId__Group__0__Impl10991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OperatorFunctionId__Group__1__Impl_in_rule__OperatorFunctionId__Group__111022 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_rule__OperatorFunctionId__Group__2_in_rule__OperatorFunctionId__Group__111025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOverloadableOperator_in_rule__OperatorFunctionId__Group__1__Impl11052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OperatorFunctionId__Group__2__Impl_in_rule__OperatorFunctionId__Group__211081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OperatorFunctionId__Group_2__0_in_rule__OperatorFunctionId__Group__2__Impl11108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OperatorFunctionId__Group_2__0__Impl_in_rule__OperatorFunctionId__Group_2__011145 = new BitSet(new long[]{0x000001C000000000L,0x0000001000000800L});
    public static final BitSet FOLLOW_rule__OperatorFunctionId__Group_2__1_in_rule__OperatorFunctionId__Group_2__011148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_rule__OperatorFunctionId__Group_2__0__Impl11176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OperatorFunctionId__Group_2__1__Impl_in_rule__OperatorFunctionId__Group_2__111207 = new BitSet(new long[]{0x000001C000000000L,0x0000001000000800L});
    public static final BitSet FOLLOW_rule__OperatorFunctionId__Group_2__2_in_rule__OperatorFunctionId__Group_2__111210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplateArgument_in_rule__OperatorFunctionId__Group_2__1__Impl11238 = new BitSet(new long[]{0x000001C000000002L,0x0000001000000000L});
    public static final BitSet FOLLOW_rule__OperatorFunctionId__Group_2__2__Impl_in_rule__OperatorFunctionId__Group_2__211269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_rule__OperatorFunctionId__Group_2__2__Impl11297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OverloadableOperator__Group_2__0__Impl_in_rule__OverloadableOperator__Group_2__011334 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_rule__OverloadableOperator__Group_2__1_in_rule__OverloadableOperator__Group_2__011337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_rule__OverloadableOperator__Group_2__0__Impl11365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OverloadableOperator__Group_2__1__Impl_in_rule__OverloadableOperator__Group_2__111396 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_rule__OverloadableOperator__Group_2__2_in_rule__OverloadableOperator__Group_2__111399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_103_in_rule__OverloadableOperator__Group_2__1__Impl11427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OverloadableOperator__Group_2__2__Impl_in_rule__OverloadableOperator__Group_2__211458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_104_in_rule__OverloadableOperator__Group_2__2__Impl11486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OverloadableOperator__Group_3__0__Impl_in_rule__OverloadableOperator__Group_3__011523 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_rule__OverloadableOperator__Group_3__1_in_rule__OverloadableOperator__Group_3__011526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_rule__OverloadableOperator__Group_3__0__Impl11554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OverloadableOperator__Group_3__1__Impl_in_rule__OverloadableOperator__Group_3__111585 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_rule__OverloadableOperator__Group_3__2_in_rule__OverloadableOperator__Group_3__111588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_103_in_rule__OverloadableOperator__Group_3__1__Impl11616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OverloadableOperator__Group_3__2__Impl_in_rule__OverloadableOperator__Group_3__211647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_104_in_rule__OverloadableOperator__Group_3__2__Impl11675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LiteralOperatorId__Group__0__Impl_in_rule__LiteralOperatorId__Group__011712 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_rule__LiteralOperatorId__Group__1_in_rule__LiteralOperatorId__Group__011715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_108_in_rule__LiteralOperatorId__Group__0__Impl11743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LiteralOperatorId__Group__1__Impl_in_rule__LiteralOperatorId__Group__111774 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_rule__LiteralOperatorId__Group__2_in_rule__LiteralOperatorId__Group__111777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_109_in_rule__LiteralOperatorId__Group__1__Impl11805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LiteralOperatorId__Group__2__Impl_in_rule__LiteralOperatorId__Group__211836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_109_in_rule__LiteralOperatorId__Group__2__Impl11864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemplateParameterList__Group__0__Impl_in_rule__TemplateParameterList__Group__011902 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_rule__TemplateParameterList__Group__1_in_rule__TemplateParameterList__Group__011905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplateParameter_in_rule__TemplateParameterList__Group__0__Impl11932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemplateParameterList__Group__1__Impl_in_rule__TemplateParameterList__Group__111961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemplateParameterList__Group_1__0_in_rule__TemplateParameterList__Group__1__Impl11988 = new BitSet(new long[]{0x0000000000000002L,0x0000000080000000L});
    public static final BitSet FOLLOW_rule__TemplateParameterList__Group_1__0__Impl_in_rule__TemplateParameterList__Group_1__012023 = new BitSet(new long[]{0x0000020000000000L,0x0001C00000000000L});
    public static final BitSet FOLLOW_rule__TemplateParameterList__Group_1__1_in_rule__TemplateParameterList__Group_1__012026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_rule__TemplateParameterList__Group_1__0__Impl12054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemplateParameterList__Group_1__1__Impl_in_rule__TemplateParameterList__Group_1__112085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplateParameter_in_rule__TemplateParameterList__Group_1__1__Impl12112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_0__0__Impl_in_rule__TypeParameter__Group_0__012145 = new BitSet(new long[]{0x0000000000000400L,0x0000001000000200L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_0__1_in_rule__TypeParameter__Group_0__012148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_110_in_rule__TypeParameter__Group_0__0__Impl12176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_0__1__Impl_in_rule__TypeParameter__Group_0__112207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeParameter__Alternatives_0_1_in_rule__TypeParameter__Group_0__1__Impl12234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_0_1_0__0__Impl_in_rule__TypeParameter__Group_0_1_0__012268 = new BitSet(new long[]{0x0000000000000400L,0x0000001000000000L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_0_1_0__1_in_rule__TypeParameter__Group_0_1_0__012271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_100_in_rule__TypeParameter__Group_0_1_0__0__Impl12300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_0_1_0__1__Impl_in_rule__TypeParameter__Group_0_1_0__112333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TypeParameter__Group_0_1_0__1__Impl12361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_0_1_1__0__Impl_in_rule__TypeParameter__Group_0_1_1__012396 = new BitSet(new long[]{0x0000000000000400L,0x0000001000000200L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_0_1_1__1_in_rule__TypeParameter__Group_0_1_1__012399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TypeParameter__Group_0_1_1__0__Impl12427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_0_1_1__1__Impl_in_rule__TypeParameter__Group_0_1_1__112458 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_0_1_1__2_in_rule__TypeParameter__Group_0_1_1__112461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_rule__TypeParameter__Group_0_1_1__1__Impl12489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_0_1_1__2__Impl_in_rule__TypeParameter__Group_0_1_1__212520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeId_in_rule__TypeParameter__Group_0_1_1__2__Impl12547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_1__0__Impl_in_rule__TypeParameter__Group_1__012582 = new BitSet(new long[]{0x0000000000000400L,0x0000001000000200L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_1__1_in_rule__TypeParameter__Group_1__012585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_111_in_rule__TypeParameter__Group_1__0__Impl12613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_1__1__Impl_in_rule__TypeParameter__Group_1__112644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeParameter__Alternatives_1_1_in_rule__TypeParameter__Group_1__1__Impl12671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_1_1_0__0__Impl_in_rule__TypeParameter__Group_1_1_0__012705 = new BitSet(new long[]{0x0000000000000400L,0x0000001000000000L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_1_1_0__1_in_rule__TypeParameter__Group_1_1_0__012708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_100_in_rule__TypeParameter__Group_1_1_0__0__Impl12737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_1_1_0__1__Impl_in_rule__TypeParameter__Group_1_1_0__112770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TypeParameter__Group_1_1_0__1__Impl12798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_1_1_1__0__Impl_in_rule__TypeParameter__Group_1_1_1__012833 = new BitSet(new long[]{0x0000000000000400L,0x0000001000000200L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_1_1_1__1_in_rule__TypeParameter__Group_1_1_1__012836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TypeParameter__Group_1_1_1__0__Impl12864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_1_1_1__1__Impl_in_rule__TypeParameter__Group_1_1_1__112895 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_1_1_1__2_in_rule__TypeParameter__Group_1_1_1__112898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_rule__TypeParameter__Group_1_1_1__1__Impl12926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_1_1_1__2__Impl_in_rule__TypeParameter__Group_1_1_1__212957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeId_in_rule__TypeParameter__Group_1_1_1__2__Impl12984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_2__0__Impl_in_rule__TypeParameter__Group_2__013019 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_2__1_in_rule__TypeParameter__Group_2__013022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_112_in_rule__TypeParameter__Group_2__0__Impl13050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_2__1__Impl_in_rule__TypeParameter__Group_2__113081 = new BitSet(new long[]{0x0000020000000000L,0x0001C00000000000L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_2__2_in_rule__TypeParameter__Group_2__113084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_rule__TypeParameter__Group_2__1__Impl13112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_2__2__Impl_in_rule__TypeParameter__Group_2__213143 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_2__3_in_rule__TypeParameter__Group_2__213146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplateParameterList_in_rule__TypeParameter__Group_2__2__Impl13173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_2__3__Impl_in_rule__TypeParameter__Group_2__313202 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_2__4_in_rule__TypeParameter__Group_2__313205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_rule__TypeParameter__Group_2__3__Impl13233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_2__4__Impl_in_rule__TypeParameter__Group_2__413264 = new BitSet(new long[]{0x0000000000000400L,0x0000001000000200L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_2__5_in_rule__TypeParameter__Group_2__413267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_110_in_rule__TypeParameter__Group_2__4__Impl13295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_2__5__Impl_in_rule__TypeParameter__Group_2__513326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeParameter__Alternatives_2_5_in_rule__TypeParameter__Group_2__5__Impl13353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_2_5_0__0__Impl_in_rule__TypeParameter__Group_2_5_0__013395 = new BitSet(new long[]{0x0000000000000400L,0x0000001000000000L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_2_5_0__1_in_rule__TypeParameter__Group_2_5_0__013398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_100_in_rule__TypeParameter__Group_2_5_0__0__Impl13427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_2_5_0__1__Impl_in_rule__TypeParameter__Group_2_5_0__113460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TypeParameter__Group_2_5_0__1__Impl13488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_2_5_1__0__Impl_in_rule__TypeParameter__Group_2_5_1__013523 = new BitSet(new long[]{0x0000000000000400L,0x0000001000000200L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_2_5_1__1_in_rule__TypeParameter__Group_2_5_1__013526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TypeParameter__Group_2_5_1__0__Impl13554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_2_5_1__1__Impl_in_rule__TypeParameter__Group_2_5_1__113585 = new BitSet(new long[]{0x0000010000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_2_5_1__2_in_rule__TypeParameter__Group_2_5_1__113588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_rule__TypeParameter__Group_2_5_1__1__Impl13616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypeParameter__Group_2_5_1__2__Impl_in_rule__TypeParameter__Group_2_5_1__213647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdExpression_in_rule__TypeParameter__Group_2_5_1__2__Impl13674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleTemplateId__Group__0__Impl_in_rule__SimpleTemplateId__Group__013709 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_rule__SimpleTemplateId__Group__1_in_rule__SimpleTemplateId__Group__013712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SimpleTemplateId__Group__0__Impl13739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleTemplateId__Group__1__Impl_in_rule__SimpleTemplateId__Group__113768 = new BitSet(new long[]{0x000001C000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_rule__SimpleTemplateId__Group__2_in_rule__SimpleTemplateId__Group__113771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_rule__SimpleTemplateId__Group__1__Impl13799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleTemplateId__Group__2__Impl_in_rule__SimpleTemplateId__Group__213830 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_rule__SimpleTemplateId__Group__3_in_rule__SimpleTemplateId__Group__213833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplateArgumentList_in_rule__SimpleTemplateId__Group__2__Impl13860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleTemplateId__Group__3__Impl_in_rule__SimpleTemplateId__Group__313889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_rule__SimpleTemplateId__Group__3__Impl13917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemplateArgumentList__Group__0__Impl_in_rule__TemplateArgumentList__Group__013958 = new BitSet(new long[]{0x0000000000000000L,0x0000001080000000L});
    public static final BitSet FOLLOW_rule__TemplateArgumentList__Group__1_in_rule__TemplateArgumentList__Group__013961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplateArgument_in_rule__TemplateArgumentList__Group__0__Impl13988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemplateArgumentList__Group__1__Impl_in_rule__TemplateArgumentList__Group__114017 = new BitSet(new long[]{0x0000000000000000L,0x0000001080000000L});
    public static final BitSet FOLLOW_rule__TemplateArgumentList__Group__2_in_rule__TemplateArgumentList__Group__114020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_100_in_rule__TemplateArgumentList__Group__1__Impl14049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemplateArgumentList__Group__2__Impl_in_rule__TemplateArgumentList__Group__214082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemplateArgumentList__Group_2__0_in_rule__TemplateArgumentList__Group__2__Impl14109 = new BitSet(new long[]{0x0000000000000002L,0x0000000080000000L});
    public static final BitSet FOLLOW_rule__TemplateArgumentList__Group_2__0__Impl_in_rule__TemplateArgumentList__Group_2__014146 = new BitSet(new long[]{0x000001C000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_rule__TemplateArgumentList__Group_2__1_in_rule__TemplateArgumentList__Group_2__014149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_rule__TemplateArgumentList__Group_2__0__Impl14177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemplateArgumentList__Group_2__1__Impl_in_rule__TemplateArgumentList__Group_2__114208 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_rule__TemplateArgumentList__Group_2__2_in_rule__TemplateArgumentList__Group_2__114211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplateArgument_in_rule__TemplateArgumentList__Group_2__1__Impl14238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemplateArgumentList__Group_2__2__Impl_in_rule__TemplateArgumentList__Group_2__214267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_100_in_rule__TemplateArgumentList__Group_2__2__Impl14296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Handler__Group__0__Impl_in_rule__Handler__Group__014341 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_rule__Handler__Group__1_in_rule__Handler__Group__014344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_113_in_rule__Handler__Group__0__Impl14372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Handler__Group__1__Impl_in_rule__Handler__Group__114403 = new BitSet(new long[]{0x0000400000000000L,0x0000029000000000L});
    public static final BitSet FOLLOW_rule__Handler__Group__2_in_rule__Handler__Group__114406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_106_in_rule__Handler__Group__1__Impl14434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Handler__Group__2__Impl_in_rule__Handler__Group__214465 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_rule__Handler__Group__3_in_rule__Handler__Group__214468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExceptionDeclaration_in_rule__Handler__Group__2__Impl14495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Handler__Group__3__Impl_in_rule__Handler__Group__314524 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_rule__Handler__Group__4_in_rule__Handler__Group__314527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_107_in_rule__Handler__Group__3__Impl14555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Handler__Group__4__Impl_in_rule__Handler__Group__414586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompoundStatement_in_rule__Handler__Group__4__Impl14613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExceptionDeclaration__Group_0__0__Impl_in_rule__ExceptionDeclaration__Group_0__014652 = new BitSet(new long[]{0x0000400000000000L,0x0000028000000000L});
    public static final BitSet FOLLOW_rule__ExceptionDeclaration__Group_0__1_in_rule__ExceptionDeclaration__Group_0__014655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeSpecifier_in_rule__ExceptionDeclaration__Group_0__0__Impl14683 = new BitSet(new long[]{0x0000000000000002L,0x0000028000000000L});
    public static final BitSet FOLLOW_rule__ExceptionDeclaration__Group_0__1__Impl_in_rule__ExceptionDeclaration__Group_0__114714 = new BitSet(new long[]{0x3040890000000000L,0x0000045000000004L});
    public static final BitSet FOLLOW_rule__ExceptionDeclaration__Group_0__2_in_rule__ExceptionDeclaration__Group_0__114717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeSpecifier_in_rule__ExceptionDeclaration__Group_0__1__Impl14747 = new BitSet(new long[]{0x0000400000000002L,0x0000028000000000L});
    public static final BitSet FOLLOW_ruleTypeSpecifier_in_rule__ExceptionDeclaration__Group_0__1__Impl14760 = new BitSet(new long[]{0x0000400000000002L,0x0000028000000000L});
    public static final BitSet FOLLOW_rule__ExceptionDeclaration__Group_0__2__Impl_in_rule__ExceptionDeclaration__Group_0__214793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExceptionDeclaration__Alternatives_0_2_in_rule__ExceptionDeclaration__Group_0__2__Impl14820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DynamicExceptionSpecification__Group__0__Impl_in_rule__DynamicExceptionSpecification__Group__014857 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_rule__DynamicExceptionSpecification__Group__1_in_rule__DynamicExceptionSpecification__Group__014860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_114_in_rule__DynamicExceptionSpecification__Group__0__Impl14888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DynamicExceptionSpecification__Group__1__Impl_in_rule__DynamicExceptionSpecification__Group__114919 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_rule__DynamicExceptionSpecification__Group__2_in_rule__DynamicExceptionSpecification__Group__114922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_106_in_rule__DynamicExceptionSpecification__Group__1__Impl14950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DynamicExceptionSpecification__Group__2__Impl_in_rule__DynamicExceptionSpecification__Group__214981 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_rule__DynamicExceptionSpecification__Group__3_in_rule__DynamicExceptionSpecification__Group__214984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeIdList_in_rule__DynamicExceptionSpecification__Group__2__Impl15011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DynamicExceptionSpecification__Group__3__Impl_in_rule__DynamicExceptionSpecification__Group__315040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_107_in_rule__DynamicExceptionSpecification__Group__3__Impl15068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NoexceptSpecification__Group__0__Impl_in_rule__NoexceptSpecification__Group__015107 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_rule__NoexceptSpecification__Group__1_in_rule__NoexceptSpecification__Group__015110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_115_in_rule__NoexceptSpecification__Group__0__Impl15138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NoexceptSpecification__Group__1__Impl_in_rule__NoexceptSpecification__Group__115169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NoexceptSpecification__Group_1__0_in_rule__NoexceptSpecification__Group__1__Impl15196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NoexceptSpecification__Group_1__0__Impl_in_rule__NoexceptSpecification__Group_1__015231 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__NoexceptSpecification__Group_1__1_in_rule__NoexceptSpecification__Group_1__015234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_106_in_rule__NoexceptSpecification__Group_1__0__Impl15262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NoexceptSpecification__Group_1__1__Impl_in_rule__NoexceptSpecification__Group_1__115293 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_rule__NoexceptSpecification__Group_1__2_in_rule__NoexceptSpecification__Group_1__115296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantExpression_in_rule__NoexceptSpecification__Group_1__1__Impl15323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NoexceptSpecification__Group_1__2__Impl_in_rule__NoexceptSpecification__Group_1__215352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_107_in_rule__NoexceptSpecification__Group_1__2__Impl15380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleToken_in_rule__Test__ElementsAssignment15422 = new BitSet(new long[]{0x0000000000000002L});

}